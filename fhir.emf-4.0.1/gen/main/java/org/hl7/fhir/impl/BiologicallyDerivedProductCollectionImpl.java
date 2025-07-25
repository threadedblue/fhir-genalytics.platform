/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.BiologicallyDerivedProductCollection;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Biologically Derived Product Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.BiologicallyDerivedProductCollectionImpl#getCollector <em>Collector</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.BiologicallyDerivedProductCollectionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.BiologicallyDerivedProductCollectionImpl#getCollectedDateTime <em>Collected Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.BiologicallyDerivedProductCollectionImpl#getCollectedPeriod <em>Collected Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BiologicallyDerivedProductCollectionImpl extends BackboneElementImpl implements BiologicallyDerivedProductCollection {
	/**
	 * The cached value of the '{@link #getCollector() <em>Collector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollector()
	 * @generated
	 * @ordered
	 */
	protected Reference collector;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Reference source;

	/**
	 * The cached value of the '{@link #getCollectedDateTime() <em>Collected Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectedDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime collectedDateTime;

	/**
	 * The cached value of the '{@link #getCollectedPeriod() <em>Collected Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectedPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period collectedPeriod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BiologicallyDerivedProductCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getBiologicallyDerivedProductCollection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getCollector() {
		return collector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollector(Reference newCollector, NotificationChain msgs) {
		Reference oldCollector = collector;
		collector = newCollector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__COLLECTOR, oldCollector, newCollector);
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
	public void setCollector(Reference newCollector) {
		if (newCollector != collector) {
			NotificationChain msgs = null;
			if (collector != null)
				msgs = ((InternalEObject)collector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__COLLECTOR, null, msgs);
			if (newCollector != null)
				msgs = ((InternalEObject)newCollector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__COLLECTOR, null, msgs);
			msgs = basicSetCollector(newCollector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__COLLECTOR, newCollector, newCollector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Reference newSource, NotificationChain msgs) {
		Reference oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__SOURCE, oldSource, newSource);
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
	public void setSource(Reference newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getCollectedDateTime() {
		return collectedDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollectedDateTime(DateTime newCollectedDateTime, NotificationChain msgs) {
		DateTime oldCollectedDateTime = collectedDateTime;
		collectedDateTime = newCollectedDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__COLLECTED_DATE_TIME, oldCollectedDateTime, newCollectedDateTime);
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
	public void setCollectedDateTime(DateTime newCollectedDateTime) {
		if (newCollectedDateTime != collectedDateTime) {
			NotificationChain msgs = null;
			if (collectedDateTime != null)
				msgs = ((InternalEObject)collectedDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__COLLECTED_DATE_TIME, null, msgs);
			if (newCollectedDateTime != null)
				msgs = ((InternalEObject)newCollectedDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__COLLECTED_DATE_TIME, null, msgs);
			msgs = basicSetCollectedDateTime(newCollectedDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__COLLECTED_DATE_TIME, newCollectedDateTime, newCollectedDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getCollectedPeriod() {
		return collectedPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollectedPeriod(Period newCollectedPeriod, NotificationChain msgs) {
		Period oldCollectedPeriod = collectedPeriod;
		collectedPeriod = newCollectedPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__COLLECTED_PERIOD, oldCollectedPeriod, newCollectedPeriod);
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
	public void setCollectedPeriod(Period newCollectedPeriod) {
		if (newCollectedPeriod != collectedPeriod) {
			NotificationChain msgs = null;
			if (collectedPeriod != null)
				msgs = ((InternalEObject)collectedPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__COLLECTED_PERIOD, null, msgs);
			if (newCollectedPeriod != null)
				msgs = ((InternalEObject)newCollectedPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__COLLECTED_PERIOD, null, msgs);
			msgs = basicSetCollectedPeriod(newCollectedPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__COLLECTED_PERIOD, newCollectedPeriod, newCollectedPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__COLLECTOR:
				return basicSetCollector(null, msgs);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__SOURCE:
				return basicSetSource(null, msgs);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__COLLECTED_DATE_TIME:
				return basicSetCollectedDateTime(null, msgs);
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__COLLECTED_PERIOD:
				return basicSetCollectedPeriod(null, msgs);
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
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__COLLECTOR:
				return getCollector();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__SOURCE:
				return getSource();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__COLLECTED_DATE_TIME:
				return getCollectedDateTime();
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__COLLECTED_PERIOD:
				return getCollectedPeriod();
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
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__COLLECTOR:
				setCollector((Reference)newValue);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__SOURCE:
				setSource((Reference)newValue);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__COLLECTED_DATE_TIME:
				setCollectedDateTime((DateTime)newValue);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__COLLECTED_PERIOD:
				setCollectedPeriod((Period)newValue);
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
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__COLLECTOR:
				setCollector((Reference)null);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__SOURCE:
				setSource((Reference)null);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__COLLECTED_DATE_TIME:
				setCollectedDateTime((DateTime)null);
				return;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__COLLECTED_PERIOD:
				setCollectedPeriod((Period)null);
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
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__COLLECTOR:
				return collector != null;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__SOURCE:
				return source != null;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__COLLECTED_DATE_TIME:
				return collectedDateTime != null;
			case FhirPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__COLLECTED_PERIOD:
				return collectedPeriod != null;
		}
		return super.eIsSet(featureID);
	}

} //BiologicallyDerivedProductCollectionImpl
