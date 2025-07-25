/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.MolecularSequenceQuality;
import org.hl7.fhir.MolecularSequenceRoc;
import org.hl7.fhir.QualityType;
import org.hl7.fhir.Quantity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Molecular Sequence Quality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceQualityImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceQualityImpl#getStandardSequence <em>Standard Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceQualityImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceQualityImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceQualityImpl#getScore <em>Score</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceQualityImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceQualityImpl#getTruthTP <em>Truth TP</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceQualityImpl#getQueryTP <em>Query TP</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceQualityImpl#getTruthFN <em>Truth FN</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceQualityImpl#getQueryFP <em>Query FP</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceQualityImpl#getGtFP <em>Gt FP</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceQualityImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceQualityImpl#getRecall <em>Recall</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceQualityImpl#getFScore <em>FScore</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MolecularSequenceQualityImpl#getRoc <em>Roc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MolecularSequenceQualityImpl extends BackboneElementImpl implements MolecularSequenceQuality {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected QualityType type;

	/**
	 * The cached value of the '{@link #getStandardSequence() <em>Standard Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardSequence()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept standardSequence;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer start;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer end;

	/**
	 * The cached value of the '{@link #getScore() <em>Score</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected Quantity score;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept method;

	/**
	 * The cached value of the '{@link #getTruthTP() <em>Truth TP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTruthTP()
	 * @generated
	 * @ordered
	 */
	protected Decimal truthTP;

	/**
	 * The cached value of the '{@link #getQueryTP() <em>Query TP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryTP()
	 * @generated
	 * @ordered
	 */
	protected Decimal queryTP;

	/**
	 * The cached value of the '{@link #getTruthFN() <em>Truth FN</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTruthFN()
	 * @generated
	 * @ordered
	 */
	protected Decimal truthFN;

	/**
	 * The cached value of the '{@link #getQueryFP() <em>Query FP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryFP()
	 * @generated
	 * @ordered
	 */
	protected Decimal queryFP;

	/**
	 * The cached value of the '{@link #getGtFP() <em>Gt FP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGtFP()
	 * @generated
	 * @ordered
	 */
	protected Decimal gtFP;

	/**
	 * The cached value of the '{@link #getPrecision() <em>Precision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected Decimal precision;

	/**
	 * The cached value of the '{@link #getRecall() <em>Recall</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecall()
	 * @generated
	 * @ordered
	 */
	protected Decimal recall;

	/**
	 * The cached value of the '{@link #getFScore() <em>FScore</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFScore()
	 * @generated
	 * @ordered
	 */
	protected Decimal fScore;

	/**
	 * The cached value of the '{@link #getRoc() <em>Roc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoc()
	 * @generated
	 * @ordered
	 */
	protected MolecularSequenceRoc roc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MolecularSequenceQualityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMolecularSequenceQuality();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QualityType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(QualityType newType, NotificationChain msgs) {
		QualityType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_QUALITY__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(QualityType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_QUALITY__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_QUALITY__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_QUALITY__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getStandardSequence() {
		return standardSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStandardSequence(CodeableConcept newStandardSequence, NotificationChain msgs) {
		CodeableConcept oldStandardSequence = standardSequence;
		standardSequence = newStandardSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_QUALITY__STANDARD_SEQUENCE, oldStandardSequence, newStandardSequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStandardSequence(CodeableConcept newStandardSequence) {
		if (newStandardSequence != standardSequence) {
			NotificationChain msgs = null;
			if (standardSequence != null)
				msgs = ((InternalEObject)standardSequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_QUALITY__STANDARD_SEQUENCE, null, msgs);
			if (newStandardSequence != null)
				msgs = ((InternalEObject)newStandardSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_QUALITY__STANDARD_SEQUENCE, null, msgs);
			msgs = basicSetStandardSequence(newStandardSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_QUALITY__STANDARD_SEQUENCE, newStandardSequence, newStandardSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Integer getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(org.hl7.fhir.Integer newStart, NotificationChain msgs) {
		org.hl7.fhir.Integer oldStart = start;
		start = newStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_QUALITY__START, oldStart, newStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStart(org.hl7.fhir.Integer newStart) {
		if (newStart != start) {
			NotificationChain msgs = null;
			if (start != null)
				msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_QUALITY__START, null, msgs);
			if (newStart != null)
				msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_QUALITY__START, null, msgs);
			msgs = basicSetStart(newStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_QUALITY__START, newStart, newStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Integer getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(org.hl7.fhir.Integer newEnd, NotificationChain msgs) {
		org.hl7.fhir.Integer oldEnd = end;
		end = newEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_QUALITY__END, oldEnd, newEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd(org.hl7.fhir.Integer newEnd) {
		if (newEnd != end) {
			NotificationChain msgs = null;
			if (end != null)
				msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_QUALITY__END, null, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_QUALITY__END, null, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_QUALITY__END, newEnd, newEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getScore() {
		return score;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScore(Quantity newScore, NotificationChain msgs) {
		Quantity oldScore = score;
		score = newScore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_QUALITY__SCORE, oldScore, newScore);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScore(Quantity newScore) {
		if (newScore != score) {
			NotificationChain msgs = null;
			if (score != null)
				msgs = ((InternalEObject)score).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_QUALITY__SCORE, null, msgs);
			if (newScore != null)
				msgs = ((InternalEObject)newScore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_QUALITY__SCORE, null, msgs);
			msgs = basicSetScore(newScore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_QUALITY__SCORE, newScore, newScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethod(CodeableConcept newMethod, NotificationChain msgs) {
		CodeableConcept oldMethod = method;
		method = newMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_QUALITY__METHOD, oldMethod, newMethod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethod(CodeableConcept newMethod) {
		if (newMethod != method) {
			NotificationChain msgs = null;
			if (method != null)
				msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_QUALITY__METHOD, null, msgs);
			if (newMethod != null)
				msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_QUALITY__METHOD, null, msgs);
			msgs = basicSetMethod(newMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_QUALITY__METHOD, newMethod, newMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getTruthTP() {
		return truthTP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTruthTP(Decimal newTruthTP, NotificationChain msgs) {
		Decimal oldTruthTP = truthTP;
		truthTP = newTruthTP;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_QUALITY__TRUTH_TP, oldTruthTP, newTruthTP);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTruthTP(Decimal newTruthTP) {
		if (newTruthTP != truthTP) {
			NotificationChain msgs = null;
			if (truthTP != null)
				msgs = ((InternalEObject)truthTP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_QUALITY__TRUTH_TP, null, msgs);
			if (newTruthTP != null)
				msgs = ((InternalEObject)newTruthTP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_QUALITY__TRUTH_TP, null, msgs);
			msgs = basicSetTruthTP(newTruthTP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_QUALITY__TRUTH_TP, newTruthTP, newTruthTP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getQueryTP() {
		return queryTP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueryTP(Decimal newQueryTP, NotificationChain msgs) {
		Decimal oldQueryTP = queryTP;
		queryTP = newQueryTP;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_QUALITY__QUERY_TP, oldQueryTP, newQueryTP);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQueryTP(Decimal newQueryTP) {
		if (newQueryTP != queryTP) {
			NotificationChain msgs = null;
			if (queryTP != null)
				msgs = ((InternalEObject)queryTP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_QUALITY__QUERY_TP, null, msgs);
			if (newQueryTP != null)
				msgs = ((InternalEObject)newQueryTP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_QUALITY__QUERY_TP, null, msgs);
			msgs = basicSetQueryTP(newQueryTP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_QUALITY__QUERY_TP, newQueryTP, newQueryTP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getTruthFN() {
		return truthFN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTruthFN(Decimal newTruthFN, NotificationChain msgs) {
		Decimal oldTruthFN = truthFN;
		truthFN = newTruthFN;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_QUALITY__TRUTH_FN, oldTruthFN, newTruthFN);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTruthFN(Decimal newTruthFN) {
		if (newTruthFN != truthFN) {
			NotificationChain msgs = null;
			if (truthFN != null)
				msgs = ((InternalEObject)truthFN).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_QUALITY__TRUTH_FN, null, msgs);
			if (newTruthFN != null)
				msgs = ((InternalEObject)newTruthFN).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_QUALITY__TRUTH_FN, null, msgs);
			msgs = basicSetTruthFN(newTruthFN, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_QUALITY__TRUTH_FN, newTruthFN, newTruthFN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getQueryFP() {
		return queryFP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueryFP(Decimal newQueryFP, NotificationChain msgs) {
		Decimal oldQueryFP = queryFP;
		queryFP = newQueryFP;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_QUALITY__QUERY_FP, oldQueryFP, newQueryFP);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQueryFP(Decimal newQueryFP) {
		if (newQueryFP != queryFP) {
			NotificationChain msgs = null;
			if (queryFP != null)
				msgs = ((InternalEObject)queryFP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_QUALITY__QUERY_FP, null, msgs);
			if (newQueryFP != null)
				msgs = ((InternalEObject)newQueryFP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_QUALITY__QUERY_FP, null, msgs);
			msgs = basicSetQueryFP(newQueryFP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_QUALITY__QUERY_FP, newQueryFP, newQueryFP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getGtFP() {
		return gtFP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGtFP(Decimal newGtFP, NotificationChain msgs) {
		Decimal oldGtFP = gtFP;
		gtFP = newGtFP;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_QUALITY__GT_FP, oldGtFP, newGtFP);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGtFP(Decimal newGtFP) {
		if (newGtFP != gtFP) {
			NotificationChain msgs = null;
			if (gtFP != null)
				msgs = ((InternalEObject)gtFP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_QUALITY__GT_FP, null, msgs);
			if (newGtFP != null)
				msgs = ((InternalEObject)newGtFP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_QUALITY__GT_FP, null, msgs);
			msgs = basicSetGtFP(newGtFP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_QUALITY__GT_FP, newGtFP, newGtFP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getPrecision() {
		return precision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecision(Decimal newPrecision, NotificationChain msgs) {
		Decimal oldPrecision = precision;
		precision = newPrecision;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_QUALITY__PRECISION, oldPrecision, newPrecision);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrecision(Decimal newPrecision) {
		if (newPrecision != precision) {
			NotificationChain msgs = null;
			if (precision != null)
				msgs = ((InternalEObject)precision).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_QUALITY__PRECISION, null, msgs);
			if (newPrecision != null)
				msgs = ((InternalEObject)newPrecision).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_QUALITY__PRECISION, null, msgs);
			msgs = basicSetPrecision(newPrecision, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_QUALITY__PRECISION, newPrecision, newPrecision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getRecall() {
		return recall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecall(Decimal newRecall, NotificationChain msgs) {
		Decimal oldRecall = recall;
		recall = newRecall;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_QUALITY__RECALL, oldRecall, newRecall);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecall(Decimal newRecall) {
		if (newRecall != recall) {
			NotificationChain msgs = null;
			if (recall != null)
				msgs = ((InternalEObject)recall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_QUALITY__RECALL, null, msgs);
			if (newRecall != null)
				msgs = ((InternalEObject)newRecall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_QUALITY__RECALL, null, msgs);
			msgs = basicSetRecall(newRecall, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_QUALITY__RECALL, newRecall, newRecall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getFScore() {
		return fScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFScore(Decimal newFScore, NotificationChain msgs) {
		Decimal oldFScore = fScore;
		fScore = newFScore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_QUALITY__FSCORE, oldFScore, newFScore);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFScore(Decimal newFScore) {
		if (newFScore != fScore) {
			NotificationChain msgs = null;
			if (fScore != null)
				msgs = ((InternalEObject)fScore).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_QUALITY__FSCORE, null, msgs);
			if (newFScore != null)
				msgs = ((InternalEObject)newFScore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_QUALITY__FSCORE, null, msgs);
			msgs = basicSetFScore(newFScore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_QUALITY__FSCORE, newFScore, newFScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MolecularSequenceRoc getRoc() {
		return roc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoc(MolecularSequenceRoc newRoc, NotificationChain msgs) {
		MolecularSequenceRoc oldRoc = roc;
		roc = newRoc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_QUALITY__ROC, oldRoc, newRoc);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoc(MolecularSequenceRoc newRoc) {
		if (newRoc != roc) {
			NotificationChain msgs = null;
			if (roc != null)
				msgs = ((InternalEObject)roc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_QUALITY__ROC, null, msgs);
			if (newRoc != null)
				msgs = ((InternalEObject)newRoc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MOLECULAR_SEQUENCE_QUALITY__ROC, null, msgs);
			msgs = basicSetRoc(newRoc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MOLECULAR_SEQUENCE_QUALITY__ROC, newRoc, newRoc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__STANDARD_SEQUENCE:
				return basicSetStandardSequence(null, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__START:
				return basicSetStart(null, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__END:
				return basicSetEnd(null, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__SCORE:
				return basicSetScore(null, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__METHOD:
				return basicSetMethod(null, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__TRUTH_TP:
				return basicSetTruthTP(null, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__QUERY_TP:
				return basicSetQueryTP(null, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__TRUTH_FN:
				return basicSetTruthFN(null, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__QUERY_FP:
				return basicSetQueryFP(null, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__GT_FP:
				return basicSetGtFP(null, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__PRECISION:
				return basicSetPrecision(null, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__RECALL:
				return basicSetRecall(null, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__FSCORE:
				return basicSetFScore(null, msgs);
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__ROC:
				return basicSetRoc(null, msgs);
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
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__TYPE:
				return getType();
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__STANDARD_SEQUENCE:
				return getStandardSequence();
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__START:
				return getStart();
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__END:
				return getEnd();
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__SCORE:
				return getScore();
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__METHOD:
				return getMethod();
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__TRUTH_TP:
				return getTruthTP();
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__QUERY_TP:
				return getQueryTP();
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__TRUTH_FN:
				return getTruthFN();
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__QUERY_FP:
				return getQueryFP();
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__GT_FP:
				return getGtFP();
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__PRECISION:
				return getPrecision();
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__RECALL:
				return getRecall();
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__FSCORE:
				return getFScore();
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__ROC:
				return getRoc();
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
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__TYPE:
				setType((QualityType)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__STANDARD_SEQUENCE:
				setStandardSequence((CodeableConcept)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__START:
				setStart((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__END:
				setEnd((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__SCORE:
				setScore((Quantity)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__METHOD:
				setMethod((CodeableConcept)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__TRUTH_TP:
				setTruthTP((Decimal)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__QUERY_TP:
				setQueryTP((Decimal)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__TRUTH_FN:
				setTruthFN((Decimal)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__QUERY_FP:
				setQueryFP((Decimal)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__GT_FP:
				setGtFP((Decimal)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__PRECISION:
				setPrecision((Decimal)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__RECALL:
				setRecall((Decimal)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__FSCORE:
				setFScore((Decimal)newValue);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__ROC:
				setRoc((MolecularSequenceRoc)newValue);
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
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__TYPE:
				setType((QualityType)null);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__STANDARD_SEQUENCE:
				setStandardSequence((CodeableConcept)null);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__START:
				setStart((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__END:
				setEnd((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__SCORE:
				setScore((Quantity)null);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__METHOD:
				setMethod((CodeableConcept)null);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__TRUTH_TP:
				setTruthTP((Decimal)null);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__QUERY_TP:
				setQueryTP((Decimal)null);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__TRUTH_FN:
				setTruthFN((Decimal)null);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__QUERY_FP:
				setQueryFP((Decimal)null);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__GT_FP:
				setGtFP((Decimal)null);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__PRECISION:
				setPrecision((Decimal)null);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__RECALL:
				setRecall((Decimal)null);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__FSCORE:
				setFScore((Decimal)null);
				return;
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__ROC:
				setRoc((MolecularSequenceRoc)null);
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
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__TYPE:
				return type != null;
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__STANDARD_SEQUENCE:
				return standardSequence != null;
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__START:
				return start != null;
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__END:
				return end != null;
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__SCORE:
				return score != null;
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__METHOD:
				return method != null;
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__TRUTH_TP:
				return truthTP != null;
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__QUERY_TP:
				return queryTP != null;
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__TRUTH_FN:
				return truthFN != null;
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__QUERY_FP:
				return queryFP != null;
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__GT_FP:
				return gtFP != null;
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__PRECISION:
				return precision != null;
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__RECALL:
				return recall != null;
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__FSCORE:
				return fScore != null;
			case FhirPackage.MOLECULAR_SEQUENCE_QUALITY__ROC:
				return roc != null;
		}
		return super.eIsSet(featureID);
	}

} //MolecularSequenceQualityImpl
