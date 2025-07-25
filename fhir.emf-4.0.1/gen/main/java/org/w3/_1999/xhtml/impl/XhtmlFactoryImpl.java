/**
 */
package org.w3._1999.xhtml.impl;

import java.math.BigInteger;

import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.w3._1999.xhtml.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XhtmlFactoryImpl extends EFactoryImpl implements XhtmlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XhtmlFactory init() {
		try {
			XhtmlFactory theXhtmlFactory = (XhtmlFactory)EPackage.Registry.INSTANCE.getEFactory(XhtmlPackage.eNS_URI);
			if (theXhtmlFactory != null) {
				return theXhtmlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XhtmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case XhtmlPackage.ABBR_TYPE: return createAbbrType();
			case XhtmlPackage.ACONTENT: return createAContent();
			case XhtmlPackage.ACRONYM_TYPE: return createAcronymType();
			case XhtmlPackage.ADDRESS_TYPE: return createAddressType();
			case XhtmlPackage.AREA_TYPE: return createAreaType();
			case XhtmlPackage.ATYPE: return createAType();
			case XhtmlPackage.BDO_TYPE: return createBdoType();
			case XhtmlPackage.BIG_TYPE: return createBigType();
			case XhtmlPackage.BLOCK: return createBlock();
			case XhtmlPackage.BLOCKQUOTE_TYPE: return createBlockquoteType();
			case XhtmlPackage.BR_TYPE: return createBrType();
			case XhtmlPackage.BTYPE: return createBType();
			case XhtmlPackage.CAPTION_TYPE: return createCaptionType();
			case XhtmlPackage.CITE_TYPE: return createCiteType();
			case XhtmlPackage.CODE_TYPE: return createCodeType();
			case XhtmlPackage.COLGROUP_TYPE: return createColgroupType();
			case XhtmlPackage.COL_TYPE: return createColType();
			case XhtmlPackage.DD_TYPE: return createDdType();
			case XhtmlPackage.DFN_TYPE: return createDfnType();
			case XhtmlPackage.DIV_TYPE: return createDivType();
			case XhtmlPackage.DL_TYPE: return createDlType();
			case XhtmlPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case XhtmlPackage.DT_TYPE: return createDtType();
			case XhtmlPackage.EM_TYPE: return createEmType();
			case XhtmlPackage.FLOW: return createFlow();
			case XhtmlPackage.H1_TYPE: return createH1Type();
			case XhtmlPackage.H2_TYPE: return createH2Type();
			case XhtmlPackage.H3_TYPE: return createH3Type();
			case XhtmlPackage.H4_TYPE: return createH4Type();
			case XhtmlPackage.H5_TYPE: return createH5Type();
			case XhtmlPackage.H6_TYPE: return createH6Type();
			case XhtmlPackage.HR_TYPE: return createHrType();
			case XhtmlPackage.IMG_TYPE: return createImgType();
			case XhtmlPackage.INLINE: return createInline();
			case XhtmlPackage.ITYPE: return createIType();
			case XhtmlPackage.KBD_TYPE: return createKbdType();
			case XhtmlPackage.LI_TYPE: return createLiType();
			case XhtmlPackage.MAP_TYPE: return createMapType();
			case XhtmlPackage.OL_TYPE: return createOlType();
			case XhtmlPackage.PRE_CONTENT: return createPreContent();
			case XhtmlPackage.PRE_TYPE: return createPreType();
			case XhtmlPackage.PTYPE: return createPType();
			case XhtmlPackage.QTYPE: return createQType();
			case XhtmlPackage.SAMP_TYPE: return createSampType();
			case XhtmlPackage.SMALL_TYPE: return createSmallType();
			case XhtmlPackage.SPAN_TYPE: return createSpanType();
			case XhtmlPackage.STRONG_TYPE: return createStrongType();
			case XhtmlPackage.SUB_TYPE: return createSubType();
			case XhtmlPackage.SUP_TYPE: return createSupType();
			case XhtmlPackage.TABLE_TYPE: return createTableType();
			case XhtmlPackage.TBODY_TYPE: return createTbodyType();
			case XhtmlPackage.TD_TYPE: return createTdType();
			case XhtmlPackage.TFOOT_TYPE: return createTfootType();
			case XhtmlPackage.THEAD_TYPE: return createTheadType();
			case XhtmlPackage.TH_TYPE: return createThType();
			case XhtmlPackage.TR_TYPE: return createTrType();
			case XhtmlPackage.TT_TYPE: return createTtType();
			case XhtmlPackage.UL_TYPE: return createUlType();
			case XhtmlPackage.VAR_TYPE: return createVarType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case XhtmlPackage.ALIGN_TYPE:
				return createAlignTypeFromString(eDataType, initialValue);
			case XhtmlPackage.DIR_TYPE:
				return createDirTypeFromString(eDataType, initialValue);
			case XhtmlPackage.DIR_TYPE1:
				return createDirType1FromString(eDataType, initialValue);
			case XhtmlPackage.ISMAP_TYPE:
				return createIsmapTypeFromString(eDataType, initialValue);
			case XhtmlPackage.NOHREF_TYPE:
				return createNohrefTypeFromString(eDataType, initialValue);
			case XhtmlPackage.SCOPE:
				return createScopeFromString(eDataType, initialValue);
			case XhtmlPackage.SHAPE:
				return createShapeFromString(eDataType, initialValue);
			case XhtmlPackage.TFRAME:
				return createTFrameFromString(eDataType, initialValue);
			case XhtmlPackage.TRULES:
				return createTRulesFromString(eDataType, initialValue);
			case XhtmlPackage.VALIGN_TYPE:
				return createValignTypeFromString(eDataType, initialValue);
			case XhtmlPackage.ALIGN_TYPE_OBJECT:
				return createAlignTypeObjectFromString(eDataType, initialValue);
			case XhtmlPackage.CHARACTER:
				return createCharacterFromString(eDataType, initialValue);
			case XhtmlPackage.CHARSET:
				return createCharsetFromString(eDataType, initialValue);
			case XhtmlPackage.CHARSETS:
				return createCharsetsFromString(eDataType, initialValue);
			case XhtmlPackage.CONTENT_TYPE:
				return createContentTypeFromString(eDataType, initialValue);
			case XhtmlPackage.CONTENT_TYPES:
				return createContentTypesFromString(eDataType, initialValue);
			case XhtmlPackage.COORDS:
				return createCoordsFromString(eDataType, initialValue);
			case XhtmlPackage.DATETIME:
				return createDatetimeFromString(eDataType, initialValue);
			case XhtmlPackage.DIR_TYPE_OBJECT:
				return createDirTypeObjectFromString(eDataType, initialValue);
			case XhtmlPackage.DIR_TYPE_OBJECT1:
				return createDirTypeObject1FromString(eDataType, initialValue);
			case XhtmlPackage.ISMAP_TYPE_OBJECT:
				return createIsmapTypeObjectFromString(eDataType, initialValue);
			case XhtmlPackage.LANGUAGE_CODE:
				return createLanguageCodeFromString(eDataType, initialValue);
			case XhtmlPackage.LENGTH:
				return createLengthFromString(eDataType, initialValue);
			case XhtmlPackage.LINK_TYPES:
				return createLinkTypesFromString(eDataType, initialValue);
			case XhtmlPackage.MEDIA_DESC:
				return createMediaDescFromString(eDataType, initialValue);
			case XhtmlPackage.MULTI_LENGTH:
				return createMultiLengthFromString(eDataType, initialValue);
			case XhtmlPackage.NOHREF_TYPE_OBJECT:
				return createNohrefTypeObjectFromString(eDataType, initialValue);
			case XhtmlPackage.NUMBER:
				return createNumberFromString(eDataType, initialValue);
			case XhtmlPackage.PIXELS:
				return createPixelsFromString(eDataType, initialValue);
			case XhtmlPackage.SCOPE_OBJECT:
				return createScopeObjectFromString(eDataType, initialValue);
			case XhtmlPackage.SCRIPT:
				return createScriptFromString(eDataType, initialValue);
			case XhtmlPackage.SHAPE_OBJECT:
				return createShapeObjectFromString(eDataType, initialValue);
			case XhtmlPackage.STYLE_SHEET:
				return createStyleSheetFromString(eDataType, initialValue);
			case XhtmlPackage.TABINDEX_NUMBER:
				return createTabindexNumberFromString(eDataType, initialValue);
			case XhtmlPackage.TEXT:
				return createTextFromString(eDataType, initialValue);
			case XhtmlPackage.TFRAME_OBJECT:
				return createTFrameObjectFromString(eDataType, initialValue);
			case XhtmlPackage.TRULES_OBJECT:
				return createTRulesObjectFromString(eDataType, initialValue);
			case XhtmlPackage.URI:
				return createURIFromString(eDataType, initialValue);
			case XhtmlPackage.URI_LIST:
				return createUriListFromString(eDataType, initialValue);
			case XhtmlPackage.VALIGN_TYPE_OBJECT:
				return createValignTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case XhtmlPackage.ALIGN_TYPE:
				return convertAlignTypeToString(eDataType, instanceValue);
			case XhtmlPackage.DIR_TYPE:
				return convertDirTypeToString(eDataType, instanceValue);
			case XhtmlPackage.DIR_TYPE1:
				return convertDirType1ToString(eDataType, instanceValue);
			case XhtmlPackage.ISMAP_TYPE:
				return convertIsmapTypeToString(eDataType, instanceValue);
			case XhtmlPackage.NOHREF_TYPE:
				return convertNohrefTypeToString(eDataType, instanceValue);
			case XhtmlPackage.SCOPE:
				return convertScopeToString(eDataType, instanceValue);
			case XhtmlPackage.SHAPE:
				return convertShapeToString(eDataType, instanceValue);
			case XhtmlPackage.TFRAME:
				return convertTFrameToString(eDataType, instanceValue);
			case XhtmlPackage.TRULES:
				return convertTRulesToString(eDataType, instanceValue);
			case XhtmlPackage.VALIGN_TYPE:
				return convertValignTypeToString(eDataType, instanceValue);
			case XhtmlPackage.ALIGN_TYPE_OBJECT:
				return convertAlignTypeObjectToString(eDataType, instanceValue);
			case XhtmlPackage.CHARACTER:
				return convertCharacterToString(eDataType, instanceValue);
			case XhtmlPackage.CHARSET:
				return convertCharsetToString(eDataType, instanceValue);
			case XhtmlPackage.CHARSETS:
				return convertCharsetsToString(eDataType, instanceValue);
			case XhtmlPackage.CONTENT_TYPE:
				return convertContentTypeToString(eDataType, instanceValue);
			case XhtmlPackage.CONTENT_TYPES:
				return convertContentTypesToString(eDataType, instanceValue);
			case XhtmlPackage.COORDS:
				return convertCoordsToString(eDataType, instanceValue);
			case XhtmlPackage.DATETIME:
				return convertDatetimeToString(eDataType, instanceValue);
			case XhtmlPackage.DIR_TYPE_OBJECT:
				return convertDirTypeObjectToString(eDataType, instanceValue);
			case XhtmlPackage.DIR_TYPE_OBJECT1:
				return convertDirTypeObject1ToString(eDataType, instanceValue);
			case XhtmlPackage.ISMAP_TYPE_OBJECT:
				return convertIsmapTypeObjectToString(eDataType, instanceValue);
			case XhtmlPackage.LANGUAGE_CODE:
				return convertLanguageCodeToString(eDataType, instanceValue);
			case XhtmlPackage.LENGTH:
				return convertLengthToString(eDataType, instanceValue);
			case XhtmlPackage.LINK_TYPES:
				return convertLinkTypesToString(eDataType, instanceValue);
			case XhtmlPackage.MEDIA_DESC:
				return convertMediaDescToString(eDataType, instanceValue);
			case XhtmlPackage.MULTI_LENGTH:
				return convertMultiLengthToString(eDataType, instanceValue);
			case XhtmlPackage.NOHREF_TYPE_OBJECT:
				return convertNohrefTypeObjectToString(eDataType, instanceValue);
			case XhtmlPackage.NUMBER:
				return convertNumberToString(eDataType, instanceValue);
			case XhtmlPackage.PIXELS:
				return convertPixelsToString(eDataType, instanceValue);
			case XhtmlPackage.SCOPE_OBJECT:
				return convertScopeObjectToString(eDataType, instanceValue);
			case XhtmlPackage.SCRIPT:
				return convertScriptToString(eDataType, instanceValue);
			case XhtmlPackage.SHAPE_OBJECT:
				return convertShapeObjectToString(eDataType, instanceValue);
			case XhtmlPackage.STYLE_SHEET:
				return convertStyleSheetToString(eDataType, instanceValue);
			case XhtmlPackage.TABINDEX_NUMBER:
				return convertTabindexNumberToString(eDataType, instanceValue);
			case XhtmlPackage.TEXT:
				return convertTextToString(eDataType, instanceValue);
			case XhtmlPackage.TFRAME_OBJECT:
				return convertTFrameObjectToString(eDataType, instanceValue);
			case XhtmlPackage.TRULES_OBJECT:
				return convertTRulesObjectToString(eDataType, instanceValue);
			case XhtmlPackage.URI:
				return convertURIToString(eDataType, instanceValue);
			case XhtmlPackage.URI_LIST:
				return convertUriListToString(eDataType, instanceValue);
			case XhtmlPackage.VALIGN_TYPE_OBJECT:
				return convertValignTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbbrType createAbbrType() {
		AbbrTypeImpl abbrType = new AbbrTypeImpl();
		return abbrType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AContent createAContent() {
		AContentImpl aContent = new AContentImpl();
		return aContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AcronymType createAcronymType() {
		AcronymTypeImpl acronymType = new AcronymTypeImpl();
		return acronymType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddressType createAddressType() {
		AddressTypeImpl addressType = new AddressTypeImpl();
		return addressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AreaType createAreaType() {
		AreaTypeImpl areaType = new AreaTypeImpl();
		return areaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AType createAType() {
		ATypeImpl aType = new ATypeImpl();
		return aType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BdoType createBdoType() {
		BdoTypeImpl bdoType = new BdoTypeImpl();
		return bdoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigType createBigType() {
		BigTypeImpl bigType = new BigTypeImpl();
		return bigType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlockquoteType createBlockquoteType() {
		BlockquoteTypeImpl blockquoteType = new BlockquoteTypeImpl();
		return blockquoteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BrType createBrType() {
		BrTypeImpl brType = new BrTypeImpl();
		return brType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BType createBType() {
		BTypeImpl bType = new BTypeImpl();
		return bType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CaptionType createCaptionType() {
		CaptionTypeImpl captionType = new CaptionTypeImpl();
		return captionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CiteType createCiteType() {
		CiteTypeImpl citeType = new CiteTypeImpl();
		return citeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeType createCodeType() {
		CodeTypeImpl codeType = new CodeTypeImpl();
		return codeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColgroupType createColgroupType() {
		ColgroupTypeImpl colgroupType = new ColgroupTypeImpl();
		return colgroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColType createColType() {
		ColTypeImpl colType = new ColTypeImpl();
		return colType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DdType createDdType() {
		DdTypeImpl ddType = new DdTypeImpl();
		return ddType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DfnType createDfnType() {
		DfnTypeImpl dfnType = new DfnTypeImpl();
		return dfnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DivType createDivType() {
		DivTypeImpl divType = new DivTypeImpl();
		return divType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DlType createDlType() {
		DlTypeImpl dlType = new DlTypeImpl();
		return dlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DtType createDtType() {
		DtTypeImpl dtType = new DtTypeImpl();
		return dtType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmType createEmType() {
		EmTypeImpl emType = new EmTypeImpl();
		return emType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Flow createFlow() {
		FlowImpl flow = new FlowImpl();
		return flow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public H1Type createH1Type() {
		H1TypeImpl h1Type = new H1TypeImpl();
		return h1Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public H2Type createH2Type() {
		H2TypeImpl h2Type = new H2TypeImpl();
		return h2Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public H3Type createH3Type() {
		H3TypeImpl h3Type = new H3TypeImpl();
		return h3Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public H4Type createH4Type() {
		H4TypeImpl h4Type = new H4TypeImpl();
		return h4Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public H5Type createH5Type() {
		H5TypeImpl h5Type = new H5TypeImpl();
		return h5Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public H6Type createH6Type() {
		H6TypeImpl h6Type = new H6TypeImpl();
		return h6Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HrType createHrType() {
		HrTypeImpl hrType = new HrTypeImpl();
		return hrType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImgType createImgType() {
		ImgTypeImpl imgType = new ImgTypeImpl();
		return imgType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Inline createInline() {
		InlineImpl inline = new InlineImpl();
		return inline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IType createIType() {
		ITypeImpl iType = new ITypeImpl();
		return iType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KbdType createKbdType() {
		KbdTypeImpl kbdType = new KbdTypeImpl();
		return kbdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiType createLiType() {
		LiTypeImpl liType = new LiTypeImpl();
		return liType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MapType createMapType() {
		MapTypeImpl mapType = new MapTypeImpl();
		return mapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OlType createOlType() {
		OlTypeImpl olType = new OlTypeImpl();
		return olType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PreContent createPreContent() {
		PreContentImpl preContent = new PreContentImpl();
		return preContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PreType createPreType() {
		PreTypeImpl preType = new PreTypeImpl();
		return preType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PType createPType() {
		PTypeImpl pType = new PTypeImpl();
		return pType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QType createQType() {
		QTypeImpl qType = new QTypeImpl();
		return qType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SampType createSampType() {
		SampTypeImpl sampType = new SampTypeImpl();
		return sampType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SmallType createSmallType() {
		SmallTypeImpl smallType = new SmallTypeImpl();
		return smallType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpanType createSpanType() {
		SpanTypeImpl spanType = new SpanTypeImpl();
		return spanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongType createStrongType() {
		StrongTypeImpl strongType = new StrongTypeImpl();
		return strongType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubType createSubType() {
		SubTypeImpl subType = new SubTypeImpl();
		return subType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupType createSupType() {
		SupTypeImpl supType = new SupTypeImpl();
		return supType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableType createTableType() {
		TableTypeImpl tableType = new TableTypeImpl();
		return tableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TbodyType createTbodyType() {
		TbodyTypeImpl tbodyType = new TbodyTypeImpl();
		return tbodyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TdType createTdType() {
		TdTypeImpl tdType = new TdTypeImpl();
		return tdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TfootType createTfootType() {
		TfootTypeImpl tfootType = new TfootTypeImpl();
		return tfootType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TheadType createTheadType() {
		TheadTypeImpl theadType = new TheadTypeImpl();
		return theadType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThType createThType() {
		ThTypeImpl thType = new ThTypeImpl();
		return thType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrType createTrType() {
		TrTypeImpl trType = new TrTypeImpl();
		return trType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TtType createTtType() {
		TtTypeImpl ttType = new TtTypeImpl();
		return ttType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UlType createUlType() {
		UlTypeImpl ulType = new UlTypeImpl();
		return ulType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VarType createVarType() {
		VarTypeImpl varType = new VarTypeImpl();
		return varType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType createAlignTypeFromString(EDataType eDataType, String initialValue) {
		AlignType result = AlignType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirType createDirTypeFromString(EDataType eDataType, String initialValue) {
		DirType result = DirType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirType1 createDirType1FromString(EDataType eDataType, String initialValue) {
		DirType1 result = DirType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsmapType createIsmapTypeFromString(EDataType eDataType, String initialValue) {
		IsmapType result = IsmapType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIsmapTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NohrefType createNohrefTypeFromString(EDataType eDataType, String initialValue) {
		NohrefType result = NohrefType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNohrefTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope createScopeFromString(EDataType eDataType, String initialValue) {
		Scope result = Scope.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScopeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shape createShapeFromString(EDataType eDataType, String initialValue) {
		Shape result = Shape.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShapeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFrame createTFrameFromString(EDataType eDataType, String initialValue) {
		TFrame result = TFrame.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTFrameToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRules createTRulesFromString(EDataType eDataType, String initialValue) {
		TRules result = TRules.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTRulesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType createValignTypeFromString(EDataType eDataType, String initialValue) {
		ValignType result = ValignType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValignTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType createAlignTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAlignTypeFromString(XhtmlPackage.eINSTANCE.getAlignType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAlignTypeToString(XhtmlPackage.eINSTANCE.getAlignType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCharacterFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCharacterToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCharsetFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCharsetToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCharsetsFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCharsetsToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createContentTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContentTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createContentTypesFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContentTypesToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCoordsFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCoordsToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createDatetimeFromString(EDataType eDataType, String initialValue) {
		return (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE_TIME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatetimeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE_TIME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirType createDirTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDirTypeFromString(XhtmlPackage.eINSTANCE.getDirType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDirTypeToString(XhtmlPackage.eINSTANCE.getDirType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirType1 createDirTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createDirType1FromString(XhtmlPackage.eINSTANCE.getDirType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertDirType1ToString(XhtmlPackage.eINSTANCE.getDirType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsmapType createIsmapTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createIsmapTypeFromString(XhtmlPackage.eINSTANCE.getIsmapType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIsmapTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIsmapTypeToString(XhtmlPackage.eINSTANCE.getIsmapType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLanguageCodeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.LANGUAGE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLanguageCodeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.LANGUAGE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLengthFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLengthToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createLinkTypesFromString(EDataType eDataType, String initialValue) {
		return (List)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NMTOKENS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinkTypesToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NMTOKENS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMediaDescFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMediaDescToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMultiLengthFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultiLengthToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NohrefType createNohrefTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createNohrefTypeFromString(XhtmlPackage.eINSTANCE.getNohrefType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNohrefTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNohrefTypeToString(XhtmlPackage.eINSTANCE.getNohrefType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createNumberFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumberToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createPixelsFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPixelsToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope createScopeObjectFromString(EDataType eDataType, String initialValue) {
		return createScopeFromString(XhtmlPackage.eINSTANCE.getScope(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScopeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertScopeToString(XhtmlPackage.eINSTANCE.getScope(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createScriptFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScriptToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shape createShapeObjectFromString(EDataType eDataType, String initialValue) {
		return createShapeFromString(XhtmlPackage.eINSTANCE.getShape(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShapeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertShapeToString(XhtmlPackage.eINSTANCE.getShape(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStyleSheetFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleSheetToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createTabindexNumberFromString(EDataType eDataType, String initialValue) {
		return createNumberFromString(XhtmlPackage.eINSTANCE.getNumber(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTabindexNumberToString(EDataType eDataType, Object instanceValue) {
		return convertNumberToString(XhtmlPackage.eINSTANCE.getNumber(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTextFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFrame createTFrameObjectFromString(EDataType eDataType, String initialValue) {
		return createTFrameFromString(XhtmlPackage.eINSTANCE.getTFrame(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTFrameObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTFrameToString(XhtmlPackage.eINSTANCE.getTFrame(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRules createTRulesObjectFromString(EDataType eDataType, String initialValue) {
		return createTRulesFromString(XhtmlPackage.eINSTANCE.getTRules(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTRulesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTRulesToString(XhtmlPackage.eINSTANCE.getTRules(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createURIFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertURIToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUriListFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUriListToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType createValignTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createValignTypeFromString(XhtmlPackage.eINSTANCE.getValignType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValignTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertValignTypeToString(XhtmlPackage.eINSTANCE.getValignType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XhtmlPackage getXhtmlPackage() {
		return (XhtmlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XhtmlPackage getPackage() {
		return XhtmlPackage.eINSTANCE;
	}

} //XhtmlFactoryImpl
