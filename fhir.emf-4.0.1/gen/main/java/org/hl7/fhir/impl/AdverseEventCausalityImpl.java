/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.AdverseEventCausality;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adverse Event Causality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.AdverseEventCausalityImpl#getAssessment <em>Assessment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AdverseEventCausalityImpl#getProductRelatedness <em>Product Relatedness</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AdverseEventCausalityImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AdverseEventCausalityImpl#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdverseEventCausalityImpl extends BackboneElementImpl implements AdverseEventCausality {
	/**
	 * The cached value of the '{@link #getAssessment() <em>Assessment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessment()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept assessment;

	/**
	 * The cached value of the '{@link #getProductRelatedness() <em>Product Relatedness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductRelatedness()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String productRelatedness;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected Reference author;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdverseEventCausalityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getAdverseEventCausality();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getAssessment() {
		return assessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssessment(CodeableConcept newAssessment, NotificationChain msgs) {
		CodeableConcept oldAssessment = assessment;
		assessment = newAssessment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT_CAUSALITY__ASSESSMENT, oldAssessment, newAssessment);
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
	public void setAssessment(CodeableConcept newAssessment) {
		if (newAssessment != assessment) {
			NotificationChain msgs = null;
			if (assessment != null)
				msgs = ((InternalEObject)assessment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT_CAUSALITY__ASSESSMENT, null, msgs);
			if (newAssessment != null)
				msgs = ((InternalEObject)newAssessment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT_CAUSALITY__ASSESSMENT, null, msgs);
			msgs = basicSetAssessment(newAssessment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT_CAUSALITY__ASSESSMENT, newAssessment, newAssessment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getProductRelatedness() {
		return productRelatedness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductRelatedness(org.hl7.fhir.String newProductRelatedness, NotificationChain msgs) {
		org.hl7.fhir.String oldProductRelatedness = productRelatedness;
		productRelatedness = newProductRelatedness;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT_CAUSALITY__PRODUCT_RELATEDNESS, oldProductRelatedness, newProductRelatedness);
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
	public void setProductRelatedness(org.hl7.fhir.String newProductRelatedness) {
		if (newProductRelatedness != productRelatedness) {
			NotificationChain msgs = null;
			if (productRelatedness != null)
				msgs = ((InternalEObject)productRelatedness).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT_CAUSALITY__PRODUCT_RELATEDNESS, null, msgs);
			if (newProductRelatedness != null)
				msgs = ((InternalEObject)newProductRelatedness).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT_CAUSALITY__PRODUCT_RELATEDNESS, null, msgs);
			msgs = basicSetProductRelatedness(newProductRelatedness, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT_CAUSALITY__PRODUCT_RELATEDNESS, newProductRelatedness, newProductRelatedness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthor(Reference newAuthor, NotificationChain msgs) {
		Reference oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT_CAUSALITY__AUTHOR, oldAuthor, newAuthor);
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
	public void setAuthor(Reference newAuthor) {
		if (newAuthor != author) {
			NotificationChain msgs = null;
			if (author != null)
				msgs = ((InternalEObject)author).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT_CAUSALITY__AUTHOR, null, msgs);
			if (newAuthor != null)
				msgs = ((InternalEObject)newAuthor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT_CAUSALITY__AUTHOR, null, msgs);
			msgs = basicSetAuthor(newAuthor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT_CAUSALITY__AUTHOR, newAuthor, newAuthor));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT_CAUSALITY__METHOD, oldMethod, newMethod);
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
				msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT_CAUSALITY__METHOD, null, msgs);
			if (newMethod != null)
				msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT_CAUSALITY__METHOD, null, msgs);
			msgs = basicSetMethod(newMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT_CAUSALITY__METHOD, newMethod, newMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ADVERSE_EVENT_CAUSALITY__ASSESSMENT:
				return basicSetAssessment(null, msgs);
			case FhirPackage.ADVERSE_EVENT_CAUSALITY__PRODUCT_RELATEDNESS:
				return basicSetProductRelatedness(null, msgs);
			case FhirPackage.ADVERSE_EVENT_CAUSALITY__AUTHOR:
				return basicSetAuthor(null, msgs);
			case FhirPackage.ADVERSE_EVENT_CAUSALITY__METHOD:
				return basicSetMethod(null, msgs);
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
			case FhirPackage.ADVERSE_EVENT_CAUSALITY__ASSESSMENT:
				return getAssessment();
			case FhirPackage.ADVERSE_EVENT_CAUSALITY__PRODUCT_RELATEDNESS:
				return getProductRelatedness();
			case FhirPackage.ADVERSE_EVENT_CAUSALITY__AUTHOR:
				return getAuthor();
			case FhirPackage.ADVERSE_EVENT_CAUSALITY__METHOD:
				return getMethod();
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
			case FhirPackage.ADVERSE_EVENT_CAUSALITY__ASSESSMENT:
				setAssessment((CodeableConcept)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT_CAUSALITY__PRODUCT_RELATEDNESS:
				setProductRelatedness((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT_CAUSALITY__AUTHOR:
				setAuthor((Reference)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT_CAUSALITY__METHOD:
				setMethod((CodeableConcept)newValue);
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
			case FhirPackage.ADVERSE_EVENT_CAUSALITY__ASSESSMENT:
				setAssessment((CodeableConcept)null);
				return;
			case FhirPackage.ADVERSE_EVENT_CAUSALITY__PRODUCT_RELATEDNESS:
				setProductRelatedness((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ADVERSE_EVENT_CAUSALITY__AUTHOR:
				setAuthor((Reference)null);
				return;
			case FhirPackage.ADVERSE_EVENT_CAUSALITY__METHOD:
				setMethod((CodeableConcept)null);
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
			case FhirPackage.ADVERSE_EVENT_CAUSALITY__ASSESSMENT:
				return assessment != null;
			case FhirPackage.ADVERSE_EVENT_CAUSALITY__PRODUCT_RELATEDNESS:
				return productRelatedness != null;
			case FhirPackage.ADVERSE_EVENT_CAUSALITY__AUTHOR:
				return author != null;
			case FhirPackage.ADVERSE_EVENT_CAUSALITY__METHOD:
				return method != null;
		}
		return super.eIsSet(featureID);
	}

} //AdverseEventCausalityImpl
