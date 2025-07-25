/**
 */
package org.hl7.fhir.impl;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.hl7.fhir.Account;
import org.hl7.fhir.AccountCoverage;
import org.hl7.fhir.AccountGuarantor;
import org.hl7.fhir.AccountStatus;
import org.hl7.fhir.AccountStatusList;
import org.hl7.fhir.ActionCardinalityBehavior;
import org.hl7.fhir.ActionCardinalityBehaviorList;
import org.hl7.fhir.ActionConditionKind;
import org.hl7.fhir.ActionConditionKindList;
import org.hl7.fhir.ActionGroupingBehavior;
import org.hl7.fhir.ActionGroupingBehaviorList;
import org.hl7.fhir.ActionParticipantType;
import org.hl7.fhir.ActionParticipantTypeList;
import org.hl7.fhir.ActionPrecheckBehavior;
import org.hl7.fhir.ActionPrecheckBehaviorList;
import org.hl7.fhir.ActionRelationshipType;
import org.hl7.fhir.ActionRelationshipTypeList;
import org.hl7.fhir.ActionRequiredBehavior;
import org.hl7.fhir.ActionRequiredBehaviorList;
import org.hl7.fhir.ActionSelectionBehavior;
import org.hl7.fhir.ActionSelectionBehaviorList;
import org.hl7.fhir.ActivityDefinition;
import org.hl7.fhir.ActivityDefinitionDynamicValue;
import org.hl7.fhir.ActivityDefinitionParticipant;
import org.hl7.fhir.Address;
import org.hl7.fhir.AddressType;
import org.hl7.fhir.AddressTypeList;
import org.hl7.fhir.AddressUse;
import org.hl7.fhir.AddressUseList;
import org.hl7.fhir.AdministrativeGender;
import org.hl7.fhir.AdministrativeGenderList;
import org.hl7.fhir.AdverseEvent;
import org.hl7.fhir.AdverseEventActuality;
import org.hl7.fhir.AdverseEventActualityList;
import org.hl7.fhir.AdverseEventCausality;
import org.hl7.fhir.AdverseEventSuspectEntity;
import org.hl7.fhir.Age;
import org.hl7.fhir.AggregationMode;
import org.hl7.fhir.AggregationModeList;
import org.hl7.fhir.AllergyIntolerance;
import org.hl7.fhir.AllergyIntoleranceCategory;
import org.hl7.fhir.AllergyIntoleranceCategoryList;
import org.hl7.fhir.AllergyIntoleranceCriticality;
import org.hl7.fhir.AllergyIntoleranceCriticalityList;
import org.hl7.fhir.AllergyIntoleranceReaction;
import org.hl7.fhir.AllergyIntoleranceSeverity;
import org.hl7.fhir.AllergyIntoleranceSeverityList;
import org.hl7.fhir.AllergyIntoleranceType;
import org.hl7.fhir.AllergyIntoleranceTypeList;
import org.hl7.fhir.Annotation;
import org.hl7.fhir.Appointment;
import org.hl7.fhir.AppointmentParticipant;
import org.hl7.fhir.AppointmentResponse;
import org.hl7.fhir.AppointmentStatus;
import org.hl7.fhir.AppointmentStatusList;
import org.hl7.fhir.AssertionDirectionType;
import org.hl7.fhir.AssertionDirectionTypeList;
import org.hl7.fhir.AssertionOperatorType;
import org.hl7.fhir.AssertionOperatorTypeList;
import org.hl7.fhir.AssertionResponseTypes;
import org.hl7.fhir.AssertionResponseTypesList;
import org.hl7.fhir.Attachment;
import org.hl7.fhir.AuditEvent;
import org.hl7.fhir.AuditEventAction;
import org.hl7.fhir.AuditEventActionList;
import org.hl7.fhir.AuditEventAgent;
import org.hl7.fhir.AuditEventAgentNetworkType;
import org.hl7.fhir.AuditEventAgentNetworkTypeList;
import org.hl7.fhir.AuditEventDetail;
import org.hl7.fhir.AuditEventEntity;
import org.hl7.fhir.AuditEventNetwork;
import org.hl7.fhir.AuditEventOutcome;
import org.hl7.fhir.AuditEventOutcomeList;
import org.hl7.fhir.AuditEventSource;
import org.hl7.fhir.BackboneElement;
import org.hl7.fhir.Base64Binary;
import org.hl7.fhir.Basic;
import org.hl7.fhir.Binary;
import org.hl7.fhir.BindingStrength;
import org.hl7.fhir.BindingStrengthList;
import org.hl7.fhir.BiologicallyDerivedProduct;
import org.hl7.fhir.BiologicallyDerivedProductCategory;
import org.hl7.fhir.BiologicallyDerivedProductCategoryList;
import org.hl7.fhir.BiologicallyDerivedProductCollection;
import org.hl7.fhir.BiologicallyDerivedProductManipulation;
import org.hl7.fhir.BiologicallyDerivedProductProcessing;
import org.hl7.fhir.BiologicallyDerivedProductStatus;
import org.hl7.fhir.BiologicallyDerivedProductStatusList;
import org.hl7.fhir.BiologicallyDerivedProductStorage;
import org.hl7.fhir.BiologicallyDerivedProductStorageScale;
import org.hl7.fhir.BiologicallyDerivedProductStorageScaleList;
import org.hl7.fhir.BodyStructure;
import org.hl7.fhir.Bundle;
import org.hl7.fhir.BundleEntry;
import org.hl7.fhir.BundleLink;
import org.hl7.fhir.BundleRequest;
import org.hl7.fhir.BundleResponse;
import org.hl7.fhir.BundleSearch;
import org.hl7.fhir.BundleType;
import org.hl7.fhir.BundleTypeList;
import org.hl7.fhir.Canonical;
import org.hl7.fhir.CapabilityStatement;
import org.hl7.fhir.CapabilityStatementDocument;
import org.hl7.fhir.CapabilityStatementEndpoint;
import org.hl7.fhir.CapabilityStatementImplementation;
import org.hl7.fhir.CapabilityStatementInteraction;
import org.hl7.fhir.CapabilityStatementInteraction1;
import org.hl7.fhir.CapabilityStatementKind;
import org.hl7.fhir.CapabilityStatementKindList;
import org.hl7.fhir.CapabilityStatementMessaging;
import org.hl7.fhir.CapabilityStatementOperation;
import org.hl7.fhir.CapabilityStatementResource;
import org.hl7.fhir.CapabilityStatementRest;
import org.hl7.fhir.CapabilityStatementSearchParam;
import org.hl7.fhir.CapabilityStatementSecurity;
import org.hl7.fhir.CapabilityStatementSoftware;
import org.hl7.fhir.CapabilityStatementSupportedMessage;
import org.hl7.fhir.CarePlan;
import org.hl7.fhir.CarePlanActivity;
import org.hl7.fhir.CarePlanActivityKind;
import org.hl7.fhir.CarePlanActivityKindList;
import org.hl7.fhir.CarePlanActivityStatus;
import org.hl7.fhir.CarePlanActivityStatusList;
import org.hl7.fhir.CarePlanDetail;
import org.hl7.fhir.CarePlanIntent;
import org.hl7.fhir.CarePlanIntentList;
import org.hl7.fhir.CareTeam;
import org.hl7.fhir.CareTeamParticipant;
import org.hl7.fhir.CareTeamStatus;
import org.hl7.fhir.CareTeamStatusList;
import org.hl7.fhir.CatalogEntry;
import org.hl7.fhir.CatalogEntryRelatedEntry;
import org.hl7.fhir.CatalogEntryRelationType;
import org.hl7.fhir.CatalogEntryRelationTypeList;
import org.hl7.fhir.ChargeItem;
import org.hl7.fhir.ChargeItemDefinition;
import org.hl7.fhir.ChargeItemDefinitionApplicability;
import org.hl7.fhir.ChargeItemDefinitionPriceComponent;
import org.hl7.fhir.ChargeItemDefinitionPropertyGroup;
import org.hl7.fhir.ChargeItemPerformer;
import org.hl7.fhir.ChargeItemStatus;
import org.hl7.fhir.ChargeItemStatusList;
import org.hl7.fhir.Claim;
import org.hl7.fhir.ClaimAccident;
import org.hl7.fhir.ClaimCareTeam;
import org.hl7.fhir.ClaimDetail;
import org.hl7.fhir.ClaimDiagnosis;
import org.hl7.fhir.ClaimInsurance;
import org.hl7.fhir.ClaimItem;
import org.hl7.fhir.ClaimPayee;
import org.hl7.fhir.ClaimProcedure;
import org.hl7.fhir.ClaimProcessingCodes;
import org.hl7.fhir.ClaimProcessingCodesList;
import org.hl7.fhir.ClaimRelated;
import org.hl7.fhir.ClaimResponse;
import org.hl7.fhir.ClaimResponseAddItem;
import org.hl7.fhir.ClaimResponseAdjudication;
import org.hl7.fhir.ClaimResponseDetail;
import org.hl7.fhir.ClaimResponseDetail1;
import org.hl7.fhir.ClaimResponseError;
import org.hl7.fhir.ClaimResponseInsurance;
import org.hl7.fhir.ClaimResponseItem;
import org.hl7.fhir.ClaimResponsePayment;
import org.hl7.fhir.ClaimResponseProcessNote;
import org.hl7.fhir.ClaimResponseSubDetail;
import org.hl7.fhir.ClaimResponseSubDetail1;
import org.hl7.fhir.ClaimResponseTotal;
import org.hl7.fhir.ClaimSubDetail;
import org.hl7.fhir.ClaimSupportingInfo;
import org.hl7.fhir.ClinicalImpression;
import org.hl7.fhir.ClinicalImpressionFinding;
import org.hl7.fhir.ClinicalImpressionInvestigation;
import org.hl7.fhir.ClinicalImpressionStatus;
import org.hl7.fhir.ClinicalImpressionStatusList;
import org.hl7.fhir.Code;
import org.hl7.fhir.CodeSearchSupport;
import org.hl7.fhir.CodeSearchSupportList;
import org.hl7.fhir.CodeSystem;
import org.hl7.fhir.CodeSystemConcept;
import org.hl7.fhir.CodeSystemContentMode;
import org.hl7.fhir.CodeSystemContentModeList;
import org.hl7.fhir.CodeSystemDesignation;
import org.hl7.fhir.CodeSystemFilter;
import org.hl7.fhir.CodeSystemHierarchyMeaning;
import org.hl7.fhir.CodeSystemHierarchyMeaningList;
import org.hl7.fhir.CodeSystemProperty;
import org.hl7.fhir.CodeSystemProperty1;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Coding;
import org.hl7.fhir.Communication;
import org.hl7.fhir.CommunicationPayload;
import org.hl7.fhir.CommunicationRequest;
import org.hl7.fhir.CommunicationRequestPayload;
import org.hl7.fhir.CompartmentDefinition;
import org.hl7.fhir.CompartmentDefinitionResource;
import org.hl7.fhir.CompartmentType;
import org.hl7.fhir.CompartmentTypeList;
import org.hl7.fhir.Composition;
import org.hl7.fhir.CompositionAttestationMode;
import org.hl7.fhir.CompositionAttestationModeList;
import org.hl7.fhir.CompositionAttester;
import org.hl7.fhir.CompositionEvent;
import org.hl7.fhir.CompositionRelatesTo;
import org.hl7.fhir.CompositionSection;
import org.hl7.fhir.CompositionStatus;
import org.hl7.fhir.CompositionStatusList;
import org.hl7.fhir.ConceptMap;
import org.hl7.fhir.ConceptMapDependsOn;
import org.hl7.fhir.ConceptMapElement;
import org.hl7.fhir.ConceptMapEquivalence;
import org.hl7.fhir.ConceptMapEquivalenceList;
import org.hl7.fhir.ConceptMapGroup;
import org.hl7.fhir.ConceptMapGroupUnmappedMode;
import org.hl7.fhir.ConceptMapGroupUnmappedModeList;
import org.hl7.fhir.ConceptMapTarget;
import org.hl7.fhir.ConceptMapUnmapped;
import org.hl7.fhir.Condition;
import org.hl7.fhir.ConditionEvidence;
import org.hl7.fhir.ConditionStage;
import org.hl7.fhir.ConditionalDeleteStatus;
import org.hl7.fhir.ConditionalDeleteStatusList;
import org.hl7.fhir.ConditionalReadStatus;
import org.hl7.fhir.ConditionalReadStatusList;
import org.hl7.fhir.Consent;
import org.hl7.fhir.ConsentActor;
import org.hl7.fhir.ConsentData;
import org.hl7.fhir.ConsentDataMeaning;
import org.hl7.fhir.ConsentDataMeaningList;
import org.hl7.fhir.ConsentPolicy;
import org.hl7.fhir.ConsentProvision;
import org.hl7.fhir.ConsentProvisionType;
import org.hl7.fhir.ConsentProvisionTypeList;
import org.hl7.fhir.ConsentState;
import org.hl7.fhir.ConsentStateList;
import org.hl7.fhir.ConsentVerification;
import org.hl7.fhir.ConstraintSeverity;
import org.hl7.fhir.ConstraintSeverityList;
import org.hl7.fhir.ContactDetail;
import org.hl7.fhir.ContactPoint;
import org.hl7.fhir.ContactPointSystem;
import org.hl7.fhir.ContactPointSystemList;
import org.hl7.fhir.ContactPointUse;
import org.hl7.fhir.ContactPointUseList;
import org.hl7.fhir.Contract;
import org.hl7.fhir.ContractAction;
import org.hl7.fhir.ContractAnswer;
import org.hl7.fhir.ContractAsset;
import org.hl7.fhir.ContractContentDefinition;
import org.hl7.fhir.ContractContext;
import org.hl7.fhir.ContractFriendly;
import org.hl7.fhir.ContractLegal;
import org.hl7.fhir.ContractOffer;
import org.hl7.fhir.ContractParty;
import org.hl7.fhir.ContractResourcePublicationStatusCodes;
import org.hl7.fhir.ContractResourcePublicationStatusCodesList;
import org.hl7.fhir.ContractResourceStatusCodes;
import org.hl7.fhir.ContractResourceStatusCodesList;
import org.hl7.fhir.ContractRule;
import org.hl7.fhir.ContractSecurityLabel;
import org.hl7.fhir.ContractSigner;
import org.hl7.fhir.ContractSubject;
import org.hl7.fhir.ContractTerm;
import org.hl7.fhir.ContractValuedItem;
import org.hl7.fhir.Contributor;
import org.hl7.fhir.ContributorType;
import org.hl7.fhir.ContributorTypeList;
import org.hl7.fhir.Count;
import org.hl7.fhir.Coverage;
import org.hl7.fhir.CoverageClass;
import org.hl7.fhir.CoverageCostToBeneficiary;
import org.hl7.fhir.CoverageEligibilityRequest;
import org.hl7.fhir.CoverageEligibilityRequestDiagnosis;
import org.hl7.fhir.CoverageEligibilityRequestInsurance;
import org.hl7.fhir.CoverageEligibilityRequestItem;
import org.hl7.fhir.CoverageEligibilityRequestSupportingInfo;
import org.hl7.fhir.CoverageEligibilityResponse;
import org.hl7.fhir.CoverageEligibilityResponseBenefit;
import org.hl7.fhir.CoverageEligibilityResponseError;
import org.hl7.fhir.CoverageEligibilityResponseInsurance;
import org.hl7.fhir.CoverageEligibilityResponseItem;
import org.hl7.fhir.CoverageException;
import org.hl7.fhir.DataRequirement;
import org.hl7.fhir.DataRequirementCodeFilter;
import org.hl7.fhir.DataRequirementDateFilter;
import org.hl7.fhir.DataRequirementSort;
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.DaysOfWeek;
import org.hl7.fhir.DaysOfWeekList;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.DetectedIssue;
import org.hl7.fhir.DetectedIssueEvidence;
import org.hl7.fhir.DetectedIssueMitigation;
import org.hl7.fhir.DetectedIssueSeverity;
import org.hl7.fhir.DetectedIssueSeverityList;
import org.hl7.fhir.Device;
import org.hl7.fhir.DeviceDefinition;
import org.hl7.fhir.DeviceDefinitionCapability;
import org.hl7.fhir.DeviceDefinitionDeviceName;
import org.hl7.fhir.DeviceDefinitionMaterial;
import org.hl7.fhir.DeviceDefinitionProperty;
import org.hl7.fhir.DeviceDefinitionSpecialization;
import org.hl7.fhir.DeviceDefinitionUdiDeviceIdentifier;
import org.hl7.fhir.DeviceDeviceName;
import org.hl7.fhir.DeviceMetric;
import org.hl7.fhir.DeviceMetricCalibration;
import org.hl7.fhir.DeviceMetricCalibrationState;
import org.hl7.fhir.DeviceMetricCalibrationStateList;
import org.hl7.fhir.DeviceMetricCalibrationType;
import org.hl7.fhir.DeviceMetricCalibrationTypeList;
import org.hl7.fhir.DeviceMetricCategory;
import org.hl7.fhir.DeviceMetricCategoryList;
import org.hl7.fhir.DeviceMetricColor;
import org.hl7.fhir.DeviceMetricColorList;
import org.hl7.fhir.DeviceMetricOperationalStatus;
import org.hl7.fhir.DeviceMetricOperationalStatusList;
import org.hl7.fhir.DeviceNameType;
import org.hl7.fhir.DeviceNameTypeList;
import org.hl7.fhir.DeviceProperty;
import org.hl7.fhir.DeviceRequest;
import org.hl7.fhir.DeviceRequestParameter;
import org.hl7.fhir.DeviceSpecialization;
import org.hl7.fhir.DeviceUdiCarrier;
import org.hl7.fhir.DeviceUseStatement;
import org.hl7.fhir.DeviceUseStatementStatus;
import org.hl7.fhir.DeviceUseStatementStatusList;
import org.hl7.fhir.DeviceVersion;
import org.hl7.fhir.DiagnosticReport;
import org.hl7.fhir.DiagnosticReportMedia;
import org.hl7.fhir.DiagnosticReportStatus;
import org.hl7.fhir.DiagnosticReportStatusList;
import org.hl7.fhir.DiscriminatorType;
import org.hl7.fhir.DiscriminatorTypeList;
import org.hl7.fhir.Distance;
import org.hl7.fhir.DocumentManifest;
import org.hl7.fhir.DocumentManifestRelated;
import org.hl7.fhir.DocumentMode;
import org.hl7.fhir.DocumentModeList;
import org.hl7.fhir.DocumentReference;
import org.hl7.fhir.DocumentReferenceContent;
import org.hl7.fhir.DocumentReferenceContext;
import org.hl7.fhir.DocumentReferenceRelatesTo;
import org.hl7.fhir.DocumentReferenceStatus;
import org.hl7.fhir.DocumentReferenceStatusList;
import org.hl7.fhir.DocumentRelationshipType;
import org.hl7.fhir.DocumentRelationshipTypeList;
import org.hl7.fhir.DocumentRoot;
import org.hl7.fhir.DomainResource;
import org.hl7.fhir.Dosage;
import org.hl7.fhir.DosageDoseAndRate;
import org.hl7.fhir.Duration;
import org.hl7.fhir.EffectEvidenceSynthesis;
import org.hl7.fhir.EffectEvidenceSynthesisCertainty;
import org.hl7.fhir.EffectEvidenceSynthesisCertaintySubcomponent;
import org.hl7.fhir.EffectEvidenceSynthesisEffectEstimate;
import org.hl7.fhir.EffectEvidenceSynthesisPrecisionEstimate;
import org.hl7.fhir.EffectEvidenceSynthesisResultsByExposure;
import org.hl7.fhir.EffectEvidenceSynthesisSampleSize;
import org.hl7.fhir.Element;
import org.hl7.fhir.ElementDefinition;
import org.hl7.fhir.ElementDefinitionBase;
import org.hl7.fhir.ElementDefinitionBinding;
import org.hl7.fhir.ElementDefinitionConstraint;
import org.hl7.fhir.ElementDefinitionDiscriminator;
import org.hl7.fhir.ElementDefinitionExample;
import org.hl7.fhir.ElementDefinitionMapping;
import org.hl7.fhir.ElementDefinitionSlicing;
import org.hl7.fhir.ElementDefinitionType;
import org.hl7.fhir.EligibilityRequestPurpose;
import org.hl7.fhir.EligibilityRequestPurposeList;
import org.hl7.fhir.EligibilityResponsePurpose;
import org.hl7.fhir.EligibilityResponsePurposeList;
import org.hl7.fhir.EnableWhenBehavior;
import org.hl7.fhir.EnableWhenBehaviorList;
import org.hl7.fhir.Encounter;
import org.hl7.fhir.EncounterClassHistory;
import org.hl7.fhir.EncounterDiagnosis;
import org.hl7.fhir.EncounterHospitalization;
import org.hl7.fhir.EncounterLocation;
import org.hl7.fhir.EncounterLocationStatus;
import org.hl7.fhir.EncounterLocationStatusList;
import org.hl7.fhir.EncounterParticipant;
import org.hl7.fhir.EncounterStatus;
import org.hl7.fhir.EncounterStatusHistory;
import org.hl7.fhir.EncounterStatusList;
import org.hl7.fhir.Endpoint;
import org.hl7.fhir.EndpointStatus;
import org.hl7.fhir.EndpointStatusList;
import org.hl7.fhir.EnrollmentRequest;
import org.hl7.fhir.EnrollmentResponse;
import org.hl7.fhir.EpisodeOfCare;
import org.hl7.fhir.EpisodeOfCareDiagnosis;
import org.hl7.fhir.EpisodeOfCareStatus;
import org.hl7.fhir.EpisodeOfCareStatusHistory;
import org.hl7.fhir.EpisodeOfCareStatusList;
import org.hl7.fhir.EventCapabilityMode;
import org.hl7.fhir.EventCapabilityModeList;
import org.hl7.fhir.EventDefinition;
import org.hl7.fhir.EventStatus;
import org.hl7.fhir.EventStatusList;
import org.hl7.fhir.EventTiming;
import org.hl7.fhir.EventTimingList;
import org.hl7.fhir.Evidence;
import org.hl7.fhir.EvidenceVariable;
import org.hl7.fhir.EvidenceVariableCharacteristic;
import org.hl7.fhir.EvidenceVariableType;
import org.hl7.fhir.EvidenceVariableTypeList;
import org.hl7.fhir.ExampleScenario;
import org.hl7.fhir.ExampleScenarioActor;
import org.hl7.fhir.ExampleScenarioActorType;
import org.hl7.fhir.ExampleScenarioActorTypeList;
import org.hl7.fhir.ExampleScenarioAlternative;
import org.hl7.fhir.ExampleScenarioContainedInstance;
import org.hl7.fhir.ExampleScenarioInstance;
import org.hl7.fhir.ExampleScenarioOperation;
import org.hl7.fhir.ExampleScenarioProcess;
import org.hl7.fhir.ExampleScenarioStep;
import org.hl7.fhir.ExampleScenarioVersion;
import org.hl7.fhir.ExplanationOfBenefit;
import org.hl7.fhir.ExplanationOfBenefitAccident;
import org.hl7.fhir.ExplanationOfBenefitAddItem;
import org.hl7.fhir.ExplanationOfBenefitAdjudication;
import org.hl7.fhir.ExplanationOfBenefitBenefitBalance;
import org.hl7.fhir.ExplanationOfBenefitCareTeam;
import org.hl7.fhir.ExplanationOfBenefitDetail;
import org.hl7.fhir.ExplanationOfBenefitDetail1;
import org.hl7.fhir.ExplanationOfBenefitDiagnosis;
import org.hl7.fhir.ExplanationOfBenefitFinancial;
import org.hl7.fhir.ExplanationOfBenefitInsurance;
import org.hl7.fhir.ExplanationOfBenefitItem;
import org.hl7.fhir.ExplanationOfBenefitPayee;
import org.hl7.fhir.ExplanationOfBenefitPayment;
import org.hl7.fhir.ExplanationOfBenefitProcedure;
import org.hl7.fhir.ExplanationOfBenefitProcessNote;
import org.hl7.fhir.ExplanationOfBenefitRelated;
import org.hl7.fhir.ExplanationOfBenefitStatus;
import org.hl7.fhir.ExplanationOfBenefitStatusList;
import org.hl7.fhir.ExplanationOfBenefitSubDetail;
import org.hl7.fhir.ExplanationOfBenefitSubDetail1;
import org.hl7.fhir.ExplanationOfBenefitSupportingInfo;
import org.hl7.fhir.ExplanationOfBenefitTotal;
import org.hl7.fhir.ExposureState;
import org.hl7.fhir.ExposureStateList;
import org.hl7.fhir.Expression;
import org.hl7.fhir.ExpressionLanguage;
import org.hl7.fhir.ExpressionLanguageList;
import org.hl7.fhir.Extension;
import org.hl7.fhir.ExtensionContextType;
import org.hl7.fhir.ExtensionContextTypeList;
import org.hl7.fhir.FHIRDeviceStatus;
import org.hl7.fhir.FHIRDeviceStatusList;
import org.hl7.fhir.FHIRSubstanceStatus;
import org.hl7.fhir.FHIRSubstanceStatusList;
import org.hl7.fhir.FHIRVersion;
import org.hl7.fhir.FHIRVersionList;
import org.hl7.fhir.FamilyHistoryStatus;
import org.hl7.fhir.FamilyHistoryStatusList;
import org.hl7.fhir.FamilyMemberHistory;
import org.hl7.fhir.FamilyMemberHistoryCondition;
import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.FilterOperator;
import org.hl7.fhir.FilterOperatorList;
import org.hl7.fhir.FinancialResourceStatusCodes;
import org.hl7.fhir.FinancialResourceStatusCodesList;
import org.hl7.fhir.Flag;
import org.hl7.fhir.FlagStatus;
import org.hl7.fhir.FlagStatusList;
import org.hl7.fhir.Goal;
import org.hl7.fhir.GoalLifecycleStatus;
import org.hl7.fhir.GoalLifecycleStatusList;
import org.hl7.fhir.GoalTarget;
import org.hl7.fhir.GraphCompartmentRule;
import org.hl7.fhir.GraphCompartmentRuleList;
import org.hl7.fhir.GraphCompartmentUse;
import org.hl7.fhir.GraphCompartmentUseList;
import org.hl7.fhir.GraphDefinition;
import org.hl7.fhir.GraphDefinitionCompartment;
import org.hl7.fhir.GraphDefinitionLink;
import org.hl7.fhir.GraphDefinitionTarget;
import org.hl7.fhir.Group;
import org.hl7.fhir.GroupCharacteristic;
import org.hl7.fhir.GroupMeasure;
import org.hl7.fhir.GroupMeasureList;
import org.hl7.fhir.GroupMember;
import org.hl7.fhir.GroupType;
import org.hl7.fhir.GroupTypeList;
import org.hl7.fhir.GuidanceResponse;
import org.hl7.fhir.GuidanceResponseStatus;
import org.hl7.fhir.GuidanceResponseStatusList;
import org.hl7.fhir.GuidePageGeneration;
import org.hl7.fhir.GuidePageGenerationList;
import org.hl7.fhir.GuideParameterCode;
import org.hl7.fhir.GuideParameterCodeList;
import org.hl7.fhir.HTTPVerb;
import org.hl7.fhir.HTTPVerbList;
import org.hl7.fhir.HealthcareService;
import org.hl7.fhir.HealthcareServiceAvailableTime;
import org.hl7.fhir.HealthcareServiceEligibility;
import org.hl7.fhir.HealthcareServiceNotAvailable;
import org.hl7.fhir.HumanName;
import org.hl7.fhir.Id;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.IdentifierUse;
import org.hl7.fhir.IdentifierUseList;
import org.hl7.fhir.IdentityAssuranceLevel;
import org.hl7.fhir.IdentityAssuranceLevelList;
import org.hl7.fhir.ImagingStudy;
import org.hl7.fhir.ImagingStudyInstance;
import org.hl7.fhir.ImagingStudyPerformer;
import org.hl7.fhir.ImagingStudySeries;
import org.hl7.fhir.ImagingStudyStatus;
import org.hl7.fhir.ImagingStudyStatusList;
import org.hl7.fhir.Immunization;
import org.hl7.fhir.ImmunizationEducation;
import org.hl7.fhir.ImmunizationEvaluation;
import org.hl7.fhir.ImmunizationEvaluationStatusCodes;
import org.hl7.fhir.ImmunizationEvaluationStatusCodesList;
import org.hl7.fhir.ImmunizationPerformer;
import org.hl7.fhir.ImmunizationProtocolApplied;
import org.hl7.fhir.ImmunizationReaction;
import org.hl7.fhir.ImmunizationRecommendation;
import org.hl7.fhir.ImmunizationRecommendationDateCriterion;
import org.hl7.fhir.ImmunizationRecommendationRecommendation;
import org.hl7.fhir.ImmunizationStatusCodes;
import org.hl7.fhir.ImmunizationStatusCodesList;
import org.hl7.fhir.ImplementationGuide;
import org.hl7.fhir.ImplementationGuideDefinition;
import org.hl7.fhir.ImplementationGuideDependsOn;
import org.hl7.fhir.ImplementationGuideGlobal;
import org.hl7.fhir.ImplementationGuideGrouping;
import org.hl7.fhir.ImplementationGuideManifest;
import org.hl7.fhir.ImplementationGuidePage;
import org.hl7.fhir.ImplementationGuidePage1;
import org.hl7.fhir.ImplementationGuideParameter;
import org.hl7.fhir.ImplementationGuideResource;
import org.hl7.fhir.ImplementationGuideResource1;
import org.hl7.fhir.ImplementationGuideTemplate;
import org.hl7.fhir.Instant;
import org.hl7.fhir.InsurancePlan;
import org.hl7.fhir.InsurancePlanBenefit;
import org.hl7.fhir.InsurancePlanBenefit1;
import org.hl7.fhir.InsurancePlanContact;
import org.hl7.fhir.InsurancePlanCost;
import org.hl7.fhir.InsurancePlanCoverage;
import org.hl7.fhir.InsurancePlanGeneralCost;
import org.hl7.fhir.InsurancePlanLimit;
import org.hl7.fhir.InsurancePlanPlan;
import org.hl7.fhir.InsurancePlanSpecificCost;
import org.hl7.fhir.Invoice;
import org.hl7.fhir.InvoiceLineItem;
import org.hl7.fhir.InvoiceParticipant;
import org.hl7.fhir.InvoicePriceComponent;
import org.hl7.fhir.InvoicePriceComponentType;
import org.hl7.fhir.InvoicePriceComponentTypeList;
import org.hl7.fhir.InvoiceStatus;
import org.hl7.fhir.InvoiceStatusList;
import org.hl7.fhir.IssueSeverity;
import org.hl7.fhir.IssueSeverityList;
import org.hl7.fhir.IssueType;
import org.hl7.fhir.IssueTypeList;
import org.hl7.fhir.Library;
import org.hl7.fhir.LinkType;
import org.hl7.fhir.LinkTypeList;
import org.hl7.fhir.Linkage;
import org.hl7.fhir.LinkageItem;
import org.hl7.fhir.LinkageType;
import org.hl7.fhir.LinkageTypeList;
import org.hl7.fhir.List;
import org.hl7.fhir.ListEntry;
import org.hl7.fhir.ListMode;
import org.hl7.fhir.ListModeList;
import org.hl7.fhir.ListStatus;
import org.hl7.fhir.ListStatusList;
import org.hl7.fhir.Location;
import org.hl7.fhir.LocationHoursOfOperation;
import org.hl7.fhir.LocationMode;
import org.hl7.fhir.LocationModeList;
import org.hl7.fhir.LocationPosition;
import org.hl7.fhir.LocationStatus;
import org.hl7.fhir.LocationStatusList;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.MarketingStatus;
import org.hl7.fhir.Measure;
import org.hl7.fhir.MeasureComponent;
import org.hl7.fhir.MeasureGroup;
import org.hl7.fhir.MeasurePopulation;
import org.hl7.fhir.MeasureReport;
import org.hl7.fhir.MeasureReportComponent;
import org.hl7.fhir.MeasureReportGroup;
import org.hl7.fhir.MeasureReportPopulation;
import org.hl7.fhir.MeasureReportPopulation1;
import org.hl7.fhir.MeasureReportStatus;
import org.hl7.fhir.MeasureReportStatusList;
import org.hl7.fhir.MeasureReportStratifier;
import org.hl7.fhir.MeasureReportStratum;
import org.hl7.fhir.MeasureReportType;
import org.hl7.fhir.MeasureReportTypeList;
import org.hl7.fhir.MeasureStratifier;
import org.hl7.fhir.MeasureSupplementalData;
import org.hl7.fhir.Media;
import org.hl7.fhir.Medication;
import org.hl7.fhir.MedicationAdministration;
import org.hl7.fhir.MedicationAdministrationDosage;
import org.hl7.fhir.MedicationAdministrationPerformer;
import org.hl7.fhir.MedicationBatch;
import org.hl7.fhir.MedicationDispense;
import org.hl7.fhir.MedicationDispensePerformer;
import org.hl7.fhir.MedicationDispenseSubstitution;
import org.hl7.fhir.MedicationIngredient;
import org.hl7.fhir.MedicationKnowledge;
import org.hl7.fhir.MedicationKnowledgeAdministrationGuidelines;
import org.hl7.fhir.MedicationKnowledgeCost;
import org.hl7.fhir.MedicationKnowledgeDosage;
import org.hl7.fhir.MedicationKnowledgeDrugCharacteristic;
import org.hl7.fhir.MedicationKnowledgeIngredient;
import org.hl7.fhir.MedicationKnowledgeKinetics;
import org.hl7.fhir.MedicationKnowledgeMaxDispense;
import org.hl7.fhir.MedicationKnowledgeMedicineClassification;
import org.hl7.fhir.MedicationKnowledgeMonitoringProgram;
import org.hl7.fhir.MedicationKnowledgeMonograph;
import org.hl7.fhir.MedicationKnowledgePackaging;
import org.hl7.fhir.MedicationKnowledgePatientCharacteristics;
import org.hl7.fhir.MedicationKnowledgeRegulatory;
import org.hl7.fhir.MedicationKnowledgeRelatedMedicationKnowledge;
import org.hl7.fhir.MedicationKnowledgeSchedule;
import org.hl7.fhir.MedicationKnowledgeSubstitution;
import org.hl7.fhir.MedicationRequest;
import org.hl7.fhir.MedicationRequestDispenseRequest;
import org.hl7.fhir.MedicationRequestInitialFill;
import org.hl7.fhir.MedicationRequestIntent;
import org.hl7.fhir.MedicationRequestIntentList;
import org.hl7.fhir.MedicationRequestSubstitution;
import org.hl7.fhir.MedicationStatement;
import org.hl7.fhir.MedicationStatusCodes;
import org.hl7.fhir.MedicationStatusCodesList;
import org.hl7.fhir.MedicationrequestStatus;
import org.hl7.fhir.MedicationrequestStatusList;
import org.hl7.fhir.MedicinalProduct;
import org.hl7.fhir.MedicinalProductAuthorization;
import org.hl7.fhir.MedicinalProductAuthorizationJurisdictionalAuthorization;
import org.hl7.fhir.MedicinalProductAuthorizationProcedure;
import org.hl7.fhir.MedicinalProductContraindication;
import org.hl7.fhir.MedicinalProductContraindicationOtherTherapy;
import org.hl7.fhir.MedicinalProductCountryLanguage;
import org.hl7.fhir.MedicinalProductIndication;
import org.hl7.fhir.MedicinalProductIndicationOtherTherapy;
import org.hl7.fhir.MedicinalProductIngredient;
import org.hl7.fhir.MedicinalProductIngredientReferenceStrength;
import org.hl7.fhir.MedicinalProductIngredientSpecifiedSubstance;
import org.hl7.fhir.MedicinalProductIngredientStrength;
import org.hl7.fhir.MedicinalProductIngredientSubstance;
import org.hl7.fhir.MedicinalProductInteraction;
import org.hl7.fhir.MedicinalProductInteractionInteractant;
import org.hl7.fhir.MedicinalProductManufactured;
import org.hl7.fhir.MedicinalProductManufacturingBusinessOperation;
import org.hl7.fhir.MedicinalProductName;
import org.hl7.fhir.MedicinalProductNamePart;
import org.hl7.fhir.MedicinalProductPackaged;
import org.hl7.fhir.MedicinalProductPackagedBatchIdentifier;
import org.hl7.fhir.MedicinalProductPackagedPackageItem;
import org.hl7.fhir.MedicinalProductPharmaceutical;
import org.hl7.fhir.MedicinalProductPharmaceuticalCharacteristics;
import org.hl7.fhir.MedicinalProductPharmaceuticalRouteOfAdministration;
import org.hl7.fhir.MedicinalProductPharmaceuticalTargetSpecies;
import org.hl7.fhir.MedicinalProductPharmaceuticalWithdrawalPeriod;
import org.hl7.fhir.MedicinalProductSpecialDesignation;
import org.hl7.fhir.MedicinalProductUndesirableEffect;
import org.hl7.fhir.MessageDefinition;
import org.hl7.fhir.MessageDefinitionAllowedResponse;
import org.hl7.fhir.MessageDefinitionFocus;
import org.hl7.fhir.MessageHeader;
import org.hl7.fhir.MessageHeaderDestination;
import org.hl7.fhir.MessageHeaderResponse;
import org.hl7.fhir.MessageHeaderSource;
import org.hl7.fhir.MessageSignificanceCategory;
import org.hl7.fhir.MessageSignificanceCategoryList;
import org.hl7.fhir.MessageheaderResponseRequest;
import org.hl7.fhir.MessageheaderResponseRequestList;
import org.hl7.fhir.Meta;
import org.hl7.fhir.MolecularSequence;
import org.hl7.fhir.MolecularSequenceInner;
import org.hl7.fhir.MolecularSequenceOuter;
import org.hl7.fhir.MolecularSequenceQuality;
import org.hl7.fhir.MolecularSequenceReferenceSeq;
import org.hl7.fhir.MolecularSequenceRepository;
import org.hl7.fhir.MolecularSequenceRoc;
import org.hl7.fhir.MolecularSequenceStructureVariant;
import org.hl7.fhir.MolecularSequenceVariant;
import org.hl7.fhir.Money;
import org.hl7.fhir.NameUse;
import org.hl7.fhir.NameUseList;
import org.hl7.fhir.NamingSystem;
import org.hl7.fhir.NamingSystemIdentifierType;
import org.hl7.fhir.NamingSystemIdentifierTypeList;
import org.hl7.fhir.NamingSystemType;
import org.hl7.fhir.NamingSystemTypeList;
import org.hl7.fhir.NamingSystemUniqueId;
import org.hl7.fhir.Narrative;
import org.hl7.fhir.NarrativeStatus;
import org.hl7.fhir.NarrativeStatusList;
import org.hl7.fhir.NoteType;
import org.hl7.fhir.NoteTypeList;
import org.hl7.fhir.NutritionOrder;
import org.hl7.fhir.NutritionOrderAdministration;
import org.hl7.fhir.NutritionOrderEnteralFormula;
import org.hl7.fhir.NutritionOrderNutrient;
import org.hl7.fhir.NutritionOrderOralDiet;
import org.hl7.fhir.NutritionOrderSupplement;
import org.hl7.fhir.NutritionOrderTexture;
import org.hl7.fhir.Observation;
import org.hl7.fhir.ObservationComponent;
import org.hl7.fhir.ObservationDataType;
import org.hl7.fhir.ObservationDataTypeList;
import org.hl7.fhir.ObservationDefinition;
import org.hl7.fhir.ObservationDefinitionQualifiedInterval;
import org.hl7.fhir.ObservationDefinitionQuantitativeDetails;
import org.hl7.fhir.ObservationRangeCategory;
import org.hl7.fhir.ObservationRangeCategoryList;
import org.hl7.fhir.ObservationReferenceRange;
import org.hl7.fhir.ObservationStatus;
import org.hl7.fhir.ObservationStatusList;
import org.hl7.fhir.Oid;
import org.hl7.fhir.OperationDefinition;
import org.hl7.fhir.OperationDefinitionBinding;
import org.hl7.fhir.OperationDefinitionOverload;
import org.hl7.fhir.OperationDefinitionParameter;
import org.hl7.fhir.OperationDefinitionReferencedFrom;
import org.hl7.fhir.OperationKind;
import org.hl7.fhir.OperationKindList;
import org.hl7.fhir.OperationOutcome;
import org.hl7.fhir.OperationOutcomeIssue;
import org.hl7.fhir.OperationParameterUse;
import org.hl7.fhir.OperationParameterUseList;
import org.hl7.fhir.Organization;
import org.hl7.fhir.OrganizationAffiliation;
import org.hl7.fhir.OrganizationContact;
import org.hl7.fhir.OrientationType;
import org.hl7.fhir.OrientationTypeList;
import org.hl7.fhir.ParameterDefinition;
import org.hl7.fhir.Parameters;
import org.hl7.fhir.ParametersParameter;
import org.hl7.fhir.ParticipantRequired;
import org.hl7.fhir.ParticipantRequiredList;
import org.hl7.fhir.ParticipationStatus;
import org.hl7.fhir.ParticipationStatusList;
import org.hl7.fhir.Patient;
import org.hl7.fhir.PatientCommunication;
import org.hl7.fhir.PatientContact;
import org.hl7.fhir.PatientLink;
import org.hl7.fhir.PaymentNotice;
import org.hl7.fhir.PaymentReconciliation;
import org.hl7.fhir.PaymentReconciliationDetail;
import org.hl7.fhir.PaymentReconciliationProcessNote;
import org.hl7.fhir.Period;
import org.hl7.fhir.Person;
import org.hl7.fhir.PersonLink;
import org.hl7.fhir.PlanDefinition;
import org.hl7.fhir.PlanDefinitionAction;
import org.hl7.fhir.PlanDefinitionCondition;
import org.hl7.fhir.PlanDefinitionDynamicValue;
import org.hl7.fhir.PlanDefinitionGoal;
import org.hl7.fhir.PlanDefinitionParticipant;
import org.hl7.fhir.PlanDefinitionRelatedAction;
import org.hl7.fhir.PlanDefinitionTarget;
import org.hl7.fhir.Population;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Practitioner;
import org.hl7.fhir.PractitionerQualification;
import org.hl7.fhir.PractitionerRole;
import org.hl7.fhir.PractitionerRoleAvailableTime;
import org.hl7.fhir.PractitionerRoleNotAvailable;
import org.hl7.fhir.Procedure;
import org.hl7.fhir.ProcedureFocalDevice;
import org.hl7.fhir.ProcedurePerformer;
import org.hl7.fhir.ProdCharacteristic;
import org.hl7.fhir.ProductShelfLife;
import org.hl7.fhir.PropertyRepresentation;
import org.hl7.fhir.PropertyRepresentationList;
import org.hl7.fhir.PropertyType;
import org.hl7.fhir.PropertyTypeList;
import org.hl7.fhir.Provenance;
import org.hl7.fhir.ProvenanceAgent;
import org.hl7.fhir.ProvenanceEntity;
import org.hl7.fhir.ProvenanceEntityRole;
import org.hl7.fhir.ProvenanceEntityRoleList;
import org.hl7.fhir.PublicationStatus;
import org.hl7.fhir.PublicationStatusList;
import org.hl7.fhir.QualityType;
import org.hl7.fhir.QualityTypeList;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.QuantityComparator;
import org.hl7.fhir.QuantityComparatorList;
import org.hl7.fhir.Questionnaire;
import org.hl7.fhir.QuestionnaireAnswerOption;
import org.hl7.fhir.QuestionnaireEnableWhen;
import org.hl7.fhir.QuestionnaireInitial;
import org.hl7.fhir.QuestionnaireItem;
import org.hl7.fhir.QuestionnaireItemOperator;
import org.hl7.fhir.QuestionnaireItemOperatorList;
import org.hl7.fhir.QuestionnaireItemType;
import org.hl7.fhir.QuestionnaireItemTypeList;
import org.hl7.fhir.QuestionnaireResponse;
import org.hl7.fhir.QuestionnaireResponseAnswer;
import org.hl7.fhir.QuestionnaireResponseItem;
import org.hl7.fhir.QuestionnaireResponseStatus;
import org.hl7.fhir.QuestionnaireResponseStatusList;
import org.hl7.fhir.Range;
import org.hl7.fhir.Ratio;
import org.hl7.fhir.Reference;
import org.hl7.fhir.ReferenceHandlingPolicy;
import org.hl7.fhir.ReferenceHandlingPolicyList;
import org.hl7.fhir.ReferenceVersionRules;
import org.hl7.fhir.ReferenceVersionRulesList;
import org.hl7.fhir.RelatedArtifact;
import org.hl7.fhir.RelatedArtifactType;
import org.hl7.fhir.RelatedArtifactTypeList;
import org.hl7.fhir.RelatedPerson;
import org.hl7.fhir.RelatedPersonCommunication;
import org.hl7.fhir.RemittanceOutcome;
import org.hl7.fhir.RemittanceOutcomeList;
import org.hl7.fhir.RepositoryType;
import org.hl7.fhir.RepositoryTypeList;
import org.hl7.fhir.RequestGroup;
import org.hl7.fhir.RequestGroupAction;
import org.hl7.fhir.RequestGroupCondition;
import org.hl7.fhir.RequestGroupRelatedAction;
import org.hl7.fhir.RequestIntent;
import org.hl7.fhir.RequestIntentList;
import org.hl7.fhir.RequestPriority;
import org.hl7.fhir.RequestPriorityList;
import org.hl7.fhir.RequestResourceType;
import org.hl7.fhir.RequestResourceTypeList;
import org.hl7.fhir.RequestStatus;
import org.hl7.fhir.RequestStatusList;
import org.hl7.fhir.ResearchDefinition;
import org.hl7.fhir.ResearchElementDefinition;
import org.hl7.fhir.ResearchElementDefinitionCharacteristic;
import org.hl7.fhir.ResearchElementType;
import org.hl7.fhir.ResearchElementTypeList;
import org.hl7.fhir.ResearchStudy;
import org.hl7.fhir.ResearchStudyArm;
import org.hl7.fhir.ResearchStudyObjective;
import org.hl7.fhir.ResearchStudyStatus;
import org.hl7.fhir.ResearchStudyStatusList;
import org.hl7.fhir.ResearchSubject;
import org.hl7.fhir.ResearchSubjectStatus;
import org.hl7.fhir.ResearchSubjectStatusList;
import org.hl7.fhir.Resource;
import org.hl7.fhir.ResourceContainer;
import org.hl7.fhir.ResourceType;
import org.hl7.fhir.ResourceTypeList;
import org.hl7.fhir.ResourceVersionPolicy;
import org.hl7.fhir.ResourceVersionPolicyList;
import org.hl7.fhir.ResponseType;
import org.hl7.fhir.ResponseTypeList;
import org.hl7.fhir.RestfulCapabilityMode;
import org.hl7.fhir.RestfulCapabilityModeList;
import org.hl7.fhir.RiskAssessment;
import org.hl7.fhir.RiskAssessmentPrediction;
import org.hl7.fhir.RiskEvidenceSynthesis;
import org.hl7.fhir.RiskEvidenceSynthesisCertainty;
import org.hl7.fhir.RiskEvidenceSynthesisCertaintySubcomponent;
import org.hl7.fhir.RiskEvidenceSynthesisPrecisionEstimate;
import org.hl7.fhir.RiskEvidenceSynthesisRiskEstimate;
import org.hl7.fhir.RiskEvidenceSynthesisSampleSize;
import org.hl7.fhir.SPDXLicense;
import org.hl7.fhir.SPDXLicenseList;
import org.hl7.fhir.SampledData;
import org.hl7.fhir.SampledDataDataType;
import org.hl7.fhir.Schedule;
import org.hl7.fhir.SearchComparator;
import org.hl7.fhir.SearchComparatorList;
import org.hl7.fhir.SearchEntryMode;
import org.hl7.fhir.SearchEntryModeList;
import org.hl7.fhir.SearchModifierCode;
import org.hl7.fhir.SearchModifierCodeList;
import org.hl7.fhir.SearchParamType;
import org.hl7.fhir.SearchParamTypeList;
import org.hl7.fhir.SearchParameter;
import org.hl7.fhir.SearchParameterComponent;
import org.hl7.fhir.SequenceType;
import org.hl7.fhir.SequenceTypeList;
import org.hl7.fhir.ServiceRequest;
import org.hl7.fhir.Signature;
import org.hl7.fhir.SlicingRules;
import org.hl7.fhir.SlicingRulesList;
import org.hl7.fhir.Slot;
import org.hl7.fhir.SlotStatus;
import org.hl7.fhir.SlotStatusList;
import org.hl7.fhir.SortDirection;
import org.hl7.fhir.SortDirectionList;
import org.hl7.fhir.Specimen;
import org.hl7.fhir.SpecimenCollection;
import org.hl7.fhir.SpecimenContainedPreference;
import org.hl7.fhir.SpecimenContainedPreferenceList;
import org.hl7.fhir.SpecimenContainer;
import org.hl7.fhir.SpecimenDefinition;
import org.hl7.fhir.SpecimenDefinitionAdditive;
import org.hl7.fhir.SpecimenDefinitionContainer;
import org.hl7.fhir.SpecimenDefinitionHandling;
import org.hl7.fhir.SpecimenDefinitionTypeTested;
import org.hl7.fhir.SpecimenProcessing;
import org.hl7.fhir.SpecimenStatus;
import org.hl7.fhir.SpecimenStatusList;
import org.hl7.fhir.Status;
import org.hl7.fhir.StatusList;
import org.hl7.fhir.StrandType;
import org.hl7.fhir.StrandTypeList;
import org.hl7.fhir.StructureDefinition;
import org.hl7.fhir.StructureDefinitionContext;
import org.hl7.fhir.StructureDefinitionDifferential;
import org.hl7.fhir.StructureDefinitionKind;
import org.hl7.fhir.StructureDefinitionKindList;
import org.hl7.fhir.StructureDefinitionMapping;
import org.hl7.fhir.StructureDefinitionSnapshot;
import org.hl7.fhir.StructureMap;
import org.hl7.fhir.StructureMapContextType;
import org.hl7.fhir.StructureMapContextTypeList;
import org.hl7.fhir.StructureMapDependent;
import org.hl7.fhir.StructureMapGroup;
import org.hl7.fhir.StructureMapGroupTypeMode;
import org.hl7.fhir.StructureMapGroupTypeModeList;
import org.hl7.fhir.StructureMapInput;
import org.hl7.fhir.StructureMapInputMode;
import org.hl7.fhir.StructureMapInputModeList;
import org.hl7.fhir.StructureMapModelMode;
import org.hl7.fhir.StructureMapModelModeList;
import org.hl7.fhir.StructureMapParameter;
import org.hl7.fhir.StructureMapRule;
import org.hl7.fhir.StructureMapSource;
import org.hl7.fhir.StructureMapSourceListMode;
import org.hl7.fhir.StructureMapSourceListModeList;
import org.hl7.fhir.StructureMapStructure;
import org.hl7.fhir.StructureMapTarget;
import org.hl7.fhir.StructureMapTargetListMode;
import org.hl7.fhir.StructureMapTargetListModeList;
import org.hl7.fhir.StructureMapTransform;
import org.hl7.fhir.StructureMapTransformList;
import org.hl7.fhir.Subscription;
import org.hl7.fhir.SubscriptionChannel;
import org.hl7.fhir.SubscriptionChannelType;
import org.hl7.fhir.SubscriptionChannelTypeList;
import org.hl7.fhir.SubscriptionStatus;
import org.hl7.fhir.SubscriptionStatusList;
import org.hl7.fhir.Substance;
import org.hl7.fhir.SubstanceAmount;
import org.hl7.fhir.SubstanceAmountReferenceRange;
import org.hl7.fhir.SubstanceIngredient;
import org.hl7.fhir.SubstanceInstance;
import org.hl7.fhir.SubstanceNucleicAcid;
import org.hl7.fhir.SubstanceNucleicAcidLinkage;
import org.hl7.fhir.SubstanceNucleicAcidSubunit;
import org.hl7.fhir.SubstanceNucleicAcidSugar;
import org.hl7.fhir.SubstancePolymer;
import org.hl7.fhir.SubstancePolymerDegreeOfPolymerisation;
import org.hl7.fhir.SubstancePolymerMonomerSet;
import org.hl7.fhir.SubstancePolymerRepeat;
import org.hl7.fhir.SubstancePolymerRepeatUnit;
import org.hl7.fhir.SubstancePolymerStartingMaterial;
import org.hl7.fhir.SubstancePolymerStructuralRepresentation;
import org.hl7.fhir.SubstanceProtein;
import org.hl7.fhir.SubstanceProteinSubunit;
import org.hl7.fhir.SubstanceReferenceInformation;
import org.hl7.fhir.SubstanceReferenceInformationClassification;
import org.hl7.fhir.SubstanceReferenceInformationGene;
import org.hl7.fhir.SubstanceReferenceInformationGeneElement;
import org.hl7.fhir.SubstanceReferenceInformationTarget;
import org.hl7.fhir.SubstanceSourceMaterial;
import org.hl7.fhir.SubstanceSourceMaterialAuthor;
import org.hl7.fhir.SubstanceSourceMaterialFractionDescription;
import org.hl7.fhir.SubstanceSourceMaterialHybrid;
import org.hl7.fhir.SubstanceSourceMaterialOrganism;
import org.hl7.fhir.SubstanceSourceMaterialOrganismGeneral;
import org.hl7.fhir.SubstanceSourceMaterialPartDescription;
import org.hl7.fhir.SubstanceSpecification;
import org.hl7.fhir.SubstanceSpecificationCode;
import org.hl7.fhir.SubstanceSpecificationIsotope;
import org.hl7.fhir.SubstanceSpecificationMoiety;
import org.hl7.fhir.SubstanceSpecificationMolecularWeight;
import org.hl7.fhir.SubstanceSpecificationName;
import org.hl7.fhir.SubstanceSpecificationOfficial;
import org.hl7.fhir.SubstanceSpecificationProperty;
import org.hl7.fhir.SubstanceSpecificationRelationship;
import org.hl7.fhir.SubstanceSpecificationRepresentation;
import org.hl7.fhir.SubstanceSpecificationStructure;
import org.hl7.fhir.SupplyDelivery;
import org.hl7.fhir.SupplyDeliveryStatus;
import org.hl7.fhir.SupplyDeliveryStatusList;
import org.hl7.fhir.SupplyDeliverySuppliedItem;
import org.hl7.fhir.SupplyRequest;
import org.hl7.fhir.SupplyRequestParameter;
import org.hl7.fhir.SupplyRequestStatus;
import org.hl7.fhir.SupplyRequestStatusList;
import org.hl7.fhir.SystemRestfulInteraction;
import org.hl7.fhir.SystemRestfulInteractionList;
import org.hl7.fhir.Task;
import org.hl7.fhir.TaskInput;
import org.hl7.fhir.TaskIntent;
import org.hl7.fhir.TaskIntentList;
import org.hl7.fhir.TaskOutput;
import org.hl7.fhir.TaskRestriction;
import org.hl7.fhir.TaskStatus;
import org.hl7.fhir.TaskStatusList;
import org.hl7.fhir.TerminologyCapabilities;
import org.hl7.fhir.TerminologyCapabilitiesClosure;
import org.hl7.fhir.TerminologyCapabilitiesCodeSystem;
import org.hl7.fhir.TerminologyCapabilitiesExpansion;
import org.hl7.fhir.TerminologyCapabilitiesFilter;
import org.hl7.fhir.TerminologyCapabilitiesImplementation;
import org.hl7.fhir.TerminologyCapabilitiesParameter;
import org.hl7.fhir.TerminologyCapabilitiesSoftware;
import org.hl7.fhir.TerminologyCapabilitiesTranslation;
import org.hl7.fhir.TerminologyCapabilitiesValidateCode;
import org.hl7.fhir.TerminologyCapabilitiesVersion;
import org.hl7.fhir.TestReport;
import org.hl7.fhir.TestReportAction;
import org.hl7.fhir.TestReportAction1;
import org.hl7.fhir.TestReportAction2;
import org.hl7.fhir.TestReportActionResult;
import org.hl7.fhir.TestReportActionResultList;
import org.hl7.fhir.TestReportAssert;
import org.hl7.fhir.TestReportOperation;
import org.hl7.fhir.TestReportParticipant;
import org.hl7.fhir.TestReportParticipantType;
import org.hl7.fhir.TestReportParticipantTypeList;
import org.hl7.fhir.TestReportResult;
import org.hl7.fhir.TestReportResultList;
import org.hl7.fhir.TestReportSetup;
import org.hl7.fhir.TestReportStatus;
import org.hl7.fhir.TestReportStatusList;
import org.hl7.fhir.TestReportTeardown;
import org.hl7.fhir.TestReportTest;
import org.hl7.fhir.TestScript;
import org.hl7.fhir.TestScriptAction;
import org.hl7.fhir.TestScriptAction1;
import org.hl7.fhir.TestScriptAction2;
import org.hl7.fhir.TestScriptAssert;
import org.hl7.fhir.TestScriptCapability;
import org.hl7.fhir.TestScriptDestination;
import org.hl7.fhir.TestScriptFixture;
import org.hl7.fhir.TestScriptLink;
import org.hl7.fhir.TestScriptMetadata;
import org.hl7.fhir.TestScriptOperation;
import org.hl7.fhir.TestScriptOrigin;
import org.hl7.fhir.TestScriptRequestHeader;
import org.hl7.fhir.TestScriptRequestMethodCode;
import org.hl7.fhir.TestScriptRequestMethodCodeList;
import org.hl7.fhir.TestScriptSetup;
import org.hl7.fhir.TestScriptTeardown;
import org.hl7.fhir.TestScriptTest;
import org.hl7.fhir.TestScriptVariable;
import org.hl7.fhir.Time;
import org.hl7.fhir.Timing;
import org.hl7.fhir.TimingRepeat;
import org.hl7.fhir.TriggerDefinition;
import org.hl7.fhir.TriggerType;
import org.hl7.fhir.TriggerTypeList;
import org.hl7.fhir.TypeDerivationRule;
import org.hl7.fhir.TypeDerivationRuleList;
import org.hl7.fhir.TypeRestfulInteraction;
import org.hl7.fhir.TypeRestfulInteractionList;
import org.hl7.fhir.UDIEntryType;
import org.hl7.fhir.UDIEntryTypeList;
import org.hl7.fhir.UnitsOfTime;
import org.hl7.fhir.UnitsOfTimeList;
import org.hl7.fhir.UnsignedInt;
import org.hl7.fhir.Uri;
import org.hl7.fhir.Url;
import org.hl7.fhir.UsageContext;
import org.hl7.fhir.Use;
import org.hl7.fhir.UseList;
import org.hl7.fhir.Uuid;
import org.hl7.fhir.VConfidentialityClassification;
import org.hl7.fhir.VConfidentialityClassificationList;
import org.hl7.fhir.ValueSet;
import org.hl7.fhir.ValueSetCompose;
import org.hl7.fhir.ValueSetConcept;
import org.hl7.fhir.ValueSetContains;
import org.hl7.fhir.ValueSetDesignation;
import org.hl7.fhir.ValueSetExpansion;
import org.hl7.fhir.ValueSetFilter;
import org.hl7.fhir.ValueSetInclude;
import org.hl7.fhir.ValueSetParameter;
import org.hl7.fhir.VariableType;
import org.hl7.fhir.VariableTypeList;
import org.hl7.fhir.VerificationResult;
import org.hl7.fhir.VerificationResultAttestation;
import org.hl7.fhir.VerificationResultPrimarySource;
import org.hl7.fhir.VerificationResultValidator;
import org.hl7.fhir.VisionBase;
import org.hl7.fhir.VisionBaseList;
import org.hl7.fhir.VisionEyes;
import org.hl7.fhir.VisionEyesList;
import org.hl7.fhir.VisionPrescription;
import org.hl7.fhir.VisionPrescriptionLensSpecification;
import org.hl7.fhir.VisionPrescriptionPrism;
import org.hl7.fhir.XPathUsageType;
import org.hl7.fhir.XPathUsageTypeList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FhirFactoryImpl extends EFactoryImpl implements FhirFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FhirFactory init() {
		try {
			FhirFactory theFhirFactory = (FhirFactory)EPackage.Registry.INSTANCE.getEFactory(FhirPackage.eNS_URI);
			if (theFhirFactory != null) {
				return theFhirFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FhirFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FhirFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FhirPackage.ACCOUNT: return createAccount();
			case FhirPackage.ACCOUNT_COVERAGE: return createAccountCoverage();
			case FhirPackage.ACCOUNT_GUARANTOR: return createAccountGuarantor();
			case FhirPackage.ACCOUNT_STATUS: return createAccountStatus();
			case FhirPackage.ACTION_CARDINALITY_BEHAVIOR: return createActionCardinalityBehavior();
			case FhirPackage.ACTION_CONDITION_KIND: return createActionConditionKind();
			case FhirPackage.ACTION_GROUPING_BEHAVIOR: return createActionGroupingBehavior();
			case FhirPackage.ACTION_PARTICIPANT_TYPE: return createActionParticipantType();
			case FhirPackage.ACTION_PRECHECK_BEHAVIOR: return createActionPrecheckBehavior();
			case FhirPackage.ACTION_RELATIONSHIP_TYPE: return createActionRelationshipType();
			case FhirPackage.ACTION_REQUIRED_BEHAVIOR: return createActionRequiredBehavior();
			case FhirPackage.ACTION_SELECTION_BEHAVIOR: return createActionSelectionBehavior();
			case FhirPackage.ACTIVITY_DEFINITION: return createActivityDefinition();
			case FhirPackage.ACTIVITY_DEFINITION_DYNAMIC_VALUE: return createActivityDefinitionDynamicValue();
			case FhirPackage.ACTIVITY_DEFINITION_PARTICIPANT: return createActivityDefinitionParticipant();
			case FhirPackage.ADDRESS: return createAddress();
			case FhirPackage.ADDRESS_TYPE: return createAddressType();
			case FhirPackage.ADDRESS_USE: return createAddressUse();
			case FhirPackage.ADMINISTRATIVE_GENDER: return createAdministrativeGender();
			case FhirPackage.ADVERSE_EVENT: return createAdverseEvent();
			case FhirPackage.ADVERSE_EVENT_ACTUALITY: return createAdverseEventActuality();
			case FhirPackage.ADVERSE_EVENT_CAUSALITY: return createAdverseEventCausality();
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY: return createAdverseEventSuspectEntity();
			case FhirPackage.AGE: return createAge();
			case FhirPackage.AGGREGATION_MODE: return createAggregationMode();
			case FhirPackage.ALLERGY_INTOLERANCE: return createAllergyIntolerance();
			case FhirPackage.ALLERGY_INTOLERANCE_CATEGORY: return createAllergyIntoleranceCategory();
			case FhirPackage.ALLERGY_INTOLERANCE_CRITICALITY: return createAllergyIntoleranceCriticality();
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION: return createAllergyIntoleranceReaction();
			case FhirPackage.ALLERGY_INTOLERANCE_SEVERITY: return createAllergyIntoleranceSeverity();
			case FhirPackage.ALLERGY_INTOLERANCE_TYPE: return createAllergyIntoleranceType();
			case FhirPackage.ANNOTATION: return createAnnotation();
			case FhirPackage.APPOINTMENT: return createAppointment();
			case FhirPackage.APPOINTMENT_PARTICIPANT: return createAppointmentParticipant();
			case FhirPackage.APPOINTMENT_RESPONSE: return createAppointmentResponse();
			case FhirPackage.APPOINTMENT_STATUS: return createAppointmentStatus();
			case FhirPackage.ASSERTION_DIRECTION_TYPE: return createAssertionDirectionType();
			case FhirPackage.ASSERTION_OPERATOR_TYPE: return createAssertionOperatorType();
			case FhirPackage.ASSERTION_RESPONSE_TYPES: return createAssertionResponseTypes();
			case FhirPackage.ATTACHMENT: return createAttachment();
			case FhirPackage.AUDIT_EVENT: return createAuditEvent();
			case FhirPackage.AUDIT_EVENT_ACTION: return createAuditEventAction();
			case FhirPackage.AUDIT_EVENT_AGENT: return createAuditEventAgent();
			case FhirPackage.AUDIT_EVENT_AGENT_NETWORK_TYPE: return createAuditEventAgentNetworkType();
			case FhirPackage.AUDIT_EVENT_DETAIL: return createAuditEventDetail();
			case FhirPackage.AUDIT_EVENT_ENTITY: return createAuditEventEntity();
			case FhirPackage.AUDIT_EVENT_NETWORK: return createAuditEventNetwork();
			case FhirPackage.AUDIT_EVENT_OUTCOME: return createAuditEventOutcome();
			case FhirPackage.AUDIT_EVENT_SOURCE: return createAuditEventSource();
			case FhirPackage.BACKBONE_ELEMENT: return createBackboneElement();
			case FhirPackage.BASE64_BINARY: return createBase64Binary();
			case FhirPackage.BASIC: return createBasic();
			case FhirPackage.BINARY: return createBinary();
			case FhirPackage.BINDING_STRENGTH: return createBindingStrength();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT: return createBiologicallyDerivedProduct();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_CATEGORY: return createBiologicallyDerivedProductCategory();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION: return createBiologicallyDerivedProductCollection();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_MANIPULATION: return createBiologicallyDerivedProductManipulation();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_PROCESSING: return createBiologicallyDerivedProductProcessing();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STATUS: return createBiologicallyDerivedProductStatus();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE: return createBiologicallyDerivedProductStorage();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE_SCALE: return createBiologicallyDerivedProductStorageScale();
			case FhirPackage.BODY_STRUCTURE: return createBodyStructure();
			case FhirPackage.BOOLEAN: return createBoolean();
			case FhirPackage.BUNDLE: return createBundle();
			case FhirPackage.BUNDLE_ENTRY: return createBundleEntry();
			case FhirPackage.BUNDLE_LINK: return createBundleLink();
			case FhirPackage.BUNDLE_REQUEST: return createBundleRequest();
			case FhirPackage.BUNDLE_RESPONSE: return createBundleResponse();
			case FhirPackage.BUNDLE_SEARCH: return createBundleSearch();
			case FhirPackage.BUNDLE_TYPE: return createBundleType();
			case FhirPackage.CANONICAL: return createCanonical();
			case FhirPackage.CAPABILITY_STATEMENT: return createCapabilityStatement();
			case FhirPackage.CAPABILITY_STATEMENT_DOCUMENT: return createCapabilityStatementDocument();
			case FhirPackage.CAPABILITY_STATEMENT_ENDPOINT: return createCapabilityStatementEndpoint();
			case FhirPackage.CAPABILITY_STATEMENT_IMPLEMENTATION: return createCapabilityStatementImplementation();
			case FhirPackage.CAPABILITY_STATEMENT_INTERACTION: return createCapabilityStatementInteraction();
			case FhirPackage.CAPABILITY_STATEMENT_INTERACTION1: return createCapabilityStatementInteraction1();
			case FhirPackage.CAPABILITY_STATEMENT_KIND: return createCapabilityStatementKind();
			case FhirPackage.CAPABILITY_STATEMENT_MESSAGING: return createCapabilityStatementMessaging();
			case FhirPackage.CAPABILITY_STATEMENT_OPERATION: return createCapabilityStatementOperation();
			case FhirPackage.CAPABILITY_STATEMENT_RESOURCE: return createCapabilityStatementResource();
			case FhirPackage.CAPABILITY_STATEMENT_REST: return createCapabilityStatementRest();
			case FhirPackage.CAPABILITY_STATEMENT_SEARCH_PARAM: return createCapabilityStatementSearchParam();
			case FhirPackage.CAPABILITY_STATEMENT_SECURITY: return createCapabilityStatementSecurity();
			case FhirPackage.CAPABILITY_STATEMENT_SOFTWARE: return createCapabilityStatementSoftware();
			case FhirPackage.CAPABILITY_STATEMENT_SUPPORTED_MESSAGE: return createCapabilityStatementSupportedMessage();
			case FhirPackage.CARE_PLAN: return createCarePlan();
			case FhirPackage.CARE_PLAN_ACTIVITY: return createCarePlanActivity();
			case FhirPackage.CARE_PLAN_ACTIVITY_KIND: return createCarePlanActivityKind();
			case FhirPackage.CARE_PLAN_ACTIVITY_STATUS: return createCarePlanActivityStatus();
			case FhirPackage.CARE_PLAN_DETAIL: return createCarePlanDetail();
			case FhirPackage.CARE_PLAN_INTENT: return createCarePlanIntent();
			case FhirPackage.CARE_TEAM: return createCareTeam();
			case FhirPackage.CARE_TEAM_PARTICIPANT: return createCareTeamParticipant();
			case FhirPackage.CARE_TEAM_STATUS: return createCareTeamStatus();
			case FhirPackage.CATALOG_ENTRY: return createCatalogEntry();
			case FhirPackage.CATALOG_ENTRY_RELATED_ENTRY: return createCatalogEntryRelatedEntry();
			case FhirPackage.CATALOG_ENTRY_RELATION_TYPE: return createCatalogEntryRelationType();
			case FhirPackage.CHARGE_ITEM: return createChargeItem();
			case FhirPackage.CHARGE_ITEM_DEFINITION: return createChargeItemDefinition();
			case FhirPackage.CHARGE_ITEM_DEFINITION_APPLICABILITY: return createChargeItemDefinitionApplicability();
			case FhirPackage.CHARGE_ITEM_DEFINITION_PRICE_COMPONENT: return createChargeItemDefinitionPriceComponent();
			case FhirPackage.CHARGE_ITEM_DEFINITION_PROPERTY_GROUP: return createChargeItemDefinitionPropertyGroup();
			case FhirPackage.CHARGE_ITEM_PERFORMER: return createChargeItemPerformer();
			case FhirPackage.CHARGE_ITEM_STATUS: return createChargeItemStatus();
			case FhirPackage.CLAIM: return createClaim();
			case FhirPackage.CLAIM_ACCIDENT: return createClaimAccident();
			case FhirPackage.CLAIM_CARE_TEAM: return createClaimCareTeam();
			case FhirPackage.CLAIM_DETAIL: return createClaimDetail();
			case FhirPackage.CLAIM_DIAGNOSIS: return createClaimDiagnosis();
			case FhirPackage.CLAIM_INSURANCE: return createClaimInsurance();
			case FhirPackage.CLAIM_ITEM: return createClaimItem();
			case FhirPackage.CLAIM_PAYEE: return createClaimPayee();
			case FhirPackage.CLAIM_PROCEDURE: return createClaimProcedure();
			case FhirPackage.CLAIM_PROCESSING_CODES: return createClaimProcessingCodes();
			case FhirPackage.CLAIM_RELATED: return createClaimRelated();
			case FhirPackage.CLAIM_RESPONSE: return createClaimResponse();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM: return createClaimResponseAddItem();
			case FhirPackage.CLAIM_RESPONSE_ADJUDICATION: return createClaimResponseAdjudication();
			case FhirPackage.CLAIM_RESPONSE_DETAIL: return createClaimResponseDetail();
			case FhirPackage.CLAIM_RESPONSE_DETAIL1: return createClaimResponseDetail1();
			case FhirPackage.CLAIM_RESPONSE_ERROR: return createClaimResponseError();
			case FhirPackage.CLAIM_RESPONSE_INSURANCE: return createClaimResponseInsurance();
			case FhirPackage.CLAIM_RESPONSE_ITEM: return createClaimResponseItem();
			case FhirPackage.CLAIM_RESPONSE_PAYMENT: return createClaimResponsePayment();
			case FhirPackage.CLAIM_RESPONSE_PROCESS_NOTE: return createClaimResponseProcessNote();
			case FhirPackage.CLAIM_RESPONSE_SUB_DETAIL: return createClaimResponseSubDetail();
			case FhirPackage.CLAIM_RESPONSE_SUB_DETAIL1: return createClaimResponseSubDetail1();
			case FhirPackage.CLAIM_RESPONSE_TOTAL: return createClaimResponseTotal();
			case FhirPackage.CLAIM_SUB_DETAIL: return createClaimSubDetail();
			case FhirPackage.CLAIM_SUPPORTING_INFO: return createClaimSupportingInfo();
			case FhirPackage.CLINICAL_IMPRESSION: return createClinicalImpression();
			case FhirPackage.CLINICAL_IMPRESSION_FINDING: return createClinicalImpressionFinding();
			case FhirPackage.CLINICAL_IMPRESSION_INVESTIGATION: return createClinicalImpressionInvestigation();
			case FhirPackage.CLINICAL_IMPRESSION_STATUS: return createClinicalImpressionStatus();
			case FhirPackage.CODE: return createCode();
			case FhirPackage.CODEABLE_CONCEPT: return createCodeableConcept();
			case FhirPackage.CODE_SEARCH_SUPPORT: return createCodeSearchSupport();
			case FhirPackage.CODE_SYSTEM: return createCodeSystem();
			case FhirPackage.CODE_SYSTEM_CONCEPT: return createCodeSystemConcept();
			case FhirPackage.CODE_SYSTEM_CONTENT_MODE: return createCodeSystemContentMode();
			case FhirPackage.CODE_SYSTEM_DESIGNATION: return createCodeSystemDesignation();
			case FhirPackage.CODE_SYSTEM_FILTER: return createCodeSystemFilter();
			case FhirPackage.CODE_SYSTEM_HIERARCHY_MEANING: return createCodeSystemHierarchyMeaning();
			case FhirPackage.CODE_SYSTEM_PROPERTY: return createCodeSystemProperty();
			case FhirPackage.CODE_SYSTEM_PROPERTY1: return createCodeSystemProperty1();
			case FhirPackage.CODING: return createCoding();
			case FhirPackage.COMMUNICATION: return createCommunication();
			case FhirPackage.COMMUNICATION_PAYLOAD: return createCommunicationPayload();
			case FhirPackage.COMMUNICATION_REQUEST: return createCommunicationRequest();
			case FhirPackage.COMMUNICATION_REQUEST_PAYLOAD: return createCommunicationRequestPayload();
			case FhirPackage.COMPARTMENT_DEFINITION: return createCompartmentDefinition();
			case FhirPackage.COMPARTMENT_DEFINITION_RESOURCE: return createCompartmentDefinitionResource();
			case FhirPackage.COMPARTMENT_TYPE: return createCompartmentType();
			case FhirPackage.COMPOSITION: return createComposition();
			case FhirPackage.COMPOSITION_ATTESTATION_MODE: return createCompositionAttestationMode();
			case FhirPackage.COMPOSITION_ATTESTER: return createCompositionAttester();
			case FhirPackage.COMPOSITION_EVENT: return createCompositionEvent();
			case FhirPackage.COMPOSITION_RELATES_TO: return createCompositionRelatesTo();
			case FhirPackage.COMPOSITION_SECTION: return createCompositionSection();
			case FhirPackage.COMPOSITION_STATUS: return createCompositionStatus();
			case FhirPackage.CONCEPT_MAP: return createConceptMap();
			case FhirPackage.CONCEPT_MAP_DEPENDS_ON: return createConceptMapDependsOn();
			case FhirPackage.CONCEPT_MAP_ELEMENT: return createConceptMapElement();
			case FhirPackage.CONCEPT_MAP_EQUIVALENCE: return createConceptMapEquivalence();
			case FhirPackage.CONCEPT_MAP_GROUP: return createConceptMapGroup();
			case FhirPackage.CONCEPT_MAP_GROUP_UNMAPPED_MODE: return createConceptMapGroupUnmappedMode();
			case FhirPackage.CONCEPT_MAP_TARGET: return createConceptMapTarget();
			case FhirPackage.CONCEPT_MAP_UNMAPPED: return createConceptMapUnmapped();
			case FhirPackage.CONDITION: return createCondition();
			case FhirPackage.CONDITIONAL_DELETE_STATUS: return createConditionalDeleteStatus();
			case FhirPackage.CONDITIONAL_READ_STATUS: return createConditionalReadStatus();
			case FhirPackage.CONDITION_EVIDENCE: return createConditionEvidence();
			case FhirPackage.CONDITION_STAGE: return createConditionStage();
			case FhirPackage.CONSENT: return createConsent();
			case FhirPackage.CONSENT_ACTOR: return createConsentActor();
			case FhirPackage.CONSENT_DATA: return createConsentData();
			case FhirPackage.CONSENT_DATA_MEANING: return createConsentDataMeaning();
			case FhirPackage.CONSENT_POLICY: return createConsentPolicy();
			case FhirPackage.CONSENT_PROVISION: return createConsentProvision();
			case FhirPackage.CONSENT_PROVISION_TYPE: return createConsentProvisionType();
			case FhirPackage.CONSENT_STATE: return createConsentState();
			case FhirPackage.CONSENT_VERIFICATION: return createConsentVerification();
			case FhirPackage.CONSTRAINT_SEVERITY: return createConstraintSeverity();
			case FhirPackage.CONTACT_DETAIL: return createContactDetail();
			case FhirPackage.CONTACT_POINT: return createContactPoint();
			case FhirPackage.CONTACT_POINT_SYSTEM: return createContactPointSystem();
			case FhirPackage.CONTACT_POINT_USE: return createContactPointUse();
			case FhirPackage.CONTRACT: return createContract();
			case FhirPackage.CONTRACT_ACTION: return createContractAction();
			case FhirPackage.CONTRACT_ANSWER: return createContractAnswer();
			case FhirPackage.CONTRACT_ASSET: return createContractAsset();
			case FhirPackage.CONTRACT_CONTENT_DEFINITION: return createContractContentDefinition();
			case FhirPackage.CONTRACT_CONTEXT: return createContractContext();
			case FhirPackage.CONTRACT_FRIENDLY: return createContractFriendly();
			case FhirPackage.CONTRACT_LEGAL: return createContractLegal();
			case FhirPackage.CONTRACT_OFFER: return createContractOffer();
			case FhirPackage.CONTRACT_PARTY: return createContractParty();
			case FhirPackage.CONTRACT_RESOURCE_PUBLICATION_STATUS_CODES: return createContractResourcePublicationStatusCodes();
			case FhirPackage.CONTRACT_RESOURCE_STATUS_CODES: return createContractResourceStatusCodes();
			case FhirPackage.CONTRACT_RULE: return createContractRule();
			case FhirPackage.CONTRACT_SECURITY_LABEL: return createContractSecurityLabel();
			case FhirPackage.CONTRACT_SIGNER: return createContractSigner();
			case FhirPackage.CONTRACT_SUBJECT: return createContractSubject();
			case FhirPackage.CONTRACT_TERM: return createContractTerm();
			case FhirPackage.CONTRACT_VALUED_ITEM: return createContractValuedItem();
			case FhirPackage.CONTRIBUTOR: return createContributor();
			case FhirPackage.CONTRIBUTOR_TYPE: return createContributorType();
			case FhirPackage.COUNT: return createCount();
			case FhirPackage.COVERAGE: return createCoverage();
			case FhirPackage.COVERAGE_CLASS: return createCoverageClass();
			case FhirPackage.COVERAGE_COST_TO_BENEFICIARY: return createCoverageCostToBeneficiary();
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST: return createCoverageEligibilityRequest();
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_DIAGNOSIS: return createCoverageEligibilityRequestDiagnosis();
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_INSURANCE: return createCoverageEligibilityRequestInsurance();
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM: return createCoverageEligibilityRequestItem();
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_SUPPORTING_INFO: return createCoverageEligibilityRequestSupportingInfo();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE: return createCoverageEligibilityResponse();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT: return createCoverageEligibilityResponseBenefit();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ERROR: return createCoverageEligibilityResponseError();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE: return createCoverageEligibilityResponseInsurance();
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM: return createCoverageEligibilityResponseItem();
			case FhirPackage.COVERAGE_EXCEPTION: return createCoverageException();
			case FhirPackage.DATA_REQUIREMENT: return createDataRequirement();
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER: return createDataRequirementCodeFilter();
			case FhirPackage.DATA_REQUIREMENT_DATE_FILTER: return createDataRequirementDateFilter();
			case FhirPackage.DATA_REQUIREMENT_SORT: return createDataRequirementSort();
			case FhirPackage.DATE: return createDate();
			case FhirPackage.DATE_TIME: return createDateTime();
			case FhirPackage.DAYS_OF_WEEK: return createDaysOfWeek();
			case FhirPackage.DECIMAL: return createDecimal();
			case FhirPackage.DETECTED_ISSUE: return createDetectedIssue();
			case FhirPackage.DETECTED_ISSUE_EVIDENCE: return createDetectedIssueEvidence();
			case FhirPackage.DETECTED_ISSUE_MITIGATION: return createDetectedIssueMitigation();
			case FhirPackage.DETECTED_ISSUE_SEVERITY: return createDetectedIssueSeverity();
			case FhirPackage.DEVICE: return createDevice();
			case FhirPackage.DEVICE_DEFINITION: return createDeviceDefinition();
			case FhirPackage.DEVICE_DEFINITION_CAPABILITY: return createDeviceDefinitionCapability();
			case FhirPackage.DEVICE_DEFINITION_DEVICE_NAME: return createDeviceDefinitionDeviceName();
			case FhirPackage.DEVICE_DEFINITION_MATERIAL: return createDeviceDefinitionMaterial();
			case FhirPackage.DEVICE_DEFINITION_PROPERTY: return createDeviceDefinitionProperty();
			case FhirPackage.DEVICE_DEFINITION_SPECIALIZATION: return createDeviceDefinitionSpecialization();
			case FhirPackage.DEVICE_DEFINITION_UDI_DEVICE_IDENTIFIER: return createDeviceDefinitionUdiDeviceIdentifier();
			case FhirPackage.DEVICE_DEVICE_NAME: return createDeviceDeviceName();
			case FhirPackage.DEVICE_METRIC: return createDeviceMetric();
			case FhirPackage.DEVICE_METRIC_CALIBRATION: return createDeviceMetricCalibration();
			case FhirPackage.DEVICE_METRIC_CALIBRATION_STATE: return createDeviceMetricCalibrationState();
			case FhirPackage.DEVICE_METRIC_CALIBRATION_TYPE: return createDeviceMetricCalibrationType();
			case FhirPackage.DEVICE_METRIC_CATEGORY: return createDeviceMetricCategory();
			case FhirPackage.DEVICE_METRIC_COLOR: return createDeviceMetricColor();
			case FhirPackage.DEVICE_METRIC_OPERATIONAL_STATUS: return createDeviceMetricOperationalStatus();
			case FhirPackage.DEVICE_NAME_TYPE: return createDeviceNameType();
			case FhirPackage.DEVICE_PROPERTY: return createDeviceProperty();
			case FhirPackage.DEVICE_REQUEST: return createDeviceRequest();
			case FhirPackage.DEVICE_REQUEST_PARAMETER: return createDeviceRequestParameter();
			case FhirPackage.DEVICE_SPECIALIZATION: return createDeviceSpecialization();
			case FhirPackage.DEVICE_UDI_CARRIER: return createDeviceUdiCarrier();
			case FhirPackage.DEVICE_USE_STATEMENT: return createDeviceUseStatement();
			case FhirPackage.DEVICE_USE_STATEMENT_STATUS: return createDeviceUseStatementStatus();
			case FhirPackage.DEVICE_VERSION: return createDeviceVersion();
			case FhirPackage.DIAGNOSTIC_REPORT: return createDiagnosticReport();
			case FhirPackage.DIAGNOSTIC_REPORT_MEDIA: return createDiagnosticReportMedia();
			case FhirPackage.DIAGNOSTIC_REPORT_STATUS: return createDiagnosticReportStatus();
			case FhirPackage.DISCRIMINATOR_TYPE: return createDiscriminatorType();
			case FhirPackage.DISTANCE: return createDistance();
			case FhirPackage.DOCUMENT_MANIFEST: return createDocumentManifest();
			case FhirPackage.DOCUMENT_MANIFEST_RELATED: return createDocumentManifestRelated();
			case FhirPackage.DOCUMENT_MODE: return createDocumentMode();
			case FhirPackage.DOCUMENT_REFERENCE: return createDocumentReference();
			case FhirPackage.DOCUMENT_REFERENCE_CONTENT: return createDocumentReferenceContent();
			case FhirPackage.DOCUMENT_REFERENCE_CONTEXT: return createDocumentReferenceContext();
			case FhirPackage.DOCUMENT_REFERENCE_RELATES_TO: return createDocumentReferenceRelatesTo();
			case FhirPackage.DOCUMENT_REFERENCE_STATUS: return createDocumentReferenceStatus();
			case FhirPackage.DOCUMENT_RELATIONSHIP_TYPE: return createDocumentRelationshipType();
			case FhirPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case FhirPackage.DOMAIN_RESOURCE: return createDomainResource();
			case FhirPackage.DOSAGE: return createDosage();
			case FhirPackage.DOSAGE_DOSE_AND_RATE: return createDosageDoseAndRate();
			case FhirPackage.DURATION: return createDuration();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS: return createEffectEvidenceSynthesis();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS_CERTAINTY: return createEffectEvidenceSynthesisCertainty();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS_CERTAINTY_SUBCOMPONENT: return createEffectEvidenceSynthesisCertaintySubcomponent();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE: return createEffectEvidenceSynthesisEffectEstimate();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS_PRECISION_ESTIMATE: return createEffectEvidenceSynthesisPrecisionEstimate();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS_RESULTS_BY_EXPOSURE: return createEffectEvidenceSynthesisResultsByExposure();
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS_SAMPLE_SIZE: return createEffectEvidenceSynthesisSampleSize();
			case FhirPackage.ELEMENT: return createElement();
			case FhirPackage.ELEMENT_DEFINITION: return createElementDefinition();
			case FhirPackage.ELEMENT_DEFINITION_BASE: return createElementDefinitionBase();
			case FhirPackage.ELEMENT_DEFINITION_BINDING: return createElementDefinitionBinding();
			case FhirPackage.ELEMENT_DEFINITION_CONSTRAINT: return createElementDefinitionConstraint();
			case FhirPackage.ELEMENT_DEFINITION_DISCRIMINATOR: return createElementDefinitionDiscriminator();
			case FhirPackage.ELEMENT_DEFINITION_EXAMPLE: return createElementDefinitionExample();
			case FhirPackage.ELEMENT_DEFINITION_MAPPING: return createElementDefinitionMapping();
			case FhirPackage.ELEMENT_DEFINITION_SLICING: return createElementDefinitionSlicing();
			case FhirPackage.ELEMENT_DEFINITION_TYPE: return createElementDefinitionType();
			case FhirPackage.ELIGIBILITY_REQUEST_PURPOSE: return createEligibilityRequestPurpose();
			case FhirPackage.ELIGIBILITY_RESPONSE_PURPOSE: return createEligibilityResponsePurpose();
			case FhirPackage.ENABLE_WHEN_BEHAVIOR: return createEnableWhenBehavior();
			case FhirPackage.ENCOUNTER: return createEncounter();
			case FhirPackage.ENCOUNTER_CLASS_HISTORY: return createEncounterClassHistory();
			case FhirPackage.ENCOUNTER_DIAGNOSIS: return createEncounterDiagnosis();
			case FhirPackage.ENCOUNTER_HOSPITALIZATION: return createEncounterHospitalization();
			case FhirPackage.ENCOUNTER_LOCATION: return createEncounterLocation();
			case FhirPackage.ENCOUNTER_LOCATION_STATUS: return createEncounterLocationStatus();
			case FhirPackage.ENCOUNTER_PARTICIPANT: return createEncounterParticipant();
			case FhirPackage.ENCOUNTER_STATUS: return createEncounterStatus();
			case FhirPackage.ENCOUNTER_STATUS_HISTORY: return createEncounterStatusHistory();
			case FhirPackage.ENDPOINT: return createEndpoint();
			case FhirPackage.ENDPOINT_STATUS: return createEndpointStatus();
			case FhirPackage.ENROLLMENT_REQUEST: return createEnrollmentRequest();
			case FhirPackage.ENROLLMENT_RESPONSE: return createEnrollmentResponse();
			case FhirPackage.EPISODE_OF_CARE: return createEpisodeOfCare();
			case FhirPackage.EPISODE_OF_CARE_DIAGNOSIS: return createEpisodeOfCareDiagnosis();
			case FhirPackage.EPISODE_OF_CARE_STATUS: return createEpisodeOfCareStatus();
			case FhirPackage.EPISODE_OF_CARE_STATUS_HISTORY: return createEpisodeOfCareStatusHistory();
			case FhirPackage.EVENT_CAPABILITY_MODE: return createEventCapabilityMode();
			case FhirPackage.EVENT_DEFINITION: return createEventDefinition();
			case FhirPackage.EVENT_STATUS: return createEventStatus();
			case FhirPackage.EVENT_TIMING: return createEventTiming();
			case FhirPackage.EVIDENCE: return createEvidence();
			case FhirPackage.EVIDENCE_VARIABLE: return createEvidenceVariable();
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC: return createEvidenceVariableCharacteristic();
			case FhirPackage.EVIDENCE_VARIABLE_TYPE: return createEvidenceVariableType();
			case FhirPackage.EXAMPLE_SCENARIO: return createExampleScenario();
			case FhirPackage.EXAMPLE_SCENARIO_ACTOR: return createExampleScenarioActor();
			case FhirPackage.EXAMPLE_SCENARIO_ACTOR_TYPE: return createExampleScenarioActorType();
			case FhirPackage.EXAMPLE_SCENARIO_ALTERNATIVE: return createExampleScenarioAlternative();
			case FhirPackage.EXAMPLE_SCENARIO_CONTAINED_INSTANCE: return createExampleScenarioContainedInstance();
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE: return createExampleScenarioInstance();
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION: return createExampleScenarioOperation();
			case FhirPackage.EXAMPLE_SCENARIO_PROCESS: return createExampleScenarioProcess();
			case FhirPackage.EXAMPLE_SCENARIO_STEP: return createExampleScenarioStep();
			case FhirPackage.EXAMPLE_SCENARIO_VERSION: return createExampleScenarioVersion();
			case FhirPackage.EXPLANATION_OF_BENEFIT: return createExplanationOfBenefit();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ACCIDENT: return createExplanationOfBenefitAccident();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ADD_ITEM: return createExplanationOfBenefitAddItem();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ADJUDICATION: return createExplanationOfBenefitAdjudication();
			case FhirPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE: return createExplanationOfBenefitBenefitBalance();
			case FhirPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM: return createExplanationOfBenefitCareTeam();
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL: return createExplanationOfBenefitDetail();
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL1: return createExplanationOfBenefitDetail1();
			case FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS: return createExplanationOfBenefitDiagnosis();
			case FhirPackage.EXPLANATION_OF_BENEFIT_FINANCIAL: return createExplanationOfBenefitFinancial();
			case FhirPackage.EXPLANATION_OF_BENEFIT_INSURANCE: return createExplanationOfBenefitInsurance();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM: return createExplanationOfBenefitItem();
			case FhirPackage.EXPLANATION_OF_BENEFIT_PAYEE: return createExplanationOfBenefitPayee();
			case FhirPackage.EXPLANATION_OF_BENEFIT_PAYMENT: return createExplanationOfBenefitPayment();
			case FhirPackage.EXPLANATION_OF_BENEFIT_PROCEDURE: return createExplanationOfBenefitProcedure();
			case FhirPackage.EXPLANATION_OF_BENEFIT_PROCESS_NOTE: return createExplanationOfBenefitProcessNote();
			case FhirPackage.EXPLANATION_OF_BENEFIT_RELATED: return createExplanationOfBenefitRelated();
			case FhirPackage.EXPLANATION_OF_BENEFIT_STATUS: return createExplanationOfBenefitStatus();
			case FhirPackage.EXPLANATION_OF_BENEFIT_SUB_DETAIL: return createExplanationOfBenefitSubDetail();
			case FhirPackage.EXPLANATION_OF_BENEFIT_SUB_DETAIL1: return createExplanationOfBenefitSubDetail1();
			case FhirPackage.EXPLANATION_OF_BENEFIT_SUPPORTING_INFO: return createExplanationOfBenefitSupportingInfo();
			case FhirPackage.EXPLANATION_OF_BENEFIT_TOTAL: return createExplanationOfBenefitTotal();
			case FhirPackage.EXPOSURE_STATE: return createExposureState();
			case FhirPackage.EXPRESSION: return createExpression();
			case FhirPackage.EXPRESSION_LANGUAGE: return createExpressionLanguage();
			case FhirPackage.EXTENSION: return createExtension();
			case FhirPackage.EXTENSION_CONTEXT_TYPE: return createExtensionContextType();
			case FhirPackage.FAMILY_HISTORY_STATUS: return createFamilyHistoryStatus();
			case FhirPackage.FAMILY_MEMBER_HISTORY: return createFamilyMemberHistory();
			case FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION: return createFamilyMemberHistoryCondition();
			case FhirPackage.FHIR_DEVICE_STATUS: return createFHIRDeviceStatus();
			case FhirPackage.FHIR_SUBSTANCE_STATUS: return createFHIRSubstanceStatus();
			case FhirPackage.FHIR_VERSION: return createFHIRVersion();
			case FhirPackage.FILTER_OPERATOR: return createFilterOperator();
			case FhirPackage.FINANCIAL_RESOURCE_STATUS_CODES: return createFinancialResourceStatusCodes();
			case FhirPackage.FLAG: return createFlag();
			case FhirPackage.FLAG_STATUS: return createFlagStatus();
			case FhirPackage.GOAL: return createGoal();
			case FhirPackage.GOAL_LIFECYCLE_STATUS: return createGoalLifecycleStatus();
			case FhirPackage.GOAL_TARGET: return createGoalTarget();
			case FhirPackage.GRAPH_COMPARTMENT_RULE: return createGraphCompartmentRule();
			case FhirPackage.GRAPH_COMPARTMENT_USE: return createGraphCompartmentUse();
			case FhirPackage.GRAPH_DEFINITION: return createGraphDefinition();
			case FhirPackage.GRAPH_DEFINITION_COMPARTMENT: return createGraphDefinitionCompartment();
			case FhirPackage.GRAPH_DEFINITION_LINK: return createGraphDefinitionLink();
			case FhirPackage.GRAPH_DEFINITION_TARGET: return createGraphDefinitionTarget();
			case FhirPackage.GROUP: return createGroup();
			case FhirPackage.GROUP_CHARACTERISTIC: return createGroupCharacteristic();
			case FhirPackage.GROUP_MEASURE: return createGroupMeasure();
			case FhirPackage.GROUP_MEMBER: return createGroupMember();
			case FhirPackage.GROUP_TYPE: return createGroupType();
			case FhirPackage.GUIDANCE_RESPONSE: return createGuidanceResponse();
			case FhirPackage.GUIDANCE_RESPONSE_STATUS: return createGuidanceResponseStatus();
			case FhirPackage.GUIDE_PAGE_GENERATION: return createGuidePageGeneration();
			case FhirPackage.GUIDE_PARAMETER_CODE: return createGuideParameterCode();
			case FhirPackage.HEALTHCARE_SERVICE: return createHealthcareService();
			case FhirPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME: return createHealthcareServiceAvailableTime();
			case FhirPackage.HEALTHCARE_SERVICE_ELIGIBILITY: return createHealthcareServiceEligibility();
			case FhirPackage.HEALTHCARE_SERVICE_NOT_AVAILABLE: return createHealthcareServiceNotAvailable();
			case FhirPackage.HTTP_VERB: return createHTTPVerb();
			case FhirPackage.HUMAN_NAME: return createHumanName();
			case FhirPackage.ID: return createId();
			case FhirPackage.IDENTIFIER: return createIdentifier();
			case FhirPackage.IDENTIFIER_USE: return createIdentifierUse();
			case FhirPackage.IDENTITY_ASSURANCE_LEVEL: return createIdentityAssuranceLevel();
			case FhirPackage.IMAGING_STUDY: return createImagingStudy();
			case FhirPackage.IMAGING_STUDY_INSTANCE: return createImagingStudyInstance();
			case FhirPackage.IMAGING_STUDY_PERFORMER: return createImagingStudyPerformer();
			case FhirPackage.IMAGING_STUDY_SERIES: return createImagingStudySeries();
			case FhirPackage.IMAGING_STUDY_STATUS: return createImagingStudyStatus();
			case FhirPackage.IMMUNIZATION: return createImmunization();
			case FhirPackage.IMMUNIZATION_EDUCATION: return createImmunizationEducation();
			case FhirPackage.IMMUNIZATION_EVALUATION: return createImmunizationEvaluation();
			case FhirPackage.IMMUNIZATION_EVALUATION_STATUS_CODES: return createImmunizationEvaluationStatusCodes();
			case FhirPackage.IMMUNIZATION_PERFORMER: return createImmunizationPerformer();
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED: return createImmunizationProtocolApplied();
			case FhirPackage.IMMUNIZATION_REACTION: return createImmunizationReaction();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION: return createImmunizationRecommendation();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_DATE_CRITERION: return createImmunizationRecommendationDateCriterion();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION: return createImmunizationRecommendationRecommendation();
			case FhirPackage.IMMUNIZATION_STATUS_CODES: return createImmunizationStatusCodes();
			case FhirPackage.IMPLEMENTATION_GUIDE: return createImplementationGuide();
			case FhirPackage.IMPLEMENTATION_GUIDE_DEFINITION: return createImplementationGuideDefinition();
			case FhirPackage.IMPLEMENTATION_GUIDE_DEPENDS_ON: return createImplementationGuideDependsOn();
			case FhirPackage.IMPLEMENTATION_GUIDE_GLOBAL: return createImplementationGuideGlobal();
			case FhirPackage.IMPLEMENTATION_GUIDE_GROUPING: return createImplementationGuideGrouping();
			case FhirPackage.IMPLEMENTATION_GUIDE_MANIFEST: return createImplementationGuideManifest();
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE: return createImplementationGuidePage();
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE1: return createImplementationGuidePage1();
			case FhirPackage.IMPLEMENTATION_GUIDE_PARAMETER: return createImplementationGuideParameter();
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE: return createImplementationGuideResource();
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1: return createImplementationGuideResource1();
			case FhirPackage.IMPLEMENTATION_GUIDE_TEMPLATE: return createImplementationGuideTemplate();
			case FhirPackage.INSTANT: return createInstant();
			case FhirPackage.INSURANCE_PLAN: return createInsurancePlan();
			case FhirPackage.INSURANCE_PLAN_BENEFIT: return createInsurancePlanBenefit();
			case FhirPackage.INSURANCE_PLAN_BENEFIT1: return createInsurancePlanBenefit1();
			case FhirPackage.INSURANCE_PLAN_CONTACT: return createInsurancePlanContact();
			case FhirPackage.INSURANCE_PLAN_COST: return createInsurancePlanCost();
			case FhirPackage.INSURANCE_PLAN_COVERAGE: return createInsurancePlanCoverage();
			case FhirPackage.INSURANCE_PLAN_GENERAL_COST: return createInsurancePlanGeneralCost();
			case FhirPackage.INSURANCE_PLAN_LIMIT: return createInsurancePlanLimit();
			case FhirPackage.INSURANCE_PLAN_PLAN: return createInsurancePlanPlan();
			case FhirPackage.INSURANCE_PLAN_SPECIFIC_COST: return createInsurancePlanSpecificCost();
			case FhirPackage.INTEGER: return createInteger();
			case FhirPackage.INVOICE: return createInvoice();
			case FhirPackage.INVOICE_LINE_ITEM: return createInvoiceLineItem();
			case FhirPackage.INVOICE_PARTICIPANT: return createInvoiceParticipant();
			case FhirPackage.INVOICE_PRICE_COMPONENT: return createInvoicePriceComponent();
			case FhirPackage.INVOICE_PRICE_COMPONENT_TYPE: return createInvoicePriceComponentType();
			case FhirPackage.INVOICE_STATUS: return createInvoiceStatus();
			case FhirPackage.ISSUE_SEVERITY: return createIssueSeverity();
			case FhirPackage.ISSUE_TYPE: return createIssueType();
			case FhirPackage.LIBRARY: return createLibrary();
			case FhirPackage.LINKAGE: return createLinkage();
			case FhirPackage.LINKAGE_ITEM: return createLinkageItem();
			case FhirPackage.LINKAGE_TYPE: return createLinkageType();
			case FhirPackage.LINK_TYPE: return createLinkType();
			case FhirPackage.LIST: return createList();
			case FhirPackage.LIST_ENTRY: return createListEntry();
			case FhirPackage.LIST_MODE: return createListMode();
			case FhirPackage.LIST_STATUS: return createListStatus();
			case FhirPackage.LOCATION: return createLocation();
			case FhirPackage.LOCATION_HOURS_OF_OPERATION: return createLocationHoursOfOperation();
			case FhirPackage.LOCATION_MODE: return createLocationMode();
			case FhirPackage.LOCATION_POSITION: return createLocationPosition();
			case FhirPackage.LOCATION_STATUS: return createLocationStatus();
			case FhirPackage.MARKDOWN: return createMarkdown();
			case FhirPackage.MARKETING_STATUS: return createMarketingStatus();
			case FhirPackage.MEASURE: return createMeasure();
			case FhirPackage.MEASURE_COMPONENT: return createMeasureComponent();
			case FhirPackage.MEASURE_GROUP: return createMeasureGroup();
			case FhirPackage.MEASURE_POPULATION: return createMeasurePopulation();
			case FhirPackage.MEASURE_REPORT: return createMeasureReport();
			case FhirPackage.MEASURE_REPORT_COMPONENT: return createMeasureReportComponent();
			case FhirPackage.MEASURE_REPORT_GROUP: return createMeasureReportGroup();
			case FhirPackage.MEASURE_REPORT_POPULATION: return createMeasureReportPopulation();
			case FhirPackage.MEASURE_REPORT_POPULATION1: return createMeasureReportPopulation1();
			case FhirPackage.MEASURE_REPORT_STATUS: return createMeasureReportStatus();
			case FhirPackage.MEASURE_REPORT_STRATIFIER: return createMeasureReportStratifier();
			case FhirPackage.MEASURE_REPORT_STRATUM: return createMeasureReportStratum();
			case FhirPackage.MEASURE_REPORT_TYPE: return createMeasureReportType();
			case FhirPackage.MEASURE_STRATIFIER: return createMeasureStratifier();
			case FhirPackage.MEASURE_SUPPLEMENTAL_DATA: return createMeasureSupplementalData();
			case FhirPackage.MEDIA: return createMedia();
			case FhirPackage.MEDICATION: return createMedication();
			case FhirPackage.MEDICATION_ADMINISTRATION: return createMedicationAdministration();
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE: return createMedicationAdministrationDosage();
			case FhirPackage.MEDICATION_ADMINISTRATION_PERFORMER: return createMedicationAdministrationPerformer();
			case FhirPackage.MEDICATION_BATCH: return createMedicationBatch();
			case FhirPackage.MEDICATION_DISPENSE: return createMedicationDispense();
			case FhirPackage.MEDICATION_DISPENSE_PERFORMER: return createMedicationDispensePerformer();
			case FhirPackage.MEDICATION_DISPENSE_SUBSTITUTION: return createMedicationDispenseSubstitution();
			case FhirPackage.MEDICATION_INGREDIENT: return createMedicationIngredient();
			case FhirPackage.MEDICATION_KNOWLEDGE: return createMedicationKnowledge();
			case FhirPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES: return createMedicationKnowledgeAdministrationGuidelines();
			case FhirPackage.MEDICATION_KNOWLEDGE_COST: return createMedicationKnowledgeCost();
			case FhirPackage.MEDICATION_KNOWLEDGE_DOSAGE: return createMedicationKnowledgeDosage();
			case FhirPackage.MEDICATION_KNOWLEDGE_DRUG_CHARACTERISTIC: return createMedicationKnowledgeDrugCharacteristic();
			case FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT: return createMedicationKnowledgeIngredient();
			case FhirPackage.MEDICATION_KNOWLEDGE_KINETICS: return createMedicationKnowledgeKinetics();
			case FhirPackage.MEDICATION_KNOWLEDGE_MAX_DISPENSE: return createMedicationKnowledgeMaxDispense();
			case FhirPackage.MEDICATION_KNOWLEDGE_MEDICINE_CLASSIFICATION: return createMedicationKnowledgeMedicineClassification();
			case FhirPackage.MEDICATION_KNOWLEDGE_MONITORING_PROGRAM: return createMedicationKnowledgeMonitoringProgram();
			case FhirPackage.MEDICATION_KNOWLEDGE_MONOGRAPH: return createMedicationKnowledgeMonograph();
			case FhirPackage.MEDICATION_KNOWLEDGE_PACKAGING: return createMedicationKnowledgePackaging();
			case FhirPackage.MEDICATION_KNOWLEDGE_PATIENT_CHARACTERISTICS: return createMedicationKnowledgePatientCharacteristics();
			case FhirPackage.MEDICATION_KNOWLEDGE_REGULATORY: return createMedicationKnowledgeRegulatory();
			case FhirPackage.MEDICATION_KNOWLEDGE_RELATED_MEDICATION_KNOWLEDGE: return createMedicationKnowledgeRelatedMedicationKnowledge();
			case FhirPackage.MEDICATION_KNOWLEDGE_SCHEDULE: return createMedicationKnowledgeSchedule();
			case FhirPackage.MEDICATION_KNOWLEDGE_SUBSTITUTION: return createMedicationKnowledgeSubstitution();
			case FhirPackage.MEDICATION_REQUEST: return createMedicationRequest();
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST: return createMedicationRequestDispenseRequest();
			case FhirPackage.MEDICATION_REQUEST_INITIAL_FILL: return createMedicationRequestInitialFill();
			case FhirPackage.MEDICATION_REQUEST_INTENT: return createMedicationRequestIntent();
			case FhirPackage.MEDICATIONREQUEST_STATUS: return createMedicationrequestStatus();
			case FhirPackage.MEDICATION_REQUEST_SUBSTITUTION: return createMedicationRequestSubstitution();
			case FhirPackage.MEDICATION_STATEMENT: return createMedicationStatement();
			case FhirPackage.MEDICATION_STATUS_CODES: return createMedicationStatusCodes();
			case FhirPackage.MEDICINAL_PRODUCT: return createMedicinalProduct();
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION: return createMedicinalProductAuthorization();
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_JURISDICTIONAL_AUTHORIZATION: return createMedicinalProductAuthorizationJurisdictionalAuthorization();
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE: return createMedicinalProductAuthorizationProcedure();
			case FhirPackage.MEDICINAL_PRODUCT_CONTRAINDICATION: return createMedicinalProductContraindication();
			case FhirPackage.MEDICINAL_PRODUCT_CONTRAINDICATION_OTHER_THERAPY: return createMedicinalProductContraindicationOtherTherapy();
			case FhirPackage.MEDICINAL_PRODUCT_COUNTRY_LANGUAGE: return createMedicinalProductCountryLanguage();
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION: return createMedicinalProductIndication();
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION_OTHER_THERAPY: return createMedicinalProductIndicationOtherTherapy();
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT: return createMedicinalProductIngredient();
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_REFERENCE_STRENGTH: return createMedicinalProductIngredientReferenceStrength();
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE: return createMedicinalProductIngredientSpecifiedSubstance();
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH: return createMedicinalProductIngredientStrength();
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_SUBSTANCE: return createMedicinalProductIngredientSubstance();
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION: return createMedicinalProductInteraction();
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION_INTERACTANT: return createMedicinalProductInteractionInteractant();
			case FhirPackage.MEDICINAL_PRODUCT_MANUFACTURED: return createMedicinalProductManufactured();
			case FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION: return createMedicinalProductManufacturingBusinessOperation();
			case FhirPackage.MEDICINAL_PRODUCT_NAME: return createMedicinalProductName();
			case FhirPackage.MEDICINAL_PRODUCT_NAME_PART: return createMedicinalProductNamePart();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED: return createMedicinalProductPackaged();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_BATCH_IDENTIFIER: return createMedicinalProductPackagedBatchIdentifier();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM: return createMedicinalProductPackagedPackageItem();
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL: return createMedicinalProductPharmaceutical();
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_CHARACTERISTICS: return createMedicinalProductPharmaceuticalCharacteristics();
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_ROUTE_OF_ADMINISTRATION: return createMedicinalProductPharmaceuticalRouteOfAdministration();
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_TARGET_SPECIES: return createMedicinalProductPharmaceuticalTargetSpecies();
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_WITHDRAWAL_PERIOD: return createMedicinalProductPharmaceuticalWithdrawalPeriod();
			case FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION: return createMedicinalProductSpecialDesignation();
			case FhirPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT: return createMedicinalProductUndesirableEffect();
			case FhirPackage.MESSAGE_DEFINITION: return createMessageDefinition();
			case FhirPackage.MESSAGE_DEFINITION_ALLOWED_RESPONSE: return createMessageDefinitionAllowedResponse();
			case FhirPackage.MESSAGE_DEFINITION_FOCUS: return createMessageDefinitionFocus();
			case FhirPackage.MESSAGE_HEADER: return createMessageHeader();
			case FhirPackage.MESSAGE_HEADER_DESTINATION: return createMessageHeaderDestination();
			case FhirPackage.MESSAGE_HEADER_RESPONSE: return createMessageHeaderResponse();
			case FhirPackage.MESSAGEHEADER_RESPONSE_REQUEST: return createMessageheaderResponseRequest();
			case FhirPackage.MESSAGE_HEADER_SOURCE: return createMessageHeaderSource();
			case FhirPackage.MESSAGE_SIGNIFICANCE_CATEGORY: return createMessageSignificanceCategory();
			case FhirPackage.META: return createMeta();
			case FhirPackage.MOLECULAR_SEQUENCE: return createMolecularSequence();
			case FhirPackage.MOLECULAR_SEQUENCE_INNER: return createMolecularSequenceInner();
			case FhirPackage.MOLECULAR_SEQUENCE_OUTER: return createMolecularSequenceOuter();
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY: return createMolecularSequenceQuality();
			case FhirPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ: return createMolecularSequenceReferenceSeq();
			case FhirPackage.MOLECULAR_SEQUENCE_REPOSITORY: return createMolecularSequenceRepository();
			case FhirPackage.MOLECULAR_SEQUENCE_ROC: return createMolecularSequenceRoc();
			case FhirPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT: return createMolecularSequenceStructureVariant();
			case FhirPackage.MOLECULAR_SEQUENCE_VARIANT: return createMolecularSequenceVariant();
			case FhirPackage.MONEY: return createMoney();
			case FhirPackage.NAME_USE: return createNameUse();
			case FhirPackage.NAMING_SYSTEM: return createNamingSystem();
			case FhirPackage.NAMING_SYSTEM_IDENTIFIER_TYPE: return createNamingSystemIdentifierType();
			case FhirPackage.NAMING_SYSTEM_TYPE: return createNamingSystemType();
			case FhirPackage.NAMING_SYSTEM_UNIQUE_ID: return createNamingSystemUniqueId();
			case FhirPackage.NARRATIVE: return createNarrative();
			case FhirPackage.NARRATIVE_STATUS: return createNarrativeStatus();
			case FhirPackage.NOTE_TYPE: return createNoteType();
			case FhirPackage.NUTRITION_ORDER: return createNutritionOrder();
			case FhirPackage.NUTRITION_ORDER_ADMINISTRATION: return createNutritionOrderAdministration();
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA: return createNutritionOrderEnteralFormula();
			case FhirPackage.NUTRITION_ORDER_NUTRIENT: return createNutritionOrderNutrient();
			case FhirPackage.NUTRITION_ORDER_ORAL_DIET: return createNutritionOrderOralDiet();
			case FhirPackage.NUTRITION_ORDER_SUPPLEMENT: return createNutritionOrderSupplement();
			case FhirPackage.NUTRITION_ORDER_TEXTURE: return createNutritionOrderTexture();
			case FhirPackage.OBSERVATION: return createObservation();
			case FhirPackage.OBSERVATION_COMPONENT: return createObservationComponent();
			case FhirPackage.OBSERVATION_DATA_TYPE: return createObservationDataType();
			case FhirPackage.OBSERVATION_DEFINITION: return createObservationDefinition();
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL: return createObservationDefinitionQualifiedInterval();
			case FhirPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS: return createObservationDefinitionQuantitativeDetails();
			case FhirPackage.OBSERVATION_RANGE_CATEGORY: return createObservationRangeCategory();
			case FhirPackage.OBSERVATION_REFERENCE_RANGE: return createObservationReferenceRange();
			case FhirPackage.OBSERVATION_STATUS: return createObservationStatus();
			case FhirPackage.OID: return createOid();
			case FhirPackage.OPERATION_DEFINITION: return createOperationDefinition();
			case FhirPackage.OPERATION_DEFINITION_BINDING: return createOperationDefinitionBinding();
			case FhirPackage.OPERATION_DEFINITION_OVERLOAD: return createOperationDefinitionOverload();
			case FhirPackage.OPERATION_DEFINITION_PARAMETER: return createOperationDefinitionParameter();
			case FhirPackage.OPERATION_DEFINITION_REFERENCED_FROM: return createOperationDefinitionReferencedFrom();
			case FhirPackage.OPERATION_KIND: return createOperationKind();
			case FhirPackage.OPERATION_OUTCOME: return createOperationOutcome();
			case FhirPackage.OPERATION_OUTCOME_ISSUE: return createOperationOutcomeIssue();
			case FhirPackage.OPERATION_PARAMETER_USE: return createOperationParameterUse();
			case FhirPackage.ORGANIZATION: return createOrganization();
			case FhirPackage.ORGANIZATION_AFFILIATION: return createOrganizationAffiliation();
			case FhirPackage.ORGANIZATION_CONTACT: return createOrganizationContact();
			case FhirPackage.ORIENTATION_TYPE: return createOrientationType();
			case FhirPackage.PARAMETER_DEFINITION: return createParameterDefinition();
			case FhirPackage.PARAMETERS: return createParameters();
			case FhirPackage.PARAMETERS_PARAMETER: return createParametersParameter();
			case FhirPackage.PARTICIPANT_REQUIRED: return createParticipantRequired();
			case FhirPackage.PARTICIPATION_STATUS: return createParticipationStatus();
			case FhirPackage.PATIENT: return createPatient();
			case FhirPackage.PATIENT_COMMUNICATION: return createPatientCommunication();
			case FhirPackage.PATIENT_CONTACT: return createPatientContact();
			case FhirPackage.PATIENT_LINK: return createPatientLink();
			case FhirPackage.PAYMENT_NOTICE: return createPaymentNotice();
			case FhirPackage.PAYMENT_RECONCILIATION: return createPaymentReconciliation();
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL: return createPaymentReconciliationDetail();
			case FhirPackage.PAYMENT_RECONCILIATION_PROCESS_NOTE: return createPaymentReconciliationProcessNote();
			case FhirPackage.PERIOD: return createPeriod();
			case FhirPackage.PERSON: return createPerson();
			case FhirPackage.PERSON_LINK: return createPersonLink();
			case FhirPackage.PLAN_DEFINITION: return createPlanDefinition();
			case FhirPackage.PLAN_DEFINITION_ACTION: return createPlanDefinitionAction();
			case FhirPackage.PLAN_DEFINITION_CONDITION: return createPlanDefinitionCondition();
			case FhirPackage.PLAN_DEFINITION_DYNAMIC_VALUE: return createPlanDefinitionDynamicValue();
			case FhirPackage.PLAN_DEFINITION_GOAL: return createPlanDefinitionGoal();
			case FhirPackage.PLAN_DEFINITION_PARTICIPANT: return createPlanDefinitionParticipant();
			case FhirPackage.PLAN_DEFINITION_RELATED_ACTION: return createPlanDefinitionRelatedAction();
			case FhirPackage.PLAN_DEFINITION_TARGET: return createPlanDefinitionTarget();
			case FhirPackage.POPULATION: return createPopulation();
			case FhirPackage.POSITIVE_INT: return createPositiveInt();
			case FhirPackage.PRACTITIONER: return createPractitioner();
			case FhirPackage.PRACTITIONER_QUALIFICATION: return createPractitionerQualification();
			case FhirPackage.PRACTITIONER_ROLE: return createPractitionerRole();
			case FhirPackage.PRACTITIONER_ROLE_AVAILABLE_TIME: return createPractitionerRoleAvailableTime();
			case FhirPackage.PRACTITIONER_ROLE_NOT_AVAILABLE: return createPractitionerRoleNotAvailable();
			case FhirPackage.PROCEDURE: return createProcedure();
			case FhirPackage.PROCEDURE_FOCAL_DEVICE: return createProcedureFocalDevice();
			case FhirPackage.PROCEDURE_PERFORMER: return createProcedurePerformer();
			case FhirPackage.PROD_CHARACTERISTIC: return createProdCharacteristic();
			case FhirPackage.PRODUCT_SHELF_LIFE: return createProductShelfLife();
			case FhirPackage.PROPERTY_REPRESENTATION: return createPropertyRepresentation();
			case FhirPackage.PROPERTY_TYPE: return createPropertyType();
			case FhirPackage.PROVENANCE: return createProvenance();
			case FhirPackage.PROVENANCE_AGENT: return createProvenanceAgent();
			case FhirPackage.PROVENANCE_ENTITY: return createProvenanceEntity();
			case FhirPackage.PROVENANCE_ENTITY_ROLE: return createProvenanceEntityRole();
			case FhirPackage.PUBLICATION_STATUS: return createPublicationStatus();
			case FhirPackage.QUALITY_TYPE: return createQualityType();
			case FhirPackage.QUANTITY: return createQuantity();
			case FhirPackage.QUANTITY_COMPARATOR: return createQuantityComparator();
			case FhirPackage.QUESTIONNAIRE: return createQuestionnaire();
			case FhirPackage.QUESTIONNAIRE_ANSWER_OPTION: return createQuestionnaireAnswerOption();
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN: return createQuestionnaireEnableWhen();
			case FhirPackage.QUESTIONNAIRE_INITIAL: return createQuestionnaireInitial();
			case FhirPackage.QUESTIONNAIRE_ITEM: return createQuestionnaireItem();
			case FhirPackage.QUESTIONNAIRE_ITEM_OPERATOR: return createQuestionnaireItemOperator();
			case FhirPackage.QUESTIONNAIRE_ITEM_TYPE: return createQuestionnaireItemType();
			case FhirPackage.QUESTIONNAIRE_RESPONSE: return createQuestionnaireResponse();
			case FhirPackage.QUESTIONNAIRE_RESPONSE_ANSWER: return createQuestionnaireResponseAnswer();
			case FhirPackage.QUESTIONNAIRE_RESPONSE_ITEM: return createQuestionnaireResponseItem();
			case FhirPackage.QUESTIONNAIRE_RESPONSE_STATUS: return createQuestionnaireResponseStatus();
			case FhirPackage.RANGE: return createRange();
			case FhirPackage.RATIO: return createRatio();
			case FhirPackage.REFERENCE: return createReference();
			case FhirPackage.REFERENCE_HANDLING_POLICY: return createReferenceHandlingPolicy();
			case FhirPackage.REFERENCE_VERSION_RULES: return createReferenceVersionRules();
			case FhirPackage.RELATED_ARTIFACT: return createRelatedArtifact();
			case FhirPackage.RELATED_ARTIFACT_TYPE: return createRelatedArtifactType();
			case FhirPackage.RELATED_PERSON: return createRelatedPerson();
			case FhirPackage.RELATED_PERSON_COMMUNICATION: return createRelatedPersonCommunication();
			case FhirPackage.REMITTANCE_OUTCOME: return createRemittanceOutcome();
			case FhirPackage.REPOSITORY_TYPE: return createRepositoryType();
			case FhirPackage.REQUEST_GROUP: return createRequestGroup();
			case FhirPackage.REQUEST_GROUP_ACTION: return createRequestGroupAction();
			case FhirPackage.REQUEST_GROUP_CONDITION: return createRequestGroupCondition();
			case FhirPackage.REQUEST_GROUP_RELATED_ACTION: return createRequestGroupRelatedAction();
			case FhirPackage.REQUEST_INTENT: return createRequestIntent();
			case FhirPackage.REQUEST_PRIORITY: return createRequestPriority();
			case FhirPackage.REQUEST_RESOURCE_TYPE: return createRequestResourceType();
			case FhirPackage.REQUEST_STATUS: return createRequestStatus();
			case FhirPackage.RESEARCH_DEFINITION: return createResearchDefinition();
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION: return createResearchElementDefinition();
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC: return createResearchElementDefinitionCharacteristic();
			case FhirPackage.RESEARCH_ELEMENT_TYPE: return createResearchElementType();
			case FhirPackage.RESEARCH_STUDY: return createResearchStudy();
			case FhirPackage.RESEARCH_STUDY_ARM: return createResearchStudyArm();
			case FhirPackage.RESEARCH_STUDY_OBJECTIVE: return createResearchStudyObjective();
			case FhirPackage.RESEARCH_STUDY_STATUS: return createResearchStudyStatus();
			case FhirPackage.RESEARCH_SUBJECT: return createResearchSubject();
			case FhirPackage.RESEARCH_SUBJECT_STATUS: return createResearchSubjectStatus();
			case FhirPackage.RESOURCE: return createResource();
			case FhirPackage.RESOURCE_CONTAINER: return createResourceContainer();
			case FhirPackage.RESOURCE_TYPE: return createResourceType();
			case FhirPackage.RESOURCE_VERSION_POLICY: return createResourceVersionPolicy();
			case FhirPackage.RESPONSE_TYPE: return createResponseType();
			case FhirPackage.RESTFUL_CAPABILITY_MODE: return createRestfulCapabilityMode();
			case FhirPackage.RISK_ASSESSMENT: return createRiskAssessment();
			case FhirPackage.RISK_ASSESSMENT_PREDICTION: return createRiskAssessmentPrediction();
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS: return createRiskEvidenceSynthesis();
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_CERTAINTY: return createRiskEvidenceSynthesisCertainty();
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_CERTAINTY_SUBCOMPONENT: return createRiskEvidenceSynthesisCertaintySubcomponent();
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_PRECISION_ESTIMATE: return createRiskEvidenceSynthesisPrecisionEstimate();
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE: return createRiskEvidenceSynthesisRiskEstimate();
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_SAMPLE_SIZE: return createRiskEvidenceSynthesisSampleSize();
			case FhirPackage.SAMPLED_DATA: return createSampledData();
			case FhirPackage.SAMPLED_DATA_DATA_TYPE: return createSampledDataDataType();
			case FhirPackage.SCHEDULE: return createSchedule();
			case FhirPackage.SEARCH_COMPARATOR: return createSearchComparator();
			case FhirPackage.SEARCH_ENTRY_MODE: return createSearchEntryMode();
			case FhirPackage.SEARCH_MODIFIER_CODE: return createSearchModifierCode();
			case FhirPackage.SEARCH_PARAMETER: return createSearchParameter();
			case FhirPackage.SEARCH_PARAMETER_COMPONENT: return createSearchParameterComponent();
			case FhirPackage.SEARCH_PARAM_TYPE: return createSearchParamType();
			case FhirPackage.SEQUENCE_TYPE: return createSequenceType();
			case FhirPackage.SERVICE_REQUEST: return createServiceRequest();
			case FhirPackage.SIGNATURE: return createSignature();
			case FhirPackage.SLICING_RULES: return createSlicingRules();
			case FhirPackage.SLOT: return createSlot();
			case FhirPackage.SLOT_STATUS: return createSlotStatus();
			case FhirPackage.SORT_DIRECTION: return createSortDirection();
			case FhirPackage.SPDX_LICENSE: return createSPDXLicense();
			case FhirPackage.SPECIMEN: return createSpecimen();
			case FhirPackage.SPECIMEN_COLLECTION: return createSpecimenCollection();
			case FhirPackage.SPECIMEN_CONTAINED_PREFERENCE: return createSpecimenContainedPreference();
			case FhirPackage.SPECIMEN_CONTAINER: return createSpecimenContainer();
			case FhirPackage.SPECIMEN_DEFINITION: return createSpecimenDefinition();
			case FhirPackage.SPECIMEN_DEFINITION_ADDITIVE: return createSpecimenDefinitionAdditive();
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER: return createSpecimenDefinitionContainer();
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING: return createSpecimenDefinitionHandling();
			case FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED: return createSpecimenDefinitionTypeTested();
			case FhirPackage.SPECIMEN_PROCESSING: return createSpecimenProcessing();
			case FhirPackage.SPECIMEN_STATUS: return createSpecimenStatus();
			case FhirPackage.STATUS: return createStatus();
			case FhirPackage.STRAND_TYPE: return createStrandType();
			case FhirPackage.STRING: return createString();
			case FhirPackage.STRUCTURE_DEFINITION: return createStructureDefinition();
			case FhirPackage.STRUCTURE_DEFINITION_CONTEXT: return createStructureDefinitionContext();
			case FhirPackage.STRUCTURE_DEFINITION_DIFFERENTIAL: return createStructureDefinitionDifferential();
			case FhirPackage.STRUCTURE_DEFINITION_KIND: return createStructureDefinitionKind();
			case FhirPackage.STRUCTURE_DEFINITION_MAPPING: return createStructureDefinitionMapping();
			case FhirPackage.STRUCTURE_DEFINITION_SNAPSHOT: return createStructureDefinitionSnapshot();
			case FhirPackage.STRUCTURE_MAP: return createStructureMap();
			case FhirPackage.STRUCTURE_MAP_CONTEXT_TYPE: return createStructureMapContextType();
			case FhirPackage.STRUCTURE_MAP_DEPENDENT: return createStructureMapDependent();
			case FhirPackage.STRUCTURE_MAP_GROUP: return createStructureMapGroup();
			case FhirPackage.STRUCTURE_MAP_GROUP_TYPE_MODE: return createStructureMapGroupTypeMode();
			case FhirPackage.STRUCTURE_MAP_INPUT: return createStructureMapInput();
			case FhirPackage.STRUCTURE_MAP_INPUT_MODE: return createStructureMapInputMode();
			case FhirPackage.STRUCTURE_MAP_MODEL_MODE: return createStructureMapModelMode();
			case FhirPackage.STRUCTURE_MAP_PARAMETER: return createStructureMapParameter();
			case FhirPackage.STRUCTURE_MAP_RULE: return createStructureMapRule();
			case FhirPackage.STRUCTURE_MAP_SOURCE: return createStructureMapSource();
			case FhirPackage.STRUCTURE_MAP_SOURCE_LIST_MODE: return createStructureMapSourceListMode();
			case FhirPackage.STRUCTURE_MAP_STRUCTURE: return createStructureMapStructure();
			case FhirPackage.STRUCTURE_MAP_TARGET: return createStructureMapTarget();
			case FhirPackage.STRUCTURE_MAP_TARGET_LIST_MODE: return createStructureMapTargetListMode();
			case FhirPackage.STRUCTURE_MAP_TRANSFORM: return createStructureMapTransform();
			case FhirPackage.SUBSCRIPTION: return createSubscription();
			case FhirPackage.SUBSCRIPTION_CHANNEL: return createSubscriptionChannel();
			case FhirPackage.SUBSCRIPTION_CHANNEL_TYPE: return createSubscriptionChannelType();
			case FhirPackage.SUBSCRIPTION_STATUS: return createSubscriptionStatus();
			case FhirPackage.SUBSTANCE: return createSubstance();
			case FhirPackage.SUBSTANCE_AMOUNT: return createSubstanceAmount();
			case FhirPackage.SUBSTANCE_AMOUNT_REFERENCE_RANGE: return createSubstanceAmountReferenceRange();
			case FhirPackage.SUBSTANCE_INGREDIENT: return createSubstanceIngredient();
			case FhirPackage.SUBSTANCE_INSTANCE: return createSubstanceInstance();
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID: return createSubstanceNucleicAcid();
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_LINKAGE: return createSubstanceNucleicAcidLinkage();
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT: return createSubstanceNucleicAcidSubunit();
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUGAR: return createSubstanceNucleicAcidSugar();
			case FhirPackage.SUBSTANCE_POLYMER: return createSubstancePolymer();
			case FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION: return createSubstancePolymerDegreeOfPolymerisation();
			case FhirPackage.SUBSTANCE_POLYMER_MONOMER_SET: return createSubstancePolymerMonomerSet();
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT: return createSubstancePolymerRepeat();
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT: return createSubstancePolymerRepeatUnit();
			case FhirPackage.SUBSTANCE_POLYMER_STARTING_MATERIAL: return createSubstancePolymerStartingMaterial();
			case FhirPackage.SUBSTANCE_POLYMER_STRUCTURAL_REPRESENTATION: return createSubstancePolymerStructuralRepresentation();
			case FhirPackage.SUBSTANCE_PROTEIN: return createSubstanceProtein();
			case FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT: return createSubstanceProteinSubunit();
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION: return createSubstanceReferenceInformation();
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION: return createSubstanceReferenceInformationClassification();
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_GENE: return createSubstanceReferenceInformationGene();
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_GENE_ELEMENT: return createSubstanceReferenceInformationGeneElement();
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET: return createSubstanceReferenceInformationTarget();
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL: return createSubstanceSourceMaterial();
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_AUTHOR: return createSubstanceSourceMaterialAuthor();
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_FRACTION_DESCRIPTION: return createSubstanceSourceMaterialFractionDescription();
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_HYBRID: return createSubstanceSourceMaterialHybrid();
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM: return createSubstanceSourceMaterialOrganism();
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_GENERAL: return createSubstanceSourceMaterialOrganismGeneral();
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_PART_DESCRIPTION: return createSubstanceSourceMaterialPartDescription();
			case FhirPackage.SUBSTANCE_SPECIFICATION: return createSubstanceSpecification();
			case FhirPackage.SUBSTANCE_SPECIFICATION_CODE: return createSubstanceSpecificationCode();
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE: return createSubstanceSpecificationIsotope();
			case FhirPackage.SUBSTANCE_SPECIFICATION_MOIETY: return createSubstanceSpecificationMoiety();
			case FhirPackage.SUBSTANCE_SPECIFICATION_MOLECULAR_WEIGHT: return createSubstanceSpecificationMolecularWeight();
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME: return createSubstanceSpecificationName();
			case FhirPackage.SUBSTANCE_SPECIFICATION_OFFICIAL: return createSubstanceSpecificationOfficial();
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY: return createSubstanceSpecificationProperty();
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP: return createSubstanceSpecificationRelationship();
			case FhirPackage.SUBSTANCE_SPECIFICATION_REPRESENTATION: return createSubstanceSpecificationRepresentation();
			case FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE: return createSubstanceSpecificationStructure();
			case FhirPackage.SUPPLY_DELIVERY: return createSupplyDelivery();
			case FhirPackage.SUPPLY_DELIVERY_STATUS: return createSupplyDeliveryStatus();
			case FhirPackage.SUPPLY_DELIVERY_SUPPLIED_ITEM: return createSupplyDeliverySuppliedItem();
			case FhirPackage.SUPPLY_REQUEST: return createSupplyRequest();
			case FhirPackage.SUPPLY_REQUEST_PARAMETER: return createSupplyRequestParameter();
			case FhirPackage.SUPPLY_REQUEST_STATUS: return createSupplyRequestStatus();
			case FhirPackage.SYSTEM_RESTFUL_INTERACTION: return createSystemRestfulInteraction();
			case FhirPackage.TASK: return createTask();
			case FhirPackage.TASK_INPUT: return createTaskInput();
			case FhirPackage.TASK_INTENT: return createTaskIntent();
			case FhirPackage.TASK_OUTPUT: return createTaskOutput();
			case FhirPackage.TASK_RESTRICTION: return createTaskRestriction();
			case FhirPackage.TASK_STATUS: return createTaskStatus();
			case FhirPackage.TERMINOLOGY_CAPABILITIES: return createTerminologyCapabilities();
			case FhirPackage.TERMINOLOGY_CAPABILITIES_CLOSURE: return createTerminologyCapabilitiesClosure();
			case FhirPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM: return createTerminologyCapabilitiesCodeSystem();
			case FhirPackage.TERMINOLOGY_CAPABILITIES_EXPANSION: return createTerminologyCapabilitiesExpansion();
			case FhirPackage.TERMINOLOGY_CAPABILITIES_FILTER: return createTerminologyCapabilitiesFilter();
			case FhirPackage.TERMINOLOGY_CAPABILITIES_IMPLEMENTATION: return createTerminologyCapabilitiesImplementation();
			case FhirPackage.TERMINOLOGY_CAPABILITIES_PARAMETER: return createTerminologyCapabilitiesParameter();
			case FhirPackage.TERMINOLOGY_CAPABILITIES_SOFTWARE: return createTerminologyCapabilitiesSoftware();
			case FhirPackage.TERMINOLOGY_CAPABILITIES_TRANSLATION: return createTerminologyCapabilitiesTranslation();
			case FhirPackage.TERMINOLOGY_CAPABILITIES_VALIDATE_CODE: return createTerminologyCapabilitiesValidateCode();
			case FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION: return createTerminologyCapabilitiesVersion();
			case FhirPackage.TEST_REPORT: return createTestReport();
			case FhirPackage.TEST_REPORT_ACTION: return createTestReportAction();
			case FhirPackage.TEST_REPORT_ACTION1: return createTestReportAction1();
			case FhirPackage.TEST_REPORT_ACTION2: return createTestReportAction2();
			case FhirPackage.TEST_REPORT_ACTION_RESULT: return createTestReportActionResult();
			case FhirPackage.TEST_REPORT_ASSERT: return createTestReportAssert();
			case FhirPackage.TEST_REPORT_OPERATION: return createTestReportOperation();
			case FhirPackage.TEST_REPORT_PARTICIPANT: return createTestReportParticipant();
			case FhirPackage.TEST_REPORT_PARTICIPANT_TYPE: return createTestReportParticipantType();
			case FhirPackage.TEST_REPORT_RESULT: return createTestReportResult();
			case FhirPackage.TEST_REPORT_SETUP: return createTestReportSetup();
			case FhirPackage.TEST_REPORT_STATUS: return createTestReportStatus();
			case FhirPackage.TEST_REPORT_TEARDOWN: return createTestReportTeardown();
			case FhirPackage.TEST_REPORT_TEST: return createTestReportTest();
			case FhirPackage.TEST_SCRIPT: return createTestScript();
			case FhirPackage.TEST_SCRIPT_ACTION: return createTestScriptAction();
			case FhirPackage.TEST_SCRIPT_ACTION1: return createTestScriptAction1();
			case FhirPackage.TEST_SCRIPT_ACTION2: return createTestScriptAction2();
			case FhirPackage.TEST_SCRIPT_ASSERT: return createTestScriptAssert();
			case FhirPackage.TEST_SCRIPT_CAPABILITY: return createTestScriptCapability();
			case FhirPackage.TEST_SCRIPT_DESTINATION: return createTestScriptDestination();
			case FhirPackage.TEST_SCRIPT_FIXTURE: return createTestScriptFixture();
			case FhirPackage.TEST_SCRIPT_LINK: return createTestScriptLink();
			case FhirPackage.TEST_SCRIPT_METADATA: return createTestScriptMetadata();
			case FhirPackage.TEST_SCRIPT_OPERATION: return createTestScriptOperation();
			case FhirPackage.TEST_SCRIPT_ORIGIN: return createTestScriptOrigin();
			case FhirPackage.TEST_SCRIPT_REQUEST_HEADER: return createTestScriptRequestHeader();
			case FhirPackage.TEST_SCRIPT_REQUEST_METHOD_CODE: return createTestScriptRequestMethodCode();
			case FhirPackage.TEST_SCRIPT_SETUP: return createTestScriptSetup();
			case FhirPackage.TEST_SCRIPT_TEARDOWN: return createTestScriptTeardown();
			case FhirPackage.TEST_SCRIPT_TEST: return createTestScriptTest();
			case FhirPackage.TEST_SCRIPT_VARIABLE: return createTestScriptVariable();
			case FhirPackage.TIME: return createTime();
			case FhirPackage.TIMING: return createTiming();
			case FhirPackage.TIMING_REPEAT: return createTimingRepeat();
			case FhirPackage.TRIGGER_DEFINITION: return createTriggerDefinition();
			case FhirPackage.TRIGGER_TYPE: return createTriggerType();
			case FhirPackage.TYPE_DERIVATION_RULE: return createTypeDerivationRule();
			case FhirPackage.TYPE_RESTFUL_INTERACTION: return createTypeRestfulInteraction();
			case FhirPackage.UDI_ENTRY_TYPE: return createUDIEntryType();
			case FhirPackage.UNITS_OF_TIME: return createUnitsOfTime();
			case FhirPackage.UNSIGNED_INT: return createUnsignedInt();
			case FhirPackage.URI: return createUri();
			case FhirPackage.URL: return createUrl();
			case FhirPackage.USAGE_CONTEXT: return createUsageContext();
			case FhirPackage.USE: return createUse();
			case FhirPackage.UUID: return createUuid();
			case FhirPackage.VALUE_SET: return createValueSet();
			case FhirPackage.VALUE_SET_COMPOSE: return createValueSetCompose();
			case FhirPackage.VALUE_SET_CONCEPT: return createValueSetConcept();
			case FhirPackage.VALUE_SET_CONTAINS: return createValueSetContains();
			case FhirPackage.VALUE_SET_DESIGNATION: return createValueSetDesignation();
			case FhirPackage.VALUE_SET_EXPANSION: return createValueSetExpansion();
			case FhirPackage.VALUE_SET_FILTER: return createValueSetFilter();
			case FhirPackage.VALUE_SET_INCLUDE: return createValueSetInclude();
			case FhirPackage.VALUE_SET_PARAMETER: return createValueSetParameter();
			case FhirPackage.VARIABLE_TYPE: return createVariableType();
			case FhirPackage.VCONFIDENTIALITY_CLASSIFICATION: return createVConfidentialityClassification();
			case FhirPackage.VERIFICATION_RESULT: return createVerificationResult();
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION: return createVerificationResultAttestation();
			case FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE: return createVerificationResultPrimarySource();
			case FhirPackage.VERIFICATION_RESULT_VALIDATOR: return createVerificationResultValidator();
			case FhirPackage.VISION_BASE: return createVisionBase();
			case FhirPackage.VISION_EYES: return createVisionEyes();
			case FhirPackage.VISION_PRESCRIPTION: return createVisionPrescription();
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION: return createVisionPrescriptionLensSpecification();
			case FhirPackage.VISION_PRESCRIPTION_PRISM: return createVisionPrescriptionPrism();
			case FhirPackage.XPATH_USAGE_TYPE: return createXPathUsageType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case FhirPackage.ACCOUNT_STATUS_LIST:
				return createAccountStatusListFromString(eDataType, initialValue);
			case FhirPackage.ACTION_CARDINALITY_BEHAVIOR_LIST:
				return createActionCardinalityBehaviorListFromString(eDataType, initialValue);
			case FhirPackage.ACTION_CONDITION_KIND_LIST:
				return createActionConditionKindListFromString(eDataType, initialValue);
			case FhirPackage.ACTION_GROUPING_BEHAVIOR_LIST:
				return createActionGroupingBehaviorListFromString(eDataType, initialValue);
			case FhirPackage.ACTION_PARTICIPANT_TYPE_LIST:
				return createActionParticipantTypeListFromString(eDataType, initialValue);
			case FhirPackage.ACTION_PRECHECK_BEHAVIOR_LIST:
				return createActionPrecheckBehaviorListFromString(eDataType, initialValue);
			case FhirPackage.ACTION_RELATIONSHIP_TYPE_LIST:
				return createActionRelationshipTypeListFromString(eDataType, initialValue);
			case FhirPackage.ACTION_REQUIRED_BEHAVIOR_LIST:
				return createActionRequiredBehaviorListFromString(eDataType, initialValue);
			case FhirPackage.ACTION_SELECTION_BEHAVIOR_LIST:
				return createActionSelectionBehaviorListFromString(eDataType, initialValue);
			case FhirPackage.ADDRESS_TYPE_LIST:
				return createAddressTypeListFromString(eDataType, initialValue);
			case FhirPackage.ADDRESS_USE_LIST:
				return createAddressUseListFromString(eDataType, initialValue);
			case FhirPackage.ADMINISTRATIVE_GENDER_LIST:
				return createAdministrativeGenderListFromString(eDataType, initialValue);
			case FhirPackage.ADVERSE_EVENT_ACTUALITY_LIST:
				return createAdverseEventActualityListFromString(eDataType, initialValue);
			case FhirPackage.AGGREGATION_MODE_LIST:
				return createAggregationModeListFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CATEGORY_LIST:
				return createAllergyIntoleranceCategoryListFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CRITICALITY_LIST:
				return createAllergyIntoleranceCriticalityListFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_SEVERITY_LIST:
				return createAllergyIntoleranceSeverityListFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_TYPE_LIST:
				return createAllergyIntoleranceTypeListFromString(eDataType, initialValue);
			case FhirPackage.APPOINTMENT_STATUS_LIST:
				return createAppointmentStatusListFromString(eDataType, initialValue);
			case FhirPackage.ASSERTION_DIRECTION_TYPE_LIST:
				return createAssertionDirectionTypeListFromString(eDataType, initialValue);
			case FhirPackage.ASSERTION_OPERATOR_TYPE_LIST:
				return createAssertionOperatorTypeListFromString(eDataType, initialValue);
			case FhirPackage.ASSERTION_RESPONSE_TYPES_LIST:
				return createAssertionResponseTypesListFromString(eDataType, initialValue);
			case FhirPackage.AUDIT_EVENT_ACTION_LIST:
				return createAuditEventActionListFromString(eDataType, initialValue);
			case FhirPackage.AUDIT_EVENT_AGENT_NETWORK_TYPE_LIST:
				return createAuditEventAgentNetworkTypeListFromString(eDataType, initialValue);
			case FhirPackage.AUDIT_EVENT_OUTCOME_LIST:
				return createAuditEventOutcomeListFromString(eDataType, initialValue);
			case FhirPackage.BINDING_STRENGTH_LIST:
				return createBindingStrengthListFromString(eDataType, initialValue);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_CATEGORY_LIST:
				return createBiologicallyDerivedProductCategoryListFromString(eDataType, initialValue);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STATUS_LIST:
				return createBiologicallyDerivedProductStatusListFromString(eDataType, initialValue);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE_SCALE_LIST:
				return createBiologicallyDerivedProductStorageScaleListFromString(eDataType, initialValue);
			case FhirPackage.BUNDLE_TYPE_LIST:
				return createBundleTypeListFromString(eDataType, initialValue);
			case FhirPackage.CAPABILITY_STATEMENT_KIND_LIST:
				return createCapabilityStatementKindListFromString(eDataType, initialValue);
			case FhirPackage.CARE_PLAN_ACTIVITY_KIND_LIST:
				return createCarePlanActivityKindListFromString(eDataType, initialValue);
			case FhirPackage.CARE_PLAN_ACTIVITY_STATUS_LIST:
				return createCarePlanActivityStatusListFromString(eDataType, initialValue);
			case FhirPackage.CARE_PLAN_INTENT_LIST:
				return createCarePlanIntentListFromString(eDataType, initialValue);
			case FhirPackage.CARE_TEAM_STATUS_LIST:
				return createCareTeamStatusListFromString(eDataType, initialValue);
			case FhirPackage.CATALOG_ENTRY_RELATION_TYPE_LIST:
				return createCatalogEntryRelationTypeListFromString(eDataType, initialValue);
			case FhirPackage.CHARGE_ITEM_STATUS_LIST:
				return createChargeItemStatusListFromString(eDataType, initialValue);
			case FhirPackage.CLAIM_PROCESSING_CODES_LIST:
				return createClaimProcessingCodesListFromString(eDataType, initialValue);
			case FhirPackage.CLINICAL_IMPRESSION_STATUS_LIST:
				return createClinicalImpressionStatusListFromString(eDataType, initialValue);
			case FhirPackage.CODE_SEARCH_SUPPORT_LIST:
				return createCodeSearchSupportListFromString(eDataType, initialValue);
			case FhirPackage.CODE_SYSTEM_CONTENT_MODE_LIST:
				return createCodeSystemContentModeListFromString(eDataType, initialValue);
			case FhirPackage.CODE_SYSTEM_HIERARCHY_MEANING_LIST:
				return createCodeSystemHierarchyMeaningListFromString(eDataType, initialValue);
			case FhirPackage.COMPARTMENT_TYPE_LIST:
				return createCompartmentTypeListFromString(eDataType, initialValue);
			case FhirPackage.COMPOSITION_ATTESTATION_MODE_LIST:
				return createCompositionAttestationModeListFromString(eDataType, initialValue);
			case FhirPackage.COMPOSITION_STATUS_LIST:
				return createCompositionStatusListFromString(eDataType, initialValue);
			case FhirPackage.CONCEPT_MAP_EQUIVALENCE_LIST:
				return createConceptMapEquivalenceListFromString(eDataType, initialValue);
			case FhirPackage.CONCEPT_MAP_GROUP_UNMAPPED_MODE_LIST:
				return createConceptMapGroupUnmappedModeListFromString(eDataType, initialValue);
			case FhirPackage.CONDITIONAL_DELETE_STATUS_LIST:
				return createConditionalDeleteStatusListFromString(eDataType, initialValue);
			case FhirPackage.CONDITIONAL_READ_STATUS_LIST:
				return createConditionalReadStatusListFromString(eDataType, initialValue);
			case FhirPackage.CONSENT_DATA_MEANING_LIST:
				return createConsentDataMeaningListFromString(eDataType, initialValue);
			case FhirPackage.CONSENT_PROVISION_TYPE_LIST:
				return createConsentProvisionTypeListFromString(eDataType, initialValue);
			case FhirPackage.CONSENT_STATE_LIST:
				return createConsentStateListFromString(eDataType, initialValue);
			case FhirPackage.CONSTRAINT_SEVERITY_LIST:
				return createConstraintSeverityListFromString(eDataType, initialValue);
			case FhirPackage.CONTACT_POINT_SYSTEM_LIST:
				return createContactPointSystemListFromString(eDataType, initialValue);
			case FhirPackage.CONTACT_POINT_USE_LIST:
				return createContactPointUseListFromString(eDataType, initialValue);
			case FhirPackage.CONTRACT_RESOURCE_PUBLICATION_STATUS_CODES_LIST:
				return createContractResourcePublicationStatusCodesListFromString(eDataType, initialValue);
			case FhirPackage.CONTRACT_RESOURCE_STATUS_CODES_LIST:
				return createContractResourceStatusCodesListFromString(eDataType, initialValue);
			case FhirPackage.CONTRIBUTOR_TYPE_LIST:
				return createContributorTypeListFromString(eDataType, initialValue);
			case FhirPackage.DAYS_OF_WEEK_LIST:
				return createDaysOfWeekListFromString(eDataType, initialValue);
			case FhirPackage.DETECTED_ISSUE_SEVERITY_LIST:
				return createDetectedIssueSeverityListFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_STATE_LIST:
				return createDeviceMetricCalibrationStateListFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_TYPE_LIST:
				return createDeviceMetricCalibrationTypeListFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_METRIC_CATEGORY_LIST:
				return createDeviceMetricCategoryListFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_METRIC_COLOR_LIST:
				return createDeviceMetricColorListFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_METRIC_OPERATIONAL_STATUS_LIST:
				return createDeviceMetricOperationalStatusListFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_NAME_TYPE_LIST:
				return createDeviceNameTypeListFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_USE_STATEMENT_STATUS_LIST:
				return createDeviceUseStatementStatusListFromString(eDataType, initialValue);
			case FhirPackage.DIAGNOSTIC_REPORT_STATUS_LIST:
				return createDiagnosticReportStatusListFromString(eDataType, initialValue);
			case FhirPackage.DISCRIMINATOR_TYPE_LIST:
				return createDiscriminatorTypeListFromString(eDataType, initialValue);
			case FhirPackage.DOCUMENT_MODE_LIST:
				return createDocumentModeListFromString(eDataType, initialValue);
			case FhirPackage.DOCUMENT_REFERENCE_STATUS_LIST:
				return createDocumentReferenceStatusListFromString(eDataType, initialValue);
			case FhirPackage.DOCUMENT_RELATIONSHIP_TYPE_LIST:
				return createDocumentRelationshipTypeListFromString(eDataType, initialValue);
			case FhirPackage.ELIGIBILITY_REQUEST_PURPOSE_LIST:
				return createEligibilityRequestPurposeListFromString(eDataType, initialValue);
			case FhirPackage.ELIGIBILITY_RESPONSE_PURPOSE_LIST:
				return createEligibilityResponsePurposeListFromString(eDataType, initialValue);
			case FhirPackage.ENABLE_WHEN_BEHAVIOR_LIST:
				return createEnableWhenBehaviorListFromString(eDataType, initialValue);
			case FhirPackage.ENCOUNTER_LOCATION_STATUS_LIST:
				return createEncounterLocationStatusListFromString(eDataType, initialValue);
			case FhirPackage.ENCOUNTER_STATUS_LIST:
				return createEncounterStatusListFromString(eDataType, initialValue);
			case FhirPackage.ENDPOINT_STATUS_LIST:
				return createEndpointStatusListFromString(eDataType, initialValue);
			case FhirPackage.EPISODE_OF_CARE_STATUS_LIST:
				return createEpisodeOfCareStatusListFromString(eDataType, initialValue);
			case FhirPackage.EVENT_CAPABILITY_MODE_LIST:
				return createEventCapabilityModeListFromString(eDataType, initialValue);
			case FhirPackage.EVENT_STATUS_LIST:
				return createEventStatusListFromString(eDataType, initialValue);
			case FhirPackage.EVENT_TIMING_LIST:
				return createEventTimingListFromString(eDataType, initialValue);
			case FhirPackage.EVIDENCE_VARIABLE_TYPE_LIST:
				return createEvidenceVariableTypeListFromString(eDataType, initialValue);
			case FhirPackage.EXAMPLE_SCENARIO_ACTOR_TYPE_LIST:
				return createExampleScenarioActorTypeListFromString(eDataType, initialValue);
			case FhirPackage.EXPLANATION_OF_BENEFIT_STATUS_LIST:
				return createExplanationOfBenefitStatusListFromString(eDataType, initialValue);
			case FhirPackage.EXPOSURE_STATE_LIST:
				return createExposureStateListFromString(eDataType, initialValue);
			case FhirPackage.EXPRESSION_LANGUAGE_LIST:
				return createExpressionLanguageListFromString(eDataType, initialValue);
			case FhirPackage.EXTENSION_CONTEXT_TYPE_LIST:
				return createExtensionContextTypeListFromString(eDataType, initialValue);
			case FhirPackage.FAMILY_HISTORY_STATUS_LIST:
				return createFamilyHistoryStatusListFromString(eDataType, initialValue);
			case FhirPackage.FHIR_DEVICE_STATUS_LIST:
				return createFHIRDeviceStatusListFromString(eDataType, initialValue);
			case FhirPackage.FHIR_SUBSTANCE_STATUS_LIST:
				return createFHIRSubstanceStatusListFromString(eDataType, initialValue);
			case FhirPackage.FHIR_VERSION_LIST:
				return createFHIRVersionListFromString(eDataType, initialValue);
			case FhirPackage.FILTER_OPERATOR_LIST:
				return createFilterOperatorListFromString(eDataType, initialValue);
			case FhirPackage.FINANCIAL_RESOURCE_STATUS_CODES_LIST:
				return createFinancialResourceStatusCodesListFromString(eDataType, initialValue);
			case FhirPackage.FLAG_STATUS_LIST:
				return createFlagStatusListFromString(eDataType, initialValue);
			case FhirPackage.GOAL_LIFECYCLE_STATUS_LIST:
				return createGoalLifecycleStatusListFromString(eDataType, initialValue);
			case FhirPackage.GRAPH_COMPARTMENT_RULE_LIST:
				return createGraphCompartmentRuleListFromString(eDataType, initialValue);
			case FhirPackage.GRAPH_COMPARTMENT_USE_LIST:
				return createGraphCompartmentUseListFromString(eDataType, initialValue);
			case FhirPackage.GROUP_MEASURE_LIST:
				return createGroupMeasureListFromString(eDataType, initialValue);
			case FhirPackage.GROUP_TYPE_LIST:
				return createGroupTypeListFromString(eDataType, initialValue);
			case FhirPackage.GUIDANCE_RESPONSE_STATUS_LIST:
				return createGuidanceResponseStatusListFromString(eDataType, initialValue);
			case FhirPackage.GUIDE_PAGE_GENERATION_LIST:
				return createGuidePageGenerationListFromString(eDataType, initialValue);
			case FhirPackage.GUIDE_PARAMETER_CODE_LIST:
				return createGuideParameterCodeListFromString(eDataType, initialValue);
			case FhirPackage.HTTP_VERB_LIST:
				return createHTTPVerbListFromString(eDataType, initialValue);
			case FhirPackage.IDENTIFIER_USE_LIST:
				return createIdentifierUseListFromString(eDataType, initialValue);
			case FhirPackage.IDENTITY_ASSURANCE_LEVEL_LIST:
				return createIdentityAssuranceLevelListFromString(eDataType, initialValue);
			case FhirPackage.IMAGING_STUDY_STATUS_LIST:
				return createImagingStudyStatusListFromString(eDataType, initialValue);
			case FhirPackage.IMMUNIZATION_EVALUATION_STATUS_CODES_LIST:
				return createImmunizationEvaluationStatusCodesListFromString(eDataType, initialValue);
			case FhirPackage.IMMUNIZATION_STATUS_CODES_LIST:
				return createImmunizationStatusCodesListFromString(eDataType, initialValue);
			case FhirPackage.INVOICE_PRICE_COMPONENT_TYPE_LIST:
				return createInvoicePriceComponentTypeListFromString(eDataType, initialValue);
			case FhirPackage.INVOICE_STATUS_LIST:
				return createInvoiceStatusListFromString(eDataType, initialValue);
			case FhirPackage.ISSUE_SEVERITY_LIST:
				return createIssueSeverityListFromString(eDataType, initialValue);
			case FhirPackage.ISSUE_TYPE_LIST:
				return createIssueTypeListFromString(eDataType, initialValue);
			case FhirPackage.LINKAGE_TYPE_LIST:
				return createLinkageTypeListFromString(eDataType, initialValue);
			case FhirPackage.LINK_TYPE_LIST:
				return createLinkTypeListFromString(eDataType, initialValue);
			case FhirPackage.LIST_MODE_LIST:
				return createListModeListFromString(eDataType, initialValue);
			case FhirPackage.LIST_STATUS_LIST:
				return createListStatusListFromString(eDataType, initialValue);
			case FhirPackage.LOCATION_MODE_LIST:
				return createLocationModeListFromString(eDataType, initialValue);
			case FhirPackage.LOCATION_STATUS_LIST:
				return createLocationStatusListFromString(eDataType, initialValue);
			case FhirPackage.MEASURE_REPORT_STATUS_LIST:
				return createMeasureReportStatusListFromString(eDataType, initialValue);
			case FhirPackage.MEASURE_REPORT_TYPE_LIST:
				return createMeasureReportTypeListFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_REQUEST_INTENT_LIST:
				return createMedicationRequestIntentListFromString(eDataType, initialValue);
			case FhirPackage.MEDICATIONREQUEST_STATUS_LIST:
				return createMedicationrequestStatusListFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_STATUS_CODES_LIST:
				return createMedicationStatusCodesListFromString(eDataType, initialValue);
			case FhirPackage.MESSAGEHEADER_RESPONSE_REQUEST_LIST:
				return createMessageheaderResponseRequestListFromString(eDataType, initialValue);
			case FhirPackage.MESSAGE_SIGNIFICANCE_CATEGORY_LIST:
				return createMessageSignificanceCategoryListFromString(eDataType, initialValue);
			case FhirPackage.NAME_USE_LIST:
				return createNameUseListFromString(eDataType, initialValue);
			case FhirPackage.NAMING_SYSTEM_IDENTIFIER_TYPE_LIST:
				return createNamingSystemIdentifierTypeListFromString(eDataType, initialValue);
			case FhirPackage.NAMING_SYSTEM_TYPE_LIST:
				return createNamingSystemTypeListFromString(eDataType, initialValue);
			case FhirPackage.NARRATIVE_STATUS_LIST:
				return createNarrativeStatusListFromString(eDataType, initialValue);
			case FhirPackage.NOTE_TYPE_LIST:
				return createNoteTypeListFromString(eDataType, initialValue);
			case FhirPackage.OBSERVATION_DATA_TYPE_LIST:
				return createObservationDataTypeListFromString(eDataType, initialValue);
			case FhirPackage.OBSERVATION_RANGE_CATEGORY_LIST:
				return createObservationRangeCategoryListFromString(eDataType, initialValue);
			case FhirPackage.OBSERVATION_STATUS_LIST:
				return createObservationStatusListFromString(eDataType, initialValue);
			case FhirPackage.OPERATION_KIND_LIST:
				return createOperationKindListFromString(eDataType, initialValue);
			case FhirPackage.OPERATION_PARAMETER_USE_LIST:
				return createOperationParameterUseListFromString(eDataType, initialValue);
			case FhirPackage.ORIENTATION_TYPE_LIST:
				return createOrientationTypeListFromString(eDataType, initialValue);
			case FhirPackage.PARTICIPANT_REQUIRED_LIST:
				return createParticipantRequiredListFromString(eDataType, initialValue);
			case FhirPackage.PARTICIPATION_STATUS_LIST:
				return createParticipationStatusListFromString(eDataType, initialValue);
			case FhirPackage.PROPERTY_REPRESENTATION_LIST:
				return createPropertyRepresentationListFromString(eDataType, initialValue);
			case FhirPackage.PROPERTY_TYPE_LIST:
				return createPropertyTypeListFromString(eDataType, initialValue);
			case FhirPackage.PROVENANCE_ENTITY_ROLE_LIST:
				return createProvenanceEntityRoleListFromString(eDataType, initialValue);
			case FhirPackage.PUBLICATION_STATUS_LIST:
				return createPublicationStatusListFromString(eDataType, initialValue);
			case FhirPackage.QUALITY_TYPE_LIST:
				return createQualityTypeListFromString(eDataType, initialValue);
			case FhirPackage.QUANTITY_COMPARATOR_LIST:
				return createQuantityComparatorListFromString(eDataType, initialValue);
			case FhirPackage.QUESTIONNAIRE_ITEM_OPERATOR_LIST:
				return createQuestionnaireItemOperatorListFromString(eDataType, initialValue);
			case FhirPackage.QUESTIONNAIRE_ITEM_TYPE_LIST:
				return createQuestionnaireItemTypeListFromString(eDataType, initialValue);
			case FhirPackage.QUESTIONNAIRE_RESPONSE_STATUS_LIST:
				return createQuestionnaireResponseStatusListFromString(eDataType, initialValue);
			case FhirPackage.REFERENCE_HANDLING_POLICY_LIST:
				return createReferenceHandlingPolicyListFromString(eDataType, initialValue);
			case FhirPackage.REFERENCE_VERSION_RULES_LIST:
				return createReferenceVersionRulesListFromString(eDataType, initialValue);
			case FhirPackage.RELATED_ARTIFACT_TYPE_LIST:
				return createRelatedArtifactTypeListFromString(eDataType, initialValue);
			case FhirPackage.REMITTANCE_OUTCOME_LIST:
				return createRemittanceOutcomeListFromString(eDataType, initialValue);
			case FhirPackage.REPOSITORY_TYPE_LIST:
				return createRepositoryTypeListFromString(eDataType, initialValue);
			case FhirPackage.REQUEST_INTENT_LIST:
				return createRequestIntentListFromString(eDataType, initialValue);
			case FhirPackage.REQUEST_PRIORITY_LIST:
				return createRequestPriorityListFromString(eDataType, initialValue);
			case FhirPackage.REQUEST_RESOURCE_TYPE_LIST:
				return createRequestResourceTypeListFromString(eDataType, initialValue);
			case FhirPackage.REQUEST_STATUS_LIST:
				return createRequestStatusListFromString(eDataType, initialValue);
			case FhirPackage.RESEARCH_ELEMENT_TYPE_LIST:
				return createResearchElementTypeListFromString(eDataType, initialValue);
			case FhirPackage.RESEARCH_STUDY_STATUS_LIST:
				return createResearchStudyStatusListFromString(eDataType, initialValue);
			case FhirPackage.RESEARCH_SUBJECT_STATUS_LIST:
				return createResearchSubjectStatusListFromString(eDataType, initialValue);
			case FhirPackage.RESOURCE_TYPE_LIST:
				return createResourceTypeListFromString(eDataType, initialValue);
			case FhirPackage.RESOURCE_VERSION_POLICY_LIST:
				return createResourceVersionPolicyListFromString(eDataType, initialValue);
			case FhirPackage.RESPONSE_TYPE_LIST:
				return createResponseTypeListFromString(eDataType, initialValue);
			case FhirPackage.RESTFUL_CAPABILITY_MODE_LIST:
				return createRestfulCapabilityModeListFromString(eDataType, initialValue);
			case FhirPackage.SEARCH_COMPARATOR_LIST:
				return createSearchComparatorListFromString(eDataType, initialValue);
			case FhirPackage.SEARCH_ENTRY_MODE_LIST:
				return createSearchEntryModeListFromString(eDataType, initialValue);
			case FhirPackage.SEARCH_MODIFIER_CODE_LIST:
				return createSearchModifierCodeListFromString(eDataType, initialValue);
			case FhirPackage.SEARCH_PARAM_TYPE_LIST:
				return createSearchParamTypeListFromString(eDataType, initialValue);
			case FhirPackage.SEQUENCE_TYPE_LIST:
				return createSequenceTypeListFromString(eDataType, initialValue);
			case FhirPackage.SLICING_RULES_LIST:
				return createSlicingRulesListFromString(eDataType, initialValue);
			case FhirPackage.SLOT_STATUS_LIST:
				return createSlotStatusListFromString(eDataType, initialValue);
			case FhirPackage.SORT_DIRECTION_LIST:
				return createSortDirectionListFromString(eDataType, initialValue);
			case FhirPackage.SPDX_LICENSE_LIST:
				return createSPDXLicenseListFromString(eDataType, initialValue);
			case FhirPackage.SPECIMEN_CONTAINED_PREFERENCE_LIST:
				return createSpecimenContainedPreferenceListFromString(eDataType, initialValue);
			case FhirPackage.SPECIMEN_STATUS_LIST:
				return createSpecimenStatusListFromString(eDataType, initialValue);
			case FhirPackage.STATUS_LIST:
				return createStatusListFromString(eDataType, initialValue);
			case FhirPackage.STRAND_TYPE_LIST:
				return createStrandTypeListFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_DEFINITION_KIND_LIST:
				return createStructureDefinitionKindListFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_CONTEXT_TYPE_LIST:
				return createStructureMapContextTypeListFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_GROUP_TYPE_MODE_LIST:
				return createStructureMapGroupTypeModeListFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_INPUT_MODE_LIST:
				return createStructureMapInputModeListFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_MODEL_MODE_LIST:
				return createStructureMapModelModeListFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_SOURCE_LIST_MODE_LIST:
				return createStructureMapSourceListModeListFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_TARGET_LIST_MODE_LIST:
				return createStructureMapTargetListModeListFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_TRANSFORM_LIST:
				return createStructureMapTransformListFromString(eDataType, initialValue);
			case FhirPackage.SUBSCRIPTION_CHANNEL_TYPE_LIST:
				return createSubscriptionChannelTypeListFromString(eDataType, initialValue);
			case FhirPackage.SUBSCRIPTION_STATUS_LIST:
				return createSubscriptionStatusListFromString(eDataType, initialValue);
			case FhirPackage.SUPPLY_DELIVERY_STATUS_LIST:
				return createSupplyDeliveryStatusListFromString(eDataType, initialValue);
			case FhirPackage.SUPPLY_REQUEST_STATUS_LIST:
				return createSupplyRequestStatusListFromString(eDataType, initialValue);
			case FhirPackage.SYSTEM_RESTFUL_INTERACTION_LIST:
				return createSystemRestfulInteractionListFromString(eDataType, initialValue);
			case FhirPackage.TASK_INTENT_LIST:
				return createTaskIntentListFromString(eDataType, initialValue);
			case FhirPackage.TASK_STATUS_LIST:
				return createTaskStatusListFromString(eDataType, initialValue);
			case FhirPackage.TEST_REPORT_ACTION_RESULT_LIST:
				return createTestReportActionResultListFromString(eDataType, initialValue);
			case FhirPackage.TEST_REPORT_PARTICIPANT_TYPE_LIST:
				return createTestReportParticipantTypeListFromString(eDataType, initialValue);
			case FhirPackage.TEST_REPORT_RESULT_LIST:
				return createTestReportResultListFromString(eDataType, initialValue);
			case FhirPackage.TEST_REPORT_STATUS_LIST:
				return createTestReportStatusListFromString(eDataType, initialValue);
			case FhirPackage.TEST_SCRIPT_REQUEST_METHOD_CODE_LIST:
				return createTestScriptRequestMethodCodeListFromString(eDataType, initialValue);
			case FhirPackage.TRIGGER_TYPE_LIST:
				return createTriggerTypeListFromString(eDataType, initialValue);
			case FhirPackage.TYPE_DERIVATION_RULE_LIST:
				return createTypeDerivationRuleListFromString(eDataType, initialValue);
			case FhirPackage.TYPE_RESTFUL_INTERACTION_LIST:
				return createTypeRestfulInteractionListFromString(eDataType, initialValue);
			case FhirPackage.UDI_ENTRY_TYPE_LIST:
				return createUDIEntryTypeListFromString(eDataType, initialValue);
			case FhirPackage.UNITS_OF_TIME_LIST:
				return createUnitsOfTimeListFromString(eDataType, initialValue);
			case FhirPackage.USE_LIST:
				return createUseListFromString(eDataType, initialValue);
			case FhirPackage.VARIABLE_TYPE_LIST:
				return createVariableTypeListFromString(eDataType, initialValue);
			case FhirPackage.VCONFIDENTIALITY_CLASSIFICATION_LIST:
				return createVConfidentialityClassificationListFromString(eDataType, initialValue);
			case FhirPackage.VISION_BASE_LIST:
				return createVisionBaseListFromString(eDataType, initialValue);
			case FhirPackage.VISION_EYES_LIST:
				return createVisionEyesListFromString(eDataType, initialValue);
			case FhirPackage.XPATH_USAGE_TYPE_LIST:
				return createXPathUsageTypeListFromString(eDataType, initialValue);
			case FhirPackage.ACCOUNT_STATUS_LIST_OBJECT:
				return createAccountStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.ACTION_CARDINALITY_BEHAVIOR_LIST_OBJECT:
				return createActionCardinalityBehaviorListObjectFromString(eDataType, initialValue);
			case FhirPackage.ACTION_CONDITION_KIND_LIST_OBJECT:
				return createActionConditionKindListObjectFromString(eDataType, initialValue);
			case FhirPackage.ACTION_GROUPING_BEHAVIOR_LIST_OBJECT:
				return createActionGroupingBehaviorListObjectFromString(eDataType, initialValue);
			case FhirPackage.ACTION_PARTICIPANT_TYPE_LIST_OBJECT:
				return createActionParticipantTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.ACTION_PRECHECK_BEHAVIOR_LIST_OBJECT:
				return createActionPrecheckBehaviorListObjectFromString(eDataType, initialValue);
			case FhirPackage.ACTION_RELATIONSHIP_TYPE_LIST_OBJECT:
				return createActionRelationshipTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.ACTION_REQUIRED_BEHAVIOR_LIST_OBJECT:
				return createActionRequiredBehaviorListObjectFromString(eDataType, initialValue);
			case FhirPackage.ACTION_SELECTION_BEHAVIOR_LIST_OBJECT:
				return createActionSelectionBehaviorListObjectFromString(eDataType, initialValue);
			case FhirPackage.ADDRESS_TYPE_LIST_OBJECT:
				return createAddressTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.ADDRESS_USE_LIST_OBJECT:
				return createAddressUseListObjectFromString(eDataType, initialValue);
			case FhirPackage.ADMINISTRATIVE_GENDER_LIST_OBJECT:
				return createAdministrativeGenderListObjectFromString(eDataType, initialValue);
			case FhirPackage.ADVERSE_EVENT_ACTUALITY_LIST_OBJECT:
				return createAdverseEventActualityListObjectFromString(eDataType, initialValue);
			case FhirPackage.AGGREGATION_MODE_LIST_OBJECT:
				return createAggregationModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CATEGORY_LIST_OBJECT:
				return createAllergyIntoleranceCategoryListObjectFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CRITICALITY_LIST_OBJECT:
				return createAllergyIntoleranceCriticalityListObjectFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_SEVERITY_LIST_OBJECT:
				return createAllergyIntoleranceSeverityListObjectFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_TYPE_LIST_OBJECT:
				return createAllergyIntoleranceTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.APPOINTMENT_STATUS_LIST_OBJECT:
				return createAppointmentStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.ASSERTION_DIRECTION_TYPE_LIST_OBJECT:
				return createAssertionDirectionTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.ASSERTION_OPERATOR_TYPE_LIST_OBJECT:
				return createAssertionOperatorTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.ASSERTION_RESPONSE_TYPES_LIST_OBJECT:
				return createAssertionResponseTypesListObjectFromString(eDataType, initialValue);
			case FhirPackage.AUDIT_EVENT_ACTION_LIST_OBJECT:
				return createAuditEventActionListObjectFromString(eDataType, initialValue);
			case FhirPackage.AUDIT_EVENT_AGENT_NETWORK_TYPE_LIST_OBJECT:
				return createAuditEventAgentNetworkTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.AUDIT_EVENT_OUTCOME_LIST_OBJECT:
				return createAuditEventOutcomeListObjectFromString(eDataType, initialValue);
			case FhirPackage.BASE64_BINARY_PRIMITIVE:
				return createBase64BinaryPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.BINDING_STRENGTH_LIST_OBJECT:
				return createBindingStrengthListObjectFromString(eDataType, initialValue);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_CATEGORY_LIST_OBJECT:
				return createBiologicallyDerivedProductCategoryListObjectFromString(eDataType, initialValue);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STATUS_LIST_OBJECT:
				return createBiologicallyDerivedProductStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE_SCALE_LIST_OBJECT:
				return createBiologicallyDerivedProductStorageScaleListObjectFromString(eDataType, initialValue);
			case FhirPackage.BOOLEAN_PRIMITIVE:
				return createBooleanPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.BOOLEAN_PRIMITIVE_OBJECT:
				return createBooleanPrimitiveObjectFromString(eDataType, initialValue);
			case FhirPackage.BUNDLE_TYPE_LIST_OBJECT:
				return createBundleTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.CANONICAL_PRIMITIVE:
				return createCanonicalPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.CAPABILITY_STATEMENT_KIND_LIST_OBJECT:
				return createCapabilityStatementKindListObjectFromString(eDataType, initialValue);
			case FhirPackage.CARE_PLAN_ACTIVITY_KIND_LIST_OBJECT:
				return createCarePlanActivityKindListObjectFromString(eDataType, initialValue);
			case FhirPackage.CARE_PLAN_ACTIVITY_STATUS_LIST_OBJECT:
				return createCarePlanActivityStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.CARE_PLAN_INTENT_LIST_OBJECT:
				return createCarePlanIntentListObjectFromString(eDataType, initialValue);
			case FhirPackage.CARE_TEAM_STATUS_LIST_OBJECT:
				return createCareTeamStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.CATALOG_ENTRY_RELATION_TYPE_LIST_OBJECT:
				return createCatalogEntryRelationTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.CHARGE_ITEM_STATUS_LIST_OBJECT:
				return createChargeItemStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.CLAIM_PROCESSING_CODES_LIST_OBJECT:
				return createClaimProcessingCodesListObjectFromString(eDataType, initialValue);
			case FhirPackage.CLINICAL_IMPRESSION_STATUS_LIST_OBJECT:
				return createClinicalImpressionStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.CODE_PRIMITIVE:
				return createCodePrimitiveFromString(eDataType, initialValue);
			case FhirPackage.CODE_SEARCH_SUPPORT_LIST_OBJECT:
				return createCodeSearchSupportListObjectFromString(eDataType, initialValue);
			case FhirPackage.CODE_SYSTEM_CONTENT_MODE_LIST_OBJECT:
				return createCodeSystemContentModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.CODE_SYSTEM_HIERARCHY_MEANING_LIST_OBJECT:
				return createCodeSystemHierarchyMeaningListObjectFromString(eDataType, initialValue);
			case FhirPackage.COMPARTMENT_TYPE_LIST_OBJECT:
				return createCompartmentTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.COMPOSITION_ATTESTATION_MODE_LIST_OBJECT:
				return createCompositionAttestationModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.COMPOSITION_STATUS_LIST_OBJECT:
				return createCompositionStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONCEPT_MAP_EQUIVALENCE_LIST_OBJECT:
				return createConceptMapEquivalenceListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONCEPT_MAP_GROUP_UNMAPPED_MODE_LIST_OBJECT:
				return createConceptMapGroupUnmappedModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONDITIONAL_DELETE_STATUS_LIST_OBJECT:
				return createConditionalDeleteStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONDITIONAL_READ_STATUS_LIST_OBJECT:
				return createConditionalReadStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONSENT_DATA_MEANING_LIST_OBJECT:
				return createConsentDataMeaningListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONSENT_PROVISION_TYPE_LIST_OBJECT:
				return createConsentProvisionTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONSENT_STATE_LIST_OBJECT:
				return createConsentStateListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONSTRAINT_SEVERITY_LIST_OBJECT:
				return createConstraintSeverityListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONTACT_POINT_SYSTEM_LIST_OBJECT:
				return createContactPointSystemListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONTACT_POINT_USE_LIST_OBJECT:
				return createContactPointUseListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONTRACT_RESOURCE_PUBLICATION_STATUS_CODES_LIST_OBJECT:
				return createContractResourcePublicationStatusCodesListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONTRACT_RESOURCE_STATUS_CODES_LIST_OBJECT:
				return createContractResourceStatusCodesListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONTRIBUTOR_TYPE_LIST_OBJECT:
				return createContributorTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.DATE_PRIMITIVE:
				return createDatePrimitiveFromString(eDataType, initialValue);
			case FhirPackage.DATE_PRIMITIVE_BASE:
				return createDatePrimitiveBaseFromString(eDataType, initialValue);
			case FhirPackage.DATE_TIME_PRIMITIVE:
				return createDateTimePrimitiveFromString(eDataType, initialValue);
			case FhirPackage.DATE_TIME_PRIMITIVE_BASE:
				return createDateTimePrimitiveBaseFromString(eDataType, initialValue);
			case FhirPackage.DAYS_OF_WEEK_LIST_OBJECT:
				return createDaysOfWeekListObjectFromString(eDataType, initialValue);
			case FhirPackage.DECIMAL_PRIMITIVE:
				return createDecimalPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.DETECTED_ISSUE_SEVERITY_LIST_OBJECT:
				return createDetectedIssueSeverityListObjectFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_STATE_LIST_OBJECT:
				return createDeviceMetricCalibrationStateListObjectFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_TYPE_LIST_OBJECT:
				return createDeviceMetricCalibrationTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_METRIC_CATEGORY_LIST_OBJECT:
				return createDeviceMetricCategoryListObjectFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_METRIC_COLOR_LIST_OBJECT:
				return createDeviceMetricColorListObjectFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_METRIC_OPERATIONAL_STATUS_LIST_OBJECT:
				return createDeviceMetricOperationalStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_NAME_TYPE_LIST_OBJECT:
				return createDeviceNameTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_USE_STATEMENT_STATUS_LIST_OBJECT:
				return createDeviceUseStatementStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.DIAGNOSTIC_REPORT_STATUS_LIST_OBJECT:
				return createDiagnosticReportStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.DISCRIMINATOR_TYPE_LIST_OBJECT:
				return createDiscriminatorTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.DOCUMENT_MODE_LIST_OBJECT:
				return createDocumentModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.DOCUMENT_REFERENCE_STATUS_LIST_OBJECT:
				return createDocumentReferenceStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.DOCUMENT_RELATIONSHIP_TYPE_LIST_OBJECT:
				return createDocumentRelationshipTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.ELIGIBILITY_REQUEST_PURPOSE_LIST_OBJECT:
				return createEligibilityRequestPurposeListObjectFromString(eDataType, initialValue);
			case FhirPackage.ELIGIBILITY_RESPONSE_PURPOSE_LIST_OBJECT:
				return createEligibilityResponsePurposeListObjectFromString(eDataType, initialValue);
			case FhirPackage.ENABLE_WHEN_BEHAVIOR_LIST_OBJECT:
				return createEnableWhenBehaviorListObjectFromString(eDataType, initialValue);
			case FhirPackage.ENCOUNTER_LOCATION_STATUS_LIST_OBJECT:
				return createEncounterLocationStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.ENCOUNTER_STATUS_LIST_OBJECT:
				return createEncounterStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.ENDPOINT_STATUS_LIST_OBJECT:
				return createEndpointStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.EPISODE_OF_CARE_STATUS_LIST_OBJECT:
				return createEpisodeOfCareStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.EVENT_CAPABILITY_MODE_LIST_OBJECT:
				return createEventCapabilityModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.EVENT_STATUS_LIST_OBJECT:
				return createEventStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.EVENT_TIMING_LIST_OBJECT:
				return createEventTimingListObjectFromString(eDataType, initialValue);
			case FhirPackage.EVIDENCE_VARIABLE_TYPE_LIST_OBJECT:
				return createEvidenceVariableTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.EXAMPLE_SCENARIO_ACTOR_TYPE_LIST_OBJECT:
				return createExampleScenarioActorTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.EXPLANATION_OF_BENEFIT_STATUS_LIST_OBJECT:
				return createExplanationOfBenefitStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.EXPOSURE_STATE_LIST_OBJECT:
				return createExposureStateListObjectFromString(eDataType, initialValue);
			case FhirPackage.EXPRESSION_LANGUAGE_LIST_OBJECT:
				return createExpressionLanguageListObjectFromString(eDataType, initialValue);
			case FhirPackage.EXTENSION_CONTEXT_TYPE_LIST_OBJECT:
				return createExtensionContextTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.FAMILY_HISTORY_STATUS_LIST_OBJECT:
				return createFamilyHistoryStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.FHIR_DEVICE_STATUS_LIST_OBJECT:
				return createFHIRDeviceStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.FHIR_SUBSTANCE_STATUS_LIST_OBJECT:
				return createFHIRSubstanceStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.FHIR_VERSION_LIST_OBJECT:
				return createFHIRVersionListObjectFromString(eDataType, initialValue);
			case FhirPackage.FILTER_OPERATOR_LIST_OBJECT:
				return createFilterOperatorListObjectFromString(eDataType, initialValue);
			case FhirPackage.FINANCIAL_RESOURCE_STATUS_CODES_LIST_OBJECT:
				return createFinancialResourceStatusCodesListObjectFromString(eDataType, initialValue);
			case FhirPackage.FLAG_STATUS_LIST_OBJECT:
				return createFlagStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.GOAL_LIFECYCLE_STATUS_LIST_OBJECT:
				return createGoalLifecycleStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.GRAPH_COMPARTMENT_RULE_LIST_OBJECT:
				return createGraphCompartmentRuleListObjectFromString(eDataType, initialValue);
			case FhirPackage.GRAPH_COMPARTMENT_USE_LIST_OBJECT:
				return createGraphCompartmentUseListObjectFromString(eDataType, initialValue);
			case FhirPackage.GROUP_MEASURE_LIST_OBJECT:
				return createGroupMeasureListObjectFromString(eDataType, initialValue);
			case FhirPackage.GROUP_TYPE_LIST_OBJECT:
				return createGroupTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.GUIDANCE_RESPONSE_STATUS_LIST_OBJECT:
				return createGuidanceResponseStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.GUIDE_PAGE_GENERATION_LIST_OBJECT:
				return createGuidePageGenerationListObjectFromString(eDataType, initialValue);
			case FhirPackage.GUIDE_PARAMETER_CODE_LIST_OBJECT:
				return createGuideParameterCodeListObjectFromString(eDataType, initialValue);
			case FhirPackage.HTTP_VERB_LIST_OBJECT:
				return createHTTPVerbListObjectFromString(eDataType, initialValue);
			case FhirPackage.IDENTIFIER_USE_LIST_OBJECT:
				return createIdentifierUseListObjectFromString(eDataType, initialValue);
			case FhirPackage.IDENTITY_ASSURANCE_LEVEL_LIST_OBJECT:
				return createIdentityAssuranceLevelListObjectFromString(eDataType, initialValue);
			case FhirPackage.ID_PRIMITIVE:
				return createIdPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.IMAGING_STUDY_STATUS_LIST_OBJECT:
				return createImagingStudyStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.IMMUNIZATION_EVALUATION_STATUS_CODES_LIST_OBJECT:
				return createImmunizationEvaluationStatusCodesListObjectFromString(eDataType, initialValue);
			case FhirPackage.IMMUNIZATION_STATUS_CODES_LIST_OBJECT:
				return createImmunizationStatusCodesListObjectFromString(eDataType, initialValue);
			case FhirPackage.INSTANT_PRIMITIVE:
				return createInstantPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.INTEGER_PRIMITIVE:
				return createIntegerPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.INTEGER_PRIMITIVE_OBJECT:
				return createIntegerPrimitiveObjectFromString(eDataType, initialValue);
			case FhirPackage.INVOICE_PRICE_COMPONENT_TYPE_LIST_OBJECT:
				return createInvoicePriceComponentTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.INVOICE_STATUS_LIST_OBJECT:
				return createInvoiceStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.ISSUE_SEVERITY_LIST_OBJECT:
				return createIssueSeverityListObjectFromString(eDataType, initialValue);
			case FhirPackage.ISSUE_TYPE_LIST_OBJECT:
				return createIssueTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.LINKAGE_TYPE_LIST_OBJECT:
				return createLinkageTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.LINK_TYPE_LIST_OBJECT:
				return createLinkTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.LIST_MODE_LIST_OBJECT:
				return createListModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.LIST_STATUS_LIST_OBJECT:
				return createListStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.LOCATION_MODE_LIST_OBJECT:
				return createLocationModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.LOCATION_STATUS_LIST_OBJECT:
				return createLocationStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.MARKDOWN_PRIMITIVE:
				return createMarkdownPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.MEASURE_REPORT_STATUS_LIST_OBJECT:
				return createMeasureReportStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.MEASURE_REPORT_TYPE_LIST_OBJECT:
				return createMeasureReportTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_REQUEST_INTENT_LIST_OBJECT:
				return createMedicationRequestIntentListObjectFromString(eDataType, initialValue);
			case FhirPackage.MEDICATIONREQUEST_STATUS_LIST_OBJECT:
				return createMedicationrequestStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_STATUS_CODES_LIST_OBJECT:
				return createMedicationStatusCodesListObjectFromString(eDataType, initialValue);
			case FhirPackage.MESSAGEHEADER_RESPONSE_REQUEST_LIST_OBJECT:
				return createMessageheaderResponseRequestListObjectFromString(eDataType, initialValue);
			case FhirPackage.MESSAGE_SIGNIFICANCE_CATEGORY_LIST_OBJECT:
				return createMessageSignificanceCategoryListObjectFromString(eDataType, initialValue);
			case FhirPackage.NAME_USE_LIST_OBJECT:
				return createNameUseListObjectFromString(eDataType, initialValue);
			case FhirPackage.NAMING_SYSTEM_IDENTIFIER_TYPE_LIST_OBJECT:
				return createNamingSystemIdentifierTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.NAMING_SYSTEM_TYPE_LIST_OBJECT:
				return createNamingSystemTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.NARRATIVE_STATUS_LIST_OBJECT:
				return createNarrativeStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.NOTE_TYPE_LIST_OBJECT:
				return createNoteTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.OBSERVATION_DATA_TYPE_LIST_OBJECT:
				return createObservationDataTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.OBSERVATION_RANGE_CATEGORY_LIST_OBJECT:
				return createObservationRangeCategoryListObjectFromString(eDataType, initialValue);
			case FhirPackage.OBSERVATION_STATUS_LIST_OBJECT:
				return createObservationStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.OID_PRIMITIVE:
				return createOidPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.OPERATION_KIND_LIST_OBJECT:
				return createOperationKindListObjectFromString(eDataType, initialValue);
			case FhirPackage.OPERATION_PARAMETER_USE_LIST_OBJECT:
				return createOperationParameterUseListObjectFromString(eDataType, initialValue);
			case FhirPackage.ORIENTATION_TYPE_LIST_OBJECT:
				return createOrientationTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.PARTICIPANT_REQUIRED_LIST_OBJECT:
				return createParticipantRequiredListObjectFromString(eDataType, initialValue);
			case FhirPackage.PARTICIPATION_STATUS_LIST_OBJECT:
				return createParticipationStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.POSITIVE_INT_PRIMITIVE:
				return createPositiveIntPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.PROPERTY_REPRESENTATION_LIST_OBJECT:
				return createPropertyRepresentationListObjectFromString(eDataType, initialValue);
			case FhirPackage.PROPERTY_TYPE_LIST_OBJECT:
				return createPropertyTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.PROVENANCE_ENTITY_ROLE_LIST_OBJECT:
				return createProvenanceEntityRoleListObjectFromString(eDataType, initialValue);
			case FhirPackage.PUBLICATION_STATUS_LIST_OBJECT:
				return createPublicationStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.QUALITY_TYPE_LIST_OBJECT:
				return createQualityTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.QUANTITY_COMPARATOR_LIST_OBJECT:
				return createQuantityComparatorListObjectFromString(eDataType, initialValue);
			case FhirPackage.QUESTIONNAIRE_ITEM_OPERATOR_LIST_OBJECT:
				return createQuestionnaireItemOperatorListObjectFromString(eDataType, initialValue);
			case FhirPackage.QUESTIONNAIRE_ITEM_TYPE_LIST_OBJECT:
				return createQuestionnaireItemTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.QUESTIONNAIRE_RESPONSE_STATUS_LIST_OBJECT:
				return createQuestionnaireResponseStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.REFERENCE_HANDLING_POLICY_LIST_OBJECT:
				return createReferenceHandlingPolicyListObjectFromString(eDataType, initialValue);
			case FhirPackage.REFERENCE_VERSION_RULES_LIST_OBJECT:
				return createReferenceVersionRulesListObjectFromString(eDataType, initialValue);
			case FhirPackage.RELATED_ARTIFACT_TYPE_LIST_OBJECT:
				return createRelatedArtifactTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.REMITTANCE_OUTCOME_LIST_OBJECT:
				return createRemittanceOutcomeListObjectFromString(eDataType, initialValue);
			case FhirPackage.REPOSITORY_TYPE_LIST_OBJECT:
				return createRepositoryTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.REQUEST_INTENT_LIST_OBJECT:
				return createRequestIntentListObjectFromString(eDataType, initialValue);
			case FhirPackage.REQUEST_PRIORITY_LIST_OBJECT:
				return createRequestPriorityListObjectFromString(eDataType, initialValue);
			case FhirPackage.REQUEST_RESOURCE_TYPE_LIST_OBJECT:
				return createRequestResourceTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.REQUEST_STATUS_LIST_OBJECT:
				return createRequestStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.RESEARCH_ELEMENT_TYPE_LIST_OBJECT:
				return createResearchElementTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.RESEARCH_STUDY_STATUS_LIST_OBJECT:
				return createResearchStudyStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.RESEARCH_SUBJECT_STATUS_LIST_OBJECT:
				return createResearchSubjectStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.RESOURCE_TYPE_LIST_OBJECT:
				return createResourceTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.RESOURCE_VERSION_POLICY_LIST_OBJECT:
				return createResourceVersionPolicyListObjectFromString(eDataType, initialValue);
			case FhirPackage.RESPONSE_TYPE_LIST_OBJECT:
				return createResponseTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.RESTFUL_CAPABILITY_MODE_LIST_OBJECT:
				return createRestfulCapabilityModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.SAMPLED_DATA_DATA_TYPE_PRIMITIVE:
				return createSampledDataDataTypePrimitiveFromString(eDataType, initialValue);
			case FhirPackage.SEARCH_COMPARATOR_LIST_OBJECT:
				return createSearchComparatorListObjectFromString(eDataType, initialValue);
			case FhirPackage.SEARCH_ENTRY_MODE_LIST_OBJECT:
				return createSearchEntryModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.SEARCH_MODIFIER_CODE_LIST_OBJECT:
				return createSearchModifierCodeListObjectFromString(eDataType, initialValue);
			case FhirPackage.SEARCH_PARAM_TYPE_LIST_OBJECT:
				return createSearchParamTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.SEQUENCE_TYPE_LIST_OBJECT:
				return createSequenceTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.SLICING_RULES_LIST_OBJECT:
				return createSlicingRulesListObjectFromString(eDataType, initialValue);
			case FhirPackage.SLOT_STATUS_LIST_OBJECT:
				return createSlotStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.SORT_DIRECTION_LIST_OBJECT:
				return createSortDirectionListObjectFromString(eDataType, initialValue);
			case FhirPackage.SPDX_LICENSE_LIST_OBJECT:
				return createSPDXLicenseListObjectFromString(eDataType, initialValue);
			case FhirPackage.SPECIMEN_CONTAINED_PREFERENCE_LIST_OBJECT:
				return createSpecimenContainedPreferenceListObjectFromString(eDataType, initialValue);
			case FhirPackage.SPECIMEN_STATUS_LIST_OBJECT:
				return createSpecimenStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.STATUS_LIST_OBJECT:
				return createStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.STRAND_TYPE_LIST_OBJECT:
				return createStrandTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.STRING_PRIMITIVE:
				return createStringPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_DEFINITION_KIND_LIST_OBJECT:
				return createStructureDefinitionKindListObjectFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_CONTEXT_TYPE_LIST_OBJECT:
				return createStructureMapContextTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_GROUP_TYPE_MODE_LIST_OBJECT:
				return createStructureMapGroupTypeModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_INPUT_MODE_LIST_OBJECT:
				return createStructureMapInputModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_MODEL_MODE_LIST_OBJECT:
				return createStructureMapModelModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_SOURCE_LIST_MODE_LIST_OBJECT:
				return createStructureMapSourceListModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_TARGET_LIST_MODE_LIST_OBJECT:
				return createStructureMapTargetListModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_TRANSFORM_LIST_OBJECT:
				return createStructureMapTransformListObjectFromString(eDataType, initialValue);
			case FhirPackage.SUBSCRIPTION_CHANNEL_TYPE_LIST_OBJECT:
				return createSubscriptionChannelTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.SUBSCRIPTION_STATUS_LIST_OBJECT:
				return createSubscriptionStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.SUPPLY_DELIVERY_STATUS_LIST_OBJECT:
				return createSupplyDeliveryStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.SUPPLY_REQUEST_STATUS_LIST_OBJECT:
				return createSupplyRequestStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.SYSTEM_RESTFUL_INTERACTION_LIST_OBJECT:
				return createSystemRestfulInteractionListObjectFromString(eDataType, initialValue);
			case FhirPackage.TASK_INTENT_LIST_OBJECT:
				return createTaskIntentListObjectFromString(eDataType, initialValue);
			case FhirPackage.TASK_STATUS_LIST_OBJECT:
				return createTaskStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.TEST_REPORT_ACTION_RESULT_LIST_OBJECT:
				return createTestReportActionResultListObjectFromString(eDataType, initialValue);
			case FhirPackage.TEST_REPORT_PARTICIPANT_TYPE_LIST_OBJECT:
				return createTestReportParticipantTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.TEST_REPORT_RESULT_LIST_OBJECT:
				return createTestReportResultListObjectFromString(eDataType, initialValue);
			case FhirPackage.TEST_REPORT_STATUS_LIST_OBJECT:
				return createTestReportStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.TEST_SCRIPT_REQUEST_METHOD_CODE_LIST_OBJECT:
				return createTestScriptRequestMethodCodeListObjectFromString(eDataType, initialValue);
			case FhirPackage.TIME_PRIMITIVE:
				return createTimePrimitiveFromString(eDataType, initialValue);
			case FhirPackage.TRIGGER_TYPE_LIST_OBJECT:
				return createTriggerTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.TYPE_DERIVATION_RULE_LIST_OBJECT:
				return createTypeDerivationRuleListObjectFromString(eDataType, initialValue);
			case FhirPackage.TYPE_RESTFUL_INTERACTION_LIST_OBJECT:
				return createTypeRestfulInteractionListObjectFromString(eDataType, initialValue);
			case FhirPackage.UDI_ENTRY_TYPE_LIST_OBJECT:
				return createUDIEntryTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.UNITS_OF_TIME_LIST_OBJECT:
				return createUnitsOfTimeListObjectFromString(eDataType, initialValue);
			case FhirPackage.UNSIGNED_INT_PRIMITIVE:
				return createUnsignedIntPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.URI_PRIMITIVE:
				return createUriPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.URL_PRIMITIVE:
				return createUrlPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.USE_LIST_OBJECT:
				return createUseListObjectFromString(eDataType, initialValue);
			case FhirPackage.UUID_PRIMITIVE:
				return createUuidPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.VARIABLE_TYPE_LIST_OBJECT:
				return createVariableTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.VCONFIDENTIALITY_CLASSIFICATION_LIST_OBJECT:
				return createVConfidentialityClassificationListObjectFromString(eDataType, initialValue);
			case FhirPackage.VISION_BASE_LIST_OBJECT:
				return createVisionBaseListObjectFromString(eDataType, initialValue);
			case FhirPackage.VISION_EYES_LIST_OBJECT:
				return createVisionEyesListObjectFromString(eDataType, initialValue);
			case FhirPackage.XPATH_USAGE_TYPE_LIST_OBJECT:
				return createXPathUsageTypeListObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case FhirPackage.ACCOUNT_STATUS_LIST:
				return convertAccountStatusListToString(eDataType, instanceValue);
			case FhirPackage.ACTION_CARDINALITY_BEHAVIOR_LIST:
				return convertActionCardinalityBehaviorListToString(eDataType, instanceValue);
			case FhirPackage.ACTION_CONDITION_KIND_LIST:
				return convertActionConditionKindListToString(eDataType, instanceValue);
			case FhirPackage.ACTION_GROUPING_BEHAVIOR_LIST:
				return convertActionGroupingBehaviorListToString(eDataType, instanceValue);
			case FhirPackage.ACTION_PARTICIPANT_TYPE_LIST:
				return convertActionParticipantTypeListToString(eDataType, instanceValue);
			case FhirPackage.ACTION_PRECHECK_BEHAVIOR_LIST:
				return convertActionPrecheckBehaviorListToString(eDataType, instanceValue);
			case FhirPackage.ACTION_RELATIONSHIP_TYPE_LIST:
				return convertActionRelationshipTypeListToString(eDataType, instanceValue);
			case FhirPackage.ACTION_REQUIRED_BEHAVIOR_LIST:
				return convertActionRequiredBehaviorListToString(eDataType, instanceValue);
			case FhirPackage.ACTION_SELECTION_BEHAVIOR_LIST:
				return convertActionSelectionBehaviorListToString(eDataType, instanceValue);
			case FhirPackage.ADDRESS_TYPE_LIST:
				return convertAddressTypeListToString(eDataType, instanceValue);
			case FhirPackage.ADDRESS_USE_LIST:
				return convertAddressUseListToString(eDataType, instanceValue);
			case FhirPackage.ADMINISTRATIVE_GENDER_LIST:
				return convertAdministrativeGenderListToString(eDataType, instanceValue);
			case FhirPackage.ADVERSE_EVENT_ACTUALITY_LIST:
				return convertAdverseEventActualityListToString(eDataType, instanceValue);
			case FhirPackage.AGGREGATION_MODE_LIST:
				return convertAggregationModeListToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CATEGORY_LIST:
				return convertAllergyIntoleranceCategoryListToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CRITICALITY_LIST:
				return convertAllergyIntoleranceCriticalityListToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_SEVERITY_LIST:
				return convertAllergyIntoleranceSeverityListToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_TYPE_LIST:
				return convertAllergyIntoleranceTypeListToString(eDataType, instanceValue);
			case FhirPackage.APPOINTMENT_STATUS_LIST:
				return convertAppointmentStatusListToString(eDataType, instanceValue);
			case FhirPackage.ASSERTION_DIRECTION_TYPE_LIST:
				return convertAssertionDirectionTypeListToString(eDataType, instanceValue);
			case FhirPackage.ASSERTION_OPERATOR_TYPE_LIST:
				return convertAssertionOperatorTypeListToString(eDataType, instanceValue);
			case FhirPackage.ASSERTION_RESPONSE_TYPES_LIST:
				return convertAssertionResponseTypesListToString(eDataType, instanceValue);
			case FhirPackage.AUDIT_EVENT_ACTION_LIST:
				return convertAuditEventActionListToString(eDataType, instanceValue);
			case FhirPackage.AUDIT_EVENT_AGENT_NETWORK_TYPE_LIST:
				return convertAuditEventAgentNetworkTypeListToString(eDataType, instanceValue);
			case FhirPackage.AUDIT_EVENT_OUTCOME_LIST:
				return convertAuditEventOutcomeListToString(eDataType, instanceValue);
			case FhirPackage.BINDING_STRENGTH_LIST:
				return convertBindingStrengthListToString(eDataType, instanceValue);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_CATEGORY_LIST:
				return convertBiologicallyDerivedProductCategoryListToString(eDataType, instanceValue);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STATUS_LIST:
				return convertBiologicallyDerivedProductStatusListToString(eDataType, instanceValue);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE_SCALE_LIST:
				return convertBiologicallyDerivedProductStorageScaleListToString(eDataType, instanceValue);
			case FhirPackage.BUNDLE_TYPE_LIST:
				return convertBundleTypeListToString(eDataType, instanceValue);
			case FhirPackage.CAPABILITY_STATEMENT_KIND_LIST:
				return convertCapabilityStatementKindListToString(eDataType, instanceValue);
			case FhirPackage.CARE_PLAN_ACTIVITY_KIND_LIST:
				return convertCarePlanActivityKindListToString(eDataType, instanceValue);
			case FhirPackage.CARE_PLAN_ACTIVITY_STATUS_LIST:
				return convertCarePlanActivityStatusListToString(eDataType, instanceValue);
			case FhirPackage.CARE_PLAN_INTENT_LIST:
				return convertCarePlanIntentListToString(eDataType, instanceValue);
			case FhirPackage.CARE_TEAM_STATUS_LIST:
				return convertCareTeamStatusListToString(eDataType, instanceValue);
			case FhirPackage.CATALOG_ENTRY_RELATION_TYPE_LIST:
				return convertCatalogEntryRelationTypeListToString(eDataType, instanceValue);
			case FhirPackage.CHARGE_ITEM_STATUS_LIST:
				return convertChargeItemStatusListToString(eDataType, instanceValue);
			case FhirPackage.CLAIM_PROCESSING_CODES_LIST:
				return convertClaimProcessingCodesListToString(eDataType, instanceValue);
			case FhirPackage.CLINICAL_IMPRESSION_STATUS_LIST:
				return convertClinicalImpressionStatusListToString(eDataType, instanceValue);
			case FhirPackage.CODE_SEARCH_SUPPORT_LIST:
				return convertCodeSearchSupportListToString(eDataType, instanceValue);
			case FhirPackage.CODE_SYSTEM_CONTENT_MODE_LIST:
				return convertCodeSystemContentModeListToString(eDataType, instanceValue);
			case FhirPackage.CODE_SYSTEM_HIERARCHY_MEANING_LIST:
				return convertCodeSystemHierarchyMeaningListToString(eDataType, instanceValue);
			case FhirPackage.COMPARTMENT_TYPE_LIST:
				return convertCompartmentTypeListToString(eDataType, instanceValue);
			case FhirPackage.COMPOSITION_ATTESTATION_MODE_LIST:
				return convertCompositionAttestationModeListToString(eDataType, instanceValue);
			case FhirPackage.COMPOSITION_STATUS_LIST:
				return convertCompositionStatusListToString(eDataType, instanceValue);
			case FhirPackage.CONCEPT_MAP_EQUIVALENCE_LIST:
				return convertConceptMapEquivalenceListToString(eDataType, instanceValue);
			case FhirPackage.CONCEPT_MAP_GROUP_UNMAPPED_MODE_LIST:
				return convertConceptMapGroupUnmappedModeListToString(eDataType, instanceValue);
			case FhirPackage.CONDITIONAL_DELETE_STATUS_LIST:
				return convertConditionalDeleteStatusListToString(eDataType, instanceValue);
			case FhirPackage.CONDITIONAL_READ_STATUS_LIST:
				return convertConditionalReadStatusListToString(eDataType, instanceValue);
			case FhirPackage.CONSENT_DATA_MEANING_LIST:
				return convertConsentDataMeaningListToString(eDataType, instanceValue);
			case FhirPackage.CONSENT_PROVISION_TYPE_LIST:
				return convertConsentProvisionTypeListToString(eDataType, instanceValue);
			case FhirPackage.CONSENT_STATE_LIST:
				return convertConsentStateListToString(eDataType, instanceValue);
			case FhirPackage.CONSTRAINT_SEVERITY_LIST:
				return convertConstraintSeverityListToString(eDataType, instanceValue);
			case FhirPackage.CONTACT_POINT_SYSTEM_LIST:
				return convertContactPointSystemListToString(eDataType, instanceValue);
			case FhirPackage.CONTACT_POINT_USE_LIST:
				return convertContactPointUseListToString(eDataType, instanceValue);
			case FhirPackage.CONTRACT_RESOURCE_PUBLICATION_STATUS_CODES_LIST:
				return convertContractResourcePublicationStatusCodesListToString(eDataType, instanceValue);
			case FhirPackage.CONTRACT_RESOURCE_STATUS_CODES_LIST:
				return convertContractResourceStatusCodesListToString(eDataType, instanceValue);
			case FhirPackage.CONTRIBUTOR_TYPE_LIST:
				return convertContributorTypeListToString(eDataType, instanceValue);
			case FhirPackage.DAYS_OF_WEEK_LIST:
				return convertDaysOfWeekListToString(eDataType, instanceValue);
			case FhirPackage.DETECTED_ISSUE_SEVERITY_LIST:
				return convertDetectedIssueSeverityListToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_STATE_LIST:
				return convertDeviceMetricCalibrationStateListToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_TYPE_LIST:
				return convertDeviceMetricCalibrationTypeListToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_METRIC_CATEGORY_LIST:
				return convertDeviceMetricCategoryListToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_METRIC_COLOR_LIST:
				return convertDeviceMetricColorListToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_METRIC_OPERATIONAL_STATUS_LIST:
				return convertDeviceMetricOperationalStatusListToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_NAME_TYPE_LIST:
				return convertDeviceNameTypeListToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_USE_STATEMENT_STATUS_LIST:
				return convertDeviceUseStatementStatusListToString(eDataType, instanceValue);
			case FhirPackage.DIAGNOSTIC_REPORT_STATUS_LIST:
				return convertDiagnosticReportStatusListToString(eDataType, instanceValue);
			case FhirPackage.DISCRIMINATOR_TYPE_LIST:
				return convertDiscriminatorTypeListToString(eDataType, instanceValue);
			case FhirPackage.DOCUMENT_MODE_LIST:
				return convertDocumentModeListToString(eDataType, instanceValue);
			case FhirPackage.DOCUMENT_REFERENCE_STATUS_LIST:
				return convertDocumentReferenceStatusListToString(eDataType, instanceValue);
			case FhirPackage.DOCUMENT_RELATIONSHIP_TYPE_LIST:
				return convertDocumentRelationshipTypeListToString(eDataType, instanceValue);
			case FhirPackage.ELIGIBILITY_REQUEST_PURPOSE_LIST:
				return convertEligibilityRequestPurposeListToString(eDataType, instanceValue);
			case FhirPackage.ELIGIBILITY_RESPONSE_PURPOSE_LIST:
				return convertEligibilityResponsePurposeListToString(eDataType, instanceValue);
			case FhirPackage.ENABLE_WHEN_BEHAVIOR_LIST:
				return convertEnableWhenBehaviorListToString(eDataType, instanceValue);
			case FhirPackage.ENCOUNTER_LOCATION_STATUS_LIST:
				return convertEncounterLocationStatusListToString(eDataType, instanceValue);
			case FhirPackage.ENCOUNTER_STATUS_LIST:
				return convertEncounterStatusListToString(eDataType, instanceValue);
			case FhirPackage.ENDPOINT_STATUS_LIST:
				return convertEndpointStatusListToString(eDataType, instanceValue);
			case FhirPackage.EPISODE_OF_CARE_STATUS_LIST:
				return convertEpisodeOfCareStatusListToString(eDataType, instanceValue);
			case FhirPackage.EVENT_CAPABILITY_MODE_LIST:
				return convertEventCapabilityModeListToString(eDataType, instanceValue);
			case FhirPackage.EVENT_STATUS_LIST:
				return convertEventStatusListToString(eDataType, instanceValue);
			case FhirPackage.EVENT_TIMING_LIST:
				return convertEventTimingListToString(eDataType, instanceValue);
			case FhirPackage.EVIDENCE_VARIABLE_TYPE_LIST:
				return convertEvidenceVariableTypeListToString(eDataType, instanceValue);
			case FhirPackage.EXAMPLE_SCENARIO_ACTOR_TYPE_LIST:
				return convertExampleScenarioActorTypeListToString(eDataType, instanceValue);
			case FhirPackage.EXPLANATION_OF_BENEFIT_STATUS_LIST:
				return convertExplanationOfBenefitStatusListToString(eDataType, instanceValue);
			case FhirPackage.EXPOSURE_STATE_LIST:
				return convertExposureStateListToString(eDataType, instanceValue);
			case FhirPackage.EXPRESSION_LANGUAGE_LIST:
				return convertExpressionLanguageListToString(eDataType, instanceValue);
			case FhirPackage.EXTENSION_CONTEXT_TYPE_LIST:
				return convertExtensionContextTypeListToString(eDataType, instanceValue);
			case FhirPackage.FAMILY_HISTORY_STATUS_LIST:
				return convertFamilyHistoryStatusListToString(eDataType, instanceValue);
			case FhirPackage.FHIR_DEVICE_STATUS_LIST:
				return convertFHIRDeviceStatusListToString(eDataType, instanceValue);
			case FhirPackage.FHIR_SUBSTANCE_STATUS_LIST:
				return convertFHIRSubstanceStatusListToString(eDataType, instanceValue);
			case FhirPackage.FHIR_VERSION_LIST:
				return convertFHIRVersionListToString(eDataType, instanceValue);
			case FhirPackage.FILTER_OPERATOR_LIST:
				return convertFilterOperatorListToString(eDataType, instanceValue);
			case FhirPackage.FINANCIAL_RESOURCE_STATUS_CODES_LIST:
				return convertFinancialResourceStatusCodesListToString(eDataType, instanceValue);
			case FhirPackage.FLAG_STATUS_LIST:
				return convertFlagStatusListToString(eDataType, instanceValue);
			case FhirPackage.GOAL_LIFECYCLE_STATUS_LIST:
				return convertGoalLifecycleStatusListToString(eDataType, instanceValue);
			case FhirPackage.GRAPH_COMPARTMENT_RULE_LIST:
				return convertGraphCompartmentRuleListToString(eDataType, instanceValue);
			case FhirPackage.GRAPH_COMPARTMENT_USE_LIST:
				return convertGraphCompartmentUseListToString(eDataType, instanceValue);
			case FhirPackage.GROUP_MEASURE_LIST:
				return convertGroupMeasureListToString(eDataType, instanceValue);
			case FhirPackage.GROUP_TYPE_LIST:
				return convertGroupTypeListToString(eDataType, instanceValue);
			case FhirPackage.GUIDANCE_RESPONSE_STATUS_LIST:
				return convertGuidanceResponseStatusListToString(eDataType, instanceValue);
			case FhirPackage.GUIDE_PAGE_GENERATION_LIST:
				return convertGuidePageGenerationListToString(eDataType, instanceValue);
			case FhirPackage.GUIDE_PARAMETER_CODE_LIST:
				return convertGuideParameterCodeListToString(eDataType, instanceValue);
			case FhirPackage.HTTP_VERB_LIST:
				return convertHTTPVerbListToString(eDataType, instanceValue);
			case FhirPackage.IDENTIFIER_USE_LIST:
				return convertIdentifierUseListToString(eDataType, instanceValue);
			case FhirPackage.IDENTITY_ASSURANCE_LEVEL_LIST:
				return convertIdentityAssuranceLevelListToString(eDataType, instanceValue);
			case FhirPackage.IMAGING_STUDY_STATUS_LIST:
				return convertImagingStudyStatusListToString(eDataType, instanceValue);
			case FhirPackage.IMMUNIZATION_EVALUATION_STATUS_CODES_LIST:
				return convertImmunizationEvaluationStatusCodesListToString(eDataType, instanceValue);
			case FhirPackage.IMMUNIZATION_STATUS_CODES_LIST:
				return convertImmunizationStatusCodesListToString(eDataType, instanceValue);
			case FhirPackage.INVOICE_PRICE_COMPONENT_TYPE_LIST:
				return convertInvoicePriceComponentTypeListToString(eDataType, instanceValue);
			case FhirPackage.INVOICE_STATUS_LIST:
				return convertInvoiceStatusListToString(eDataType, instanceValue);
			case FhirPackage.ISSUE_SEVERITY_LIST:
				return convertIssueSeverityListToString(eDataType, instanceValue);
			case FhirPackage.ISSUE_TYPE_LIST:
				return convertIssueTypeListToString(eDataType, instanceValue);
			case FhirPackage.LINKAGE_TYPE_LIST:
				return convertLinkageTypeListToString(eDataType, instanceValue);
			case FhirPackage.LINK_TYPE_LIST:
				return convertLinkTypeListToString(eDataType, instanceValue);
			case FhirPackage.LIST_MODE_LIST:
				return convertListModeListToString(eDataType, instanceValue);
			case FhirPackage.LIST_STATUS_LIST:
				return convertListStatusListToString(eDataType, instanceValue);
			case FhirPackage.LOCATION_MODE_LIST:
				return convertLocationModeListToString(eDataType, instanceValue);
			case FhirPackage.LOCATION_STATUS_LIST:
				return convertLocationStatusListToString(eDataType, instanceValue);
			case FhirPackage.MEASURE_REPORT_STATUS_LIST:
				return convertMeasureReportStatusListToString(eDataType, instanceValue);
			case FhirPackage.MEASURE_REPORT_TYPE_LIST:
				return convertMeasureReportTypeListToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_REQUEST_INTENT_LIST:
				return convertMedicationRequestIntentListToString(eDataType, instanceValue);
			case FhirPackage.MEDICATIONREQUEST_STATUS_LIST:
				return convertMedicationrequestStatusListToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_STATUS_CODES_LIST:
				return convertMedicationStatusCodesListToString(eDataType, instanceValue);
			case FhirPackage.MESSAGEHEADER_RESPONSE_REQUEST_LIST:
				return convertMessageheaderResponseRequestListToString(eDataType, instanceValue);
			case FhirPackage.MESSAGE_SIGNIFICANCE_CATEGORY_LIST:
				return convertMessageSignificanceCategoryListToString(eDataType, instanceValue);
			case FhirPackage.NAME_USE_LIST:
				return convertNameUseListToString(eDataType, instanceValue);
			case FhirPackage.NAMING_SYSTEM_IDENTIFIER_TYPE_LIST:
				return convertNamingSystemIdentifierTypeListToString(eDataType, instanceValue);
			case FhirPackage.NAMING_SYSTEM_TYPE_LIST:
				return convertNamingSystemTypeListToString(eDataType, instanceValue);
			case FhirPackage.NARRATIVE_STATUS_LIST:
				return convertNarrativeStatusListToString(eDataType, instanceValue);
			case FhirPackage.NOTE_TYPE_LIST:
				return convertNoteTypeListToString(eDataType, instanceValue);
			case FhirPackage.OBSERVATION_DATA_TYPE_LIST:
				return convertObservationDataTypeListToString(eDataType, instanceValue);
			case FhirPackage.OBSERVATION_RANGE_CATEGORY_LIST:
				return convertObservationRangeCategoryListToString(eDataType, instanceValue);
			case FhirPackage.OBSERVATION_STATUS_LIST:
				return convertObservationStatusListToString(eDataType, instanceValue);
			case FhirPackage.OPERATION_KIND_LIST:
				return convertOperationKindListToString(eDataType, instanceValue);
			case FhirPackage.OPERATION_PARAMETER_USE_LIST:
				return convertOperationParameterUseListToString(eDataType, instanceValue);
			case FhirPackage.ORIENTATION_TYPE_LIST:
				return convertOrientationTypeListToString(eDataType, instanceValue);
			case FhirPackage.PARTICIPANT_REQUIRED_LIST:
				return convertParticipantRequiredListToString(eDataType, instanceValue);
			case FhirPackage.PARTICIPATION_STATUS_LIST:
				return convertParticipationStatusListToString(eDataType, instanceValue);
			case FhirPackage.PROPERTY_REPRESENTATION_LIST:
				return convertPropertyRepresentationListToString(eDataType, instanceValue);
			case FhirPackage.PROPERTY_TYPE_LIST:
				return convertPropertyTypeListToString(eDataType, instanceValue);
			case FhirPackage.PROVENANCE_ENTITY_ROLE_LIST:
				return convertProvenanceEntityRoleListToString(eDataType, instanceValue);
			case FhirPackage.PUBLICATION_STATUS_LIST:
				return convertPublicationStatusListToString(eDataType, instanceValue);
			case FhirPackage.QUALITY_TYPE_LIST:
				return convertQualityTypeListToString(eDataType, instanceValue);
			case FhirPackage.QUANTITY_COMPARATOR_LIST:
				return convertQuantityComparatorListToString(eDataType, instanceValue);
			case FhirPackage.QUESTIONNAIRE_ITEM_OPERATOR_LIST:
				return convertQuestionnaireItemOperatorListToString(eDataType, instanceValue);
			case FhirPackage.QUESTIONNAIRE_ITEM_TYPE_LIST:
				return convertQuestionnaireItemTypeListToString(eDataType, instanceValue);
			case FhirPackage.QUESTIONNAIRE_RESPONSE_STATUS_LIST:
				return convertQuestionnaireResponseStatusListToString(eDataType, instanceValue);
			case FhirPackage.REFERENCE_HANDLING_POLICY_LIST:
				return convertReferenceHandlingPolicyListToString(eDataType, instanceValue);
			case FhirPackage.REFERENCE_VERSION_RULES_LIST:
				return convertReferenceVersionRulesListToString(eDataType, instanceValue);
			case FhirPackage.RELATED_ARTIFACT_TYPE_LIST:
				return convertRelatedArtifactTypeListToString(eDataType, instanceValue);
			case FhirPackage.REMITTANCE_OUTCOME_LIST:
				return convertRemittanceOutcomeListToString(eDataType, instanceValue);
			case FhirPackage.REPOSITORY_TYPE_LIST:
				return convertRepositoryTypeListToString(eDataType, instanceValue);
			case FhirPackage.REQUEST_INTENT_LIST:
				return convertRequestIntentListToString(eDataType, instanceValue);
			case FhirPackage.REQUEST_PRIORITY_LIST:
				return convertRequestPriorityListToString(eDataType, instanceValue);
			case FhirPackage.REQUEST_RESOURCE_TYPE_LIST:
				return convertRequestResourceTypeListToString(eDataType, instanceValue);
			case FhirPackage.REQUEST_STATUS_LIST:
				return convertRequestStatusListToString(eDataType, instanceValue);
			case FhirPackage.RESEARCH_ELEMENT_TYPE_LIST:
				return convertResearchElementTypeListToString(eDataType, instanceValue);
			case FhirPackage.RESEARCH_STUDY_STATUS_LIST:
				return convertResearchStudyStatusListToString(eDataType, instanceValue);
			case FhirPackage.RESEARCH_SUBJECT_STATUS_LIST:
				return convertResearchSubjectStatusListToString(eDataType, instanceValue);
			case FhirPackage.RESOURCE_TYPE_LIST:
				return convertResourceTypeListToString(eDataType, instanceValue);
			case FhirPackage.RESOURCE_VERSION_POLICY_LIST:
				return convertResourceVersionPolicyListToString(eDataType, instanceValue);
			case FhirPackage.RESPONSE_TYPE_LIST:
				return convertResponseTypeListToString(eDataType, instanceValue);
			case FhirPackage.RESTFUL_CAPABILITY_MODE_LIST:
				return convertRestfulCapabilityModeListToString(eDataType, instanceValue);
			case FhirPackage.SEARCH_COMPARATOR_LIST:
				return convertSearchComparatorListToString(eDataType, instanceValue);
			case FhirPackage.SEARCH_ENTRY_MODE_LIST:
				return convertSearchEntryModeListToString(eDataType, instanceValue);
			case FhirPackage.SEARCH_MODIFIER_CODE_LIST:
				return convertSearchModifierCodeListToString(eDataType, instanceValue);
			case FhirPackage.SEARCH_PARAM_TYPE_LIST:
				return convertSearchParamTypeListToString(eDataType, instanceValue);
			case FhirPackage.SEQUENCE_TYPE_LIST:
				return convertSequenceTypeListToString(eDataType, instanceValue);
			case FhirPackage.SLICING_RULES_LIST:
				return convertSlicingRulesListToString(eDataType, instanceValue);
			case FhirPackage.SLOT_STATUS_LIST:
				return convertSlotStatusListToString(eDataType, instanceValue);
			case FhirPackage.SORT_DIRECTION_LIST:
				return convertSortDirectionListToString(eDataType, instanceValue);
			case FhirPackage.SPDX_LICENSE_LIST:
				return convertSPDXLicenseListToString(eDataType, instanceValue);
			case FhirPackage.SPECIMEN_CONTAINED_PREFERENCE_LIST:
				return convertSpecimenContainedPreferenceListToString(eDataType, instanceValue);
			case FhirPackage.SPECIMEN_STATUS_LIST:
				return convertSpecimenStatusListToString(eDataType, instanceValue);
			case FhirPackage.STATUS_LIST:
				return convertStatusListToString(eDataType, instanceValue);
			case FhirPackage.STRAND_TYPE_LIST:
				return convertStrandTypeListToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_DEFINITION_KIND_LIST:
				return convertStructureDefinitionKindListToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_CONTEXT_TYPE_LIST:
				return convertStructureMapContextTypeListToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_GROUP_TYPE_MODE_LIST:
				return convertStructureMapGroupTypeModeListToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_INPUT_MODE_LIST:
				return convertStructureMapInputModeListToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_MODEL_MODE_LIST:
				return convertStructureMapModelModeListToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_SOURCE_LIST_MODE_LIST:
				return convertStructureMapSourceListModeListToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_TARGET_LIST_MODE_LIST:
				return convertStructureMapTargetListModeListToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_TRANSFORM_LIST:
				return convertStructureMapTransformListToString(eDataType, instanceValue);
			case FhirPackage.SUBSCRIPTION_CHANNEL_TYPE_LIST:
				return convertSubscriptionChannelTypeListToString(eDataType, instanceValue);
			case FhirPackage.SUBSCRIPTION_STATUS_LIST:
				return convertSubscriptionStatusListToString(eDataType, instanceValue);
			case FhirPackage.SUPPLY_DELIVERY_STATUS_LIST:
				return convertSupplyDeliveryStatusListToString(eDataType, instanceValue);
			case FhirPackage.SUPPLY_REQUEST_STATUS_LIST:
				return convertSupplyRequestStatusListToString(eDataType, instanceValue);
			case FhirPackage.SYSTEM_RESTFUL_INTERACTION_LIST:
				return convertSystemRestfulInteractionListToString(eDataType, instanceValue);
			case FhirPackage.TASK_INTENT_LIST:
				return convertTaskIntentListToString(eDataType, instanceValue);
			case FhirPackage.TASK_STATUS_LIST:
				return convertTaskStatusListToString(eDataType, instanceValue);
			case FhirPackage.TEST_REPORT_ACTION_RESULT_LIST:
				return convertTestReportActionResultListToString(eDataType, instanceValue);
			case FhirPackage.TEST_REPORT_PARTICIPANT_TYPE_LIST:
				return convertTestReportParticipantTypeListToString(eDataType, instanceValue);
			case FhirPackage.TEST_REPORT_RESULT_LIST:
				return convertTestReportResultListToString(eDataType, instanceValue);
			case FhirPackage.TEST_REPORT_STATUS_LIST:
				return convertTestReportStatusListToString(eDataType, instanceValue);
			case FhirPackage.TEST_SCRIPT_REQUEST_METHOD_CODE_LIST:
				return convertTestScriptRequestMethodCodeListToString(eDataType, instanceValue);
			case FhirPackage.TRIGGER_TYPE_LIST:
				return convertTriggerTypeListToString(eDataType, instanceValue);
			case FhirPackage.TYPE_DERIVATION_RULE_LIST:
				return convertTypeDerivationRuleListToString(eDataType, instanceValue);
			case FhirPackage.TYPE_RESTFUL_INTERACTION_LIST:
				return convertTypeRestfulInteractionListToString(eDataType, instanceValue);
			case FhirPackage.UDI_ENTRY_TYPE_LIST:
				return convertUDIEntryTypeListToString(eDataType, instanceValue);
			case FhirPackage.UNITS_OF_TIME_LIST:
				return convertUnitsOfTimeListToString(eDataType, instanceValue);
			case FhirPackage.USE_LIST:
				return convertUseListToString(eDataType, instanceValue);
			case FhirPackage.VARIABLE_TYPE_LIST:
				return convertVariableTypeListToString(eDataType, instanceValue);
			case FhirPackage.VCONFIDENTIALITY_CLASSIFICATION_LIST:
				return convertVConfidentialityClassificationListToString(eDataType, instanceValue);
			case FhirPackage.VISION_BASE_LIST:
				return convertVisionBaseListToString(eDataType, instanceValue);
			case FhirPackage.VISION_EYES_LIST:
				return convertVisionEyesListToString(eDataType, instanceValue);
			case FhirPackage.XPATH_USAGE_TYPE_LIST:
				return convertXPathUsageTypeListToString(eDataType, instanceValue);
			case FhirPackage.ACCOUNT_STATUS_LIST_OBJECT:
				return convertAccountStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.ACTION_CARDINALITY_BEHAVIOR_LIST_OBJECT:
				return convertActionCardinalityBehaviorListObjectToString(eDataType, instanceValue);
			case FhirPackage.ACTION_CONDITION_KIND_LIST_OBJECT:
				return convertActionConditionKindListObjectToString(eDataType, instanceValue);
			case FhirPackage.ACTION_GROUPING_BEHAVIOR_LIST_OBJECT:
				return convertActionGroupingBehaviorListObjectToString(eDataType, instanceValue);
			case FhirPackage.ACTION_PARTICIPANT_TYPE_LIST_OBJECT:
				return convertActionParticipantTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.ACTION_PRECHECK_BEHAVIOR_LIST_OBJECT:
				return convertActionPrecheckBehaviorListObjectToString(eDataType, instanceValue);
			case FhirPackage.ACTION_RELATIONSHIP_TYPE_LIST_OBJECT:
				return convertActionRelationshipTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.ACTION_REQUIRED_BEHAVIOR_LIST_OBJECT:
				return convertActionRequiredBehaviorListObjectToString(eDataType, instanceValue);
			case FhirPackage.ACTION_SELECTION_BEHAVIOR_LIST_OBJECT:
				return convertActionSelectionBehaviorListObjectToString(eDataType, instanceValue);
			case FhirPackage.ADDRESS_TYPE_LIST_OBJECT:
				return convertAddressTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.ADDRESS_USE_LIST_OBJECT:
				return convertAddressUseListObjectToString(eDataType, instanceValue);
			case FhirPackage.ADMINISTRATIVE_GENDER_LIST_OBJECT:
				return convertAdministrativeGenderListObjectToString(eDataType, instanceValue);
			case FhirPackage.ADVERSE_EVENT_ACTUALITY_LIST_OBJECT:
				return convertAdverseEventActualityListObjectToString(eDataType, instanceValue);
			case FhirPackage.AGGREGATION_MODE_LIST_OBJECT:
				return convertAggregationModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CATEGORY_LIST_OBJECT:
				return convertAllergyIntoleranceCategoryListObjectToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CRITICALITY_LIST_OBJECT:
				return convertAllergyIntoleranceCriticalityListObjectToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_SEVERITY_LIST_OBJECT:
				return convertAllergyIntoleranceSeverityListObjectToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_TYPE_LIST_OBJECT:
				return convertAllergyIntoleranceTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.APPOINTMENT_STATUS_LIST_OBJECT:
				return convertAppointmentStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.ASSERTION_DIRECTION_TYPE_LIST_OBJECT:
				return convertAssertionDirectionTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.ASSERTION_OPERATOR_TYPE_LIST_OBJECT:
				return convertAssertionOperatorTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.ASSERTION_RESPONSE_TYPES_LIST_OBJECT:
				return convertAssertionResponseTypesListObjectToString(eDataType, instanceValue);
			case FhirPackage.AUDIT_EVENT_ACTION_LIST_OBJECT:
				return convertAuditEventActionListObjectToString(eDataType, instanceValue);
			case FhirPackage.AUDIT_EVENT_AGENT_NETWORK_TYPE_LIST_OBJECT:
				return convertAuditEventAgentNetworkTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.AUDIT_EVENT_OUTCOME_LIST_OBJECT:
				return convertAuditEventOutcomeListObjectToString(eDataType, instanceValue);
			case FhirPackage.BASE64_BINARY_PRIMITIVE:
				return convertBase64BinaryPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.BINDING_STRENGTH_LIST_OBJECT:
				return convertBindingStrengthListObjectToString(eDataType, instanceValue);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_CATEGORY_LIST_OBJECT:
				return convertBiologicallyDerivedProductCategoryListObjectToString(eDataType, instanceValue);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STATUS_LIST_OBJECT:
				return convertBiologicallyDerivedProductStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE_SCALE_LIST_OBJECT:
				return convertBiologicallyDerivedProductStorageScaleListObjectToString(eDataType, instanceValue);
			case FhirPackage.BOOLEAN_PRIMITIVE:
				return convertBooleanPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.BOOLEAN_PRIMITIVE_OBJECT:
				return convertBooleanPrimitiveObjectToString(eDataType, instanceValue);
			case FhirPackage.BUNDLE_TYPE_LIST_OBJECT:
				return convertBundleTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.CANONICAL_PRIMITIVE:
				return convertCanonicalPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.CAPABILITY_STATEMENT_KIND_LIST_OBJECT:
				return convertCapabilityStatementKindListObjectToString(eDataType, instanceValue);
			case FhirPackage.CARE_PLAN_ACTIVITY_KIND_LIST_OBJECT:
				return convertCarePlanActivityKindListObjectToString(eDataType, instanceValue);
			case FhirPackage.CARE_PLAN_ACTIVITY_STATUS_LIST_OBJECT:
				return convertCarePlanActivityStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.CARE_PLAN_INTENT_LIST_OBJECT:
				return convertCarePlanIntentListObjectToString(eDataType, instanceValue);
			case FhirPackage.CARE_TEAM_STATUS_LIST_OBJECT:
				return convertCareTeamStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.CATALOG_ENTRY_RELATION_TYPE_LIST_OBJECT:
				return convertCatalogEntryRelationTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.CHARGE_ITEM_STATUS_LIST_OBJECT:
				return convertChargeItemStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.CLAIM_PROCESSING_CODES_LIST_OBJECT:
				return convertClaimProcessingCodesListObjectToString(eDataType, instanceValue);
			case FhirPackage.CLINICAL_IMPRESSION_STATUS_LIST_OBJECT:
				return convertClinicalImpressionStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.CODE_PRIMITIVE:
				return convertCodePrimitiveToString(eDataType, instanceValue);
			case FhirPackage.CODE_SEARCH_SUPPORT_LIST_OBJECT:
				return convertCodeSearchSupportListObjectToString(eDataType, instanceValue);
			case FhirPackage.CODE_SYSTEM_CONTENT_MODE_LIST_OBJECT:
				return convertCodeSystemContentModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.CODE_SYSTEM_HIERARCHY_MEANING_LIST_OBJECT:
				return convertCodeSystemHierarchyMeaningListObjectToString(eDataType, instanceValue);
			case FhirPackage.COMPARTMENT_TYPE_LIST_OBJECT:
				return convertCompartmentTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.COMPOSITION_ATTESTATION_MODE_LIST_OBJECT:
				return convertCompositionAttestationModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.COMPOSITION_STATUS_LIST_OBJECT:
				return convertCompositionStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONCEPT_MAP_EQUIVALENCE_LIST_OBJECT:
				return convertConceptMapEquivalenceListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONCEPT_MAP_GROUP_UNMAPPED_MODE_LIST_OBJECT:
				return convertConceptMapGroupUnmappedModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONDITIONAL_DELETE_STATUS_LIST_OBJECT:
				return convertConditionalDeleteStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONDITIONAL_READ_STATUS_LIST_OBJECT:
				return convertConditionalReadStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONSENT_DATA_MEANING_LIST_OBJECT:
				return convertConsentDataMeaningListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONSENT_PROVISION_TYPE_LIST_OBJECT:
				return convertConsentProvisionTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONSENT_STATE_LIST_OBJECT:
				return convertConsentStateListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONSTRAINT_SEVERITY_LIST_OBJECT:
				return convertConstraintSeverityListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONTACT_POINT_SYSTEM_LIST_OBJECT:
				return convertContactPointSystemListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONTACT_POINT_USE_LIST_OBJECT:
				return convertContactPointUseListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONTRACT_RESOURCE_PUBLICATION_STATUS_CODES_LIST_OBJECT:
				return convertContractResourcePublicationStatusCodesListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONTRACT_RESOURCE_STATUS_CODES_LIST_OBJECT:
				return convertContractResourceStatusCodesListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONTRIBUTOR_TYPE_LIST_OBJECT:
				return convertContributorTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.DATE_PRIMITIVE:
				return convertDatePrimitiveToString(eDataType, instanceValue);
			case FhirPackage.DATE_PRIMITIVE_BASE:
				return convertDatePrimitiveBaseToString(eDataType, instanceValue);
			case FhirPackage.DATE_TIME_PRIMITIVE:
				return convertDateTimePrimitiveToString(eDataType, instanceValue);
			case FhirPackage.DATE_TIME_PRIMITIVE_BASE:
				return convertDateTimePrimitiveBaseToString(eDataType, instanceValue);
			case FhirPackage.DAYS_OF_WEEK_LIST_OBJECT:
				return convertDaysOfWeekListObjectToString(eDataType, instanceValue);
			case FhirPackage.DECIMAL_PRIMITIVE:
				return convertDecimalPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.DETECTED_ISSUE_SEVERITY_LIST_OBJECT:
				return convertDetectedIssueSeverityListObjectToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_STATE_LIST_OBJECT:
				return convertDeviceMetricCalibrationStateListObjectToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_TYPE_LIST_OBJECT:
				return convertDeviceMetricCalibrationTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_METRIC_CATEGORY_LIST_OBJECT:
				return convertDeviceMetricCategoryListObjectToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_METRIC_COLOR_LIST_OBJECT:
				return convertDeviceMetricColorListObjectToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_METRIC_OPERATIONAL_STATUS_LIST_OBJECT:
				return convertDeviceMetricOperationalStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_NAME_TYPE_LIST_OBJECT:
				return convertDeviceNameTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_USE_STATEMENT_STATUS_LIST_OBJECT:
				return convertDeviceUseStatementStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.DIAGNOSTIC_REPORT_STATUS_LIST_OBJECT:
				return convertDiagnosticReportStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.DISCRIMINATOR_TYPE_LIST_OBJECT:
				return convertDiscriminatorTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.DOCUMENT_MODE_LIST_OBJECT:
				return convertDocumentModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.DOCUMENT_REFERENCE_STATUS_LIST_OBJECT:
				return convertDocumentReferenceStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.DOCUMENT_RELATIONSHIP_TYPE_LIST_OBJECT:
				return convertDocumentRelationshipTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.ELIGIBILITY_REQUEST_PURPOSE_LIST_OBJECT:
				return convertEligibilityRequestPurposeListObjectToString(eDataType, instanceValue);
			case FhirPackage.ELIGIBILITY_RESPONSE_PURPOSE_LIST_OBJECT:
				return convertEligibilityResponsePurposeListObjectToString(eDataType, instanceValue);
			case FhirPackage.ENABLE_WHEN_BEHAVIOR_LIST_OBJECT:
				return convertEnableWhenBehaviorListObjectToString(eDataType, instanceValue);
			case FhirPackage.ENCOUNTER_LOCATION_STATUS_LIST_OBJECT:
				return convertEncounterLocationStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.ENCOUNTER_STATUS_LIST_OBJECT:
				return convertEncounterStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.ENDPOINT_STATUS_LIST_OBJECT:
				return convertEndpointStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.EPISODE_OF_CARE_STATUS_LIST_OBJECT:
				return convertEpisodeOfCareStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.EVENT_CAPABILITY_MODE_LIST_OBJECT:
				return convertEventCapabilityModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.EVENT_STATUS_LIST_OBJECT:
				return convertEventStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.EVENT_TIMING_LIST_OBJECT:
				return convertEventTimingListObjectToString(eDataType, instanceValue);
			case FhirPackage.EVIDENCE_VARIABLE_TYPE_LIST_OBJECT:
				return convertEvidenceVariableTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.EXAMPLE_SCENARIO_ACTOR_TYPE_LIST_OBJECT:
				return convertExampleScenarioActorTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.EXPLANATION_OF_BENEFIT_STATUS_LIST_OBJECT:
				return convertExplanationOfBenefitStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.EXPOSURE_STATE_LIST_OBJECT:
				return convertExposureStateListObjectToString(eDataType, instanceValue);
			case FhirPackage.EXPRESSION_LANGUAGE_LIST_OBJECT:
				return convertExpressionLanguageListObjectToString(eDataType, instanceValue);
			case FhirPackage.EXTENSION_CONTEXT_TYPE_LIST_OBJECT:
				return convertExtensionContextTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.FAMILY_HISTORY_STATUS_LIST_OBJECT:
				return convertFamilyHistoryStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.FHIR_DEVICE_STATUS_LIST_OBJECT:
				return convertFHIRDeviceStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.FHIR_SUBSTANCE_STATUS_LIST_OBJECT:
				return convertFHIRSubstanceStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.FHIR_VERSION_LIST_OBJECT:
				return convertFHIRVersionListObjectToString(eDataType, instanceValue);
			case FhirPackage.FILTER_OPERATOR_LIST_OBJECT:
				return convertFilterOperatorListObjectToString(eDataType, instanceValue);
			case FhirPackage.FINANCIAL_RESOURCE_STATUS_CODES_LIST_OBJECT:
				return convertFinancialResourceStatusCodesListObjectToString(eDataType, instanceValue);
			case FhirPackage.FLAG_STATUS_LIST_OBJECT:
				return convertFlagStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.GOAL_LIFECYCLE_STATUS_LIST_OBJECT:
				return convertGoalLifecycleStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.GRAPH_COMPARTMENT_RULE_LIST_OBJECT:
				return convertGraphCompartmentRuleListObjectToString(eDataType, instanceValue);
			case FhirPackage.GRAPH_COMPARTMENT_USE_LIST_OBJECT:
				return convertGraphCompartmentUseListObjectToString(eDataType, instanceValue);
			case FhirPackage.GROUP_MEASURE_LIST_OBJECT:
				return convertGroupMeasureListObjectToString(eDataType, instanceValue);
			case FhirPackage.GROUP_TYPE_LIST_OBJECT:
				return convertGroupTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.GUIDANCE_RESPONSE_STATUS_LIST_OBJECT:
				return convertGuidanceResponseStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.GUIDE_PAGE_GENERATION_LIST_OBJECT:
				return convertGuidePageGenerationListObjectToString(eDataType, instanceValue);
			case FhirPackage.GUIDE_PARAMETER_CODE_LIST_OBJECT:
				return convertGuideParameterCodeListObjectToString(eDataType, instanceValue);
			case FhirPackage.HTTP_VERB_LIST_OBJECT:
				return convertHTTPVerbListObjectToString(eDataType, instanceValue);
			case FhirPackage.IDENTIFIER_USE_LIST_OBJECT:
				return convertIdentifierUseListObjectToString(eDataType, instanceValue);
			case FhirPackage.IDENTITY_ASSURANCE_LEVEL_LIST_OBJECT:
				return convertIdentityAssuranceLevelListObjectToString(eDataType, instanceValue);
			case FhirPackage.ID_PRIMITIVE:
				return convertIdPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.IMAGING_STUDY_STATUS_LIST_OBJECT:
				return convertImagingStudyStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.IMMUNIZATION_EVALUATION_STATUS_CODES_LIST_OBJECT:
				return convertImmunizationEvaluationStatusCodesListObjectToString(eDataType, instanceValue);
			case FhirPackage.IMMUNIZATION_STATUS_CODES_LIST_OBJECT:
				return convertImmunizationStatusCodesListObjectToString(eDataType, instanceValue);
			case FhirPackage.INSTANT_PRIMITIVE:
				return convertInstantPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.INTEGER_PRIMITIVE:
				return convertIntegerPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.INTEGER_PRIMITIVE_OBJECT:
				return convertIntegerPrimitiveObjectToString(eDataType, instanceValue);
			case FhirPackage.INVOICE_PRICE_COMPONENT_TYPE_LIST_OBJECT:
				return convertInvoicePriceComponentTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.INVOICE_STATUS_LIST_OBJECT:
				return convertInvoiceStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.ISSUE_SEVERITY_LIST_OBJECT:
				return convertIssueSeverityListObjectToString(eDataType, instanceValue);
			case FhirPackage.ISSUE_TYPE_LIST_OBJECT:
				return convertIssueTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.LINKAGE_TYPE_LIST_OBJECT:
				return convertLinkageTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.LINK_TYPE_LIST_OBJECT:
				return convertLinkTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.LIST_MODE_LIST_OBJECT:
				return convertListModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.LIST_STATUS_LIST_OBJECT:
				return convertListStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.LOCATION_MODE_LIST_OBJECT:
				return convertLocationModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.LOCATION_STATUS_LIST_OBJECT:
				return convertLocationStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.MARKDOWN_PRIMITIVE:
				return convertMarkdownPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.MEASURE_REPORT_STATUS_LIST_OBJECT:
				return convertMeasureReportStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.MEASURE_REPORT_TYPE_LIST_OBJECT:
				return convertMeasureReportTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_REQUEST_INTENT_LIST_OBJECT:
				return convertMedicationRequestIntentListObjectToString(eDataType, instanceValue);
			case FhirPackage.MEDICATIONREQUEST_STATUS_LIST_OBJECT:
				return convertMedicationrequestStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_STATUS_CODES_LIST_OBJECT:
				return convertMedicationStatusCodesListObjectToString(eDataType, instanceValue);
			case FhirPackage.MESSAGEHEADER_RESPONSE_REQUEST_LIST_OBJECT:
				return convertMessageheaderResponseRequestListObjectToString(eDataType, instanceValue);
			case FhirPackage.MESSAGE_SIGNIFICANCE_CATEGORY_LIST_OBJECT:
				return convertMessageSignificanceCategoryListObjectToString(eDataType, instanceValue);
			case FhirPackage.NAME_USE_LIST_OBJECT:
				return convertNameUseListObjectToString(eDataType, instanceValue);
			case FhirPackage.NAMING_SYSTEM_IDENTIFIER_TYPE_LIST_OBJECT:
				return convertNamingSystemIdentifierTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.NAMING_SYSTEM_TYPE_LIST_OBJECT:
				return convertNamingSystemTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.NARRATIVE_STATUS_LIST_OBJECT:
				return convertNarrativeStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.NOTE_TYPE_LIST_OBJECT:
				return convertNoteTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.OBSERVATION_DATA_TYPE_LIST_OBJECT:
				return convertObservationDataTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.OBSERVATION_RANGE_CATEGORY_LIST_OBJECT:
				return convertObservationRangeCategoryListObjectToString(eDataType, instanceValue);
			case FhirPackage.OBSERVATION_STATUS_LIST_OBJECT:
				return convertObservationStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.OID_PRIMITIVE:
				return convertOidPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.OPERATION_KIND_LIST_OBJECT:
				return convertOperationKindListObjectToString(eDataType, instanceValue);
			case FhirPackage.OPERATION_PARAMETER_USE_LIST_OBJECT:
				return convertOperationParameterUseListObjectToString(eDataType, instanceValue);
			case FhirPackage.ORIENTATION_TYPE_LIST_OBJECT:
				return convertOrientationTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.PARTICIPANT_REQUIRED_LIST_OBJECT:
				return convertParticipantRequiredListObjectToString(eDataType, instanceValue);
			case FhirPackage.PARTICIPATION_STATUS_LIST_OBJECT:
				return convertParticipationStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.POSITIVE_INT_PRIMITIVE:
				return convertPositiveIntPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.PROPERTY_REPRESENTATION_LIST_OBJECT:
				return convertPropertyRepresentationListObjectToString(eDataType, instanceValue);
			case FhirPackage.PROPERTY_TYPE_LIST_OBJECT:
				return convertPropertyTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.PROVENANCE_ENTITY_ROLE_LIST_OBJECT:
				return convertProvenanceEntityRoleListObjectToString(eDataType, instanceValue);
			case FhirPackage.PUBLICATION_STATUS_LIST_OBJECT:
				return convertPublicationStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.QUALITY_TYPE_LIST_OBJECT:
				return convertQualityTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.QUANTITY_COMPARATOR_LIST_OBJECT:
				return convertQuantityComparatorListObjectToString(eDataType, instanceValue);
			case FhirPackage.QUESTIONNAIRE_ITEM_OPERATOR_LIST_OBJECT:
				return convertQuestionnaireItemOperatorListObjectToString(eDataType, instanceValue);
			case FhirPackage.QUESTIONNAIRE_ITEM_TYPE_LIST_OBJECT:
				return convertQuestionnaireItemTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.QUESTIONNAIRE_RESPONSE_STATUS_LIST_OBJECT:
				return convertQuestionnaireResponseStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.REFERENCE_HANDLING_POLICY_LIST_OBJECT:
				return convertReferenceHandlingPolicyListObjectToString(eDataType, instanceValue);
			case FhirPackage.REFERENCE_VERSION_RULES_LIST_OBJECT:
				return convertReferenceVersionRulesListObjectToString(eDataType, instanceValue);
			case FhirPackage.RELATED_ARTIFACT_TYPE_LIST_OBJECT:
				return convertRelatedArtifactTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.REMITTANCE_OUTCOME_LIST_OBJECT:
				return convertRemittanceOutcomeListObjectToString(eDataType, instanceValue);
			case FhirPackage.REPOSITORY_TYPE_LIST_OBJECT:
				return convertRepositoryTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.REQUEST_INTENT_LIST_OBJECT:
				return convertRequestIntentListObjectToString(eDataType, instanceValue);
			case FhirPackage.REQUEST_PRIORITY_LIST_OBJECT:
				return convertRequestPriorityListObjectToString(eDataType, instanceValue);
			case FhirPackage.REQUEST_RESOURCE_TYPE_LIST_OBJECT:
				return convertRequestResourceTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.REQUEST_STATUS_LIST_OBJECT:
				return convertRequestStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.RESEARCH_ELEMENT_TYPE_LIST_OBJECT:
				return convertResearchElementTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.RESEARCH_STUDY_STATUS_LIST_OBJECT:
				return convertResearchStudyStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.RESEARCH_SUBJECT_STATUS_LIST_OBJECT:
				return convertResearchSubjectStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.RESOURCE_TYPE_LIST_OBJECT:
				return convertResourceTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.RESOURCE_VERSION_POLICY_LIST_OBJECT:
				return convertResourceVersionPolicyListObjectToString(eDataType, instanceValue);
			case FhirPackage.RESPONSE_TYPE_LIST_OBJECT:
				return convertResponseTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.RESTFUL_CAPABILITY_MODE_LIST_OBJECT:
				return convertRestfulCapabilityModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.SAMPLED_DATA_DATA_TYPE_PRIMITIVE:
				return convertSampledDataDataTypePrimitiveToString(eDataType, instanceValue);
			case FhirPackage.SEARCH_COMPARATOR_LIST_OBJECT:
				return convertSearchComparatorListObjectToString(eDataType, instanceValue);
			case FhirPackage.SEARCH_ENTRY_MODE_LIST_OBJECT:
				return convertSearchEntryModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.SEARCH_MODIFIER_CODE_LIST_OBJECT:
				return convertSearchModifierCodeListObjectToString(eDataType, instanceValue);
			case FhirPackage.SEARCH_PARAM_TYPE_LIST_OBJECT:
				return convertSearchParamTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.SEQUENCE_TYPE_LIST_OBJECT:
				return convertSequenceTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.SLICING_RULES_LIST_OBJECT:
				return convertSlicingRulesListObjectToString(eDataType, instanceValue);
			case FhirPackage.SLOT_STATUS_LIST_OBJECT:
				return convertSlotStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.SORT_DIRECTION_LIST_OBJECT:
				return convertSortDirectionListObjectToString(eDataType, instanceValue);
			case FhirPackage.SPDX_LICENSE_LIST_OBJECT:
				return convertSPDXLicenseListObjectToString(eDataType, instanceValue);
			case FhirPackage.SPECIMEN_CONTAINED_PREFERENCE_LIST_OBJECT:
				return convertSpecimenContainedPreferenceListObjectToString(eDataType, instanceValue);
			case FhirPackage.SPECIMEN_STATUS_LIST_OBJECT:
				return convertSpecimenStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.STATUS_LIST_OBJECT:
				return convertStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.STRAND_TYPE_LIST_OBJECT:
				return convertStrandTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.STRING_PRIMITIVE:
				return convertStringPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_DEFINITION_KIND_LIST_OBJECT:
				return convertStructureDefinitionKindListObjectToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_CONTEXT_TYPE_LIST_OBJECT:
				return convertStructureMapContextTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_GROUP_TYPE_MODE_LIST_OBJECT:
				return convertStructureMapGroupTypeModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_INPUT_MODE_LIST_OBJECT:
				return convertStructureMapInputModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_MODEL_MODE_LIST_OBJECT:
				return convertStructureMapModelModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_SOURCE_LIST_MODE_LIST_OBJECT:
				return convertStructureMapSourceListModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_TARGET_LIST_MODE_LIST_OBJECT:
				return convertStructureMapTargetListModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_TRANSFORM_LIST_OBJECT:
				return convertStructureMapTransformListObjectToString(eDataType, instanceValue);
			case FhirPackage.SUBSCRIPTION_CHANNEL_TYPE_LIST_OBJECT:
				return convertSubscriptionChannelTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.SUBSCRIPTION_STATUS_LIST_OBJECT:
				return convertSubscriptionStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.SUPPLY_DELIVERY_STATUS_LIST_OBJECT:
				return convertSupplyDeliveryStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.SUPPLY_REQUEST_STATUS_LIST_OBJECT:
				return convertSupplyRequestStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.SYSTEM_RESTFUL_INTERACTION_LIST_OBJECT:
				return convertSystemRestfulInteractionListObjectToString(eDataType, instanceValue);
			case FhirPackage.TASK_INTENT_LIST_OBJECT:
				return convertTaskIntentListObjectToString(eDataType, instanceValue);
			case FhirPackage.TASK_STATUS_LIST_OBJECT:
				return convertTaskStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.TEST_REPORT_ACTION_RESULT_LIST_OBJECT:
				return convertTestReportActionResultListObjectToString(eDataType, instanceValue);
			case FhirPackage.TEST_REPORT_PARTICIPANT_TYPE_LIST_OBJECT:
				return convertTestReportParticipantTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.TEST_REPORT_RESULT_LIST_OBJECT:
				return convertTestReportResultListObjectToString(eDataType, instanceValue);
			case FhirPackage.TEST_REPORT_STATUS_LIST_OBJECT:
				return convertTestReportStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.TEST_SCRIPT_REQUEST_METHOD_CODE_LIST_OBJECT:
				return convertTestScriptRequestMethodCodeListObjectToString(eDataType, instanceValue);
			case FhirPackage.TIME_PRIMITIVE:
				return convertTimePrimitiveToString(eDataType, instanceValue);
			case FhirPackage.TRIGGER_TYPE_LIST_OBJECT:
				return convertTriggerTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.TYPE_DERIVATION_RULE_LIST_OBJECT:
				return convertTypeDerivationRuleListObjectToString(eDataType, instanceValue);
			case FhirPackage.TYPE_RESTFUL_INTERACTION_LIST_OBJECT:
				return convertTypeRestfulInteractionListObjectToString(eDataType, instanceValue);
			case FhirPackage.UDI_ENTRY_TYPE_LIST_OBJECT:
				return convertUDIEntryTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.UNITS_OF_TIME_LIST_OBJECT:
				return convertUnitsOfTimeListObjectToString(eDataType, instanceValue);
			case FhirPackage.UNSIGNED_INT_PRIMITIVE:
				return convertUnsignedIntPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.URI_PRIMITIVE:
				return convertUriPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.URL_PRIMITIVE:
				return convertUrlPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.USE_LIST_OBJECT:
				return convertUseListObjectToString(eDataType, instanceValue);
			case FhirPackage.UUID_PRIMITIVE:
				return convertUuidPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.VARIABLE_TYPE_LIST_OBJECT:
				return convertVariableTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.VCONFIDENTIALITY_CLASSIFICATION_LIST_OBJECT:
				return convertVConfidentialityClassificationListObjectToString(eDataType, instanceValue);
			case FhirPackage.VISION_BASE_LIST_OBJECT:
				return convertVisionBaseListObjectToString(eDataType, instanceValue);
			case FhirPackage.VISION_EYES_LIST_OBJECT:
				return convertVisionEyesListObjectToString(eDataType, instanceValue);
			case FhirPackage.XPATH_USAGE_TYPE_LIST_OBJECT:
				return convertXPathUsageTypeListObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Account createAccount() {
		AccountImpl account = new AccountImpl();
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccountCoverage createAccountCoverage() {
		AccountCoverageImpl accountCoverage = new AccountCoverageImpl();
		return accountCoverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccountGuarantor createAccountGuarantor() {
		AccountGuarantorImpl accountGuarantor = new AccountGuarantorImpl();
		return accountGuarantor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccountStatus createAccountStatus() {
		AccountStatusImpl accountStatus = new AccountStatusImpl();
		return accountStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionCardinalityBehavior createActionCardinalityBehavior() {
		ActionCardinalityBehaviorImpl actionCardinalityBehavior = new ActionCardinalityBehaviorImpl();
		return actionCardinalityBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionConditionKind createActionConditionKind() {
		ActionConditionKindImpl actionConditionKind = new ActionConditionKindImpl();
		return actionConditionKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionGroupingBehavior createActionGroupingBehavior() {
		ActionGroupingBehaviorImpl actionGroupingBehavior = new ActionGroupingBehaviorImpl();
		return actionGroupingBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionParticipantType createActionParticipantType() {
		ActionParticipantTypeImpl actionParticipantType = new ActionParticipantTypeImpl();
		return actionParticipantType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionPrecheckBehavior createActionPrecheckBehavior() {
		ActionPrecheckBehaviorImpl actionPrecheckBehavior = new ActionPrecheckBehaviorImpl();
		return actionPrecheckBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionRelationshipType createActionRelationshipType() {
		ActionRelationshipTypeImpl actionRelationshipType = new ActionRelationshipTypeImpl();
		return actionRelationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionRequiredBehavior createActionRequiredBehavior() {
		ActionRequiredBehaviorImpl actionRequiredBehavior = new ActionRequiredBehaviorImpl();
		return actionRequiredBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionSelectionBehavior createActionSelectionBehavior() {
		ActionSelectionBehaviorImpl actionSelectionBehavior = new ActionSelectionBehaviorImpl();
		return actionSelectionBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityDefinition createActivityDefinition() {
		ActivityDefinitionImpl activityDefinition = new ActivityDefinitionImpl();
		return activityDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityDefinitionDynamicValue createActivityDefinitionDynamicValue() {
		ActivityDefinitionDynamicValueImpl activityDefinitionDynamicValue = new ActivityDefinitionDynamicValueImpl();
		return activityDefinitionDynamicValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityDefinitionParticipant createActivityDefinitionParticipant() {
		ActivityDefinitionParticipantImpl activityDefinitionParticipant = new ActivityDefinitionParticipantImpl();
		return activityDefinitionParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Address createAddress() {
		AddressImpl address = new AddressImpl();
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddressType createAddressType() {
		AddressTypeImpl addressType = new AddressTypeImpl();
		return addressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddressUse createAddressUse() {
		AddressUseImpl addressUse = new AddressUseImpl();
		return addressUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdministrativeGender createAdministrativeGender() {
		AdministrativeGenderImpl administrativeGender = new AdministrativeGenderImpl();
		return administrativeGender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdverseEvent createAdverseEvent() {
		AdverseEventImpl adverseEvent = new AdverseEventImpl();
		return adverseEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdverseEventActuality createAdverseEventActuality() {
		AdverseEventActualityImpl adverseEventActuality = new AdverseEventActualityImpl();
		return adverseEventActuality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdverseEventCausality createAdverseEventCausality() {
		AdverseEventCausalityImpl adverseEventCausality = new AdverseEventCausalityImpl();
		return adverseEventCausality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdverseEventSuspectEntity createAdverseEventSuspectEntity() {
		AdverseEventSuspectEntityImpl adverseEventSuspectEntity = new AdverseEventSuspectEntityImpl();
		return adverseEventSuspectEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Age createAge() {
		AgeImpl age = new AgeImpl();
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AggregationMode createAggregationMode() {
		AggregationModeImpl aggregationMode = new AggregationModeImpl();
		return aggregationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllergyIntolerance createAllergyIntolerance() {
		AllergyIntoleranceImpl allergyIntolerance = new AllergyIntoleranceImpl();
		return allergyIntolerance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllergyIntoleranceCategory createAllergyIntoleranceCategory() {
		AllergyIntoleranceCategoryImpl allergyIntoleranceCategory = new AllergyIntoleranceCategoryImpl();
		return allergyIntoleranceCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllergyIntoleranceCriticality createAllergyIntoleranceCriticality() {
		AllergyIntoleranceCriticalityImpl allergyIntoleranceCriticality = new AllergyIntoleranceCriticalityImpl();
		return allergyIntoleranceCriticality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllergyIntoleranceReaction createAllergyIntoleranceReaction() {
		AllergyIntoleranceReactionImpl allergyIntoleranceReaction = new AllergyIntoleranceReactionImpl();
		return allergyIntoleranceReaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllergyIntoleranceSeverity createAllergyIntoleranceSeverity() {
		AllergyIntoleranceSeverityImpl allergyIntoleranceSeverity = new AllergyIntoleranceSeverityImpl();
		return allergyIntoleranceSeverity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllergyIntoleranceType createAllergyIntoleranceType() {
		AllergyIntoleranceTypeImpl allergyIntoleranceType = new AllergyIntoleranceTypeImpl();
		return allergyIntoleranceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Appointment createAppointment() {
		AppointmentImpl appointment = new AppointmentImpl();
		return appointment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AppointmentParticipant createAppointmentParticipant() {
		AppointmentParticipantImpl appointmentParticipant = new AppointmentParticipantImpl();
		return appointmentParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AppointmentResponse createAppointmentResponse() {
		AppointmentResponseImpl appointmentResponse = new AppointmentResponseImpl();
		return appointmentResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AppointmentStatus createAppointmentStatus() {
		AppointmentStatusImpl appointmentStatus = new AppointmentStatusImpl();
		return appointmentStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssertionDirectionType createAssertionDirectionType() {
		AssertionDirectionTypeImpl assertionDirectionType = new AssertionDirectionTypeImpl();
		return assertionDirectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssertionOperatorType createAssertionOperatorType() {
		AssertionOperatorTypeImpl assertionOperatorType = new AssertionOperatorTypeImpl();
		return assertionOperatorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssertionResponseTypes createAssertionResponseTypes() {
		AssertionResponseTypesImpl assertionResponseTypes = new AssertionResponseTypesImpl();
		return assertionResponseTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attachment createAttachment() {
		AttachmentImpl attachment = new AttachmentImpl();
		return attachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuditEvent createAuditEvent() {
		AuditEventImpl auditEvent = new AuditEventImpl();
		return auditEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuditEventAction createAuditEventAction() {
		AuditEventActionImpl auditEventAction = new AuditEventActionImpl();
		return auditEventAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuditEventAgent createAuditEventAgent() {
		AuditEventAgentImpl auditEventAgent = new AuditEventAgentImpl();
		return auditEventAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuditEventAgentNetworkType createAuditEventAgentNetworkType() {
		AuditEventAgentNetworkTypeImpl auditEventAgentNetworkType = new AuditEventAgentNetworkTypeImpl();
		return auditEventAgentNetworkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuditEventDetail createAuditEventDetail() {
		AuditEventDetailImpl auditEventDetail = new AuditEventDetailImpl();
		return auditEventDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuditEventEntity createAuditEventEntity() {
		AuditEventEntityImpl auditEventEntity = new AuditEventEntityImpl();
		return auditEventEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuditEventNetwork createAuditEventNetwork() {
		AuditEventNetworkImpl auditEventNetwork = new AuditEventNetworkImpl();
		return auditEventNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuditEventOutcome createAuditEventOutcome() {
		AuditEventOutcomeImpl auditEventOutcome = new AuditEventOutcomeImpl();
		return auditEventOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuditEventSource createAuditEventSource() {
		AuditEventSourceImpl auditEventSource = new AuditEventSourceImpl();
		return auditEventSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BackboneElement createBackboneElement() {
		BackboneElementImpl backboneElement = new BackboneElementImpl();
		return backboneElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Base64Binary createBase64Binary() {
		Base64BinaryImpl base64Binary = new Base64BinaryImpl();
		return base64Binary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Basic createBasic() {
		BasicImpl basic = new BasicImpl();
		return basic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Binary createBinary() {
		BinaryImpl binary = new BinaryImpl();
		return binary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BindingStrength createBindingStrength() {
		BindingStrengthImpl bindingStrength = new BindingStrengthImpl();
		return bindingStrength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BiologicallyDerivedProduct createBiologicallyDerivedProduct() {
		BiologicallyDerivedProductImpl biologicallyDerivedProduct = new BiologicallyDerivedProductImpl();
		return biologicallyDerivedProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BiologicallyDerivedProductCategory createBiologicallyDerivedProductCategory() {
		BiologicallyDerivedProductCategoryImpl biologicallyDerivedProductCategory = new BiologicallyDerivedProductCategoryImpl();
		return biologicallyDerivedProductCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BiologicallyDerivedProductCollection createBiologicallyDerivedProductCollection() {
		BiologicallyDerivedProductCollectionImpl biologicallyDerivedProductCollection = new BiologicallyDerivedProductCollectionImpl();
		return biologicallyDerivedProductCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BiologicallyDerivedProductManipulation createBiologicallyDerivedProductManipulation() {
		BiologicallyDerivedProductManipulationImpl biologicallyDerivedProductManipulation = new BiologicallyDerivedProductManipulationImpl();
		return biologicallyDerivedProductManipulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BiologicallyDerivedProductProcessing createBiologicallyDerivedProductProcessing() {
		BiologicallyDerivedProductProcessingImpl biologicallyDerivedProductProcessing = new BiologicallyDerivedProductProcessingImpl();
		return biologicallyDerivedProductProcessing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BiologicallyDerivedProductStatus createBiologicallyDerivedProductStatus() {
		BiologicallyDerivedProductStatusImpl biologicallyDerivedProductStatus = new BiologicallyDerivedProductStatusImpl();
		return biologicallyDerivedProductStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BiologicallyDerivedProductStorage createBiologicallyDerivedProductStorage() {
		BiologicallyDerivedProductStorageImpl biologicallyDerivedProductStorage = new BiologicallyDerivedProductStorageImpl();
		return biologicallyDerivedProductStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BiologicallyDerivedProductStorageScale createBiologicallyDerivedProductStorageScale() {
		BiologicallyDerivedProductStorageScaleImpl biologicallyDerivedProductStorageScale = new BiologicallyDerivedProductStorageScaleImpl();
		return biologicallyDerivedProductStorageScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodyStructure createBodyStructure() {
		BodyStructureImpl bodyStructure = new BodyStructureImpl();
		return bodyStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean createBoolean() {
		BooleanImpl boolean_ = new BooleanImpl();
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bundle createBundle() {
		BundleImpl bundle = new BundleImpl();
		return bundle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BundleEntry createBundleEntry() {
		BundleEntryImpl bundleEntry = new BundleEntryImpl();
		return bundleEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BundleLink createBundleLink() {
		BundleLinkImpl bundleLink = new BundleLinkImpl();
		return bundleLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BundleRequest createBundleRequest() {
		BundleRequestImpl bundleRequest = new BundleRequestImpl();
		return bundleRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BundleResponse createBundleResponse() {
		BundleResponseImpl bundleResponse = new BundleResponseImpl();
		return bundleResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BundleSearch createBundleSearch() {
		BundleSearchImpl bundleSearch = new BundleSearchImpl();
		return bundleSearch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BundleType createBundleType() {
		BundleTypeImpl bundleType = new BundleTypeImpl();
		return bundleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Canonical createCanonical() {
		CanonicalImpl canonical = new CanonicalImpl();
		return canonical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityStatement createCapabilityStatement() {
		CapabilityStatementImpl capabilityStatement = new CapabilityStatementImpl();
		return capabilityStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityStatementDocument createCapabilityStatementDocument() {
		CapabilityStatementDocumentImpl capabilityStatementDocument = new CapabilityStatementDocumentImpl();
		return capabilityStatementDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityStatementEndpoint createCapabilityStatementEndpoint() {
		CapabilityStatementEndpointImpl capabilityStatementEndpoint = new CapabilityStatementEndpointImpl();
		return capabilityStatementEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityStatementImplementation createCapabilityStatementImplementation() {
		CapabilityStatementImplementationImpl capabilityStatementImplementation = new CapabilityStatementImplementationImpl();
		return capabilityStatementImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityStatementInteraction createCapabilityStatementInteraction() {
		CapabilityStatementInteractionImpl capabilityStatementInteraction = new CapabilityStatementInteractionImpl();
		return capabilityStatementInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityStatementInteraction1 createCapabilityStatementInteraction1() {
		CapabilityStatementInteraction1Impl capabilityStatementInteraction1 = new CapabilityStatementInteraction1Impl();
		return capabilityStatementInteraction1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityStatementKind createCapabilityStatementKind() {
		CapabilityStatementKindImpl capabilityStatementKind = new CapabilityStatementKindImpl();
		return capabilityStatementKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityStatementMessaging createCapabilityStatementMessaging() {
		CapabilityStatementMessagingImpl capabilityStatementMessaging = new CapabilityStatementMessagingImpl();
		return capabilityStatementMessaging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityStatementOperation createCapabilityStatementOperation() {
		CapabilityStatementOperationImpl capabilityStatementOperation = new CapabilityStatementOperationImpl();
		return capabilityStatementOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityStatementResource createCapabilityStatementResource() {
		CapabilityStatementResourceImpl capabilityStatementResource = new CapabilityStatementResourceImpl();
		return capabilityStatementResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityStatementRest createCapabilityStatementRest() {
		CapabilityStatementRestImpl capabilityStatementRest = new CapabilityStatementRestImpl();
		return capabilityStatementRest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityStatementSearchParam createCapabilityStatementSearchParam() {
		CapabilityStatementSearchParamImpl capabilityStatementSearchParam = new CapabilityStatementSearchParamImpl();
		return capabilityStatementSearchParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityStatementSecurity createCapabilityStatementSecurity() {
		CapabilityStatementSecurityImpl capabilityStatementSecurity = new CapabilityStatementSecurityImpl();
		return capabilityStatementSecurity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityStatementSoftware createCapabilityStatementSoftware() {
		CapabilityStatementSoftwareImpl capabilityStatementSoftware = new CapabilityStatementSoftwareImpl();
		return capabilityStatementSoftware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityStatementSupportedMessage createCapabilityStatementSupportedMessage() {
		CapabilityStatementSupportedMessageImpl capabilityStatementSupportedMessage = new CapabilityStatementSupportedMessageImpl();
		return capabilityStatementSupportedMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CarePlan createCarePlan() {
		CarePlanImpl carePlan = new CarePlanImpl();
		return carePlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CarePlanActivity createCarePlanActivity() {
		CarePlanActivityImpl carePlanActivity = new CarePlanActivityImpl();
		return carePlanActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CarePlanActivityKind createCarePlanActivityKind() {
		CarePlanActivityKindImpl carePlanActivityKind = new CarePlanActivityKindImpl();
		return carePlanActivityKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CarePlanActivityStatus createCarePlanActivityStatus() {
		CarePlanActivityStatusImpl carePlanActivityStatus = new CarePlanActivityStatusImpl();
		return carePlanActivityStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CarePlanDetail createCarePlanDetail() {
		CarePlanDetailImpl carePlanDetail = new CarePlanDetailImpl();
		return carePlanDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CarePlanIntent createCarePlanIntent() {
		CarePlanIntentImpl carePlanIntent = new CarePlanIntentImpl();
		return carePlanIntent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CareTeam createCareTeam() {
		CareTeamImpl careTeam = new CareTeamImpl();
		return careTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CareTeamParticipant createCareTeamParticipant() {
		CareTeamParticipantImpl careTeamParticipant = new CareTeamParticipantImpl();
		return careTeamParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CareTeamStatus createCareTeamStatus() {
		CareTeamStatusImpl careTeamStatus = new CareTeamStatusImpl();
		return careTeamStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CatalogEntry createCatalogEntry() {
		CatalogEntryImpl catalogEntry = new CatalogEntryImpl();
		return catalogEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CatalogEntryRelatedEntry createCatalogEntryRelatedEntry() {
		CatalogEntryRelatedEntryImpl catalogEntryRelatedEntry = new CatalogEntryRelatedEntryImpl();
		return catalogEntryRelatedEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CatalogEntryRelationType createCatalogEntryRelationType() {
		CatalogEntryRelationTypeImpl catalogEntryRelationType = new CatalogEntryRelationTypeImpl();
		return catalogEntryRelationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChargeItem createChargeItem() {
		ChargeItemImpl chargeItem = new ChargeItemImpl();
		return chargeItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChargeItemDefinition createChargeItemDefinition() {
		ChargeItemDefinitionImpl chargeItemDefinition = new ChargeItemDefinitionImpl();
		return chargeItemDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChargeItemDefinitionApplicability createChargeItemDefinitionApplicability() {
		ChargeItemDefinitionApplicabilityImpl chargeItemDefinitionApplicability = new ChargeItemDefinitionApplicabilityImpl();
		return chargeItemDefinitionApplicability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChargeItemDefinitionPriceComponent createChargeItemDefinitionPriceComponent() {
		ChargeItemDefinitionPriceComponentImpl chargeItemDefinitionPriceComponent = new ChargeItemDefinitionPriceComponentImpl();
		return chargeItemDefinitionPriceComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChargeItemDefinitionPropertyGroup createChargeItemDefinitionPropertyGroup() {
		ChargeItemDefinitionPropertyGroupImpl chargeItemDefinitionPropertyGroup = new ChargeItemDefinitionPropertyGroupImpl();
		return chargeItemDefinitionPropertyGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChargeItemPerformer createChargeItemPerformer() {
		ChargeItemPerformerImpl chargeItemPerformer = new ChargeItemPerformerImpl();
		return chargeItemPerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChargeItemStatus createChargeItemStatus() {
		ChargeItemStatusImpl chargeItemStatus = new ChargeItemStatusImpl();
		return chargeItemStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Claim createClaim() {
		ClaimImpl claim = new ClaimImpl();
		return claim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimAccident createClaimAccident() {
		ClaimAccidentImpl claimAccident = new ClaimAccidentImpl();
		return claimAccident;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimCareTeam createClaimCareTeam() {
		ClaimCareTeamImpl claimCareTeam = new ClaimCareTeamImpl();
		return claimCareTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimDetail createClaimDetail() {
		ClaimDetailImpl claimDetail = new ClaimDetailImpl();
		return claimDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimDiagnosis createClaimDiagnosis() {
		ClaimDiagnosisImpl claimDiagnosis = new ClaimDiagnosisImpl();
		return claimDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimInsurance createClaimInsurance() {
		ClaimInsuranceImpl claimInsurance = new ClaimInsuranceImpl();
		return claimInsurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimItem createClaimItem() {
		ClaimItemImpl claimItem = new ClaimItemImpl();
		return claimItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimPayee createClaimPayee() {
		ClaimPayeeImpl claimPayee = new ClaimPayeeImpl();
		return claimPayee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimProcedure createClaimProcedure() {
		ClaimProcedureImpl claimProcedure = new ClaimProcedureImpl();
		return claimProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimProcessingCodes createClaimProcessingCodes() {
		ClaimProcessingCodesImpl claimProcessingCodes = new ClaimProcessingCodesImpl();
		return claimProcessingCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimRelated createClaimRelated() {
		ClaimRelatedImpl claimRelated = new ClaimRelatedImpl();
		return claimRelated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimResponse createClaimResponse() {
		ClaimResponseImpl claimResponse = new ClaimResponseImpl();
		return claimResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimResponseAddItem createClaimResponseAddItem() {
		ClaimResponseAddItemImpl claimResponseAddItem = new ClaimResponseAddItemImpl();
		return claimResponseAddItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimResponseAdjudication createClaimResponseAdjudication() {
		ClaimResponseAdjudicationImpl claimResponseAdjudication = new ClaimResponseAdjudicationImpl();
		return claimResponseAdjudication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimResponseDetail createClaimResponseDetail() {
		ClaimResponseDetailImpl claimResponseDetail = new ClaimResponseDetailImpl();
		return claimResponseDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimResponseDetail1 createClaimResponseDetail1() {
		ClaimResponseDetail1Impl claimResponseDetail1 = new ClaimResponseDetail1Impl();
		return claimResponseDetail1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimResponseError createClaimResponseError() {
		ClaimResponseErrorImpl claimResponseError = new ClaimResponseErrorImpl();
		return claimResponseError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimResponseInsurance createClaimResponseInsurance() {
		ClaimResponseInsuranceImpl claimResponseInsurance = new ClaimResponseInsuranceImpl();
		return claimResponseInsurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimResponseItem createClaimResponseItem() {
		ClaimResponseItemImpl claimResponseItem = new ClaimResponseItemImpl();
		return claimResponseItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimResponsePayment createClaimResponsePayment() {
		ClaimResponsePaymentImpl claimResponsePayment = new ClaimResponsePaymentImpl();
		return claimResponsePayment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimResponseProcessNote createClaimResponseProcessNote() {
		ClaimResponseProcessNoteImpl claimResponseProcessNote = new ClaimResponseProcessNoteImpl();
		return claimResponseProcessNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimResponseSubDetail createClaimResponseSubDetail() {
		ClaimResponseSubDetailImpl claimResponseSubDetail = new ClaimResponseSubDetailImpl();
		return claimResponseSubDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimResponseSubDetail1 createClaimResponseSubDetail1() {
		ClaimResponseSubDetail1Impl claimResponseSubDetail1 = new ClaimResponseSubDetail1Impl();
		return claimResponseSubDetail1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimResponseTotal createClaimResponseTotal() {
		ClaimResponseTotalImpl claimResponseTotal = new ClaimResponseTotalImpl();
		return claimResponseTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimSubDetail createClaimSubDetail() {
		ClaimSubDetailImpl claimSubDetail = new ClaimSubDetailImpl();
		return claimSubDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimSupportingInfo createClaimSupportingInfo() {
		ClaimSupportingInfoImpl claimSupportingInfo = new ClaimSupportingInfoImpl();
		return claimSupportingInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClinicalImpression createClinicalImpression() {
		ClinicalImpressionImpl clinicalImpression = new ClinicalImpressionImpl();
		return clinicalImpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClinicalImpressionFinding createClinicalImpressionFinding() {
		ClinicalImpressionFindingImpl clinicalImpressionFinding = new ClinicalImpressionFindingImpl();
		return clinicalImpressionFinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClinicalImpressionInvestigation createClinicalImpressionInvestigation() {
		ClinicalImpressionInvestigationImpl clinicalImpressionInvestigation = new ClinicalImpressionInvestigationImpl();
		return clinicalImpressionInvestigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClinicalImpressionStatus createClinicalImpressionStatus() {
		ClinicalImpressionStatusImpl clinicalImpressionStatus = new ClinicalImpressionStatusImpl();
		return clinicalImpressionStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code createCode() {
		CodeImpl code = new CodeImpl();
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept createCodeableConcept() {
		CodeableConceptImpl codeableConcept = new CodeableConceptImpl();
		return codeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeSearchSupport createCodeSearchSupport() {
		CodeSearchSupportImpl codeSearchSupport = new CodeSearchSupportImpl();
		return codeSearchSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeSystem createCodeSystem() {
		CodeSystemImpl codeSystem = new CodeSystemImpl();
		return codeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeSystemConcept createCodeSystemConcept() {
		CodeSystemConceptImpl codeSystemConcept = new CodeSystemConceptImpl();
		return codeSystemConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeSystemContentMode createCodeSystemContentMode() {
		CodeSystemContentModeImpl codeSystemContentMode = new CodeSystemContentModeImpl();
		return codeSystemContentMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeSystemDesignation createCodeSystemDesignation() {
		CodeSystemDesignationImpl codeSystemDesignation = new CodeSystemDesignationImpl();
		return codeSystemDesignation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeSystemFilter createCodeSystemFilter() {
		CodeSystemFilterImpl codeSystemFilter = new CodeSystemFilterImpl();
		return codeSystemFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeSystemHierarchyMeaning createCodeSystemHierarchyMeaning() {
		CodeSystemHierarchyMeaningImpl codeSystemHierarchyMeaning = new CodeSystemHierarchyMeaningImpl();
		return codeSystemHierarchyMeaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeSystemProperty createCodeSystemProperty() {
		CodeSystemPropertyImpl codeSystemProperty = new CodeSystemPropertyImpl();
		return codeSystemProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeSystemProperty1 createCodeSystemProperty1() {
		CodeSystemProperty1Impl codeSystemProperty1 = new CodeSystemProperty1Impl();
		return codeSystemProperty1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coding createCoding() {
		CodingImpl coding = new CodingImpl();
		return coding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Communication createCommunication() {
		CommunicationImpl communication = new CommunicationImpl();
		return communication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationPayload createCommunicationPayload() {
		CommunicationPayloadImpl communicationPayload = new CommunicationPayloadImpl();
		return communicationPayload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationRequest createCommunicationRequest() {
		CommunicationRequestImpl communicationRequest = new CommunicationRequestImpl();
		return communicationRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationRequestPayload createCommunicationRequestPayload() {
		CommunicationRequestPayloadImpl communicationRequestPayload = new CommunicationRequestPayloadImpl();
		return communicationRequestPayload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompartmentDefinition createCompartmentDefinition() {
		CompartmentDefinitionImpl compartmentDefinition = new CompartmentDefinitionImpl();
		return compartmentDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompartmentDefinitionResource createCompartmentDefinitionResource() {
		CompartmentDefinitionResourceImpl compartmentDefinitionResource = new CompartmentDefinitionResourceImpl();
		return compartmentDefinitionResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompartmentType createCompartmentType() {
		CompartmentTypeImpl compartmentType = new CompartmentTypeImpl();
		return compartmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Composition createComposition() {
		CompositionImpl composition = new CompositionImpl();
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositionAttestationMode createCompositionAttestationMode() {
		CompositionAttestationModeImpl compositionAttestationMode = new CompositionAttestationModeImpl();
		return compositionAttestationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositionAttester createCompositionAttester() {
		CompositionAttesterImpl compositionAttester = new CompositionAttesterImpl();
		return compositionAttester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositionEvent createCompositionEvent() {
		CompositionEventImpl compositionEvent = new CompositionEventImpl();
		return compositionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositionRelatesTo createCompositionRelatesTo() {
		CompositionRelatesToImpl compositionRelatesTo = new CompositionRelatesToImpl();
		return compositionRelatesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositionSection createCompositionSection() {
		CompositionSectionImpl compositionSection = new CompositionSectionImpl();
		return compositionSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositionStatus createCompositionStatus() {
		CompositionStatusImpl compositionStatus = new CompositionStatusImpl();
		return compositionStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConceptMap createConceptMap() {
		ConceptMapImpl conceptMap = new ConceptMapImpl();
		return conceptMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConceptMapDependsOn createConceptMapDependsOn() {
		ConceptMapDependsOnImpl conceptMapDependsOn = new ConceptMapDependsOnImpl();
		return conceptMapDependsOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConceptMapElement createConceptMapElement() {
		ConceptMapElementImpl conceptMapElement = new ConceptMapElementImpl();
		return conceptMapElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConceptMapEquivalence createConceptMapEquivalence() {
		ConceptMapEquivalenceImpl conceptMapEquivalence = new ConceptMapEquivalenceImpl();
		return conceptMapEquivalence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConceptMapGroup createConceptMapGroup() {
		ConceptMapGroupImpl conceptMapGroup = new ConceptMapGroupImpl();
		return conceptMapGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConceptMapGroupUnmappedMode createConceptMapGroupUnmappedMode() {
		ConceptMapGroupUnmappedModeImpl conceptMapGroupUnmappedMode = new ConceptMapGroupUnmappedModeImpl();
		return conceptMapGroupUnmappedMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConceptMapTarget createConceptMapTarget() {
		ConceptMapTargetImpl conceptMapTarget = new ConceptMapTargetImpl();
		return conceptMapTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConceptMapUnmapped createConceptMapUnmapped() {
		ConceptMapUnmappedImpl conceptMapUnmapped = new ConceptMapUnmappedImpl();
		return conceptMapUnmapped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalDeleteStatus createConditionalDeleteStatus() {
		ConditionalDeleteStatusImpl conditionalDeleteStatus = new ConditionalDeleteStatusImpl();
		return conditionalDeleteStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalReadStatus createConditionalReadStatus() {
		ConditionalReadStatusImpl conditionalReadStatus = new ConditionalReadStatusImpl();
		return conditionalReadStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionEvidence createConditionEvidence() {
		ConditionEvidenceImpl conditionEvidence = new ConditionEvidenceImpl();
		return conditionEvidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionStage createConditionStage() {
		ConditionStageImpl conditionStage = new ConditionStageImpl();
		return conditionStage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Consent createConsent() {
		ConsentImpl consent = new ConsentImpl();
		return consent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentActor createConsentActor() {
		ConsentActorImpl consentActor = new ConsentActorImpl();
		return consentActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentData createConsentData() {
		ConsentDataImpl consentData = new ConsentDataImpl();
		return consentData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentDataMeaning createConsentDataMeaning() {
		ConsentDataMeaningImpl consentDataMeaning = new ConsentDataMeaningImpl();
		return consentDataMeaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentPolicy createConsentPolicy() {
		ConsentPolicyImpl consentPolicy = new ConsentPolicyImpl();
		return consentPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentProvision createConsentProvision() {
		ConsentProvisionImpl consentProvision = new ConsentProvisionImpl();
		return consentProvision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentProvisionType createConsentProvisionType() {
		ConsentProvisionTypeImpl consentProvisionType = new ConsentProvisionTypeImpl();
		return consentProvisionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentState createConsentState() {
		ConsentStateImpl consentState = new ConsentStateImpl();
		return consentState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentVerification createConsentVerification() {
		ConsentVerificationImpl consentVerification = new ConsentVerificationImpl();
		return consentVerification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintSeverity createConstraintSeverity() {
		ConstraintSeverityImpl constraintSeverity = new ConstraintSeverityImpl();
		return constraintSeverity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactDetail createContactDetail() {
		ContactDetailImpl contactDetail = new ContactDetailImpl();
		return contactDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactPoint createContactPoint() {
		ContactPointImpl contactPoint = new ContactPointImpl();
		return contactPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactPointSystem createContactPointSystem() {
		ContactPointSystemImpl contactPointSystem = new ContactPointSystemImpl();
		return contactPointSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactPointUse createContactPointUse() {
		ContactPointUseImpl contactPointUse = new ContactPointUseImpl();
		return contactPointUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Contract createContract() {
		ContractImpl contract = new ContractImpl();
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContractAction createContractAction() {
		ContractActionImpl contractAction = new ContractActionImpl();
		return contractAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContractAnswer createContractAnswer() {
		ContractAnswerImpl contractAnswer = new ContractAnswerImpl();
		return contractAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContractAsset createContractAsset() {
		ContractAssetImpl contractAsset = new ContractAssetImpl();
		return contractAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContractContentDefinition createContractContentDefinition() {
		ContractContentDefinitionImpl contractContentDefinition = new ContractContentDefinitionImpl();
		return contractContentDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContractContext createContractContext() {
		ContractContextImpl contractContext = new ContractContextImpl();
		return contractContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContractFriendly createContractFriendly() {
		ContractFriendlyImpl contractFriendly = new ContractFriendlyImpl();
		return contractFriendly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContractLegal createContractLegal() {
		ContractLegalImpl contractLegal = new ContractLegalImpl();
		return contractLegal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContractOffer createContractOffer() {
		ContractOfferImpl contractOffer = new ContractOfferImpl();
		return contractOffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContractParty createContractParty() {
		ContractPartyImpl contractParty = new ContractPartyImpl();
		return contractParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContractResourcePublicationStatusCodes createContractResourcePublicationStatusCodes() {
		ContractResourcePublicationStatusCodesImpl contractResourcePublicationStatusCodes = new ContractResourcePublicationStatusCodesImpl();
		return contractResourcePublicationStatusCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContractResourceStatusCodes createContractResourceStatusCodes() {
		ContractResourceStatusCodesImpl contractResourceStatusCodes = new ContractResourceStatusCodesImpl();
		return contractResourceStatusCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContractRule createContractRule() {
		ContractRuleImpl contractRule = new ContractRuleImpl();
		return contractRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContractSecurityLabel createContractSecurityLabel() {
		ContractSecurityLabelImpl contractSecurityLabel = new ContractSecurityLabelImpl();
		return contractSecurityLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContractSigner createContractSigner() {
		ContractSignerImpl contractSigner = new ContractSignerImpl();
		return contractSigner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContractSubject createContractSubject() {
		ContractSubjectImpl contractSubject = new ContractSubjectImpl();
		return contractSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContractTerm createContractTerm() {
		ContractTermImpl contractTerm = new ContractTermImpl();
		return contractTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContractValuedItem createContractValuedItem() {
		ContractValuedItemImpl contractValuedItem = new ContractValuedItemImpl();
		return contractValuedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Contributor createContributor() {
		ContributorImpl contributor = new ContributorImpl();
		return contributor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContributorType createContributorType() {
		ContributorTypeImpl contributorType = new ContributorTypeImpl();
		return contributorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Count createCount() {
		CountImpl count = new CountImpl();
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coverage createCoverage() {
		CoverageImpl coverage = new CoverageImpl();
		return coverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoverageClass createCoverageClass() {
		CoverageClassImpl coverageClass = new CoverageClassImpl();
		return coverageClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoverageCostToBeneficiary createCoverageCostToBeneficiary() {
		CoverageCostToBeneficiaryImpl coverageCostToBeneficiary = new CoverageCostToBeneficiaryImpl();
		return coverageCostToBeneficiary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoverageEligibilityRequest createCoverageEligibilityRequest() {
		CoverageEligibilityRequestImpl coverageEligibilityRequest = new CoverageEligibilityRequestImpl();
		return coverageEligibilityRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoverageEligibilityRequestDiagnosis createCoverageEligibilityRequestDiagnosis() {
		CoverageEligibilityRequestDiagnosisImpl coverageEligibilityRequestDiagnosis = new CoverageEligibilityRequestDiagnosisImpl();
		return coverageEligibilityRequestDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoverageEligibilityRequestInsurance createCoverageEligibilityRequestInsurance() {
		CoverageEligibilityRequestInsuranceImpl coverageEligibilityRequestInsurance = new CoverageEligibilityRequestInsuranceImpl();
		return coverageEligibilityRequestInsurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoverageEligibilityRequestItem createCoverageEligibilityRequestItem() {
		CoverageEligibilityRequestItemImpl coverageEligibilityRequestItem = new CoverageEligibilityRequestItemImpl();
		return coverageEligibilityRequestItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoverageEligibilityRequestSupportingInfo createCoverageEligibilityRequestSupportingInfo() {
		CoverageEligibilityRequestSupportingInfoImpl coverageEligibilityRequestSupportingInfo = new CoverageEligibilityRequestSupportingInfoImpl();
		return coverageEligibilityRequestSupportingInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoverageEligibilityResponse createCoverageEligibilityResponse() {
		CoverageEligibilityResponseImpl coverageEligibilityResponse = new CoverageEligibilityResponseImpl();
		return coverageEligibilityResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoverageEligibilityResponseBenefit createCoverageEligibilityResponseBenefit() {
		CoverageEligibilityResponseBenefitImpl coverageEligibilityResponseBenefit = new CoverageEligibilityResponseBenefitImpl();
		return coverageEligibilityResponseBenefit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoverageEligibilityResponseError createCoverageEligibilityResponseError() {
		CoverageEligibilityResponseErrorImpl coverageEligibilityResponseError = new CoverageEligibilityResponseErrorImpl();
		return coverageEligibilityResponseError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoverageEligibilityResponseInsurance createCoverageEligibilityResponseInsurance() {
		CoverageEligibilityResponseInsuranceImpl coverageEligibilityResponseInsurance = new CoverageEligibilityResponseInsuranceImpl();
		return coverageEligibilityResponseInsurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoverageEligibilityResponseItem createCoverageEligibilityResponseItem() {
		CoverageEligibilityResponseItemImpl coverageEligibilityResponseItem = new CoverageEligibilityResponseItemImpl();
		return coverageEligibilityResponseItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoverageException createCoverageException() {
		CoverageExceptionImpl coverageException = new CoverageExceptionImpl();
		return coverageException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataRequirement createDataRequirement() {
		DataRequirementImpl dataRequirement = new DataRequirementImpl();
		return dataRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataRequirementCodeFilter createDataRequirementCodeFilter() {
		DataRequirementCodeFilterImpl dataRequirementCodeFilter = new DataRequirementCodeFilterImpl();
		return dataRequirementCodeFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataRequirementDateFilter createDataRequirementDateFilter() {
		DataRequirementDateFilterImpl dataRequirementDateFilter = new DataRequirementDateFilterImpl();
		return dataRequirementDateFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataRequirementSort createDataRequirementSort() {
		DataRequirementSortImpl dataRequirementSort = new DataRequirementSortImpl();
		return dataRequirementSort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date createDate() {
		DateImpl date = new DateImpl();
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime createDateTime() {
		DateTimeImpl dateTime = new DateTimeImpl();
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DaysOfWeek createDaysOfWeek() {
		DaysOfWeekImpl daysOfWeek = new DaysOfWeekImpl();
		return daysOfWeek;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal createDecimal() {
		DecimalImpl decimal = new DecimalImpl();
		return decimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DetectedIssue createDetectedIssue() {
		DetectedIssueImpl detectedIssue = new DetectedIssueImpl();
		return detectedIssue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DetectedIssueEvidence createDetectedIssueEvidence() {
		DetectedIssueEvidenceImpl detectedIssueEvidence = new DetectedIssueEvidenceImpl();
		return detectedIssueEvidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DetectedIssueMitigation createDetectedIssueMitigation() {
		DetectedIssueMitigationImpl detectedIssueMitigation = new DetectedIssueMitigationImpl();
		return detectedIssueMitigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DetectedIssueSeverity createDetectedIssueSeverity() {
		DetectedIssueSeverityImpl detectedIssueSeverity = new DetectedIssueSeverityImpl();
		return detectedIssueSeverity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Device createDevice() {
		DeviceImpl device = new DeviceImpl();
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceDefinition createDeviceDefinition() {
		DeviceDefinitionImpl deviceDefinition = new DeviceDefinitionImpl();
		return deviceDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceDefinitionCapability createDeviceDefinitionCapability() {
		DeviceDefinitionCapabilityImpl deviceDefinitionCapability = new DeviceDefinitionCapabilityImpl();
		return deviceDefinitionCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceDefinitionDeviceName createDeviceDefinitionDeviceName() {
		DeviceDefinitionDeviceNameImpl deviceDefinitionDeviceName = new DeviceDefinitionDeviceNameImpl();
		return deviceDefinitionDeviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceDefinitionMaterial createDeviceDefinitionMaterial() {
		DeviceDefinitionMaterialImpl deviceDefinitionMaterial = new DeviceDefinitionMaterialImpl();
		return deviceDefinitionMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceDefinitionProperty createDeviceDefinitionProperty() {
		DeviceDefinitionPropertyImpl deviceDefinitionProperty = new DeviceDefinitionPropertyImpl();
		return deviceDefinitionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceDefinitionSpecialization createDeviceDefinitionSpecialization() {
		DeviceDefinitionSpecializationImpl deviceDefinitionSpecialization = new DeviceDefinitionSpecializationImpl();
		return deviceDefinitionSpecialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceDefinitionUdiDeviceIdentifier createDeviceDefinitionUdiDeviceIdentifier() {
		DeviceDefinitionUdiDeviceIdentifierImpl deviceDefinitionUdiDeviceIdentifier = new DeviceDefinitionUdiDeviceIdentifierImpl();
		return deviceDefinitionUdiDeviceIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceDeviceName createDeviceDeviceName() {
		DeviceDeviceNameImpl deviceDeviceName = new DeviceDeviceNameImpl();
		return deviceDeviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceMetric createDeviceMetric() {
		DeviceMetricImpl deviceMetric = new DeviceMetricImpl();
		return deviceMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceMetricCalibration createDeviceMetricCalibration() {
		DeviceMetricCalibrationImpl deviceMetricCalibration = new DeviceMetricCalibrationImpl();
		return deviceMetricCalibration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceMetricCalibrationState createDeviceMetricCalibrationState() {
		DeviceMetricCalibrationStateImpl deviceMetricCalibrationState = new DeviceMetricCalibrationStateImpl();
		return deviceMetricCalibrationState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceMetricCalibrationType createDeviceMetricCalibrationType() {
		DeviceMetricCalibrationTypeImpl deviceMetricCalibrationType = new DeviceMetricCalibrationTypeImpl();
		return deviceMetricCalibrationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceMetricCategory createDeviceMetricCategory() {
		DeviceMetricCategoryImpl deviceMetricCategory = new DeviceMetricCategoryImpl();
		return deviceMetricCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceMetricColor createDeviceMetricColor() {
		DeviceMetricColorImpl deviceMetricColor = new DeviceMetricColorImpl();
		return deviceMetricColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceMetricOperationalStatus createDeviceMetricOperationalStatus() {
		DeviceMetricOperationalStatusImpl deviceMetricOperationalStatus = new DeviceMetricOperationalStatusImpl();
		return deviceMetricOperationalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceNameType createDeviceNameType() {
		DeviceNameTypeImpl deviceNameType = new DeviceNameTypeImpl();
		return deviceNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceProperty createDeviceProperty() {
		DevicePropertyImpl deviceProperty = new DevicePropertyImpl();
		return deviceProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceRequest createDeviceRequest() {
		DeviceRequestImpl deviceRequest = new DeviceRequestImpl();
		return deviceRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceRequestParameter createDeviceRequestParameter() {
		DeviceRequestParameterImpl deviceRequestParameter = new DeviceRequestParameterImpl();
		return deviceRequestParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceSpecialization createDeviceSpecialization() {
		DeviceSpecializationImpl deviceSpecialization = new DeviceSpecializationImpl();
		return deviceSpecialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceUdiCarrier createDeviceUdiCarrier() {
		DeviceUdiCarrierImpl deviceUdiCarrier = new DeviceUdiCarrierImpl();
		return deviceUdiCarrier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceUseStatement createDeviceUseStatement() {
		DeviceUseStatementImpl deviceUseStatement = new DeviceUseStatementImpl();
		return deviceUseStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceUseStatementStatus createDeviceUseStatementStatus() {
		DeviceUseStatementStatusImpl deviceUseStatementStatus = new DeviceUseStatementStatusImpl();
		return deviceUseStatementStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceVersion createDeviceVersion() {
		DeviceVersionImpl deviceVersion = new DeviceVersionImpl();
		return deviceVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiagnosticReport createDiagnosticReport() {
		DiagnosticReportImpl diagnosticReport = new DiagnosticReportImpl();
		return diagnosticReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiagnosticReportMedia createDiagnosticReportMedia() {
		DiagnosticReportMediaImpl diagnosticReportMedia = new DiagnosticReportMediaImpl();
		return diagnosticReportMedia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiagnosticReportStatus createDiagnosticReportStatus() {
		DiagnosticReportStatusImpl diagnosticReportStatus = new DiagnosticReportStatusImpl();
		return diagnosticReportStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiscriminatorType createDiscriminatorType() {
		DiscriminatorTypeImpl discriminatorType = new DiscriminatorTypeImpl();
		return discriminatorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Distance createDistance() {
		DistanceImpl distance = new DistanceImpl();
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentManifest createDocumentManifest() {
		DocumentManifestImpl documentManifest = new DocumentManifestImpl();
		return documentManifest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentManifestRelated createDocumentManifestRelated() {
		DocumentManifestRelatedImpl documentManifestRelated = new DocumentManifestRelatedImpl();
		return documentManifestRelated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentMode createDocumentMode() {
		DocumentModeImpl documentMode = new DocumentModeImpl();
		return documentMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentReference createDocumentReference() {
		DocumentReferenceImpl documentReference = new DocumentReferenceImpl();
		return documentReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentReferenceContent createDocumentReferenceContent() {
		DocumentReferenceContentImpl documentReferenceContent = new DocumentReferenceContentImpl();
		return documentReferenceContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentReferenceContext createDocumentReferenceContext() {
		DocumentReferenceContextImpl documentReferenceContext = new DocumentReferenceContextImpl();
		return documentReferenceContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentReferenceRelatesTo createDocumentReferenceRelatesTo() {
		DocumentReferenceRelatesToImpl documentReferenceRelatesTo = new DocumentReferenceRelatesToImpl();
		return documentReferenceRelatesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentReferenceStatus createDocumentReferenceStatus() {
		DocumentReferenceStatusImpl documentReferenceStatus = new DocumentReferenceStatusImpl();
		return documentReferenceStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentRelationshipType createDocumentRelationshipType() {
		DocumentRelationshipTypeImpl documentRelationshipType = new DocumentRelationshipTypeImpl();
		return documentRelationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainResource createDomainResource() {
		DomainResourceImpl domainResource = new DomainResourceImpl();
		return domainResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dosage createDosage() {
		DosageImpl dosage = new DosageImpl();
		return dosage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DosageDoseAndRate createDosageDoseAndRate() {
		DosageDoseAndRateImpl dosageDoseAndRate = new DosageDoseAndRateImpl();
		return dosageDoseAndRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration createDuration() {
		DurationImpl duration = new DurationImpl();
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EffectEvidenceSynthesis createEffectEvidenceSynthesis() {
		EffectEvidenceSynthesisImpl effectEvidenceSynthesis = new EffectEvidenceSynthesisImpl();
		return effectEvidenceSynthesis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EffectEvidenceSynthesisCertainty createEffectEvidenceSynthesisCertainty() {
		EffectEvidenceSynthesisCertaintyImpl effectEvidenceSynthesisCertainty = new EffectEvidenceSynthesisCertaintyImpl();
		return effectEvidenceSynthesisCertainty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EffectEvidenceSynthesisCertaintySubcomponent createEffectEvidenceSynthesisCertaintySubcomponent() {
		EffectEvidenceSynthesisCertaintySubcomponentImpl effectEvidenceSynthesisCertaintySubcomponent = new EffectEvidenceSynthesisCertaintySubcomponentImpl();
		return effectEvidenceSynthesisCertaintySubcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EffectEvidenceSynthesisEffectEstimate createEffectEvidenceSynthesisEffectEstimate() {
		EffectEvidenceSynthesisEffectEstimateImpl effectEvidenceSynthesisEffectEstimate = new EffectEvidenceSynthesisEffectEstimateImpl();
		return effectEvidenceSynthesisEffectEstimate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EffectEvidenceSynthesisPrecisionEstimate createEffectEvidenceSynthesisPrecisionEstimate() {
		EffectEvidenceSynthesisPrecisionEstimateImpl effectEvidenceSynthesisPrecisionEstimate = new EffectEvidenceSynthesisPrecisionEstimateImpl();
		return effectEvidenceSynthesisPrecisionEstimate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EffectEvidenceSynthesisResultsByExposure createEffectEvidenceSynthesisResultsByExposure() {
		EffectEvidenceSynthesisResultsByExposureImpl effectEvidenceSynthesisResultsByExposure = new EffectEvidenceSynthesisResultsByExposureImpl();
		return effectEvidenceSynthesisResultsByExposure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EffectEvidenceSynthesisSampleSize createEffectEvidenceSynthesisSampleSize() {
		EffectEvidenceSynthesisSampleSizeImpl effectEvidenceSynthesisSampleSize = new EffectEvidenceSynthesisSampleSizeImpl();
		return effectEvidenceSynthesisSampleSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementDefinition createElementDefinition() {
		ElementDefinitionImpl elementDefinition = new ElementDefinitionImpl();
		return elementDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementDefinitionBase createElementDefinitionBase() {
		ElementDefinitionBaseImpl elementDefinitionBase = new ElementDefinitionBaseImpl();
		return elementDefinitionBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementDefinitionBinding createElementDefinitionBinding() {
		ElementDefinitionBindingImpl elementDefinitionBinding = new ElementDefinitionBindingImpl();
		return elementDefinitionBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementDefinitionConstraint createElementDefinitionConstraint() {
		ElementDefinitionConstraintImpl elementDefinitionConstraint = new ElementDefinitionConstraintImpl();
		return elementDefinitionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementDefinitionDiscriminator createElementDefinitionDiscriminator() {
		ElementDefinitionDiscriminatorImpl elementDefinitionDiscriminator = new ElementDefinitionDiscriminatorImpl();
		return elementDefinitionDiscriminator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementDefinitionExample createElementDefinitionExample() {
		ElementDefinitionExampleImpl elementDefinitionExample = new ElementDefinitionExampleImpl();
		return elementDefinitionExample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementDefinitionMapping createElementDefinitionMapping() {
		ElementDefinitionMappingImpl elementDefinitionMapping = new ElementDefinitionMappingImpl();
		return elementDefinitionMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementDefinitionSlicing createElementDefinitionSlicing() {
		ElementDefinitionSlicingImpl elementDefinitionSlicing = new ElementDefinitionSlicingImpl();
		return elementDefinitionSlicing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementDefinitionType createElementDefinitionType() {
		ElementDefinitionTypeImpl elementDefinitionType = new ElementDefinitionTypeImpl();
		return elementDefinitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EligibilityRequestPurpose createEligibilityRequestPurpose() {
		EligibilityRequestPurposeImpl eligibilityRequestPurpose = new EligibilityRequestPurposeImpl();
		return eligibilityRequestPurpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EligibilityResponsePurpose createEligibilityResponsePurpose() {
		EligibilityResponsePurposeImpl eligibilityResponsePurpose = new EligibilityResponsePurposeImpl();
		return eligibilityResponsePurpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnableWhenBehavior createEnableWhenBehavior() {
		EnableWhenBehaviorImpl enableWhenBehavior = new EnableWhenBehaviorImpl();
		return enableWhenBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Encounter createEncounter() {
		EncounterImpl encounter = new EncounterImpl();
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncounterClassHistory createEncounterClassHistory() {
		EncounterClassHistoryImpl encounterClassHistory = new EncounterClassHistoryImpl();
		return encounterClassHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncounterDiagnosis createEncounterDiagnosis() {
		EncounterDiagnosisImpl encounterDiagnosis = new EncounterDiagnosisImpl();
		return encounterDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncounterHospitalization createEncounterHospitalization() {
		EncounterHospitalizationImpl encounterHospitalization = new EncounterHospitalizationImpl();
		return encounterHospitalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncounterLocation createEncounterLocation() {
		EncounterLocationImpl encounterLocation = new EncounterLocationImpl();
		return encounterLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncounterLocationStatus createEncounterLocationStatus() {
		EncounterLocationStatusImpl encounterLocationStatus = new EncounterLocationStatusImpl();
		return encounterLocationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncounterParticipant createEncounterParticipant() {
		EncounterParticipantImpl encounterParticipant = new EncounterParticipantImpl();
		return encounterParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncounterStatus createEncounterStatus() {
		EncounterStatusImpl encounterStatus = new EncounterStatusImpl();
		return encounterStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncounterStatusHistory createEncounterStatusHistory() {
		EncounterStatusHistoryImpl encounterStatusHistory = new EncounterStatusHistoryImpl();
		return encounterStatusHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Endpoint createEndpoint() {
		EndpointImpl endpoint = new EndpointImpl();
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EndpointStatus createEndpointStatus() {
		EndpointStatusImpl endpointStatus = new EndpointStatusImpl();
		return endpointStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnrollmentRequest createEnrollmentRequest() {
		EnrollmentRequestImpl enrollmentRequest = new EnrollmentRequestImpl();
		return enrollmentRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnrollmentResponse createEnrollmentResponse() {
		EnrollmentResponseImpl enrollmentResponse = new EnrollmentResponseImpl();
		return enrollmentResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EpisodeOfCare createEpisodeOfCare() {
		EpisodeOfCareImpl episodeOfCare = new EpisodeOfCareImpl();
		return episodeOfCare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EpisodeOfCareDiagnosis createEpisodeOfCareDiagnosis() {
		EpisodeOfCareDiagnosisImpl episodeOfCareDiagnosis = new EpisodeOfCareDiagnosisImpl();
		return episodeOfCareDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EpisodeOfCareStatus createEpisodeOfCareStatus() {
		EpisodeOfCareStatusImpl episodeOfCareStatus = new EpisodeOfCareStatusImpl();
		return episodeOfCareStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EpisodeOfCareStatusHistory createEpisodeOfCareStatusHistory() {
		EpisodeOfCareStatusHistoryImpl episodeOfCareStatusHistory = new EpisodeOfCareStatusHistoryImpl();
		return episodeOfCareStatusHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventCapabilityMode createEventCapabilityMode() {
		EventCapabilityModeImpl eventCapabilityMode = new EventCapabilityModeImpl();
		return eventCapabilityMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventDefinition createEventDefinition() {
		EventDefinitionImpl eventDefinition = new EventDefinitionImpl();
		return eventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventStatus createEventStatus() {
		EventStatusImpl eventStatus = new EventStatusImpl();
		return eventStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventTiming createEventTiming() {
		EventTimingImpl eventTiming = new EventTimingImpl();
		return eventTiming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Evidence createEvidence() {
		EvidenceImpl evidence = new EvidenceImpl();
		return evidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EvidenceVariable createEvidenceVariable() {
		EvidenceVariableImpl evidenceVariable = new EvidenceVariableImpl();
		return evidenceVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EvidenceVariableCharacteristic createEvidenceVariableCharacteristic() {
		EvidenceVariableCharacteristicImpl evidenceVariableCharacteristic = new EvidenceVariableCharacteristicImpl();
		return evidenceVariableCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EvidenceVariableType createEvidenceVariableType() {
		EvidenceVariableTypeImpl evidenceVariableType = new EvidenceVariableTypeImpl();
		return evidenceVariableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExampleScenario createExampleScenario() {
		ExampleScenarioImpl exampleScenario = new ExampleScenarioImpl();
		return exampleScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExampleScenarioActor createExampleScenarioActor() {
		ExampleScenarioActorImpl exampleScenarioActor = new ExampleScenarioActorImpl();
		return exampleScenarioActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExampleScenarioActorType createExampleScenarioActorType() {
		ExampleScenarioActorTypeImpl exampleScenarioActorType = new ExampleScenarioActorTypeImpl();
		return exampleScenarioActorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExampleScenarioAlternative createExampleScenarioAlternative() {
		ExampleScenarioAlternativeImpl exampleScenarioAlternative = new ExampleScenarioAlternativeImpl();
		return exampleScenarioAlternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExampleScenarioContainedInstance createExampleScenarioContainedInstance() {
		ExampleScenarioContainedInstanceImpl exampleScenarioContainedInstance = new ExampleScenarioContainedInstanceImpl();
		return exampleScenarioContainedInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExampleScenarioInstance createExampleScenarioInstance() {
		ExampleScenarioInstanceImpl exampleScenarioInstance = new ExampleScenarioInstanceImpl();
		return exampleScenarioInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExampleScenarioOperation createExampleScenarioOperation() {
		ExampleScenarioOperationImpl exampleScenarioOperation = new ExampleScenarioOperationImpl();
		return exampleScenarioOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExampleScenarioProcess createExampleScenarioProcess() {
		ExampleScenarioProcessImpl exampleScenarioProcess = new ExampleScenarioProcessImpl();
		return exampleScenarioProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExampleScenarioStep createExampleScenarioStep() {
		ExampleScenarioStepImpl exampleScenarioStep = new ExampleScenarioStepImpl();
		return exampleScenarioStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExampleScenarioVersion createExampleScenarioVersion() {
		ExampleScenarioVersionImpl exampleScenarioVersion = new ExampleScenarioVersionImpl();
		return exampleScenarioVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationOfBenefit createExplanationOfBenefit() {
		ExplanationOfBenefitImpl explanationOfBenefit = new ExplanationOfBenefitImpl();
		return explanationOfBenefit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationOfBenefitAccident createExplanationOfBenefitAccident() {
		ExplanationOfBenefitAccidentImpl explanationOfBenefitAccident = new ExplanationOfBenefitAccidentImpl();
		return explanationOfBenefitAccident;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationOfBenefitAddItem createExplanationOfBenefitAddItem() {
		ExplanationOfBenefitAddItemImpl explanationOfBenefitAddItem = new ExplanationOfBenefitAddItemImpl();
		return explanationOfBenefitAddItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationOfBenefitAdjudication createExplanationOfBenefitAdjudication() {
		ExplanationOfBenefitAdjudicationImpl explanationOfBenefitAdjudication = new ExplanationOfBenefitAdjudicationImpl();
		return explanationOfBenefitAdjudication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationOfBenefitBenefitBalance createExplanationOfBenefitBenefitBalance() {
		ExplanationOfBenefitBenefitBalanceImpl explanationOfBenefitBenefitBalance = new ExplanationOfBenefitBenefitBalanceImpl();
		return explanationOfBenefitBenefitBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationOfBenefitCareTeam createExplanationOfBenefitCareTeam() {
		ExplanationOfBenefitCareTeamImpl explanationOfBenefitCareTeam = new ExplanationOfBenefitCareTeamImpl();
		return explanationOfBenefitCareTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationOfBenefitDetail createExplanationOfBenefitDetail() {
		ExplanationOfBenefitDetailImpl explanationOfBenefitDetail = new ExplanationOfBenefitDetailImpl();
		return explanationOfBenefitDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationOfBenefitDetail1 createExplanationOfBenefitDetail1() {
		ExplanationOfBenefitDetail1Impl explanationOfBenefitDetail1 = new ExplanationOfBenefitDetail1Impl();
		return explanationOfBenefitDetail1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationOfBenefitDiagnosis createExplanationOfBenefitDiagnosis() {
		ExplanationOfBenefitDiagnosisImpl explanationOfBenefitDiagnosis = new ExplanationOfBenefitDiagnosisImpl();
		return explanationOfBenefitDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationOfBenefitFinancial createExplanationOfBenefitFinancial() {
		ExplanationOfBenefitFinancialImpl explanationOfBenefitFinancial = new ExplanationOfBenefitFinancialImpl();
		return explanationOfBenefitFinancial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationOfBenefitInsurance createExplanationOfBenefitInsurance() {
		ExplanationOfBenefitInsuranceImpl explanationOfBenefitInsurance = new ExplanationOfBenefitInsuranceImpl();
		return explanationOfBenefitInsurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationOfBenefitItem createExplanationOfBenefitItem() {
		ExplanationOfBenefitItemImpl explanationOfBenefitItem = new ExplanationOfBenefitItemImpl();
		return explanationOfBenefitItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationOfBenefitPayee createExplanationOfBenefitPayee() {
		ExplanationOfBenefitPayeeImpl explanationOfBenefitPayee = new ExplanationOfBenefitPayeeImpl();
		return explanationOfBenefitPayee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationOfBenefitPayment createExplanationOfBenefitPayment() {
		ExplanationOfBenefitPaymentImpl explanationOfBenefitPayment = new ExplanationOfBenefitPaymentImpl();
		return explanationOfBenefitPayment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationOfBenefitProcedure createExplanationOfBenefitProcedure() {
		ExplanationOfBenefitProcedureImpl explanationOfBenefitProcedure = new ExplanationOfBenefitProcedureImpl();
		return explanationOfBenefitProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationOfBenefitProcessNote createExplanationOfBenefitProcessNote() {
		ExplanationOfBenefitProcessNoteImpl explanationOfBenefitProcessNote = new ExplanationOfBenefitProcessNoteImpl();
		return explanationOfBenefitProcessNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationOfBenefitRelated createExplanationOfBenefitRelated() {
		ExplanationOfBenefitRelatedImpl explanationOfBenefitRelated = new ExplanationOfBenefitRelatedImpl();
		return explanationOfBenefitRelated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationOfBenefitStatus createExplanationOfBenefitStatus() {
		ExplanationOfBenefitStatusImpl explanationOfBenefitStatus = new ExplanationOfBenefitStatusImpl();
		return explanationOfBenefitStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationOfBenefitSubDetail createExplanationOfBenefitSubDetail() {
		ExplanationOfBenefitSubDetailImpl explanationOfBenefitSubDetail = new ExplanationOfBenefitSubDetailImpl();
		return explanationOfBenefitSubDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationOfBenefitSubDetail1 createExplanationOfBenefitSubDetail1() {
		ExplanationOfBenefitSubDetail1Impl explanationOfBenefitSubDetail1 = new ExplanationOfBenefitSubDetail1Impl();
		return explanationOfBenefitSubDetail1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationOfBenefitSupportingInfo createExplanationOfBenefitSupportingInfo() {
		ExplanationOfBenefitSupportingInfoImpl explanationOfBenefitSupportingInfo = new ExplanationOfBenefitSupportingInfoImpl();
		return explanationOfBenefitSupportingInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplanationOfBenefitTotal createExplanationOfBenefitTotal() {
		ExplanationOfBenefitTotalImpl explanationOfBenefitTotal = new ExplanationOfBenefitTotalImpl();
		return explanationOfBenefitTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExposureState createExposureState() {
		ExposureStateImpl exposureState = new ExposureStateImpl();
		return exposureState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpressionLanguage createExpressionLanguage() {
		ExpressionLanguageImpl expressionLanguage = new ExpressionLanguageImpl();
		return expressionLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Extension createExtension() {
		ExtensionImpl extension = new ExtensionImpl();
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExtensionContextType createExtensionContextType() {
		ExtensionContextTypeImpl extensionContextType = new ExtensionContextTypeImpl();
		return extensionContextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FamilyHistoryStatus createFamilyHistoryStatus() {
		FamilyHistoryStatusImpl familyHistoryStatus = new FamilyHistoryStatusImpl();
		return familyHistoryStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FamilyMemberHistory createFamilyMemberHistory() {
		FamilyMemberHistoryImpl familyMemberHistory = new FamilyMemberHistoryImpl();
		return familyMemberHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FamilyMemberHistoryCondition createFamilyMemberHistoryCondition() {
		FamilyMemberHistoryConditionImpl familyMemberHistoryCondition = new FamilyMemberHistoryConditionImpl();
		return familyMemberHistoryCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FHIRDeviceStatus createFHIRDeviceStatus() {
		FHIRDeviceStatusImpl fhirDeviceStatus = new FHIRDeviceStatusImpl();
		return fhirDeviceStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FHIRSubstanceStatus createFHIRSubstanceStatus() {
		FHIRSubstanceStatusImpl fhirSubstanceStatus = new FHIRSubstanceStatusImpl();
		return fhirSubstanceStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FHIRVersion createFHIRVersion() {
		FHIRVersionImpl fhirVersion = new FHIRVersionImpl();
		return fhirVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilterOperator createFilterOperator() {
		FilterOperatorImpl filterOperator = new FilterOperatorImpl();
		return filterOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinancialResourceStatusCodes createFinancialResourceStatusCodes() {
		FinancialResourceStatusCodesImpl financialResourceStatusCodes = new FinancialResourceStatusCodesImpl();
		return financialResourceStatusCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Flag createFlag() {
		FlagImpl flag = new FlagImpl();
		return flag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlagStatus createFlagStatus() {
		FlagStatusImpl flagStatus = new FlagStatusImpl();
		return flagStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Goal createGoal() {
		GoalImpl goal = new GoalImpl();
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GoalLifecycleStatus createGoalLifecycleStatus() {
		GoalLifecycleStatusImpl goalLifecycleStatus = new GoalLifecycleStatusImpl();
		return goalLifecycleStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GoalTarget createGoalTarget() {
		GoalTargetImpl goalTarget = new GoalTargetImpl();
		return goalTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphCompartmentRule createGraphCompartmentRule() {
		GraphCompartmentRuleImpl graphCompartmentRule = new GraphCompartmentRuleImpl();
		return graphCompartmentRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphCompartmentUse createGraphCompartmentUse() {
		GraphCompartmentUseImpl graphCompartmentUse = new GraphCompartmentUseImpl();
		return graphCompartmentUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphDefinition createGraphDefinition() {
		GraphDefinitionImpl graphDefinition = new GraphDefinitionImpl();
		return graphDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphDefinitionCompartment createGraphDefinitionCompartment() {
		GraphDefinitionCompartmentImpl graphDefinitionCompartment = new GraphDefinitionCompartmentImpl();
		return graphDefinitionCompartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphDefinitionLink createGraphDefinitionLink() {
		GraphDefinitionLinkImpl graphDefinitionLink = new GraphDefinitionLinkImpl();
		return graphDefinitionLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphDefinitionTarget createGraphDefinitionTarget() {
		GraphDefinitionTargetImpl graphDefinitionTarget = new GraphDefinitionTargetImpl();
		return graphDefinitionTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupCharacteristic createGroupCharacteristic() {
		GroupCharacteristicImpl groupCharacteristic = new GroupCharacteristicImpl();
		return groupCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupMeasure createGroupMeasure() {
		GroupMeasureImpl groupMeasure = new GroupMeasureImpl();
		return groupMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupMember createGroupMember() {
		GroupMemberImpl groupMember = new GroupMemberImpl();
		return groupMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupType createGroupType() {
		GroupTypeImpl groupType = new GroupTypeImpl();
		return groupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GuidanceResponse createGuidanceResponse() {
		GuidanceResponseImpl guidanceResponse = new GuidanceResponseImpl();
		return guidanceResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GuidanceResponseStatus createGuidanceResponseStatus() {
		GuidanceResponseStatusImpl guidanceResponseStatus = new GuidanceResponseStatusImpl();
		return guidanceResponseStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GuidePageGeneration createGuidePageGeneration() {
		GuidePageGenerationImpl guidePageGeneration = new GuidePageGenerationImpl();
		return guidePageGeneration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GuideParameterCode createGuideParameterCode() {
		GuideParameterCodeImpl guideParameterCode = new GuideParameterCodeImpl();
		return guideParameterCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HealthcareService createHealthcareService() {
		HealthcareServiceImpl healthcareService = new HealthcareServiceImpl();
		return healthcareService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HealthcareServiceAvailableTime createHealthcareServiceAvailableTime() {
		HealthcareServiceAvailableTimeImpl healthcareServiceAvailableTime = new HealthcareServiceAvailableTimeImpl();
		return healthcareServiceAvailableTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HealthcareServiceEligibility createHealthcareServiceEligibility() {
		HealthcareServiceEligibilityImpl healthcareServiceEligibility = new HealthcareServiceEligibilityImpl();
		return healthcareServiceEligibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HealthcareServiceNotAvailable createHealthcareServiceNotAvailable() {
		HealthcareServiceNotAvailableImpl healthcareServiceNotAvailable = new HealthcareServiceNotAvailableImpl();
		return healthcareServiceNotAvailable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HTTPVerb createHTTPVerb() {
		HTTPVerbImpl httpVerb = new HTTPVerbImpl();
		return httpVerb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HumanName createHumanName() {
		HumanNameImpl humanName = new HumanNameImpl();
		return humanName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Id createId() {
		IdImpl id = new IdImpl();
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier createIdentifier() {
		IdentifierImpl identifier = new IdentifierImpl();
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdentifierUse createIdentifierUse() {
		IdentifierUseImpl identifierUse = new IdentifierUseImpl();
		return identifierUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdentityAssuranceLevel createIdentityAssuranceLevel() {
		IdentityAssuranceLevelImpl identityAssuranceLevel = new IdentityAssuranceLevelImpl();
		return identityAssuranceLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImagingStudy createImagingStudy() {
		ImagingStudyImpl imagingStudy = new ImagingStudyImpl();
		return imagingStudy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImagingStudyInstance createImagingStudyInstance() {
		ImagingStudyInstanceImpl imagingStudyInstance = new ImagingStudyInstanceImpl();
		return imagingStudyInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImagingStudyPerformer createImagingStudyPerformer() {
		ImagingStudyPerformerImpl imagingStudyPerformer = new ImagingStudyPerformerImpl();
		return imagingStudyPerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImagingStudySeries createImagingStudySeries() {
		ImagingStudySeriesImpl imagingStudySeries = new ImagingStudySeriesImpl();
		return imagingStudySeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImagingStudyStatus createImagingStudyStatus() {
		ImagingStudyStatusImpl imagingStudyStatus = new ImagingStudyStatusImpl();
		return imagingStudyStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Immunization createImmunization() {
		ImmunizationImpl immunization = new ImmunizationImpl();
		return immunization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmunizationEducation createImmunizationEducation() {
		ImmunizationEducationImpl immunizationEducation = new ImmunizationEducationImpl();
		return immunizationEducation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmunizationEvaluation createImmunizationEvaluation() {
		ImmunizationEvaluationImpl immunizationEvaluation = new ImmunizationEvaluationImpl();
		return immunizationEvaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmunizationEvaluationStatusCodes createImmunizationEvaluationStatusCodes() {
		ImmunizationEvaluationStatusCodesImpl immunizationEvaluationStatusCodes = new ImmunizationEvaluationStatusCodesImpl();
		return immunizationEvaluationStatusCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmunizationPerformer createImmunizationPerformer() {
		ImmunizationPerformerImpl immunizationPerformer = new ImmunizationPerformerImpl();
		return immunizationPerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmunizationProtocolApplied createImmunizationProtocolApplied() {
		ImmunizationProtocolAppliedImpl immunizationProtocolApplied = new ImmunizationProtocolAppliedImpl();
		return immunizationProtocolApplied;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmunizationReaction createImmunizationReaction() {
		ImmunizationReactionImpl immunizationReaction = new ImmunizationReactionImpl();
		return immunizationReaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmunizationRecommendation createImmunizationRecommendation() {
		ImmunizationRecommendationImpl immunizationRecommendation = new ImmunizationRecommendationImpl();
		return immunizationRecommendation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmunizationRecommendationDateCriterion createImmunizationRecommendationDateCriterion() {
		ImmunizationRecommendationDateCriterionImpl immunizationRecommendationDateCriterion = new ImmunizationRecommendationDateCriterionImpl();
		return immunizationRecommendationDateCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmunizationRecommendationRecommendation createImmunizationRecommendationRecommendation() {
		ImmunizationRecommendationRecommendationImpl immunizationRecommendationRecommendation = new ImmunizationRecommendationRecommendationImpl();
		return immunizationRecommendationRecommendation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmunizationStatusCodes createImmunizationStatusCodes() {
		ImmunizationStatusCodesImpl immunizationStatusCodes = new ImmunizationStatusCodesImpl();
		return immunizationStatusCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImplementationGuide createImplementationGuide() {
		ImplementationGuideImpl implementationGuide = new ImplementationGuideImpl();
		return implementationGuide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImplementationGuideDefinition createImplementationGuideDefinition() {
		ImplementationGuideDefinitionImpl implementationGuideDefinition = new ImplementationGuideDefinitionImpl();
		return implementationGuideDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImplementationGuideDependsOn createImplementationGuideDependsOn() {
		ImplementationGuideDependsOnImpl implementationGuideDependsOn = new ImplementationGuideDependsOnImpl();
		return implementationGuideDependsOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImplementationGuideGlobal createImplementationGuideGlobal() {
		ImplementationGuideGlobalImpl implementationGuideGlobal = new ImplementationGuideGlobalImpl();
		return implementationGuideGlobal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImplementationGuideGrouping createImplementationGuideGrouping() {
		ImplementationGuideGroupingImpl implementationGuideGrouping = new ImplementationGuideGroupingImpl();
		return implementationGuideGrouping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImplementationGuideManifest createImplementationGuideManifest() {
		ImplementationGuideManifestImpl implementationGuideManifest = new ImplementationGuideManifestImpl();
		return implementationGuideManifest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImplementationGuidePage createImplementationGuidePage() {
		ImplementationGuidePageImpl implementationGuidePage = new ImplementationGuidePageImpl();
		return implementationGuidePage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImplementationGuidePage1 createImplementationGuidePage1() {
		ImplementationGuidePage1Impl implementationGuidePage1 = new ImplementationGuidePage1Impl();
		return implementationGuidePage1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImplementationGuideParameter createImplementationGuideParameter() {
		ImplementationGuideParameterImpl implementationGuideParameter = new ImplementationGuideParameterImpl();
		return implementationGuideParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImplementationGuideResource createImplementationGuideResource() {
		ImplementationGuideResourceImpl implementationGuideResource = new ImplementationGuideResourceImpl();
		return implementationGuideResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImplementationGuideResource1 createImplementationGuideResource1() {
		ImplementationGuideResource1Impl implementationGuideResource1 = new ImplementationGuideResource1Impl();
		return implementationGuideResource1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImplementationGuideTemplate createImplementationGuideTemplate() {
		ImplementationGuideTemplateImpl implementationGuideTemplate = new ImplementationGuideTemplateImpl();
		return implementationGuideTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instant createInstant() {
		InstantImpl instant = new InstantImpl();
		return instant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InsurancePlan createInsurancePlan() {
		InsurancePlanImpl insurancePlan = new InsurancePlanImpl();
		return insurancePlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InsurancePlanBenefit createInsurancePlanBenefit() {
		InsurancePlanBenefitImpl insurancePlanBenefit = new InsurancePlanBenefitImpl();
		return insurancePlanBenefit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InsurancePlanBenefit1 createInsurancePlanBenefit1() {
		InsurancePlanBenefit1Impl insurancePlanBenefit1 = new InsurancePlanBenefit1Impl();
		return insurancePlanBenefit1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InsurancePlanContact createInsurancePlanContact() {
		InsurancePlanContactImpl insurancePlanContact = new InsurancePlanContactImpl();
		return insurancePlanContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InsurancePlanCost createInsurancePlanCost() {
		InsurancePlanCostImpl insurancePlanCost = new InsurancePlanCostImpl();
		return insurancePlanCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InsurancePlanCoverage createInsurancePlanCoverage() {
		InsurancePlanCoverageImpl insurancePlanCoverage = new InsurancePlanCoverageImpl();
		return insurancePlanCoverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InsurancePlanGeneralCost createInsurancePlanGeneralCost() {
		InsurancePlanGeneralCostImpl insurancePlanGeneralCost = new InsurancePlanGeneralCostImpl();
		return insurancePlanGeneralCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InsurancePlanLimit createInsurancePlanLimit() {
		InsurancePlanLimitImpl insurancePlanLimit = new InsurancePlanLimitImpl();
		return insurancePlanLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InsurancePlanPlan createInsurancePlanPlan() {
		InsurancePlanPlanImpl insurancePlanPlan = new InsurancePlanPlanImpl();
		return insurancePlanPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InsurancePlanSpecificCost createInsurancePlanSpecificCost() {
		InsurancePlanSpecificCostImpl insurancePlanSpecificCost = new InsurancePlanSpecificCostImpl();
		return insurancePlanSpecificCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Integer createInteger() {
		IntegerImpl integer = new IntegerImpl();
		return integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Invoice createInvoice() {
		InvoiceImpl invoice = new InvoiceImpl();
		return invoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvoiceLineItem createInvoiceLineItem() {
		InvoiceLineItemImpl invoiceLineItem = new InvoiceLineItemImpl();
		return invoiceLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvoiceParticipant createInvoiceParticipant() {
		InvoiceParticipantImpl invoiceParticipant = new InvoiceParticipantImpl();
		return invoiceParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvoicePriceComponent createInvoicePriceComponent() {
		InvoicePriceComponentImpl invoicePriceComponent = new InvoicePriceComponentImpl();
		return invoicePriceComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvoicePriceComponentType createInvoicePriceComponentType() {
		InvoicePriceComponentTypeImpl invoicePriceComponentType = new InvoicePriceComponentTypeImpl();
		return invoicePriceComponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvoiceStatus createInvoiceStatus() {
		InvoiceStatusImpl invoiceStatus = new InvoiceStatusImpl();
		return invoiceStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssueSeverity createIssueSeverity() {
		IssueSeverityImpl issueSeverity = new IssueSeverityImpl();
		return issueSeverity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssueType createIssueType() {
		IssueTypeImpl issueType = new IssueTypeImpl();
		return issueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Library createLibrary() {
		LibraryImpl library = new LibraryImpl();
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Linkage createLinkage() {
		LinkageImpl linkage = new LinkageImpl();
		return linkage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkageItem createLinkageItem() {
		LinkageItemImpl linkageItem = new LinkageItemImpl();
		return linkageItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkageType createLinkageType() {
		LinkageTypeImpl linkageType = new LinkageTypeImpl();
		return linkageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkType createLinkType() {
		LinkTypeImpl linkType = new LinkTypeImpl();
		return linkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List createList() {
		ListImpl list = new ListImpl();
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListEntry createListEntry() {
		ListEntryImpl listEntry = new ListEntryImpl();
		return listEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListMode createListMode() {
		ListModeImpl listMode = new ListModeImpl();
		return listMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListStatus createListStatus() {
		ListStatusImpl listStatus = new ListStatusImpl();
		return listStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocationHoursOfOperation createLocationHoursOfOperation() {
		LocationHoursOfOperationImpl locationHoursOfOperation = new LocationHoursOfOperationImpl();
		return locationHoursOfOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocationMode createLocationMode() {
		LocationModeImpl locationMode = new LocationModeImpl();
		return locationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocationPosition createLocationPosition() {
		LocationPositionImpl locationPosition = new LocationPositionImpl();
		return locationPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocationStatus createLocationStatus() {
		LocationStatusImpl locationStatus = new LocationStatusImpl();
		return locationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown createMarkdown() {
		MarkdownImpl markdown = new MarkdownImpl();
		return markdown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarketingStatus createMarketingStatus() {
		MarketingStatusImpl marketingStatus = new MarketingStatusImpl();
		return marketingStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Measure createMeasure() {
		MeasureImpl measure = new MeasureImpl();
		return measure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureComponent createMeasureComponent() {
		MeasureComponentImpl measureComponent = new MeasureComponentImpl();
		return measureComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureGroup createMeasureGroup() {
		MeasureGroupImpl measureGroup = new MeasureGroupImpl();
		return measureGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasurePopulation createMeasurePopulation() {
		MeasurePopulationImpl measurePopulation = new MeasurePopulationImpl();
		return measurePopulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureReport createMeasureReport() {
		MeasureReportImpl measureReport = new MeasureReportImpl();
		return measureReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureReportComponent createMeasureReportComponent() {
		MeasureReportComponentImpl measureReportComponent = new MeasureReportComponentImpl();
		return measureReportComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureReportGroup createMeasureReportGroup() {
		MeasureReportGroupImpl measureReportGroup = new MeasureReportGroupImpl();
		return measureReportGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureReportPopulation createMeasureReportPopulation() {
		MeasureReportPopulationImpl measureReportPopulation = new MeasureReportPopulationImpl();
		return measureReportPopulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureReportPopulation1 createMeasureReportPopulation1() {
		MeasureReportPopulation1Impl measureReportPopulation1 = new MeasureReportPopulation1Impl();
		return measureReportPopulation1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureReportStatus createMeasureReportStatus() {
		MeasureReportStatusImpl measureReportStatus = new MeasureReportStatusImpl();
		return measureReportStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureReportStratifier createMeasureReportStratifier() {
		MeasureReportStratifierImpl measureReportStratifier = new MeasureReportStratifierImpl();
		return measureReportStratifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureReportStratum createMeasureReportStratum() {
		MeasureReportStratumImpl measureReportStratum = new MeasureReportStratumImpl();
		return measureReportStratum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureReportType createMeasureReportType() {
		MeasureReportTypeImpl measureReportType = new MeasureReportTypeImpl();
		return measureReportType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureStratifier createMeasureStratifier() {
		MeasureStratifierImpl measureStratifier = new MeasureStratifierImpl();
		return measureStratifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureSupplementalData createMeasureSupplementalData() {
		MeasureSupplementalDataImpl measureSupplementalData = new MeasureSupplementalDataImpl();
		return measureSupplementalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Media createMedia() {
		MediaImpl media = new MediaImpl();
		return media;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Medication createMedication() {
		MedicationImpl medication = new MedicationImpl();
		return medication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationAdministration createMedicationAdministration() {
		MedicationAdministrationImpl medicationAdministration = new MedicationAdministrationImpl();
		return medicationAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationAdministrationDosage createMedicationAdministrationDosage() {
		MedicationAdministrationDosageImpl medicationAdministrationDosage = new MedicationAdministrationDosageImpl();
		return medicationAdministrationDosage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationAdministrationPerformer createMedicationAdministrationPerformer() {
		MedicationAdministrationPerformerImpl medicationAdministrationPerformer = new MedicationAdministrationPerformerImpl();
		return medicationAdministrationPerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationBatch createMedicationBatch() {
		MedicationBatchImpl medicationBatch = new MedicationBatchImpl();
		return medicationBatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationDispense createMedicationDispense() {
		MedicationDispenseImpl medicationDispense = new MedicationDispenseImpl();
		return medicationDispense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationDispensePerformer createMedicationDispensePerformer() {
		MedicationDispensePerformerImpl medicationDispensePerformer = new MedicationDispensePerformerImpl();
		return medicationDispensePerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationDispenseSubstitution createMedicationDispenseSubstitution() {
		MedicationDispenseSubstitutionImpl medicationDispenseSubstitution = new MedicationDispenseSubstitutionImpl();
		return medicationDispenseSubstitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationIngredient createMedicationIngredient() {
		MedicationIngredientImpl medicationIngredient = new MedicationIngredientImpl();
		return medicationIngredient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationKnowledge createMedicationKnowledge() {
		MedicationKnowledgeImpl medicationKnowledge = new MedicationKnowledgeImpl();
		return medicationKnowledge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationKnowledgeAdministrationGuidelines createMedicationKnowledgeAdministrationGuidelines() {
		MedicationKnowledgeAdministrationGuidelinesImpl medicationKnowledgeAdministrationGuidelines = new MedicationKnowledgeAdministrationGuidelinesImpl();
		return medicationKnowledgeAdministrationGuidelines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationKnowledgeCost createMedicationKnowledgeCost() {
		MedicationKnowledgeCostImpl medicationKnowledgeCost = new MedicationKnowledgeCostImpl();
		return medicationKnowledgeCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationKnowledgeDosage createMedicationKnowledgeDosage() {
		MedicationKnowledgeDosageImpl medicationKnowledgeDosage = new MedicationKnowledgeDosageImpl();
		return medicationKnowledgeDosage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationKnowledgeDrugCharacteristic createMedicationKnowledgeDrugCharacteristic() {
		MedicationKnowledgeDrugCharacteristicImpl medicationKnowledgeDrugCharacteristic = new MedicationKnowledgeDrugCharacteristicImpl();
		return medicationKnowledgeDrugCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationKnowledgeIngredient createMedicationKnowledgeIngredient() {
		MedicationKnowledgeIngredientImpl medicationKnowledgeIngredient = new MedicationKnowledgeIngredientImpl();
		return medicationKnowledgeIngredient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationKnowledgeKinetics createMedicationKnowledgeKinetics() {
		MedicationKnowledgeKineticsImpl medicationKnowledgeKinetics = new MedicationKnowledgeKineticsImpl();
		return medicationKnowledgeKinetics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationKnowledgeMaxDispense createMedicationKnowledgeMaxDispense() {
		MedicationKnowledgeMaxDispenseImpl medicationKnowledgeMaxDispense = new MedicationKnowledgeMaxDispenseImpl();
		return medicationKnowledgeMaxDispense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationKnowledgeMedicineClassification createMedicationKnowledgeMedicineClassification() {
		MedicationKnowledgeMedicineClassificationImpl medicationKnowledgeMedicineClassification = new MedicationKnowledgeMedicineClassificationImpl();
		return medicationKnowledgeMedicineClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationKnowledgeMonitoringProgram createMedicationKnowledgeMonitoringProgram() {
		MedicationKnowledgeMonitoringProgramImpl medicationKnowledgeMonitoringProgram = new MedicationKnowledgeMonitoringProgramImpl();
		return medicationKnowledgeMonitoringProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationKnowledgeMonograph createMedicationKnowledgeMonograph() {
		MedicationKnowledgeMonographImpl medicationKnowledgeMonograph = new MedicationKnowledgeMonographImpl();
		return medicationKnowledgeMonograph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationKnowledgePackaging createMedicationKnowledgePackaging() {
		MedicationKnowledgePackagingImpl medicationKnowledgePackaging = new MedicationKnowledgePackagingImpl();
		return medicationKnowledgePackaging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationKnowledgePatientCharacteristics createMedicationKnowledgePatientCharacteristics() {
		MedicationKnowledgePatientCharacteristicsImpl medicationKnowledgePatientCharacteristics = new MedicationKnowledgePatientCharacteristicsImpl();
		return medicationKnowledgePatientCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationKnowledgeRegulatory createMedicationKnowledgeRegulatory() {
		MedicationKnowledgeRegulatoryImpl medicationKnowledgeRegulatory = new MedicationKnowledgeRegulatoryImpl();
		return medicationKnowledgeRegulatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationKnowledgeRelatedMedicationKnowledge createMedicationKnowledgeRelatedMedicationKnowledge() {
		MedicationKnowledgeRelatedMedicationKnowledgeImpl medicationKnowledgeRelatedMedicationKnowledge = new MedicationKnowledgeRelatedMedicationKnowledgeImpl();
		return medicationKnowledgeRelatedMedicationKnowledge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationKnowledgeSchedule createMedicationKnowledgeSchedule() {
		MedicationKnowledgeScheduleImpl medicationKnowledgeSchedule = new MedicationKnowledgeScheduleImpl();
		return medicationKnowledgeSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationKnowledgeSubstitution createMedicationKnowledgeSubstitution() {
		MedicationKnowledgeSubstitutionImpl medicationKnowledgeSubstitution = new MedicationKnowledgeSubstitutionImpl();
		return medicationKnowledgeSubstitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationRequest createMedicationRequest() {
		MedicationRequestImpl medicationRequest = new MedicationRequestImpl();
		return medicationRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationRequestDispenseRequest createMedicationRequestDispenseRequest() {
		MedicationRequestDispenseRequestImpl medicationRequestDispenseRequest = new MedicationRequestDispenseRequestImpl();
		return medicationRequestDispenseRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationRequestInitialFill createMedicationRequestInitialFill() {
		MedicationRequestInitialFillImpl medicationRequestInitialFill = new MedicationRequestInitialFillImpl();
		return medicationRequestInitialFill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationRequestIntent createMedicationRequestIntent() {
		MedicationRequestIntentImpl medicationRequestIntent = new MedicationRequestIntentImpl();
		return medicationRequestIntent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationrequestStatus createMedicationrequestStatus() {
		MedicationrequestStatusImpl medicationrequestStatus = new MedicationrequestStatusImpl();
		return medicationrequestStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationRequestSubstitution createMedicationRequestSubstitution() {
		MedicationRequestSubstitutionImpl medicationRequestSubstitution = new MedicationRequestSubstitutionImpl();
		return medicationRequestSubstitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationStatement createMedicationStatement() {
		MedicationStatementImpl medicationStatement = new MedicationStatementImpl();
		return medicationStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationStatusCodes createMedicationStatusCodes() {
		MedicationStatusCodesImpl medicationStatusCodes = new MedicationStatusCodesImpl();
		return medicationStatusCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProduct createMedicinalProduct() {
		MedicinalProductImpl medicinalProduct = new MedicinalProductImpl();
		return medicinalProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductAuthorization createMedicinalProductAuthorization() {
		MedicinalProductAuthorizationImpl medicinalProductAuthorization = new MedicinalProductAuthorizationImpl();
		return medicinalProductAuthorization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductAuthorizationJurisdictionalAuthorization createMedicinalProductAuthorizationJurisdictionalAuthorization() {
		MedicinalProductAuthorizationJurisdictionalAuthorizationImpl medicinalProductAuthorizationJurisdictionalAuthorization = new MedicinalProductAuthorizationJurisdictionalAuthorizationImpl();
		return medicinalProductAuthorizationJurisdictionalAuthorization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductAuthorizationProcedure createMedicinalProductAuthorizationProcedure() {
		MedicinalProductAuthorizationProcedureImpl medicinalProductAuthorizationProcedure = new MedicinalProductAuthorizationProcedureImpl();
		return medicinalProductAuthorizationProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductContraindication createMedicinalProductContraindication() {
		MedicinalProductContraindicationImpl medicinalProductContraindication = new MedicinalProductContraindicationImpl();
		return medicinalProductContraindication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductContraindicationOtherTherapy createMedicinalProductContraindicationOtherTherapy() {
		MedicinalProductContraindicationOtherTherapyImpl medicinalProductContraindicationOtherTherapy = new MedicinalProductContraindicationOtherTherapyImpl();
		return medicinalProductContraindicationOtherTherapy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductCountryLanguage createMedicinalProductCountryLanguage() {
		MedicinalProductCountryLanguageImpl medicinalProductCountryLanguage = new MedicinalProductCountryLanguageImpl();
		return medicinalProductCountryLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductIndication createMedicinalProductIndication() {
		MedicinalProductIndicationImpl medicinalProductIndication = new MedicinalProductIndicationImpl();
		return medicinalProductIndication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductIndicationOtherTherapy createMedicinalProductIndicationOtherTherapy() {
		MedicinalProductIndicationOtherTherapyImpl medicinalProductIndicationOtherTherapy = new MedicinalProductIndicationOtherTherapyImpl();
		return medicinalProductIndicationOtherTherapy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductIngredient createMedicinalProductIngredient() {
		MedicinalProductIngredientImpl medicinalProductIngredient = new MedicinalProductIngredientImpl();
		return medicinalProductIngredient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductIngredientReferenceStrength createMedicinalProductIngredientReferenceStrength() {
		MedicinalProductIngredientReferenceStrengthImpl medicinalProductIngredientReferenceStrength = new MedicinalProductIngredientReferenceStrengthImpl();
		return medicinalProductIngredientReferenceStrength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductIngredientSpecifiedSubstance createMedicinalProductIngredientSpecifiedSubstance() {
		MedicinalProductIngredientSpecifiedSubstanceImpl medicinalProductIngredientSpecifiedSubstance = new MedicinalProductIngredientSpecifiedSubstanceImpl();
		return medicinalProductIngredientSpecifiedSubstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductIngredientStrength createMedicinalProductIngredientStrength() {
		MedicinalProductIngredientStrengthImpl medicinalProductIngredientStrength = new MedicinalProductIngredientStrengthImpl();
		return medicinalProductIngredientStrength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductIngredientSubstance createMedicinalProductIngredientSubstance() {
		MedicinalProductIngredientSubstanceImpl medicinalProductIngredientSubstance = new MedicinalProductIngredientSubstanceImpl();
		return medicinalProductIngredientSubstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductInteraction createMedicinalProductInteraction() {
		MedicinalProductInteractionImpl medicinalProductInteraction = new MedicinalProductInteractionImpl();
		return medicinalProductInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductInteractionInteractant createMedicinalProductInteractionInteractant() {
		MedicinalProductInteractionInteractantImpl medicinalProductInteractionInteractant = new MedicinalProductInteractionInteractantImpl();
		return medicinalProductInteractionInteractant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductManufactured createMedicinalProductManufactured() {
		MedicinalProductManufacturedImpl medicinalProductManufactured = new MedicinalProductManufacturedImpl();
		return medicinalProductManufactured;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductManufacturingBusinessOperation createMedicinalProductManufacturingBusinessOperation() {
		MedicinalProductManufacturingBusinessOperationImpl medicinalProductManufacturingBusinessOperation = new MedicinalProductManufacturingBusinessOperationImpl();
		return medicinalProductManufacturingBusinessOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductName createMedicinalProductName() {
		MedicinalProductNameImpl medicinalProductName = new MedicinalProductNameImpl();
		return medicinalProductName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductNamePart createMedicinalProductNamePart() {
		MedicinalProductNamePartImpl medicinalProductNamePart = new MedicinalProductNamePartImpl();
		return medicinalProductNamePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductPackaged createMedicinalProductPackaged() {
		MedicinalProductPackagedImpl medicinalProductPackaged = new MedicinalProductPackagedImpl();
		return medicinalProductPackaged;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductPackagedBatchIdentifier createMedicinalProductPackagedBatchIdentifier() {
		MedicinalProductPackagedBatchIdentifierImpl medicinalProductPackagedBatchIdentifier = new MedicinalProductPackagedBatchIdentifierImpl();
		return medicinalProductPackagedBatchIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductPackagedPackageItem createMedicinalProductPackagedPackageItem() {
		MedicinalProductPackagedPackageItemImpl medicinalProductPackagedPackageItem = new MedicinalProductPackagedPackageItemImpl();
		return medicinalProductPackagedPackageItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductPharmaceutical createMedicinalProductPharmaceutical() {
		MedicinalProductPharmaceuticalImpl medicinalProductPharmaceutical = new MedicinalProductPharmaceuticalImpl();
		return medicinalProductPharmaceutical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductPharmaceuticalCharacteristics createMedicinalProductPharmaceuticalCharacteristics() {
		MedicinalProductPharmaceuticalCharacteristicsImpl medicinalProductPharmaceuticalCharacteristics = new MedicinalProductPharmaceuticalCharacteristicsImpl();
		return medicinalProductPharmaceuticalCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductPharmaceuticalRouteOfAdministration createMedicinalProductPharmaceuticalRouteOfAdministration() {
		MedicinalProductPharmaceuticalRouteOfAdministrationImpl medicinalProductPharmaceuticalRouteOfAdministration = new MedicinalProductPharmaceuticalRouteOfAdministrationImpl();
		return medicinalProductPharmaceuticalRouteOfAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductPharmaceuticalTargetSpecies createMedicinalProductPharmaceuticalTargetSpecies() {
		MedicinalProductPharmaceuticalTargetSpeciesImpl medicinalProductPharmaceuticalTargetSpecies = new MedicinalProductPharmaceuticalTargetSpeciesImpl();
		return medicinalProductPharmaceuticalTargetSpecies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductPharmaceuticalWithdrawalPeriod createMedicinalProductPharmaceuticalWithdrawalPeriod() {
		MedicinalProductPharmaceuticalWithdrawalPeriodImpl medicinalProductPharmaceuticalWithdrawalPeriod = new MedicinalProductPharmaceuticalWithdrawalPeriodImpl();
		return medicinalProductPharmaceuticalWithdrawalPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductSpecialDesignation createMedicinalProductSpecialDesignation() {
		MedicinalProductSpecialDesignationImpl medicinalProductSpecialDesignation = new MedicinalProductSpecialDesignationImpl();
		return medicinalProductSpecialDesignation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductUndesirableEffect createMedicinalProductUndesirableEffect() {
		MedicinalProductUndesirableEffectImpl medicinalProductUndesirableEffect = new MedicinalProductUndesirableEffectImpl();
		return medicinalProductUndesirableEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageDefinition createMessageDefinition() {
		MessageDefinitionImpl messageDefinition = new MessageDefinitionImpl();
		return messageDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageDefinitionAllowedResponse createMessageDefinitionAllowedResponse() {
		MessageDefinitionAllowedResponseImpl messageDefinitionAllowedResponse = new MessageDefinitionAllowedResponseImpl();
		return messageDefinitionAllowedResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageDefinitionFocus createMessageDefinitionFocus() {
		MessageDefinitionFocusImpl messageDefinitionFocus = new MessageDefinitionFocusImpl();
		return messageDefinitionFocus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageHeader createMessageHeader() {
		MessageHeaderImpl messageHeader = new MessageHeaderImpl();
		return messageHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageHeaderDestination createMessageHeaderDestination() {
		MessageHeaderDestinationImpl messageHeaderDestination = new MessageHeaderDestinationImpl();
		return messageHeaderDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageHeaderResponse createMessageHeaderResponse() {
		MessageHeaderResponseImpl messageHeaderResponse = new MessageHeaderResponseImpl();
		return messageHeaderResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageheaderResponseRequest createMessageheaderResponseRequest() {
		MessageheaderResponseRequestImpl messageheaderResponseRequest = new MessageheaderResponseRequestImpl();
		return messageheaderResponseRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageHeaderSource createMessageHeaderSource() {
		MessageHeaderSourceImpl messageHeaderSource = new MessageHeaderSourceImpl();
		return messageHeaderSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageSignificanceCategory createMessageSignificanceCategory() {
		MessageSignificanceCategoryImpl messageSignificanceCategory = new MessageSignificanceCategoryImpl();
		return messageSignificanceCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Meta createMeta() {
		MetaImpl meta = new MetaImpl();
		return meta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MolecularSequence createMolecularSequence() {
		MolecularSequenceImpl molecularSequence = new MolecularSequenceImpl();
		return molecularSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MolecularSequenceInner createMolecularSequenceInner() {
		MolecularSequenceInnerImpl molecularSequenceInner = new MolecularSequenceInnerImpl();
		return molecularSequenceInner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MolecularSequenceOuter createMolecularSequenceOuter() {
		MolecularSequenceOuterImpl molecularSequenceOuter = new MolecularSequenceOuterImpl();
		return molecularSequenceOuter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MolecularSequenceQuality createMolecularSequenceQuality() {
		MolecularSequenceQualityImpl molecularSequenceQuality = new MolecularSequenceQualityImpl();
		return molecularSequenceQuality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MolecularSequenceReferenceSeq createMolecularSequenceReferenceSeq() {
		MolecularSequenceReferenceSeqImpl molecularSequenceReferenceSeq = new MolecularSequenceReferenceSeqImpl();
		return molecularSequenceReferenceSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MolecularSequenceRepository createMolecularSequenceRepository() {
		MolecularSequenceRepositoryImpl molecularSequenceRepository = new MolecularSequenceRepositoryImpl();
		return molecularSequenceRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MolecularSequenceRoc createMolecularSequenceRoc() {
		MolecularSequenceRocImpl molecularSequenceRoc = new MolecularSequenceRocImpl();
		return molecularSequenceRoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MolecularSequenceStructureVariant createMolecularSequenceStructureVariant() {
		MolecularSequenceStructureVariantImpl molecularSequenceStructureVariant = new MolecularSequenceStructureVariantImpl();
		return molecularSequenceStructureVariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MolecularSequenceVariant createMolecularSequenceVariant() {
		MolecularSequenceVariantImpl molecularSequenceVariant = new MolecularSequenceVariantImpl();
		return molecularSequenceVariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Money createMoney() {
		MoneyImpl money = new MoneyImpl();
		return money;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameUse createNameUse() {
		NameUseImpl nameUse = new NameUseImpl();
		return nameUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamingSystem createNamingSystem() {
		NamingSystemImpl namingSystem = new NamingSystemImpl();
		return namingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamingSystemIdentifierType createNamingSystemIdentifierType() {
		NamingSystemIdentifierTypeImpl namingSystemIdentifierType = new NamingSystemIdentifierTypeImpl();
		return namingSystemIdentifierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamingSystemType createNamingSystemType() {
		NamingSystemTypeImpl namingSystemType = new NamingSystemTypeImpl();
		return namingSystemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamingSystemUniqueId createNamingSystemUniqueId() {
		NamingSystemUniqueIdImpl namingSystemUniqueId = new NamingSystemUniqueIdImpl();
		return namingSystemUniqueId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Narrative createNarrative() {
		NarrativeImpl narrative = new NarrativeImpl();
		return narrative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NarrativeStatus createNarrativeStatus() {
		NarrativeStatusImpl narrativeStatus = new NarrativeStatusImpl();
		return narrativeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NoteType createNoteType() {
		NoteTypeImpl noteType = new NoteTypeImpl();
		return noteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NutritionOrder createNutritionOrder() {
		NutritionOrderImpl nutritionOrder = new NutritionOrderImpl();
		return nutritionOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NutritionOrderAdministration createNutritionOrderAdministration() {
		NutritionOrderAdministrationImpl nutritionOrderAdministration = new NutritionOrderAdministrationImpl();
		return nutritionOrderAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NutritionOrderEnteralFormula createNutritionOrderEnteralFormula() {
		NutritionOrderEnteralFormulaImpl nutritionOrderEnteralFormula = new NutritionOrderEnteralFormulaImpl();
		return nutritionOrderEnteralFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NutritionOrderNutrient createNutritionOrderNutrient() {
		NutritionOrderNutrientImpl nutritionOrderNutrient = new NutritionOrderNutrientImpl();
		return nutritionOrderNutrient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NutritionOrderOralDiet createNutritionOrderOralDiet() {
		NutritionOrderOralDietImpl nutritionOrderOralDiet = new NutritionOrderOralDietImpl();
		return nutritionOrderOralDiet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NutritionOrderSupplement createNutritionOrderSupplement() {
		NutritionOrderSupplementImpl nutritionOrderSupplement = new NutritionOrderSupplementImpl();
		return nutritionOrderSupplement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NutritionOrderTexture createNutritionOrderTexture() {
		NutritionOrderTextureImpl nutritionOrderTexture = new NutritionOrderTextureImpl();
		return nutritionOrderTexture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Observation createObservation() {
		ObservationImpl observation = new ObservationImpl();
		return observation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObservationComponent createObservationComponent() {
		ObservationComponentImpl observationComponent = new ObservationComponentImpl();
		return observationComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObservationDataType createObservationDataType() {
		ObservationDataTypeImpl observationDataType = new ObservationDataTypeImpl();
		return observationDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObservationDefinition createObservationDefinition() {
		ObservationDefinitionImpl observationDefinition = new ObservationDefinitionImpl();
		return observationDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObservationDefinitionQualifiedInterval createObservationDefinitionQualifiedInterval() {
		ObservationDefinitionQualifiedIntervalImpl observationDefinitionQualifiedInterval = new ObservationDefinitionQualifiedIntervalImpl();
		return observationDefinitionQualifiedInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObservationDefinitionQuantitativeDetails createObservationDefinitionQuantitativeDetails() {
		ObservationDefinitionQuantitativeDetailsImpl observationDefinitionQuantitativeDetails = new ObservationDefinitionQuantitativeDetailsImpl();
		return observationDefinitionQuantitativeDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObservationRangeCategory createObservationRangeCategory() {
		ObservationRangeCategoryImpl observationRangeCategory = new ObservationRangeCategoryImpl();
		return observationRangeCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObservationReferenceRange createObservationReferenceRange() {
		ObservationReferenceRangeImpl observationReferenceRange = new ObservationReferenceRangeImpl();
		return observationReferenceRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObservationStatus createObservationStatus() {
		ObservationStatusImpl observationStatus = new ObservationStatusImpl();
		return observationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Oid createOid() {
		OidImpl oid = new OidImpl();
		return oid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationDefinition createOperationDefinition() {
		OperationDefinitionImpl operationDefinition = new OperationDefinitionImpl();
		return operationDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationDefinitionBinding createOperationDefinitionBinding() {
		OperationDefinitionBindingImpl operationDefinitionBinding = new OperationDefinitionBindingImpl();
		return operationDefinitionBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationDefinitionOverload createOperationDefinitionOverload() {
		OperationDefinitionOverloadImpl operationDefinitionOverload = new OperationDefinitionOverloadImpl();
		return operationDefinitionOverload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationDefinitionParameter createOperationDefinitionParameter() {
		OperationDefinitionParameterImpl operationDefinitionParameter = new OperationDefinitionParameterImpl();
		return operationDefinitionParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationDefinitionReferencedFrom createOperationDefinitionReferencedFrom() {
		OperationDefinitionReferencedFromImpl operationDefinitionReferencedFrom = new OperationDefinitionReferencedFromImpl();
		return operationDefinitionReferencedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationKind createOperationKind() {
		OperationKindImpl operationKind = new OperationKindImpl();
		return operationKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationOutcome createOperationOutcome() {
		OperationOutcomeImpl operationOutcome = new OperationOutcomeImpl();
		return operationOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationOutcomeIssue createOperationOutcomeIssue() {
		OperationOutcomeIssueImpl operationOutcomeIssue = new OperationOutcomeIssueImpl();
		return operationOutcomeIssue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationParameterUse createOperationParameterUse() {
		OperationParameterUseImpl operationParameterUse = new OperationParameterUseImpl();
		return operationParameterUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Organization createOrganization() {
		OrganizationImpl organization = new OrganizationImpl();
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrganizationAffiliation createOrganizationAffiliation() {
		OrganizationAffiliationImpl organizationAffiliation = new OrganizationAffiliationImpl();
		return organizationAffiliation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrganizationContact createOrganizationContact() {
		OrganizationContactImpl organizationContact = new OrganizationContactImpl();
		return organizationContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrientationType createOrientationType() {
		OrientationTypeImpl orientationType = new OrientationTypeImpl();
		return orientationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterDefinition createParameterDefinition() {
		ParameterDefinitionImpl parameterDefinition = new ParameterDefinitionImpl();
		return parameterDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameters createParameters() {
		ParametersImpl parameters = new ParametersImpl();
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParametersParameter createParametersParameter() {
		ParametersParameterImpl parametersParameter = new ParametersParameterImpl();
		return parametersParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParticipantRequired createParticipantRequired() {
		ParticipantRequiredImpl participantRequired = new ParticipantRequiredImpl();
		return participantRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParticipationStatus createParticipationStatus() {
		ParticipationStatusImpl participationStatus = new ParticipationStatusImpl();
		return participationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Patient createPatient() {
		PatientImpl patient = new PatientImpl();
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PatientCommunication createPatientCommunication() {
		PatientCommunicationImpl patientCommunication = new PatientCommunicationImpl();
		return patientCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PatientContact createPatientContact() {
		PatientContactImpl patientContact = new PatientContactImpl();
		return patientContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PatientLink createPatientLink() {
		PatientLinkImpl patientLink = new PatientLinkImpl();
		return patientLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentNotice createPaymentNotice() {
		PaymentNoticeImpl paymentNotice = new PaymentNoticeImpl();
		return paymentNotice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentReconciliation createPaymentReconciliation() {
		PaymentReconciliationImpl paymentReconciliation = new PaymentReconciliationImpl();
		return paymentReconciliation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentReconciliationDetail createPaymentReconciliationDetail() {
		PaymentReconciliationDetailImpl paymentReconciliationDetail = new PaymentReconciliationDetailImpl();
		return paymentReconciliationDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentReconciliationProcessNote createPaymentReconciliationProcessNote() {
		PaymentReconciliationProcessNoteImpl paymentReconciliationProcessNote = new PaymentReconciliationProcessNoteImpl();
		return paymentReconciliationProcessNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period createPeriod() {
		PeriodImpl period = new PeriodImpl();
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersonLink createPersonLink() {
		PersonLinkImpl personLink = new PersonLinkImpl();
		return personLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanDefinition createPlanDefinition() {
		PlanDefinitionImpl planDefinition = new PlanDefinitionImpl();
		return planDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanDefinitionAction createPlanDefinitionAction() {
		PlanDefinitionActionImpl planDefinitionAction = new PlanDefinitionActionImpl();
		return planDefinitionAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanDefinitionCondition createPlanDefinitionCondition() {
		PlanDefinitionConditionImpl planDefinitionCondition = new PlanDefinitionConditionImpl();
		return planDefinitionCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanDefinitionDynamicValue createPlanDefinitionDynamicValue() {
		PlanDefinitionDynamicValueImpl planDefinitionDynamicValue = new PlanDefinitionDynamicValueImpl();
		return planDefinitionDynamicValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanDefinitionGoal createPlanDefinitionGoal() {
		PlanDefinitionGoalImpl planDefinitionGoal = new PlanDefinitionGoalImpl();
		return planDefinitionGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanDefinitionParticipant createPlanDefinitionParticipant() {
		PlanDefinitionParticipantImpl planDefinitionParticipant = new PlanDefinitionParticipantImpl();
		return planDefinitionParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanDefinitionRelatedAction createPlanDefinitionRelatedAction() {
		PlanDefinitionRelatedActionImpl planDefinitionRelatedAction = new PlanDefinitionRelatedActionImpl();
		return planDefinitionRelatedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanDefinitionTarget createPlanDefinitionTarget() {
		PlanDefinitionTargetImpl planDefinitionTarget = new PlanDefinitionTargetImpl();
		return planDefinitionTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Population createPopulation() {
		PopulationImpl population = new PopulationImpl();
		return population;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt createPositiveInt() {
		PositiveIntImpl positiveInt = new PositiveIntImpl();
		return positiveInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Practitioner createPractitioner() {
		PractitionerImpl practitioner = new PractitionerImpl();
		return practitioner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PractitionerQualification createPractitionerQualification() {
		PractitionerQualificationImpl practitionerQualification = new PractitionerQualificationImpl();
		return practitionerQualification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PractitionerRole createPractitionerRole() {
		PractitionerRoleImpl practitionerRole = new PractitionerRoleImpl();
		return practitionerRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PractitionerRoleAvailableTime createPractitionerRoleAvailableTime() {
		PractitionerRoleAvailableTimeImpl practitionerRoleAvailableTime = new PractitionerRoleAvailableTimeImpl();
		return practitionerRoleAvailableTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PractitionerRoleNotAvailable createPractitionerRoleNotAvailable() {
		PractitionerRoleNotAvailableImpl practitionerRoleNotAvailable = new PractitionerRoleNotAvailableImpl();
		return practitionerRoleNotAvailable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Procedure createProcedure() {
		ProcedureImpl procedure = new ProcedureImpl();
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureFocalDevice createProcedureFocalDevice() {
		ProcedureFocalDeviceImpl procedureFocalDevice = new ProcedureFocalDeviceImpl();
		return procedureFocalDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedurePerformer createProcedurePerformer() {
		ProcedurePerformerImpl procedurePerformer = new ProcedurePerformerImpl();
		return procedurePerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProdCharacteristic createProdCharacteristic() {
		ProdCharacteristicImpl prodCharacteristic = new ProdCharacteristicImpl();
		return prodCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductShelfLife createProductShelfLife() {
		ProductShelfLifeImpl productShelfLife = new ProductShelfLifeImpl();
		return productShelfLife;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyRepresentation createPropertyRepresentation() {
		PropertyRepresentationImpl propertyRepresentation = new PropertyRepresentationImpl();
		return propertyRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyType createPropertyType() {
		PropertyTypeImpl propertyType = new PropertyTypeImpl();
		return propertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Provenance createProvenance() {
		ProvenanceImpl provenance = new ProvenanceImpl();
		return provenance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProvenanceAgent createProvenanceAgent() {
		ProvenanceAgentImpl provenanceAgent = new ProvenanceAgentImpl();
		return provenanceAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProvenanceEntity createProvenanceEntity() {
		ProvenanceEntityImpl provenanceEntity = new ProvenanceEntityImpl();
		return provenanceEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProvenanceEntityRole createProvenanceEntityRole() {
		ProvenanceEntityRoleImpl provenanceEntityRole = new ProvenanceEntityRoleImpl();
		return provenanceEntityRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicationStatus createPublicationStatus() {
		PublicationStatusImpl publicationStatus = new PublicationStatusImpl();
		return publicationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QualityType createQualityType() {
		QualityTypeImpl qualityType = new QualityTypeImpl();
		return qualityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity createQuantity() {
		QuantityImpl quantity = new QuantityImpl();
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuantityComparator createQuantityComparator() {
		QuantityComparatorImpl quantityComparator = new QuantityComparatorImpl();
		return quantityComparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Questionnaire createQuestionnaire() {
		QuestionnaireImpl questionnaire = new QuestionnaireImpl();
		return questionnaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuestionnaireAnswerOption createQuestionnaireAnswerOption() {
		QuestionnaireAnswerOptionImpl questionnaireAnswerOption = new QuestionnaireAnswerOptionImpl();
		return questionnaireAnswerOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuestionnaireEnableWhen createQuestionnaireEnableWhen() {
		QuestionnaireEnableWhenImpl questionnaireEnableWhen = new QuestionnaireEnableWhenImpl();
		return questionnaireEnableWhen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuestionnaireInitial createQuestionnaireInitial() {
		QuestionnaireInitialImpl questionnaireInitial = new QuestionnaireInitialImpl();
		return questionnaireInitial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuestionnaireItem createQuestionnaireItem() {
		QuestionnaireItemImpl questionnaireItem = new QuestionnaireItemImpl();
		return questionnaireItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuestionnaireItemOperator createQuestionnaireItemOperator() {
		QuestionnaireItemOperatorImpl questionnaireItemOperator = new QuestionnaireItemOperatorImpl();
		return questionnaireItemOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuestionnaireItemType createQuestionnaireItemType() {
		QuestionnaireItemTypeImpl questionnaireItemType = new QuestionnaireItemTypeImpl();
		return questionnaireItemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuestionnaireResponse createQuestionnaireResponse() {
		QuestionnaireResponseImpl questionnaireResponse = new QuestionnaireResponseImpl();
		return questionnaireResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuestionnaireResponseAnswer createQuestionnaireResponseAnswer() {
		QuestionnaireResponseAnswerImpl questionnaireResponseAnswer = new QuestionnaireResponseAnswerImpl();
		return questionnaireResponseAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuestionnaireResponseItem createQuestionnaireResponseItem() {
		QuestionnaireResponseItemImpl questionnaireResponseItem = new QuestionnaireResponseItemImpl();
		return questionnaireResponseItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuestionnaireResponseStatus createQuestionnaireResponseStatus() {
		QuestionnaireResponseStatusImpl questionnaireResponseStatus = new QuestionnaireResponseStatusImpl();
		return questionnaireResponseStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Range createRange() {
		RangeImpl range = new RangeImpl();
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ratio createRatio() {
		RatioImpl ratio = new RatioImpl();
		return ratio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceHandlingPolicy createReferenceHandlingPolicy() {
		ReferenceHandlingPolicyImpl referenceHandlingPolicy = new ReferenceHandlingPolicyImpl();
		return referenceHandlingPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceVersionRules createReferenceVersionRules() {
		ReferenceVersionRulesImpl referenceVersionRules = new ReferenceVersionRulesImpl();
		return referenceVersionRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelatedArtifact createRelatedArtifact() {
		RelatedArtifactImpl relatedArtifact = new RelatedArtifactImpl();
		return relatedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelatedArtifactType createRelatedArtifactType() {
		RelatedArtifactTypeImpl relatedArtifactType = new RelatedArtifactTypeImpl();
		return relatedArtifactType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelatedPerson createRelatedPerson() {
		RelatedPersonImpl relatedPerson = new RelatedPersonImpl();
		return relatedPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelatedPersonCommunication createRelatedPersonCommunication() {
		RelatedPersonCommunicationImpl relatedPersonCommunication = new RelatedPersonCommunicationImpl();
		return relatedPersonCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemittanceOutcome createRemittanceOutcome() {
		RemittanceOutcomeImpl remittanceOutcome = new RemittanceOutcomeImpl();
		return remittanceOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RepositoryType createRepositoryType() {
		RepositoryTypeImpl repositoryType = new RepositoryTypeImpl();
		return repositoryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestGroup createRequestGroup() {
		RequestGroupImpl requestGroup = new RequestGroupImpl();
		return requestGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestGroupAction createRequestGroupAction() {
		RequestGroupActionImpl requestGroupAction = new RequestGroupActionImpl();
		return requestGroupAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestGroupCondition createRequestGroupCondition() {
		RequestGroupConditionImpl requestGroupCondition = new RequestGroupConditionImpl();
		return requestGroupCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestGroupRelatedAction createRequestGroupRelatedAction() {
		RequestGroupRelatedActionImpl requestGroupRelatedAction = new RequestGroupRelatedActionImpl();
		return requestGroupRelatedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestIntent createRequestIntent() {
		RequestIntentImpl requestIntent = new RequestIntentImpl();
		return requestIntent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestPriority createRequestPriority() {
		RequestPriorityImpl requestPriority = new RequestPriorityImpl();
		return requestPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestResourceType createRequestResourceType() {
		RequestResourceTypeImpl requestResourceType = new RequestResourceTypeImpl();
		return requestResourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestStatus createRequestStatus() {
		RequestStatusImpl requestStatus = new RequestStatusImpl();
		return requestStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResearchDefinition createResearchDefinition() {
		ResearchDefinitionImpl researchDefinition = new ResearchDefinitionImpl();
		return researchDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResearchElementDefinition createResearchElementDefinition() {
		ResearchElementDefinitionImpl researchElementDefinition = new ResearchElementDefinitionImpl();
		return researchElementDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResearchElementDefinitionCharacteristic createResearchElementDefinitionCharacteristic() {
		ResearchElementDefinitionCharacteristicImpl researchElementDefinitionCharacteristic = new ResearchElementDefinitionCharacteristicImpl();
		return researchElementDefinitionCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResearchElementType createResearchElementType() {
		ResearchElementTypeImpl researchElementType = new ResearchElementTypeImpl();
		return researchElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResearchStudy createResearchStudy() {
		ResearchStudyImpl researchStudy = new ResearchStudyImpl();
		return researchStudy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResearchStudyArm createResearchStudyArm() {
		ResearchStudyArmImpl researchStudyArm = new ResearchStudyArmImpl();
		return researchStudyArm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResearchStudyObjective createResearchStudyObjective() {
		ResearchStudyObjectiveImpl researchStudyObjective = new ResearchStudyObjectiveImpl();
		return researchStudyObjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResearchStudyStatus createResearchStudyStatus() {
		ResearchStudyStatusImpl researchStudyStatus = new ResearchStudyStatusImpl();
		return researchStudyStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResearchSubject createResearchSubject() {
		ResearchSubjectImpl researchSubject = new ResearchSubjectImpl();
		return researchSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResearchSubjectStatus createResearchSubjectStatus() {
		ResearchSubjectStatusImpl researchSubjectStatus = new ResearchSubjectStatusImpl();
		return researchSubjectStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceContainer createResourceContainer() {
		ResourceContainerImpl resourceContainer = new ResourceContainerImpl();
		return resourceContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceType createResourceType() {
		ResourceTypeImpl resourceType = new ResourceTypeImpl();
		return resourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceVersionPolicy createResourceVersionPolicy() {
		ResourceVersionPolicyImpl resourceVersionPolicy = new ResourceVersionPolicyImpl();
		return resourceVersionPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponseType createResponseType() {
		ResponseTypeImpl responseType = new ResponseTypeImpl();
		return responseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RestfulCapabilityMode createRestfulCapabilityMode() {
		RestfulCapabilityModeImpl restfulCapabilityMode = new RestfulCapabilityModeImpl();
		return restfulCapabilityMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskAssessment createRiskAssessment() {
		RiskAssessmentImpl riskAssessment = new RiskAssessmentImpl();
		return riskAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskAssessmentPrediction createRiskAssessmentPrediction() {
		RiskAssessmentPredictionImpl riskAssessmentPrediction = new RiskAssessmentPredictionImpl();
		return riskAssessmentPrediction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskEvidenceSynthesis createRiskEvidenceSynthesis() {
		RiskEvidenceSynthesisImpl riskEvidenceSynthesis = new RiskEvidenceSynthesisImpl();
		return riskEvidenceSynthesis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskEvidenceSynthesisCertainty createRiskEvidenceSynthesisCertainty() {
		RiskEvidenceSynthesisCertaintyImpl riskEvidenceSynthesisCertainty = new RiskEvidenceSynthesisCertaintyImpl();
		return riskEvidenceSynthesisCertainty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskEvidenceSynthesisCertaintySubcomponent createRiskEvidenceSynthesisCertaintySubcomponent() {
		RiskEvidenceSynthesisCertaintySubcomponentImpl riskEvidenceSynthesisCertaintySubcomponent = new RiskEvidenceSynthesisCertaintySubcomponentImpl();
		return riskEvidenceSynthesisCertaintySubcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskEvidenceSynthesisPrecisionEstimate createRiskEvidenceSynthesisPrecisionEstimate() {
		RiskEvidenceSynthesisPrecisionEstimateImpl riskEvidenceSynthesisPrecisionEstimate = new RiskEvidenceSynthesisPrecisionEstimateImpl();
		return riskEvidenceSynthesisPrecisionEstimate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskEvidenceSynthesisRiskEstimate createRiskEvidenceSynthesisRiskEstimate() {
		RiskEvidenceSynthesisRiskEstimateImpl riskEvidenceSynthesisRiskEstimate = new RiskEvidenceSynthesisRiskEstimateImpl();
		return riskEvidenceSynthesisRiskEstimate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskEvidenceSynthesisSampleSize createRiskEvidenceSynthesisSampleSize() {
		RiskEvidenceSynthesisSampleSizeImpl riskEvidenceSynthesisSampleSize = new RiskEvidenceSynthesisSampleSizeImpl();
		return riskEvidenceSynthesisSampleSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SampledData createSampledData() {
		SampledDataImpl sampledData = new SampledDataImpl();
		return sampledData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SampledDataDataType createSampledDataDataType() {
		SampledDataDataTypeImpl sampledDataDataType = new SampledDataDataTypeImpl();
		return sampledDataDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schedule createSchedule() {
		ScheduleImpl schedule = new ScheduleImpl();
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SearchComparator createSearchComparator() {
		SearchComparatorImpl searchComparator = new SearchComparatorImpl();
		return searchComparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SearchEntryMode createSearchEntryMode() {
		SearchEntryModeImpl searchEntryMode = new SearchEntryModeImpl();
		return searchEntryMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SearchModifierCode createSearchModifierCode() {
		SearchModifierCodeImpl searchModifierCode = new SearchModifierCodeImpl();
		return searchModifierCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SearchParameter createSearchParameter() {
		SearchParameterImpl searchParameter = new SearchParameterImpl();
		return searchParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SearchParameterComponent createSearchParameterComponent() {
		SearchParameterComponentImpl searchParameterComponent = new SearchParameterComponentImpl();
		return searchParameterComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SearchParamType createSearchParamType() {
		SearchParamTypeImpl searchParamType = new SearchParamTypeImpl();
		return searchParamType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SequenceType createSequenceType() {
		SequenceTypeImpl sequenceType = new SequenceTypeImpl();
		return sequenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceRequest createServiceRequest() {
		ServiceRequestImpl serviceRequest = new ServiceRequestImpl();
		return serviceRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signature createSignature() {
		SignatureImpl signature = new SignatureImpl();
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SlicingRules createSlicingRules() {
		SlicingRulesImpl slicingRules = new SlicingRulesImpl();
		return slicingRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Slot createSlot() {
		SlotImpl slot = new SlotImpl();
		return slot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SlotStatus createSlotStatus() {
		SlotStatusImpl slotStatus = new SlotStatusImpl();
		return slotStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SortDirection createSortDirection() {
		SortDirectionImpl sortDirection = new SortDirectionImpl();
		return sortDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SPDXLicense createSPDXLicense() {
		SPDXLicenseImpl spdxLicense = new SPDXLicenseImpl();
		return spdxLicense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Specimen createSpecimen() {
		SpecimenImpl specimen = new SpecimenImpl();
		return specimen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecimenCollection createSpecimenCollection() {
		SpecimenCollectionImpl specimenCollection = new SpecimenCollectionImpl();
		return specimenCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecimenContainedPreference createSpecimenContainedPreference() {
		SpecimenContainedPreferenceImpl specimenContainedPreference = new SpecimenContainedPreferenceImpl();
		return specimenContainedPreference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecimenContainer createSpecimenContainer() {
		SpecimenContainerImpl specimenContainer = new SpecimenContainerImpl();
		return specimenContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecimenDefinition createSpecimenDefinition() {
		SpecimenDefinitionImpl specimenDefinition = new SpecimenDefinitionImpl();
		return specimenDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecimenDefinitionAdditive createSpecimenDefinitionAdditive() {
		SpecimenDefinitionAdditiveImpl specimenDefinitionAdditive = new SpecimenDefinitionAdditiveImpl();
		return specimenDefinitionAdditive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecimenDefinitionContainer createSpecimenDefinitionContainer() {
		SpecimenDefinitionContainerImpl specimenDefinitionContainer = new SpecimenDefinitionContainerImpl();
		return specimenDefinitionContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecimenDefinitionHandling createSpecimenDefinitionHandling() {
		SpecimenDefinitionHandlingImpl specimenDefinitionHandling = new SpecimenDefinitionHandlingImpl();
		return specimenDefinitionHandling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecimenDefinitionTypeTested createSpecimenDefinitionTypeTested() {
		SpecimenDefinitionTypeTestedImpl specimenDefinitionTypeTested = new SpecimenDefinitionTypeTestedImpl();
		return specimenDefinitionTypeTested;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecimenProcessing createSpecimenProcessing() {
		SpecimenProcessingImpl specimenProcessing = new SpecimenProcessingImpl();
		return specimenProcessing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecimenStatus createSpecimenStatus() {
		SpecimenStatusImpl specimenStatus = new SpecimenStatusImpl();
		return specimenStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Status createStatus() {
		StatusImpl status = new StatusImpl();
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrandType createStrandType() {
		StrandTypeImpl strandType = new StrandTypeImpl();
		return strandType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String createString() {
		StringImpl string = new StringImpl();
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructureDefinition createStructureDefinition() {
		StructureDefinitionImpl structureDefinition = new StructureDefinitionImpl();
		return structureDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructureDefinitionContext createStructureDefinitionContext() {
		StructureDefinitionContextImpl structureDefinitionContext = new StructureDefinitionContextImpl();
		return structureDefinitionContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructureDefinitionDifferential createStructureDefinitionDifferential() {
		StructureDefinitionDifferentialImpl structureDefinitionDifferential = new StructureDefinitionDifferentialImpl();
		return structureDefinitionDifferential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructureDefinitionKind createStructureDefinitionKind() {
		StructureDefinitionKindImpl structureDefinitionKind = new StructureDefinitionKindImpl();
		return structureDefinitionKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructureDefinitionMapping createStructureDefinitionMapping() {
		StructureDefinitionMappingImpl structureDefinitionMapping = new StructureDefinitionMappingImpl();
		return structureDefinitionMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructureDefinitionSnapshot createStructureDefinitionSnapshot() {
		StructureDefinitionSnapshotImpl structureDefinitionSnapshot = new StructureDefinitionSnapshotImpl();
		return structureDefinitionSnapshot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructureMap createStructureMap() {
		StructureMapImpl structureMap = new StructureMapImpl();
		return structureMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructureMapContextType createStructureMapContextType() {
		StructureMapContextTypeImpl structureMapContextType = new StructureMapContextTypeImpl();
		return structureMapContextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructureMapDependent createStructureMapDependent() {
		StructureMapDependentImpl structureMapDependent = new StructureMapDependentImpl();
		return structureMapDependent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructureMapGroup createStructureMapGroup() {
		StructureMapGroupImpl structureMapGroup = new StructureMapGroupImpl();
		return structureMapGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructureMapGroupTypeMode createStructureMapGroupTypeMode() {
		StructureMapGroupTypeModeImpl structureMapGroupTypeMode = new StructureMapGroupTypeModeImpl();
		return structureMapGroupTypeMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructureMapInput createStructureMapInput() {
		StructureMapInputImpl structureMapInput = new StructureMapInputImpl();
		return structureMapInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructureMapInputMode createStructureMapInputMode() {
		StructureMapInputModeImpl structureMapInputMode = new StructureMapInputModeImpl();
		return structureMapInputMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructureMapModelMode createStructureMapModelMode() {
		StructureMapModelModeImpl structureMapModelMode = new StructureMapModelModeImpl();
		return structureMapModelMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructureMapParameter createStructureMapParameter() {
		StructureMapParameterImpl structureMapParameter = new StructureMapParameterImpl();
		return structureMapParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructureMapRule createStructureMapRule() {
		StructureMapRuleImpl structureMapRule = new StructureMapRuleImpl();
		return structureMapRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructureMapSource createStructureMapSource() {
		StructureMapSourceImpl structureMapSource = new StructureMapSourceImpl();
		return structureMapSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructureMapSourceListMode createStructureMapSourceListMode() {
		StructureMapSourceListModeImpl structureMapSourceListMode = new StructureMapSourceListModeImpl();
		return structureMapSourceListMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructureMapStructure createStructureMapStructure() {
		StructureMapStructureImpl structureMapStructure = new StructureMapStructureImpl();
		return structureMapStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructureMapTarget createStructureMapTarget() {
		StructureMapTargetImpl structureMapTarget = new StructureMapTargetImpl();
		return structureMapTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructureMapTargetListMode createStructureMapTargetListMode() {
		StructureMapTargetListModeImpl structureMapTargetListMode = new StructureMapTargetListModeImpl();
		return structureMapTargetListMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructureMapTransform createStructureMapTransform() {
		StructureMapTransformImpl structureMapTransform = new StructureMapTransformImpl();
		return structureMapTransform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subscription createSubscription() {
		SubscriptionImpl subscription = new SubscriptionImpl();
		return subscription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubscriptionChannel createSubscriptionChannel() {
		SubscriptionChannelImpl subscriptionChannel = new SubscriptionChannelImpl();
		return subscriptionChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubscriptionChannelType createSubscriptionChannelType() {
		SubscriptionChannelTypeImpl subscriptionChannelType = new SubscriptionChannelTypeImpl();
		return subscriptionChannelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubscriptionStatus createSubscriptionStatus() {
		SubscriptionStatusImpl subscriptionStatus = new SubscriptionStatusImpl();
		return subscriptionStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Substance createSubstance() {
		SubstanceImpl substance = new SubstanceImpl();
		return substance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceAmount createSubstanceAmount() {
		SubstanceAmountImpl substanceAmount = new SubstanceAmountImpl();
		return substanceAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceAmountReferenceRange createSubstanceAmountReferenceRange() {
		SubstanceAmountReferenceRangeImpl substanceAmountReferenceRange = new SubstanceAmountReferenceRangeImpl();
		return substanceAmountReferenceRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceIngredient createSubstanceIngredient() {
		SubstanceIngredientImpl substanceIngredient = new SubstanceIngredientImpl();
		return substanceIngredient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceInstance createSubstanceInstance() {
		SubstanceInstanceImpl substanceInstance = new SubstanceInstanceImpl();
		return substanceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceNucleicAcid createSubstanceNucleicAcid() {
		SubstanceNucleicAcidImpl substanceNucleicAcid = new SubstanceNucleicAcidImpl();
		return substanceNucleicAcid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceNucleicAcidLinkage createSubstanceNucleicAcidLinkage() {
		SubstanceNucleicAcidLinkageImpl substanceNucleicAcidLinkage = new SubstanceNucleicAcidLinkageImpl();
		return substanceNucleicAcidLinkage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceNucleicAcidSubunit createSubstanceNucleicAcidSubunit() {
		SubstanceNucleicAcidSubunitImpl substanceNucleicAcidSubunit = new SubstanceNucleicAcidSubunitImpl();
		return substanceNucleicAcidSubunit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceNucleicAcidSugar createSubstanceNucleicAcidSugar() {
		SubstanceNucleicAcidSugarImpl substanceNucleicAcidSugar = new SubstanceNucleicAcidSugarImpl();
		return substanceNucleicAcidSugar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstancePolymer createSubstancePolymer() {
		SubstancePolymerImpl substancePolymer = new SubstancePolymerImpl();
		return substancePolymer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstancePolymerDegreeOfPolymerisation createSubstancePolymerDegreeOfPolymerisation() {
		SubstancePolymerDegreeOfPolymerisationImpl substancePolymerDegreeOfPolymerisation = new SubstancePolymerDegreeOfPolymerisationImpl();
		return substancePolymerDegreeOfPolymerisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstancePolymerMonomerSet createSubstancePolymerMonomerSet() {
		SubstancePolymerMonomerSetImpl substancePolymerMonomerSet = new SubstancePolymerMonomerSetImpl();
		return substancePolymerMonomerSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstancePolymerRepeat createSubstancePolymerRepeat() {
		SubstancePolymerRepeatImpl substancePolymerRepeat = new SubstancePolymerRepeatImpl();
		return substancePolymerRepeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstancePolymerRepeatUnit createSubstancePolymerRepeatUnit() {
		SubstancePolymerRepeatUnitImpl substancePolymerRepeatUnit = new SubstancePolymerRepeatUnitImpl();
		return substancePolymerRepeatUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstancePolymerStartingMaterial createSubstancePolymerStartingMaterial() {
		SubstancePolymerStartingMaterialImpl substancePolymerStartingMaterial = new SubstancePolymerStartingMaterialImpl();
		return substancePolymerStartingMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstancePolymerStructuralRepresentation createSubstancePolymerStructuralRepresentation() {
		SubstancePolymerStructuralRepresentationImpl substancePolymerStructuralRepresentation = new SubstancePolymerStructuralRepresentationImpl();
		return substancePolymerStructuralRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceProtein createSubstanceProtein() {
		SubstanceProteinImpl substanceProtein = new SubstanceProteinImpl();
		return substanceProtein;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceProteinSubunit createSubstanceProteinSubunit() {
		SubstanceProteinSubunitImpl substanceProteinSubunit = new SubstanceProteinSubunitImpl();
		return substanceProteinSubunit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceReferenceInformation createSubstanceReferenceInformation() {
		SubstanceReferenceInformationImpl substanceReferenceInformation = new SubstanceReferenceInformationImpl();
		return substanceReferenceInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceReferenceInformationClassification createSubstanceReferenceInformationClassification() {
		SubstanceReferenceInformationClassificationImpl substanceReferenceInformationClassification = new SubstanceReferenceInformationClassificationImpl();
		return substanceReferenceInformationClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceReferenceInformationGene createSubstanceReferenceInformationGene() {
		SubstanceReferenceInformationGeneImpl substanceReferenceInformationGene = new SubstanceReferenceInformationGeneImpl();
		return substanceReferenceInformationGene;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceReferenceInformationGeneElement createSubstanceReferenceInformationGeneElement() {
		SubstanceReferenceInformationGeneElementImpl substanceReferenceInformationGeneElement = new SubstanceReferenceInformationGeneElementImpl();
		return substanceReferenceInformationGeneElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceReferenceInformationTarget createSubstanceReferenceInformationTarget() {
		SubstanceReferenceInformationTargetImpl substanceReferenceInformationTarget = new SubstanceReferenceInformationTargetImpl();
		return substanceReferenceInformationTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceSourceMaterial createSubstanceSourceMaterial() {
		SubstanceSourceMaterialImpl substanceSourceMaterial = new SubstanceSourceMaterialImpl();
		return substanceSourceMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceSourceMaterialAuthor createSubstanceSourceMaterialAuthor() {
		SubstanceSourceMaterialAuthorImpl substanceSourceMaterialAuthor = new SubstanceSourceMaterialAuthorImpl();
		return substanceSourceMaterialAuthor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceSourceMaterialFractionDescription createSubstanceSourceMaterialFractionDescription() {
		SubstanceSourceMaterialFractionDescriptionImpl substanceSourceMaterialFractionDescription = new SubstanceSourceMaterialFractionDescriptionImpl();
		return substanceSourceMaterialFractionDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceSourceMaterialHybrid createSubstanceSourceMaterialHybrid() {
		SubstanceSourceMaterialHybridImpl substanceSourceMaterialHybrid = new SubstanceSourceMaterialHybridImpl();
		return substanceSourceMaterialHybrid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceSourceMaterialOrganism createSubstanceSourceMaterialOrganism() {
		SubstanceSourceMaterialOrganismImpl substanceSourceMaterialOrganism = new SubstanceSourceMaterialOrganismImpl();
		return substanceSourceMaterialOrganism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceSourceMaterialOrganismGeneral createSubstanceSourceMaterialOrganismGeneral() {
		SubstanceSourceMaterialOrganismGeneralImpl substanceSourceMaterialOrganismGeneral = new SubstanceSourceMaterialOrganismGeneralImpl();
		return substanceSourceMaterialOrganismGeneral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceSourceMaterialPartDescription createSubstanceSourceMaterialPartDescription() {
		SubstanceSourceMaterialPartDescriptionImpl substanceSourceMaterialPartDescription = new SubstanceSourceMaterialPartDescriptionImpl();
		return substanceSourceMaterialPartDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceSpecification createSubstanceSpecification() {
		SubstanceSpecificationImpl substanceSpecification = new SubstanceSpecificationImpl();
		return substanceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceSpecificationCode createSubstanceSpecificationCode() {
		SubstanceSpecificationCodeImpl substanceSpecificationCode = new SubstanceSpecificationCodeImpl();
		return substanceSpecificationCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceSpecificationIsotope createSubstanceSpecificationIsotope() {
		SubstanceSpecificationIsotopeImpl substanceSpecificationIsotope = new SubstanceSpecificationIsotopeImpl();
		return substanceSpecificationIsotope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceSpecificationMoiety createSubstanceSpecificationMoiety() {
		SubstanceSpecificationMoietyImpl substanceSpecificationMoiety = new SubstanceSpecificationMoietyImpl();
		return substanceSpecificationMoiety;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceSpecificationMolecularWeight createSubstanceSpecificationMolecularWeight() {
		SubstanceSpecificationMolecularWeightImpl substanceSpecificationMolecularWeight = new SubstanceSpecificationMolecularWeightImpl();
		return substanceSpecificationMolecularWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceSpecificationName createSubstanceSpecificationName() {
		SubstanceSpecificationNameImpl substanceSpecificationName = new SubstanceSpecificationNameImpl();
		return substanceSpecificationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceSpecificationOfficial createSubstanceSpecificationOfficial() {
		SubstanceSpecificationOfficialImpl substanceSpecificationOfficial = new SubstanceSpecificationOfficialImpl();
		return substanceSpecificationOfficial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceSpecificationProperty createSubstanceSpecificationProperty() {
		SubstanceSpecificationPropertyImpl substanceSpecificationProperty = new SubstanceSpecificationPropertyImpl();
		return substanceSpecificationProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceSpecificationRelationship createSubstanceSpecificationRelationship() {
		SubstanceSpecificationRelationshipImpl substanceSpecificationRelationship = new SubstanceSpecificationRelationshipImpl();
		return substanceSpecificationRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceSpecificationRepresentation createSubstanceSpecificationRepresentation() {
		SubstanceSpecificationRepresentationImpl substanceSpecificationRepresentation = new SubstanceSpecificationRepresentationImpl();
		return substanceSpecificationRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceSpecificationStructure createSubstanceSpecificationStructure() {
		SubstanceSpecificationStructureImpl substanceSpecificationStructure = new SubstanceSpecificationStructureImpl();
		return substanceSpecificationStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupplyDelivery createSupplyDelivery() {
		SupplyDeliveryImpl supplyDelivery = new SupplyDeliveryImpl();
		return supplyDelivery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupplyDeliveryStatus createSupplyDeliveryStatus() {
		SupplyDeliveryStatusImpl supplyDeliveryStatus = new SupplyDeliveryStatusImpl();
		return supplyDeliveryStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupplyDeliverySuppliedItem createSupplyDeliverySuppliedItem() {
		SupplyDeliverySuppliedItemImpl supplyDeliverySuppliedItem = new SupplyDeliverySuppliedItemImpl();
		return supplyDeliverySuppliedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupplyRequest createSupplyRequest() {
		SupplyRequestImpl supplyRequest = new SupplyRequestImpl();
		return supplyRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupplyRequestParameter createSupplyRequestParameter() {
		SupplyRequestParameterImpl supplyRequestParameter = new SupplyRequestParameterImpl();
		return supplyRequestParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupplyRequestStatus createSupplyRequestStatus() {
		SupplyRequestStatusImpl supplyRequestStatus = new SupplyRequestStatusImpl();
		return supplyRequestStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemRestfulInteraction createSystemRestfulInteraction() {
		SystemRestfulInteractionImpl systemRestfulInteraction = new SystemRestfulInteractionImpl();
		return systemRestfulInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskInput createTaskInput() {
		TaskInputImpl taskInput = new TaskInputImpl();
		return taskInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskIntent createTaskIntent() {
		TaskIntentImpl taskIntent = new TaskIntentImpl();
		return taskIntent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskOutput createTaskOutput() {
		TaskOutputImpl taskOutput = new TaskOutputImpl();
		return taskOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskRestriction createTaskRestriction() {
		TaskRestrictionImpl taskRestriction = new TaskRestrictionImpl();
		return taskRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskStatus createTaskStatus() {
		TaskStatusImpl taskStatus = new TaskStatusImpl();
		return taskStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminologyCapabilities createTerminologyCapabilities() {
		TerminologyCapabilitiesImpl terminologyCapabilities = new TerminologyCapabilitiesImpl();
		return terminologyCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminologyCapabilitiesClosure createTerminologyCapabilitiesClosure() {
		TerminologyCapabilitiesClosureImpl terminologyCapabilitiesClosure = new TerminologyCapabilitiesClosureImpl();
		return terminologyCapabilitiesClosure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminologyCapabilitiesCodeSystem createTerminologyCapabilitiesCodeSystem() {
		TerminologyCapabilitiesCodeSystemImpl terminologyCapabilitiesCodeSystem = new TerminologyCapabilitiesCodeSystemImpl();
		return terminologyCapabilitiesCodeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminologyCapabilitiesExpansion createTerminologyCapabilitiesExpansion() {
		TerminologyCapabilitiesExpansionImpl terminologyCapabilitiesExpansion = new TerminologyCapabilitiesExpansionImpl();
		return terminologyCapabilitiesExpansion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminologyCapabilitiesFilter createTerminologyCapabilitiesFilter() {
		TerminologyCapabilitiesFilterImpl terminologyCapabilitiesFilter = new TerminologyCapabilitiesFilterImpl();
		return terminologyCapabilitiesFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminologyCapabilitiesImplementation createTerminologyCapabilitiesImplementation() {
		TerminologyCapabilitiesImplementationImpl terminologyCapabilitiesImplementation = new TerminologyCapabilitiesImplementationImpl();
		return terminologyCapabilitiesImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminologyCapabilitiesParameter createTerminologyCapabilitiesParameter() {
		TerminologyCapabilitiesParameterImpl terminologyCapabilitiesParameter = new TerminologyCapabilitiesParameterImpl();
		return terminologyCapabilitiesParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminologyCapabilitiesSoftware createTerminologyCapabilitiesSoftware() {
		TerminologyCapabilitiesSoftwareImpl terminologyCapabilitiesSoftware = new TerminologyCapabilitiesSoftwareImpl();
		return terminologyCapabilitiesSoftware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminologyCapabilitiesTranslation createTerminologyCapabilitiesTranslation() {
		TerminologyCapabilitiesTranslationImpl terminologyCapabilitiesTranslation = new TerminologyCapabilitiesTranslationImpl();
		return terminologyCapabilitiesTranslation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminologyCapabilitiesValidateCode createTerminologyCapabilitiesValidateCode() {
		TerminologyCapabilitiesValidateCodeImpl terminologyCapabilitiesValidateCode = new TerminologyCapabilitiesValidateCodeImpl();
		return terminologyCapabilitiesValidateCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminologyCapabilitiesVersion createTerminologyCapabilitiesVersion() {
		TerminologyCapabilitiesVersionImpl terminologyCapabilitiesVersion = new TerminologyCapabilitiesVersionImpl();
		return terminologyCapabilitiesVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestReport createTestReport() {
		TestReportImpl testReport = new TestReportImpl();
		return testReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestReportAction createTestReportAction() {
		TestReportActionImpl testReportAction = new TestReportActionImpl();
		return testReportAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestReportAction1 createTestReportAction1() {
		TestReportAction1Impl testReportAction1 = new TestReportAction1Impl();
		return testReportAction1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestReportAction2 createTestReportAction2() {
		TestReportAction2Impl testReportAction2 = new TestReportAction2Impl();
		return testReportAction2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestReportActionResult createTestReportActionResult() {
		TestReportActionResultImpl testReportActionResult = new TestReportActionResultImpl();
		return testReportActionResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestReportAssert createTestReportAssert() {
		TestReportAssertImpl testReportAssert = new TestReportAssertImpl();
		return testReportAssert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestReportOperation createTestReportOperation() {
		TestReportOperationImpl testReportOperation = new TestReportOperationImpl();
		return testReportOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestReportParticipant createTestReportParticipant() {
		TestReportParticipantImpl testReportParticipant = new TestReportParticipantImpl();
		return testReportParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestReportParticipantType createTestReportParticipantType() {
		TestReportParticipantTypeImpl testReportParticipantType = new TestReportParticipantTypeImpl();
		return testReportParticipantType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestReportResult createTestReportResult() {
		TestReportResultImpl testReportResult = new TestReportResultImpl();
		return testReportResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestReportSetup createTestReportSetup() {
		TestReportSetupImpl testReportSetup = new TestReportSetupImpl();
		return testReportSetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestReportStatus createTestReportStatus() {
		TestReportStatusImpl testReportStatus = new TestReportStatusImpl();
		return testReportStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestReportTeardown createTestReportTeardown() {
		TestReportTeardownImpl testReportTeardown = new TestReportTeardownImpl();
		return testReportTeardown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestReportTest createTestReportTest() {
		TestReportTestImpl testReportTest = new TestReportTestImpl();
		return testReportTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestScript createTestScript() {
		TestScriptImpl testScript = new TestScriptImpl();
		return testScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestScriptAction createTestScriptAction() {
		TestScriptActionImpl testScriptAction = new TestScriptActionImpl();
		return testScriptAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestScriptAction1 createTestScriptAction1() {
		TestScriptAction1Impl testScriptAction1 = new TestScriptAction1Impl();
		return testScriptAction1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestScriptAction2 createTestScriptAction2() {
		TestScriptAction2Impl testScriptAction2 = new TestScriptAction2Impl();
		return testScriptAction2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestScriptAssert createTestScriptAssert() {
		TestScriptAssertImpl testScriptAssert = new TestScriptAssertImpl();
		return testScriptAssert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestScriptCapability createTestScriptCapability() {
		TestScriptCapabilityImpl testScriptCapability = new TestScriptCapabilityImpl();
		return testScriptCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestScriptDestination createTestScriptDestination() {
		TestScriptDestinationImpl testScriptDestination = new TestScriptDestinationImpl();
		return testScriptDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestScriptFixture createTestScriptFixture() {
		TestScriptFixtureImpl testScriptFixture = new TestScriptFixtureImpl();
		return testScriptFixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestScriptLink createTestScriptLink() {
		TestScriptLinkImpl testScriptLink = new TestScriptLinkImpl();
		return testScriptLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestScriptMetadata createTestScriptMetadata() {
		TestScriptMetadataImpl testScriptMetadata = new TestScriptMetadataImpl();
		return testScriptMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestScriptOperation createTestScriptOperation() {
		TestScriptOperationImpl testScriptOperation = new TestScriptOperationImpl();
		return testScriptOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestScriptOrigin createTestScriptOrigin() {
		TestScriptOriginImpl testScriptOrigin = new TestScriptOriginImpl();
		return testScriptOrigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestScriptRequestHeader createTestScriptRequestHeader() {
		TestScriptRequestHeaderImpl testScriptRequestHeader = new TestScriptRequestHeaderImpl();
		return testScriptRequestHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestScriptRequestMethodCode createTestScriptRequestMethodCode() {
		TestScriptRequestMethodCodeImpl testScriptRequestMethodCode = new TestScriptRequestMethodCodeImpl();
		return testScriptRequestMethodCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestScriptSetup createTestScriptSetup() {
		TestScriptSetupImpl testScriptSetup = new TestScriptSetupImpl();
		return testScriptSetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestScriptTeardown createTestScriptTeardown() {
		TestScriptTeardownImpl testScriptTeardown = new TestScriptTeardownImpl();
		return testScriptTeardown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestScriptTest createTestScriptTest() {
		TestScriptTestImpl testScriptTest = new TestScriptTestImpl();
		return testScriptTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestScriptVariable createTestScriptVariable() {
		TestScriptVariableImpl testScriptVariable = new TestScriptVariableImpl();
		return testScriptVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Time createTime() {
		TimeImpl time = new TimeImpl();
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Timing createTiming() {
		TimingImpl timing = new TimingImpl();
		return timing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimingRepeat createTimingRepeat() {
		TimingRepeatImpl timingRepeat = new TimingRepeatImpl();
		return timingRepeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TriggerDefinition createTriggerDefinition() {
		TriggerDefinitionImpl triggerDefinition = new TriggerDefinitionImpl();
		return triggerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TriggerType createTriggerType() {
		TriggerTypeImpl triggerType = new TriggerTypeImpl();
		return triggerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeDerivationRule createTypeDerivationRule() {
		TypeDerivationRuleImpl typeDerivationRule = new TypeDerivationRuleImpl();
		return typeDerivationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeRestfulInteraction createTypeRestfulInteraction() {
		TypeRestfulInteractionImpl typeRestfulInteraction = new TypeRestfulInteractionImpl();
		return typeRestfulInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UDIEntryType createUDIEntryType() {
		UDIEntryTypeImpl udiEntryType = new UDIEntryTypeImpl();
		return udiEntryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitsOfTime createUnitsOfTime() {
		UnitsOfTimeImpl unitsOfTime = new UnitsOfTimeImpl();
		return unitsOfTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnsignedInt createUnsignedInt() {
		UnsignedIntImpl unsignedInt = new UnsignedIntImpl();
		return unsignedInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri createUri() {
		UriImpl uri = new UriImpl();
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Url createUrl() {
		UrlImpl url = new UrlImpl();
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UsageContext createUsageContext() {
		UsageContextImpl usageContext = new UsageContextImpl();
		return usageContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Use createUse() {
		UseImpl use = new UseImpl();
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uuid createUuid() {
		UuidImpl uuid = new UuidImpl();
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueSet createValueSet() {
		ValueSetImpl valueSet = new ValueSetImpl();
		return valueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueSetCompose createValueSetCompose() {
		ValueSetComposeImpl valueSetCompose = new ValueSetComposeImpl();
		return valueSetCompose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueSetConcept createValueSetConcept() {
		ValueSetConceptImpl valueSetConcept = new ValueSetConceptImpl();
		return valueSetConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueSetContains createValueSetContains() {
		ValueSetContainsImpl valueSetContains = new ValueSetContainsImpl();
		return valueSetContains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueSetDesignation createValueSetDesignation() {
		ValueSetDesignationImpl valueSetDesignation = new ValueSetDesignationImpl();
		return valueSetDesignation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueSetExpansion createValueSetExpansion() {
		ValueSetExpansionImpl valueSetExpansion = new ValueSetExpansionImpl();
		return valueSetExpansion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueSetFilter createValueSetFilter() {
		ValueSetFilterImpl valueSetFilter = new ValueSetFilterImpl();
		return valueSetFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueSetInclude createValueSetInclude() {
		ValueSetIncludeImpl valueSetInclude = new ValueSetIncludeImpl();
		return valueSetInclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueSetParameter createValueSetParameter() {
		ValueSetParameterImpl valueSetParameter = new ValueSetParameterImpl();
		return valueSetParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableType createVariableType() {
		VariableTypeImpl variableType = new VariableTypeImpl();
		return variableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VConfidentialityClassification createVConfidentialityClassification() {
		VConfidentialityClassificationImpl vConfidentialityClassification = new VConfidentialityClassificationImpl();
		return vConfidentialityClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerificationResult createVerificationResult() {
		VerificationResultImpl verificationResult = new VerificationResultImpl();
		return verificationResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerificationResultAttestation createVerificationResultAttestation() {
		VerificationResultAttestationImpl verificationResultAttestation = new VerificationResultAttestationImpl();
		return verificationResultAttestation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerificationResultPrimarySource createVerificationResultPrimarySource() {
		VerificationResultPrimarySourceImpl verificationResultPrimarySource = new VerificationResultPrimarySourceImpl();
		return verificationResultPrimarySource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerificationResultValidator createVerificationResultValidator() {
		VerificationResultValidatorImpl verificationResultValidator = new VerificationResultValidatorImpl();
		return verificationResultValidator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VisionBase createVisionBase() {
		VisionBaseImpl visionBase = new VisionBaseImpl();
		return visionBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VisionEyes createVisionEyes() {
		VisionEyesImpl visionEyes = new VisionEyesImpl();
		return visionEyes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VisionPrescription createVisionPrescription() {
		VisionPrescriptionImpl visionPrescription = new VisionPrescriptionImpl();
		return visionPrescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VisionPrescriptionLensSpecification createVisionPrescriptionLensSpecification() {
		VisionPrescriptionLensSpecificationImpl visionPrescriptionLensSpecification = new VisionPrescriptionLensSpecificationImpl();
		return visionPrescriptionLensSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VisionPrescriptionPrism createVisionPrescriptionPrism() {
		VisionPrescriptionPrismImpl visionPrescriptionPrism = new VisionPrescriptionPrismImpl();
		return visionPrescriptionPrism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XPathUsageType createXPathUsageType() {
		XPathUsageTypeImpl xPathUsageType = new XPathUsageTypeImpl();
		return xPathUsageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountStatusList createAccountStatusListFromString(EDataType eDataType, String initialValue) {
		AccountStatusList result = AccountStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccountStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionCardinalityBehaviorList createActionCardinalityBehaviorListFromString(EDataType eDataType, String initialValue) {
		ActionCardinalityBehaviorList result = ActionCardinalityBehaviorList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionCardinalityBehaviorListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionConditionKindList createActionConditionKindListFromString(EDataType eDataType, String initialValue) {
		ActionConditionKindList result = ActionConditionKindList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionConditionKindListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionGroupingBehaviorList createActionGroupingBehaviorListFromString(EDataType eDataType, String initialValue) {
		ActionGroupingBehaviorList result = ActionGroupingBehaviorList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionGroupingBehaviorListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionParticipantTypeList createActionParticipantTypeListFromString(EDataType eDataType, String initialValue) {
		ActionParticipantTypeList result = ActionParticipantTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionParticipantTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionPrecheckBehaviorList createActionPrecheckBehaviorListFromString(EDataType eDataType, String initialValue) {
		ActionPrecheckBehaviorList result = ActionPrecheckBehaviorList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionPrecheckBehaviorListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionRelationshipTypeList createActionRelationshipTypeListFromString(EDataType eDataType, String initialValue) {
		ActionRelationshipTypeList result = ActionRelationshipTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionRelationshipTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionRequiredBehaviorList createActionRequiredBehaviorListFromString(EDataType eDataType, String initialValue) {
		ActionRequiredBehaviorList result = ActionRequiredBehaviorList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionRequiredBehaviorListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionSelectionBehaviorList createActionSelectionBehaviorListFromString(EDataType eDataType, String initialValue) {
		ActionSelectionBehaviorList result = ActionSelectionBehaviorList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionSelectionBehaviorListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressTypeList createAddressTypeListFromString(EDataType eDataType, String initialValue) {
		AddressTypeList result = AddressTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAddressTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressUseList createAddressUseListFromString(EDataType eDataType, String initialValue) {
		AddressUseList result = AddressUseList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAddressUseListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdministrativeGenderList createAdministrativeGenderListFromString(EDataType eDataType, String initialValue) {
		AdministrativeGenderList result = AdministrativeGenderList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdministrativeGenderListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdverseEventActualityList createAdverseEventActualityListFromString(EDataType eDataType, String initialValue) {
		AdverseEventActualityList result = AdverseEventActualityList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdverseEventActualityListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationModeList createAggregationModeListFromString(EDataType eDataType, String initialValue) {
		AggregationModeList result = AggregationModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregationModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceCategoryList createAllergyIntoleranceCategoryListFromString(EDataType eDataType, String initialValue) {
		AllergyIntoleranceCategoryList result = AllergyIntoleranceCategoryList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceCategoryListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceCriticalityList createAllergyIntoleranceCriticalityListFromString(EDataType eDataType, String initialValue) {
		AllergyIntoleranceCriticalityList result = AllergyIntoleranceCriticalityList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceCriticalityListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceSeverityList createAllergyIntoleranceSeverityListFromString(EDataType eDataType, String initialValue) {
		AllergyIntoleranceSeverityList result = AllergyIntoleranceSeverityList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceSeverityListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceTypeList createAllergyIntoleranceTypeListFromString(EDataType eDataType, String initialValue) {
		AllergyIntoleranceTypeList result = AllergyIntoleranceTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppointmentStatusList createAppointmentStatusListFromString(EDataType eDataType, String initialValue) {
		AppointmentStatusList result = AppointmentStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAppointmentStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionDirectionTypeList createAssertionDirectionTypeListFromString(EDataType eDataType, String initialValue) {
		AssertionDirectionTypeList result = AssertionDirectionTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssertionDirectionTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionOperatorTypeList createAssertionOperatorTypeListFromString(EDataType eDataType, String initialValue) {
		AssertionOperatorTypeList result = AssertionOperatorTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssertionOperatorTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionResponseTypesList createAssertionResponseTypesListFromString(EDataType eDataType, String initialValue) {
		AssertionResponseTypesList result = AssertionResponseTypesList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssertionResponseTypesListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventActionList createAuditEventActionListFromString(EDataType eDataType, String initialValue) {
		AuditEventActionList result = AuditEventActionList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventActionListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventAgentNetworkTypeList createAuditEventAgentNetworkTypeListFromString(EDataType eDataType, String initialValue) {
		AuditEventAgentNetworkTypeList result = AuditEventAgentNetworkTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventAgentNetworkTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventOutcomeList createAuditEventOutcomeListFromString(EDataType eDataType, String initialValue) {
		AuditEventOutcomeList result = AuditEventOutcomeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventOutcomeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingStrengthList createBindingStrengthListFromString(EDataType eDataType, String initialValue) {
		BindingStrengthList result = BindingStrengthList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBindingStrengthListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BiologicallyDerivedProductCategoryList createBiologicallyDerivedProductCategoryListFromString(EDataType eDataType, String initialValue) {
		BiologicallyDerivedProductCategoryList result = BiologicallyDerivedProductCategoryList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBiologicallyDerivedProductCategoryListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BiologicallyDerivedProductStatusList createBiologicallyDerivedProductStatusListFromString(EDataType eDataType, String initialValue) {
		BiologicallyDerivedProductStatusList result = BiologicallyDerivedProductStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBiologicallyDerivedProductStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BiologicallyDerivedProductStorageScaleList createBiologicallyDerivedProductStorageScaleListFromString(EDataType eDataType, String initialValue) {
		BiologicallyDerivedProductStorageScaleList result = BiologicallyDerivedProductStorageScaleList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBiologicallyDerivedProductStorageScaleListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleTypeList createBundleTypeListFromString(EDataType eDataType, String initialValue) {
		BundleTypeList result = BundleTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBundleTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementKindList createCapabilityStatementKindListFromString(EDataType eDataType, String initialValue) {
		CapabilityStatementKindList result = CapabilityStatementKindList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCapabilityStatementKindListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanActivityKindList createCarePlanActivityKindListFromString(EDataType eDataType, String initialValue) {
		CarePlanActivityKindList result = CarePlanActivityKindList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCarePlanActivityKindListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanActivityStatusList createCarePlanActivityStatusListFromString(EDataType eDataType, String initialValue) {
		CarePlanActivityStatusList result = CarePlanActivityStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCarePlanActivityStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanIntentList createCarePlanIntentListFromString(EDataType eDataType, String initialValue) {
		CarePlanIntentList result = CarePlanIntentList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCarePlanIntentListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CareTeamStatusList createCareTeamStatusListFromString(EDataType eDataType, String initialValue) {
		CareTeamStatusList result = CareTeamStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCareTeamStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogEntryRelationTypeList createCatalogEntryRelationTypeListFromString(EDataType eDataType, String initialValue) {
		CatalogEntryRelationTypeList result = CatalogEntryRelationTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCatalogEntryRelationTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChargeItemStatusList createChargeItemStatusListFromString(EDataType eDataType, String initialValue) {
		ChargeItemStatusList result = ChargeItemStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChargeItemStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimProcessingCodesList createClaimProcessingCodesListFromString(EDataType eDataType, String initialValue) {
		ClaimProcessingCodesList result = ClaimProcessingCodesList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClaimProcessingCodesListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalImpressionStatusList createClinicalImpressionStatusListFromString(EDataType eDataType, String initialValue) {
		ClinicalImpressionStatusList result = ClinicalImpressionStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClinicalImpressionStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSearchSupportList createCodeSearchSupportListFromString(EDataType eDataType, String initialValue) {
		CodeSearchSupportList result = CodeSearchSupportList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodeSearchSupportListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemContentModeList createCodeSystemContentModeListFromString(EDataType eDataType, String initialValue) {
		CodeSystemContentModeList result = CodeSystemContentModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodeSystemContentModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemHierarchyMeaningList createCodeSystemHierarchyMeaningListFromString(EDataType eDataType, String initialValue) {
		CodeSystemHierarchyMeaningList result = CodeSystemHierarchyMeaningList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodeSystemHierarchyMeaningListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentTypeList createCompartmentTypeListFromString(EDataType eDataType, String initialValue) {
		CompartmentTypeList result = CompartmentTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompartmentTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionAttestationModeList createCompositionAttestationModeListFromString(EDataType eDataType, String initialValue) {
		CompositionAttestationModeList result = CompositionAttestationModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompositionAttestationModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionStatusList createCompositionStatusListFromString(EDataType eDataType, String initialValue) {
		CompositionStatusList result = CompositionStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompositionStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapEquivalenceList createConceptMapEquivalenceListFromString(EDataType eDataType, String initialValue) {
		ConceptMapEquivalenceList result = ConceptMapEquivalenceList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConceptMapEquivalenceListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapGroupUnmappedModeList createConceptMapGroupUnmappedModeListFromString(EDataType eDataType, String initialValue) {
		ConceptMapGroupUnmappedModeList result = ConceptMapGroupUnmappedModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConceptMapGroupUnmappedModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalDeleteStatusList createConditionalDeleteStatusListFromString(EDataType eDataType, String initialValue) {
		ConditionalDeleteStatusList result = ConditionalDeleteStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionalDeleteStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalReadStatusList createConditionalReadStatusListFromString(EDataType eDataType, String initialValue) {
		ConditionalReadStatusList result = ConditionalReadStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionalReadStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentDataMeaningList createConsentDataMeaningListFromString(EDataType eDataType, String initialValue) {
		ConsentDataMeaningList result = ConsentDataMeaningList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsentDataMeaningListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentProvisionTypeList createConsentProvisionTypeListFromString(EDataType eDataType, String initialValue) {
		ConsentProvisionTypeList result = ConsentProvisionTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsentProvisionTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentStateList createConsentStateListFromString(EDataType eDataType, String initialValue) {
		ConsentStateList result = ConsentStateList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsentStateListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintSeverityList createConstraintSeverityListFromString(EDataType eDataType, String initialValue) {
		ConstraintSeverityList result = ConstraintSeverityList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConstraintSeverityListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactPointSystemList createContactPointSystemListFromString(EDataType eDataType, String initialValue) {
		ContactPointSystemList result = ContactPointSystemList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContactPointSystemListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactPointUseList createContactPointUseListFromString(EDataType eDataType, String initialValue) {
		ContactPointUseList result = ContactPointUseList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContactPointUseListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractResourcePublicationStatusCodesList createContractResourcePublicationStatusCodesListFromString(EDataType eDataType, String initialValue) {
		ContractResourcePublicationStatusCodesList result = ContractResourcePublicationStatusCodesList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContractResourcePublicationStatusCodesListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractResourceStatusCodesList createContractResourceStatusCodesListFromString(EDataType eDataType, String initialValue) {
		ContractResourceStatusCodesList result = ContractResourceStatusCodesList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContractResourceStatusCodesListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContributorTypeList createContributorTypeListFromString(EDataType eDataType, String initialValue) {
		ContributorTypeList result = ContributorTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContributorTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaysOfWeekList createDaysOfWeekListFromString(EDataType eDataType, String initialValue) {
		DaysOfWeekList result = DaysOfWeekList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDaysOfWeekListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetectedIssueSeverityList createDetectedIssueSeverityListFromString(EDataType eDataType, String initialValue) {
		DetectedIssueSeverityList result = DetectedIssueSeverityList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDetectedIssueSeverityListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCalibrationStateList createDeviceMetricCalibrationStateListFromString(EDataType eDataType, String initialValue) {
		DeviceMetricCalibrationStateList result = DeviceMetricCalibrationStateList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricCalibrationStateListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCalibrationTypeList createDeviceMetricCalibrationTypeListFromString(EDataType eDataType, String initialValue) {
		DeviceMetricCalibrationTypeList result = DeviceMetricCalibrationTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricCalibrationTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCategoryList createDeviceMetricCategoryListFromString(EDataType eDataType, String initialValue) {
		DeviceMetricCategoryList result = DeviceMetricCategoryList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricCategoryListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricColorList createDeviceMetricColorListFromString(EDataType eDataType, String initialValue) {
		DeviceMetricColorList result = DeviceMetricColorList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricColorListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricOperationalStatusList createDeviceMetricOperationalStatusListFromString(EDataType eDataType, String initialValue) {
		DeviceMetricOperationalStatusList result = DeviceMetricOperationalStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricOperationalStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceNameTypeList createDeviceNameTypeListFromString(EDataType eDataType, String initialValue) {
		DeviceNameTypeList result = DeviceNameTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceNameTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceUseStatementStatusList createDeviceUseStatementStatusListFromString(EDataType eDataType, String initialValue) {
		DeviceUseStatementStatusList result = DeviceUseStatementStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceUseStatementStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticReportStatusList createDiagnosticReportStatusListFromString(EDataType eDataType, String initialValue) {
		DiagnosticReportStatusList result = DiagnosticReportStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiagnosticReportStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscriminatorTypeList createDiscriminatorTypeListFromString(EDataType eDataType, String initialValue) {
		DiscriminatorTypeList result = DiscriminatorTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiscriminatorTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentModeList createDocumentModeListFromString(EDataType eDataType, String initialValue) {
		DocumentModeList result = DocumentModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReferenceStatusList createDocumentReferenceStatusListFromString(EDataType eDataType, String initialValue) {
		DocumentReferenceStatusList result = DocumentReferenceStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentReferenceStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRelationshipTypeList createDocumentRelationshipTypeListFromString(EDataType eDataType, String initialValue) {
		DocumentRelationshipTypeList result = DocumentRelationshipTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentRelationshipTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityRequestPurposeList createEligibilityRequestPurposeListFromString(EDataType eDataType, String initialValue) {
		EligibilityRequestPurposeList result = EligibilityRequestPurposeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEligibilityRequestPurposeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityResponsePurposeList createEligibilityResponsePurposeListFromString(EDataType eDataType, String initialValue) {
		EligibilityResponsePurposeList result = EligibilityResponsePurposeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEligibilityResponsePurposeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnableWhenBehaviorList createEnableWhenBehaviorListFromString(EDataType eDataType, String initialValue) {
		EnableWhenBehaviorList result = EnableWhenBehaviorList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnableWhenBehaviorListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterLocationStatusList createEncounterLocationStatusListFromString(EDataType eDataType, String initialValue) {
		EncounterLocationStatusList result = EncounterLocationStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncounterLocationStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterStatusList createEncounterStatusListFromString(EDataType eDataType, String initialValue) {
		EncounterStatusList result = EncounterStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncounterStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointStatusList createEndpointStatusListFromString(EDataType eDataType, String initialValue) {
		EndpointStatusList result = EndpointStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEndpointStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodeOfCareStatusList createEpisodeOfCareStatusListFromString(EDataType eDataType, String initialValue) {
		EpisodeOfCareStatusList result = EpisodeOfCareStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEpisodeOfCareStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventCapabilityModeList createEventCapabilityModeListFromString(EDataType eDataType, String initialValue) {
		EventCapabilityModeList result = EventCapabilityModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventCapabilityModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventStatusList createEventStatusListFromString(EDataType eDataType, String initialValue) {
		EventStatusList result = EventStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventTimingList createEventTimingListFromString(EDataType eDataType, String initialValue) {
		EventTimingList result = EventTimingList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventTimingListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceVariableTypeList createEvidenceVariableTypeListFromString(EDataType eDataType, String initialValue) {
		EvidenceVariableTypeList result = EvidenceVariableTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEvidenceVariableTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleScenarioActorTypeList createExampleScenarioActorTypeListFromString(EDataType eDataType, String initialValue) {
		ExampleScenarioActorTypeList result = ExampleScenarioActorTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExampleScenarioActorTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitStatusList createExplanationOfBenefitStatusListFromString(EDataType eDataType, String initialValue) {
		ExplanationOfBenefitStatusList result = ExplanationOfBenefitStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExplanationOfBenefitStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExposureStateList createExposureStateListFromString(EDataType eDataType, String initialValue) {
		ExposureStateList result = ExposureStateList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExposureStateListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionLanguageList createExpressionLanguageListFromString(EDataType eDataType, String initialValue) {
		ExpressionLanguageList result = ExpressionLanguageList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExpressionLanguageListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionContextTypeList createExtensionContextTypeListFromString(EDataType eDataType, String initialValue) {
		ExtensionContextTypeList result = ExtensionContextTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExtensionContextTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistoryStatusList createFamilyHistoryStatusListFromString(EDataType eDataType, String initialValue) {
		FamilyHistoryStatusList result = FamilyHistoryStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFamilyHistoryStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHIRDeviceStatusList createFHIRDeviceStatusListFromString(EDataType eDataType, String initialValue) {
		FHIRDeviceStatusList result = FHIRDeviceStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFHIRDeviceStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHIRSubstanceStatusList createFHIRSubstanceStatusListFromString(EDataType eDataType, String initialValue) {
		FHIRSubstanceStatusList result = FHIRSubstanceStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFHIRSubstanceStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHIRVersionList createFHIRVersionListFromString(EDataType eDataType, String initialValue) {
		FHIRVersionList result = FHIRVersionList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFHIRVersionListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterOperatorList createFilterOperatorListFromString(EDataType eDataType, String initialValue) {
		FilterOperatorList result = FilterOperatorList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFilterOperatorListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinancialResourceStatusCodesList createFinancialResourceStatusCodesListFromString(EDataType eDataType, String initialValue) {
		FinancialResourceStatusCodesList result = FinancialResourceStatusCodesList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFinancialResourceStatusCodesListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlagStatusList createFlagStatusListFromString(EDataType eDataType, String initialValue) {
		FlagStatusList result = FlagStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFlagStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalLifecycleStatusList createGoalLifecycleStatusListFromString(EDataType eDataType, String initialValue) {
		GoalLifecycleStatusList result = GoalLifecycleStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGoalLifecycleStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphCompartmentRuleList createGraphCompartmentRuleListFromString(EDataType eDataType, String initialValue) {
		GraphCompartmentRuleList result = GraphCompartmentRuleList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGraphCompartmentRuleListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphCompartmentUseList createGraphCompartmentUseListFromString(EDataType eDataType, String initialValue) {
		GraphCompartmentUseList result = GraphCompartmentUseList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGraphCompartmentUseListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupMeasureList createGroupMeasureListFromString(EDataType eDataType, String initialValue) {
		GroupMeasureList result = GroupMeasureList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroupMeasureListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupTypeList createGroupTypeListFromString(EDataType eDataType, String initialValue) {
		GroupTypeList result = GroupTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroupTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuidanceResponseStatusList createGuidanceResponseStatusListFromString(EDataType eDataType, String initialValue) {
		GuidanceResponseStatusList result = GuidanceResponseStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGuidanceResponseStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuidePageGenerationList createGuidePageGenerationListFromString(EDataType eDataType, String initialValue) {
		GuidePageGenerationList result = GuidePageGenerationList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGuidePageGenerationListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuideParameterCodeList createGuideParameterCodeListFromString(EDataType eDataType, String initialValue) {
		GuideParameterCodeList result = GuideParameterCodeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGuideParameterCodeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPVerbList createHTTPVerbListFromString(EDataType eDataType, String initialValue) {
		HTTPVerbList result = HTTPVerbList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHTTPVerbListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierUseList createIdentifierUseListFromString(EDataType eDataType, String initialValue) {
		IdentifierUseList result = IdentifierUseList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentifierUseListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentityAssuranceLevelList createIdentityAssuranceLevelListFromString(EDataType eDataType, String initialValue) {
		IdentityAssuranceLevelList result = IdentityAssuranceLevelList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentityAssuranceLevelListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingStudyStatusList createImagingStudyStatusListFromString(EDataType eDataType, String initialValue) {
		ImagingStudyStatusList result = ImagingStudyStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImagingStudyStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationEvaluationStatusCodesList createImmunizationEvaluationStatusCodesListFromString(EDataType eDataType, String initialValue) {
		ImmunizationEvaluationStatusCodesList result = ImmunizationEvaluationStatusCodesList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImmunizationEvaluationStatusCodesListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationStatusCodesList createImmunizationStatusCodesListFromString(EDataType eDataType, String initialValue) {
		ImmunizationStatusCodesList result = ImmunizationStatusCodesList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImmunizationStatusCodesListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvoicePriceComponentTypeList createInvoicePriceComponentTypeListFromString(EDataType eDataType, String initialValue) {
		InvoicePriceComponentTypeList result = InvoicePriceComponentTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvoicePriceComponentTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvoiceStatusList createInvoiceStatusListFromString(EDataType eDataType, String initialValue) {
		InvoiceStatusList result = InvoiceStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvoiceStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueSeverityList createIssueSeverityListFromString(EDataType eDataType, String initialValue) {
		IssueSeverityList result = IssueSeverityList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIssueSeverityListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueTypeList createIssueTypeListFromString(EDataType eDataType, String initialValue) {
		IssueTypeList result = IssueTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIssueTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkageTypeList createLinkageTypeListFromString(EDataType eDataType, String initialValue) {
		LinkageTypeList result = LinkageTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinkageTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkTypeList createLinkTypeListFromString(EDataType eDataType, String initialValue) {
		LinkTypeList result = LinkTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinkTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListModeList createListModeListFromString(EDataType eDataType, String initialValue) {
		ListModeList result = ListModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListStatusList createListStatusListFromString(EDataType eDataType, String initialValue) {
		ListStatusList result = ListStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationModeList createLocationModeListFromString(EDataType eDataType, String initialValue) {
		LocationModeList result = LocationModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocationModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationStatusList createLocationStatusListFromString(EDataType eDataType, String initialValue) {
		LocationStatusList result = LocationStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocationStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportStatusList createMeasureReportStatusListFromString(EDataType eDataType, String initialValue) {
		MeasureReportStatusList result = MeasureReportStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasureReportStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportTypeList createMeasureReportTypeListFromString(EDataType eDataType, String initialValue) {
		MeasureReportTypeList result = MeasureReportTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasureReportTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationRequestIntentList createMedicationRequestIntentListFromString(EDataType eDataType, String initialValue) {
		MedicationRequestIntentList result = MedicationRequestIntentList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationRequestIntentListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationrequestStatusList createMedicationrequestStatusListFromString(EDataType eDataType, String initialValue) {
		MedicationrequestStatusList result = MedicationrequestStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationrequestStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatusCodesList createMedicationStatusCodesListFromString(EDataType eDataType, String initialValue) {
		MedicationStatusCodesList result = MedicationStatusCodesList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationStatusCodesListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageheaderResponseRequestList createMessageheaderResponseRequestListFromString(EDataType eDataType, String initialValue) {
		MessageheaderResponseRequestList result = MessageheaderResponseRequestList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageheaderResponseRequestListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSignificanceCategoryList createMessageSignificanceCategoryListFromString(EDataType eDataType, String initialValue) {
		MessageSignificanceCategoryList result = MessageSignificanceCategoryList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageSignificanceCategoryListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameUseList createNameUseListFromString(EDataType eDataType, String initialValue) {
		NameUseList result = NameUseList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameUseListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystemIdentifierTypeList createNamingSystemIdentifierTypeListFromString(EDataType eDataType, String initialValue) {
		NamingSystemIdentifierTypeList result = NamingSystemIdentifierTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNamingSystemIdentifierTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystemTypeList createNamingSystemTypeListFromString(EDataType eDataType, String initialValue) {
		NamingSystemTypeList result = NamingSystemTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNamingSystemTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NarrativeStatusList createNarrativeStatusListFromString(EDataType eDataType, String initialValue) {
		NarrativeStatusList result = NarrativeStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNarrativeStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteTypeList createNoteTypeListFromString(EDataType eDataType, String initialValue) {
		NoteTypeList result = NoteTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNoteTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationDataTypeList createObservationDataTypeListFromString(EDataType eDataType, String initialValue) {
		ObservationDataTypeList result = ObservationDataTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObservationDataTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationRangeCategoryList createObservationRangeCategoryListFromString(EDataType eDataType, String initialValue) {
		ObservationRangeCategoryList result = ObservationRangeCategoryList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObservationRangeCategoryListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationStatusList createObservationStatusListFromString(EDataType eDataType, String initialValue) {
		ObservationStatusList result = ObservationStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObservationStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationKindList createOperationKindListFromString(EDataType eDataType, String initialValue) {
		OperationKindList result = OperationKindList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationKindListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationParameterUseList createOperationParameterUseListFromString(EDataType eDataType, String initialValue) {
		OperationParameterUseList result = OperationParameterUseList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationParameterUseListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationTypeList createOrientationTypeListFromString(EDataType eDataType, String initialValue) {
		OrientationTypeList result = OrientationTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantRequiredList createParticipantRequiredListFromString(EDataType eDataType, String initialValue) {
		ParticipantRequiredList result = ParticipantRequiredList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParticipantRequiredListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipationStatusList createParticipationStatusListFromString(EDataType eDataType, String initialValue) {
		ParticipationStatusList result = ParticipationStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParticipationStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyRepresentationList createPropertyRepresentationListFromString(EDataType eDataType, String initialValue) {
		PropertyRepresentationList result = PropertyRepresentationList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyRepresentationListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyTypeList createPropertyTypeListFromString(EDataType eDataType, String initialValue) {
		PropertyTypeList result = PropertyTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvenanceEntityRoleList createProvenanceEntityRoleListFromString(EDataType eDataType, String initialValue) {
		ProvenanceEntityRoleList result = ProvenanceEntityRoleList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProvenanceEntityRoleListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicationStatusList createPublicationStatusListFromString(EDataType eDataType, String initialValue) {
		PublicationStatusList result = PublicationStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPublicationStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityTypeList createQualityTypeListFromString(EDataType eDataType, String initialValue) {
		QualityTypeList result = QualityTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQualityTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantityComparatorList createQuantityComparatorListFromString(EDataType eDataType, String initialValue) {
		QuantityComparatorList result = QuantityComparatorList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuantityComparatorListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireItemOperatorList createQuestionnaireItemOperatorListFromString(EDataType eDataType, String initialValue) {
		QuestionnaireItemOperatorList result = QuestionnaireItemOperatorList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuestionnaireItemOperatorListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireItemTypeList createQuestionnaireItemTypeListFromString(EDataType eDataType, String initialValue) {
		QuestionnaireItemTypeList result = QuestionnaireItemTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuestionnaireItemTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireResponseStatusList createQuestionnaireResponseStatusListFromString(EDataType eDataType, String initialValue) {
		QuestionnaireResponseStatusList result = QuestionnaireResponseStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuestionnaireResponseStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceHandlingPolicyList createReferenceHandlingPolicyListFromString(EDataType eDataType, String initialValue) {
		ReferenceHandlingPolicyList result = ReferenceHandlingPolicyList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferenceHandlingPolicyListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceVersionRulesList createReferenceVersionRulesListFromString(EDataType eDataType, String initialValue) {
		ReferenceVersionRulesList result = ReferenceVersionRulesList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferenceVersionRulesListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedArtifactTypeList createRelatedArtifactTypeListFromString(EDataType eDataType, String initialValue) {
		RelatedArtifactTypeList result = RelatedArtifactTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelatedArtifactTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemittanceOutcomeList createRemittanceOutcomeListFromString(EDataType eDataType, String initialValue) {
		RemittanceOutcomeList result = RemittanceOutcomeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRemittanceOutcomeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryTypeList createRepositoryTypeListFromString(EDataType eDataType, String initialValue) {
		RepositoryTypeList result = RepositoryTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRepositoryTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestIntentList createRequestIntentListFromString(EDataType eDataType, String initialValue) {
		RequestIntentList result = RequestIntentList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequestIntentListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestPriorityList createRequestPriorityListFromString(EDataType eDataType, String initialValue) {
		RequestPriorityList result = RequestPriorityList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequestPriorityListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestResourceTypeList createRequestResourceTypeListFromString(EDataType eDataType, String initialValue) {
		RequestResourceTypeList result = RequestResourceTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequestResourceTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestStatusList createRequestStatusListFromString(EDataType eDataType, String initialValue) {
		RequestStatusList result = RequestStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequestStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchElementTypeList createResearchElementTypeListFromString(EDataType eDataType, String initialValue) {
		ResearchElementTypeList result = ResearchElementTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResearchElementTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchStudyStatusList createResearchStudyStatusListFromString(EDataType eDataType, String initialValue) {
		ResearchStudyStatusList result = ResearchStudyStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResearchStudyStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchSubjectStatusList createResearchSubjectStatusListFromString(EDataType eDataType, String initialValue) {
		ResearchSubjectStatusList result = ResearchSubjectStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResearchSubjectStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceTypeList createResourceTypeListFromString(EDataType eDataType, String initialValue) {
		ResourceTypeList result = ResourceTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceVersionPolicyList createResourceVersionPolicyListFromString(EDataType eDataType, String initialValue) {
		ResourceVersionPolicyList result = ResourceVersionPolicyList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceVersionPolicyListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseTypeList createResponseTypeListFromString(EDataType eDataType, String initialValue) {
		ResponseTypeList result = ResponseTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResponseTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestfulCapabilityModeList createRestfulCapabilityModeListFromString(EDataType eDataType, String initialValue) {
		RestfulCapabilityModeList result = RestfulCapabilityModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRestfulCapabilityModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchComparatorList createSearchComparatorListFromString(EDataType eDataType, String initialValue) {
		SearchComparatorList result = SearchComparatorList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSearchComparatorListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchEntryModeList createSearchEntryModeListFromString(EDataType eDataType, String initialValue) {
		SearchEntryModeList result = SearchEntryModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSearchEntryModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchModifierCodeList createSearchModifierCodeListFromString(EDataType eDataType, String initialValue) {
		SearchModifierCodeList result = SearchModifierCodeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSearchModifierCodeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchParamTypeList createSearchParamTypeListFromString(EDataType eDataType, String initialValue) {
		SearchParamTypeList result = SearchParamTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSearchParamTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceTypeList createSequenceTypeListFromString(EDataType eDataType, String initialValue) {
		SequenceTypeList result = SequenceTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSequenceTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlicingRulesList createSlicingRulesListFromString(EDataType eDataType, String initialValue) {
		SlicingRulesList result = SlicingRulesList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSlicingRulesListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlotStatusList createSlotStatusListFromString(EDataType eDataType, String initialValue) {
		SlotStatusList result = SlotStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSlotStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortDirectionList createSortDirectionListFromString(EDataType eDataType, String initialValue) {
		SortDirectionList result = SortDirectionList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSortDirectionListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPDXLicenseList createSPDXLicenseListFromString(EDataType eDataType, String initialValue) {
		SPDXLicenseList result = SPDXLicenseList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSPDXLicenseListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenContainedPreferenceList createSpecimenContainedPreferenceListFromString(EDataType eDataType, String initialValue) {
		SpecimenContainedPreferenceList result = SpecimenContainedPreferenceList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpecimenContainedPreferenceListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenStatusList createSpecimenStatusListFromString(EDataType eDataType, String initialValue) {
		SpecimenStatusList result = SpecimenStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpecimenStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusList createStatusListFromString(EDataType eDataType, String initialValue) {
		StatusList result = StatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrandTypeList createStrandTypeListFromString(EDataType eDataType, String initialValue) {
		StrandTypeList result = StrandTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStrandTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinitionKindList createStructureDefinitionKindListFromString(EDataType eDataType, String initialValue) {
		StructureDefinitionKindList result = StructureDefinitionKindList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureDefinitionKindListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapContextTypeList createStructureMapContextTypeListFromString(EDataType eDataType, String initialValue) {
		StructureMapContextTypeList result = StructureMapContextTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapContextTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapGroupTypeModeList createStructureMapGroupTypeModeListFromString(EDataType eDataType, String initialValue) {
		StructureMapGroupTypeModeList result = StructureMapGroupTypeModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapGroupTypeModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapInputModeList createStructureMapInputModeListFromString(EDataType eDataType, String initialValue) {
		StructureMapInputModeList result = StructureMapInputModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapInputModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapModelModeList createStructureMapModelModeListFromString(EDataType eDataType, String initialValue) {
		StructureMapModelModeList result = StructureMapModelModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapModelModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapSourceListModeList createStructureMapSourceListModeListFromString(EDataType eDataType, String initialValue) {
		StructureMapSourceListModeList result = StructureMapSourceListModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapSourceListModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapTargetListModeList createStructureMapTargetListModeListFromString(EDataType eDataType, String initialValue) {
		StructureMapTargetListModeList result = StructureMapTargetListModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapTargetListModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapTransformList createStructureMapTransformListFromString(EDataType eDataType, String initialValue) {
		StructureMapTransformList result = StructureMapTransformList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapTransformListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionChannelTypeList createSubscriptionChannelTypeListFromString(EDataType eDataType, String initialValue) {
		SubscriptionChannelTypeList result = SubscriptionChannelTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubscriptionChannelTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionStatusList createSubscriptionStatusListFromString(EDataType eDataType, String initialValue) {
		SubscriptionStatusList result = SubscriptionStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubscriptionStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyDeliveryStatusList createSupplyDeliveryStatusListFromString(EDataType eDataType, String initialValue) {
		SupplyDeliveryStatusList result = SupplyDeliveryStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupplyDeliveryStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyRequestStatusList createSupplyRequestStatusListFromString(EDataType eDataType, String initialValue) {
		SupplyRequestStatusList result = SupplyRequestStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupplyRequestStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemRestfulInteractionList createSystemRestfulInteractionListFromString(EDataType eDataType, String initialValue) {
		SystemRestfulInteractionList result = SystemRestfulInteractionList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSystemRestfulInteractionListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskIntentList createTaskIntentListFromString(EDataType eDataType, String initialValue) {
		TaskIntentList result = TaskIntentList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaskIntentListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskStatusList createTaskStatusListFromString(EDataType eDataType, String initialValue) {
		TaskStatusList result = TaskStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaskStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportActionResultList createTestReportActionResultListFromString(EDataType eDataType, String initialValue) {
		TestReportActionResultList result = TestReportActionResultList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestReportActionResultListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportParticipantTypeList createTestReportParticipantTypeListFromString(EDataType eDataType, String initialValue) {
		TestReportParticipantTypeList result = TestReportParticipantTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestReportParticipantTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportResultList createTestReportResultListFromString(EDataType eDataType, String initialValue) {
		TestReportResultList result = TestReportResultList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestReportResultListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportStatusList createTestReportStatusListFromString(EDataType eDataType, String initialValue) {
		TestReportStatusList result = TestReportStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestReportStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptRequestMethodCodeList createTestScriptRequestMethodCodeListFromString(EDataType eDataType, String initialValue) {
		TestScriptRequestMethodCodeList result = TestScriptRequestMethodCodeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestScriptRequestMethodCodeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerTypeList createTriggerTypeListFromString(EDataType eDataType, String initialValue) {
		TriggerTypeList result = TriggerTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTriggerTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDerivationRuleList createTypeDerivationRuleListFromString(EDataType eDataType, String initialValue) {
		TypeDerivationRuleList result = TypeDerivationRuleList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeDerivationRuleListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRestfulInteractionList createTypeRestfulInteractionListFromString(EDataType eDataType, String initialValue) {
		TypeRestfulInteractionList result = TypeRestfulInteractionList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeRestfulInteractionListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UDIEntryTypeList createUDIEntryTypeListFromString(EDataType eDataType, String initialValue) {
		UDIEntryTypeList result = UDIEntryTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUDIEntryTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsOfTimeList createUnitsOfTimeListFromString(EDataType eDataType, String initialValue) {
		UnitsOfTimeList result = UnitsOfTimeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitsOfTimeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseList createUseListFromString(EDataType eDataType, String initialValue) {
		UseList result = UseList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUseListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableTypeList createVariableTypeListFromString(EDataType eDataType, String initialValue) {
		VariableTypeList result = VariableTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVariableTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VConfidentialityClassificationList createVConfidentialityClassificationListFromString(EDataType eDataType, String initialValue) {
		VConfidentialityClassificationList result = VConfidentialityClassificationList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVConfidentialityClassificationListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionBaseList createVisionBaseListFromString(EDataType eDataType, String initialValue) {
		VisionBaseList result = VisionBaseList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisionBaseListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionEyesList createVisionEyesListFromString(EDataType eDataType, String initialValue) {
		VisionEyesList result = VisionEyesList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisionEyesListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPathUsageTypeList createXPathUsageTypeListFromString(EDataType eDataType, String initialValue) {
		XPathUsageTypeList result = XPathUsageTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXPathUsageTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountStatusList createAccountStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createAccountStatusListFromString(FhirPackage.eINSTANCE.getAccountStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccountStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAccountStatusListToString(FhirPackage.eINSTANCE.getAccountStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionCardinalityBehaviorList createActionCardinalityBehaviorListObjectFromString(EDataType eDataType, String initialValue) {
		return createActionCardinalityBehaviorListFromString(FhirPackage.eINSTANCE.getActionCardinalityBehaviorList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionCardinalityBehaviorListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertActionCardinalityBehaviorListToString(FhirPackage.eINSTANCE.getActionCardinalityBehaviorList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionConditionKindList createActionConditionKindListObjectFromString(EDataType eDataType, String initialValue) {
		return createActionConditionKindListFromString(FhirPackage.eINSTANCE.getActionConditionKindList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionConditionKindListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertActionConditionKindListToString(FhirPackage.eINSTANCE.getActionConditionKindList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionGroupingBehaviorList createActionGroupingBehaviorListObjectFromString(EDataType eDataType, String initialValue) {
		return createActionGroupingBehaviorListFromString(FhirPackage.eINSTANCE.getActionGroupingBehaviorList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionGroupingBehaviorListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertActionGroupingBehaviorListToString(FhirPackage.eINSTANCE.getActionGroupingBehaviorList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionParticipantTypeList createActionParticipantTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createActionParticipantTypeListFromString(FhirPackage.eINSTANCE.getActionParticipantTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionParticipantTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertActionParticipantTypeListToString(FhirPackage.eINSTANCE.getActionParticipantTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionPrecheckBehaviorList createActionPrecheckBehaviorListObjectFromString(EDataType eDataType, String initialValue) {
		return createActionPrecheckBehaviorListFromString(FhirPackage.eINSTANCE.getActionPrecheckBehaviorList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionPrecheckBehaviorListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertActionPrecheckBehaviorListToString(FhirPackage.eINSTANCE.getActionPrecheckBehaviorList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionRelationshipTypeList createActionRelationshipTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createActionRelationshipTypeListFromString(FhirPackage.eINSTANCE.getActionRelationshipTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionRelationshipTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertActionRelationshipTypeListToString(FhirPackage.eINSTANCE.getActionRelationshipTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionRequiredBehaviorList createActionRequiredBehaviorListObjectFromString(EDataType eDataType, String initialValue) {
		return createActionRequiredBehaviorListFromString(FhirPackage.eINSTANCE.getActionRequiredBehaviorList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionRequiredBehaviorListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertActionRequiredBehaviorListToString(FhirPackage.eINSTANCE.getActionRequiredBehaviorList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionSelectionBehaviorList createActionSelectionBehaviorListObjectFromString(EDataType eDataType, String initialValue) {
		return createActionSelectionBehaviorListFromString(FhirPackage.eINSTANCE.getActionSelectionBehaviorList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionSelectionBehaviorListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertActionSelectionBehaviorListToString(FhirPackage.eINSTANCE.getActionSelectionBehaviorList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressTypeList createAddressTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createAddressTypeListFromString(FhirPackage.eINSTANCE.getAddressTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAddressTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAddressTypeListToString(FhirPackage.eINSTANCE.getAddressTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressUseList createAddressUseListObjectFromString(EDataType eDataType, String initialValue) {
		return createAddressUseListFromString(FhirPackage.eINSTANCE.getAddressUseList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAddressUseListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAddressUseListToString(FhirPackage.eINSTANCE.getAddressUseList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdministrativeGenderList createAdministrativeGenderListObjectFromString(EDataType eDataType, String initialValue) {
		return createAdministrativeGenderListFromString(FhirPackage.eINSTANCE.getAdministrativeGenderList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdministrativeGenderListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAdministrativeGenderListToString(FhirPackage.eINSTANCE.getAdministrativeGenderList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdverseEventActualityList createAdverseEventActualityListObjectFromString(EDataType eDataType, String initialValue) {
		return createAdverseEventActualityListFromString(FhirPackage.eINSTANCE.getAdverseEventActualityList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdverseEventActualityListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAdverseEventActualityListToString(FhirPackage.eINSTANCE.getAdverseEventActualityList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationModeList createAggregationModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createAggregationModeListFromString(FhirPackage.eINSTANCE.getAggregationModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregationModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAggregationModeListToString(FhirPackage.eINSTANCE.getAggregationModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceCategoryList createAllergyIntoleranceCategoryListObjectFromString(EDataType eDataType, String initialValue) {
		return createAllergyIntoleranceCategoryListFromString(FhirPackage.eINSTANCE.getAllergyIntoleranceCategoryList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceCategoryListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAllergyIntoleranceCategoryListToString(FhirPackage.eINSTANCE.getAllergyIntoleranceCategoryList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceCriticalityList createAllergyIntoleranceCriticalityListObjectFromString(EDataType eDataType, String initialValue) {
		return createAllergyIntoleranceCriticalityListFromString(FhirPackage.eINSTANCE.getAllergyIntoleranceCriticalityList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceCriticalityListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAllergyIntoleranceCriticalityListToString(FhirPackage.eINSTANCE.getAllergyIntoleranceCriticalityList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceSeverityList createAllergyIntoleranceSeverityListObjectFromString(EDataType eDataType, String initialValue) {
		return createAllergyIntoleranceSeverityListFromString(FhirPackage.eINSTANCE.getAllergyIntoleranceSeverityList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceSeverityListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAllergyIntoleranceSeverityListToString(FhirPackage.eINSTANCE.getAllergyIntoleranceSeverityList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceTypeList createAllergyIntoleranceTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createAllergyIntoleranceTypeListFromString(FhirPackage.eINSTANCE.getAllergyIntoleranceTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAllergyIntoleranceTypeListToString(FhirPackage.eINSTANCE.getAllergyIntoleranceTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppointmentStatusList createAppointmentStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createAppointmentStatusListFromString(FhirPackage.eINSTANCE.getAppointmentStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAppointmentStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAppointmentStatusListToString(FhirPackage.eINSTANCE.getAppointmentStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionDirectionTypeList createAssertionDirectionTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createAssertionDirectionTypeListFromString(FhirPackage.eINSTANCE.getAssertionDirectionTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssertionDirectionTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAssertionDirectionTypeListToString(FhirPackage.eINSTANCE.getAssertionDirectionTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionOperatorTypeList createAssertionOperatorTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createAssertionOperatorTypeListFromString(FhirPackage.eINSTANCE.getAssertionOperatorTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssertionOperatorTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAssertionOperatorTypeListToString(FhirPackage.eINSTANCE.getAssertionOperatorTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionResponseTypesList createAssertionResponseTypesListObjectFromString(EDataType eDataType, String initialValue) {
		return createAssertionResponseTypesListFromString(FhirPackage.eINSTANCE.getAssertionResponseTypesList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssertionResponseTypesListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAssertionResponseTypesListToString(FhirPackage.eINSTANCE.getAssertionResponseTypesList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventActionList createAuditEventActionListObjectFromString(EDataType eDataType, String initialValue) {
		return createAuditEventActionListFromString(FhirPackage.eINSTANCE.getAuditEventActionList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventActionListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAuditEventActionListToString(FhirPackage.eINSTANCE.getAuditEventActionList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventAgentNetworkTypeList createAuditEventAgentNetworkTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createAuditEventAgentNetworkTypeListFromString(FhirPackage.eINSTANCE.getAuditEventAgentNetworkTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventAgentNetworkTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAuditEventAgentNetworkTypeListToString(FhirPackage.eINSTANCE.getAuditEventAgentNetworkTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventOutcomeList createAuditEventOutcomeListObjectFromString(EDataType eDataType, String initialValue) {
		return createAuditEventOutcomeListFromString(FhirPackage.eINSTANCE.getAuditEventOutcomeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventOutcomeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAuditEventOutcomeListToString(FhirPackage.eINSTANCE.getAuditEventOutcomeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] createBase64BinaryPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (byte[])XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BASE64_BINARY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBase64BinaryPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BASE64_BINARY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingStrengthList createBindingStrengthListObjectFromString(EDataType eDataType, String initialValue) {
		return createBindingStrengthListFromString(FhirPackage.eINSTANCE.getBindingStrengthList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBindingStrengthListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBindingStrengthListToString(FhirPackage.eINSTANCE.getBindingStrengthList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BiologicallyDerivedProductCategoryList createBiologicallyDerivedProductCategoryListObjectFromString(EDataType eDataType, String initialValue) {
		return createBiologicallyDerivedProductCategoryListFromString(FhirPackage.eINSTANCE.getBiologicallyDerivedProductCategoryList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBiologicallyDerivedProductCategoryListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBiologicallyDerivedProductCategoryListToString(FhirPackage.eINSTANCE.getBiologicallyDerivedProductCategoryList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BiologicallyDerivedProductStatusList createBiologicallyDerivedProductStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createBiologicallyDerivedProductStatusListFromString(FhirPackage.eINSTANCE.getBiologicallyDerivedProductStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBiologicallyDerivedProductStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBiologicallyDerivedProductStatusListToString(FhirPackage.eINSTANCE.getBiologicallyDerivedProductStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BiologicallyDerivedProductStorageScaleList createBiologicallyDerivedProductStorageScaleListObjectFromString(EDataType eDataType, String initialValue) {
		return createBiologicallyDerivedProductStorageScaleListFromString(FhirPackage.eINSTANCE.getBiologicallyDerivedProductStorageScaleList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBiologicallyDerivedProductStorageScaleListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBiologicallyDerivedProductStorageScaleListToString(FhirPackage.eINSTANCE.getBiologicallyDerivedProductStorageScaleList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createBooleanPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (Boolean)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BOOLEAN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BOOLEAN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createBooleanPrimitiveObjectFromString(EDataType eDataType, String initialValue) {
		return createBooleanPrimitiveFromString(FhirPackage.eINSTANCE.getBooleanPrimitive(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanPrimitiveObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBooleanPrimitiveToString(FhirPackage.eINSTANCE.getBooleanPrimitive(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleTypeList createBundleTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createBundleTypeListFromString(FhirPackage.eINSTANCE.getBundleTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBundleTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBundleTypeListToString(FhirPackage.eINSTANCE.getBundleTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCanonicalPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCanonicalPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementKindList createCapabilityStatementKindListObjectFromString(EDataType eDataType, String initialValue) {
		return createCapabilityStatementKindListFromString(FhirPackage.eINSTANCE.getCapabilityStatementKindList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCapabilityStatementKindListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCapabilityStatementKindListToString(FhirPackage.eINSTANCE.getCapabilityStatementKindList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanActivityKindList createCarePlanActivityKindListObjectFromString(EDataType eDataType, String initialValue) {
		return createCarePlanActivityKindListFromString(FhirPackage.eINSTANCE.getCarePlanActivityKindList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCarePlanActivityKindListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCarePlanActivityKindListToString(FhirPackage.eINSTANCE.getCarePlanActivityKindList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanActivityStatusList createCarePlanActivityStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createCarePlanActivityStatusListFromString(FhirPackage.eINSTANCE.getCarePlanActivityStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCarePlanActivityStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCarePlanActivityStatusListToString(FhirPackage.eINSTANCE.getCarePlanActivityStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanIntentList createCarePlanIntentListObjectFromString(EDataType eDataType, String initialValue) {
		return createCarePlanIntentListFromString(FhirPackage.eINSTANCE.getCarePlanIntentList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCarePlanIntentListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCarePlanIntentListToString(FhirPackage.eINSTANCE.getCarePlanIntentList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CareTeamStatusList createCareTeamStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createCareTeamStatusListFromString(FhirPackage.eINSTANCE.getCareTeamStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCareTeamStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCareTeamStatusListToString(FhirPackage.eINSTANCE.getCareTeamStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogEntryRelationTypeList createCatalogEntryRelationTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createCatalogEntryRelationTypeListFromString(FhirPackage.eINSTANCE.getCatalogEntryRelationTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCatalogEntryRelationTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCatalogEntryRelationTypeListToString(FhirPackage.eINSTANCE.getCatalogEntryRelationTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChargeItemStatusList createChargeItemStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createChargeItemStatusListFromString(FhirPackage.eINSTANCE.getChargeItemStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChargeItemStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertChargeItemStatusListToString(FhirPackage.eINSTANCE.getChargeItemStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimProcessingCodesList createClaimProcessingCodesListObjectFromString(EDataType eDataType, String initialValue) {
		return createClaimProcessingCodesListFromString(FhirPackage.eINSTANCE.getClaimProcessingCodesList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClaimProcessingCodesListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertClaimProcessingCodesListToString(FhirPackage.eINSTANCE.getClaimProcessingCodesList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalImpressionStatusList createClinicalImpressionStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createClinicalImpressionStatusListFromString(FhirPackage.eINSTANCE.getClinicalImpressionStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClinicalImpressionStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertClinicalImpressionStatusListToString(FhirPackage.eINSTANCE.getClinicalImpressionStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCodePrimitiveFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodePrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSearchSupportList createCodeSearchSupportListObjectFromString(EDataType eDataType, String initialValue) {
		return createCodeSearchSupportListFromString(FhirPackage.eINSTANCE.getCodeSearchSupportList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodeSearchSupportListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCodeSearchSupportListToString(FhirPackage.eINSTANCE.getCodeSearchSupportList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemContentModeList createCodeSystemContentModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createCodeSystemContentModeListFromString(FhirPackage.eINSTANCE.getCodeSystemContentModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodeSystemContentModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCodeSystemContentModeListToString(FhirPackage.eINSTANCE.getCodeSystemContentModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemHierarchyMeaningList createCodeSystemHierarchyMeaningListObjectFromString(EDataType eDataType, String initialValue) {
		return createCodeSystemHierarchyMeaningListFromString(FhirPackage.eINSTANCE.getCodeSystemHierarchyMeaningList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodeSystemHierarchyMeaningListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCodeSystemHierarchyMeaningListToString(FhirPackage.eINSTANCE.getCodeSystemHierarchyMeaningList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentTypeList createCompartmentTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createCompartmentTypeListFromString(FhirPackage.eINSTANCE.getCompartmentTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompartmentTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCompartmentTypeListToString(FhirPackage.eINSTANCE.getCompartmentTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionAttestationModeList createCompositionAttestationModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createCompositionAttestationModeListFromString(FhirPackage.eINSTANCE.getCompositionAttestationModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompositionAttestationModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCompositionAttestationModeListToString(FhirPackage.eINSTANCE.getCompositionAttestationModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionStatusList createCompositionStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createCompositionStatusListFromString(FhirPackage.eINSTANCE.getCompositionStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompositionStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCompositionStatusListToString(FhirPackage.eINSTANCE.getCompositionStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapEquivalenceList createConceptMapEquivalenceListObjectFromString(EDataType eDataType, String initialValue) {
		return createConceptMapEquivalenceListFromString(FhirPackage.eINSTANCE.getConceptMapEquivalenceList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConceptMapEquivalenceListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConceptMapEquivalenceListToString(FhirPackage.eINSTANCE.getConceptMapEquivalenceList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapGroupUnmappedModeList createConceptMapGroupUnmappedModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createConceptMapGroupUnmappedModeListFromString(FhirPackage.eINSTANCE.getConceptMapGroupUnmappedModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConceptMapGroupUnmappedModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConceptMapGroupUnmappedModeListToString(FhirPackage.eINSTANCE.getConceptMapGroupUnmappedModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalDeleteStatusList createConditionalDeleteStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createConditionalDeleteStatusListFromString(FhirPackage.eINSTANCE.getConditionalDeleteStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionalDeleteStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConditionalDeleteStatusListToString(FhirPackage.eINSTANCE.getConditionalDeleteStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalReadStatusList createConditionalReadStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createConditionalReadStatusListFromString(FhirPackage.eINSTANCE.getConditionalReadStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionalReadStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConditionalReadStatusListToString(FhirPackage.eINSTANCE.getConditionalReadStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentDataMeaningList createConsentDataMeaningListObjectFromString(EDataType eDataType, String initialValue) {
		return createConsentDataMeaningListFromString(FhirPackage.eINSTANCE.getConsentDataMeaningList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsentDataMeaningListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConsentDataMeaningListToString(FhirPackage.eINSTANCE.getConsentDataMeaningList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentProvisionTypeList createConsentProvisionTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createConsentProvisionTypeListFromString(FhirPackage.eINSTANCE.getConsentProvisionTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsentProvisionTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConsentProvisionTypeListToString(FhirPackage.eINSTANCE.getConsentProvisionTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentStateList createConsentStateListObjectFromString(EDataType eDataType, String initialValue) {
		return createConsentStateListFromString(FhirPackage.eINSTANCE.getConsentStateList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsentStateListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConsentStateListToString(FhirPackage.eINSTANCE.getConsentStateList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintSeverityList createConstraintSeverityListObjectFromString(EDataType eDataType, String initialValue) {
		return createConstraintSeverityListFromString(FhirPackage.eINSTANCE.getConstraintSeverityList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConstraintSeverityListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConstraintSeverityListToString(FhirPackage.eINSTANCE.getConstraintSeverityList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactPointSystemList createContactPointSystemListObjectFromString(EDataType eDataType, String initialValue) {
		return createContactPointSystemListFromString(FhirPackage.eINSTANCE.getContactPointSystemList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContactPointSystemListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertContactPointSystemListToString(FhirPackage.eINSTANCE.getContactPointSystemList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactPointUseList createContactPointUseListObjectFromString(EDataType eDataType, String initialValue) {
		return createContactPointUseListFromString(FhirPackage.eINSTANCE.getContactPointUseList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContactPointUseListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertContactPointUseListToString(FhirPackage.eINSTANCE.getContactPointUseList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractResourcePublicationStatusCodesList createContractResourcePublicationStatusCodesListObjectFromString(EDataType eDataType, String initialValue) {
		return createContractResourcePublicationStatusCodesListFromString(FhirPackage.eINSTANCE.getContractResourcePublicationStatusCodesList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContractResourcePublicationStatusCodesListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertContractResourcePublicationStatusCodesListToString(FhirPackage.eINSTANCE.getContractResourcePublicationStatusCodesList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractResourceStatusCodesList createContractResourceStatusCodesListObjectFromString(EDataType eDataType, String initialValue) {
		return createContractResourceStatusCodesListFromString(FhirPackage.eINSTANCE.getContractResourceStatusCodesList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContractResourceStatusCodesListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertContractResourceStatusCodesListToString(FhirPackage.eINSTANCE.getContractResourceStatusCodesList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContributorTypeList createContributorTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createContributorTypeListFromString(FhirPackage.eINSTANCE.getContributorTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContributorTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertContributorTypeListToString(FhirPackage.eINSTANCE.getContributorTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createDatePrimitiveFromString(EDataType eDataType, String initialValue) {
		return createDatePrimitiveBaseFromString(FhirPackage.eINSTANCE.getDatePrimitiveBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatePrimitiveToString(EDataType eDataType, Object instanceValue) {
		return convertDatePrimitiveBaseToString(FhirPackage.eINSTANCE.getDatePrimitiveBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createDatePrimitiveBaseFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		XMLGregorianCalendar result = null;
		RuntimeException exception = null;
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.GYEAR, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.GYEAR_MONTH, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatePrimitiveBaseToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.GYEAR.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.GYEAR, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.GYEAR_MONTH.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.GYEAR_MONTH, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.DATE.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createDateTimePrimitiveFromString(EDataType eDataType, String initialValue) {
		return createDateTimePrimitiveBaseFromString(FhirPackage.eINSTANCE.getDateTimePrimitiveBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateTimePrimitiveToString(EDataType eDataType, Object instanceValue) {
		return convertDateTimePrimitiveBaseToString(FhirPackage.eINSTANCE.getDateTimePrimitiveBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createDateTimePrimitiveBaseFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		XMLGregorianCalendar result = null;
		RuntimeException exception = null;
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.GYEAR, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.GYEAR_MONTH, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE_TIME, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateTimePrimitiveBaseToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.GYEAR.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.GYEAR, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.GYEAR_MONTH.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.GYEAR_MONTH, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.DATE.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.DATE_TIME.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE_TIME, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaysOfWeekList createDaysOfWeekListObjectFromString(EDataType eDataType, String initialValue) {
		return createDaysOfWeekListFromString(FhirPackage.eINSTANCE.getDaysOfWeekList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDaysOfWeekListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDaysOfWeekListToString(FhirPackage.eINSTANCE.getDaysOfWeekList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createDecimalPrimitiveFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDecimalPrimitiveToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.DECIMAL.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.DOUBLE.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetectedIssueSeverityList createDetectedIssueSeverityListObjectFromString(EDataType eDataType, String initialValue) {
		return createDetectedIssueSeverityListFromString(FhirPackage.eINSTANCE.getDetectedIssueSeverityList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDetectedIssueSeverityListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDetectedIssueSeverityListToString(FhirPackage.eINSTANCE.getDetectedIssueSeverityList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCalibrationStateList createDeviceMetricCalibrationStateListObjectFromString(EDataType eDataType, String initialValue) {
		return createDeviceMetricCalibrationStateListFromString(FhirPackage.eINSTANCE.getDeviceMetricCalibrationStateList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricCalibrationStateListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeviceMetricCalibrationStateListToString(FhirPackage.eINSTANCE.getDeviceMetricCalibrationStateList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCalibrationTypeList createDeviceMetricCalibrationTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createDeviceMetricCalibrationTypeListFromString(FhirPackage.eINSTANCE.getDeviceMetricCalibrationTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricCalibrationTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeviceMetricCalibrationTypeListToString(FhirPackage.eINSTANCE.getDeviceMetricCalibrationTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCategoryList createDeviceMetricCategoryListObjectFromString(EDataType eDataType, String initialValue) {
		return createDeviceMetricCategoryListFromString(FhirPackage.eINSTANCE.getDeviceMetricCategoryList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricCategoryListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeviceMetricCategoryListToString(FhirPackage.eINSTANCE.getDeviceMetricCategoryList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricColorList createDeviceMetricColorListObjectFromString(EDataType eDataType, String initialValue) {
		return createDeviceMetricColorListFromString(FhirPackage.eINSTANCE.getDeviceMetricColorList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricColorListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeviceMetricColorListToString(FhirPackage.eINSTANCE.getDeviceMetricColorList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricOperationalStatusList createDeviceMetricOperationalStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createDeviceMetricOperationalStatusListFromString(FhirPackage.eINSTANCE.getDeviceMetricOperationalStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricOperationalStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeviceMetricOperationalStatusListToString(FhirPackage.eINSTANCE.getDeviceMetricOperationalStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceNameTypeList createDeviceNameTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createDeviceNameTypeListFromString(FhirPackage.eINSTANCE.getDeviceNameTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceNameTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeviceNameTypeListToString(FhirPackage.eINSTANCE.getDeviceNameTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceUseStatementStatusList createDeviceUseStatementStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createDeviceUseStatementStatusListFromString(FhirPackage.eINSTANCE.getDeviceUseStatementStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceUseStatementStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeviceUseStatementStatusListToString(FhirPackage.eINSTANCE.getDeviceUseStatementStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticReportStatusList createDiagnosticReportStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createDiagnosticReportStatusListFromString(FhirPackage.eINSTANCE.getDiagnosticReportStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiagnosticReportStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDiagnosticReportStatusListToString(FhirPackage.eINSTANCE.getDiagnosticReportStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscriminatorTypeList createDiscriminatorTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createDiscriminatorTypeListFromString(FhirPackage.eINSTANCE.getDiscriminatorTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiscriminatorTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDiscriminatorTypeListToString(FhirPackage.eINSTANCE.getDiscriminatorTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentModeList createDocumentModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createDocumentModeListFromString(FhirPackage.eINSTANCE.getDocumentModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDocumentModeListToString(FhirPackage.eINSTANCE.getDocumentModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReferenceStatusList createDocumentReferenceStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createDocumentReferenceStatusListFromString(FhirPackage.eINSTANCE.getDocumentReferenceStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentReferenceStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDocumentReferenceStatusListToString(FhirPackage.eINSTANCE.getDocumentReferenceStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRelationshipTypeList createDocumentRelationshipTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createDocumentRelationshipTypeListFromString(FhirPackage.eINSTANCE.getDocumentRelationshipTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentRelationshipTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDocumentRelationshipTypeListToString(FhirPackage.eINSTANCE.getDocumentRelationshipTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityRequestPurposeList createEligibilityRequestPurposeListObjectFromString(EDataType eDataType, String initialValue) {
		return createEligibilityRequestPurposeListFromString(FhirPackage.eINSTANCE.getEligibilityRequestPurposeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEligibilityRequestPurposeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEligibilityRequestPurposeListToString(FhirPackage.eINSTANCE.getEligibilityRequestPurposeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityResponsePurposeList createEligibilityResponsePurposeListObjectFromString(EDataType eDataType, String initialValue) {
		return createEligibilityResponsePurposeListFromString(FhirPackage.eINSTANCE.getEligibilityResponsePurposeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEligibilityResponsePurposeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEligibilityResponsePurposeListToString(FhirPackage.eINSTANCE.getEligibilityResponsePurposeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnableWhenBehaviorList createEnableWhenBehaviorListObjectFromString(EDataType eDataType, String initialValue) {
		return createEnableWhenBehaviorListFromString(FhirPackage.eINSTANCE.getEnableWhenBehaviorList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnableWhenBehaviorListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEnableWhenBehaviorListToString(FhirPackage.eINSTANCE.getEnableWhenBehaviorList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterLocationStatusList createEncounterLocationStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createEncounterLocationStatusListFromString(FhirPackage.eINSTANCE.getEncounterLocationStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncounterLocationStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEncounterLocationStatusListToString(FhirPackage.eINSTANCE.getEncounterLocationStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterStatusList createEncounterStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createEncounterStatusListFromString(FhirPackage.eINSTANCE.getEncounterStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncounterStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEncounterStatusListToString(FhirPackage.eINSTANCE.getEncounterStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointStatusList createEndpointStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createEndpointStatusListFromString(FhirPackage.eINSTANCE.getEndpointStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEndpointStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEndpointStatusListToString(FhirPackage.eINSTANCE.getEndpointStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodeOfCareStatusList createEpisodeOfCareStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createEpisodeOfCareStatusListFromString(FhirPackage.eINSTANCE.getEpisodeOfCareStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEpisodeOfCareStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEpisodeOfCareStatusListToString(FhirPackage.eINSTANCE.getEpisodeOfCareStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventCapabilityModeList createEventCapabilityModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createEventCapabilityModeListFromString(FhirPackage.eINSTANCE.getEventCapabilityModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventCapabilityModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEventCapabilityModeListToString(FhirPackage.eINSTANCE.getEventCapabilityModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventStatusList createEventStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createEventStatusListFromString(FhirPackage.eINSTANCE.getEventStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEventStatusListToString(FhirPackage.eINSTANCE.getEventStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventTimingList createEventTimingListObjectFromString(EDataType eDataType, String initialValue) {
		return createEventTimingListFromString(FhirPackage.eINSTANCE.getEventTimingList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventTimingListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEventTimingListToString(FhirPackage.eINSTANCE.getEventTimingList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceVariableTypeList createEvidenceVariableTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createEvidenceVariableTypeListFromString(FhirPackage.eINSTANCE.getEvidenceVariableTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEvidenceVariableTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEvidenceVariableTypeListToString(FhirPackage.eINSTANCE.getEvidenceVariableTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleScenarioActorTypeList createExampleScenarioActorTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createExampleScenarioActorTypeListFromString(FhirPackage.eINSTANCE.getExampleScenarioActorTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExampleScenarioActorTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertExampleScenarioActorTypeListToString(FhirPackage.eINSTANCE.getExampleScenarioActorTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitStatusList createExplanationOfBenefitStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createExplanationOfBenefitStatusListFromString(FhirPackage.eINSTANCE.getExplanationOfBenefitStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExplanationOfBenefitStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertExplanationOfBenefitStatusListToString(FhirPackage.eINSTANCE.getExplanationOfBenefitStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExposureStateList createExposureStateListObjectFromString(EDataType eDataType, String initialValue) {
		return createExposureStateListFromString(FhirPackage.eINSTANCE.getExposureStateList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExposureStateListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertExposureStateListToString(FhirPackage.eINSTANCE.getExposureStateList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionLanguageList createExpressionLanguageListObjectFromString(EDataType eDataType, String initialValue) {
		return createExpressionLanguageListFromString(FhirPackage.eINSTANCE.getExpressionLanguageList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExpressionLanguageListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertExpressionLanguageListToString(FhirPackage.eINSTANCE.getExpressionLanguageList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionContextTypeList createExtensionContextTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createExtensionContextTypeListFromString(FhirPackage.eINSTANCE.getExtensionContextTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExtensionContextTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertExtensionContextTypeListToString(FhirPackage.eINSTANCE.getExtensionContextTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistoryStatusList createFamilyHistoryStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createFamilyHistoryStatusListFromString(FhirPackage.eINSTANCE.getFamilyHistoryStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFamilyHistoryStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFamilyHistoryStatusListToString(FhirPackage.eINSTANCE.getFamilyHistoryStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHIRDeviceStatusList createFHIRDeviceStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createFHIRDeviceStatusListFromString(FhirPackage.eINSTANCE.getFHIRDeviceStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFHIRDeviceStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFHIRDeviceStatusListToString(FhirPackage.eINSTANCE.getFHIRDeviceStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHIRSubstanceStatusList createFHIRSubstanceStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createFHIRSubstanceStatusListFromString(FhirPackage.eINSTANCE.getFHIRSubstanceStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFHIRSubstanceStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFHIRSubstanceStatusListToString(FhirPackage.eINSTANCE.getFHIRSubstanceStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHIRVersionList createFHIRVersionListObjectFromString(EDataType eDataType, String initialValue) {
		return createFHIRVersionListFromString(FhirPackage.eINSTANCE.getFHIRVersionList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFHIRVersionListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFHIRVersionListToString(FhirPackage.eINSTANCE.getFHIRVersionList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterOperatorList createFilterOperatorListObjectFromString(EDataType eDataType, String initialValue) {
		return createFilterOperatorListFromString(FhirPackage.eINSTANCE.getFilterOperatorList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFilterOperatorListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFilterOperatorListToString(FhirPackage.eINSTANCE.getFilterOperatorList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinancialResourceStatusCodesList createFinancialResourceStatusCodesListObjectFromString(EDataType eDataType, String initialValue) {
		return createFinancialResourceStatusCodesListFromString(FhirPackage.eINSTANCE.getFinancialResourceStatusCodesList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFinancialResourceStatusCodesListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFinancialResourceStatusCodesListToString(FhirPackage.eINSTANCE.getFinancialResourceStatusCodesList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlagStatusList createFlagStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createFlagStatusListFromString(FhirPackage.eINSTANCE.getFlagStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFlagStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFlagStatusListToString(FhirPackage.eINSTANCE.getFlagStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalLifecycleStatusList createGoalLifecycleStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createGoalLifecycleStatusListFromString(FhirPackage.eINSTANCE.getGoalLifecycleStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGoalLifecycleStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGoalLifecycleStatusListToString(FhirPackage.eINSTANCE.getGoalLifecycleStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphCompartmentRuleList createGraphCompartmentRuleListObjectFromString(EDataType eDataType, String initialValue) {
		return createGraphCompartmentRuleListFromString(FhirPackage.eINSTANCE.getGraphCompartmentRuleList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGraphCompartmentRuleListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGraphCompartmentRuleListToString(FhirPackage.eINSTANCE.getGraphCompartmentRuleList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphCompartmentUseList createGraphCompartmentUseListObjectFromString(EDataType eDataType, String initialValue) {
		return createGraphCompartmentUseListFromString(FhirPackage.eINSTANCE.getGraphCompartmentUseList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGraphCompartmentUseListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGraphCompartmentUseListToString(FhirPackage.eINSTANCE.getGraphCompartmentUseList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupMeasureList createGroupMeasureListObjectFromString(EDataType eDataType, String initialValue) {
		return createGroupMeasureListFromString(FhirPackage.eINSTANCE.getGroupMeasureList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroupMeasureListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGroupMeasureListToString(FhirPackage.eINSTANCE.getGroupMeasureList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupTypeList createGroupTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createGroupTypeListFromString(FhirPackage.eINSTANCE.getGroupTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroupTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGroupTypeListToString(FhirPackage.eINSTANCE.getGroupTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuidanceResponseStatusList createGuidanceResponseStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createGuidanceResponseStatusListFromString(FhirPackage.eINSTANCE.getGuidanceResponseStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGuidanceResponseStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGuidanceResponseStatusListToString(FhirPackage.eINSTANCE.getGuidanceResponseStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuidePageGenerationList createGuidePageGenerationListObjectFromString(EDataType eDataType, String initialValue) {
		return createGuidePageGenerationListFromString(FhirPackage.eINSTANCE.getGuidePageGenerationList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGuidePageGenerationListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGuidePageGenerationListToString(FhirPackage.eINSTANCE.getGuidePageGenerationList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuideParameterCodeList createGuideParameterCodeListObjectFromString(EDataType eDataType, String initialValue) {
		return createGuideParameterCodeListFromString(FhirPackage.eINSTANCE.getGuideParameterCodeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGuideParameterCodeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGuideParameterCodeListToString(FhirPackage.eINSTANCE.getGuideParameterCodeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPVerbList createHTTPVerbListObjectFromString(EDataType eDataType, String initialValue) {
		return createHTTPVerbListFromString(FhirPackage.eINSTANCE.getHTTPVerbList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHTTPVerbListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertHTTPVerbListToString(FhirPackage.eINSTANCE.getHTTPVerbList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierUseList createIdentifierUseListObjectFromString(EDataType eDataType, String initialValue) {
		return createIdentifierUseListFromString(FhirPackage.eINSTANCE.getIdentifierUseList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentifierUseListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIdentifierUseListToString(FhirPackage.eINSTANCE.getIdentifierUseList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentityAssuranceLevelList createIdentityAssuranceLevelListObjectFromString(EDataType eDataType, String initialValue) {
		return createIdentityAssuranceLevelListFromString(FhirPackage.eINSTANCE.getIdentityAssuranceLevelList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentityAssuranceLevelListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIdentityAssuranceLevelListToString(FhirPackage.eINSTANCE.getIdentityAssuranceLevelList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIdPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingStudyStatusList createImagingStudyStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createImagingStudyStatusListFromString(FhirPackage.eINSTANCE.getImagingStudyStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImagingStudyStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertImagingStudyStatusListToString(FhirPackage.eINSTANCE.getImagingStudyStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationEvaluationStatusCodesList createImmunizationEvaluationStatusCodesListObjectFromString(EDataType eDataType, String initialValue) {
		return createImmunizationEvaluationStatusCodesListFromString(FhirPackage.eINSTANCE.getImmunizationEvaluationStatusCodesList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImmunizationEvaluationStatusCodesListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertImmunizationEvaluationStatusCodesListToString(FhirPackage.eINSTANCE.getImmunizationEvaluationStatusCodesList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationStatusCodesList createImmunizationStatusCodesListObjectFromString(EDataType eDataType, String initialValue) {
		return createImmunizationStatusCodesListFromString(FhirPackage.eINSTANCE.getImmunizationStatusCodesList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImmunizationStatusCodesListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertImmunizationStatusCodesListToString(FhirPackage.eINSTANCE.getImmunizationStatusCodesList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createInstantPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE_TIME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInstantPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE_TIME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createIntegerPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (Integer)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createIntegerPrimitiveObjectFromString(EDataType eDataType, String initialValue) {
		return createIntegerPrimitiveFromString(FhirPackage.eINSTANCE.getIntegerPrimitive(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerPrimitiveObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIntegerPrimitiveToString(FhirPackage.eINSTANCE.getIntegerPrimitive(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvoicePriceComponentTypeList createInvoicePriceComponentTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createInvoicePriceComponentTypeListFromString(FhirPackage.eINSTANCE.getInvoicePriceComponentTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvoicePriceComponentTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertInvoicePriceComponentTypeListToString(FhirPackage.eINSTANCE.getInvoicePriceComponentTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvoiceStatusList createInvoiceStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createInvoiceStatusListFromString(FhirPackage.eINSTANCE.getInvoiceStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvoiceStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertInvoiceStatusListToString(FhirPackage.eINSTANCE.getInvoiceStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueSeverityList createIssueSeverityListObjectFromString(EDataType eDataType, String initialValue) {
		return createIssueSeverityListFromString(FhirPackage.eINSTANCE.getIssueSeverityList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIssueSeverityListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIssueSeverityListToString(FhirPackage.eINSTANCE.getIssueSeverityList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueTypeList createIssueTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createIssueTypeListFromString(FhirPackage.eINSTANCE.getIssueTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIssueTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIssueTypeListToString(FhirPackage.eINSTANCE.getIssueTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkageTypeList createLinkageTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createLinkageTypeListFromString(FhirPackage.eINSTANCE.getLinkageTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinkageTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLinkageTypeListToString(FhirPackage.eINSTANCE.getLinkageTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkTypeList createLinkTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createLinkTypeListFromString(FhirPackage.eINSTANCE.getLinkTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinkTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLinkTypeListToString(FhirPackage.eINSTANCE.getLinkTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListModeList createListModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createListModeListFromString(FhirPackage.eINSTANCE.getListModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertListModeListToString(FhirPackage.eINSTANCE.getListModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListStatusList createListStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createListStatusListFromString(FhirPackage.eINSTANCE.getListStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertListStatusListToString(FhirPackage.eINSTANCE.getListStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationModeList createLocationModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createLocationModeListFromString(FhirPackage.eINSTANCE.getLocationModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocationModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLocationModeListToString(FhirPackage.eINSTANCE.getLocationModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationStatusList createLocationStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createLocationStatusListFromString(FhirPackage.eINSTANCE.getLocationStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocationStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLocationStatusListToString(FhirPackage.eINSTANCE.getLocationStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMarkdownPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMarkdownPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportStatusList createMeasureReportStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createMeasureReportStatusListFromString(FhirPackage.eINSTANCE.getMeasureReportStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasureReportStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMeasureReportStatusListToString(FhirPackage.eINSTANCE.getMeasureReportStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportTypeList createMeasureReportTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createMeasureReportTypeListFromString(FhirPackage.eINSTANCE.getMeasureReportTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasureReportTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMeasureReportTypeListToString(FhirPackage.eINSTANCE.getMeasureReportTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationRequestIntentList createMedicationRequestIntentListObjectFromString(EDataType eDataType, String initialValue) {
		return createMedicationRequestIntentListFromString(FhirPackage.eINSTANCE.getMedicationRequestIntentList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationRequestIntentListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMedicationRequestIntentListToString(FhirPackage.eINSTANCE.getMedicationRequestIntentList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationrequestStatusList createMedicationrequestStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createMedicationrequestStatusListFromString(FhirPackage.eINSTANCE.getMedicationrequestStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationrequestStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMedicationrequestStatusListToString(FhirPackage.eINSTANCE.getMedicationrequestStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatusCodesList createMedicationStatusCodesListObjectFromString(EDataType eDataType, String initialValue) {
		return createMedicationStatusCodesListFromString(FhirPackage.eINSTANCE.getMedicationStatusCodesList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationStatusCodesListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMedicationStatusCodesListToString(FhirPackage.eINSTANCE.getMedicationStatusCodesList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageheaderResponseRequestList createMessageheaderResponseRequestListObjectFromString(EDataType eDataType, String initialValue) {
		return createMessageheaderResponseRequestListFromString(FhirPackage.eINSTANCE.getMessageheaderResponseRequestList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageheaderResponseRequestListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMessageheaderResponseRequestListToString(FhirPackage.eINSTANCE.getMessageheaderResponseRequestList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSignificanceCategoryList createMessageSignificanceCategoryListObjectFromString(EDataType eDataType, String initialValue) {
		return createMessageSignificanceCategoryListFromString(FhirPackage.eINSTANCE.getMessageSignificanceCategoryList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageSignificanceCategoryListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMessageSignificanceCategoryListToString(FhirPackage.eINSTANCE.getMessageSignificanceCategoryList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameUseList createNameUseListObjectFromString(EDataType eDataType, String initialValue) {
		return createNameUseListFromString(FhirPackage.eINSTANCE.getNameUseList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameUseListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNameUseListToString(FhirPackage.eINSTANCE.getNameUseList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystemIdentifierTypeList createNamingSystemIdentifierTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createNamingSystemIdentifierTypeListFromString(FhirPackage.eINSTANCE.getNamingSystemIdentifierTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNamingSystemIdentifierTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNamingSystemIdentifierTypeListToString(FhirPackage.eINSTANCE.getNamingSystemIdentifierTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystemTypeList createNamingSystemTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createNamingSystemTypeListFromString(FhirPackage.eINSTANCE.getNamingSystemTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNamingSystemTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNamingSystemTypeListToString(FhirPackage.eINSTANCE.getNamingSystemTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NarrativeStatusList createNarrativeStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createNarrativeStatusListFromString(FhirPackage.eINSTANCE.getNarrativeStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNarrativeStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNarrativeStatusListToString(FhirPackage.eINSTANCE.getNarrativeStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteTypeList createNoteTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createNoteTypeListFromString(FhirPackage.eINSTANCE.getNoteTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNoteTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNoteTypeListToString(FhirPackage.eINSTANCE.getNoteTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationDataTypeList createObservationDataTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createObservationDataTypeListFromString(FhirPackage.eINSTANCE.getObservationDataTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObservationDataTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertObservationDataTypeListToString(FhirPackage.eINSTANCE.getObservationDataTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationRangeCategoryList createObservationRangeCategoryListObjectFromString(EDataType eDataType, String initialValue) {
		return createObservationRangeCategoryListFromString(FhirPackage.eINSTANCE.getObservationRangeCategoryList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObservationRangeCategoryListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertObservationRangeCategoryListToString(FhirPackage.eINSTANCE.getObservationRangeCategoryList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationStatusList createObservationStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createObservationStatusListFromString(FhirPackage.eINSTANCE.getObservationStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObservationStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertObservationStatusListToString(FhirPackage.eINSTANCE.getObservationStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOidPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOidPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationKindList createOperationKindListObjectFromString(EDataType eDataType, String initialValue) {
		return createOperationKindListFromString(FhirPackage.eINSTANCE.getOperationKindList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationKindListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOperationKindListToString(FhirPackage.eINSTANCE.getOperationKindList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationParameterUseList createOperationParameterUseListObjectFromString(EDataType eDataType, String initialValue) {
		return createOperationParameterUseListFromString(FhirPackage.eINSTANCE.getOperationParameterUseList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationParameterUseListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOperationParameterUseListToString(FhirPackage.eINSTANCE.getOperationParameterUseList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationTypeList createOrientationTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createOrientationTypeListFromString(FhirPackage.eINSTANCE.getOrientationTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOrientationTypeListToString(FhirPackage.eINSTANCE.getOrientationTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantRequiredList createParticipantRequiredListObjectFromString(EDataType eDataType, String initialValue) {
		return createParticipantRequiredListFromString(FhirPackage.eINSTANCE.getParticipantRequiredList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParticipantRequiredListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertParticipantRequiredListToString(FhirPackage.eINSTANCE.getParticipantRequiredList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipationStatusList createParticipationStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createParticipationStatusListFromString(FhirPackage.eINSTANCE.getParticipationStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParticipationStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertParticipationStatusListToString(FhirPackage.eINSTANCE.getParticipationStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createPositiveIntPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.POSITIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositiveIntPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.POSITIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyRepresentationList createPropertyRepresentationListObjectFromString(EDataType eDataType, String initialValue) {
		return createPropertyRepresentationListFromString(FhirPackage.eINSTANCE.getPropertyRepresentationList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyRepresentationListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPropertyRepresentationListToString(FhirPackage.eINSTANCE.getPropertyRepresentationList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyTypeList createPropertyTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createPropertyTypeListFromString(FhirPackage.eINSTANCE.getPropertyTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPropertyTypeListToString(FhirPackage.eINSTANCE.getPropertyTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvenanceEntityRoleList createProvenanceEntityRoleListObjectFromString(EDataType eDataType, String initialValue) {
		return createProvenanceEntityRoleListFromString(FhirPackage.eINSTANCE.getProvenanceEntityRoleList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProvenanceEntityRoleListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertProvenanceEntityRoleListToString(FhirPackage.eINSTANCE.getProvenanceEntityRoleList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicationStatusList createPublicationStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createPublicationStatusListFromString(FhirPackage.eINSTANCE.getPublicationStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPublicationStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPublicationStatusListToString(FhirPackage.eINSTANCE.getPublicationStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityTypeList createQualityTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createQualityTypeListFromString(FhirPackage.eINSTANCE.getQualityTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQualityTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertQualityTypeListToString(FhirPackage.eINSTANCE.getQualityTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantityComparatorList createQuantityComparatorListObjectFromString(EDataType eDataType, String initialValue) {
		return createQuantityComparatorListFromString(FhirPackage.eINSTANCE.getQuantityComparatorList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuantityComparatorListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertQuantityComparatorListToString(FhirPackage.eINSTANCE.getQuantityComparatorList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireItemOperatorList createQuestionnaireItemOperatorListObjectFromString(EDataType eDataType, String initialValue) {
		return createQuestionnaireItemOperatorListFromString(FhirPackage.eINSTANCE.getQuestionnaireItemOperatorList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuestionnaireItemOperatorListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertQuestionnaireItemOperatorListToString(FhirPackage.eINSTANCE.getQuestionnaireItemOperatorList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireItemTypeList createQuestionnaireItemTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createQuestionnaireItemTypeListFromString(FhirPackage.eINSTANCE.getQuestionnaireItemTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuestionnaireItemTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertQuestionnaireItemTypeListToString(FhirPackage.eINSTANCE.getQuestionnaireItemTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireResponseStatusList createQuestionnaireResponseStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createQuestionnaireResponseStatusListFromString(FhirPackage.eINSTANCE.getQuestionnaireResponseStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuestionnaireResponseStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertQuestionnaireResponseStatusListToString(FhirPackage.eINSTANCE.getQuestionnaireResponseStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceHandlingPolicyList createReferenceHandlingPolicyListObjectFromString(EDataType eDataType, String initialValue) {
		return createReferenceHandlingPolicyListFromString(FhirPackage.eINSTANCE.getReferenceHandlingPolicyList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferenceHandlingPolicyListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertReferenceHandlingPolicyListToString(FhirPackage.eINSTANCE.getReferenceHandlingPolicyList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceVersionRulesList createReferenceVersionRulesListObjectFromString(EDataType eDataType, String initialValue) {
		return createReferenceVersionRulesListFromString(FhirPackage.eINSTANCE.getReferenceVersionRulesList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferenceVersionRulesListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertReferenceVersionRulesListToString(FhirPackage.eINSTANCE.getReferenceVersionRulesList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedArtifactTypeList createRelatedArtifactTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createRelatedArtifactTypeListFromString(FhirPackage.eINSTANCE.getRelatedArtifactTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelatedArtifactTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRelatedArtifactTypeListToString(FhirPackage.eINSTANCE.getRelatedArtifactTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemittanceOutcomeList createRemittanceOutcomeListObjectFromString(EDataType eDataType, String initialValue) {
		return createRemittanceOutcomeListFromString(FhirPackage.eINSTANCE.getRemittanceOutcomeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRemittanceOutcomeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRemittanceOutcomeListToString(FhirPackage.eINSTANCE.getRemittanceOutcomeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryTypeList createRepositoryTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createRepositoryTypeListFromString(FhirPackage.eINSTANCE.getRepositoryTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRepositoryTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRepositoryTypeListToString(FhirPackage.eINSTANCE.getRepositoryTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestIntentList createRequestIntentListObjectFromString(EDataType eDataType, String initialValue) {
		return createRequestIntentListFromString(FhirPackage.eINSTANCE.getRequestIntentList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequestIntentListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRequestIntentListToString(FhirPackage.eINSTANCE.getRequestIntentList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestPriorityList createRequestPriorityListObjectFromString(EDataType eDataType, String initialValue) {
		return createRequestPriorityListFromString(FhirPackage.eINSTANCE.getRequestPriorityList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequestPriorityListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRequestPriorityListToString(FhirPackage.eINSTANCE.getRequestPriorityList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestResourceTypeList createRequestResourceTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createRequestResourceTypeListFromString(FhirPackage.eINSTANCE.getRequestResourceTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequestResourceTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRequestResourceTypeListToString(FhirPackage.eINSTANCE.getRequestResourceTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestStatusList createRequestStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createRequestStatusListFromString(FhirPackage.eINSTANCE.getRequestStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequestStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRequestStatusListToString(FhirPackage.eINSTANCE.getRequestStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchElementTypeList createResearchElementTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createResearchElementTypeListFromString(FhirPackage.eINSTANCE.getResearchElementTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResearchElementTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertResearchElementTypeListToString(FhirPackage.eINSTANCE.getResearchElementTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchStudyStatusList createResearchStudyStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createResearchStudyStatusListFromString(FhirPackage.eINSTANCE.getResearchStudyStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResearchStudyStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertResearchStudyStatusListToString(FhirPackage.eINSTANCE.getResearchStudyStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchSubjectStatusList createResearchSubjectStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createResearchSubjectStatusListFromString(FhirPackage.eINSTANCE.getResearchSubjectStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResearchSubjectStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertResearchSubjectStatusListToString(FhirPackage.eINSTANCE.getResearchSubjectStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceTypeList createResourceTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createResourceTypeListFromString(FhirPackage.eINSTANCE.getResourceTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertResourceTypeListToString(FhirPackage.eINSTANCE.getResourceTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceVersionPolicyList createResourceVersionPolicyListObjectFromString(EDataType eDataType, String initialValue) {
		return createResourceVersionPolicyListFromString(FhirPackage.eINSTANCE.getResourceVersionPolicyList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceVersionPolicyListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertResourceVersionPolicyListToString(FhirPackage.eINSTANCE.getResourceVersionPolicyList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseTypeList createResponseTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createResponseTypeListFromString(FhirPackage.eINSTANCE.getResponseTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResponseTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertResponseTypeListToString(FhirPackage.eINSTANCE.getResponseTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestfulCapabilityModeList createRestfulCapabilityModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createRestfulCapabilityModeListFromString(FhirPackage.eINSTANCE.getRestfulCapabilityModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRestfulCapabilityModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRestfulCapabilityModeListToString(FhirPackage.eINSTANCE.getRestfulCapabilityModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSampledDataDataTypePrimitiveFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSampledDataDataTypePrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchComparatorList createSearchComparatorListObjectFromString(EDataType eDataType, String initialValue) {
		return createSearchComparatorListFromString(FhirPackage.eINSTANCE.getSearchComparatorList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSearchComparatorListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSearchComparatorListToString(FhirPackage.eINSTANCE.getSearchComparatorList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchEntryModeList createSearchEntryModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createSearchEntryModeListFromString(FhirPackage.eINSTANCE.getSearchEntryModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSearchEntryModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSearchEntryModeListToString(FhirPackage.eINSTANCE.getSearchEntryModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchModifierCodeList createSearchModifierCodeListObjectFromString(EDataType eDataType, String initialValue) {
		return createSearchModifierCodeListFromString(FhirPackage.eINSTANCE.getSearchModifierCodeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSearchModifierCodeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSearchModifierCodeListToString(FhirPackage.eINSTANCE.getSearchModifierCodeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchParamTypeList createSearchParamTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createSearchParamTypeListFromString(FhirPackage.eINSTANCE.getSearchParamTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSearchParamTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSearchParamTypeListToString(FhirPackage.eINSTANCE.getSearchParamTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceTypeList createSequenceTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createSequenceTypeListFromString(FhirPackage.eINSTANCE.getSequenceTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSequenceTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSequenceTypeListToString(FhirPackage.eINSTANCE.getSequenceTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlicingRulesList createSlicingRulesListObjectFromString(EDataType eDataType, String initialValue) {
		return createSlicingRulesListFromString(FhirPackage.eINSTANCE.getSlicingRulesList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSlicingRulesListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSlicingRulesListToString(FhirPackage.eINSTANCE.getSlicingRulesList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlotStatusList createSlotStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createSlotStatusListFromString(FhirPackage.eINSTANCE.getSlotStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSlotStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSlotStatusListToString(FhirPackage.eINSTANCE.getSlotStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortDirectionList createSortDirectionListObjectFromString(EDataType eDataType, String initialValue) {
		return createSortDirectionListFromString(FhirPackage.eINSTANCE.getSortDirectionList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSortDirectionListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSortDirectionListToString(FhirPackage.eINSTANCE.getSortDirectionList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPDXLicenseList createSPDXLicenseListObjectFromString(EDataType eDataType, String initialValue) {
		return createSPDXLicenseListFromString(FhirPackage.eINSTANCE.getSPDXLicenseList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSPDXLicenseListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSPDXLicenseListToString(FhirPackage.eINSTANCE.getSPDXLicenseList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenContainedPreferenceList createSpecimenContainedPreferenceListObjectFromString(EDataType eDataType, String initialValue) {
		return createSpecimenContainedPreferenceListFromString(FhirPackage.eINSTANCE.getSpecimenContainedPreferenceList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpecimenContainedPreferenceListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSpecimenContainedPreferenceListToString(FhirPackage.eINSTANCE.getSpecimenContainedPreferenceList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenStatusList createSpecimenStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createSpecimenStatusListFromString(FhirPackage.eINSTANCE.getSpecimenStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpecimenStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSpecimenStatusListToString(FhirPackage.eINSTANCE.getSpecimenStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusList createStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createStatusListFromString(FhirPackage.eINSTANCE.getStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStatusListToString(FhirPackage.eINSTANCE.getStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrandTypeList createStrandTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createStrandTypeListFromString(FhirPackage.eINSTANCE.getStrandTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStrandTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStrandTypeListToString(FhirPackage.eINSTANCE.getStrandTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStringPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinitionKindList createStructureDefinitionKindListObjectFromString(EDataType eDataType, String initialValue) {
		return createStructureDefinitionKindListFromString(FhirPackage.eINSTANCE.getStructureDefinitionKindList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureDefinitionKindListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStructureDefinitionKindListToString(FhirPackage.eINSTANCE.getStructureDefinitionKindList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapContextTypeList createStructureMapContextTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createStructureMapContextTypeListFromString(FhirPackage.eINSTANCE.getStructureMapContextTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapContextTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStructureMapContextTypeListToString(FhirPackage.eINSTANCE.getStructureMapContextTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapGroupTypeModeList createStructureMapGroupTypeModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createStructureMapGroupTypeModeListFromString(FhirPackage.eINSTANCE.getStructureMapGroupTypeModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapGroupTypeModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStructureMapGroupTypeModeListToString(FhirPackage.eINSTANCE.getStructureMapGroupTypeModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapInputModeList createStructureMapInputModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createStructureMapInputModeListFromString(FhirPackage.eINSTANCE.getStructureMapInputModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapInputModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStructureMapInputModeListToString(FhirPackage.eINSTANCE.getStructureMapInputModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapModelModeList createStructureMapModelModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createStructureMapModelModeListFromString(FhirPackage.eINSTANCE.getStructureMapModelModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapModelModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStructureMapModelModeListToString(FhirPackage.eINSTANCE.getStructureMapModelModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapSourceListModeList createStructureMapSourceListModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createStructureMapSourceListModeListFromString(FhirPackage.eINSTANCE.getStructureMapSourceListModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapSourceListModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStructureMapSourceListModeListToString(FhirPackage.eINSTANCE.getStructureMapSourceListModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapTargetListModeList createStructureMapTargetListModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createStructureMapTargetListModeListFromString(FhirPackage.eINSTANCE.getStructureMapTargetListModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapTargetListModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStructureMapTargetListModeListToString(FhirPackage.eINSTANCE.getStructureMapTargetListModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapTransformList createStructureMapTransformListObjectFromString(EDataType eDataType, String initialValue) {
		return createStructureMapTransformListFromString(FhirPackage.eINSTANCE.getStructureMapTransformList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapTransformListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStructureMapTransformListToString(FhirPackage.eINSTANCE.getStructureMapTransformList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionChannelTypeList createSubscriptionChannelTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createSubscriptionChannelTypeListFromString(FhirPackage.eINSTANCE.getSubscriptionChannelTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubscriptionChannelTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSubscriptionChannelTypeListToString(FhirPackage.eINSTANCE.getSubscriptionChannelTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionStatusList createSubscriptionStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createSubscriptionStatusListFromString(FhirPackage.eINSTANCE.getSubscriptionStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubscriptionStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSubscriptionStatusListToString(FhirPackage.eINSTANCE.getSubscriptionStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyDeliveryStatusList createSupplyDeliveryStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createSupplyDeliveryStatusListFromString(FhirPackage.eINSTANCE.getSupplyDeliveryStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupplyDeliveryStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSupplyDeliveryStatusListToString(FhirPackage.eINSTANCE.getSupplyDeliveryStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyRequestStatusList createSupplyRequestStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createSupplyRequestStatusListFromString(FhirPackage.eINSTANCE.getSupplyRequestStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupplyRequestStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSupplyRequestStatusListToString(FhirPackage.eINSTANCE.getSupplyRequestStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemRestfulInteractionList createSystemRestfulInteractionListObjectFromString(EDataType eDataType, String initialValue) {
		return createSystemRestfulInteractionListFromString(FhirPackage.eINSTANCE.getSystemRestfulInteractionList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSystemRestfulInteractionListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSystemRestfulInteractionListToString(FhirPackage.eINSTANCE.getSystemRestfulInteractionList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskIntentList createTaskIntentListObjectFromString(EDataType eDataType, String initialValue) {
		return createTaskIntentListFromString(FhirPackage.eINSTANCE.getTaskIntentList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaskIntentListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTaskIntentListToString(FhirPackage.eINSTANCE.getTaskIntentList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskStatusList createTaskStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createTaskStatusListFromString(FhirPackage.eINSTANCE.getTaskStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaskStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTaskStatusListToString(FhirPackage.eINSTANCE.getTaskStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportActionResultList createTestReportActionResultListObjectFromString(EDataType eDataType, String initialValue) {
		return createTestReportActionResultListFromString(FhirPackage.eINSTANCE.getTestReportActionResultList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestReportActionResultListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTestReportActionResultListToString(FhirPackage.eINSTANCE.getTestReportActionResultList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportParticipantTypeList createTestReportParticipantTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createTestReportParticipantTypeListFromString(FhirPackage.eINSTANCE.getTestReportParticipantTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestReportParticipantTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTestReportParticipantTypeListToString(FhirPackage.eINSTANCE.getTestReportParticipantTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportResultList createTestReportResultListObjectFromString(EDataType eDataType, String initialValue) {
		return createTestReportResultListFromString(FhirPackage.eINSTANCE.getTestReportResultList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestReportResultListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTestReportResultListToString(FhirPackage.eINSTANCE.getTestReportResultList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportStatusList createTestReportStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createTestReportStatusListFromString(FhirPackage.eINSTANCE.getTestReportStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestReportStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTestReportStatusListToString(FhirPackage.eINSTANCE.getTestReportStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptRequestMethodCodeList createTestScriptRequestMethodCodeListObjectFromString(EDataType eDataType, String initialValue) {
		return createTestScriptRequestMethodCodeListFromString(FhirPackage.eINSTANCE.getTestScriptRequestMethodCodeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestScriptRequestMethodCodeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTestScriptRequestMethodCodeListToString(FhirPackage.eINSTANCE.getTestScriptRequestMethodCodeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createTimePrimitiveFromString(EDataType eDataType, String initialValue) {
		return (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TIME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimePrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TIME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerTypeList createTriggerTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createTriggerTypeListFromString(FhirPackage.eINSTANCE.getTriggerTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTriggerTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTriggerTypeListToString(FhirPackage.eINSTANCE.getTriggerTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDerivationRuleList createTypeDerivationRuleListObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeDerivationRuleListFromString(FhirPackage.eINSTANCE.getTypeDerivationRuleList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeDerivationRuleListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeDerivationRuleListToString(FhirPackage.eINSTANCE.getTypeDerivationRuleList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRestfulInteractionList createTypeRestfulInteractionListObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeRestfulInteractionListFromString(FhirPackage.eINSTANCE.getTypeRestfulInteractionList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeRestfulInteractionListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeRestfulInteractionListToString(FhirPackage.eINSTANCE.getTypeRestfulInteractionList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UDIEntryTypeList createUDIEntryTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createUDIEntryTypeListFromString(FhirPackage.eINSTANCE.getUDIEntryTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUDIEntryTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUDIEntryTypeListToString(FhirPackage.eINSTANCE.getUDIEntryTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsOfTimeList createUnitsOfTimeListObjectFromString(EDataType eDataType, String initialValue) {
		return createUnitsOfTimeListFromString(FhirPackage.eINSTANCE.getUnitsOfTimeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitsOfTimeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUnitsOfTimeListToString(FhirPackage.eINSTANCE.getUnitsOfTimeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createUnsignedIntPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnsignedIntPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUriPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUriPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUrlPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUrlPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseList createUseListObjectFromString(EDataType eDataType, String initialValue) {
		return createUseListFromString(FhirPackage.eINSTANCE.getUseList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUseListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUseListToString(FhirPackage.eINSTANCE.getUseList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUuidPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUuidPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableTypeList createVariableTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createVariableTypeListFromString(FhirPackage.eINSTANCE.getVariableTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVariableTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVariableTypeListToString(FhirPackage.eINSTANCE.getVariableTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VConfidentialityClassificationList createVConfidentialityClassificationListObjectFromString(EDataType eDataType, String initialValue) {
		return createVConfidentialityClassificationListFromString(FhirPackage.eINSTANCE.getVConfidentialityClassificationList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVConfidentialityClassificationListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVConfidentialityClassificationListToString(FhirPackage.eINSTANCE.getVConfidentialityClassificationList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionBaseList createVisionBaseListObjectFromString(EDataType eDataType, String initialValue) {
		return createVisionBaseListFromString(FhirPackage.eINSTANCE.getVisionBaseList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisionBaseListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVisionBaseListToString(FhirPackage.eINSTANCE.getVisionBaseList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionEyesList createVisionEyesListObjectFromString(EDataType eDataType, String initialValue) {
		return createVisionEyesListFromString(FhirPackage.eINSTANCE.getVisionEyesList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisionEyesListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVisionEyesListToString(FhirPackage.eINSTANCE.getVisionEyesList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPathUsageTypeList createXPathUsageTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createXPathUsageTypeListFromString(FhirPackage.eINSTANCE.getXPathUsageTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXPathUsageTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertXPathUsageTypeListToString(FhirPackage.eINSTANCE.getXPathUsageTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FhirPackage getFhirPackage() {
		return (FhirPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FhirPackage getPackage() {
		return FhirPackage.eINSTANCE;
	}

} //FhirFactoryImpl
