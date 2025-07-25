/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.Attachment;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.SubstanceProteinSubunit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Protein Subunit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SubstanceProteinSubunitImpl#getSubunit <em>Subunit</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceProteinSubunitImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceProteinSubunitImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceProteinSubunitImpl#getSequenceAttachment <em>Sequence Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceProteinSubunitImpl#getNTerminalModificationId <em>NTerminal Modification Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceProteinSubunitImpl#getNTerminalModification <em>NTerminal Modification</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceProteinSubunitImpl#getCTerminalModificationId <em>CTerminal Modification Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceProteinSubunitImpl#getCTerminalModification <em>CTerminal Modification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceProteinSubunitImpl extends BackboneElementImpl implements SubstanceProteinSubunit {
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
	 * The cached value of the '{@link #getNTerminalModificationId() <em>NTerminal Modification Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNTerminalModificationId()
	 * @generated
	 * @ordered
	 */
	protected Identifier nTerminalModificationId;

	/**
	 * The cached value of the '{@link #getNTerminalModification() <em>NTerminal Modification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNTerminalModification()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String nTerminalModification;

	/**
	 * The cached value of the '{@link #getCTerminalModificationId() <em>CTerminal Modification Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTerminalModificationId()
	 * @generated
	 * @ordered
	 */
	protected Identifier cTerminalModificationId;

	/**
	 * The cached value of the '{@link #getCTerminalModification() <em>CTerminal Modification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTerminalModification()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String cTerminalModification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceProteinSubunitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSubstanceProteinSubunit();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__SUBUNIT, oldSubunit, newSubunit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
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
				msgs = ((InternalEObject)subunit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__SUBUNIT, null, msgs);
			if (newSubunit != null)
				msgs = ((InternalEObject)newSubunit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__SUBUNIT, null, msgs);
			msgs = basicSetSubunit(newSubunit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__SUBUNIT, newSubunit, newSubunit));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__SEQUENCE, oldSequence, newSequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
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
				msgs = ((InternalEObject)sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__SEQUENCE, null, msgs);
			if (newSequence != null)
				msgs = ((InternalEObject)newSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__SEQUENCE, null, msgs);
			msgs = basicSetSequence(newSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__SEQUENCE, newSequence, newSequence));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__LENGTH, oldLength, newLength);
			if (msgs == null) msgs = notification; else msgs.add(notification);
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
				msgs = ((InternalEObject)length).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__LENGTH, null, msgs);
			if (newLength != null)
				msgs = ((InternalEObject)newLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__LENGTH, null, msgs);
			msgs = basicSetLength(newLength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__LENGTH, newLength, newLength));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__SEQUENCE_ATTACHMENT, oldSequenceAttachment, newSequenceAttachment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
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
				msgs = ((InternalEObject)sequenceAttachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__SEQUENCE_ATTACHMENT, null, msgs);
			if (newSequenceAttachment != null)
				msgs = ((InternalEObject)newSequenceAttachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__SEQUENCE_ATTACHMENT, null, msgs);
			msgs = basicSetSequenceAttachment(newSequenceAttachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__SEQUENCE_ATTACHMENT, newSequenceAttachment, newSequenceAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier getNTerminalModificationId() {
		return nTerminalModificationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNTerminalModificationId(Identifier newNTerminalModificationId, NotificationChain msgs) {
		Identifier oldNTerminalModificationId = nTerminalModificationId;
		nTerminalModificationId = newNTerminalModificationId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__NTERMINAL_MODIFICATION_ID, oldNTerminalModificationId, newNTerminalModificationId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNTerminalModificationId(Identifier newNTerminalModificationId) {
		if (newNTerminalModificationId != nTerminalModificationId) {
			NotificationChain msgs = null;
			if (nTerminalModificationId != null)
				msgs = ((InternalEObject)nTerminalModificationId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__NTERMINAL_MODIFICATION_ID, null, msgs);
			if (newNTerminalModificationId != null)
				msgs = ((InternalEObject)newNTerminalModificationId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__NTERMINAL_MODIFICATION_ID, null, msgs);
			msgs = basicSetNTerminalModificationId(newNTerminalModificationId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__NTERMINAL_MODIFICATION_ID, newNTerminalModificationId, newNTerminalModificationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getNTerminalModification() {
		return nTerminalModification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNTerminalModification(org.hl7.fhir.String newNTerminalModification, NotificationChain msgs) {
		org.hl7.fhir.String oldNTerminalModification = nTerminalModification;
		nTerminalModification = newNTerminalModification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__NTERMINAL_MODIFICATION, oldNTerminalModification, newNTerminalModification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNTerminalModification(org.hl7.fhir.String newNTerminalModification) {
		if (newNTerminalModification != nTerminalModification) {
			NotificationChain msgs = null;
			if (nTerminalModification != null)
				msgs = ((InternalEObject)nTerminalModification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__NTERMINAL_MODIFICATION, null, msgs);
			if (newNTerminalModification != null)
				msgs = ((InternalEObject)newNTerminalModification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__NTERMINAL_MODIFICATION, null, msgs);
			msgs = basicSetNTerminalModification(newNTerminalModification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__NTERMINAL_MODIFICATION, newNTerminalModification, newNTerminalModification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier getCTerminalModificationId() {
		return cTerminalModificationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCTerminalModificationId(Identifier newCTerminalModificationId, NotificationChain msgs) {
		Identifier oldCTerminalModificationId = cTerminalModificationId;
		cTerminalModificationId = newCTerminalModificationId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__CTERMINAL_MODIFICATION_ID, oldCTerminalModificationId, newCTerminalModificationId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCTerminalModificationId(Identifier newCTerminalModificationId) {
		if (newCTerminalModificationId != cTerminalModificationId) {
			NotificationChain msgs = null;
			if (cTerminalModificationId != null)
				msgs = ((InternalEObject)cTerminalModificationId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__CTERMINAL_MODIFICATION_ID, null, msgs);
			if (newCTerminalModificationId != null)
				msgs = ((InternalEObject)newCTerminalModificationId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__CTERMINAL_MODIFICATION_ID, null, msgs);
			msgs = basicSetCTerminalModificationId(newCTerminalModificationId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__CTERMINAL_MODIFICATION_ID, newCTerminalModificationId, newCTerminalModificationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getCTerminalModification() {
		return cTerminalModification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCTerminalModification(org.hl7.fhir.String newCTerminalModification, NotificationChain msgs) {
		org.hl7.fhir.String oldCTerminalModification = cTerminalModification;
		cTerminalModification = newCTerminalModification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__CTERMINAL_MODIFICATION, oldCTerminalModification, newCTerminalModification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCTerminalModification(org.hl7.fhir.String newCTerminalModification) {
		if (newCTerminalModification != cTerminalModification) {
			NotificationChain msgs = null;
			if (cTerminalModification != null)
				msgs = ((InternalEObject)cTerminalModification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__CTERMINAL_MODIFICATION, null, msgs);
			if (newCTerminalModification != null)
				msgs = ((InternalEObject)newCTerminalModification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__CTERMINAL_MODIFICATION, null, msgs);
			msgs = basicSetCTerminalModification(newCTerminalModification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__CTERMINAL_MODIFICATION, newCTerminalModification, newCTerminalModification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__SUBUNIT:
				return basicSetSubunit(null, msgs);
			case FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__SEQUENCE:
				return basicSetSequence(null, msgs);
			case FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__LENGTH:
				return basicSetLength(null, msgs);
			case FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__SEQUENCE_ATTACHMENT:
				return basicSetSequenceAttachment(null, msgs);
			case FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__NTERMINAL_MODIFICATION_ID:
				return basicSetNTerminalModificationId(null, msgs);
			case FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__NTERMINAL_MODIFICATION:
				return basicSetNTerminalModification(null, msgs);
			case FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__CTERMINAL_MODIFICATION_ID:
				return basicSetCTerminalModificationId(null, msgs);
			case FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__CTERMINAL_MODIFICATION:
				return basicSetCTerminalModification(null, msgs);
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
			case FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__SUBUNIT:
				return getSubunit();
			case FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__SEQUENCE:
				return getSequence();
			case FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__LENGTH:
				return getLength();
			case FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__SEQUENCE_ATTACHMENT:
				return getSequenceAttachment();
			case FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__NTERMINAL_MODIFICATION_ID:
				return getNTerminalModificationId();
			case FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__NTERMINAL_MODIFICATION:
				return getNTerminalModification();
			case FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__CTERMINAL_MODIFICATION_ID:
				return getCTerminalModificationId();
			case FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__CTERMINAL_MODIFICATION:
				return getCTerminalModification();
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
			case FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__SUBUNIT:
				setSubunit((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__SEQUENCE:
				setSequence((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__LENGTH:
				setLength((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__SEQUENCE_ATTACHMENT:
				setSequenceAttachment((Attachment)newValue);
				return;
			case FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__NTERMINAL_MODIFICATION_ID:
				setNTerminalModificationId((Identifier)newValue);
				return;
			case FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__NTERMINAL_MODIFICATION:
				setNTerminalModification((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__CTERMINAL_MODIFICATION_ID:
				setCTerminalModificationId((Identifier)newValue);
				return;
			case FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__CTERMINAL_MODIFICATION:
				setCTerminalModification((org.hl7.fhir.String)newValue);
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
			case FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__SUBUNIT:
				setSubunit((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__SEQUENCE:
				setSequence((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__LENGTH:
				setLength((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__SEQUENCE_ATTACHMENT:
				setSequenceAttachment((Attachment)null);
				return;
			case FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__NTERMINAL_MODIFICATION_ID:
				setNTerminalModificationId((Identifier)null);
				return;
			case FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__NTERMINAL_MODIFICATION:
				setNTerminalModification((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__CTERMINAL_MODIFICATION_ID:
				setCTerminalModificationId((Identifier)null);
				return;
			case FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__CTERMINAL_MODIFICATION:
				setCTerminalModification((org.hl7.fhir.String)null);
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
			case FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__SUBUNIT:
				return subunit != null;
			case FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__SEQUENCE:
				return sequence != null;
			case FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__LENGTH:
				return length != null;
			case FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__SEQUENCE_ATTACHMENT:
				return sequenceAttachment != null;
			case FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__NTERMINAL_MODIFICATION_ID:
				return nTerminalModificationId != null;
			case FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__NTERMINAL_MODIFICATION:
				return nTerminalModification != null;
			case FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__CTERMINAL_MODIFICATION_ID:
				return cTerminalModificationId != null;
			case FhirPackage.SUBSTANCE_PROTEIN_SUBUNIT__CTERMINAL_MODIFICATION:
				return cTerminalModification != null;
		}
		return super.eIsSet(featureID);
	}

} //SubstanceProteinSubunitImpl
