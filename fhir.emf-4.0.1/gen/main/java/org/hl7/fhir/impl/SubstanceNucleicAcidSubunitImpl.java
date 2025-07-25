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
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.SubstanceNucleicAcidLinkage;
import org.hl7.fhir.SubstanceNucleicAcidSubunit;
import org.hl7.fhir.SubstanceNucleicAcidSugar;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Nucleic Acid Subunit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SubstanceNucleicAcidSubunitImpl#getSubunit <em>Subunit</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceNucleicAcidSubunitImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceNucleicAcidSubunitImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceNucleicAcidSubunitImpl#getSequenceAttachment <em>Sequence Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceNucleicAcidSubunitImpl#getFivePrime <em>Five Prime</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceNucleicAcidSubunitImpl#getThreePrime <em>Three Prime</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceNucleicAcidSubunitImpl#getLinkage <em>Linkage</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceNucleicAcidSubunitImpl#getSugar <em>Sugar</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceNucleicAcidSubunitImpl extends BackboneElementImpl implements SubstanceNucleicAcidSubunit {
	/**
	 * The cached value of the '{@link #getSubunit() <em>Subunit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubunit()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer subunit;

	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String sequence;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer length;

	/**
	 * The cached value of the '{@link #getSequenceAttachment() <em>Sequence Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceAttachment()
	 * @generated
	 * @ordered
	 */
	protected Attachment sequenceAttachment;

	/**
	 * The cached value of the '{@link #getFivePrime() <em>Five Prime</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFivePrime()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept fivePrime;

	/**
	 * The cached value of the '{@link #getThreePrime() <em>Three Prime</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreePrime()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept threePrime;

	/**
	 * The cached value of the '{@link #getLinkage() <em>Linkage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkage()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceNucleicAcidLinkage> linkage;

	/**
	 * The cached value of the '{@link #getSugar() <em>Sugar</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSugar()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceNucleicAcidSugar> sugar;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceNucleicAcidSubunitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSubstanceNucleicAcidSubunit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Integer getSubunit() {
		return subunit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubunit(org.hl7.fhir.Integer newSubunit, NotificationChain msgs) {
		org.hl7.fhir.Integer oldSubunit = subunit;
		subunit = newSubunit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SUBUNIT, oldSubunit, newSubunit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubunit(org.hl7.fhir.Integer newSubunit) {
		if (newSubunit != subunit) {
			NotificationChain msgs = null;
			if (subunit != null)
				msgs = ((InternalEObject)subunit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SUBUNIT, null, msgs);
			if (newSubunit != null)
				msgs = ((InternalEObject)newSubunit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SUBUNIT, null, msgs);
			msgs = basicSetSubunit(newSubunit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SUBUNIT, newSubunit, newSubunit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequence(org.hl7.fhir.String newSequence, NotificationChain msgs) {
		org.hl7.fhir.String oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SEQUENCE, oldSequence, newSequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequence(org.hl7.fhir.String newSequence) {
		if (newSequence != sequence) {
			NotificationChain msgs = null;
			if (sequence != null)
				msgs = ((InternalEObject)sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SEQUENCE, null, msgs);
			if (newSequence != null)
				msgs = ((InternalEObject)newSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SEQUENCE, null, msgs);
			msgs = basicSetSequence(newSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SEQUENCE, newSequence, newSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Integer getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLength(org.hl7.fhir.Integer newLength, NotificationChain msgs) {
		org.hl7.fhir.Integer oldLength = length;
		length = newLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__LENGTH, oldLength, newLength);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLength(org.hl7.fhir.Integer newLength) {
		if (newLength != length) {
			NotificationChain msgs = null;
			if (length != null)
				msgs = ((InternalEObject)length).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__LENGTH, null, msgs);
			if (newLength != null)
				msgs = ((InternalEObject)newLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__LENGTH, null, msgs);
			msgs = basicSetLength(newLength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__LENGTH, newLength, newLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attachment getSequenceAttachment() {
		return sequenceAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequenceAttachment(Attachment newSequenceAttachment, NotificationChain msgs) {
		Attachment oldSequenceAttachment = sequenceAttachment;
		sequenceAttachment = newSequenceAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SEQUENCE_ATTACHMENT, oldSequenceAttachment, newSequenceAttachment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequenceAttachment(Attachment newSequenceAttachment) {
		if (newSequenceAttachment != sequenceAttachment) {
			NotificationChain msgs = null;
			if (sequenceAttachment != null)
				msgs = ((InternalEObject)sequenceAttachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SEQUENCE_ATTACHMENT, null, msgs);
			if (newSequenceAttachment != null)
				msgs = ((InternalEObject)newSequenceAttachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SEQUENCE_ATTACHMENT, null, msgs);
			msgs = basicSetSequenceAttachment(newSequenceAttachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SEQUENCE_ATTACHMENT, newSequenceAttachment, newSequenceAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getFivePrime() {
		return fivePrime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFivePrime(CodeableConcept newFivePrime, NotificationChain msgs) {
		CodeableConcept oldFivePrime = fivePrime;
		fivePrime = newFivePrime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__FIVE_PRIME, oldFivePrime, newFivePrime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFivePrime(CodeableConcept newFivePrime) {
		if (newFivePrime != fivePrime) {
			NotificationChain msgs = null;
			if (fivePrime != null)
				msgs = ((InternalEObject)fivePrime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__FIVE_PRIME, null, msgs);
			if (newFivePrime != null)
				msgs = ((InternalEObject)newFivePrime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__FIVE_PRIME, null, msgs);
			msgs = basicSetFivePrime(newFivePrime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__FIVE_PRIME, newFivePrime, newFivePrime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getThreePrime() {
		return threePrime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThreePrime(CodeableConcept newThreePrime, NotificationChain msgs) {
		CodeableConcept oldThreePrime = threePrime;
		threePrime = newThreePrime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__THREE_PRIME, oldThreePrime, newThreePrime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThreePrime(CodeableConcept newThreePrime) {
		if (newThreePrime != threePrime) {
			NotificationChain msgs = null;
			if (threePrime != null)
				msgs = ((InternalEObject)threePrime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__THREE_PRIME, null, msgs);
			if (newThreePrime != null)
				msgs = ((InternalEObject)newThreePrime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__THREE_PRIME, null, msgs);
			msgs = basicSetThreePrime(newThreePrime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__THREE_PRIME, newThreePrime, newThreePrime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstanceNucleicAcidLinkage> getLinkage() {
		if (linkage == null) {
			linkage = new EObjectContainmentEList<SubstanceNucleicAcidLinkage>(SubstanceNucleicAcidLinkage.class, this, FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__LINKAGE);
		}
		return linkage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstanceNucleicAcidSugar> getSugar() {
		if (sugar == null) {
			sugar = new EObjectContainmentEList<SubstanceNucleicAcidSugar>(SubstanceNucleicAcidSugar.class, this, FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SUGAR);
		}
		return sugar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SUBUNIT:
				return basicSetSubunit(null, msgs);
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SEQUENCE:
				return basicSetSequence(null, msgs);
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__LENGTH:
				return basicSetLength(null, msgs);
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SEQUENCE_ATTACHMENT:
				return basicSetSequenceAttachment(null, msgs);
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__FIVE_PRIME:
				return basicSetFivePrime(null, msgs);
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__THREE_PRIME:
				return basicSetThreePrime(null, msgs);
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__LINKAGE:
				return ((InternalEList<?>)getLinkage()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SUGAR:
				return ((InternalEList<?>)getSugar()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SUBUNIT:
				return getSubunit();
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SEQUENCE:
				return getSequence();
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__LENGTH:
				return getLength();
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SEQUENCE_ATTACHMENT:
				return getSequenceAttachment();
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__FIVE_PRIME:
				return getFivePrime();
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__THREE_PRIME:
				return getThreePrime();
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__LINKAGE:
				return getLinkage();
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SUGAR:
				return getSugar();
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
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SUBUNIT:
				setSubunit((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SEQUENCE:
				setSequence((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__LENGTH:
				setLength((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SEQUENCE_ATTACHMENT:
				setSequenceAttachment((Attachment)newValue);
				return;
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__FIVE_PRIME:
				setFivePrime((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__THREE_PRIME:
				setThreePrime((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__LINKAGE:
				getLinkage().clear();
				getLinkage().addAll((Collection<? extends SubstanceNucleicAcidLinkage>)newValue);
				return;
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SUGAR:
				getSugar().clear();
				getSugar().addAll((Collection<? extends SubstanceNucleicAcidSugar>)newValue);
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
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SUBUNIT:
				setSubunit((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SEQUENCE:
				setSequence((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__LENGTH:
				setLength((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SEQUENCE_ATTACHMENT:
				setSequenceAttachment((Attachment)null);
				return;
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__FIVE_PRIME:
				setFivePrime((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__THREE_PRIME:
				setThreePrime((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__LINKAGE:
				getLinkage().clear();
				return;
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SUGAR:
				getSugar().clear();
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
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SUBUNIT:
				return subunit != null;
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SEQUENCE:
				return sequence != null;
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__LENGTH:
				return length != null;
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SEQUENCE_ATTACHMENT:
				return sequenceAttachment != null;
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__FIVE_PRIME:
				return fivePrime != null;
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__THREE_PRIME:
				return threePrime != null;
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__LINKAGE:
				return linkage != null && !linkage.isEmpty();
			case FhirPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT__SUGAR:
				return sugar != null && !sugar.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubstanceNucleicAcidSubunitImpl
