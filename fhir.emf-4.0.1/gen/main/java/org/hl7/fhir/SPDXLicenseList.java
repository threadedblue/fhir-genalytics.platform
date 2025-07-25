/**
 */
package org.hl7.fhir;

import java.lang.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>SPDX License List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getSPDXLicenseList()
 * @model extendedMetaData="name='SPDXLicense-list'"
 * @generated
 */
public enum SPDXLicenseList implements Enumerator {
	/**
	 * The '<em><b>Not Open Source</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not open source
	 * <!-- end-model-doc -->
	 * @see #NOT_OPEN_SOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_OPEN_SOURCE(0, "notOpenSource", "not-open-source"),

	/**
	 * The '<em><b>0BSD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD Zero Clause License
	 * <!-- end-model-doc -->
	 * @see #_0BSD_VALUE
	 * @generated
	 * @ordered
	 */
	_0BSD(1, "_0BSD", "0BSD"),

	/**
	 * The '<em><b>AAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attribution Assurance License
	 * <!-- end-model-doc -->
	 * @see #AAL_VALUE
	 * @generated
	 * @ordered
	 */
	AAL(2, "AAL", "AAL"),

	/**
	 * The '<em><b>Abstyles</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abstyles License
	 * <!-- end-model-doc -->
	 * @see #ABSTYLES_VALUE
	 * @generated
	 * @ordered
	 */
	ABSTYLES(3, "Abstyles", "Abstyles"),

	/**
	 * The '<em><b>Adobe2006</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adobe Systems Incorporated Source Code License Agreement
	 * <!-- end-model-doc -->
	 * @see #ADOBE2006_VALUE
	 * @generated
	 * @ordered
	 */
	ADOBE2006(4, "Adobe2006", "Adobe-2006"),

	/**
	 * The '<em><b>Adobe Glyph</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adobe Glyph List License
	 * <!-- end-model-doc -->
	 * @see #ADOBE_GLYPH_VALUE
	 * @generated
	 * @ordered
	 */
	ADOBE_GLYPH(5, "AdobeGlyph", "Adobe-Glyph"),

	/**
	 * The '<em><b>ADSL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Amazon Digital Services License
	 * <!-- end-model-doc -->
	 * @see #ADSL_VALUE
	 * @generated
	 * @ordered
	 */
	ADSL(6, "ADSL", "ADSL"),

	/**
	 * The '<em><b>AFL11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Academic Free License v1.1
	 * <!-- end-model-doc -->
	 * @see #AFL11_VALUE
	 * @generated
	 * @ordered
	 */
	AFL11(7, "AFL11", "AFL-1.1"),

	/**
	 * The '<em><b>AFL12</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Academic Free License v1.2
	 * <!-- end-model-doc -->
	 * @see #AFL12_VALUE
	 * @generated
	 * @ordered
	 */
	AFL12(8, "AFL12", "AFL-1.2"),

	/**
	 * The '<em><b>AFL20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Academic Free License v2.0
	 * <!-- end-model-doc -->
	 * @see #AFL20_VALUE
	 * @generated
	 * @ordered
	 */
	AFL20(9, "AFL20", "AFL-2.0"),

	/**
	 * The '<em><b>AFL21</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Academic Free License v2.1
	 * <!-- end-model-doc -->
	 * @see #AFL21_VALUE
	 * @generated
	 * @ordered
	 */
	AFL21(10, "AFL21", "AFL-2.1"),

	/**
	 * The '<em><b>AFL30</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Academic Free License v3.0
	 * <!-- end-model-doc -->
	 * @see #AFL30_VALUE
	 * @generated
	 * @ordered
	 */
	AFL30(11, "AFL30", "AFL-3.0"),

	/**
	 * The '<em><b>Afmparse</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Afmparse License
	 * <!-- end-model-doc -->
	 * @see #AFMPARSE_VALUE
	 * @generated
	 * @ordered
	 */
	AFMPARSE(12, "Afmparse", "Afmparse"),

	/**
	 * The '<em><b>AGPL10 Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Affero General Public License v1.0 only
	 * <!-- end-model-doc -->
	 * @see #AGPL10_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	AGPL10_ONLY(13, "AGPL10Only", "AGPL-1.0-only"),

	/**
	 * The '<em><b>AGPL10 Or Later</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Affero General Public License v1.0 or later
	 * <!-- end-model-doc -->
	 * @see #AGPL10_OR_LATER_VALUE
	 * @generated
	 * @ordered
	 */
	AGPL10_OR_LATER(14, "AGPL10OrLater", "AGPL-1.0-or-later"),

	/**
	 * The '<em><b>AGPL30 Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Affero General Public License v3.0 only
	 * <!-- end-model-doc -->
	 * @see #AGPL30_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	AGPL30_ONLY(15, "AGPL30Only", "AGPL-3.0-only"),

	/**
	 * The '<em><b>AGPL30 Or Later</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Affero General Public License v3.0 or later
	 * <!-- end-model-doc -->
	 * @see #AGPL30_OR_LATER_VALUE
	 * @generated
	 * @ordered
	 */
	AGPL30_OR_LATER(16, "AGPL30OrLater", "AGPL-3.0-or-later"),

	/**
	 * The '<em><b>Aladdin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Aladdin Free Public License
	 * <!-- end-model-doc -->
	 * @see #ALADDIN_VALUE
	 * @generated
	 * @ordered
	 */
	ALADDIN(17, "Aladdin", "Aladdin"),

	/**
	 * The '<em><b>AMDPLPA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AMD's plpa_map.c License
	 * <!-- end-model-doc -->
	 * @see #AMDPLPA_VALUE
	 * @generated
	 * @ordered
	 */
	AMDPLPA(18, "AMDPLPA", "AMDPLPA"),

	/**
	 * The '<em><b>AML</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Apple MIT License
	 * <!-- end-model-doc -->
	 * @see #AML_VALUE
	 * @generated
	 * @ordered
	 */
	AML(19, "AML", "AML"),

	/**
	 * The '<em><b>AMPAS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Academy of Motion Picture Arts and Sciences BSD
	 * <!-- end-model-doc -->
	 * @see #AMPAS_VALUE
	 * @generated
	 * @ordered
	 */
	AMPAS(20, "AMPAS", "AMPAS"),

	/**
	 * The '<em><b>ANTLRPD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ANTLR Software Rights Notice
	 * <!-- end-model-doc -->
	 * @see #ANTLRPD_VALUE
	 * @generated
	 * @ordered
	 */
	ANTLRPD(21, "ANTLRPD", "ANTLR-PD"),

	/**
	 * The '<em><b>Apache10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Apache License 1.0
	 * <!-- end-model-doc -->
	 * @see #APACHE10_VALUE
	 * @generated
	 * @ordered
	 */
	APACHE10(22, "Apache10", "Apache-1.0"),

	/**
	 * The '<em><b>Apache11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Apache License 1.1
	 * <!-- end-model-doc -->
	 * @see #APACHE11_VALUE
	 * @generated
	 * @ordered
	 */
	APACHE11(23, "Apache11", "Apache-1.1"),

	/**
	 * The '<em><b>Apache20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Apache License 2.0
	 * <!-- end-model-doc -->
	 * @see #APACHE20_VALUE
	 * @generated
	 * @ordered
	 */
	APACHE20(24, "Apache20", "Apache-2.0"),

	/**
	 * The '<em><b>APAFML</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adobe Postscript AFM License
	 * <!-- end-model-doc -->
	 * @see #APAFML_VALUE
	 * @generated
	 * @ordered
	 */
	APAFML(25, "APAFML", "APAFML"),

	/**
	 * The '<em><b>APL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adaptive Public License 1.0
	 * <!-- end-model-doc -->
	 * @see #APL10_VALUE
	 * @generated
	 * @ordered
	 */
	APL10(26, "APL10", "APL-1.0"),

	/**
	 * The '<em><b>APSL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Apple Public Source License 1.0
	 * <!-- end-model-doc -->
	 * @see #APSL10_VALUE
	 * @generated
	 * @ordered
	 */
	APSL10(27, "APSL10", "APSL-1.0"),

	/**
	 * The '<em><b>APSL11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Apple Public Source License 1.1
	 * <!-- end-model-doc -->
	 * @see #APSL11_VALUE
	 * @generated
	 * @ordered
	 */
	APSL11(28, "APSL11", "APSL-1.1"),

	/**
	 * The '<em><b>APSL12</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Apple Public Source License 1.2
	 * <!-- end-model-doc -->
	 * @see #APSL12_VALUE
	 * @generated
	 * @ordered
	 */
	APSL12(29, "APSL12", "APSL-1.2"),

	/**
	 * The '<em><b>APSL20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Apple Public Source License 2.0
	 * <!-- end-model-doc -->
	 * @see #APSL20_VALUE
	 * @generated
	 * @ordered
	 */
	APSL20(30, "APSL20", "APSL-2.0"),

	/**
	 * The '<em><b>Artistic10 Cl8</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Artistic License 1.0 w/clause 8
	 * <!-- end-model-doc -->
	 * @see #ARTISTIC10_CL8_VALUE
	 * @generated
	 * @ordered
	 */
	ARTISTIC10_CL8(31, "Artistic10Cl8", "Artistic-1.0-cl8"),

	/**
	 * The '<em><b>Artistic10 Perl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Artistic License 1.0 (Perl)
	 * <!-- end-model-doc -->
	 * @see #ARTISTIC10_PERL_VALUE
	 * @generated
	 * @ordered
	 */
	ARTISTIC10_PERL(32, "Artistic10Perl", "Artistic-1.0-Perl"),

	/**
	 * The '<em><b>Artistic10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Artistic License 1.0
	 * <!-- end-model-doc -->
	 * @see #ARTISTIC10_VALUE
	 * @generated
	 * @ordered
	 */
	ARTISTIC10(33, "Artistic10", "Artistic-1.0"),

	/**
	 * The '<em><b>Artistic20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Artistic License 2.0
	 * <!-- end-model-doc -->
	 * @see #ARTISTIC20_VALUE
	 * @generated
	 * @ordered
	 */
	ARTISTIC20(34, "Artistic20", "Artistic-2.0"),

	/**
	 * The '<em><b>Bahyph</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bahyph License
	 * <!-- end-model-doc -->
	 * @see #BAHYPH_VALUE
	 * @generated
	 * @ordered
	 */
	BAHYPH(35, "Bahyph", "Bahyph"),

	/**
	 * The '<em><b>Barr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Barr License
	 * <!-- end-model-doc -->
	 * @see #BARR_VALUE
	 * @generated
	 * @ordered
	 */
	BARR(36, "Barr", "Barr"),

	/**
	 * The '<em><b>Beerware</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Beerware License
	 * <!-- end-model-doc -->
	 * @see #BEERWARE_VALUE
	 * @generated
	 * @ordered
	 */
	BEERWARE(37, "Beerware", "Beerware"),

	/**
	 * The '<em><b>Bit Torrent10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BitTorrent Open Source License v1.0
	 * <!-- end-model-doc -->
	 * @see #BIT_TORRENT10_VALUE
	 * @generated
	 * @ordered
	 */
	BIT_TORRENT10(38, "BitTorrent10", "BitTorrent-1.0"),

	/**
	 * The '<em><b>Bit Torrent11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BitTorrent Open Source License v1.1
	 * <!-- end-model-doc -->
	 * @see #BIT_TORRENT11_VALUE
	 * @generated
	 * @ordered
	 */
	BIT_TORRENT11(39, "BitTorrent11", "BitTorrent-1.1"),

	/**
	 * The '<em><b>Borceux</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Borceux license
	 * <!-- end-model-doc -->
	 * @see #BORCEUX_VALUE
	 * @generated
	 * @ordered
	 */
	BORCEUX(40, "Borceux", "Borceux"),

	/**
	 * The '<em><b>BSD1 Clause</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 1-Clause License
	 * <!-- end-model-doc -->
	 * @see #BSD1_CLAUSE_VALUE
	 * @generated
	 * @ordered
	 */
	BSD1_CLAUSE(41, "BSD1Clause", "BSD-1-Clause"),

	/**
	 * The '<em><b>BSD2 Clause Free BSD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 2-Clause FreeBSD License
	 * <!-- end-model-doc -->
	 * @see #BSD2_CLAUSE_FREE_BSD_VALUE
	 * @generated
	 * @ordered
	 */
	BSD2_CLAUSE_FREE_BSD(42, "BSD2ClauseFreeBSD", "BSD-2-Clause-FreeBSD"),

	/**
	 * The '<em><b>BSD2 Clause Net BSD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 2-Clause NetBSD License
	 * <!-- end-model-doc -->
	 * @see #BSD2_CLAUSE_NET_BSD_VALUE
	 * @generated
	 * @ordered
	 */
	BSD2_CLAUSE_NET_BSD(43, "BSD2ClauseNetBSD", "BSD-2-Clause-NetBSD"),

	/**
	 * The '<em><b>BSD2 Clause Patent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD-2-Clause Plus Patent License
	 * <!-- end-model-doc -->
	 * @see #BSD2_CLAUSE_PATENT_VALUE
	 * @generated
	 * @ordered
	 */
	BSD2_CLAUSE_PATENT(44, "BSD2ClausePatent", "BSD-2-Clause-Patent"),

	/**
	 * The '<em><b>BSD2 Clause</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 2-Clause "Simplified" License
	 * <!-- end-model-doc -->
	 * @see #BSD2_CLAUSE_VALUE
	 * @generated
	 * @ordered
	 */
	BSD2_CLAUSE(45, "BSD2Clause", "BSD-2-Clause"),

	/**
	 * The '<em><b>BSD3 Clause Attribution</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD with attribution
	 * <!-- end-model-doc -->
	 * @see #BSD3_CLAUSE_ATTRIBUTION_VALUE
	 * @generated
	 * @ordered
	 */
	BSD3_CLAUSE_ATTRIBUTION(46, "BSD3ClauseAttribution", "BSD-3-Clause-Attribution"),

	/**
	 * The '<em><b>BSD3 Clause Clear</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 3-Clause Clear License
	 * <!-- end-model-doc -->
	 * @see #BSD3_CLAUSE_CLEAR_VALUE
	 * @generated
	 * @ordered
	 */
	BSD3_CLAUSE_CLEAR(47, "BSD3ClauseClear", "BSD-3-Clause-Clear"),

	/**
	 * The '<em><b>BSD3 Clause LBNL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lawrence Berkeley National Labs BSD variant license
	 * <!-- end-model-doc -->
	 * @see #BSD3_CLAUSE_LBNL_VALUE
	 * @generated
	 * @ordered
	 */
	BSD3_CLAUSE_LBNL(48, "BSD3ClauseLBNL", "BSD-3-Clause-LBNL"),

	/**
	 * The '<em><b>BSD3 Clause No Nuclear License2014</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 3-Clause No Nuclear License 2014
	 * <!-- end-model-doc -->
	 * @see #BSD3_CLAUSE_NO_NUCLEAR_LICENSE2014_VALUE
	 * @generated
	 * @ordered
	 */
	BSD3_CLAUSE_NO_NUCLEAR_LICENSE2014(49, "BSD3ClauseNoNuclearLicense2014", "BSD-3-Clause-No-Nuclear-License-2014"),

	/**
	 * The '<em><b>BSD3 Clause No Nuclear License</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 3-Clause No Nuclear License
	 * <!-- end-model-doc -->
	 * @see #BSD3_CLAUSE_NO_NUCLEAR_LICENSE_VALUE
	 * @generated
	 * @ordered
	 */
	BSD3_CLAUSE_NO_NUCLEAR_LICENSE(50, "BSD3ClauseNoNuclearLicense", "BSD-3-Clause-No-Nuclear-License"),

	/**
	 * The '<em><b>BSD3 Clause No Nuclear Warranty</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 3-Clause No Nuclear Warranty
	 * <!-- end-model-doc -->
	 * @see #BSD3_CLAUSE_NO_NUCLEAR_WARRANTY_VALUE
	 * @generated
	 * @ordered
	 */
	BSD3_CLAUSE_NO_NUCLEAR_WARRANTY(51, "BSD3ClauseNoNuclearWarranty", "BSD-3-Clause-No-Nuclear-Warranty"),

	/**
	 * The '<em><b>BSD3 Clause</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 3-Clause "New" or "Revised" License
	 * <!-- end-model-doc -->
	 * @see #BSD3_CLAUSE_VALUE
	 * @generated
	 * @ordered
	 */
	BSD3_CLAUSE(52, "BSD3Clause", "BSD-3-Clause"),

	/**
	 * The '<em><b>BSD4 Clause UC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD-4-Clause (University of California-Specific)
	 * <!-- end-model-doc -->
	 * @see #BSD4_CLAUSE_UC_VALUE
	 * @generated
	 * @ordered
	 */
	BSD4_CLAUSE_UC(53, "BSD4ClauseUC", "BSD-4-Clause-UC"),

	/**
	 * The '<em><b>BSD4 Clause</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 4-Clause "Original" or "Old" License
	 * <!-- end-model-doc -->
	 * @see #BSD4_CLAUSE_VALUE
	 * @generated
	 * @ordered
	 */
	BSD4_CLAUSE(54, "BSD4Clause", "BSD-4-Clause"),

	/**
	 * The '<em><b>BSD Protection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD Protection License
	 * <!-- end-model-doc -->
	 * @see #BSD_PROTECTION_VALUE
	 * @generated
	 * @ordered
	 */
	BSD_PROTECTION(55, "BSDProtection", "BSD-Protection"),

	/**
	 * The '<em><b>BSD Source Code</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD Source Code Attribution
	 * <!-- end-model-doc -->
	 * @see #BSD_SOURCE_CODE_VALUE
	 * @generated
	 * @ordered
	 */
	BSD_SOURCE_CODE(56, "BSDSourceCode", "BSD-Source-Code"),

	/**
	 * The '<em><b>BSL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boost Software License 1.0
	 * <!-- end-model-doc -->
	 * @see #BSL10_VALUE
	 * @generated
	 * @ordered
	 */
	BSL10(57, "BSL10", "BSL-1.0"),

	/**
	 * The '<em><b>Bzip2105</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * bzip2 and libbzip2 License v1.0.5
	 * <!-- end-model-doc -->
	 * @see #BZIP2105_VALUE
	 * @generated
	 * @ordered
	 */
	BZIP2105(58, "bzip2105", "bzip2-1.0.5"),

	/**
	 * The '<em><b>Bzip2106</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * bzip2 and libbzip2 License v1.0.6
	 * <!-- end-model-doc -->
	 * @see #BZIP2106_VALUE
	 * @generated
	 * @ordered
	 */
	BZIP2106(59, "bzip2106", "bzip2-1.0.6"),

	/**
	 * The '<em><b>Caldera</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Caldera License
	 * <!-- end-model-doc -->
	 * @see #CALDERA_VALUE
	 * @generated
	 * @ordered
	 */
	CALDERA(60, "Caldera", "Caldera"),

	/**
	 * The '<em><b>CATOSL11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Computer Associates Trusted Open Source License 1.1
	 * <!-- end-model-doc -->
	 * @see #CATOSL11_VALUE
	 * @generated
	 * @ordered
	 */
	CATOSL11(61, "CATOSL11", "CATOSL-1.1"),

	/**
	 * The '<em><b>CCBY10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution 1.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBY10_VALUE
	 * @generated
	 * @ordered
	 */
	CCBY10(62, "CCBY10", "CC-BY-1.0"),

	/**
	 * The '<em><b>CCBY20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution 2.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBY20_VALUE
	 * @generated
	 * @ordered
	 */
	CCBY20(63, "CCBY20", "CC-BY-2.0"),

	/**
	 * The '<em><b>CCBY25</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution 2.5 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBY25_VALUE
	 * @generated
	 * @ordered
	 */
	CCBY25(64, "CCBY25", "CC-BY-2.5"),

	/**
	 * The '<em><b>CCBY30</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution 3.0 Unported
	 * <!-- end-model-doc -->
	 * @see #CCBY30_VALUE
	 * @generated
	 * @ordered
	 */
	CCBY30(65, "CCBY30", "CC-BY-3.0"),

	/**
	 * The '<em><b>CCBY40</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution 4.0 International
	 * <!-- end-model-doc -->
	 * @see #CCBY40_VALUE
	 * @generated
	 * @ordered
	 */
	CCBY40(66, "CCBY40", "CC-BY-4.0"),

	/**
	 * The '<em><b>CCBYNC10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial 1.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYNC10_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYNC10(67, "CCBYNC10", "CC-BY-NC-1.0"),

	/**
	 * The '<em><b>CCBYNC20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial 2.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYNC20_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYNC20(68, "CCBYNC20", "CC-BY-NC-2.0"),

	/**
	 * The '<em><b>CCBYNC25</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial 2.5 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYNC25_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYNC25(69, "CCBYNC25", "CC-BY-NC-2.5"),

	/**
	 * The '<em><b>CCBYNC30</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial 3.0 Unported
	 * <!-- end-model-doc -->
	 * @see #CCBYNC30_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYNC30(70, "CCBYNC30", "CC-BY-NC-3.0"),

	/**
	 * The '<em><b>CCBYNC40</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial 4.0 International
	 * <!-- end-model-doc -->
	 * @see #CCBYNC40_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYNC40(71, "CCBYNC40", "CC-BY-NC-4.0"),

	/**
	 * The '<em><b>CCBYNCND10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial No Derivatives 1.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYNCND10_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYNCND10(72, "CCBYNCND10", "CC-BY-NC-ND-1.0"),

	/**
	 * The '<em><b>CCBYNCND20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial No Derivatives 2.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYNCND20_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYNCND20(73, "CCBYNCND20", "CC-BY-NC-ND-2.0"),

	/**
	 * The '<em><b>CCBYNCND25</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial No Derivatives 2.5 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYNCND25_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYNCND25(74, "CCBYNCND25", "CC-BY-NC-ND-2.5"),

	/**
	 * The '<em><b>CCBYNCND30</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial No Derivatives 3.0 Unported
	 * <!-- end-model-doc -->
	 * @see #CCBYNCND30_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYNCND30(75, "CCBYNCND30", "CC-BY-NC-ND-3.0"),

	/**
	 * The '<em><b>CCBYNCND40</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial No Derivatives 4.0 International
	 * <!-- end-model-doc -->
	 * @see #CCBYNCND40_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYNCND40(76, "CCBYNCND40", "CC-BY-NC-ND-4.0"),

	/**
	 * The '<em><b>CCBYNCSA10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial Share Alike 1.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYNCSA10_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYNCSA10(77, "CCBYNCSA10", "CC-BY-NC-SA-1.0"),

	/**
	 * The '<em><b>CCBYNCSA20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial Share Alike 2.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYNCSA20_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYNCSA20(78, "CCBYNCSA20", "CC-BY-NC-SA-2.0"),

	/**
	 * The '<em><b>CCBYNCSA25</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial Share Alike 2.5 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYNCSA25_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYNCSA25(79, "CCBYNCSA25", "CC-BY-NC-SA-2.5"),

	/**
	 * The '<em><b>CCBYNCSA30</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial Share Alike 3.0 Unported
	 * <!-- end-model-doc -->
	 * @see #CCBYNCSA30_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYNCSA30(80, "CCBYNCSA30", "CC-BY-NC-SA-3.0"),

	/**
	 * The '<em><b>CCBYNCSA40</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial Share Alike 4.0 International
	 * <!-- end-model-doc -->
	 * @see #CCBYNCSA40_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYNCSA40(81, "CCBYNCSA40", "CC-BY-NC-SA-4.0"),

	/**
	 * The '<em><b>CCBYND10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution No Derivatives 1.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYND10_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYND10(82, "CCBYND10", "CC-BY-ND-1.0"),

	/**
	 * The '<em><b>CCBYND20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution No Derivatives 2.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYND20_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYND20(83, "CCBYND20", "CC-BY-ND-2.0"),

	/**
	 * The '<em><b>CCBYND25</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution No Derivatives 2.5 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYND25_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYND25(84, "CCBYND25", "CC-BY-ND-2.5"),

	/**
	 * The '<em><b>CCBYND30</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution No Derivatives 3.0 Unported
	 * <!-- end-model-doc -->
	 * @see #CCBYND30_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYND30(85, "CCBYND30", "CC-BY-ND-3.0"),

	/**
	 * The '<em><b>CCBYND40</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution No Derivatives 4.0 International
	 * <!-- end-model-doc -->
	 * @see #CCBYND40_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYND40(86, "CCBYND40", "CC-BY-ND-4.0"),

	/**
	 * The '<em><b>CCBYSA10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Share Alike 1.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYSA10_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYSA10(87, "CCBYSA10", "CC-BY-SA-1.0"),

	/**
	 * The '<em><b>CCBYSA20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Share Alike 2.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYSA20_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYSA20(88, "CCBYSA20", "CC-BY-SA-2.0"),

	/**
	 * The '<em><b>CCBYSA25</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Share Alike 2.5 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYSA25_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYSA25(89, "CCBYSA25", "CC-BY-SA-2.5"),

	/**
	 * The '<em><b>CCBYSA30</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Share Alike 3.0 Unported
	 * <!-- end-model-doc -->
	 * @see #CCBYSA30_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYSA30(90, "CCBYSA30", "CC-BY-SA-3.0"),

	/**
	 * The '<em><b>CCBYSA40</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Share Alike 4.0 International
	 * <!-- end-model-doc -->
	 * @see #CCBYSA40_VALUE
	 * @generated
	 * @ordered
	 */
	CCBYSA40(91, "CCBYSA40", "CC-BY-SA-4.0"),

	/**
	 * The '<em><b>CC010</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Zero v1.0 Universal
	 * <!-- end-model-doc -->
	 * @see #CC010_VALUE
	 * @generated
	 * @ordered
	 */
	CC010(92, "CC010", "CC0-1.0"),

	/**
	 * The '<em><b>CDDL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Common Development and Distribution License 1.0
	 * <!-- end-model-doc -->
	 * @see #CDDL10_VALUE
	 * @generated
	 * @ordered
	 */
	CDDL10(93, "CDDL10", "CDDL-1.0"),

	/**
	 * The '<em><b>CDDL11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Common Development and Distribution License 1.1
	 * <!-- end-model-doc -->
	 * @see #CDDL11_VALUE
	 * @generated
	 * @ordered
	 */
	CDDL11(94, "CDDL11", "CDDL-1.1"),

	/**
	 * The '<em><b>CDLA Permissive10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Community Data License Agreement Permissive 1.0
	 * <!-- end-model-doc -->
	 * @see #CDLA_PERMISSIVE10_VALUE
	 * @generated
	 * @ordered
	 */
	CDLA_PERMISSIVE10(95, "CDLAPermissive10", "CDLA-Permissive-1.0"),

	/**
	 * The '<em><b>CDLA Sharing10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Community Data License Agreement Sharing 1.0
	 * <!-- end-model-doc -->
	 * @see #CDLA_SHARING10_VALUE
	 * @generated
	 * @ordered
	 */
	CDLA_SHARING10(96, "CDLASharing10", "CDLA-Sharing-1.0"),

	/**
	 * The '<em><b>CECILL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CeCILL Free Software License Agreement v1.0
	 * <!-- end-model-doc -->
	 * @see #CECILL10_VALUE
	 * @generated
	 * @ordered
	 */
	CECILL10(97, "CECILL10", "CECILL-1.0"),

	/**
	 * The '<em><b>CECILL11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CeCILL Free Software License Agreement v1.1
	 * <!-- end-model-doc -->
	 * @see #CECILL11_VALUE
	 * @generated
	 * @ordered
	 */
	CECILL11(98, "CECILL11", "CECILL-1.1"),

	/**
	 * The '<em><b>CECILL20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CeCILL Free Software License Agreement v2.0
	 * <!-- end-model-doc -->
	 * @see #CECILL20_VALUE
	 * @generated
	 * @ordered
	 */
	CECILL20(99, "CECILL20", "CECILL-2.0"),

	/**
	 * The '<em><b>CECILL21</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CeCILL Free Software License Agreement v2.1
	 * <!-- end-model-doc -->
	 * @see #CECILL21_VALUE
	 * @generated
	 * @ordered
	 */
	CECILL21(100, "CECILL21", "CECILL-2.1"),

	/**
	 * The '<em><b>CECILLB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CeCILL-B Free Software License Agreement
	 * <!-- end-model-doc -->
	 * @see #CECILLB_VALUE
	 * @generated
	 * @ordered
	 */
	CECILLB(101, "CECILLB", "CECILL-B"),

	/**
	 * The '<em><b>CECILLC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CeCILL-C Free Software License Agreement
	 * <!-- end-model-doc -->
	 * @see #CECILLC_VALUE
	 * @generated
	 * @ordered
	 */
	CECILLC(102, "CECILLC", "CECILL-C"),

	/**
	 * The '<em><b>Cl Artistic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Clarified Artistic License
	 * <!-- end-model-doc -->
	 * @see #CL_ARTISTIC_VALUE
	 * @generated
	 * @ordered
	 */
	CL_ARTISTIC(103, "ClArtistic", "ClArtistic"),

	/**
	 * The '<em><b>CNRI Jython</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CNRI Jython License
	 * <!-- end-model-doc -->
	 * @see #CNRI_JYTHON_VALUE
	 * @generated
	 * @ordered
	 */
	CNRI_JYTHON(104, "CNRIJython", "CNRI-Jython"),

	/**
	 * The '<em><b>CNRI Python GPL Compatible</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CNRI Python Open Source GPL Compatible License Agreement
	 * <!-- end-model-doc -->
	 * @see #CNRI_PYTHON_GPL_COMPATIBLE_VALUE
	 * @generated
	 * @ordered
	 */
	CNRI_PYTHON_GPL_COMPATIBLE(105, "CNRIPythonGPLCompatible", "CNRI-Python-GPL-Compatible"),

	/**
	 * The '<em><b>CNRI Python</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CNRI Python License
	 * <!-- end-model-doc -->
	 * @see #CNRI_PYTHON_VALUE
	 * @generated
	 * @ordered
	 */
	CNRI_PYTHON(106, "CNRIPython", "CNRI-Python"),

	/**
	 * The '<em><b>Condor11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Condor Public License v1.1
	 * <!-- end-model-doc -->
	 * @see #CONDOR11_VALUE
	 * @generated
	 * @ordered
	 */
	CONDOR11(107, "Condor11", "Condor-1.1"),

	/**
	 * The '<em><b>CPAL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Common Public Attribution License 1.0
	 * <!-- end-model-doc -->
	 * @see #CPAL10_VALUE
	 * @generated
	 * @ordered
	 */
	CPAL10(108, "CPAL10", "CPAL-1.0"),

	/**
	 * The '<em><b>CPL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Common Public License 1.0
	 * <!-- end-model-doc -->
	 * @see #CPL10_VALUE
	 * @generated
	 * @ordered
	 */
	CPL10(109, "CPL10", "CPL-1.0"),

	/**
	 * The '<em><b>CPOL102</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Code Project Open License 1.02
	 * <!-- end-model-doc -->
	 * @see #CPOL102_VALUE
	 * @generated
	 * @ordered
	 */
	CPOL102(110, "CPOL102", "CPOL-1.02"),

	/**
	 * The '<em><b>Crossword</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Crossword License
	 * <!-- end-model-doc -->
	 * @see #CROSSWORD_VALUE
	 * @generated
	 * @ordered
	 */
	CROSSWORD(111, "Crossword", "Crossword"),

	/**
	 * The '<em><b>Crystal Stacker</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CrystalStacker License
	 * <!-- end-model-doc -->
	 * @see #CRYSTAL_STACKER_VALUE
	 * @generated
	 * @ordered
	 */
	CRYSTAL_STACKER(112, "CrystalStacker", "CrystalStacker"),

	/**
	 * The '<em><b>CUAOPL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CUA Office Public License v1.0
	 * <!-- end-model-doc -->
	 * @see #CUAOPL10_VALUE
	 * @generated
	 * @ordered
	 */
	CUAOPL10(113, "CUAOPL10", "CUA-OPL-1.0"),

	/**
	 * The '<em><b>Cube</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cube License
	 * <!-- end-model-doc -->
	 * @see #CUBE_VALUE
	 * @generated
	 * @ordered
	 */
	CUBE(114, "Cube", "Cube"),

	/**
	 * The '<em><b>Curl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * curl License
	 * <!-- end-model-doc -->
	 * @see #CURL_VALUE
	 * @generated
	 * @ordered
	 */
	CURL(115, "curl", "curl"),

	/**
	 * The '<em><b>DFSL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Deutsche Freie Software Lizenz
	 * <!-- end-model-doc -->
	 * @see #DFSL10_VALUE
	 * @generated
	 * @ordered
	 */
	DFSL10(116, "DFSL10", "D-FSL-1.0"),

	/**
	 * The '<em><b>Diffmark</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * diffmark license
	 * <!-- end-model-doc -->
	 * @see #DIFFMARK_VALUE
	 * @generated
	 * @ordered
	 */
	DIFFMARK(117, "diffmark", "diffmark"),

	/**
	 * The '<em><b>DOC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DOC License
	 * <!-- end-model-doc -->
	 * @see #DOC_VALUE
	 * @generated
	 * @ordered
	 */
	DOC(118, "DOC", "DOC"),

	/**
	 * The '<em><b>Dotseqn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dotseqn License
	 * <!-- end-model-doc -->
	 * @see #DOTSEQN_VALUE
	 * @generated
	 * @ordered
	 */
	DOTSEQN(119, "Dotseqn", "Dotseqn"),

	/**
	 * The '<em><b>DSDP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DSDP License
	 * <!-- end-model-doc -->
	 * @see #DSDP_VALUE
	 * @generated
	 * @ordered
	 */
	DSDP(120, "DSDP", "DSDP"),

	/**
	 * The '<em><b>Dvipdfm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * dvipdfm License
	 * <!-- end-model-doc -->
	 * @see #DVIPDFM_VALUE
	 * @generated
	 * @ordered
	 */
	DVIPDFM(121, "dvipdfm", "dvipdfm"),

	/**
	 * The '<em><b>ECL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Educational Community License v1.0
	 * <!-- end-model-doc -->
	 * @see #ECL10_VALUE
	 * @generated
	 * @ordered
	 */
	ECL10(122, "ECL10", "ECL-1.0"),

	/**
	 * The '<em><b>ECL20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Educational Community License v2.0
	 * <!-- end-model-doc -->
	 * @see #ECL20_VALUE
	 * @generated
	 * @ordered
	 */
	ECL20(123, "ECL20", "ECL-2.0"),

	/**
	 * The '<em><b>EFL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eiffel Forum License v1.0
	 * <!-- end-model-doc -->
	 * @see #EFL10_VALUE
	 * @generated
	 * @ordered
	 */
	EFL10(124, "EFL10", "EFL-1.0"),

	/**
	 * The '<em><b>EFL20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eiffel Forum License v2.0
	 * <!-- end-model-doc -->
	 * @see #EFL20_VALUE
	 * @generated
	 * @ordered
	 */
	EFL20(125, "EFL20", "EFL-2.0"),

	/**
	 * The '<em><b>EGenix</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * eGenix.com Public License 1.1.0
	 * <!-- end-model-doc -->
	 * @see #EGENIX_VALUE
	 * @generated
	 * @ordered
	 */
	EGENIX(126, "eGenix", "eGenix"),

	/**
	 * The '<em><b>Entessa</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Entessa Public License v1.0
	 * <!-- end-model-doc -->
	 * @see #ENTESSA_VALUE
	 * @generated
	 * @ordered
	 */
	ENTESSA(127, "Entessa", "Entessa"),

	/**
	 * The '<em><b>EPL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eclipse Public License 1.0
	 * <!-- end-model-doc -->
	 * @see #EPL10_VALUE
	 * @generated
	 * @ordered
	 */
	EPL10(128, "EPL10", "EPL-1.0"),

	/**
	 * The '<em><b>EPL20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eclipse Public License 2.0
	 * <!-- end-model-doc -->
	 * @see #EPL20_VALUE
	 * @generated
	 * @ordered
	 */
	EPL20(129, "EPL20", "EPL-2.0"),

	/**
	 * The '<em><b>Erl PL11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Erlang Public License v1.1
	 * <!-- end-model-doc -->
	 * @see #ERL_PL11_VALUE
	 * @generated
	 * @ordered
	 */
	ERL_PL11(130, "ErlPL11", "ErlPL-1.1"),

	/**
	 * The '<em><b>EU Datagrid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EU DataGrid Software License
	 * <!-- end-model-doc -->
	 * @see #EU_DATAGRID_VALUE
	 * @generated
	 * @ordered
	 */
	EU_DATAGRID(131, "EUDatagrid", "EUDatagrid"),

	/**
	 * The '<em><b>EUPL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * European Union Public License 1.0
	 * <!-- end-model-doc -->
	 * @see #EUPL10_VALUE
	 * @generated
	 * @ordered
	 */
	EUPL10(132, "EUPL10", "EUPL-1.0"),

	/**
	 * The '<em><b>EUPL11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * European Union Public License 1.1
	 * <!-- end-model-doc -->
	 * @see #EUPL11_VALUE
	 * @generated
	 * @ordered
	 */
	EUPL11(133, "EUPL11", "EUPL-1.1"),

	/**
	 * The '<em><b>EUPL12</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * European Union Public License 1.2
	 * <!-- end-model-doc -->
	 * @see #EUPL12_VALUE
	 * @generated
	 * @ordered
	 */
	EUPL12(134, "EUPL12", "EUPL-1.2"),

	/**
	 * The '<em><b>Eurosym</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eurosym License
	 * <!-- end-model-doc -->
	 * @see #EUROSYM_VALUE
	 * @generated
	 * @ordered
	 */
	EUROSYM(135, "Eurosym", "Eurosym"),

	/**
	 * The '<em><b>Fair</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fair License
	 * <!-- end-model-doc -->
	 * @see #FAIR_VALUE
	 * @generated
	 * @ordered
	 */
	FAIR(136, "Fair", "Fair"),

	/**
	 * The '<em><b>Frameworx10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Frameworx Open License 1.0
	 * <!-- end-model-doc -->
	 * @see #FRAMEWORX10_VALUE
	 * @generated
	 * @ordered
	 */
	FRAMEWORX10(137, "Frameworx10", "Frameworx-1.0"),

	/**
	 * The '<em><b>Free Image</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FreeImage Public License v1.0
	 * <!-- end-model-doc -->
	 * @see #FREE_IMAGE_VALUE
	 * @generated
	 * @ordered
	 */
	FREE_IMAGE(138, "FreeImage", "FreeImage"),

	/**
	 * The '<em><b>FSFAP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FSF All Permissive License
	 * <!-- end-model-doc -->
	 * @see #FSFAP_VALUE
	 * @generated
	 * @ordered
	 */
	FSFAP(139, "FSFAP", "FSFAP"),

	/**
	 * The '<em><b>FSFUL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FSF Unlimited License
	 * <!-- end-model-doc -->
	 * @see #FSFUL_VALUE
	 * @generated
	 * @ordered
	 */
	FSFUL(140, "FSFUL", "FSFUL"),

	/**
	 * The '<em><b>FSFULLR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FSF Unlimited License (with License Retention)
	 * <!-- end-model-doc -->
	 * @see #FSFULLR_VALUE
	 * @generated
	 * @ordered
	 */
	FSFULLR(141, "FSFULLR", "FSFULLR"),

	/**
	 * The '<em><b>FTL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Freetype Project License
	 * <!-- end-model-doc -->
	 * @see #FTL_VALUE
	 * @generated
	 * @ordered
	 */
	FTL(142, "FTL", "FTL"),

	/**
	 * The '<em><b>GFDL11 Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.1 only
	 * <!-- end-model-doc -->
	 * @see #GFDL11_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	GFDL11_ONLY(143, "GFDL11Only", "GFDL-1.1-only"),

	/**
	 * The '<em><b>GFDL11 Or Later</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.1 or later
	 * <!-- end-model-doc -->
	 * @see #GFDL11_OR_LATER_VALUE
	 * @generated
	 * @ordered
	 */
	GFDL11_OR_LATER(144, "GFDL11OrLater", "GFDL-1.1-or-later"),

	/**
	 * The '<em><b>GFDL12 Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.2 only
	 * <!-- end-model-doc -->
	 * @see #GFDL12_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	GFDL12_ONLY(145, "GFDL12Only", "GFDL-1.2-only"),

	/**
	 * The '<em><b>GFDL12 Or Later</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.2 or later
	 * <!-- end-model-doc -->
	 * @see #GFDL12_OR_LATER_VALUE
	 * @generated
	 * @ordered
	 */
	GFDL12_OR_LATER(146, "GFDL12OrLater", "GFDL-1.2-or-later"),

	/**
	 * The '<em><b>GFDL13 Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.3 only
	 * <!-- end-model-doc -->
	 * @see #GFDL13_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	GFDL13_ONLY(147, "GFDL13Only", "GFDL-1.3-only"),

	/**
	 * The '<em><b>GFDL13 Or Later</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.3 or later
	 * <!-- end-model-doc -->
	 * @see #GFDL13_OR_LATER_VALUE
	 * @generated
	 * @ordered
	 */
	GFDL13_OR_LATER(148, "GFDL13OrLater", "GFDL-1.3-or-later"),

	/**
	 * The '<em><b>Giftware</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Giftware License
	 * <!-- end-model-doc -->
	 * @see #GIFTWARE_VALUE
	 * @generated
	 * @ordered
	 */
	GIFTWARE(149, "Giftware", "Giftware"),

	/**
	 * The '<em><b>GL2PS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GL2PS License
	 * <!-- end-model-doc -->
	 * @see #GL2PS_VALUE
	 * @generated
	 * @ordered
	 */
	GL2PS(150, "GL2PS", "GL2PS"),

	/**
	 * The '<em><b>Glide</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3dfx Glide License
	 * <!-- end-model-doc -->
	 * @see #GLIDE_VALUE
	 * @generated
	 * @ordered
	 */
	GLIDE(151, "Glide", "Glide"),

	/**
	 * The '<em><b>Glulxe</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Glulxe License
	 * <!-- end-model-doc -->
	 * @see #GLULXE_VALUE
	 * @generated
	 * @ordered
	 */
	GLULXE(152, "Glulxe", "Glulxe"),

	/**
	 * The '<em><b>Gnuplot</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gnuplot License
	 * <!-- end-model-doc -->
	 * @see #GNUPLOT_VALUE
	 * @generated
	 * @ordered
	 */
	GNUPLOT(153, "gnuplot", "gnuplot"),

	/**
	 * The '<em><b>GPL10 Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v1.0 only
	 * <!-- end-model-doc -->
	 * @see #GPL10_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	GPL10_ONLY(154, "GPL10Only", "GPL-1.0-only"),

	/**
	 * The '<em><b>GPL10 Or Later</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v1.0 or later
	 * <!-- end-model-doc -->
	 * @see #GPL10_OR_LATER_VALUE
	 * @generated
	 * @ordered
	 */
	GPL10_OR_LATER(155, "GPL10OrLater", "GPL-1.0-or-later"),

	/**
	 * The '<em><b>GPL20 Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v2.0 only
	 * <!-- end-model-doc -->
	 * @see #GPL20_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	GPL20_ONLY(156, "GPL20Only", "GPL-2.0-only"),

	/**
	 * The '<em><b>GPL20 Or Later</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v2.0 or later
	 * <!-- end-model-doc -->
	 * @see #GPL20_OR_LATER_VALUE
	 * @generated
	 * @ordered
	 */
	GPL20_OR_LATER(157, "GPL20OrLater", "GPL-2.0-or-later"),

	/**
	 * The '<em><b>GPL30 Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v3.0 only
	 * <!-- end-model-doc -->
	 * @see #GPL30_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	GPL30_ONLY(158, "GPL30Only", "GPL-3.0-only"),

	/**
	 * The '<em><b>GPL30 Or Later</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v3.0 or later
	 * <!-- end-model-doc -->
	 * @see #GPL30_OR_LATER_VALUE
	 * @generated
	 * @ordered
	 */
	GPL30_OR_LATER(159, "GPL30OrLater", "GPL-3.0-or-later"),

	/**
	 * The '<em><b>GSOAP1 3b</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gSOAP Public License v1.3b
	 * <!-- end-model-doc -->
	 * @see #GSOAP1_3B_VALUE
	 * @generated
	 * @ordered
	 */
	GSOAP1_3B(160, "gSOAP13b", "gSOAP-1.3b"),

	/**
	 * The '<em><b>Haskell Report</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Haskell Language Report License
	 * <!-- end-model-doc -->
	 * @see #HASKELL_REPORT_VALUE
	 * @generated
	 * @ordered
	 */
	HASKELL_REPORT(161, "HaskellReport", "HaskellReport"),

	/**
	 * The '<em><b>HPND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Historical Permission Notice and Disclaimer
	 * <!-- end-model-doc -->
	 * @see #HPND_VALUE
	 * @generated
	 * @ordered
	 */
	HPND(162, "HPND", "HPND"),

	/**
	 * The '<em><b>IBM Pibs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IBM PowerPC Initialization and Boot Software
	 * <!-- end-model-doc -->
	 * @see #IBM_PIBS_VALUE
	 * @generated
	 * @ordered
	 */
	IBM_PIBS(163, "IBMPibs", "IBM-pibs"),

	/**
	 * The '<em><b>ICU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ICU License
	 * <!-- end-model-doc -->
	 * @see #ICU_VALUE
	 * @generated
	 * @ordered
	 */
	ICU(164, "ICU", "ICU"),

	/**
	 * The '<em><b>IJG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Independent JPEG Group License
	 * <!-- end-model-doc -->
	 * @see #IJG_VALUE
	 * @generated
	 * @ordered
	 */
	IJG(165, "IJG", "IJG"),

	/**
	 * The '<em><b>Image Magick</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ImageMagick License
	 * <!-- end-model-doc -->
	 * @see #IMAGE_MAGICK_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGE_MAGICK(166, "ImageMagick", "ImageMagick"),

	/**
	 * The '<em><b>IMatix</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * iMatix Standard Function Library Agreement
	 * <!-- end-model-doc -->
	 * @see #IMATIX_VALUE
	 * @generated
	 * @ordered
	 */
	IMATIX(167, "iMatix", "iMatix"),

	/**
	 * The '<em><b>Imlib2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Imlib2 License
	 * <!-- end-model-doc -->
	 * @see #IMLIB2_VALUE
	 * @generated
	 * @ordered
	 */
	IMLIB2(168, "Imlib2", "Imlib2"),

	/**
	 * The '<em><b>Info ZIP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Info-ZIP License
	 * <!-- end-model-doc -->
	 * @see #INFO_ZIP_VALUE
	 * @generated
	 * @ordered
	 */
	INFO_ZIP(169, "InfoZIP", "Info-ZIP"),

	/**
	 * The '<em><b>Intel ACPI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Intel ACPI Software License Agreement
	 * <!-- end-model-doc -->
	 * @see #INTEL_ACPI_VALUE
	 * @generated
	 * @ordered
	 */
	INTEL_ACPI(170, "IntelACPI", "Intel-ACPI"),

	/**
	 * The '<em><b>Intel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Intel Open Source License
	 * <!-- end-model-doc -->
	 * @see #INTEL_VALUE
	 * @generated
	 * @ordered
	 */
	INTEL(171, "Intel", "Intel"),

	/**
	 * The '<em><b>Interbase10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Interbase Public License v1.0
	 * <!-- end-model-doc -->
	 * @see #INTERBASE10_VALUE
	 * @generated
	 * @ordered
	 */
	INTERBASE10(172, "Interbase10", "Interbase-1.0"),

	/**
	 * The '<em><b>IPA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IPA Font License
	 * <!-- end-model-doc -->
	 * @see #IPA_VALUE
	 * @generated
	 * @ordered
	 */
	IPA(173, "IPA", "IPA"),

	/**
	 * The '<em><b>IPL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IBM Public License v1.0
	 * <!-- end-model-doc -->
	 * @see #IPL10_VALUE
	 * @generated
	 * @ordered
	 */
	IPL10(174, "IPL10", "IPL-1.0"),

	/**
	 * The '<em><b>ISC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ISC License
	 * <!-- end-model-doc -->
	 * @see #ISC_VALUE
	 * @generated
	 * @ordered
	 */
	ISC(175, "ISC", "ISC"),

	/**
	 * The '<em><b>Jas Per20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JasPer License
	 * <!-- end-model-doc -->
	 * @see #JAS_PER20_VALUE
	 * @generated
	 * @ordered
	 */
	JAS_PER20(176, "JasPer20", "JasPer-2.0"),

	/**
	 * The '<em><b>JSON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON License
	 * <!-- end-model-doc -->
	 * @see #JSON_VALUE
	 * @generated
	 * @ordered
	 */
	JSON(177, "JSON", "JSON"),

	/**
	 * The '<em><b>LAL12</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Licence Art Libre 1.2
	 * <!-- end-model-doc -->
	 * @see #LAL12_VALUE
	 * @generated
	 * @ordered
	 */
	LAL12(178, "LAL12", "LAL-1.2"),

	/**
	 * The '<em><b>LAL13</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Licence Art Libre 1.3
	 * <!-- end-model-doc -->
	 * @see #LAL13_VALUE
	 * @generated
	 * @ordered
	 */
	LAL13(179, "LAL13", "LAL-1.3"),

	/**
	 * The '<em><b>Latex2e</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Latex2e License
	 * <!-- end-model-doc -->
	 * @see #LATEX2E_VALUE
	 * @generated
	 * @ordered
	 */
	LATEX2E(180, "Latex2e", "Latex2e"),

	/**
	 * The '<em><b>Leptonica</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Leptonica License
	 * <!-- end-model-doc -->
	 * @see #LEPTONICA_VALUE
	 * @generated
	 * @ordered
	 */
	LEPTONICA(181, "Leptonica", "Leptonica"),

	/**
	 * The '<em><b>LGPL20 Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Library General Public License v2 only
	 * <!-- end-model-doc -->
	 * @see #LGPL20_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	LGPL20_ONLY(182, "LGPL20Only", "LGPL-2.0-only"),

	/**
	 * The '<em><b>LGPL20 Or Later</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Library General Public License v2 or later
	 * <!-- end-model-doc -->
	 * @see #LGPL20_OR_LATER_VALUE
	 * @generated
	 * @ordered
	 */
	LGPL20_OR_LATER(183, "LGPL20OrLater", "LGPL-2.0-or-later"),

	/**
	 * The '<em><b>LGPL21 Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Lesser General Public License v2.1 only
	 * <!-- end-model-doc -->
	 * @see #LGPL21_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	LGPL21_ONLY(184, "LGPL21Only", "LGPL-2.1-only"),

	/**
	 * The '<em><b>LGPL21 Or Later</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Lesser General Public License v2.1 or later
	 * <!-- end-model-doc -->
	 * @see #LGPL21_OR_LATER_VALUE
	 * @generated
	 * @ordered
	 */
	LGPL21_OR_LATER(185, "LGPL21OrLater", "LGPL-2.1-or-later"),

	/**
	 * The '<em><b>LGPL30 Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Lesser General Public License v3.0 only
	 * <!-- end-model-doc -->
	 * @see #LGPL30_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	LGPL30_ONLY(186, "LGPL30Only", "LGPL-3.0-only"),

	/**
	 * The '<em><b>LGPL30 Or Later</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Lesser General Public License v3.0 or later
	 * <!-- end-model-doc -->
	 * @see #LGPL30_OR_LATER_VALUE
	 * @generated
	 * @ordered
	 */
	LGPL30_OR_LATER(187, "LGPL30OrLater", "LGPL-3.0-or-later"),

	/**
	 * The '<em><b>LGPLLR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lesser General Public License For Linguistic Resources
	 * <!-- end-model-doc -->
	 * @see #LGPLLR_VALUE
	 * @generated
	 * @ordered
	 */
	LGPLLR(188, "LGPLLR", "LGPLLR"),

	/**
	 * The '<em><b>Libpng</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * libpng License
	 * <!-- end-model-doc -->
	 * @see #LIBPNG_VALUE
	 * @generated
	 * @ordered
	 */
	LIBPNG(189, "Libpng", "Libpng"),

	/**
	 * The '<em><b>Libtiff</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * libtiff License
	 * <!-- end-model-doc -->
	 * @see #LIBTIFF_VALUE
	 * @generated
	 * @ordered
	 */
	LIBTIFF(190, "libtiff", "libtiff"),

	/**
	 * The '<em><b>Li Li QP11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Licence Libre du Québec – Permissive version 1.1
	 * <!-- end-model-doc -->
	 * @see #LI_LI_QP11_VALUE
	 * @generated
	 * @ordered
	 */
	LI_LI_QP11(191, "LiLiQP11", "LiLiQ-P-1.1"),

	/**
	 * The '<em><b>Li Li QR11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Licence Libre du Québec – Réciprocité version 1.1
	 * <!-- end-model-doc -->
	 * @see #LI_LI_QR11_VALUE
	 * @generated
	 * @ordered
	 */
	LI_LI_QR11(192, "LiLiQR11", "LiLiQ-R-1.1"),

	/**
	 * The '<em><b>Li Li QRplus11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Licence Libre du Québec – Réciprocité forte version 1.1
	 * <!-- end-model-doc -->
	 * @see #LI_LI_QRPLUS11_VALUE
	 * @generated
	 * @ordered
	 */
	LI_LI_QRPLUS11(193, "LiLiQRplus11", "LiLiQ-Rplus-1.1"),

	/**
	 * The '<em><b>Linux Open IB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Linux Kernel Variant of OpenIB.org license
	 * <!-- end-model-doc -->
	 * @see #LINUX_OPEN_IB_VALUE
	 * @generated
	 * @ordered
	 */
	LINUX_OPEN_IB(194, "LinuxOpenIB", "Linux-OpenIB"),

	/**
	 * The '<em><b>LPL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lucent Public License Version 1.0
	 * <!-- end-model-doc -->
	 * @see #LPL10_VALUE
	 * @generated
	 * @ordered
	 */
	LPL10(195, "LPL10", "LPL-1.0"),

	/**
	 * The '<em><b>LPL102</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lucent Public License v1.02
	 * <!-- end-model-doc -->
	 * @see #LPL102_VALUE
	 * @generated
	 * @ordered
	 */
	LPL102(196, "LPL102", "LPL-1.02"),

	/**
	 * The '<em><b>LPPL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LaTeX Project Public License v1.0
	 * <!-- end-model-doc -->
	 * @see #LPPL10_VALUE
	 * @generated
	 * @ordered
	 */
	LPPL10(197, "LPPL10", "LPPL-1.0"),

	/**
	 * The '<em><b>LPPL11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LaTeX Project Public License v1.1
	 * <!-- end-model-doc -->
	 * @see #LPPL11_VALUE
	 * @generated
	 * @ordered
	 */
	LPPL11(198, "LPPL11", "LPPL-1.1"),

	/**
	 * The '<em><b>LPPL12</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LaTeX Project Public License v1.2
	 * <!-- end-model-doc -->
	 * @see #LPPL12_VALUE
	 * @generated
	 * @ordered
	 */
	LPPL12(199, "LPPL12", "LPPL-1.2"),

	/**
	 * The '<em><b>LPPL1 3a</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LaTeX Project Public License v1.3a
	 * <!-- end-model-doc -->
	 * @see #LPPL1_3A_VALUE
	 * @generated
	 * @ordered
	 */
	LPPL1_3A(200, "LPPL13a", "LPPL-1.3a"),

	/**
	 * The '<em><b>LPPL1 3c</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LaTeX Project Public License v1.3c
	 * <!-- end-model-doc -->
	 * @see #LPPL1_3C_VALUE
	 * @generated
	 * @ordered
	 */
	LPPL1_3C(201, "LPPL13c", "LPPL-1.3c"),

	/**
	 * The '<em><b>Make Index</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MakeIndex License
	 * <!-- end-model-doc -->
	 * @see #MAKE_INDEX_VALUE
	 * @generated
	 * @ordered
	 */
	MAKE_INDEX(202, "MakeIndex", "MakeIndex"),

	/**
	 * The '<em><b>Mir OS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MirOS License
	 * <!-- end-model-doc -->
	 * @see #MIR_OS_VALUE
	 * @generated
	 * @ordered
	 */
	MIR_OS(203, "MirOS", "MirOS"),

	/**
	 * The '<em><b>MIT0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MIT No Attribution
	 * <!-- end-model-doc -->
	 * @see #MIT0_VALUE
	 * @generated
	 * @ordered
	 */
	MIT0(204, "MIT0", "MIT-0"),

	/**
	 * The '<em><b>MIT Advertising</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enlightenment License (e16)
	 * <!-- end-model-doc -->
	 * @see #MIT_ADVERTISING_VALUE
	 * @generated
	 * @ordered
	 */
	MIT_ADVERTISING(205, "MITAdvertising", "MIT-advertising"),

	/**
	 * The '<em><b>MITCMU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CMU License
	 * <!-- end-model-doc -->
	 * @see #MITCMU_VALUE
	 * @generated
	 * @ordered
	 */
	MITCMU(206, "MITCMU", "MIT-CMU"),

	/**
	 * The '<em><b>MIT Enna</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * enna License
	 * <!-- end-model-doc -->
	 * @see #MIT_ENNA_VALUE
	 * @generated
	 * @ordered
	 */
	MIT_ENNA(207, "MITEnna", "MIT-enna"),

	/**
	 * The '<em><b>MIT Feh</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * feh License
	 * <!-- end-model-doc -->
	 * @see #MIT_FEH_VALUE
	 * @generated
	 * @ordered
	 */
	MIT_FEH(208, "MITFeh", "MIT-feh"),

	/**
	 * The '<em><b>MIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MIT License
	 * <!-- end-model-doc -->
	 * @see #MIT_VALUE
	 * @generated
	 * @ordered
	 */
	MIT(209, "MIT", "MIT"),

	/**
	 * The '<em><b>MITNFA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MIT +no-false-attribs license
	 * <!-- end-model-doc -->
	 * @see #MITNFA_VALUE
	 * @generated
	 * @ordered
	 */
	MITNFA(210, "MITNFA", "MITNFA"),

	/**
	 * The '<em><b>Motosoto</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Motosoto License
	 * <!-- end-model-doc -->
	 * @see #MOTOSOTO_VALUE
	 * @generated
	 * @ordered
	 */
	MOTOSOTO(211, "Motosoto", "Motosoto"),

	/**
	 * The '<em><b>Mpich2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * mpich2 License
	 * <!-- end-model-doc -->
	 * @see #MPICH2_VALUE
	 * @generated
	 * @ordered
	 */
	MPICH2(212, "mpich2", "mpich2"),

	/**
	 * The '<em><b>MPL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mozilla Public License 1.0
	 * <!-- end-model-doc -->
	 * @see #MPL10_VALUE
	 * @generated
	 * @ordered
	 */
	MPL10(213, "MPL10", "MPL-1.0"),

	/**
	 * The '<em><b>MPL11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mozilla Public License 1.1
	 * <!-- end-model-doc -->
	 * @see #MPL11_VALUE
	 * @generated
	 * @ordered
	 */
	MPL11(214, "MPL11", "MPL-1.1"),

	/**
	 * The '<em><b>MPL20 No Copyleft Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mozilla Public License 2.0 (no copyleft exception)
	 * <!-- end-model-doc -->
	 * @see #MPL20_NO_COPYLEFT_EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	MPL20_NO_COPYLEFT_EXCEPTION(215, "MPL20NoCopyleftException", "MPL-2.0-no-copyleft-exception"),

	/**
	 * The '<em><b>MPL20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mozilla Public License 2.0
	 * <!-- end-model-doc -->
	 * @see #MPL20_VALUE
	 * @generated
	 * @ordered
	 */
	MPL20(216, "MPL20", "MPL-2.0"),

	/**
	 * The '<em><b>MSPL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Microsoft Public License
	 * <!-- end-model-doc -->
	 * @see #MSPL_VALUE
	 * @generated
	 * @ordered
	 */
	MSPL(217, "MSPL", "MS-PL"),

	/**
	 * The '<em><b>MSRL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Microsoft Reciprocal License
	 * <!-- end-model-doc -->
	 * @see #MSRL_VALUE
	 * @generated
	 * @ordered
	 */
	MSRL(218, "MSRL", "MS-RL"),

	/**
	 * The '<em><b>MTLL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Matrix Template Library License
	 * <!-- end-model-doc -->
	 * @see #MTLL_VALUE
	 * @generated
	 * @ordered
	 */
	MTLL(219, "MTLL", "MTLL"),

	/**
	 * The '<em><b>Multics</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Multics License
	 * <!-- end-model-doc -->
	 * @see #MULTICS_VALUE
	 * @generated
	 * @ordered
	 */
	MULTICS(220, "Multics", "Multics"),

	/**
	 * The '<em><b>Mup</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mup License
	 * <!-- end-model-doc -->
	 * @see #MUP_VALUE
	 * @generated
	 * @ordered
	 */
	MUP(221, "Mup", "Mup"),

	/**
	 * The '<em><b>NASA13</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NASA Open Source Agreement 1.3
	 * <!-- end-model-doc -->
	 * @see #NASA13_VALUE
	 * @generated
	 * @ordered
	 */
	NASA13(222, "NASA13", "NASA-1.3"),

	/**
	 * The '<em><b>Naumen</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Naumen Public License
	 * <!-- end-model-doc -->
	 * @see #NAUMEN_VALUE
	 * @generated
	 * @ordered
	 */
	NAUMEN(223, "Naumen", "Naumen"),

	/**
	 * The '<em><b>NBPL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Net Boolean Public License v1
	 * <!-- end-model-doc -->
	 * @see #NBPL10_VALUE
	 * @generated
	 * @ordered
	 */
	NBPL10(224, "NBPL10", "NBPL-1.0"),

	/**
	 * The '<em><b>NCSA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * University of Illinois/NCSA Open Source License
	 * <!-- end-model-doc -->
	 * @see #NCSA_VALUE
	 * @generated
	 * @ordered
	 */
	NCSA(225, "NCSA", "NCSA"),

	/**
	 * The '<em><b>Net SNMP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Net-SNMP License
	 * <!-- end-model-doc -->
	 * @see #NET_SNMP_VALUE
	 * @generated
	 * @ordered
	 */
	NET_SNMP(226, "NetSNMP", "Net-SNMP"),

	/**
	 * The '<em><b>Net CDF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NetCDF license
	 * <!-- end-model-doc -->
	 * @see #NET_CDF_VALUE
	 * @generated
	 * @ordered
	 */
	NET_CDF(227, "NetCDF", "NetCDF"),

	/**
	 * The '<em><b>Newsletr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Newsletr License
	 * <!-- end-model-doc -->
	 * @see #NEWSLETR_VALUE
	 * @generated
	 * @ordered
	 */
	NEWSLETR(228, "Newsletr", "Newsletr"),

	/**
	 * The '<em><b>NGPL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nethack General Public License
	 * <!-- end-model-doc -->
	 * @see #NGPL_VALUE
	 * @generated
	 * @ordered
	 */
	NGPL(229, "NGPL", "NGPL"),

	/**
	 * The '<em><b>NLOD10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Norwegian Licence for Open Government Data
	 * <!-- end-model-doc -->
	 * @see #NLOD10_VALUE
	 * @generated
	 * @ordered
	 */
	NLOD10(230, "NLOD10", "NLOD-1.0"),

	/**
	 * The '<em><b>NLPL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No Limit Public License
	 * <!-- end-model-doc -->
	 * @see #NLPL_VALUE
	 * @generated
	 * @ordered
	 */
	NLPL(231, "NLPL", "NLPL"),

	/**
	 * The '<em><b>Nokia</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nokia Open Source License
	 * <!-- end-model-doc -->
	 * @see #NOKIA_VALUE
	 * @generated
	 * @ordered
	 */
	NOKIA(232, "Nokia", "Nokia"),

	/**
	 * The '<em><b>NOSL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Netizen Open Source License
	 * <!-- end-model-doc -->
	 * @see #NOSL_VALUE
	 * @generated
	 * @ordered
	 */
	NOSL(233, "NOSL", "NOSL"),

	/**
	 * The '<em><b>Noweb</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Noweb License
	 * <!-- end-model-doc -->
	 * @see #NOWEB_VALUE
	 * @generated
	 * @ordered
	 */
	NOWEB(234, "Noweb", "Noweb"),

	/**
	 * The '<em><b>NPL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Netscape Public License v1.0
	 * <!-- end-model-doc -->
	 * @see #NPL10_VALUE
	 * @generated
	 * @ordered
	 */
	NPL10(235, "NPL10", "NPL-1.0"),

	/**
	 * The '<em><b>NPL11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Netscape Public License v1.1
	 * <!-- end-model-doc -->
	 * @see #NPL11_VALUE
	 * @generated
	 * @ordered
	 */
	NPL11(236, "NPL11", "NPL-1.1"),

	/**
	 * The '<em><b>NPOSL30</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Non-Profit Open Software License 3.0
	 * <!-- end-model-doc -->
	 * @see #NPOSL30_VALUE
	 * @generated
	 * @ordered
	 */
	NPOSL30(237, "NPOSL30", "NPOSL-3.0"),

	/**
	 * The '<em><b>NRL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NRL License
	 * <!-- end-model-doc -->
	 * @see #NRL_VALUE
	 * @generated
	 * @ordered
	 */
	NRL(238, "NRL", "NRL"),

	/**
	 * The '<em><b>NTP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NTP License
	 * <!-- end-model-doc -->
	 * @see #NTP_VALUE
	 * @generated
	 * @ordered
	 */
	NTP(239, "NTP", "NTP"),

	/**
	 * The '<em><b>OCCTPL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open CASCADE Technology Public License
	 * <!-- end-model-doc -->
	 * @see #OCCTPL_VALUE
	 * @generated
	 * @ordered
	 */
	OCCTPL(240, "OCCTPL", "OCCT-PL"),

	/**
	 * The '<em><b>OCLC20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OCLC Research Public License 2.0
	 * <!-- end-model-doc -->
	 * @see #OCLC20_VALUE
	 * @generated
	 * @ordered
	 */
	OCLC20(241, "OCLC20", "OCLC-2.0"),

	/**
	 * The '<em><b>ODb L10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ODC Open Database License v1.0
	 * <!-- end-model-doc -->
	 * @see #ODB_L10_VALUE
	 * @generated
	 * @ordered
	 */
	ODB_L10(242, "ODbL10", "ODbL-1.0"),

	/**
	 * The '<em><b>OFL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SIL Open Font License 1.0
	 * <!-- end-model-doc -->
	 * @see #OFL10_VALUE
	 * @generated
	 * @ordered
	 */
	OFL10(243, "OFL10", "OFL-1.0"),

	/**
	 * The '<em><b>OFL11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SIL Open Font License 1.1
	 * <!-- end-model-doc -->
	 * @see #OFL11_VALUE
	 * @generated
	 * @ordered
	 */
	OFL11(244, "OFL11", "OFL-1.1"),

	/**
	 * The '<em><b>OGTSL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Group Test Suite License
	 * <!-- end-model-doc -->
	 * @see #OGTSL_VALUE
	 * @generated
	 * @ordered
	 */
	OGTSL(245, "OGTSL", "OGTSL"),

	/**
	 * The '<em><b>OLDAP11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v1.1
	 * <!-- end-model-doc -->
	 * @see #OLDAP11_VALUE
	 * @generated
	 * @ordered
	 */
	OLDAP11(246, "OLDAP11", "OLDAP-1.1"),

	/**
	 * The '<em><b>OLDAP12</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v1.2
	 * <!-- end-model-doc -->
	 * @see #OLDAP12_VALUE
	 * @generated
	 * @ordered
	 */
	OLDAP12(247, "OLDAP12", "OLDAP-1.2"),

	/**
	 * The '<em><b>OLDAP13</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v1.3
	 * <!-- end-model-doc -->
	 * @see #OLDAP13_VALUE
	 * @generated
	 * @ordered
	 */
	OLDAP13(248, "OLDAP13", "OLDAP-1.3"),

	/**
	 * The '<em><b>OLDAP14</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v1.4
	 * <!-- end-model-doc -->
	 * @see #OLDAP14_VALUE
	 * @generated
	 * @ordered
	 */
	OLDAP14(249, "OLDAP14", "OLDAP-1.4"),

	/**
	 * The '<em><b>OLDAP201</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v2.0.1
	 * <!-- end-model-doc -->
	 * @see #OLDAP201_VALUE
	 * @generated
	 * @ordered
	 */
	OLDAP201(250, "OLDAP201", "OLDAP-2.0.1"),

	/**
	 * The '<em><b>OLDAP20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v2.0 (or possibly 2.0A and 2.0B)
	 * <!-- end-model-doc -->
	 * @see #OLDAP20_VALUE
	 * @generated
	 * @ordered
	 */
	OLDAP20(251, "OLDAP20", "OLDAP-2.0"),

	/**
	 * The '<em><b>OLDAP21</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v2.1
	 * <!-- end-model-doc -->
	 * @see #OLDAP21_VALUE
	 * @generated
	 * @ordered
	 */
	OLDAP21(252, "OLDAP21", "OLDAP-2.1"),

	/**
	 * The '<em><b>OLDAP221</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v2.2.1
	 * <!-- end-model-doc -->
	 * @see #OLDAP221_VALUE
	 * @generated
	 * @ordered
	 */
	OLDAP221(253, "OLDAP221", "OLDAP-2.2.1"),

	/**
	 * The '<em><b>OLDAP222</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License 2.2.2
	 * <!-- end-model-doc -->
	 * @see #OLDAP222_VALUE
	 * @generated
	 * @ordered
	 */
	OLDAP222(254, "OLDAP222", "OLDAP-2.2.2"),

	/**
	 * The '<em><b>OLDAP22</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v2.2
	 * <!-- end-model-doc -->
	 * @see #OLDAP22_VALUE
	 * @generated
	 * @ordered
	 */
	OLDAP22(255, "OLDAP22", "OLDAP-2.2"),

	/**
	 * The '<em><b>OLDAP23</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v2.3
	 * <!-- end-model-doc -->
	 * @see #OLDAP23_VALUE
	 * @generated
	 * @ordered
	 */
	OLDAP23(256, "OLDAP23", "OLDAP-2.3"),

	/**
	 * The '<em><b>OLDAP24</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v2.4
	 * <!-- end-model-doc -->
	 * @see #OLDAP24_VALUE
	 * @generated
	 * @ordered
	 */
	OLDAP24(257, "OLDAP24", "OLDAP-2.4"),

	/**
	 * The '<em><b>OLDAP25</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v2.5
	 * <!-- end-model-doc -->
	 * @see #OLDAP25_VALUE
	 * @generated
	 * @ordered
	 */
	OLDAP25(258, "OLDAP25", "OLDAP-2.5"),

	/**
	 * The '<em><b>OLDAP26</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v2.6
	 * <!-- end-model-doc -->
	 * @see #OLDAP26_VALUE
	 * @generated
	 * @ordered
	 */
	OLDAP26(259, "OLDAP26", "OLDAP-2.6"),

	/**
	 * The '<em><b>OLDAP27</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v2.7
	 * <!-- end-model-doc -->
	 * @see #OLDAP27_VALUE
	 * @generated
	 * @ordered
	 */
	OLDAP27(260, "OLDAP27", "OLDAP-2.7"),

	/**
	 * The '<em><b>OLDAP28</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v2.8
	 * <!-- end-model-doc -->
	 * @see #OLDAP28_VALUE
	 * @generated
	 * @ordered
	 */
	OLDAP28(261, "OLDAP28", "OLDAP-2.8"),

	/**
	 * The '<em><b>OML</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Market License
	 * <!-- end-model-doc -->
	 * @see #OML_VALUE
	 * @generated
	 * @ordered
	 */
	OML(262, "OML", "OML"),

	/**
	 * The '<em><b>Open SSL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OpenSSL License
	 * <!-- end-model-doc -->
	 * @see #OPEN_SSL_VALUE
	 * @generated
	 * @ordered
	 */
	OPEN_SSL(263, "OpenSSL", "OpenSSL"),

	/**
	 * The '<em><b>OPL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Public License v1.0
	 * <!-- end-model-doc -->
	 * @see #OPL10_VALUE
	 * @generated
	 * @ordered
	 */
	OPL10(264, "OPL10", "OPL-1.0"),

	/**
	 * The '<em><b>OSETPL21</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OSET Public License version 2.1
	 * <!-- end-model-doc -->
	 * @see #OSETPL21_VALUE
	 * @generated
	 * @ordered
	 */
	OSETPL21(265, "OSETPL21", "OSET-PL-2.1"),

	/**
	 * The '<em><b>OSL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Software License 1.0
	 * <!-- end-model-doc -->
	 * @see #OSL10_VALUE
	 * @generated
	 * @ordered
	 */
	OSL10(266, "OSL10", "OSL-1.0"),

	/**
	 * The '<em><b>OSL11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Software License 1.1
	 * <!-- end-model-doc -->
	 * @see #OSL11_VALUE
	 * @generated
	 * @ordered
	 */
	OSL11(267, "OSL11", "OSL-1.1"),

	/**
	 * The '<em><b>OSL20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Software License 2.0
	 * <!-- end-model-doc -->
	 * @see #OSL20_VALUE
	 * @generated
	 * @ordered
	 */
	OSL20(268, "OSL20", "OSL-2.0"),

	/**
	 * The '<em><b>OSL21</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Software License 2.1
	 * <!-- end-model-doc -->
	 * @see #OSL21_VALUE
	 * @generated
	 * @ordered
	 */
	OSL21(269, "OSL21", "OSL-2.1"),

	/**
	 * The '<em><b>OSL30</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Software License 3.0
	 * <!-- end-model-doc -->
	 * @see #OSL30_VALUE
	 * @generated
	 * @ordered
	 */
	OSL30(270, "OSL30", "OSL-3.0"),

	/**
	 * The '<em><b>PDDL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ODC Public Domain Dedication & License 1.0
	 * <!-- end-model-doc -->
	 * @see #PDDL10_VALUE
	 * @generated
	 * @ordered
	 */
	PDDL10(271, "PDDL10", "PDDL-1.0"),

	/**
	 * The '<em><b>PHP30</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PHP License v3.0
	 * <!-- end-model-doc -->
	 * @see #PHP30_VALUE
	 * @generated
	 * @ordered
	 */
	PHP30(272, "PHP30", "PHP-3.0"),

	/**
	 * The '<em><b>PHP301</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PHP License v3.01
	 * <!-- end-model-doc -->
	 * @see #PHP301_VALUE
	 * @generated
	 * @ordered
	 */
	PHP301(273, "PHP301", "PHP-3.01"),

	/**
	 * The '<em><b>Plexus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Plexus Classworlds License
	 * <!-- end-model-doc -->
	 * @see #PLEXUS_VALUE
	 * @generated
	 * @ordered
	 */
	PLEXUS(274, "Plexus", "Plexus"),

	/**
	 * The '<em><b>Postgre SQL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PostgreSQL License
	 * <!-- end-model-doc -->
	 * @see #POSTGRE_SQL_VALUE
	 * @generated
	 * @ordered
	 */
	POSTGRE_SQL(275, "PostgreSQL", "PostgreSQL"),

	/**
	 * The '<em><b>Psfrag</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * psfrag License
	 * <!-- end-model-doc -->
	 * @see #PSFRAG_VALUE
	 * @generated
	 * @ordered
	 */
	PSFRAG(276, "psfrag", "psfrag"),

	/**
	 * The '<em><b>Psutils</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * psutils License
	 * <!-- end-model-doc -->
	 * @see #PSUTILS_VALUE
	 * @generated
	 * @ordered
	 */
	PSUTILS(277, "psutils", "psutils"),

	/**
	 * The '<em><b>Python20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Python License 2.0
	 * <!-- end-model-doc -->
	 * @see #PYTHON20_VALUE
	 * @generated
	 * @ordered
	 */
	PYTHON20(278, "Python20", "Python-2.0"),

	/**
	 * The '<em><b>Qhull</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Qhull License
	 * <!-- end-model-doc -->
	 * @see #QHULL_VALUE
	 * @generated
	 * @ordered
	 */
	QHULL(279, "Qhull", "Qhull"),

	/**
	 * The '<em><b>QPL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Q Public License 1.0
	 * <!-- end-model-doc -->
	 * @see #QPL10_VALUE
	 * @generated
	 * @ordered
	 */
	QPL10(280, "QPL10", "QPL-1.0"),

	/**
	 * The '<em><b>Rdisc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rdisc License
	 * <!-- end-model-doc -->
	 * @see #RDISC_VALUE
	 * @generated
	 * @ordered
	 */
	RDISC(281, "Rdisc", "Rdisc"),

	/**
	 * The '<em><b>RHe Cos11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Red Hat eCos Public License v1.1
	 * <!-- end-model-doc -->
	 * @see #RHE_COS11_VALUE
	 * @generated
	 * @ordered
	 */
	RHE_COS11(282, "RHeCos11", "RHeCos-1.1"),

	/**
	 * The '<em><b>RPL11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reciprocal Public License 1.1
	 * <!-- end-model-doc -->
	 * @see #RPL11_VALUE
	 * @generated
	 * @ordered
	 */
	RPL11(283, "RPL11", "RPL-1.1"),

	/**
	 * The '<em><b>RPL15</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reciprocal Public License 1.5
	 * <!-- end-model-doc -->
	 * @see #RPL15_VALUE
	 * @generated
	 * @ordered
	 */
	RPL15(284, "RPL15", "RPL-1.5"),

	/**
	 * The '<em><b>RPSL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RealNetworks Public Source License v1.0
	 * <!-- end-model-doc -->
	 * @see #RPSL10_VALUE
	 * @generated
	 * @ordered
	 */
	RPSL10(285, "RPSL10", "RPSL-1.0"),

	/**
	 * The '<em><b>RSAMD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RSA Message-Digest License
	 * <!-- end-model-doc -->
	 * @see #RSAMD_VALUE
	 * @generated
	 * @ordered
	 */
	RSAMD(286, "RSAMD", "RSA-MD"),

	/**
	 * The '<em><b>RSCPL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ricoh Source Code Public License
	 * <!-- end-model-doc -->
	 * @see #RSCPL_VALUE
	 * @generated
	 * @ordered
	 */
	RSCPL(287, "RSCPL", "RSCPL"),

	/**
	 * The '<em><b>Ruby</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ruby License
	 * <!-- end-model-doc -->
	 * @see #RUBY_VALUE
	 * @generated
	 * @ordered
	 */
	RUBY(288, "Ruby", "Ruby"),

	/**
	 * The '<em><b>SAXPD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sax Public Domain Notice
	 * <!-- end-model-doc -->
	 * @see #SAXPD_VALUE
	 * @generated
	 * @ordered
	 */
	SAXPD(289, "SAXPD", "SAX-PD"),

	/**
	 * The '<em><b>Saxpath</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Saxpath License
	 * <!-- end-model-doc -->
	 * @see #SAXPATH_VALUE
	 * @generated
	 * @ordered
	 */
	SAXPATH(290, "Saxpath", "Saxpath"),

	/**
	 * The '<em><b>SCEA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SCEA Shared Source License
	 * <!-- end-model-doc -->
	 * @see #SCEA_VALUE
	 * @generated
	 * @ordered
	 */
	SCEA(291, "SCEA", "SCEA"),

	/**
	 * The '<em><b>Sendmail</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sendmail License
	 * <!-- end-model-doc -->
	 * @see #SENDMAIL_VALUE
	 * @generated
	 * @ordered
	 */
	SENDMAIL(292, "Sendmail", "Sendmail"),

	/**
	 * The '<em><b>SGIB10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SGI Free Software License B v1.0
	 * <!-- end-model-doc -->
	 * @see #SGIB10_VALUE
	 * @generated
	 * @ordered
	 */
	SGIB10(293, "SGIB10", "SGI-B-1.0"),

	/**
	 * The '<em><b>SGIB11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SGI Free Software License B v1.1
	 * <!-- end-model-doc -->
	 * @see #SGIB11_VALUE
	 * @generated
	 * @ordered
	 */
	SGIB11(294, "SGIB11", "SGI-B-1.1"),

	/**
	 * The '<em><b>SGIB20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SGI Free Software License B v2.0
	 * <!-- end-model-doc -->
	 * @see #SGIB20_VALUE
	 * @generated
	 * @ordered
	 */
	SGIB20(295, "SGIB20", "SGI-B-2.0"),

	/**
	 * The '<em><b>Sim PL20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Simple Public License 2.0
	 * <!-- end-model-doc -->
	 * @see #SIM_PL20_VALUE
	 * @generated
	 * @ordered
	 */
	SIM_PL20(296, "SimPL20", "SimPL-2.0"),

	/**
	 * The '<em><b>SISSL12</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sun Industry Standards Source License v1.2
	 * <!-- end-model-doc -->
	 * @see #SISSL12_VALUE
	 * @generated
	 * @ordered
	 */
	SISSL12(297, "SISSL12", "SISSL-1.2"),

	/**
	 * The '<em><b>SISSL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sun Industry Standards Source License v1.1
	 * <!-- end-model-doc -->
	 * @see #SISSL_VALUE
	 * @generated
	 * @ordered
	 */
	SISSL(298, "SISSL", "SISSL"),

	/**
	 * The '<em><b>Sleepycat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sleepycat License
	 * <!-- end-model-doc -->
	 * @see #SLEEPYCAT_VALUE
	 * @generated
	 * @ordered
	 */
	SLEEPYCAT(299, "Sleepycat", "Sleepycat"),

	/**
	 * The '<em><b>SMLNJ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Standard ML of New Jersey License
	 * <!-- end-model-doc -->
	 * @see #SMLNJ_VALUE
	 * @generated
	 * @ordered
	 */
	SMLNJ(300, "SMLNJ", "SMLNJ"),

	/**
	 * The '<em><b>SMPPL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Secure Messaging Protocol Public License
	 * <!-- end-model-doc -->
	 * @see #SMPPL_VALUE
	 * @generated
	 * @ordered
	 */
	SMPPL(301, "SMPPL", "SMPPL"),

	/**
	 * The '<em><b>SNIA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SNIA Public License 1.1
	 * <!-- end-model-doc -->
	 * @see #SNIA_VALUE
	 * @generated
	 * @ordered
	 */
	SNIA(302, "SNIA", "SNIA"),

	/**
	 * The '<em><b>Spencer86</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Spencer License 86
	 * <!-- end-model-doc -->
	 * @see #SPENCER86_VALUE
	 * @generated
	 * @ordered
	 */
	SPENCER86(303, "Spencer86", "Spencer-86"),

	/**
	 * The '<em><b>Spencer94</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Spencer License 94
	 * <!-- end-model-doc -->
	 * @see #SPENCER94_VALUE
	 * @generated
	 * @ordered
	 */
	SPENCER94(304, "Spencer94", "Spencer-94"),

	/**
	 * The '<em><b>Spencer99</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Spencer License 99
	 * <!-- end-model-doc -->
	 * @see #SPENCER99_VALUE
	 * @generated
	 * @ordered
	 */
	SPENCER99(305, "Spencer99", "Spencer-99"),

	/**
	 * The '<em><b>SPL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sun Public License v1.0
	 * <!-- end-model-doc -->
	 * @see #SPL10_VALUE
	 * @generated
	 * @ordered
	 */
	SPL10(306, "SPL10", "SPL-1.0"),

	/**
	 * The '<em><b>Sugar CRM113</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SugarCRM Public License v1.1.3
	 * <!-- end-model-doc -->
	 * @see #SUGAR_CRM113_VALUE
	 * @generated
	 * @ordered
	 */
	SUGAR_CRM113(307, "SugarCRM113", "SugarCRM-1.1.3"),

	/**
	 * The '<em><b>SWL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Scheme Widget Library (SWL) Software License Agreement
	 * <!-- end-model-doc -->
	 * @see #SWL_VALUE
	 * @generated
	 * @ordered
	 */
	SWL(308, "SWL", "SWL"),

	/**
	 * The '<em><b>TCL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TCL/TK License
	 * <!-- end-model-doc -->
	 * @see #TCL_VALUE
	 * @generated
	 * @ordered
	 */
	TCL(309, "TCL", "TCL"),

	/**
	 * The '<em><b>TCP Wrappers</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TCP Wrappers License
	 * <!-- end-model-doc -->
	 * @see #TCP_WRAPPERS_VALUE
	 * @generated
	 * @ordered
	 */
	TCP_WRAPPERS(310, "TCPWrappers", "TCP-wrappers"),

	/**
	 * The '<em><b>TMate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TMate Open Source License
	 * <!-- end-model-doc -->
	 * @see #TMATE_VALUE
	 * @generated
	 * @ordered
	 */
	TMATE(311, "TMate", "TMate"),

	/**
	 * The '<em><b>TORQUE11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TORQUE v2.5+ Software License v1.1
	 * <!-- end-model-doc -->
	 * @see #TORQUE11_VALUE
	 * @generated
	 * @ordered
	 */
	TORQUE11(312, "TORQUE11", "TORQUE-1.1"),

	/**
	 * The '<em><b>TOSL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Trusster Open Source License
	 * <!-- end-model-doc -->
	 * @see #TOSL_VALUE
	 * @generated
	 * @ordered
	 */
	TOSL(313, "TOSL", "TOSL"),

	/**
	 * The '<em><b>Unicode DFS2015</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unicode License Agreement - Data Files and Software (2015)
	 * <!-- end-model-doc -->
	 * @see #UNICODE_DFS2015_VALUE
	 * @generated
	 * @ordered
	 */
	UNICODE_DFS2015(314, "UnicodeDFS2015", "Unicode-DFS-2015"),

	/**
	 * The '<em><b>Unicode DFS2016</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unicode License Agreement - Data Files and Software (2016)
	 * <!-- end-model-doc -->
	 * @see #UNICODE_DFS2016_VALUE
	 * @generated
	 * @ordered
	 */
	UNICODE_DFS2016(315, "UnicodeDFS2016", "Unicode-DFS-2016"),

	/**
	 * The '<em><b>Unicode TOU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unicode Terms of Use
	 * <!-- end-model-doc -->
	 * @see #UNICODE_TOU_VALUE
	 * @generated
	 * @ordered
	 */
	UNICODE_TOU(316, "UnicodeTOU", "Unicode-TOU"),

	/**
	 * The '<em><b>Unlicense</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Unlicense
	 * <!-- end-model-doc -->
	 * @see #UNLICENSE_VALUE
	 * @generated
	 * @ordered
	 */
	UNLICENSE(317, "Unlicense", "Unlicense"),

	/**
	 * The '<em><b>UPL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Universal Permissive License v1.0
	 * <!-- end-model-doc -->
	 * @see #UPL10_VALUE
	 * @generated
	 * @ordered
	 */
	UPL10(318, "UPL10", "UPL-1.0"),

	/**
	 * The '<em><b>Vim</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vim License
	 * <!-- end-model-doc -->
	 * @see #VIM_VALUE
	 * @generated
	 * @ordered
	 */
	VIM(319, "Vim", "Vim"),

	/**
	 * The '<em><b>VOSTROM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * VOSTROM Public License for Open Source
	 * <!-- end-model-doc -->
	 * @see #VOSTROM_VALUE
	 * @generated
	 * @ordered
	 */
	VOSTROM(320, "VOSTROM", "VOSTROM"),

	/**
	 * The '<em><b>VSL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vovida Software License v1.0
	 * <!-- end-model-doc -->
	 * @see #VSL10_VALUE
	 * @generated
	 * @ordered
	 */
	VSL10(321, "VSL10", "VSL-1.0"),

	/**
	 * The '<em><b>W3C19980720</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * W3C Software Notice and License (1998-07-20)
	 * <!-- end-model-doc -->
	 * @see #W3C19980720_VALUE
	 * @generated
	 * @ordered
	 */
	W3C19980720(322, "W3C19980720", "W3C-19980720"),

	/**
	 * The '<em><b>W3C20150513</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * W3C Software Notice and Document License (2015-05-13)
	 * <!-- end-model-doc -->
	 * @see #W3C20150513_VALUE
	 * @generated
	 * @ordered
	 */
	W3C20150513(323, "W3C20150513", "W3C-20150513"),

	/**
	 * The '<em><b>W3C</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * W3C Software Notice and License (2002-12-31)
	 * <!-- end-model-doc -->
	 * @see #W3C_VALUE
	 * @generated
	 * @ordered
	 */
	W3C(324, "W3C", "W3C"),

	/**
	 * The '<em><b>Watcom10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sybase Open Watcom Public License 1.0
	 * <!-- end-model-doc -->
	 * @see #WATCOM10_VALUE
	 * @generated
	 * @ordered
	 */
	WATCOM10(325, "Watcom10", "Watcom-1.0"),

	/**
	 * The '<em><b>Wsuipa</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wsuipa License
	 * <!-- end-model-doc -->
	 * @see #WSUIPA_VALUE
	 * @generated
	 * @ordered
	 */
	WSUIPA(326, "Wsuipa", "Wsuipa"),

	/**
	 * The '<em><b>WTFPL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Do What The F*ck You Want To Public License
	 * <!-- end-model-doc -->
	 * @see #WTFPL_VALUE
	 * @generated
	 * @ordered
	 */
	WTFPL(327, "WTFPL", "WTFPL"),

	/**
	 * The '<em><b>X11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * X11 License
	 * <!-- end-model-doc -->
	 * @see #X11_VALUE
	 * @generated
	 * @ordered
	 */
	X11(328, "X11", "X11"),

	/**
	 * The '<em><b>Xerox</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Xerox License
	 * <!-- end-model-doc -->
	 * @see #XEROX_VALUE
	 * @generated
	 * @ordered
	 */
	XEROX(329, "Xerox", "Xerox"),

	/**
	 * The '<em><b>XFree8611</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * XFree86 License 1.1
	 * <!-- end-model-doc -->
	 * @see #XFREE8611_VALUE
	 * @generated
	 * @ordered
	 */
	XFREE8611(330, "XFree8611", "XFree86-1.1"),

	/**
	 * The '<em><b>Xinetd</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * xinetd License
	 * <!-- end-model-doc -->
	 * @see #XINETD_VALUE
	 * @generated
	 * @ordered
	 */
	XINETD(331, "xinetd", "xinetd"),

	/**
	 * The '<em><b>Xnet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * X.Net License
	 * <!-- end-model-doc -->
	 * @see #XNET_VALUE
	 * @generated
	 * @ordered
	 */
	XNET(332, "Xnet", "Xnet"),

	/**
	 * The '<em><b>Xpp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * XPP License
	 * <!-- end-model-doc -->
	 * @see #XPP_VALUE
	 * @generated
	 * @ordered
	 */
	XPP(333, "xpp", "xpp"),

	/**
	 * The '<em><b>XSkat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * XSkat License
	 * <!-- end-model-doc -->
	 * @see #XSKAT_VALUE
	 * @generated
	 * @ordered
	 */
	XSKAT(334, "XSkat", "XSkat"),

	/**
	 * The '<em><b>YPL10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Yahoo! Public License v1.0
	 * <!-- end-model-doc -->
	 * @see #YPL10_VALUE
	 * @generated
	 * @ordered
	 */
	YPL10(335, "YPL10", "YPL-1.0"),

	/**
	 * The '<em><b>YPL11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Yahoo! Public License v1.1
	 * <!-- end-model-doc -->
	 * @see #YPL11_VALUE
	 * @generated
	 * @ordered
	 */
	YPL11(336, "YPL11", "YPL-1.1"),

	/**
	 * The '<em><b>Zed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zed License
	 * <!-- end-model-doc -->
	 * @see #ZED_VALUE
	 * @generated
	 * @ordered
	 */
	ZED(337, "Zed", "Zed"),

	/**
	 * The '<em><b>Zend20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zend License v2.0
	 * <!-- end-model-doc -->
	 * @see #ZEND20_VALUE
	 * @generated
	 * @ordered
	 */
	ZEND20(338, "Zend20", "Zend-2.0"),

	/**
	 * The '<em><b>Zimbra13</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zimbra Public License v1.3
	 * <!-- end-model-doc -->
	 * @see #ZIMBRA13_VALUE
	 * @generated
	 * @ordered
	 */
	ZIMBRA13(339, "Zimbra13", "Zimbra-1.3"),

	/**
	 * The '<em><b>Zimbra14</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zimbra Public License v1.4
	 * <!-- end-model-doc -->
	 * @see #ZIMBRA14_VALUE
	 * @generated
	 * @ordered
	 */
	ZIMBRA14(340, "Zimbra14", "Zimbra-1.4"),

	/**
	 * The '<em><b>Zlib Acknowledgement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * zlib/libpng License with Acknowledgement
	 * <!-- end-model-doc -->
	 * @see #ZLIB_ACKNOWLEDGEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	ZLIB_ACKNOWLEDGEMENT(341, "zlibAcknowledgement", "zlib-acknowledgement"),

	/**
	 * The '<em><b>Zlib</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * zlib License
	 * <!-- end-model-doc -->
	 * @see #ZLIB_VALUE
	 * @generated
	 * @ordered
	 */
	ZLIB(342, "Zlib", "Zlib"),

	/**
	 * The '<em><b>ZPL11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zope Public License 1.1
	 * <!-- end-model-doc -->
	 * @see #ZPL11_VALUE
	 * @generated
	 * @ordered
	 */
	ZPL11(343, "ZPL11", "ZPL-1.1"),

	/**
	 * The '<em><b>ZPL20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zope Public License 2.0
	 * <!-- end-model-doc -->
	 * @see #ZPL20_VALUE
	 * @generated
	 * @ordered
	 */
	ZPL20(344, "ZPL20", "ZPL-2.0"),

	/**
	 * The '<em><b>ZPL21</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zope Public License 2.1
	 * <!-- end-model-doc -->
	 * @see #ZPL21_VALUE
	 * @generated
	 * @ordered
	 */
	ZPL21(345, "ZPL21", "ZPL-2.1");

	/**
	 * The '<em><b>Not Open Source</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not open source
	 * <!-- end-model-doc -->
	 * @see #NOT_OPEN_SOURCE
	 * @model name="notOpenSource" literal="not-open-source"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_OPEN_SOURCE_VALUE = 0;

	/**
	 * The '<em><b>0BSD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD Zero Clause License
	 * <!-- end-model-doc -->
	 * @see #_0BSD
	 * @model literal="0BSD"
	 * @generated
	 * @ordered
	 */
	public static final int _0BSD_VALUE = 1;

	/**
	 * The '<em><b>AAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attribution Assurance License
	 * <!-- end-model-doc -->
	 * @see #AAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AAL_VALUE = 2;

	/**
	 * The '<em><b>Abstyles</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abstyles License
	 * <!-- end-model-doc -->
	 * @see #ABSTYLES
	 * @model name="Abstyles"
	 * @generated
	 * @ordered
	 */
	public static final int ABSTYLES_VALUE = 3;

	/**
	 * The '<em><b>Adobe2006</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adobe Systems Incorporated Source Code License Agreement
	 * <!-- end-model-doc -->
	 * @see #ADOBE2006
	 * @model name="Adobe2006" literal="Adobe-2006"
	 * @generated
	 * @ordered
	 */
	public static final int ADOBE2006_VALUE = 4;

	/**
	 * The '<em><b>Adobe Glyph</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adobe Glyph List License
	 * <!-- end-model-doc -->
	 * @see #ADOBE_GLYPH
	 * @model name="AdobeGlyph" literal="Adobe-Glyph"
	 * @generated
	 * @ordered
	 */
	public static final int ADOBE_GLYPH_VALUE = 5;

	/**
	 * The '<em><b>ADSL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Amazon Digital Services License
	 * <!-- end-model-doc -->
	 * @see #ADSL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADSL_VALUE = 6;

	/**
	 * The '<em><b>AFL11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Academic Free License v1.1
	 * <!-- end-model-doc -->
	 * @see #AFL11
	 * @model literal="AFL-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int AFL11_VALUE = 7;

	/**
	 * The '<em><b>AFL12</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Academic Free License v1.2
	 * <!-- end-model-doc -->
	 * @see #AFL12
	 * @model literal="AFL-1.2"
	 * @generated
	 * @ordered
	 */
	public static final int AFL12_VALUE = 8;

	/**
	 * The '<em><b>AFL20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Academic Free License v2.0
	 * <!-- end-model-doc -->
	 * @see #AFL20
	 * @model literal="AFL-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int AFL20_VALUE = 9;

	/**
	 * The '<em><b>AFL21</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Academic Free License v2.1
	 * <!-- end-model-doc -->
	 * @see #AFL21
	 * @model literal="AFL-2.1"
	 * @generated
	 * @ordered
	 */
	public static final int AFL21_VALUE = 10;

	/**
	 * The '<em><b>AFL30</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Academic Free License v3.0
	 * <!-- end-model-doc -->
	 * @see #AFL30
	 * @model literal="AFL-3.0"
	 * @generated
	 * @ordered
	 */
	public static final int AFL30_VALUE = 11;

	/**
	 * The '<em><b>Afmparse</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Afmparse License
	 * <!-- end-model-doc -->
	 * @see #AFMPARSE
	 * @model name="Afmparse"
	 * @generated
	 * @ordered
	 */
	public static final int AFMPARSE_VALUE = 12;

	/**
	 * The '<em><b>AGPL10 Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Affero General Public License v1.0 only
	 * <!-- end-model-doc -->
	 * @see #AGPL10_ONLY
	 * @model name="AGPL10Only" literal="AGPL-1.0-only"
	 * @generated
	 * @ordered
	 */
	public static final int AGPL10_ONLY_VALUE = 13;

	/**
	 * The '<em><b>AGPL10 Or Later</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Affero General Public License v1.0 or later
	 * <!-- end-model-doc -->
	 * @see #AGPL10_OR_LATER
	 * @model name="AGPL10OrLater" literal="AGPL-1.0-or-later"
	 * @generated
	 * @ordered
	 */
	public static final int AGPL10_OR_LATER_VALUE = 14;

	/**
	 * The '<em><b>AGPL30 Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Affero General Public License v3.0 only
	 * <!-- end-model-doc -->
	 * @see #AGPL30_ONLY
	 * @model name="AGPL30Only" literal="AGPL-3.0-only"
	 * @generated
	 * @ordered
	 */
	public static final int AGPL30_ONLY_VALUE = 15;

	/**
	 * The '<em><b>AGPL30 Or Later</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Affero General Public License v3.0 or later
	 * <!-- end-model-doc -->
	 * @see #AGPL30_OR_LATER
	 * @model name="AGPL30OrLater" literal="AGPL-3.0-or-later"
	 * @generated
	 * @ordered
	 */
	public static final int AGPL30_OR_LATER_VALUE = 16;

	/**
	 * The '<em><b>Aladdin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Aladdin Free Public License
	 * <!-- end-model-doc -->
	 * @see #ALADDIN
	 * @model name="Aladdin"
	 * @generated
	 * @ordered
	 */
	public static final int ALADDIN_VALUE = 17;

	/**
	 * The '<em><b>AMDPLPA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AMD's plpa_map.c License
	 * <!-- end-model-doc -->
	 * @see #AMDPLPA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AMDPLPA_VALUE = 18;

	/**
	 * The '<em><b>AML</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Apple MIT License
	 * <!-- end-model-doc -->
	 * @see #AML
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AML_VALUE = 19;

	/**
	 * The '<em><b>AMPAS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Academy of Motion Picture Arts and Sciences BSD
	 * <!-- end-model-doc -->
	 * @see #AMPAS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AMPAS_VALUE = 20;

	/**
	 * The '<em><b>ANTLRPD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ANTLR Software Rights Notice
	 * <!-- end-model-doc -->
	 * @see #ANTLRPD
	 * @model literal="ANTLR-PD"
	 * @generated
	 * @ordered
	 */
	public static final int ANTLRPD_VALUE = 21;

	/**
	 * The '<em><b>Apache10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Apache License 1.0
	 * <!-- end-model-doc -->
	 * @see #APACHE10
	 * @model name="Apache10" literal="Apache-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int APACHE10_VALUE = 22;

	/**
	 * The '<em><b>Apache11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Apache License 1.1
	 * <!-- end-model-doc -->
	 * @see #APACHE11
	 * @model name="Apache11" literal="Apache-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int APACHE11_VALUE = 23;

	/**
	 * The '<em><b>Apache20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Apache License 2.0
	 * <!-- end-model-doc -->
	 * @see #APACHE20
	 * @model name="Apache20" literal="Apache-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int APACHE20_VALUE = 24;

	/**
	 * The '<em><b>APAFML</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adobe Postscript AFM License
	 * <!-- end-model-doc -->
	 * @see #APAFML
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int APAFML_VALUE = 25;

	/**
	 * The '<em><b>APL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adaptive Public License 1.0
	 * <!-- end-model-doc -->
	 * @see #APL10
	 * @model literal="APL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int APL10_VALUE = 26;

	/**
	 * The '<em><b>APSL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Apple Public Source License 1.0
	 * <!-- end-model-doc -->
	 * @see #APSL10
	 * @model literal="APSL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int APSL10_VALUE = 27;

	/**
	 * The '<em><b>APSL11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Apple Public Source License 1.1
	 * <!-- end-model-doc -->
	 * @see #APSL11
	 * @model literal="APSL-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int APSL11_VALUE = 28;

	/**
	 * The '<em><b>APSL12</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Apple Public Source License 1.2
	 * <!-- end-model-doc -->
	 * @see #APSL12
	 * @model literal="APSL-1.2"
	 * @generated
	 * @ordered
	 */
	public static final int APSL12_VALUE = 29;

	/**
	 * The '<em><b>APSL20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Apple Public Source License 2.0
	 * <!-- end-model-doc -->
	 * @see #APSL20
	 * @model literal="APSL-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int APSL20_VALUE = 30;

	/**
	 * The '<em><b>Artistic10 Cl8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Artistic License 1.0 w/clause 8
	 * <!-- end-model-doc -->
	 * @see #ARTISTIC10_CL8
	 * @model name="Artistic10Cl8" literal="Artistic-1.0-cl8"
	 * @generated
	 * @ordered
	 */
	public static final int ARTISTIC10_CL8_VALUE = 31;

	/**
	 * The '<em><b>Artistic10 Perl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Artistic License 1.0 (Perl)
	 * <!-- end-model-doc -->
	 * @see #ARTISTIC10_PERL
	 * @model name="Artistic10Perl" literal="Artistic-1.0-Perl"
	 * @generated
	 * @ordered
	 */
	public static final int ARTISTIC10_PERL_VALUE = 32;

	/**
	 * The '<em><b>Artistic10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Artistic License 1.0
	 * <!-- end-model-doc -->
	 * @see #ARTISTIC10
	 * @model name="Artistic10" literal="Artistic-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int ARTISTIC10_VALUE = 33;

	/**
	 * The '<em><b>Artistic20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Artistic License 2.0
	 * <!-- end-model-doc -->
	 * @see #ARTISTIC20
	 * @model name="Artistic20" literal="Artistic-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int ARTISTIC20_VALUE = 34;

	/**
	 * The '<em><b>Bahyph</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bahyph License
	 * <!-- end-model-doc -->
	 * @see #BAHYPH
	 * @model name="Bahyph"
	 * @generated
	 * @ordered
	 */
	public static final int BAHYPH_VALUE = 35;

	/**
	 * The '<em><b>Barr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Barr License
	 * <!-- end-model-doc -->
	 * @see #BARR
	 * @model name="Barr"
	 * @generated
	 * @ordered
	 */
	public static final int BARR_VALUE = 36;

	/**
	 * The '<em><b>Beerware</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Beerware License
	 * <!-- end-model-doc -->
	 * @see #BEERWARE
	 * @model name="Beerware"
	 * @generated
	 * @ordered
	 */
	public static final int BEERWARE_VALUE = 37;

	/**
	 * The '<em><b>Bit Torrent10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BitTorrent Open Source License v1.0
	 * <!-- end-model-doc -->
	 * @see #BIT_TORRENT10
	 * @model name="BitTorrent10" literal="BitTorrent-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int BIT_TORRENT10_VALUE = 38;

	/**
	 * The '<em><b>Bit Torrent11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BitTorrent Open Source License v1.1
	 * <!-- end-model-doc -->
	 * @see #BIT_TORRENT11
	 * @model name="BitTorrent11" literal="BitTorrent-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int BIT_TORRENT11_VALUE = 39;

	/**
	 * The '<em><b>Borceux</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Borceux license
	 * <!-- end-model-doc -->
	 * @see #BORCEUX
	 * @model name="Borceux"
	 * @generated
	 * @ordered
	 */
	public static final int BORCEUX_VALUE = 40;

	/**
	 * The '<em><b>BSD1 Clause</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 1-Clause License
	 * <!-- end-model-doc -->
	 * @see #BSD1_CLAUSE
	 * @model name="BSD1Clause" literal="BSD-1-Clause"
	 * @generated
	 * @ordered
	 */
	public static final int BSD1_CLAUSE_VALUE = 41;

	/**
	 * The '<em><b>BSD2 Clause Free BSD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 2-Clause FreeBSD License
	 * <!-- end-model-doc -->
	 * @see #BSD2_CLAUSE_FREE_BSD
	 * @model name="BSD2ClauseFreeBSD" literal="BSD-2-Clause-FreeBSD"
	 * @generated
	 * @ordered
	 */
	public static final int BSD2_CLAUSE_FREE_BSD_VALUE = 42;

	/**
	 * The '<em><b>BSD2 Clause Net BSD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 2-Clause NetBSD License
	 * <!-- end-model-doc -->
	 * @see #BSD2_CLAUSE_NET_BSD
	 * @model name="BSD2ClauseNetBSD" literal="BSD-2-Clause-NetBSD"
	 * @generated
	 * @ordered
	 */
	public static final int BSD2_CLAUSE_NET_BSD_VALUE = 43;

	/**
	 * The '<em><b>BSD2 Clause Patent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD-2-Clause Plus Patent License
	 * <!-- end-model-doc -->
	 * @see #BSD2_CLAUSE_PATENT
	 * @model name="BSD2ClausePatent" literal="BSD-2-Clause-Patent"
	 * @generated
	 * @ordered
	 */
	public static final int BSD2_CLAUSE_PATENT_VALUE = 44;

	/**
	 * The '<em><b>BSD2 Clause</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 2-Clause "Simplified" License
	 * <!-- end-model-doc -->
	 * @see #BSD2_CLAUSE
	 * @model name="BSD2Clause" literal="BSD-2-Clause"
	 * @generated
	 * @ordered
	 */
	public static final int BSD2_CLAUSE_VALUE = 45;

	/**
	 * The '<em><b>BSD3 Clause Attribution</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD with attribution
	 * <!-- end-model-doc -->
	 * @see #BSD3_CLAUSE_ATTRIBUTION
	 * @model name="BSD3ClauseAttribution" literal="BSD-3-Clause-Attribution"
	 * @generated
	 * @ordered
	 */
	public static final int BSD3_CLAUSE_ATTRIBUTION_VALUE = 46;

	/**
	 * The '<em><b>BSD3 Clause Clear</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 3-Clause Clear License
	 * <!-- end-model-doc -->
	 * @see #BSD3_CLAUSE_CLEAR
	 * @model name="BSD3ClauseClear" literal="BSD-3-Clause-Clear"
	 * @generated
	 * @ordered
	 */
	public static final int BSD3_CLAUSE_CLEAR_VALUE = 47;

	/**
	 * The '<em><b>BSD3 Clause LBNL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lawrence Berkeley National Labs BSD variant license
	 * <!-- end-model-doc -->
	 * @see #BSD3_CLAUSE_LBNL
	 * @model name="BSD3ClauseLBNL" literal="BSD-3-Clause-LBNL"
	 * @generated
	 * @ordered
	 */
	public static final int BSD3_CLAUSE_LBNL_VALUE = 48;

	/**
	 * The '<em><b>BSD3 Clause No Nuclear License2014</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 3-Clause No Nuclear License 2014
	 * <!-- end-model-doc -->
	 * @see #BSD3_CLAUSE_NO_NUCLEAR_LICENSE2014
	 * @model name="BSD3ClauseNoNuclearLicense2014" literal="BSD-3-Clause-No-Nuclear-License-2014"
	 * @generated
	 * @ordered
	 */
	public static final int BSD3_CLAUSE_NO_NUCLEAR_LICENSE2014_VALUE = 49;

	/**
	 * The '<em><b>BSD3 Clause No Nuclear License</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 3-Clause No Nuclear License
	 * <!-- end-model-doc -->
	 * @see #BSD3_CLAUSE_NO_NUCLEAR_LICENSE
	 * @model name="BSD3ClauseNoNuclearLicense" literal="BSD-3-Clause-No-Nuclear-License"
	 * @generated
	 * @ordered
	 */
	public static final int BSD3_CLAUSE_NO_NUCLEAR_LICENSE_VALUE = 50;

	/**
	 * The '<em><b>BSD3 Clause No Nuclear Warranty</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 3-Clause No Nuclear Warranty
	 * <!-- end-model-doc -->
	 * @see #BSD3_CLAUSE_NO_NUCLEAR_WARRANTY
	 * @model name="BSD3ClauseNoNuclearWarranty" literal="BSD-3-Clause-No-Nuclear-Warranty"
	 * @generated
	 * @ordered
	 */
	public static final int BSD3_CLAUSE_NO_NUCLEAR_WARRANTY_VALUE = 51;

	/**
	 * The '<em><b>BSD3 Clause</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 3-Clause "New" or "Revised" License
	 * <!-- end-model-doc -->
	 * @see #BSD3_CLAUSE
	 * @model name="BSD3Clause" literal="BSD-3-Clause"
	 * @generated
	 * @ordered
	 */
	public static final int BSD3_CLAUSE_VALUE = 52;

	/**
	 * The '<em><b>BSD4 Clause UC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD-4-Clause (University of California-Specific)
	 * <!-- end-model-doc -->
	 * @see #BSD4_CLAUSE_UC
	 * @model name="BSD4ClauseUC" literal="BSD-4-Clause-UC"
	 * @generated
	 * @ordered
	 */
	public static final int BSD4_CLAUSE_UC_VALUE = 53;

	/**
	 * The '<em><b>BSD4 Clause</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD 4-Clause "Original" or "Old" License
	 * <!-- end-model-doc -->
	 * @see #BSD4_CLAUSE
	 * @model name="BSD4Clause" literal="BSD-4-Clause"
	 * @generated
	 * @ordered
	 */
	public static final int BSD4_CLAUSE_VALUE = 54;

	/**
	 * The '<em><b>BSD Protection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD Protection License
	 * <!-- end-model-doc -->
	 * @see #BSD_PROTECTION
	 * @model name="BSDProtection" literal="BSD-Protection"
	 * @generated
	 * @ordered
	 */
	public static final int BSD_PROTECTION_VALUE = 55;

	/**
	 * The '<em><b>BSD Source Code</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BSD Source Code Attribution
	 * <!-- end-model-doc -->
	 * @see #BSD_SOURCE_CODE
	 * @model name="BSDSourceCode" literal="BSD-Source-Code"
	 * @generated
	 * @ordered
	 */
	public static final int BSD_SOURCE_CODE_VALUE = 56;

	/**
	 * The '<em><b>BSL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boost Software License 1.0
	 * <!-- end-model-doc -->
	 * @see #BSL10
	 * @model literal="BSL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int BSL10_VALUE = 57;

	/**
	 * The '<em><b>Bzip2105</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * bzip2 and libbzip2 License v1.0.5
	 * <!-- end-model-doc -->
	 * @see #BZIP2105
	 * @model name="bzip2105" literal="bzip2-1.0.5"
	 * @generated
	 * @ordered
	 */
	public static final int BZIP2105_VALUE = 58;

	/**
	 * The '<em><b>Bzip2106</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * bzip2 and libbzip2 License v1.0.6
	 * <!-- end-model-doc -->
	 * @see #BZIP2106
	 * @model name="bzip2106" literal="bzip2-1.0.6"
	 * @generated
	 * @ordered
	 */
	public static final int BZIP2106_VALUE = 59;

	/**
	 * The '<em><b>Caldera</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Caldera License
	 * <!-- end-model-doc -->
	 * @see #CALDERA
	 * @model name="Caldera"
	 * @generated
	 * @ordered
	 */
	public static final int CALDERA_VALUE = 60;

	/**
	 * The '<em><b>CATOSL11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Computer Associates Trusted Open Source License 1.1
	 * <!-- end-model-doc -->
	 * @see #CATOSL11
	 * @model literal="CATOSL-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int CATOSL11_VALUE = 61;

	/**
	 * The '<em><b>CCBY10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution 1.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBY10
	 * @model literal="CC-BY-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCBY10_VALUE = 62;

	/**
	 * The '<em><b>CCBY20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution 2.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBY20
	 * @model literal="CC-BY-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCBY20_VALUE = 63;

	/**
	 * The '<em><b>CCBY25</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution 2.5 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBY25
	 * @model literal="CC-BY-2.5"
	 * @generated
	 * @ordered
	 */
	public static final int CCBY25_VALUE = 64;

	/**
	 * The '<em><b>CCBY30</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution 3.0 Unported
	 * <!-- end-model-doc -->
	 * @see #CCBY30
	 * @model literal="CC-BY-3.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCBY30_VALUE = 65;

	/**
	 * The '<em><b>CCBY40</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution 4.0 International
	 * <!-- end-model-doc -->
	 * @see #CCBY40
	 * @model literal="CC-BY-4.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCBY40_VALUE = 66;

	/**
	 * The '<em><b>CCBYNC10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial 1.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYNC10
	 * @model literal="CC-BY-NC-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYNC10_VALUE = 67;

	/**
	 * The '<em><b>CCBYNC20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial 2.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYNC20
	 * @model literal="CC-BY-NC-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYNC20_VALUE = 68;

	/**
	 * The '<em><b>CCBYNC25</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial 2.5 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYNC25
	 * @model literal="CC-BY-NC-2.5"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYNC25_VALUE = 69;

	/**
	 * The '<em><b>CCBYNC30</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial 3.0 Unported
	 * <!-- end-model-doc -->
	 * @see #CCBYNC30
	 * @model literal="CC-BY-NC-3.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYNC30_VALUE = 70;

	/**
	 * The '<em><b>CCBYNC40</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial 4.0 International
	 * <!-- end-model-doc -->
	 * @see #CCBYNC40
	 * @model literal="CC-BY-NC-4.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYNC40_VALUE = 71;

	/**
	 * The '<em><b>CCBYNCND10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial No Derivatives 1.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYNCND10
	 * @model literal="CC-BY-NC-ND-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYNCND10_VALUE = 72;

	/**
	 * The '<em><b>CCBYNCND20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial No Derivatives 2.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYNCND20
	 * @model literal="CC-BY-NC-ND-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYNCND20_VALUE = 73;

	/**
	 * The '<em><b>CCBYNCND25</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial No Derivatives 2.5 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYNCND25
	 * @model literal="CC-BY-NC-ND-2.5"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYNCND25_VALUE = 74;

	/**
	 * The '<em><b>CCBYNCND30</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial No Derivatives 3.0 Unported
	 * <!-- end-model-doc -->
	 * @see #CCBYNCND30
	 * @model literal="CC-BY-NC-ND-3.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYNCND30_VALUE = 75;

	/**
	 * The '<em><b>CCBYNCND40</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial No Derivatives 4.0 International
	 * <!-- end-model-doc -->
	 * @see #CCBYNCND40
	 * @model literal="CC-BY-NC-ND-4.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYNCND40_VALUE = 76;

	/**
	 * The '<em><b>CCBYNCSA10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial Share Alike 1.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYNCSA10
	 * @model literal="CC-BY-NC-SA-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYNCSA10_VALUE = 77;

	/**
	 * The '<em><b>CCBYNCSA20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial Share Alike 2.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYNCSA20
	 * @model literal="CC-BY-NC-SA-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYNCSA20_VALUE = 78;

	/**
	 * The '<em><b>CCBYNCSA25</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial Share Alike 2.5 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYNCSA25
	 * @model literal="CC-BY-NC-SA-2.5"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYNCSA25_VALUE = 79;

	/**
	 * The '<em><b>CCBYNCSA30</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial Share Alike 3.0 Unported
	 * <!-- end-model-doc -->
	 * @see #CCBYNCSA30
	 * @model literal="CC-BY-NC-SA-3.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYNCSA30_VALUE = 80;

	/**
	 * The '<em><b>CCBYNCSA40</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Non Commercial Share Alike 4.0 International
	 * <!-- end-model-doc -->
	 * @see #CCBYNCSA40
	 * @model literal="CC-BY-NC-SA-4.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYNCSA40_VALUE = 81;

	/**
	 * The '<em><b>CCBYND10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution No Derivatives 1.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYND10
	 * @model literal="CC-BY-ND-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYND10_VALUE = 82;

	/**
	 * The '<em><b>CCBYND20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution No Derivatives 2.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYND20
	 * @model literal="CC-BY-ND-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYND20_VALUE = 83;

	/**
	 * The '<em><b>CCBYND25</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution No Derivatives 2.5 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYND25
	 * @model literal="CC-BY-ND-2.5"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYND25_VALUE = 84;

	/**
	 * The '<em><b>CCBYND30</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution No Derivatives 3.0 Unported
	 * <!-- end-model-doc -->
	 * @see #CCBYND30
	 * @model literal="CC-BY-ND-3.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYND30_VALUE = 85;

	/**
	 * The '<em><b>CCBYND40</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution No Derivatives 4.0 International
	 * <!-- end-model-doc -->
	 * @see #CCBYND40
	 * @model literal="CC-BY-ND-4.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYND40_VALUE = 86;

	/**
	 * The '<em><b>CCBYSA10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Share Alike 1.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYSA10
	 * @model literal="CC-BY-SA-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYSA10_VALUE = 87;

	/**
	 * The '<em><b>CCBYSA20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Share Alike 2.0 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYSA20
	 * @model literal="CC-BY-SA-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYSA20_VALUE = 88;

	/**
	 * The '<em><b>CCBYSA25</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Share Alike 2.5 Generic
	 * <!-- end-model-doc -->
	 * @see #CCBYSA25
	 * @model literal="CC-BY-SA-2.5"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYSA25_VALUE = 89;

	/**
	 * The '<em><b>CCBYSA30</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Share Alike 3.0 Unported
	 * <!-- end-model-doc -->
	 * @see #CCBYSA30
	 * @model literal="CC-BY-SA-3.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYSA30_VALUE = 90;

	/**
	 * The '<em><b>CCBYSA40</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Attribution Share Alike 4.0 International
	 * <!-- end-model-doc -->
	 * @see #CCBYSA40
	 * @model literal="CC-BY-SA-4.0"
	 * @generated
	 * @ordered
	 */
	public static final int CCBYSA40_VALUE = 91;

	/**
	 * The '<em><b>CC010</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creative Commons Zero v1.0 Universal
	 * <!-- end-model-doc -->
	 * @see #CC010
	 * @model literal="CC0-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int CC010_VALUE = 92;

	/**
	 * The '<em><b>CDDL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Common Development and Distribution License 1.0
	 * <!-- end-model-doc -->
	 * @see #CDDL10
	 * @model literal="CDDL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int CDDL10_VALUE = 93;

	/**
	 * The '<em><b>CDDL11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Common Development and Distribution License 1.1
	 * <!-- end-model-doc -->
	 * @see #CDDL11
	 * @model literal="CDDL-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int CDDL11_VALUE = 94;

	/**
	 * The '<em><b>CDLA Permissive10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Community Data License Agreement Permissive 1.0
	 * <!-- end-model-doc -->
	 * @see #CDLA_PERMISSIVE10
	 * @model name="CDLAPermissive10" literal="CDLA-Permissive-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int CDLA_PERMISSIVE10_VALUE = 95;

	/**
	 * The '<em><b>CDLA Sharing10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Community Data License Agreement Sharing 1.0
	 * <!-- end-model-doc -->
	 * @see #CDLA_SHARING10
	 * @model name="CDLASharing10" literal="CDLA-Sharing-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int CDLA_SHARING10_VALUE = 96;

	/**
	 * The '<em><b>CECILL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CeCILL Free Software License Agreement v1.0
	 * <!-- end-model-doc -->
	 * @see #CECILL10
	 * @model literal="CECILL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int CECILL10_VALUE = 97;

	/**
	 * The '<em><b>CECILL11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CeCILL Free Software License Agreement v1.1
	 * <!-- end-model-doc -->
	 * @see #CECILL11
	 * @model literal="CECILL-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int CECILL11_VALUE = 98;

	/**
	 * The '<em><b>CECILL20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CeCILL Free Software License Agreement v2.0
	 * <!-- end-model-doc -->
	 * @see #CECILL20
	 * @model literal="CECILL-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int CECILL20_VALUE = 99;

	/**
	 * The '<em><b>CECILL21</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CeCILL Free Software License Agreement v2.1
	 * <!-- end-model-doc -->
	 * @see #CECILL21
	 * @model literal="CECILL-2.1"
	 * @generated
	 * @ordered
	 */
	public static final int CECILL21_VALUE = 100;

	/**
	 * The '<em><b>CECILLB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CeCILL-B Free Software License Agreement
	 * <!-- end-model-doc -->
	 * @see #CECILLB
	 * @model literal="CECILL-B"
	 * @generated
	 * @ordered
	 */
	public static final int CECILLB_VALUE = 101;

	/**
	 * The '<em><b>CECILLC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CeCILL-C Free Software License Agreement
	 * <!-- end-model-doc -->
	 * @see #CECILLC
	 * @model literal="CECILL-C"
	 * @generated
	 * @ordered
	 */
	public static final int CECILLC_VALUE = 102;

	/**
	 * The '<em><b>Cl Artistic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Clarified Artistic License
	 * <!-- end-model-doc -->
	 * @see #CL_ARTISTIC
	 * @model name="ClArtistic"
	 * @generated
	 * @ordered
	 */
	public static final int CL_ARTISTIC_VALUE = 103;

	/**
	 * The '<em><b>CNRI Jython</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CNRI Jython License
	 * <!-- end-model-doc -->
	 * @see #CNRI_JYTHON
	 * @model name="CNRIJython" literal="CNRI-Jython"
	 * @generated
	 * @ordered
	 */
	public static final int CNRI_JYTHON_VALUE = 104;

	/**
	 * The '<em><b>CNRI Python GPL Compatible</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CNRI Python Open Source GPL Compatible License Agreement
	 * <!-- end-model-doc -->
	 * @see #CNRI_PYTHON_GPL_COMPATIBLE
	 * @model name="CNRIPythonGPLCompatible" literal="CNRI-Python-GPL-Compatible"
	 * @generated
	 * @ordered
	 */
	public static final int CNRI_PYTHON_GPL_COMPATIBLE_VALUE = 105;

	/**
	 * The '<em><b>CNRI Python</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CNRI Python License
	 * <!-- end-model-doc -->
	 * @see #CNRI_PYTHON
	 * @model name="CNRIPython" literal="CNRI-Python"
	 * @generated
	 * @ordered
	 */
	public static final int CNRI_PYTHON_VALUE = 106;

	/**
	 * The '<em><b>Condor11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Condor Public License v1.1
	 * <!-- end-model-doc -->
	 * @see #CONDOR11
	 * @model name="Condor11" literal="Condor-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int CONDOR11_VALUE = 107;

	/**
	 * The '<em><b>CPAL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Common Public Attribution License 1.0
	 * <!-- end-model-doc -->
	 * @see #CPAL10
	 * @model literal="CPAL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int CPAL10_VALUE = 108;

	/**
	 * The '<em><b>CPL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Common Public License 1.0
	 * <!-- end-model-doc -->
	 * @see #CPL10
	 * @model literal="CPL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int CPL10_VALUE = 109;

	/**
	 * The '<em><b>CPOL102</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Code Project Open License 1.02
	 * <!-- end-model-doc -->
	 * @see #CPOL102
	 * @model literal="CPOL-1.02"
	 * @generated
	 * @ordered
	 */
	public static final int CPOL102_VALUE = 110;

	/**
	 * The '<em><b>Crossword</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Crossword License
	 * <!-- end-model-doc -->
	 * @see #CROSSWORD
	 * @model name="Crossword"
	 * @generated
	 * @ordered
	 */
	public static final int CROSSWORD_VALUE = 111;

	/**
	 * The '<em><b>Crystal Stacker</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CrystalStacker License
	 * <!-- end-model-doc -->
	 * @see #CRYSTAL_STACKER
	 * @model name="CrystalStacker"
	 * @generated
	 * @ordered
	 */
	public static final int CRYSTAL_STACKER_VALUE = 112;

	/**
	 * The '<em><b>CUAOPL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CUA Office Public License v1.0
	 * <!-- end-model-doc -->
	 * @see #CUAOPL10
	 * @model literal="CUA-OPL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int CUAOPL10_VALUE = 113;

	/**
	 * The '<em><b>Cube</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cube License
	 * <!-- end-model-doc -->
	 * @see #CUBE
	 * @model name="Cube"
	 * @generated
	 * @ordered
	 */
	public static final int CUBE_VALUE = 114;

	/**
	 * The '<em><b>Curl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * curl License
	 * <!-- end-model-doc -->
	 * @see #CURL
	 * @model name="curl"
	 * @generated
	 * @ordered
	 */
	public static final int CURL_VALUE = 115;

	/**
	 * The '<em><b>DFSL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Deutsche Freie Software Lizenz
	 * <!-- end-model-doc -->
	 * @see #DFSL10
	 * @model literal="D-FSL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int DFSL10_VALUE = 116;

	/**
	 * The '<em><b>Diffmark</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * diffmark license
	 * <!-- end-model-doc -->
	 * @see #DIFFMARK
	 * @model name="diffmark"
	 * @generated
	 * @ordered
	 */
	public static final int DIFFMARK_VALUE = 117;

	/**
	 * The '<em><b>DOC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DOC License
	 * <!-- end-model-doc -->
	 * @see #DOC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOC_VALUE = 118;

	/**
	 * The '<em><b>Dotseqn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dotseqn License
	 * <!-- end-model-doc -->
	 * @see #DOTSEQN
	 * @model name="Dotseqn"
	 * @generated
	 * @ordered
	 */
	public static final int DOTSEQN_VALUE = 119;

	/**
	 * The '<em><b>DSDP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DSDP License
	 * <!-- end-model-doc -->
	 * @see #DSDP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DSDP_VALUE = 120;

	/**
	 * The '<em><b>Dvipdfm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * dvipdfm License
	 * <!-- end-model-doc -->
	 * @see #DVIPDFM
	 * @model name="dvipdfm"
	 * @generated
	 * @ordered
	 */
	public static final int DVIPDFM_VALUE = 121;

	/**
	 * The '<em><b>ECL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Educational Community License v1.0
	 * <!-- end-model-doc -->
	 * @see #ECL10
	 * @model literal="ECL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int ECL10_VALUE = 122;

	/**
	 * The '<em><b>ECL20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Educational Community License v2.0
	 * <!-- end-model-doc -->
	 * @see #ECL20
	 * @model literal="ECL-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int ECL20_VALUE = 123;

	/**
	 * The '<em><b>EFL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eiffel Forum License v1.0
	 * <!-- end-model-doc -->
	 * @see #EFL10
	 * @model literal="EFL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int EFL10_VALUE = 124;

	/**
	 * The '<em><b>EFL20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eiffel Forum License v2.0
	 * <!-- end-model-doc -->
	 * @see #EFL20
	 * @model literal="EFL-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int EFL20_VALUE = 125;

	/**
	 * The '<em><b>EGenix</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * eGenix.com Public License 1.1.0
	 * <!-- end-model-doc -->
	 * @see #EGENIX
	 * @model name="eGenix"
	 * @generated
	 * @ordered
	 */
	public static final int EGENIX_VALUE = 126;

	/**
	 * The '<em><b>Entessa</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Entessa Public License v1.0
	 * <!-- end-model-doc -->
	 * @see #ENTESSA
	 * @model name="Entessa"
	 * @generated
	 * @ordered
	 */
	public static final int ENTESSA_VALUE = 127;

	/**
	 * The '<em><b>EPL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eclipse Public License 1.0
	 * <!-- end-model-doc -->
	 * @see #EPL10
	 * @model literal="EPL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int EPL10_VALUE = 128;

	/**
	 * The '<em><b>EPL20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eclipse Public License 2.0
	 * <!-- end-model-doc -->
	 * @see #EPL20
	 * @model literal="EPL-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int EPL20_VALUE = 129;

	/**
	 * The '<em><b>Erl PL11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Erlang Public License v1.1
	 * <!-- end-model-doc -->
	 * @see #ERL_PL11
	 * @model name="ErlPL11" literal="ErlPL-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int ERL_PL11_VALUE = 130;

	/**
	 * The '<em><b>EU Datagrid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EU DataGrid Software License
	 * <!-- end-model-doc -->
	 * @see #EU_DATAGRID
	 * @model name="EUDatagrid"
	 * @generated
	 * @ordered
	 */
	public static final int EU_DATAGRID_VALUE = 131;

	/**
	 * The '<em><b>EUPL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * European Union Public License 1.0
	 * <!-- end-model-doc -->
	 * @see #EUPL10
	 * @model literal="EUPL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int EUPL10_VALUE = 132;

	/**
	 * The '<em><b>EUPL11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * European Union Public License 1.1
	 * <!-- end-model-doc -->
	 * @see #EUPL11
	 * @model literal="EUPL-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int EUPL11_VALUE = 133;

	/**
	 * The '<em><b>EUPL12</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * European Union Public License 1.2
	 * <!-- end-model-doc -->
	 * @see #EUPL12
	 * @model literal="EUPL-1.2"
	 * @generated
	 * @ordered
	 */
	public static final int EUPL12_VALUE = 134;

	/**
	 * The '<em><b>Eurosym</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eurosym License
	 * <!-- end-model-doc -->
	 * @see #EUROSYM
	 * @model name="Eurosym"
	 * @generated
	 * @ordered
	 */
	public static final int EUROSYM_VALUE = 135;

	/**
	 * The '<em><b>Fair</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fair License
	 * <!-- end-model-doc -->
	 * @see #FAIR
	 * @model name="Fair"
	 * @generated
	 * @ordered
	 */
	public static final int FAIR_VALUE = 136;

	/**
	 * The '<em><b>Frameworx10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Frameworx Open License 1.0
	 * <!-- end-model-doc -->
	 * @see #FRAMEWORX10
	 * @model name="Frameworx10" literal="Frameworx-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int FRAMEWORX10_VALUE = 137;

	/**
	 * The '<em><b>Free Image</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FreeImage Public License v1.0
	 * <!-- end-model-doc -->
	 * @see #FREE_IMAGE
	 * @model name="FreeImage"
	 * @generated
	 * @ordered
	 */
	public static final int FREE_IMAGE_VALUE = 138;

	/**
	 * The '<em><b>FSFAP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FSF All Permissive License
	 * <!-- end-model-doc -->
	 * @see #FSFAP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FSFAP_VALUE = 139;

	/**
	 * The '<em><b>FSFUL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FSF Unlimited License
	 * <!-- end-model-doc -->
	 * @see #FSFUL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FSFUL_VALUE = 140;

	/**
	 * The '<em><b>FSFULLR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FSF Unlimited License (with License Retention)
	 * <!-- end-model-doc -->
	 * @see #FSFULLR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FSFULLR_VALUE = 141;

	/**
	 * The '<em><b>FTL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Freetype Project License
	 * <!-- end-model-doc -->
	 * @see #FTL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FTL_VALUE = 142;

	/**
	 * The '<em><b>GFDL11 Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.1 only
	 * <!-- end-model-doc -->
	 * @see #GFDL11_ONLY
	 * @model name="GFDL11Only" literal="GFDL-1.1-only"
	 * @generated
	 * @ordered
	 */
	public static final int GFDL11_ONLY_VALUE = 143;

	/**
	 * The '<em><b>GFDL11 Or Later</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.1 or later
	 * <!-- end-model-doc -->
	 * @see #GFDL11_OR_LATER
	 * @model name="GFDL11OrLater" literal="GFDL-1.1-or-later"
	 * @generated
	 * @ordered
	 */
	public static final int GFDL11_OR_LATER_VALUE = 144;

	/**
	 * The '<em><b>GFDL12 Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.2 only
	 * <!-- end-model-doc -->
	 * @see #GFDL12_ONLY
	 * @model name="GFDL12Only" literal="GFDL-1.2-only"
	 * @generated
	 * @ordered
	 */
	public static final int GFDL12_ONLY_VALUE = 145;

	/**
	 * The '<em><b>GFDL12 Or Later</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.2 or later
	 * <!-- end-model-doc -->
	 * @see #GFDL12_OR_LATER
	 * @model name="GFDL12OrLater" literal="GFDL-1.2-or-later"
	 * @generated
	 * @ordered
	 */
	public static final int GFDL12_OR_LATER_VALUE = 146;

	/**
	 * The '<em><b>GFDL13 Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.3 only
	 * <!-- end-model-doc -->
	 * @see #GFDL13_ONLY
	 * @model name="GFDL13Only" literal="GFDL-1.3-only"
	 * @generated
	 * @ordered
	 */
	public static final int GFDL13_ONLY_VALUE = 147;

	/**
	 * The '<em><b>GFDL13 Or Later</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Free Documentation License v1.3 or later
	 * <!-- end-model-doc -->
	 * @see #GFDL13_OR_LATER
	 * @model name="GFDL13OrLater" literal="GFDL-1.3-or-later"
	 * @generated
	 * @ordered
	 */
	public static final int GFDL13_OR_LATER_VALUE = 148;

	/**
	 * The '<em><b>Giftware</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Giftware License
	 * <!-- end-model-doc -->
	 * @see #GIFTWARE
	 * @model name="Giftware"
	 * @generated
	 * @ordered
	 */
	public static final int GIFTWARE_VALUE = 149;

	/**
	 * The '<em><b>GL2PS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GL2PS License
	 * <!-- end-model-doc -->
	 * @see #GL2PS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GL2PS_VALUE = 150;

	/**
	 * The '<em><b>Glide</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3dfx Glide License
	 * <!-- end-model-doc -->
	 * @see #GLIDE
	 * @model name="Glide"
	 * @generated
	 * @ordered
	 */
	public static final int GLIDE_VALUE = 151;

	/**
	 * The '<em><b>Glulxe</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Glulxe License
	 * <!-- end-model-doc -->
	 * @see #GLULXE
	 * @model name="Glulxe"
	 * @generated
	 * @ordered
	 */
	public static final int GLULXE_VALUE = 152;

	/**
	 * The '<em><b>Gnuplot</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gnuplot License
	 * <!-- end-model-doc -->
	 * @see #GNUPLOT
	 * @model name="gnuplot"
	 * @generated
	 * @ordered
	 */
	public static final int GNUPLOT_VALUE = 153;

	/**
	 * The '<em><b>GPL10 Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v1.0 only
	 * <!-- end-model-doc -->
	 * @see #GPL10_ONLY
	 * @model name="GPL10Only" literal="GPL-1.0-only"
	 * @generated
	 * @ordered
	 */
	public static final int GPL10_ONLY_VALUE = 154;

	/**
	 * The '<em><b>GPL10 Or Later</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v1.0 or later
	 * <!-- end-model-doc -->
	 * @see #GPL10_OR_LATER
	 * @model name="GPL10OrLater" literal="GPL-1.0-or-later"
	 * @generated
	 * @ordered
	 */
	public static final int GPL10_OR_LATER_VALUE = 155;

	/**
	 * The '<em><b>GPL20 Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v2.0 only
	 * <!-- end-model-doc -->
	 * @see #GPL20_ONLY
	 * @model name="GPL20Only" literal="GPL-2.0-only"
	 * @generated
	 * @ordered
	 */
	public static final int GPL20_ONLY_VALUE = 156;

	/**
	 * The '<em><b>GPL20 Or Later</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v2.0 or later
	 * <!-- end-model-doc -->
	 * @see #GPL20_OR_LATER
	 * @model name="GPL20OrLater" literal="GPL-2.0-or-later"
	 * @generated
	 * @ordered
	 */
	public static final int GPL20_OR_LATER_VALUE = 157;

	/**
	 * The '<em><b>GPL30 Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v3.0 only
	 * <!-- end-model-doc -->
	 * @see #GPL30_ONLY
	 * @model name="GPL30Only" literal="GPL-3.0-only"
	 * @generated
	 * @ordered
	 */
	public static final int GPL30_ONLY_VALUE = 158;

	/**
	 * The '<em><b>GPL30 Or Later</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU General Public License v3.0 or later
	 * <!-- end-model-doc -->
	 * @see #GPL30_OR_LATER
	 * @model name="GPL30OrLater" literal="GPL-3.0-or-later"
	 * @generated
	 * @ordered
	 */
	public static final int GPL30_OR_LATER_VALUE = 159;

	/**
	 * The '<em><b>GSOAP1 3b</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gSOAP Public License v1.3b
	 * <!-- end-model-doc -->
	 * @see #GSOAP1_3B
	 * @model name="gSOAP13b" literal="gSOAP-1.3b"
	 * @generated
	 * @ordered
	 */
	public static final int GSOAP1_3B_VALUE = 160;

	/**
	 * The '<em><b>Haskell Report</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Haskell Language Report License
	 * <!-- end-model-doc -->
	 * @see #HASKELL_REPORT
	 * @model name="HaskellReport"
	 * @generated
	 * @ordered
	 */
	public static final int HASKELL_REPORT_VALUE = 161;

	/**
	 * The '<em><b>HPND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Historical Permission Notice and Disclaimer
	 * <!-- end-model-doc -->
	 * @see #HPND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HPND_VALUE = 162;

	/**
	 * The '<em><b>IBM Pibs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IBM PowerPC Initialization and Boot Software
	 * <!-- end-model-doc -->
	 * @see #IBM_PIBS
	 * @model name="IBMPibs" literal="IBM-pibs"
	 * @generated
	 * @ordered
	 */
	public static final int IBM_PIBS_VALUE = 163;

	/**
	 * The '<em><b>ICU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ICU License
	 * <!-- end-model-doc -->
	 * @see #ICU
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ICU_VALUE = 164;

	/**
	 * The '<em><b>IJG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Independent JPEG Group License
	 * <!-- end-model-doc -->
	 * @see #IJG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IJG_VALUE = 165;

	/**
	 * The '<em><b>Image Magick</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ImageMagick License
	 * <!-- end-model-doc -->
	 * @see #IMAGE_MAGICK
	 * @model name="ImageMagick"
	 * @generated
	 * @ordered
	 */
	public static final int IMAGE_MAGICK_VALUE = 166;

	/**
	 * The '<em><b>IMatix</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * iMatix Standard Function Library Agreement
	 * <!-- end-model-doc -->
	 * @see #IMATIX
	 * @model name="iMatix"
	 * @generated
	 * @ordered
	 */
	public static final int IMATIX_VALUE = 167;

	/**
	 * The '<em><b>Imlib2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Imlib2 License
	 * <!-- end-model-doc -->
	 * @see #IMLIB2
	 * @model name="Imlib2"
	 * @generated
	 * @ordered
	 */
	public static final int IMLIB2_VALUE = 168;

	/**
	 * The '<em><b>Info ZIP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Info-ZIP License
	 * <!-- end-model-doc -->
	 * @see #INFO_ZIP
	 * @model name="InfoZIP" literal="Info-ZIP"
	 * @generated
	 * @ordered
	 */
	public static final int INFO_ZIP_VALUE = 169;

	/**
	 * The '<em><b>Intel ACPI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Intel ACPI Software License Agreement
	 * <!-- end-model-doc -->
	 * @see #INTEL_ACPI
	 * @model name="IntelACPI" literal="Intel-ACPI"
	 * @generated
	 * @ordered
	 */
	public static final int INTEL_ACPI_VALUE = 170;

	/**
	 * The '<em><b>Intel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Intel Open Source License
	 * <!-- end-model-doc -->
	 * @see #INTEL
	 * @model name="Intel"
	 * @generated
	 * @ordered
	 */
	public static final int INTEL_VALUE = 171;

	/**
	 * The '<em><b>Interbase10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Interbase Public License v1.0
	 * <!-- end-model-doc -->
	 * @see #INTERBASE10
	 * @model name="Interbase10" literal="Interbase-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int INTERBASE10_VALUE = 172;

	/**
	 * The '<em><b>IPA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IPA Font License
	 * <!-- end-model-doc -->
	 * @see #IPA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IPA_VALUE = 173;

	/**
	 * The '<em><b>IPL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IBM Public License v1.0
	 * <!-- end-model-doc -->
	 * @see #IPL10
	 * @model literal="IPL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int IPL10_VALUE = 174;

	/**
	 * The '<em><b>ISC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ISC License
	 * <!-- end-model-doc -->
	 * @see #ISC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ISC_VALUE = 175;

	/**
	 * The '<em><b>Jas Per20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JasPer License
	 * <!-- end-model-doc -->
	 * @see #JAS_PER20
	 * @model name="JasPer20" literal="JasPer-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int JAS_PER20_VALUE = 176;

	/**
	 * The '<em><b>JSON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JSON License
	 * <!-- end-model-doc -->
	 * @see #JSON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JSON_VALUE = 177;

	/**
	 * The '<em><b>LAL12</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Licence Art Libre 1.2
	 * <!-- end-model-doc -->
	 * @see #LAL12
	 * @model literal="LAL-1.2"
	 * @generated
	 * @ordered
	 */
	public static final int LAL12_VALUE = 178;

	/**
	 * The '<em><b>LAL13</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Licence Art Libre 1.3
	 * <!-- end-model-doc -->
	 * @see #LAL13
	 * @model literal="LAL-1.3"
	 * @generated
	 * @ordered
	 */
	public static final int LAL13_VALUE = 179;

	/**
	 * The '<em><b>Latex2e</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Latex2e License
	 * <!-- end-model-doc -->
	 * @see #LATEX2E
	 * @model name="Latex2e"
	 * @generated
	 * @ordered
	 */
	public static final int LATEX2E_VALUE = 180;

	/**
	 * The '<em><b>Leptonica</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Leptonica License
	 * <!-- end-model-doc -->
	 * @see #LEPTONICA
	 * @model name="Leptonica"
	 * @generated
	 * @ordered
	 */
	public static final int LEPTONICA_VALUE = 181;

	/**
	 * The '<em><b>LGPL20 Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Library General Public License v2 only
	 * <!-- end-model-doc -->
	 * @see #LGPL20_ONLY
	 * @model name="LGPL20Only" literal="LGPL-2.0-only"
	 * @generated
	 * @ordered
	 */
	public static final int LGPL20_ONLY_VALUE = 182;

	/**
	 * The '<em><b>LGPL20 Or Later</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Library General Public License v2 or later
	 * <!-- end-model-doc -->
	 * @see #LGPL20_OR_LATER
	 * @model name="LGPL20OrLater" literal="LGPL-2.0-or-later"
	 * @generated
	 * @ordered
	 */
	public static final int LGPL20_OR_LATER_VALUE = 183;

	/**
	 * The '<em><b>LGPL21 Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Lesser General Public License v2.1 only
	 * <!-- end-model-doc -->
	 * @see #LGPL21_ONLY
	 * @model name="LGPL21Only" literal="LGPL-2.1-only"
	 * @generated
	 * @ordered
	 */
	public static final int LGPL21_ONLY_VALUE = 184;

	/**
	 * The '<em><b>LGPL21 Or Later</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Lesser General Public License v2.1 or later
	 * <!-- end-model-doc -->
	 * @see #LGPL21_OR_LATER
	 * @model name="LGPL21OrLater" literal="LGPL-2.1-or-later"
	 * @generated
	 * @ordered
	 */
	public static final int LGPL21_OR_LATER_VALUE = 185;

	/**
	 * The '<em><b>LGPL30 Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Lesser General Public License v3.0 only
	 * <!-- end-model-doc -->
	 * @see #LGPL30_ONLY
	 * @model name="LGPL30Only" literal="LGPL-3.0-only"
	 * @generated
	 * @ordered
	 */
	public static final int LGPL30_ONLY_VALUE = 186;

	/**
	 * The '<em><b>LGPL30 Or Later</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GNU Lesser General Public License v3.0 or later
	 * <!-- end-model-doc -->
	 * @see #LGPL30_OR_LATER
	 * @model name="LGPL30OrLater" literal="LGPL-3.0-or-later"
	 * @generated
	 * @ordered
	 */
	public static final int LGPL30_OR_LATER_VALUE = 187;

	/**
	 * The '<em><b>LGPLLR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lesser General Public License For Linguistic Resources
	 * <!-- end-model-doc -->
	 * @see #LGPLLR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LGPLLR_VALUE = 188;

	/**
	 * The '<em><b>Libpng</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * libpng License
	 * <!-- end-model-doc -->
	 * @see #LIBPNG
	 * @model name="Libpng"
	 * @generated
	 * @ordered
	 */
	public static final int LIBPNG_VALUE = 189;

	/**
	 * The '<em><b>Libtiff</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * libtiff License
	 * <!-- end-model-doc -->
	 * @see #LIBTIFF
	 * @model name="libtiff"
	 * @generated
	 * @ordered
	 */
	public static final int LIBTIFF_VALUE = 190;

	/**
	 * The '<em><b>Li Li QP11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Licence Libre du Québec – Permissive version 1.1
	 * <!-- end-model-doc -->
	 * @see #LI_LI_QP11
	 * @model name="LiLiQP11" literal="LiLiQ-P-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int LI_LI_QP11_VALUE = 191;

	/**
	 * The '<em><b>Li Li QR11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Licence Libre du Québec – Réciprocité version 1.1
	 * <!-- end-model-doc -->
	 * @see #LI_LI_QR11
	 * @model name="LiLiQR11" literal="LiLiQ-R-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int LI_LI_QR11_VALUE = 192;

	/**
	 * The '<em><b>Li Li QRplus11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Licence Libre du Québec – Réciprocité forte version 1.1
	 * <!-- end-model-doc -->
	 * @see #LI_LI_QRPLUS11
	 * @model name="LiLiQRplus11" literal="LiLiQ-Rplus-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int LI_LI_QRPLUS11_VALUE = 193;

	/**
	 * The '<em><b>Linux Open IB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Linux Kernel Variant of OpenIB.org license
	 * <!-- end-model-doc -->
	 * @see #LINUX_OPEN_IB
	 * @model name="LinuxOpenIB" literal="Linux-OpenIB"
	 * @generated
	 * @ordered
	 */
	public static final int LINUX_OPEN_IB_VALUE = 194;

	/**
	 * The '<em><b>LPL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lucent Public License Version 1.0
	 * <!-- end-model-doc -->
	 * @see #LPL10
	 * @model literal="LPL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int LPL10_VALUE = 195;

	/**
	 * The '<em><b>LPL102</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lucent Public License v1.02
	 * <!-- end-model-doc -->
	 * @see #LPL102
	 * @model literal="LPL-1.02"
	 * @generated
	 * @ordered
	 */
	public static final int LPL102_VALUE = 196;

	/**
	 * The '<em><b>LPPL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LaTeX Project Public License v1.0
	 * <!-- end-model-doc -->
	 * @see #LPPL10
	 * @model literal="LPPL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int LPPL10_VALUE = 197;

	/**
	 * The '<em><b>LPPL11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LaTeX Project Public License v1.1
	 * <!-- end-model-doc -->
	 * @see #LPPL11
	 * @model literal="LPPL-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int LPPL11_VALUE = 198;

	/**
	 * The '<em><b>LPPL12</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LaTeX Project Public License v1.2
	 * <!-- end-model-doc -->
	 * @see #LPPL12
	 * @model literal="LPPL-1.2"
	 * @generated
	 * @ordered
	 */
	public static final int LPPL12_VALUE = 199;

	/**
	 * The '<em><b>LPPL1 3a</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LaTeX Project Public License v1.3a
	 * <!-- end-model-doc -->
	 * @see #LPPL1_3A
	 * @model name="LPPL13a" literal="LPPL-1.3a"
	 * @generated
	 * @ordered
	 */
	public static final int LPPL1_3A_VALUE = 200;

	/**
	 * The '<em><b>LPPL1 3c</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LaTeX Project Public License v1.3c
	 * <!-- end-model-doc -->
	 * @see #LPPL1_3C
	 * @model name="LPPL13c" literal="LPPL-1.3c"
	 * @generated
	 * @ordered
	 */
	public static final int LPPL1_3C_VALUE = 201;

	/**
	 * The '<em><b>Make Index</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MakeIndex License
	 * <!-- end-model-doc -->
	 * @see #MAKE_INDEX
	 * @model name="MakeIndex"
	 * @generated
	 * @ordered
	 */
	public static final int MAKE_INDEX_VALUE = 202;

	/**
	 * The '<em><b>Mir OS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MirOS License
	 * <!-- end-model-doc -->
	 * @see #MIR_OS
	 * @model name="MirOS"
	 * @generated
	 * @ordered
	 */
	public static final int MIR_OS_VALUE = 203;

	/**
	 * The '<em><b>MIT0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MIT No Attribution
	 * <!-- end-model-doc -->
	 * @see #MIT0
	 * @model literal="MIT-0"
	 * @generated
	 * @ordered
	 */
	public static final int MIT0_VALUE = 204;

	/**
	 * The '<em><b>MIT Advertising</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enlightenment License (e16)
	 * <!-- end-model-doc -->
	 * @see #MIT_ADVERTISING
	 * @model name="MITAdvertising" literal="MIT-advertising"
	 * @generated
	 * @ordered
	 */
	public static final int MIT_ADVERTISING_VALUE = 205;

	/**
	 * The '<em><b>MITCMU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CMU License
	 * <!-- end-model-doc -->
	 * @see #MITCMU
	 * @model literal="MIT-CMU"
	 * @generated
	 * @ordered
	 */
	public static final int MITCMU_VALUE = 206;

	/**
	 * The '<em><b>MIT Enna</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * enna License
	 * <!-- end-model-doc -->
	 * @see #MIT_ENNA
	 * @model name="MITEnna" literal="MIT-enna"
	 * @generated
	 * @ordered
	 */
	public static final int MIT_ENNA_VALUE = 207;

	/**
	 * The '<em><b>MIT Feh</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * feh License
	 * <!-- end-model-doc -->
	 * @see #MIT_FEH
	 * @model name="MITFeh" literal="MIT-feh"
	 * @generated
	 * @ordered
	 */
	public static final int MIT_FEH_VALUE = 208;

	/**
	 * The '<em><b>MIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MIT License
	 * <!-- end-model-doc -->
	 * @see #MIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MIT_VALUE = 209;

	/**
	 * The '<em><b>MITNFA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MIT +no-false-attribs license
	 * <!-- end-model-doc -->
	 * @see #MITNFA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MITNFA_VALUE = 210;

	/**
	 * The '<em><b>Motosoto</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Motosoto License
	 * <!-- end-model-doc -->
	 * @see #MOTOSOTO
	 * @model name="Motosoto"
	 * @generated
	 * @ordered
	 */
	public static final int MOTOSOTO_VALUE = 211;

	/**
	 * The '<em><b>Mpich2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * mpich2 License
	 * <!-- end-model-doc -->
	 * @see #MPICH2
	 * @model name="mpich2"
	 * @generated
	 * @ordered
	 */
	public static final int MPICH2_VALUE = 212;

	/**
	 * The '<em><b>MPL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mozilla Public License 1.0
	 * <!-- end-model-doc -->
	 * @see #MPL10
	 * @model literal="MPL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int MPL10_VALUE = 213;

	/**
	 * The '<em><b>MPL11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mozilla Public License 1.1
	 * <!-- end-model-doc -->
	 * @see #MPL11
	 * @model literal="MPL-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int MPL11_VALUE = 214;

	/**
	 * The '<em><b>MPL20 No Copyleft Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mozilla Public License 2.0 (no copyleft exception)
	 * <!-- end-model-doc -->
	 * @see #MPL20_NO_COPYLEFT_EXCEPTION
	 * @model name="MPL20NoCopyleftException" literal="MPL-2.0-no-copyleft-exception"
	 * @generated
	 * @ordered
	 */
	public static final int MPL20_NO_COPYLEFT_EXCEPTION_VALUE = 215;

	/**
	 * The '<em><b>MPL20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mozilla Public License 2.0
	 * <!-- end-model-doc -->
	 * @see #MPL20
	 * @model literal="MPL-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int MPL20_VALUE = 216;

	/**
	 * The '<em><b>MSPL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Microsoft Public License
	 * <!-- end-model-doc -->
	 * @see #MSPL
	 * @model literal="MS-PL"
	 * @generated
	 * @ordered
	 */
	public static final int MSPL_VALUE = 217;

	/**
	 * The '<em><b>MSRL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Microsoft Reciprocal License
	 * <!-- end-model-doc -->
	 * @see #MSRL
	 * @model literal="MS-RL"
	 * @generated
	 * @ordered
	 */
	public static final int MSRL_VALUE = 218;

	/**
	 * The '<em><b>MTLL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Matrix Template Library License
	 * <!-- end-model-doc -->
	 * @see #MTLL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MTLL_VALUE = 219;

	/**
	 * The '<em><b>Multics</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Multics License
	 * <!-- end-model-doc -->
	 * @see #MULTICS
	 * @model name="Multics"
	 * @generated
	 * @ordered
	 */
	public static final int MULTICS_VALUE = 220;

	/**
	 * The '<em><b>Mup</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mup License
	 * <!-- end-model-doc -->
	 * @see #MUP
	 * @model name="Mup"
	 * @generated
	 * @ordered
	 */
	public static final int MUP_VALUE = 221;

	/**
	 * The '<em><b>NASA13</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NASA Open Source Agreement 1.3
	 * <!-- end-model-doc -->
	 * @see #NASA13
	 * @model literal="NASA-1.3"
	 * @generated
	 * @ordered
	 */
	public static final int NASA13_VALUE = 222;

	/**
	 * The '<em><b>Naumen</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Naumen Public License
	 * <!-- end-model-doc -->
	 * @see #NAUMEN
	 * @model name="Naumen"
	 * @generated
	 * @ordered
	 */
	public static final int NAUMEN_VALUE = 223;

	/**
	 * The '<em><b>NBPL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Net Boolean Public License v1
	 * <!-- end-model-doc -->
	 * @see #NBPL10
	 * @model literal="NBPL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int NBPL10_VALUE = 224;

	/**
	 * The '<em><b>NCSA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * University of Illinois/NCSA Open Source License
	 * <!-- end-model-doc -->
	 * @see #NCSA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NCSA_VALUE = 225;

	/**
	 * The '<em><b>Net SNMP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Net-SNMP License
	 * <!-- end-model-doc -->
	 * @see #NET_SNMP
	 * @model name="NetSNMP" literal="Net-SNMP"
	 * @generated
	 * @ordered
	 */
	public static final int NET_SNMP_VALUE = 226;

	/**
	 * The '<em><b>Net CDF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NetCDF license
	 * <!-- end-model-doc -->
	 * @see #NET_CDF
	 * @model name="NetCDF"
	 * @generated
	 * @ordered
	 */
	public static final int NET_CDF_VALUE = 227;

	/**
	 * The '<em><b>Newsletr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Newsletr License
	 * <!-- end-model-doc -->
	 * @see #NEWSLETR
	 * @model name="Newsletr"
	 * @generated
	 * @ordered
	 */
	public static final int NEWSLETR_VALUE = 228;

	/**
	 * The '<em><b>NGPL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nethack General Public License
	 * <!-- end-model-doc -->
	 * @see #NGPL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NGPL_VALUE = 229;

	/**
	 * The '<em><b>NLOD10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Norwegian Licence for Open Government Data
	 * <!-- end-model-doc -->
	 * @see #NLOD10
	 * @model literal="NLOD-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int NLOD10_VALUE = 230;

	/**
	 * The '<em><b>NLPL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No Limit Public License
	 * <!-- end-model-doc -->
	 * @see #NLPL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NLPL_VALUE = 231;

	/**
	 * The '<em><b>Nokia</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nokia Open Source License
	 * <!-- end-model-doc -->
	 * @see #NOKIA
	 * @model name="Nokia"
	 * @generated
	 * @ordered
	 */
	public static final int NOKIA_VALUE = 232;

	/**
	 * The '<em><b>NOSL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Netizen Open Source License
	 * <!-- end-model-doc -->
	 * @see #NOSL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOSL_VALUE = 233;

	/**
	 * The '<em><b>Noweb</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Noweb License
	 * <!-- end-model-doc -->
	 * @see #NOWEB
	 * @model name="Noweb"
	 * @generated
	 * @ordered
	 */
	public static final int NOWEB_VALUE = 234;

	/**
	 * The '<em><b>NPL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Netscape Public License v1.0
	 * <!-- end-model-doc -->
	 * @see #NPL10
	 * @model literal="NPL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int NPL10_VALUE = 235;

	/**
	 * The '<em><b>NPL11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Netscape Public License v1.1
	 * <!-- end-model-doc -->
	 * @see #NPL11
	 * @model literal="NPL-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int NPL11_VALUE = 236;

	/**
	 * The '<em><b>NPOSL30</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Non-Profit Open Software License 3.0
	 * <!-- end-model-doc -->
	 * @see #NPOSL30
	 * @model literal="NPOSL-3.0"
	 * @generated
	 * @ordered
	 */
	public static final int NPOSL30_VALUE = 237;

	/**
	 * The '<em><b>NRL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NRL License
	 * <!-- end-model-doc -->
	 * @see #NRL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NRL_VALUE = 238;

	/**
	 * The '<em><b>NTP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NTP License
	 * <!-- end-model-doc -->
	 * @see #NTP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NTP_VALUE = 239;

	/**
	 * The '<em><b>OCCTPL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open CASCADE Technology Public License
	 * <!-- end-model-doc -->
	 * @see #OCCTPL
	 * @model literal="OCCT-PL"
	 * @generated
	 * @ordered
	 */
	public static final int OCCTPL_VALUE = 240;

	/**
	 * The '<em><b>OCLC20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OCLC Research Public License 2.0
	 * <!-- end-model-doc -->
	 * @see #OCLC20
	 * @model literal="OCLC-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int OCLC20_VALUE = 241;

	/**
	 * The '<em><b>ODb L10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ODC Open Database License v1.0
	 * <!-- end-model-doc -->
	 * @see #ODB_L10
	 * @model name="ODbL10" literal="ODbL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int ODB_L10_VALUE = 242;

	/**
	 * The '<em><b>OFL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SIL Open Font License 1.0
	 * <!-- end-model-doc -->
	 * @see #OFL10
	 * @model literal="OFL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int OFL10_VALUE = 243;

	/**
	 * The '<em><b>OFL11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SIL Open Font License 1.1
	 * <!-- end-model-doc -->
	 * @see #OFL11
	 * @model literal="OFL-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int OFL11_VALUE = 244;

	/**
	 * The '<em><b>OGTSL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Group Test Suite License
	 * <!-- end-model-doc -->
	 * @see #OGTSL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OGTSL_VALUE = 245;

	/**
	 * The '<em><b>OLDAP11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v1.1
	 * <!-- end-model-doc -->
	 * @see #OLDAP11
	 * @model literal="OLDAP-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int OLDAP11_VALUE = 246;

	/**
	 * The '<em><b>OLDAP12</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v1.2
	 * <!-- end-model-doc -->
	 * @see #OLDAP12
	 * @model literal="OLDAP-1.2"
	 * @generated
	 * @ordered
	 */
	public static final int OLDAP12_VALUE = 247;

	/**
	 * The '<em><b>OLDAP13</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v1.3
	 * <!-- end-model-doc -->
	 * @see #OLDAP13
	 * @model literal="OLDAP-1.3"
	 * @generated
	 * @ordered
	 */
	public static final int OLDAP13_VALUE = 248;

	/**
	 * The '<em><b>OLDAP14</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v1.4
	 * <!-- end-model-doc -->
	 * @see #OLDAP14
	 * @model literal="OLDAP-1.4"
	 * @generated
	 * @ordered
	 */
	public static final int OLDAP14_VALUE = 249;

	/**
	 * The '<em><b>OLDAP201</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v2.0.1
	 * <!-- end-model-doc -->
	 * @see #OLDAP201
	 * @model literal="OLDAP-2.0.1"
	 * @generated
	 * @ordered
	 */
	public static final int OLDAP201_VALUE = 250;

	/**
	 * The '<em><b>OLDAP20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v2.0 (or possibly 2.0A and 2.0B)
	 * <!-- end-model-doc -->
	 * @see #OLDAP20
	 * @model literal="OLDAP-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int OLDAP20_VALUE = 251;

	/**
	 * The '<em><b>OLDAP21</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v2.1
	 * <!-- end-model-doc -->
	 * @see #OLDAP21
	 * @model literal="OLDAP-2.1"
	 * @generated
	 * @ordered
	 */
	public static final int OLDAP21_VALUE = 252;

	/**
	 * The '<em><b>OLDAP221</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v2.2.1
	 * <!-- end-model-doc -->
	 * @see #OLDAP221
	 * @model literal="OLDAP-2.2.1"
	 * @generated
	 * @ordered
	 */
	public static final int OLDAP221_VALUE = 253;

	/**
	 * The '<em><b>OLDAP222</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License 2.2.2
	 * <!-- end-model-doc -->
	 * @see #OLDAP222
	 * @model literal="OLDAP-2.2.2"
	 * @generated
	 * @ordered
	 */
	public static final int OLDAP222_VALUE = 254;

	/**
	 * The '<em><b>OLDAP22</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v2.2
	 * <!-- end-model-doc -->
	 * @see #OLDAP22
	 * @model literal="OLDAP-2.2"
	 * @generated
	 * @ordered
	 */
	public static final int OLDAP22_VALUE = 255;

	/**
	 * The '<em><b>OLDAP23</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v2.3
	 * <!-- end-model-doc -->
	 * @see #OLDAP23
	 * @model literal="OLDAP-2.3"
	 * @generated
	 * @ordered
	 */
	public static final int OLDAP23_VALUE = 256;

	/**
	 * The '<em><b>OLDAP24</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v2.4
	 * <!-- end-model-doc -->
	 * @see #OLDAP24
	 * @model literal="OLDAP-2.4"
	 * @generated
	 * @ordered
	 */
	public static final int OLDAP24_VALUE = 257;

	/**
	 * The '<em><b>OLDAP25</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v2.5
	 * <!-- end-model-doc -->
	 * @see #OLDAP25
	 * @model literal="OLDAP-2.5"
	 * @generated
	 * @ordered
	 */
	public static final int OLDAP25_VALUE = 258;

	/**
	 * The '<em><b>OLDAP26</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v2.6
	 * <!-- end-model-doc -->
	 * @see #OLDAP26
	 * @model literal="OLDAP-2.6"
	 * @generated
	 * @ordered
	 */
	public static final int OLDAP26_VALUE = 259;

	/**
	 * The '<em><b>OLDAP27</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v2.7
	 * <!-- end-model-doc -->
	 * @see #OLDAP27
	 * @model literal="OLDAP-2.7"
	 * @generated
	 * @ordered
	 */
	public static final int OLDAP27_VALUE = 260;

	/**
	 * The '<em><b>OLDAP28</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open LDAP Public License v2.8
	 * <!-- end-model-doc -->
	 * @see #OLDAP28
	 * @model literal="OLDAP-2.8"
	 * @generated
	 * @ordered
	 */
	public static final int OLDAP28_VALUE = 261;

	/**
	 * The '<em><b>OML</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Market License
	 * <!-- end-model-doc -->
	 * @see #OML
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OML_VALUE = 262;

	/**
	 * The '<em><b>Open SSL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OpenSSL License
	 * <!-- end-model-doc -->
	 * @see #OPEN_SSL
	 * @model name="OpenSSL"
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_SSL_VALUE = 263;

	/**
	 * The '<em><b>OPL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Public License v1.0
	 * <!-- end-model-doc -->
	 * @see #OPL10
	 * @model literal="OPL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int OPL10_VALUE = 264;

	/**
	 * The '<em><b>OSETPL21</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OSET Public License version 2.1
	 * <!-- end-model-doc -->
	 * @see #OSETPL21
	 * @model literal="OSET-PL-2.1"
	 * @generated
	 * @ordered
	 */
	public static final int OSETPL21_VALUE = 265;

	/**
	 * The '<em><b>OSL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Software License 1.0
	 * <!-- end-model-doc -->
	 * @see #OSL10
	 * @model literal="OSL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int OSL10_VALUE = 266;

	/**
	 * The '<em><b>OSL11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Software License 1.1
	 * <!-- end-model-doc -->
	 * @see #OSL11
	 * @model literal="OSL-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int OSL11_VALUE = 267;

	/**
	 * The '<em><b>OSL20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Software License 2.0
	 * <!-- end-model-doc -->
	 * @see #OSL20
	 * @model literal="OSL-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int OSL20_VALUE = 268;

	/**
	 * The '<em><b>OSL21</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Software License 2.1
	 * <!-- end-model-doc -->
	 * @see #OSL21
	 * @model literal="OSL-2.1"
	 * @generated
	 * @ordered
	 */
	public static final int OSL21_VALUE = 269;

	/**
	 * The '<em><b>OSL30</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Open Software License 3.0
	 * <!-- end-model-doc -->
	 * @see #OSL30
	 * @model literal="OSL-3.0"
	 * @generated
	 * @ordered
	 */
	public static final int OSL30_VALUE = 270;

	/**
	 * The '<em><b>PDDL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ODC Public Domain Dedication & License 1.0
	 * <!-- end-model-doc -->
	 * @see #PDDL10
	 * @model literal="PDDL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int PDDL10_VALUE = 271;

	/**
	 * The '<em><b>PHP30</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PHP License v3.0
	 * <!-- end-model-doc -->
	 * @see #PHP30
	 * @model literal="PHP-3.0"
	 * @generated
	 * @ordered
	 */
	public static final int PHP30_VALUE = 272;

	/**
	 * The '<em><b>PHP301</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PHP License v3.01
	 * <!-- end-model-doc -->
	 * @see #PHP301
	 * @model literal="PHP-3.01"
	 * @generated
	 * @ordered
	 */
	public static final int PHP301_VALUE = 273;

	/**
	 * The '<em><b>Plexus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Plexus Classworlds License
	 * <!-- end-model-doc -->
	 * @see #PLEXUS
	 * @model name="Plexus"
	 * @generated
	 * @ordered
	 */
	public static final int PLEXUS_VALUE = 274;

	/**
	 * The '<em><b>Postgre SQL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PostgreSQL License
	 * <!-- end-model-doc -->
	 * @see #POSTGRE_SQL
	 * @model name="PostgreSQL"
	 * @generated
	 * @ordered
	 */
	public static final int POSTGRE_SQL_VALUE = 275;

	/**
	 * The '<em><b>Psfrag</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * psfrag License
	 * <!-- end-model-doc -->
	 * @see #PSFRAG
	 * @model name="psfrag"
	 * @generated
	 * @ordered
	 */
	public static final int PSFRAG_VALUE = 276;

	/**
	 * The '<em><b>Psutils</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * psutils License
	 * <!-- end-model-doc -->
	 * @see #PSUTILS
	 * @model name="psutils"
	 * @generated
	 * @ordered
	 */
	public static final int PSUTILS_VALUE = 277;

	/**
	 * The '<em><b>Python20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Python License 2.0
	 * <!-- end-model-doc -->
	 * @see #PYTHON20
	 * @model name="Python20" literal="Python-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int PYTHON20_VALUE = 278;

	/**
	 * The '<em><b>Qhull</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Qhull License
	 * <!-- end-model-doc -->
	 * @see #QHULL
	 * @model name="Qhull"
	 * @generated
	 * @ordered
	 */
	public static final int QHULL_VALUE = 279;

	/**
	 * The '<em><b>QPL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Q Public License 1.0
	 * <!-- end-model-doc -->
	 * @see #QPL10
	 * @model literal="QPL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int QPL10_VALUE = 280;

	/**
	 * The '<em><b>Rdisc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rdisc License
	 * <!-- end-model-doc -->
	 * @see #RDISC
	 * @model name="Rdisc"
	 * @generated
	 * @ordered
	 */
	public static final int RDISC_VALUE = 281;

	/**
	 * The '<em><b>RHe Cos11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Red Hat eCos Public License v1.1
	 * <!-- end-model-doc -->
	 * @see #RHE_COS11
	 * @model name="RHeCos11" literal="RHeCos-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int RHE_COS11_VALUE = 282;

	/**
	 * The '<em><b>RPL11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reciprocal Public License 1.1
	 * <!-- end-model-doc -->
	 * @see #RPL11
	 * @model literal="RPL-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int RPL11_VALUE = 283;

	/**
	 * The '<em><b>RPL15</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reciprocal Public License 1.5
	 * <!-- end-model-doc -->
	 * @see #RPL15
	 * @model literal="RPL-1.5"
	 * @generated
	 * @ordered
	 */
	public static final int RPL15_VALUE = 284;

	/**
	 * The '<em><b>RPSL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RealNetworks Public Source License v1.0
	 * <!-- end-model-doc -->
	 * @see #RPSL10
	 * @model literal="RPSL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int RPSL10_VALUE = 285;

	/**
	 * The '<em><b>RSAMD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RSA Message-Digest License
	 * <!-- end-model-doc -->
	 * @see #RSAMD
	 * @model literal="RSA-MD"
	 * @generated
	 * @ordered
	 */
	public static final int RSAMD_VALUE = 286;

	/**
	 * The '<em><b>RSCPL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ricoh Source Code Public License
	 * <!-- end-model-doc -->
	 * @see #RSCPL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RSCPL_VALUE = 287;

	/**
	 * The '<em><b>Ruby</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ruby License
	 * <!-- end-model-doc -->
	 * @see #RUBY
	 * @model name="Ruby"
	 * @generated
	 * @ordered
	 */
	public static final int RUBY_VALUE = 288;

	/**
	 * The '<em><b>SAXPD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sax Public Domain Notice
	 * <!-- end-model-doc -->
	 * @see #SAXPD
	 * @model literal="SAX-PD"
	 * @generated
	 * @ordered
	 */
	public static final int SAXPD_VALUE = 289;

	/**
	 * The '<em><b>Saxpath</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Saxpath License
	 * <!-- end-model-doc -->
	 * @see #SAXPATH
	 * @model name="Saxpath"
	 * @generated
	 * @ordered
	 */
	public static final int SAXPATH_VALUE = 290;

	/**
	 * The '<em><b>SCEA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SCEA Shared Source License
	 * <!-- end-model-doc -->
	 * @see #SCEA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SCEA_VALUE = 291;

	/**
	 * The '<em><b>Sendmail</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sendmail License
	 * <!-- end-model-doc -->
	 * @see #SENDMAIL
	 * @model name="Sendmail"
	 * @generated
	 * @ordered
	 */
	public static final int SENDMAIL_VALUE = 292;

	/**
	 * The '<em><b>SGIB10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SGI Free Software License B v1.0
	 * <!-- end-model-doc -->
	 * @see #SGIB10
	 * @model literal="SGI-B-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int SGIB10_VALUE = 293;

	/**
	 * The '<em><b>SGIB11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SGI Free Software License B v1.1
	 * <!-- end-model-doc -->
	 * @see #SGIB11
	 * @model literal="SGI-B-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int SGIB11_VALUE = 294;

	/**
	 * The '<em><b>SGIB20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SGI Free Software License B v2.0
	 * <!-- end-model-doc -->
	 * @see #SGIB20
	 * @model literal="SGI-B-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int SGIB20_VALUE = 295;

	/**
	 * The '<em><b>Sim PL20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Simple Public License 2.0
	 * <!-- end-model-doc -->
	 * @see #SIM_PL20
	 * @model name="SimPL20" literal="SimPL-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int SIM_PL20_VALUE = 296;

	/**
	 * The '<em><b>SISSL12</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sun Industry Standards Source License v1.2
	 * <!-- end-model-doc -->
	 * @see #SISSL12
	 * @model literal="SISSL-1.2"
	 * @generated
	 * @ordered
	 */
	public static final int SISSL12_VALUE = 297;

	/**
	 * The '<em><b>SISSL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sun Industry Standards Source License v1.1
	 * <!-- end-model-doc -->
	 * @see #SISSL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SISSL_VALUE = 298;

	/**
	 * The '<em><b>Sleepycat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sleepycat License
	 * <!-- end-model-doc -->
	 * @see #SLEEPYCAT
	 * @model name="Sleepycat"
	 * @generated
	 * @ordered
	 */
	public static final int SLEEPYCAT_VALUE = 299;

	/**
	 * The '<em><b>SMLNJ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Standard ML of New Jersey License
	 * <!-- end-model-doc -->
	 * @see #SMLNJ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SMLNJ_VALUE = 300;

	/**
	 * The '<em><b>SMPPL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Secure Messaging Protocol Public License
	 * <!-- end-model-doc -->
	 * @see #SMPPL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SMPPL_VALUE = 301;

	/**
	 * The '<em><b>SNIA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SNIA Public License 1.1
	 * <!-- end-model-doc -->
	 * @see #SNIA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SNIA_VALUE = 302;

	/**
	 * The '<em><b>Spencer86</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Spencer License 86
	 * <!-- end-model-doc -->
	 * @see #SPENCER86
	 * @model name="Spencer86" literal="Spencer-86"
	 * @generated
	 * @ordered
	 */
	public static final int SPENCER86_VALUE = 303;

	/**
	 * The '<em><b>Spencer94</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Spencer License 94
	 * <!-- end-model-doc -->
	 * @see #SPENCER94
	 * @model name="Spencer94" literal="Spencer-94"
	 * @generated
	 * @ordered
	 */
	public static final int SPENCER94_VALUE = 304;

	/**
	 * The '<em><b>Spencer99</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Spencer License 99
	 * <!-- end-model-doc -->
	 * @see #SPENCER99
	 * @model name="Spencer99" literal="Spencer-99"
	 * @generated
	 * @ordered
	 */
	public static final int SPENCER99_VALUE = 305;

	/**
	 * The '<em><b>SPL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sun Public License v1.0
	 * <!-- end-model-doc -->
	 * @see #SPL10
	 * @model literal="SPL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int SPL10_VALUE = 306;

	/**
	 * The '<em><b>Sugar CRM113</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SugarCRM Public License v1.1.3
	 * <!-- end-model-doc -->
	 * @see #SUGAR_CRM113
	 * @model name="SugarCRM113" literal="SugarCRM-1.1.3"
	 * @generated
	 * @ordered
	 */
	public static final int SUGAR_CRM113_VALUE = 307;

	/**
	 * The '<em><b>SWL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Scheme Widget Library (SWL) Software License Agreement
	 * <!-- end-model-doc -->
	 * @see #SWL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SWL_VALUE = 308;

	/**
	 * The '<em><b>TCL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TCL/TK License
	 * <!-- end-model-doc -->
	 * @see #TCL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TCL_VALUE = 309;

	/**
	 * The '<em><b>TCP Wrappers</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TCP Wrappers License
	 * <!-- end-model-doc -->
	 * @see #TCP_WRAPPERS
	 * @model name="TCPWrappers" literal="TCP-wrappers"
	 * @generated
	 * @ordered
	 */
	public static final int TCP_WRAPPERS_VALUE = 310;

	/**
	 * The '<em><b>TMate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TMate Open Source License
	 * <!-- end-model-doc -->
	 * @see #TMATE
	 * @model name="TMate"
	 * @generated
	 * @ordered
	 */
	public static final int TMATE_VALUE = 311;

	/**
	 * The '<em><b>TORQUE11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TORQUE v2.5+ Software License v1.1
	 * <!-- end-model-doc -->
	 * @see #TORQUE11
	 * @model literal="TORQUE-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int TORQUE11_VALUE = 312;

	/**
	 * The '<em><b>TOSL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Trusster Open Source License
	 * <!-- end-model-doc -->
	 * @see #TOSL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TOSL_VALUE = 313;

	/**
	 * The '<em><b>Unicode DFS2015</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unicode License Agreement - Data Files and Software (2015)
	 * <!-- end-model-doc -->
	 * @see #UNICODE_DFS2015
	 * @model name="UnicodeDFS2015" literal="Unicode-DFS-2015"
	 * @generated
	 * @ordered
	 */
	public static final int UNICODE_DFS2015_VALUE = 314;

	/**
	 * The '<em><b>Unicode DFS2016</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unicode License Agreement - Data Files and Software (2016)
	 * <!-- end-model-doc -->
	 * @see #UNICODE_DFS2016
	 * @model name="UnicodeDFS2016" literal="Unicode-DFS-2016"
	 * @generated
	 * @ordered
	 */
	public static final int UNICODE_DFS2016_VALUE = 315;

	/**
	 * The '<em><b>Unicode TOU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unicode Terms of Use
	 * <!-- end-model-doc -->
	 * @see #UNICODE_TOU
	 * @model name="UnicodeTOU" literal="Unicode-TOU"
	 * @generated
	 * @ordered
	 */
	public static final int UNICODE_TOU_VALUE = 316;

	/**
	 * The '<em><b>Unlicense</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Unlicense
	 * <!-- end-model-doc -->
	 * @see #UNLICENSE
	 * @model name="Unlicense"
	 * @generated
	 * @ordered
	 */
	public static final int UNLICENSE_VALUE = 317;

	/**
	 * The '<em><b>UPL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Universal Permissive License v1.0
	 * <!-- end-model-doc -->
	 * @see #UPL10
	 * @model literal="UPL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int UPL10_VALUE = 318;

	/**
	 * The '<em><b>Vim</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vim License
	 * <!-- end-model-doc -->
	 * @see #VIM
	 * @model name="Vim"
	 * @generated
	 * @ordered
	 */
	public static final int VIM_VALUE = 319;

	/**
	 * The '<em><b>VOSTROM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * VOSTROM Public License for Open Source
	 * <!-- end-model-doc -->
	 * @see #VOSTROM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VOSTROM_VALUE = 320;

	/**
	 * The '<em><b>VSL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vovida Software License v1.0
	 * <!-- end-model-doc -->
	 * @see #VSL10
	 * @model literal="VSL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int VSL10_VALUE = 321;

	/**
	 * The '<em><b>W3C19980720</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * W3C Software Notice and License (1998-07-20)
	 * <!-- end-model-doc -->
	 * @see #W3C19980720
	 * @model literal="W3C-19980720"
	 * @generated
	 * @ordered
	 */
	public static final int W3C19980720_VALUE = 322;

	/**
	 * The '<em><b>W3C20150513</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * W3C Software Notice and Document License (2015-05-13)
	 * <!-- end-model-doc -->
	 * @see #W3C20150513
	 * @model literal="W3C-20150513"
	 * @generated
	 * @ordered
	 */
	public static final int W3C20150513_VALUE = 323;

	/**
	 * The '<em><b>W3C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * W3C Software Notice and License (2002-12-31)
	 * <!-- end-model-doc -->
	 * @see #W3C
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int W3C_VALUE = 324;

	/**
	 * The '<em><b>Watcom10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sybase Open Watcom Public License 1.0
	 * <!-- end-model-doc -->
	 * @see #WATCOM10
	 * @model name="Watcom10" literal="Watcom-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int WATCOM10_VALUE = 325;

	/**
	 * The '<em><b>Wsuipa</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wsuipa License
	 * <!-- end-model-doc -->
	 * @see #WSUIPA
	 * @model name="Wsuipa"
	 * @generated
	 * @ordered
	 */
	public static final int WSUIPA_VALUE = 326;

	/**
	 * The '<em><b>WTFPL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Do What The F*ck You Want To Public License
	 * <!-- end-model-doc -->
	 * @see #WTFPL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WTFPL_VALUE = 327;

	/**
	 * The '<em><b>X11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * X11 License
	 * <!-- end-model-doc -->
	 * @see #X11
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int X11_VALUE = 328;

	/**
	 * The '<em><b>Xerox</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Xerox License
	 * <!-- end-model-doc -->
	 * @see #XEROX
	 * @model name="Xerox"
	 * @generated
	 * @ordered
	 */
	public static final int XEROX_VALUE = 329;

	/**
	 * The '<em><b>XFree8611</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * XFree86 License 1.1
	 * <!-- end-model-doc -->
	 * @see #XFREE8611
	 * @model name="XFree8611" literal="XFree86-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int XFREE8611_VALUE = 330;

	/**
	 * The '<em><b>Xinetd</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * xinetd License
	 * <!-- end-model-doc -->
	 * @see #XINETD
	 * @model name="xinetd"
	 * @generated
	 * @ordered
	 */
	public static final int XINETD_VALUE = 331;

	/**
	 * The '<em><b>Xnet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * X.Net License
	 * <!-- end-model-doc -->
	 * @see #XNET
	 * @model name="Xnet"
	 * @generated
	 * @ordered
	 */
	public static final int XNET_VALUE = 332;

	/**
	 * The '<em><b>Xpp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * XPP License
	 * <!-- end-model-doc -->
	 * @see #XPP
	 * @model name="xpp"
	 * @generated
	 * @ordered
	 */
	public static final int XPP_VALUE = 333;

	/**
	 * The '<em><b>XSkat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * XSkat License
	 * <!-- end-model-doc -->
	 * @see #XSKAT
	 * @model name="XSkat"
	 * @generated
	 * @ordered
	 */
	public static final int XSKAT_VALUE = 334;

	/**
	 * The '<em><b>YPL10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Yahoo! Public License v1.0
	 * <!-- end-model-doc -->
	 * @see #YPL10
	 * @model literal="YPL-1.0"
	 * @generated
	 * @ordered
	 */
	public static final int YPL10_VALUE = 335;

	/**
	 * The '<em><b>YPL11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Yahoo! Public License v1.1
	 * <!-- end-model-doc -->
	 * @see #YPL11
	 * @model literal="YPL-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int YPL11_VALUE = 336;

	/**
	 * The '<em><b>Zed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zed License
	 * <!-- end-model-doc -->
	 * @see #ZED
	 * @model name="Zed"
	 * @generated
	 * @ordered
	 */
	public static final int ZED_VALUE = 337;

	/**
	 * The '<em><b>Zend20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zend License v2.0
	 * <!-- end-model-doc -->
	 * @see #ZEND20
	 * @model name="Zend20" literal="Zend-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int ZEND20_VALUE = 338;

	/**
	 * The '<em><b>Zimbra13</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zimbra Public License v1.3
	 * <!-- end-model-doc -->
	 * @see #ZIMBRA13
	 * @model name="Zimbra13" literal="Zimbra-1.3"
	 * @generated
	 * @ordered
	 */
	public static final int ZIMBRA13_VALUE = 339;

	/**
	 * The '<em><b>Zimbra14</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zimbra Public License v1.4
	 * <!-- end-model-doc -->
	 * @see #ZIMBRA14
	 * @model name="Zimbra14" literal="Zimbra-1.4"
	 * @generated
	 * @ordered
	 */
	public static final int ZIMBRA14_VALUE = 340;

	/**
	 * The '<em><b>Zlib Acknowledgement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * zlib/libpng License with Acknowledgement
	 * <!-- end-model-doc -->
	 * @see #ZLIB_ACKNOWLEDGEMENT
	 * @model name="zlibAcknowledgement" literal="zlib-acknowledgement"
	 * @generated
	 * @ordered
	 */
	public static final int ZLIB_ACKNOWLEDGEMENT_VALUE = 341;

	/**
	 * The '<em><b>Zlib</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * zlib License
	 * <!-- end-model-doc -->
	 * @see #ZLIB
	 * @model name="Zlib"
	 * @generated
	 * @ordered
	 */
	public static final int ZLIB_VALUE = 342;

	/**
	 * The '<em><b>ZPL11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zope Public License 1.1
	 * <!-- end-model-doc -->
	 * @see #ZPL11
	 * @model literal="ZPL-1.1"
	 * @generated
	 * @ordered
	 */
	public static final int ZPL11_VALUE = 343;

	/**
	 * The '<em><b>ZPL20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zope Public License 2.0
	 * <!-- end-model-doc -->
	 * @see #ZPL20
	 * @model literal="ZPL-2.0"
	 * @generated
	 * @ordered
	 */
	public static final int ZPL20_VALUE = 344;

	/**
	 * The '<em><b>ZPL21</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zope Public License 2.1
	 * <!-- end-model-doc -->
	 * @see #ZPL21
	 * @model literal="ZPL-2.1"
	 * @generated
	 * @ordered
	 */
	public static final int ZPL21_VALUE = 345;

	/**
	 * An array of all the '<em><b>SPDX License List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SPDXLicenseList[] VALUES_ARRAY =
		new SPDXLicenseList[] {
			NOT_OPEN_SOURCE,
			_0BSD,
			AAL,
			ABSTYLES,
			ADOBE2006,
			ADOBE_GLYPH,
			ADSL,
			AFL11,
			AFL12,
			AFL20,
			AFL21,
			AFL30,
			AFMPARSE,
			AGPL10_ONLY,
			AGPL10_OR_LATER,
			AGPL30_ONLY,
			AGPL30_OR_LATER,
			ALADDIN,
			AMDPLPA,
			AML,
			AMPAS,
			ANTLRPD,
			APACHE10,
			APACHE11,
			APACHE20,
			APAFML,
			APL10,
			APSL10,
			APSL11,
			APSL12,
			APSL20,
			ARTISTIC10_CL8,
			ARTISTIC10_PERL,
			ARTISTIC10,
			ARTISTIC20,
			BAHYPH,
			BARR,
			BEERWARE,
			BIT_TORRENT10,
			BIT_TORRENT11,
			BORCEUX,
			BSD1_CLAUSE,
			BSD2_CLAUSE_FREE_BSD,
			BSD2_CLAUSE_NET_BSD,
			BSD2_CLAUSE_PATENT,
			BSD2_CLAUSE,
			BSD3_CLAUSE_ATTRIBUTION,
			BSD3_CLAUSE_CLEAR,
			BSD3_CLAUSE_LBNL,
			BSD3_CLAUSE_NO_NUCLEAR_LICENSE2014,
			BSD3_CLAUSE_NO_NUCLEAR_LICENSE,
			BSD3_CLAUSE_NO_NUCLEAR_WARRANTY,
			BSD3_CLAUSE,
			BSD4_CLAUSE_UC,
			BSD4_CLAUSE,
			BSD_PROTECTION,
			BSD_SOURCE_CODE,
			BSL10,
			BZIP2105,
			BZIP2106,
			CALDERA,
			CATOSL11,
			CCBY10,
			CCBY20,
			CCBY25,
			CCBY30,
			CCBY40,
			CCBYNC10,
			CCBYNC20,
			CCBYNC25,
			CCBYNC30,
			CCBYNC40,
			CCBYNCND10,
			CCBYNCND20,
			CCBYNCND25,
			CCBYNCND30,
			CCBYNCND40,
			CCBYNCSA10,
			CCBYNCSA20,
			CCBYNCSA25,
			CCBYNCSA30,
			CCBYNCSA40,
			CCBYND10,
			CCBYND20,
			CCBYND25,
			CCBYND30,
			CCBYND40,
			CCBYSA10,
			CCBYSA20,
			CCBYSA25,
			CCBYSA30,
			CCBYSA40,
			CC010,
			CDDL10,
			CDDL11,
			CDLA_PERMISSIVE10,
			CDLA_SHARING10,
			CECILL10,
			CECILL11,
			CECILL20,
			CECILL21,
			CECILLB,
			CECILLC,
			CL_ARTISTIC,
			CNRI_JYTHON,
			CNRI_PYTHON_GPL_COMPATIBLE,
			CNRI_PYTHON,
			CONDOR11,
			CPAL10,
			CPL10,
			CPOL102,
			CROSSWORD,
			CRYSTAL_STACKER,
			CUAOPL10,
			CUBE,
			CURL,
			DFSL10,
			DIFFMARK,
			DOC,
			DOTSEQN,
			DSDP,
			DVIPDFM,
			ECL10,
			ECL20,
			EFL10,
			EFL20,
			EGENIX,
			ENTESSA,
			EPL10,
			EPL20,
			ERL_PL11,
			EU_DATAGRID,
			EUPL10,
			EUPL11,
			EUPL12,
			EUROSYM,
			FAIR,
			FRAMEWORX10,
			FREE_IMAGE,
			FSFAP,
			FSFUL,
			FSFULLR,
			FTL,
			GFDL11_ONLY,
			GFDL11_OR_LATER,
			GFDL12_ONLY,
			GFDL12_OR_LATER,
			GFDL13_ONLY,
			GFDL13_OR_LATER,
			GIFTWARE,
			GL2PS,
			GLIDE,
			GLULXE,
			GNUPLOT,
			GPL10_ONLY,
			GPL10_OR_LATER,
			GPL20_ONLY,
			GPL20_OR_LATER,
			GPL30_ONLY,
			GPL30_OR_LATER,
			GSOAP1_3B,
			HASKELL_REPORT,
			HPND,
			IBM_PIBS,
			ICU,
			IJG,
			IMAGE_MAGICK,
			IMATIX,
			IMLIB2,
			INFO_ZIP,
			INTEL_ACPI,
			INTEL,
			INTERBASE10,
			IPA,
			IPL10,
			ISC,
			JAS_PER20,
			JSON,
			LAL12,
			LAL13,
			LATEX2E,
			LEPTONICA,
			LGPL20_ONLY,
			LGPL20_OR_LATER,
			LGPL21_ONLY,
			LGPL21_OR_LATER,
			LGPL30_ONLY,
			LGPL30_OR_LATER,
			LGPLLR,
			LIBPNG,
			LIBTIFF,
			LI_LI_QP11,
			LI_LI_QR11,
			LI_LI_QRPLUS11,
			LINUX_OPEN_IB,
			LPL10,
			LPL102,
			LPPL10,
			LPPL11,
			LPPL12,
			LPPL1_3A,
			LPPL1_3C,
			MAKE_INDEX,
			MIR_OS,
			MIT0,
			MIT_ADVERTISING,
			MITCMU,
			MIT_ENNA,
			MIT_FEH,
			MIT,
			MITNFA,
			MOTOSOTO,
			MPICH2,
			MPL10,
			MPL11,
			MPL20_NO_COPYLEFT_EXCEPTION,
			MPL20,
			MSPL,
			MSRL,
			MTLL,
			MULTICS,
			MUP,
			NASA13,
			NAUMEN,
			NBPL10,
			NCSA,
			NET_SNMP,
			NET_CDF,
			NEWSLETR,
			NGPL,
			NLOD10,
			NLPL,
			NOKIA,
			NOSL,
			NOWEB,
			NPL10,
			NPL11,
			NPOSL30,
			NRL,
			NTP,
			OCCTPL,
			OCLC20,
			ODB_L10,
			OFL10,
			OFL11,
			OGTSL,
			OLDAP11,
			OLDAP12,
			OLDAP13,
			OLDAP14,
			OLDAP201,
			OLDAP20,
			OLDAP21,
			OLDAP221,
			OLDAP222,
			OLDAP22,
			OLDAP23,
			OLDAP24,
			OLDAP25,
			OLDAP26,
			OLDAP27,
			OLDAP28,
			OML,
			OPEN_SSL,
			OPL10,
			OSETPL21,
			OSL10,
			OSL11,
			OSL20,
			OSL21,
			OSL30,
			PDDL10,
			PHP30,
			PHP301,
			PLEXUS,
			POSTGRE_SQL,
			PSFRAG,
			PSUTILS,
			PYTHON20,
			QHULL,
			QPL10,
			RDISC,
			RHE_COS11,
			RPL11,
			RPL15,
			RPSL10,
			RSAMD,
			RSCPL,
			RUBY,
			SAXPD,
			SAXPATH,
			SCEA,
			SENDMAIL,
			SGIB10,
			SGIB11,
			SGIB20,
			SIM_PL20,
			SISSL12,
			SISSL,
			SLEEPYCAT,
			SMLNJ,
			SMPPL,
			SNIA,
			SPENCER86,
			SPENCER94,
			SPENCER99,
			SPL10,
			SUGAR_CRM113,
			SWL,
			TCL,
			TCP_WRAPPERS,
			TMATE,
			TORQUE11,
			TOSL,
			UNICODE_DFS2015,
			UNICODE_DFS2016,
			UNICODE_TOU,
			UNLICENSE,
			UPL10,
			VIM,
			VOSTROM,
			VSL10,
			W3C19980720,
			W3C20150513,
			W3C,
			WATCOM10,
			WSUIPA,
			WTFPL,
			X11,
			XEROX,
			XFREE8611,
			XINETD,
			XNET,
			XPP,
			XSKAT,
			YPL10,
			YPL11,
			ZED,
			ZEND20,
			ZIMBRA13,
			ZIMBRA14,
			ZLIB_ACKNOWLEDGEMENT,
			ZLIB,
			ZPL11,
			ZPL20,
			ZPL21,
		};

	/**
	 * A public read-only list of all the '<em><b>SPDX License List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SPDXLicenseList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>SPDX License List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SPDXLicenseList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SPDXLicenseList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SPDX License List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SPDXLicenseList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SPDXLicenseList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SPDX License List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SPDXLicenseList get(int value) {
		switch (value) {
			case NOT_OPEN_SOURCE_VALUE: return NOT_OPEN_SOURCE;
			case _0BSD_VALUE: return _0BSD;
			case AAL_VALUE: return AAL;
			case ABSTYLES_VALUE: return ABSTYLES;
			case ADOBE2006_VALUE: return ADOBE2006;
			case ADOBE_GLYPH_VALUE: return ADOBE_GLYPH;
			case ADSL_VALUE: return ADSL;
			case AFL11_VALUE: return AFL11;
			case AFL12_VALUE: return AFL12;
			case AFL20_VALUE: return AFL20;
			case AFL21_VALUE: return AFL21;
			case AFL30_VALUE: return AFL30;
			case AFMPARSE_VALUE: return AFMPARSE;
			case AGPL10_ONLY_VALUE: return AGPL10_ONLY;
			case AGPL10_OR_LATER_VALUE: return AGPL10_OR_LATER;
			case AGPL30_ONLY_VALUE: return AGPL30_ONLY;
			case AGPL30_OR_LATER_VALUE: return AGPL30_OR_LATER;
			case ALADDIN_VALUE: return ALADDIN;
			case AMDPLPA_VALUE: return AMDPLPA;
			case AML_VALUE: return AML;
			case AMPAS_VALUE: return AMPAS;
			case ANTLRPD_VALUE: return ANTLRPD;
			case APACHE10_VALUE: return APACHE10;
			case APACHE11_VALUE: return APACHE11;
			case APACHE20_VALUE: return APACHE20;
			case APAFML_VALUE: return APAFML;
			case APL10_VALUE: return APL10;
			case APSL10_VALUE: return APSL10;
			case APSL11_VALUE: return APSL11;
			case APSL12_VALUE: return APSL12;
			case APSL20_VALUE: return APSL20;
			case ARTISTIC10_CL8_VALUE: return ARTISTIC10_CL8;
			case ARTISTIC10_PERL_VALUE: return ARTISTIC10_PERL;
			case ARTISTIC10_VALUE: return ARTISTIC10;
			case ARTISTIC20_VALUE: return ARTISTIC20;
			case BAHYPH_VALUE: return BAHYPH;
			case BARR_VALUE: return BARR;
			case BEERWARE_VALUE: return BEERWARE;
			case BIT_TORRENT10_VALUE: return BIT_TORRENT10;
			case BIT_TORRENT11_VALUE: return BIT_TORRENT11;
			case BORCEUX_VALUE: return BORCEUX;
			case BSD1_CLAUSE_VALUE: return BSD1_CLAUSE;
			case BSD2_CLAUSE_FREE_BSD_VALUE: return BSD2_CLAUSE_FREE_BSD;
			case BSD2_CLAUSE_NET_BSD_VALUE: return BSD2_CLAUSE_NET_BSD;
			case BSD2_CLAUSE_PATENT_VALUE: return BSD2_CLAUSE_PATENT;
			case BSD2_CLAUSE_VALUE: return BSD2_CLAUSE;
			case BSD3_CLAUSE_ATTRIBUTION_VALUE: return BSD3_CLAUSE_ATTRIBUTION;
			case BSD3_CLAUSE_CLEAR_VALUE: return BSD3_CLAUSE_CLEAR;
			case BSD3_CLAUSE_LBNL_VALUE: return BSD3_CLAUSE_LBNL;
			case BSD3_CLAUSE_NO_NUCLEAR_LICENSE2014_VALUE: return BSD3_CLAUSE_NO_NUCLEAR_LICENSE2014;
			case BSD3_CLAUSE_NO_NUCLEAR_LICENSE_VALUE: return BSD3_CLAUSE_NO_NUCLEAR_LICENSE;
			case BSD3_CLAUSE_NO_NUCLEAR_WARRANTY_VALUE: return BSD3_CLAUSE_NO_NUCLEAR_WARRANTY;
			case BSD3_CLAUSE_VALUE: return BSD3_CLAUSE;
			case BSD4_CLAUSE_UC_VALUE: return BSD4_CLAUSE_UC;
			case BSD4_CLAUSE_VALUE: return BSD4_CLAUSE;
			case BSD_PROTECTION_VALUE: return BSD_PROTECTION;
			case BSD_SOURCE_CODE_VALUE: return BSD_SOURCE_CODE;
			case BSL10_VALUE: return BSL10;
			case BZIP2105_VALUE: return BZIP2105;
			case BZIP2106_VALUE: return BZIP2106;
			case CALDERA_VALUE: return CALDERA;
			case CATOSL11_VALUE: return CATOSL11;
			case CCBY10_VALUE: return CCBY10;
			case CCBY20_VALUE: return CCBY20;
			case CCBY25_VALUE: return CCBY25;
			case CCBY30_VALUE: return CCBY30;
			case CCBY40_VALUE: return CCBY40;
			case CCBYNC10_VALUE: return CCBYNC10;
			case CCBYNC20_VALUE: return CCBYNC20;
			case CCBYNC25_VALUE: return CCBYNC25;
			case CCBYNC30_VALUE: return CCBYNC30;
			case CCBYNC40_VALUE: return CCBYNC40;
			case CCBYNCND10_VALUE: return CCBYNCND10;
			case CCBYNCND20_VALUE: return CCBYNCND20;
			case CCBYNCND25_VALUE: return CCBYNCND25;
			case CCBYNCND30_VALUE: return CCBYNCND30;
			case CCBYNCND40_VALUE: return CCBYNCND40;
			case CCBYNCSA10_VALUE: return CCBYNCSA10;
			case CCBYNCSA20_VALUE: return CCBYNCSA20;
			case CCBYNCSA25_VALUE: return CCBYNCSA25;
			case CCBYNCSA30_VALUE: return CCBYNCSA30;
			case CCBYNCSA40_VALUE: return CCBYNCSA40;
			case CCBYND10_VALUE: return CCBYND10;
			case CCBYND20_VALUE: return CCBYND20;
			case CCBYND25_VALUE: return CCBYND25;
			case CCBYND30_VALUE: return CCBYND30;
			case CCBYND40_VALUE: return CCBYND40;
			case CCBYSA10_VALUE: return CCBYSA10;
			case CCBYSA20_VALUE: return CCBYSA20;
			case CCBYSA25_VALUE: return CCBYSA25;
			case CCBYSA30_VALUE: return CCBYSA30;
			case CCBYSA40_VALUE: return CCBYSA40;
			case CC010_VALUE: return CC010;
			case CDDL10_VALUE: return CDDL10;
			case CDDL11_VALUE: return CDDL11;
			case CDLA_PERMISSIVE10_VALUE: return CDLA_PERMISSIVE10;
			case CDLA_SHARING10_VALUE: return CDLA_SHARING10;
			case CECILL10_VALUE: return CECILL10;
			case CECILL11_VALUE: return CECILL11;
			case CECILL20_VALUE: return CECILL20;
			case CECILL21_VALUE: return CECILL21;
			case CECILLB_VALUE: return CECILLB;
			case CECILLC_VALUE: return CECILLC;
			case CL_ARTISTIC_VALUE: return CL_ARTISTIC;
			case CNRI_JYTHON_VALUE: return CNRI_JYTHON;
			case CNRI_PYTHON_GPL_COMPATIBLE_VALUE: return CNRI_PYTHON_GPL_COMPATIBLE;
			case CNRI_PYTHON_VALUE: return CNRI_PYTHON;
			case CONDOR11_VALUE: return CONDOR11;
			case CPAL10_VALUE: return CPAL10;
			case CPL10_VALUE: return CPL10;
			case CPOL102_VALUE: return CPOL102;
			case CROSSWORD_VALUE: return CROSSWORD;
			case CRYSTAL_STACKER_VALUE: return CRYSTAL_STACKER;
			case CUAOPL10_VALUE: return CUAOPL10;
			case CUBE_VALUE: return CUBE;
			case CURL_VALUE: return CURL;
			case DFSL10_VALUE: return DFSL10;
			case DIFFMARK_VALUE: return DIFFMARK;
			case DOC_VALUE: return DOC;
			case DOTSEQN_VALUE: return DOTSEQN;
			case DSDP_VALUE: return DSDP;
			case DVIPDFM_VALUE: return DVIPDFM;
			case ECL10_VALUE: return ECL10;
			case ECL20_VALUE: return ECL20;
			case EFL10_VALUE: return EFL10;
			case EFL20_VALUE: return EFL20;
			case EGENIX_VALUE: return EGENIX;
			case ENTESSA_VALUE: return ENTESSA;
			case EPL10_VALUE: return EPL10;
			case EPL20_VALUE: return EPL20;
			case ERL_PL11_VALUE: return ERL_PL11;
			case EU_DATAGRID_VALUE: return EU_DATAGRID;
			case EUPL10_VALUE: return EUPL10;
			case EUPL11_VALUE: return EUPL11;
			case EUPL12_VALUE: return EUPL12;
			case EUROSYM_VALUE: return EUROSYM;
			case FAIR_VALUE: return FAIR;
			case FRAMEWORX10_VALUE: return FRAMEWORX10;
			case FREE_IMAGE_VALUE: return FREE_IMAGE;
			case FSFAP_VALUE: return FSFAP;
			case FSFUL_VALUE: return FSFUL;
			case FSFULLR_VALUE: return FSFULLR;
			case FTL_VALUE: return FTL;
			case GFDL11_ONLY_VALUE: return GFDL11_ONLY;
			case GFDL11_OR_LATER_VALUE: return GFDL11_OR_LATER;
			case GFDL12_ONLY_VALUE: return GFDL12_ONLY;
			case GFDL12_OR_LATER_VALUE: return GFDL12_OR_LATER;
			case GFDL13_ONLY_VALUE: return GFDL13_ONLY;
			case GFDL13_OR_LATER_VALUE: return GFDL13_OR_LATER;
			case GIFTWARE_VALUE: return GIFTWARE;
			case GL2PS_VALUE: return GL2PS;
			case GLIDE_VALUE: return GLIDE;
			case GLULXE_VALUE: return GLULXE;
			case GNUPLOT_VALUE: return GNUPLOT;
			case GPL10_ONLY_VALUE: return GPL10_ONLY;
			case GPL10_OR_LATER_VALUE: return GPL10_OR_LATER;
			case GPL20_ONLY_VALUE: return GPL20_ONLY;
			case GPL20_OR_LATER_VALUE: return GPL20_OR_LATER;
			case GPL30_ONLY_VALUE: return GPL30_ONLY;
			case GPL30_OR_LATER_VALUE: return GPL30_OR_LATER;
			case GSOAP1_3B_VALUE: return GSOAP1_3B;
			case HASKELL_REPORT_VALUE: return HASKELL_REPORT;
			case HPND_VALUE: return HPND;
			case IBM_PIBS_VALUE: return IBM_PIBS;
			case ICU_VALUE: return ICU;
			case IJG_VALUE: return IJG;
			case IMAGE_MAGICK_VALUE: return IMAGE_MAGICK;
			case IMATIX_VALUE: return IMATIX;
			case IMLIB2_VALUE: return IMLIB2;
			case INFO_ZIP_VALUE: return INFO_ZIP;
			case INTEL_ACPI_VALUE: return INTEL_ACPI;
			case INTEL_VALUE: return INTEL;
			case INTERBASE10_VALUE: return INTERBASE10;
			case IPA_VALUE: return IPA;
			case IPL10_VALUE: return IPL10;
			case ISC_VALUE: return ISC;
			case JAS_PER20_VALUE: return JAS_PER20;
			case JSON_VALUE: return JSON;
			case LAL12_VALUE: return LAL12;
			case LAL13_VALUE: return LAL13;
			case LATEX2E_VALUE: return LATEX2E;
			case LEPTONICA_VALUE: return LEPTONICA;
			case LGPL20_ONLY_VALUE: return LGPL20_ONLY;
			case LGPL20_OR_LATER_VALUE: return LGPL20_OR_LATER;
			case LGPL21_ONLY_VALUE: return LGPL21_ONLY;
			case LGPL21_OR_LATER_VALUE: return LGPL21_OR_LATER;
			case LGPL30_ONLY_VALUE: return LGPL30_ONLY;
			case LGPL30_OR_LATER_VALUE: return LGPL30_OR_LATER;
			case LGPLLR_VALUE: return LGPLLR;
			case LIBPNG_VALUE: return LIBPNG;
			case LIBTIFF_VALUE: return LIBTIFF;
			case LI_LI_QP11_VALUE: return LI_LI_QP11;
			case LI_LI_QR11_VALUE: return LI_LI_QR11;
			case LI_LI_QRPLUS11_VALUE: return LI_LI_QRPLUS11;
			case LINUX_OPEN_IB_VALUE: return LINUX_OPEN_IB;
			case LPL10_VALUE: return LPL10;
			case LPL102_VALUE: return LPL102;
			case LPPL10_VALUE: return LPPL10;
			case LPPL11_VALUE: return LPPL11;
			case LPPL12_VALUE: return LPPL12;
			case LPPL1_3A_VALUE: return LPPL1_3A;
			case LPPL1_3C_VALUE: return LPPL1_3C;
			case MAKE_INDEX_VALUE: return MAKE_INDEX;
			case MIR_OS_VALUE: return MIR_OS;
			case MIT0_VALUE: return MIT0;
			case MIT_ADVERTISING_VALUE: return MIT_ADVERTISING;
			case MITCMU_VALUE: return MITCMU;
			case MIT_ENNA_VALUE: return MIT_ENNA;
			case MIT_FEH_VALUE: return MIT_FEH;
			case MIT_VALUE: return MIT;
			case MITNFA_VALUE: return MITNFA;
			case MOTOSOTO_VALUE: return MOTOSOTO;
			case MPICH2_VALUE: return MPICH2;
			case MPL10_VALUE: return MPL10;
			case MPL11_VALUE: return MPL11;
			case MPL20_NO_COPYLEFT_EXCEPTION_VALUE: return MPL20_NO_COPYLEFT_EXCEPTION;
			case MPL20_VALUE: return MPL20;
			case MSPL_VALUE: return MSPL;
			case MSRL_VALUE: return MSRL;
			case MTLL_VALUE: return MTLL;
			case MULTICS_VALUE: return MULTICS;
			case MUP_VALUE: return MUP;
			case NASA13_VALUE: return NASA13;
			case NAUMEN_VALUE: return NAUMEN;
			case NBPL10_VALUE: return NBPL10;
			case NCSA_VALUE: return NCSA;
			case NET_SNMP_VALUE: return NET_SNMP;
			case NET_CDF_VALUE: return NET_CDF;
			case NEWSLETR_VALUE: return NEWSLETR;
			case NGPL_VALUE: return NGPL;
			case NLOD10_VALUE: return NLOD10;
			case NLPL_VALUE: return NLPL;
			case NOKIA_VALUE: return NOKIA;
			case NOSL_VALUE: return NOSL;
			case NOWEB_VALUE: return NOWEB;
			case NPL10_VALUE: return NPL10;
			case NPL11_VALUE: return NPL11;
			case NPOSL30_VALUE: return NPOSL30;
			case NRL_VALUE: return NRL;
			case NTP_VALUE: return NTP;
			case OCCTPL_VALUE: return OCCTPL;
			case OCLC20_VALUE: return OCLC20;
			case ODB_L10_VALUE: return ODB_L10;
			case OFL10_VALUE: return OFL10;
			case OFL11_VALUE: return OFL11;
			case OGTSL_VALUE: return OGTSL;
			case OLDAP11_VALUE: return OLDAP11;
			case OLDAP12_VALUE: return OLDAP12;
			case OLDAP13_VALUE: return OLDAP13;
			case OLDAP14_VALUE: return OLDAP14;
			case OLDAP201_VALUE: return OLDAP201;
			case OLDAP20_VALUE: return OLDAP20;
			case OLDAP21_VALUE: return OLDAP21;
			case OLDAP221_VALUE: return OLDAP221;
			case OLDAP222_VALUE: return OLDAP222;
			case OLDAP22_VALUE: return OLDAP22;
			case OLDAP23_VALUE: return OLDAP23;
			case OLDAP24_VALUE: return OLDAP24;
			case OLDAP25_VALUE: return OLDAP25;
			case OLDAP26_VALUE: return OLDAP26;
			case OLDAP27_VALUE: return OLDAP27;
			case OLDAP28_VALUE: return OLDAP28;
			case OML_VALUE: return OML;
			case OPEN_SSL_VALUE: return OPEN_SSL;
			case OPL10_VALUE: return OPL10;
			case OSETPL21_VALUE: return OSETPL21;
			case OSL10_VALUE: return OSL10;
			case OSL11_VALUE: return OSL11;
			case OSL20_VALUE: return OSL20;
			case OSL21_VALUE: return OSL21;
			case OSL30_VALUE: return OSL30;
			case PDDL10_VALUE: return PDDL10;
			case PHP30_VALUE: return PHP30;
			case PHP301_VALUE: return PHP301;
			case PLEXUS_VALUE: return PLEXUS;
			case POSTGRE_SQL_VALUE: return POSTGRE_SQL;
			case PSFRAG_VALUE: return PSFRAG;
			case PSUTILS_VALUE: return PSUTILS;
			case PYTHON20_VALUE: return PYTHON20;
			case QHULL_VALUE: return QHULL;
			case QPL10_VALUE: return QPL10;
			case RDISC_VALUE: return RDISC;
			case RHE_COS11_VALUE: return RHE_COS11;
			case RPL11_VALUE: return RPL11;
			case RPL15_VALUE: return RPL15;
			case RPSL10_VALUE: return RPSL10;
			case RSAMD_VALUE: return RSAMD;
			case RSCPL_VALUE: return RSCPL;
			case RUBY_VALUE: return RUBY;
			case SAXPD_VALUE: return SAXPD;
			case SAXPATH_VALUE: return SAXPATH;
			case SCEA_VALUE: return SCEA;
			case SENDMAIL_VALUE: return SENDMAIL;
			case SGIB10_VALUE: return SGIB10;
			case SGIB11_VALUE: return SGIB11;
			case SGIB20_VALUE: return SGIB20;
			case SIM_PL20_VALUE: return SIM_PL20;
			case SISSL12_VALUE: return SISSL12;
			case SISSL_VALUE: return SISSL;
			case SLEEPYCAT_VALUE: return SLEEPYCAT;
			case SMLNJ_VALUE: return SMLNJ;
			case SMPPL_VALUE: return SMPPL;
			case SNIA_VALUE: return SNIA;
			case SPENCER86_VALUE: return SPENCER86;
			case SPENCER94_VALUE: return SPENCER94;
			case SPENCER99_VALUE: return SPENCER99;
			case SPL10_VALUE: return SPL10;
			case SUGAR_CRM113_VALUE: return SUGAR_CRM113;
			case SWL_VALUE: return SWL;
			case TCL_VALUE: return TCL;
			case TCP_WRAPPERS_VALUE: return TCP_WRAPPERS;
			case TMATE_VALUE: return TMATE;
			case TORQUE11_VALUE: return TORQUE11;
			case TOSL_VALUE: return TOSL;
			case UNICODE_DFS2015_VALUE: return UNICODE_DFS2015;
			case UNICODE_DFS2016_VALUE: return UNICODE_DFS2016;
			case UNICODE_TOU_VALUE: return UNICODE_TOU;
			case UNLICENSE_VALUE: return UNLICENSE;
			case UPL10_VALUE: return UPL10;
			case VIM_VALUE: return VIM;
			case VOSTROM_VALUE: return VOSTROM;
			case VSL10_VALUE: return VSL10;
			case W3C19980720_VALUE: return W3C19980720;
			case W3C20150513_VALUE: return W3C20150513;
			case W3C_VALUE: return W3C;
			case WATCOM10_VALUE: return WATCOM10;
			case WSUIPA_VALUE: return WSUIPA;
			case WTFPL_VALUE: return WTFPL;
			case X11_VALUE: return X11;
			case XEROX_VALUE: return XEROX;
			case XFREE8611_VALUE: return XFREE8611;
			case XINETD_VALUE: return XINETD;
			case XNET_VALUE: return XNET;
			case XPP_VALUE: return XPP;
			case XSKAT_VALUE: return XSKAT;
			case YPL10_VALUE: return YPL10;
			case YPL11_VALUE: return YPL11;
			case ZED_VALUE: return ZED;
			case ZEND20_VALUE: return ZEND20;
			case ZIMBRA13_VALUE: return ZIMBRA13;
			case ZIMBRA14_VALUE: return ZIMBRA14;
			case ZLIB_ACKNOWLEDGEMENT_VALUE: return ZLIB_ACKNOWLEDGEMENT;
			case ZLIB_VALUE: return ZLIB;
			case ZPL11_VALUE: return ZPL11;
			case ZPL20_VALUE: return ZPL20;
			case ZPL21_VALUE: return ZPL21;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SPDXLicenseList(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //SPDXLicenseList
