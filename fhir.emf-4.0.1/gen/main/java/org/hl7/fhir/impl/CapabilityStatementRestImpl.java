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

import org.hl7.fhir.Canonical;
import org.hl7.fhir.CapabilityStatementInteraction1;
import org.hl7.fhir.CapabilityStatementOperation;
import org.hl7.fhir.CapabilityStatementResource;
import org.hl7.fhir.CapabilityStatementRest;
import org.hl7.fhir.CapabilityStatementSearchParam;
import org.hl7.fhir.CapabilityStatementSecurity;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.RestfulCapabilityMode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability Statement Rest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementRestImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementRestImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementRestImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementRestImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementRestImpl#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementRestImpl#getSearchParam <em>Search Param</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementRestImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementRestImpl#getCompartment <em>Compartment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityStatementRestImpl extends BackboneElementImpl implements CapabilityStatementRest {
	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected RestfulCapabilityMode mode;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected Markdown documentation;

	/**
	 * The cached value of the '{@link #getSecurity() <em>Security</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected CapabilityStatementSecurity security;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityStatementResource> resource;

	/**
	 * The cached value of the '{@link #getInteraction() <em>Interaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteraction()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityStatementInteraction1> interaction;

	/**
	 * The cached value of the '{@link #getSearchParam() <em>Search Param</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchParam()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityStatementSearchParam> searchParam;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityStatementOperation> operation;

	/**
	 * The cached value of the '{@link #getCompartment() <em>Compartment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompartment()
	 * @generated
	 * @ordered
	 */
	protected EList<Canonical> compartment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityStatementRestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCapabilityStatementRest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RestfulCapabilityMode getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMode(RestfulCapabilityMode newMode, NotificationChain msgs) {
		RestfulCapabilityMode oldMode = mode;
		mode = newMode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT_REST__MODE, oldMode, newMode);
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
	public void setMode(RestfulCapabilityMode newMode) {
		if (newMode != mode) {
			NotificationChain msgs = null;
			if (mode != null)
				msgs = ((InternalEObject)mode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT_REST__MODE, null, msgs);
			if (newMode != null)
				msgs = ((InternalEObject)newMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT_REST__MODE, null, msgs);
			msgs = basicSetMode(newMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT_REST__MODE, newMode, newMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentation(Markdown newDocumentation, NotificationChain msgs) {
		Markdown oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT_REST__DOCUMENTATION, oldDocumentation, newDocumentation);
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
	public void setDocumentation(Markdown newDocumentation) {
		if (newDocumentation != documentation) {
			NotificationChain msgs = null;
			if (documentation != null)
				msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT_REST__DOCUMENTATION, null, msgs);
			if (newDocumentation != null)
				msgs = ((InternalEObject)newDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT_REST__DOCUMENTATION, null, msgs);
			msgs = basicSetDocumentation(newDocumentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT_REST__DOCUMENTATION, newDocumentation, newDocumentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityStatementSecurity getSecurity() {
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurity(CapabilityStatementSecurity newSecurity, NotificationChain msgs) {
		CapabilityStatementSecurity oldSecurity = security;
		security = newSecurity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT_REST__SECURITY, oldSecurity, newSecurity);
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
	public void setSecurity(CapabilityStatementSecurity newSecurity) {
		if (newSecurity != security) {
			NotificationChain msgs = null;
			if (security != null)
				msgs = ((InternalEObject)security).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT_REST__SECURITY, null, msgs);
			if (newSecurity != null)
				msgs = ((InternalEObject)newSecurity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT_REST__SECURITY, null, msgs);
			msgs = basicSetSecurity(newSecurity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT_REST__SECURITY, newSecurity, newSecurity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CapabilityStatementResource> getResource() {
		if (resource == null) {
			resource = new EObjectContainmentEList<CapabilityStatementResource>(CapabilityStatementResource.class, this, FhirPackage.CAPABILITY_STATEMENT_REST__RESOURCE);
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CapabilityStatementInteraction1> getInteraction() {
		if (interaction == null) {
			interaction = new EObjectContainmentEList<CapabilityStatementInteraction1>(CapabilityStatementInteraction1.class, this, FhirPackage.CAPABILITY_STATEMENT_REST__INTERACTION);
		}
		return interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CapabilityStatementSearchParam> getSearchParam() {
		if (searchParam == null) {
			searchParam = new EObjectContainmentEList<CapabilityStatementSearchParam>(CapabilityStatementSearchParam.class, this, FhirPackage.CAPABILITY_STATEMENT_REST__SEARCH_PARAM);
		}
		return searchParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CapabilityStatementOperation> getOperation() {
		if (operation == null) {
			operation = new EObjectContainmentEList<CapabilityStatementOperation>(CapabilityStatementOperation.class, this, FhirPackage.CAPABILITY_STATEMENT_REST__OPERATION);
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Canonical> getCompartment() {
		if (compartment == null) {
			compartment = new EObjectContainmentEList<Canonical>(Canonical.class, this, FhirPackage.CAPABILITY_STATEMENT_REST__COMPARTMENT);
		}
		return compartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CAPABILITY_STATEMENT_REST__MODE:
				return basicSetMode(null, msgs);
			case FhirPackage.CAPABILITY_STATEMENT_REST__DOCUMENTATION:
				return basicSetDocumentation(null, msgs);
			case FhirPackage.CAPABILITY_STATEMENT_REST__SECURITY:
				return basicSetSecurity(null, msgs);
			case FhirPackage.CAPABILITY_STATEMENT_REST__RESOURCE:
				return ((InternalEList<?>)getResource()).basicRemove(otherEnd, msgs);
			case FhirPackage.CAPABILITY_STATEMENT_REST__INTERACTION:
				return ((InternalEList<?>)getInteraction()).basicRemove(otherEnd, msgs);
			case FhirPackage.CAPABILITY_STATEMENT_REST__SEARCH_PARAM:
				return ((InternalEList<?>)getSearchParam()).basicRemove(otherEnd, msgs);
			case FhirPackage.CAPABILITY_STATEMENT_REST__OPERATION:
				return ((InternalEList<?>)getOperation()).basicRemove(otherEnd, msgs);
			case FhirPackage.CAPABILITY_STATEMENT_REST__COMPARTMENT:
				return ((InternalEList<?>)getCompartment()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CAPABILITY_STATEMENT_REST__MODE:
				return getMode();
			case FhirPackage.CAPABILITY_STATEMENT_REST__DOCUMENTATION:
				return getDocumentation();
			case FhirPackage.CAPABILITY_STATEMENT_REST__SECURITY:
				return getSecurity();
			case FhirPackage.CAPABILITY_STATEMENT_REST__RESOURCE:
				return getResource();
			case FhirPackage.CAPABILITY_STATEMENT_REST__INTERACTION:
				return getInteraction();
			case FhirPackage.CAPABILITY_STATEMENT_REST__SEARCH_PARAM:
				return getSearchParam();
			case FhirPackage.CAPABILITY_STATEMENT_REST__OPERATION:
				return getOperation();
			case FhirPackage.CAPABILITY_STATEMENT_REST__COMPARTMENT:
				return getCompartment();
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
			case FhirPackage.CAPABILITY_STATEMENT_REST__MODE:
				setMode((RestfulCapabilityMode)newValue);
				return;
			case FhirPackage.CAPABILITY_STATEMENT_REST__DOCUMENTATION:
				setDocumentation((Markdown)newValue);
				return;
			case FhirPackage.CAPABILITY_STATEMENT_REST__SECURITY:
				setSecurity((CapabilityStatementSecurity)newValue);
				return;
			case FhirPackage.CAPABILITY_STATEMENT_REST__RESOURCE:
				getResource().clear();
				getResource().addAll((Collection<? extends CapabilityStatementResource>)newValue);
				return;
			case FhirPackage.CAPABILITY_STATEMENT_REST__INTERACTION:
				getInteraction().clear();
				getInteraction().addAll((Collection<? extends CapabilityStatementInteraction1>)newValue);
				return;
			case FhirPackage.CAPABILITY_STATEMENT_REST__SEARCH_PARAM:
				getSearchParam().clear();
				getSearchParam().addAll((Collection<? extends CapabilityStatementSearchParam>)newValue);
				return;
			case FhirPackage.CAPABILITY_STATEMENT_REST__OPERATION:
				getOperation().clear();
				getOperation().addAll((Collection<? extends CapabilityStatementOperation>)newValue);
				return;
			case FhirPackage.CAPABILITY_STATEMENT_REST__COMPARTMENT:
				getCompartment().clear();
				getCompartment().addAll((Collection<? extends Canonical>)newValue);
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
			case FhirPackage.CAPABILITY_STATEMENT_REST__MODE:
				setMode((RestfulCapabilityMode)null);
				return;
			case FhirPackage.CAPABILITY_STATEMENT_REST__DOCUMENTATION:
				setDocumentation((Markdown)null);
				return;
			case FhirPackage.CAPABILITY_STATEMENT_REST__SECURITY:
				setSecurity((CapabilityStatementSecurity)null);
				return;
			case FhirPackage.CAPABILITY_STATEMENT_REST__RESOURCE:
				getResource().clear();
				return;
			case FhirPackage.CAPABILITY_STATEMENT_REST__INTERACTION:
				getInteraction().clear();
				return;
			case FhirPackage.CAPABILITY_STATEMENT_REST__SEARCH_PARAM:
				getSearchParam().clear();
				return;
			case FhirPackage.CAPABILITY_STATEMENT_REST__OPERATION:
				getOperation().clear();
				return;
			case FhirPackage.CAPABILITY_STATEMENT_REST__COMPARTMENT:
				getCompartment().clear();
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
			case FhirPackage.CAPABILITY_STATEMENT_REST__MODE:
				return mode != null;
			case FhirPackage.CAPABILITY_STATEMENT_REST__DOCUMENTATION:
				return documentation != null;
			case FhirPackage.CAPABILITY_STATEMENT_REST__SECURITY:
				return security != null;
			case FhirPackage.CAPABILITY_STATEMENT_REST__RESOURCE:
				return resource != null && !resource.isEmpty();
			case FhirPackage.CAPABILITY_STATEMENT_REST__INTERACTION:
				return interaction != null && !interaction.isEmpty();
			case FhirPackage.CAPABILITY_STATEMENT_REST__SEARCH_PARAM:
				return searchParam != null && !searchParam.isEmpty();
			case FhirPackage.CAPABILITY_STATEMENT_REST__OPERATION:
				return operation != null && !operation.isEmpty();
			case FhirPackage.CAPABILITY_STATEMENT_REST__COMPARTMENT:
				return compartment != null && !compartment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CapabilityStatementRestImpl
