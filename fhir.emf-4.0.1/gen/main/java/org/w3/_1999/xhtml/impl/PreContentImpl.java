/**
 */
package org.w3._1999.xhtml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._1999.xhtml.AType;
import org.w3._1999.xhtml.AbbrType;
import org.w3._1999.xhtml.AcronymType;
import org.w3._1999.xhtml.BType;
import org.w3._1999.xhtml.BdoType;
import org.w3._1999.xhtml.BigType;
import org.w3._1999.xhtml.BrType;
import org.w3._1999.xhtml.CiteType;
import org.w3._1999.xhtml.CodeType;
import org.w3._1999.xhtml.DfnType;
import org.w3._1999.xhtml.EmType;
import org.w3._1999.xhtml.IType;
import org.w3._1999.xhtml.KbdType;
import org.w3._1999.xhtml.MapType;
import org.w3._1999.xhtml.PreContent;
import org.w3._1999.xhtml.QType;
import org.w3._1999.xhtml.SampType;
import org.w3._1999.xhtml.SmallType;
import org.w3._1999.xhtml.SpanType;
import org.w3._1999.xhtml.StrongType;
import org.w3._1999.xhtml.SubType;
import org.w3._1999.xhtml.SupType;
import org.w3._1999.xhtml.TtType;
import org.w3._1999.xhtml.VarType;
import org.w3._1999.xhtml.XhtmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pre Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xhtml.impl.PreContentImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.PreContentImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.PreContentImpl#getA <em>A</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.PreContentImpl#getTt <em>Tt</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.PreContentImpl#getI <em>I</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.PreContentImpl#getB <em>B</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.PreContentImpl#getBig <em>Big</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.PreContentImpl#getSmall <em>Small</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.PreContentImpl#getEm <em>Em</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.PreContentImpl#getStrong <em>Strong</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.PreContentImpl#getDfn <em>Dfn</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.PreContentImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.PreContentImpl#getQ <em>Q</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.PreContentImpl#getSamp <em>Samp</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.PreContentImpl#getKbd <em>Kbd</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.PreContentImpl#getVar <em>Var</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.PreContentImpl#getCite <em>Cite</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.PreContentImpl#getAbbr <em>Abbr</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.PreContentImpl#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.PreContentImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.PreContentImpl#getSup <em>Sup</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.PreContentImpl#getBr <em>Br</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.PreContentImpl#getSpan <em>Span</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.PreContentImpl#getBdo <em>Bdo</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.PreContentImpl#getMap <em>Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PreContentImpl extends MinimalEObjectImpl.Container implements PreContent {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XhtmlPackage.eINSTANCE.getPreContent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, XhtmlPackage.PRE_CONTENT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(XhtmlPackage.eINSTANCE.getPreContent_Group());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AType> getA() {
		return getGroup().list(XhtmlPackage.eINSTANCE.getPreContent_A());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TtType> getTt() {
		return getGroup().list(XhtmlPackage.eINSTANCE.getPreContent_Tt());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IType> getI() {
		return getGroup().list(XhtmlPackage.eINSTANCE.getPreContent_I());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BType> getB() {
		return getGroup().list(XhtmlPackage.eINSTANCE.getPreContent_B());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BigType> getBig() {
		return getGroup().list(XhtmlPackage.eINSTANCE.getPreContent_Big());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SmallType> getSmall() {
		return getGroup().list(XhtmlPackage.eINSTANCE.getPreContent_Small());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EmType> getEm() {
		return getGroup().list(XhtmlPackage.eINSTANCE.getPreContent_Em());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrongType> getStrong() {
		return getGroup().list(XhtmlPackage.eINSTANCE.getPreContent_Strong());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DfnType> getDfn() {
		return getGroup().list(XhtmlPackage.eINSTANCE.getPreContent_Dfn());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeType> getCode() {
		return getGroup().list(XhtmlPackage.eINSTANCE.getPreContent_Code());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QType> getQ() {
		return getGroup().list(XhtmlPackage.eINSTANCE.getPreContent_Q());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SampType> getSamp() {
		return getGroup().list(XhtmlPackage.eINSTANCE.getPreContent_Samp());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KbdType> getKbd() {
		return getGroup().list(XhtmlPackage.eINSTANCE.getPreContent_Kbd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VarType> getVar() {
		return getGroup().list(XhtmlPackage.eINSTANCE.getPreContent_Var());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CiteType> getCite() {
		return getGroup().list(XhtmlPackage.eINSTANCE.getPreContent_Cite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbbrType> getAbbr() {
		return getGroup().list(XhtmlPackage.eINSTANCE.getPreContent_Abbr());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AcronymType> getAcronym() {
		return getGroup().list(XhtmlPackage.eINSTANCE.getPreContent_Acronym());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubType> getSub() {
		return getGroup().list(XhtmlPackage.eINSTANCE.getPreContent_Sub());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupType> getSup() {
		return getGroup().list(XhtmlPackage.eINSTANCE.getPreContent_Sup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BrType> getBr() {
		return getGroup().list(XhtmlPackage.eINSTANCE.getPreContent_Br());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SpanType> getSpan() {
		return getGroup().list(XhtmlPackage.eINSTANCE.getPreContent_Span());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BdoType> getBdo() {
		return getGroup().list(XhtmlPackage.eINSTANCE.getPreContent_Bdo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MapType> getMap() {
		return getGroup().list(XhtmlPackage.eINSTANCE.getPreContent_Map());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XhtmlPackage.PRE_CONTENT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.PRE_CONTENT__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.PRE_CONTENT__A:
				return ((InternalEList<?>)getA()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.PRE_CONTENT__TT:
				return ((InternalEList<?>)getTt()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.PRE_CONTENT__I:
				return ((InternalEList<?>)getI()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.PRE_CONTENT__B:
				return ((InternalEList<?>)getB()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.PRE_CONTENT__BIG:
				return ((InternalEList<?>)getBig()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.PRE_CONTENT__SMALL:
				return ((InternalEList<?>)getSmall()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.PRE_CONTENT__EM:
				return ((InternalEList<?>)getEm()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.PRE_CONTENT__STRONG:
				return ((InternalEList<?>)getStrong()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.PRE_CONTENT__DFN:
				return ((InternalEList<?>)getDfn()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.PRE_CONTENT__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.PRE_CONTENT__Q:
				return ((InternalEList<?>)getQ()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.PRE_CONTENT__SAMP:
				return ((InternalEList<?>)getSamp()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.PRE_CONTENT__KBD:
				return ((InternalEList<?>)getKbd()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.PRE_CONTENT__VAR:
				return ((InternalEList<?>)getVar()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.PRE_CONTENT__CITE:
				return ((InternalEList<?>)getCite()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.PRE_CONTENT__ABBR:
				return ((InternalEList<?>)getAbbr()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.PRE_CONTENT__ACRONYM:
				return ((InternalEList<?>)getAcronym()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.PRE_CONTENT__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.PRE_CONTENT__SUP:
				return ((InternalEList<?>)getSup()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.PRE_CONTENT__BR:
				return ((InternalEList<?>)getBr()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.PRE_CONTENT__SPAN:
				return ((InternalEList<?>)getSpan()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.PRE_CONTENT__BDO:
				return ((InternalEList<?>)getBdo()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.PRE_CONTENT__MAP:
				return ((InternalEList<?>)getMap()).basicRemove(otherEnd, msgs);
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
			case XhtmlPackage.PRE_CONTENT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case XhtmlPackage.PRE_CONTENT__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case XhtmlPackage.PRE_CONTENT__A:
				return getA();
			case XhtmlPackage.PRE_CONTENT__TT:
				return getTt();
			case XhtmlPackage.PRE_CONTENT__I:
				return getI();
			case XhtmlPackage.PRE_CONTENT__B:
				return getB();
			case XhtmlPackage.PRE_CONTENT__BIG:
				return getBig();
			case XhtmlPackage.PRE_CONTENT__SMALL:
				return getSmall();
			case XhtmlPackage.PRE_CONTENT__EM:
				return getEm();
			case XhtmlPackage.PRE_CONTENT__STRONG:
				return getStrong();
			case XhtmlPackage.PRE_CONTENT__DFN:
				return getDfn();
			case XhtmlPackage.PRE_CONTENT__CODE:
				return getCode();
			case XhtmlPackage.PRE_CONTENT__Q:
				return getQ();
			case XhtmlPackage.PRE_CONTENT__SAMP:
				return getSamp();
			case XhtmlPackage.PRE_CONTENT__KBD:
				return getKbd();
			case XhtmlPackage.PRE_CONTENT__VAR:
				return getVar();
			case XhtmlPackage.PRE_CONTENT__CITE:
				return getCite();
			case XhtmlPackage.PRE_CONTENT__ABBR:
				return getAbbr();
			case XhtmlPackage.PRE_CONTENT__ACRONYM:
				return getAcronym();
			case XhtmlPackage.PRE_CONTENT__SUB:
				return getSub();
			case XhtmlPackage.PRE_CONTENT__SUP:
				return getSup();
			case XhtmlPackage.PRE_CONTENT__BR:
				return getBr();
			case XhtmlPackage.PRE_CONTENT__SPAN:
				return getSpan();
			case XhtmlPackage.PRE_CONTENT__BDO:
				return getBdo();
			case XhtmlPackage.PRE_CONTENT__MAP:
				return getMap();
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
			case XhtmlPackage.PRE_CONTENT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case XhtmlPackage.PRE_CONTENT__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case XhtmlPackage.PRE_CONTENT__A:
				getA().clear();
				getA().addAll((Collection<? extends AType>)newValue);
				return;
			case XhtmlPackage.PRE_CONTENT__TT:
				getTt().clear();
				getTt().addAll((Collection<? extends TtType>)newValue);
				return;
			case XhtmlPackage.PRE_CONTENT__I:
				getI().clear();
				getI().addAll((Collection<? extends IType>)newValue);
				return;
			case XhtmlPackage.PRE_CONTENT__B:
				getB().clear();
				getB().addAll((Collection<? extends BType>)newValue);
				return;
			case XhtmlPackage.PRE_CONTENT__BIG:
				getBig().clear();
				getBig().addAll((Collection<? extends BigType>)newValue);
				return;
			case XhtmlPackage.PRE_CONTENT__SMALL:
				getSmall().clear();
				getSmall().addAll((Collection<? extends SmallType>)newValue);
				return;
			case XhtmlPackage.PRE_CONTENT__EM:
				getEm().clear();
				getEm().addAll((Collection<? extends EmType>)newValue);
				return;
			case XhtmlPackage.PRE_CONTENT__STRONG:
				getStrong().clear();
				getStrong().addAll((Collection<? extends StrongType>)newValue);
				return;
			case XhtmlPackage.PRE_CONTENT__DFN:
				getDfn().clear();
				getDfn().addAll((Collection<? extends DfnType>)newValue);
				return;
			case XhtmlPackage.PRE_CONTENT__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends CodeType>)newValue);
				return;
			case XhtmlPackage.PRE_CONTENT__Q:
				getQ().clear();
				getQ().addAll((Collection<? extends QType>)newValue);
				return;
			case XhtmlPackage.PRE_CONTENT__SAMP:
				getSamp().clear();
				getSamp().addAll((Collection<? extends SampType>)newValue);
				return;
			case XhtmlPackage.PRE_CONTENT__KBD:
				getKbd().clear();
				getKbd().addAll((Collection<? extends KbdType>)newValue);
				return;
			case XhtmlPackage.PRE_CONTENT__VAR:
				getVar().clear();
				getVar().addAll((Collection<? extends VarType>)newValue);
				return;
			case XhtmlPackage.PRE_CONTENT__CITE:
				getCite().clear();
				getCite().addAll((Collection<? extends CiteType>)newValue);
				return;
			case XhtmlPackage.PRE_CONTENT__ABBR:
				getAbbr().clear();
				getAbbr().addAll((Collection<? extends AbbrType>)newValue);
				return;
			case XhtmlPackage.PRE_CONTENT__ACRONYM:
				getAcronym().clear();
				getAcronym().addAll((Collection<? extends AcronymType>)newValue);
				return;
			case XhtmlPackage.PRE_CONTENT__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends SubType>)newValue);
				return;
			case XhtmlPackage.PRE_CONTENT__SUP:
				getSup().clear();
				getSup().addAll((Collection<? extends SupType>)newValue);
				return;
			case XhtmlPackage.PRE_CONTENT__BR:
				getBr().clear();
				getBr().addAll((Collection<? extends BrType>)newValue);
				return;
			case XhtmlPackage.PRE_CONTENT__SPAN:
				getSpan().clear();
				getSpan().addAll((Collection<? extends SpanType>)newValue);
				return;
			case XhtmlPackage.PRE_CONTENT__BDO:
				getBdo().clear();
				getBdo().addAll((Collection<? extends BdoType>)newValue);
				return;
			case XhtmlPackage.PRE_CONTENT__MAP:
				getMap().clear();
				getMap().addAll((Collection<? extends MapType>)newValue);
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
			case XhtmlPackage.PRE_CONTENT__MIXED:
				getMixed().clear();
				return;
			case XhtmlPackage.PRE_CONTENT__GROUP:
				getGroup().clear();
				return;
			case XhtmlPackage.PRE_CONTENT__A:
				getA().clear();
				return;
			case XhtmlPackage.PRE_CONTENT__TT:
				getTt().clear();
				return;
			case XhtmlPackage.PRE_CONTENT__I:
				getI().clear();
				return;
			case XhtmlPackage.PRE_CONTENT__B:
				getB().clear();
				return;
			case XhtmlPackage.PRE_CONTENT__BIG:
				getBig().clear();
				return;
			case XhtmlPackage.PRE_CONTENT__SMALL:
				getSmall().clear();
				return;
			case XhtmlPackage.PRE_CONTENT__EM:
				getEm().clear();
				return;
			case XhtmlPackage.PRE_CONTENT__STRONG:
				getStrong().clear();
				return;
			case XhtmlPackage.PRE_CONTENT__DFN:
				getDfn().clear();
				return;
			case XhtmlPackage.PRE_CONTENT__CODE:
				getCode().clear();
				return;
			case XhtmlPackage.PRE_CONTENT__Q:
				getQ().clear();
				return;
			case XhtmlPackage.PRE_CONTENT__SAMP:
				getSamp().clear();
				return;
			case XhtmlPackage.PRE_CONTENT__KBD:
				getKbd().clear();
				return;
			case XhtmlPackage.PRE_CONTENT__VAR:
				getVar().clear();
				return;
			case XhtmlPackage.PRE_CONTENT__CITE:
				getCite().clear();
				return;
			case XhtmlPackage.PRE_CONTENT__ABBR:
				getAbbr().clear();
				return;
			case XhtmlPackage.PRE_CONTENT__ACRONYM:
				getAcronym().clear();
				return;
			case XhtmlPackage.PRE_CONTENT__SUB:
				getSub().clear();
				return;
			case XhtmlPackage.PRE_CONTENT__SUP:
				getSup().clear();
				return;
			case XhtmlPackage.PRE_CONTENT__BR:
				getBr().clear();
				return;
			case XhtmlPackage.PRE_CONTENT__SPAN:
				getSpan().clear();
				return;
			case XhtmlPackage.PRE_CONTENT__BDO:
				getBdo().clear();
				return;
			case XhtmlPackage.PRE_CONTENT__MAP:
				getMap().clear();
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
			case XhtmlPackage.PRE_CONTENT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case XhtmlPackage.PRE_CONTENT__GROUP:
				return !getGroup().isEmpty();
			case XhtmlPackage.PRE_CONTENT__A:
				return !getA().isEmpty();
			case XhtmlPackage.PRE_CONTENT__TT:
				return !getTt().isEmpty();
			case XhtmlPackage.PRE_CONTENT__I:
				return !getI().isEmpty();
			case XhtmlPackage.PRE_CONTENT__B:
				return !getB().isEmpty();
			case XhtmlPackage.PRE_CONTENT__BIG:
				return !getBig().isEmpty();
			case XhtmlPackage.PRE_CONTENT__SMALL:
				return !getSmall().isEmpty();
			case XhtmlPackage.PRE_CONTENT__EM:
				return !getEm().isEmpty();
			case XhtmlPackage.PRE_CONTENT__STRONG:
				return !getStrong().isEmpty();
			case XhtmlPackage.PRE_CONTENT__DFN:
				return !getDfn().isEmpty();
			case XhtmlPackage.PRE_CONTENT__CODE:
				return !getCode().isEmpty();
			case XhtmlPackage.PRE_CONTENT__Q:
				return !getQ().isEmpty();
			case XhtmlPackage.PRE_CONTENT__SAMP:
				return !getSamp().isEmpty();
			case XhtmlPackage.PRE_CONTENT__KBD:
				return !getKbd().isEmpty();
			case XhtmlPackage.PRE_CONTENT__VAR:
				return !getVar().isEmpty();
			case XhtmlPackage.PRE_CONTENT__CITE:
				return !getCite().isEmpty();
			case XhtmlPackage.PRE_CONTENT__ABBR:
				return !getAbbr().isEmpty();
			case XhtmlPackage.PRE_CONTENT__ACRONYM:
				return !getAcronym().isEmpty();
			case XhtmlPackage.PRE_CONTENT__SUB:
				return !getSub().isEmpty();
			case XhtmlPackage.PRE_CONTENT__SUP:
				return !getSup().isEmpty();
			case XhtmlPackage.PRE_CONTENT__BR:
				return !getBr().isEmpty();
			case XhtmlPackage.PRE_CONTENT__SPAN:
				return !getSpan().isEmpty();
			case XhtmlPackage.PRE_CONTENT__BDO:
				return !getBdo().isEmpty();
			case XhtmlPackage.PRE_CONTENT__MAP:
				return !getMap().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //PreContentImpl
