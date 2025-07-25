/**
 */
package org.hl7.fhir.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.hl7.fhir.Account;
import org.hl7.fhir.AccountCoverage;
import org.hl7.fhir.AccountGuarantor;
import org.hl7.fhir.AccountStatus;
import org.hl7.fhir.ActionCardinalityBehavior;
import org.hl7.fhir.ActionConditionKind;
import org.hl7.fhir.ActionGroupingBehavior;
import org.hl7.fhir.ActionParticipantType;
import org.hl7.fhir.ActionPrecheckBehavior;
import org.hl7.fhir.ActionRelationshipType;
import org.hl7.fhir.ActionRequiredBehavior;
import org.hl7.fhir.ActionSelectionBehavior;
import org.hl7.fhir.ActivityDefinition;
import org.hl7.fhir.ActivityDefinitionDynamicValue;
import org.hl7.fhir.ActivityDefinitionParticipant;
import org.hl7.fhir.Address;
import org.hl7.fhir.AddressType;
import org.hl7.fhir.AddressUse;
import org.hl7.fhir.AdministrativeGender;
import org.hl7.fhir.AdverseEvent;
import org.hl7.fhir.AdverseEventActuality;
import org.hl7.fhir.AdverseEventCausality;
import org.hl7.fhir.AdverseEventSuspectEntity;
import org.hl7.fhir.Age;
import org.hl7.fhir.AggregationMode;
import org.hl7.fhir.AllergyIntolerance;
import org.hl7.fhir.AllergyIntoleranceCategory;
import org.hl7.fhir.AllergyIntoleranceCriticality;
import org.hl7.fhir.AllergyIntoleranceReaction;
import org.hl7.fhir.AllergyIntoleranceSeverity;
import org.hl7.fhir.AllergyIntoleranceType;
import org.hl7.fhir.Annotation;
import org.hl7.fhir.Appointment;
import org.hl7.fhir.AppointmentParticipant;
import org.hl7.fhir.AppointmentResponse;
import org.hl7.fhir.AppointmentStatus;
import org.hl7.fhir.AssertionDirectionType;
import org.hl7.fhir.AssertionOperatorType;
import org.hl7.fhir.AssertionResponseTypes;
import org.hl7.fhir.Attachment;
import org.hl7.fhir.AuditEvent;
import org.hl7.fhir.AuditEventAction;
import org.hl7.fhir.AuditEventAgent;
import org.hl7.fhir.AuditEventAgentNetworkType;
import org.hl7.fhir.AuditEventDetail;
import org.hl7.fhir.AuditEventEntity;
import org.hl7.fhir.AuditEventNetwork;
import org.hl7.fhir.AuditEventOutcome;
import org.hl7.fhir.AuditEventSource;
import org.hl7.fhir.BackboneElement;
import org.hl7.fhir.Base64Binary;
import org.hl7.fhir.Basic;
import org.hl7.fhir.Binary;
import org.hl7.fhir.BindingStrength;
import org.hl7.fhir.BiologicallyDerivedProduct;
import org.hl7.fhir.BiologicallyDerivedProductCategory;
import org.hl7.fhir.BiologicallyDerivedProductCollection;
import org.hl7.fhir.BiologicallyDerivedProductManipulation;
import org.hl7.fhir.BiologicallyDerivedProductProcessing;
import org.hl7.fhir.BiologicallyDerivedProductStatus;
import org.hl7.fhir.BiologicallyDerivedProductStorage;
import org.hl7.fhir.BiologicallyDerivedProductStorageScale;
import org.hl7.fhir.BodyStructure;
import org.hl7.fhir.Bundle;
import org.hl7.fhir.BundleEntry;
import org.hl7.fhir.BundleLink;
import org.hl7.fhir.BundleRequest;
import org.hl7.fhir.BundleResponse;
import org.hl7.fhir.BundleSearch;
import org.hl7.fhir.BundleType;
import org.hl7.fhir.Canonical;
import org.hl7.fhir.CapabilityStatement;
import org.hl7.fhir.CapabilityStatementDocument;
import org.hl7.fhir.CapabilityStatementEndpoint;
import org.hl7.fhir.CapabilityStatementImplementation;
import org.hl7.fhir.CapabilityStatementInteraction;
import org.hl7.fhir.CapabilityStatementInteraction1;
import org.hl7.fhir.CapabilityStatementKind;
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
import org.hl7.fhir.CarePlanActivityStatus;
import org.hl7.fhir.CarePlanDetail;
import org.hl7.fhir.CarePlanIntent;
import org.hl7.fhir.CareTeam;
import org.hl7.fhir.CareTeamParticipant;
import org.hl7.fhir.CareTeamStatus;
import org.hl7.fhir.CatalogEntry;
import org.hl7.fhir.CatalogEntryRelatedEntry;
import org.hl7.fhir.CatalogEntryRelationType;
import org.hl7.fhir.ChargeItem;
import org.hl7.fhir.ChargeItemDefinition;
import org.hl7.fhir.ChargeItemDefinitionApplicability;
import org.hl7.fhir.ChargeItemDefinitionPriceComponent;
import org.hl7.fhir.ChargeItemDefinitionPropertyGroup;
import org.hl7.fhir.ChargeItemPerformer;
import org.hl7.fhir.ChargeItemStatus;
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
import org.hl7.fhir.Code;
import org.hl7.fhir.CodeSearchSupport;
import org.hl7.fhir.CodeSystem;
import org.hl7.fhir.CodeSystemConcept;
import org.hl7.fhir.CodeSystemContentMode;
import org.hl7.fhir.CodeSystemDesignation;
import org.hl7.fhir.CodeSystemFilter;
import org.hl7.fhir.CodeSystemHierarchyMeaning;
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
import org.hl7.fhir.Composition;
import org.hl7.fhir.CompositionAttestationMode;
import org.hl7.fhir.CompositionAttester;
import org.hl7.fhir.CompositionEvent;
import org.hl7.fhir.CompositionRelatesTo;
import org.hl7.fhir.CompositionSection;
import org.hl7.fhir.CompositionStatus;
import org.hl7.fhir.ConceptMap;
import org.hl7.fhir.ConceptMapDependsOn;
import org.hl7.fhir.ConceptMapElement;
import org.hl7.fhir.ConceptMapEquivalence;
import org.hl7.fhir.ConceptMapGroup;
import org.hl7.fhir.ConceptMapGroupUnmappedMode;
import org.hl7.fhir.ConceptMapTarget;
import org.hl7.fhir.ConceptMapUnmapped;
import org.hl7.fhir.Condition;
import org.hl7.fhir.ConditionEvidence;
import org.hl7.fhir.ConditionStage;
import org.hl7.fhir.ConditionalDeleteStatus;
import org.hl7.fhir.ConditionalReadStatus;
import org.hl7.fhir.Consent;
import org.hl7.fhir.ConsentActor;
import org.hl7.fhir.ConsentData;
import org.hl7.fhir.ConsentDataMeaning;
import org.hl7.fhir.ConsentPolicy;
import org.hl7.fhir.ConsentProvision;
import org.hl7.fhir.ConsentProvisionType;
import org.hl7.fhir.ConsentState;
import org.hl7.fhir.ConsentVerification;
import org.hl7.fhir.ConstraintSeverity;
import org.hl7.fhir.ContactDetail;
import org.hl7.fhir.ContactPoint;
import org.hl7.fhir.ContactPointSystem;
import org.hl7.fhir.ContactPointUse;
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
import org.hl7.fhir.ContractResourceStatusCodes;
import org.hl7.fhir.ContractRule;
import org.hl7.fhir.ContractSecurityLabel;
import org.hl7.fhir.ContractSigner;
import org.hl7.fhir.ContractSubject;
import org.hl7.fhir.ContractTerm;
import org.hl7.fhir.ContractValuedItem;
import org.hl7.fhir.Contributor;
import org.hl7.fhir.ContributorType;
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
import org.hl7.fhir.Decimal;
import org.hl7.fhir.DetectedIssue;
import org.hl7.fhir.DetectedIssueEvidence;
import org.hl7.fhir.DetectedIssueMitigation;
import org.hl7.fhir.DetectedIssueSeverity;
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
import org.hl7.fhir.DeviceMetricCalibrationType;
import org.hl7.fhir.DeviceMetricCategory;
import org.hl7.fhir.DeviceMetricColor;
import org.hl7.fhir.DeviceMetricOperationalStatus;
import org.hl7.fhir.DeviceNameType;
import org.hl7.fhir.DeviceProperty;
import org.hl7.fhir.DeviceRequest;
import org.hl7.fhir.DeviceRequestParameter;
import org.hl7.fhir.DeviceSpecialization;
import org.hl7.fhir.DeviceUdiCarrier;
import org.hl7.fhir.DeviceUseStatement;
import org.hl7.fhir.DeviceUseStatementStatus;
import org.hl7.fhir.DeviceVersion;
import org.hl7.fhir.DiagnosticReport;
import org.hl7.fhir.DiagnosticReportMedia;
import org.hl7.fhir.DiagnosticReportStatus;
import org.hl7.fhir.DiscriminatorType;
import org.hl7.fhir.Distance;
import org.hl7.fhir.DocumentManifest;
import org.hl7.fhir.DocumentManifestRelated;
import org.hl7.fhir.DocumentMode;
import org.hl7.fhir.DocumentReference;
import org.hl7.fhir.DocumentReferenceContent;
import org.hl7.fhir.DocumentReferenceContext;
import org.hl7.fhir.DocumentReferenceRelatesTo;
import org.hl7.fhir.DocumentReferenceStatus;
import org.hl7.fhir.DocumentRelationshipType;
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
import org.hl7.fhir.EligibilityResponsePurpose;
import org.hl7.fhir.EnableWhenBehavior;
import org.hl7.fhir.Encounter;
import org.hl7.fhir.EncounterClassHistory;
import org.hl7.fhir.EncounterDiagnosis;
import org.hl7.fhir.EncounterHospitalization;
import org.hl7.fhir.EncounterLocation;
import org.hl7.fhir.EncounterLocationStatus;
import org.hl7.fhir.EncounterParticipant;
import org.hl7.fhir.EncounterStatus;
import org.hl7.fhir.EncounterStatusHistory;
import org.hl7.fhir.Endpoint;
import org.hl7.fhir.EndpointStatus;
import org.hl7.fhir.EnrollmentRequest;
import org.hl7.fhir.EnrollmentResponse;
import org.hl7.fhir.EpisodeOfCare;
import org.hl7.fhir.EpisodeOfCareDiagnosis;
import org.hl7.fhir.EpisodeOfCareStatus;
import org.hl7.fhir.EpisodeOfCareStatusHistory;
import org.hl7.fhir.EventCapabilityMode;
import org.hl7.fhir.EventDefinition;
import org.hl7.fhir.EventStatus;
import org.hl7.fhir.EventTiming;
import org.hl7.fhir.Evidence;
import org.hl7.fhir.EvidenceVariable;
import org.hl7.fhir.EvidenceVariableCharacteristic;
import org.hl7.fhir.EvidenceVariableType;
import org.hl7.fhir.ExampleScenario;
import org.hl7.fhir.ExampleScenarioActor;
import org.hl7.fhir.ExampleScenarioActorType;
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
import org.hl7.fhir.ExplanationOfBenefitSubDetail;
import org.hl7.fhir.ExplanationOfBenefitSubDetail1;
import org.hl7.fhir.ExplanationOfBenefitSupportingInfo;
import org.hl7.fhir.ExplanationOfBenefitTotal;
import org.hl7.fhir.ExposureState;
import org.hl7.fhir.Expression;
import org.hl7.fhir.ExpressionLanguage;
import org.hl7.fhir.Extension;
import org.hl7.fhir.ExtensionContextType;
import org.hl7.fhir.FHIRDeviceStatus;
import org.hl7.fhir.FHIRSubstanceStatus;
import org.hl7.fhir.FHIRVersion;
import org.hl7.fhir.FamilyHistoryStatus;
import org.hl7.fhir.FamilyMemberHistory;
import org.hl7.fhir.FamilyMemberHistoryCondition;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.FilterOperator;
import org.hl7.fhir.FinancialResourceStatusCodes;
import org.hl7.fhir.Flag;
import org.hl7.fhir.FlagStatus;
import org.hl7.fhir.Goal;
import org.hl7.fhir.GoalLifecycleStatus;
import org.hl7.fhir.GoalTarget;
import org.hl7.fhir.GraphCompartmentRule;
import org.hl7.fhir.GraphCompartmentUse;
import org.hl7.fhir.GraphDefinition;
import org.hl7.fhir.GraphDefinitionCompartment;
import org.hl7.fhir.GraphDefinitionLink;
import org.hl7.fhir.GraphDefinitionTarget;
import org.hl7.fhir.Group;
import org.hl7.fhir.GroupCharacteristic;
import org.hl7.fhir.GroupMeasure;
import org.hl7.fhir.GroupMember;
import org.hl7.fhir.GroupType;
import org.hl7.fhir.GuidanceResponse;
import org.hl7.fhir.GuidanceResponseStatus;
import org.hl7.fhir.GuidePageGeneration;
import org.hl7.fhir.GuideParameterCode;
import org.hl7.fhir.HTTPVerb;
import org.hl7.fhir.HealthcareService;
import org.hl7.fhir.HealthcareServiceAvailableTime;
import org.hl7.fhir.HealthcareServiceEligibility;
import org.hl7.fhir.HealthcareServiceNotAvailable;
import org.hl7.fhir.HumanName;
import org.hl7.fhir.Id;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.IdentifierUse;
import org.hl7.fhir.IdentityAssuranceLevel;
import org.hl7.fhir.ImagingStudy;
import org.hl7.fhir.ImagingStudyInstance;
import org.hl7.fhir.ImagingStudyPerformer;
import org.hl7.fhir.ImagingStudySeries;
import org.hl7.fhir.ImagingStudyStatus;
import org.hl7.fhir.Immunization;
import org.hl7.fhir.ImmunizationEducation;
import org.hl7.fhir.ImmunizationEvaluation;
import org.hl7.fhir.ImmunizationEvaluationStatusCodes;
import org.hl7.fhir.ImmunizationPerformer;
import org.hl7.fhir.ImmunizationProtocolApplied;
import org.hl7.fhir.ImmunizationReaction;
import org.hl7.fhir.ImmunizationRecommendation;
import org.hl7.fhir.ImmunizationRecommendationDateCriterion;
import org.hl7.fhir.ImmunizationRecommendationRecommendation;
import org.hl7.fhir.ImmunizationStatusCodes;
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
import org.hl7.fhir.InvoiceStatus;
import org.hl7.fhir.IssueSeverity;
import org.hl7.fhir.IssueType;
import org.hl7.fhir.Library;
import org.hl7.fhir.LinkType;
import org.hl7.fhir.Linkage;
import org.hl7.fhir.LinkageItem;
import org.hl7.fhir.LinkageType;
import org.hl7.fhir.List;
import org.hl7.fhir.ListEntry;
import org.hl7.fhir.ListMode;
import org.hl7.fhir.ListStatus;
import org.hl7.fhir.Location;
import org.hl7.fhir.LocationHoursOfOperation;
import org.hl7.fhir.LocationMode;
import org.hl7.fhir.LocationPosition;
import org.hl7.fhir.LocationStatus;
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
import org.hl7.fhir.MeasureReportStratifier;
import org.hl7.fhir.MeasureReportStratum;
import org.hl7.fhir.MeasureReportType;
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
import org.hl7.fhir.MedicationRequestSubstitution;
import org.hl7.fhir.MedicationStatement;
import org.hl7.fhir.MedicationStatusCodes;
import org.hl7.fhir.MedicationrequestStatus;
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
import org.hl7.fhir.MessageheaderResponseRequest;
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
import org.hl7.fhir.NamingSystem;
import org.hl7.fhir.NamingSystemIdentifierType;
import org.hl7.fhir.NamingSystemType;
import org.hl7.fhir.NamingSystemUniqueId;
import org.hl7.fhir.Narrative;
import org.hl7.fhir.NarrativeStatus;
import org.hl7.fhir.NoteType;
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
import org.hl7.fhir.ObservationDefinition;
import org.hl7.fhir.ObservationDefinitionQualifiedInterval;
import org.hl7.fhir.ObservationDefinitionQuantitativeDetails;
import org.hl7.fhir.ObservationRangeCategory;
import org.hl7.fhir.ObservationReferenceRange;
import org.hl7.fhir.ObservationStatus;
import org.hl7.fhir.Oid;
import org.hl7.fhir.OperationDefinition;
import org.hl7.fhir.OperationDefinitionBinding;
import org.hl7.fhir.OperationDefinitionOverload;
import org.hl7.fhir.OperationDefinitionParameter;
import org.hl7.fhir.OperationDefinitionReferencedFrom;
import org.hl7.fhir.OperationKind;
import org.hl7.fhir.OperationOutcome;
import org.hl7.fhir.OperationOutcomeIssue;
import org.hl7.fhir.OperationParameterUse;
import org.hl7.fhir.Organization;
import org.hl7.fhir.OrganizationAffiliation;
import org.hl7.fhir.OrganizationContact;
import org.hl7.fhir.OrientationType;
import org.hl7.fhir.ParameterDefinition;
import org.hl7.fhir.Parameters;
import org.hl7.fhir.ParametersParameter;
import org.hl7.fhir.ParticipantRequired;
import org.hl7.fhir.ParticipationStatus;
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
import org.hl7.fhir.PropertyType;
import org.hl7.fhir.Provenance;
import org.hl7.fhir.ProvenanceAgent;
import org.hl7.fhir.ProvenanceEntity;
import org.hl7.fhir.ProvenanceEntityRole;
import org.hl7.fhir.PublicationStatus;
import org.hl7.fhir.QualityType;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.QuantityComparator;
import org.hl7.fhir.Questionnaire;
import org.hl7.fhir.QuestionnaireAnswerOption;
import org.hl7.fhir.QuestionnaireEnableWhen;
import org.hl7.fhir.QuestionnaireInitial;
import org.hl7.fhir.QuestionnaireItem;
import org.hl7.fhir.QuestionnaireItemOperator;
import org.hl7.fhir.QuestionnaireItemType;
import org.hl7.fhir.QuestionnaireResponse;
import org.hl7.fhir.QuestionnaireResponseAnswer;
import org.hl7.fhir.QuestionnaireResponseItem;
import org.hl7.fhir.QuestionnaireResponseStatus;
import org.hl7.fhir.Range;
import org.hl7.fhir.Ratio;
import org.hl7.fhir.Reference;
import org.hl7.fhir.ReferenceHandlingPolicy;
import org.hl7.fhir.ReferenceVersionRules;
import org.hl7.fhir.RelatedArtifact;
import org.hl7.fhir.RelatedArtifactType;
import org.hl7.fhir.RelatedPerson;
import org.hl7.fhir.RelatedPersonCommunication;
import org.hl7.fhir.RemittanceOutcome;
import org.hl7.fhir.RepositoryType;
import org.hl7.fhir.RequestGroup;
import org.hl7.fhir.RequestGroupAction;
import org.hl7.fhir.RequestGroupCondition;
import org.hl7.fhir.RequestGroupRelatedAction;
import org.hl7.fhir.RequestIntent;
import org.hl7.fhir.RequestPriority;
import org.hl7.fhir.RequestResourceType;
import org.hl7.fhir.RequestStatus;
import org.hl7.fhir.ResearchDefinition;
import org.hl7.fhir.ResearchElementDefinition;
import org.hl7.fhir.ResearchElementDefinitionCharacteristic;
import org.hl7.fhir.ResearchElementType;
import org.hl7.fhir.ResearchStudy;
import org.hl7.fhir.ResearchStudyArm;
import org.hl7.fhir.ResearchStudyObjective;
import org.hl7.fhir.ResearchStudyStatus;
import org.hl7.fhir.ResearchSubject;
import org.hl7.fhir.ResearchSubjectStatus;
import org.hl7.fhir.Resource;
import org.hl7.fhir.ResourceContainer;
import org.hl7.fhir.ResourceType;
import org.hl7.fhir.ResourceVersionPolicy;
import org.hl7.fhir.ResponseType;
import org.hl7.fhir.RestfulCapabilityMode;
import org.hl7.fhir.RiskAssessment;
import org.hl7.fhir.RiskAssessmentPrediction;
import org.hl7.fhir.RiskEvidenceSynthesis;
import org.hl7.fhir.RiskEvidenceSynthesisCertainty;
import org.hl7.fhir.RiskEvidenceSynthesisCertaintySubcomponent;
import org.hl7.fhir.RiskEvidenceSynthesisPrecisionEstimate;
import org.hl7.fhir.RiskEvidenceSynthesisRiskEstimate;
import org.hl7.fhir.RiskEvidenceSynthesisSampleSize;
import org.hl7.fhir.SPDXLicense;
import org.hl7.fhir.SampledData;
import org.hl7.fhir.SampledDataDataType;
import org.hl7.fhir.Schedule;
import org.hl7.fhir.SearchComparator;
import org.hl7.fhir.SearchEntryMode;
import org.hl7.fhir.SearchModifierCode;
import org.hl7.fhir.SearchParamType;
import org.hl7.fhir.SearchParameter;
import org.hl7.fhir.SearchParameterComponent;
import org.hl7.fhir.SequenceType;
import org.hl7.fhir.ServiceRequest;
import org.hl7.fhir.Signature;
import org.hl7.fhir.SlicingRules;
import org.hl7.fhir.Slot;
import org.hl7.fhir.SlotStatus;
import org.hl7.fhir.SortDirection;
import org.hl7.fhir.Specimen;
import org.hl7.fhir.SpecimenCollection;
import org.hl7.fhir.SpecimenContainedPreference;
import org.hl7.fhir.SpecimenContainer;
import org.hl7.fhir.SpecimenDefinition;
import org.hl7.fhir.SpecimenDefinitionAdditive;
import org.hl7.fhir.SpecimenDefinitionContainer;
import org.hl7.fhir.SpecimenDefinitionHandling;
import org.hl7.fhir.SpecimenDefinitionTypeTested;
import org.hl7.fhir.SpecimenProcessing;
import org.hl7.fhir.SpecimenStatus;
import org.hl7.fhir.Status;
import org.hl7.fhir.StrandType;
import org.hl7.fhir.StructureDefinition;
import org.hl7.fhir.StructureDefinitionContext;
import org.hl7.fhir.StructureDefinitionDifferential;
import org.hl7.fhir.StructureDefinitionKind;
import org.hl7.fhir.StructureDefinitionMapping;
import org.hl7.fhir.StructureDefinitionSnapshot;
import org.hl7.fhir.StructureMap;
import org.hl7.fhir.StructureMapContextType;
import org.hl7.fhir.StructureMapDependent;
import org.hl7.fhir.StructureMapGroup;
import org.hl7.fhir.StructureMapGroupTypeMode;
import org.hl7.fhir.StructureMapInput;
import org.hl7.fhir.StructureMapInputMode;
import org.hl7.fhir.StructureMapModelMode;
import org.hl7.fhir.StructureMapParameter;
import org.hl7.fhir.StructureMapRule;
import org.hl7.fhir.StructureMapSource;
import org.hl7.fhir.StructureMapSourceListMode;
import org.hl7.fhir.StructureMapStructure;
import org.hl7.fhir.StructureMapTarget;
import org.hl7.fhir.StructureMapTargetListMode;
import org.hl7.fhir.StructureMapTransform;
import org.hl7.fhir.Subscription;
import org.hl7.fhir.SubscriptionChannel;
import org.hl7.fhir.SubscriptionChannelType;
import org.hl7.fhir.SubscriptionStatus;
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
import org.hl7.fhir.SupplyDeliverySuppliedItem;
import org.hl7.fhir.SupplyRequest;
import org.hl7.fhir.SupplyRequestParameter;
import org.hl7.fhir.SupplyRequestStatus;
import org.hl7.fhir.SystemRestfulInteraction;
import org.hl7.fhir.Task;
import org.hl7.fhir.TaskInput;
import org.hl7.fhir.TaskIntent;
import org.hl7.fhir.TaskOutput;
import org.hl7.fhir.TaskRestriction;
import org.hl7.fhir.TaskStatus;
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
import org.hl7.fhir.TestReportAssert;
import org.hl7.fhir.TestReportOperation;
import org.hl7.fhir.TestReportParticipant;
import org.hl7.fhir.TestReportParticipantType;
import org.hl7.fhir.TestReportResult;
import org.hl7.fhir.TestReportSetup;
import org.hl7.fhir.TestReportStatus;
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
import org.hl7.fhir.TestScriptSetup;
import org.hl7.fhir.TestScriptTeardown;
import org.hl7.fhir.TestScriptTest;
import org.hl7.fhir.TestScriptVariable;
import org.hl7.fhir.Time;
import org.hl7.fhir.Timing;
import org.hl7.fhir.TimingRepeat;
import org.hl7.fhir.TriggerDefinition;
import org.hl7.fhir.TriggerType;
import org.hl7.fhir.TypeDerivationRule;
import org.hl7.fhir.TypeRestfulInteraction;
import org.hl7.fhir.UDIEntryType;
import org.hl7.fhir.UnitsOfTime;
import org.hl7.fhir.UnsignedInt;
import org.hl7.fhir.Uri;
import org.hl7.fhir.Url;
import org.hl7.fhir.UsageContext;
import org.hl7.fhir.Use;
import org.hl7.fhir.Uuid;
import org.hl7.fhir.VConfidentialityClassification;
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
import org.hl7.fhir.VerificationResult;
import org.hl7.fhir.VerificationResultAttestation;
import org.hl7.fhir.VerificationResultPrimarySource;
import org.hl7.fhir.VerificationResultValidator;
import org.hl7.fhir.VisionBase;
import org.hl7.fhir.VisionEyes;
import org.hl7.fhir.VisionPrescription;
import org.hl7.fhir.VisionPrescriptionLensSpecification;
import org.hl7.fhir.VisionPrescriptionPrism;
import org.hl7.fhir.XPathUsageType;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage
 * @generated
 */
public class FhirSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FhirPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FhirSwitch() {
		if (modelPackage == null) {
			modelPackage = FhirPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case FhirPackage.ACCOUNT: {
				Account account = (Account)theEObject;
				T result = caseAccount(account);
				if (result == null) result = caseDomainResource(account);
				if (result == null) result = caseResource(account);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ACCOUNT_COVERAGE: {
				AccountCoverage accountCoverage = (AccountCoverage)theEObject;
				T result = caseAccountCoverage(accountCoverage);
				if (result == null) result = caseBackboneElement(accountCoverage);
				if (result == null) result = caseElement(accountCoverage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ACCOUNT_GUARANTOR: {
				AccountGuarantor accountGuarantor = (AccountGuarantor)theEObject;
				T result = caseAccountGuarantor(accountGuarantor);
				if (result == null) result = caseBackboneElement(accountGuarantor);
				if (result == null) result = caseElement(accountGuarantor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ACCOUNT_STATUS: {
				AccountStatus accountStatus = (AccountStatus)theEObject;
				T result = caseAccountStatus(accountStatus);
				if (result == null) result = caseElement(accountStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ACTION_CARDINALITY_BEHAVIOR: {
				ActionCardinalityBehavior actionCardinalityBehavior = (ActionCardinalityBehavior)theEObject;
				T result = caseActionCardinalityBehavior(actionCardinalityBehavior);
				if (result == null) result = caseElement(actionCardinalityBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ACTION_CONDITION_KIND: {
				ActionConditionKind actionConditionKind = (ActionConditionKind)theEObject;
				T result = caseActionConditionKind(actionConditionKind);
				if (result == null) result = caseElement(actionConditionKind);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ACTION_GROUPING_BEHAVIOR: {
				ActionGroupingBehavior actionGroupingBehavior = (ActionGroupingBehavior)theEObject;
				T result = caseActionGroupingBehavior(actionGroupingBehavior);
				if (result == null) result = caseElement(actionGroupingBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ACTION_PARTICIPANT_TYPE: {
				ActionParticipantType actionParticipantType = (ActionParticipantType)theEObject;
				T result = caseActionParticipantType(actionParticipantType);
				if (result == null) result = caseElement(actionParticipantType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ACTION_PRECHECK_BEHAVIOR: {
				ActionPrecheckBehavior actionPrecheckBehavior = (ActionPrecheckBehavior)theEObject;
				T result = caseActionPrecheckBehavior(actionPrecheckBehavior);
				if (result == null) result = caseElement(actionPrecheckBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ACTION_RELATIONSHIP_TYPE: {
				ActionRelationshipType actionRelationshipType = (ActionRelationshipType)theEObject;
				T result = caseActionRelationshipType(actionRelationshipType);
				if (result == null) result = caseElement(actionRelationshipType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ACTION_REQUIRED_BEHAVIOR: {
				ActionRequiredBehavior actionRequiredBehavior = (ActionRequiredBehavior)theEObject;
				T result = caseActionRequiredBehavior(actionRequiredBehavior);
				if (result == null) result = caseElement(actionRequiredBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ACTION_SELECTION_BEHAVIOR: {
				ActionSelectionBehavior actionSelectionBehavior = (ActionSelectionBehavior)theEObject;
				T result = caseActionSelectionBehavior(actionSelectionBehavior);
				if (result == null) result = caseElement(actionSelectionBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ACTIVITY_DEFINITION: {
				ActivityDefinition activityDefinition = (ActivityDefinition)theEObject;
				T result = caseActivityDefinition(activityDefinition);
				if (result == null) result = caseDomainResource(activityDefinition);
				if (result == null) result = caseResource(activityDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ACTIVITY_DEFINITION_DYNAMIC_VALUE: {
				ActivityDefinitionDynamicValue activityDefinitionDynamicValue = (ActivityDefinitionDynamicValue)theEObject;
				T result = caseActivityDefinitionDynamicValue(activityDefinitionDynamicValue);
				if (result == null) result = caseBackboneElement(activityDefinitionDynamicValue);
				if (result == null) result = caseElement(activityDefinitionDynamicValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ACTIVITY_DEFINITION_PARTICIPANT: {
				ActivityDefinitionParticipant activityDefinitionParticipant = (ActivityDefinitionParticipant)theEObject;
				T result = caseActivityDefinitionParticipant(activityDefinitionParticipant);
				if (result == null) result = caseBackboneElement(activityDefinitionParticipant);
				if (result == null) result = caseElement(activityDefinitionParticipant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ADDRESS: {
				Address address = (Address)theEObject;
				T result = caseAddress(address);
				if (result == null) result = caseElement(address);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ADDRESS_TYPE: {
				AddressType addressType = (AddressType)theEObject;
				T result = caseAddressType(addressType);
				if (result == null) result = caseElement(addressType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ADDRESS_USE: {
				AddressUse addressUse = (AddressUse)theEObject;
				T result = caseAddressUse(addressUse);
				if (result == null) result = caseElement(addressUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ADMINISTRATIVE_GENDER: {
				AdministrativeGender administrativeGender = (AdministrativeGender)theEObject;
				T result = caseAdministrativeGender(administrativeGender);
				if (result == null) result = caseElement(administrativeGender);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ADVERSE_EVENT: {
				AdverseEvent adverseEvent = (AdverseEvent)theEObject;
				T result = caseAdverseEvent(adverseEvent);
				if (result == null) result = caseDomainResource(adverseEvent);
				if (result == null) result = caseResource(adverseEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ADVERSE_EVENT_ACTUALITY: {
				AdverseEventActuality adverseEventActuality = (AdverseEventActuality)theEObject;
				T result = caseAdverseEventActuality(adverseEventActuality);
				if (result == null) result = caseElement(adverseEventActuality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ADVERSE_EVENT_CAUSALITY: {
				AdverseEventCausality adverseEventCausality = (AdverseEventCausality)theEObject;
				T result = caseAdverseEventCausality(adverseEventCausality);
				if (result == null) result = caseBackboneElement(adverseEventCausality);
				if (result == null) result = caseElement(adverseEventCausality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY: {
				AdverseEventSuspectEntity adverseEventSuspectEntity = (AdverseEventSuspectEntity)theEObject;
				T result = caseAdverseEventSuspectEntity(adverseEventSuspectEntity);
				if (result == null) result = caseBackboneElement(adverseEventSuspectEntity);
				if (result == null) result = caseElement(adverseEventSuspectEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.AGE: {
				Age age = (Age)theEObject;
				T result = caseAge(age);
				if (result == null) result = caseQuantity(age);
				if (result == null) result = caseElement(age);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.AGGREGATION_MODE: {
				AggregationMode aggregationMode = (AggregationMode)theEObject;
				T result = caseAggregationMode(aggregationMode);
				if (result == null) result = caseElement(aggregationMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ALLERGY_INTOLERANCE: {
				AllergyIntolerance allergyIntolerance = (AllergyIntolerance)theEObject;
				T result = caseAllergyIntolerance(allergyIntolerance);
				if (result == null) result = caseDomainResource(allergyIntolerance);
				if (result == null) result = caseResource(allergyIntolerance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ALLERGY_INTOLERANCE_CATEGORY: {
				AllergyIntoleranceCategory allergyIntoleranceCategory = (AllergyIntoleranceCategory)theEObject;
				T result = caseAllergyIntoleranceCategory(allergyIntoleranceCategory);
				if (result == null) result = caseElement(allergyIntoleranceCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ALLERGY_INTOLERANCE_CRITICALITY: {
				AllergyIntoleranceCriticality allergyIntoleranceCriticality = (AllergyIntoleranceCriticality)theEObject;
				T result = caseAllergyIntoleranceCriticality(allergyIntoleranceCriticality);
				if (result == null) result = caseElement(allergyIntoleranceCriticality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION: {
				AllergyIntoleranceReaction allergyIntoleranceReaction = (AllergyIntoleranceReaction)theEObject;
				T result = caseAllergyIntoleranceReaction(allergyIntoleranceReaction);
				if (result == null) result = caseBackboneElement(allergyIntoleranceReaction);
				if (result == null) result = caseElement(allergyIntoleranceReaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ALLERGY_INTOLERANCE_SEVERITY: {
				AllergyIntoleranceSeverity allergyIntoleranceSeverity = (AllergyIntoleranceSeverity)theEObject;
				T result = caseAllergyIntoleranceSeverity(allergyIntoleranceSeverity);
				if (result == null) result = caseElement(allergyIntoleranceSeverity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ALLERGY_INTOLERANCE_TYPE: {
				AllergyIntoleranceType allergyIntoleranceType = (AllergyIntoleranceType)theEObject;
				T result = caseAllergyIntoleranceType(allergyIntoleranceType);
				if (result == null) result = caseElement(allergyIntoleranceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ANNOTATION: {
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = caseElement(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.APPOINTMENT: {
				Appointment appointment = (Appointment)theEObject;
				T result = caseAppointment(appointment);
				if (result == null) result = caseDomainResource(appointment);
				if (result == null) result = caseResource(appointment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.APPOINTMENT_PARTICIPANT: {
				AppointmentParticipant appointmentParticipant = (AppointmentParticipant)theEObject;
				T result = caseAppointmentParticipant(appointmentParticipant);
				if (result == null) result = caseBackboneElement(appointmentParticipant);
				if (result == null) result = caseElement(appointmentParticipant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.APPOINTMENT_RESPONSE: {
				AppointmentResponse appointmentResponse = (AppointmentResponse)theEObject;
				T result = caseAppointmentResponse(appointmentResponse);
				if (result == null) result = caseDomainResource(appointmentResponse);
				if (result == null) result = caseResource(appointmentResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.APPOINTMENT_STATUS: {
				AppointmentStatus appointmentStatus = (AppointmentStatus)theEObject;
				T result = caseAppointmentStatus(appointmentStatus);
				if (result == null) result = caseElement(appointmentStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ASSERTION_DIRECTION_TYPE: {
				AssertionDirectionType assertionDirectionType = (AssertionDirectionType)theEObject;
				T result = caseAssertionDirectionType(assertionDirectionType);
				if (result == null) result = caseElement(assertionDirectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ASSERTION_OPERATOR_TYPE: {
				AssertionOperatorType assertionOperatorType = (AssertionOperatorType)theEObject;
				T result = caseAssertionOperatorType(assertionOperatorType);
				if (result == null) result = caseElement(assertionOperatorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ASSERTION_RESPONSE_TYPES: {
				AssertionResponseTypes assertionResponseTypes = (AssertionResponseTypes)theEObject;
				T result = caseAssertionResponseTypes(assertionResponseTypes);
				if (result == null) result = caseElement(assertionResponseTypes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ATTACHMENT: {
				Attachment attachment = (Attachment)theEObject;
				T result = caseAttachment(attachment);
				if (result == null) result = caseElement(attachment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.AUDIT_EVENT: {
				AuditEvent auditEvent = (AuditEvent)theEObject;
				T result = caseAuditEvent(auditEvent);
				if (result == null) result = caseDomainResource(auditEvent);
				if (result == null) result = caseResource(auditEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.AUDIT_EVENT_ACTION: {
				AuditEventAction auditEventAction = (AuditEventAction)theEObject;
				T result = caseAuditEventAction(auditEventAction);
				if (result == null) result = caseElement(auditEventAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.AUDIT_EVENT_AGENT: {
				AuditEventAgent auditEventAgent = (AuditEventAgent)theEObject;
				T result = caseAuditEventAgent(auditEventAgent);
				if (result == null) result = caseBackboneElement(auditEventAgent);
				if (result == null) result = caseElement(auditEventAgent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.AUDIT_EVENT_AGENT_NETWORK_TYPE: {
				AuditEventAgentNetworkType auditEventAgentNetworkType = (AuditEventAgentNetworkType)theEObject;
				T result = caseAuditEventAgentNetworkType(auditEventAgentNetworkType);
				if (result == null) result = caseElement(auditEventAgentNetworkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.AUDIT_EVENT_DETAIL: {
				AuditEventDetail auditEventDetail = (AuditEventDetail)theEObject;
				T result = caseAuditEventDetail(auditEventDetail);
				if (result == null) result = caseBackboneElement(auditEventDetail);
				if (result == null) result = caseElement(auditEventDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.AUDIT_EVENT_ENTITY: {
				AuditEventEntity auditEventEntity = (AuditEventEntity)theEObject;
				T result = caseAuditEventEntity(auditEventEntity);
				if (result == null) result = caseBackboneElement(auditEventEntity);
				if (result == null) result = caseElement(auditEventEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.AUDIT_EVENT_NETWORK: {
				AuditEventNetwork auditEventNetwork = (AuditEventNetwork)theEObject;
				T result = caseAuditEventNetwork(auditEventNetwork);
				if (result == null) result = caseBackboneElement(auditEventNetwork);
				if (result == null) result = caseElement(auditEventNetwork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.AUDIT_EVENT_OUTCOME: {
				AuditEventOutcome auditEventOutcome = (AuditEventOutcome)theEObject;
				T result = caseAuditEventOutcome(auditEventOutcome);
				if (result == null) result = caseElement(auditEventOutcome);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.AUDIT_EVENT_SOURCE: {
				AuditEventSource auditEventSource = (AuditEventSource)theEObject;
				T result = caseAuditEventSource(auditEventSource);
				if (result == null) result = caseBackboneElement(auditEventSource);
				if (result == null) result = caseElement(auditEventSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.BACKBONE_ELEMENT: {
				BackboneElement backboneElement = (BackboneElement)theEObject;
				T result = caseBackboneElement(backboneElement);
				if (result == null) result = caseElement(backboneElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.BASE64_BINARY: {
				Base64Binary base64Binary = (Base64Binary)theEObject;
				T result = caseBase64Binary(base64Binary);
				if (result == null) result = caseElement(base64Binary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.BASIC: {
				Basic basic = (Basic)theEObject;
				T result = caseBasic(basic);
				if (result == null) result = caseDomainResource(basic);
				if (result == null) result = caseResource(basic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.BINARY: {
				Binary binary = (Binary)theEObject;
				T result = caseBinary(binary);
				if (result == null) result = caseResource(binary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.BINDING_STRENGTH: {
				BindingStrength bindingStrength = (BindingStrength)theEObject;
				T result = caseBindingStrength(bindingStrength);
				if (result == null) result = caseElement(bindingStrength);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT: {
				BiologicallyDerivedProduct biologicallyDerivedProduct = (BiologicallyDerivedProduct)theEObject;
				T result = caseBiologicallyDerivedProduct(biologicallyDerivedProduct);
				if (result == null) result = caseDomainResource(biologicallyDerivedProduct);
				if (result == null) result = caseResource(biologicallyDerivedProduct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_CATEGORY: {
				BiologicallyDerivedProductCategory biologicallyDerivedProductCategory = (BiologicallyDerivedProductCategory)theEObject;
				T result = caseBiologicallyDerivedProductCategory(biologicallyDerivedProductCategory);
				if (result == null) result = caseElement(biologicallyDerivedProductCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION: {
				BiologicallyDerivedProductCollection biologicallyDerivedProductCollection = (BiologicallyDerivedProductCollection)theEObject;
				T result = caseBiologicallyDerivedProductCollection(biologicallyDerivedProductCollection);
				if (result == null) result = caseBackboneElement(biologicallyDerivedProductCollection);
				if (result == null) result = caseElement(biologicallyDerivedProductCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_MANIPULATION: {
				BiologicallyDerivedProductManipulation biologicallyDerivedProductManipulation = (BiologicallyDerivedProductManipulation)theEObject;
				T result = caseBiologicallyDerivedProductManipulation(biologicallyDerivedProductManipulation);
				if (result == null) result = caseBackboneElement(biologicallyDerivedProductManipulation);
				if (result == null) result = caseElement(biologicallyDerivedProductManipulation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_PROCESSING: {
				BiologicallyDerivedProductProcessing biologicallyDerivedProductProcessing = (BiologicallyDerivedProductProcessing)theEObject;
				T result = caseBiologicallyDerivedProductProcessing(biologicallyDerivedProductProcessing);
				if (result == null) result = caseBackboneElement(biologicallyDerivedProductProcessing);
				if (result == null) result = caseElement(biologicallyDerivedProductProcessing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STATUS: {
				BiologicallyDerivedProductStatus biologicallyDerivedProductStatus = (BiologicallyDerivedProductStatus)theEObject;
				T result = caseBiologicallyDerivedProductStatus(biologicallyDerivedProductStatus);
				if (result == null) result = caseElement(biologicallyDerivedProductStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE: {
				BiologicallyDerivedProductStorage biologicallyDerivedProductStorage = (BiologicallyDerivedProductStorage)theEObject;
				T result = caseBiologicallyDerivedProductStorage(biologicallyDerivedProductStorage);
				if (result == null) result = caseBackboneElement(biologicallyDerivedProductStorage);
				if (result == null) result = caseElement(biologicallyDerivedProductStorage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE_SCALE: {
				BiologicallyDerivedProductStorageScale biologicallyDerivedProductStorageScale = (BiologicallyDerivedProductStorageScale)theEObject;
				T result = caseBiologicallyDerivedProductStorageScale(biologicallyDerivedProductStorageScale);
				if (result == null) result = caseElement(biologicallyDerivedProductStorageScale);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.BODY_STRUCTURE: {
				BodyStructure bodyStructure = (BodyStructure)theEObject;
				T result = caseBodyStructure(bodyStructure);
				if (result == null) result = caseDomainResource(bodyStructure);
				if (result == null) result = caseResource(bodyStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.BOOLEAN: {
				org.hl7.fhir.Boolean boolean_ = (org.hl7.fhir.Boolean)theEObject;
				T result = caseBoolean(boolean_);
				if (result == null) result = caseElement(boolean_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.BUNDLE: {
				Bundle bundle = (Bundle)theEObject;
				T result = caseBundle(bundle);
				if (result == null) result = caseResource(bundle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.BUNDLE_ENTRY: {
				BundleEntry bundleEntry = (BundleEntry)theEObject;
				T result = caseBundleEntry(bundleEntry);
				if (result == null) result = caseBackboneElement(bundleEntry);
				if (result == null) result = caseElement(bundleEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.BUNDLE_LINK: {
				BundleLink bundleLink = (BundleLink)theEObject;
				T result = caseBundleLink(bundleLink);
				if (result == null) result = caseBackboneElement(bundleLink);
				if (result == null) result = caseElement(bundleLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.BUNDLE_REQUEST: {
				BundleRequest bundleRequest = (BundleRequest)theEObject;
				T result = caseBundleRequest(bundleRequest);
				if (result == null) result = caseBackboneElement(bundleRequest);
				if (result == null) result = caseElement(bundleRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.BUNDLE_RESPONSE: {
				BundleResponse bundleResponse = (BundleResponse)theEObject;
				T result = caseBundleResponse(bundleResponse);
				if (result == null) result = caseBackboneElement(bundleResponse);
				if (result == null) result = caseElement(bundleResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.BUNDLE_SEARCH: {
				BundleSearch bundleSearch = (BundleSearch)theEObject;
				T result = caseBundleSearch(bundleSearch);
				if (result == null) result = caseBackboneElement(bundleSearch);
				if (result == null) result = caseElement(bundleSearch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.BUNDLE_TYPE: {
				BundleType bundleType = (BundleType)theEObject;
				T result = caseBundleType(bundleType);
				if (result == null) result = caseElement(bundleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CANONICAL: {
				Canonical canonical = (Canonical)theEObject;
				T result = caseCanonical(canonical);
				if (result == null) result = caseElement(canonical);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CAPABILITY_STATEMENT: {
				CapabilityStatement capabilityStatement = (CapabilityStatement)theEObject;
				T result = caseCapabilityStatement(capabilityStatement);
				if (result == null) result = caseDomainResource(capabilityStatement);
				if (result == null) result = caseResource(capabilityStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CAPABILITY_STATEMENT_DOCUMENT: {
				CapabilityStatementDocument capabilityStatementDocument = (CapabilityStatementDocument)theEObject;
				T result = caseCapabilityStatementDocument(capabilityStatementDocument);
				if (result == null) result = caseBackboneElement(capabilityStatementDocument);
				if (result == null) result = caseElement(capabilityStatementDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CAPABILITY_STATEMENT_ENDPOINT: {
				CapabilityStatementEndpoint capabilityStatementEndpoint = (CapabilityStatementEndpoint)theEObject;
				T result = caseCapabilityStatementEndpoint(capabilityStatementEndpoint);
				if (result == null) result = caseBackboneElement(capabilityStatementEndpoint);
				if (result == null) result = caseElement(capabilityStatementEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CAPABILITY_STATEMENT_IMPLEMENTATION: {
				CapabilityStatementImplementation capabilityStatementImplementation = (CapabilityStatementImplementation)theEObject;
				T result = caseCapabilityStatementImplementation(capabilityStatementImplementation);
				if (result == null) result = caseBackboneElement(capabilityStatementImplementation);
				if (result == null) result = caseElement(capabilityStatementImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CAPABILITY_STATEMENT_INTERACTION: {
				CapabilityStatementInteraction capabilityStatementInteraction = (CapabilityStatementInteraction)theEObject;
				T result = caseCapabilityStatementInteraction(capabilityStatementInteraction);
				if (result == null) result = caseBackboneElement(capabilityStatementInteraction);
				if (result == null) result = caseElement(capabilityStatementInteraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CAPABILITY_STATEMENT_INTERACTION1: {
				CapabilityStatementInteraction1 capabilityStatementInteraction1 = (CapabilityStatementInteraction1)theEObject;
				T result = caseCapabilityStatementInteraction1(capabilityStatementInteraction1);
				if (result == null) result = caseBackboneElement(capabilityStatementInteraction1);
				if (result == null) result = caseElement(capabilityStatementInteraction1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CAPABILITY_STATEMENT_KIND: {
				CapabilityStatementKind capabilityStatementKind = (CapabilityStatementKind)theEObject;
				T result = caseCapabilityStatementKind(capabilityStatementKind);
				if (result == null) result = caseElement(capabilityStatementKind);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CAPABILITY_STATEMENT_MESSAGING: {
				CapabilityStatementMessaging capabilityStatementMessaging = (CapabilityStatementMessaging)theEObject;
				T result = caseCapabilityStatementMessaging(capabilityStatementMessaging);
				if (result == null) result = caseBackboneElement(capabilityStatementMessaging);
				if (result == null) result = caseElement(capabilityStatementMessaging);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CAPABILITY_STATEMENT_OPERATION: {
				CapabilityStatementOperation capabilityStatementOperation = (CapabilityStatementOperation)theEObject;
				T result = caseCapabilityStatementOperation(capabilityStatementOperation);
				if (result == null) result = caseBackboneElement(capabilityStatementOperation);
				if (result == null) result = caseElement(capabilityStatementOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CAPABILITY_STATEMENT_RESOURCE: {
				CapabilityStatementResource capabilityStatementResource = (CapabilityStatementResource)theEObject;
				T result = caseCapabilityStatementResource(capabilityStatementResource);
				if (result == null) result = caseBackboneElement(capabilityStatementResource);
				if (result == null) result = caseElement(capabilityStatementResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CAPABILITY_STATEMENT_REST: {
				CapabilityStatementRest capabilityStatementRest = (CapabilityStatementRest)theEObject;
				T result = caseCapabilityStatementRest(capabilityStatementRest);
				if (result == null) result = caseBackboneElement(capabilityStatementRest);
				if (result == null) result = caseElement(capabilityStatementRest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CAPABILITY_STATEMENT_SEARCH_PARAM: {
				CapabilityStatementSearchParam capabilityStatementSearchParam = (CapabilityStatementSearchParam)theEObject;
				T result = caseCapabilityStatementSearchParam(capabilityStatementSearchParam);
				if (result == null) result = caseBackboneElement(capabilityStatementSearchParam);
				if (result == null) result = caseElement(capabilityStatementSearchParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CAPABILITY_STATEMENT_SECURITY: {
				CapabilityStatementSecurity capabilityStatementSecurity = (CapabilityStatementSecurity)theEObject;
				T result = caseCapabilityStatementSecurity(capabilityStatementSecurity);
				if (result == null) result = caseBackboneElement(capabilityStatementSecurity);
				if (result == null) result = caseElement(capabilityStatementSecurity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CAPABILITY_STATEMENT_SOFTWARE: {
				CapabilityStatementSoftware capabilityStatementSoftware = (CapabilityStatementSoftware)theEObject;
				T result = caseCapabilityStatementSoftware(capabilityStatementSoftware);
				if (result == null) result = caseBackboneElement(capabilityStatementSoftware);
				if (result == null) result = caseElement(capabilityStatementSoftware);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CAPABILITY_STATEMENT_SUPPORTED_MESSAGE: {
				CapabilityStatementSupportedMessage capabilityStatementSupportedMessage = (CapabilityStatementSupportedMessage)theEObject;
				T result = caseCapabilityStatementSupportedMessage(capabilityStatementSupportedMessage);
				if (result == null) result = caseBackboneElement(capabilityStatementSupportedMessage);
				if (result == null) result = caseElement(capabilityStatementSupportedMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CARE_PLAN: {
				CarePlan carePlan = (CarePlan)theEObject;
				T result = caseCarePlan(carePlan);
				if (result == null) result = caseDomainResource(carePlan);
				if (result == null) result = caseResource(carePlan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CARE_PLAN_ACTIVITY: {
				CarePlanActivity carePlanActivity = (CarePlanActivity)theEObject;
				T result = caseCarePlanActivity(carePlanActivity);
				if (result == null) result = caseBackboneElement(carePlanActivity);
				if (result == null) result = caseElement(carePlanActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CARE_PLAN_ACTIVITY_KIND: {
				CarePlanActivityKind carePlanActivityKind = (CarePlanActivityKind)theEObject;
				T result = caseCarePlanActivityKind(carePlanActivityKind);
				if (result == null) result = caseElement(carePlanActivityKind);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CARE_PLAN_ACTIVITY_STATUS: {
				CarePlanActivityStatus carePlanActivityStatus = (CarePlanActivityStatus)theEObject;
				T result = caseCarePlanActivityStatus(carePlanActivityStatus);
				if (result == null) result = caseElement(carePlanActivityStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CARE_PLAN_DETAIL: {
				CarePlanDetail carePlanDetail = (CarePlanDetail)theEObject;
				T result = caseCarePlanDetail(carePlanDetail);
				if (result == null) result = caseBackboneElement(carePlanDetail);
				if (result == null) result = caseElement(carePlanDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CARE_PLAN_INTENT: {
				CarePlanIntent carePlanIntent = (CarePlanIntent)theEObject;
				T result = caseCarePlanIntent(carePlanIntent);
				if (result == null) result = caseElement(carePlanIntent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CARE_TEAM: {
				CareTeam careTeam = (CareTeam)theEObject;
				T result = caseCareTeam(careTeam);
				if (result == null) result = caseDomainResource(careTeam);
				if (result == null) result = caseResource(careTeam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CARE_TEAM_PARTICIPANT: {
				CareTeamParticipant careTeamParticipant = (CareTeamParticipant)theEObject;
				T result = caseCareTeamParticipant(careTeamParticipant);
				if (result == null) result = caseBackboneElement(careTeamParticipant);
				if (result == null) result = caseElement(careTeamParticipant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CARE_TEAM_STATUS: {
				CareTeamStatus careTeamStatus = (CareTeamStatus)theEObject;
				T result = caseCareTeamStatus(careTeamStatus);
				if (result == null) result = caseElement(careTeamStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CATALOG_ENTRY: {
				CatalogEntry catalogEntry = (CatalogEntry)theEObject;
				T result = caseCatalogEntry(catalogEntry);
				if (result == null) result = caseDomainResource(catalogEntry);
				if (result == null) result = caseResource(catalogEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CATALOG_ENTRY_RELATED_ENTRY: {
				CatalogEntryRelatedEntry catalogEntryRelatedEntry = (CatalogEntryRelatedEntry)theEObject;
				T result = caseCatalogEntryRelatedEntry(catalogEntryRelatedEntry);
				if (result == null) result = caseBackboneElement(catalogEntryRelatedEntry);
				if (result == null) result = caseElement(catalogEntryRelatedEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CATALOG_ENTRY_RELATION_TYPE: {
				CatalogEntryRelationType catalogEntryRelationType = (CatalogEntryRelationType)theEObject;
				T result = caseCatalogEntryRelationType(catalogEntryRelationType);
				if (result == null) result = caseElement(catalogEntryRelationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CHARGE_ITEM: {
				ChargeItem chargeItem = (ChargeItem)theEObject;
				T result = caseChargeItem(chargeItem);
				if (result == null) result = caseDomainResource(chargeItem);
				if (result == null) result = caseResource(chargeItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CHARGE_ITEM_DEFINITION: {
				ChargeItemDefinition chargeItemDefinition = (ChargeItemDefinition)theEObject;
				T result = caseChargeItemDefinition(chargeItemDefinition);
				if (result == null) result = caseDomainResource(chargeItemDefinition);
				if (result == null) result = caseResource(chargeItemDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CHARGE_ITEM_DEFINITION_APPLICABILITY: {
				ChargeItemDefinitionApplicability chargeItemDefinitionApplicability = (ChargeItemDefinitionApplicability)theEObject;
				T result = caseChargeItemDefinitionApplicability(chargeItemDefinitionApplicability);
				if (result == null) result = caseBackboneElement(chargeItemDefinitionApplicability);
				if (result == null) result = caseElement(chargeItemDefinitionApplicability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CHARGE_ITEM_DEFINITION_PRICE_COMPONENT: {
				ChargeItemDefinitionPriceComponent chargeItemDefinitionPriceComponent = (ChargeItemDefinitionPriceComponent)theEObject;
				T result = caseChargeItemDefinitionPriceComponent(chargeItemDefinitionPriceComponent);
				if (result == null) result = caseBackboneElement(chargeItemDefinitionPriceComponent);
				if (result == null) result = caseElement(chargeItemDefinitionPriceComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CHARGE_ITEM_DEFINITION_PROPERTY_GROUP: {
				ChargeItemDefinitionPropertyGroup chargeItemDefinitionPropertyGroup = (ChargeItemDefinitionPropertyGroup)theEObject;
				T result = caseChargeItemDefinitionPropertyGroup(chargeItemDefinitionPropertyGroup);
				if (result == null) result = caseBackboneElement(chargeItemDefinitionPropertyGroup);
				if (result == null) result = caseElement(chargeItemDefinitionPropertyGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CHARGE_ITEM_PERFORMER: {
				ChargeItemPerformer chargeItemPerformer = (ChargeItemPerformer)theEObject;
				T result = caseChargeItemPerformer(chargeItemPerformer);
				if (result == null) result = caseBackboneElement(chargeItemPerformer);
				if (result == null) result = caseElement(chargeItemPerformer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CHARGE_ITEM_STATUS: {
				ChargeItemStatus chargeItemStatus = (ChargeItemStatus)theEObject;
				T result = caseChargeItemStatus(chargeItemStatus);
				if (result == null) result = caseElement(chargeItemStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM: {
				Claim claim = (Claim)theEObject;
				T result = caseClaim(claim);
				if (result == null) result = caseDomainResource(claim);
				if (result == null) result = caseResource(claim);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_ACCIDENT: {
				ClaimAccident claimAccident = (ClaimAccident)theEObject;
				T result = caseClaimAccident(claimAccident);
				if (result == null) result = caseBackboneElement(claimAccident);
				if (result == null) result = caseElement(claimAccident);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_CARE_TEAM: {
				ClaimCareTeam claimCareTeam = (ClaimCareTeam)theEObject;
				T result = caseClaimCareTeam(claimCareTeam);
				if (result == null) result = caseBackboneElement(claimCareTeam);
				if (result == null) result = caseElement(claimCareTeam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_DETAIL: {
				ClaimDetail claimDetail = (ClaimDetail)theEObject;
				T result = caseClaimDetail(claimDetail);
				if (result == null) result = caseBackboneElement(claimDetail);
				if (result == null) result = caseElement(claimDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_DIAGNOSIS: {
				ClaimDiagnosis claimDiagnosis = (ClaimDiagnosis)theEObject;
				T result = caseClaimDiagnosis(claimDiagnosis);
				if (result == null) result = caseBackboneElement(claimDiagnosis);
				if (result == null) result = caseElement(claimDiagnosis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_INSURANCE: {
				ClaimInsurance claimInsurance = (ClaimInsurance)theEObject;
				T result = caseClaimInsurance(claimInsurance);
				if (result == null) result = caseBackboneElement(claimInsurance);
				if (result == null) result = caseElement(claimInsurance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_ITEM: {
				ClaimItem claimItem = (ClaimItem)theEObject;
				T result = caseClaimItem(claimItem);
				if (result == null) result = caseBackboneElement(claimItem);
				if (result == null) result = caseElement(claimItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_PAYEE: {
				ClaimPayee claimPayee = (ClaimPayee)theEObject;
				T result = caseClaimPayee(claimPayee);
				if (result == null) result = caseBackboneElement(claimPayee);
				if (result == null) result = caseElement(claimPayee);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_PROCEDURE: {
				ClaimProcedure claimProcedure = (ClaimProcedure)theEObject;
				T result = caseClaimProcedure(claimProcedure);
				if (result == null) result = caseBackboneElement(claimProcedure);
				if (result == null) result = caseElement(claimProcedure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_PROCESSING_CODES: {
				ClaimProcessingCodes claimProcessingCodes = (ClaimProcessingCodes)theEObject;
				T result = caseClaimProcessingCodes(claimProcessingCodes);
				if (result == null) result = caseElement(claimProcessingCodes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_RELATED: {
				ClaimRelated claimRelated = (ClaimRelated)theEObject;
				T result = caseClaimRelated(claimRelated);
				if (result == null) result = caseBackboneElement(claimRelated);
				if (result == null) result = caseElement(claimRelated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_RESPONSE: {
				ClaimResponse claimResponse = (ClaimResponse)theEObject;
				T result = caseClaimResponse(claimResponse);
				if (result == null) result = caseDomainResource(claimResponse);
				if (result == null) result = caseResource(claimResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM: {
				ClaimResponseAddItem claimResponseAddItem = (ClaimResponseAddItem)theEObject;
				T result = caseClaimResponseAddItem(claimResponseAddItem);
				if (result == null) result = caseBackboneElement(claimResponseAddItem);
				if (result == null) result = caseElement(claimResponseAddItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_RESPONSE_ADJUDICATION: {
				ClaimResponseAdjudication claimResponseAdjudication = (ClaimResponseAdjudication)theEObject;
				T result = caseClaimResponseAdjudication(claimResponseAdjudication);
				if (result == null) result = caseBackboneElement(claimResponseAdjudication);
				if (result == null) result = caseElement(claimResponseAdjudication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_RESPONSE_DETAIL: {
				ClaimResponseDetail claimResponseDetail = (ClaimResponseDetail)theEObject;
				T result = caseClaimResponseDetail(claimResponseDetail);
				if (result == null) result = caseBackboneElement(claimResponseDetail);
				if (result == null) result = caseElement(claimResponseDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_RESPONSE_DETAIL1: {
				ClaimResponseDetail1 claimResponseDetail1 = (ClaimResponseDetail1)theEObject;
				T result = caseClaimResponseDetail1(claimResponseDetail1);
				if (result == null) result = caseBackboneElement(claimResponseDetail1);
				if (result == null) result = caseElement(claimResponseDetail1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_RESPONSE_ERROR: {
				ClaimResponseError claimResponseError = (ClaimResponseError)theEObject;
				T result = caseClaimResponseError(claimResponseError);
				if (result == null) result = caseBackboneElement(claimResponseError);
				if (result == null) result = caseElement(claimResponseError);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_RESPONSE_INSURANCE: {
				ClaimResponseInsurance claimResponseInsurance = (ClaimResponseInsurance)theEObject;
				T result = caseClaimResponseInsurance(claimResponseInsurance);
				if (result == null) result = caseBackboneElement(claimResponseInsurance);
				if (result == null) result = caseElement(claimResponseInsurance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_RESPONSE_ITEM: {
				ClaimResponseItem claimResponseItem = (ClaimResponseItem)theEObject;
				T result = caseClaimResponseItem(claimResponseItem);
				if (result == null) result = caseBackboneElement(claimResponseItem);
				if (result == null) result = caseElement(claimResponseItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_RESPONSE_PAYMENT: {
				ClaimResponsePayment claimResponsePayment = (ClaimResponsePayment)theEObject;
				T result = caseClaimResponsePayment(claimResponsePayment);
				if (result == null) result = caseBackboneElement(claimResponsePayment);
				if (result == null) result = caseElement(claimResponsePayment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_RESPONSE_PROCESS_NOTE: {
				ClaimResponseProcessNote claimResponseProcessNote = (ClaimResponseProcessNote)theEObject;
				T result = caseClaimResponseProcessNote(claimResponseProcessNote);
				if (result == null) result = caseBackboneElement(claimResponseProcessNote);
				if (result == null) result = caseElement(claimResponseProcessNote);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_RESPONSE_SUB_DETAIL: {
				ClaimResponseSubDetail claimResponseSubDetail = (ClaimResponseSubDetail)theEObject;
				T result = caseClaimResponseSubDetail(claimResponseSubDetail);
				if (result == null) result = caseBackboneElement(claimResponseSubDetail);
				if (result == null) result = caseElement(claimResponseSubDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_RESPONSE_SUB_DETAIL1: {
				ClaimResponseSubDetail1 claimResponseSubDetail1 = (ClaimResponseSubDetail1)theEObject;
				T result = caseClaimResponseSubDetail1(claimResponseSubDetail1);
				if (result == null) result = caseBackboneElement(claimResponseSubDetail1);
				if (result == null) result = caseElement(claimResponseSubDetail1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_RESPONSE_TOTAL: {
				ClaimResponseTotal claimResponseTotal = (ClaimResponseTotal)theEObject;
				T result = caseClaimResponseTotal(claimResponseTotal);
				if (result == null) result = caseBackboneElement(claimResponseTotal);
				if (result == null) result = caseElement(claimResponseTotal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_SUB_DETAIL: {
				ClaimSubDetail claimSubDetail = (ClaimSubDetail)theEObject;
				T result = caseClaimSubDetail(claimSubDetail);
				if (result == null) result = caseBackboneElement(claimSubDetail);
				if (result == null) result = caseElement(claimSubDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLAIM_SUPPORTING_INFO: {
				ClaimSupportingInfo claimSupportingInfo = (ClaimSupportingInfo)theEObject;
				T result = caseClaimSupportingInfo(claimSupportingInfo);
				if (result == null) result = caseBackboneElement(claimSupportingInfo);
				if (result == null) result = caseElement(claimSupportingInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLINICAL_IMPRESSION: {
				ClinicalImpression clinicalImpression = (ClinicalImpression)theEObject;
				T result = caseClinicalImpression(clinicalImpression);
				if (result == null) result = caseDomainResource(clinicalImpression);
				if (result == null) result = caseResource(clinicalImpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLINICAL_IMPRESSION_FINDING: {
				ClinicalImpressionFinding clinicalImpressionFinding = (ClinicalImpressionFinding)theEObject;
				T result = caseClinicalImpressionFinding(clinicalImpressionFinding);
				if (result == null) result = caseBackboneElement(clinicalImpressionFinding);
				if (result == null) result = caseElement(clinicalImpressionFinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLINICAL_IMPRESSION_INVESTIGATION: {
				ClinicalImpressionInvestigation clinicalImpressionInvestigation = (ClinicalImpressionInvestigation)theEObject;
				T result = caseClinicalImpressionInvestigation(clinicalImpressionInvestigation);
				if (result == null) result = caseBackboneElement(clinicalImpressionInvestigation);
				if (result == null) result = caseElement(clinicalImpressionInvestigation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CLINICAL_IMPRESSION_STATUS: {
				ClinicalImpressionStatus clinicalImpressionStatus = (ClinicalImpressionStatus)theEObject;
				T result = caseClinicalImpressionStatus(clinicalImpressionStatus);
				if (result == null) result = caseElement(clinicalImpressionStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CODE: {
				Code code = (Code)theEObject;
				T result = caseCode(code);
				if (result == null) result = caseElement(code);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CODEABLE_CONCEPT: {
				CodeableConcept codeableConcept = (CodeableConcept)theEObject;
				T result = caseCodeableConcept(codeableConcept);
				if (result == null) result = caseElement(codeableConcept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CODE_SEARCH_SUPPORT: {
				CodeSearchSupport codeSearchSupport = (CodeSearchSupport)theEObject;
				T result = caseCodeSearchSupport(codeSearchSupport);
				if (result == null) result = caseElement(codeSearchSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CODE_SYSTEM: {
				CodeSystem codeSystem = (CodeSystem)theEObject;
				T result = caseCodeSystem(codeSystem);
				if (result == null) result = caseDomainResource(codeSystem);
				if (result == null) result = caseResource(codeSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CODE_SYSTEM_CONCEPT: {
				CodeSystemConcept codeSystemConcept = (CodeSystemConcept)theEObject;
				T result = caseCodeSystemConcept(codeSystemConcept);
				if (result == null) result = caseBackboneElement(codeSystemConcept);
				if (result == null) result = caseElement(codeSystemConcept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CODE_SYSTEM_CONTENT_MODE: {
				CodeSystemContentMode codeSystemContentMode = (CodeSystemContentMode)theEObject;
				T result = caseCodeSystemContentMode(codeSystemContentMode);
				if (result == null) result = caseElement(codeSystemContentMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CODE_SYSTEM_DESIGNATION: {
				CodeSystemDesignation codeSystemDesignation = (CodeSystemDesignation)theEObject;
				T result = caseCodeSystemDesignation(codeSystemDesignation);
				if (result == null) result = caseBackboneElement(codeSystemDesignation);
				if (result == null) result = caseElement(codeSystemDesignation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CODE_SYSTEM_FILTER: {
				CodeSystemFilter codeSystemFilter = (CodeSystemFilter)theEObject;
				T result = caseCodeSystemFilter(codeSystemFilter);
				if (result == null) result = caseBackboneElement(codeSystemFilter);
				if (result == null) result = caseElement(codeSystemFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CODE_SYSTEM_HIERARCHY_MEANING: {
				CodeSystemHierarchyMeaning codeSystemHierarchyMeaning = (CodeSystemHierarchyMeaning)theEObject;
				T result = caseCodeSystemHierarchyMeaning(codeSystemHierarchyMeaning);
				if (result == null) result = caseElement(codeSystemHierarchyMeaning);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CODE_SYSTEM_PROPERTY: {
				CodeSystemProperty codeSystemProperty = (CodeSystemProperty)theEObject;
				T result = caseCodeSystemProperty(codeSystemProperty);
				if (result == null) result = caseBackboneElement(codeSystemProperty);
				if (result == null) result = caseElement(codeSystemProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CODE_SYSTEM_PROPERTY1: {
				CodeSystemProperty1 codeSystemProperty1 = (CodeSystemProperty1)theEObject;
				T result = caseCodeSystemProperty1(codeSystemProperty1);
				if (result == null) result = caseBackboneElement(codeSystemProperty1);
				if (result == null) result = caseElement(codeSystemProperty1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CODING: {
				Coding coding = (Coding)theEObject;
				T result = caseCoding(coding);
				if (result == null) result = caseElement(coding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.COMMUNICATION: {
				Communication communication = (Communication)theEObject;
				T result = caseCommunication(communication);
				if (result == null) result = caseDomainResource(communication);
				if (result == null) result = caseResource(communication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.COMMUNICATION_PAYLOAD: {
				CommunicationPayload communicationPayload = (CommunicationPayload)theEObject;
				T result = caseCommunicationPayload(communicationPayload);
				if (result == null) result = caseBackboneElement(communicationPayload);
				if (result == null) result = caseElement(communicationPayload);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.COMMUNICATION_REQUEST: {
				CommunicationRequest communicationRequest = (CommunicationRequest)theEObject;
				T result = caseCommunicationRequest(communicationRequest);
				if (result == null) result = caseDomainResource(communicationRequest);
				if (result == null) result = caseResource(communicationRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.COMMUNICATION_REQUEST_PAYLOAD: {
				CommunicationRequestPayload communicationRequestPayload = (CommunicationRequestPayload)theEObject;
				T result = caseCommunicationRequestPayload(communicationRequestPayload);
				if (result == null) result = caseBackboneElement(communicationRequestPayload);
				if (result == null) result = caseElement(communicationRequestPayload);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.COMPARTMENT_DEFINITION: {
				CompartmentDefinition compartmentDefinition = (CompartmentDefinition)theEObject;
				T result = caseCompartmentDefinition(compartmentDefinition);
				if (result == null) result = caseDomainResource(compartmentDefinition);
				if (result == null) result = caseResource(compartmentDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.COMPARTMENT_DEFINITION_RESOURCE: {
				CompartmentDefinitionResource compartmentDefinitionResource = (CompartmentDefinitionResource)theEObject;
				T result = caseCompartmentDefinitionResource(compartmentDefinitionResource);
				if (result == null) result = caseBackboneElement(compartmentDefinitionResource);
				if (result == null) result = caseElement(compartmentDefinitionResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.COMPARTMENT_TYPE: {
				CompartmentType compartmentType = (CompartmentType)theEObject;
				T result = caseCompartmentType(compartmentType);
				if (result == null) result = caseElement(compartmentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.COMPOSITION: {
				Composition composition = (Composition)theEObject;
				T result = caseComposition(composition);
				if (result == null) result = caseDomainResource(composition);
				if (result == null) result = caseResource(composition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.COMPOSITION_ATTESTATION_MODE: {
				CompositionAttestationMode compositionAttestationMode = (CompositionAttestationMode)theEObject;
				T result = caseCompositionAttestationMode(compositionAttestationMode);
				if (result == null) result = caseElement(compositionAttestationMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.COMPOSITION_ATTESTER: {
				CompositionAttester compositionAttester = (CompositionAttester)theEObject;
				T result = caseCompositionAttester(compositionAttester);
				if (result == null) result = caseBackboneElement(compositionAttester);
				if (result == null) result = caseElement(compositionAttester);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.COMPOSITION_EVENT: {
				CompositionEvent compositionEvent = (CompositionEvent)theEObject;
				T result = caseCompositionEvent(compositionEvent);
				if (result == null) result = caseBackboneElement(compositionEvent);
				if (result == null) result = caseElement(compositionEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.COMPOSITION_RELATES_TO: {
				CompositionRelatesTo compositionRelatesTo = (CompositionRelatesTo)theEObject;
				T result = caseCompositionRelatesTo(compositionRelatesTo);
				if (result == null) result = caseBackboneElement(compositionRelatesTo);
				if (result == null) result = caseElement(compositionRelatesTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.COMPOSITION_SECTION: {
				CompositionSection compositionSection = (CompositionSection)theEObject;
				T result = caseCompositionSection(compositionSection);
				if (result == null) result = caseBackboneElement(compositionSection);
				if (result == null) result = caseElement(compositionSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.COMPOSITION_STATUS: {
				CompositionStatus compositionStatus = (CompositionStatus)theEObject;
				T result = caseCompositionStatus(compositionStatus);
				if (result == null) result = caseElement(compositionStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONCEPT_MAP: {
				ConceptMap conceptMap = (ConceptMap)theEObject;
				T result = caseConceptMap(conceptMap);
				if (result == null) result = caseDomainResource(conceptMap);
				if (result == null) result = caseResource(conceptMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONCEPT_MAP_DEPENDS_ON: {
				ConceptMapDependsOn conceptMapDependsOn = (ConceptMapDependsOn)theEObject;
				T result = caseConceptMapDependsOn(conceptMapDependsOn);
				if (result == null) result = caseBackboneElement(conceptMapDependsOn);
				if (result == null) result = caseElement(conceptMapDependsOn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONCEPT_MAP_ELEMENT: {
				ConceptMapElement conceptMapElement = (ConceptMapElement)theEObject;
				T result = caseConceptMapElement(conceptMapElement);
				if (result == null) result = caseBackboneElement(conceptMapElement);
				if (result == null) result = caseElement(conceptMapElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONCEPT_MAP_EQUIVALENCE: {
				ConceptMapEquivalence conceptMapEquivalence = (ConceptMapEquivalence)theEObject;
				T result = caseConceptMapEquivalence(conceptMapEquivalence);
				if (result == null) result = caseElement(conceptMapEquivalence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONCEPT_MAP_GROUP: {
				ConceptMapGroup conceptMapGroup = (ConceptMapGroup)theEObject;
				T result = caseConceptMapGroup(conceptMapGroup);
				if (result == null) result = caseBackboneElement(conceptMapGroup);
				if (result == null) result = caseElement(conceptMapGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONCEPT_MAP_GROUP_UNMAPPED_MODE: {
				ConceptMapGroupUnmappedMode conceptMapGroupUnmappedMode = (ConceptMapGroupUnmappedMode)theEObject;
				T result = caseConceptMapGroupUnmappedMode(conceptMapGroupUnmappedMode);
				if (result == null) result = caseElement(conceptMapGroupUnmappedMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONCEPT_MAP_TARGET: {
				ConceptMapTarget conceptMapTarget = (ConceptMapTarget)theEObject;
				T result = caseConceptMapTarget(conceptMapTarget);
				if (result == null) result = caseBackboneElement(conceptMapTarget);
				if (result == null) result = caseElement(conceptMapTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONCEPT_MAP_UNMAPPED: {
				ConceptMapUnmapped conceptMapUnmapped = (ConceptMapUnmapped)theEObject;
				T result = caseConceptMapUnmapped(conceptMapUnmapped);
				if (result == null) result = caseBackboneElement(conceptMapUnmapped);
				if (result == null) result = caseElement(conceptMapUnmapped);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = caseDomainResource(condition);
				if (result == null) result = caseResource(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONDITIONAL_DELETE_STATUS: {
				ConditionalDeleteStatus conditionalDeleteStatus = (ConditionalDeleteStatus)theEObject;
				T result = caseConditionalDeleteStatus(conditionalDeleteStatus);
				if (result == null) result = caseElement(conditionalDeleteStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONDITIONAL_READ_STATUS: {
				ConditionalReadStatus conditionalReadStatus = (ConditionalReadStatus)theEObject;
				T result = caseConditionalReadStatus(conditionalReadStatus);
				if (result == null) result = caseElement(conditionalReadStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONDITION_EVIDENCE: {
				ConditionEvidence conditionEvidence = (ConditionEvidence)theEObject;
				T result = caseConditionEvidence(conditionEvidence);
				if (result == null) result = caseBackboneElement(conditionEvidence);
				if (result == null) result = caseElement(conditionEvidence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONDITION_STAGE: {
				ConditionStage conditionStage = (ConditionStage)theEObject;
				T result = caseConditionStage(conditionStage);
				if (result == null) result = caseBackboneElement(conditionStage);
				if (result == null) result = caseElement(conditionStage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONSENT: {
				Consent consent = (Consent)theEObject;
				T result = caseConsent(consent);
				if (result == null) result = caseDomainResource(consent);
				if (result == null) result = caseResource(consent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONSENT_ACTOR: {
				ConsentActor consentActor = (ConsentActor)theEObject;
				T result = caseConsentActor(consentActor);
				if (result == null) result = caseBackboneElement(consentActor);
				if (result == null) result = caseElement(consentActor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONSENT_DATA: {
				ConsentData consentData = (ConsentData)theEObject;
				T result = caseConsentData(consentData);
				if (result == null) result = caseBackboneElement(consentData);
				if (result == null) result = caseElement(consentData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONSENT_DATA_MEANING: {
				ConsentDataMeaning consentDataMeaning = (ConsentDataMeaning)theEObject;
				T result = caseConsentDataMeaning(consentDataMeaning);
				if (result == null) result = caseElement(consentDataMeaning);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONSENT_POLICY: {
				ConsentPolicy consentPolicy = (ConsentPolicy)theEObject;
				T result = caseConsentPolicy(consentPolicy);
				if (result == null) result = caseBackboneElement(consentPolicy);
				if (result == null) result = caseElement(consentPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONSENT_PROVISION: {
				ConsentProvision consentProvision = (ConsentProvision)theEObject;
				T result = caseConsentProvision(consentProvision);
				if (result == null) result = caseBackboneElement(consentProvision);
				if (result == null) result = caseElement(consentProvision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONSENT_PROVISION_TYPE: {
				ConsentProvisionType consentProvisionType = (ConsentProvisionType)theEObject;
				T result = caseConsentProvisionType(consentProvisionType);
				if (result == null) result = caseElement(consentProvisionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONSENT_STATE: {
				ConsentState consentState = (ConsentState)theEObject;
				T result = caseConsentState(consentState);
				if (result == null) result = caseElement(consentState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONSENT_VERIFICATION: {
				ConsentVerification consentVerification = (ConsentVerification)theEObject;
				T result = caseConsentVerification(consentVerification);
				if (result == null) result = caseBackboneElement(consentVerification);
				if (result == null) result = caseElement(consentVerification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONSTRAINT_SEVERITY: {
				ConstraintSeverity constraintSeverity = (ConstraintSeverity)theEObject;
				T result = caseConstraintSeverity(constraintSeverity);
				if (result == null) result = caseElement(constraintSeverity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONTACT_DETAIL: {
				ContactDetail contactDetail = (ContactDetail)theEObject;
				T result = caseContactDetail(contactDetail);
				if (result == null) result = caseElement(contactDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONTACT_POINT: {
				ContactPoint contactPoint = (ContactPoint)theEObject;
				T result = caseContactPoint(contactPoint);
				if (result == null) result = caseElement(contactPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONTACT_POINT_SYSTEM: {
				ContactPointSystem contactPointSystem = (ContactPointSystem)theEObject;
				T result = caseContactPointSystem(contactPointSystem);
				if (result == null) result = caseElement(contactPointSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONTACT_POINT_USE: {
				ContactPointUse contactPointUse = (ContactPointUse)theEObject;
				T result = caseContactPointUse(contactPointUse);
				if (result == null) result = caseElement(contactPointUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONTRACT: {
				Contract contract = (Contract)theEObject;
				T result = caseContract(contract);
				if (result == null) result = caseDomainResource(contract);
				if (result == null) result = caseResource(contract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONTRACT_ACTION: {
				ContractAction contractAction = (ContractAction)theEObject;
				T result = caseContractAction(contractAction);
				if (result == null) result = caseBackboneElement(contractAction);
				if (result == null) result = caseElement(contractAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONTRACT_ANSWER: {
				ContractAnswer contractAnswer = (ContractAnswer)theEObject;
				T result = caseContractAnswer(contractAnswer);
				if (result == null) result = caseBackboneElement(contractAnswer);
				if (result == null) result = caseElement(contractAnswer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONTRACT_ASSET: {
				ContractAsset contractAsset = (ContractAsset)theEObject;
				T result = caseContractAsset(contractAsset);
				if (result == null) result = caseBackboneElement(contractAsset);
				if (result == null) result = caseElement(contractAsset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONTRACT_CONTENT_DEFINITION: {
				ContractContentDefinition contractContentDefinition = (ContractContentDefinition)theEObject;
				T result = caseContractContentDefinition(contractContentDefinition);
				if (result == null) result = caseBackboneElement(contractContentDefinition);
				if (result == null) result = caseElement(contractContentDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONTRACT_CONTEXT: {
				ContractContext contractContext = (ContractContext)theEObject;
				T result = caseContractContext(contractContext);
				if (result == null) result = caseBackboneElement(contractContext);
				if (result == null) result = caseElement(contractContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONTRACT_FRIENDLY: {
				ContractFriendly contractFriendly = (ContractFriendly)theEObject;
				T result = caseContractFriendly(contractFriendly);
				if (result == null) result = caseBackboneElement(contractFriendly);
				if (result == null) result = caseElement(contractFriendly);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONTRACT_LEGAL: {
				ContractLegal contractLegal = (ContractLegal)theEObject;
				T result = caseContractLegal(contractLegal);
				if (result == null) result = caseBackboneElement(contractLegal);
				if (result == null) result = caseElement(contractLegal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONTRACT_OFFER: {
				ContractOffer contractOffer = (ContractOffer)theEObject;
				T result = caseContractOffer(contractOffer);
				if (result == null) result = caseBackboneElement(contractOffer);
				if (result == null) result = caseElement(contractOffer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONTRACT_PARTY: {
				ContractParty contractParty = (ContractParty)theEObject;
				T result = caseContractParty(contractParty);
				if (result == null) result = caseBackboneElement(contractParty);
				if (result == null) result = caseElement(contractParty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONTRACT_RESOURCE_PUBLICATION_STATUS_CODES: {
				ContractResourcePublicationStatusCodes contractResourcePublicationStatusCodes = (ContractResourcePublicationStatusCodes)theEObject;
				T result = caseContractResourcePublicationStatusCodes(contractResourcePublicationStatusCodes);
				if (result == null) result = caseElement(contractResourcePublicationStatusCodes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONTRACT_RESOURCE_STATUS_CODES: {
				ContractResourceStatusCodes contractResourceStatusCodes = (ContractResourceStatusCodes)theEObject;
				T result = caseContractResourceStatusCodes(contractResourceStatusCodes);
				if (result == null) result = caseElement(contractResourceStatusCodes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONTRACT_RULE: {
				ContractRule contractRule = (ContractRule)theEObject;
				T result = caseContractRule(contractRule);
				if (result == null) result = caseBackboneElement(contractRule);
				if (result == null) result = caseElement(contractRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONTRACT_SECURITY_LABEL: {
				ContractSecurityLabel contractSecurityLabel = (ContractSecurityLabel)theEObject;
				T result = caseContractSecurityLabel(contractSecurityLabel);
				if (result == null) result = caseBackboneElement(contractSecurityLabel);
				if (result == null) result = caseElement(contractSecurityLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONTRACT_SIGNER: {
				ContractSigner contractSigner = (ContractSigner)theEObject;
				T result = caseContractSigner(contractSigner);
				if (result == null) result = caseBackboneElement(contractSigner);
				if (result == null) result = caseElement(contractSigner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONTRACT_SUBJECT: {
				ContractSubject contractSubject = (ContractSubject)theEObject;
				T result = caseContractSubject(contractSubject);
				if (result == null) result = caseBackboneElement(contractSubject);
				if (result == null) result = caseElement(contractSubject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONTRACT_TERM: {
				ContractTerm contractTerm = (ContractTerm)theEObject;
				T result = caseContractTerm(contractTerm);
				if (result == null) result = caseBackboneElement(contractTerm);
				if (result == null) result = caseElement(contractTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONTRACT_VALUED_ITEM: {
				ContractValuedItem contractValuedItem = (ContractValuedItem)theEObject;
				T result = caseContractValuedItem(contractValuedItem);
				if (result == null) result = caseBackboneElement(contractValuedItem);
				if (result == null) result = caseElement(contractValuedItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONTRIBUTOR: {
				Contributor contributor = (Contributor)theEObject;
				T result = caseContributor(contributor);
				if (result == null) result = caseElement(contributor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.CONTRIBUTOR_TYPE: {
				ContributorType contributorType = (ContributorType)theEObject;
				T result = caseContributorType(contributorType);
				if (result == null) result = caseElement(contributorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.COUNT: {
				Count count = (Count)theEObject;
				T result = caseCount(count);
				if (result == null) result = caseQuantity(count);
				if (result == null) result = caseElement(count);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.COVERAGE: {
				Coverage coverage = (Coverage)theEObject;
				T result = caseCoverage(coverage);
				if (result == null) result = caseDomainResource(coverage);
				if (result == null) result = caseResource(coverage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.COVERAGE_CLASS: {
				CoverageClass coverageClass = (CoverageClass)theEObject;
				T result = caseCoverageClass(coverageClass);
				if (result == null) result = caseBackboneElement(coverageClass);
				if (result == null) result = caseElement(coverageClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.COVERAGE_COST_TO_BENEFICIARY: {
				CoverageCostToBeneficiary coverageCostToBeneficiary = (CoverageCostToBeneficiary)theEObject;
				T result = caseCoverageCostToBeneficiary(coverageCostToBeneficiary);
				if (result == null) result = caseBackboneElement(coverageCostToBeneficiary);
				if (result == null) result = caseElement(coverageCostToBeneficiary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST: {
				CoverageEligibilityRequest coverageEligibilityRequest = (CoverageEligibilityRequest)theEObject;
				T result = caseCoverageEligibilityRequest(coverageEligibilityRequest);
				if (result == null) result = caseDomainResource(coverageEligibilityRequest);
				if (result == null) result = caseResource(coverageEligibilityRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_DIAGNOSIS: {
				CoverageEligibilityRequestDiagnosis coverageEligibilityRequestDiagnosis = (CoverageEligibilityRequestDiagnosis)theEObject;
				T result = caseCoverageEligibilityRequestDiagnosis(coverageEligibilityRequestDiagnosis);
				if (result == null) result = caseBackboneElement(coverageEligibilityRequestDiagnosis);
				if (result == null) result = caseElement(coverageEligibilityRequestDiagnosis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_INSURANCE: {
				CoverageEligibilityRequestInsurance coverageEligibilityRequestInsurance = (CoverageEligibilityRequestInsurance)theEObject;
				T result = caseCoverageEligibilityRequestInsurance(coverageEligibilityRequestInsurance);
				if (result == null) result = caseBackboneElement(coverageEligibilityRequestInsurance);
				if (result == null) result = caseElement(coverageEligibilityRequestInsurance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_ITEM: {
				CoverageEligibilityRequestItem coverageEligibilityRequestItem = (CoverageEligibilityRequestItem)theEObject;
				T result = caseCoverageEligibilityRequestItem(coverageEligibilityRequestItem);
				if (result == null) result = caseBackboneElement(coverageEligibilityRequestItem);
				if (result == null) result = caseElement(coverageEligibilityRequestItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.COVERAGE_ELIGIBILITY_REQUEST_SUPPORTING_INFO: {
				CoverageEligibilityRequestSupportingInfo coverageEligibilityRequestSupportingInfo = (CoverageEligibilityRequestSupportingInfo)theEObject;
				T result = caseCoverageEligibilityRequestSupportingInfo(coverageEligibilityRequestSupportingInfo);
				if (result == null) result = caseBackboneElement(coverageEligibilityRequestSupportingInfo);
				if (result == null) result = caseElement(coverageEligibilityRequestSupportingInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE: {
				CoverageEligibilityResponse coverageEligibilityResponse = (CoverageEligibilityResponse)theEObject;
				T result = caseCoverageEligibilityResponse(coverageEligibilityResponse);
				if (result == null) result = caseDomainResource(coverageEligibilityResponse);
				if (result == null) result = caseResource(coverageEligibilityResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_BENEFIT: {
				CoverageEligibilityResponseBenefit coverageEligibilityResponseBenefit = (CoverageEligibilityResponseBenefit)theEObject;
				T result = caseCoverageEligibilityResponseBenefit(coverageEligibilityResponseBenefit);
				if (result == null) result = caseBackboneElement(coverageEligibilityResponseBenefit);
				if (result == null) result = caseElement(coverageEligibilityResponseBenefit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ERROR: {
				CoverageEligibilityResponseError coverageEligibilityResponseError = (CoverageEligibilityResponseError)theEObject;
				T result = caseCoverageEligibilityResponseError(coverageEligibilityResponseError);
				if (result == null) result = caseBackboneElement(coverageEligibilityResponseError);
				if (result == null) result = caseElement(coverageEligibilityResponseError);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE: {
				CoverageEligibilityResponseInsurance coverageEligibilityResponseInsurance = (CoverageEligibilityResponseInsurance)theEObject;
				T result = caseCoverageEligibilityResponseInsurance(coverageEligibilityResponseInsurance);
				if (result == null) result = caseBackboneElement(coverageEligibilityResponseInsurance);
				if (result == null) result = caseElement(coverageEligibilityResponseInsurance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.COVERAGE_ELIGIBILITY_RESPONSE_ITEM: {
				CoverageEligibilityResponseItem coverageEligibilityResponseItem = (CoverageEligibilityResponseItem)theEObject;
				T result = caseCoverageEligibilityResponseItem(coverageEligibilityResponseItem);
				if (result == null) result = caseBackboneElement(coverageEligibilityResponseItem);
				if (result == null) result = caseElement(coverageEligibilityResponseItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.COVERAGE_EXCEPTION: {
				CoverageException coverageException = (CoverageException)theEObject;
				T result = caseCoverageException(coverageException);
				if (result == null) result = caseBackboneElement(coverageException);
				if (result == null) result = caseElement(coverageException);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DATA_REQUIREMENT: {
				DataRequirement dataRequirement = (DataRequirement)theEObject;
				T result = caseDataRequirement(dataRequirement);
				if (result == null) result = caseElement(dataRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER: {
				DataRequirementCodeFilter dataRequirementCodeFilter = (DataRequirementCodeFilter)theEObject;
				T result = caseDataRequirementCodeFilter(dataRequirementCodeFilter);
				if (result == null) result = caseElement(dataRequirementCodeFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DATA_REQUIREMENT_DATE_FILTER: {
				DataRequirementDateFilter dataRequirementDateFilter = (DataRequirementDateFilter)theEObject;
				T result = caseDataRequirementDateFilter(dataRequirementDateFilter);
				if (result == null) result = caseElement(dataRequirementDateFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DATA_REQUIREMENT_SORT: {
				DataRequirementSort dataRequirementSort = (DataRequirementSort)theEObject;
				T result = caseDataRequirementSort(dataRequirementSort);
				if (result == null) result = caseElement(dataRequirementSort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DATE: {
				Date date = (Date)theEObject;
				T result = caseDate(date);
				if (result == null) result = caseElement(date);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DATE_TIME: {
				DateTime dateTime = (DateTime)theEObject;
				T result = caseDateTime(dateTime);
				if (result == null) result = caseElement(dateTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DAYS_OF_WEEK: {
				DaysOfWeek daysOfWeek = (DaysOfWeek)theEObject;
				T result = caseDaysOfWeek(daysOfWeek);
				if (result == null) result = caseElement(daysOfWeek);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DECIMAL: {
				Decimal decimal = (Decimal)theEObject;
				T result = caseDecimal(decimal);
				if (result == null) result = caseElement(decimal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DETECTED_ISSUE: {
				DetectedIssue detectedIssue = (DetectedIssue)theEObject;
				T result = caseDetectedIssue(detectedIssue);
				if (result == null) result = caseDomainResource(detectedIssue);
				if (result == null) result = caseResource(detectedIssue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DETECTED_ISSUE_EVIDENCE: {
				DetectedIssueEvidence detectedIssueEvidence = (DetectedIssueEvidence)theEObject;
				T result = caseDetectedIssueEvidence(detectedIssueEvidence);
				if (result == null) result = caseBackboneElement(detectedIssueEvidence);
				if (result == null) result = caseElement(detectedIssueEvidence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DETECTED_ISSUE_MITIGATION: {
				DetectedIssueMitigation detectedIssueMitigation = (DetectedIssueMitigation)theEObject;
				T result = caseDetectedIssueMitigation(detectedIssueMitigation);
				if (result == null) result = caseBackboneElement(detectedIssueMitigation);
				if (result == null) result = caseElement(detectedIssueMitigation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DETECTED_ISSUE_SEVERITY: {
				DetectedIssueSeverity detectedIssueSeverity = (DetectedIssueSeverity)theEObject;
				T result = caseDetectedIssueSeverity(detectedIssueSeverity);
				if (result == null) result = caseElement(detectedIssueSeverity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DEVICE: {
				Device device = (Device)theEObject;
				T result = caseDevice(device);
				if (result == null) result = caseDomainResource(device);
				if (result == null) result = caseResource(device);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DEVICE_DEFINITION: {
				DeviceDefinition deviceDefinition = (DeviceDefinition)theEObject;
				T result = caseDeviceDefinition(deviceDefinition);
				if (result == null) result = caseDomainResource(deviceDefinition);
				if (result == null) result = caseResource(deviceDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DEVICE_DEFINITION_CAPABILITY: {
				DeviceDefinitionCapability deviceDefinitionCapability = (DeviceDefinitionCapability)theEObject;
				T result = caseDeviceDefinitionCapability(deviceDefinitionCapability);
				if (result == null) result = caseBackboneElement(deviceDefinitionCapability);
				if (result == null) result = caseElement(deviceDefinitionCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DEVICE_DEFINITION_DEVICE_NAME: {
				DeviceDefinitionDeviceName deviceDefinitionDeviceName = (DeviceDefinitionDeviceName)theEObject;
				T result = caseDeviceDefinitionDeviceName(deviceDefinitionDeviceName);
				if (result == null) result = caseBackboneElement(deviceDefinitionDeviceName);
				if (result == null) result = caseElement(deviceDefinitionDeviceName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DEVICE_DEFINITION_MATERIAL: {
				DeviceDefinitionMaterial deviceDefinitionMaterial = (DeviceDefinitionMaterial)theEObject;
				T result = caseDeviceDefinitionMaterial(deviceDefinitionMaterial);
				if (result == null) result = caseBackboneElement(deviceDefinitionMaterial);
				if (result == null) result = caseElement(deviceDefinitionMaterial);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DEVICE_DEFINITION_PROPERTY: {
				DeviceDefinitionProperty deviceDefinitionProperty = (DeviceDefinitionProperty)theEObject;
				T result = caseDeviceDefinitionProperty(deviceDefinitionProperty);
				if (result == null) result = caseBackboneElement(deviceDefinitionProperty);
				if (result == null) result = caseElement(deviceDefinitionProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DEVICE_DEFINITION_SPECIALIZATION: {
				DeviceDefinitionSpecialization deviceDefinitionSpecialization = (DeviceDefinitionSpecialization)theEObject;
				T result = caseDeviceDefinitionSpecialization(deviceDefinitionSpecialization);
				if (result == null) result = caseBackboneElement(deviceDefinitionSpecialization);
				if (result == null) result = caseElement(deviceDefinitionSpecialization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DEVICE_DEFINITION_UDI_DEVICE_IDENTIFIER: {
				DeviceDefinitionUdiDeviceIdentifier deviceDefinitionUdiDeviceIdentifier = (DeviceDefinitionUdiDeviceIdentifier)theEObject;
				T result = caseDeviceDefinitionUdiDeviceIdentifier(deviceDefinitionUdiDeviceIdentifier);
				if (result == null) result = caseBackboneElement(deviceDefinitionUdiDeviceIdentifier);
				if (result == null) result = caseElement(deviceDefinitionUdiDeviceIdentifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DEVICE_DEVICE_NAME: {
				DeviceDeviceName deviceDeviceName = (DeviceDeviceName)theEObject;
				T result = caseDeviceDeviceName(deviceDeviceName);
				if (result == null) result = caseBackboneElement(deviceDeviceName);
				if (result == null) result = caseElement(deviceDeviceName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DEVICE_METRIC: {
				DeviceMetric deviceMetric = (DeviceMetric)theEObject;
				T result = caseDeviceMetric(deviceMetric);
				if (result == null) result = caseDomainResource(deviceMetric);
				if (result == null) result = caseResource(deviceMetric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DEVICE_METRIC_CALIBRATION: {
				DeviceMetricCalibration deviceMetricCalibration = (DeviceMetricCalibration)theEObject;
				T result = caseDeviceMetricCalibration(deviceMetricCalibration);
				if (result == null) result = caseBackboneElement(deviceMetricCalibration);
				if (result == null) result = caseElement(deviceMetricCalibration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DEVICE_METRIC_CALIBRATION_STATE: {
				DeviceMetricCalibrationState deviceMetricCalibrationState = (DeviceMetricCalibrationState)theEObject;
				T result = caseDeviceMetricCalibrationState(deviceMetricCalibrationState);
				if (result == null) result = caseElement(deviceMetricCalibrationState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DEVICE_METRIC_CALIBRATION_TYPE: {
				DeviceMetricCalibrationType deviceMetricCalibrationType = (DeviceMetricCalibrationType)theEObject;
				T result = caseDeviceMetricCalibrationType(deviceMetricCalibrationType);
				if (result == null) result = caseElement(deviceMetricCalibrationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DEVICE_METRIC_CATEGORY: {
				DeviceMetricCategory deviceMetricCategory = (DeviceMetricCategory)theEObject;
				T result = caseDeviceMetricCategory(deviceMetricCategory);
				if (result == null) result = caseElement(deviceMetricCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DEVICE_METRIC_COLOR: {
				DeviceMetricColor deviceMetricColor = (DeviceMetricColor)theEObject;
				T result = caseDeviceMetricColor(deviceMetricColor);
				if (result == null) result = caseElement(deviceMetricColor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DEVICE_METRIC_OPERATIONAL_STATUS: {
				DeviceMetricOperationalStatus deviceMetricOperationalStatus = (DeviceMetricOperationalStatus)theEObject;
				T result = caseDeviceMetricOperationalStatus(deviceMetricOperationalStatus);
				if (result == null) result = caseElement(deviceMetricOperationalStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DEVICE_NAME_TYPE: {
				DeviceNameType deviceNameType = (DeviceNameType)theEObject;
				T result = caseDeviceNameType(deviceNameType);
				if (result == null) result = caseElement(deviceNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DEVICE_PROPERTY: {
				DeviceProperty deviceProperty = (DeviceProperty)theEObject;
				T result = caseDeviceProperty(deviceProperty);
				if (result == null) result = caseBackboneElement(deviceProperty);
				if (result == null) result = caseElement(deviceProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DEVICE_REQUEST: {
				DeviceRequest deviceRequest = (DeviceRequest)theEObject;
				T result = caseDeviceRequest(deviceRequest);
				if (result == null) result = caseDomainResource(deviceRequest);
				if (result == null) result = caseResource(deviceRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DEVICE_REQUEST_PARAMETER: {
				DeviceRequestParameter deviceRequestParameter = (DeviceRequestParameter)theEObject;
				T result = caseDeviceRequestParameter(deviceRequestParameter);
				if (result == null) result = caseBackboneElement(deviceRequestParameter);
				if (result == null) result = caseElement(deviceRequestParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DEVICE_SPECIALIZATION: {
				DeviceSpecialization deviceSpecialization = (DeviceSpecialization)theEObject;
				T result = caseDeviceSpecialization(deviceSpecialization);
				if (result == null) result = caseBackboneElement(deviceSpecialization);
				if (result == null) result = caseElement(deviceSpecialization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DEVICE_UDI_CARRIER: {
				DeviceUdiCarrier deviceUdiCarrier = (DeviceUdiCarrier)theEObject;
				T result = caseDeviceUdiCarrier(deviceUdiCarrier);
				if (result == null) result = caseBackboneElement(deviceUdiCarrier);
				if (result == null) result = caseElement(deviceUdiCarrier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DEVICE_USE_STATEMENT: {
				DeviceUseStatement deviceUseStatement = (DeviceUseStatement)theEObject;
				T result = caseDeviceUseStatement(deviceUseStatement);
				if (result == null) result = caseDomainResource(deviceUseStatement);
				if (result == null) result = caseResource(deviceUseStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DEVICE_USE_STATEMENT_STATUS: {
				DeviceUseStatementStatus deviceUseStatementStatus = (DeviceUseStatementStatus)theEObject;
				T result = caseDeviceUseStatementStatus(deviceUseStatementStatus);
				if (result == null) result = caseElement(deviceUseStatementStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DEVICE_VERSION: {
				DeviceVersion deviceVersion = (DeviceVersion)theEObject;
				T result = caseDeviceVersion(deviceVersion);
				if (result == null) result = caseBackboneElement(deviceVersion);
				if (result == null) result = caseElement(deviceVersion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DIAGNOSTIC_REPORT: {
				DiagnosticReport diagnosticReport = (DiagnosticReport)theEObject;
				T result = caseDiagnosticReport(diagnosticReport);
				if (result == null) result = caseDomainResource(diagnosticReport);
				if (result == null) result = caseResource(diagnosticReport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DIAGNOSTIC_REPORT_MEDIA: {
				DiagnosticReportMedia diagnosticReportMedia = (DiagnosticReportMedia)theEObject;
				T result = caseDiagnosticReportMedia(diagnosticReportMedia);
				if (result == null) result = caseBackboneElement(diagnosticReportMedia);
				if (result == null) result = caseElement(diagnosticReportMedia);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DIAGNOSTIC_REPORT_STATUS: {
				DiagnosticReportStatus diagnosticReportStatus = (DiagnosticReportStatus)theEObject;
				T result = caseDiagnosticReportStatus(diagnosticReportStatus);
				if (result == null) result = caseElement(diagnosticReportStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DISCRIMINATOR_TYPE: {
				DiscriminatorType discriminatorType = (DiscriminatorType)theEObject;
				T result = caseDiscriminatorType(discriminatorType);
				if (result == null) result = caseElement(discriminatorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DISTANCE: {
				Distance distance = (Distance)theEObject;
				T result = caseDistance(distance);
				if (result == null) result = caseQuantity(distance);
				if (result == null) result = caseElement(distance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DOCUMENT_MANIFEST: {
				DocumentManifest documentManifest = (DocumentManifest)theEObject;
				T result = caseDocumentManifest(documentManifest);
				if (result == null) result = caseDomainResource(documentManifest);
				if (result == null) result = caseResource(documentManifest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DOCUMENT_MANIFEST_RELATED: {
				DocumentManifestRelated documentManifestRelated = (DocumentManifestRelated)theEObject;
				T result = caseDocumentManifestRelated(documentManifestRelated);
				if (result == null) result = caseBackboneElement(documentManifestRelated);
				if (result == null) result = caseElement(documentManifestRelated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DOCUMENT_MODE: {
				DocumentMode documentMode = (DocumentMode)theEObject;
				T result = caseDocumentMode(documentMode);
				if (result == null) result = caseElement(documentMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DOCUMENT_REFERENCE: {
				DocumentReference documentReference = (DocumentReference)theEObject;
				T result = caseDocumentReference(documentReference);
				if (result == null) result = caseDomainResource(documentReference);
				if (result == null) result = caseResource(documentReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DOCUMENT_REFERENCE_CONTENT: {
				DocumentReferenceContent documentReferenceContent = (DocumentReferenceContent)theEObject;
				T result = caseDocumentReferenceContent(documentReferenceContent);
				if (result == null) result = caseBackboneElement(documentReferenceContent);
				if (result == null) result = caseElement(documentReferenceContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DOCUMENT_REFERENCE_CONTEXT: {
				DocumentReferenceContext documentReferenceContext = (DocumentReferenceContext)theEObject;
				T result = caseDocumentReferenceContext(documentReferenceContext);
				if (result == null) result = caseBackboneElement(documentReferenceContext);
				if (result == null) result = caseElement(documentReferenceContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DOCUMENT_REFERENCE_RELATES_TO: {
				DocumentReferenceRelatesTo documentReferenceRelatesTo = (DocumentReferenceRelatesTo)theEObject;
				T result = caseDocumentReferenceRelatesTo(documentReferenceRelatesTo);
				if (result == null) result = caseBackboneElement(documentReferenceRelatesTo);
				if (result == null) result = caseElement(documentReferenceRelatesTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DOCUMENT_REFERENCE_STATUS: {
				DocumentReferenceStatus documentReferenceStatus = (DocumentReferenceStatus)theEObject;
				T result = caseDocumentReferenceStatus(documentReferenceStatus);
				if (result == null) result = caseElement(documentReferenceStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DOCUMENT_RELATIONSHIP_TYPE: {
				DocumentRelationshipType documentRelationshipType = (DocumentRelationshipType)theEObject;
				T result = caseDocumentRelationshipType(documentRelationshipType);
				if (result == null) result = caseElement(documentRelationshipType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DOMAIN_RESOURCE: {
				DomainResource domainResource = (DomainResource)theEObject;
				T result = caseDomainResource(domainResource);
				if (result == null) result = caseResource(domainResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DOSAGE: {
				Dosage dosage = (Dosage)theEObject;
				T result = caseDosage(dosage);
				if (result == null) result = caseBackboneElement(dosage);
				if (result == null) result = caseElement(dosage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DOSAGE_DOSE_AND_RATE: {
				DosageDoseAndRate dosageDoseAndRate = (DosageDoseAndRate)theEObject;
				T result = caseDosageDoseAndRate(dosageDoseAndRate);
				if (result == null) result = caseBackboneElement(dosageDoseAndRate);
				if (result == null) result = caseElement(dosageDoseAndRate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.DURATION: {
				Duration duration = (Duration)theEObject;
				T result = caseDuration(duration);
				if (result == null) result = caseQuantity(duration);
				if (result == null) result = caseElement(duration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS: {
				EffectEvidenceSynthesis effectEvidenceSynthesis = (EffectEvidenceSynthesis)theEObject;
				T result = caseEffectEvidenceSynthesis(effectEvidenceSynthesis);
				if (result == null) result = caseDomainResource(effectEvidenceSynthesis);
				if (result == null) result = caseResource(effectEvidenceSynthesis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS_CERTAINTY: {
				EffectEvidenceSynthesisCertainty effectEvidenceSynthesisCertainty = (EffectEvidenceSynthesisCertainty)theEObject;
				T result = caseEffectEvidenceSynthesisCertainty(effectEvidenceSynthesisCertainty);
				if (result == null) result = caseBackboneElement(effectEvidenceSynthesisCertainty);
				if (result == null) result = caseElement(effectEvidenceSynthesisCertainty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS_CERTAINTY_SUBCOMPONENT: {
				EffectEvidenceSynthesisCertaintySubcomponent effectEvidenceSynthesisCertaintySubcomponent = (EffectEvidenceSynthesisCertaintySubcomponent)theEObject;
				T result = caseEffectEvidenceSynthesisCertaintySubcomponent(effectEvidenceSynthesisCertaintySubcomponent);
				if (result == null) result = caseBackboneElement(effectEvidenceSynthesisCertaintySubcomponent);
				if (result == null) result = caseElement(effectEvidenceSynthesisCertaintySubcomponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE: {
				EffectEvidenceSynthesisEffectEstimate effectEvidenceSynthesisEffectEstimate = (EffectEvidenceSynthesisEffectEstimate)theEObject;
				T result = caseEffectEvidenceSynthesisEffectEstimate(effectEvidenceSynthesisEffectEstimate);
				if (result == null) result = caseBackboneElement(effectEvidenceSynthesisEffectEstimate);
				if (result == null) result = caseElement(effectEvidenceSynthesisEffectEstimate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS_PRECISION_ESTIMATE: {
				EffectEvidenceSynthesisPrecisionEstimate effectEvidenceSynthesisPrecisionEstimate = (EffectEvidenceSynthesisPrecisionEstimate)theEObject;
				T result = caseEffectEvidenceSynthesisPrecisionEstimate(effectEvidenceSynthesisPrecisionEstimate);
				if (result == null) result = caseBackboneElement(effectEvidenceSynthesisPrecisionEstimate);
				if (result == null) result = caseElement(effectEvidenceSynthesisPrecisionEstimate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS_RESULTS_BY_EXPOSURE: {
				EffectEvidenceSynthesisResultsByExposure effectEvidenceSynthesisResultsByExposure = (EffectEvidenceSynthesisResultsByExposure)theEObject;
				T result = caseEffectEvidenceSynthesisResultsByExposure(effectEvidenceSynthesisResultsByExposure);
				if (result == null) result = caseBackboneElement(effectEvidenceSynthesisResultsByExposure);
				if (result == null) result = caseElement(effectEvidenceSynthesisResultsByExposure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EFFECT_EVIDENCE_SYNTHESIS_SAMPLE_SIZE: {
				EffectEvidenceSynthesisSampleSize effectEvidenceSynthesisSampleSize = (EffectEvidenceSynthesisSampleSize)theEObject;
				T result = caseEffectEvidenceSynthesisSampleSize(effectEvidenceSynthesisSampleSize);
				if (result == null) result = caseBackboneElement(effectEvidenceSynthesisSampleSize);
				if (result == null) result = caseElement(effectEvidenceSynthesisSampleSize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ELEMENT_DEFINITION: {
				ElementDefinition elementDefinition = (ElementDefinition)theEObject;
				T result = caseElementDefinition(elementDefinition);
				if (result == null) result = caseBackboneElement(elementDefinition);
				if (result == null) result = caseElement(elementDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ELEMENT_DEFINITION_BASE: {
				ElementDefinitionBase elementDefinitionBase = (ElementDefinitionBase)theEObject;
				T result = caseElementDefinitionBase(elementDefinitionBase);
				if (result == null) result = caseBackboneElement(elementDefinitionBase);
				if (result == null) result = caseElement(elementDefinitionBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ELEMENT_DEFINITION_BINDING: {
				ElementDefinitionBinding elementDefinitionBinding = (ElementDefinitionBinding)theEObject;
				T result = caseElementDefinitionBinding(elementDefinitionBinding);
				if (result == null) result = caseBackboneElement(elementDefinitionBinding);
				if (result == null) result = caseElement(elementDefinitionBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ELEMENT_DEFINITION_CONSTRAINT: {
				ElementDefinitionConstraint elementDefinitionConstraint = (ElementDefinitionConstraint)theEObject;
				T result = caseElementDefinitionConstraint(elementDefinitionConstraint);
				if (result == null) result = caseBackboneElement(elementDefinitionConstraint);
				if (result == null) result = caseElement(elementDefinitionConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ELEMENT_DEFINITION_DISCRIMINATOR: {
				ElementDefinitionDiscriminator elementDefinitionDiscriminator = (ElementDefinitionDiscriminator)theEObject;
				T result = caseElementDefinitionDiscriminator(elementDefinitionDiscriminator);
				if (result == null) result = caseBackboneElement(elementDefinitionDiscriminator);
				if (result == null) result = caseElement(elementDefinitionDiscriminator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ELEMENT_DEFINITION_EXAMPLE: {
				ElementDefinitionExample elementDefinitionExample = (ElementDefinitionExample)theEObject;
				T result = caseElementDefinitionExample(elementDefinitionExample);
				if (result == null) result = caseBackboneElement(elementDefinitionExample);
				if (result == null) result = caseElement(elementDefinitionExample);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ELEMENT_DEFINITION_MAPPING: {
				ElementDefinitionMapping elementDefinitionMapping = (ElementDefinitionMapping)theEObject;
				T result = caseElementDefinitionMapping(elementDefinitionMapping);
				if (result == null) result = caseBackboneElement(elementDefinitionMapping);
				if (result == null) result = caseElement(elementDefinitionMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ELEMENT_DEFINITION_SLICING: {
				ElementDefinitionSlicing elementDefinitionSlicing = (ElementDefinitionSlicing)theEObject;
				T result = caseElementDefinitionSlicing(elementDefinitionSlicing);
				if (result == null) result = caseBackboneElement(elementDefinitionSlicing);
				if (result == null) result = caseElement(elementDefinitionSlicing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ELEMENT_DEFINITION_TYPE: {
				ElementDefinitionType elementDefinitionType = (ElementDefinitionType)theEObject;
				T result = caseElementDefinitionType(elementDefinitionType);
				if (result == null) result = caseBackboneElement(elementDefinitionType);
				if (result == null) result = caseElement(elementDefinitionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ELIGIBILITY_REQUEST_PURPOSE: {
				EligibilityRequestPurpose eligibilityRequestPurpose = (EligibilityRequestPurpose)theEObject;
				T result = caseEligibilityRequestPurpose(eligibilityRequestPurpose);
				if (result == null) result = caseElement(eligibilityRequestPurpose);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ELIGIBILITY_RESPONSE_PURPOSE: {
				EligibilityResponsePurpose eligibilityResponsePurpose = (EligibilityResponsePurpose)theEObject;
				T result = caseEligibilityResponsePurpose(eligibilityResponsePurpose);
				if (result == null) result = caseElement(eligibilityResponsePurpose);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ENABLE_WHEN_BEHAVIOR: {
				EnableWhenBehavior enableWhenBehavior = (EnableWhenBehavior)theEObject;
				T result = caseEnableWhenBehavior(enableWhenBehavior);
				if (result == null) result = caseElement(enableWhenBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ENCOUNTER: {
				Encounter encounter = (Encounter)theEObject;
				T result = caseEncounter(encounter);
				if (result == null) result = caseDomainResource(encounter);
				if (result == null) result = caseResource(encounter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ENCOUNTER_CLASS_HISTORY: {
				EncounterClassHistory encounterClassHistory = (EncounterClassHistory)theEObject;
				T result = caseEncounterClassHistory(encounterClassHistory);
				if (result == null) result = caseBackboneElement(encounterClassHistory);
				if (result == null) result = caseElement(encounterClassHistory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ENCOUNTER_DIAGNOSIS: {
				EncounterDiagnosis encounterDiagnosis = (EncounterDiagnosis)theEObject;
				T result = caseEncounterDiagnosis(encounterDiagnosis);
				if (result == null) result = caseBackboneElement(encounterDiagnosis);
				if (result == null) result = caseElement(encounterDiagnosis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ENCOUNTER_HOSPITALIZATION: {
				EncounterHospitalization encounterHospitalization = (EncounterHospitalization)theEObject;
				T result = caseEncounterHospitalization(encounterHospitalization);
				if (result == null) result = caseBackboneElement(encounterHospitalization);
				if (result == null) result = caseElement(encounterHospitalization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ENCOUNTER_LOCATION: {
				EncounterLocation encounterLocation = (EncounterLocation)theEObject;
				T result = caseEncounterLocation(encounterLocation);
				if (result == null) result = caseBackboneElement(encounterLocation);
				if (result == null) result = caseElement(encounterLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ENCOUNTER_LOCATION_STATUS: {
				EncounterLocationStatus encounterLocationStatus = (EncounterLocationStatus)theEObject;
				T result = caseEncounterLocationStatus(encounterLocationStatus);
				if (result == null) result = caseElement(encounterLocationStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ENCOUNTER_PARTICIPANT: {
				EncounterParticipant encounterParticipant = (EncounterParticipant)theEObject;
				T result = caseEncounterParticipant(encounterParticipant);
				if (result == null) result = caseBackboneElement(encounterParticipant);
				if (result == null) result = caseElement(encounterParticipant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ENCOUNTER_STATUS: {
				EncounterStatus encounterStatus = (EncounterStatus)theEObject;
				T result = caseEncounterStatus(encounterStatus);
				if (result == null) result = caseElement(encounterStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ENCOUNTER_STATUS_HISTORY: {
				EncounterStatusHistory encounterStatusHistory = (EncounterStatusHistory)theEObject;
				T result = caseEncounterStatusHistory(encounterStatusHistory);
				if (result == null) result = caseBackboneElement(encounterStatusHistory);
				if (result == null) result = caseElement(encounterStatusHistory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ENDPOINT: {
				Endpoint endpoint = (Endpoint)theEObject;
				T result = caseEndpoint(endpoint);
				if (result == null) result = caseDomainResource(endpoint);
				if (result == null) result = caseResource(endpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ENDPOINT_STATUS: {
				EndpointStatus endpointStatus = (EndpointStatus)theEObject;
				T result = caseEndpointStatus(endpointStatus);
				if (result == null) result = caseElement(endpointStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ENROLLMENT_REQUEST: {
				EnrollmentRequest enrollmentRequest = (EnrollmentRequest)theEObject;
				T result = caseEnrollmentRequest(enrollmentRequest);
				if (result == null) result = caseDomainResource(enrollmentRequest);
				if (result == null) result = caseResource(enrollmentRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ENROLLMENT_RESPONSE: {
				EnrollmentResponse enrollmentResponse = (EnrollmentResponse)theEObject;
				T result = caseEnrollmentResponse(enrollmentResponse);
				if (result == null) result = caseDomainResource(enrollmentResponse);
				if (result == null) result = caseResource(enrollmentResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EPISODE_OF_CARE: {
				EpisodeOfCare episodeOfCare = (EpisodeOfCare)theEObject;
				T result = caseEpisodeOfCare(episodeOfCare);
				if (result == null) result = caseDomainResource(episodeOfCare);
				if (result == null) result = caseResource(episodeOfCare);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EPISODE_OF_CARE_DIAGNOSIS: {
				EpisodeOfCareDiagnosis episodeOfCareDiagnosis = (EpisodeOfCareDiagnosis)theEObject;
				T result = caseEpisodeOfCareDiagnosis(episodeOfCareDiagnosis);
				if (result == null) result = caseBackboneElement(episodeOfCareDiagnosis);
				if (result == null) result = caseElement(episodeOfCareDiagnosis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EPISODE_OF_CARE_STATUS: {
				EpisodeOfCareStatus episodeOfCareStatus = (EpisodeOfCareStatus)theEObject;
				T result = caseEpisodeOfCareStatus(episodeOfCareStatus);
				if (result == null) result = caseElement(episodeOfCareStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EPISODE_OF_CARE_STATUS_HISTORY: {
				EpisodeOfCareStatusHistory episodeOfCareStatusHistory = (EpisodeOfCareStatusHistory)theEObject;
				T result = caseEpisodeOfCareStatusHistory(episodeOfCareStatusHistory);
				if (result == null) result = caseBackboneElement(episodeOfCareStatusHistory);
				if (result == null) result = caseElement(episodeOfCareStatusHistory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EVENT_CAPABILITY_MODE: {
				EventCapabilityMode eventCapabilityMode = (EventCapabilityMode)theEObject;
				T result = caseEventCapabilityMode(eventCapabilityMode);
				if (result == null) result = caseElement(eventCapabilityMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EVENT_DEFINITION: {
				EventDefinition eventDefinition = (EventDefinition)theEObject;
				T result = caseEventDefinition(eventDefinition);
				if (result == null) result = caseDomainResource(eventDefinition);
				if (result == null) result = caseResource(eventDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EVENT_STATUS: {
				EventStatus eventStatus = (EventStatus)theEObject;
				T result = caseEventStatus(eventStatus);
				if (result == null) result = caseElement(eventStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EVENT_TIMING: {
				EventTiming eventTiming = (EventTiming)theEObject;
				T result = caseEventTiming(eventTiming);
				if (result == null) result = caseElement(eventTiming);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EVIDENCE: {
				Evidence evidence = (Evidence)theEObject;
				T result = caseEvidence(evidence);
				if (result == null) result = caseDomainResource(evidence);
				if (result == null) result = caseResource(evidence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EVIDENCE_VARIABLE: {
				EvidenceVariable evidenceVariable = (EvidenceVariable)theEObject;
				T result = caseEvidenceVariable(evidenceVariable);
				if (result == null) result = caseDomainResource(evidenceVariable);
				if (result == null) result = caseResource(evidenceVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EVIDENCE_VARIABLE_CHARACTERISTIC: {
				EvidenceVariableCharacteristic evidenceVariableCharacteristic = (EvidenceVariableCharacteristic)theEObject;
				T result = caseEvidenceVariableCharacteristic(evidenceVariableCharacteristic);
				if (result == null) result = caseBackboneElement(evidenceVariableCharacteristic);
				if (result == null) result = caseElement(evidenceVariableCharacteristic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EVIDENCE_VARIABLE_TYPE: {
				EvidenceVariableType evidenceVariableType = (EvidenceVariableType)theEObject;
				T result = caseEvidenceVariableType(evidenceVariableType);
				if (result == null) result = caseElement(evidenceVariableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXAMPLE_SCENARIO: {
				ExampleScenario exampleScenario = (ExampleScenario)theEObject;
				T result = caseExampleScenario(exampleScenario);
				if (result == null) result = caseDomainResource(exampleScenario);
				if (result == null) result = caseResource(exampleScenario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXAMPLE_SCENARIO_ACTOR: {
				ExampleScenarioActor exampleScenarioActor = (ExampleScenarioActor)theEObject;
				T result = caseExampleScenarioActor(exampleScenarioActor);
				if (result == null) result = caseBackboneElement(exampleScenarioActor);
				if (result == null) result = caseElement(exampleScenarioActor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXAMPLE_SCENARIO_ACTOR_TYPE: {
				ExampleScenarioActorType exampleScenarioActorType = (ExampleScenarioActorType)theEObject;
				T result = caseExampleScenarioActorType(exampleScenarioActorType);
				if (result == null) result = caseElement(exampleScenarioActorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXAMPLE_SCENARIO_ALTERNATIVE: {
				ExampleScenarioAlternative exampleScenarioAlternative = (ExampleScenarioAlternative)theEObject;
				T result = caseExampleScenarioAlternative(exampleScenarioAlternative);
				if (result == null) result = caseBackboneElement(exampleScenarioAlternative);
				if (result == null) result = caseElement(exampleScenarioAlternative);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXAMPLE_SCENARIO_CONTAINED_INSTANCE: {
				ExampleScenarioContainedInstance exampleScenarioContainedInstance = (ExampleScenarioContainedInstance)theEObject;
				T result = caseExampleScenarioContainedInstance(exampleScenarioContainedInstance);
				if (result == null) result = caseBackboneElement(exampleScenarioContainedInstance);
				if (result == null) result = caseElement(exampleScenarioContainedInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXAMPLE_SCENARIO_INSTANCE: {
				ExampleScenarioInstance exampleScenarioInstance = (ExampleScenarioInstance)theEObject;
				T result = caseExampleScenarioInstance(exampleScenarioInstance);
				if (result == null) result = caseBackboneElement(exampleScenarioInstance);
				if (result == null) result = caseElement(exampleScenarioInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXAMPLE_SCENARIO_OPERATION: {
				ExampleScenarioOperation exampleScenarioOperation = (ExampleScenarioOperation)theEObject;
				T result = caseExampleScenarioOperation(exampleScenarioOperation);
				if (result == null) result = caseBackboneElement(exampleScenarioOperation);
				if (result == null) result = caseElement(exampleScenarioOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXAMPLE_SCENARIO_PROCESS: {
				ExampleScenarioProcess exampleScenarioProcess = (ExampleScenarioProcess)theEObject;
				T result = caseExampleScenarioProcess(exampleScenarioProcess);
				if (result == null) result = caseBackboneElement(exampleScenarioProcess);
				if (result == null) result = caseElement(exampleScenarioProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXAMPLE_SCENARIO_STEP: {
				ExampleScenarioStep exampleScenarioStep = (ExampleScenarioStep)theEObject;
				T result = caseExampleScenarioStep(exampleScenarioStep);
				if (result == null) result = caseBackboneElement(exampleScenarioStep);
				if (result == null) result = caseElement(exampleScenarioStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXAMPLE_SCENARIO_VERSION: {
				ExampleScenarioVersion exampleScenarioVersion = (ExampleScenarioVersion)theEObject;
				T result = caseExampleScenarioVersion(exampleScenarioVersion);
				if (result == null) result = caseBackboneElement(exampleScenarioVersion);
				if (result == null) result = caseElement(exampleScenarioVersion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPLANATION_OF_BENEFIT: {
				ExplanationOfBenefit explanationOfBenefit = (ExplanationOfBenefit)theEObject;
				T result = caseExplanationOfBenefit(explanationOfBenefit);
				if (result == null) result = caseDomainResource(explanationOfBenefit);
				if (result == null) result = caseResource(explanationOfBenefit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPLANATION_OF_BENEFIT_ACCIDENT: {
				ExplanationOfBenefitAccident explanationOfBenefitAccident = (ExplanationOfBenefitAccident)theEObject;
				T result = caseExplanationOfBenefitAccident(explanationOfBenefitAccident);
				if (result == null) result = caseBackboneElement(explanationOfBenefitAccident);
				if (result == null) result = caseElement(explanationOfBenefitAccident);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPLANATION_OF_BENEFIT_ADD_ITEM: {
				ExplanationOfBenefitAddItem explanationOfBenefitAddItem = (ExplanationOfBenefitAddItem)theEObject;
				T result = caseExplanationOfBenefitAddItem(explanationOfBenefitAddItem);
				if (result == null) result = caseBackboneElement(explanationOfBenefitAddItem);
				if (result == null) result = caseElement(explanationOfBenefitAddItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPLANATION_OF_BENEFIT_ADJUDICATION: {
				ExplanationOfBenefitAdjudication explanationOfBenefitAdjudication = (ExplanationOfBenefitAdjudication)theEObject;
				T result = caseExplanationOfBenefitAdjudication(explanationOfBenefitAdjudication);
				if (result == null) result = caseBackboneElement(explanationOfBenefitAdjudication);
				if (result == null) result = caseElement(explanationOfBenefitAdjudication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE: {
				ExplanationOfBenefitBenefitBalance explanationOfBenefitBenefitBalance = (ExplanationOfBenefitBenefitBalance)theEObject;
				T result = caseExplanationOfBenefitBenefitBalance(explanationOfBenefitBenefitBalance);
				if (result == null) result = caseBackboneElement(explanationOfBenefitBenefitBalance);
				if (result == null) result = caseElement(explanationOfBenefitBenefitBalance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM: {
				ExplanationOfBenefitCareTeam explanationOfBenefitCareTeam = (ExplanationOfBenefitCareTeam)theEObject;
				T result = caseExplanationOfBenefitCareTeam(explanationOfBenefitCareTeam);
				if (result == null) result = caseBackboneElement(explanationOfBenefitCareTeam);
				if (result == null) result = caseElement(explanationOfBenefitCareTeam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL: {
				ExplanationOfBenefitDetail explanationOfBenefitDetail = (ExplanationOfBenefitDetail)theEObject;
				T result = caseExplanationOfBenefitDetail(explanationOfBenefitDetail);
				if (result == null) result = caseBackboneElement(explanationOfBenefitDetail);
				if (result == null) result = caseElement(explanationOfBenefitDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL1: {
				ExplanationOfBenefitDetail1 explanationOfBenefitDetail1 = (ExplanationOfBenefitDetail1)theEObject;
				T result = caseExplanationOfBenefitDetail1(explanationOfBenefitDetail1);
				if (result == null) result = caseBackboneElement(explanationOfBenefitDetail1);
				if (result == null) result = caseElement(explanationOfBenefitDetail1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS: {
				ExplanationOfBenefitDiagnosis explanationOfBenefitDiagnosis = (ExplanationOfBenefitDiagnosis)theEObject;
				T result = caseExplanationOfBenefitDiagnosis(explanationOfBenefitDiagnosis);
				if (result == null) result = caseBackboneElement(explanationOfBenefitDiagnosis);
				if (result == null) result = caseElement(explanationOfBenefitDiagnosis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPLANATION_OF_BENEFIT_FINANCIAL: {
				ExplanationOfBenefitFinancial explanationOfBenefitFinancial = (ExplanationOfBenefitFinancial)theEObject;
				T result = caseExplanationOfBenefitFinancial(explanationOfBenefitFinancial);
				if (result == null) result = caseBackboneElement(explanationOfBenefitFinancial);
				if (result == null) result = caseElement(explanationOfBenefitFinancial);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPLANATION_OF_BENEFIT_INSURANCE: {
				ExplanationOfBenefitInsurance explanationOfBenefitInsurance = (ExplanationOfBenefitInsurance)theEObject;
				T result = caseExplanationOfBenefitInsurance(explanationOfBenefitInsurance);
				if (result == null) result = caseBackboneElement(explanationOfBenefitInsurance);
				if (result == null) result = caseElement(explanationOfBenefitInsurance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM: {
				ExplanationOfBenefitItem explanationOfBenefitItem = (ExplanationOfBenefitItem)theEObject;
				T result = caseExplanationOfBenefitItem(explanationOfBenefitItem);
				if (result == null) result = caseBackboneElement(explanationOfBenefitItem);
				if (result == null) result = caseElement(explanationOfBenefitItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPLANATION_OF_BENEFIT_PAYEE: {
				ExplanationOfBenefitPayee explanationOfBenefitPayee = (ExplanationOfBenefitPayee)theEObject;
				T result = caseExplanationOfBenefitPayee(explanationOfBenefitPayee);
				if (result == null) result = caseBackboneElement(explanationOfBenefitPayee);
				if (result == null) result = caseElement(explanationOfBenefitPayee);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPLANATION_OF_BENEFIT_PAYMENT: {
				ExplanationOfBenefitPayment explanationOfBenefitPayment = (ExplanationOfBenefitPayment)theEObject;
				T result = caseExplanationOfBenefitPayment(explanationOfBenefitPayment);
				if (result == null) result = caseBackboneElement(explanationOfBenefitPayment);
				if (result == null) result = caseElement(explanationOfBenefitPayment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPLANATION_OF_BENEFIT_PROCEDURE: {
				ExplanationOfBenefitProcedure explanationOfBenefitProcedure = (ExplanationOfBenefitProcedure)theEObject;
				T result = caseExplanationOfBenefitProcedure(explanationOfBenefitProcedure);
				if (result == null) result = caseBackboneElement(explanationOfBenefitProcedure);
				if (result == null) result = caseElement(explanationOfBenefitProcedure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPLANATION_OF_BENEFIT_PROCESS_NOTE: {
				ExplanationOfBenefitProcessNote explanationOfBenefitProcessNote = (ExplanationOfBenefitProcessNote)theEObject;
				T result = caseExplanationOfBenefitProcessNote(explanationOfBenefitProcessNote);
				if (result == null) result = caseBackboneElement(explanationOfBenefitProcessNote);
				if (result == null) result = caseElement(explanationOfBenefitProcessNote);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPLANATION_OF_BENEFIT_RELATED: {
				ExplanationOfBenefitRelated explanationOfBenefitRelated = (ExplanationOfBenefitRelated)theEObject;
				T result = caseExplanationOfBenefitRelated(explanationOfBenefitRelated);
				if (result == null) result = caseBackboneElement(explanationOfBenefitRelated);
				if (result == null) result = caseElement(explanationOfBenefitRelated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPLANATION_OF_BENEFIT_STATUS: {
				ExplanationOfBenefitStatus explanationOfBenefitStatus = (ExplanationOfBenefitStatus)theEObject;
				T result = caseExplanationOfBenefitStatus(explanationOfBenefitStatus);
				if (result == null) result = caseElement(explanationOfBenefitStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPLANATION_OF_BENEFIT_SUB_DETAIL: {
				ExplanationOfBenefitSubDetail explanationOfBenefitSubDetail = (ExplanationOfBenefitSubDetail)theEObject;
				T result = caseExplanationOfBenefitSubDetail(explanationOfBenefitSubDetail);
				if (result == null) result = caseBackboneElement(explanationOfBenefitSubDetail);
				if (result == null) result = caseElement(explanationOfBenefitSubDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPLANATION_OF_BENEFIT_SUB_DETAIL1: {
				ExplanationOfBenefitSubDetail1 explanationOfBenefitSubDetail1 = (ExplanationOfBenefitSubDetail1)theEObject;
				T result = caseExplanationOfBenefitSubDetail1(explanationOfBenefitSubDetail1);
				if (result == null) result = caseBackboneElement(explanationOfBenefitSubDetail1);
				if (result == null) result = caseElement(explanationOfBenefitSubDetail1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPLANATION_OF_BENEFIT_SUPPORTING_INFO: {
				ExplanationOfBenefitSupportingInfo explanationOfBenefitSupportingInfo = (ExplanationOfBenefitSupportingInfo)theEObject;
				T result = caseExplanationOfBenefitSupportingInfo(explanationOfBenefitSupportingInfo);
				if (result == null) result = caseBackboneElement(explanationOfBenefitSupportingInfo);
				if (result == null) result = caseElement(explanationOfBenefitSupportingInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPLANATION_OF_BENEFIT_TOTAL: {
				ExplanationOfBenefitTotal explanationOfBenefitTotal = (ExplanationOfBenefitTotal)theEObject;
				T result = caseExplanationOfBenefitTotal(explanationOfBenefitTotal);
				if (result == null) result = caseBackboneElement(explanationOfBenefitTotal);
				if (result == null) result = caseElement(explanationOfBenefitTotal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPOSURE_STATE: {
				ExposureState exposureState = (ExposureState)theEObject;
				T result = caseExposureState(exposureState);
				if (result == null) result = caseElement(exposureState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = caseElement(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXPRESSION_LANGUAGE: {
				ExpressionLanguage expressionLanguage = (ExpressionLanguage)theEObject;
				T result = caseExpressionLanguage(expressionLanguage);
				if (result == null) result = caseElement(expressionLanguage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXTENSION: {
				Extension extension = (Extension)theEObject;
				T result = caseExtension(extension);
				if (result == null) result = caseElement(extension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.EXTENSION_CONTEXT_TYPE: {
				ExtensionContextType extensionContextType = (ExtensionContextType)theEObject;
				T result = caseExtensionContextType(extensionContextType);
				if (result == null) result = caseElement(extensionContextType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.FAMILY_HISTORY_STATUS: {
				FamilyHistoryStatus familyHistoryStatus = (FamilyHistoryStatus)theEObject;
				T result = caseFamilyHistoryStatus(familyHistoryStatus);
				if (result == null) result = caseElement(familyHistoryStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.FAMILY_MEMBER_HISTORY: {
				FamilyMemberHistory familyMemberHistory = (FamilyMemberHistory)theEObject;
				T result = caseFamilyMemberHistory(familyMemberHistory);
				if (result == null) result = caseDomainResource(familyMemberHistory);
				if (result == null) result = caseResource(familyMemberHistory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION: {
				FamilyMemberHistoryCondition familyMemberHistoryCondition = (FamilyMemberHistoryCondition)theEObject;
				T result = caseFamilyMemberHistoryCondition(familyMemberHistoryCondition);
				if (result == null) result = caseBackboneElement(familyMemberHistoryCondition);
				if (result == null) result = caseElement(familyMemberHistoryCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.FHIR_DEVICE_STATUS: {
				FHIRDeviceStatus fhirDeviceStatus = (FHIRDeviceStatus)theEObject;
				T result = caseFHIRDeviceStatus(fhirDeviceStatus);
				if (result == null) result = caseElement(fhirDeviceStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.FHIR_SUBSTANCE_STATUS: {
				FHIRSubstanceStatus fhirSubstanceStatus = (FHIRSubstanceStatus)theEObject;
				T result = caseFHIRSubstanceStatus(fhirSubstanceStatus);
				if (result == null) result = caseElement(fhirSubstanceStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.FHIR_VERSION: {
				FHIRVersion fhirVersion = (FHIRVersion)theEObject;
				T result = caseFHIRVersion(fhirVersion);
				if (result == null) result = caseElement(fhirVersion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.FILTER_OPERATOR: {
				FilterOperator filterOperator = (FilterOperator)theEObject;
				T result = caseFilterOperator(filterOperator);
				if (result == null) result = caseElement(filterOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.FINANCIAL_RESOURCE_STATUS_CODES: {
				FinancialResourceStatusCodes financialResourceStatusCodes = (FinancialResourceStatusCodes)theEObject;
				T result = caseFinancialResourceStatusCodes(financialResourceStatusCodes);
				if (result == null) result = caseElement(financialResourceStatusCodes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.FLAG: {
				Flag flag = (Flag)theEObject;
				T result = caseFlag(flag);
				if (result == null) result = caseDomainResource(flag);
				if (result == null) result = caseResource(flag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.FLAG_STATUS: {
				FlagStatus flagStatus = (FlagStatus)theEObject;
				T result = caseFlagStatus(flagStatus);
				if (result == null) result = caseElement(flagStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.GOAL: {
				Goal goal = (Goal)theEObject;
				T result = caseGoal(goal);
				if (result == null) result = caseDomainResource(goal);
				if (result == null) result = caseResource(goal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.GOAL_LIFECYCLE_STATUS: {
				GoalLifecycleStatus goalLifecycleStatus = (GoalLifecycleStatus)theEObject;
				T result = caseGoalLifecycleStatus(goalLifecycleStatus);
				if (result == null) result = caseElement(goalLifecycleStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.GOAL_TARGET: {
				GoalTarget goalTarget = (GoalTarget)theEObject;
				T result = caseGoalTarget(goalTarget);
				if (result == null) result = caseBackboneElement(goalTarget);
				if (result == null) result = caseElement(goalTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.GRAPH_COMPARTMENT_RULE: {
				GraphCompartmentRule graphCompartmentRule = (GraphCompartmentRule)theEObject;
				T result = caseGraphCompartmentRule(graphCompartmentRule);
				if (result == null) result = caseElement(graphCompartmentRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.GRAPH_COMPARTMENT_USE: {
				GraphCompartmentUse graphCompartmentUse = (GraphCompartmentUse)theEObject;
				T result = caseGraphCompartmentUse(graphCompartmentUse);
				if (result == null) result = caseElement(graphCompartmentUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.GRAPH_DEFINITION: {
				GraphDefinition graphDefinition = (GraphDefinition)theEObject;
				T result = caseGraphDefinition(graphDefinition);
				if (result == null) result = caseDomainResource(graphDefinition);
				if (result == null) result = caseResource(graphDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.GRAPH_DEFINITION_COMPARTMENT: {
				GraphDefinitionCompartment graphDefinitionCompartment = (GraphDefinitionCompartment)theEObject;
				T result = caseGraphDefinitionCompartment(graphDefinitionCompartment);
				if (result == null) result = caseBackboneElement(graphDefinitionCompartment);
				if (result == null) result = caseElement(graphDefinitionCompartment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.GRAPH_DEFINITION_LINK: {
				GraphDefinitionLink graphDefinitionLink = (GraphDefinitionLink)theEObject;
				T result = caseGraphDefinitionLink(graphDefinitionLink);
				if (result == null) result = caseBackboneElement(graphDefinitionLink);
				if (result == null) result = caseElement(graphDefinitionLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.GRAPH_DEFINITION_TARGET: {
				GraphDefinitionTarget graphDefinitionTarget = (GraphDefinitionTarget)theEObject;
				T result = caseGraphDefinitionTarget(graphDefinitionTarget);
				if (result == null) result = caseBackboneElement(graphDefinitionTarget);
				if (result == null) result = caseElement(graphDefinitionTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.GROUP: {
				Group group = (Group)theEObject;
				T result = caseGroup(group);
				if (result == null) result = caseDomainResource(group);
				if (result == null) result = caseResource(group);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.GROUP_CHARACTERISTIC: {
				GroupCharacteristic groupCharacteristic = (GroupCharacteristic)theEObject;
				T result = caseGroupCharacteristic(groupCharacteristic);
				if (result == null) result = caseBackboneElement(groupCharacteristic);
				if (result == null) result = caseElement(groupCharacteristic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.GROUP_MEASURE: {
				GroupMeasure groupMeasure = (GroupMeasure)theEObject;
				T result = caseGroupMeasure(groupMeasure);
				if (result == null) result = caseElement(groupMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.GROUP_MEMBER: {
				GroupMember groupMember = (GroupMember)theEObject;
				T result = caseGroupMember(groupMember);
				if (result == null) result = caseBackboneElement(groupMember);
				if (result == null) result = caseElement(groupMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.GROUP_TYPE: {
				GroupType groupType = (GroupType)theEObject;
				T result = caseGroupType(groupType);
				if (result == null) result = caseElement(groupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.GUIDANCE_RESPONSE: {
				GuidanceResponse guidanceResponse = (GuidanceResponse)theEObject;
				T result = caseGuidanceResponse(guidanceResponse);
				if (result == null) result = caseDomainResource(guidanceResponse);
				if (result == null) result = caseResource(guidanceResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.GUIDANCE_RESPONSE_STATUS: {
				GuidanceResponseStatus guidanceResponseStatus = (GuidanceResponseStatus)theEObject;
				T result = caseGuidanceResponseStatus(guidanceResponseStatus);
				if (result == null) result = caseElement(guidanceResponseStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.GUIDE_PAGE_GENERATION: {
				GuidePageGeneration guidePageGeneration = (GuidePageGeneration)theEObject;
				T result = caseGuidePageGeneration(guidePageGeneration);
				if (result == null) result = caseElement(guidePageGeneration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.GUIDE_PARAMETER_CODE: {
				GuideParameterCode guideParameterCode = (GuideParameterCode)theEObject;
				T result = caseGuideParameterCode(guideParameterCode);
				if (result == null) result = caseElement(guideParameterCode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.HEALTHCARE_SERVICE: {
				HealthcareService healthcareService = (HealthcareService)theEObject;
				T result = caseHealthcareService(healthcareService);
				if (result == null) result = caseDomainResource(healthcareService);
				if (result == null) result = caseResource(healthcareService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME: {
				HealthcareServiceAvailableTime healthcareServiceAvailableTime = (HealthcareServiceAvailableTime)theEObject;
				T result = caseHealthcareServiceAvailableTime(healthcareServiceAvailableTime);
				if (result == null) result = caseBackboneElement(healthcareServiceAvailableTime);
				if (result == null) result = caseElement(healthcareServiceAvailableTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.HEALTHCARE_SERVICE_ELIGIBILITY: {
				HealthcareServiceEligibility healthcareServiceEligibility = (HealthcareServiceEligibility)theEObject;
				T result = caseHealthcareServiceEligibility(healthcareServiceEligibility);
				if (result == null) result = caseBackboneElement(healthcareServiceEligibility);
				if (result == null) result = caseElement(healthcareServiceEligibility);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.HEALTHCARE_SERVICE_NOT_AVAILABLE: {
				HealthcareServiceNotAvailable healthcareServiceNotAvailable = (HealthcareServiceNotAvailable)theEObject;
				T result = caseHealthcareServiceNotAvailable(healthcareServiceNotAvailable);
				if (result == null) result = caseBackboneElement(healthcareServiceNotAvailable);
				if (result == null) result = caseElement(healthcareServiceNotAvailable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.HTTP_VERB: {
				HTTPVerb httpVerb = (HTTPVerb)theEObject;
				T result = caseHTTPVerb(httpVerb);
				if (result == null) result = caseElement(httpVerb);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.HUMAN_NAME: {
				HumanName humanName = (HumanName)theEObject;
				T result = caseHumanName(humanName);
				if (result == null) result = caseElement(humanName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ID: {
				Id id = (Id)theEObject;
				T result = caseId(id);
				if (result == null) result = caseElement(id);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IDENTIFIER: {
				Identifier identifier = (Identifier)theEObject;
				T result = caseIdentifier(identifier);
				if (result == null) result = caseElement(identifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IDENTIFIER_USE: {
				IdentifierUse identifierUse = (IdentifierUse)theEObject;
				T result = caseIdentifierUse(identifierUse);
				if (result == null) result = caseElement(identifierUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IDENTITY_ASSURANCE_LEVEL: {
				IdentityAssuranceLevel identityAssuranceLevel = (IdentityAssuranceLevel)theEObject;
				T result = caseIdentityAssuranceLevel(identityAssuranceLevel);
				if (result == null) result = caseElement(identityAssuranceLevel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMAGING_STUDY: {
				ImagingStudy imagingStudy = (ImagingStudy)theEObject;
				T result = caseImagingStudy(imagingStudy);
				if (result == null) result = caseDomainResource(imagingStudy);
				if (result == null) result = caseResource(imagingStudy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMAGING_STUDY_INSTANCE: {
				ImagingStudyInstance imagingStudyInstance = (ImagingStudyInstance)theEObject;
				T result = caseImagingStudyInstance(imagingStudyInstance);
				if (result == null) result = caseBackboneElement(imagingStudyInstance);
				if (result == null) result = caseElement(imagingStudyInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMAGING_STUDY_PERFORMER: {
				ImagingStudyPerformer imagingStudyPerformer = (ImagingStudyPerformer)theEObject;
				T result = caseImagingStudyPerformer(imagingStudyPerformer);
				if (result == null) result = caseBackboneElement(imagingStudyPerformer);
				if (result == null) result = caseElement(imagingStudyPerformer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMAGING_STUDY_SERIES: {
				ImagingStudySeries imagingStudySeries = (ImagingStudySeries)theEObject;
				T result = caseImagingStudySeries(imagingStudySeries);
				if (result == null) result = caseBackboneElement(imagingStudySeries);
				if (result == null) result = caseElement(imagingStudySeries);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMAGING_STUDY_STATUS: {
				ImagingStudyStatus imagingStudyStatus = (ImagingStudyStatus)theEObject;
				T result = caseImagingStudyStatus(imagingStudyStatus);
				if (result == null) result = caseElement(imagingStudyStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMMUNIZATION: {
				Immunization immunization = (Immunization)theEObject;
				T result = caseImmunization(immunization);
				if (result == null) result = caseDomainResource(immunization);
				if (result == null) result = caseResource(immunization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMMUNIZATION_EDUCATION: {
				ImmunizationEducation immunizationEducation = (ImmunizationEducation)theEObject;
				T result = caseImmunizationEducation(immunizationEducation);
				if (result == null) result = caseBackboneElement(immunizationEducation);
				if (result == null) result = caseElement(immunizationEducation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMMUNIZATION_EVALUATION: {
				ImmunizationEvaluation immunizationEvaluation = (ImmunizationEvaluation)theEObject;
				T result = caseImmunizationEvaluation(immunizationEvaluation);
				if (result == null) result = caseDomainResource(immunizationEvaluation);
				if (result == null) result = caseResource(immunizationEvaluation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMMUNIZATION_EVALUATION_STATUS_CODES: {
				ImmunizationEvaluationStatusCodes immunizationEvaluationStatusCodes = (ImmunizationEvaluationStatusCodes)theEObject;
				T result = caseImmunizationEvaluationStatusCodes(immunizationEvaluationStatusCodes);
				if (result == null) result = caseElement(immunizationEvaluationStatusCodes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMMUNIZATION_PERFORMER: {
				ImmunizationPerformer immunizationPerformer = (ImmunizationPerformer)theEObject;
				T result = caseImmunizationPerformer(immunizationPerformer);
				if (result == null) result = caseBackboneElement(immunizationPerformer);
				if (result == null) result = caseElement(immunizationPerformer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMMUNIZATION_PROTOCOL_APPLIED: {
				ImmunizationProtocolApplied immunizationProtocolApplied = (ImmunizationProtocolApplied)theEObject;
				T result = caseImmunizationProtocolApplied(immunizationProtocolApplied);
				if (result == null) result = caseBackboneElement(immunizationProtocolApplied);
				if (result == null) result = caseElement(immunizationProtocolApplied);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMMUNIZATION_REACTION: {
				ImmunizationReaction immunizationReaction = (ImmunizationReaction)theEObject;
				T result = caseImmunizationReaction(immunizationReaction);
				if (result == null) result = caseBackboneElement(immunizationReaction);
				if (result == null) result = caseElement(immunizationReaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMMUNIZATION_RECOMMENDATION: {
				ImmunizationRecommendation immunizationRecommendation = (ImmunizationRecommendation)theEObject;
				T result = caseImmunizationRecommendation(immunizationRecommendation);
				if (result == null) result = caseDomainResource(immunizationRecommendation);
				if (result == null) result = caseResource(immunizationRecommendation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_DATE_CRITERION: {
				ImmunizationRecommendationDateCriterion immunizationRecommendationDateCriterion = (ImmunizationRecommendationDateCriterion)theEObject;
				T result = caseImmunizationRecommendationDateCriterion(immunizationRecommendationDateCriterion);
				if (result == null) result = caseBackboneElement(immunizationRecommendationDateCriterion);
				if (result == null) result = caseElement(immunizationRecommendationDateCriterion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION: {
				ImmunizationRecommendationRecommendation immunizationRecommendationRecommendation = (ImmunizationRecommendationRecommendation)theEObject;
				T result = caseImmunizationRecommendationRecommendation(immunizationRecommendationRecommendation);
				if (result == null) result = caseBackboneElement(immunizationRecommendationRecommendation);
				if (result == null) result = caseElement(immunizationRecommendationRecommendation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMMUNIZATION_STATUS_CODES: {
				ImmunizationStatusCodes immunizationStatusCodes = (ImmunizationStatusCodes)theEObject;
				T result = caseImmunizationStatusCodes(immunizationStatusCodes);
				if (result == null) result = caseElement(immunizationStatusCodes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMPLEMENTATION_GUIDE: {
				ImplementationGuide implementationGuide = (ImplementationGuide)theEObject;
				T result = caseImplementationGuide(implementationGuide);
				if (result == null) result = caseDomainResource(implementationGuide);
				if (result == null) result = caseResource(implementationGuide);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMPLEMENTATION_GUIDE_DEFINITION: {
				ImplementationGuideDefinition implementationGuideDefinition = (ImplementationGuideDefinition)theEObject;
				T result = caseImplementationGuideDefinition(implementationGuideDefinition);
				if (result == null) result = caseBackboneElement(implementationGuideDefinition);
				if (result == null) result = caseElement(implementationGuideDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMPLEMENTATION_GUIDE_DEPENDS_ON: {
				ImplementationGuideDependsOn implementationGuideDependsOn = (ImplementationGuideDependsOn)theEObject;
				T result = caseImplementationGuideDependsOn(implementationGuideDependsOn);
				if (result == null) result = caseBackboneElement(implementationGuideDependsOn);
				if (result == null) result = caseElement(implementationGuideDependsOn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMPLEMENTATION_GUIDE_GLOBAL: {
				ImplementationGuideGlobal implementationGuideGlobal = (ImplementationGuideGlobal)theEObject;
				T result = caseImplementationGuideGlobal(implementationGuideGlobal);
				if (result == null) result = caseBackboneElement(implementationGuideGlobal);
				if (result == null) result = caseElement(implementationGuideGlobal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMPLEMENTATION_GUIDE_GROUPING: {
				ImplementationGuideGrouping implementationGuideGrouping = (ImplementationGuideGrouping)theEObject;
				T result = caseImplementationGuideGrouping(implementationGuideGrouping);
				if (result == null) result = caseBackboneElement(implementationGuideGrouping);
				if (result == null) result = caseElement(implementationGuideGrouping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMPLEMENTATION_GUIDE_MANIFEST: {
				ImplementationGuideManifest implementationGuideManifest = (ImplementationGuideManifest)theEObject;
				T result = caseImplementationGuideManifest(implementationGuideManifest);
				if (result == null) result = caseBackboneElement(implementationGuideManifest);
				if (result == null) result = caseElement(implementationGuideManifest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE: {
				ImplementationGuidePage implementationGuidePage = (ImplementationGuidePage)theEObject;
				T result = caseImplementationGuidePage(implementationGuidePage);
				if (result == null) result = caseBackboneElement(implementationGuidePage);
				if (result == null) result = caseElement(implementationGuidePage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE1: {
				ImplementationGuidePage1 implementationGuidePage1 = (ImplementationGuidePage1)theEObject;
				T result = caseImplementationGuidePage1(implementationGuidePage1);
				if (result == null) result = caseBackboneElement(implementationGuidePage1);
				if (result == null) result = caseElement(implementationGuidePage1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMPLEMENTATION_GUIDE_PARAMETER: {
				ImplementationGuideParameter implementationGuideParameter = (ImplementationGuideParameter)theEObject;
				T result = caseImplementationGuideParameter(implementationGuideParameter);
				if (result == null) result = caseBackboneElement(implementationGuideParameter);
				if (result == null) result = caseElement(implementationGuideParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE: {
				ImplementationGuideResource implementationGuideResource = (ImplementationGuideResource)theEObject;
				T result = caseImplementationGuideResource(implementationGuideResource);
				if (result == null) result = caseBackboneElement(implementationGuideResource);
				if (result == null) result = caseElement(implementationGuideResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE1: {
				ImplementationGuideResource1 implementationGuideResource1 = (ImplementationGuideResource1)theEObject;
				T result = caseImplementationGuideResource1(implementationGuideResource1);
				if (result == null) result = caseBackboneElement(implementationGuideResource1);
				if (result == null) result = caseElement(implementationGuideResource1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.IMPLEMENTATION_GUIDE_TEMPLATE: {
				ImplementationGuideTemplate implementationGuideTemplate = (ImplementationGuideTemplate)theEObject;
				T result = caseImplementationGuideTemplate(implementationGuideTemplate);
				if (result == null) result = caseBackboneElement(implementationGuideTemplate);
				if (result == null) result = caseElement(implementationGuideTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.INSTANT: {
				Instant instant = (Instant)theEObject;
				T result = caseInstant(instant);
				if (result == null) result = caseElement(instant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.INSURANCE_PLAN: {
				InsurancePlan insurancePlan = (InsurancePlan)theEObject;
				T result = caseInsurancePlan(insurancePlan);
				if (result == null) result = caseDomainResource(insurancePlan);
				if (result == null) result = caseResource(insurancePlan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.INSURANCE_PLAN_BENEFIT: {
				InsurancePlanBenefit insurancePlanBenefit = (InsurancePlanBenefit)theEObject;
				T result = caseInsurancePlanBenefit(insurancePlanBenefit);
				if (result == null) result = caseBackboneElement(insurancePlanBenefit);
				if (result == null) result = caseElement(insurancePlanBenefit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.INSURANCE_PLAN_BENEFIT1: {
				InsurancePlanBenefit1 insurancePlanBenefit1 = (InsurancePlanBenefit1)theEObject;
				T result = caseInsurancePlanBenefit1(insurancePlanBenefit1);
				if (result == null) result = caseBackboneElement(insurancePlanBenefit1);
				if (result == null) result = caseElement(insurancePlanBenefit1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.INSURANCE_PLAN_CONTACT: {
				InsurancePlanContact insurancePlanContact = (InsurancePlanContact)theEObject;
				T result = caseInsurancePlanContact(insurancePlanContact);
				if (result == null) result = caseBackboneElement(insurancePlanContact);
				if (result == null) result = caseElement(insurancePlanContact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.INSURANCE_PLAN_COST: {
				InsurancePlanCost insurancePlanCost = (InsurancePlanCost)theEObject;
				T result = caseInsurancePlanCost(insurancePlanCost);
				if (result == null) result = caseBackboneElement(insurancePlanCost);
				if (result == null) result = caseElement(insurancePlanCost);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.INSURANCE_PLAN_COVERAGE: {
				InsurancePlanCoverage insurancePlanCoverage = (InsurancePlanCoverage)theEObject;
				T result = caseInsurancePlanCoverage(insurancePlanCoverage);
				if (result == null) result = caseBackboneElement(insurancePlanCoverage);
				if (result == null) result = caseElement(insurancePlanCoverage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.INSURANCE_PLAN_GENERAL_COST: {
				InsurancePlanGeneralCost insurancePlanGeneralCost = (InsurancePlanGeneralCost)theEObject;
				T result = caseInsurancePlanGeneralCost(insurancePlanGeneralCost);
				if (result == null) result = caseBackboneElement(insurancePlanGeneralCost);
				if (result == null) result = caseElement(insurancePlanGeneralCost);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.INSURANCE_PLAN_LIMIT: {
				InsurancePlanLimit insurancePlanLimit = (InsurancePlanLimit)theEObject;
				T result = caseInsurancePlanLimit(insurancePlanLimit);
				if (result == null) result = caseBackboneElement(insurancePlanLimit);
				if (result == null) result = caseElement(insurancePlanLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.INSURANCE_PLAN_PLAN: {
				InsurancePlanPlan insurancePlanPlan = (InsurancePlanPlan)theEObject;
				T result = caseInsurancePlanPlan(insurancePlanPlan);
				if (result == null) result = caseBackboneElement(insurancePlanPlan);
				if (result == null) result = caseElement(insurancePlanPlan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.INSURANCE_PLAN_SPECIFIC_COST: {
				InsurancePlanSpecificCost insurancePlanSpecificCost = (InsurancePlanSpecificCost)theEObject;
				T result = caseInsurancePlanSpecificCost(insurancePlanSpecificCost);
				if (result == null) result = caseBackboneElement(insurancePlanSpecificCost);
				if (result == null) result = caseElement(insurancePlanSpecificCost);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.INTEGER: {
				org.hl7.fhir.Integer integer = (org.hl7.fhir.Integer)theEObject;
				T result = caseInteger(integer);
				if (result == null) result = caseElement(integer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.INVOICE: {
				Invoice invoice = (Invoice)theEObject;
				T result = caseInvoice(invoice);
				if (result == null) result = caseDomainResource(invoice);
				if (result == null) result = caseResource(invoice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.INVOICE_LINE_ITEM: {
				InvoiceLineItem invoiceLineItem = (InvoiceLineItem)theEObject;
				T result = caseInvoiceLineItem(invoiceLineItem);
				if (result == null) result = caseBackboneElement(invoiceLineItem);
				if (result == null) result = caseElement(invoiceLineItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.INVOICE_PARTICIPANT: {
				InvoiceParticipant invoiceParticipant = (InvoiceParticipant)theEObject;
				T result = caseInvoiceParticipant(invoiceParticipant);
				if (result == null) result = caseBackboneElement(invoiceParticipant);
				if (result == null) result = caseElement(invoiceParticipant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.INVOICE_PRICE_COMPONENT: {
				InvoicePriceComponent invoicePriceComponent = (InvoicePriceComponent)theEObject;
				T result = caseInvoicePriceComponent(invoicePriceComponent);
				if (result == null) result = caseBackboneElement(invoicePriceComponent);
				if (result == null) result = caseElement(invoicePriceComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.INVOICE_PRICE_COMPONENT_TYPE: {
				InvoicePriceComponentType invoicePriceComponentType = (InvoicePriceComponentType)theEObject;
				T result = caseInvoicePriceComponentType(invoicePriceComponentType);
				if (result == null) result = caseElement(invoicePriceComponentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.INVOICE_STATUS: {
				InvoiceStatus invoiceStatus = (InvoiceStatus)theEObject;
				T result = caseInvoiceStatus(invoiceStatus);
				if (result == null) result = caseElement(invoiceStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ISSUE_SEVERITY: {
				IssueSeverity issueSeverity = (IssueSeverity)theEObject;
				T result = caseIssueSeverity(issueSeverity);
				if (result == null) result = caseElement(issueSeverity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ISSUE_TYPE: {
				IssueType issueType = (IssueType)theEObject;
				T result = caseIssueType(issueType);
				if (result == null) result = caseElement(issueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.LIBRARY: {
				Library library = (Library)theEObject;
				T result = caseLibrary(library);
				if (result == null) result = caseDomainResource(library);
				if (result == null) result = caseResource(library);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.LINKAGE: {
				Linkage linkage = (Linkage)theEObject;
				T result = caseLinkage(linkage);
				if (result == null) result = caseDomainResource(linkage);
				if (result == null) result = caseResource(linkage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.LINKAGE_ITEM: {
				LinkageItem linkageItem = (LinkageItem)theEObject;
				T result = caseLinkageItem(linkageItem);
				if (result == null) result = caseBackboneElement(linkageItem);
				if (result == null) result = caseElement(linkageItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.LINKAGE_TYPE: {
				LinkageType linkageType = (LinkageType)theEObject;
				T result = caseLinkageType(linkageType);
				if (result == null) result = caseElement(linkageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.LINK_TYPE: {
				LinkType linkType = (LinkType)theEObject;
				T result = caseLinkType(linkType);
				if (result == null) result = caseElement(linkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.LIST: {
				List list = (List)theEObject;
				T result = caseList(list);
				if (result == null) result = caseDomainResource(list);
				if (result == null) result = caseResource(list);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.LIST_ENTRY: {
				ListEntry listEntry = (ListEntry)theEObject;
				T result = caseListEntry(listEntry);
				if (result == null) result = caseBackboneElement(listEntry);
				if (result == null) result = caseElement(listEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.LIST_MODE: {
				ListMode listMode = (ListMode)theEObject;
				T result = caseListMode(listMode);
				if (result == null) result = caseElement(listMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.LIST_STATUS: {
				ListStatus listStatus = (ListStatus)theEObject;
				T result = caseListStatus(listStatus);
				if (result == null) result = caseElement(listStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.LOCATION: {
				Location location = (Location)theEObject;
				T result = caseLocation(location);
				if (result == null) result = caseDomainResource(location);
				if (result == null) result = caseResource(location);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.LOCATION_HOURS_OF_OPERATION: {
				LocationHoursOfOperation locationHoursOfOperation = (LocationHoursOfOperation)theEObject;
				T result = caseLocationHoursOfOperation(locationHoursOfOperation);
				if (result == null) result = caseBackboneElement(locationHoursOfOperation);
				if (result == null) result = caseElement(locationHoursOfOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.LOCATION_MODE: {
				LocationMode locationMode = (LocationMode)theEObject;
				T result = caseLocationMode(locationMode);
				if (result == null) result = caseElement(locationMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.LOCATION_POSITION: {
				LocationPosition locationPosition = (LocationPosition)theEObject;
				T result = caseLocationPosition(locationPosition);
				if (result == null) result = caseBackboneElement(locationPosition);
				if (result == null) result = caseElement(locationPosition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.LOCATION_STATUS: {
				LocationStatus locationStatus = (LocationStatus)theEObject;
				T result = caseLocationStatus(locationStatus);
				if (result == null) result = caseElement(locationStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MARKDOWN: {
				Markdown markdown = (Markdown)theEObject;
				T result = caseMarkdown(markdown);
				if (result == null) result = caseElement(markdown);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MARKETING_STATUS: {
				MarketingStatus marketingStatus = (MarketingStatus)theEObject;
				T result = caseMarketingStatus(marketingStatus);
				if (result == null) result = caseBackboneElement(marketingStatus);
				if (result == null) result = caseElement(marketingStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEASURE: {
				Measure measure = (Measure)theEObject;
				T result = caseMeasure(measure);
				if (result == null) result = caseDomainResource(measure);
				if (result == null) result = caseResource(measure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEASURE_COMPONENT: {
				MeasureComponent measureComponent = (MeasureComponent)theEObject;
				T result = caseMeasureComponent(measureComponent);
				if (result == null) result = caseBackboneElement(measureComponent);
				if (result == null) result = caseElement(measureComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEASURE_GROUP: {
				MeasureGroup measureGroup = (MeasureGroup)theEObject;
				T result = caseMeasureGroup(measureGroup);
				if (result == null) result = caseBackboneElement(measureGroup);
				if (result == null) result = caseElement(measureGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEASURE_POPULATION: {
				MeasurePopulation measurePopulation = (MeasurePopulation)theEObject;
				T result = caseMeasurePopulation(measurePopulation);
				if (result == null) result = caseBackboneElement(measurePopulation);
				if (result == null) result = caseElement(measurePopulation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEASURE_REPORT: {
				MeasureReport measureReport = (MeasureReport)theEObject;
				T result = caseMeasureReport(measureReport);
				if (result == null) result = caseDomainResource(measureReport);
				if (result == null) result = caseResource(measureReport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEASURE_REPORT_COMPONENT: {
				MeasureReportComponent measureReportComponent = (MeasureReportComponent)theEObject;
				T result = caseMeasureReportComponent(measureReportComponent);
				if (result == null) result = caseBackboneElement(measureReportComponent);
				if (result == null) result = caseElement(measureReportComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEASURE_REPORT_GROUP: {
				MeasureReportGroup measureReportGroup = (MeasureReportGroup)theEObject;
				T result = caseMeasureReportGroup(measureReportGroup);
				if (result == null) result = caseBackboneElement(measureReportGroup);
				if (result == null) result = caseElement(measureReportGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEASURE_REPORT_POPULATION: {
				MeasureReportPopulation measureReportPopulation = (MeasureReportPopulation)theEObject;
				T result = caseMeasureReportPopulation(measureReportPopulation);
				if (result == null) result = caseBackboneElement(measureReportPopulation);
				if (result == null) result = caseElement(measureReportPopulation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEASURE_REPORT_POPULATION1: {
				MeasureReportPopulation1 measureReportPopulation1 = (MeasureReportPopulation1)theEObject;
				T result = caseMeasureReportPopulation1(measureReportPopulation1);
				if (result == null) result = caseBackboneElement(measureReportPopulation1);
				if (result == null) result = caseElement(measureReportPopulation1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEASURE_REPORT_STATUS: {
				MeasureReportStatus measureReportStatus = (MeasureReportStatus)theEObject;
				T result = caseMeasureReportStatus(measureReportStatus);
				if (result == null) result = caseElement(measureReportStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEASURE_REPORT_STRATIFIER: {
				MeasureReportStratifier measureReportStratifier = (MeasureReportStratifier)theEObject;
				T result = caseMeasureReportStratifier(measureReportStratifier);
				if (result == null) result = caseBackboneElement(measureReportStratifier);
				if (result == null) result = caseElement(measureReportStratifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEASURE_REPORT_STRATUM: {
				MeasureReportStratum measureReportStratum = (MeasureReportStratum)theEObject;
				T result = caseMeasureReportStratum(measureReportStratum);
				if (result == null) result = caseBackboneElement(measureReportStratum);
				if (result == null) result = caseElement(measureReportStratum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEASURE_REPORT_TYPE: {
				MeasureReportType measureReportType = (MeasureReportType)theEObject;
				T result = caseMeasureReportType(measureReportType);
				if (result == null) result = caseElement(measureReportType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEASURE_STRATIFIER: {
				MeasureStratifier measureStratifier = (MeasureStratifier)theEObject;
				T result = caseMeasureStratifier(measureStratifier);
				if (result == null) result = caseBackboneElement(measureStratifier);
				if (result == null) result = caseElement(measureStratifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEASURE_SUPPLEMENTAL_DATA: {
				MeasureSupplementalData measureSupplementalData = (MeasureSupplementalData)theEObject;
				T result = caseMeasureSupplementalData(measureSupplementalData);
				if (result == null) result = caseBackboneElement(measureSupplementalData);
				if (result == null) result = caseElement(measureSupplementalData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDIA: {
				Media media = (Media)theEObject;
				T result = caseMedia(media);
				if (result == null) result = caseDomainResource(media);
				if (result == null) result = caseResource(media);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION: {
				Medication medication = (Medication)theEObject;
				T result = caseMedication(medication);
				if (result == null) result = caseDomainResource(medication);
				if (result == null) result = caseResource(medication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_ADMINISTRATION: {
				MedicationAdministration medicationAdministration = (MedicationAdministration)theEObject;
				T result = caseMedicationAdministration(medicationAdministration);
				if (result == null) result = caseDomainResource(medicationAdministration);
				if (result == null) result = caseResource(medicationAdministration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE: {
				MedicationAdministrationDosage medicationAdministrationDosage = (MedicationAdministrationDosage)theEObject;
				T result = caseMedicationAdministrationDosage(medicationAdministrationDosage);
				if (result == null) result = caseBackboneElement(medicationAdministrationDosage);
				if (result == null) result = caseElement(medicationAdministrationDosage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_ADMINISTRATION_PERFORMER: {
				MedicationAdministrationPerformer medicationAdministrationPerformer = (MedicationAdministrationPerformer)theEObject;
				T result = caseMedicationAdministrationPerformer(medicationAdministrationPerformer);
				if (result == null) result = caseBackboneElement(medicationAdministrationPerformer);
				if (result == null) result = caseElement(medicationAdministrationPerformer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_BATCH: {
				MedicationBatch medicationBatch = (MedicationBatch)theEObject;
				T result = caseMedicationBatch(medicationBatch);
				if (result == null) result = caseBackboneElement(medicationBatch);
				if (result == null) result = caseElement(medicationBatch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_DISPENSE: {
				MedicationDispense medicationDispense = (MedicationDispense)theEObject;
				T result = caseMedicationDispense(medicationDispense);
				if (result == null) result = caseDomainResource(medicationDispense);
				if (result == null) result = caseResource(medicationDispense);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_DISPENSE_PERFORMER: {
				MedicationDispensePerformer medicationDispensePerformer = (MedicationDispensePerformer)theEObject;
				T result = caseMedicationDispensePerformer(medicationDispensePerformer);
				if (result == null) result = caseBackboneElement(medicationDispensePerformer);
				if (result == null) result = caseElement(medicationDispensePerformer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_DISPENSE_SUBSTITUTION: {
				MedicationDispenseSubstitution medicationDispenseSubstitution = (MedicationDispenseSubstitution)theEObject;
				T result = caseMedicationDispenseSubstitution(medicationDispenseSubstitution);
				if (result == null) result = caseBackboneElement(medicationDispenseSubstitution);
				if (result == null) result = caseElement(medicationDispenseSubstitution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_INGREDIENT: {
				MedicationIngredient medicationIngredient = (MedicationIngredient)theEObject;
				T result = caseMedicationIngredient(medicationIngredient);
				if (result == null) result = caseBackboneElement(medicationIngredient);
				if (result == null) result = caseElement(medicationIngredient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_KNOWLEDGE: {
				MedicationKnowledge medicationKnowledge = (MedicationKnowledge)theEObject;
				T result = caseMedicationKnowledge(medicationKnowledge);
				if (result == null) result = caseDomainResource(medicationKnowledge);
				if (result == null) result = caseResource(medicationKnowledge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES: {
				MedicationKnowledgeAdministrationGuidelines medicationKnowledgeAdministrationGuidelines = (MedicationKnowledgeAdministrationGuidelines)theEObject;
				T result = caseMedicationKnowledgeAdministrationGuidelines(medicationKnowledgeAdministrationGuidelines);
				if (result == null) result = caseBackboneElement(medicationKnowledgeAdministrationGuidelines);
				if (result == null) result = caseElement(medicationKnowledgeAdministrationGuidelines);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_KNOWLEDGE_COST: {
				MedicationKnowledgeCost medicationKnowledgeCost = (MedicationKnowledgeCost)theEObject;
				T result = caseMedicationKnowledgeCost(medicationKnowledgeCost);
				if (result == null) result = caseBackboneElement(medicationKnowledgeCost);
				if (result == null) result = caseElement(medicationKnowledgeCost);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_KNOWLEDGE_DOSAGE: {
				MedicationKnowledgeDosage medicationKnowledgeDosage = (MedicationKnowledgeDosage)theEObject;
				T result = caseMedicationKnowledgeDosage(medicationKnowledgeDosage);
				if (result == null) result = caseBackboneElement(medicationKnowledgeDosage);
				if (result == null) result = caseElement(medicationKnowledgeDosage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_KNOWLEDGE_DRUG_CHARACTERISTIC: {
				MedicationKnowledgeDrugCharacteristic medicationKnowledgeDrugCharacteristic = (MedicationKnowledgeDrugCharacteristic)theEObject;
				T result = caseMedicationKnowledgeDrugCharacteristic(medicationKnowledgeDrugCharacteristic);
				if (result == null) result = caseBackboneElement(medicationKnowledgeDrugCharacteristic);
				if (result == null) result = caseElement(medicationKnowledgeDrugCharacteristic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_KNOWLEDGE_INGREDIENT: {
				MedicationKnowledgeIngredient medicationKnowledgeIngredient = (MedicationKnowledgeIngredient)theEObject;
				T result = caseMedicationKnowledgeIngredient(medicationKnowledgeIngredient);
				if (result == null) result = caseBackboneElement(medicationKnowledgeIngredient);
				if (result == null) result = caseElement(medicationKnowledgeIngredient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_KNOWLEDGE_KINETICS: {
				MedicationKnowledgeKinetics medicationKnowledgeKinetics = (MedicationKnowledgeKinetics)theEObject;
				T result = caseMedicationKnowledgeKinetics(medicationKnowledgeKinetics);
				if (result == null) result = caseBackboneElement(medicationKnowledgeKinetics);
				if (result == null) result = caseElement(medicationKnowledgeKinetics);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_KNOWLEDGE_MAX_DISPENSE: {
				MedicationKnowledgeMaxDispense medicationKnowledgeMaxDispense = (MedicationKnowledgeMaxDispense)theEObject;
				T result = caseMedicationKnowledgeMaxDispense(medicationKnowledgeMaxDispense);
				if (result == null) result = caseBackboneElement(medicationKnowledgeMaxDispense);
				if (result == null) result = caseElement(medicationKnowledgeMaxDispense);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_KNOWLEDGE_MEDICINE_CLASSIFICATION: {
				MedicationKnowledgeMedicineClassification medicationKnowledgeMedicineClassification = (MedicationKnowledgeMedicineClassification)theEObject;
				T result = caseMedicationKnowledgeMedicineClassification(medicationKnowledgeMedicineClassification);
				if (result == null) result = caseBackboneElement(medicationKnowledgeMedicineClassification);
				if (result == null) result = caseElement(medicationKnowledgeMedicineClassification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_KNOWLEDGE_MONITORING_PROGRAM: {
				MedicationKnowledgeMonitoringProgram medicationKnowledgeMonitoringProgram = (MedicationKnowledgeMonitoringProgram)theEObject;
				T result = caseMedicationKnowledgeMonitoringProgram(medicationKnowledgeMonitoringProgram);
				if (result == null) result = caseBackboneElement(medicationKnowledgeMonitoringProgram);
				if (result == null) result = caseElement(medicationKnowledgeMonitoringProgram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_KNOWLEDGE_MONOGRAPH: {
				MedicationKnowledgeMonograph medicationKnowledgeMonograph = (MedicationKnowledgeMonograph)theEObject;
				T result = caseMedicationKnowledgeMonograph(medicationKnowledgeMonograph);
				if (result == null) result = caseBackboneElement(medicationKnowledgeMonograph);
				if (result == null) result = caseElement(medicationKnowledgeMonograph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_KNOWLEDGE_PACKAGING: {
				MedicationKnowledgePackaging medicationKnowledgePackaging = (MedicationKnowledgePackaging)theEObject;
				T result = caseMedicationKnowledgePackaging(medicationKnowledgePackaging);
				if (result == null) result = caseBackboneElement(medicationKnowledgePackaging);
				if (result == null) result = caseElement(medicationKnowledgePackaging);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_KNOWLEDGE_PATIENT_CHARACTERISTICS: {
				MedicationKnowledgePatientCharacteristics medicationKnowledgePatientCharacteristics = (MedicationKnowledgePatientCharacteristics)theEObject;
				T result = caseMedicationKnowledgePatientCharacteristics(medicationKnowledgePatientCharacteristics);
				if (result == null) result = caseBackboneElement(medicationKnowledgePatientCharacteristics);
				if (result == null) result = caseElement(medicationKnowledgePatientCharacteristics);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_KNOWLEDGE_REGULATORY: {
				MedicationKnowledgeRegulatory medicationKnowledgeRegulatory = (MedicationKnowledgeRegulatory)theEObject;
				T result = caseMedicationKnowledgeRegulatory(medicationKnowledgeRegulatory);
				if (result == null) result = caseBackboneElement(medicationKnowledgeRegulatory);
				if (result == null) result = caseElement(medicationKnowledgeRegulatory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_KNOWLEDGE_RELATED_MEDICATION_KNOWLEDGE: {
				MedicationKnowledgeRelatedMedicationKnowledge medicationKnowledgeRelatedMedicationKnowledge = (MedicationKnowledgeRelatedMedicationKnowledge)theEObject;
				T result = caseMedicationKnowledgeRelatedMedicationKnowledge(medicationKnowledgeRelatedMedicationKnowledge);
				if (result == null) result = caseBackboneElement(medicationKnowledgeRelatedMedicationKnowledge);
				if (result == null) result = caseElement(medicationKnowledgeRelatedMedicationKnowledge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_KNOWLEDGE_SCHEDULE: {
				MedicationKnowledgeSchedule medicationKnowledgeSchedule = (MedicationKnowledgeSchedule)theEObject;
				T result = caseMedicationKnowledgeSchedule(medicationKnowledgeSchedule);
				if (result == null) result = caseBackboneElement(medicationKnowledgeSchedule);
				if (result == null) result = caseElement(medicationKnowledgeSchedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_KNOWLEDGE_SUBSTITUTION: {
				MedicationKnowledgeSubstitution medicationKnowledgeSubstitution = (MedicationKnowledgeSubstitution)theEObject;
				T result = caseMedicationKnowledgeSubstitution(medicationKnowledgeSubstitution);
				if (result == null) result = caseBackboneElement(medicationKnowledgeSubstitution);
				if (result == null) result = caseElement(medicationKnowledgeSubstitution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_REQUEST: {
				MedicationRequest medicationRequest = (MedicationRequest)theEObject;
				T result = caseMedicationRequest(medicationRequest);
				if (result == null) result = caseDomainResource(medicationRequest);
				if (result == null) result = caseResource(medicationRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST: {
				MedicationRequestDispenseRequest medicationRequestDispenseRequest = (MedicationRequestDispenseRequest)theEObject;
				T result = caseMedicationRequestDispenseRequest(medicationRequestDispenseRequest);
				if (result == null) result = caseBackboneElement(medicationRequestDispenseRequest);
				if (result == null) result = caseElement(medicationRequestDispenseRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_REQUEST_INITIAL_FILL: {
				MedicationRequestInitialFill medicationRequestInitialFill = (MedicationRequestInitialFill)theEObject;
				T result = caseMedicationRequestInitialFill(medicationRequestInitialFill);
				if (result == null) result = caseBackboneElement(medicationRequestInitialFill);
				if (result == null) result = caseElement(medicationRequestInitialFill);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_REQUEST_INTENT: {
				MedicationRequestIntent medicationRequestIntent = (MedicationRequestIntent)theEObject;
				T result = caseMedicationRequestIntent(medicationRequestIntent);
				if (result == null) result = caseElement(medicationRequestIntent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATIONREQUEST_STATUS: {
				MedicationrequestStatus medicationrequestStatus = (MedicationrequestStatus)theEObject;
				T result = caseMedicationrequestStatus(medicationrequestStatus);
				if (result == null) result = caseElement(medicationrequestStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_REQUEST_SUBSTITUTION: {
				MedicationRequestSubstitution medicationRequestSubstitution = (MedicationRequestSubstitution)theEObject;
				T result = caseMedicationRequestSubstitution(medicationRequestSubstitution);
				if (result == null) result = caseBackboneElement(medicationRequestSubstitution);
				if (result == null) result = caseElement(medicationRequestSubstitution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_STATEMENT: {
				MedicationStatement medicationStatement = (MedicationStatement)theEObject;
				T result = caseMedicationStatement(medicationStatement);
				if (result == null) result = caseDomainResource(medicationStatement);
				if (result == null) result = caseResource(medicationStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICATION_STATUS_CODES: {
				MedicationStatusCodes medicationStatusCodes = (MedicationStatusCodes)theEObject;
				T result = caseMedicationStatusCodes(medicationStatusCodes);
				if (result == null) result = caseElement(medicationStatusCodes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICINAL_PRODUCT: {
				MedicinalProduct medicinalProduct = (MedicinalProduct)theEObject;
				T result = caseMedicinalProduct(medicinalProduct);
				if (result == null) result = caseDomainResource(medicinalProduct);
				if (result == null) result = caseResource(medicinalProduct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION: {
				MedicinalProductAuthorization medicinalProductAuthorization = (MedicinalProductAuthorization)theEObject;
				T result = caseMedicinalProductAuthorization(medicinalProductAuthorization);
				if (result == null) result = caseDomainResource(medicinalProductAuthorization);
				if (result == null) result = caseResource(medicinalProductAuthorization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_JURISDICTIONAL_AUTHORIZATION: {
				MedicinalProductAuthorizationJurisdictionalAuthorization medicinalProductAuthorizationJurisdictionalAuthorization = (MedicinalProductAuthorizationJurisdictionalAuthorization)theEObject;
				T result = caseMedicinalProductAuthorizationJurisdictionalAuthorization(medicinalProductAuthorizationJurisdictionalAuthorization);
				if (result == null) result = caseBackboneElement(medicinalProductAuthorizationJurisdictionalAuthorization);
				if (result == null) result = caseElement(medicinalProductAuthorizationJurisdictionalAuthorization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE: {
				MedicinalProductAuthorizationProcedure medicinalProductAuthorizationProcedure = (MedicinalProductAuthorizationProcedure)theEObject;
				T result = caseMedicinalProductAuthorizationProcedure(medicinalProductAuthorizationProcedure);
				if (result == null) result = caseBackboneElement(medicinalProductAuthorizationProcedure);
				if (result == null) result = caseElement(medicinalProductAuthorizationProcedure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICINAL_PRODUCT_CONTRAINDICATION: {
				MedicinalProductContraindication medicinalProductContraindication = (MedicinalProductContraindication)theEObject;
				T result = caseMedicinalProductContraindication(medicinalProductContraindication);
				if (result == null) result = caseDomainResource(medicinalProductContraindication);
				if (result == null) result = caseResource(medicinalProductContraindication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICINAL_PRODUCT_CONTRAINDICATION_OTHER_THERAPY: {
				MedicinalProductContraindicationOtherTherapy medicinalProductContraindicationOtherTherapy = (MedicinalProductContraindicationOtherTherapy)theEObject;
				T result = caseMedicinalProductContraindicationOtherTherapy(medicinalProductContraindicationOtherTherapy);
				if (result == null) result = caseBackboneElement(medicinalProductContraindicationOtherTherapy);
				if (result == null) result = caseElement(medicinalProductContraindicationOtherTherapy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICINAL_PRODUCT_COUNTRY_LANGUAGE: {
				MedicinalProductCountryLanguage medicinalProductCountryLanguage = (MedicinalProductCountryLanguage)theEObject;
				T result = caseMedicinalProductCountryLanguage(medicinalProductCountryLanguage);
				if (result == null) result = caseBackboneElement(medicinalProductCountryLanguage);
				if (result == null) result = caseElement(medicinalProductCountryLanguage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION: {
				MedicinalProductIndication medicinalProductIndication = (MedicinalProductIndication)theEObject;
				T result = caseMedicinalProductIndication(medicinalProductIndication);
				if (result == null) result = caseDomainResource(medicinalProductIndication);
				if (result == null) result = caseResource(medicinalProductIndication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICINAL_PRODUCT_INDICATION_OTHER_THERAPY: {
				MedicinalProductIndicationOtherTherapy medicinalProductIndicationOtherTherapy = (MedicinalProductIndicationOtherTherapy)theEObject;
				T result = caseMedicinalProductIndicationOtherTherapy(medicinalProductIndicationOtherTherapy);
				if (result == null) result = caseBackboneElement(medicinalProductIndicationOtherTherapy);
				if (result == null) result = caseElement(medicinalProductIndicationOtherTherapy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT: {
				MedicinalProductIngredient medicinalProductIngredient = (MedicinalProductIngredient)theEObject;
				T result = caseMedicinalProductIngredient(medicinalProductIngredient);
				if (result == null) result = caseDomainResource(medicinalProductIngredient);
				if (result == null) result = caseResource(medicinalProductIngredient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_REFERENCE_STRENGTH: {
				MedicinalProductIngredientReferenceStrength medicinalProductIngredientReferenceStrength = (MedicinalProductIngredientReferenceStrength)theEObject;
				T result = caseMedicinalProductIngredientReferenceStrength(medicinalProductIngredientReferenceStrength);
				if (result == null) result = caseBackboneElement(medicinalProductIngredientReferenceStrength);
				if (result == null) result = caseElement(medicinalProductIngredientReferenceStrength);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE: {
				MedicinalProductIngredientSpecifiedSubstance medicinalProductIngredientSpecifiedSubstance = (MedicinalProductIngredientSpecifiedSubstance)theEObject;
				T result = caseMedicinalProductIngredientSpecifiedSubstance(medicinalProductIngredientSpecifiedSubstance);
				if (result == null) result = caseBackboneElement(medicinalProductIngredientSpecifiedSubstance);
				if (result == null) result = caseElement(medicinalProductIngredientSpecifiedSubstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_STRENGTH: {
				MedicinalProductIngredientStrength medicinalProductIngredientStrength = (MedicinalProductIngredientStrength)theEObject;
				T result = caseMedicinalProductIngredientStrength(medicinalProductIngredientStrength);
				if (result == null) result = caseBackboneElement(medicinalProductIngredientStrength);
				if (result == null) result = caseElement(medicinalProductIngredientStrength);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICINAL_PRODUCT_INGREDIENT_SUBSTANCE: {
				MedicinalProductIngredientSubstance medicinalProductIngredientSubstance = (MedicinalProductIngredientSubstance)theEObject;
				T result = caseMedicinalProductIngredientSubstance(medicinalProductIngredientSubstance);
				if (result == null) result = caseBackboneElement(medicinalProductIngredientSubstance);
				if (result == null) result = caseElement(medicinalProductIngredientSubstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION: {
				MedicinalProductInteraction medicinalProductInteraction = (MedicinalProductInteraction)theEObject;
				T result = caseMedicinalProductInteraction(medicinalProductInteraction);
				if (result == null) result = caseDomainResource(medicinalProductInteraction);
				if (result == null) result = caseResource(medicinalProductInteraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICINAL_PRODUCT_INTERACTION_INTERACTANT: {
				MedicinalProductInteractionInteractant medicinalProductInteractionInteractant = (MedicinalProductInteractionInteractant)theEObject;
				T result = caseMedicinalProductInteractionInteractant(medicinalProductInteractionInteractant);
				if (result == null) result = caseBackboneElement(medicinalProductInteractionInteractant);
				if (result == null) result = caseElement(medicinalProductInteractionInteractant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICINAL_PRODUCT_MANUFACTURED: {
				MedicinalProductManufactured medicinalProductManufactured = (MedicinalProductManufactured)theEObject;
				T result = caseMedicinalProductManufactured(medicinalProductManufactured);
				if (result == null) result = caseDomainResource(medicinalProductManufactured);
				if (result == null) result = caseResource(medicinalProductManufactured);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION: {
				MedicinalProductManufacturingBusinessOperation medicinalProductManufacturingBusinessOperation = (MedicinalProductManufacturingBusinessOperation)theEObject;
				T result = caseMedicinalProductManufacturingBusinessOperation(medicinalProductManufacturingBusinessOperation);
				if (result == null) result = caseBackboneElement(medicinalProductManufacturingBusinessOperation);
				if (result == null) result = caseElement(medicinalProductManufacturingBusinessOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICINAL_PRODUCT_NAME: {
				MedicinalProductName medicinalProductName = (MedicinalProductName)theEObject;
				T result = caseMedicinalProductName(medicinalProductName);
				if (result == null) result = caseBackboneElement(medicinalProductName);
				if (result == null) result = caseElement(medicinalProductName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICINAL_PRODUCT_NAME_PART: {
				MedicinalProductNamePart medicinalProductNamePart = (MedicinalProductNamePart)theEObject;
				T result = caseMedicinalProductNamePart(medicinalProductNamePart);
				if (result == null) result = caseBackboneElement(medicinalProductNamePart);
				if (result == null) result = caseElement(medicinalProductNamePart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED: {
				MedicinalProductPackaged medicinalProductPackaged = (MedicinalProductPackaged)theEObject;
				T result = caseMedicinalProductPackaged(medicinalProductPackaged);
				if (result == null) result = caseDomainResource(medicinalProductPackaged);
				if (result == null) result = caseResource(medicinalProductPackaged);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_BATCH_IDENTIFIER: {
				MedicinalProductPackagedBatchIdentifier medicinalProductPackagedBatchIdentifier = (MedicinalProductPackagedBatchIdentifier)theEObject;
				T result = caseMedicinalProductPackagedBatchIdentifier(medicinalProductPackagedBatchIdentifier);
				if (result == null) result = caseBackboneElement(medicinalProductPackagedBatchIdentifier);
				if (result == null) result = caseElement(medicinalProductPackagedBatchIdentifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM: {
				MedicinalProductPackagedPackageItem medicinalProductPackagedPackageItem = (MedicinalProductPackagedPackageItem)theEObject;
				T result = caseMedicinalProductPackagedPackageItem(medicinalProductPackagedPackageItem);
				if (result == null) result = caseBackboneElement(medicinalProductPackagedPackageItem);
				if (result == null) result = caseElement(medicinalProductPackagedPackageItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL: {
				MedicinalProductPharmaceutical medicinalProductPharmaceutical = (MedicinalProductPharmaceutical)theEObject;
				T result = caseMedicinalProductPharmaceutical(medicinalProductPharmaceutical);
				if (result == null) result = caseDomainResource(medicinalProductPharmaceutical);
				if (result == null) result = caseResource(medicinalProductPharmaceutical);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_CHARACTERISTICS: {
				MedicinalProductPharmaceuticalCharacteristics medicinalProductPharmaceuticalCharacteristics = (MedicinalProductPharmaceuticalCharacteristics)theEObject;
				T result = caseMedicinalProductPharmaceuticalCharacteristics(medicinalProductPharmaceuticalCharacteristics);
				if (result == null) result = caseBackboneElement(medicinalProductPharmaceuticalCharacteristics);
				if (result == null) result = caseElement(medicinalProductPharmaceuticalCharacteristics);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_ROUTE_OF_ADMINISTRATION: {
				MedicinalProductPharmaceuticalRouteOfAdministration medicinalProductPharmaceuticalRouteOfAdministration = (MedicinalProductPharmaceuticalRouteOfAdministration)theEObject;
				T result = caseMedicinalProductPharmaceuticalRouteOfAdministration(medicinalProductPharmaceuticalRouteOfAdministration);
				if (result == null) result = caseBackboneElement(medicinalProductPharmaceuticalRouteOfAdministration);
				if (result == null) result = caseElement(medicinalProductPharmaceuticalRouteOfAdministration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_TARGET_SPECIES: {
				MedicinalProductPharmaceuticalTargetSpecies medicinalProductPharmaceuticalTargetSpecies = (MedicinalProductPharmaceuticalTargetSpecies)theEObject;
				T result = caseMedicinalProductPharmaceuticalTargetSpecies(medicinalProductPharmaceuticalTargetSpecies);
				if (result == null) result = caseBackboneElement(medicinalProductPharmaceuticalTargetSpecies);
				if (result == null) result = caseElement(medicinalProductPharmaceuticalTargetSpecies);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_WITHDRAWAL_PERIOD: {
				MedicinalProductPharmaceuticalWithdrawalPeriod medicinalProductPharmaceuticalWithdrawalPeriod = (MedicinalProductPharmaceuticalWithdrawalPeriod)theEObject;
				T result = caseMedicinalProductPharmaceuticalWithdrawalPeriod(medicinalProductPharmaceuticalWithdrawalPeriod);
				if (result == null) result = caseBackboneElement(medicinalProductPharmaceuticalWithdrawalPeriod);
				if (result == null) result = caseElement(medicinalProductPharmaceuticalWithdrawalPeriod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION: {
				MedicinalProductSpecialDesignation medicinalProductSpecialDesignation = (MedicinalProductSpecialDesignation)theEObject;
				T result = caseMedicinalProductSpecialDesignation(medicinalProductSpecialDesignation);
				if (result == null) result = caseBackboneElement(medicinalProductSpecialDesignation);
				if (result == null) result = caseElement(medicinalProductSpecialDesignation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT: {
				MedicinalProductUndesirableEffect medicinalProductUndesirableEffect = (MedicinalProductUndesirableEffect)theEObject;
				T result = caseMedicinalProductUndesirableEffect(medicinalProductUndesirableEffect);
				if (result == null) result = caseDomainResource(medicinalProductUndesirableEffect);
				if (result == null) result = caseResource(medicinalProductUndesirableEffect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MESSAGE_DEFINITION: {
				MessageDefinition messageDefinition = (MessageDefinition)theEObject;
				T result = caseMessageDefinition(messageDefinition);
				if (result == null) result = caseDomainResource(messageDefinition);
				if (result == null) result = caseResource(messageDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MESSAGE_DEFINITION_ALLOWED_RESPONSE: {
				MessageDefinitionAllowedResponse messageDefinitionAllowedResponse = (MessageDefinitionAllowedResponse)theEObject;
				T result = caseMessageDefinitionAllowedResponse(messageDefinitionAllowedResponse);
				if (result == null) result = caseBackboneElement(messageDefinitionAllowedResponse);
				if (result == null) result = caseElement(messageDefinitionAllowedResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MESSAGE_DEFINITION_FOCUS: {
				MessageDefinitionFocus messageDefinitionFocus = (MessageDefinitionFocus)theEObject;
				T result = caseMessageDefinitionFocus(messageDefinitionFocus);
				if (result == null) result = caseBackboneElement(messageDefinitionFocus);
				if (result == null) result = caseElement(messageDefinitionFocus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MESSAGE_HEADER: {
				MessageHeader messageHeader = (MessageHeader)theEObject;
				T result = caseMessageHeader(messageHeader);
				if (result == null) result = caseDomainResource(messageHeader);
				if (result == null) result = caseResource(messageHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MESSAGE_HEADER_DESTINATION: {
				MessageHeaderDestination messageHeaderDestination = (MessageHeaderDestination)theEObject;
				T result = caseMessageHeaderDestination(messageHeaderDestination);
				if (result == null) result = caseBackboneElement(messageHeaderDestination);
				if (result == null) result = caseElement(messageHeaderDestination);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MESSAGE_HEADER_RESPONSE: {
				MessageHeaderResponse messageHeaderResponse = (MessageHeaderResponse)theEObject;
				T result = caseMessageHeaderResponse(messageHeaderResponse);
				if (result == null) result = caseBackboneElement(messageHeaderResponse);
				if (result == null) result = caseElement(messageHeaderResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MESSAGEHEADER_RESPONSE_REQUEST: {
				MessageheaderResponseRequest messageheaderResponseRequest = (MessageheaderResponseRequest)theEObject;
				T result = caseMessageheaderResponseRequest(messageheaderResponseRequest);
				if (result == null) result = caseElement(messageheaderResponseRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MESSAGE_HEADER_SOURCE: {
				MessageHeaderSource messageHeaderSource = (MessageHeaderSource)theEObject;
				T result = caseMessageHeaderSource(messageHeaderSource);
				if (result == null) result = caseBackboneElement(messageHeaderSource);
				if (result == null) result = caseElement(messageHeaderSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MESSAGE_SIGNIFICANCE_CATEGORY: {
				MessageSignificanceCategory messageSignificanceCategory = (MessageSignificanceCategory)theEObject;
				T result = caseMessageSignificanceCategory(messageSignificanceCategory);
				if (result == null) result = caseElement(messageSignificanceCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.META: {
				Meta meta = (Meta)theEObject;
				T result = caseMeta(meta);
				if (result == null) result = caseElement(meta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MOLECULAR_SEQUENCE: {
				MolecularSequence molecularSequence = (MolecularSequence)theEObject;
				T result = caseMolecularSequence(molecularSequence);
				if (result == null) result = caseDomainResource(molecularSequence);
				if (result == null) result = caseResource(molecularSequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MOLECULAR_SEQUENCE_INNER: {
				MolecularSequenceInner molecularSequenceInner = (MolecularSequenceInner)theEObject;
				T result = caseMolecularSequenceInner(molecularSequenceInner);
				if (result == null) result = caseBackboneElement(molecularSequenceInner);
				if (result == null) result = caseElement(molecularSequenceInner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MOLECULAR_SEQUENCE_OUTER: {
				MolecularSequenceOuter molecularSequenceOuter = (MolecularSequenceOuter)theEObject;
				T result = caseMolecularSequenceOuter(molecularSequenceOuter);
				if (result == null) result = caseBackboneElement(molecularSequenceOuter);
				if (result == null) result = caseElement(molecularSequenceOuter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY: {
				MolecularSequenceQuality molecularSequenceQuality = (MolecularSequenceQuality)theEObject;
				T result = caseMolecularSequenceQuality(molecularSequenceQuality);
				if (result == null) result = caseBackboneElement(molecularSequenceQuality);
				if (result == null) result = caseElement(molecularSequenceQuality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ: {
				MolecularSequenceReferenceSeq molecularSequenceReferenceSeq = (MolecularSequenceReferenceSeq)theEObject;
				T result = caseMolecularSequenceReferenceSeq(molecularSequenceReferenceSeq);
				if (result == null) result = caseBackboneElement(molecularSequenceReferenceSeq);
				if (result == null) result = caseElement(molecularSequenceReferenceSeq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MOLECULAR_SEQUENCE_REPOSITORY: {
				MolecularSequenceRepository molecularSequenceRepository = (MolecularSequenceRepository)theEObject;
				T result = caseMolecularSequenceRepository(molecularSequenceRepository);
				if (result == null) result = caseBackboneElement(molecularSequenceRepository);
				if (result == null) result = caseElement(molecularSequenceRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MOLECULAR_SEQUENCE_ROC: {
				MolecularSequenceRoc molecularSequenceRoc = (MolecularSequenceRoc)theEObject;
				T result = caseMolecularSequenceRoc(molecularSequenceRoc);
				if (result == null) result = caseBackboneElement(molecularSequenceRoc);
				if (result == null) result = caseElement(molecularSequenceRoc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT: {
				MolecularSequenceStructureVariant molecularSequenceStructureVariant = (MolecularSequenceStructureVariant)theEObject;
				T result = caseMolecularSequenceStructureVariant(molecularSequenceStructureVariant);
				if (result == null) result = caseBackboneElement(molecularSequenceStructureVariant);
				if (result == null) result = caseElement(molecularSequenceStructureVariant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MOLECULAR_SEQUENCE_VARIANT: {
				MolecularSequenceVariant molecularSequenceVariant = (MolecularSequenceVariant)theEObject;
				T result = caseMolecularSequenceVariant(molecularSequenceVariant);
				if (result == null) result = caseBackboneElement(molecularSequenceVariant);
				if (result == null) result = caseElement(molecularSequenceVariant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.MONEY: {
				Money money = (Money)theEObject;
				T result = caseMoney(money);
				if (result == null) result = caseElement(money);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.NAME_USE: {
				NameUse nameUse = (NameUse)theEObject;
				T result = caseNameUse(nameUse);
				if (result == null) result = caseElement(nameUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.NAMING_SYSTEM: {
				NamingSystem namingSystem = (NamingSystem)theEObject;
				T result = caseNamingSystem(namingSystem);
				if (result == null) result = caseDomainResource(namingSystem);
				if (result == null) result = caseResource(namingSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.NAMING_SYSTEM_IDENTIFIER_TYPE: {
				NamingSystemIdentifierType namingSystemIdentifierType = (NamingSystemIdentifierType)theEObject;
				T result = caseNamingSystemIdentifierType(namingSystemIdentifierType);
				if (result == null) result = caseElement(namingSystemIdentifierType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.NAMING_SYSTEM_TYPE: {
				NamingSystemType namingSystemType = (NamingSystemType)theEObject;
				T result = caseNamingSystemType(namingSystemType);
				if (result == null) result = caseElement(namingSystemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.NAMING_SYSTEM_UNIQUE_ID: {
				NamingSystemUniqueId namingSystemUniqueId = (NamingSystemUniqueId)theEObject;
				T result = caseNamingSystemUniqueId(namingSystemUniqueId);
				if (result == null) result = caseBackboneElement(namingSystemUniqueId);
				if (result == null) result = caseElement(namingSystemUniqueId);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.NARRATIVE: {
				Narrative narrative = (Narrative)theEObject;
				T result = caseNarrative(narrative);
				if (result == null) result = caseElement(narrative);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.NARRATIVE_STATUS: {
				NarrativeStatus narrativeStatus = (NarrativeStatus)theEObject;
				T result = caseNarrativeStatus(narrativeStatus);
				if (result == null) result = caseElement(narrativeStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.NOTE_TYPE: {
				NoteType noteType = (NoteType)theEObject;
				T result = caseNoteType(noteType);
				if (result == null) result = caseElement(noteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.NUTRITION_ORDER: {
				NutritionOrder nutritionOrder = (NutritionOrder)theEObject;
				T result = caseNutritionOrder(nutritionOrder);
				if (result == null) result = caseDomainResource(nutritionOrder);
				if (result == null) result = caseResource(nutritionOrder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.NUTRITION_ORDER_ADMINISTRATION: {
				NutritionOrderAdministration nutritionOrderAdministration = (NutritionOrderAdministration)theEObject;
				T result = caseNutritionOrderAdministration(nutritionOrderAdministration);
				if (result == null) result = caseBackboneElement(nutritionOrderAdministration);
				if (result == null) result = caseElement(nutritionOrderAdministration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA: {
				NutritionOrderEnteralFormula nutritionOrderEnteralFormula = (NutritionOrderEnteralFormula)theEObject;
				T result = caseNutritionOrderEnteralFormula(nutritionOrderEnteralFormula);
				if (result == null) result = caseBackboneElement(nutritionOrderEnteralFormula);
				if (result == null) result = caseElement(nutritionOrderEnteralFormula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.NUTRITION_ORDER_NUTRIENT: {
				NutritionOrderNutrient nutritionOrderNutrient = (NutritionOrderNutrient)theEObject;
				T result = caseNutritionOrderNutrient(nutritionOrderNutrient);
				if (result == null) result = caseBackboneElement(nutritionOrderNutrient);
				if (result == null) result = caseElement(nutritionOrderNutrient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.NUTRITION_ORDER_ORAL_DIET: {
				NutritionOrderOralDiet nutritionOrderOralDiet = (NutritionOrderOralDiet)theEObject;
				T result = caseNutritionOrderOralDiet(nutritionOrderOralDiet);
				if (result == null) result = caseBackboneElement(nutritionOrderOralDiet);
				if (result == null) result = caseElement(nutritionOrderOralDiet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.NUTRITION_ORDER_SUPPLEMENT: {
				NutritionOrderSupplement nutritionOrderSupplement = (NutritionOrderSupplement)theEObject;
				T result = caseNutritionOrderSupplement(nutritionOrderSupplement);
				if (result == null) result = caseBackboneElement(nutritionOrderSupplement);
				if (result == null) result = caseElement(nutritionOrderSupplement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.NUTRITION_ORDER_TEXTURE: {
				NutritionOrderTexture nutritionOrderTexture = (NutritionOrderTexture)theEObject;
				T result = caseNutritionOrderTexture(nutritionOrderTexture);
				if (result == null) result = caseBackboneElement(nutritionOrderTexture);
				if (result == null) result = caseElement(nutritionOrderTexture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.OBSERVATION: {
				Observation observation = (Observation)theEObject;
				T result = caseObservation(observation);
				if (result == null) result = caseDomainResource(observation);
				if (result == null) result = caseResource(observation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.OBSERVATION_COMPONENT: {
				ObservationComponent observationComponent = (ObservationComponent)theEObject;
				T result = caseObservationComponent(observationComponent);
				if (result == null) result = caseBackboneElement(observationComponent);
				if (result == null) result = caseElement(observationComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.OBSERVATION_DATA_TYPE: {
				ObservationDataType observationDataType = (ObservationDataType)theEObject;
				T result = caseObservationDataType(observationDataType);
				if (result == null) result = caseElement(observationDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.OBSERVATION_DEFINITION: {
				ObservationDefinition observationDefinition = (ObservationDefinition)theEObject;
				T result = caseObservationDefinition(observationDefinition);
				if (result == null) result = caseDomainResource(observationDefinition);
				if (result == null) result = caseResource(observationDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL: {
				ObservationDefinitionQualifiedInterval observationDefinitionQualifiedInterval = (ObservationDefinitionQualifiedInterval)theEObject;
				T result = caseObservationDefinitionQualifiedInterval(observationDefinitionQualifiedInterval);
				if (result == null) result = caseBackboneElement(observationDefinitionQualifiedInterval);
				if (result == null) result = caseElement(observationDefinitionQualifiedInterval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS: {
				ObservationDefinitionQuantitativeDetails observationDefinitionQuantitativeDetails = (ObservationDefinitionQuantitativeDetails)theEObject;
				T result = caseObservationDefinitionQuantitativeDetails(observationDefinitionQuantitativeDetails);
				if (result == null) result = caseBackboneElement(observationDefinitionQuantitativeDetails);
				if (result == null) result = caseElement(observationDefinitionQuantitativeDetails);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.OBSERVATION_RANGE_CATEGORY: {
				ObservationRangeCategory observationRangeCategory = (ObservationRangeCategory)theEObject;
				T result = caseObservationRangeCategory(observationRangeCategory);
				if (result == null) result = caseElement(observationRangeCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.OBSERVATION_REFERENCE_RANGE: {
				ObservationReferenceRange observationReferenceRange = (ObservationReferenceRange)theEObject;
				T result = caseObservationReferenceRange(observationReferenceRange);
				if (result == null) result = caseBackboneElement(observationReferenceRange);
				if (result == null) result = caseElement(observationReferenceRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.OBSERVATION_STATUS: {
				ObservationStatus observationStatus = (ObservationStatus)theEObject;
				T result = caseObservationStatus(observationStatus);
				if (result == null) result = caseElement(observationStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.OID: {
				Oid oid = (Oid)theEObject;
				T result = caseOid(oid);
				if (result == null) result = caseElement(oid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.OPERATION_DEFINITION: {
				OperationDefinition operationDefinition = (OperationDefinition)theEObject;
				T result = caseOperationDefinition(operationDefinition);
				if (result == null) result = caseDomainResource(operationDefinition);
				if (result == null) result = caseResource(operationDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.OPERATION_DEFINITION_BINDING: {
				OperationDefinitionBinding operationDefinitionBinding = (OperationDefinitionBinding)theEObject;
				T result = caseOperationDefinitionBinding(operationDefinitionBinding);
				if (result == null) result = caseBackboneElement(operationDefinitionBinding);
				if (result == null) result = caseElement(operationDefinitionBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.OPERATION_DEFINITION_OVERLOAD: {
				OperationDefinitionOverload operationDefinitionOverload = (OperationDefinitionOverload)theEObject;
				T result = caseOperationDefinitionOverload(operationDefinitionOverload);
				if (result == null) result = caseBackboneElement(operationDefinitionOverload);
				if (result == null) result = caseElement(operationDefinitionOverload);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.OPERATION_DEFINITION_PARAMETER: {
				OperationDefinitionParameter operationDefinitionParameter = (OperationDefinitionParameter)theEObject;
				T result = caseOperationDefinitionParameter(operationDefinitionParameter);
				if (result == null) result = caseBackboneElement(operationDefinitionParameter);
				if (result == null) result = caseElement(operationDefinitionParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.OPERATION_DEFINITION_REFERENCED_FROM: {
				OperationDefinitionReferencedFrom operationDefinitionReferencedFrom = (OperationDefinitionReferencedFrom)theEObject;
				T result = caseOperationDefinitionReferencedFrom(operationDefinitionReferencedFrom);
				if (result == null) result = caseBackboneElement(operationDefinitionReferencedFrom);
				if (result == null) result = caseElement(operationDefinitionReferencedFrom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.OPERATION_KIND: {
				OperationKind operationKind = (OperationKind)theEObject;
				T result = caseOperationKind(operationKind);
				if (result == null) result = caseElement(operationKind);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.OPERATION_OUTCOME: {
				OperationOutcome operationOutcome = (OperationOutcome)theEObject;
				T result = caseOperationOutcome(operationOutcome);
				if (result == null) result = caseDomainResource(operationOutcome);
				if (result == null) result = caseResource(operationOutcome);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.OPERATION_OUTCOME_ISSUE: {
				OperationOutcomeIssue operationOutcomeIssue = (OperationOutcomeIssue)theEObject;
				T result = caseOperationOutcomeIssue(operationOutcomeIssue);
				if (result == null) result = caseBackboneElement(operationOutcomeIssue);
				if (result == null) result = caseElement(operationOutcomeIssue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.OPERATION_PARAMETER_USE: {
				OperationParameterUse operationParameterUse = (OperationParameterUse)theEObject;
				T result = caseOperationParameterUse(operationParameterUse);
				if (result == null) result = caseElement(operationParameterUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ORGANIZATION: {
				Organization organization = (Organization)theEObject;
				T result = caseOrganization(organization);
				if (result == null) result = caseDomainResource(organization);
				if (result == null) result = caseResource(organization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ORGANIZATION_AFFILIATION: {
				OrganizationAffiliation organizationAffiliation = (OrganizationAffiliation)theEObject;
				T result = caseOrganizationAffiliation(organizationAffiliation);
				if (result == null) result = caseDomainResource(organizationAffiliation);
				if (result == null) result = caseResource(organizationAffiliation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ORGANIZATION_CONTACT: {
				OrganizationContact organizationContact = (OrganizationContact)theEObject;
				T result = caseOrganizationContact(organizationContact);
				if (result == null) result = caseBackboneElement(organizationContact);
				if (result == null) result = caseElement(organizationContact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.ORIENTATION_TYPE: {
				OrientationType orientationType = (OrientationType)theEObject;
				T result = caseOrientationType(orientationType);
				if (result == null) result = caseElement(orientationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PARAMETER_DEFINITION: {
				ParameterDefinition parameterDefinition = (ParameterDefinition)theEObject;
				T result = caseParameterDefinition(parameterDefinition);
				if (result == null) result = caseElement(parameterDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PARAMETERS: {
				Parameters parameters = (Parameters)theEObject;
				T result = caseParameters(parameters);
				if (result == null) result = caseResource(parameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PARAMETERS_PARAMETER: {
				ParametersParameter parametersParameter = (ParametersParameter)theEObject;
				T result = caseParametersParameter(parametersParameter);
				if (result == null) result = caseBackboneElement(parametersParameter);
				if (result == null) result = caseElement(parametersParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PARTICIPANT_REQUIRED: {
				ParticipantRequired participantRequired = (ParticipantRequired)theEObject;
				T result = caseParticipantRequired(participantRequired);
				if (result == null) result = caseElement(participantRequired);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PARTICIPATION_STATUS: {
				ParticipationStatus participationStatus = (ParticipationStatus)theEObject;
				T result = caseParticipationStatus(participationStatus);
				if (result == null) result = caseElement(participationStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PATIENT: {
				Patient patient = (Patient)theEObject;
				T result = casePatient(patient);
				if (result == null) result = caseDomainResource(patient);
				if (result == null) result = caseResource(patient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PATIENT_COMMUNICATION: {
				PatientCommunication patientCommunication = (PatientCommunication)theEObject;
				T result = casePatientCommunication(patientCommunication);
				if (result == null) result = caseBackboneElement(patientCommunication);
				if (result == null) result = caseElement(patientCommunication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PATIENT_CONTACT: {
				PatientContact patientContact = (PatientContact)theEObject;
				T result = casePatientContact(patientContact);
				if (result == null) result = caseBackboneElement(patientContact);
				if (result == null) result = caseElement(patientContact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PATIENT_LINK: {
				PatientLink patientLink = (PatientLink)theEObject;
				T result = casePatientLink(patientLink);
				if (result == null) result = caseBackboneElement(patientLink);
				if (result == null) result = caseElement(patientLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PAYMENT_NOTICE: {
				PaymentNotice paymentNotice = (PaymentNotice)theEObject;
				T result = casePaymentNotice(paymentNotice);
				if (result == null) result = caseDomainResource(paymentNotice);
				if (result == null) result = caseResource(paymentNotice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PAYMENT_RECONCILIATION: {
				PaymentReconciliation paymentReconciliation = (PaymentReconciliation)theEObject;
				T result = casePaymentReconciliation(paymentReconciliation);
				if (result == null) result = caseDomainResource(paymentReconciliation);
				if (result == null) result = caseResource(paymentReconciliation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL: {
				PaymentReconciliationDetail paymentReconciliationDetail = (PaymentReconciliationDetail)theEObject;
				T result = casePaymentReconciliationDetail(paymentReconciliationDetail);
				if (result == null) result = caseBackboneElement(paymentReconciliationDetail);
				if (result == null) result = caseElement(paymentReconciliationDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PAYMENT_RECONCILIATION_PROCESS_NOTE: {
				PaymentReconciliationProcessNote paymentReconciliationProcessNote = (PaymentReconciliationProcessNote)theEObject;
				T result = casePaymentReconciliationProcessNote(paymentReconciliationProcessNote);
				if (result == null) result = caseBackboneElement(paymentReconciliationProcessNote);
				if (result == null) result = caseElement(paymentReconciliationProcessNote);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PERIOD: {
				Period period = (Period)theEObject;
				T result = casePeriod(period);
				if (result == null) result = caseElement(period);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PERSON: {
				Person person = (Person)theEObject;
				T result = casePerson(person);
				if (result == null) result = caseDomainResource(person);
				if (result == null) result = caseResource(person);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PERSON_LINK: {
				PersonLink personLink = (PersonLink)theEObject;
				T result = casePersonLink(personLink);
				if (result == null) result = caseBackboneElement(personLink);
				if (result == null) result = caseElement(personLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PLAN_DEFINITION: {
				PlanDefinition planDefinition = (PlanDefinition)theEObject;
				T result = casePlanDefinition(planDefinition);
				if (result == null) result = caseDomainResource(planDefinition);
				if (result == null) result = caseResource(planDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PLAN_DEFINITION_ACTION: {
				PlanDefinitionAction planDefinitionAction = (PlanDefinitionAction)theEObject;
				T result = casePlanDefinitionAction(planDefinitionAction);
				if (result == null) result = caseBackboneElement(planDefinitionAction);
				if (result == null) result = caseElement(planDefinitionAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PLAN_DEFINITION_CONDITION: {
				PlanDefinitionCondition planDefinitionCondition = (PlanDefinitionCondition)theEObject;
				T result = casePlanDefinitionCondition(planDefinitionCondition);
				if (result == null) result = caseBackboneElement(planDefinitionCondition);
				if (result == null) result = caseElement(planDefinitionCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PLAN_DEFINITION_DYNAMIC_VALUE: {
				PlanDefinitionDynamicValue planDefinitionDynamicValue = (PlanDefinitionDynamicValue)theEObject;
				T result = casePlanDefinitionDynamicValue(planDefinitionDynamicValue);
				if (result == null) result = caseBackboneElement(planDefinitionDynamicValue);
				if (result == null) result = caseElement(planDefinitionDynamicValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PLAN_DEFINITION_GOAL: {
				PlanDefinitionGoal planDefinitionGoal = (PlanDefinitionGoal)theEObject;
				T result = casePlanDefinitionGoal(planDefinitionGoal);
				if (result == null) result = caseBackboneElement(planDefinitionGoal);
				if (result == null) result = caseElement(planDefinitionGoal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PLAN_DEFINITION_PARTICIPANT: {
				PlanDefinitionParticipant planDefinitionParticipant = (PlanDefinitionParticipant)theEObject;
				T result = casePlanDefinitionParticipant(planDefinitionParticipant);
				if (result == null) result = caseBackboneElement(planDefinitionParticipant);
				if (result == null) result = caseElement(planDefinitionParticipant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PLAN_DEFINITION_RELATED_ACTION: {
				PlanDefinitionRelatedAction planDefinitionRelatedAction = (PlanDefinitionRelatedAction)theEObject;
				T result = casePlanDefinitionRelatedAction(planDefinitionRelatedAction);
				if (result == null) result = caseBackboneElement(planDefinitionRelatedAction);
				if (result == null) result = caseElement(planDefinitionRelatedAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PLAN_DEFINITION_TARGET: {
				PlanDefinitionTarget planDefinitionTarget = (PlanDefinitionTarget)theEObject;
				T result = casePlanDefinitionTarget(planDefinitionTarget);
				if (result == null) result = caseBackboneElement(planDefinitionTarget);
				if (result == null) result = caseElement(planDefinitionTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.POPULATION: {
				Population population = (Population)theEObject;
				T result = casePopulation(population);
				if (result == null) result = caseBackboneElement(population);
				if (result == null) result = caseElement(population);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.POSITIVE_INT: {
				PositiveInt positiveInt = (PositiveInt)theEObject;
				T result = casePositiveInt(positiveInt);
				if (result == null) result = caseElement(positiveInt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PRACTITIONER: {
				Practitioner practitioner = (Practitioner)theEObject;
				T result = casePractitioner(practitioner);
				if (result == null) result = caseDomainResource(practitioner);
				if (result == null) result = caseResource(practitioner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PRACTITIONER_QUALIFICATION: {
				PractitionerQualification practitionerQualification = (PractitionerQualification)theEObject;
				T result = casePractitionerQualification(practitionerQualification);
				if (result == null) result = caseBackboneElement(practitionerQualification);
				if (result == null) result = caseElement(practitionerQualification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PRACTITIONER_ROLE: {
				PractitionerRole practitionerRole = (PractitionerRole)theEObject;
				T result = casePractitionerRole(practitionerRole);
				if (result == null) result = caseDomainResource(practitionerRole);
				if (result == null) result = caseResource(practitionerRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PRACTITIONER_ROLE_AVAILABLE_TIME: {
				PractitionerRoleAvailableTime practitionerRoleAvailableTime = (PractitionerRoleAvailableTime)theEObject;
				T result = casePractitionerRoleAvailableTime(practitionerRoleAvailableTime);
				if (result == null) result = caseBackboneElement(practitionerRoleAvailableTime);
				if (result == null) result = caseElement(practitionerRoleAvailableTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PRACTITIONER_ROLE_NOT_AVAILABLE: {
				PractitionerRoleNotAvailable practitionerRoleNotAvailable = (PractitionerRoleNotAvailable)theEObject;
				T result = casePractitionerRoleNotAvailable(practitionerRoleNotAvailable);
				if (result == null) result = caseBackboneElement(practitionerRoleNotAvailable);
				if (result == null) result = caseElement(practitionerRoleNotAvailable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PROCEDURE: {
				Procedure procedure = (Procedure)theEObject;
				T result = caseProcedure(procedure);
				if (result == null) result = caseDomainResource(procedure);
				if (result == null) result = caseResource(procedure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PROCEDURE_FOCAL_DEVICE: {
				ProcedureFocalDevice procedureFocalDevice = (ProcedureFocalDevice)theEObject;
				T result = caseProcedureFocalDevice(procedureFocalDevice);
				if (result == null) result = caseBackboneElement(procedureFocalDevice);
				if (result == null) result = caseElement(procedureFocalDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PROCEDURE_PERFORMER: {
				ProcedurePerformer procedurePerformer = (ProcedurePerformer)theEObject;
				T result = caseProcedurePerformer(procedurePerformer);
				if (result == null) result = caseBackboneElement(procedurePerformer);
				if (result == null) result = caseElement(procedurePerformer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PROD_CHARACTERISTIC: {
				ProdCharacteristic prodCharacteristic = (ProdCharacteristic)theEObject;
				T result = caseProdCharacteristic(prodCharacteristic);
				if (result == null) result = caseBackboneElement(prodCharacteristic);
				if (result == null) result = caseElement(prodCharacteristic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PRODUCT_SHELF_LIFE: {
				ProductShelfLife productShelfLife = (ProductShelfLife)theEObject;
				T result = caseProductShelfLife(productShelfLife);
				if (result == null) result = caseBackboneElement(productShelfLife);
				if (result == null) result = caseElement(productShelfLife);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PROPERTY_REPRESENTATION: {
				PropertyRepresentation propertyRepresentation = (PropertyRepresentation)theEObject;
				T result = casePropertyRepresentation(propertyRepresentation);
				if (result == null) result = caseElement(propertyRepresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PROPERTY_TYPE: {
				PropertyType propertyType = (PropertyType)theEObject;
				T result = casePropertyType(propertyType);
				if (result == null) result = caseElement(propertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PROVENANCE: {
				Provenance provenance = (Provenance)theEObject;
				T result = caseProvenance(provenance);
				if (result == null) result = caseDomainResource(provenance);
				if (result == null) result = caseResource(provenance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PROVENANCE_AGENT: {
				ProvenanceAgent provenanceAgent = (ProvenanceAgent)theEObject;
				T result = caseProvenanceAgent(provenanceAgent);
				if (result == null) result = caseBackboneElement(provenanceAgent);
				if (result == null) result = caseElement(provenanceAgent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PROVENANCE_ENTITY: {
				ProvenanceEntity provenanceEntity = (ProvenanceEntity)theEObject;
				T result = caseProvenanceEntity(provenanceEntity);
				if (result == null) result = caseBackboneElement(provenanceEntity);
				if (result == null) result = caseElement(provenanceEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PROVENANCE_ENTITY_ROLE: {
				ProvenanceEntityRole provenanceEntityRole = (ProvenanceEntityRole)theEObject;
				T result = caseProvenanceEntityRole(provenanceEntityRole);
				if (result == null) result = caseElement(provenanceEntityRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.PUBLICATION_STATUS: {
				PublicationStatus publicationStatus = (PublicationStatus)theEObject;
				T result = casePublicationStatus(publicationStatus);
				if (result == null) result = caseElement(publicationStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.QUALITY_TYPE: {
				QualityType qualityType = (QualityType)theEObject;
				T result = caseQualityType(qualityType);
				if (result == null) result = caseElement(qualityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.QUANTITY: {
				Quantity quantity = (Quantity)theEObject;
				T result = caseQuantity(quantity);
				if (result == null) result = caseElement(quantity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.QUANTITY_COMPARATOR: {
				QuantityComparator quantityComparator = (QuantityComparator)theEObject;
				T result = caseQuantityComparator(quantityComparator);
				if (result == null) result = caseElement(quantityComparator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.QUESTIONNAIRE: {
				Questionnaire questionnaire = (Questionnaire)theEObject;
				T result = caseQuestionnaire(questionnaire);
				if (result == null) result = caseDomainResource(questionnaire);
				if (result == null) result = caseResource(questionnaire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.QUESTIONNAIRE_ANSWER_OPTION: {
				QuestionnaireAnswerOption questionnaireAnswerOption = (QuestionnaireAnswerOption)theEObject;
				T result = caseQuestionnaireAnswerOption(questionnaireAnswerOption);
				if (result == null) result = caseBackboneElement(questionnaireAnswerOption);
				if (result == null) result = caseElement(questionnaireAnswerOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN: {
				QuestionnaireEnableWhen questionnaireEnableWhen = (QuestionnaireEnableWhen)theEObject;
				T result = caseQuestionnaireEnableWhen(questionnaireEnableWhen);
				if (result == null) result = caseBackboneElement(questionnaireEnableWhen);
				if (result == null) result = caseElement(questionnaireEnableWhen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.QUESTIONNAIRE_INITIAL: {
				QuestionnaireInitial questionnaireInitial = (QuestionnaireInitial)theEObject;
				T result = caseQuestionnaireInitial(questionnaireInitial);
				if (result == null) result = caseBackboneElement(questionnaireInitial);
				if (result == null) result = caseElement(questionnaireInitial);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.QUESTIONNAIRE_ITEM: {
				QuestionnaireItem questionnaireItem = (QuestionnaireItem)theEObject;
				T result = caseQuestionnaireItem(questionnaireItem);
				if (result == null) result = caseBackboneElement(questionnaireItem);
				if (result == null) result = caseElement(questionnaireItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.QUESTIONNAIRE_ITEM_OPERATOR: {
				QuestionnaireItemOperator questionnaireItemOperator = (QuestionnaireItemOperator)theEObject;
				T result = caseQuestionnaireItemOperator(questionnaireItemOperator);
				if (result == null) result = caseElement(questionnaireItemOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.QUESTIONNAIRE_ITEM_TYPE: {
				QuestionnaireItemType questionnaireItemType = (QuestionnaireItemType)theEObject;
				T result = caseQuestionnaireItemType(questionnaireItemType);
				if (result == null) result = caseElement(questionnaireItemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.QUESTIONNAIRE_RESPONSE: {
				QuestionnaireResponse questionnaireResponse = (QuestionnaireResponse)theEObject;
				T result = caseQuestionnaireResponse(questionnaireResponse);
				if (result == null) result = caseDomainResource(questionnaireResponse);
				if (result == null) result = caseResource(questionnaireResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.QUESTIONNAIRE_RESPONSE_ANSWER: {
				QuestionnaireResponseAnswer questionnaireResponseAnswer = (QuestionnaireResponseAnswer)theEObject;
				T result = caseQuestionnaireResponseAnswer(questionnaireResponseAnswer);
				if (result == null) result = caseBackboneElement(questionnaireResponseAnswer);
				if (result == null) result = caseElement(questionnaireResponseAnswer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.QUESTIONNAIRE_RESPONSE_ITEM: {
				QuestionnaireResponseItem questionnaireResponseItem = (QuestionnaireResponseItem)theEObject;
				T result = caseQuestionnaireResponseItem(questionnaireResponseItem);
				if (result == null) result = caseBackboneElement(questionnaireResponseItem);
				if (result == null) result = caseElement(questionnaireResponseItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.QUESTIONNAIRE_RESPONSE_STATUS: {
				QuestionnaireResponseStatus questionnaireResponseStatus = (QuestionnaireResponseStatus)theEObject;
				T result = caseQuestionnaireResponseStatus(questionnaireResponseStatus);
				if (result == null) result = caseElement(questionnaireResponseStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.RANGE: {
				Range range = (Range)theEObject;
				T result = caseRange(range);
				if (result == null) result = caseElement(range);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.RATIO: {
				Ratio ratio = (Ratio)theEObject;
				T result = caseRatio(ratio);
				if (result == null) result = caseElement(ratio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.REFERENCE: {
				Reference reference = (Reference)theEObject;
				T result = caseReference(reference);
				if (result == null) result = caseElement(reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.REFERENCE_HANDLING_POLICY: {
				ReferenceHandlingPolicy referenceHandlingPolicy = (ReferenceHandlingPolicy)theEObject;
				T result = caseReferenceHandlingPolicy(referenceHandlingPolicy);
				if (result == null) result = caseElement(referenceHandlingPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.REFERENCE_VERSION_RULES: {
				ReferenceVersionRules referenceVersionRules = (ReferenceVersionRules)theEObject;
				T result = caseReferenceVersionRules(referenceVersionRules);
				if (result == null) result = caseElement(referenceVersionRules);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.RELATED_ARTIFACT: {
				RelatedArtifact relatedArtifact = (RelatedArtifact)theEObject;
				T result = caseRelatedArtifact(relatedArtifact);
				if (result == null) result = caseElement(relatedArtifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.RELATED_ARTIFACT_TYPE: {
				RelatedArtifactType relatedArtifactType = (RelatedArtifactType)theEObject;
				T result = caseRelatedArtifactType(relatedArtifactType);
				if (result == null) result = caseElement(relatedArtifactType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.RELATED_PERSON: {
				RelatedPerson relatedPerson = (RelatedPerson)theEObject;
				T result = caseRelatedPerson(relatedPerson);
				if (result == null) result = caseDomainResource(relatedPerson);
				if (result == null) result = caseResource(relatedPerson);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.RELATED_PERSON_COMMUNICATION: {
				RelatedPersonCommunication relatedPersonCommunication = (RelatedPersonCommunication)theEObject;
				T result = caseRelatedPersonCommunication(relatedPersonCommunication);
				if (result == null) result = caseBackboneElement(relatedPersonCommunication);
				if (result == null) result = caseElement(relatedPersonCommunication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.REMITTANCE_OUTCOME: {
				RemittanceOutcome remittanceOutcome = (RemittanceOutcome)theEObject;
				T result = caseRemittanceOutcome(remittanceOutcome);
				if (result == null) result = caseElement(remittanceOutcome);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.REPOSITORY_TYPE: {
				RepositoryType repositoryType = (RepositoryType)theEObject;
				T result = caseRepositoryType(repositoryType);
				if (result == null) result = caseElement(repositoryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.REQUEST_GROUP: {
				RequestGroup requestGroup = (RequestGroup)theEObject;
				T result = caseRequestGroup(requestGroup);
				if (result == null) result = caseDomainResource(requestGroup);
				if (result == null) result = caseResource(requestGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.REQUEST_GROUP_ACTION: {
				RequestGroupAction requestGroupAction = (RequestGroupAction)theEObject;
				T result = caseRequestGroupAction(requestGroupAction);
				if (result == null) result = caseBackboneElement(requestGroupAction);
				if (result == null) result = caseElement(requestGroupAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.REQUEST_GROUP_CONDITION: {
				RequestGroupCondition requestGroupCondition = (RequestGroupCondition)theEObject;
				T result = caseRequestGroupCondition(requestGroupCondition);
				if (result == null) result = caseBackboneElement(requestGroupCondition);
				if (result == null) result = caseElement(requestGroupCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.REQUEST_GROUP_RELATED_ACTION: {
				RequestGroupRelatedAction requestGroupRelatedAction = (RequestGroupRelatedAction)theEObject;
				T result = caseRequestGroupRelatedAction(requestGroupRelatedAction);
				if (result == null) result = caseBackboneElement(requestGroupRelatedAction);
				if (result == null) result = caseElement(requestGroupRelatedAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.REQUEST_INTENT: {
				RequestIntent requestIntent = (RequestIntent)theEObject;
				T result = caseRequestIntent(requestIntent);
				if (result == null) result = caseElement(requestIntent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.REQUEST_PRIORITY: {
				RequestPriority requestPriority = (RequestPriority)theEObject;
				T result = caseRequestPriority(requestPriority);
				if (result == null) result = caseElement(requestPriority);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.REQUEST_RESOURCE_TYPE: {
				RequestResourceType requestResourceType = (RequestResourceType)theEObject;
				T result = caseRequestResourceType(requestResourceType);
				if (result == null) result = caseElement(requestResourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.REQUEST_STATUS: {
				RequestStatus requestStatus = (RequestStatus)theEObject;
				T result = caseRequestStatus(requestStatus);
				if (result == null) result = caseElement(requestStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.RESEARCH_DEFINITION: {
				ResearchDefinition researchDefinition = (ResearchDefinition)theEObject;
				T result = caseResearchDefinition(researchDefinition);
				if (result == null) result = caseDomainResource(researchDefinition);
				if (result == null) result = caseResource(researchDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION: {
				ResearchElementDefinition researchElementDefinition = (ResearchElementDefinition)theEObject;
				T result = caseResearchElementDefinition(researchElementDefinition);
				if (result == null) result = caseDomainResource(researchElementDefinition);
				if (result == null) result = caseResource(researchElementDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC: {
				ResearchElementDefinitionCharacteristic researchElementDefinitionCharacteristic = (ResearchElementDefinitionCharacteristic)theEObject;
				T result = caseResearchElementDefinitionCharacteristic(researchElementDefinitionCharacteristic);
				if (result == null) result = caseBackboneElement(researchElementDefinitionCharacteristic);
				if (result == null) result = caseElement(researchElementDefinitionCharacteristic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.RESEARCH_ELEMENT_TYPE: {
				ResearchElementType researchElementType = (ResearchElementType)theEObject;
				T result = caseResearchElementType(researchElementType);
				if (result == null) result = caseElement(researchElementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.RESEARCH_STUDY: {
				ResearchStudy researchStudy = (ResearchStudy)theEObject;
				T result = caseResearchStudy(researchStudy);
				if (result == null) result = caseDomainResource(researchStudy);
				if (result == null) result = caseResource(researchStudy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.RESEARCH_STUDY_ARM: {
				ResearchStudyArm researchStudyArm = (ResearchStudyArm)theEObject;
				T result = caseResearchStudyArm(researchStudyArm);
				if (result == null) result = caseBackboneElement(researchStudyArm);
				if (result == null) result = caseElement(researchStudyArm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.RESEARCH_STUDY_OBJECTIVE: {
				ResearchStudyObjective researchStudyObjective = (ResearchStudyObjective)theEObject;
				T result = caseResearchStudyObjective(researchStudyObjective);
				if (result == null) result = caseBackboneElement(researchStudyObjective);
				if (result == null) result = caseElement(researchStudyObjective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.RESEARCH_STUDY_STATUS: {
				ResearchStudyStatus researchStudyStatus = (ResearchStudyStatus)theEObject;
				T result = caseResearchStudyStatus(researchStudyStatus);
				if (result == null) result = caseElement(researchStudyStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.RESEARCH_SUBJECT: {
				ResearchSubject researchSubject = (ResearchSubject)theEObject;
				T result = caseResearchSubject(researchSubject);
				if (result == null) result = caseDomainResource(researchSubject);
				if (result == null) result = caseResource(researchSubject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.RESEARCH_SUBJECT_STATUS: {
				ResearchSubjectStatus researchSubjectStatus = (ResearchSubjectStatus)theEObject;
				T result = caseResearchSubjectStatus(researchSubjectStatus);
				if (result == null) result = caseElement(researchSubjectStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.RESOURCE: {
				Resource resource = (Resource)theEObject;
				T result = caseResource(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.RESOURCE_CONTAINER: {
				ResourceContainer resourceContainer = (ResourceContainer)theEObject;
				T result = caseResourceContainer(resourceContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.RESOURCE_TYPE: {
				ResourceType resourceType = (ResourceType)theEObject;
				T result = caseResourceType(resourceType);
				if (result == null) result = caseElement(resourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.RESOURCE_VERSION_POLICY: {
				ResourceVersionPolicy resourceVersionPolicy = (ResourceVersionPolicy)theEObject;
				T result = caseResourceVersionPolicy(resourceVersionPolicy);
				if (result == null) result = caseElement(resourceVersionPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.RESPONSE_TYPE: {
				ResponseType responseType = (ResponseType)theEObject;
				T result = caseResponseType(responseType);
				if (result == null) result = caseElement(responseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.RESTFUL_CAPABILITY_MODE: {
				RestfulCapabilityMode restfulCapabilityMode = (RestfulCapabilityMode)theEObject;
				T result = caseRestfulCapabilityMode(restfulCapabilityMode);
				if (result == null) result = caseElement(restfulCapabilityMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.RISK_ASSESSMENT: {
				RiskAssessment riskAssessment = (RiskAssessment)theEObject;
				T result = caseRiskAssessment(riskAssessment);
				if (result == null) result = caseDomainResource(riskAssessment);
				if (result == null) result = caseResource(riskAssessment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.RISK_ASSESSMENT_PREDICTION: {
				RiskAssessmentPrediction riskAssessmentPrediction = (RiskAssessmentPrediction)theEObject;
				T result = caseRiskAssessmentPrediction(riskAssessmentPrediction);
				if (result == null) result = caseBackboneElement(riskAssessmentPrediction);
				if (result == null) result = caseElement(riskAssessmentPrediction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS: {
				RiskEvidenceSynthesis riskEvidenceSynthesis = (RiskEvidenceSynthesis)theEObject;
				T result = caseRiskEvidenceSynthesis(riskEvidenceSynthesis);
				if (result == null) result = caseDomainResource(riskEvidenceSynthesis);
				if (result == null) result = caseResource(riskEvidenceSynthesis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_CERTAINTY: {
				RiskEvidenceSynthesisCertainty riskEvidenceSynthesisCertainty = (RiskEvidenceSynthesisCertainty)theEObject;
				T result = caseRiskEvidenceSynthesisCertainty(riskEvidenceSynthesisCertainty);
				if (result == null) result = caseBackboneElement(riskEvidenceSynthesisCertainty);
				if (result == null) result = caseElement(riskEvidenceSynthesisCertainty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_CERTAINTY_SUBCOMPONENT: {
				RiskEvidenceSynthesisCertaintySubcomponent riskEvidenceSynthesisCertaintySubcomponent = (RiskEvidenceSynthesisCertaintySubcomponent)theEObject;
				T result = caseRiskEvidenceSynthesisCertaintySubcomponent(riskEvidenceSynthesisCertaintySubcomponent);
				if (result == null) result = caseBackboneElement(riskEvidenceSynthesisCertaintySubcomponent);
				if (result == null) result = caseElement(riskEvidenceSynthesisCertaintySubcomponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_PRECISION_ESTIMATE: {
				RiskEvidenceSynthesisPrecisionEstimate riskEvidenceSynthesisPrecisionEstimate = (RiskEvidenceSynthesisPrecisionEstimate)theEObject;
				T result = caseRiskEvidenceSynthesisPrecisionEstimate(riskEvidenceSynthesisPrecisionEstimate);
				if (result == null) result = caseBackboneElement(riskEvidenceSynthesisPrecisionEstimate);
				if (result == null) result = caseElement(riskEvidenceSynthesisPrecisionEstimate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE: {
				RiskEvidenceSynthesisRiskEstimate riskEvidenceSynthesisRiskEstimate = (RiskEvidenceSynthesisRiskEstimate)theEObject;
				T result = caseRiskEvidenceSynthesisRiskEstimate(riskEvidenceSynthesisRiskEstimate);
				if (result == null) result = caseBackboneElement(riskEvidenceSynthesisRiskEstimate);
				if (result == null) result = caseElement(riskEvidenceSynthesisRiskEstimate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.RISK_EVIDENCE_SYNTHESIS_SAMPLE_SIZE: {
				RiskEvidenceSynthesisSampleSize riskEvidenceSynthesisSampleSize = (RiskEvidenceSynthesisSampleSize)theEObject;
				T result = caseRiskEvidenceSynthesisSampleSize(riskEvidenceSynthesisSampleSize);
				if (result == null) result = caseBackboneElement(riskEvidenceSynthesisSampleSize);
				if (result == null) result = caseElement(riskEvidenceSynthesisSampleSize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SAMPLED_DATA: {
				SampledData sampledData = (SampledData)theEObject;
				T result = caseSampledData(sampledData);
				if (result == null) result = caseElement(sampledData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SAMPLED_DATA_DATA_TYPE: {
				SampledDataDataType sampledDataDataType = (SampledDataDataType)theEObject;
				T result = caseSampledDataDataType(sampledDataDataType);
				if (result == null) result = caseElement(sampledDataDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SCHEDULE: {
				Schedule schedule = (Schedule)theEObject;
				T result = caseSchedule(schedule);
				if (result == null) result = caseDomainResource(schedule);
				if (result == null) result = caseResource(schedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SEARCH_COMPARATOR: {
				SearchComparator searchComparator = (SearchComparator)theEObject;
				T result = caseSearchComparator(searchComparator);
				if (result == null) result = caseElement(searchComparator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SEARCH_ENTRY_MODE: {
				SearchEntryMode searchEntryMode = (SearchEntryMode)theEObject;
				T result = caseSearchEntryMode(searchEntryMode);
				if (result == null) result = caseElement(searchEntryMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SEARCH_MODIFIER_CODE: {
				SearchModifierCode searchModifierCode = (SearchModifierCode)theEObject;
				T result = caseSearchModifierCode(searchModifierCode);
				if (result == null) result = caseElement(searchModifierCode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SEARCH_PARAMETER: {
				SearchParameter searchParameter = (SearchParameter)theEObject;
				T result = caseSearchParameter(searchParameter);
				if (result == null) result = caseDomainResource(searchParameter);
				if (result == null) result = caseResource(searchParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SEARCH_PARAMETER_COMPONENT: {
				SearchParameterComponent searchParameterComponent = (SearchParameterComponent)theEObject;
				T result = caseSearchParameterComponent(searchParameterComponent);
				if (result == null) result = caseBackboneElement(searchParameterComponent);
				if (result == null) result = caseElement(searchParameterComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SEARCH_PARAM_TYPE: {
				SearchParamType searchParamType = (SearchParamType)theEObject;
				T result = caseSearchParamType(searchParamType);
				if (result == null) result = caseElement(searchParamType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SEQUENCE_TYPE: {
				SequenceType sequenceType = (SequenceType)theEObject;
				T result = caseSequenceType(sequenceType);
				if (result == null) result = caseElement(sequenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SERVICE_REQUEST: {
				ServiceRequest serviceRequest = (ServiceRequest)theEObject;
				T result = caseServiceRequest(serviceRequest);
				if (result == null) result = caseDomainResource(serviceRequest);
				if (result == null) result = caseResource(serviceRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SIGNATURE: {
				Signature signature = (Signature)theEObject;
				T result = caseSignature(signature);
				if (result == null) result = caseElement(signature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SLICING_RULES: {
				SlicingRules slicingRules = (SlicingRules)theEObject;
				T result = caseSlicingRules(slicingRules);
				if (result == null) result = caseElement(slicingRules);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SLOT: {
				Slot slot = (Slot)theEObject;
				T result = caseSlot(slot);
				if (result == null) result = caseDomainResource(slot);
				if (result == null) result = caseResource(slot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SLOT_STATUS: {
				SlotStatus slotStatus = (SlotStatus)theEObject;
				T result = caseSlotStatus(slotStatus);
				if (result == null) result = caseElement(slotStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SORT_DIRECTION: {
				SortDirection sortDirection = (SortDirection)theEObject;
				T result = caseSortDirection(sortDirection);
				if (result == null) result = caseElement(sortDirection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SPDX_LICENSE: {
				SPDXLicense spdxLicense = (SPDXLicense)theEObject;
				T result = caseSPDXLicense(spdxLicense);
				if (result == null) result = caseElement(spdxLicense);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SPECIMEN: {
				Specimen specimen = (Specimen)theEObject;
				T result = caseSpecimen(specimen);
				if (result == null) result = caseDomainResource(specimen);
				if (result == null) result = caseResource(specimen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SPECIMEN_COLLECTION: {
				SpecimenCollection specimenCollection = (SpecimenCollection)theEObject;
				T result = caseSpecimenCollection(specimenCollection);
				if (result == null) result = caseBackboneElement(specimenCollection);
				if (result == null) result = caseElement(specimenCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SPECIMEN_CONTAINED_PREFERENCE: {
				SpecimenContainedPreference specimenContainedPreference = (SpecimenContainedPreference)theEObject;
				T result = caseSpecimenContainedPreference(specimenContainedPreference);
				if (result == null) result = caseElement(specimenContainedPreference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SPECIMEN_CONTAINER: {
				SpecimenContainer specimenContainer = (SpecimenContainer)theEObject;
				T result = caseSpecimenContainer(specimenContainer);
				if (result == null) result = caseBackboneElement(specimenContainer);
				if (result == null) result = caseElement(specimenContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SPECIMEN_DEFINITION: {
				SpecimenDefinition specimenDefinition = (SpecimenDefinition)theEObject;
				T result = caseSpecimenDefinition(specimenDefinition);
				if (result == null) result = caseDomainResource(specimenDefinition);
				if (result == null) result = caseResource(specimenDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SPECIMEN_DEFINITION_ADDITIVE: {
				SpecimenDefinitionAdditive specimenDefinitionAdditive = (SpecimenDefinitionAdditive)theEObject;
				T result = caseSpecimenDefinitionAdditive(specimenDefinitionAdditive);
				if (result == null) result = caseBackboneElement(specimenDefinitionAdditive);
				if (result == null) result = caseElement(specimenDefinitionAdditive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SPECIMEN_DEFINITION_CONTAINER: {
				SpecimenDefinitionContainer specimenDefinitionContainer = (SpecimenDefinitionContainer)theEObject;
				T result = caseSpecimenDefinitionContainer(specimenDefinitionContainer);
				if (result == null) result = caseBackboneElement(specimenDefinitionContainer);
				if (result == null) result = caseElement(specimenDefinitionContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SPECIMEN_DEFINITION_HANDLING: {
				SpecimenDefinitionHandling specimenDefinitionHandling = (SpecimenDefinitionHandling)theEObject;
				T result = caseSpecimenDefinitionHandling(specimenDefinitionHandling);
				if (result == null) result = caseBackboneElement(specimenDefinitionHandling);
				if (result == null) result = caseElement(specimenDefinitionHandling);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SPECIMEN_DEFINITION_TYPE_TESTED: {
				SpecimenDefinitionTypeTested specimenDefinitionTypeTested = (SpecimenDefinitionTypeTested)theEObject;
				T result = caseSpecimenDefinitionTypeTested(specimenDefinitionTypeTested);
				if (result == null) result = caseBackboneElement(specimenDefinitionTypeTested);
				if (result == null) result = caseElement(specimenDefinitionTypeTested);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SPECIMEN_PROCESSING: {
				SpecimenProcessing specimenProcessing = (SpecimenProcessing)theEObject;
				T result = caseSpecimenProcessing(specimenProcessing);
				if (result == null) result = caseBackboneElement(specimenProcessing);
				if (result == null) result = caseElement(specimenProcessing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SPECIMEN_STATUS: {
				SpecimenStatus specimenStatus = (SpecimenStatus)theEObject;
				T result = caseSpecimenStatus(specimenStatus);
				if (result == null) result = caseElement(specimenStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.STATUS: {
				Status status = (Status)theEObject;
				T result = caseStatus(status);
				if (result == null) result = caseElement(status);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.STRAND_TYPE: {
				StrandType strandType = (StrandType)theEObject;
				T result = caseStrandType(strandType);
				if (result == null) result = caseElement(strandType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.STRING: {
				org.hl7.fhir.String string = (org.hl7.fhir.String)theEObject;
				T result = caseString(string);
				if (result == null) result = caseElement(string);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.STRUCTURE_DEFINITION: {
				StructureDefinition structureDefinition = (StructureDefinition)theEObject;
				T result = caseStructureDefinition(structureDefinition);
				if (result == null) result = caseDomainResource(structureDefinition);
				if (result == null) result = caseResource(structureDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.STRUCTURE_DEFINITION_CONTEXT: {
				StructureDefinitionContext structureDefinitionContext = (StructureDefinitionContext)theEObject;
				T result = caseStructureDefinitionContext(structureDefinitionContext);
				if (result == null) result = caseBackboneElement(structureDefinitionContext);
				if (result == null) result = caseElement(structureDefinitionContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.STRUCTURE_DEFINITION_DIFFERENTIAL: {
				StructureDefinitionDifferential structureDefinitionDifferential = (StructureDefinitionDifferential)theEObject;
				T result = caseStructureDefinitionDifferential(structureDefinitionDifferential);
				if (result == null) result = caseBackboneElement(structureDefinitionDifferential);
				if (result == null) result = caseElement(structureDefinitionDifferential);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.STRUCTURE_DEFINITION_KIND: {
				StructureDefinitionKind structureDefinitionKind = (StructureDefinitionKind)theEObject;
				T result = caseStructureDefinitionKind(structureDefinitionKind);
				if (result == null) result = caseElement(structureDefinitionKind);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.STRUCTURE_DEFINITION_MAPPING: {
				StructureDefinitionMapping structureDefinitionMapping = (StructureDefinitionMapping)theEObject;
				T result = caseStructureDefinitionMapping(structureDefinitionMapping);
				if (result == null) result = caseBackboneElement(structureDefinitionMapping);
				if (result == null) result = caseElement(structureDefinitionMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.STRUCTURE_DEFINITION_SNAPSHOT: {
				StructureDefinitionSnapshot structureDefinitionSnapshot = (StructureDefinitionSnapshot)theEObject;
				T result = caseStructureDefinitionSnapshot(structureDefinitionSnapshot);
				if (result == null) result = caseBackboneElement(structureDefinitionSnapshot);
				if (result == null) result = caseElement(structureDefinitionSnapshot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.STRUCTURE_MAP: {
				StructureMap structureMap = (StructureMap)theEObject;
				T result = caseStructureMap(structureMap);
				if (result == null) result = caseDomainResource(structureMap);
				if (result == null) result = caseResource(structureMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.STRUCTURE_MAP_CONTEXT_TYPE: {
				StructureMapContextType structureMapContextType = (StructureMapContextType)theEObject;
				T result = caseStructureMapContextType(structureMapContextType);
				if (result == null) result = caseElement(structureMapContextType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.STRUCTURE_MAP_DEPENDENT: {
				StructureMapDependent structureMapDependent = (StructureMapDependent)theEObject;
				T result = caseStructureMapDependent(structureMapDependent);
				if (result == null) result = caseBackboneElement(structureMapDependent);
				if (result == null) result = caseElement(structureMapDependent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.STRUCTURE_MAP_GROUP: {
				StructureMapGroup structureMapGroup = (StructureMapGroup)theEObject;
				T result = caseStructureMapGroup(structureMapGroup);
				if (result == null) result = caseBackboneElement(structureMapGroup);
				if (result == null) result = caseElement(structureMapGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.STRUCTURE_MAP_GROUP_TYPE_MODE: {
				StructureMapGroupTypeMode structureMapGroupTypeMode = (StructureMapGroupTypeMode)theEObject;
				T result = caseStructureMapGroupTypeMode(structureMapGroupTypeMode);
				if (result == null) result = caseElement(structureMapGroupTypeMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.STRUCTURE_MAP_INPUT: {
				StructureMapInput structureMapInput = (StructureMapInput)theEObject;
				T result = caseStructureMapInput(structureMapInput);
				if (result == null) result = caseBackboneElement(structureMapInput);
				if (result == null) result = caseElement(structureMapInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.STRUCTURE_MAP_INPUT_MODE: {
				StructureMapInputMode structureMapInputMode = (StructureMapInputMode)theEObject;
				T result = caseStructureMapInputMode(structureMapInputMode);
				if (result == null) result = caseElement(structureMapInputMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.STRUCTURE_MAP_MODEL_MODE: {
				StructureMapModelMode structureMapModelMode = (StructureMapModelMode)theEObject;
				T result = caseStructureMapModelMode(structureMapModelMode);
				if (result == null) result = caseElement(structureMapModelMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.STRUCTURE_MAP_PARAMETER: {
				StructureMapParameter structureMapParameter = (StructureMapParameter)theEObject;
				T result = caseStructureMapParameter(structureMapParameter);
				if (result == null) result = caseBackboneElement(structureMapParameter);
				if (result == null) result = caseElement(structureMapParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.STRUCTURE_MAP_RULE: {
				StructureMapRule structureMapRule = (StructureMapRule)theEObject;
				T result = caseStructureMapRule(structureMapRule);
				if (result == null) result = caseBackboneElement(structureMapRule);
				if (result == null) result = caseElement(structureMapRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.STRUCTURE_MAP_SOURCE: {
				StructureMapSource structureMapSource = (StructureMapSource)theEObject;
				T result = caseStructureMapSource(structureMapSource);
				if (result == null) result = caseBackboneElement(structureMapSource);
				if (result == null) result = caseElement(structureMapSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.STRUCTURE_MAP_SOURCE_LIST_MODE: {
				StructureMapSourceListMode structureMapSourceListMode = (StructureMapSourceListMode)theEObject;
				T result = caseStructureMapSourceListMode(structureMapSourceListMode);
				if (result == null) result = caseElement(structureMapSourceListMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.STRUCTURE_MAP_STRUCTURE: {
				StructureMapStructure structureMapStructure = (StructureMapStructure)theEObject;
				T result = caseStructureMapStructure(structureMapStructure);
				if (result == null) result = caseBackboneElement(structureMapStructure);
				if (result == null) result = caseElement(structureMapStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.STRUCTURE_MAP_TARGET: {
				StructureMapTarget structureMapTarget = (StructureMapTarget)theEObject;
				T result = caseStructureMapTarget(structureMapTarget);
				if (result == null) result = caseBackboneElement(structureMapTarget);
				if (result == null) result = caseElement(structureMapTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.STRUCTURE_MAP_TARGET_LIST_MODE: {
				StructureMapTargetListMode structureMapTargetListMode = (StructureMapTargetListMode)theEObject;
				T result = caseStructureMapTargetListMode(structureMapTargetListMode);
				if (result == null) result = caseElement(structureMapTargetListMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.STRUCTURE_MAP_TRANSFORM: {
				StructureMapTransform structureMapTransform = (StructureMapTransform)theEObject;
				T result = caseStructureMapTransform(structureMapTransform);
				if (result == null) result = caseElement(structureMapTransform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSCRIPTION: {
				Subscription subscription = (Subscription)theEObject;
				T result = caseSubscription(subscription);
				if (result == null) result = caseDomainResource(subscription);
				if (result == null) result = caseResource(subscription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSCRIPTION_CHANNEL: {
				SubscriptionChannel subscriptionChannel = (SubscriptionChannel)theEObject;
				T result = caseSubscriptionChannel(subscriptionChannel);
				if (result == null) result = caseBackboneElement(subscriptionChannel);
				if (result == null) result = caseElement(subscriptionChannel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSCRIPTION_CHANNEL_TYPE: {
				SubscriptionChannelType subscriptionChannelType = (SubscriptionChannelType)theEObject;
				T result = caseSubscriptionChannelType(subscriptionChannelType);
				if (result == null) result = caseElement(subscriptionChannelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSCRIPTION_STATUS: {
				SubscriptionStatus subscriptionStatus = (SubscriptionStatus)theEObject;
				T result = caseSubscriptionStatus(subscriptionStatus);
				if (result == null) result = caseElement(subscriptionStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSTANCE: {
				Substance substance = (Substance)theEObject;
				T result = caseSubstance(substance);
				if (result == null) result = caseDomainResource(substance);
				if (result == null) result = caseResource(substance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSTANCE_AMOUNT: {
				SubstanceAmount substanceAmount = (SubstanceAmount)theEObject;
				T result = caseSubstanceAmount(substanceAmount);
				if (result == null) result = caseBackboneElement(substanceAmount);
				if (result == null) result = caseElement(substanceAmount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSTANCE_AMOUNT_REFERENCE_RANGE: {
				SubstanceAmountReferenceRange substanceAmountReferenceRange = (SubstanceAmountReferenceRange)theEObject;
				T result = caseSubstanceAmountReferenceRange(substanceAmountReferenceRange);
				if (result == null) result = caseBackboneElement(substanceAmountReferenceRange);
				if (result == null) result = caseElement(substanceAmountReferenceRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSTANCE_INGREDIENT: {
				SubstanceIngredient substanceIngredient = (SubstanceIngredient)theEObject;
				T result = caseSubstanceIngredient(substanceIngredient);
				if (result == null) result = caseBackboneElement(substanceIngredient);
				if (result == null) result = caseElement(substanceIngredient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSTANCE_INSTANCE: {
				SubstanceInstance substanceInstance = (SubstanceInstance)theEObject;
				T result = caseSubstanceInstance(substanceInstance);
				if (result == null) result = caseBackboneElement(substanceInstance);
				if (result == null) result = caseElement(substanceInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID: {
				SubstanceNucleicAcid substanceNucleicAcid = (SubstanceNucleicAcid)theEObject;
				T result = caseSubstanceNucleicAcid(substanceNucleicAcid);
				if (result == null) result = caseDomainResource(substanceNucleicAcid);
				if (result == null) result = caseResource(substanceNucleicAcid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_LINKAGE: {
				SubstanceNucleicAcidLinkage substanceNucleicAcidLinkage = (SubstanceNucleicAcidLinkage)theEObject;
				T result = caseSubstanceNucleicAcidLinkage(substanceNucleicAcidLinkage);
				if (result == null) result = caseBackboneElement(substanceNucleicAcidLinkage);
				if (result == null) result = caseElement(substanceNucleicAcidLinkage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT: {
				SubstanceNucleicAcidSubunit substanceNucleicAcidSubunit = (SubstanceNucleicAcidSubunit)theEObject;
				T result = caseSubstanceNucleicAcidSubunit(substanceNucleicAcidSubunit);
				if (result == null) result = caseBackboneElement(substanceNucleicAcidSubunit);
				if (result == null) result = caseElement(substanceNucleicAcidSubunit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUGAR: {
				SubstanceNucleicAcidSugar substanceNucleicAcidSugar = (SubstanceNucleicAcidSugar)theEObject;
				T result = caseSubstanceNucleicAcidSugar(substanceNucleicAcidSugar);
				if (result == null) result = caseBackboneElement(substanceNucleicAcidSugar);
				if (result == null) result = caseElement(substanceNucleicAcidSugar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSTANCE_POLYMER: {
				SubstancePolymer substancePolymer = (SubstancePolymer)theEObject;
				T result = caseSubstancePolymer(substancePolymer);
				if (result == null) result = caseDomainResource(substancePolymer);
				if (result == null) result = caseResource(substancePolymer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSTANCE_POLYMER_DEGREE_OF_POLYMERISATION: {
				SubstancePolymerDegreeOfPolymerisation substancePolymerDegreeOfPolymerisation = (SubstancePolymerDegreeOfPolymerisation)theEObject;
				T result = caseSubstancePolymerDegreeOfPolymerisation(substancePolymerDegreeOfPolymerisation);
				if (result == null) result = caseBackboneElement(substancePolymerDegreeOfPolymerisation);
				if (result == null) result = caseElement(substancePolymerDegreeOfPolymerisation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSTANCE_POLYMER_MONOMER_SET: {
				SubstancePolymerMonomerSet substancePolymerMonomerSet = (SubstancePolymerMonomerSet)theEObject;
				T result = caseSubstancePolymerMonomerSet(substancePolymerMonomerSet);
				if (result == null) result = caseBackboneElement(substancePolymerMonomerSet);
				if (result == null) result = caseElement(substancePolymerMonomerSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT: {
				SubstancePolymerRepeat substancePolymerRepeat = (SubstancePolymerRepeat)theEObject;
				T result = caseSubstancePolymerRepeat(substancePolymerRepeat);
				if (result == null) result = caseBackboneElement(substancePolymerRepeat);
				if (result == null) result = caseElement(substancePolymerRepeat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSTANCE_POLYMER_REPEAT_UNIT: {
				SubstancePolymerRepeatUnit substancePolymerRepeatUnit = (SubstancePolymerRepeatUnit)theEObject;
				T result = caseSubstancePolymerRepeatUnit(substancePolymerRepeatUnit);
				if (result == null) result = caseBackboneElement(substancePolymerRepeatUnit);
				if (result == null) result = caseElement(substancePolymerRepeatUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSTANCE_POLYMER_STARTING_MATERIAL: {
				SubstancePolymerStartingMaterial substancePolymerStartingMaterial = (SubstancePolymerStartingMaterial)theEObject;
				T result = caseSubstancePolymerStartingMaterial(substancePolymerStartingMaterial);
				if (result == null) result = caseBackboneElement(substancePolymerStartingMaterial);
				if (result == null) result = caseElement(substancePolymerStartingMaterial);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSTANCE_POLYMER_STRUCTURAL_REPRESENTATION: {
				SubstancePolymerStructuralRepresentation substancePolymerStructuralRepresentation = (SubstancePolymerStructuralRepresentation)theEObject;
				T result = caseSubstancePolymerStructuralRepresentation(substancePolymerStructuralRepresentation);
				if (result == null) result = caseBackboneElement(substancePolymerStructuralRepresentation);
				if (result == null) result = caseElement(substancePolymerStructuralRepresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSTANCE_PROTEIN: {
				SubstanceProtein substanceProtein = (SubstanceProtein)theEObject;
				T result = caseSubstanceProtein(substanceProtein);
				if (result == null) result = caseDomainResource(substanceProtein);
				if (result == null) result = caseResource(substanceProtein);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT: {
				SubstanceProteinSubunit substanceProteinSubunit = (SubstanceProteinSubunit)theEObject;
				T result = caseSubstanceProteinSubunit(substanceProteinSubunit);
				if (result == null) result = caseBackboneElement(substanceProteinSubunit);
				if (result == null) result = caseElement(substanceProteinSubunit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION: {
				SubstanceReferenceInformation substanceReferenceInformation = (SubstanceReferenceInformation)theEObject;
				T result = caseSubstanceReferenceInformation(substanceReferenceInformation);
				if (result == null) result = caseDomainResource(substanceReferenceInformation);
				if (result == null) result = caseResource(substanceReferenceInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION: {
				SubstanceReferenceInformationClassification substanceReferenceInformationClassification = (SubstanceReferenceInformationClassification)theEObject;
				T result = caseSubstanceReferenceInformationClassification(substanceReferenceInformationClassification);
				if (result == null) result = caseBackboneElement(substanceReferenceInformationClassification);
				if (result == null) result = caseElement(substanceReferenceInformationClassification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_GENE: {
				SubstanceReferenceInformationGene substanceReferenceInformationGene = (SubstanceReferenceInformationGene)theEObject;
				T result = caseSubstanceReferenceInformationGene(substanceReferenceInformationGene);
				if (result == null) result = caseBackboneElement(substanceReferenceInformationGene);
				if (result == null) result = caseElement(substanceReferenceInformationGene);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_GENE_ELEMENT: {
				SubstanceReferenceInformationGeneElement substanceReferenceInformationGeneElement = (SubstanceReferenceInformationGeneElement)theEObject;
				T result = caseSubstanceReferenceInformationGeneElement(substanceReferenceInformationGeneElement);
				if (result == null) result = caseBackboneElement(substanceReferenceInformationGeneElement);
				if (result == null) result = caseElement(substanceReferenceInformationGeneElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET: {
				SubstanceReferenceInformationTarget substanceReferenceInformationTarget = (SubstanceReferenceInformationTarget)theEObject;
				T result = caseSubstanceReferenceInformationTarget(substanceReferenceInformationTarget);
				if (result == null) result = caseBackboneElement(substanceReferenceInformationTarget);
				if (result == null) result = caseElement(substanceReferenceInformationTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL: {
				SubstanceSourceMaterial substanceSourceMaterial = (SubstanceSourceMaterial)theEObject;
				T result = caseSubstanceSourceMaterial(substanceSourceMaterial);
				if (result == null) result = caseDomainResource(substanceSourceMaterial);
				if (result == null) result = caseResource(substanceSourceMaterial);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_AUTHOR: {
				SubstanceSourceMaterialAuthor substanceSourceMaterialAuthor = (SubstanceSourceMaterialAuthor)theEObject;
				T result = caseSubstanceSourceMaterialAuthor(substanceSourceMaterialAuthor);
				if (result == null) result = caseBackboneElement(substanceSourceMaterialAuthor);
				if (result == null) result = caseElement(substanceSourceMaterialAuthor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_FRACTION_DESCRIPTION: {
				SubstanceSourceMaterialFractionDescription substanceSourceMaterialFractionDescription = (SubstanceSourceMaterialFractionDescription)theEObject;
				T result = caseSubstanceSourceMaterialFractionDescription(substanceSourceMaterialFractionDescription);
				if (result == null) result = caseBackboneElement(substanceSourceMaterialFractionDescription);
				if (result == null) result = caseElement(substanceSourceMaterialFractionDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_HYBRID: {
				SubstanceSourceMaterialHybrid substanceSourceMaterialHybrid = (SubstanceSourceMaterialHybrid)theEObject;
				T result = caseSubstanceSourceMaterialHybrid(substanceSourceMaterialHybrid);
				if (result == null) result = caseBackboneElement(substanceSourceMaterialHybrid);
				if (result == null) result = caseElement(substanceSourceMaterialHybrid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM: {
				SubstanceSourceMaterialOrganism substanceSourceMaterialOrganism = (SubstanceSourceMaterialOrganism)theEObject;
				T result = caseSubstanceSourceMaterialOrganism(substanceSourceMaterialOrganism);
				if (result == null) result = caseBackboneElement(substanceSourceMaterialOrganism);
				if (result == null) result = caseElement(substanceSourceMaterialOrganism);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_GENERAL: {
				SubstanceSourceMaterialOrganismGeneral substanceSourceMaterialOrganismGeneral = (SubstanceSourceMaterialOrganismGeneral)theEObject;
				T result = caseSubstanceSourceMaterialOrganismGeneral(substanceSourceMaterialOrganismGeneral);
				if (result == null) result = caseBackboneElement(substanceSourceMaterialOrganismGeneral);
				if (result == null) result = caseElement(substanceSourceMaterialOrganismGeneral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSTANCE_SOURCE_MATERIAL_PART_DESCRIPTION: {
				SubstanceSourceMaterialPartDescription substanceSourceMaterialPartDescription = (SubstanceSourceMaterialPartDescription)theEObject;
				T result = caseSubstanceSourceMaterialPartDescription(substanceSourceMaterialPartDescription);
				if (result == null) result = caseBackboneElement(substanceSourceMaterialPartDescription);
				if (result == null) result = caseElement(substanceSourceMaterialPartDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSTANCE_SPECIFICATION: {
				SubstanceSpecification substanceSpecification = (SubstanceSpecification)theEObject;
				T result = caseSubstanceSpecification(substanceSpecification);
				if (result == null) result = caseDomainResource(substanceSpecification);
				if (result == null) result = caseResource(substanceSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSTANCE_SPECIFICATION_CODE: {
				SubstanceSpecificationCode substanceSpecificationCode = (SubstanceSpecificationCode)theEObject;
				T result = caseSubstanceSpecificationCode(substanceSpecificationCode);
				if (result == null) result = caseBackboneElement(substanceSpecificationCode);
				if (result == null) result = caseElement(substanceSpecificationCode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSTANCE_SPECIFICATION_ISOTOPE: {
				SubstanceSpecificationIsotope substanceSpecificationIsotope = (SubstanceSpecificationIsotope)theEObject;
				T result = caseSubstanceSpecificationIsotope(substanceSpecificationIsotope);
				if (result == null) result = caseBackboneElement(substanceSpecificationIsotope);
				if (result == null) result = caseElement(substanceSpecificationIsotope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSTANCE_SPECIFICATION_MOIETY: {
				SubstanceSpecificationMoiety substanceSpecificationMoiety = (SubstanceSpecificationMoiety)theEObject;
				T result = caseSubstanceSpecificationMoiety(substanceSpecificationMoiety);
				if (result == null) result = caseBackboneElement(substanceSpecificationMoiety);
				if (result == null) result = caseElement(substanceSpecificationMoiety);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSTANCE_SPECIFICATION_MOLECULAR_WEIGHT: {
				SubstanceSpecificationMolecularWeight substanceSpecificationMolecularWeight = (SubstanceSpecificationMolecularWeight)theEObject;
				T result = caseSubstanceSpecificationMolecularWeight(substanceSpecificationMolecularWeight);
				if (result == null) result = caseBackboneElement(substanceSpecificationMolecularWeight);
				if (result == null) result = caseElement(substanceSpecificationMolecularWeight);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSTANCE_SPECIFICATION_NAME: {
				SubstanceSpecificationName substanceSpecificationName = (SubstanceSpecificationName)theEObject;
				T result = caseSubstanceSpecificationName(substanceSpecificationName);
				if (result == null) result = caseBackboneElement(substanceSpecificationName);
				if (result == null) result = caseElement(substanceSpecificationName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSTANCE_SPECIFICATION_OFFICIAL: {
				SubstanceSpecificationOfficial substanceSpecificationOfficial = (SubstanceSpecificationOfficial)theEObject;
				T result = caseSubstanceSpecificationOfficial(substanceSpecificationOfficial);
				if (result == null) result = caseBackboneElement(substanceSpecificationOfficial);
				if (result == null) result = caseElement(substanceSpecificationOfficial);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY: {
				SubstanceSpecificationProperty substanceSpecificationProperty = (SubstanceSpecificationProperty)theEObject;
				T result = caseSubstanceSpecificationProperty(substanceSpecificationProperty);
				if (result == null) result = caseBackboneElement(substanceSpecificationProperty);
				if (result == null) result = caseElement(substanceSpecificationProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSTANCE_SPECIFICATION_RELATIONSHIP: {
				SubstanceSpecificationRelationship substanceSpecificationRelationship = (SubstanceSpecificationRelationship)theEObject;
				T result = caseSubstanceSpecificationRelationship(substanceSpecificationRelationship);
				if (result == null) result = caseBackboneElement(substanceSpecificationRelationship);
				if (result == null) result = caseElement(substanceSpecificationRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSTANCE_SPECIFICATION_REPRESENTATION: {
				SubstanceSpecificationRepresentation substanceSpecificationRepresentation = (SubstanceSpecificationRepresentation)theEObject;
				T result = caseSubstanceSpecificationRepresentation(substanceSpecificationRepresentation);
				if (result == null) result = caseBackboneElement(substanceSpecificationRepresentation);
				if (result == null) result = caseElement(substanceSpecificationRepresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUBSTANCE_SPECIFICATION_STRUCTURE: {
				SubstanceSpecificationStructure substanceSpecificationStructure = (SubstanceSpecificationStructure)theEObject;
				T result = caseSubstanceSpecificationStructure(substanceSpecificationStructure);
				if (result == null) result = caseBackboneElement(substanceSpecificationStructure);
				if (result == null) result = caseElement(substanceSpecificationStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUPPLY_DELIVERY: {
				SupplyDelivery supplyDelivery = (SupplyDelivery)theEObject;
				T result = caseSupplyDelivery(supplyDelivery);
				if (result == null) result = caseDomainResource(supplyDelivery);
				if (result == null) result = caseResource(supplyDelivery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUPPLY_DELIVERY_STATUS: {
				SupplyDeliveryStatus supplyDeliveryStatus = (SupplyDeliveryStatus)theEObject;
				T result = caseSupplyDeliveryStatus(supplyDeliveryStatus);
				if (result == null) result = caseElement(supplyDeliveryStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUPPLY_DELIVERY_SUPPLIED_ITEM: {
				SupplyDeliverySuppliedItem supplyDeliverySuppliedItem = (SupplyDeliverySuppliedItem)theEObject;
				T result = caseSupplyDeliverySuppliedItem(supplyDeliverySuppliedItem);
				if (result == null) result = caseBackboneElement(supplyDeliverySuppliedItem);
				if (result == null) result = caseElement(supplyDeliverySuppliedItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUPPLY_REQUEST: {
				SupplyRequest supplyRequest = (SupplyRequest)theEObject;
				T result = caseSupplyRequest(supplyRequest);
				if (result == null) result = caseDomainResource(supplyRequest);
				if (result == null) result = caseResource(supplyRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUPPLY_REQUEST_PARAMETER: {
				SupplyRequestParameter supplyRequestParameter = (SupplyRequestParameter)theEObject;
				T result = caseSupplyRequestParameter(supplyRequestParameter);
				if (result == null) result = caseBackboneElement(supplyRequestParameter);
				if (result == null) result = caseElement(supplyRequestParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SUPPLY_REQUEST_STATUS: {
				SupplyRequestStatus supplyRequestStatus = (SupplyRequestStatus)theEObject;
				T result = caseSupplyRequestStatus(supplyRequestStatus);
				if (result == null) result = caseElement(supplyRequestStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.SYSTEM_RESTFUL_INTERACTION: {
				SystemRestfulInteraction systemRestfulInteraction = (SystemRestfulInteraction)theEObject;
				T result = caseSystemRestfulInteraction(systemRestfulInteraction);
				if (result == null) result = caseElement(systemRestfulInteraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TASK: {
				Task task = (Task)theEObject;
				T result = caseTask(task);
				if (result == null) result = caseDomainResource(task);
				if (result == null) result = caseResource(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TASK_INPUT: {
				TaskInput taskInput = (TaskInput)theEObject;
				T result = caseTaskInput(taskInput);
				if (result == null) result = caseBackboneElement(taskInput);
				if (result == null) result = caseElement(taskInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TASK_INTENT: {
				TaskIntent taskIntent = (TaskIntent)theEObject;
				T result = caseTaskIntent(taskIntent);
				if (result == null) result = caseElement(taskIntent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TASK_OUTPUT: {
				TaskOutput taskOutput = (TaskOutput)theEObject;
				T result = caseTaskOutput(taskOutput);
				if (result == null) result = caseBackboneElement(taskOutput);
				if (result == null) result = caseElement(taskOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TASK_RESTRICTION: {
				TaskRestriction taskRestriction = (TaskRestriction)theEObject;
				T result = caseTaskRestriction(taskRestriction);
				if (result == null) result = caseBackboneElement(taskRestriction);
				if (result == null) result = caseElement(taskRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TASK_STATUS: {
				TaskStatus taskStatus = (TaskStatus)theEObject;
				T result = caseTaskStatus(taskStatus);
				if (result == null) result = caseElement(taskStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TERMINOLOGY_CAPABILITIES: {
				TerminologyCapabilities terminologyCapabilities = (TerminologyCapabilities)theEObject;
				T result = caseTerminologyCapabilities(terminologyCapabilities);
				if (result == null) result = caseDomainResource(terminologyCapabilities);
				if (result == null) result = caseResource(terminologyCapabilities);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TERMINOLOGY_CAPABILITIES_CLOSURE: {
				TerminologyCapabilitiesClosure terminologyCapabilitiesClosure = (TerminologyCapabilitiesClosure)theEObject;
				T result = caseTerminologyCapabilitiesClosure(terminologyCapabilitiesClosure);
				if (result == null) result = caseBackboneElement(terminologyCapabilitiesClosure);
				if (result == null) result = caseElement(terminologyCapabilitiesClosure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM: {
				TerminologyCapabilitiesCodeSystem terminologyCapabilitiesCodeSystem = (TerminologyCapabilitiesCodeSystem)theEObject;
				T result = caseTerminologyCapabilitiesCodeSystem(terminologyCapabilitiesCodeSystem);
				if (result == null) result = caseBackboneElement(terminologyCapabilitiesCodeSystem);
				if (result == null) result = caseElement(terminologyCapabilitiesCodeSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TERMINOLOGY_CAPABILITIES_EXPANSION: {
				TerminologyCapabilitiesExpansion terminologyCapabilitiesExpansion = (TerminologyCapabilitiesExpansion)theEObject;
				T result = caseTerminologyCapabilitiesExpansion(terminologyCapabilitiesExpansion);
				if (result == null) result = caseBackboneElement(terminologyCapabilitiesExpansion);
				if (result == null) result = caseElement(terminologyCapabilitiesExpansion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TERMINOLOGY_CAPABILITIES_FILTER: {
				TerminologyCapabilitiesFilter terminologyCapabilitiesFilter = (TerminologyCapabilitiesFilter)theEObject;
				T result = caseTerminologyCapabilitiesFilter(terminologyCapabilitiesFilter);
				if (result == null) result = caseBackboneElement(terminologyCapabilitiesFilter);
				if (result == null) result = caseElement(terminologyCapabilitiesFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TERMINOLOGY_CAPABILITIES_IMPLEMENTATION: {
				TerminologyCapabilitiesImplementation terminologyCapabilitiesImplementation = (TerminologyCapabilitiesImplementation)theEObject;
				T result = caseTerminologyCapabilitiesImplementation(terminologyCapabilitiesImplementation);
				if (result == null) result = caseBackboneElement(terminologyCapabilitiesImplementation);
				if (result == null) result = caseElement(terminologyCapabilitiesImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TERMINOLOGY_CAPABILITIES_PARAMETER: {
				TerminologyCapabilitiesParameter terminologyCapabilitiesParameter = (TerminologyCapabilitiesParameter)theEObject;
				T result = caseTerminologyCapabilitiesParameter(terminologyCapabilitiesParameter);
				if (result == null) result = caseBackboneElement(terminologyCapabilitiesParameter);
				if (result == null) result = caseElement(terminologyCapabilitiesParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TERMINOLOGY_CAPABILITIES_SOFTWARE: {
				TerminologyCapabilitiesSoftware terminologyCapabilitiesSoftware = (TerminologyCapabilitiesSoftware)theEObject;
				T result = caseTerminologyCapabilitiesSoftware(terminologyCapabilitiesSoftware);
				if (result == null) result = caseBackboneElement(terminologyCapabilitiesSoftware);
				if (result == null) result = caseElement(terminologyCapabilitiesSoftware);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TERMINOLOGY_CAPABILITIES_TRANSLATION: {
				TerminologyCapabilitiesTranslation terminologyCapabilitiesTranslation = (TerminologyCapabilitiesTranslation)theEObject;
				T result = caseTerminologyCapabilitiesTranslation(terminologyCapabilitiesTranslation);
				if (result == null) result = caseBackboneElement(terminologyCapabilitiesTranslation);
				if (result == null) result = caseElement(terminologyCapabilitiesTranslation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TERMINOLOGY_CAPABILITIES_VALIDATE_CODE: {
				TerminologyCapabilitiesValidateCode terminologyCapabilitiesValidateCode = (TerminologyCapabilitiesValidateCode)theEObject;
				T result = caseTerminologyCapabilitiesValidateCode(terminologyCapabilitiesValidateCode);
				if (result == null) result = caseBackboneElement(terminologyCapabilitiesValidateCode);
				if (result == null) result = caseElement(terminologyCapabilitiesValidateCode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TERMINOLOGY_CAPABILITIES_VERSION: {
				TerminologyCapabilitiesVersion terminologyCapabilitiesVersion = (TerminologyCapabilitiesVersion)theEObject;
				T result = caseTerminologyCapabilitiesVersion(terminologyCapabilitiesVersion);
				if (result == null) result = caseBackboneElement(terminologyCapabilitiesVersion);
				if (result == null) result = caseElement(terminologyCapabilitiesVersion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_REPORT: {
				TestReport testReport = (TestReport)theEObject;
				T result = caseTestReport(testReport);
				if (result == null) result = caseDomainResource(testReport);
				if (result == null) result = caseResource(testReport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_REPORT_ACTION: {
				TestReportAction testReportAction = (TestReportAction)theEObject;
				T result = caseTestReportAction(testReportAction);
				if (result == null) result = caseBackboneElement(testReportAction);
				if (result == null) result = caseElement(testReportAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_REPORT_ACTION1: {
				TestReportAction1 testReportAction1 = (TestReportAction1)theEObject;
				T result = caseTestReportAction1(testReportAction1);
				if (result == null) result = caseBackboneElement(testReportAction1);
				if (result == null) result = caseElement(testReportAction1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_REPORT_ACTION2: {
				TestReportAction2 testReportAction2 = (TestReportAction2)theEObject;
				T result = caseTestReportAction2(testReportAction2);
				if (result == null) result = caseBackboneElement(testReportAction2);
				if (result == null) result = caseElement(testReportAction2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_REPORT_ACTION_RESULT: {
				TestReportActionResult testReportActionResult = (TestReportActionResult)theEObject;
				T result = caseTestReportActionResult(testReportActionResult);
				if (result == null) result = caseElement(testReportActionResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_REPORT_ASSERT: {
				TestReportAssert testReportAssert = (TestReportAssert)theEObject;
				T result = caseTestReportAssert(testReportAssert);
				if (result == null) result = caseBackboneElement(testReportAssert);
				if (result == null) result = caseElement(testReportAssert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_REPORT_OPERATION: {
				TestReportOperation testReportOperation = (TestReportOperation)theEObject;
				T result = caseTestReportOperation(testReportOperation);
				if (result == null) result = caseBackboneElement(testReportOperation);
				if (result == null) result = caseElement(testReportOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_REPORT_PARTICIPANT: {
				TestReportParticipant testReportParticipant = (TestReportParticipant)theEObject;
				T result = caseTestReportParticipant(testReportParticipant);
				if (result == null) result = caseBackboneElement(testReportParticipant);
				if (result == null) result = caseElement(testReportParticipant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_REPORT_PARTICIPANT_TYPE: {
				TestReportParticipantType testReportParticipantType = (TestReportParticipantType)theEObject;
				T result = caseTestReportParticipantType(testReportParticipantType);
				if (result == null) result = caseElement(testReportParticipantType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_REPORT_RESULT: {
				TestReportResult testReportResult = (TestReportResult)theEObject;
				T result = caseTestReportResult(testReportResult);
				if (result == null) result = caseElement(testReportResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_REPORT_SETUP: {
				TestReportSetup testReportSetup = (TestReportSetup)theEObject;
				T result = caseTestReportSetup(testReportSetup);
				if (result == null) result = caseBackboneElement(testReportSetup);
				if (result == null) result = caseElement(testReportSetup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_REPORT_STATUS: {
				TestReportStatus testReportStatus = (TestReportStatus)theEObject;
				T result = caseTestReportStatus(testReportStatus);
				if (result == null) result = caseElement(testReportStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_REPORT_TEARDOWN: {
				TestReportTeardown testReportTeardown = (TestReportTeardown)theEObject;
				T result = caseTestReportTeardown(testReportTeardown);
				if (result == null) result = caseBackboneElement(testReportTeardown);
				if (result == null) result = caseElement(testReportTeardown);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_REPORT_TEST: {
				TestReportTest testReportTest = (TestReportTest)theEObject;
				T result = caseTestReportTest(testReportTest);
				if (result == null) result = caseBackboneElement(testReportTest);
				if (result == null) result = caseElement(testReportTest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_SCRIPT: {
				TestScript testScript = (TestScript)theEObject;
				T result = caseTestScript(testScript);
				if (result == null) result = caseDomainResource(testScript);
				if (result == null) result = caseResource(testScript);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_SCRIPT_ACTION: {
				TestScriptAction testScriptAction = (TestScriptAction)theEObject;
				T result = caseTestScriptAction(testScriptAction);
				if (result == null) result = caseBackboneElement(testScriptAction);
				if (result == null) result = caseElement(testScriptAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_SCRIPT_ACTION1: {
				TestScriptAction1 testScriptAction1 = (TestScriptAction1)theEObject;
				T result = caseTestScriptAction1(testScriptAction1);
				if (result == null) result = caseBackboneElement(testScriptAction1);
				if (result == null) result = caseElement(testScriptAction1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_SCRIPT_ACTION2: {
				TestScriptAction2 testScriptAction2 = (TestScriptAction2)theEObject;
				T result = caseTestScriptAction2(testScriptAction2);
				if (result == null) result = caseBackboneElement(testScriptAction2);
				if (result == null) result = caseElement(testScriptAction2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_SCRIPT_ASSERT: {
				TestScriptAssert testScriptAssert = (TestScriptAssert)theEObject;
				T result = caseTestScriptAssert(testScriptAssert);
				if (result == null) result = caseBackboneElement(testScriptAssert);
				if (result == null) result = caseElement(testScriptAssert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_SCRIPT_CAPABILITY: {
				TestScriptCapability testScriptCapability = (TestScriptCapability)theEObject;
				T result = caseTestScriptCapability(testScriptCapability);
				if (result == null) result = caseBackboneElement(testScriptCapability);
				if (result == null) result = caseElement(testScriptCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_SCRIPT_DESTINATION: {
				TestScriptDestination testScriptDestination = (TestScriptDestination)theEObject;
				T result = caseTestScriptDestination(testScriptDestination);
				if (result == null) result = caseBackboneElement(testScriptDestination);
				if (result == null) result = caseElement(testScriptDestination);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_SCRIPT_FIXTURE: {
				TestScriptFixture testScriptFixture = (TestScriptFixture)theEObject;
				T result = caseTestScriptFixture(testScriptFixture);
				if (result == null) result = caseBackboneElement(testScriptFixture);
				if (result == null) result = caseElement(testScriptFixture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_SCRIPT_LINK: {
				TestScriptLink testScriptLink = (TestScriptLink)theEObject;
				T result = caseTestScriptLink(testScriptLink);
				if (result == null) result = caseBackboneElement(testScriptLink);
				if (result == null) result = caseElement(testScriptLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_SCRIPT_METADATA: {
				TestScriptMetadata testScriptMetadata = (TestScriptMetadata)theEObject;
				T result = caseTestScriptMetadata(testScriptMetadata);
				if (result == null) result = caseBackboneElement(testScriptMetadata);
				if (result == null) result = caseElement(testScriptMetadata);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_SCRIPT_OPERATION: {
				TestScriptOperation testScriptOperation = (TestScriptOperation)theEObject;
				T result = caseTestScriptOperation(testScriptOperation);
				if (result == null) result = caseBackboneElement(testScriptOperation);
				if (result == null) result = caseElement(testScriptOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_SCRIPT_ORIGIN: {
				TestScriptOrigin testScriptOrigin = (TestScriptOrigin)theEObject;
				T result = caseTestScriptOrigin(testScriptOrigin);
				if (result == null) result = caseBackboneElement(testScriptOrigin);
				if (result == null) result = caseElement(testScriptOrigin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_SCRIPT_REQUEST_HEADER: {
				TestScriptRequestHeader testScriptRequestHeader = (TestScriptRequestHeader)theEObject;
				T result = caseTestScriptRequestHeader(testScriptRequestHeader);
				if (result == null) result = caseBackboneElement(testScriptRequestHeader);
				if (result == null) result = caseElement(testScriptRequestHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_SCRIPT_REQUEST_METHOD_CODE: {
				TestScriptRequestMethodCode testScriptRequestMethodCode = (TestScriptRequestMethodCode)theEObject;
				T result = caseTestScriptRequestMethodCode(testScriptRequestMethodCode);
				if (result == null) result = caseElement(testScriptRequestMethodCode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_SCRIPT_SETUP: {
				TestScriptSetup testScriptSetup = (TestScriptSetup)theEObject;
				T result = caseTestScriptSetup(testScriptSetup);
				if (result == null) result = caseBackboneElement(testScriptSetup);
				if (result == null) result = caseElement(testScriptSetup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_SCRIPT_TEARDOWN: {
				TestScriptTeardown testScriptTeardown = (TestScriptTeardown)theEObject;
				T result = caseTestScriptTeardown(testScriptTeardown);
				if (result == null) result = caseBackboneElement(testScriptTeardown);
				if (result == null) result = caseElement(testScriptTeardown);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_SCRIPT_TEST: {
				TestScriptTest testScriptTest = (TestScriptTest)theEObject;
				T result = caseTestScriptTest(testScriptTest);
				if (result == null) result = caseBackboneElement(testScriptTest);
				if (result == null) result = caseElement(testScriptTest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TEST_SCRIPT_VARIABLE: {
				TestScriptVariable testScriptVariable = (TestScriptVariable)theEObject;
				T result = caseTestScriptVariable(testScriptVariable);
				if (result == null) result = caseBackboneElement(testScriptVariable);
				if (result == null) result = caseElement(testScriptVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TIME: {
				Time time = (Time)theEObject;
				T result = caseTime(time);
				if (result == null) result = caseElement(time);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TIMING: {
				Timing timing = (Timing)theEObject;
				T result = caseTiming(timing);
				if (result == null) result = caseBackboneElement(timing);
				if (result == null) result = caseElement(timing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TIMING_REPEAT: {
				TimingRepeat timingRepeat = (TimingRepeat)theEObject;
				T result = caseTimingRepeat(timingRepeat);
				if (result == null) result = caseBackboneElement(timingRepeat);
				if (result == null) result = caseElement(timingRepeat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TRIGGER_DEFINITION: {
				TriggerDefinition triggerDefinition = (TriggerDefinition)theEObject;
				T result = caseTriggerDefinition(triggerDefinition);
				if (result == null) result = caseElement(triggerDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TRIGGER_TYPE: {
				TriggerType triggerType = (TriggerType)theEObject;
				T result = caseTriggerType(triggerType);
				if (result == null) result = caseElement(triggerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TYPE_DERIVATION_RULE: {
				TypeDerivationRule typeDerivationRule = (TypeDerivationRule)theEObject;
				T result = caseTypeDerivationRule(typeDerivationRule);
				if (result == null) result = caseElement(typeDerivationRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.TYPE_RESTFUL_INTERACTION: {
				TypeRestfulInteraction typeRestfulInteraction = (TypeRestfulInteraction)theEObject;
				T result = caseTypeRestfulInteraction(typeRestfulInteraction);
				if (result == null) result = caseElement(typeRestfulInteraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.UDI_ENTRY_TYPE: {
				UDIEntryType udiEntryType = (UDIEntryType)theEObject;
				T result = caseUDIEntryType(udiEntryType);
				if (result == null) result = caseElement(udiEntryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.UNITS_OF_TIME: {
				UnitsOfTime unitsOfTime = (UnitsOfTime)theEObject;
				T result = caseUnitsOfTime(unitsOfTime);
				if (result == null) result = caseElement(unitsOfTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.UNSIGNED_INT: {
				UnsignedInt unsignedInt = (UnsignedInt)theEObject;
				T result = caseUnsignedInt(unsignedInt);
				if (result == null) result = caseElement(unsignedInt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.URI: {
				Uri uri = (Uri)theEObject;
				T result = caseUri(uri);
				if (result == null) result = caseElement(uri);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.URL: {
				Url url = (Url)theEObject;
				T result = caseUrl(url);
				if (result == null) result = caseElement(url);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.USAGE_CONTEXT: {
				UsageContext usageContext = (UsageContext)theEObject;
				T result = caseUsageContext(usageContext);
				if (result == null) result = caseElement(usageContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.USE: {
				Use use = (Use)theEObject;
				T result = caseUse(use);
				if (result == null) result = caseElement(use);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.UUID: {
				Uuid uuid = (Uuid)theEObject;
				T result = caseUuid(uuid);
				if (result == null) result = caseElement(uuid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.VALUE_SET: {
				ValueSet valueSet = (ValueSet)theEObject;
				T result = caseValueSet(valueSet);
				if (result == null) result = caseDomainResource(valueSet);
				if (result == null) result = caseResource(valueSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.VALUE_SET_COMPOSE: {
				ValueSetCompose valueSetCompose = (ValueSetCompose)theEObject;
				T result = caseValueSetCompose(valueSetCompose);
				if (result == null) result = caseBackboneElement(valueSetCompose);
				if (result == null) result = caseElement(valueSetCompose);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.VALUE_SET_CONCEPT: {
				ValueSetConcept valueSetConcept = (ValueSetConcept)theEObject;
				T result = caseValueSetConcept(valueSetConcept);
				if (result == null) result = caseBackboneElement(valueSetConcept);
				if (result == null) result = caseElement(valueSetConcept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.VALUE_SET_CONTAINS: {
				ValueSetContains valueSetContains = (ValueSetContains)theEObject;
				T result = caseValueSetContains(valueSetContains);
				if (result == null) result = caseBackboneElement(valueSetContains);
				if (result == null) result = caseElement(valueSetContains);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.VALUE_SET_DESIGNATION: {
				ValueSetDesignation valueSetDesignation = (ValueSetDesignation)theEObject;
				T result = caseValueSetDesignation(valueSetDesignation);
				if (result == null) result = caseBackboneElement(valueSetDesignation);
				if (result == null) result = caseElement(valueSetDesignation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.VALUE_SET_EXPANSION: {
				ValueSetExpansion valueSetExpansion = (ValueSetExpansion)theEObject;
				T result = caseValueSetExpansion(valueSetExpansion);
				if (result == null) result = caseBackboneElement(valueSetExpansion);
				if (result == null) result = caseElement(valueSetExpansion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.VALUE_SET_FILTER: {
				ValueSetFilter valueSetFilter = (ValueSetFilter)theEObject;
				T result = caseValueSetFilter(valueSetFilter);
				if (result == null) result = caseBackboneElement(valueSetFilter);
				if (result == null) result = caseElement(valueSetFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.VALUE_SET_INCLUDE: {
				ValueSetInclude valueSetInclude = (ValueSetInclude)theEObject;
				T result = caseValueSetInclude(valueSetInclude);
				if (result == null) result = caseBackboneElement(valueSetInclude);
				if (result == null) result = caseElement(valueSetInclude);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.VALUE_SET_PARAMETER: {
				ValueSetParameter valueSetParameter = (ValueSetParameter)theEObject;
				T result = caseValueSetParameter(valueSetParameter);
				if (result == null) result = caseBackboneElement(valueSetParameter);
				if (result == null) result = caseElement(valueSetParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.VARIABLE_TYPE: {
				VariableType variableType = (VariableType)theEObject;
				T result = caseVariableType(variableType);
				if (result == null) result = caseElement(variableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.VCONFIDENTIALITY_CLASSIFICATION: {
				VConfidentialityClassification vConfidentialityClassification = (VConfidentialityClassification)theEObject;
				T result = caseVConfidentialityClassification(vConfidentialityClassification);
				if (result == null) result = caseElement(vConfidentialityClassification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.VERIFICATION_RESULT: {
				VerificationResult verificationResult = (VerificationResult)theEObject;
				T result = caseVerificationResult(verificationResult);
				if (result == null) result = caseDomainResource(verificationResult);
				if (result == null) result = caseResource(verificationResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.VERIFICATION_RESULT_ATTESTATION: {
				VerificationResultAttestation verificationResultAttestation = (VerificationResultAttestation)theEObject;
				T result = caseVerificationResultAttestation(verificationResultAttestation);
				if (result == null) result = caseBackboneElement(verificationResultAttestation);
				if (result == null) result = caseElement(verificationResultAttestation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.VERIFICATION_RESULT_PRIMARY_SOURCE: {
				VerificationResultPrimarySource verificationResultPrimarySource = (VerificationResultPrimarySource)theEObject;
				T result = caseVerificationResultPrimarySource(verificationResultPrimarySource);
				if (result == null) result = caseBackboneElement(verificationResultPrimarySource);
				if (result == null) result = caseElement(verificationResultPrimarySource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.VERIFICATION_RESULT_VALIDATOR: {
				VerificationResultValidator verificationResultValidator = (VerificationResultValidator)theEObject;
				T result = caseVerificationResultValidator(verificationResultValidator);
				if (result == null) result = caseBackboneElement(verificationResultValidator);
				if (result == null) result = caseElement(verificationResultValidator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.VISION_BASE: {
				VisionBase visionBase = (VisionBase)theEObject;
				T result = caseVisionBase(visionBase);
				if (result == null) result = caseElement(visionBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.VISION_EYES: {
				VisionEyes visionEyes = (VisionEyes)theEObject;
				T result = caseVisionEyes(visionEyes);
				if (result == null) result = caseElement(visionEyes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.VISION_PRESCRIPTION: {
				VisionPrescription visionPrescription = (VisionPrescription)theEObject;
				T result = caseVisionPrescription(visionPrescription);
				if (result == null) result = caseDomainResource(visionPrescription);
				if (result == null) result = caseResource(visionPrescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION: {
				VisionPrescriptionLensSpecification visionPrescriptionLensSpecification = (VisionPrescriptionLensSpecification)theEObject;
				T result = caseVisionPrescriptionLensSpecification(visionPrescriptionLensSpecification);
				if (result == null) result = caseBackboneElement(visionPrescriptionLensSpecification);
				if (result == null) result = caseElement(visionPrescriptionLensSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.VISION_PRESCRIPTION_PRISM: {
				VisionPrescriptionPrism visionPrescriptionPrism = (VisionPrescriptionPrism)theEObject;
				T result = caseVisionPrescriptionPrism(visionPrescriptionPrism);
				if (result == null) result = caseBackboneElement(visionPrescriptionPrism);
				if (result == null) result = caseElement(visionPrescriptionPrism);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirPackage.XPATH_USAGE_TYPE: {
				XPathUsageType xPathUsageType = (XPathUsageType)theEObject;
				T result = caseXPathUsageType(xPathUsageType);
				if (result == null) result = caseElement(xPathUsageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Account</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Account</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccount(Account object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Account Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Account Coverage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccountCoverage(AccountCoverage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Account Guarantor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Account Guarantor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccountGuarantor(AccountGuarantor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Account Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Account Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccountStatus(AccountStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Cardinality Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Cardinality Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionCardinalityBehavior(ActionCardinalityBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Condition Kind</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Condition Kind</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionConditionKind(ActionConditionKind object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Grouping Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Grouping Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionGroupingBehavior(ActionGroupingBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Participant Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Participant Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionParticipantType(ActionParticipantType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Precheck Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Precheck Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionPrecheckBehavior(ActionPrecheckBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Relationship Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Relationship Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionRelationshipType(ActionRelationshipType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Required Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Required Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionRequiredBehavior(ActionRequiredBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Selection Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Selection Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionSelectionBehavior(ActionSelectionBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityDefinition(ActivityDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Definition Dynamic Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Definition Dynamic Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityDefinitionDynamicValue(ActivityDefinitionDynamicValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Definition Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Definition Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityDefinitionParticipant(ActivityDefinitionParticipant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddress(Address object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressType(AddressType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressUse(AddressUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Administrative Gender</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Administrative Gender</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdministrativeGender(AdministrativeGender object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adverse Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adverse Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdverseEvent(AdverseEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adverse Event Actuality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adverse Event Actuality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdverseEventActuality(AdverseEventActuality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adverse Event Causality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adverse Event Causality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdverseEventCausality(AdverseEventCausality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adverse Event Suspect Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adverse Event Suspect Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdverseEventSuspectEntity(AdverseEventSuspectEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Age</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Age</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAge(Age object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregation Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregation Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregationMode(AggregationMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allergy Intolerance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergy Intolerance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergyIntolerance(AllergyIntolerance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allergy Intolerance Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergy Intolerance Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergyIntoleranceCategory(AllergyIntoleranceCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allergy Intolerance Criticality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergy Intolerance Criticality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergyIntoleranceCriticality(AllergyIntoleranceCriticality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allergy Intolerance Reaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergy Intolerance Reaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergyIntoleranceReaction(AllergyIntoleranceReaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allergy Intolerance Severity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergy Intolerance Severity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergyIntoleranceSeverity(AllergyIntoleranceSeverity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allergy Intolerance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergy Intolerance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergyIntoleranceType(AllergyIntoleranceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Appointment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Appointment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppointment(Appointment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Appointment Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Appointment Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppointmentParticipant(AppointmentParticipant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Appointment Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Appointment Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppointmentResponse(AppointmentResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Appointment Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Appointment Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppointmentStatus(AppointmentStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assertion Direction Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assertion Direction Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertionDirectionType(AssertionDirectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assertion Operator Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assertion Operator Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertionOperatorType(AssertionOperatorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assertion Response Types</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assertion Response Types</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertionResponseTypes(AssertionResponseTypes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachment(Attachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audit Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audit Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuditEvent(AuditEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audit Event Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audit Event Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuditEventAction(AuditEventAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audit Event Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audit Event Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuditEventAgent(AuditEventAgent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audit Event Agent Network Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audit Event Agent Network Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuditEventAgentNetworkType(AuditEventAgentNetworkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audit Event Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audit Event Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuditEventDetail(AuditEventDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audit Event Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audit Event Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuditEventEntity(AuditEventEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audit Event Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audit Event Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuditEventNetwork(AuditEventNetwork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audit Event Outcome</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audit Event Outcome</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuditEventOutcome(AuditEventOutcome object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audit Event Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audit Event Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuditEventSource(AuditEventSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Backbone Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Backbone Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBackboneElement(BackboneElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base64 Binary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base64 Binary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBase64Binary(Base64Binary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasic(Basic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinary(Binary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Strength</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Strength</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingStrength(BindingStrength object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Biologically Derived Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Biologically Derived Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBiologicallyDerivedProduct(BiologicallyDerivedProduct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Biologically Derived Product Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Biologically Derived Product Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBiologicallyDerivedProductCategory(BiologicallyDerivedProductCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Biologically Derived Product Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Biologically Derived Product Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBiologicallyDerivedProductCollection(BiologicallyDerivedProductCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Biologically Derived Product Manipulation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Biologically Derived Product Manipulation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBiologicallyDerivedProductManipulation(BiologicallyDerivedProductManipulation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Biologically Derived Product Processing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Biologically Derived Product Processing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBiologicallyDerivedProductProcessing(BiologicallyDerivedProductProcessing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Biologically Derived Product Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Biologically Derived Product Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBiologicallyDerivedProductStatus(BiologicallyDerivedProductStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Biologically Derived Product Storage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Biologically Derived Product Storage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBiologicallyDerivedProductStorage(BiologicallyDerivedProductStorage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Biologically Derived Product Storage Scale</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Biologically Derived Product Storage Scale</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBiologicallyDerivedProductStorageScale(BiologicallyDerivedProductStorageScale object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodyStructure(BodyStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean(org.hl7.fhir.Boolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundle(Bundle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleEntry(BundleEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleLink(BundleLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleRequest(BundleRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleResponse(BundleResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Search</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Search</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleSearch(BundleSearch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleType(BundleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Canonical</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Canonical</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCanonical(Canonical object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityStatement(CapabilityStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Statement Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Statement Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityStatementDocument(CapabilityStatementDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Statement Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Statement Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityStatementEndpoint(CapabilityStatementEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Statement Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Statement Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityStatementImplementation(CapabilityStatementImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Statement Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Statement Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityStatementInteraction(CapabilityStatementInteraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Statement Interaction1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Statement Interaction1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityStatementInteraction1(CapabilityStatementInteraction1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Statement Kind</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Statement Kind</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityStatementKind(CapabilityStatementKind object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Statement Messaging</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Statement Messaging</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityStatementMessaging(CapabilityStatementMessaging object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Statement Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Statement Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityStatementOperation(CapabilityStatementOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Statement Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Statement Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityStatementResource(CapabilityStatementResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Statement Rest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Statement Rest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityStatementRest(CapabilityStatementRest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Statement Search Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Statement Search Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityStatementSearchParam(CapabilityStatementSearchParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Statement Security</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Statement Security</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityStatementSecurity(CapabilityStatementSecurity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Statement Software</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Statement Software</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityStatementSoftware(CapabilityStatementSoftware object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Statement Supported Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Statement Supported Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityStatementSupportedMessage(CapabilityStatementSupportedMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Care Plan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Care Plan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarePlan(CarePlan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Care Plan Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Care Plan Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarePlanActivity(CarePlanActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Care Plan Activity Kind</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Care Plan Activity Kind</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarePlanActivityKind(CarePlanActivityKind object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Care Plan Activity Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Care Plan Activity Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarePlanActivityStatus(CarePlanActivityStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Care Plan Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Care Plan Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarePlanDetail(CarePlanDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Care Plan Intent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Care Plan Intent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarePlanIntent(CarePlanIntent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Care Team</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Care Team</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCareTeam(CareTeam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Care Team Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Care Team Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCareTeamParticipant(CareTeamParticipant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Care Team Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Care Team Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCareTeamStatus(CareTeamStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catalog Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catalog Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCatalogEntry(CatalogEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catalog Entry Related Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catalog Entry Related Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCatalogEntryRelatedEntry(CatalogEntryRelatedEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catalog Entry Relation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catalog Entry Relation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCatalogEntryRelationType(CatalogEntryRelationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Charge Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Charge Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChargeItem(ChargeItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Charge Item Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Charge Item Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChargeItemDefinition(ChargeItemDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Charge Item Definition Applicability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Charge Item Definition Applicability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChargeItemDefinitionApplicability(ChargeItemDefinitionApplicability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Charge Item Definition Price Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Charge Item Definition Price Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChargeItemDefinitionPriceComponent(ChargeItemDefinitionPriceComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Charge Item Definition Property Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Charge Item Definition Property Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChargeItemDefinitionPropertyGroup(ChargeItemDefinitionPropertyGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Charge Item Performer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Charge Item Performer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChargeItemPerformer(ChargeItemPerformer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Charge Item Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Charge Item Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChargeItemStatus(ChargeItemStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaim(Claim object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Accident</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Accident</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimAccident(ClaimAccident object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Care Team</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Care Team</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimCareTeam(ClaimCareTeam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimDetail(ClaimDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Diagnosis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Diagnosis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimDiagnosis(ClaimDiagnosis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Insurance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Insurance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimInsurance(ClaimInsurance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimItem(ClaimItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Payee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Payee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimPayee(ClaimPayee object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimProcedure(ClaimProcedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Processing Codes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Processing Codes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimProcessingCodes(ClaimProcessingCodes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Related</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Related</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimRelated(ClaimRelated object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponse(ClaimResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Add Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Add Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseAddItem(ClaimResponseAddItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Adjudication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Adjudication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseAdjudication(ClaimResponseAdjudication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseDetail(ClaimResponseDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Detail1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Detail1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseDetail1(ClaimResponseDetail1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Error</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Error</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseError(ClaimResponseError object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Insurance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Insurance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseInsurance(ClaimResponseInsurance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseItem(ClaimResponseItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Payment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Payment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponsePayment(ClaimResponsePayment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Process Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Process Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseProcessNote(ClaimResponseProcessNote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Sub Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Sub Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseSubDetail(ClaimResponseSubDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Sub Detail1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Sub Detail1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseSubDetail1(ClaimResponseSubDetail1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Total</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Total</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseTotal(ClaimResponseTotal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Sub Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Sub Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimSubDetail(ClaimSubDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Supporting Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Supporting Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimSupportingInfo(ClaimSupportingInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clinical Impression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clinical Impression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClinicalImpression(ClinicalImpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clinical Impression Finding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clinical Impression Finding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClinicalImpressionFinding(ClinicalImpressionFinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clinical Impression Investigation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clinical Impression Investigation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClinicalImpressionInvestigation(ClinicalImpressionInvestigation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clinical Impression Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clinical Impression Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClinicalImpressionStatus(ClinicalImpressionStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCode(Code object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Codeable Concept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Codeable Concept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeableConcept(CodeableConcept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Search Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Search Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSearchSupport(CodeSearchSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystem(CodeSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code System Concept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code System Concept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemConcept(CodeSystemConcept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code System Content Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code System Content Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemContentMode(CodeSystemContentMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code System Designation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code System Designation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemDesignation(CodeSystemDesignation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code System Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code System Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemFilter(CodeSystemFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code System Hierarchy Meaning</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code System Hierarchy Meaning</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemHierarchyMeaning(CodeSystemHierarchyMeaning object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code System Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code System Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemProperty(CodeSystemProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code System Property1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code System Property1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemProperty1(CodeSystemProperty1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoding(Coding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunication(Communication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Payload</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Payload</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationPayload(CommunicationPayload object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationRequest(CommunicationRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Request Payload</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Request Payload</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationRequestPayload(CommunicationRequestPayload object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compartment Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compartment Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompartmentDefinition(CompartmentDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compartment Definition Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compartment Definition Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompartmentDefinitionResource(CompartmentDefinitionResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compartment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compartment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompartmentType(CompartmentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposition(Composition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition Attestation Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition Attestation Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositionAttestationMode(CompositionAttestationMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition Attester</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition Attester</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositionAttester(CompositionAttester object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositionEvent(CompositionEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition Relates To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition Relates To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositionRelatesTo(CompositionRelatesTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositionSection(CompositionSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositionStatus(CompositionStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptMap(ConceptMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Map Depends On</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Map Depends On</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptMapDependsOn(ConceptMapDependsOn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Map Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Map Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptMapElement(ConceptMapElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Map Equivalence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Map Equivalence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptMapEquivalence(ConceptMapEquivalence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Map Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Map Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptMapGroup(ConceptMapGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Map Group Unmapped Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Map Group Unmapped Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptMapGroupUnmappedMode(ConceptMapGroupUnmappedMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Map Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Map Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptMapTarget(ConceptMapTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Map Unmapped</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Map Unmapped</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptMapUnmapped(ConceptMapUnmapped object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Delete Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Delete Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalDeleteStatus(ConditionalDeleteStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Read Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Read Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalReadStatus(ConditionalReadStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Evidence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionEvidence(ConditionEvidence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Stage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Stage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionStage(ConditionStage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsent(Consent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consent Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consent Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsentActor(ConsentActor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consent Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consent Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsentData(ConsentData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consent Data Meaning</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consent Data Meaning</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsentDataMeaning(ConsentDataMeaning object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consent Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consent Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsentPolicy(ConsentPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consent Provision</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consent Provision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsentProvision(ConsentProvision object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consent Provision Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consent Provision Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsentProvisionType(ConsentProvisionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consent State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consent State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsentState(ConsentState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consent Verification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consent Verification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsentVerification(ConsentVerification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Severity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Severity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintSeverity(ConstraintSeverity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contact Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContactDetail(ContactDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contact Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContactPoint(ContactPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contact Point System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact Point System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContactPointSystem(ContactPointSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contact Point Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact Point Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContactPointUse(ContactPointUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContract(Contract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractAction(ContractAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractAnswer(ContractAnswer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractAsset(ContractAsset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Content Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Content Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractContentDefinition(ContractContentDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractContext(ContractContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Friendly</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Friendly</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractFriendly(ContractFriendly object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Legal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Legal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractLegal(ContractLegal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Offer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Offer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractOffer(ContractOffer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Party</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Party</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractParty(ContractParty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Resource Publication Status Codes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Resource Publication Status Codes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractResourcePublicationStatusCodes(ContractResourcePublicationStatusCodes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Resource Status Codes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Resource Status Codes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractResourceStatusCodes(ContractResourceStatusCodes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractRule(ContractRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Security Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Security Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractSecurityLabel(ContractSecurityLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Signer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Signer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractSigner(ContractSigner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Subject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Subject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractSubject(ContractSubject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractTerm(ContractTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Valued Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Valued Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractValuedItem(ContractValuedItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contributor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contributor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContributor(Contributor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contributor Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contributor Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContributorType(ContributorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Count</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Count</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCount(Count object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coverage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoverage(Coverage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coverage Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coverage Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoverageClass(CoverageClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coverage Cost To Beneficiary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coverage Cost To Beneficiary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoverageCostToBeneficiary(CoverageCostToBeneficiary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coverage Eligibility Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coverage Eligibility Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoverageEligibilityRequest(CoverageEligibilityRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coverage Eligibility Request Diagnosis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coverage Eligibility Request Diagnosis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoverageEligibilityRequestDiagnosis(CoverageEligibilityRequestDiagnosis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coverage Eligibility Request Insurance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coverage Eligibility Request Insurance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoverageEligibilityRequestInsurance(CoverageEligibilityRequestInsurance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coverage Eligibility Request Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coverage Eligibility Request Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoverageEligibilityRequestItem(CoverageEligibilityRequestItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coverage Eligibility Request Supporting Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coverage Eligibility Request Supporting Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoverageEligibilityRequestSupportingInfo(CoverageEligibilityRequestSupportingInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coverage Eligibility Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coverage Eligibility Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoverageEligibilityResponse(CoverageEligibilityResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coverage Eligibility Response Benefit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coverage Eligibility Response Benefit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoverageEligibilityResponseBenefit(CoverageEligibilityResponseBenefit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coverage Eligibility Response Error</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coverage Eligibility Response Error</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoverageEligibilityResponseError(CoverageEligibilityResponseError object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coverage Eligibility Response Insurance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coverage Eligibility Response Insurance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoverageEligibilityResponseInsurance(CoverageEligibilityResponseInsurance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coverage Eligibility Response Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coverage Eligibility Response Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoverageEligibilityResponseItem(CoverageEligibilityResponseItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coverage Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coverage Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoverageException(CoverageException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRequirement(DataRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Requirement Code Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Requirement Code Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRequirementCodeFilter(DataRequirementCodeFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Requirement Date Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Requirement Date Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRequirementDateFilter(DataRequirementDateFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Requirement Sort</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Requirement Sort</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRequirementSort(DataRequirementSort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDate(Date object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTime(DateTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Days Of Week</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Days Of Week</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaysOfWeek(DaysOfWeek object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decimal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decimal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecimal(Decimal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Detected Issue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Detected Issue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDetectedIssue(DetectedIssue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Detected Issue Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Detected Issue Evidence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDetectedIssueEvidence(DetectedIssueEvidence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Detected Issue Mitigation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Detected Issue Mitigation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDetectedIssueMitigation(DetectedIssueMitigation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Detected Issue Severity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Detected Issue Severity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDetectedIssueSeverity(DetectedIssueSeverity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevice(Device object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceDefinition(DeviceDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Definition Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Definition Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceDefinitionCapability(DeviceDefinitionCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Definition Device Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Definition Device Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceDefinitionDeviceName(DeviceDefinitionDeviceName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Definition Material</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Definition Material</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceDefinitionMaterial(DeviceDefinitionMaterial object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Definition Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Definition Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceDefinitionProperty(DeviceDefinitionProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Definition Specialization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Definition Specialization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceDefinitionSpecialization(DeviceDefinitionSpecialization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Definition Udi Device Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Definition Udi Device Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceDefinitionUdiDeviceIdentifier(DeviceDefinitionUdiDeviceIdentifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Device Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Device Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceDeviceName(DeviceDeviceName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceMetric(DeviceMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Metric Calibration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Metric Calibration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceMetricCalibration(DeviceMetricCalibration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Metric Calibration State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Metric Calibration State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceMetricCalibrationState(DeviceMetricCalibrationState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Metric Calibration Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Metric Calibration Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceMetricCalibrationType(DeviceMetricCalibrationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Metric Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Metric Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceMetricCategory(DeviceMetricCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Metric Color</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Metric Color</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceMetricColor(DeviceMetricColor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Metric Operational Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Metric Operational Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceMetricOperationalStatus(DeviceMetricOperationalStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceNameType(DeviceNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceProperty(DeviceProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceRequest(DeviceRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Request Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Request Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceRequestParameter(DeviceRequestParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Specialization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Specialization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceSpecialization(DeviceSpecialization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Udi Carrier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Udi Carrier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceUdiCarrier(DeviceUdiCarrier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Use Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Use Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceUseStatement(DeviceUseStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Use Statement Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Use Statement Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceUseStatementStatus(DeviceUseStatementStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Version</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceVersion(DeviceVersion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagnostic Report</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagnostic Report</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagnosticReport(DiagnosticReport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagnostic Report Media</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagnostic Report Media</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagnosticReportMedia(DiagnosticReportMedia object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagnostic Report Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagnostic Report Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagnosticReportStatus(DiagnosticReportStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discriminator Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discriminator Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscriminatorType(DiscriminatorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDistance(Distance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Manifest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Manifest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentManifest(DocumentManifest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Manifest Related</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Manifest Related</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentManifestRelated(DocumentManifestRelated object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentMode(DocumentMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentReference(DocumentReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Reference Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Reference Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentReferenceContent(DocumentReferenceContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Reference Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Reference Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentReferenceContext(DocumentReferenceContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Reference Relates To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Reference Relates To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentReferenceRelatesTo(DocumentReferenceRelatesTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Reference Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Reference Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentReferenceStatus(DocumentReferenceStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Relationship Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Relationship Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRelationshipType(DocumentRelationshipType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainResource(DomainResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dosage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dosage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDosage(Dosage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dosage Dose And Rate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dosage Dose And Rate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDosageDoseAndRate(DosageDoseAndRate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDuration(Duration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Effect Evidence Synthesis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Effect Evidence Synthesis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEffectEvidenceSynthesis(EffectEvidenceSynthesis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Effect Evidence Synthesis Certainty</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Effect Evidence Synthesis Certainty</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEffectEvidenceSynthesisCertainty(EffectEvidenceSynthesisCertainty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Effect Evidence Synthesis Certainty Subcomponent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Effect Evidence Synthesis Certainty Subcomponent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEffectEvidenceSynthesisCertaintySubcomponent(EffectEvidenceSynthesisCertaintySubcomponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Effect Evidence Synthesis Effect Estimate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Effect Evidence Synthesis Effect Estimate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEffectEvidenceSynthesisEffectEstimate(EffectEvidenceSynthesisEffectEstimate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Effect Evidence Synthesis Precision Estimate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Effect Evidence Synthesis Precision Estimate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEffectEvidenceSynthesisPrecisionEstimate(EffectEvidenceSynthesisPrecisionEstimate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Effect Evidence Synthesis Results By Exposure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Effect Evidence Synthesis Results By Exposure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEffectEvidenceSynthesisResultsByExposure(EffectEvidenceSynthesisResultsByExposure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Effect Evidence Synthesis Sample Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Effect Evidence Synthesis Sample Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEffectEvidenceSynthesisSampleSize(EffectEvidenceSynthesisSampleSize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementDefinition(ElementDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Definition Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Definition Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementDefinitionBase(ElementDefinitionBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Definition Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Definition Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementDefinitionBinding(ElementDefinitionBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Definition Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Definition Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementDefinitionConstraint(ElementDefinitionConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Definition Discriminator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Definition Discriminator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementDefinitionDiscriminator(ElementDefinitionDiscriminator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Definition Example</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Definition Example</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementDefinitionExample(ElementDefinitionExample object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Definition Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Definition Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementDefinitionMapping(ElementDefinitionMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Definition Slicing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Definition Slicing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementDefinitionSlicing(ElementDefinitionSlicing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Definition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Definition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementDefinitionType(ElementDefinitionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eligibility Request Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eligibility Request Purpose</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEligibilityRequestPurpose(EligibilityRequestPurpose object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eligibility Response Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eligibility Response Purpose</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEligibilityResponsePurpose(EligibilityResponsePurpose object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enable When Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enable When Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnableWhenBehavior(EnableWhenBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounter(Encounter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounter Class History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter Class History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounterClassHistory(EncounterClassHistory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounter Diagnosis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter Diagnosis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounterDiagnosis(EncounterDiagnosis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounter Hospitalization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter Hospitalization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounterHospitalization(EncounterHospitalization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounter Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounterLocation(EncounterLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounter Location Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter Location Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounterLocationStatus(EncounterLocationStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounter Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounterParticipant(EncounterParticipant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounter Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounterStatus(EncounterStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounter Status History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter Status History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounterStatusHistory(EncounterStatusHistory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndpoint(Endpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Endpoint Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Endpoint Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndpointStatus(EndpointStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enrollment Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enrollment Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnrollmentRequest(EnrollmentRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enrollment Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enrollment Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnrollmentResponse(EnrollmentResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Episode Of Care</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Episode Of Care</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEpisodeOfCare(EpisodeOfCare object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Episode Of Care Diagnosis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Episode Of Care Diagnosis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEpisodeOfCareDiagnosis(EpisodeOfCareDiagnosis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Episode Of Care Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Episode Of Care Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEpisodeOfCareStatus(EpisodeOfCareStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Episode Of Care Status History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Episode Of Care Status History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEpisodeOfCareStatusHistory(EpisodeOfCareStatusHistory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Capability Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Capability Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventCapabilityMode(EventCapabilityMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventDefinition(EventDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventStatus(EventStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Timing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Timing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventTiming(EventTiming object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evidence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvidence(Evidence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evidence Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evidence Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvidenceVariable(EvidenceVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evidence Variable Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evidence Variable Characteristic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvidenceVariableCharacteristic(EvidenceVariableCharacteristic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evidence Variable Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evidence Variable Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvidenceVariableType(EvidenceVariableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Example Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Example Scenario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExampleScenario(ExampleScenario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Example Scenario Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Example Scenario Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExampleScenarioActor(ExampleScenarioActor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Example Scenario Actor Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Example Scenario Actor Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExampleScenarioActorType(ExampleScenarioActorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Example Scenario Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Example Scenario Alternative</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExampleScenarioAlternative(ExampleScenarioAlternative object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Example Scenario Contained Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Example Scenario Contained Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExampleScenarioContainedInstance(ExampleScenarioContainedInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Example Scenario Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Example Scenario Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExampleScenarioInstance(ExampleScenarioInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Example Scenario Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Example Scenario Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExampleScenarioOperation(ExampleScenarioOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Example Scenario Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Example Scenario Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExampleScenarioProcess(ExampleScenarioProcess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Example Scenario Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Example Scenario Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExampleScenarioStep(ExampleScenarioStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Example Scenario Version</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Example Scenario Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExampleScenarioVersion(ExampleScenarioVersion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefit(ExplanationOfBenefit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Accident</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Accident</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitAccident(ExplanationOfBenefitAccident object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Add Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Add Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitAddItem(ExplanationOfBenefitAddItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Adjudication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Adjudication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitAdjudication(ExplanationOfBenefitAdjudication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Benefit Balance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Benefit Balance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitBenefitBalance(ExplanationOfBenefitBenefitBalance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Care Team</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Care Team</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitCareTeam(ExplanationOfBenefitCareTeam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitDetail(ExplanationOfBenefitDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Detail1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Detail1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitDetail1(ExplanationOfBenefitDetail1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Diagnosis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Diagnosis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitDiagnosis(ExplanationOfBenefitDiagnosis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Financial</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Financial</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitFinancial(ExplanationOfBenefitFinancial object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Insurance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Insurance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitInsurance(ExplanationOfBenefitInsurance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitItem(ExplanationOfBenefitItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Payee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Payee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitPayee(ExplanationOfBenefitPayee object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Payment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Payment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitPayment(ExplanationOfBenefitPayment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitProcedure(ExplanationOfBenefitProcedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Process Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Process Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitProcessNote(ExplanationOfBenefitProcessNote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Related</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Related</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitRelated(ExplanationOfBenefitRelated object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitStatus(ExplanationOfBenefitStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Sub Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Sub Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitSubDetail(ExplanationOfBenefitSubDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Sub Detail1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Sub Detail1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitSubDetail1(ExplanationOfBenefitSubDetail1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Supporting Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Supporting Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitSupportingInfo(ExplanationOfBenefitSupportingInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Total</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Total</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitTotal(ExplanationOfBenefitTotal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exposure State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exposure State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExposureState(ExposureState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Language</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Language</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionLanguage(ExpressionLanguage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtension(Extension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension Context Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension Context Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionContextType(ExtensionContextType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Family History Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Family History Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFamilyHistoryStatus(FamilyHistoryStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Family Member History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Family Member History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFamilyMemberHistory(FamilyMemberHistory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Family Member History Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Family Member History Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFamilyMemberHistoryCondition(FamilyMemberHistoryCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FHIR Device Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FHIR Device Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFHIRDeviceStatus(FHIRDeviceStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FHIR Substance Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FHIR Substance Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFHIRSubstanceStatus(FHIRSubstanceStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FHIR Version</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FHIR Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFHIRVersion(FHIRVersion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterOperator(FilterOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Financial Resource Status Codes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Financial Resource Status Codes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinancialResourceStatusCodes(FinancialResourceStatusCodes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlag(Flag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flag Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flag Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlagStatus(FlagStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoal(Goal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal Lifecycle Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal Lifecycle Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoalLifecycleStatus(GoalLifecycleStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoalTarget(GoalTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph Compartment Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph Compartment Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphCompartmentRule(GraphCompartmentRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph Compartment Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph Compartment Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphCompartmentUse(GraphCompartmentUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphDefinition(GraphDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph Definition Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph Definition Compartment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphDefinitionCompartment(GraphDefinitionCompartment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph Definition Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph Definition Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphDefinitionLink(GraphDefinitionLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph Definition Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph Definition Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphDefinitionTarget(GraphDefinitionTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroup(Group object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Characteristic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupCharacteristic(GroupCharacteristic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupMeasure(GroupMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupMember(GroupMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupType(GroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guidance Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guidance Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuidanceResponse(GuidanceResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guidance Response Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guidance Response Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuidanceResponseStatus(GuidanceResponseStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guide Page Generation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guide Page Generation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuidePageGeneration(GuidePageGeneration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guide Parameter Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guide Parameter Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuideParameterCode(GuideParameterCode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Healthcare Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Healthcare Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHealthcareService(HealthcareService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Healthcare Service Available Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Healthcare Service Available Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHealthcareServiceAvailableTime(HealthcareServiceAvailableTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Healthcare Service Eligibility</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Healthcare Service Eligibility</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHealthcareServiceEligibility(HealthcareServiceEligibility object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Healthcare Service Not Available</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Healthcare Service Not Available</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHealthcareServiceNotAvailable(HealthcareServiceNotAvailable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HTTP Verb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HTTP Verb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHTTPVerb(HTTPVerb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Human Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Human Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHumanName(HumanName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseId(Id object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifierUse(IdentifierUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identity Assurance Level</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identity Assurance Level</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentityAssuranceLevel(IdentityAssuranceLevel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imaging Study</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imaging Study</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagingStudy(ImagingStudy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imaging Study Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imaging Study Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagingStudyInstance(ImagingStudyInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imaging Study Performer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imaging Study Performer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagingStudyPerformer(ImagingStudyPerformer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imaging Study Series</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imaging Study Series</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagingStudySeries(ImagingStudySeries object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imaging Study Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imaging Study Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagingStudyStatus(ImagingStudyStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunization(Immunization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunization Education</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization Education</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationEducation(ImmunizationEducation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunization Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization Evaluation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationEvaluation(ImmunizationEvaluation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunization Evaluation Status Codes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization Evaluation Status Codes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationEvaluationStatusCodes(ImmunizationEvaluationStatusCodes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunization Performer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization Performer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationPerformer(ImmunizationPerformer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunization Protocol Applied</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization Protocol Applied</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationProtocolApplied(ImmunizationProtocolApplied object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunization Reaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization Reaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationReaction(ImmunizationReaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunization Recommendation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization Recommendation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationRecommendation(ImmunizationRecommendation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunization Recommendation Date Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization Recommendation Date Criterion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationRecommendationDateCriterion(ImmunizationRecommendationDateCriterion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunization Recommendation Recommendation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization Recommendation Recommendation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationRecommendationRecommendation(ImmunizationRecommendationRecommendation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunization Status Codes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization Status Codes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationStatusCodes(ImmunizationStatusCodes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Guide</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Guide</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationGuide(ImplementationGuide object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Guide Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Guide Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationGuideDefinition(ImplementationGuideDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Guide Depends On</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Guide Depends On</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationGuideDependsOn(ImplementationGuideDependsOn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Guide Global</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Guide Global</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationGuideGlobal(ImplementationGuideGlobal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Guide Grouping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Guide Grouping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationGuideGrouping(ImplementationGuideGrouping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Guide Manifest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Guide Manifest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationGuideManifest(ImplementationGuideManifest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Guide Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Guide Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationGuidePage(ImplementationGuidePage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Guide Page1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Guide Page1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationGuidePage1(ImplementationGuidePage1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Guide Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Guide Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationGuideParameter(ImplementationGuideParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Guide Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Guide Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationGuideResource(ImplementationGuideResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Guide Resource1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Guide Resource1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationGuideResource1(ImplementationGuideResource1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Guide Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Guide Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationGuideTemplate(ImplementationGuideTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstant(Instant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insurance Plan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insurance Plan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsurancePlan(InsurancePlan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insurance Plan Benefit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insurance Plan Benefit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsurancePlanBenefit(InsurancePlanBenefit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insurance Plan Benefit1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insurance Plan Benefit1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsurancePlanBenefit1(InsurancePlanBenefit1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insurance Plan Contact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insurance Plan Contact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsurancePlanContact(InsurancePlanContact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insurance Plan Cost</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insurance Plan Cost</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsurancePlanCost(InsurancePlanCost object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insurance Plan Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insurance Plan Coverage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsurancePlanCoverage(InsurancePlanCoverage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insurance Plan General Cost</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insurance Plan General Cost</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsurancePlanGeneralCost(InsurancePlanGeneralCost object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insurance Plan Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insurance Plan Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsurancePlanLimit(InsurancePlanLimit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insurance Plan Plan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insurance Plan Plan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsurancePlanPlan(InsurancePlanPlan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insurance Plan Specific Cost</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insurance Plan Specific Cost</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsurancePlanSpecificCost(InsurancePlanSpecificCost object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger(org.hl7.fhir.Integer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invoice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invoice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvoice(Invoice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invoice Line Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invoice Line Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvoiceLineItem(InvoiceLineItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invoice Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invoice Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvoiceParticipant(InvoiceParticipant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invoice Price Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invoice Price Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvoicePriceComponent(InvoicePriceComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invoice Price Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invoice Price Component Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvoicePriceComponentType(InvoicePriceComponentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invoice Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invoice Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvoiceStatus(InvoiceStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Issue Severity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Issue Severity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIssueSeverity(IssueSeverity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Issue Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Issue Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIssueType(IssueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibrary(Library object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linkage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linkage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkage(Linkage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linkage Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linkage Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkageItem(LinkageItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linkage Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linkage Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkageType(LinkageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkType(LinkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseList(List object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListEntry(ListEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListMode(ListMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListStatus(ListStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation(Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Hours Of Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Hours Of Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationHoursOfOperation(LocationHoursOfOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationMode(LocationMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationPosition(LocationPosition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationStatus(LocationStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Markdown</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Markdown</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkdown(Markdown object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marketing Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marketing Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarketingStatus(MarketingStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasure(Measure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureComponent(MeasureComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureGroup(MeasureGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Population</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Population</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurePopulation(MeasurePopulation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Report</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Report</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureReport(MeasureReport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Report Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Report Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureReportComponent(MeasureReportComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Report Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Report Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureReportGroup(MeasureReportGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Report Population</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Report Population</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureReportPopulation(MeasureReportPopulation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Report Population1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Report Population1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureReportPopulation1(MeasureReportPopulation1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Report Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Report Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureReportStatus(MeasureReportStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Report Stratifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Report Stratifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureReportStratifier(MeasureReportStratifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Report Stratum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Report Stratum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureReportStratum(MeasureReportStratum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Report Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Report Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureReportType(MeasureReportType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Stratifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Stratifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureStratifier(MeasureStratifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Supplemental Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Supplemental Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureSupplementalData(MeasureSupplementalData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Media</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Media</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedia(Media object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedication(Medication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Administration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Administration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationAdministration(MedicationAdministration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Administration Dosage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Administration Dosage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationAdministrationDosage(MedicationAdministrationDosage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Administration Performer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Administration Performer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationAdministrationPerformer(MedicationAdministrationPerformer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Batch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Batch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationBatch(MedicationBatch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Dispense</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Dispense</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationDispense(MedicationDispense object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Dispense Performer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Dispense Performer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationDispensePerformer(MedicationDispensePerformer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Dispense Substitution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Dispense Substitution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationDispenseSubstitution(MedicationDispenseSubstitution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Ingredient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Ingredient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationIngredient(MedicationIngredient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Knowledge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Knowledge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationKnowledge(MedicationKnowledge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Knowledge Administration Guidelines</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Knowledge Administration Guidelines</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationKnowledgeAdministrationGuidelines(MedicationKnowledgeAdministrationGuidelines object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Knowledge Cost</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Knowledge Cost</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationKnowledgeCost(MedicationKnowledgeCost object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Knowledge Dosage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Knowledge Dosage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationKnowledgeDosage(MedicationKnowledgeDosage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Knowledge Drug Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Knowledge Drug Characteristic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationKnowledgeDrugCharacteristic(MedicationKnowledgeDrugCharacteristic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Knowledge Ingredient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Knowledge Ingredient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationKnowledgeIngredient(MedicationKnowledgeIngredient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Knowledge Kinetics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Knowledge Kinetics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationKnowledgeKinetics(MedicationKnowledgeKinetics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Knowledge Max Dispense</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Knowledge Max Dispense</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationKnowledgeMaxDispense(MedicationKnowledgeMaxDispense object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Knowledge Medicine Classification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Knowledge Medicine Classification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationKnowledgeMedicineClassification(MedicationKnowledgeMedicineClassification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Knowledge Monitoring Program</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Knowledge Monitoring Program</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationKnowledgeMonitoringProgram(MedicationKnowledgeMonitoringProgram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Knowledge Monograph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Knowledge Monograph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationKnowledgeMonograph(MedicationKnowledgeMonograph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Knowledge Packaging</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Knowledge Packaging</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationKnowledgePackaging(MedicationKnowledgePackaging object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Knowledge Patient Characteristics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Knowledge Patient Characteristics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationKnowledgePatientCharacteristics(MedicationKnowledgePatientCharacteristics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Knowledge Regulatory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Knowledge Regulatory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationKnowledgeRegulatory(MedicationKnowledgeRegulatory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Knowledge Related Medication Knowledge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Knowledge Related Medication Knowledge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationKnowledgeRelatedMedicationKnowledge(MedicationKnowledgeRelatedMedicationKnowledge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Knowledge Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Knowledge Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationKnowledgeSchedule(MedicationKnowledgeSchedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Knowledge Substitution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Knowledge Substitution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationKnowledgeSubstitution(MedicationKnowledgeSubstitution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationRequest(MedicationRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Request Dispense Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Request Dispense Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationRequestDispenseRequest(MedicationRequestDispenseRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Request Initial Fill</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Request Initial Fill</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationRequestInitialFill(MedicationRequestInitialFill object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Request Intent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Request Intent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationRequestIntent(MedicationRequestIntent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicationrequest Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicationrequest Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationrequestStatus(MedicationrequestStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Request Substitution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Request Substitution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationRequestSubstitution(MedicationRequestSubstitution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationStatement(MedicationStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Status Codes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Status Codes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationStatusCodes(MedicationStatusCodes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProduct(MedicinalProduct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Authorization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Authorization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductAuthorization(MedicinalProductAuthorization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Authorization Jurisdictional Authorization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Authorization Jurisdictional Authorization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductAuthorizationJurisdictionalAuthorization(MedicinalProductAuthorizationJurisdictionalAuthorization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Authorization Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Authorization Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductAuthorizationProcedure(MedicinalProductAuthorizationProcedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Contraindication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Contraindication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductContraindication(MedicinalProductContraindication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Contraindication Other Therapy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Contraindication Other Therapy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductContraindicationOtherTherapy(MedicinalProductContraindicationOtherTherapy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Country Language</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Country Language</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductCountryLanguage(MedicinalProductCountryLanguage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Indication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Indication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductIndication(MedicinalProductIndication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Indication Other Therapy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Indication Other Therapy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductIndicationOtherTherapy(MedicinalProductIndicationOtherTherapy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Ingredient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Ingredient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductIngredient(MedicinalProductIngredient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Ingredient Reference Strength</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Ingredient Reference Strength</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductIngredientReferenceStrength(MedicinalProductIngredientReferenceStrength object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Ingredient Specified Substance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Ingredient Specified Substance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductIngredientSpecifiedSubstance(MedicinalProductIngredientSpecifiedSubstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Ingredient Strength</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Ingredient Strength</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductIngredientStrength(MedicinalProductIngredientStrength object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Ingredient Substance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Ingredient Substance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductIngredientSubstance(MedicinalProductIngredientSubstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductInteraction(MedicinalProductInteraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Interaction Interactant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Interaction Interactant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductInteractionInteractant(MedicinalProductInteractionInteractant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Manufactured</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Manufactured</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductManufactured(MedicinalProductManufactured object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Manufacturing Business Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Manufacturing Business Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductManufacturingBusinessOperation(MedicinalProductManufacturingBusinessOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductName(MedicinalProductName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Name Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Name Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductNamePart(MedicinalProductNamePart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Packaged</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Packaged</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductPackaged(MedicinalProductPackaged object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Packaged Batch Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Packaged Batch Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductPackagedBatchIdentifier(MedicinalProductPackagedBatchIdentifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Packaged Package Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Packaged Package Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductPackagedPackageItem(MedicinalProductPackagedPackageItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Pharmaceutical</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Pharmaceutical</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductPharmaceutical(MedicinalProductPharmaceutical object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Pharmaceutical Characteristics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Pharmaceutical Characteristics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductPharmaceuticalCharacteristics(MedicinalProductPharmaceuticalCharacteristics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Pharmaceutical Route Of Administration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Pharmaceutical Route Of Administration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductPharmaceuticalRouteOfAdministration(MedicinalProductPharmaceuticalRouteOfAdministration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Pharmaceutical Target Species</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Pharmaceutical Target Species</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductPharmaceuticalTargetSpecies(MedicinalProductPharmaceuticalTargetSpecies object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Pharmaceutical Withdrawal Period</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Pharmaceutical Withdrawal Period</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductPharmaceuticalWithdrawalPeriod(MedicinalProductPharmaceuticalWithdrawalPeriod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Special Designation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Special Designation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductSpecialDesignation(MedicinalProductSpecialDesignation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Undesirable Effect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Undesirable Effect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductUndesirableEffect(MedicinalProductUndesirableEffect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageDefinition(MessageDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Definition Allowed Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Definition Allowed Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageDefinitionAllowedResponse(MessageDefinitionAllowedResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Definition Focus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Definition Focus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageDefinitionFocus(MessageDefinitionFocus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageHeader(MessageHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Header Destination</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Header Destination</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageHeaderDestination(MessageHeaderDestination object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Header Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Header Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageHeaderResponse(MessageHeaderResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Messageheader Response Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Messageheader Response Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageheaderResponseRequest(MessageheaderResponseRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Header Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Header Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageHeaderSource(MessageHeaderSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Significance Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Significance Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageSignificanceCategory(MessageSignificanceCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeta(Meta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molecular Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molecular Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolecularSequence(MolecularSequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molecular Sequence Inner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molecular Sequence Inner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolecularSequenceInner(MolecularSequenceInner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molecular Sequence Outer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molecular Sequence Outer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolecularSequenceOuter(MolecularSequenceOuter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molecular Sequence Quality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molecular Sequence Quality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolecularSequenceQuality(MolecularSequenceQuality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molecular Sequence Reference Seq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molecular Sequence Reference Seq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolecularSequenceReferenceSeq(MolecularSequenceReferenceSeq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molecular Sequence Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molecular Sequence Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolecularSequenceRepository(MolecularSequenceRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molecular Sequence Roc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molecular Sequence Roc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolecularSequenceRoc(MolecularSequenceRoc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molecular Sequence Structure Variant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molecular Sequence Structure Variant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolecularSequenceStructureVariant(MolecularSequenceStructureVariant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molecular Sequence Variant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molecular Sequence Variant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolecularSequenceVariant(MolecularSequenceVariant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Money</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Money</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoney(Money object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameUse(NameUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Naming System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Naming System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamingSystem(NamingSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Naming System Identifier Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Naming System Identifier Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamingSystemIdentifierType(NamingSystemIdentifierType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Naming System Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Naming System Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamingSystemType(NamingSystemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Naming System Unique Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Naming System Unique Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamingSystemUniqueId(NamingSystemUniqueId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Narrative</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Narrative</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNarrative(Narrative object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Narrative Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Narrative Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNarrativeStatus(NarrativeStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Note Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Note Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoteType(NoteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nutrition Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nutrition Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNutritionOrder(NutritionOrder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nutrition Order Administration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nutrition Order Administration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNutritionOrderAdministration(NutritionOrderAdministration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nutrition Order Enteral Formula</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nutrition Order Enteral Formula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNutritionOrderEnteralFormula(NutritionOrderEnteralFormula object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nutrition Order Nutrient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nutrition Order Nutrient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNutritionOrderNutrient(NutritionOrderNutrient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nutrition Order Oral Diet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nutrition Order Oral Diet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNutritionOrderOralDiet(NutritionOrderOralDiet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nutrition Order Supplement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nutrition Order Supplement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNutritionOrderSupplement(NutritionOrderSupplement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nutrition Order Texture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nutrition Order Texture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNutritionOrderTexture(NutritionOrderTexture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservation(Observation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observation Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observation Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservationComponent(ObservationComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observation Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observation Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservationDataType(ObservationDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observation Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observation Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservationDefinition(ObservationDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observation Definition Qualified Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observation Definition Qualified Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservationDefinitionQualifiedInterval(ObservationDefinitionQualifiedInterval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observation Definition Quantitative Details</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observation Definition Quantitative Details</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservationDefinitionQuantitativeDetails(ObservationDefinitionQuantitativeDetails object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observation Range Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observation Range Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservationRangeCategory(ObservationRangeCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observation Reference Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observation Reference Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservationReferenceRange(ObservationReferenceRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observation Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observation Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservationStatus(ObservationStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOid(Oid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationDefinition(OperationDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Definition Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Definition Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationDefinitionBinding(OperationDefinitionBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Definition Overload</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Definition Overload</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationDefinitionOverload(OperationDefinitionOverload object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Definition Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Definition Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationDefinitionParameter(OperationDefinitionParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Definition Referenced From</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Definition Referenced From</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationDefinitionReferencedFrom(OperationDefinitionReferencedFrom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Kind</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Kind</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationKind(OperationKind object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Outcome</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Outcome</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationOutcome(OperationOutcome object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Outcome Issue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Outcome Issue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationOutcomeIssue(OperationOutcomeIssue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Parameter Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Parameter Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationParameterUse(OperationParameterUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganization(Organization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organization Affiliation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organization Affiliation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganizationAffiliation(OrganizationAffiliation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organization Contact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organization Contact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganizationContact(OrganizationContact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orientation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orientation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrientationType(OrientationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterDefinition(ParameterDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameters(Parameters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameters Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameters Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParametersParameter(ParametersParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participant Required</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant Required</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipantRequired(ParticipantRequired object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participation Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participation Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipationStatus(ParticipationStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatient(Patient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient Communication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient Communication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatientCommunication(PatientCommunication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient Contact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient Contact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatientContact(PatientContact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatientLink(PatientLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payment Notice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payment Notice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaymentNotice(PaymentNotice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payment Reconciliation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payment Reconciliation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaymentReconciliation(PaymentReconciliation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payment Reconciliation Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payment Reconciliation Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaymentReconciliationDetail(PaymentReconciliationDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payment Reconciliation Process Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payment Reconciliation Process Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaymentReconciliationProcessNote(PaymentReconciliationProcessNote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Period</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Period</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePeriod(Period object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerson(Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonLink(PersonLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanDefinition(PlanDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Definition Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Definition Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanDefinitionAction(PlanDefinitionAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Definition Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Definition Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanDefinitionCondition(PlanDefinitionCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Definition Dynamic Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Definition Dynamic Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanDefinitionDynamicValue(PlanDefinitionDynamicValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Definition Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Definition Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanDefinitionGoal(PlanDefinitionGoal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Definition Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Definition Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanDefinitionParticipant(PlanDefinitionParticipant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Definition Related Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Definition Related Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanDefinitionRelatedAction(PlanDefinitionRelatedAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Definition Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Definition Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanDefinitionTarget(PlanDefinitionTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Population</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Population</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePopulation(Population object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positive Int</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positive Int</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositiveInt(PositiveInt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Practitioner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Practitioner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePractitioner(Practitioner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Practitioner Qualification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Practitioner Qualification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePractitionerQualification(PractitionerQualification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Practitioner Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Practitioner Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePractitionerRole(PractitionerRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Practitioner Role Available Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Practitioner Role Available Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePractitionerRoleAvailableTime(PractitionerRoleAvailableTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Practitioner Role Not Available</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Practitioner Role Not Available</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePractitionerRoleNotAvailable(PractitionerRoleNotAvailable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedure(Procedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Focal Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Focal Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureFocalDevice(ProcedureFocalDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Performer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Performer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedurePerformer(ProcedurePerformer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prod Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prod Characteristic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProdCharacteristic(ProdCharacteristic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Shelf Life</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Shelf Life</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductShelfLife(ProductShelfLife object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Representation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Representation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyRepresentation(PropertyRepresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyType(PropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provenance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provenance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvenance(Provenance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provenance Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provenance Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvenanceAgent(ProvenanceAgent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provenance Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provenance Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvenanceEntity(ProvenanceEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provenance Entity Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provenance Entity Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvenanceEntityRole(ProvenanceEntityRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publication Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publication Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublicationStatus(PublicationStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quality Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quality Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualityType(QualityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantity(Quantity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantity Comparator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantity Comparator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantityComparator(QuantityComparator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionnaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionnaire(Questionnaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionnaire Answer Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnaire Answer Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionnaireAnswerOption(QuestionnaireAnswerOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionnaire Enable When</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnaire Enable When</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionnaireEnableWhen(QuestionnaireEnableWhen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionnaire Initial</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnaire Initial</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionnaireInitial(QuestionnaireInitial object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionnaire Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnaire Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionnaireItem(QuestionnaireItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionnaire Item Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnaire Item Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionnaireItemOperator(QuestionnaireItemOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionnaire Item Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnaire Item Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionnaireItemType(QuestionnaireItemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionnaire Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnaire Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionnaireResponse(QuestionnaireResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionnaire Response Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnaire Response Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionnaireResponseAnswer(QuestionnaireResponseAnswer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionnaire Response Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnaire Response Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionnaireResponseItem(QuestionnaireResponseItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionnaire Response Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnaire Response Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionnaireResponseStatus(QuestionnaireResponseStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRange(Range object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ratio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ratio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRatio(Ratio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Handling Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Handling Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceHandlingPolicy(ReferenceHandlingPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Version Rules</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Version Rules</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceVersionRules(ReferenceVersionRules object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Related Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Related Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelatedArtifact(RelatedArtifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Related Artifact Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Related Artifact Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelatedArtifactType(RelatedArtifactType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Related Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Related Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelatedPerson(RelatedPerson object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Related Person Communication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Related Person Communication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelatedPersonCommunication(RelatedPersonCommunication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remittance Outcome</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remittance Outcome</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemittanceOutcome(RemittanceOutcome object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repository Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repository Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepositoryType(RepositoryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestGroup(RequestGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Group Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Group Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestGroupAction(RequestGroupAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Group Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Group Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestGroupCondition(RequestGroupCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Group Related Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Group Related Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestGroupRelatedAction(RequestGroupRelatedAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Intent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Intent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestIntent(RequestIntent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Priority</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Priority</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestPriority(RequestPriority object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Resource Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestResourceType(RequestResourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestStatus(RequestStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Research Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Research Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResearchDefinition(ResearchDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Research Element Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Research Element Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResearchElementDefinition(ResearchElementDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Research Element Definition Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Research Element Definition Characteristic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResearchElementDefinitionCharacteristic(ResearchElementDefinitionCharacteristic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Research Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Research Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResearchElementType(ResearchElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Research Study</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Research Study</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResearchStudy(ResearchStudy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Research Study Arm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Research Study Arm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResearchStudyArm(ResearchStudyArm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Research Study Objective</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Research Study Objective</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResearchStudyObjective(ResearchStudyObjective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Research Study Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Research Study Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResearchStudyStatus(ResearchStudyStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Research Subject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Research Subject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResearchSubject(ResearchSubject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Research Subject Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Research Subject Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResearchSubjectStatus(ResearchSubjectStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceContainer(ResourceContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceType(ResourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Version Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Version Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceVersionPolicy(ResourceVersionPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseType(ResponseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Restful Capability Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Restful Capability Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestfulCapabilityMode(RestfulCapabilityMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Risk Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Risk Assessment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRiskAssessment(RiskAssessment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Risk Assessment Prediction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Risk Assessment Prediction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRiskAssessmentPrediction(RiskAssessmentPrediction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Risk Evidence Synthesis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Risk Evidence Synthesis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRiskEvidenceSynthesis(RiskEvidenceSynthesis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Risk Evidence Synthesis Certainty</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Risk Evidence Synthesis Certainty</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRiskEvidenceSynthesisCertainty(RiskEvidenceSynthesisCertainty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Risk Evidence Synthesis Certainty Subcomponent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Risk Evidence Synthesis Certainty Subcomponent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRiskEvidenceSynthesisCertaintySubcomponent(RiskEvidenceSynthesisCertaintySubcomponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Risk Evidence Synthesis Precision Estimate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Risk Evidence Synthesis Precision Estimate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRiskEvidenceSynthesisPrecisionEstimate(RiskEvidenceSynthesisPrecisionEstimate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Risk Evidence Synthesis Risk Estimate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Risk Evidence Synthesis Risk Estimate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRiskEvidenceSynthesisRiskEstimate(RiskEvidenceSynthesisRiskEstimate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Risk Evidence Synthesis Sample Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Risk Evidence Synthesis Sample Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRiskEvidenceSynthesisSampleSize(RiskEvidenceSynthesisSampleSize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sampled Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sampled Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSampledData(SampledData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sampled Data Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sampled Data Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSampledDataDataType(SampledDataDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchedule(Schedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Search Comparator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search Comparator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSearchComparator(SearchComparator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Search Entry Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search Entry Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSearchEntryMode(SearchEntryMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Search Modifier Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search Modifier Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSearchModifierCode(SearchModifierCode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Search Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSearchParameter(SearchParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Search Parameter Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search Parameter Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSearchParameterComponent(SearchParameterComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Search Param Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search Param Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSearchParamType(SearchParamType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceType(SequenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceRequest(ServiceRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignature(Signature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slicing Rules</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slicing Rules</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlicingRules(SlicingRules object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlot(Slot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slot Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slot Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlotStatus(SlotStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sort Direction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sort Direction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSortDirection(SortDirection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SPDX License</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SPDX License</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSPDXLicense(SPDXLicense object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specimen</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specimen</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecimen(Specimen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specimen Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specimen Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecimenCollection(SpecimenCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specimen Contained Preference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specimen Contained Preference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecimenContainedPreference(SpecimenContainedPreference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specimen Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specimen Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecimenContainer(SpecimenContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specimen Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specimen Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecimenDefinition(SpecimenDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specimen Definition Additive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specimen Definition Additive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecimenDefinitionAdditive(SpecimenDefinitionAdditive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specimen Definition Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specimen Definition Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecimenDefinitionContainer(SpecimenDefinitionContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specimen Definition Handling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specimen Definition Handling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecimenDefinitionHandling(SpecimenDefinitionHandling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specimen Definition Type Tested</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specimen Definition Type Tested</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecimenDefinitionTypeTested(SpecimenDefinitionTypeTested object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specimen Processing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specimen Processing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecimenProcessing(SpecimenProcessing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specimen Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specimen Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecimenStatus(SpecimenStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatus(Status object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strand Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strand Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrandType(StrandType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString(org.hl7.fhir.String object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureDefinition(StructureDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Definition Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Definition Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureDefinitionContext(StructureDefinitionContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Definition Differential</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Definition Differential</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureDefinitionDifferential(StructureDefinitionDifferential object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Definition Kind</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Definition Kind</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureDefinitionKind(StructureDefinitionKind object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Definition Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Definition Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureDefinitionMapping(StructureDefinitionMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Definition Snapshot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Definition Snapshot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureDefinitionSnapshot(StructureDefinitionSnapshot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureMap(StructureMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Map Context Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Map Context Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureMapContextType(StructureMapContextType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Map Dependent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Map Dependent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureMapDependent(StructureMapDependent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Map Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Map Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureMapGroup(StructureMapGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Map Group Type Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Map Group Type Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureMapGroupTypeMode(StructureMapGroupTypeMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Map Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Map Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureMapInput(StructureMapInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Map Input Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Map Input Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureMapInputMode(StructureMapInputMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Map Model Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Map Model Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureMapModelMode(StructureMapModelMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Map Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Map Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureMapParameter(StructureMapParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Map Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Map Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureMapRule(StructureMapRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Map Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Map Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureMapSource(StructureMapSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Map Source List Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Map Source List Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureMapSourceListMode(StructureMapSourceListMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Map Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Map Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureMapStructure(StructureMapStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Map Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Map Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureMapTarget(StructureMapTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Map Target List Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Map Target List Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureMapTargetListMode(StructureMapTargetListMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Map Transform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Map Transform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureMapTransform(StructureMapTransform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subscription</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subscription</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubscription(Subscription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subscription Channel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subscription Channel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubscriptionChannel(SubscriptionChannel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subscription Channel Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subscription Channel Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubscriptionChannelType(SubscriptionChannelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subscription Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subscription Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubscriptionStatus(SubscriptionStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstance(Substance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Amount</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Amount</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceAmount(SubstanceAmount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Amount Reference Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Amount Reference Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceAmountReferenceRange(SubstanceAmountReferenceRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Ingredient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Ingredient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceIngredient(SubstanceIngredient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceInstance(SubstanceInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Nucleic Acid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Nucleic Acid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceNucleicAcid(SubstanceNucleicAcid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Nucleic Acid Linkage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Nucleic Acid Linkage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceNucleicAcidLinkage(SubstanceNucleicAcidLinkage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Nucleic Acid Subunit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Nucleic Acid Subunit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceNucleicAcidSubunit(SubstanceNucleicAcidSubunit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Nucleic Acid Sugar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Nucleic Acid Sugar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceNucleicAcidSugar(SubstanceNucleicAcidSugar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Polymer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Polymer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstancePolymer(SubstancePolymer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Polymer Degree Of Polymerisation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Polymer Degree Of Polymerisation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstancePolymerDegreeOfPolymerisation(SubstancePolymerDegreeOfPolymerisation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Polymer Monomer Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Polymer Monomer Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstancePolymerMonomerSet(SubstancePolymerMonomerSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Polymer Repeat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Polymer Repeat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstancePolymerRepeat(SubstancePolymerRepeat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Polymer Repeat Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Polymer Repeat Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstancePolymerRepeatUnit(SubstancePolymerRepeatUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Polymer Starting Material</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Polymer Starting Material</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstancePolymerStartingMaterial(SubstancePolymerStartingMaterial object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Polymer Structural Representation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Polymer Structural Representation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstancePolymerStructuralRepresentation(SubstancePolymerStructuralRepresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Protein</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Protein</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceProtein(SubstanceProtein object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Protein Subunit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Protein Subunit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceProteinSubunit(SubstanceProteinSubunit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Reference Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Reference Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceReferenceInformation(SubstanceReferenceInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Reference Information Classification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Reference Information Classification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceReferenceInformationClassification(SubstanceReferenceInformationClassification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Reference Information Gene</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Reference Information Gene</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceReferenceInformationGene(SubstanceReferenceInformationGene object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Reference Information Gene Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Reference Information Gene Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceReferenceInformationGeneElement(SubstanceReferenceInformationGeneElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Reference Information Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Reference Information Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceReferenceInformationTarget(SubstanceReferenceInformationTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Source Material</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Source Material</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceSourceMaterial(SubstanceSourceMaterial object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Source Material Author</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Source Material Author</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceSourceMaterialAuthor(SubstanceSourceMaterialAuthor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Source Material Fraction Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Source Material Fraction Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceSourceMaterialFractionDescription(SubstanceSourceMaterialFractionDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Source Material Hybrid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Source Material Hybrid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceSourceMaterialHybrid(SubstanceSourceMaterialHybrid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Source Material Organism</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Source Material Organism</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceSourceMaterialOrganism(SubstanceSourceMaterialOrganism object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Source Material Organism General</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Source Material Organism General</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceSourceMaterialOrganismGeneral(SubstanceSourceMaterialOrganismGeneral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Source Material Part Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Source Material Part Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceSourceMaterialPartDescription(SubstanceSourceMaterialPartDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceSpecification(SubstanceSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Specification Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Specification Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceSpecificationCode(SubstanceSpecificationCode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Specification Isotope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Specification Isotope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceSpecificationIsotope(SubstanceSpecificationIsotope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Specification Moiety</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Specification Moiety</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceSpecificationMoiety(SubstanceSpecificationMoiety object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Specification Molecular Weight</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Specification Molecular Weight</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceSpecificationMolecularWeight(SubstanceSpecificationMolecularWeight object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Specification Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Specification Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceSpecificationName(SubstanceSpecificationName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Specification Official</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Specification Official</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceSpecificationOfficial(SubstanceSpecificationOfficial object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Specification Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Specification Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceSpecificationProperty(SubstanceSpecificationProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Specification Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Specification Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceSpecificationRelationship(SubstanceSpecificationRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Specification Representation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Specification Representation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceSpecificationRepresentation(SubstanceSpecificationRepresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Specification Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Specification Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceSpecificationStructure(SubstanceSpecificationStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supply Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supply Delivery</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupplyDelivery(SupplyDelivery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supply Delivery Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supply Delivery Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupplyDeliveryStatus(SupplyDeliveryStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supply Delivery Supplied Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supply Delivery Supplied Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupplyDeliverySuppliedItem(SupplyDeliverySuppliedItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supply Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supply Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupplyRequest(SupplyRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supply Request Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supply Request Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupplyRequestParameter(SupplyRequestParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supply Request Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supply Request Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupplyRequestStatus(SupplyRequestStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Restful Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Restful Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemRestfulInteraction(SystemRestfulInteraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskInput(TaskInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Intent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Intent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskIntent(TaskIntent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskOutput(TaskOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskRestriction(TaskRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskStatus(TaskStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Capabilities</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyCapabilities(TerminologyCapabilities object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Capabilities Closure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Capabilities Closure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyCapabilitiesClosure(TerminologyCapabilitiesClosure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Capabilities Code System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Capabilities Code System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyCapabilitiesCodeSystem(TerminologyCapabilitiesCodeSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Capabilities Expansion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Capabilities Expansion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyCapabilitiesExpansion(TerminologyCapabilitiesExpansion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Capabilities Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Capabilities Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyCapabilitiesFilter(TerminologyCapabilitiesFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Capabilities Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Capabilities Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyCapabilitiesImplementation(TerminologyCapabilitiesImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Capabilities Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Capabilities Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyCapabilitiesParameter(TerminologyCapabilitiesParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Capabilities Software</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Capabilities Software</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyCapabilitiesSoftware(TerminologyCapabilitiesSoftware object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Capabilities Translation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Capabilities Translation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyCapabilitiesTranslation(TerminologyCapabilitiesTranslation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Capabilities Validate Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Capabilities Validate Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyCapabilitiesValidateCode(TerminologyCapabilitiesValidateCode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Capabilities Version</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Capabilities Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyCapabilitiesVersion(TerminologyCapabilitiesVersion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Report</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Report</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestReport(TestReport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Report Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Report Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestReportAction(TestReportAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Report Action1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Report Action1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestReportAction1(TestReportAction1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Report Action2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Report Action2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestReportAction2(TestReportAction2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Report Action Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Report Action Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestReportActionResult(TestReportActionResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Report Assert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Report Assert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestReportAssert(TestReportAssert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Report Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Report Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestReportOperation(TestReportOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Report Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Report Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestReportParticipant(TestReportParticipant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Report Participant Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Report Participant Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestReportParticipantType(TestReportParticipantType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Report Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Report Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestReportResult(TestReportResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Report Setup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Report Setup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestReportSetup(TestReportSetup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Report Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Report Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestReportStatus(TestReportStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Report Teardown</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Report Teardown</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestReportTeardown(TestReportTeardown object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Report Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Report Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestReportTest(TestReportTest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScript(TestScript object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptAction(TestScriptAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Action1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Action1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptAction1(TestScriptAction1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Action2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Action2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptAction2(TestScriptAction2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Assert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Assert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptAssert(TestScriptAssert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptCapability(TestScriptCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Destination</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Destination</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptDestination(TestScriptDestination object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Fixture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Fixture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptFixture(TestScriptFixture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptLink(TestScriptLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Metadata</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptMetadata(TestScriptMetadata object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptOperation(TestScriptOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Origin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Origin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptOrigin(TestScriptOrigin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Request Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Request Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptRequestHeader(TestScriptRequestHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Request Method Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Request Method Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptRequestMethodCode(TestScriptRequestMethodCode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Setup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Setup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptSetup(TestScriptSetup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Teardown</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Teardown</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptTeardown(TestScriptTeardown object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptTest(TestScriptTest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptVariable(TestScriptVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTime(Time object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTiming(Timing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timing Repeat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timing Repeat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimingRepeat(TimingRepeat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriggerDefinition(TriggerDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriggerType(TriggerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Derivation Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Derivation Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDerivationRule(TypeDerivationRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Restful Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Restful Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeRestfulInteraction(TypeRestfulInteraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UDI Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UDI Entry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUDIEntryType(UDIEntryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Units Of Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Units Of Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitsOfTime(UnitsOfTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unsigned Int</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unsigned Int</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnsignedInt(UnsignedInt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uri</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uri</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUri(Uri object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Url</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Url</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUrl(Url object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usage Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usage Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsageContext(UsageContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUse(Use object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uuid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uuid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUuid(Uuid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSet(ValueSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Compose</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Compose</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetCompose(ValueSetCompose object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Concept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Concept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetConcept(ValueSetConcept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Contains</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Contains</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetContains(ValueSetContains object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Designation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Designation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetDesignation(ValueSetDesignation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Expansion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Expansion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetExpansion(ValueSetExpansion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetFilter(ValueSetFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Include</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Include</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetInclude(ValueSetInclude object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetParameter(ValueSetParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableType(VariableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VConfidentiality Classification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VConfidentiality Classification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVConfidentialityClassification(VConfidentialityClassification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verification Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verification Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerificationResult(VerificationResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verification Result Attestation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verification Result Attestation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerificationResultAttestation(VerificationResultAttestation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verification Result Primary Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verification Result Primary Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerificationResultPrimarySource(VerificationResultPrimarySource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verification Result Validator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verification Result Validator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerificationResultValidator(VerificationResultValidator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vision Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vision Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisionBase(VisionBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vision Eyes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vision Eyes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisionEyes(VisionEyes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vision Prescription</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vision Prescription</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisionPrescription(VisionPrescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vision Prescription Lens Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vision Prescription Lens Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisionPrescriptionLensSpecification(VisionPrescriptionLensSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vision Prescription Prism</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vision Prescription Prism</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisionPrescriptionPrism(VisionPrescriptionPrism object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XPath Usage Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XPath Usage Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXPathUsageType(XPathUsageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //FhirSwitch
