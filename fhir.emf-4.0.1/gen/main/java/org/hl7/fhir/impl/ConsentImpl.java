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

import org.hl7.fhir.Attachment;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Consent;
import org.hl7.fhir.ConsentPolicy;
import org.hl7.fhir.ConsentProvision;
import org.hl7.fhir.ConsentState;
import org.hl7.fhir.ConsentVerification;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getSourceAttachment <em>Source Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getSourceReference <em>Source Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getPolicyRule <em>Policy Rule</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getVerification <em>Verification</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getProvision <em>Provision</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsentImpl extends DomainResourceImpl implements Consent {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifier;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected ConsentState status;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept scope;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> category;

	/**
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Reference patient;

	/**
	 * The cached value of the '{@link #getDateTime() <em>Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime dateTime;

	/**
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> performer;

	/**
	 * The cached value of the '{@link #getOrganization() <em>Organization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> organization;

	/**
	 * The cached value of the '{@link #getSourceAttachment() <em>Source Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceAttachment()
	 * @generated
	 * @ordered
	 */
	protected Attachment sourceAttachment;

	/**
	 * The cached value of the '{@link #getSourceReference() <em>Source Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceReference()
	 * @generated
	 * @ordered
	 */
	protected Reference sourceReference;

	/**
	 * The cached value of the '{@link #getPolicy() <em>Policy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicy()
	 * @generated
	 * @ordered
	 */
	protected EList<ConsentPolicy> policy;

	/**
	 * The cached value of the '{@link #getPolicyRule() <em>Policy Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyRule()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept policyRule;

	/**
	 * The cached value of the '{@link #getVerification() <em>Verification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerification()
	 * @generated
	 * @ordered
	 */
	protected EList<ConsentVerification> verification;

	/**
	 * The cached value of the '{@link #getProvision() <em>Provision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvision()
	 * @generated
	 * @ordered
	 */
	protected ConsentProvision provision;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getConsent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.CONSENT__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentState getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(ConsentState newStatus, NotificationChain msgs) {
		ConsentState oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(ConsentState newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScope(CodeableConcept newScope, NotificationChain msgs) {
		CodeableConcept oldScope = scope;
		scope = newScope;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__SCOPE, oldScope, newScope);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScope(CodeableConcept newScope) {
		if (newScope != scope) {
			NotificationChain msgs = null;
			if (scope != null)
				msgs = ((InternalEObject)scope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__SCOPE, null, msgs);
			if (newScope != null)
				msgs = ((InternalEObject)newScope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__SCOPE, null, msgs);
			msgs = basicSetScope(newScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__SCOPE, newScope, newScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCategory() {
		if (category == null) {
			category = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CONSENT__CATEGORY);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getPatient() {
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatient(Reference newPatient, NotificationChain msgs) {
		Reference oldPatient = patient;
		patient = newPatient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__PATIENT, oldPatient, newPatient);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPatient(Reference newPatient) {
		if (newPatient != patient) {
			NotificationChain msgs = null;
			if (patient != null)
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getDateTime() {
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateTime(DateTime newDateTime, NotificationChain msgs) {
		DateTime oldDateTime = dateTime;
		dateTime = newDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__DATE_TIME, oldDateTime, newDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateTime(DateTime newDateTime) {
		if (newDateTime != dateTime) {
			NotificationChain msgs = null;
			if (dateTime != null)
				msgs = ((InternalEObject)dateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__DATE_TIME, null, msgs);
			if (newDateTime != null)
				msgs = ((InternalEObject)newDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__DATE_TIME, null, msgs);
			msgs = basicSetDateTime(newDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__DATE_TIME, newDateTime, newDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getPerformer() {
		if (performer == null) {
			performer = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CONSENT__PERFORMER);
		}
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getOrganization() {
		if (organization == null) {
			organization = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CONSENT__ORGANIZATION);
		}
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attachment getSourceAttachment() {
		return sourceAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceAttachment(Attachment newSourceAttachment, NotificationChain msgs) {
		Attachment oldSourceAttachment = sourceAttachment;
		sourceAttachment = newSourceAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__SOURCE_ATTACHMENT, oldSourceAttachment, newSourceAttachment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceAttachment(Attachment newSourceAttachment) {
		if (newSourceAttachment != sourceAttachment) {
			NotificationChain msgs = null;
			if (sourceAttachment != null)
				msgs = ((InternalEObject)sourceAttachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__SOURCE_ATTACHMENT, null, msgs);
			if (newSourceAttachment != null)
				msgs = ((InternalEObject)newSourceAttachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__SOURCE_ATTACHMENT, null, msgs);
			msgs = basicSetSourceAttachment(newSourceAttachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__SOURCE_ATTACHMENT, newSourceAttachment, newSourceAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getSourceReference() {
		return sourceReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceReference(Reference newSourceReference, NotificationChain msgs) {
		Reference oldSourceReference = sourceReference;
		sourceReference = newSourceReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__SOURCE_REFERENCE, oldSourceReference, newSourceReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceReference(Reference newSourceReference) {
		if (newSourceReference != sourceReference) {
			NotificationChain msgs = null;
			if (sourceReference != null)
				msgs = ((InternalEObject)sourceReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__SOURCE_REFERENCE, null, msgs);
			if (newSourceReference != null)
				msgs = ((InternalEObject)newSourceReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__SOURCE_REFERENCE, null, msgs);
			msgs = basicSetSourceReference(newSourceReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__SOURCE_REFERENCE, newSourceReference, newSourceReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConsentPolicy> getPolicy() {
		if (policy == null) {
			policy = new EObjectContainmentEList<ConsentPolicy>(ConsentPolicy.class, this, FhirPackage.CONSENT__POLICY);
		}
		return policy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getPolicyRule() {
		return policyRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolicyRule(CodeableConcept newPolicyRule, NotificationChain msgs) {
		CodeableConcept oldPolicyRule = policyRule;
		policyRule = newPolicyRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__POLICY_RULE, oldPolicyRule, newPolicyRule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPolicyRule(CodeableConcept newPolicyRule) {
		if (newPolicyRule != policyRule) {
			NotificationChain msgs = null;
			if (policyRule != null)
				msgs = ((InternalEObject)policyRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__POLICY_RULE, null, msgs);
			if (newPolicyRule != null)
				msgs = ((InternalEObject)newPolicyRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__POLICY_RULE, null, msgs);
			msgs = basicSetPolicyRule(newPolicyRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__POLICY_RULE, newPolicyRule, newPolicyRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConsentVerification> getVerification() {
		if (verification == null) {
			verification = new EObjectContainmentEList<ConsentVerification>(ConsentVerification.class, this, FhirPackage.CONSENT__VERIFICATION);
		}
		return verification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentProvision getProvision() {
		return provision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvision(ConsentProvision newProvision, NotificationChain msgs) {
		ConsentProvision oldProvision = provision;
		provision = newProvision;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__PROVISION, oldProvision, newProvision);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProvision(ConsentProvision newProvision) {
		if (newProvision != provision) {
			NotificationChain msgs = null;
			if (provision != null)
				msgs = ((InternalEObject)provision).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__PROVISION, null, msgs);
			if (newProvision != null)
				msgs = ((InternalEObject)newProvision).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__PROVISION, null, msgs);
			msgs = basicSetProvision(newProvision, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__PROVISION, newProvision, newProvision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CONSENT__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONSENT__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.CONSENT__SCOPE:
				return basicSetScope(null, msgs);
			case FhirPackage.CONSENT__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONSENT__PATIENT:
				return basicSetPatient(null, msgs);
			case FhirPackage.CONSENT__DATE_TIME:
				return basicSetDateTime(null, msgs);
			case FhirPackage.CONSENT__PERFORMER:
				return ((InternalEList<?>)getPerformer()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONSENT__ORGANIZATION:
				return ((InternalEList<?>)getOrganization()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONSENT__SOURCE_ATTACHMENT:
				return basicSetSourceAttachment(null, msgs);
			case FhirPackage.CONSENT__SOURCE_REFERENCE:
				return basicSetSourceReference(null, msgs);
			case FhirPackage.CONSENT__POLICY:
				return ((InternalEList<?>)getPolicy()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONSENT__POLICY_RULE:
				return basicSetPolicyRule(null, msgs);
			case FhirPackage.CONSENT__VERIFICATION:
				return ((InternalEList<?>)getVerification()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONSENT__PROVISION:
				return basicSetProvision(null, msgs);
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
			case FhirPackage.CONSENT__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.CONSENT__STATUS:
				return getStatus();
			case FhirPackage.CONSENT__SCOPE:
				return getScope();
			case FhirPackage.CONSENT__CATEGORY:
				return getCategory();
			case FhirPackage.CONSENT__PATIENT:
				return getPatient();
			case FhirPackage.CONSENT__DATE_TIME:
				return getDateTime();
			case FhirPackage.CONSENT__PERFORMER:
				return getPerformer();
			case FhirPackage.CONSENT__ORGANIZATION:
				return getOrganization();
			case FhirPackage.CONSENT__SOURCE_ATTACHMENT:
				return getSourceAttachment();
			case FhirPackage.CONSENT__SOURCE_REFERENCE:
				return getSourceReference();
			case FhirPackage.CONSENT__POLICY:
				return getPolicy();
			case FhirPackage.CONSENT__POLICY_RULE:
				return getPolicyRule();
			case FhirPackage.CONSENT__VERIFICATION:
				return getVerification();
			case FhirPackage.CONSENT__PROVISION:
				return getProvision();
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
			case FhirPackage.CONSENT__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.CONSENT__STATUS:
				setStatus((ConsentState)newValue);
				return;
			case FhirPackage.CONSENT__SCOPE:
				setScope((CodeableConcept)newValue);
				return;
			case FhirPackage.CONSENT__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CONSENT__PATIENT:
				setPatient((Reference)newValue);
				return;
			case FhirPackage.CONSENT__DATE_TIME:
				setDateTime((DateTime)newValue);
				return;
			case FhirPackage.CONSENT__PERFORMER:
				getPerformer().clear();
				getPerformer().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CONSENT__ORGANIZATION:
				getOrganization().clear();
				getOrganization().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CONSENT__SOURCE_ATTACHMENT:
				setSourceAttachment((Attachment)newValue);
				return;
			case FhirPackage.CONSENT__SOURCE_REFERENCE:
				setSourceReference((Reference)newValue);
				return;
			case FhirPackage.CONSENT__POLICY:
				getPolicy().clear();
				getPolicy().addAll((Collection<? extends ConsentPolicy>)newValue);
				return;
			case FhirPackage.CONSENT__POLICY_RULE:
				setPolicyRule((CodeableConcept)newValue);
				return;
			case FhirPackage.CONSENT__VERIFICATION:
				getVerification().clear();
				getVerification().addAll((Collection<? extends ConsentVerification>)newValue);
				return;
			case FhirPackage.CONSENT__PROVISION:
				setProvision((ConsentProvision)newValue);
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
			case FhirPackage.CONSENT__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.CONSENT__STATUS:
				setStatus((ConsentState)null);
				return;
			case FhirPackage.CONSENT__SCOPE:
				setScope((CodeableConcept)null);
				return;
			case FhirPackage.CONSENT__CATEGORY:
				getCategory().clear();
				return;
			case FhirPackage.CONSENT__PATIENT:
				setPatient((Reference)null);
				return;
			case FhirPackage.CONSENT__DATE_TIME:
				setDateTime((DateTime)null);
				return;
			case FhirPackage.CONSENT__PERFORMER:
				getPerformer().clear();
				return;
			case FhirPackage.CONSENT__ORGANIZATION:
				getOrganization().clear();
				return;
			case FhirPackage.CONSENT__SOURCE_ATTACHMENT:
				setSourceAttachment((Attachment)null);
				return;
			case FhirPackage.CONSENT__SOURCE_REFERENCE:
				setSourceReference((Reference)null);
				return;
			case FhirPackage.CONSENT__POLICY:
				getPolicy().clear();
				return;
			case FhirPackage.CONSENT__POLICY_RULE:
				setPolicyRule((CodeableConcept)null);
				return;
			case FhirPackage.CONSENT__VERIFICATION:
				getVerification().clear();
				return;
			case FhirPackage.CONSENT__PROVISION:
				setProvision((ConsentProvision)null);
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
			case FhirPackage.CONSENT__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.CONSENT__STATUS:
				return status != null;
			case FhirPackage.CONSENT__SCOPE:
				return scope != null;
			case FhirPackage.CONSENT__CATEGORY:
				return category != null && !category.isEmpty();
			case FhirPackage.CONSENT__PATIENT:
				return patient != null;
			case FhirPackage.CONSENT__DATE_TIME:
				return dateTime != null;
			case FhirPackage.CONSENT__PERFORMER:
				return performer != null && !performer.isEmpty();
			case FhirPackage.CONSENT__ORGANIZATION:
				return organization != null && !organization.isEmpty();
			case FhirPackage.CONSENT__SOURCE_ATTACHMENT:
				return sourceAttachment != null;
			case FhirPackage.CONSENT__SOURCE_REFERENCE:
				return sourceReference != null;
			case FhirPackage.CONSENT__POLICY:
				return policy != null && !policy.isEmpty();
			case FhirPackage.CONSENT__POLICY_RULE:
				return policyRule != null;
			case FhirPackage.CONSENT__VERIFICATION:
				return verification != null && !verification.isEmpty();
			case FhirPackage.CONSENT__PROVISION:
				return provision != null;
		}
		return super.eIsSet(featureID);
	}

} //ConsentImpl
