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

import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.SubstanceReferenceInformation;
import org.hl7.fhir.SubstanceReferenceInformationClassification;
import org.hl7.fhir.SubstanceReferenceInformationGene;
import org.hl7.fhir.SubstanceReferenceInformationGeneElement;
import org.hl7.fhir.SubstanceReferenceInformationTarget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Reference Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SubstanceReferenceInformationImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceReferenceInformationImpl#getGene <em>Gene</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceReferenceInformationImpl#getGeneElement <em>Gene Element</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceReferenceInformationImpl#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceReferenceInformationImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceReferenceInformationImpl extends DomainResourceImpl implements SubstanceReferenceInformation {
	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String comment;

	/**
	 * The cached value of the '{@link #getGene() <em>Gene</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGene()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceReferenceInformationGene> gene;

	/**
	 * The cached value of the '{@link #getGeneElement() <em>Gene Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneElement()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceReferenceInformationGeneElement> geneElement;

	/**
	 * The cached value of the '{@link #getClassification() <em>Classification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceReferenceInformationClassification> classification;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceReferenceInformationTarget> target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceReferenceInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSubstanceReferenceInformation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComment(org.hl7.fhir.String newComment, NotificationChain msgs) {
		org.hl7.fhir.String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION__COMMENT, oldComment, newComment);
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
	public void setComment(org.hl7.fhir.String newComment) {
		if (newComment != comment) {
			NotificationChain msgs = null;
			if (comment != null)
				msgs = ((InternalEObject)comment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_REFERENCE_INFORMATION__COMMENT, null, msgs);
			if (newComment != null)
				msgs = ((InternalEObject)newComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_REFERENCE_INFORMATION__COMMENT, null, msgs);
			msgs = basicSetComment(newComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION__COMMENT, newComment, newComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstanceReferenceInformationGene> getGene() {
		if (gene == null) {
			gene = new EObjectContainmentEList<SubstanceReferenceInformationGene>(SubstanceReferenceInformationGene.class, this, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION__GENE);
		}
		return gene;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstanceReferenceInformationGeneElement> getGeneElement() {
		if (geneElement == null) {
			geneElement = new EObjectContainmentEList<SubstanceReferenceInformationGeneElement>(SubstanceReferenceInformationGeneElement.class, this, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION__GENE_ELEMENT);
		}
		return geneElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstanceReferenceInformationClassification> getClassification() {
		if (classification == null) {
			classification = new EObjectContainmentEList<SubstanceReferenceInformationClassification>(SubstanceReferenceInformationClassification.class, this, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION__CLASSIFICATION);
		}
		return classification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstanceReferenceInformationTarget> getTarget() {
		if (target == null) {
			target = new EObjectContainmentEList<SubstanceReferenceInformationTarget>(SubstanceReferenceInformationTarget.class, this, FhirPackage.SUBSTANCE_REFERENCE_INFORMATION__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION__COMMENT:
				return basicSetComment(null, msgs);
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION__GENE:
				return ((InternalEList<?>)getGene()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION__GENE_ELEMENT:
				return ((InternalEList<?>)getGeneElement()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION__CLASSIFICATION:
				return ((InternalEList<?>)getClassification()).basicRemove(otherEnd, msgs);
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION__TARGET:
				return ((InternalEList<?>)getTarget()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION__COMMENT:
				return getComment();
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION__GENE:
				return getGene();
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION__GENE_ELEMENT:
				return getGeneElement();
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION__CLASSIFICATION:
				return getClassification();
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION__TARGET:
				return getTarget();
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
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION__COMMENT:
				setComment((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION__GENE:
				getGene().clear();
				getGene().addAll((Collection<? extends SubstanceReferenceInformationGene>)newValue);
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION__GENE_ELEMENT:
				getGeneElement().clear();
				getGeneElement().addAll((Collection<? extends SubstanceReferenceInformationGeneElement>)newValue);
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION__CLASSIFICATION:
				getClassification().clear();
				getClassification().addAll((Collection<? extends SubstanceReferenceInformationClassification>)newValue);
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends SubstanceReferenceInformationTarget>)newValue);
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
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION__COMMENT:
				setComment((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION__GENE:
				getGene().clear();
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION__GENE_ELEMENT:
				getGeneElement().clear();
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION__CLASSIFICATION:
				getClassification().clear();
				return;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION__TARGET:
				getTarget().clear();
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
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION__COMMENT:
				return comment != null;
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION__GENE:
				return gene != null && !gene.isEmpty();
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION__GENE_ELEMENT:
				return geneElement != null && !geneElement.isEmpty();
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION__CLASSIFICATION:
				return classification != null && !classification.isEmpty();
			case FhirPackage.SUBSTANCE_REFERENCE_INFORMATION__TARGET:
				return target != null && !target.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubstanceReferenceInformationImpl
