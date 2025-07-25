/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Captures constraints on each element within the resource, profile, or extension.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPath <em>Path</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getSliceName <em>Slice Name</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getSliceIsConstraining <em>Slice Is Constraining</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getLabel <em>Label</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getSlicing <em>Slicing</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getShort <em>Short</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getComment <em>Comment</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMin <em>Min</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMax <em>Max</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getBase <em>Base</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getContentReference <em>Content Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueBase64Binary <em>Default Value Base64 Binary</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueBoolean <em>Default Value Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueCanonical <em>Default Value Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueCode <em>Default Value Code</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueDate <em>Default Value Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueDateTime <em>Default Value Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueDecimal <em>Default Value Decimal</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueId <em>Default Value Id</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueInstant <em>Default Value Instant</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueInteger <em>Default Value Integer</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueMarkdown <em>Default Value Markdown</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueOid <em>Default Value Oid</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValuePositiveInt <em>Default Value Positive Int</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueString <em>Default Value String</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueTime <em>Default Value Time</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueUnsignedInt <em>Default Value Unsigned Int</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueUri <em>Default Value Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueUrl <em>Default Value Url</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueUuid <em>Default Value Uuid</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueAddress <em>Default Value Address</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueAge <em>Default Value Age</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueAnnotation <em>Default Value Annotation</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueAttachment <em>Default Value Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueCodeableConcept <em>Default Value Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueCoding <em>Default Value Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueContactPoint <em>Default Value Contact Point</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueCount <em>Default Value Count</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueDistance <em>Default Value Distance</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueDuration <em>Default Value Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueHumanName <em>Default Value Human Name</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueIdentifier <em>Default Value Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueMoney <em>Default Value Money</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValuePeriod <em>Default Value Period</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueQuantity <em>Default Value Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueRange <em>Default Value Range</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueRatio <em>Default Value Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueReference <em>Default Value Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueSampledData <em>Default Value Sampled Data</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueSignature <em>Default Value Signature</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueTiming <em>Default Value Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueContactDetail <em>Default Value Contact Detail</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueContributor <em>Default Value Contributor</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueDataRequirement <em>Default Value Data Requirement</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueExpression <em>Default Value Expression</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueParameterDefinition <em>Default Value Parameter Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueRelatedArtifact <em>Default Value Related Artifact</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueTriggerDefinition <em>Default Value Trigger Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueUsageContext <em>Default Value Usage Context</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueDosage <em>Default Value Dosage</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueMeta <em>Default Value Meta</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMeaningWhenMissing <em>Meaning When Missing</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getOrderMeaning <em>Order Meaning</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedBase64Binary <em>Fixed Base64 Binary</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedBoolean <em>Fixed Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedCanonical <em>Fixed Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedCode <em>Fixed Code</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedDate <em>Fixed Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedDateTime <em>Fixed Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedDecimal <em>Fixed Decimal</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedId <em>Fixed Id</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedInstant <em>Fixed Instant</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedInteger <em>Fixed Integer</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedMarkdown <em>Fixed Markdown</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedOid <em>Fixed Oid</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedPositiveInt <em>Fixed Positive Int</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedString <em>Fixed String</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedTime <em>Fixed Time</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedUnsignedInt <em>Fixed Unsigned Int</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedUri <em>Fixed Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedUrl <em>Fixed Url</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedUuid <em>Fixed Uuid</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedAddress <em>Fixed Address</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedAge <em>Fixed Age</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedAnnotation <em>Fixed Annotation</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedAttachment <em>Fixed Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedCodeableConcept <em>Fixed Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedCoding <em>Fixed Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedContactPoint <em>Fixed Contact Point</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedCount <em>Fixed Count</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedDistance <em>Fixed Distance</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedDuration <em>Fixed Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedHumanName <em>Fixed Human Name</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedIdentifier <em>Fixed Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedMoney <em>Fixed Money</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedPeriod <em>Fixed Period</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedQuantity <em>Fixed Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedRange <em>Fixed Range</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedRatio <em>Fixed Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedReference <em>Fixed Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedSampledData <em>Fixed Sampled Data</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedSignature <em>Fixed Signature</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedTiming <em>Fixed Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedContactDetail <em>Fixed Contact Detail</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedContributor <em>Fixed Contributor</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedDataRequirement <em>Fixed Data Requirement</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedExpression <em>Fixed Expression</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedParameterDefinition <em>Fixed Parameter Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedRelatedArtifact <em>Fixed Related Artifact</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedTriggerDefinition <em>Fixed Trigger Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedUsageContext <em>Fixed Usage Context</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedDosage <em>Fixed Dosage</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedMeta <em>Fixed Meta</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternBase64Binary <em>Pattern Base64 Binary</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternBoolean <em>Pattern Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternCanonical <em>Pattern Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternCode <em>Pattern Code</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternDate <em>Pattern Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternDateTime <em>Pattern Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternDecimal <em>Pattern Decimal</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternId <em>Pattern Id</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternInstant <em>Pattern Instant</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternInteger <em>Pattern Integer</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternMarkdown <em>Pattern Markdown</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternOid <em>Pattern Oid</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternPositiveInt <em>Pattern Positive Int</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternString <em>Pattern String</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternTime <em>Pattern Time</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternUnsignedInt <em>Pattern Unsigned Int</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternUri <em>Pattern Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternUrl <em>Pattern Url</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternUuid <em>Pattern Uuid</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternAddress <em>Pattern Address</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternAge <em>Pattern Age</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternAnnotation <em>Pattern Annotation</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternAttachment <em>Pattern Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternCodeableConcept <em>Pattern Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternCoding <em>Pattern Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternContactPoint <em>Pattern Contact Point</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternCount <em>Pattern Count</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternDistance <em>Pattern Distance</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternDuration <em>Pattern Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternHumanName <em>Pattern Human Name</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternIdentifier <em>Pattern Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternMoney <em>Pattern Money</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternPeriod <em>Pattern Period</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternQuantity <em>Pattern Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternRange <em>Pattern Range</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternRatio <em>Pattern Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternReference <em>Pattern Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternSampledData <em>Pattern Sampled Data</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternSignature <em>Pattern Signature</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternTiming <em>Pattern Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternContactDetail <em>Pattern Contact Detail</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternContributor <em>Pattern Contributor</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternDataRequirement <em>Pattern Data Requirement</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternExpression <em>Pattern Expression</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternParameterDefinition <em>Pattern Parameter Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternRelatedArtifact <em>Pattern Related Artifact</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternTriggerDefinition <em>Pattern Trigger Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternUsageContext <em>Pattern Usage Context</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternDosage <em>Pattern Dosage</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternMeta <em>Pattern Meta</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getExample <em>Example</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMinValueDate <em>Min Value Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMinValueDateTime <em>Min Value Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMinValueInstant <em>Min Value Instant</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMinValueTime <em>Min Value Time</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMinValueDecimal <em>Min Value Decimal</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMinValueInteger <em>Min Value Integer</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMinValuePositiveInt <em>Min Value Positive Int</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMinValueUnsignedInt <em>Min Value Unsigned Int</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMinValueQuantity <em>Min Value Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMaxValueDate <em>Max Value Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMaxValueDateTime <em>Max Value Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMaxValueInstant <em>Max Value Instant</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMaxValueTime <em>Max Value Time</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMaxValueDecimal <em>Max Value Decimal</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMaxValueInteger <em>Max Value Integer</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMaxValuePositiveInt <em>Max Value Positive Int</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMaxValueUnsignedInt <em>Max Value Unsigned Int</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMaxValueQuantity <em>Max Value Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMustSupport <em>Must Support</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getIsModifier <em>Is Modifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getIsModifierReason <em>Is Modifier Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getIsSummary <em>Is Summary</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getBinding <em>Binding</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMapping <em>Mapping</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getElementDefinition()
 * @model extendedMetaData="name='ElementDefinition' kind='elementOnly'"
 * @generated
 */
public interface ElementDefinition extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The path identifies the element and is expressed as a "."-separated list of ancestor elements, beginning with the name of the resource or extension.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path</em>' containment reference.
	 * @see #setPath(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_Path()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='path' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPath();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Representation</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PropertyRepresentation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Codes that define how this element is represented in instances, when the deviation varies from the normal case.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Representation</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_Representation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='representation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PropertyRepresentation> getRepresentation();

	/**
	 * Returns the value of the '<em><b>Slice Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of this element definition slice, when slicing is working. The name must be a token with no dots or spaces. This is a unique name referring to a specific set of constraints applied to this element, used to provide a name to different slices of the same element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Slice Name</em>' containment reference.
	 * @see #setSliceName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_SliceName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sliceName' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getSliceName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getSliceName <em>Slice Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slice Name</em>' containment reference.
	 * @see #getSliceName()
	 * @generated
	 */
	void setSliceName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Slice Is Constraining</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, indicates that this slice definition is constraining a slice definition with the same name in an inherited profile. If false, the slice is not overriding any slice in an inherited profile. If missing, the slice might or might not be overriding a slice in an inherited profile, depending on the sliceName.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Slice Is Constraining</em>' containment reference.
	 * @see #setSliceIsConstraining(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_SliceIsConstraining()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sliceIsConstraining' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getSliceIsConstraining();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getSliceIsConstraining <em>Slice Is Constraining</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slice Is Constraining</em>' containment reference.
	 * @see #getSliceIsConstraining()
	 * @generated
	 */
	void setSliceIsConstraining(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A single preferred label which is the text to display beside the element indicating its meaning or to use to prompt for the element in a user display or form.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_Label()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='label' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getLabel();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code that has the same meaning as the element in a particular terminology.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getCode();

	/**
	 * Returns the value of the '<em><b>Slicing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the element is sliced into a set of alternative definitions (i.e. in a structure definition, there are multiple different constraints on a single element in the base resource). Slicing can be used in any resource that has cardinality ..* on the base resource, or any resource with a choice of types. The set of slices is any elements that come after this in the element sequence that have the same path, until a shorter path occurs (the shorter path terminates the set).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Slicing</em>' containment reference.
	 * @see #setSlicing(ElementDefinitionSlicing)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_Slicing()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='slicing' namespace='##targetNamespace'"
	 * @generated
	 */
	ElementDefinitionSlicing getSlicing();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getSlicing <em>Slicing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slicing</em>' containment reference.
	 * @see #getSlicing()
	 * @generated
	 */
	void setSlicing(ElementDefinitionSlicing value);

	/**
	 * Returns the value of the '<em><b>Short</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A concise description of what this element means (e.g. for use in autogenerated summaries).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Short</em>' containment reference.
	 * @see #setShort(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_Short()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='short' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getShort();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getShort <em>Short</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short</em>' containment reference.
	 * @see #getShort()
	 * @generated
	 */
	void setShort(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides a complete explanation of the meaning of the data element for human readability.  For the case of elements derived from existing elements (e.g. constraints), the definition SHALL be consistent with the base definition, but convey the meaning of the element in the particular context of use of the resource. (Note: The text you are reading is specified in ElementDefinition.definition).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference.
	 * @see #setDefinition(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_Definition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definition' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(Markdown value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Explanatory notes and implementation guidance about the data element, including notes about how to use the data properly, exceptions to proper use, etc. (Note: The text you are reading is specified in ElementDefinition.comment).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference.
	 * @see #setComment(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_Comment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='comment' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getComment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getComment <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' containment reference.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(Markdown value);

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element is for traceability of why the element was created and why the constraints exist as they do. This may be used to point to source materials or specifications that drove the structure of this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference.
	 * @see #setRequirements(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_Requirements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requirements' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getRequirements();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getRequirements <em>Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirements</em>' containment reference.
	 * @see #getRequirements()
	 * @generated
	 */
	void setRequirements(Markdown value);

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies additional names by which this element might also be known.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alias</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_Alias()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='alias' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getAlias();

	/**
	 * Returns the value of the '<em><b>Min</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum number of times this element SHALL appear in the instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min</em>' containment reference.
	 * @see #setMin(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_Min()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='min' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getMin();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMin <em>Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' containment reference.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum number of times this element is permitted to appear in the instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max</em>' containment reference.
	 * @see #setMax(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_Max()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='max' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getMax();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMax <em>Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' containment reference.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about the base definition of the element, provided to make it unnecessary for tools to trace the deviation of the element through the derived and related profiles. When the element definition is not the original definition of an element - i.g. either in a constraint on another type, or for elements from a super type in a snap shot - then the information in provided in the element definition may be different to the base definition. On the original definition of the element, it will be same.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base</em>' containment reference.
	 * @see #setBase(ElementDefinitionBase)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_Base()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='base' namespace='##targetNamespace'"
	 * @generated
	 */
	ElementDefinitionBase getBase();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getBase <em>Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' containment reference.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(ElementDefinitionBase value);

	/**
	 * Returns the value of the '<em><b>Content Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies an element defined elsewhere in the definition whose content rules should be applied to the current element. ContentReferences bring across all the rules that are in the ElementDefinition for the element, including definitions, cardinality constraints, bindings, invariants etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content Reference</em>' containment reference.
	 * @see #setContentReference(Uri)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_ContentReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contentReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getContentReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getContentReference <em>Content Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Reference</em>' containment reference.
	 * @see #getContentReference()
	 * @generated
	 */
	void setContentReference(Uri value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ElementDefinitionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The data type or resource that the value of this element is permitted to be.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ElementDefinitionType> getType();

	/**
	 * Returns the value of the '<em><b>Default Value Base64 Binary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Base64 Binary</em>' containment reference.
	 * @see #setDefaultValueBase64Binary(Base64Binary)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueBase64Binary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueBase64Binary' namespace='##targetNamespace'"
	 * @generated
	 */
	Base64Binary getDefaultValueBase64Binary();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueBase64Binary <em>Default Value Base64 Binary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Base64 Binary</em>' containment reference.
	 * @see #getDefaultValueBase64Binary()
	 * @generated
	 */
	void setDefaultValueBase64Binary(Base64Binary value);

	/**
	 * Returns the value of the '<em><b>Default Value Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Boolean</em>' containment reference.
	 * @see #setDefaultValueBoolean(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueBoolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueBoolean' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getDefaultValueBoolean();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueBoolean <em>Default Value Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Boolean</em>' containment reference.
	 * @see #getDefaultValueBoolean()
	 * @generated
	 */
	void setDefaultValueBoolean(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Default Value Canonical</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Canonical</em>' containment reference.
	 * @see #setDefaultValueCanonical(Canonical)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueCanonical()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueCanonical' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getDefaultValueCanonical();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueCanonical <em>Default Value Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Canonical</em>' containment reference.
	 * @see #getDefaultValueCanonical()
	 * @generated
	 */
	void setDefaultValueCanonical(Canonical value);

	/**
	 * Returns the value of the '<em><b>Default Value Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Code</em>' containment reference.
	 * @see #setDefaultValueCode(Code)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueCode' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getDefaultValueCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueCode <em>Default Value Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Code</em>' containment reference.
	 * @see #getDefaultValueCode()
	 * @generated
	 */
	void setDefaultValueCode(Code value);

	/**
	 * Returns the value of the '<em><b>Default Value Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Date</em>' containment reference.
	 * @see #setDefaultValueDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getDefaultValueDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueDate <em>Default Value Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Date</em>' containment reference.
	 * @see #getDefaultValueDate()
	 * @generated
	 */
	void setDefaultValueDate(Date value);

	/**
	 * Returns the value of the '<em><b>Default Value Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Date Time</em>' containment reference.
	 * @see #setDefaultValueDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDefaultValueDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueDateTime <em>Default Value Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Date Time</em>' containment reference.
	 * @see #getDefaultValueDateTime()
	 * @generated
	 */
	void setDefaultValueDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Default Value Decimal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Decimal</em>' containment reference.
	 * @see #setDefaultValueDecimal(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueDecimal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueDecimal' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getDefaultValueDecimal();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueDecimal <em>Default Value Decimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Decimal</em>' containment reference.
	 * @see #getDefaultValueDecimal()
	 * @generated
	 */
	void setDefaultValueDecimal(Decimal value);

	/**
	 * Returns the value of the '<em><b>Default Value Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Id</em>' containment reference.
	 * @see #setDefaultValueId(Id)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueId' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getDefaultValueId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueId <em>Default Value Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Id</em>' containment reference.
	 * @see #getDefaultValueId()
	 * @generated
	 */
	void setDefaultValueId(Id value);

	/**
	 * Returns the value of the '<em><b>Default Value Instant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Instant</em>' containment reference.
	 * @see #setDefaultValueInstant(Instant)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueInstant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueInstant' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getDefaultValueInstant();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueInstant <em>Default Value Instant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Instant</em>' containment reference.
	 * @see #getDefaultValueInstant()
	 * @generated
	 */
	void setDefaultValueInstant(Instant value);

	/**
	 * Returns the value of the '<em><b>Default Value Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Integer</em>' containment reference.
	 * @see #setDefaultValueInteger(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueInteger()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueInteger' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getDefaultValueInteger();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueInteger <em>Default Value Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Integer</em>' containment reference.
	 * @see #getDefaultValueInteger()
	 * @generated
	 */
	void setDefaultValueInteger(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Default Value Markdown</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Markdown</em>' containment reference.
	 * @see #setDefaultValueMarkdown(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueMarkdown()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueMarkdown' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDefaultValueMarkdown();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueMarkdown <em>Default Value Markdown</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Markdown</em>' containment reference.
	 * @see #getDefaultValueMarkdown()
	 * @generated
	 */
	void setDefaultValueMarkdown(Markdown value);

	/**
	 * Returns the value of the '<em><b>Default Value Oid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Oid</em>' containment reference.
	 * @see #setDefaultValueOid(Oid)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueOid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueOid' namespace='##targetNamespace'"
	 * @generated
	 */
	Oid getDefaultValueOid();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueOid <em>Default Value Oid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Oid</em>' containment reference.
	 * @see #getDefaultValueOid()
	 * @generated
	 */
	void setDefaultValueOid(Oid value);

	/**
	 * Returns the value of the '<em><b>Default Value Positive Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Positive Int</em>' containment reference.
	 * @see #setDefaultValuePositiveInt(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValuePositiveInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValuePositiveInt' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getDefaultValuePositiveInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValuePositiveInt <em>Default Value Positive Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Positive Int</em>' containment reference.
	 * @see #getDefaultValuePositiveInt()
	 * @generated
	 */
	void setDefaultValuePositiveInt(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Default Value String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value String</em>' containment reference.
	 * @see #setDefaultValueString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDefaultValueString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueString <em>Default Value String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value String</em>' containment reference.
	 * @see #getDefaultValueString()
	 * @generated
	 */
	void setDefaultValueString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Default Value Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Time</em>' containment reference.
	 * @see #setDefaultValueTime(Time)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueTime' namespace='##targetNamespace'"
	 * @generated
	 */
	Time getDefaultValueTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueTime <em>Default Value Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Time</em>' containment reference.
	 * @see #getDefaultValueTime()
	 * @generated
	 */
	void setDefaultValueTime(Time value);

	/**
	 * Returns the value of the '<em><b>Default Value Unsigned Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Unsigned Int</em>' containment reference.
	 * @see #setDefaultValueUnsignedInt(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueUnsignedInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueUnsignedInt' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getDefaultValueUnsignedInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueUnsignedInt <em>Default Value Unsigned Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Unsigned Int</em>' containment reference.
	 * @see #getDefaultValueUnsignedInt()
	 * @generated
	 */
	void setDefaultValueUnsignedInt(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Default Value Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Uri</em>' containment reference.
	 * @see #setDefaultValueUri(Uri)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueUri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getDefaultValueUri();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueUri <em>Default Value Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Uri</em>' containment reference.
	 * @see #getDefaultValueUri()
	 * @generated
	 */
	void setDefaultValueUri(Uri value);

	/**
	 * Returns the value of the '<em><b>Default Value Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Url</em>' containment reference.
	 * @see #setDefaultValueUrl(Url)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueUrl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueUrl' namespace='##targetNamespace'"
	 * @generated
	 */
	Url getDefaultValueUrl();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueUrl <em>Default Value Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Url</em>' containment reference.
	 * @see #getDefaultValueUrl()
	 * @generated
	 */
	void setDefaultValueUrl(Url value);

	/**
	 * Returns the value of the '<em><b>Default Value Uuid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Uuid</em>' containment reference.
	 * @see #setDefaultValueUuid(Uuid)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueUuid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueUuid' namespace='##targetNamespace'"
	 * @generated
	 */
	Uuid getDefaultValueUuid();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueUuid <em>Default Value Uuid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Uuid</em>' containment reference.
	 * @see #getDefaultValueUuid()
	 * @generated
	 */
	void setDefaultValueUuid(Uuid value);

	/**
	 * Returns the value of the '<em><b>Default Value Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Address</em>' containment reference.
	 * @see #setDefaultValueAddress(Address)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueAddress()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	Address getDefaultValueAddress();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueAddress <em>Default Value Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Address</em>' containment reference.
	 * @see #getDefaultValueAddress()
	 * @generated
	 */
	void setDefaultValueAddress(Address value);

	/**
	 * Returns the value of the '<em><b>Default Value Age</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Age</em>' containment reference.
	 * @see #setDefaultValueAge(Age)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueAge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueAge' namespace='##targetNamespace'"
	 * @generated
	 */
	Age getDefaultValueAge();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueAge <em>Default Value Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Age</em>' containment reference.
	 * @see #getDefaultValueAge()
	 * @generated
	 */
	void setDefaultValueAge(Age value);

	/**
	 * Returns the value of the '<em><b>Default Value Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Annotation</em>' containment reference.
	 * @see #setDefaultValueAnnotation(Annotation)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueAnnotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueAnnotation' namespace='##targetNamespace'"
	 * @generated
	 */
	Annotation getDefaultValueAnnotation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueAnnotation <em>Default Value Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Annotation</em>' containment reference.
	 * @see #getDefaultValueAnnotation()
	 * @generated
	 */
	void setDefaultValueAnnotation(Annotation value);

	/**
	 * Returns the value of the '<em><b>Default Value Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Attachment</em>' containment reference.
	 * @see #setDefaultValueAttachment(Attachment)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueAttachment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	Attachment getDefaultValueAttachment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueAttachment <em>Default Value Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Attachment</em>' containment reference.
	 * @see #getDefaultValueAttachment()
	 * @generated
	 */
	void setDefaultValueAttachment(Attachment value);

	/**
	 * Returns the value of the '<em><b>Default Value Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Codeable Concept</em>' containment reference.
	 * @see #setDefaultValueCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDefaultValueCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueCodeableConcept <em>Default Value Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Codeable Concept</em>' containment reference.
	 * @see #getDefaultValueCodeableConcept()
	 * @generated
	 */
	void setDefaultValueCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Default Value Coding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Coding</em>' containment reference.
	 * @see #setDefaultValueCoding(Coding)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueCoding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueCoding' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getDefaultValueCoding();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueCoding <em>Default Value Coding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Coding</em>' containment reference.
	 * @see #getDefaultValueCoding()
	 * @generated
	 */
	void setDefaultValueCoding(Coding value);

	/**
	 * Returns the value of the '<em><b>Default Value Contact Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Contact Point</em>' containment reference.
	 * @see #setDefaultValueContactPoint(ContactPoint)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueContactPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueContactPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	ContactPoint getDefaultValueContactPoint();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueContactPoint <em>Default Value Contact Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Contact Point</em>' containment reference.
	 * @see #getDefaultValueContactPoint()
	 * @generated
	 */
	void setDefaultValueContactPoint(ContactPoint value);

	/**
	 * Returns the value of the '<em><b>Default Value Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Count</em>' containment reference.
	 * @see #setDefaultValueCount(Count)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueCount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueCount' namespace='##targetNamespace'"
	 * @generated
	 */
	Count getDefaultValueCount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueCount <em>Default Value Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Count</em>' containment reference.
	 * @see #getDefaultValueCount()
	 * @generated
	 */
	void setDefaultValueCount(Count value);

	/**
	 * Returns the value of the '<em><b>Default Value Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Distance</em>' containment reference.
	 * @see #setDefaultValueDistance(Distance)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueDistance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueDistance' namespace='##targetNamespace'"
	 * @generated
	 */
	Distance getDefaultValueDistance();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueDistance <em>Default Value Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Distance</em>' containment reference.
	 * @see #getDefaultValueDistance()
	 * @generated
	 */
	void setDefaultValueDistance(Distance value);

	/**
	 * Returns the value of the '<em><b>Default Value Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Duration</em>' containment reference.
	 * @see #setDefaultValueDuration(Duration)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueDuration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getDefaultValueDuration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueDuration <em>Default Value Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Duration</em>' containment reference.
	 * @see #getDefaultValueDuration()
	 * @generated
	 */
	void setDefaultValueDuration(Duration value);

	/**
	 * Returns the value of the '<em><b>Default Value Human Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Human Name</em>' containment reference.
	 * @see #setDefaultValueHumanName(HumanName)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueHumanName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueHumanName' namespace='##targetNamespace'"
	 * @generated
	 */
	HumanName getDefaultValueHumanName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueHumanName <em>Default Value Human Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Human Name</em>' containment reference.
	 * @see #getDefaultValueHumanName()
	 * @generated
	 */
	void setDefaultValueHumanName(HumanName value);

	/**
	 * Returns the value of the '<em><b>Default Value Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Identifier</em>' containment reference.
	 * @see #setDefaultValueIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getDefaultValueIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueIdentifier <em>Default Value Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Identifier</em>' containment reference.
	 * @see #getDefaultValueIdentifier()
	 * @generated
	 */
	void setDefaultValueIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Default Value Money</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Money</em>' containment reference.
	 * @see #setDefaultValueMoney(Money)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueMoney()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueMoney' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getDefaultValueMoney();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueMoney <em>Default Value Money</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Money</em>' containment reference.
	 * @see #getDefaultValueMoney()
	 * @generated
	 */
	void setDefaultValueMoney(Money value);

	/**
	 * Returns the value of the '<em><b>Default Value Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Period</em>' containment reference.
	 * @see #setDefaultValuePeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValuePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValuePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getDefaultValuePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValuePeriod <em>Default Value Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Period</em>' containment reference.
	 * @see #getDefaultValuePeriod()
	 * @generated
	 */
	void setDefaultValuePeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Default Value Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Quantity</em>' containment reference.
	 * @see #setDefaultValueQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getDefaultValueQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueQuantity <em>Default Value Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Quantity</em>' containment reference.
	 * @see #getDefaultValueQuantity()
	 * @generated
	 */
	void setDefaultValueQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Default Value Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Range</em>' containment reference.
	 * @see #setDefaultValueRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getDefaultValueRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueRange <em>Default Value Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Range</em>' containment reference.
	 * @see #getDefaultValueRange()
	 * @generated
	 */
	void setDefaultValueRange(Range value);

	/**
	 * Returns the value of the '<em><b>Default Value Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Ratio</em>' containment reference.
	 * @see #setDefaultValueRatio(Ratio)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueRatio()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueRatio' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getDefaultValueRatio();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueRatio <em>Default Value Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Ratio</em>' containment reference.
	 * @see #getDefaultValueRatio()
	 * @generated
	 */
	void setDefaultValueRatio(Ratio value);

	/**
	 * Returns the value of the '<em><b>Default Value Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Reference</em>' containment reference.
	 * @see #setDefaultValueReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getDefaultValueReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueReference <em>Default Value Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Reference</em>' containment reference.
	 * @see #getDefaultValueReference()
	 * @generated
	 */
	void setDefaultValueReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Default Value Sampled Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Sampled Data</em>' containment reference.
	 * @see #setDefaultValueSampledData(SampledData)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueSampledData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueSampledData' namespace='##targetNamespace'"
	 * @generated
	 */
	SampledData getDefaultValueSampledData();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueSampledData <em>Default Value Sampled Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Sampled Data</em>' containment reference.
	 * @see #getDefaultValueSampledData()
	 * @generated
	 */
	void setDefaultValueSampledData(SampledData value);

	/**
	 * Returns the value of the '<em><b>Default Value Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Signature</em>' containment reference.
	 * @see #setDefaultValueSignature(Signature)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueSignature()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueSignature' namespace='##targetNamespace'"
	 * @generated
	 */
	Signature getDefaultValueSignature();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueSignature <em>Default Value Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Signature</em>' containment reference.
	 * @see #getDefaultValueSignature()
	 * @generated
	 */
	void setDefaultValueSignature(Signature value);

	/**
	 * Returns the value of the '<em><b>Default Value Timing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Timing</em>' containment reference.
	 * @see #setDefaultValueTiming(Timing)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueTiming()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueTiming' namespace='##targetNamespace'"
	 * @generated
	 */
	Timing getDefaultValueTiming();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueTiming <em>Default Value Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Timing</em>' containment reference.
	 * @see #getDefaultValueTiming()
	 * @generated
	 */
	void setDefaultValueTiming(Timing value);

	/**
	 * Returns the value of the '<em><b>Default Value Contact Detail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Contact Detail</em>' containment reference.
	 * @see #setDefaultValueContactDetail(ContactDetail)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueContactDetail()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueContactDetail' namespace='##targetNamespace'"
	 * @generated
	 */
	ContactDetail getDefaultValueContactDetail();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueContactDetail <em>Default Value Contact Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Contact Detail</em>' containment reference.
	 * @see #getDefaultValueContactDetail()
	 * @generated
	 */
	void setDefaultValueContactDetail(ContactDetail value);

	/**
	 * Returns the value of the '<em><b>Default Value Contributor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Contributor</em>' containment reference.
	 * @see #setDefaultValueContributor(Contributor)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueContributor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueContributor' namespace='##targetNamespace'"
	 * @generated
	 */
	Contributor getDefaultValueContributor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueContributor <em>Default Value Contributor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Contributor</em>' containment reference.
	 * @see #getDefaultValueContributor()
	 * @generated
	 */
	void setDefaultValueContributor(Contributor value);

	/**
	 * Returns the value of the '<em><b>Default Value Data Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Data Requirement</em>' containment reference.
	 * @see #setDefaultValueDataRequirement(DataRequirement)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueDataRequirement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueDataRequirement' namespace='##targetNamespace'"
	 * @generated
	 */
	DataRequirement getDefaultValueDataRequirement();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueDataRequirement <em>Default Value Data Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Data Requirement</em>' containment reference.
	 * @see #getDefaultValueDataRequirement()
	 * @generated
	 */
	void setDefaultValueDataRequirement(DataRequirement value);

	/**
	 * Returns the value of the '<em><b>Default Value Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Expression</em>' containment reference.
	 * @see #setDefaultValueExpression(Expression)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueExpression()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueExpression' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getDefaultValueExpression();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueExpression <em>Default Value Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Expression</em>' containment reference.
	 * @see #getDefaultValueExpression()
	 * @generated
	 */
	void setDefaultValueExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Default Value Parameter Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Parameter Definition</em>' containment reference.
	 * @see #setDefaultValueParameterDefinition(ParameterDefinition)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueParameterDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueParameterDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	ParameterDefinition getDefaultValueParameterDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueParameterDefinition <em>Default Value Parameter Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Parameter Definition</em>' containment reference.
	 * @see #getDefaultValueParameterDefinition()
	 * @generated
	 */
	void setDefaultValueParameterDefinition(ParameterDefinition value);

	/**
	 * Returns the value of the '<em><b>Default Value Related Artifact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Related Artifact</em>' containment reference.
	 * @see #setDefaultValueRelatedArtifact(RelatedArtifact)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueRelatedArtifact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueRelatedArtifact' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatedArtifact getDefaultValueRelatedArtifact();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueRelatedArtifact <em>Default Value Related Artifact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Related Artifact</em>' containment reference.
	 * @see #getDefaultValueRelatedArtifact()
	 * @generated
	 */
	void setDefaultValueRelatedArtifact(RelatedArtifact value);

	/**
	 * Returns the value of the '<em><b>Default Value Trigger Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Trigger Definition</em>' containment reference.
	 * @see #setDefaultValueTriggerDefinition(TriggerDefinition)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueTriggerDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueTriggerDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	TriggerDefinition getDefaultValueTriggerDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueTriggerDefinition <em>Default Value Trigger Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Trigger Definition</em>' containment reference.
	 * @see #getDefaultValueTriggerDefinition()
	 * @generated
	 */
	void setDefaultValueTriggerDefinition(TriggerDefinition value);

	/**
	 * Returns the value of the '<em><b>Default Value Usage Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Usage Context</em>' containment reference.
	 * @see #setDefaultValueUsageContext(UsageContext)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueUsageContext()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueUsageContext' namespace='##targetNamespace'"
	 * @generated
	 */
	UsageContext getDefaultValueUsageContext();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueUsageContext <em>Default Value Usage Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Usage Context</em>' containment reference.
	 * @see #getDefaultValueUsageContext()
	 * @generated
	 */
	void setDefaultValueUsageContext(UsageContext value);

	/**
	 * Returns the value of the '<em><b>Default Value Dosage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Dosage</em>' containment reference.
	 * @see #setDefaultValueDosage(Dosage)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueDosage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueDosage' namespace='##targetNamespace'"
	 * @generated
	 */
	Dosage getDefaultValueDosage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueDosage <em>Default Value Dosage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Dosage</em>' containment reference.
	 * @see #getDefaultValueDosage()
	 * @generated
	 */
	void setDefaultValueDosage(Dosage value);

	/**
	 * Returns the value of the '<em><b>Default Value Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value that should be used if there is no value stated in the instance (e.g. 'if not otherwise specified, the abstract is false'). (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Meta</em>' containment reference.
	 * @see #setDefaultValueMeta(Meta)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueMeta()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueMeta' namespace='##targetNamespace'"
	 * @generated
	 */
	Meta getDefaultValueMeta();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueMeta <em>Default Value Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Meta</em>' containment reference.
	 * @see #getDefaultValueMeta()
	 * @generated
	 */
	void setDefaultValueMeta(Meta value);

	/**
	 * Returns the value of the '<em><b>Meaning When Missing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Implicit meaning that is to be understood when this element is missing (e.g. 'when this element is missing, the period is ongoing').
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Meaning When Missing</em>' containment reference.
	 * @see #setMeaningWhenMissing(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MeaningWhenMissing()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='meaningWhenMissing' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getMeaningWhenMissing();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMeaningWhenMissing <em>Meaning When Missing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meaning When Missing</em>' containment reference.
	 * @see #getMeaningWhenMissing()
	 * @generated
	 */
	void setMeaningWhenMissing(Markdown value);

	/**
	 * Returns the value of the '<em><b>Order Meaning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If present, indicates that the order of the repeating element has meaning and describes what that meaning is.  If absent, it means that the order of the element has no meaning.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order Meaning</em>' containment reference.
	 * @see #setOrderMeaning(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_OrderMeaning()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='orderMeaning' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getOrderMeaning();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getOrderMeaning <em>Order Meaning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Meaning</em>' containment reference.
	 * @see #getOrderMeaning()
	 * @generated
	 */
	void setOrderMeaning(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Fixed Base64 Binary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Base64 Binary</em>' containment reference.
	 * @see #setFixedBase64Binary(Base64Binary)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedBase64Binary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedBase64Binary' namespace='##targetNamespace'"
	 * @generated
	 */
	Base64Binary getFixedBase64Binary();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedBase64Binary <em>Fixed Base64 Binary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Base64 Binary</em>' containment reference.
	 * @see #getFixedBase64Binary()
	 * @generated
	 */
	void setFixedBase64Binary(Base64Binary value);

	/**
	 * Returns the value of the '<em><b>Fixed Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Boolean</em>' containment reference.
	 * @see #setFixedBoolean(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedBoolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedBoolean' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getFixedBoolean();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedBoolean <em>Fixed Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Boolean</em>' containment reference.
	 * @see #getFixedBoolean()
	 * @generated
	 */
	void setFixedBoolean(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Fixed Canonical</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Canonical</em>' containment reference.
	 * @see #setFixedCanonical(Canonical)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedCanonical()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedCanonical' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getFixedCanonical();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedCanonical <em>Fixed Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Canonical</em>' containment reference.
	 * @see #getFixedCanonical()
	 * @generated
	 */
	void setFixedCanonical(Canonical value);

	/**
	 * Returns the value of the '<em><b>Fixed Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Code</em>' containment reference.
	 * @see #setFixedCode(Code)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedCode' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getFixedCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedCode <em>Fixed Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Code</em>' containment reference.
	 * @see #getFixedCode()
	 * @generated
	 */
	void setFixedCode(Code value);

	/**
	 * Returns the value of the '<em><b>Fixed Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Date</em>' containment reference.
	 * @see #setFixedDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getFixedDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedDate <em>Fixed Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Date</em>' containment reference.
	 * @see #getFixedDate()
	 * @generated
	 */
	void setFixedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Fixed Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Date Time</em>' containment reference.
	 * @see #setFixedDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getFixedDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedDateTime <em>Fixed Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Date Time</em>' containment reference.
	 * @see #getFixedDateTime()
	 * @generated
	 */
	void setFixedDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Fixed Decimal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Decimal</em>' containment reference.
	 * @see #setFixedDecimal(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedDecimal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedDecimal' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getFixedDecimal();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedDecimal <em>Fixed Decimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Decimal</em>' containment reference.
	 * @see #getFixedDecimal()
	 * @generated
	 */
	void setFixedDecimal(Decimal value);

	/**
	 * Returns the value of the '<em><b>Fixed Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Id</em>' containment reference.
	 * @see #setFixedId(Id)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedId' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getFixedId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedId <em>Fixed Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Id</em>' containment reference.
	 * @see #getFixedId()
	 * @generated
	 */
	void setFixedId(Id value);

	/**
	 * Returns the value of the '<em><b>Fixed Instant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Instant</em>' containment reference.
	 * @see #setFixedInstant(Instant)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedInstant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedInstant' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getFixedInstant();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedInstant <em>Fixed Instant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Instant</em>' containment reference.
	 * @see #getFixedInstant()
	 * @generated
	 */
	void setFixedInstant(Instant value);

	/**
	 * Returns the value of the '<em><b>Fixed Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Integer</em>' containment reference.
	 * @see #setFixedInteger(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedInteger()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedInteger' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getFixedInteger();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedInteger <em>Fixed Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Integer</em>' containment reference.
	 * @see #getFixedInteger()
	 * @generated
	 */
	void setFixedInteger(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Fixed Markdown</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Markdown</em>' containment reference.
	 * @see #setFixedMarkdown(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedMarkdown()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedMarkdown' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getFixedMarkdown();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedMarkdown <em>Fixed Markdown</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Markdown</em>' containment reference.
	 * @see #getFixedMarkdown()
	 * @generated
	 */
	void setFixedMarkdown(Markdown value);

	/**
	 * Returns the value of the '<em><b>Fixed Oid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Oid</em>' containment reference.
	 * @see #setFixedOid(Oid)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedOid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedOid' namespace='##targetNamespace'"
	 * @generated
	 */
	Oid getFixedOid();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedOid <em>Fixed Oid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Oid</em>' containment reference.
	 * @see #getFixedOid()
	 * @generated
	 */
	void setFixedOid(Oid value);

	/**
	 * Returns the value of the '<em><b>Fixed Positive Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Positive Int</em>' containment reference.
	 * @see #setFixedPositiveInt(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedPositiveInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedPositiveInt' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getFixedPositiveInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedPositiveInt <em>Fixed Positive Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Positive Int</em>' containment reference.
	 * @see #getFixedPositiveInt()
	 * @generated
	 */
	void setFixedPositiveInt(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Fixed String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed String</em>' containment reference.
	 * @see #setFixedString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getFixedString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedString <em>Fixed String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed String</em>' containment reference.
	 * @see #getFixedString()
	 * @generated
	 */
	void setFixedString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Fixed Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Time</em>' containment reference.
	 * @see #setFixedTime(Time)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedTime' namespace='##targetNamespace'"
	 * @generated
	 */
	Time getFixedTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedTime <em>Fixed Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Time</em>' containment reference.
	 * @see #getFixedTime()
	 * @generated
	 */
	void setFixedTime(Time value);

	/**
	 * Returns the value of the '<em><b>Fixed Unsigned Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Unsigned Int</em>' containment reference.
	 * @see #setFixedUnsignedInt(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedUnsignedInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedUnsignedInt' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getFixedUnsignedInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedUnsignedInt <em>Fixed Unsigned Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Unsigned Int</em>' containment reference.
	 * @see #getFixedUnsignedInt()
	 * @generated
	 */
	void setFixedUnsignedInt(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Fixed Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Uri</em>' containment reference.
	 * @see #setFixedUri(Uri)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedUri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getFixedUri();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedUri <em>Fixed Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Uri</em>' containment reference.
	 * @see #getFixedUri()
	 * @generated
	 */
	void setFixedUri(Uri value);

	/**
	 * Returns the value of the '<em><b>Fixed Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Url</em>' containment reference.
	 * @see #setFixedUrl(Url)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedUrl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedUrl' namespace='##targetNamespace'"
	 * @generated
	 */
	Url getFixedUrl();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedUrl <em>Fixed Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Url</em>' containment reference.
	 * @see #getFixedUrl()
	 * @generated
	 */
	void setFixedUrl(Url value);

	/**
	 * Returns the value of the '<em><b>Fixed Uuid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Uuid</em>' containment reference.
	 * @see #setFixedUuid(Uuid)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedUuid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedUuid' namespace='##targetNamespace'"
	 * @generated
	 */
	Uuid getFixedUuid();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedUuid <em>Fixed Uuid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Uuid</em>' containment reference.
	 * @see #getFixedUuid()
	 * @generated
	 */
	void setFixedUuid(Uuid value);

	/**
	 * Returns the value of the '<em><b>Fixed Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Address</em>' containment reference.
	 * @see #setFixedAddress(Address)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedAddress()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	Address getFixedAddress();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedAddress <em>Fixed Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Address</em>' containment reference.
	 * @see #getFixedAddress()
	 * @generated
	 */
	void setFixedAddress(Address value);

	/**
	 * Returns the value of the '<em><b>Fixed Age</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Age</em>' containment reference.
	 * @see #setFixedAge(Age)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedAge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedAge' namespace='##targetNamespace'"
	 * @generated
	 */
	Age getFixedAge();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedAge <em>Fixed Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Age</em>' containment reference.
	 * @see #getFixedAge()
	 * @generated
	 */
	void setFixedAge(Age value);

	/**
	 * Returns the value of the '<em><b>Fixed Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Annotation</em>' containment reference.
	 * @see #setFixedAnnotation(Annotation)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedAnnotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedAnnotation' namespace='##targetNamespace'"
	 * @generated
	 */
	Annotation getFixedAnnotation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedAnnotation <em>Fixed Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Annotation</em>' containment reference.
	 * @see #getFixedAnnotation()
	 * @generated
	 */
	void setFixedAnnotation(Annotation value);

	/**
	 * Returns the value of the '<em><b>Fixed Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Attachment</em>' containment reference.
	 * @see #setFixedAttachment(Attachment)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedAttachment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	Attachment getFixedAttachment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedAttachment <em>Fixed Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Attachment</em>' containment reference.
	 * @see #getFixedAttachment()
	 * @generated
	 */
	void setFixedAttachment(Attachment value);

	/**
	 * Returns the value of the '<em><b>Fixed Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Codeable Concept</em>' containment reference.
	 * @see #setFixedCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getFixedCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedCodeableConcept <em>Fixed Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Codeable Concept</em>' containment reference.
	 * @see #getFixedCodeableConcept()
	 * @generated
	 */
	void setFixedCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Fixed Coding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Coding</em>' containment reference.
	 * @see #setFixedCoding(Coding)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedCoding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedCoding' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getFixedCoding();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedCoding <em>Fixed Coding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Coding</em>' containment reference.
	 * @see #getFixedCoding()
	 * @generated
	 */
	void setFixedCoding(Coding value);

	/**
	 * Returns the value of the '<em><b>Fixed Contact Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Contact Point</em>' containment reference.
	 * @see #setFixedContactPoint(ContactPoint)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedContactPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedContactPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	ContactPoint getFixedContactPoint();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedContactPoint <em>Fixed Contact Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Contact Point</em>' containment reference.
	 * @see #getFixedContactPoint()
	 * @generated
	 */
	void setFixedContactPoint(ContactPoint value);

	/**
	 * Returns the value of the '<em><b>Fixed Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Count</em>' containment reference.
	 * @see #setFixedCount(Count)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedCount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedCount' namespace='##targetNamespace'"
	 * @generated
	 */
	Count getFixedCount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedCount <em>Fixed Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Count</em>' containment reference.
	 * @see #getFixedCount()
	 * @generated
	 */
	void setFixedCount(Count value);

	/**
	 * Returns the value of the '<em><b>Fixed Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Distance</em>' containment reference.
	 * @see #setFixedDistance(Distance)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedDistance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedDistance' namespace='##targetNamespace'"
	 * @generated
	 */
	Distance getFixedDistance();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedDistance <em>Fixed Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Distance</em>' containment reference.
	 * @see #getFixedDistance()
	 * @generated
	 */
	void setFixedDistance(Distance value);

	/**
	 * Returns the value of the '<em><b>Fixed Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Duration</em>' containment reference.
	 * @see #setFixedDuration(Duration)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedDuration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getFixedDuration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedDuration <em>Fixed Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Duration</em>' containment reference.
	 * @see #getFixedDuration()
	 * @generated
	 */
	void setFixedDuration(Duration value);

	/**
	 * Returns the value of the '<em><b>Fixed Human Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Human Name</em>' containment reference.
	 * @see #setFixedHumanName(HumanName)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedHumanName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedHumanName' namespace='##targetNamespace'"
	 * @generated
	 */
	HumanName getFixedHumanName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedHumanName <em>Fixed Human Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Human Name</em>' containment reference.
	 * @see #getFixedHumanName()
	 * @generated
	 */
	void setFixedHumanName(HumanName value);

	/**
	 * Returns the value of the '<em><b>Fixed Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Identifier</em>' containment reference.
	 * @see #setFixedIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getFixedIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedIdentifier <em>Fixed Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Identifier</em>' containment reference.
	 * @see #getFixedIdentifier()
	 * @generated
	 */
	void setFixedIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Fixed Money</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Money</em>' containment reference.
	 * @see #setFixedMoney(Money)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedMoney()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedMoney' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getFixedMoney();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedMoney <em>Fixed Money</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Money</em>' containment reference.
	 * @see #getFixedMoney()
	 * @generated
	 */
	void setFixedMoney(Money value);

	/**
	 * Returns the value of the '<em><b>Fixed Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Period</em>' containment reference.
	 * @see #setFixedPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getFixedPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedPeriod <em>Fixed Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Period</em>' containment reference.
	 * @see #getFixedPeriod()
	 * @generated
	 */
	void setFixedPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Fixed Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Quantity</em>' containment reference.
	 * @see #setFixedQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getFixedQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedQuantity <em>Fixed Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Quantity</em>' containment reference.
	 * @see #getFixedQuantity()
	 * @generated
	 */
	void setFixedQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Fixed Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Range</em>' containment reference.
	 * @see #setFixedRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getFixedRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedRange <em>Fixed Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Range</em>' containment reference.
	 * @see #getFixedRange()
	 * @generated
	 */
	void setFixedRange(Range value);

	/**
	 * Returns the value of the '<em><b>Fixed Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Ratio</em>' containment reference.
	 * @see #setFixedRatio(Ratio)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedRatio()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedRatio' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getFixedRatio();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedRatio <em>Fixed Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Ratio</em>' containment reference.
	 * @see #getFixedRatio()
	 * @generated
	 */
	void setFixedRatio(Ratio value);

	/**
	 * Returns the value of the '<em><b>Fixed Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Reference</em>' containment reference.
	 * @see #setFixedReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getFixedReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedReference <em>Fixed Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Reference</em>' containment reference.
	 * @see #getFixedReference()
	 * @generated
	 */
	void setFixedReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Fixed Sampled Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Sampled Data</em>' containment reference.
	 * @see #setFixedSampledData(SampledData)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedSampledData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedSampledData' namespace='##targetNamespace'"
	 * @generated
	 */
	SampledData getFixedSampledData();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedSampledData <em>Fixed Sampled Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Sampled Data</em>' containment reference.
	 * @see #getFixedSampledData()
	 * @generated
	 */
	void setFixedSampledData(SampledData value);

	/**
	 * Returns the value of the '<em><b>Fixed Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Signature</em>' containment reference.
	 * @see #setFixedSignature(Signature)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedSignature()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedSignature' namespace='##targetNamespace'"
	 * @generated
	 */
	Signature getFixedSignature();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedSignature <em>Fixed Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Signature</em>' containment reference.
	 * @see #getFixedSignature()
	 * @generated
	 */
	void setFixedSignature(Signature value);

	/**
	 * Returns the value of the '<em><b>Fixed Timing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Timing</em>' containment reference.
	 * @see #setFixedTiming(Timing)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedTiming()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedTiming' namespace='##targetNamespace'"
	 * @generated
	 */
	Timing getFixedTiming();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedTiming <em>Fixed Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Timing</em>' containment reference.
	 * @see #getFixedTiming()
	 * @generated
	 */
	void setFixedTiming(Timing value);

	/**
	 * Returns the value of the '<em><b>Fixed Contact Detail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Contact Detail</em>' containment reference.
	 * @see #setFixedContactDetail(ContactDetail)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedContactDetail()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedContactDetail' namespace='##targetNamespace'"
	 * @generated
	 */
	ContactDetail getFixedContactDetail();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedContactDetail <em>Fixed Contact Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Contact Detail</em>' containment reference.
	 * @see #getFixedContactDetail()
	 * @generated
	 */
	void setFixedContactDetail(ContactDetail value);

	/**
	 * Returns the value of the '<em><b>Fixed Contributor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Contributor</em>' containment reference.
	 * @see #setFixedContributor(Contributor)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedContributor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedContributor' namespace='##targetNamespace'"
	 * @generated
	 */
	Contributor getFixedContributor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedContributor <em>Fixed Contributor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Contributor</em>' containment reference.
	 * @see #getFixedContributor()
	 * @generated
	 */
	void setFixedContributor(Contributor value);

	/**
	 * Returns the value of the '<em><b>Fixed Data Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Data Requirement</em>' containment reference.
	 * @see #setFixedDataRequirement(DataRequirement)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedDataRequirement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedDataRequirement' namespace='##targetNamespace'"
	 * @generated
	 */
	DataRequirement getFixedDataRequirement();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedDataRequirement <em>Fixed Data Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Data Requirement</em>' containment reference.
	 * @see #getFixedDataRequirement()
	 * @generated
	 */
	void setFixedDataRequirement(DataRequirement value);

	/**
	 * Returns the value of the '<em><b>Fixed Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Expression</em>' containment reference.
	 * @see #setFixedExpression(Expression)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedExpression()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedExpression' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getFixedExpression();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedExpression <em>Fixed Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Expression</em>' containment reference.
	 * @see #getFixedExpression()
	 * @generated
	 */
	void setFixedExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Fixed Parameter Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Parameter Definition</em>' containment reference.
	 * @see #setFixedParameterDefinition(ParameterDefinition)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedParameterDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedParameterDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	ParameterDefinition getFixedParameterDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedParameterDefinition <em>Fixed Parameter Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Parameter Definition</em>' containment reference.
	 * @see #getFixedParameterDefinition()
	 * @generated
	 */
	void setFixedParameterDefinition(ParameterDefinition value);

	/**
	 * Returns the value of the '<em><b>Fixed Related Artifact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Related Artifact</em>' containment reference.
	 * @see #setFixedRelatedArtifact(RelatedArtifact)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedRelatedArtifact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedRelatedArtifact' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatedArtifact getFixedRelatedArtifact();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedRelatedArtifact <em>Fixed Related Artifact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Related Artifact</em>' containment reference.
	 * @see #getFixedRelatedArtifact()
	 * @generated
	 */
	void setFixedRelatedArtifact(RelatedArtifact value);

	/**
	 * Returns the value of the '<em><b>Fixed Trigger Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Trigger Definition</em>' containment reference.
	 * @see #setFixedTriggerDefinition(TriggerDefinition)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedTriggerDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedTriggerDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	TriggerDefinition getFixedTriggerDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedTriggerDefinition <em>Fixed Trigger Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Trigger Definition</em>' containment reference.
	 * @see #getFixedTriggerDefinition()
	 * @generated
	 */
	void setFixedTriggerDefinition(TriggerDefinition value);

	/**
	 * Returns the value of the '<em><b>Fixed Usage Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Usage Context</em>' containment reference.
	 * @see #setFixedUsageContext(UsageContext)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedUsageContext()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedUsageContext' namespace='##targetNamespace'"
	 * @generated
	 */
	UsageContext getFixedUsageContext();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedUsageContext <em>Fixed Usage Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Usage Context</em>' containment reference.
	 * @see #getFixedUsageContext()
	 * @generated
	 */
	void setFixedUsageContext(UsageContext value);

	/**
	 * Returns the value of the '<em><b>Fixed Dosage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Dosage</em>' containment reference.
	 * @see #setFixedDosage(Dosage)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedDosage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedDosage' namespace='##targetNamespace'"
	 * @generated
	 */
	Dosage getFixedDosage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedDosage <em>Fixed Dosage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Dosage</em>' containment reference.
	 * @see #getFixedDosage()
	 * @generated
	 */
	void setFixedDosage(Dosage value);

	/**
	 * Returns the value of the '<em><b>Fixed Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that SHALL be exactly the value  for this element in the instance. For purposes of comparison, non-significant whitespace is ignored, and all values must be an exact match (case and accent sensitive). Missing elements/attributes must also be missing. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Meta</em>' containment reference.
	 * @see #setFixedMeta(Meta)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedMeta()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedMeta' namespace='##targetNamespace'"
	 * @generated
	 */
	Meta getFixedMeta();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedMeta <em>Fixed Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Meta</em>' containment reference.
	 * @see #getFixedMeta()
	 * @generated
	 */
	void setFixedMeta(Meta value);

	/**
	 * Returns the value of the '<em><b>Pattern Base64 Binary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Base64 Binary</em>' containment reference.
	 * @see #setPatternBase64Binary(Base64Binary)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternBase64Binary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternBase64Binary' namespace='##targetNamespace'"
	 * @generated
	 */
	Base64Binary getPatternBase64Binary();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternBase64Binary <em>Pattern Base64 Binary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Base64 Binary</em>' containment reference.
	 * @see #getPatternBase64Binary()
	 * @generated
	 */
	void setPatternBase64Binary(Base64Binary value);

	/**
	 * Returns the value of the '<em><b>Pattern Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Boolean</em>' containment reference.
	 * @see #setPatternBoolean(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternBoolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternBoolean' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getPatternBoolean();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternBoolean <em>Pattern Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Boolean</em>' containment reference.
	 * @see #getPatternBoolean()
	 * @generated
	 */
	void setPatternBoolean(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Pattern Canonical</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Canonical</em>' containment reference.
	 * @see #setPatternCanonical(Canonical)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternCanonical()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternCanonical' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getPatternCanonical();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternCanonical <em>Pattern Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Canonical</em>' containment reference.
	 * @see #getPatternCanonical()
	 * @generated
	 */
	void setPatternCanonical(Canonical value);

	/**
	 * Returns the value of the '<em><b>Pattern Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Code</em>' containment reference.
	 * @see #setPatternCode(Code)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternCode' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getPatternCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternCode <em>Pattern Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Code</em>' containment reference.
	 * @see #getPatternCode()
	 * @generated
	 */
	void setPatternCode(Code value);

	/**
	 * Returns the value of the '<em><b>Pattern Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Date</em>' containment reference.
	 * @see #setPatternDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getPatternDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternDate <em>Pattern Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Date</em>' containment reference.
	 * @see #getPatternDate()
	 * @generated
	 */
	void setPatternDate(Date value);

	/**
	 * Returns the value of the '<em><b>Pattern Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Date Time</em>' containment reference.
	 * @see #setPatternDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getPatternDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternDateTime <em>Pattern Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Date Time</em>' containment reference.
	 * @see #getPatternDateTime()
	 * @generated
	 */
	void setPatternDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Pattern Decimal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Decimal</em>' containment reference.
	 * @see #setPatternDecimal(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternDecimal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternDecimal' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getPatternDecimal();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternDecimal <em>Pattern Decimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Decimal</em>' containment reference.
	 * @see #getPatternDecimal()
	 * @generated
	 */
	void setPatternDecimal(Decimal value);

	/**
	 * Returns the value of the '<em><b>Pattern Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Id</em>' containment reference.
	 * @see #setPatternId(Id)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternId' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getPatternId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternId <em>Pattern Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Id</em>' containment reference.
	 * @see #getPatternId()
	 * @generated
	 */
	void setPatternId(Id value);

	/**
	 * Returns the value of the '<em><b>Pattern Instant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Instant</em>' containment reference.
	 * @see #setPatternInstant(Instant)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternInstant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternInstant' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getPatternInstant();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternInstant <em>Pattern Instant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Instant</em>' containment reference.
	 * @see #getPatternInstant()
	 * @generated
	 */
	void setPatternInstant(Instant value);

	/**
	 * Returns the value of the '<em><b>Pattern Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Integer</em>' containment reference.
	 * @see #setPatternInteger(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternInteger()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternInteger' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getPatternInteger();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternInteger <em>Pattern Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Integer</em>' containment reference.
	 * @see #getPatternInteger()
	 * @generated
	 */
	void setPatternInteger(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Pattern Markdown</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Markdown</em>' containment reference.
	 * @see #setPatternMarkdown(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternMarkdown()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternMarkdown' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getPatternMarkdown();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternMarkdown <em>Pattern Markdown</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Markdown</em>' containment reference.
	 * @see #getPatternMarkdown()
	 * @generated
	 */
	void setPatternMarkdown(Markdown value);

	/**
	 * Returns the value of the '<em><b>Pattern Oid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Oid</em>' containment reference.
	 * @see #setPatternOid(Oid)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternOid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternOid' namespace='##targetNamespace'"
	 * @generated
	 */
	Oid getPatternOid();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternOid <em>Pattern Oid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Oid</em>' containment reference.
	 * @see #getPatternOid()
	 * @generated
	 */
	void setPatternOid(Oid value);

	/**
	 * Returns the value of the '<em><b>Pattern Positive Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Positive Int</em>' containment reference.
	 * @see #setPatternPositiveInt(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternPositiveInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternPositiveInt' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getPatternPositiveInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternPositiveInt <em>Pattern Positive Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Positive Int</em>' containment reference.
	 * @see #getPatternPositiveInt()
	 * @generated
	 */
	void setPatternPositiveInt(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Pattern String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern String</em>' containment reference.
	 * @see #setPatternString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPatternString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternString <em>Pattern String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern String</em>' containment reference.
	 * @see #getPatternString()
	 * @generated
	 */
	void setPatternString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Pattern Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Time</em>' containment reference.
	 * @see #setPatternTime(Time)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternTime' namespace='##targetNamespace'"
	 * @generated
	 */
	Time getPatternTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternTime <em>Pattern Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Time</em>' containment reference.
	 * @see #getPatternTime()
	 * @generated
	 */
	void setPatternTime(Time value);

	/**
	 * Returns the value of the '<em><b>Pattern Unsigned Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Unsigned Int</em>' containment reference.
	 * @see #setPatternUnsignedInt(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternUnsignedInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternUnsignedInt' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getPatternUnsignedInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternUnsignedInt <em>Pattern Unsigned Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Unsigned Int</em>' containment reference.
	 * @see #getPatternUnsignedInt()
	 * @generated
	 */
	void setPatternUnsignedInt(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Pattern Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Uri</em>' containment reference.
	 * @see #setPatternUri(Uri)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternUri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getPatternUri();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternUri <em>Pattern Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Uri</em>' containment reference.
	 * @see #getPatternUri()
	 * @generated
	 */
	void setPatternUri(Uri value);

	/**
	 * Returns the value of the '<em><b>Pattern Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Url</em>' containment reference.
	 * @see #setPatternUrl(Url)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternUrl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternUrl' namespace='##targetNamespace'"
	 * @generated
	 */
	Url getPatternUrl();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternUrl <em>Pattern Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Url</em>' containment reference.
	 * @see #getPatternUrl()
	 * @generated
	 */
	void setPatternUrl(Url value);

	/**
	 * Returns the value of the '<em><b>Pattern Uuid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Uuid</em>' containment reference.
	 * @see #setPatternUuid(Uuid)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternUuid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternUuid' namespace='##targetNamespace'"
	 * @generated
	 */
	Uuid getPatternUuid();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternUuid <em>Pattern Uuid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Uuid</em>' containment reference.
	 * @see #getPatternUuid()
	 * @generated
	 */
	void setPatternUuid(Uuid value);

	/**
	 * Returns the value of the '<em><b>Pattern Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Address</em>' containment reference.
	 * @see #setPatternAddress(Address)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternAddress()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	Address getPatternAddress();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternAddress <em>Pattern Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Address</em>' containment reference.
	 * @see #getPatternAddress()
	 * @generated
	 */
	void setPatternAddress(Address value);

	/**
	 * Returns the value of the '<em><b>Pattern Age</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Age</em>' containment reference.
	 * @see #setPatternAge(Age)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternAge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternAge' namespace='##targetNamespace'"
	 * @generated
	 */
	Age getPatternAge();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternAge <em>Pattern Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Age</em>' containment reference.
	 * @see #getPatternAge()
	 * @generated
	 */
	void setPatternAge(Age value);

	/**
	 * Returns the value of the '<em><b>Pattern Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Annotation</em>' containment reference.
	 * @see #setPatternAnnotation(Annotation)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternAnnotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternAnnotation' namespace='##targetNamespace'"
	 * @generated
	 */
	Annotation getPatternAnnotation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternAnnotation <em>Pattern Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Annotation</em>' containment reference.
	 * @see #getPatternAnnotation()
	 * @generated
	 */
	void setPatternAnnotation(Annotation value);

	/**
	 * Returns the value of the '<em><b>Pattern Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Attachment</em>' containment reference.
	 * @see #setPatternAttachment(Attachment)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternAttachment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	Attachment getPatternAttachment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternAttachment <em>Pattern Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Attachment</em>' containment reference.
	 * @see #getPatternAttachment()
	 * @generated
	 */
	void setPatternAttachment(Attachment value);

	/**
	 * Returns the value of the '<em><b>Pattern Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Codeable Concept</em>' containment reference.
	 * @see #setPatternCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getPatternCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternCodeableConcept <em>Pattern Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Codeable Concept</em>' containment reference.
	 * @see #getPatternCodeableConcept()
	 * @generated
	 */
	void setPatternCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Pattern Coding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Coding</em>' containment reference.
	 * @see #setPatternCoding(Coding)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternCoding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternCoding' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getPatternCoding();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternCoding <em>Pattern Coding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Coding</em>' containment reference.
	 * @see #getPatternCoding()
	 * @generated
	 */
	void setPatternCoding(Coding value);

	/**
	 * Returns the value of the '<em><b>Pattern Contact Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Contact Point</em>' containment reference.
	 * @see #setPatternContactPoint(ContactPoint)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternContactPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternContactPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	ContactPoint getPatternContactPoint();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternContactPoint <em>Pattern Contact Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Contact Point</em>' containment reference.
	 * @see #getPatternContactPoint()
	 * @generated
	 */
	void setPatternContactPoint(ContactPoint value);

	/**
	 * Returns the value of the '<em><b>Pattern Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Count</em>' containment reference.
	 * @see #setPatternCount(Count)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternCount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternCount' namespace='##targetNamespace'"
	 * @generated
	 */
	Count getPatternCount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternCount <em>Pattern Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Count</em>' containment reference.
	 * @see #getPatternCount()
	 * @generated
	 */
	void setPatternCount(Count value);

	/**
	 * Returns the value of the '<em><b>Pattern Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Distance</em>' containment reference.
	 * @see #setPatternDistance(Distance)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternDistance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternDistance' namespace='##targetNamespace'"
	 * @generated
	 */
	Distance getPatternDistance();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternDistance <em>Pattern Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Distance</em>' containment reference.
	 * @see #getPatternDistance()
	 * @generated
	 */
	void setPatternDistance(Distance value);

	/**
	 * Returns the value of the '<em><b>Pattern Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Duration</em>' containment reference.
	 * @see #setPatternDuration(Duration)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternDuration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getPatternDuration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternDuration <em>Pattern Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Duration</em>' containment reference.
	 * @see #getPatternDuration()
	 * @generated
	 */
	void setPatternDuration(Duration value);

	/**
	 * Returns the value of the '<em><b>Pattern Human Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Human Name</em>' containment reference.
	 * @see #setPatternHumanName(HumanName)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternHumanName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternHumanName' namespace='##targetNamespace'"
	 * @generated
	 */
	HumanName getPatternHumanName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternHumanName <em>Pattern Human Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Human Name</em>' containment reference.
	 * @see #getPatternHumanName()
	 * @generated
	 */
	void setPatternHumanName(HumanName value);

	/**
	 * Returns the value of the '<em><b>Pattern Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Identifier</em>' containment reference.
	 * @see #setPatternIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getPatternIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternIdentifier <em>Pattern Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Identifier</em>' containment reference.
	 * @see #getPatternIdentifier()
	 * @generated
	 */
	void setPatternIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Pattern Money</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Money</em>' containment reference.
	 * @see #setPatternMoney(Money)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternMoney()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternMoney' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getPatternMoney();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternMoney <em>Pattern Money</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Money</em>' containment reference.
	 * @see #getPatternMoney()
	 * @generated
	 */
	void setPatternMoney(Money value);

	/**
	 * Returns the value of the '<em><b>Pattern Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Period</em>' containment reference.
	 * @see #setPatternPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPatternPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternPeriod <em>Pattern Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Period</em>' containment reference.
	 * @see #getPatternPeriod()
	 * @generated
	 */
	void setPatternPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Pattern Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Quantity</em>' containment reference.
	 * @see #setPatternQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getPatternQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternQuantity <em>Pattern Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Quantity</em>' containment reference.
	 * @see #getPatternQuantity()
	 * @generated
	 */
	void setPatternQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Pattern Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Range</em>' containment reference.
	 * @see #setPatternRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getPatternRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternRange <em>Pattern Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Range</em>' containment reference.
	 * @see #getPatternRange()
	 * @generated
	 */
	void setPatternRange(Range value);

	/**
	 * Returns the value of the '<em><b>Pattern Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Ratio</em>' containment reference.
	 * @see #setPatternRatio(Ratio)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternRatio()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternRatio' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getPatternRatio();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternRatio <em>Pattern Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Ratio</em>' containment reference.
	 * @see #getPatternRatio()
	 * @generated
	 */
	void setPatternRatio(Ratio value);

	/**
	 * Returns the value of the '<em><b>Pattern Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Reference</em>' containment reference.
	 * @see #setPatternReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatternReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternReference <em>Pattern Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Reference</em>' containment reference.
	 * @see #getPatternReference()
	 * @generated
	 */
	void setPatternReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Pattern Sampled Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Sampled Data</em>' containment reference.
	 * @see #setPatternSampledData(SampledData)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternSampledData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternSampledData' namespace='##targetNamespace'"
	 * @generated
	 */
	SampledData getPatternSampledData();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternSampledData <em>Pattern Sampled Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Sampled Data</em>' containment reference.
	 * @see #getPatternSampledData()
	 * @generated
	 */
	void setPatternSampledData(SampledData value);

	/**
	 * Returns the value of the '<em><b>Pattern Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Signature</em>' containment reference.
	 * @see #setPatternSignature(Signature)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternSignature()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternSignature' namespace='##targetNamespace'"
	 * @generated
	 */
	Signature getPatternSignature();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternSignature <em>Pattern Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Signature</em>' containment reference.
	 * @see #getPatternSignature()
	 * @generated
	 */
	void setPatternSignature(Signature value);

	/**
	 * Returns the value of the '<em><b>Pattern Timing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Timing</em>' containment reference.
	 * @see #setPatternTiming(Timing)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternTiming()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternTiming' namespace='##targetNamespace'"
	 * @generated
	 */
	Timing getPatternTiming();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternTiming <em>Pattern Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Timing</em>' containment reference.
	 * @see #getPatternTiming()
	 * @generated
	 */
	void setPatternTiming(Timing value);

	/**
	 * Returns the value of the '<em><b>Pattern Contact Detail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Contact Detail</em>' containment reference.
	 * @see #setPatternContactDetail(ContactDetail)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternContactDetail()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternContactDetail' namespace='##targetNamespace'"
	 * @generated
	 */
	ContactDetail getPatternContactDetail();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternContactDetail <em>Pattern Contact Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Contact Detail</em>' containment reference.
	 * @see #getPatternContactDetail()
	 * @generated
	 */
	void setPatternContactDetail(ContactDetail value);

	/**
	 * Returns the value of the '<em><b>Pattern Contributor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Contributor</em>' containment reference.
	 * @see #setPatternContributor(Contributor)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternContributor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternContributor' namespace='##targetNamespace'"
	 * @generated
	 */
	Contributor getPatternContributor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternContributor <em>Pattern Contributor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Contributor</em>' containment reference.
	 * @see #getPatternContributor()
	 * @generated
	 */
	void setPatternContributor(Contributor value);

	/**
	 * Returns the value of the '<em><b>Pattern Data Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Data Requirement</em>' containment reference.
	 * @see #setPatternDataRequirement(DataRequirement)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternDataRequirement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternDataRequirement' namespace='##targetNamespace'"
	 * @generated
	 */
	DataRequirement getPatternDataRequirement();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternDataRequirement <em>Pattern Data Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Data Requirement</em>' containment reference.
	 * @see #getPatternDataRequirement()
	 * @generated
	 */
	void setPatternDataRequirement(DataRequirement value);

	/**
	 * Returns the value of the '<em><b>Pattern Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Expression</em>' containment reference.
	 * @see #setPatternExpression(Expression)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternExpression()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternExpression' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getPatternExpression();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternExpression <em>Pattern Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Expression</em>' containment reference.
	 * @see #getPatternExpression()
	 * @generated
	 */
	void setPatternExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Pattern Parameter Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Parameter Definition</em>' containment reference.
	 * @see #setPatternParameterDefinition(ParameterDefinition)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternParameterDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternParameterDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	ParameterDefinition getPatternParameterDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternParameterDefinition <em>Pattern Parameter Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Parameter Definition</em>' containment reference.
	 * @see #getPatternParameterDefinition()
	 * @generated
	 */
	void setPatternParameterDefinition(ParameterDefinition value);

	/**
	 * Returns the value of the '<em><b>Pattern Related Artifact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Related Artifact</em>' containment reference.
	 * @see #setPatternRelatedArtifact(RelatedArtifact)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternRelatedArtifact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternRelatedArtifact' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatedArtifact getPatternRelatedArtifact();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternRelatedArtifact <em>Pattern Related Artifact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Related Artifact</em>' containment reference.
	 * @see #getPatternRelatedArtifact()
	 * @generated
	 */
	void setPatternRelatedArtifact(RelatedArtifact value);

	/**
	 * Returns the value of the '<em><b>Pattern Trigger Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Trigger Definition</em>' containment reference.
	 * @see #setPatternTriggerDefinition(TriggerDefinition)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternTriggerDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternTriggerDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	TriggerDefinition getPatternTriggerDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternTriggerDefinition <em>Pattern Trigger Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Trigger Definition</em>' containment reference.
	 * @see #getPatternTriggerDefinition()
	 * @generated
	 */
	void setPatternTriggerDefinition(TriggerDefinition value);

	/**
	 * Returns the value of the '<em><b>Pattern Usage Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Usage Context</em>' containment reference.
	 * @see #setPatternUsageContext(UsageContext)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternUsageContext()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternUsageContext' namespace='##targetNamespace'"
	 * @generated
	 */
	UsageContext getPatternUsageContext();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternUsageContext <em>Pattern Usage Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Usage Context</em>' containment reference.
	 * @see #getPatternUsageContext()
	 * @generated
	 */
	void setPatternUsageContext(UsageContext value);

	/**
	 * Returns the value of the '<em><b>Pattern Dosage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Dosage</em>' containment reference.
	 * @see #setPatternDosage(Dosage)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternDosage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternDosage' namespace='##targetNamespace'"
	 * @generated
	 */
	Dosage getPatternDosage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternDosage <em>Pattern Dosage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Dosage</em>' containment reference.
	 * @see #getPatternDosage()
	 * @generated
	 */
	void setPatternDosage(Dosage value);

	/**
	 * Returns the value of the '<em><b>Pattern Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a value that the value in the instance SHALL follow - that is, any value in the pattern must be found in the instance. Other additional values may be found too. This is effectively constraint by example.  
	 * 
	 * When pattern[x] is used to constrain a primitive, it means that the value provided in the pattern[x] must match the instance value exactly.
	 * 
	 * When pattern[x] is used to constrain an array, it means that each element provided in the pattern[x] array must (recursively) match at least one element from the instance array.
	 * 
	 * When pattern[x] is used to constrain a complex object, it means that each property in the pattern must be present in the complex object, and its value must recursively match -- i.e.,
	 * 
	 * 1. If primitive: it must match exactly the pattern value
	 * 2. If a complex object: it must match (recursively) the pattern value
	 * 3. If an array: it must match (recursively) the pattern value. (choose any one of the elements, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern Meta</em>' containment reference.
	 * @see #setPatternMeta(Meta)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternMeta()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternMeta' namespace='##targetNamespace'"
	 * @generated
	 */
	Meta getPatternMeta();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternMeta <em>Pattern Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Meta</em>' containment reference.
	 * @see #getPatternMeta()
	 * @generated
	 */
	void setPatternMeta(Meta value);

	/**
	 * Returns the value of the '<em><b>Example</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ElementDefinitionExample}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A sample value for this element demonstrating the type of information that would typically be found in the element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Example</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_Example()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='example' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ElementDefinitionExample> getExample();

	/**
	 * Returns the value of the '<em><b>Min Value Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity. (choose any one of minValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Value Date</em>' containment reference.
	 * @see #setMinValueDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MinValueDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minValueDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getMinValueDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMinValueDate <em>Min Value Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value Date</em>' containment reference.
	 * @see #getMinValueDate()
	 * @generated
	 */
	void setMinValueDate(Date value);

	/**
	 * Returns the value of the '<em><b>Min Value Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity. (choose any one of minValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Value Date Time</em>' containment reference.
	 * @see #setMinValueDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MinValueDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minValueDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getMinValueDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMinValueDateTime <em>Min Value Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value Date Time</em>' containment reference.
	 * @see #getMinValueDateTime()
	 * @generated
	 */
	void setMinValueDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Min Value Instant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity. (choose any one of minValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Value Instant</em>' containment reference.
	 * @see #setMinValueInstant(Instant)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MinValueInstant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minValueInstant' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getMinValueInstant();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMinValueInstant <em>Min Value Instant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value Instant</em>' containment reference.
	 * @see #getMinValueInstant()
	 * @generated
	 */
	void setMinValueInstant(Instant value);

	/**
	 * Returns the value of the '<em><b>Min Value Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity. (choose any one of minValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Value Time</em>' containment reference.
	 * @see #setMinValueTime(Time)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MinValueTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minValueTime' namespace='##targetNamespace'"
	 * @generated
	 */
	Time getMinValueTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMinValueTime <em>Min Value Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value Time</em>' containment reference.
	 * @see #getMinValueTime()
	 * @generated
	 */
	void setMinValueTime(Time value);

	/**
	 * Returns the value of the '<em><b>Min Value Decimal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity. (choose any one of minValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Value Decimal</em>' containment reference.
	 * @see #setMinValueDecimal(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MinValueDecimal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minValueDecimal' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getMinValueDecimal();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMinValueDecimal <em>Min Value Decimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value Decimal</em>' containment reference.
	 * @see #getMinValueDecimal()
	 * @generated
	 */
	void setMinValueDecimal(Decimal value);

	/**
	 * Returns the value of the '<em><b>Min Value Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity. (choose any one of minValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Value Integer</em>' containment reference.
	 * @see #setMinValueInteger(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MinValueInteger()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minValueInteger' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getMinValueInteger();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMinValueInteger <em>Min Value Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value Integer</em>' containment reference.
	 * @see #getMinValueInteger()
	 * @generated
	 */
	void setMinValueInteger(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Min Value Positive Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity. (choose any one of minValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Value Positive Int</em>' containment reference.
	 * @see #setMinValuePositiveInt(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MinValuePositiveInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minValuePositiveInt' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getMinValuePositiveInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMinValuePositiveInt <em>Min Value Positive Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value Positive Int</em>' containment reference.
	 * @see #getMinValuePositiveInt()
	 * @generated
	 */
	void setMinValuePositiveInt(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Min Value Unsigned Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity. (choose any one of minValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Value Unsigned Int</em>' containment reference.
	 * @see #setMinValueUnsignedInt(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MinValueUnsignedInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minValueUnsignedInt' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getMinValueUnsignedInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMinValueUnsignedInt <em>Min Value Unsigned Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value Unsigned Int</em>' containment reference.
	 * @see #getMinValueUnsignedInt()
	 * @generated
	 */
	void setMinValueUnsignedInt(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Min Value Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity. (choose any one of minValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Value Quantity</em>' containment reference.
	 * @see #setMinValueQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MinValueQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minValueQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getMinValueQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMinValueQuantity <em>Min Value Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value Quantity</em>' containment reference.
	 * @see #getMinValueQuantity()
	 * @generated
	 */
	void setMinValueQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Max Value Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity. (choose any one of maxValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Value Date</em>' containment reference.
	 * @see #setMaxValueDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MaxValueDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxValueDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getMaxValueDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMaxValueDate <em>Max Value Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value Date</em>' containment reference.
	 * @see #getMaxValueDate()
	 * @generated
	 */
	void setMaxValueDate(Date value);

	/**
	 * Returns the value of the '<em><b>Max Value Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity. (choose any one of maxValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Value Date Time</em>' containment reference.
	 * @see #setMaxValueDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MaxValueDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxValueDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getMaxValueDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMaxValueDateTime <em>Max Value Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value Date Time</em>' containment reference.
	 * @see #getMaxValueDateTime()
	 * @generated
	 */
	void setMaxValueDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Max Value Instant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity. (choose any one of maxValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Value Instant</em>' containment reference.
	 * @see #setMaxValueInstant(Instant)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MaxValueInstant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxValueInstant' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getMaxValueInstant();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMaxValueInstant <em>Max Value Instant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value Instant</em>' containment reference.
	 * @see #getMaxValueInstant()
	 * @generated
	 */
	void setMaxValueInstant(Instant value);

	/**
	 * Returns the value of the '<em><b>Max Value Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity. (choose any one of maxValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Value Time</em>' containment reference.
	 * @see #setMaxValueTime(Time)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MaxValueTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxValueTime' namespace='##targetNamespace'"
	 * @generated
	 */
	Time getMaxValueTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMaxValueTime <em>Max Value Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value Time</em>' containment reference.
	 * @see #getMaxValueTime()
	 * @generated
	 */
	void setMaxValueTime(Time value);

	/**
	 * Returns the value of the '<em><b>Max Value Decimal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity. (choose any one of maxValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Value Decimal</em>' containment reference.
	 * @see #setMaxValueDecimal(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MaxValueDecimal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxValueDecimal' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getMaxValueDecimal();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMaxValueDecimal <em>Max Value Decimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value Decimal</em>' containment reference.
	 * @see #getMaxValueDecimal()
	 * @generated
	 */
	void setMaxValueDecimal(Decimal value);

	/**
	 * Returns the value of the '<em><b>Max Value Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity. (choose any one of maxValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Value Integer</em>' containment reference.
	 * @see #setMaxValueInteger(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MaxValueInteger()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxValueInteger' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getMaxValueInteger();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMaxValueInteger <em>Max Value Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value Integer</em>' containment reference.
	 * @see #getMaxValueInteger()
	 * @generated
	 */
	void setMaxValueInteger(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Max Value Positive Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity. (choose any one of maxValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Value Positive Int</em>' containment reference.
	 * @see #setMaxValuePositiveInt(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MaxValuePositiveInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxValuePositiveInt' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getMaxValuePositiveInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMaxValuePositiveInt <em>Max Value Positive Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value Positive Int</em>' containment reference.
	 * @see #getMaxValuePositiveInt()
	 * @generated
	 */
	void setMaxValuePositiveInt(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Max Value Unsigned Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity. (choose any one of maxValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Value Unsigned Int</em>' containment reference.
	 * @see #setMaxValueUnsignedInt(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MaxValueUnsignedInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxValueUnsignedInt' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getMaxValueUnsignedInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMaxValueUnsignedInt <em>Max Value Unsigned Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value Unsigned Int</em>' containment reference.
	 * @see #getMaxValueUnsignedInt()
	 * @generated
	 */
	void setMaxValueUnsignedInt(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Max Value Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum allowed value for the element. The value is inclusive. This is allowed for the types date, dateTime, instant, time, decimal, integer, and Quantity. (choose any one of maxValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Value Quantity</em>' containment reference.
	 * @see #setMaxValueQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MaxValueQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxValueQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getMaxValueQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMaxValueQuantity <em>Max Value Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value Quantity</em>' containment reference.
	 * @see #getMaxValueQuantity()
	 * @generated
	 */
	void setMaxValueQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Max Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the maximum length in characters that is permitted to be present in conformant instances and which is expected to be supported by conformant consumers that support the element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Length</em>' containment reference.
	 * @see #setMaxLength(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MaxLength()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxLength' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getMaxLength();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMaxLength <em>Max Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length</em>' containment reference.
	 * @see #getMaxLength()
	 * @generated
	 */
	void setMaxLength(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Id}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to an invariant that may make additional statements about the cardinality or value in the instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_Condition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='condition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Id> getCondition();

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ElementDefinitionConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Formal constraints such as co-occurrence and other constraints that can be computationally evaluated within the context of the instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_Constraint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='constraint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ElementDefinitionConstraint> getConstraint();

	/**
	 * Returns the value of the '<em><b>Must Support</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, implementations that produce or consume resources SHALL provide "support" for the element in some meaningful way.  If false, the element may be ignored and not supported. If false, whether to populate or use the data element in any way is at the discretion of the implementation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Must Support</em>' containment reference.
	 * @see #setMustSupport(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MustSupport()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mustSupport' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getMustSupport();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMustSupport <em>Must Support</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Must Support</em>' containment reference.
	 * @see #getMustSupport()
	 * @generated
	 */
	void setMustSupport(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Modifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, the value of this element affects the interpretation of the element or resource that contains it, and the value of the element cannot be ignored. Typically, this is used for status, negation and qualification codes. The effect of this is that the element cannot be ignored by systems: they SHALL either recognize the element and process it, and/or a pre-determination has been made that it is not relevant to their particular system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Modifier</em>' containment reference.
	 * @see #setIsModifier(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_IsModifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='isModifier' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getIsModifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getIsModifier <em>Is Modifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Modifier</em>' containment reference.
	 * @see #getIsModifier()
	 * @generated
	 */
	void setIsModifier(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Modifier Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Explains how that element affects the interpretation of the resource or element that contains it.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Modifier Reason</em>' containment reference.
	 * @see #setIsModifierReason(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_IsModifierReason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='isModifierReason' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getIsModifierReason();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getIsModifierReason <em>Is Modifier Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Modifier Reason</em>' containment reference.
	 * @see #getIsModifierReason()
	 * @generated
	 */
	void setIsModifierReason(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Is Summary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the element should be included if a client requests a search with the parameter _summary=true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Summary</em>' containment reference.
	 * @see #setIsSummary(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_IsSummary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='isSummary' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getIsSummary();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getIsSummary <em>Is Summary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Summary</em>' containment reference.
	 * @see #getIsSummary()
	 * @generated
	 */
	void setIsSummary(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Binds to a value set if this element is coded (code, Coding, CodeableConcept, Quantity), or the data types (string, uri).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binding</em>' containment reference.
	 * @see #setBinding(ElementDefinitionBinding)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_Binding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='binding' namespace='##targetNamespace'"
	 * @generated
	 */
	ElementDefinitionBinding getBinding();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getBinding <em>Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding</em>' containment reference.
	 * @see #getBinding()
	 * @generated
	 */
	void setBinding(ElementDefinitionBinding value);

	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ElementDefinitionMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a concept from an external specification that roughly corresponds to this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mapping</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_Mapping()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mapping' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ElementDefinitionMapping> getMapping();

} // ElementDefinition
