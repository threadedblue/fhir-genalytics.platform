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
import org.hl7.fhir.ClaimDetail;
import org.hl7.fhir.ClaimItem;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Date;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Money;
import org.hl7.fhir.Period;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ClaimItemImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimItemImpl#getCareTeamSequence <em>Care Team Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimItemImpl#getDiagnosisSequence <em>Diagnosis Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimItemImpl#getProcedureSequence <em>Procedure Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimItemImpl#getInformationSequence <em>Information Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimItemImpl#getRevenue <em>Revenue</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimItemImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimItemImpl#getProductOrService <em>Product Or Service</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimItemImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimItemImpl#getProgramCode <em>Program Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimItemImpl#getServicedDate <em>Serviced Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimItemImpl#getServicedPeriod <em>Serviced Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimItemImpl#getLocationCodeableConcept <em>Location Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimItemImpl#getLocationAddress <em>Location Address</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimItemImpl#getLocationReference <em>Location Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimItemImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimItemImpl#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimItemImpl#getFactor <em>Factor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimItemImpl#getNet <em>Net</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimItemImpl#getUdi <em>Udi</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimItemImpl#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimItemImpl#getSubSite <em>Sub Site</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimItemImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimItemImpl#getDetail <em>Detail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaimItemImpl extends BackboneElementImpl implements ClaimItem {
	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt sequence;

	/**
	 * The cached value of the '{@link #getCareTeamSequence() <em>Care Team Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCareTeamSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<PositiveInt> careTeamSequence;

	/**
	 * The cached value of the '{@link #getDiagnosisSequence() <em>Diagnosis Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosisSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<PositiveInt> diagnosisSequence;

	/**
	 * The cached value of the '{@link #getProcedureSequence() <em>Procedure Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<PositiveInt> procedureSequence;

	/**
	 * The cached value of the '{@link #getInformationSequence() <em>Information Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<PositiveInt> informationSequence;

	/**
	 * The cached value of the '{@link #getRevenue() <em>Revenue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevenue()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept revenue;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept category;

	/**
	 * The cached value of the '{@link #getProductOrService() <em>Product Or Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductOrService()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept productOrService;

	/**
	 * The cached value of the '{@link #getModifier() <em>Modifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> modifier;

	/**
	 * The cached value of the '{@link #getProgramCode() <em>Program Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramCode()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> programCode;

	/**
	 * The cached value of the '{@link #getServicedDate() <em>Serviced Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicedDate()
	 * @generated
	 * @ordered
	 */
	protected Date servicedDate;

	/**
	 * The cached value of the '{@link #getServicedPeriod() <em>Serviced Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicedPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period servicedPeriod;

	/**
	 * The cached value of the '{@link #getLocationCodeableConcept() <em>Location Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept locationCodeableConcept;

	/**
	 * The cached value of the '{@link #getLocationAddress() <em>Location Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationAddress()
	 * @generated
	 * @ordered
	 */
	protected Address locationAddress;

	/**
	 * The cached value of the '{@link #getLocationReference() <em>Location Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationReference()
	 * @generated
	 * @ordered
	 */
	protected Reference locationReference;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity quantity;

	/**
	 * The cached value of the '{@link #getUnitPrice() <em>Unit Price</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitPrice()
	 * @generated
	 * @ordered
	 */
	protected Money unitPrice;

	/**
	 * The cached value of the '{@link #getFactor() <em>Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactor()
	 * @generated
	 * @ordered
	 */
	protected Decimal factor;

	/**
	 * The cached value of the '{@link #getNet() <em>Net</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNet()
	 * @generated
	 * @ordered
	 */
	protected Money net;

	/**
	 * The cached value of the '{@link #getUdi() <em>Udi</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUdi()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> udi;

	/**
	 * The cached value of the '{@link #getBodySite() <em>Body Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySite()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept bodySite;

	/**
	 * The cached value of the '{@link #getSubSite() <em>Sub Site</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubSite()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> subSite;

	/**
	 * The cached value of the '{@link #getEncounter() <em>Encounter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounter()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> encounter;

	/**
	 * The cached value of the '{@link #getDetail() <em>Detail</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetail()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimDetail> detail;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getClaimItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequence(PositiveInt newSequence, NotificationChain msgs) {
		PositiveInt oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__SEQUENCE, oldSequence, newSequence);
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
	public void setSequence(PositiveInt newSequence) {
		if (newSequence != sequence) {
			NotificationChain msgs = null;
			if (sequence != null)
				msgs = ((InternalEObject)sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__SEQUENCE, null, msgs);
			if (newSequence != null)
				msgs = ((InternalEObject)newSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__SEQUENCE, null, msgs);
			msgs = basicSetSequence(newSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__SEQUENCE, newSequence, newSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PositiveInt> getCareTeamSequence() {
		if (careTeamSequence == null) {
			careTeamSequence = new EObjectContainmentEList<PositiveInt>(PositiveInt.class, this, FhirPackage.CLAIM_ITEM__CARE_TEAM_SEQUENCE);
		}
		return careTeamSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PositiveInt> getDiagnosisSequence() {
		if (diagnosisSequence == null) {
			diagnosisSequence = new EObjectContainmentEList<PositiveInt>(PositiveInt.class, this, FhirPackage.CLAIM_ITEM__DIAGNOSIS_SEQUENCE);
		}
		return diagnosisSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PositiveInt> getProcedureSequence() {
		if (procedureSequence == null) {
			procedureSequence = new EObjectContainmentEList<PositiveInt>(PositiveInt.class, this, FhirPackage.CLAIM_ITEM__PROCEDURE_SEQUENCE);
		}
		return procedureSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PositiveInt> getInformationSequence() {
		if (informationSequence == null) {
			informationSequence = new EObjectContainmentEList<PositiveInt>(PositiveInt.class, this, FhirPackage.CLAIM_ITEM__INFORMATION_SEQUENCE);
		}
		return informationSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getRevenue() {
		return revenue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRevenue(CodeableConcept newRevenue, NotificationChain msgs) {
		CodeableConcept oldRevenue = revenue;
		revenue = newRevenue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__REVENUE, oldRevenue, newRevenue);
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
	public void setRevenue(CodeableConcept newRevenue) {
		if (newRevenue != revenue) {
			NotificationChain msgs = null;
			if (revenue != null)
				msgs = ((InternalEObject)revenue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__REVENUE, null, msgs);
			if (newRevenue != null)
				msgs = ((InternalEObject)newRevenue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__REVENUE, null, msgs);
			msgs = basicSetRevenue(newRevenue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__REVENUE, newRevenue, newRevenue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategory(CodeableConcept newCategory, NotificationChain msgs) {
		CodeableConcept oldCategory = category;
		category = newCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__CATEGORY, oldCategory, newCategory);
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
	public void setCategory(CodeableConcept newCategory) {
		if (newCategory != category) {
			NotificationChain msgs = null;
			if (category != null)
				msgs = ((InternalEObject)category).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__CATEGORY, null, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__CATEGORY, null, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__CATEGORY, newCategory, newCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getProductOrService() {
		return productOrService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductOrService(CodeableConcept newProductOrService, NotificationChain msgs) {
		CodeableConcept oldProductOrService = productOrService;
		productOrService = newProductOrService;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__PRODUCT_OR_SERVICE, oldProductOrService, newProductOrService);
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
	public void setProductOrService(CodeableConcept newProductOrService) {
		if (newProductOrService != productOrService) {
			NotificationChain msgs = null;
			if (productOrService != null)
				msgs = ((InternalEObject)productOrService).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__PRODUCT_OR_SERVICE, null, msgs);
			if (newProductOrService != null)
				msgs = ((InternalEObject)newProductOrService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__PRODUCT_OR_SERVICE, null, msgs);
			msgs = basicSetProductOrService(newProductOrService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__PRODUCT_OR_SERVICE, newProductOrService, newProductOrService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getModifier() {
		if (modifier == null) {
			modifier = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CLAIM_ITEM__MODIFIER);
		}
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getProgramCode() {
		if (programCode == null) {
			programCode = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CLAIM_ITEM__PROGRAM_CODE);
		}
		return programCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getServicedDate() {
		return servicedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServicedDate(Date newServicedDate, NotificationChain msgs) {
		Date oldServicedDate = servicedDate;
		servicedDate = newServicedDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__SERVICED_DATE, oldServicedDate, newServicedDate);
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
	public void setServicedDate(Date newServicedDate) {
		if (newServicedDate != servicedDate) {
			NotificationChain msgs = null;
			if (servicedDate != null)
				msgs = ((InternalEObject)servicedDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__SERVICED_DATE, null, msgs);
			if (newServicedDate != null)
				msgs = ((InternalEObject)newServicedDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__SERVICED_DATE, null, msgs);
			msgs = basicSetServicedDate(newServicedDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__SERVICED_DATE, newServicedDate, newServicedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getServicedPeriod() {
		return servicedPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServicedPeriod(Period newServicedPeriod, NotificationChain msgs) {
		Period oldServicedPeriod = servicedPeriod;
		servicedPeriod = newServicedPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__SERVICED_PERIOD, oldServicedPeriod, newServicedPeriod);
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
	public void setServicedPeriod(Period newServicedPeriod) {
		if (newServicedPeriod != servicedPeriod) {
			NotificationChain msgs = null;
			if (servicedPeriod != null)
				msgs = ((InternalEObject)servicedPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__SERVICED_PERIOD, null, msgs);
			if (newServicedPeriod != null)
				msgs = ((InternalEObject)newServicedPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__SERVICED_PERIOD, null, msgs);
			msgs = basicSetServicedPeriod(newServicedPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__SERVICED_PERIOD, newServicedPeriod, newServicedPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getLocationCodeableConcept() {
		return locationCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocationCodeableConcept(CodeableConcept newLocationCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldLocationCodeableConcept = locationCodeableConcept;
		locationCodeableConcept = newLocationCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__LOCATION_CODEABLE_CONCEPT, oldLocationCodeableConcept, newLocationCodeableConcept);
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
	public void setLocationCodeableConcept(CodeableConcept newLocationCodeableConcept) {
		if (newLocationCodeableConcept != locationCodeableConcept) {
			NotificationChain msgs = null;
			if (locationCodeableConcept != null)
				msgs = ((InternalEObject)locationCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__LOCATION_CODEABLE_CONCEPT, null, msgs);
			if (newLocationCodeableConcept != null)
				msgs = ((InternalEObject)newLocationCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__LOCATION_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetLocationCodeableConcept(newLocationCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__LOCATION_CODEABLE_CONCEPT, newLocationCodeableConcept, newLocationCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Address getLocationAddress() {
		return locationAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocationAddress(Address newLocationAddress, NotificationChain msgs) {
		Address oldLocationAddress = locationAddress;
		locationAddress = newLocationAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__LOCATION_ADDRESS, oldLocationAddress, newLocationAddress);
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
	public void setLocationAddress(Address newLocationAddress) {
		if (newLocationAddress != locationAddress) {
			NotificationChain msgs = null;
			if (locationAddress != null)
				msgs = ((InternalEObject)locationAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__LOCATION_ADDRESS, null, msgs);
			if (newLocationAddress != null)
				msgs = ((InternalEObject)newLocationAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__LOCATION_ADDRESS, null, msgs);
			msgs = basicSetLocationAddress(newLocationAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__LOCATION_ADDRESS, newLocationAddress, newLocationAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getLocationReference() {
		return locationReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocationReference(Reference newLocationReference, NotificationChain msgs) {
		Reference oldLocationReference = locationReference;
		locationReference = newLocationReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__LOCATION_REFERENCE, oldLocationReference, newLocationReference);
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
	public void setLocationReference(Reference newLocationReference) {
		if (newLocationReference != locationReference) {
			NotificationChain msgs = null;
			if (locationReference != null)
				msgs = ((InternalEObject)locationReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__LOCATION_REFERENCE, null, msgs);
			if (newLocationReference != null)
				msgs = ((InternalEObject)newLocationReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__LOCATION_REFERENCE, null, msgs);
			msgs = basicSetLocationReference(newLocationReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__LOCATION_REFERENCE, newLocationReference, newLocationReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(Quantity newQuantity, NotificationChain msgs) {
		Quantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__QUANTITY, oldQuantity, newQuantity);
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
	public void setQuantity(Quantity newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Money getUnitPrice() {
		return unitPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnitPrice(Money newUnitPrice, NotificationChain msgs) {
		Money oldUnitPrice = unitPrice;
		unitPrice = newUnitPrice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__UNIT_PRICE, oldUnitPrice, newUnitPrice);
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
	public void setUnitPrice(Money newUnitPrice) {
		if (newUnitPrice != unitPrice) {
			NotificationChain msgs = null;
			if (unitPrice != null)
				msgs = ((InternalEObject)unitPrice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__UNIT_PRICE, null, msgs);
			if (newUnitPrice != null)
				msgs = ((InternalEObject)newUnitPrice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__UNIT_PRICE, null, msgs);
			msgs = basicSetUnitPrice(newUnitPrice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__UNIT_PRICE, newUnitPrice, newUnitPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getFactor() {
		return factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFactor(Decimal newFactor, NotificationChain msgs) {
		Decimal oldFactor = factor;
		factor = newFactor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__FACTOR, oldFactor, newFactor);
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
	public void setFactor(Decimal newFactor) {
		if (newFactor != factor) {
			NotificationChain msgs = null;
			if (factor != null)
				msgs = ((InternalEObject)factor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__FACTOR, null, msgs);
			if (newFactor != null)
				msgs = ((InternalEObject)newFactor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__FACTOR, null, msgs);
			msgs = basicSetFactor(newFactor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__FACTOR, newFactor, newFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Money getNet() {
		return net;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNet(Money newNet, NotificationChain msgs) {
		Money oldNet = net;
		net = newNet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__NET, oldNet, newNet);
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
	public void setNet(Money newNet) {
		if (newNet != net) {
			NotificationChain msgs = null;
			if (net != null)
				msgs = ((InternalEObject)net).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__NET, null, msgs);
			if (newNet != null)
				msgs = ((InternalEObject)newNet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__NET, null, msgs);
			msgs = basicSetNet(newNet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__NET, newNet, newNet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getUdi() {
		if (udi == null) {
			udi = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CLAIM_ITEM__UDI);
		}
		return udi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getBodySite() {
		return bodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBodySite(CodeableConcept newBodySite, NotificationChain msgs) {
		CodeableConcept oldBodySite = bodySite;
		bodySite = newBodySite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__BODY_SITE, oldBodySite, newBodySite);
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
	public void setBodySite(CodeableConcept newBodySite) {
		if (newBodySite != bodySite) {
			NotificationChain msgs = null;
			if (bodySite != null)
				msgs = ((InternalEObject)bodySite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__BODY_SITE, null, msgs);
			if (newBodySite != null)
				msgs = ((InternalEObject)newBodySite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_ITEM__BODY_SITE, null, msgs);
			msgs = basicSetBodySite(newBodySite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_ITEM__BODY_SITE, newBodySite, newBodySite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getSubSite() {
		if (subSite == null) {
			subSite = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CLAIM_ITEM__SUB_SITE);
		}
		return subSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getEncounter() {
		if (encounter == null) {
			encounter = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CLAIM_ITEM__ENCOUNTER);
		}
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClaimDetail> getDetail() {
		if (detail == null) {
			detail = new EObjectContainmentEList<ClaimDetail>(ClaimDetail.class, this, FhirPackage.CLAIM_ITEM__DETAIL);
		}
		return detail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CLAIM_ITEM__SEQUENCE:
				return basicSetSequence(null, msgs);
			case FhirPackage.CLAIM_ITEM__CARE_TEAM_SEQUENCE:
				return ((InternalEList<?>)getCareTeamSequence()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_ITEM__DIAGNOSIS_SEQUENCE:
				return ((InternalEList<?>)getDiagnosisSequence()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_ITEM__PROCEDURE_SEQUENCE:
				return ((InternalEList<?>)getProcedureSequence()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_ITEM__INFORMATION_SEQUENCE:
				return ((InternalEList<?>)getInformationSequence()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_ITEM__REVENUE:
				return basicSetRevenue(null, msgs);
			case FhirPackage.CLAIM_ITEM__CATEGORY:
				return basicSetCategory(null, msgs);
			case FhirPackage.CLAIM_ITEM__PRODUCT_OR_SERVICE:
				return basicSetProductOrService(null, msgs);
			case FhirPackage.CLAIM_ITEM__MODIFIER:
				return ((InternalEList<?>)getModifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_ITEM__PROGRAM_CODE:
				return ((InternalEList<?>)getProgramCode()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_ITEM__SERVICED_DATE:
				return basicSetServicedDate(null, msgs);
			case FhirPackage.CLAIM_ITEM__SERVICED_PERIOD:
				return basicSetServicedPeriod(null, msgs);
			case FhirPackage.CLAIM_ITEM__LOCATION_CODEABLE_CONCEPT:
				return basicSetLocationCodeableConcept(null, msgs);
			case FhirPackage.CLAIM_ITEM__LOCATION_ADDRESS:
				return basicSetLocationAddress(null, msgs);
			case FhirPackage.CLAIM_ITEM__LOCATION_REFERENCE:
				return basicSetLocationReference(null, msgs);
			case FhirPackage.CLAIM_ITEM__QUANTITY:
				return basicSetQuantity(null, msgs);
			case FhirPackage.CLAIM_ITEM__UNIT_PRICE:
				return basicSetUnitPrice(null, msgs);
			case FhirPackage.CLAIM_ITEM__FACTOR:
				return basicSetFactor(null, msgs);
			case FhirPackage.CLAIM_ITEM__NET:
				return basicSetNet(null, msgs);
			case FhirPackage.CLAIM_ITEM__UDI:
				return ((InternalEList<?>)getUdi()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_ITEM__BODY_SITE:
				return basicSetBodySite(null, msgs);
			case FhirPackage.CLAIM_ITEM__SUB_SITE:
				return ((InternalEList<?>)getSubSite()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_ITEM__ENCOUNTER:
				return ((InternalEList<?>)getEncounter()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_ITEM__DETAIL:
				return ((InternalEList<?>)getDetail()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CLAIM_ITEM__SEQUENCE:
				return getSequence();
			case FhirPackage.CLAIM_ITEM__CARE_TEAM_SEQUENCE:
				return getCareTeamSequence();
			case FhirPackage.CLAIM_ITEM__DIAGNOSIS_SEQUENCE:
				return getDiagnosisSequence();
			case FhirPackage.CLAIM_ITEM__PROCEDURE_SEQUENCE:
				return getProcedureSequence();
			case FhirPackage.CLAIM_ITEM__INFORMATION_SEQUENCE:
				return getInformationSequence();
			case FhirPackage.CLAIM_ITEM__REVENUE:
				return getRevenue();
			case FhirPackage.CLAIM_ITEM__CATEGORY:
				return getCategory();
			case FhirPackage.CLAIM_ITEM__PRODUCT_OR_SERVICE:
				return getProductOrService();
			case FhirPackage.CLAIM_ITEM__MODIFIER:
				return getModifier();
			case FhirPackage.CLAIM_ITEM__PROGRAM_CODE:
				return getProgramCode();
			case FhirPackage.CLAIM_ITEM__SERVICED_DATE:
				return getServicedDate();
			case FhirPackage.CLAIM_ITEM__SERVICED_PERIOD:
				return getServicedPeriod();
			case FhirPackage.CLAIM_ITEM__LOCATION_CODEABLE_CONCEPT:
				return getLocationCodeableConcept();
			case FhirPackage.CLAIM_ITEM__LOCATION_ADDRESS:
				return getLocationAddress();
			case FhirPackage.CLAIM_ITEM__LOCATION_REFERENCE:
				return getLocationReference();
			case FhirPackage.CLAIM_ITEM__QUANTITY:
				return getQuantity();
			case FhirPackage.CLAIM_ITEM__UNIT_PRICE:
				return getUnitPrice();
			case FhirPackage.CLAIM_ITEM__FACTOR:
				return getFactor();
			case FhirPackage.CLAIM_ITEM__NET:
				return getNet();
			case FhirPackage.CLAIM_ITEM__UDI:
				return getUdi();
			case FhirPackage.CLAIM_ITEM__BODY_SITE:
				return getBodySite();
			case FhirPackage.CLAIM_ITEM__SUB_SITE:
				return getSubSite();
			case FhirPackage.CLAIM_ITEM__ENCOUNTER:
				return getEncounter();
			case FhirPackage.CLAIM_ITEM__DETAIL:
				return getDetail();
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
			case FhirPackage.CLAIM_ITEM__SEQUENCE:
				setSequence((PositiveInt)newValue);
				return;
			case FhirPackage.CLAIM_ITEM__CARE_TEAM_SEQUENCE:
				getCareTeamSequence().clear();
				getCareTeamSequence().addAll((Collection<? extends PositiveInt>)newValue);
				return;
			case FhirPackage.CLAIM_ITEM__DIAGNOSIS_SEQUENCE:
				getDiagnosisSequence().clear();
				getDiagnosisSequence().addAll((Collection<? extends PositiveInt>)newValue);
				return;
			case FhirPackage.CLAIM_ITEM__PROCEDURE_SEQUENCE:
				getProcedureSequence().clear();
				getProcedureSequence().addAll((Collection<? extends PositiveInt>)newValue);
				return;
			case FhirPackage.CLAIM_ITEM__INFORMATION_SEQUENCE:
				getInformationSequence().clear();
				getInformationSequence().addAll((Collection<? extends PositiveInt>)newValue);
				return;
			case FhirPackage.CLAIM_ITEM__REVENUE:
				setRevenue((CodeableConcept)newValue);
				return;
			case FhirPackage.CLAIM_ITEM__CATEGORY:
				setCategory((CodeableConcept)newValue);
				return;
			case FhirPackage.CLAIM_ITEM__PRODUCT_OR_SERVICE:
				setProductOrService((CodeableConcept)newValue);
				return;
			case FhirPackage.CLAIM_ITEM__MODIFIER:
				getModifier().clear();
				getModifier().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CLAIM_ITEM__PROGRAM_CODE:
				getProgramCode().clear();
				getProgramCode().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CLAIM_ITEM__SERVICED_DATE:
				setServicedDate((Date)newValue);
				return;
			case FhirPackage.CLAIM_ITEM__SERVICED_PERIOD:
				setServicedPeriod((Period)newValue);
				return;
			case FhirPackage.CLAIM_ITEM__LOCATION_CODEABLE_CONCEPT:
				setLocationCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.CLAIM_ITEM__LOCATION_ADDRESS:
				setLocationAddress((Address)newValue);
				return;
			case FhirPackage.CLAIM_ITEM__LOCATION_REFERENCE:
				setLocationReference((Reference)newValue);
				return;
			case FhirPackage.CLAIM_ITEM__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case FhirPackage.CLAIM_ITEM__UNIT_PRICE:
				setUnitPrice((Money)newValue);
				return;
			case FhirPackage.CLAIM_ITEM__FACTOR:
				setFactor((Decimal)newValue);
				return;
			case FhirPackage.CLAIM_ITEM__NET:
				setNet((Money)newValue);
				return;
			case FhirPackage.CLAIM_ITEM__UDI:
				getUdi().clear();
				getUdi().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CLAIM_ITEM__BODY_SITE:
				setBodySite((CodeableConcept)newValue);
				return;
			case FhirPackage.CLAIM_ITEM__SUB_SITE:
				getSubSite().clear();
				getSubSite().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CLAIM_ITEM__ENCOUNTER:
				getEncounter().clear();
				getEncounter().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CLAIM_ITEM__DETAIL:
				getDetail().clear();
				getDetail().addAll((Collection<? extends ClaimDetail>)newValue);
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
			case FhirPackage.CLAIM_ITEM__SEQUENCE:
				setSequence((PositiveInt)null);
				return;
			case FhirPackage.CLAIM_ITEM__CARE_TEAM_SEQUENCE:
				getCareTeamSequence().clear();
				return;
			case FhirPackage.CLAIM_ITEM__DIAGNOSIS_SEQUENCE:
				getDiagnosisSequence().clear();
				return;
			case FhirPackage.CLAIM_ITEM__PROCEDURE_SEQUENCE:
				getProcedureSequence().clear();
				return;
			case FhirPackage.CLAIM_ITEM__INFORMATION_SEQUENCE:
				getInformationSequence().clear();
				return;
			case FhirPackage.CLAIM_ITEM__REVENUE:
				setRevenue((CodeableConcept)null);
				return;
			case FhirPackage.CLAIM_ITEM__CATEGORY:
				setCategory((CodeableConcept)null);
				return;
			case FhirPackage.CLAIM_ITEM__PRODUCT_OR_SERVICE:
				setProductOrService((CodeableConcept)null);
				return;
			case FhirPackage.CLAIM_ITEM__MODIFIER:
				getModifier().clear();
				return;
			case FhirPackage.CLAIM_ITEM__PROGRAM_CODE:
				getProgramCode().clear();
				return;
			case FhirPackage.CLAIM_ITEM__SERVICED_DATE:
				setServicedDate((Date)null);
				return;
			case FhirPackage.CLAIM_ITEM__SERVICED_PERIOD:
				setServicedPeriod((Period)null);
				return;
			case FhirPackage.CLAIM_ITEM__LOCATION_CODEABLE_CONCEPT:
				setLocationCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.CLAIM_ITEM__LOCATION_ADDRESS:
				setLocationAddress((Address)null);
				return;
			case FhirPackage.CLAIM_ITEM__LOCATION_REFERENCE:
				setLocationReference((Reference)null);
				return;
			case FhirPackage.CLAIM_ITEM__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case FhirPackage.CLAIM_ITEM__UNIT_PRICE:
				setUnitPrice((Money)null);
				return;
			case FhirPackage.CLAIM_ITEM__FACTOR:
				setFactor((Decimal)null);
				return;
			case FhirPackage.CLAIM_ITEM__NET:
				setNet((Money)null);
				return;
			case FhirPackage.CLAIM_ITEM__UDI:
				getUdi().clear();
				return;
			case FhirPackage.CLAIM_ITEM__BODY_SITE:
				setBodySite((CodeableConcept)null);
				return;
			case FhirPackage.CLAIM_ITEM__SUB_SITE:
				getSubSite().clear();
				return;
			case FhirPackage.CLAIM_ITEM__ENCOUNTER:
				getEncounter().clear();
				return;
			case FhirPackage.CLAIM_ITEM__DETAIL:
				getDetail().clear();
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
			case FhirPackage.CLAIM_ITEM__SEQUENCE:
				return sequence != null;
			case FhirPackage.CLAIM_ITEM__CARE_TEAM_SEQUENCE:
				return careTeamSequence != null && !careTeamSequence.isEmpty();
			case FhirPackage.CLAIM_ITEM__DIAGNOSIS_SEQUENCE:
				return diagnosisSequence != null && !diagnosisSequence.isEmpty();
			case FhirPackage.CLAIM_ITEM__PROCEDURE_SEQUENCE:
				return procedureSequence != null && !procedureSequence.isEmpty();
			case FhirPackage.CLAIM_ITEM__INFORMATION_SEQUENCE:
				return informationSequence != null && !informationSequence.isEmpty();
			case FhirPackage.CLAIM_ITEM__REVENUE:
				return revenue != null;
			case FhirPackage.CLAIM_ITEM__CATEGORY:
				return category != null;
			case FhirPackage.CLAIM_ITEM__PRODUCT_OR_SERVICE:
				return productOrService != null;
			case FhirPackage.CLAIM_ITEM__MODIFIER:
				return modifier != null && !modifier.isEmpty();
			case FhirPackage.CLAIM_ITEM__PROGRAM_CODE:
				return programCode != null && !programCode.isEmpty();
			case FhirPackage.CLAIM_ITEM__SERVICED_DATE:
				return servicedDate != null;
			case FhirPackage.CLAIM_ITEM__SERVICED_PERIOD:
				return servicedPeriod != null;
			case FhirPackage.CLAIM_ITEM__LOCATION_CODEABLE_CONCEPT:
				return locationCodeableConcept != null;
			case FhirPackage.CLAIM_ITEM__LOCATION_ADDRESS:
				return locationAddress != null;
			case FhirPackage.CLAIM_ITEM__LOCATION_REFERENCE:
				return locationReference != null;
			case FhirPackage.CLAIM_ITEM__QUANTITY:
				return quantity != null;
			case FhirPackage.CLAIM_ITEM__UNIT_PRICE:
				return unitPrice != null;
			case FhirPackage.CLAIM_ITEM__FACTOR:
				return factor != null;
			case FhirPackage.CLAIM_ITEM__NET:
				return net != null;
			case FhirPackage.CLAIM_ITEM__UDI:
				return udi != null && !udi.isEmpty();
			case FhirPackage.CLAIM_ITEM__BODY_SITE:
				return bodySite != null;
			case FhirPackage.CLAIM_ITEM__SUB_SITE:
				return subSite != null && !subSite.isEmpty();
			case FhirPackage.CLAIM_ITEM__ENCOUNTER:
				return encounter != null && !encounter.isEmpty();
			case FhirPackage.CLAIM_ITEM__DETAIL:
				return detail != null && !detail.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClaimItemImpl
