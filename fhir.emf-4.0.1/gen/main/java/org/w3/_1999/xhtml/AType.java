/**
 */
package org.w3._1999.xhtml;

import java.math.BigInteger;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AType</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xhtml.AType#getAccesskey <em>Accesskey</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getCharset <em>Charset</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getCoords <em>Coords</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getDir <em>Dir</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getHref <em>Href</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getHreflang <em>Hreflang</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getLang <em>Lang</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getLang1 <em>Lang1</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getName <em>Name</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getRel <em>Rel</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getRev <em>Rev</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getShape <em>Shape</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getTabindex <em>Tabindex</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.w3._1999.xhtml.XhtmlPackage#getAType()
 * @model extendedMetaData="name='a_._type' kind='mixed'"
 * @generated
 */
public interface AType extends AContent {
	/**
	 * Returns the value of the '<em><b>Accesskey</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accesskey</em>' attribute.
	 * @see #setAccesskey(String)
	 * @see org.w3._1999.xhtml.XhtmlPackage#getAType_Accesskey()
	 * @model dataType="org.w3._1999.xhtml.Character"
	 *        extendedMetaData="kind='attribute' name='accesskey'"
	 * @generated
	 */
	String getAccesskey();

	/**
	 * Sets the value of the '{@link org.w3._1999.xhtml.AType#getAccesskey <em>Accesskey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accesskey</em>' attribute.
	 * @see #getAccesskey()
	 * @generated
	 */
	void setAccesskey(String value);

	/**
	 * Returns the value of the '<em><b>Charset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charset</em>' attribute.
	 * @see #setCharset(String)
	 * @see org.w3._1999.xhtml.XhtmlPackage#getAType_Charset()
	 * @model dataType="org.w3._1999.xhtml.Charset"
	 *        extendedMetaData="kind='attribute' name='charset'"
	 * @generated
	 */
	String getCharset();

	/**
	 * Sets the value of the '{@link org.w3._1999.xhtml.AType#getCharset <em>Charset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charset</em>' attribute.
	 * @see #getCharset()
	 * @generated
	 */
	void setCharset(String value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(List)
	 * @see org.w3._1999.xhtml.XhtmlPackage#getAType_Class()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKENS" many="false"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	List<String> getClass_();

	/**
	 * Sets the value of the '{@link org.w3._1999.xhtml.AType#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(List<String> value);

	/**
	 * Returns the value of the '<em><b>Coords</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coords</em>' attribute.
	 * @see #setCoords(String)
	 * @see org.w3._1999.xhtml.XhtmlPackage#getAType_Coords()
	 * @model dataType="org.w3._1999.xhtml.Coords"
	 *        extendedMetaData="kind='attribute' name='coords'"
	 * @generated
	 */
	String getCoords();

	/**
	 * Sets the value of the '{@link org.w3._1999.xhtml.AType#getCoords <em>Coords</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coords</em>' attribute.
	 * @see #getCoords()
	 * @generated
	 */
	void setCoords(String value);

	/**
	 * Returns the value of the '<em><b>Dir</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1999.xhtml.DirType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dir</em>' attribute.
	 * @see org.w3._1999.xhtml.DirType
	 * @see #isSetDir()
	 * @see #unsetDir()
	 * @see #setDir(DirType)
	 * @see org.w3._1999.xhtml.XhtmlPackage#getAType_Dir()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='dir'"
	 * @generated
	 */
	DirType getDir();

	/**
	 * Sets the value of the '{@link org.w3._1999.xhtml.AType#getDir <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dir</em>' attribute.
	 * @see org.w3._1999.xhtml.DirType
	 * @see #isSetDir()
	 * @see #unsetDir()
	 * @see #getDir()
	 * @generated
	 */
	void setDir(DirType value);

	/**
	 * Unsets the value of the '{@link org.w3._1999.xhtml.AType#getDir <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDir()
	 * @see #getDir()
	 * @see #setDir(DirType)
	 * @generated
	 */
	void unsetDir();

	/**
	 * Returns whether the value of the '{@link org.w3._1999.xhtml.AType#getDir <em>Dir</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dir</em>' attribute is set.
	 * @see #unsetDir()
	 * @see #getDir()
	 * @see #setDir(DirType)
	 * @generated
	 */
	boolean isSetDir();

	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see org.w3._1999.xhtml.XhtmlPackage#getAType_Href()
	 * @model dataType="org.w3._1999.xhtml.URI"
	 *        extendedMetaData="kind='attribute' name='href'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link org.w3._1999.xhtml.AType#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Hreflang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hreflang</em>' attribute.
	 * @see #setHreflang(String)
	 * @see org.w3._1999.xhtml.XhtmlPackage#getAType_Hreflang()
	 * @model dataType="org.w3._1999.xhtml.LanguageCode"
	 *        extendedMetaData="kind='attribute' name='hreflang'"
	 * @generated
	 */
	String getHreflang();

	/**
	 * Sets the value of the '{@link org.w3._1999.xhtml.AType#getHreflang <em>Hreflang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hreflang</em>' attribute.
	 * @see #getHreflang()
	 * @generated
	 */
	void setHreflang(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.w3._1999.xhtml.XhtmlPackage#getAType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.w3._1999.xhtml.AType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang</em>' attribute.
	 * @see #setLang(String)
	 * @see org.w3._1999.xhtml.XhtmlPackage#getAType_Lang()
	 * @model dataType="org.w3._1999.xhtml.LanguageCode"
	 *        extendedMetaData="kind='attribute' name='lang'"
	 * @generated
	 */
	String getLang();

	/**
	 * Sets the value of the '{@link org.w3._1999.xhtml.AType#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(String value);

	/**
	 * Returns the value of the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *               
	 *     <h3>lang (as an attribute name)</h3>
	 *               
	 *     <p>
	 *        denotes an attribute whose value
	 *        is a language code for the natural language of the content of
	 *        any element; its value is inherited.  This name is reserved
	 *        by virtue of its definition in the XML specification.</p>
	 *             
	 *   </div>
	 *           
	 *   <div xmlns="http://www.w3.org/1999/xhtml">
	 *               
	 *     <h4>Notes</h4>
	 *               
	 *     <p>
	 *       Attempting to install the relevant ISO 2- and 3-letter
	 *       codes as the enumerated possible values is probably never
	 *       going to be a realistic possibility.  
	 *      </p>
	 *               
	 *     <p>
	 *             See BCP 47 at 
	 *       <a href="http://www.rfc-editor.org/rfc/bcp/bcp47.txt">
	 *        http://www.rfc-editor.org/rfc/bcp/bcp47.txt</a>
	 *             and the IANA language subtag registry at
	 *       
	 *       <a href="http://www.iana.org/assignments/language-subtag-registry">
	 *        http://www.iana.org/assignments/language-subtag-registry</a>
	 *             for further information.
	 *      
	 *     </p>
	 *               
	 *     <p>
	 *       The union allows for the 'un-declaration' of xml:lang with
	 *       the empty string.
	 *      </p>
	 *             
	 *   </div>
	 *         
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lang1</em>' attribute.
	 * @see #setLang1(Object)
	 * @see org.w3._1999.xhtml.XhtmlPackage#getAType_Lang1()
	 * @model dataType="org.w3.xml._1998.namespace.LangType"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	Object getLang1();

	/**
	 * Sets the value of the '{@link org.w3._1999.xhtml.AType#getLang1 <em>Lang1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang1</em>' attribute.
	 * @see #getLang1()
	 * @generated
	 */
	void setLang1(Object value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.w3._1999.xhtml.XhtmlPackage#getAType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.w3._1999.xhtml.AType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rel</em>' attribute.
	 * @see #setRel(List)
	 * @see org.w3._1999.xhtml.XhtmlPackage#getAType_Rel()
	 * @model dataType="org.w3._1999.xhtml.LinkTypes" many="false"
	 *        extendedMetaData="kind='attribute' name='rel'"
	 * @generated
	 */
	List<String> getRel();

	/**
	 * Sets the value of the '{@link org.w3._1999.xhtml.AType#getRel <em>Rel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel</em>' attribute.
	 * @see #getRel()
	 * @generated
	 */
	void setRel(List<String> value);

	/**
	 * Returns the value of the '<em><b>Rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rev</em>' attribute.
	 * @see #setRev(List)
	 * @see org.w3._1999.xhtml.XhtmlPackage#getAType_Rev()
	 * @model dataType="org.w3._1999.xhtml.LinkTypes" many="false"
	 *        extendedMetaData="kind='attribute' name='rev'"
	 * @generated
	 */
	List<String> getRev();

	/**
	 * Sets the value of the '{@link org.w3._1999.xhtml.AType#getRev <em>Rev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rev</em>' attribute.
	 * @see #getRev()
	 * @generated
	 */
	void setRev(List<String> value);

	/**
	 * Returns the value of the '<em><b>Shape</b></em>' attribute.
	 * The default value is <code>"rect"</code>.
	 * The literals are from the enumeration {@link org.w3._1999.xhtml.Shape}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape</em>' attribute.
	 * @see org.w3._1999.xhtml.Shape
	 * @see #isSetShape()
	 * @see #unsetShape()
	 * @see #setShape(Shape)
	 * @see org.w3._1999.xhtml.XhtmlPackage#getAType_Shape()
	 * @model default="rect" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='shape'"
	 * @generated
	 */
	Shape getShape();

	/**
	 * Sets the value of the '{@link org.w3._1999.xhtml.AType#getShape <em>Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape</em>' attribute.
	 * @see org.w3._1999.xhtml.Shape
	 * @see #isSetShape()
	 * @see #unsetShape()
	 * @see #getShape()
	 * @generated
	 */
	void setShape(Shape value);

	/**
	 * Unsets the value of the '{@link org.w3._1999.xhtml.AType#getShape <em>Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShape()
	 * @see #getShape()
	 * @see #setShape(Shape)
	 * @generated
	 */
	void unsetShape();

	/**
	 * Returns whether the value of the '{@link org.w3._1999.xhtml.AType#getShape <em>Shape</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shape</em>' attribute is set.
	 * @see #unsetShape()
	 * @see #getShape()
	 * @see #setShape(Shape)
	 * @generated
	 */
	boolean isSetShape();

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(String)
	 * @see org.w3._1999.xhtml.XhtmlPackage#getAType_Style()
	 * @model dataType="org.w3._1999.xhtml.StyleSheet"
	 *        extendedMetaData="kind='attribute' name='style'"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link org.w3._1999.xhtml.AType#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

	/**
	 * Returns the value of the '<em><b>Tabindex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tabindex</em>' attribute.
	 * @see #setTabindex(BigInteger)
	 * @see org.w3._1999.xhtml.XhtmlPackage#getAType_Tabindex()
	 * @model dataType="org.w3._1999.xhtml.TabindexNumber"
	 *        extendedMetaData="kind='attribute' name='tabindex'"
	 * @generated
	 */
	BigInteger getTabindex();

	/**
	 * Sets the value of the '{@link org.w3._1999.xhtml.AType#getTabindex <em>Tabindex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tabindex</em>' attribute.
	 * @see #getTabindex()
	 * @generated
	 */
	void setTabindex(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.w3._1999.xhtml.XhtmlPackage#getAType_Title()
	 * @model dataType="org.w3._1999.xhtml.Text"
	 *        extendedMetaData="kind='attribute' name='title'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.w3._1999.xhtml.AType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.w3._1999.xhtml.XhtmlPackage#getAType_Type()
	 * @model dataType="org.w3._1999.xhtml.ContentType"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.w3._1999.xhtml.AType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // AType
