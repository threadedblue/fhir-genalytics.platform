/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Report Action2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A summary of information based on the results of executing a TestScript.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.TestReportAction2#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getTestReportAction2()
 * @model extendedMetaData="name='TestReport.Action2' kind='elementOnly'"
 * @generated
 */
public interface TestReportAction2 extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An operation would involve a REST request to a server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference.
	 * @see #setOperation(TestReportOperation)
	 * @see org.hl7.fhir.FhirPackage#getTestReportAction2_Operation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='operation' namespace='##targetNamespace'"
	 * @generated
	 */
	TestReportOperation getOperation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestReportAction2#getOperation <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' containment reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(TestReportOperation value);

} // TestReportAction2
