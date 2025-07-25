/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Definition Udi Device Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The characteristics, operational status and capabilities of a medical-related component of a medical device.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.DeviceDefinitionUdiDeviceIdentifier#getDeviceIdentifier <em>Device Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDefinitionUdiDeviceIdentifier#getIssuer <em>Issuer</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceDefinitionUdiDeviceIdentifier#getJurisdiction <em>Jurisdiction</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDeviceDefinitionUdiDeviceIdentifier()
 * @model extendedMetaData="name='DeviceDefinition.UdiDeviceIdentifier' kind='elementOnly'"
 * @generated
 */
public interface DeviceDefinitionUdiDeviceIdentifier extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Device Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identifier that is to be associated with every Device that references this DeviceDefintiion for the issuer and jurisdication porvided in the DeviceDefinition.udiDeviceIdentifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Identifier</em>' containment reference.
	 * @see #setDeviceIdentifier(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getDeviceDefinitionUdiDeviceIdentifier_DeviceIdentifier()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='deviceIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDeviceIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceDefinitionUdiDeviceIdentifier#getDeviceIdentifier <em>Device Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Identifier</em>' containment reference.
	 * @see #getDeviceIdentifier()
	 * @generated
	 */
	void setDeviceIdentifier(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Issuer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization that assigns the identifier algorithm.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issuer</em>' containment reference.
	 * @see #setIssuer(Uri)
	 * @see org.hl7.fhir.FhirPackage#getDeviceDefinitionUdiDeviceIdentifier_Issuer()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='issuer' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getIssuer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceDefinitionUdiDeviceIdentifier#getIssuer <em>Issuer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issuer</em>' containment reference.
	 * @see #getIssuer()
	 * @generated
	 */
	void setIssuer(Uri value);

	/**
	 * Returns the value of the '<em><b>Jurisdiction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The jurisdiction to which the deviceIdentifier applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jurisdiction</em>' containment reference.
	 * @see #setJurisdiction(Uri)
	 * @see org.hl7.fhir.FhirPackage#getDeviceDefinitionUdiDeviceIdentifier_Jurisdiction()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='jurisdiction' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getJurisdiction();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceDefinitionUdiDeviceIdentifier#getJurisdiction <em>Jurisdiction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jurisdiction</em>' containment reference.
	 * @see #getJurisdiction()
	 * @generated
	 */
	void setJurisdiction(Uri value);

} // DeviceDefinitionUdiDeviceIdentifier
