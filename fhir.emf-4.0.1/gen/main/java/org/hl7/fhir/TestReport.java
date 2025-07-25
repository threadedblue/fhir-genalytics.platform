/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Report</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A summary of information based on the results of executing a TestScript.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.TestReport#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.TestReport#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.TestReport#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.TestReport#getTestScript <em>Test Script</em>}</li>
 *   <li>{@link org.hl7.fhir.TestReport#getResult <em>Result</em>}</li>
 *   <li>{@link org.hl7.fhir.TestReport#getScore <em>Score</em>}</li>
 *   <li>{@link org.hl7.fhir.TestReport#getTester <em>Tester</em>}</li>
 *   <li>{@link org.hl7.fhir.TestReport#getIssued <em>Issued</em>}</li>
 *   <li>{@link org.hl7.fhir.TestReport#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.hl7.fhir.TestReport#getSetup <em>Setup</em>}</li>
 *   <li>{@link org.hl7.fhir.TestReport#getTest <em>Test</em>}</li>
 *   <li>{@link org.hl7.fhir.TestReport#getTeardown <em>Teardown</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getTestReport()
 * @model extendedMetaData="name='TestReport' kind='elementOnly'"
 * @generated
 */
public interface TestReport extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier for the TestScript assigned for external purposes outside the context of FHIR.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getTestReport_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestReport#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free text natural language name identifying the executed TestScript.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getTestReport_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestReport#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current state of this test report.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(TestReportStatus)
	 * @see org.hl7.fhir.FhirPackage#getTestReport_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	TestReportStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestReport#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(TestReportStatus value);

	/**
	 * Returns the value of the '<em><b>Test Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ideally this is an absolute URL that is used to identify the version-specific TestScript that was executed, matching the `TestScript.url`.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test Script</em>' containment reference.
	 * @see #setTestScript(Reference)
	 * @see org.hl7.fhir.FhirPackage#getTestReport_TestScript()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='testScript' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getTestScript();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestReport#getTestScript <em>Test Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Script</em>' containment reference.
	 * @see #getTestScript()
	 * @generated
	 */
	void setTestScript(Reference value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The overall result from the execution of the TestScript.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(TestReportResult)
	 * @see org.hl7.fhir.FhirPackage#getTestReport_Result()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='result' namespace='##targetNamespace'"
	 * @generated
	 */
	TestReportResult getResult();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestReport#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(TestReportResult value);

	/**
	 * Returns the value of the '<em><b>Score</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The final score (percentage of tests passed) resulting from the execution of the TestScript.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Score</em>' containment reference.
	 * @see #setScore(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getTestReport_Score()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='score' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getScore();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestReport#getScore <em>Score</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' containment reference.
	 * @see #getScore()
	 * @generated
	 */
	void setScore(Decimal value);

	/**
	 * Returns the value of the '<em><b>Tester</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the tester producing this report (Organization or individual).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tester</em>' containment reference.
	 * @see #setTester(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getTestReport_Tester()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tester' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getTester();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestReport#getTester <em>Tester</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tester</em>' containment reference.
	 * @see #getTester()
	 * @generated
	 */
	void setTester(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When the TestScript was executed and this TestReport was generated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issued</em>' containment reference.
	 * @see #setIssued(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getTestReport_Issued()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='issued' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getIssued();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestReport#getIssued <em>Issued</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issued</em>' containment reference.
	 * @see #getIssued()
	 * @generated
	 */
	void setIssued(DateTime value);

	/**
	 * Returns the value of the '<em><b>Participant</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.TestReportParticipant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A participant in the test execution, either the execution engine, a client, or a server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Participant</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTestReport_Participant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='participant' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TestReportParticipant> getParticipant();

	/**
	 * Returns the value of the '<em><b>Setup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The results of the series of required setup operations before the tests were executed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Setup</em>' containment reference.
	 * @see #setSetup(TestReportSetup)
	 * @see org.hl7.fhir.FhirPackage#getTestReport_Setup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='setup' namespace='##targetNamespace'"
	 * @generated
	 */
	TestReportSetup getSetup();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestReport#getSetup <em>Setup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setup</em>' containment reference.
	 * @see #getSetup()
	 * @generated
	 */
	void setSetup(TestReportSetup value);

	/**
	 * Returns the value of the '<em><b>Test</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.TestReportTest}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A test executed from the test script.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTestReport_Test()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='test' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TestReportTest> getTest();

	/**
	 * Returns the value of the '<em><b>Teardown</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The results of the series of operations required to clean up after all the tests were executed (successfully or otherwise).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Teardown</em>' containment reference.
	 * @see #setTeardown(TestReportTeardown)
	 * @see org.hl7.fhir.FhirPackage#getTestReport_Teardown()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='teardown' namespace='##targetNamespace'"
	 * @generated
	 */
	TestReportTeardown getTeardown();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestReport#getTeardown <em>Teardown</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Teardown</em>' containment reference.
	 * @see #getTeardown()
	 * @generated
	 */
	void setTeardown(TestReportTeardown value);

} // TestReport
