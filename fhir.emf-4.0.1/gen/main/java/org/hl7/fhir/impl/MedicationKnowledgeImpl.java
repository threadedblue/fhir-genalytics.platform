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

import org.hl7.fhir.Code;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.MedicationKnowledge;
import org.hl7.fhir.MedicationKnowledgeAdministrationGuidelines;
import org.hl7.fhir.MedicationKnowledgeCost;
import org.hl7.fhir.MedicationKnowledgeDrugCharacteristic;
import org.hl7.fhir.MedicationKnowledgeIngredient;
import org.hl7.fhir.MedicationKnowledgeKinetics;
import org.hl7.fhir.MedicationKnowledgeMedicineClassification;
import org.hl7.fhir.MedicationKnowledgeMonitoringProgram;
import org.hl7.fhir.MedicationKnowledgeMonograph;
import org.hl7.fhir.MedicationKnowledgePackaging;
import org.hl7.fhir.MedicationKnowledgeRegulatory;
import org.hl7.fhir.MedicationKnowledgeRelatedMedicationKnowledge;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Knowledge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeImpl#getDoseForm <em>Dose Form</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeImpl#getSynonym <em>Synonym</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeImpl#getRelatedMedicationKnowledge <em>Related Medication Knowledge</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeImpl#getAssociatedMedication <em>Associated Medication</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeImpl#getProductType <em>Product Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeImpl#getMonograph <em>Monograph</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeImpl#getIngredient <em>Ingredient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeImpl#getPreparationInstruction <em>Preparation Instruction</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeImpl#getIntendedRoute <em>Intended Route</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeImpl#getMonitoringProgram <em>Monitoring Program</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeImpl#getAdministrationGuidelines <em>Administration Guidelines</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeImpl#getMedicineClassification <em>Medicine Classification</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeImpl#getPackaging <em>Packaging</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeImpl#getDrugCharacteristic <em>Drug Characteristic</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeImpl#getContraindication <em>Contraindication</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeImpl#getRegulatory <em>Regulatory</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationKnowledgeImpl#getKinetics <em>Kinetics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationKnowledgeImpl extends DomainResourceImpl implements MedicationKnowledge {
	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Code status;

	/**
	 * The cached value of the '{@link #getManufacturer() <em>Manufacturer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected Reference manufacturer;

	/**
	 * The cached value of the '{@link #getDoseForm() <em>Dose Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseForm()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept doseForm;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected Quantity amount;

	/**
	 * The cached value of the '{@link #getSynonym() <em>Synonym</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynonym()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> synonym;

	/**
	 * The cached value of the '{@link #getRelatedMedicationKnowledge() <em>Related Medication Knowledge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedMedicationKnowledge()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationKnowledgeRelatedMedicationKnowledge> relatedMedicationKnowledge;

	/**
	 * The cached value of the '{@link #getAssociatedMedication() <em>Associated Medication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedMedication()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> associatedMedication;

	/**
	 * The cached value of the '{@link #getProductType() <em>Product Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductType()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> productType;

	/**
	 * The cached value of the '{@link #getMonograph() <em>Monograph</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonograph()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationKnowledgeMonograph> monograph;

	/**
	 * The cached value of the '{@link #getIngredient() <em>Ingredient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIngredient()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationKnowledgeIngredient> ingredient;

	/**
	 * The cached value of the '{@link #getPreparationInstruction() <em>Preparation Instruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreparationInstruction()
	 * @generated
	 * @ordered
	 */
	protected Markdown preparationInstruction;

	/**
	 * The cached value of the '{@link #getIntendedRoute() <em>Intended Route</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntendedRoute()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> intendedRoute;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationKnowledgeCost> cost;

	/**
	 * The cached value of the '{@link #getMonitoringProgram() <em>Monitoring Program</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoringProgram()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationKnowledgeMonitoringProgram> monitoringProgram;

	/**
	 * The cached value of the '{@link #getAdministrationGuidelines() <em>Administration Guidelines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdministrationGuidelines()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationKnowledgeAdministrationGuidelines> administrationGuidelines;

	/**
	 * The cached value of the '{@link #getMedicineClassification() <em>Medicine Classification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicineClassification()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationKnowledgeMedicineClassification> medicineClassification;

	/**
	 * The cached value of the '{@link #getPackaging() <em>Packaging</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackaging()
	 * @generated
	 * @ordered
	 */
	protected MedicationKnowledgePackaging packaging;

	/**
	 * The cached value of the '{@link #getDrugCharacteristic() <em>Drug Characteristic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrugCharacteristic()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationKnowledgeDrugCharacteristic> drugCharacteristic;

	/**
	 * The cached value of the '{@link #getContraindication() <em>Contraindication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContraindication()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> contraindication;

	/**
	 * The cached value of the '{@link #getRegulatory() <em>Regulatory</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulatory()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationKnowledgeRegulatory> regulatory;

	/**
	 * The cached value of the '{@link #getKinetics() <em>Kinetics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKinetics()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationKnowledgeKinetics> kinetics;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationKnowledgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicationKnowledge();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CodeableConcept newCode, NotificationChain msgs) {
		CodeableConcept oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE__CODE, oldCode, newCode);
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
	public void setCode(CodeableConcept newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(Code newStatus, NotificationChain msgs) {
		Code oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE__STATUS, oldStatus, newStatus);
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
	public void setStatus(Code newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getManufacturer() {
		return manufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManufacturer(Reference newManufacturer, NotificationChain msgs) {
		Reference oldManufacturer = manufacturer;
		manufacturer = newManufacturer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE__MANUFACTURER, oldManufacturer, newManufacturer);
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
	public void setManufacturer(Reference newManufacturer) {
		if (newManufacturer != manufacturer) {
			NotificationChain msgs = null;
			if (manufacturer != null)
				msgs = ((InternalEObject)manufacturer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE__MANUFACTURER, null, msgs);
			if (newManufacturer != null)
				msgs = ((InternalEObject)newManufacturer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE__MANUFACTURER, null, msgs);
			msgs = basicSetManufacturer(newManufacturer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE__MANUFACTURER, newManufacturer, newManufacturer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getDoseForm() {
		return doseForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoseForm(CodeableConcept newDoseForm, NotificationChain msgs) {
		CodeableConcept oldDoseForm = doseForm;
		doseForm = newDoseForm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE__DOSE_FORM, oldDoseForm, newDoseForm);
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
	public void setDoseForm(CodeableConcept newDoseForm) {
		if (newDoseForm != doseForm) {
			NotificationChain msgs = null;
			if (doseForm != null)
				msgs = ((InternalEObject)doseForm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE__DOSE_FORM, null, msgs);
			if (newDoseForm != null)
				msgs = ((InternalEObject)newDoseForm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE__DOSE_FORM, null, msgs);
			msgs = basicSetDoseForm(newDoseForm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE__DOSE_FORM, newDoseForm, newDoseForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmount(Quantity newAmount, NotificationChain msgs) {
		Quantity oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE__AMOUNT, oldAmount, newAmount);
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
	public void setAmount(Quantity newAmount) {
		if (newAmount != amount) {
			NotificationChain msgs = null;
			if (amount != null)
				msgs = ((InternalEObject)amount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE__AMOUNT, null, msgs);
			if (newAmount != null)
				msgs = ((InternalEObject)newAmount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE__AMOUNT, null, msgs);
			msgs = basicSetAmount(newAmount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE__AMOUNT, newAmount, newAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.hl7.fhir.String> getSynonym() {
		if (synonym == null) {
			synonym = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.MEDICATION_KNOWLEDGE__SYNONYM);
		}
		return synonym;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicationKnowledgeRelatedMedicationKnowledge> getRelatedMedicationKnowledge() {
		if (relatedMedicationKnowledge == null) {
			relatedMedicationKnowledge = new EObjectContainmentEList<MedicationKnowledgeRelatedMedicationKnowledge>(MedicationKnowledgeRelatedMedicationKnowledge.class, this, FhirPackage.MEDICATION_KNOWLEDGE__RELATED_MEDICATION_KNOWLEDGE);
		}
		return relatedMedicationKnowledge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getAssociatedMedication() {
		if (associatedMedication == null) {
			associatedMedication = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICATION_KNOWLEDGE__ASSOCIATED_MEDICATION);
		}
		return associatedMedication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getProductType() {
		if (productType == null) {
			productType = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.MEDICATION_KNOWLEDGE__PRODUCT_TYPE);
		}
		return productType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicationKnowledgeMonograph> getMonograph() {
		if (monograph == null) {
			monograph = new EObjectContainmentEList<MedicationKnowledgeMonograph>(MedicationKnowledgeMonograph.class, this, FhirPackage.MEDICATION_KNOWLEDGE__MONOGRAPH);
		}
		return monograph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicationKnowledgeIngredient> getIngredient() {
		if (ingredient == null) {
			ingredient = new EObjectContainmentEList<MedicationKnowledgeIngredient>(MedicationKnowledgeIngredient.class, this, FhirPackage.MEDICATION_KNOWLEDGE__INGREDIENT);
		}
		return ingredient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getPreparationInstruction() {
		return preparationInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreparationInstruction(Markdown newPreparationInstruction, NotificationChain msgs) {
		Markdown oldPreparationInstruction = preparationInstruction;
		preparationInstruction = newPreparationInstruction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE__PREPARATION_INSTRUCTION, oldPreparationInstruction, newPreparationInstruction);
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
	public void setPreparationInstruction(Markdown newPreparationInstruction) {
		if (newPreparationInstruction != preparationInstruction) {
			NotificationChain msgs = null;
			if (preparationInstruction != null)
				msgs = ((InternalEObject)preparationInstruction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE__PREPARATION_INSTRUCTION, null, msgs);
			if (newPreparationInstruction != null)
				msgs = ((InternalEObject)newPreparationInstruction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE__PREPARATION_INSTRUCTION, null, msgs);
			msgs = basicSetPreparationInstruction(newPreparationInstruction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE__PREPARATION_INSTRUCTION, newPreparationInstruction, newPreparationInstruction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getIntendedRoute() {
		if (intendedRoute == null) {
			intendedRoute = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.MEDICATION_KNOWLEDGE__INTENDED_ROUTE);
		}
		return intendedRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicationKnowledgeCost> getCost() {
		if (cost == null) {
			cost = new EObjectContainmentEList<MedicationKnowledgeCost>(MedicationKnowledgeCost.class, this, FhirPackage.MEDICATION_KNOWLEDGE__COST);
		}
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicationKnowledgeMonitoringProgram> getMonitoringProgram() {
		if (monitoringProgram == null) {
			monitoringProgram = new EObjectContainmentEList<MedicationKnowledgeMonitoringProgram>(MedicationKnowledgeMonitoringProgram.class, this, FhirPackage.MEDICATION_KNOWLEDGE__MONITORING_PROGRAM);
		}
		return monitoringProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicationKnowledgeAdministrationGuidelines> getAdministrationGuidelines() {
		if (administrationGuidelines == null) {
			administrationGuidelines = new EObjectContainmentEList<MedicationKnowledgeAdministrationGuidelines>(MedicationKnowledgeAdministrationGuidelines.class, this, FhirPackage.MEDICATION_KNOWLEDGE__ADMINISTRATION_GUIDELINES);
		}
		return administrationGuidelines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicationKnowledgeMedicineClassification> getMedicineClassification() {
		if (medicineClassification == null) {
			medicineClassification = new EObjectContainmentEList<MedicationKnowledgeMedicineClassification>(MedicationKnowledgeMedicineClassification.class, this, FhirPackage.MEDICATION_KNOWLEDGE__MEDICINE_CLASSIFICATION);
		}
		return medicineClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationKnowledgePackaging getPackaging() {
		return packaging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackaging(MedicationKnowledgePackaging newPackaging, NotificationChain msgs) {
		MedicationKnowledgePackaging oldPackaging = packaging;
		packaging = newPackaging;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE__PACKAGING, oldPackaging, newPackaging);
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
	public void setPackaging(MedicationKnowledgePackaging newPackaging) {
		if (newPackaging != packaging) {
			NotificationChain msgs = null;
			if (packaging != null)
				msgs = ((InternalEObject)packaging).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE__PACKAGING, null, msgs);
			if (newPackaging != null)
				msgs = ((InternalEObject)newPackaging).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_KNOWLEDGE__PACKAGING, null, msgs);
			msgs = basicSetPackaging(newPackaging, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_KNOWLEDGE__PACKAGING, newPackaging, newPackaging));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicationKnowledgeDrugCharacteristic> getDrugCharacteristic() {
		if (drugCharacteristic == null) {
			drugCharacteristic = new EObjectContainmentEList<MedicationKnowledgeDrugCharacteristic>(MedicationKnowledgeDrugCharacteristic.class, this, FhirPackage.MEDICATION_KNOWLEDGE__DRUG_CHARACTERISTIC);
		}
		return drugCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getContraindication() {
		if (contraindication == null) {
			contraindication = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICATION_KNOWLEDGE__CONTRAINDICATION);
		}
		return contraindication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicationKnowledgeRegulatory> getRegulatory() {
		if (regulatory == null) {
			regulatory = new EObjectContainmentEList<MedicationKnowledgeRegulatory>(MedicationKnowledgeRegulatory.class, this, FhirPackage.MEDICATION_KNOWLEDGE__REGULATORY);
		}
		return regulatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicationKnowledgeKinetics> getKinetics() {
		if (kinetics == null) {
			kinetics = new EObjectContainmentEList<MedicationKnowledgeKinetics>(MedicationKnowledgeKinetics.class, this, FhirPackage.MEDICATION_KNOWLEDGE__KINETICS);
		}
		return kinetics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICATION_KNOWLEDGE__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.MEDICATION_KNOWLEDGE__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.MEDICATION_KNOWLEDGE__MANUFACTURER:
				return basicSetManufacturer(null, msgs);
			case FhirPackage.MEDICATION_KNOWLEDGE__DOSE_FORM:
				return basicSetDoseForm(null, msgs);
			case FhirPackage.MEDICATION_KNOWLEDGE__AMOUNT:
				return basicSetAmount(null, msgs);
			case FhirPackage.MEDICATION_KNOWLEDGE__SYNONYM:
				return ((InternalEList<?>)getSynonym()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_KNOWLEDGE__RELATED_MEDICATION_KNOWLEDGE:
				return ((InternalEList<?>)getRelatedMedicationKnowledge()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_KNOWLEDGE__ASSOCIATED_MEDICATION:
				return ((InternalEList<?>)getAssociatedMedication()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_KNOWLEDGE__PRODUCT_TYPE:
				return ((InternalEList<?>)getProductType()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_KNOWLEDGE__MONOGRAPH:
				return ((InternalEList<?>)getMonograph()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_KNOWLEDGE__INGREDIENT:
				return ((InternalEList<?>)getIngredient()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_KNOWLEDGE__PREPARATION_INSTRUCTION:
				return basicSetPreparationInstruction(null, msgs);
			case FhirPackage.MEDICATION_KNOWLEDGE__INTENDED_ROUTE:
				return ((InternalEList<?>)getIntendedRoute()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_KNOWLEDGE__COST:
				return ((InternalEList<?>)getCost()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_KNOWLEDGE__MONITORING_PROGRAM:
				return ((InternalEList<?>)getMonitoringProgram()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_KNOWLEDGE__ADMINISTRATION_GUIDELINES:
				return ((InternalEList<?>)getAdministrationGuidelines()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_KNOWLEDGE__MEDICINE_CLASSIFICATION:
				return ((InternalEList<?>)getMedicineClassification()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_KNOWLEDGE__PACKAGING:
				return basicSetPackaging(null, msgs);
			case FhirPackage.MEDICATION_KNOWLEDGE__DRUG_CHARACTERISTIC:
				return ((InternalEList<?>)getDrugCharacteristic()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_KNOWLEDGE__CONTRAINDICATION:
				return ((InternalEList<?>)getContraindication()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_KNOWLEDGE__REGULATORY:
				return ((InternalEList<?>)getRegulatory()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_KNOWLEDGE__KINETICS:
				return ((InternalEList<?>)getKinetics()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.MEDICATION_KNOWLEDGE__CODE:
				return getCode();
			case FhirPackage.MEDICATION_KNOWLEDGE__STATUS:
				return getStatus();
			case FhirPackage.MEDICATION_KNOWLEDGE__MANUFACTURER:
				return getManufacturer();
			case FhirPackage.MEDICATION_KNOWLEDGE__DOSE_FORM:
				return getDoseForm();
			case FhirPackage.MEDICATION_KNOWLEDGE__AMOUNT:
				return getAmount();
			case FhirPackage.MEDICATION_KNOWLEDGE__SYNONYM:
				return getSynonym();
			case FhirPackage.MEDICATION_KNOWLEDGE__RELATED_MEDICATION_KNOWLEDGE:
				return getRelatedMedicationKnowledge();
			case FhirPackage.MEDICATION_KNOWLEDGE__ASSOCIATED_MEDICATION:
				return getAssociatedMedication();
			case FhirPackage.MEDICATION_KNOWLEDGE__PRODUCT_TYPE:
				return getProductType();
			case FhirPackage.MEDICATION_KNOWLEDGE__MONOGRAPH:
				return getMonograph();
			case FhirPackage.MEDICATION_KNOWLEDGE__INGREDIENT:
				return getIngredient();
			case FhirPackage.MEDICATION_KNOWLEDGE__PREPARATION_INSTRUCTION:
				return getPreparationInstruction();
			case FhirPackage.MEDICATION_KNOWLEDGE__INTENDED_ROUTE:
				return getIntendedRoute();
			case FhirPackage.MEDICATION_KNOWLEDGE__COST:
				return getCost();
			case FhirPackage.MEDICATION_KNOWLEDGE__MONITORING_PROGRAM:
				return getMonitoringProgram();
			case FhirPackage.MEDICATION_KNOWLEDGE__ADMINISTRATION_GUIDELINES:
				return getAdministrationGuidelines();
			case FhirPackage.MEDICATION_KNOWLEDGE__MEDICINE_CLASSIFICATION:
				return getMedicineClassification();
			case FhirPackage.MEDICATION_KNOWLEDGE__PACKAGING:
				return getPackaging();
			case FhirPackage.MEDICATION_KNOWLEDGE__DRUG_CHARACTERISTIC:
				return getDrugCharacteristic();
			case FhirPackage.MEDICATION_KNOWLEDGE__CONTRAINDICATION:
				return getContraindication();
			case FhirPackage.MEDICATION_KNOWLEDGE__REGULATORY:
				return getRegulatory();
			case FhirPackage.MEDICATION_KNOWLEDGE__KINETICS:
				return getKinetics();
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
			case FhirPackage.MEDICATION_KNOWLEDGE__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE__STATUS:
				setStatus((Code)newValue);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE__MANUFACTURER:
				setManufacturer((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE__DOSE_FORM:
				setDoseForm((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE__AMOUNT:
				setAmount((Quantity)newValue);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE__SYNONYM:
				getSynonym().clear();
				getSynonym().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE__RELATED_MEDICATION_KNOWLEDGE:
				getRelatedMedicationKnowledge().clear();
				getRelatedMedicationKnowledge().addAll((Collection<? extends MedicationKnowledgeRelatedMedicationKnowledge>)newValue);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE__ASSOCIATED_MEDICATION:
				getAssociatedMedication().clear();
				getAssociatedMedication().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE__PRODUCT_TYPE:
				getProductType().clear();
				getProductType().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE__MONOGRAPH:
				getMonograph().clear();
				getMonograph().addAll((Collection<? extends MedicationKnowledgeMonograph>)newValue);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE__INGREDIENT:
				getIngredient().clear();
				getIngredient().addAll((Collection<? extends MedicationKnowledgeIngredient>)newValue);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE__PREPARATION_INSTRUCTION:
				setPreparationInstruction((Markdown)newValue);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE__INTENDED_ROUTE:
				getIntendedRoute().clear();
				getIntendedRoute().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE__COST:
				getCost().clear();
				getCost().addAll((Collection<? extends MedicationKnowledgeCost>)newValue);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE__MONITORING_PROGRAM:
				getMonitoringProgram().clear();
				getMonitoringProgram().addAll((Collection<? extends MedicationKnowledgeMonitoringProgram>)newValue);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE__ADMINISTRATION_GUIDELINES:
				getAdministrationGuidelines().clear();
				getAdministrationGuidelines().addAll((Collection<? extends MedicationKnowledgeAdministrationGuidelines>)newValue);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE__MEDICINE_CLASSIFICATION:
				getMedicineClassification().clear();
				getMedicineClassification().addAll((Collection<? extends MedicationKnowledgeMedicineClassification>)newValue);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE__PACKAGING:
				setPackaging((MedicationKnowledgePackaging)newValue);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE__DRUG_CHARACTERISTIC:
				getDrugCharacteristic().clear();
				getDrugCharacteristic().addAll((Collection<? extends MedicationKnowledgeDrugCharacteristic>)newValue);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE__CONTRAINDICATION:
				getContraindication().clear();
				getContraindication().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE__REGULATORY:
				getRegulatory().clear();
				getRegulatory().addAll((Collection<? extends MedicationKnowledgeRegulatory>)newValue);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE__KINETICS:
				getKinetics().clear();
				getKinetics().addAll((Collection<? extends MedicationKnowledgeKinetics>)newValue);
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
			case FhirPackage.MEDICATION_KNOWLEDGE__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE__STATUS:
				setStatus((Code)null);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE__MANUFACTURER:
				setManufacturer((Reference)null);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE__DOSE_FORM:
				setDoseForm((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE__AMOUNT:
				setAmount((Quantity)null);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE__SYNONYM:
				getSynonym().clear();
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE__RELATED_MEDICATION_KNOWLEDGE:
				getRelatedMedicationKnowledge().clear();
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE__ASSOCIATED_MEDICATION:
				getAssociatedMedication().clear();
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE__PRODUCT_TYPE:
				getProductType().clear();
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE__MONOGRAPH:
				getMonograph().clear();
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE__INGREDIENT:
				getIngredient().clear();
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE__PREPARATION_INSTRUCTION:
				setPreparationInstruction((Markdown)null);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE__INTENDED_ROUTE:
				getIntendedRoute().clear();
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE__COST:
				getCost().clear();
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE__MONITORING_PROGRAM:
				getMonitoringProgram().clear();
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE__ADMINISTRATION_GUIDELINES:
				getAdministrationGuidelines().clear();
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE__MEDICINE_CLASSIFICATION:
				getMedicineClassification().clear();
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE__PACKAGING:
				setPackaging((MedicationKnowledgePackaging)null);
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE__DRUG_CHARACTERISTIC:
				getDrugCharacteristic().clear();
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE__CONTRAINDICATION:
				getContraindication().clear();
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE__REGULATORY:
				getRegulatory().clear();
				return;
			case FhirPackage.MEDICATION_KNOWLEDGE__KINETICS:
				getKinetics().clear();
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
			case FhirPackage.MEDICATION_KNOWLEDGE__CODE:
				return code != null;
			case FhirPackage.MEDICATION_KNOWLEDGE__STATUS:
				return status != null;
			case FhirPackage.MEDICATION_KNOWLEDGE__MANUFACTURER:
				return manufacturer != null;
			case FhirPackage.MEDICATION_KNOWLEDGE__DOSE_FORM:
				return doseForm != null;
			case FhirPackage.MEDICATION_KNOWLEDGE__AMOUNT:
				return amount != null;
			case FhirPackage.MEDICATION_KNOWLEDGE__SYNONYM:
				return synonym != null && !synonym.isEmpty();
			case FhirPackage.MEDICATION_KNOWLEDGE__RELATED_MEDICATION_KNOWLEDGE:
				return relatedMedicationKnowledge != null && !relatedMedicationKnowledge.isEmpty();
			case FhirPackage.MEDICATION_KNOWLEDGE__ASSOCIATED_MEDICATION:
				return associatedMedication != null && !associatedMedication.isEmpty();
			case FhirPackage.MEDICATION_KNOWLEDGE__PRODUCT_TYPE:
				return productType != null && !productType.isEmpty();
			case FhirPackage.MEDICATION_KNOWLEDGE__MONOGRAPH:
				return monograph != null && !monograph.isEmpty();
			case FhirPackage.MEDICATION_KNOWLEDGE__INGREDIENT:
				return ingredient != null && !ingredient.isEmpty();
			case FhirPackage.MEDICATION_KNOWLEDGE__PREPARATION_INSTRUCTION:
				return preparationInstruction != null;
			case FhirPackage.MEDICATION_KNOWLEDGE__INTENDED_ROUTE:
				return intendedRoute != null && !intendedRoute.isEmpty();
			case FhirPackage.MEDICATION_KNOWLEDGE__COST:
				return cost != null && !cost.isEmpty();
			case FhirPackage.MEDICATION_KNOWLEDGE__MONITORING_PROGRAM:
				return monitoringProgram != null && !monitoringProgram.isEmpty();
			case FhirPackage.MEDICATION_KNOWLEDGE__ADMINISTRATION_GUIDELINES:
				return administrationGuidelines != null && !administrationGuidelines.isEmpty();
			case FhirPackage.MEDICATION_KNOWLEDGE__MEDICINE_CLASSIFICATION:
				return medicineClassification != null && !medicineClassification.isEmpty();
			case FhirPackage.MEDICATION_KNOWLEDGE__PACKAGING:
				return packaging != null;
			case FhirPackage.MEDICATION_KNOWLEDGE__DRUG_CHARACTERISTIC:
				return drugCharacteristic != null && !drugCharacteristic.isEmpty();
			case FhirPackage.MEDICATION_KNOWLEDGE__CONTRAINDICATION:
				return contraindication != null && !contraindication.isEmpty();
			case FhirPackage.MEDICATION_KNOWLEDGE__REGULATORY:
				return regulatory != null && !regulatory.isEmpty();
			case FhirPackage.MEDICATION_KNOWLEDGE__KINETICS:
				return kinetics != null && !kinetics.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicationKnowledgeImpl
