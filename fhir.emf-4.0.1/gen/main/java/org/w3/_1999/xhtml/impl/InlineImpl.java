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
import org.w3._1999.xhtml.ImgType;
import org.w3._1999.xhtml.Inline;
import org.w3._1999.xhtml.KbdType;
import org.w3._1999.xhtml.MapType;
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
 * An implementation of the model object '<em><b>Inline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xhtml.impl.InlineImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InlineImpl#getInline <em>Inline</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InlineImpl#getA <em>A</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InlineImpl#getBr <em>Br</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InlineImpl#getSpan <em>Span</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InlineImpl#getBdo <em>Bdo</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InlineImpl#getMap <em>Map</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InlineImpl#getImg <em>Img</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InlineImpl#getTt <em>Tt</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InlineImpl#getI <em>I</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InlineImpl#getB <em>B</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InlineImpl#getBig <em>Big</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InlineImpl#getSmall <em>Small</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InlineImpl#getEm <em>Em</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InlineImpl#getStrong <em>Strong</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InlineImpl#getDfn <em>Dfn</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InlineImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InlineImpl#getQ <em>Q</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InlineImpl#getSamp <em>Samp</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InlineImpl#getKbd <em>Kbd</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InlineImpl#getVar <em>Var</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InlineImpl#getCite <em>Cite</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InlineImpl#getAbbr <em>Abbr</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InlineImpl#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InlineImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.InlineImpl#getSup <em>Sup</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InlineImpl extends MinimalEObjectImpl.Container implements Inline {
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
	protected InlineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XhtmlPackage.eINSTANCE.getInline();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, XhtmlPackage.INLINE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getInline() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(XhtmlPackage.eINSTANCE.getInline_Inline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AType> getA() {
		return getInline().list(XhtmlPackage.eINSTANCE.getInline_A());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BrType> getBr() {
		return getInline().list(XhtmlPackage.eINSTANCE.getInline_Br());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SpanType> getSpan() {
		return getInline().list(XhtmlPackage.eINSTANCE.getInline_Span());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BdoType> getBdo() {
		return getInline().list(XhtmlPackage.eINSTANCE.getInline_Bdo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MapType> getMap() {
		return getInline().list(XhtmlPackage.eINSTANCE.getInline_Map());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImgType> getImg() {
		return getInline().list(XhtmlPackage.eINSTANCE.getInline_Img());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TtType> getTt() {
		return getInline().list(XhtmlPackage.eINSTANCE.getInline_Tt());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IType> getI() {
		return getInline().list(XhtmlPackage.eINSTANCE.getInline_I());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BType> getB() {
		return getInline().list(XhtmlPackage.eINSTANCE.getInline_B());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BigType> getBig() {
		return getInline().list(XhtmlPackage.eINSTANCE.getInline_Big());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SmallType> getSmall() {
		return getInline().list(XhtmlPackage.eINSTANCE.getInline_Small());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EmType> getEm() {
		return getInline().list(XhtmlPackage.eINSTANCE.getInline_Em());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrongType> getStrong() {
		return getInline().list(XhtmlPackage.eINSTANCE.getInline_Strong());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DfnType> getDfn() {
		return getInline().list(XhtmlPackage.eINSTANCE.getInline_Dfn());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeType> getCode() {
		return getInline().list(XhtmlPackage.eINSTANCE.getInline_Code());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QType> getQ() {
		return getInline().list(XhtmlPackage.eINSTANCE.getInline_Q());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SampType> getSamp() {
		return getInline().list(XhtmlPackage.eINSTANCE.getInline_Samp());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KbdType> getKbd() {
		return getInline().list(XhtmlPackage.eINSTANCE.getInline_Kbd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VarType> getVar() {
		return getInline().list(XhtmlPackage.eINSTANCE.getInline_Var());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CiteType> getCite() {
		return getInline().list(XhtmlPackage.eINSTANCE.getInline_Cite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbbrType> getAbbr() {
		return getInline().list(XhtmlPackage.eINSTANCE.getInline_Abbr());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AcronymType> getAcronym() {
		return getInline().list(XhtmlPackage.eINSTANCE.getInline_Acronym());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubType> getSub() {
		return getInline().list(XhtmlPackage.eINSTANCE.getInline_Sub());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupType> getSup() {
		return getInline().list(XhtmlPackage.eINSTANCE.getInline_Sup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XhtmlPackage.INLINE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__INLINE:
				return ((InternalEList<?>)getInline()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__A:
				return ((InternalEList<?>)getA()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__BR:
				return ((InternalEList<?>)getBr()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__SPAN:
				return ((InternalEList<?>)getSpan()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__BDO:
				return ((InternalEList<?>)getBdo()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__MAP:
				return ((InternalEList<?>)getMap()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__IMG:
				return ((InternalEList<?>)getImg()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__TT:
				return ((InternalEList<?>)getTt()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__I:
				return ((InternalEList<?>)getI()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__B:
				return ((InternalEList<?>)getB()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__BIG:
				return ((InternalEList<?>)getBig()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__SMALL:
				return ((InternalEList<?>)getSmall()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__EM:
				return ((InternalEList<?>)getEm()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__STRONG:
				return ((InternalEList<?>)getStrong()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__DFN:
				return ((InternalEList<?>)getDfn()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__Q:
				return ((InternalEList<?>)getQ()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__SAMP:
				return ((InternalEList<?>)getSamp()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__KBD:
				return ((InternalEList<?>)getKbd()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__VAR:
				return ((InternalEList<?>)getVar()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__CITE:
				return ((InternalEList<?>)getCite()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__ABBR:
				return ((InternalEList<?>)getAbbr()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__ACRONYM:
				return ((InternalEList<?>)getAcronym()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__SUP:
				return ((InternalEList<?>)getSup()).basicRemove(otherEnd, msgs);
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
			case XhtmlPackage.INLINE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case XhtmlPackage.INLINE__INLINE:
				if (coreType) return getInline();
				return ((FeatureMap.Internal)getInline()).getWrapper();
			case XhtmlPackage.INLINE__A:
				return getA();
			case XhtmlPackage.INLINE__BR:
				return getBr();
			case XhtmlPackage.INLINE__SPAN:
				return getSpan();
			case XhtmlPackage.INLINE__BDO:
				return getBdo();
			case XhtmlPackage.INLINE__MAP:
				return getMap();
			case XhtmlPackage.INLINE__IMG:
				return getImg();
			case XhtmlPackage.INLINE__TT:
				return getTt();
			case XhtmlPackage.INLINE__I:
				return getI();
			case XhtmlPackage.INLINE__B:
				return getB();
			case XhtmlPackage.INLINE__BIG:
				return getBig();
			case XhtmlPackage.INLINE__SMALL:
				return getSmall();
			case XhtmlPackage.INLINE__EM:
				return getEm();
			case XhtmlPackage.INLINE__STRONG:
				return getStrong();
			case XhtmlPackage.INLINE__DFN:
				return getDfn();
			case XhtmlPackage.INLINE__CODE:
				return getCode();
			case XhtmlPackage.INLINE__Q:
				return getQ();
			case XhtmlPackage.INLINE__SAMP:
				return getSamp();
			case XhtmlPackage.INLINE__KBD:
				return getKbd();
			case XhtmlPackage.INLINE__VAR:
				return getVar();
			case XhtmlPackage.INLINE__CITE:
				return getCite();
			case XhtmlPackage.INLINE__ABBR:
				return getAbbr();
			case XhtmlPackage.INLINE__ACRONYM:
				return getAcronym();
			case XhtmlPackage.INLINE__SUB:
				return getSub();
			case XhtmlPackage.INLINE__SUP:
				return getSup();
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
			case XhtmlPackage.INLINE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case XhtmlPackage.INLINE__INLINE:
				((FeatureMap.Internal)getInline()).set(newValue);
				return;
			case XhtmlPackage.INLINE__A:
				getA().clear();
				getA().addAll((Collection<? extends AType>)newValue);
				return;
			case XhtmlPackage.INLINE__BR:
				getBr().clear();
				getBr().addAll((Collection<? extends BrType>)newValue);
				return;
			case XhtmlPackage.INLINE__SPAN:
				getSpan().clear();
				getSpan().addAll((Collection<? extends SpanType>)newValue);
				return;
			case XhtmlPackage.INLINE__BDO:
				getBdo().clear();
				getBdo().addAll((Collection<? extends BdoType>)newValue);
				return;
			case XhtmlPackage.INLINE__MAP:
				getMap().clear();
				getMap().addAll((Collection<? extends MapType>)newValue);
				return;
			case XhtmlPackage.INLINE__IMG:
				getImg().clear();
				getImg().addAll((Collection<? extends ImgType>)newValue);
				return;
			case XhtmlPackage.INLINE__TT:
				getTt().clear();
				getTt().addAll((Collection<? extends TtType>)newValue);
				return;
			case XhtmlPackage.INLINE__I:
				getI().clear();
				getI().addAll((Collection<? extends IType>)newValue);
				return;
			case XhtmlPackage.INLINE__B:
				getB().clear();
				getB().addAll((Collection<? extends BType>)newValue);
				return;
			case XhtmlPackage.INLINE__BIG:
				getBig().clear();
				getBig().addAll((Collection<? extends BigType>)newValue);
				return;
			case XhtmlPackage.INLINE__SMALL:
				getSmall().clear();
				getSmall().addAll((Collection<? extends SmallType>)newValue);
				return;
			case XhtmlPackage.INLINE__EM:
				getEm().clear();
				getEm().addAll((Collection<? extends EmType>)newValue);
				return;
			case XhtmlPackage.INLINE__STRONG:
				getStrong().clear();
				getStrong().addAll((Collection<? extends StrongType>)newValue);
				return;
			case XhtmlPackage.INLINE__DFN:
				getDfn().clear();
				getDfn().addAll((Collection<? extends DfnType>)newValue);
				return;
			case XhtmlPackage.INLINE__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends CodeType>)newValue);
				return;
			case XhtmlPackage.INLINE__Q:
				getQ().clear();
				getQ().addAll((Collection<? extends QType>)newValue);
				return;
			case XhtmlPackage.INLINE__SAMP:
				getSamp().clear();
				getSamp().addAll((Collection<? extends SampType>)newValue);
				return;
			case XhtmlPackage.INLINE__KBD:
				getKbd().clear();
				getKbd().addAll((Collection<? extends KbdType>)newValue);
				return;
			case XhtmlPackage.INLINE__VAR:
				getVar().clear();
				getVar().addAll((Collection<? extends VarType>)newValue);
				return;
			case XhtmlPackage.INLINE__CITE:
				getCite().clear();
				getCite().addAll((Collection<? extends CiteType>)newValue);
				return;
			case XhtmlPackage.INLINE__ABBR:
				getAbbr().clear();
				getAbbr().addAll((Collection<? extends AbbrType>)newValue);
				return;
			case XhtmlPackage.INLINE__ACRONYM:
				getAcronym().clear();
				getAcronym().addAll((Collection<? extends AcronymType>)newValue);
				return;
			case XhtmlPackage.INLINE__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends SubType>)newValue);
				return;
			case XhtmlPackage.INLINE__SUP:
				getSup().clear();
				getSup().addAll((Collection<? extends SupType>)newValue);
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
			case XhtmlPackage.INLINE__MIXED:
				getMixed().clear();
				return;
			case XhtmlPackage.INLINE__INLINE:
				getInline().clear();
				return;
			case XhtmlPackage.INLINE__A:
				getA().clear();
				return;
			case XhtmlPackage.INLINE__BR:
				getBr().clear();
				return;
			case XhtmlPackage.INLINE__SPAN:
				getSpan().clear();
				return;
			case XhtmlPackage.INLINE__BDO:
				getBdo().clear();
				return;
			case XhtmlPackage.INLINE__MAP:
				getMap().clear();
				return;
			case XhtmlPackage.INLINE__IMG:
				getImg().clear();
				return;
			case XhtmlPackage.INLINE__TT:
				getTt().clear();
				return;
			case XhtmlPackage.INLINE__I:
				getI().clear();
				return;
			case XhtmlPackage.INLINE__B:
				getB().clear();
				return;
			case XhtmlPackage.INLINE__BIG:
				getBig().clear();
				return;
			case XhtmlPackage.INLINE__SMALL:
				getSmall().clear();
				return;
			case XhtmlPackage.INLINE__EM:
				getEm().clear();
				return;
			case XhtmlPackage.INLINE__STRONG:
				getStrong().clear();
				return;
			case XhtmlPackage.INLINE__DFN:
				getDfn().clear();
				return;
			case XhtmlPackage.INLINE__CODE:
				getCode().clear();
				return;
			case XhtmlPackage.INLINE__Q:
				getQ().clear();
				return;
			case XhtmlPackage.INLINE__SAMP:
				getSamp().clear();
				return;
			case XhtmlPackage.INLINE__KBD:
				getKbd().clear();
				return;
			case XhtmlPackage.INLINE__VAR:
				getVar().clear();
				return;
			case XhtmlPackage.INLINE__CITE:
				getCite().clear();
				return;
			case XhtmlPackage.INLINE__ABBR:
				getAbbr().clear();
				return;
			case XhtmlPackage.INLINE__ACRONYM:
				getAcronym().clear();
				return;
			case XhtmlPackage.INLINE__SUB:
				getSub().clear();
				return;
			case XhtmlPackage.INLINE__SUP:
				getSup().clear();
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
			case XhtmlPackage.INLINE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case XhtmlPackage.INLINE__INLINE:
				return !getInline().isEmpty();
			case XhtmlPackage.INLINE__A:
				return !getA().isEmpty();
			case XhtmlPackage.INLINE__BR:
				return !getBr().isEmpty();
			case XhtmlPackage.INLINE__SPAN:
				return !getSpan().isEmpty();
			case XhtmlPackage.INLINE__BDO:
				return !getBdo().isEmpty();
			case XhtmlPackage.INLINE__MAP:
				return !getMap().isEmpty();
			case XhtmlPackage.INLINE__IMG:
				return !getImg().isEmpty();
			case XhtmlPackage.INLINE__TT:
				return !getTt().isEmpty();
			case XhtmlPackage.INLINE__I:
				return !getI().isEmpty();
			case XhtmlPackage.INLINE__B:
				return !getB().isEmpty();
			case XhtmlPackage.INLINE__BIG:
				return !getBig().isEmpty();
			case XhtmlPackage.INLINE__SMALL:
				return !getSmall().isEmpty();
			case XhtmlPackage.INLINE__EM:
				return !getEm().isEmpty();
			case XhtmlPackage.INLINE__STRONG:
				return !getStrong().isEmpty();
			case XhtmlPackage.INLINE__DFN:
				return !getDfn().isEmpty();
			case XhtmlPackage.INLINE__CODE:
				return !getCode().isEmpty();
			case XhtmlPackage.INLINE__Q:
				return !getQ().isEmpty();
			case XhtmlPackage.INLINE__SAMP:
				return !getSamp().isEmpty();
			case XhtmlPackage.INLINE__KBD:
				return !getKbd().isEmpty();
			case XhtmlPackage.INLINE__VAR:
				return !getVar().isEmpty();
			case XhtmlPackage.INLINE__CITE:
				return !getCite().isEmpty();
			case XhtmlPackage.INLINE__ABBR:
				return !getAbbr().isEmpty();
			case XhtmlPackage.INLINE__ACRONYM:
				return !getAcronym().isEmpty();
			case XhtmlPackage.INLINE__SUB:
				return !getSub().isEmpty();
			case XhtmlPackage.INLINE__SUP:
				return !getSup().isEmpty();
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

} //InlineImpl
