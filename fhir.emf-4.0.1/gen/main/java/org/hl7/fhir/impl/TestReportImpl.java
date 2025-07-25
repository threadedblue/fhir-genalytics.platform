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

import org.hl7.fhir.DateTime;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;
import org.hl7.fhir.TestReport;
import org.hl7.fhir.TestReportParticipant;
import org.hl7.fhir.TestReportResult;
import org.hl7.fhir.TestReportSetup;
import org.hl7.fhir.TestReportStatus;
import org.hl7.fhir.TestReportTeardown;
import org.hl7.fhir.TestReportTest;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.TestReportImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestReportImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestReportImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestReportImpl#getTestScript <em>Test Script</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestReportImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestReportImpl#getScore <em>Score</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestReportImpl#getTester <em>Tester</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestReportImpl#getIssued <em>Issued</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestReportImpl#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestReportImpl#getSetup <em>Setup</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestReportImpl#getTest <em>Test</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestReportImpl#getTeardown <em>Teardown</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestReportImpl extends DomainResourceImpl implements TestReport {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String name;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected TestReportStatus status;

	/**
	 * The cached value of the '{@link #getTestScript() <em>Test Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestScript()
	 * @generated
	 * @ordered
	 */
	protected Reference testScript;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected TestReportResult result;

	/**
	 * The cached value of the '{@link #getScore() <em>Score</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected Decimal score;

	/**
	 * The cached value of the '{@link #getTester() <em>Tester</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTester()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String tester;

	/**
	 * The cached value of the '{@link #getIssued() <em>Issued</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssued()
	 * @generated
	 * @ordered
	 */
	protected DateTime issued;

	/**
	 * The cached value of the '{@link #getParticipant() <em>Participant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipant()
	 * @generated
	 * @ordered
	 */
	protected EList<TestReportParticipant> participant;

	/**
	 * The cached value of the '{@link #getSetup() <em>Setup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetup()
	 * @generated
	 * @ordered
	 */
	protected TestReportSetup setup;

	/**
	 * The cached value of the '{@link #getTest() <em>Test</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTest()
	 * @generated
	 * @ordered
	 */
	protected EList<TestReportTest> test;

	/**
	 * The cached value of the '{@link #getTeardown() <em>Teardown</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeardown()
	 * @generated
	 * @ordered
	 */
	protected TestReportTeardown teardown;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestReportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getTestReport();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Identifier newIdentifier, NotificationChain msgs) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_REPORT__IDENTIFIER, oldIdentifier, newIdentifier);
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
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_REPORT__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_REPORT__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_REPORT__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(org.hl7.fhir.String newName, NotificationChain msgs) {
		org.hl7.fhir.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_REPORT__NAME, oldName, newName);
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
	public void setName(org.hl7.fhir.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_REPORT__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_REPORT__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_REPORT__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestReportStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(TestReportStatus newStatus, NotificationChain msgs) {
		TestReportStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_REPORT__STATUS, oldStatus, newStatus);
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
	public void setStatus(TestReportStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_REPORT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_REPORT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_REPORT__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getTestScript() {
		return testScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTestScript(Reference newTestScript, NotificationChain msgs) {
		Reference oldTestScript = testScript;
		testScript = newTestScript;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_REPORT__TEST_SCRIPT, oldTestScript, newTestScript);
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
	public void setTestScript(Reference newTestScript) {
		if (newTestScript != testScript) {
			NotificationChain msgs = null;
			if (testScript != null)
				msgs = ((InternalEObject)testScript).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_REPORT__TEST_SCRIPT, null, msgs);
			if (newTestScript != null)
				msgs = ((InternalEObject)newTestScript).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_REPORT__TEST_SCRIPT, null, msgs);
			msgs = basicSetTestScript(newTestScript, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_REPORT__TEST_SCRIPT, newTestScript, newTestScript));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestReportResult getResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResult(TestReportResult newResult, NotificationChain msgs) {
		TestReportResult oldResult = result;
		result = newResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_REPORT__RESULT, oldResult, newResult);
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
	public void setResult(TestReportResult newResult) {
		if (newResult != result) {
			NotificationChain msgs = null;
			if (result != null)
				msgs = ((InternalEObject)result).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_REPORT__RESULT, null, msgs);
			if (newResult != null)
				msgs = ((InternalEObject)newResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_REPORT__RESULT, null, msgs);
			msgs = basicSetResult(newResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_REPORT__RESULT, newResult, newResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getScore() {
		return score;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScore(Decimal newScore, NotificationChain msgs) {
		Decimal oldScore = score;
		score = newScore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_REPORT__SCORE, oldScore, newScore);
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
	public void setScore(Decimal newScore) {
		if (newScore != score) {
			NotificationChain msgs = null;
			if (score != null)
				msgs = ((InternalEObject)score).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_REPORT__SCORE, null, msgs);
			if (newScore != null)
				msgs = ((InternalEObject)newScore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_REPORT__SCORE, null, msgs);
			msgs = basicSetScore(newScore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_REPORT__SCORE, newScore, newScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getTester() {
		return tester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTester(org.hl7.fhir.String newTester, NotificationChain msgs) {
		org.hl7.fhir.String oldTester = tester;
		tester = newTester;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_REPORT__TESTER, oldTester, newTester);
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
	public void setTester(org.hl7.fhir.String newTester) {
		if (newTester != tester) {
			NotificationChain msgs = null;
			if (tester != null)
				msgs = ((InternalEObject)tester).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_REPORT__TESTER, null, msgs);
			if (newTester != null)
				msgs = ((InternalEObject)newTester).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_REPORT__TESTER, null, msgs);
			msgs = basicSetTester(newTester, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_REPORT__TESTER, newTester, newTester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getIssued() {
		return issued;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssued(DateTime newIssued, NotificationChain msgs) {
		DateTime oldIssued = issued;
		issued = newIssued;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_REPORT__ISSUED, oldIssued, newIssued);
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
	public void setIssued(DateTime newIssued) {
		if (newIssued != issued) {
			NotificationChain msgs = null;
			if (issued != null)
				msgs = ((InternalEObject)issued).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_REPORT__ISSUED, null, msgs);
			if (newIssued != null)
				msgs = ((InternalEObject)newIssued).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_REPORT__ISSUED, null, msgs);
			msgs = basicSetIssued(newIssued, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_REPORT__ISSUED, newIssued, newIssued));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TestReportParticipant> getParticipant() {
		if (participant == null) {
			participant = new EObjectContainmentEList<TestReportParticipant>(TestReportParticipant.class, this, FhirPackage.TEST_REPORT__PARTICIPANT);
		}
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestReportSetup getSetup() {
		return setup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetup(TestReportSetup newSetup, NotificationChain msgs) {
		TestReportSetup oldSetup = setup;
		setup = newSetup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_REPORT__SETUP, oldSetup, newSetup);
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
	public void setSetup(TestReportSetup newSetup) {
		if (newSetup != setup) {
			NotificationChain msgs = null;
			if (setup != null)
				msgs = ((InternalEObject)setup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_REPORT__SETUP, null, msgs);
			if (newSetup != null)
				msgs = ((InternalEObject)newSetup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_REPORT__SETUP, null, msgs);
			msgs = basicSetSetup(newSetup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_REPORT__SETUP, newSetup, newSetup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TestReportTest> getTest() {
		if (test == null) {
			test = new EObjectContainmentEList<TestReportTest>(TestReportTest.class, this, FhirPackage.TEST_REPORT__TEST);
		}
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestReportTeardown getTeardown() {
		return teardown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTeardown(TestReportTeardown newTeardown, NotificationChain msgs) {
		TestReportTeardown oldTeardown = teardown;
		teardown = newTeardown;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_REPORT__TEARDOWN, oldTeardown, newTeardown);
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
	public void setTeardown(TestReportTeardown newTeardown) {
		if (newTeardown != teardown) {
			NotificationChain msgs = null;
			if (teardown != null)
				msgs = ((InternalEObject)teardown).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_REPORT__TEARDOWN, null, msgs);
			if (newTeardown != null)
				msgs = ((InternalEObject)newTeardown).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_REPORT__TEARDOWN, null, msgs);
			msgs = basicSetTeardown(newTeardown, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_REPORT__TEARDOWN, newTeardown, newTeardown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.TEST_REPORT__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.TEST_REPORT__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.TEST_REPORT__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.TEST_REPORT__TEST_SCRIPT:
				return basicSetTestScript(null, msgs);
			case FhirPackage.TEST_REPORT__RESULT:
				return basicSetResult(null, msgs);
			case FhirPackage.TEST_REPORT__SCORE:
				return basicSetScore(null, msgs);
			case FhirPackage.TEST_REPORT__TESTER:
				return basicSetTester(null, msgs);
			case FhirPackage.TEST_REPORT__ISSUED:
				return basicSetIssued(null, msgs);
			case FhirPackage.TEST_REPORT__PARTICIPANT:
				return ((InternalEList<?>)getParticipant()).basicRemove(otherEnd, msgs);
			case FhirPackage.TEST_REPORT__SETUP:
				return basicSetSetup(null, msgs);
			case FhirPackage.TEST_REPORT__TEST:
				return ((InternalEList<?>)getTest()).basicRemove(otherEnd, msgs);
			case FhirPackage.TEST_REPORT__TEARDOWN:
				return basicSetTeardown(null, msgs);
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
			case FhirPackage.TEST_REPORT__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.TEST_REPORT__NAME:
				return getName();
			case FhirPackage.TEST_REPORT__STATUS:
				return getStatus();
			case FhirPackage.TEST_REPORT__TEST_SCRIPT:
				return getTestScript();
			case FhirPackage.TEST_REPORT__RESULT:
				return getResult();
			case FhirPackage.TEST_REPORT__SCORE:
				return getScore();
			case FhirPackage.TEST_REPORT__TESTER:
				return getTester();
			case FhirPackage.TEST_REPORT__ISSUED:
				return getIssued();
			case FhirPackage.TEST_REPORT__PARTICIPANT:
				return getParticipant();
			case FhirPackage.TEST_REPORT__SETUP:
				return getSetup();
			case FhirPackage.TEST_REPORT__TEST:
				return getTest();
			case FhirPackage.TEST_REPORT__TEARDOWN:
				return getTeardown();
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
			case FhirPackage.TEST_REPORT__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.TEST_REPORT__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.TEST_REPORT__STATUS:
				setStatus((TestReportStatus)newValue);
				return;
			case FhirPackage.TEST_REPORT__TEST_SCRIPT:
				setTestScript((Reference)newValue);
				return;
			case FhirPackage.TEST_REPORT__RESULT:
				setResult((TestReportResult)newValue);
				return;
			case FhirPackage.TEST_REPORT__SCORE:
				setScore((Decimal)newValue);
				return;
			case FhirPackage.TEST_REPORT__TESTER:
				setTester((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.TEST_REPORT__ISSUED:
				setIssued((DateTime)newValue);
				return;
			case FhirPackage.TEST_REPORT__PARTICIPANT:
				getParticipant().clear();
				getParticipant().addAll((Collection<? extends TestReportParticipant>)newValue);
				return;
			case FhirPackage.TEST_REPORT__SETUP:
				setSetup((TestReportSetup)newValue);
				return;
			case FhirPackage.TEST_REPORT__TEST:
				getTest().clear();
				getTest().addAll((Collection<? extends TestReportTest>)newValue);
				return;
			case FhirPackage.TEST_REPORT__TEARDOWN:
				setTeardown((TestReportTeardown)newValue);
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
			case FhirPackage.TEST_REPORT__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.TEST_REPORT__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.TEST_REPORT__STATUS:
				setStatus((TestReportStatus)null);
				return;
			case FhirPackage.TEST_REPORT__TEST_SCRIPT:
				setTestScript((Reference)null);
				return;
			case FhirPackage.TEST_REPORT__RESULT:
				setResult((TestReportResult)null);
				return;
			case FhirPackage.TEST_REPORT__SCORE:
				setScore((Decimal)null);
				return;
			case FhirPackage.TEST_REPORT__TESTER:
				setTester((org.hl7.fhir.String)null);
				return;
			case FhirPackage.TEST_REPORT__ISSUED:
				setIssued((DateTime)null);
				return;
			case FhirPackage.TEST_REPORT__PARTICIPANT:
				getParticipant().clear();
				return;
			case FhirPackage.TEST_REPORT__SETUP:
				setSetup((TestReportSetup)null);
				return;
			case FhirPackage.TEST_REPORT__TEST:
				getTest().clear();
				return;
			case FhirPackage.TEST_REPORT__TEARDOWN:
				setTeardown((TestReportTeardown)null);
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
			case FhirPackage.TEST_REPORT__IDENTIFIER:
				return identifier != null;
			case FhirPackage.TEST_REPORT__NAME:
				return name != null;
			case FhirPackage.TEST_REPORT__STATUS:
				return status != null;
			case FhirPackage.TEST_REPORT__TEST_SCRIPT:
				return testScript != null;
			case FhirPackage.TEST_REPORT__RESULT:
				return result != null;
			case FhirPackage.TEST_REPORT__SCORE:
				return score != null;
			case FhirPackage.TEST_REPORT__TESTER:
				return tester != null;
			case FhirPackage.TEST_REPORT__ISSUED:
				return issued != null;
			case FhirPackage.TEST_REPORT__PARTICIPANT:
				return participant != null && !participant.isEmpty();
			case FhirPackage.TEST_REPORT__SETUP:
				return setup != null;
			case FhirPackage.TEST_REPORT__TEST:
				return test != null && !test.isEmpty();
			case FhirPackage.TEST_REPORT__TEARDOWN:
				return teardown != null;
		}
		return super.eIsSet(featureID);
	}

} //TestReportImpl
