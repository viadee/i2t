/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.ASSOCIATEDSOURCEINSTANCEType;
import Powrmart.ATTRIBUTEType;
import Powrmart.CONFIGREFERENCEType;
import Powrmart.CONFIGType;
import Powrmart.CONNECTIONREFERENCEType;
import Powrmart.CONNECTORType;
import Powrmart.CONWFRUNINFOType;
import Powrmart.CUSTOMType;
import Powrmart.DAILYFREQUENCYType;
import Powrmart.DocumentRoot;
import Powrmart.ENDOPTIONSType;
import Powrmart.ERPINFOType;
import Powrmart.ERPSRCINFOType;
import Powrmart.EXPRMACRODEPENDENCYType;
import Powrmart.EXPRMACROType;
import Powrmart.FIELDATTRIBUTEType;
import Powrmart.FIELDDEPENDENCYType;
import Powrmart.FILTERType;
import Powrmart.FLATFILEType;
import Powrmart.FOLDERType;
import Powrmart.FOLDERVERSIONType;
import Powrmart.GROUPType;
import Powrmart.HASHKEYType;
import Powrmart.INITPROPType;
import Powrmart.INSTANCEType;
import Powrmart.KEYRANGEType;
import Powrmart.KEYWORDType;
import Powrmart.MACROARGUMENTType;
import Powrmart.MACRODEPENDENCYType;
import Powrmart.MAPDEPENDENCYType;
import Powrmart.MAPPINGType;
import Powrmart.MAPPINGVARIABLEType;
import Powrmart.MAPPLETType;
import Powrmart.METADATAEXTENSIONType;
import Powrmart.PARTITIONType;
import Powrmart.POWERMARTType;
import Powrmart.PowrmartPackage;
import Powrmart.RECURRINGType;
import Powrmart.REPEATType;
import Powrmart.REPOSITORYType;
import Powrmart.RESOURCEREFERENCEType;
import Powrmart.SAPCODEBLOCKType;
import Powrmart.SAPFUNCINSTANCEPARAMFLDType;
import Powrmart.SAPFUNCINSTANCEPARAMType;
import Powrmart.SAPFUNCPARAMType;
import Powrmart.SAPFUNCTIONINSTANCEType;
import Powrmart.SAPFUNCTIONType;
import Powrmart.SAPOUTPUTPORTType;
import Powrmart.SAPPROGRAMFLOWOBJECTType;
import Powrmart.SAPPROGRAMType;
import Powrmart.SAPSTRUCTUREFIELDType;
import Powrmart.SAPSTRUCTUREType;
import Powrmart.SAPTABLEINSTANCEPARAMType;
import Powrmart.SAPTABLEPARAMType;
import Powrmart.SAPVARIABLEType;
import Powrmart.SCHEDULEINFOType;
import Powrmart.SCHEDULEOPTIONSType;
import Powrmart.SCHEDULERType;
import Powrmart.SEBLJOINType;
import Powrmart.SEBLLINKType;
import Powrmart.SEBLMVLINKRELType;
import Powrmart.SEBLMVLINKType;
import Powrmart.SEBLSRCINFOType;
import Powrmart.SESSIONCOMPONENTType;
import Powrmart.SESSIONEXTENSIONType;
import Powrmart.SESSIONType;
import Powrmart.SESSTRANSFORMATIONGROUPType;
import Powrmart.SESSTRANSFORMATIONINSTType;
import Powrmart.SHORTCUTType;
import Powrmart.SOURCEFIELDType;
import Powrmart.SOURCEType;
import Powrmart.STARTOPTIONSType;
import Powrmart.TABLEATTRIBUTEType;
import Powrmart.TARGETFIELDType;
import Powrmart.TARGETINDEXFIELDType;
import Powrmart.TARGETINDEXType;
import Powrmart.TARGETLOADORDERType;
import Powrmart.TARGETType;
import Powrmart.TASKINSTANCEType;
import Powrmart.TASKType;
import Powrmart.TIMERType;
import Powrmart.TRANSFORMATIONType;
import Powrmart.TRANSFORMFIELDATTRDEFType;
import Powrmart.TRANSFORMFIELDATTRType;
import Powrmart.TRANSFORMFIELDType;
import Powrmart.TRANSFORMRESOURCEREFType;
import Powrmart.VALUEPAIRType;
import Powrmart.WORKFLOWEVENTType;
import Powrmart.WORKFLOWLINKType;
import Powrmart.WORKFLOWType;
import Powrmart.WORKFLOWVARIABLEType;
import Powrmart.WORKLETType;
import Powrmart.XMLINFOType;
import Powrmart.XMLTEXTType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getASSOCIATEDSOURCEINSTANCE <em>ASSOCIATEDSOURCEINSTANCE</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getATTRIBUTE <em>ATTRIBUTE</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getCONFIG <em>CONFIG</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getCONFIGREFERENCE <em>CONFIGREFERENCE</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getCONNECTIONREFERENCE <em>CONNECTIONREFERENCE</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getCONNECTOR <em>CONNECTOR</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getCONWFRUNINFO <em>CONWFRUNINFO</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getCUSTOM <em>CUSTOM</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getDAILYFREQUENCY <em>DAILYFREQUENCY</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getENDOPTIONS <em>ENDOPTIONS</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getERPINFO <em>ERPINFO</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getERPSRCINFO <em>ERPSRCINFO</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getEXPRMACRO <em>EXPRMACRO</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getEXPRMACRODEPENDENCY <em>EXPRMACRODEPENDENCY</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getFIELDATTRIBUTE <em>FIELDATTRIBUTE</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getFIELDDEPENDENCY <em>FIELDDEPENDENCY</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getFILTER <em>FILTER</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getFLATFILE <em>FLATFILE</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getFOLDER <em>FOLDER</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getFOLDERVERSION <em>FOLDERVERSION</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getGROUP <em>GROUP</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getHASHKEY <em>HASHKEY</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getINITPROP <em>INITPROP</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getINSTANCE <em>INSTANCE</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getKEYRANGE <em>KEYRANGE</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getKEYWORD <em>KEYWORD</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getMACROARGUMENT <em>MACROARGUMENT</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getMACRODEPENDENCY <em>MACRODEPENDENCY</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getMAPDEPENDENCY <em>MAPDEPENDENCY</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getMAPPING <em>MAPPING</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getMAPPINGVARIABLE <em>MAPPINGVARIABLE</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getMAPPLET <em>MAPPLET</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getMETADATAEXTENSION <em>METADATAEXTENSION</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getPARTITION <em>PARTITION</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getPOWERMART <em>POWERMART</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getRECURRING <em>RECURRING</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getREPEAT <em>REPEAT</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getREPOSITORY <em>REPOSITORY</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getRESOURCEREFERENCE <em>RESOURCEREFERENCE</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getSAPCODEBLOCK <em>SAPCODEBLOCK</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getSAPFUNCINSTANCEPARAM <em>SAPFUNCINSTANCEPARAM</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getSAPFUNCINSTANCEPARAMFLD <em>SAPFUNCINSTANCEPARAMFLD</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getSAPFUNCPARAM <em>SAPFUNCPARAM</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getSAPFUNCTION <em>SAPFUNCTION</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getSAPFUNCTIONINSTANCE <em>SAPFUNCTIONINSTANCE</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getSAPOUTPUTPORT <em>SAPOUTPUTPORT</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getSAPPROGRAM <em>SAPPROGRAM</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getSAPPROGRAMFLOWOBJECT <em>SAPPROGRAMFLOWOBJECT</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getSAPSTRUCTURE <em>SAPSTRUCTURE</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getSAPSTRUCTUREFIELD <em>SAPSTRUCTUREFIELD</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getSAPTABLEINSTANCEPARAM <em>SAPTABLEINSTANCEPARAM</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getSAPTABLEPARAM <em>SAPTABLEPARAM</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getSAPVARIABLE <em>SAPVARIABLE</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getSCHEDULEINFO <em>SCHEDULEINFO</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getSCHEDULEOPTIONS <em>SCHEDULEOPTIONS</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getSCHEDULER <em>SCHEDULER</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getSEBLJOIN <em>SEBLJOIN</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getSEBLLINK <em>SEBLLINK</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getSEBLMVLINK <em>SEBLMVLINK</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getSEBLMVLINKREL <em>SEBLMVLINKREL</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getSEBLSRCINFO <em>SEBLSRCINFO</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getSESSION <em>SESSION</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getSESSIONCOMPONENT <em>SESSIONCOMPONENT</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getSESSIONEXTENSION <em>SESSIONEXTENSION</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getSESSTRANSFORMATIONGROUP <em>SESSTRANSFORMATIONGROUP</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getSESSTRANSFORMATIONINST <em>SESSTRANSFORMATIONINST</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getSHORTCUT <em>SHORTCUT</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getSOURCE <em>SOURCE</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getSOURCEFIELD <em>SOURCEFIELD</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getSTARTOPTIONS <em>STARTOPTIONS</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getTABLEATTRIBUTE <em>TABLEATTRIBUTE</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getTARGET <em>TARGET</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getTARGETFIELD <em>TARGETFIELD</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getTARGETINDEX <em>TARGETINDEX</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getTARGETINDEXFIELD <em>TARGETINDEXFIELD</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getTARGETLOADORDER <em>TARGETLOADORDER</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getTASK <em>TASK</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getTASKINSTANCE <em>TASKINSTANCE</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getTIMER <em>TIMER</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getTRANSFORMATION <em>TRANSFORMATION</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getTRANSFORMFIELD <em>TRANSFORMFIELD</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getTRANSFORMFIELDATTR <em>TRANSFORMFIELDATTR</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getTRANSFORMFIELDATTRDEF <em>TRANSFORMFIELDATTRDEF</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getTRANSFORMRESOURCEREF <em>TRANSFORMRESOURCEREF</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getVALUEPAIR <em>VALUEPAIR</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getWORKFLOW <em>WORKFLOW</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getWORKFLOWEVENT <em>WORKFLOWEVENT</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getWORKFLOWLINK <em>WORKFLOWLINK</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getWORKFLOWVARIABLE <em>WORKFLOWVARIABLE</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getWORKLET <em>WORKLET</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getXMLINFO <em>XMLINFO</em>}</li>
 *   <li>{@link Powrmart.impl.DocumentRootImpl#getXMLTEXT <em>XMLTEXT</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
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
     * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXMLNSPrefixMap()
     * @generated
     * @ordered
     */
    protected EMap<String, String> xMLNSPrefixMap;

    /**
     * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXSISchemaLocation()
     * @generated
     * @ordered
     */
    protected EMap<String, String> xSISchemaLocation;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DocumentRootImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getDocumentRoot();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getMixed() {
        if (mixed == null) {
            mixed = new BasicFeatureMap(this, PowrmartPackage.DOCUMENT_ROOT__MIXED);
        }
        return mixed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EMap<String, String> getXMLNSPrefixMap() {
        if (xMLNSPrefixMap == null) {
            xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, PowrmartPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
        }
        return xMLNSPrefixMap;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EMap<String, String> getXSISchemaLocation() {
        if (xSISchemaLocation == null) {
            xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, PowrmartPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        }
        return xSISchemaLocation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ASSOCIATEDSOURCEINSTANCEType getASSOCIATEDSOURCEINSTANCE() {
        return (ASSOCIATEDSOURCEINSTANCEType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_ASSOCIATEDSOURCEINSTANCE(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetASSOCIATEDSOURCEINSTANCE(ASSOCIATEDSOURCEINSTANCEType newASSOCIATEDSOURCEINSTANCE, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_ASSOCIATEDSOURCEINSTANCE(), newASSOCIATEDSOURCEINSTANCE, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setASSOCIATEDSOURCEINSTANCE(ASSOCIATEDSOURCEINSTANCEType newASSOCIATEDSOURCEINSTANCE) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_ASSOCIATEDSOURCEINSTANCE(), newASSOCIATEDSOURCEINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ATTRIBUTEType getATTRIBUTE() {
        return (ATTRIBUTEType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_ATTRIBUTE(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetATTRIBUTE(ATTRIBUTEType newATTRIBUTE, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_ATTRIBUTE(), newATTRIBUTE, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setATTRIBUTE(ATTRIBUTEType newATTRIBUTE) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_ATTRIBUTE(), newATTRIBUTE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CONFIGType getCONFIG() {
        return (CONFIGType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_CONFIG(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCONFIG(CONFIGType newCONFIG, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_CONFIG(), newCONFIG, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCONFIG(CONFIGType newCONFIG) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_CONFIG(), newCONFIG);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CONFIGREFERENCEType getCONFIGREFERENCE() {
        return (CONFIGREFERENCEType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_CONFIGREFERENCE(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCONFIGREFERENCE(CONFIGREFERENCEType newCONFIGREFERENCE, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_CONFIGREFERENCE(), newCONFIGREFERENCE, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCONFIGREFERENCE(CONFIGREFERENCEType newCONFIGREFERENCE) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_CONFIGREFERENCE(), newCONFIGREFERENCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CONNECTIONREFERENCEType getCONNECTIONREFERENCE() {
        return (CONNECTIONREFERENCEType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_CONNECTIONREFERENCE(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCONNECTIONREFERENCE(CONNECTIONREFERENCEType newCONNECTIONREFERENCE, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_CONNECTIONREFERENCE(), newCONNECTIONREFERENCE, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCONNECTIONREFERENCE(CONNECTIONREFERENCEType newCONNECTIONREFERENCE) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_CONNECTIONREFERENCE(), newCONNECTIONREFERENCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CONNECTORType getCONNECTOR() {
        return (CONNECTORType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_CONNECTOR(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCONNECTOR(CONNECTORType newCONNECTOR, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_CONNECTOR(), newCONNECTOR, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCONNECTOR(CONNECTORType newCONNECTOR) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_CONNECTOR(), newCONNECTOR);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CONWFRUNINFOType getCONWFRUNINFO() {
        return (CONWFRUNINFOType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_CONWFRUNINFO(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCONWFRUNINFO(CONWFRUNINFOType newCONWFRUNINFO, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_CONWFRUNINFO(), newCONWFRUNINFO, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCONWFRUNINFO(CONWFRUNINFOType newCONWFRUNINFO) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_CONWFRUNINFO(), newCONWFRUNINFO);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CUSTOMType getCUSTOM() {
        return (CUSTOMType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_CUSTOM(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCUSTOM(CUSTOMType newCUSTOM, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_CUSTOM(), newCUSTOM, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCUSTOM(CUSTOMType newCUSTOM) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_CUSTOM(), newCUSTOM);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DAILYFREQUENCYType getDAILYFREQUENCY() {
        return (DAILYFREQUENCYType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_DAILYFREQUENCY(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDAILYFREQUENCY(DAILYFREQUENCYType newDAILYFREQUENCY, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_DAILYFREQUENCY(), newDAILYFREQUENCY, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDAILYFREQUENCY(DAILYFREQUENCYType newDAILYFREQUENCY) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_DAILYFREQUENCY(), newDAILYFREQUENCY);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ENDOPTIONSType getENDOPTIONS() {
        return (ENDOPTIONSType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_ENDOPTIONS(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetENDOPTIONS(ENDOPTIONSType newENDOPTIONS, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_ENDOPTIONS(), newENDOPTIONS, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setENDOPTIONS(ENDOPTIONSType newENDOPTIONS) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_ENDOPTIONS(), newENDOPTIONS);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ERPINFOType getERPINFO() {
        return (ERPINFOType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_ERPINFO(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetERPINFO(ERPINFOType newERPINFO, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_ERPINFO(), newERPINFO, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setERPINFO(ERPINFOType newERPINFO) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_ERPINFO(), newERPINFO);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ERPSRCINFOType getERPSRCINFO() {
        return (ERPSRCINFOType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_ERPSRCINFO(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetERPSRCINFO(ERPSRCINFOType newERPSRCINFO, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_ERPSRCINFO(), newERPSRCINFO, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setERPSRCINFO(ERPSRCINFOType newERPSRCINFO) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_ERPSRCINFO(), newERPSRCINFO);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EXPRMACROType getEXPRMACRO() {
        return (EXPRMACROType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_EXPRMACRO(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEXPRMACRO(EXPRMACROType newEXPRMACRO, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_EXPRMACRO(), newEXPRMACRO, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEXPRMACRO(EXPRMACROType newEXPRMACRO) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_EXPRMACRO(), newEXPRMACRO);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EXPRMACRODEPENDENCYType getEXPRMACRODEPENDENCY() {
        return (EXPRMACRODEPENDENCYType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_EXPRMACRODEPENDENCY(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEXPRMACRODEPENDENCY(EXPRMACRODEPENDENCYType newEXPRMACRODEPENDENCY, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_EXPRMACRODEPENDENCY(), newEXPRMACRODEPENDENCY, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEXPRMACRODEPENDENCY(EXPRMACRODEPENDENCYType newEXPRMACRODEPENDENCY) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_EXPRMACRODEPENDENCY(), newEXPRMACRODEPENDENCY);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FIELDATTRIBUTEType getFIELDATTRIBUTE() {
        return (FIELDATTRIBUTEType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_FIELDATTRIBUTE(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFIELDATTRIBUTE(FIELDATTRIBUTEType newFIELDATTRIBUTE, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_FIELDATTRIBUTE(), newFIELDATTRIBUTE, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFIELDATTRIBUTE(FIELDATTRIBUTEType newFIELDATTRIBUTE) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_FIELDATTRIBUTE(), newFIELDATTRIBUTE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FIELDDEPENDENCYType getFIELDDEPENDENCY() {
        return (FIELDDEPENDENCYType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_FIELDDEPENDENCY(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFIELDDEPENDENCY(FIELDDEPENDENCYType newFIELDDEPENDENCY, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_FIELDDEPENDENCY(), newFIELDDEPENDENCY, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFIELDDEPENDENCY(FIELDDEPENDENCYType newFIELDDEPENDENCY) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_FIELDDEPENDENCY(), newFIELDDEPENDENCY);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FILTERType getFILTER() {
        return (FILTERType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_FILTER(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFILTER(FILTERType newFILTER, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_FILTER(), newFILTER, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFILTER(FILTERType newFILTER) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_FILTER(), newFILTER);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FLATFILEType getFLATFILE() {
        return (FLATFILEType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_FLATFILE(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFLATFILE(FLATFILEType newFLATFILE, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_FLATFILE(), newFLATFILE, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFLATFILE(FLATFILEType newFLATFILE) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_FLATFILE(), newFLATFILE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FOLDERType getFOLDER() {
        return (FOLDERType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_FOLDER(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFOLDER(FOLDERType newFOLDER, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_FOLDER(), newFOLDER, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFOLDER(FOLDERType newFOLDER) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_FOLDER(), newFOLDER);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FOLDERVERSIONType getFOLDERVERSION() {
        return (FOLDERVERSIONType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_FOLDERVERSION(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFOLDERVERSION(FOLDERVERSIONType newFOLDERVERSION, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_FOLDERVERSION(), newFOLDERVERSION, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFOLDERVERSION(FOLDERVERSIONType newFOLDERVERSION) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_FOLDERVERSION(), newFOLDERVERSION);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GROUPType getGROUP() {
        return (GROUPType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_GROUP(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetGROUP(GROUPType newGROUP, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_GROUP(), newGROUP, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGROUP(GROUPType newGROUP) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_GROUP(), newGROUP);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HASHKEYType getHASHKEY() {
        return (HASHKEYType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_HASHKEY(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetHASHKEY(HASHKEYType newHASHKEY, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_HASHKEY(), newHASHKEY, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHASHKEY(HASHKEYType newHASHKEY) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_HASHKEY(), newHASHKEY);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public INITPROPType getINITPROP() {
        return (INITPROPType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_INITPROP(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetINITPROP(INITPROPType newINITPROP, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_INITPROP(), newINITPROP, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setINITPROP(INITPROPType newINITPROP) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_INITPROP(), newINITPROP);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public INSTANCEType getINSTANCE() {
        return (INSTANCEType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_INSTANCE(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetINSTANCE(INSTANCEType newINSTANCE, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_INSTANCE(), newINSTANCE, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setINSTANCE(INSTANCEType newINSTANCE) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_INSTANCE(), newINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KEYRANGEType getKEYRANGE() {
        return (KEYRANGEType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_KEYRANGE(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetKEYRANGE(KEYRANGEType newKEYRANGE, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_KEYRANGE(), newKEYRANGE, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setKEYRANGE(KEYRANGEType newKEYRANGE) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_KEYRANGE(), newKEYRANGE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KEYWORDType getKEYWORD() {
        return (KEYWORDType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_KEYWORD(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetKEYWORD(KEYWORDType newKEYWORD, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_KEYWORD(), newKEYWORD, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setKEYWORD(KEYWORDType newKEYWORD) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_KEYWORD(), newKEYWORD);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MACROARGUMENTType getMACROARGUMENT() {
        return (MACROARGUMENTType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_MACROARGUMENT(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMACROARGUMENT(MACROARGUMENTType newMACROARGUMENT, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_MACROARGUMENT(), newMACROARGUMENT, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMACROARGUMENT(MACROARGUMENTType newMACROARGUMENT) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_MACROARGUMENT(), newMACROARGUMENT);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MACRODEPENDENCYType getMACRODEPENDENCY() {
        return (MACRODEPENDENCYType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_MACRODEPENDENCY(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMACRODEPENDENCY(MACRODEPENDENCYType newMACRODEPENDENCY, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_MACRODEPENDENCY(), newMACRODEPENDENCY, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMACRODEPENDENCY(MACRODEPENDENCYType newMACRODEPENDENCY) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_MACRODEPENDENCY(), newMACRODEPENDENCY);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MAPDEPENDENCYType getMAPDEPENDENCY() {
        return (MAPDEPENDENCYType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_MAPDEPENDENCY(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMAPDEPENDENCY(MAPDEPENDENCYType newMAPDEPENDENCY, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_MAPDEPENDENCY(), newMAPDEPENDENCY, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMAPDEPENDENCY(MAPDEPENDENCYType newMAPDEPENDENCY) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_MAPDEPENDENCY(), newMAPDEPENDENCY);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MAPPINGType getMAPPING() {
        return (MAPPINGType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_MAPPING(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMAPPING(MAPPINGType newMAPPING, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_MAPPING(), newMAPPING, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMAPPING(MAPPINGType newMAPPING) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_MAPPING(), newMAPPING);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MAPPINGVARIABLEType getMAPPINGVARIABLE() {
        return (MAPPINGVARIABLEType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_MAPPINGVARIABLE(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMAPPINGVARIABLE(MAPPINGVARIABLEType newMAPPINGVARIABLE, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_MAPPINGVARIABLE(), newMAPPINGVARIABLE, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMAPPINGVARIABLE(MAPPINGVARIABLEType newMAPPINGVARIABLE) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_MAPPINGVARIABLE(), newMAPPINGVARIABLE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MAPPLETType getMAPPLET() {
        return (MAPPLETType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_MAPPLET(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMAPPLET(MAPPLETType newMAPPLET, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_MAPPLET(), newMAPPLET, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMAPPLET(MAPPLETType newMAPPLET) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_MAPPLET(), newMAPPLET);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public METADATAEXTENSIONType getMETADATAEXTENSION() {
        return (METADATAEXTENSIONType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_METADATAEXTENSION(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMETADATAEXTENSION(METADATAEXTENSIONType newMETADATAEXTENSION, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_METADATAEXTENSION(), newMETADATAEXTENSION, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMETADATAEXTENSION(METADATAEXTENSIONType newMETADATAEXTENSION) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_METADATAEXTENSION(), newMETADATAEXTENSION);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PARTITIONType getPARTITION() {
        return (PARTITIONType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_PARTITION(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPARTITION(PARTITIONType newPARTITION, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_PARTITION(), newPARTITION, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPARTITION(PARTITIONType newPARTITION) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_PARTITION(), newPARTITION);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public POWERMARTType getPOWERMART() {
        return (POWERMARTType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_POWERMART(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPOWERMART(POWERMARTType newPOWERMART, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_POWERMART(), newPOWERMART, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPOWERMART(POWERMARTType newPOWERMART) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_POWERMART(), newPOWERMART);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RECURRINGType getRECURRING() {
        return (RECURRINGType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_RECURRING(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRECURRING(RECURRINGType newRECURRING, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_RECURRING(), newRECURRING, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRECURRING(RECURRINGType newRECURRING) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_RECURRING(), newRECURRING);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public REPEATType getREPEAT() {
        return (REPEATType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_REPEAT(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetREPEAT(REPEATType newREPEAT, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_REPEAT(), newREPEAT, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setREPEAT(REPEATType newREPEAT) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_REPEAT(), newREPEAT);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public REPOSITORYType getREPOSITORY() {
        return (REPOSITORYType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_REPOSITORY(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetREPOSITORY(REPOSITORYType newREPOSITORY, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_REPOSITORY(), newREPOSITORY, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setREPOSITORY(REPOSITORYType newREPOSITORY) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_REPOSITORY(), newREPOSITORY);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RESOURCEREFERENCEType getRESOURCEREFERENCE() {
        return (RESOURCEREFERENCEType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_RESOURCEREFERENCE(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRESOURCEREFERENCE(RESOURCEREFERENCEType newRESOURCEREFERENCE, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_RESOURCEREFERENCE(), newRESOURCEREFERENCE, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRESOURCEREFERENCE(RESOURCEREFERENCEType newRESOURCEREFERENCE) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_RESOURCEREFERENCE(), newRESOURCEREFERENCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SAPCODEBLOCKType getSAPCODEBLOCK() {
        return (SAPCODEBLOCKType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_SAPCODEBLOCK(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSAPCODEBLOCK(SAPCODEBLOCKType newSAPCODEBLOCK, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_SAPCODEBLOCK(), newSAPCODEBLOCK, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSAPCODEBLOCK(SAPCODEBLOCKType newSAPCODEBLOCK) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_SAPCODEBLOCK(), newSAPCODEBLOCK);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SAPFUNCINSTANCEPARAMType getSAPFUNCINSTANCEPARAM() {
        return (SAPFUNCINSTANCEPARAMType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_SAPFUNCINSTANCEPARAM(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSAPFUNCINSTANCEPARAM(SAPFUNCINSTANCEPARAMType newSAPFUNCINSTANCEPARAM, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_SAPFUNCINSTANCEPARAM(), newSAPFUNCINSTANCEPARAM, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSAPFUNCINSTANCEPARAM(SAPFUNCINSTANCEPARAMType newSAPFUNCINSTANCEPARAM) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_SAPFUNCINSTANCEPARAM(), newSAPFUNCINSTANCEPARAM);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SAPFUNCINSTANCEPARAMFLDType getSAPFUNCINSTANCEPARAMFLD() {
        return (SAPFUNCINSTANCEPARAMFLDType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_SAPFUNCINSTANCEPARAMFLD(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSAPFUNCINSTANCEPARAMFLD(SAPFUNCINSTANCEPARAMFLDType newSAPFUNCINSTANCEPARAMFLD, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_SAPFUNCINSTANCEPARAMFLD(), newSAPFUNCINSTANCEPARAMFLD, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSAPFUNCINSTANCEPARAMFLD(SAPFUNCINSTANCEPARAMFLDType newSAPFUNCINSTANCEPARAMFLD) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_SAPFUNCINSTANCEPARAMFLD(), newSAPFUNCINSTANCEPARAMFLD);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SAPFUNCPARAMType getSAPFUNCPARAM() {
        return (SAPFUNCPARAMType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_SAPFUNCPARAM(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSAPFUNCPARAM(SAPFUNCPARAMType newSAPFUNCPARAM, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_SAPFUNCPARAM(), newSAPFUNCPARAM, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSAPFUNCPARAM(SAPFUNCPARAMType newSAPFUNCPARAM) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_SAPFUNCPARAM(), newSAPFUNCPARAM);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SAPFUNCTIONType getSAPFUNCTION() {
        return (SAPFUNCTIONType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_SAPFUNCTION(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSAPFUNCTION(SAPFUNCTIONType newSAPFUNCTION, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_SAPFUNCTION(), newSAPFUNCTION, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSAPFUNCTION(SAPFUNCTIONType newSAPFUNCTION) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_SAPFUNCTION(), newSAPFUNCTION);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SAPFUNCTIONINSTANCEType getSAPFUNCTIONINSTANCE() {
        return (SAPFUNCTIONINSTANCEType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_SAPFUNCTIONINSTANCE(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSAPFUNCTIONINSTANCE(SAPFUNCTIONINSTANCEType newSAPFUNCTIONINSTANCE, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_SAPFUNCTIONINSTANCE(), newSAPFUNCTIONINSTANCE, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSAPFUNCTIONINSTANCE(SAPFUNCTIONINSTANCEType newSAPFUNCTIONINSTANCE) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_SAPFUNCTIONINSTANCE(), newSAPFUNCTIONINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SAPOUTPUTPORTType getSAPOUTPUTPORT() {
        return (SAPOUTPUTPORTType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_SAPOUTPUTPORT(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSAPOUTPUTPORT(SAPOUTPUTPORTType newSAPOUTPUTPORT, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_SAPOUTPUTPORT(), newSAPOUTPUTPORT, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSAPOUTPUTPORT(SAPOUTPUTPORTType newSAPOUTPUTPORT) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_SAPOUTPUTPORT(), newSAPOUTPUTPORT);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SAPPROGRAMType getSAPPROGRAM() {
        return (SAPPROGRAMType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_SAPPROGRAM(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSAPPROGRAM(SAPPROGRAMType newSAPPROGRAM, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_SAPPROGRAM(), newSAPPROGRAM, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSAPPROGRAM(SAPPROGRAMType newSAPPROGRAM) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_SAPPROGRAM(), newSAPPROGRAM);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SAPPROGRAMFLOWOBJECTType getSAPPROGRAMFLOWOBJECT() {
        return (SAPPROGRAMFLOWOBJECTType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_SAPPROGRAMFLOWOBJECT(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSAPPROGRAMFLOWOBJECT(SAPPROGRAMFLOWOBJECTType newSAPPROGRAMFLOWOBJECT, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_SAPPROGRAMFLOWOBJECT(), newSAPPROGRAMFLOWOBJECT, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSAPPROGRAMFLOWOBJECT(SAPPROGRAMFLOWOBJECTType newSAPPROGRAMFLOWOBJECT) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_SAPPROGRAMFLOWOBJECT(), newSAPPROGRAMFLOWOBJECT);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SAPSTRUCTUREType getSAPSTRUCTURE() {
        return (SAPSTRUCTUREType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_SAPSTRUCTURE(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSAPSTRUCTURE(SAPSTRUCTUREType newSAPSTRUCTURE, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_SAPSTRUCTURE(), newSAPSTRUCTURE, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSAPSTRUCTURE(SAPSTRUCTUREType newSAPSTRUCTURE) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_SAPSTRUCTURE(), newSAPSTRUCTURE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SAPSTRUCTUREFIELDType getSAPSTRUCTUREFIELD() {
        return (SAPSTRUCTUREFIELDType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_SAPSTRUCTUREFIELD(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSAPSTRUCTUREFIELD(SAPSTRUCTUREFIELDType newSAPSTRUCTUREFIELD, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_SAPSTRUCTUREFIELD(), newSAPSTRUCTUREFIELD, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSAPSTRUCTUREFIELD(SAPSTRUCTUREFIELDType newSAPSTRUCTUREFIELD) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_SAPSTRUCTUREFIELD(), newSAPSTRUCTUREFIELD);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SAPTABLEINSTANCEPARAMType getSAPTABLEINSTANCEPARAM() {
        return (SAPTABLEINSTANCEPARAMType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_SAPTABLEINSTANCEPARAM(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSAPTABLEINSTANCEPARAM(SAPTABLEINSTANCEPARAMType newSAPTABLEINSTANCEPARAM, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_SAPTABLEINSTANCEPARAM(), newSAPTABLEINSTANCEPARAM, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSAPTABLEINSTANCEPARAM(SAPTABLEINSTANCEPARAMType newSAPTABLEINSTANCEPARAM) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_SAPTABLEINSTANCEPARAM(), newSAPTABLEINSTANCEPARAM);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SAPTABLEPARAMType getSAPTABLEPARAM() {
        return (SAPTABLEPARAMType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_SAPTABLEPARAM(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSAPTABLEPARAM(SAPTABLEPARAMType newSAPTABLEPARAM, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_SAPTABLEPARAM(), newSAPTABLEPARAM, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSAPTABLEPARAM(SAPTABLEPARAMType newSAPTABLEPARAM) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_SAPTABLEPARAM(), newSAPTABLEPARAM);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SAPVARIABLEType getSAPVARIABLE() {
        return (SAPVARIABLEType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_SAPVARIABLE(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSAPVARIABLE(SAPVARIABLEType newSAPVARIABLE, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_SAPVARIABLE(), newSAPVARIABLE, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSAPVARIABLE(SAPVARIABLEType newSAPVARIABLE) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_SAPVARIABLE(), newSAPVARIABLE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SCHEDULEINFOType getSCHEDULEINFO() {
        return (SCHEDULEINFOType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_SCHEDULEINFO(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSCHEDULEINFO(SCHEDULEINFOType newSCHEDULEINFO, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_SCHEDULEINFO(), newSCHEDULEINFO, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSCHEDULEINFO(SCHEDULEINFOType newSCHEDULEINFO) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_SCHEDULEINFO(), newSCHEDULEINFO);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SCHEDULEOPTIONSType getSCHEDULEOPTIONS() {
        return (SCHEDULEOPTIONSType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_SCHEDULEOPTIONS(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSCHEDULEOPTIONS(SCHEDULEOPTIONSType newSCHEDULEOPTIONS, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_SCHEDULEOPTIONS(), newSCHEDULEOPTIONS, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSCHEDULEOPTIONS(SCHEDULEOPTIONSType newSCHEDULEOPTIONS) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_SCHEDULEOPTIONS(), newSCHEDULEOPTIONS);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SCHEDULERType getSCHEDULER() {
        return (SCHEDULERType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_SCHEDULER(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSCHEDULER(SCHEDULERType newSCHEDULER, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_SCHEDULER(), newSCHEDULER, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSCHEDULER(SCHEDULERType newSCHEDULER) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_SCHEDULER(), newSCHEDULER);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SEBLJOINType getSEBLJOIN() {
        return (SEBLJOINType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_SEBLJOIN(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSEBLJOIN(SEBLJOINType newSEBLJOIN, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_SEBLJOIN(), newSEBLJOIN, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSEBLJOIN(SEBLJOINType newSEBLJOIN) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_SEBLJOIN(), newSEBLJOIN);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SEBLLINKType getSEBLLINK() {
        return (SEBLLINKType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_SEBLLINK(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSEBLLINK(SEBLLINKType newSEBLLINK, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_SEBLLINK(), newSEBLLINK, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSEBLLINK(SEBLLINKType newSEBLLINK) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_SEBLLINK(), newSEBLLINK);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SEBLMVLINKType getSEBLMVLINK() {
        return (SEBLMVLINKType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_SEBLMVLINK(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSEBLMVLINK(SEBLMVLINKType newSEBLMVLINK, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_SEBLMVLINK(), newSEBLMVLINK, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSEBLMVLINK(SEBLMVLINKType newSEBLMVLINK) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_SEBLMVLINK(), newSEBLMVLINK);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SEBLMVLINKRELType getSEBLMVLINKREL() {
        return (SEBLMVLINKRELType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_SEBLMVLINKREL(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSEBLMVLINKREL(SEBLMVLINKRELType newSEBLMVLINKREL, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_SEBLMVLINKREL(), newSEBLMVLINKREL, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSEBLMVLINKREL(SEBLMVLINKRELType newSEBLMVLINKREL) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_SEBLMVLINKREL(), newSEBLMVLINKREL);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SEBLSRCINFOType getSEBLSRCINFO() {
        return (SEBLSRCINFOType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_SEBLSRCINFO(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSEBLSRCINFO(SEBLSRCINFOType newSEBLSRCINFO, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_SEBLSRCINFO(), newSEBLSRCINFO, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSEBLSRCINFO(SEBLSRCINFOType newSEBLSRCINFO) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_SEBLSRCINFO(), newSEBLSRCINFO);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SESSIONType getSESSION() {
        return (SESSIONType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_SESSION(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSESSION(SESSIONType newSESSION, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_SESSION(), newSESSION, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSESSION(SESSIONType newSESSION) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_SESSION(), newSESSION);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SESSIONCOMPONENTType getSESSIONCOMPONENT() {
        return (SESSIONCOMPONENTType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_SESSIONCOMPONENT(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSESSIONCOMPONENT(SESSIONCOMPONENTType newSESSIONCOMPONENT, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_SESSIONCOMPONENT(), newSESSIONCOMPONENT, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSESSIONCOMPONENT(SESSIONCOMPONENTType newSESSIONCOMPONENT) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_SESSIONCOMPONENT(), newSESSIONCOMPONENT);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SESSIONEXTENSIONType getSESSIONEXTENSION() {
        return (SESSIONEXTENSIONType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_SESSIONEXTENSION(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSESSIONEXTENSION(SESSIONEXTENSIONType newSESSIONEXTENSION, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_SESSIONEXTENSION(), newSESSIONEXTENSION, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSESSIONEXTENSION(SESSIONEXTENSIONType newSESSIONEXTENSION) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_SESSIONEXTENSION(), newSESSIONEXTENSION);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SESSTRANSFORMATIONGROUPType getSESSTRANSFORMATIONGROUP() {
        return (SESSTRANSFORMATIONGROUPType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_SESSTRANSFORMATIONGROUP(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSESSTRANSFORMATIONGROUP(SESSTRANSFORMATIONGROUPType newSESSTRANSFORMATIONGROUP, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_SESSTRANSFORMATIONGROUP(), newSESSTRANSFORMATIONGROUP, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSESSTRANSFORMATIONGROUP(SESSTRANSFORMATIONGROUPType newSESSTRANSFORMATIONGROUP) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_SESSTRANSFORMATIONGROUP(), newSESSTRANSFORMATIONGROUP);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SESSTRANSFORMATIONINSTType getSESSTRANSFORMATIONINST() {
        return (SESSTRANSFORMATIONINSTType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_SESSTRANSFORMATIONINST(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSESSTRANSFORMATIONINST(SESSTRANSFORMATIONINSTType newSESSTRANSFORMATIONINST, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_SESSTRANSFORMATIONINST(), newSESSTRANSFORMATIONINST, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSESSTRANSFORMATIONINST(SESSTRANSFORMATIONINSTType newSESSTRANSFORMATIONINST) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_SESSTRANSFORMATIONINST(), newSESSTRANSFORMATIONINST);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SHORTCUTType getSHORTCUT() {
        return (SHORTCUTType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_SHORTCUT(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSHORTCUT(SHORTCUTType newSHORTCUT, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_SHORTCUT(), newSHORTCUT, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSHORTCUT(SHORTCUTType newSHORTCUT) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_SHORTCUT(), newSHORTCUT);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SOURCEType getSOURCE() {
        return (SOURCEType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_SOURCE(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSOURCE(SOURCEType newSOURCE, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_SOURCE(), newSOURCE, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSOURCE(SOURCEType newSOURCE) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_SOURCE(), newSOURCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SOURCEFIELDType getSOURCEFIELD() {
        return (SOURCEFIELDType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_SOURCEFIELD(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSOURCEFIELD(SOURCEFIELDType newSOURCEFIELD, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_SOURCEFIELD(), newSOURCEFIELD, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSOURCEFIELD(SOURCEFIELDType newSOURCEFIELD) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_SOURCEFIELD(), newSOURCEFIELD);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public STARTOPTIONSType getSTARTOPTIONS() {
        return (STARTOPTIONSType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_STARTOPTIONS(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSTARTOPTIONS(STARTOPTIONSType newSTARTOPTIONS, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_STARTOPTIONS(), newSTARTOPTIONS, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSTARTOPTIONS(STARTOPTIONSType newSTARTOPTIONS) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_STARTOPTIONS(), newSTARTOPTIONS);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TABLEATTRIBUTEType getTABLEATTRIBUTE() {
        return (TABLEATTRIBUTEType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_TABLEATTRIBUTE(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTABLEATTRIBUTE(TABLEATTRIBUTEType newTABLEATTRIBUTE, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_TABLEATTRIBUTE(), newTABLEATTRIBUTE, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTABLEATTRIBUTE(TABLEATTRIBUTEType newTABLEATTRIBUTE) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_TABLEATTRIBUTE(), newTABLEATTRIBUTE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TARGETType getTARGET() {
        return (TARGETType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_TARGET(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTARGET(TARGETType newTARGET, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_TARGET(), newTARGET, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTARGET(TARGETType newTARGET) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_TARGET(), newTARGET);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TARGETFIELDType getTARGETFIELD() {
        return (TARGETFIELDType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_TARGETFIELD(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTARGETFIELD(TARGETFIELDType newTARGETFIELD, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_TARGETFIELD(), newTARGETFIELD, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTARGETFIELD(TARGETFIELDType newTARGETFIELD) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_TARGETFIELD(), newTARGETFIELD);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TARGETINDEXType getTARGETINDEX() {
        return (TARGETINDEXType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_TARGETINDEX(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTARGETINDEX(TARGETINDEXType newTARGETINDEX, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_TARGETINDEX(), newTARGETINDEX, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTARGETINDEX(TARGETINDEXType newTARGETINDEX) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_TARGETINDEX(), newTARGETINDEX);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TARGETINDEXFIELDType getTARGETINDEXFIELD() {
        return (TARGETINDEXFIELDType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_TARGETINDEXFIELD(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTARGETINDEXFIELD(TARGETINDEXFIELDType newTARGETINDEXFIELD, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_TARGETINDEXFIELD(), newTARGETINDEXFIELD, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTARGETINDEXFIELD(TARGETINDEXFIELDType newTARGETINDEXFIELD) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_TARGETINDEXFIELD(), newTARGETINDEXFIELD);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TARGETLOADORDERType getTARGETLOADORDER() {
        return (TARGETLOADORDERType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_TARGETLOADORDER(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTARGETLOADORDER(TARGETLOADORDERType newTARGETLOADORDER, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_TARGETLOADORDER(), newTARGETLOADORDER, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTARGETLOADORDER(TARGETLOADORDERType newTARGETLOADORDER) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_TARGETLOADORDER(), newTARGETLOADORDER);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TASKType getTASK() {
        return (TASKType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_TASK(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTASK(TASKType newTASK, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_TASK(), newTASK, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTASK(TASKType newTASK) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_TASK(), newTASK);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TASKINSTANCEType getTASKINSTANCE() {
        return (TASKINSTANCEType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_TASKINSTANCE(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTASKINSTANCE(TASKINSTANCEType newTASKINSTANCE, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_TASKINSTANCE(), newTASKINSTANCE, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTASKINSTANCE(TASKINSTANCEType newTASKINSTANCE) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_TASKINSTANCE(), newTASKINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TIMERType getTIMER() {
        return (TIMERType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_TIMER(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTIMER(TIMERType newTIMER, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_TIMER(), newTIMER, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTIMER(TIMERType newTIMER) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_TIMER(), newTIMER);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TRANSFORMATIONType getTRANSFORMATION() {
        return (TRANSFORMATIONType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_TRANSFORMATION(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTRANSFORMATION(TRANSFORMATIONType newTRANSFORMATION, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_TRANSFORMATION(), newTRANSFORMATION, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTRANSFORMATION(TRANSFORMATIONType newTRANSFORMATION) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_TRANSFORMATION(), newTRANSFORMATION);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TRANSFORMFIELDType getTRANSFORMFIELD() {
        return (TRANSFORMFIELDType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_TRANSFORMFIELD(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTRANSFORMFIELD(TRANSFORMFIELDType newTRANSFORMFIELD, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_TRANSFORMFIELD(), newTRANSFORMFIELD, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTRANSFORMFIELD(TRANSFORMFIELDType newTRANSFORMFIELD) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_TRANSFORMFIELD(), newTRANSFORMFIELD);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TRANSFORMFIELDATTRType getTRANSFORMFIELDATTR() {
        return (TRANSFORMFIELDATTRType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_TRANSFORMFIELDATTR(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTRANSFORMFIELDATTR(TRANSFORMFIELDATTRType newTRANSFORMFIELDATTR, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_TRANSFORMFIELDATTR(), newTRANSFORMFIELDATTR, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTRANSFORMFIELDATTR(TRANSFORMFIELDATTRType newTRANSFORMFIELDATTR) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_TRANSFORMFIELDATTR(), newTRANSFORMFIELDATTR);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TRANSFORMFIELDATTRDEFType getTRANSFORMFIELDATTRDEF() {
        return (TRANSFORMFIELDATTRDEFType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_TRANSFORMFIELDATTRDEF(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTRANSFORMFIELDATTRDEF(TRANSFORMFIELDATTRDEFType newTRANSFORMFIELDATTRDEF, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_TRANSFORMFIELDATTRDEF(), newTRANSFORMFIELDATTRDEF, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTRANSFORMFIELDATTRDEF(TRANSFORMFIELDATTRDEFType newTRANSFORMFIELDATTRDEF) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_TRANSFORMFIELDATTRDEF(), newTRANSFORMFIELDATTRDEF);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TRANSFORMRESOURCEREFType getTRANSFORMRESOURCEREF() {
        return (TRANSFORMRESOURCEREFType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_TRANSFORMRESOURCEREF(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTRANSFORMRESOURCEREF(TRANSFORMRESOURCEREFType newTRANSFORMRESOURCEREF, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_TRANSFORMRESOURCEREF(), newTRANSFORMRESOURCEREF, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTRANSFORMRESOURCEREF(TRANSFORMRESOURCEREFType newTRANSFORMRESOURCEREF) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_TRANSFORMRESOURCEREF(), newTRANSFORMRESOURCEREF);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VALUEPAIRType getVALUEPAIR() {
        return (VALUEPAIRType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_VALUEPAIR(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetVALUEPAIR(VALUEPAIRType newVALUEPAIR, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_VALUEPAIR(), newVALUEPAIR, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVALUEPAIR(VALUEPAIRType newVALUEPAIR) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_VALUEPAIR(), newVALUEPAIR);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WORKFLOWType getWORKFLOW() {
        return (WORKFLOWType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_WORKFLOW(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWORKFLOW(WORKFLOWType newWORKFLOW, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_WORKFLOW(), newWORKFLOW, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setWORKFLOW(WORKFLOWType newWORKFLOW) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_WORKFLOW(), newWORKFLOW);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WORKFLOWEVENTType getWORKFLOWEVENT() {
        return (WORKFLOWEVENTType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_WORKFLOWEVENT(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWORKFLOWEVENT(WORKFLOWEVENTType newWORKFLOWEVENT, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_WORKFLOWEVENT(), newWORKFLOWEVENT, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setWORKFLOWEVENT(WORKFLOWEVENTType newWORKFLOWEVENT) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_WORKFLOWEVENT(), newWORKFLOWEVENT);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WORKFLOWLINKType getWORKFLOWLINK() {
        return (WORKFLOWLINKType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_WORKFLOWLINK(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWORKFLOWLINK(WORKFLOWLINKType newWORKFLOWLINK, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_WORKFLOWLINK(), newWORKFLOWLINK, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setWORKFLOWLINK(WORKFLOWLINKType newWORKFLOWLINK) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_WORKFLOWLINK(), newWORKFLOWLINK);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WORKFLOWVARIABLEType getWORKFLOWVARIABLE() {
        return (WORKFLOWVARIABLEType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_WORKFLOWVARIABLE(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWORKFLOWVARIABLE(WORKFLOWVARIABLEType newWORKFLOWVARIABLE, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_WORKFLOWVARIABLE(), newWORKFLOWVARIABLE, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setWORKFLOWVARIABLE(WORKFLOWVARIABLEType newWORKFLOWVARIABLE) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_WORKFLOWVARIABLE(), newWORKFLOWVARIABLE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WORKLETType getWORKLET() {
        return (WORKLETType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_WORKLET(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWORKLET(WORKLETType newWORKLET, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_WORKLET(), newWORKLET, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setWORKLET(WORKLETType newWORKLET) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_WORKLET(), newWORKLET);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XMLINFOType getXMLINFO() {
        return (XMLINFOType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_XMLINFO(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetXMLINFO(XMLINFOType newXMLINFO, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_XMLINFO(), newXMLINFO, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setXMLINFO(XMLINFOType newXMLINFO) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_XMLINFO(), newXMLINFO);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XMLTEXTType getXMLTEXT() {
        return (XMLTEXTType)getMixed().get(PowrmartPackage.eINSTANCE.getDocumentRoot_XMLTEXT(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetXMLTEXT(XMLTEXTType newXMLTEXT, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(PowrmartPackage.eINSTANCE.getDocumentRoot_XMLTEXT(), newXMLTEXT, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setXMLTEXT(XMLTEXTType newXMLTEXT) {
        ((FeatureMap.Internal)getMixed()).set(PowrmartPackage.eINSTANCE.getDocumentRoot_XMLTEXT(), newXMLTEXT);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PowrmartPackage.DOCUMENT_ROOT__MIXED:
                return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__ASSOCIATEDSOURCEINSTANCE:
                return basicSetASSOCIATEDSOURCEINSTANCE(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__ATTRIBUTE:
                return basicSetATTRIBUTE(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__CONFIG:
                return basicSetCONFIG(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__CONFIGREFERENCE:
                return basicSetCONFIGREFERENCE(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__CONNECTIONREFERENCE:
                return basicSetCONNECTIONREFERENCE(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__CONNECTOR:
                return basicSetCONNECTOR(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__CONWFRUNINFO:
                return basicSetCONWFRUNINFO(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__CUSTOM:
                return basicSetCUSTOM(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__DAILYFREQUENCY:
                return basicSetDAILYFREQUENCY(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__ENDOPTIONS:
                return basicSetENDOPTIONS(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__ERPINFO:
                return basicSetERPINFO(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__ERPSRCINFO:
                return basicSetERPSRCINFO(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__EXPRMACRO:
                return basicSetEXPRMACRO(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__EXPRMACRODEPENDENCY:
                return basicSetEXPRMACRODEPENDENCY(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__FIELDATTRIBUTE:
                return basicSetFIELDATTRIBUTE(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__FIELDDEPENDENCY:
                return basicSetFIELDDEPENDENCY(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__FILTER:
                return basicSetFILTER(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__FLATFILE:
                return basicSetFLATFILE(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__FOLDER:
                return basicSetFOLDER(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__FOLDERVERSION:
                return basicSetFOLDERVERSION(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__GROUP:
                return basicSetGROUP(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__HASHKEY:
                return basicSetHASHKEY(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__INITPROP:
                return basicSetINITPROP(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__INSTANCE:
                return basicSetINSTANCE(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__KEYRANGE:
                return basicSetKEYRANGE(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__KEYWORD:
                return basicSetKEYWORD(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__MACROARGUMENT:
                return basicSetMACROARGUMENT(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__MACRODEPENDENCY:
                return basicSetMACRODEPENDENCY(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__MAPDEPENDENCY:
                return basicSetMAPDEPENDENCY(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__MAPPING:
                return basicSetMAPPING(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__MAPPINGVARIABLE:
                return basicSetMAPPINGVARIABLE(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__MAPPLET:
                return basicSetMAPPLET(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__METADATAEXTENSION:
                return basicSetMETADATAEXTENSION(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__PARTITION:
                return basicSetPARTITION(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__POWERMART:
                return basicSetPOWERMART(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__RECURRING:
                return basicSetRECURRING(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__REPEAT:
                return basicSetREPEAT(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__REPOSITORY:
                return basicSetREPOSITORY(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__RESOURCEREFERENCE:
                return basicSetRESOURCEREFERENCE(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__SAPCODEBLOCK:
                return basicSetSAPCODEBLOCK(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__SAPFUNCINSTANCEPARAM:
                return basicSetSAPFUNCINSTANCEPARAM(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__SAPFUNCINSTANCEPARAMFLD:
                return basicSetSAPFUNCINSTANCEPARAMFLD(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__SAPFUNCPARAM:
                return basicSetSAPFUNCPARAM(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__SAPFUNCTION:
                return basicSetSAPFUNCTION(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__SAPFUNCTIONINSTANCE:
                return basicSetSAPFUNCTIONINSTANCE(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__SAPOUTPUTPORT:
                return basicSetSAPOUTPUTPORT(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__SAPPROGRAM:
                return basicSetSAPPROGRAM(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__SAPPROGRAMFLOWOBJECT:
                return basicSetSAPPROGRAMFLOWOBJECT(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__SAPSTRUCTURE:
                return basicSetSAPSTRUCTURE(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__SAPSTRUCTUREFIELD:
                return basicSetSAPSTRUCTUREFIELD(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__SAPTABLEINSTANCEPARAM:
                return basicSetSAPTABLEINSTANCEPARAM(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__SAPTABLEPARAM:
                return basicSetSAPTABLEPARAM(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__SAPVARIABLE:
                return basicSetSAPVARIABLE(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__SCHEDULEINFO:
                return basicSetSCHEDULEINFO(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__SCHEDULEOPTIONS:
                return basicSetSCHEDULEOPTIONS(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__SCHEDULER:
                return basicSetSCHEDULER(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__SEBLJOIN:
                return basicSetSEBLJOIN(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__SEBLLINK:
                return basicSetSEBLLINK(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__SEBLMVLINK:
                return basicSetSEBLMVLINK(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__SEBLMVLINKREL:
                return basicSetSEBLMVLINKREL(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__SEBLSRCINFO:
                return basicSetSEBLSRCINFO(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__SESSION:
                return basicSetSESSION(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__SESSIONCOMPONENT:
                return basicSetSESSIONCOMPONENT(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__SESSIONEXTENSION:
                return basicSetSESSIONEXTENSION(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__SESSTRANSFORMATIONGROUP:
                return basicSetSESSTRANSFORMATIONGROUP(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__SESSTRANSFORMATIONINST:
                return basicSetSESSTRANSFORMATIONINST(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__SHORTCUT:
                return basicSetSHORTCUT(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__SOURCE:
                return basicSetSOURCE(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__SOURCEFIELD:
                return basicSetSOURCEFIELD(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__STARTOPTIONS:
                return basicSetSTARTOPTIONS(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__TABLEATTRIBUTE:
                return basicSetTABLEATTRIBUTE(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__TARGET:
                return basicSetTARGET(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__TARGETFIELD:
                return basicSetTARGETFIELD(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__TARGETINDEX:
                return basicSetTARGETINDEX(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__TARGETINDEXFIELD:
                return basicSetTARGETINDEXFIELD(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__TARGETLOADORDER:
                return basicSetTARGETLOADORDER(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__TASK:
                return basicSetTASK(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__TASKINSTANCE:
                return basicSetTASKINSTANCE(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__TIMER:
                return basicSetTIMER(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__TRANSFORMATION:
                return basicSetTRANSFORMATION(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__TRANSFORMFIELD:
                return basicSetTRANSFORMFIELD(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__TRANSFORMFIELDATTR:
                return basicSetTRANSFORMFIELDATTR(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__TRANSFORMFIELDATTRDEF:
                return basicSetTRANSFORMFIELDATTRDEF(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__TRANSFORMRESOURCEREF:
                return basicSetTRANSFORMRESOURCEREF(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__VALUEPAIR:
                return basicSetVALUEPAIR(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__WORKFLOW:
                return basicSetWORKFLOW(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__WORKFLOWEVENT:
                return basicSetWORKFLOWEVENT(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__WORKFLOWLINK:
                return basicSetWORKFLOWLINK(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__WORKFLOWVARIABLE:
                return basicSetWORKFLOWVARIABLE(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__WORKLET:
                return basicSetWORKLET(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__XMLINFO:
                return basicSetXMLINFO(null, msgs);
            case PowrmartPackage.DOCUMENT_ROOT__XMLTEXT:
                return basicSetXMLTEXT(null, msgs);
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
            case PowrmartPackage.DOCUMENT_ROOT__MIXED:
                if (coreType) return getMixed();
                return ((FeatureMap.Internal)getMixed()).getWrapper();
            case PowrmartPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                if (coreType) return getXMLNSPrefixMap();
                else return getXMLNSPrefixMap().map();
            case PowrmartPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                if (coreType) return getXSISchemaLocation();
                else return getXSISchemaLocation().map();
            case PowrmartPackage.DOCUMENT_ROOT__ASSOCIATEDSOURCEINSTANCE:
                return getASSOCIATEDSOURCEINSTANCE();
            case PowrmartPackage.DOCUMENT_ROOT__ATTRIBUTE:
                return getATTRIBUTE();
            case PowrmartPackage.DOCUMENT_ROOT__CONFIG:
                return getCONFIG();
            case PowrmartPackage.DOCUMENT_ROOT__CONFIGREFERENCE:
                return getCONFIGREFERENCE();
            case PowrmartPackage.DOCUMENT_ROOT__CONNECTIONREFERENCE:
                return getCONNECTIONREFERENCE();
            case PowrmartPackage.DOCUMENT_ROOT__CONNECTOR:
                return getCONNECTOR();
            case PowrmartPackage.DOCUMENT_ROOT__CONWFRUNINFO:
                return getCONWFRUNINFO();
            case PowrmartPackage.DOCUMENT_ROOT__CUSTOM:
                return getCUSTOM();
            case PowrmartPackage.DOCUMENT_ROOT__DAILYFREQUENCY:
                return getDAILYFREQUENCY();
            case PowrmartPackage.DOCUMENT_ROOT__ENDOPTIONS:
                return getENDOPTIONS();
            case PowrmartPackage.DOCUMENT_ROOT__ERPINFO:
                return getERPINFO();
            case PowrmartPackage.DOCUMENT_ROOT__ERPSRCINFO:
                return getERPSRCINFO();
            case PowrmartPackage.DOCUMENT_ROOT__EXPRMACRO:
                return getEXPRMACRO();
            case PowrmartPackage.DOCUMENT_ROOT__EXPRMACRODEPENDENCY:
                return getEXPRMACRODEPENDENCY();
            case PowrmartPackage.DOCUMENT_ROOT__FIELDATTRIBUTE:
                return getFIELDATTRIBUTE();
            case PowrmartPackage.DOCUMENT_ROOT__FIELDDEPENDENCY:
                return getFIELDDEPENDENCY();
            case PowrmartPackage.DOCUMENT_ROOT__FILTER:
                return getFILTER();
            case PowrmartPackage.DOCUMENT_ROOT__FLATFILE:
                return getFLATFILE();
            case PowrmartPackage.DOCUMENT_ROOT__FOLDER:
                return getFOLDER();
            case PowrmartPackage.DOCUMENT_ROOT__FOLDERVERSION:
                return getFOLDERVERSION();
            case PowrmartPackage.DOCUMENT_ROOT__GROUP:
                return getGROUP();
            case PowrmartPackage.DOCUMENT_ROOT__HASHKEY:
                return getHASHKEY();
            case PowrmartPackage.DOCUMENT_ROOT__INITPROP:
                return getINITPROP();
            case PowrmartPackage.DOCUMENT_ROOT__INSTANCE:
                return getINSTANCE();
            case PowrmartPackage.DOCUMENT_ROOT__KEYRANGE:
                return getKEYRANGE();
            case PowrmartPackage.DOCUMENT_ROOT__KEYWORD:
                return getKEYWORD();
            case PowrmartPackage.DOCUMENT_ROOT__MACROARGUMENT:
                return getMACROARGUMENT();
            case PowrmartPackage.DOCUMENT_ROOT__MACRODEPENDENCY:
                return getMACRODEPENDENCY();
            case PowrmartPackage.DOCUMENT_ROOT__MAPDEPENDENCY:
                return getMAPDEPENDENCY();
            case PowrmartPackage.DOCUMENT_ROOT__MAPPING:
                return getMAPPING();
            case PowrmartPackage.DOCUMENT_ROOT__MAPPINGVARIABLE:
                return getMAPPINGVARIABLE();
            case PowrmartPackage.DOCUMENT_ROOT__MAPPLET:
                return getMAPPLET();
            case PowrmartPackage.DOCUMENT_ROOT__METADATAEXTENSION:
                return getMETADATAEXTENSION();
            case PowrmartPackage.DOCUMENT_ROOT__PARTITION:
                return getPARTITION();
            case PowrmartPackage.DOCUMENT_ROOT__POWERMART:
                return getPOWERMART();
            case PowrmartPackage.DOCUMENT_ROOT__RECURRING:
                return getRECURRING();
            case PowrmartPackage.DOCUMENT_ROOT__REPEAT:
                return getREPEAT();
            case PowrmartPackage.DOCUMENT_ROOT__REPOSITORY:
                return getREPOSITORY();
            case PowrmartPackage.DOCUMENT_ROOT__RESOURCEREFERENCE:
                return getRESOURCEREFERENCE();
            case PowrmartPackage.DOCUMENT_ROOT__SAPCODEBLOCK:
                return getSAPCODEBLOCK();
            case PowrmartPackage.DOCUMENT_ROOT__SAPFUNCINSTANCEPARAM:
                return getSAPFUNCINSTANCEPARAM();
            case PowrmartPackage.DOCUMENT_ROOT__SAPFUNCINSTANCEPARAMFLD:
                return getSAPFUNCINSTANCEPARAMFLD();
            case PowrmartPackage.DOCUMENT_ROOT__SAPFUNCPARAM:
                return getSAPFUNCPARAM();
            case PowrmartPackage.DOCUMENT_ROOT__SAPFUNCTION:
                return getSAPFUNCTION();
            case PowrmartPackage.DOCUMENT_ROOT__SAPFUNCTIONINSTANCE:
                return getSAPFUNCTIONINSTANCE();
            case PowrmartPackage.DOCUMENT_ROOT__SAPOUTPUTPORT:
                return getSAPOUTPUTPORT();
            case PowrmartPackage.DOCUMENT_ROOT__SAPPROGRAM:
                return getSAPPROGRAM();
            case PowrmartPackage.DOCUMENT_ROOT__SAPPROGRAMFLOWOBJECT:
                return getSAPPROGRAMFLOWOBJECT();
            case PowrmartPackage.DOCUMENT_ROOT__SAPSTRUCTURE:
                return getSAPSTRUCTURE();
            case PowrmartPackage.DOCUMENT_ROOT__SAPSTRUCTUREFIELD:
                return getSAPSTRUCTUREFIELD();
            case PowrmartPackage.DOCUMENT_ROOT__SAPTABLEINSTANCEPARAM:
                return getSAPTABLEINSTANCEPARAM();
            case PowrmartPackage.DOCUMENT_ROOT__SAPTABLEPARAM:
                return getSAPTABLEPARAM();
            case PowrmartPackage.DOCUMENT_ROOT__SAPVARIABLE:
                return getSAPVARIABLE();
            case PowrmartPackage.DOCUMENT_ROOT__SCHEDULEINFO:
                return getSCHEDULEINFO();
            case PowrmartPackage.DOCUMENT_ROOT__SCHEDULEOPTIONS:
                return getSCHEDULEOPTIONS();
            case PowrmartPackage.DOCUMENT_ROOT__SCHEDULER:
                return getSCHEDULER();
            case PowrmartPackage.DOCUMENT_ROOT__SEBLJOIN:
                return getSEBLJOIN();
            case PowrmartPackage.DOCUMENT_ROOT__SEBLLINK:
                return getSEBLLINK();
            case PowrmartPackage.DOCUMENT_ROOT__SEBLMVLINK:
                return getSEBLMVLINK();
            case PowrmartPackage.DOCUMENT_ROOT__SEBLMVLINKREL:
                return getSEBLMVLINKREL();
            case PowrmartPackage.DOCUMENT_ROOT__SEBLSRCINFO:
                return getSEBLSRCINFO();
            case PowrmartPackage.DOCUMENT_ROOT__SESSION:
                return getSESSION();
            case PowrmartPackage.DOCUMENT_ROOT__SESSIONCOMPONENT:
                return getSESSIONCOMPONENT();
            case PowrmartPackage.DOCUMENT_ROOT__SESSIONEXTENSION:
                return getSESSIONEXTENSION();
            case PowrmartPackage.DOCUMENT_ROOT__SESSTRANSFORMATIONGROUP:
                return getSESSTRANSFORMATIONGROUP();
            case PowrmartPackage.DOCUMENT_ROOT__SESSTRANSFORMATIONINST:
                return getSESSTRANSFORMATIONINST();
            case PowrmartPackage.DOCUMENT_ROOT__SHORTCUT:
                return getSHORTCUT();
            case PowrmartPackage.DOCUMENT_ROOT__SOURCE:
                return getSOURCE();
            case PowrmartPackage.DOCUMENT_ROOT__SOURCEFIELD:
                return getSOURCEFIELD();
            case PowrmartPackage.DOCUMENT_ROOT__STARTOPTIONS:
                return getSTARTOPTIONS();
            case PowrmartPackage.DOCUMENT_ROOT__TABLEATTRIBUTE:
                return getTABLEATTRIBUTE();
            case PowrmartPackage.DOCUMENT_ROOT__TARGET:
                return getTARGET();
            case PowrmartPackage.DOCUMENT_ROOT__TARGETFIELD:
                return getTARGETFIELD();
            case PowrmartPackage.DOCUMENT_ROOT__TARGETINDEX:
                return getTARGETINDEX();
            case PowrmartPackage.DOCUMENT_ROOT__TARGETINDEXFIELD:
                return getTARGETINDEXFIELD();
            case PowrmartPackage.DOCUMENT_ROOT__TARGETLOADORDER:
                return getTARGETLOADORDER();
            case PowrmartPackage.DOCUMENT_ROOT__TASK:
                return getTASK();
            case PowrmartPackage.DOCUMENT_ROOT__TASKINSTANCE:
                return getTASKINSTANCE();
            case PowrmartPackage.DOCUMENT_ROOT__TIMER:
                return getTIMER();
            case PowrmartPackage.DOCUMENT_ROOT__TRANSFORMATION:
                return getTRANSFORMATION();
            case PowrmartPackage.DOCUMENT_ROOT__TRANSFORMFIELD:
                return getTRANSFORMFIELD();
            case PowrmartPackage.DOCUMENT_ROOT__TRANSFORMFIELDATTR:
                return getTRANSFORMFIELDATTR();
            case PowrmartPackage.DOCUMENT_ROOT__TRANSFORMFIELDATTRDEF:
                return getTRANSFORMFIELDATTRDEF();
            case PowrmartPackage.DOCUMENT_ROOT__TRANSFORMRESOURCEREF:
                return getTRANSFORMRESOURCEREF();
            case PowrmartPackage.DOCUMENT_ROOT__VALUEPAIR:
                return getVALUEPAIR();
            case PowrmartPackage.DOCUMENT_ROOT__WORKFLOW:
                return getWORKFLOW();
            case PowrmartPackage.DOCUMENT_ROOT__WORKFLOWEVENT:
                return getWORKFLOWEVENT();
            case PowrmartPackage.DOCUMENT_ROOT__WORKFLOWLINK:
                return getWORKFLOWLINK();
            case PowrmartPackage.DOCUMENT_ROOT__WORKFLOWVARIABLE:
                return getWORKFLOWVARIABLE();
            case PowrmartPackage.DOCUMENT_ROOT__WORKLET:
                return getWORKLET();
            case PowrmartPackage.DOCUMENT_ROOT__XMLINFO:
                return getXMLINFO();
            case PowrmartPackage.DOCUMENT_ROOT__XMLTEXT:
                return getXMLTEXT();
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
            case PowrmartPackage.DOCUMENT_ROOT__MIXED:
                ((FeatureMap.Internal)getMixed()).set(newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                ((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                ((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__ASSOCIATEDSOURCEINSTANCE:
                setASSOCIATEDSOURCEINSTANCE((ASSOCIATEDSOURCEINSTANCEType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__ATTRIBUTE:
                setATTRIBUTE((ATTRIBUTEType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__CONFIG:
                setCONFIG((CONFIGType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__CONFIGREFERENCE:
                setCONFIGREFERENCE((CONFIGREFERENCEType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__CONNECTIONREFERENCE:
                setCONNECTIONREFERENCE((CONNECTIONREFERENCEType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__CONNECTOR:
                setCONNECTOR((CONNECTORType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__CONWFRUNINFO:
                setCONWFRUNINFO((CONWFRUNINFOType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__CUSTOM:
                setCUSTOM((CUSTOMType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__DAILYFREQUENCY:
                setDAILYFREQUENCY((DAILYFREQUENCYType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__ENDOPTIONS:
                setENDOPTIONS((ENDOPTIONSType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__ERPINFO:
                setERPINFO((ERPINFOType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__ERPSRCINFO:
                setERPSRCINFO((ERPSRCINFOType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__EXPRMACRO:
                setEXPRMACRO((EXPRMACROType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__EXPRMACRODEPENDENCY:
                setEXPRMACRODEPENDENCY((EXPRMACRODEPENDENCYType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__FIELDATTRIBUTE:
                setFIELDATTRIBUTE((FIELDATTRIBUTEType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__FIELDDEPENDENCY:
                setFIELDDEPENDENCY((FIELDDEPENDENCYType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__FILTER:
                setFILTER((FILTERType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__FLATFILE:
                setFLATFILE((FLATFILEType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__FOLDER:
                setFOLDER((FOLDERType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__FOLDERVERSION:
                setFOLDERVERSION((FOLDERVERSIONType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__GROUP:
                setGROUP((GROUPType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__HASHKEY:
                setHASHKEY((HASHKEYType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__INITPROP:
                setINITPROP((INITPROPType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__INSTANCE:
                setINSTANCE((INSTANCEType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__KEYRANGE:
                setKEYRANGE((KEYRANGEType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__KEYWORD:
                setKEYWORD((KEYWORDType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__MACROARGUMENT:
                setMACROARGUMENT((MACROARGUMENTType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__MACRODEPENDENCY:
                setMACRODEPENDENCY((MACRODEPENDENCYType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__MAPDEPENDENCY:
                setMAPDEPENDENCY((MAPDEPENDENCYType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__MAPPING:
                setMAPPING((MAPPINGType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__MAPPINGVARIABLE:
                setMAPPINGVARIABLE((MAPPINGVARIABLEType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__MAPPLET:
                setMAPPLET((MAPPLETType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__METADATAEXTENSION:
                setMETADATAEXTENSION((METADATAEXTENSIONType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__PARTITION:
                setPARTITION((PARTITIONType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__POWERMART:
                setPOWERMART((POWERMARTType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__RECURRING:
                setRECURRING((RECURRINGType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__REPEAT:
                setREPEAT((REPEATType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__REPOSITORY:
                setREPOSITORY((REPOSITORYType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__RESOURCEREFERENCE:
                setRESOURCEREFERENCE((RESOURCEREFERENCEType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SAPCODEBLOCK:
                setSAPCODEBLOCK((SAPCODEBLOCKType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SAPFUNCINSTANCEPARAM:
                setSAPFUNCINSTANCEPARAM((SAPFUNCINSTANCEPARAMType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SAPFUNCINSTANCEPARAMFLD:
                setSAPFUNCINSTANCEPARAMFLD((SAPFUNCINSTANCEPARAMFLDType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SAPFUNCPARAM:
                setSAPFUNCPARAM((SAPFUNCPARAMType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SAPFUNCTION:
                setSAPFUNCTION((SAPFUNCTIONType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SAPFUNCTIONINSTANCE:
                setSAPFUNCTIONINSTANCE((SAPFUNCTIONINSTANCEType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SAPOUTPUTPORT:
                setSAPOUTPUTPORT((SAPOUTPUTPORTType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SAPPROGRAM:
                setSAPPROGRAM((SAPPROGRAMType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SAPPROGRAMFLOWOBJECT:
                setSAPPROGRAMFLOWOBJECT((SAPPROGRAMFLOWOBJECTType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SAPSTRUCTURE:
                setSAPSTRUCTURE((SAPSTRUCTUREType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SAPSTRUCTUREFIELD:
                setSAPSTRUCTUREFIELD((SAPSTRUCTUREFIELDType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SAPTABLEINSTANCEPARAM:
                setSAPTABLEINSTANCEPARAM((SAPTABLEINSTANCEPARAMType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SAPTABLEPARAM:
                setSAPTABLEPARAM((SAPTABLEPARAMType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SAPVARIABLE:
                setSAPVARIABLE((SAPVARIABLEType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SCHEDULEINFO:
                setSCHEDULEINFO((SCHEDULEINFOType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SCHEDULEOPTIONS:
                setSCHEDULEOPTIONS((SCHEDULEOPTIONSType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SCHEDULER:
                setSCHEDULER((SCHEDULERType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SEBLJOIN:
                setSEBLJOIN((SEBLJOINType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SEBLLINK:
                setSEBLLINK((SEBLLINKType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SEBLMVLINK:
                setSEBLMVLINK((SEBLMVLINKType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SEBLMVLINKREL:
                setSEBLMVLINKREL((SEBLMVLINKRELType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SEBLSRCINFO:
                setSEBLSRCINFO((SEBLSRCINFOType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SESSION:
                setSESSION((SESSIONType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SESSIONCOMPONENT:
                setSESSIONCOMPONENT((SESSIONCOMPONENTType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SESSIONEXTENSION:
                setSESSIONEXTENSION((SESSIONEXTENSIONType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SESSTRANSFORMATIONGROUP:
                setSESSTRANSFORMATIONGROUP((SESSTRANSFORMATIONGROUPType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SESSTRANSFORMATIONINST:
                setSESSTRANSFORMATIONINST((SESSTRANSFORMATIONINSTType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SHORTCUT:
                setSHORTCUT((SHORTCUTType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SOURCE:
                setSOURCE((SOURCEType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SOURCEFIELD:
                setSOURCEFIELD((SOURCEFIELDType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__STARTOPTIONS:
                setSTARTOPTIONS((STARTOPTIONSType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__TABLEATTRIBUTE:
                setTABLEATTRIBUTE((TABLEATTRIBUTEType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__TARGET:
                setTARGET((TARGETType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__TARGETFIELD:
                setTARGETFIELD((TARGETFIELDType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__TARGETINDEX:
                setTARGETINDEX((TARGETINDEXType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__TARGETINDEXFIELD:
                setTARGETINDEXFIELD((TARGETINDEXFIELDType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__TARGETLOADORDER:
                setTARGETLOADORDER((TARGETLOADORDERType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__TASK:
                setTASK((TASKType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__TASKINSTANCE:
                setTASKINSTANCE((TASKINSTANCEType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__TIMER:
                setTIMER((TIMERType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__TRANSFORMATION:
                setTRANSFORMATION((TRANSFORMATIONType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__TRANSFORMFIELD:
                setTRANSFORMFIELD((TRANSFORMFIELDType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__TRANSFORMFIELDATTR:
                setTRANSFORMFIELDATTR((TRANSFORMFIELDATTRType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__TRANSFORMFIELDATTRDEF:
                setTRANSFORMFIELDATTRDEF((TRANSFORMFIELDATTRDEFType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__TRANSFORMRESOURCEREF:
                setTRANSFORMRESOURCEREF((TRANSFORMRESOURCEREFType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__VALUEPAIR:
                setVALUEPAIR((VALUEPAIRType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__WORKFLOW:
                setWORKFLOW((WORKFLOWType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__WORKFLOWEVENT:
                setWORKFLOWEVENT((WORKFLOWEVENTType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__WORKFLOWLINK:
                setWORKFLOWLINK((WORKFLOWLINKType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__WORKFLOWVARIABLE:
                setWORKFLOWVARIABLE((WORKFLOWVARIABLEType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__WORKLET:
                setWORKLET((WORKLETType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__XMLINFO:
                setXMLINFO((XMLINFOType)newValue);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__XMLTEXT:
                setXMLTEXT((XMLTEXTType)newValue);
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
            case PowrmartPackage.DOCUMENT_ROOT__MIXED:
                getMixed().clear();
                return;
            case PowrmartPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                getXMLNSPrefixMap().clear();
                return;
            case PowrmartPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                getXSISchemaLocation().clear();
                return;
            case PowrmartPackage.DOCUMENT_ROOT__ASSOCIATEDSOURCEINSTANCE:
                setASSOCIATEDSOURCEINSTANCE((ASSOCIATEDSOURCEINSTANCEType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__ATTRIBUTE:
                setATTRIBUTE((ATTRIBUTEType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__CONFIG:
                setCONFIG((CONFIGType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__CONFIGREFERENCE:
                setCONFIGREFERENCE((CONFIGREFERENCEType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__CONNECTIONREFERENCE:
                setCONNECTIONREFERENCE((CONNECTIONREFERENCEType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__CONNECTOR:
                setCONNECTOR((CONNECTORType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__CONWFRUNINFO:
                setCONWFRUNINFO((CONWFRUNINFOType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__CUSTOM:
                setCUSTOM((CUSTOMType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__DAILYFREQUENCY:
                setDAILYFREQUENCY((DAILYFREQUENCYType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__ENDOPTIONS:
                setENDOPTIONS((ENDOPTIONSType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__ERPINFO:
                setERPINFO((ERPINFOType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__ERPSRCINFO:
                setERPSRCINFO((ERPSRCINFOType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__EXPRMACRO:
                setEXPRMACRO((EXPRMACROType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__EXPRMACRODEPENDENCY:
                setEXPRMACRODEPENDENCY((EXPRMACRODEPENDENCYType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__FIELDATTRIBUTE:
                setFIELDATTRIBUTE((FIELDATTRIBUTEType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__FIELDDEPENDENCY:
                setFIELDDEPENDENCY((FIELDDEPENDENCYType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__FILTER:
                setFILTER((FILTERType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__FLATFILE:
                setFLATFILE((FLATFILEType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__FOLDER:
                setFOLDER((FOLDERType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__FOLDERVERSION:
                setFOLDERVERSION((FOLDERVERSIONType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__GROUP:
                setGROUP((GROUPType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__HASHKEY:
                setHASHKEY((HASHKEYType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__INITPROP:
                setINITPROP((INITPROPType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__INSTANCE:
                setINSTANCE((INSTANCEType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__KEYRANGE:
                setKEYRANGE((KEYRANGEType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__KEYWORD:
                setKEYWORD((KEYWORDType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__MACROARGUMENT:
                setMACROARGUMENT((MACROARGUMENTType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__MACRODEPENDENCY:
                setMACRODEPENDENCY((MACRODEPENDENCYType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__MAPDEPENDENCY:
                setMAPDEPENDENCY((MAPDEPENDENCYType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__MAPPING:
                setMAPPING((MAPPINGType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__MAPPINGVARIABLE:
                setMAPPINGVARIABLE((MAPPINGVARIABLEType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__MAPPLET:
                setMAPPLET((MAPPLETType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__METADATAEXTENSION:
                setMETADATAEXTENSION((METADATAEXTENSIONType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__PARTITION:
                setPARTITION((PARTITIONType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__POWERMART:
                setPOWERMART((POWERMARTType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__RECURRING:
                setRECURRING((RECURRINGType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__REPEAT:
                setREPEAT((REPEATType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__REPOSITORY:
                setREPOSITORY((REPOSITORYType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__RESOURCEREFERENCE:
                setRESOURCEREFERENCE((RESOURCEREFERENCEType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SAPCODEBLOCK:
                setSAPCODEBLOCK((SAPCODEBLOCKType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SAPFUNCINSTANCEPARAM:
                setSAPFUNCINSTANCEPARAM((SAPFUNCINSTANCEPARAMType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SAPFUNCINSTANCEPARAMFLD:
                setSAPFUNCINSTANCEPARAMFLD((SAPFUNCINSTANCEPARAMFLDType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SAPFUNCPARAM:
                setSAPFUNCPARAM((SAPFUNCPARAMType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SAPFUNCTION:
                setSAPFUNCTION((SAPFUNCTIONType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SAPFUNCTIONINSTANCE:
                setSAPFUNCTIONINSTANCE((SAPFUNCTIONINSTANCEType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SAPOUTPUTPORT:
                setSAPOUTPUTPORT((SAPOUTPUTPORTType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SAPPROGRAM:
                setSAPPROGRAM((SAPPROGRAMType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SAPPROGRAMFLOWOBJECT:
                setSAPPROGRAMFLOWOBJECT((SAPPROGRAMFLOWOBJECTType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SAPSTRUCTURE:
                setSAPSTRUCTURE((SAPSTRUCTUREType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SAPSTRUCTUREFIELD:
                setSAPSTRUCTUREFIELD((SAPSTRUCTUREFIELDType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SAPTABLEINSTANCEPARAM:
                setSAPTABLEINSTANCEPARAM((SAPTABLEINSTANCEPARAMType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SAPTABLEPARAM:
                setSAPTABLEPARAM((SAPTABLEPARAMType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SAPVARIABLE:
                setSAPVARIABLE((SAPVARIABLEType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SCHEDULEINFO:
                setSCHEDULEINFO((SCHEDULEINFOType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SCHEDULEOPTIONS:
                setSCHEDULEOPTIONS((SCHEDULEOPTIONSType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SCHEDULER:
                setSCHEDULER((SCHEDULERType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SEBLJOIN:
                setSEBLJOIN((SEBLJOINType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SEBLLINK:
                setSEBLLINK((SEBLLINKType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SEBLMVLINK:
                setSEBLMVLINK((SEBLMVLINKType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SEBLMVLINKREL:
                setSEBLMVLINKREL((SEBLMVLINKRELType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SEBLSRCINFO:
                setSEBLSRCINFO((SEBLSRCINFOType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SESSION:
                setSESSION((SESSIONType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SESSIONCOMPONENT:
                setSESSIONCOMPONENT((SESSIONCOMPONENTType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SESSIONEXTENSION:
                setSESSIONEXTENSION((SESSIONEXTENSIONType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SESSTRANSFORMATIONGROUP:
                setSESSTRANSFORMATIONGROUP((SESSTRANSFORMATIONGROUPType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SESSTRANSFORMATIONINST:
                setSESSTRANSFORMATIONINST((SESSTRANSFORMATIONINSTType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SHORTCUT:
                setSHORTCUT((SHORTCUTType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SOURCE:
                setSOURCE((SOURCEType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__SOURCEFIELD:
                setSOURCEFIELD((SOURCEFIELDType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__STARTOPTIONS:
                setSTARTOPTIONS((STARTOPTIONSType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__TABLEATTRIBUTE:
                setTABLEATTRIBUTE((TABLEATTRIBUTEType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__TARGET:
                setTARGET((TARGETType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__TARGETFIELD:
                setTARGETFIELD((TARGETFIELDType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__TARGETINDEX:
                setTARGETINDEX((TARGETINDEXType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__TARGETINDEXFIELD:
                setTARGETINDEXFIELD((TARGETINDEXFIELDType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__TARGETLOADORDER:
                setTARGETLOADORDER((TARGETLOADORDERType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__TASK:
                setTASK((TASKType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__TASKINSTANCE:
                setTASKINSTANCE((TASKINSTANCEType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__TIMER:
                setTIMER((TIMERType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__TRANSFORMATION:
                setTRANSFORMATION((TRANSFORMATIONType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__TRANSFORMFIELD:
                setTRANSFORMFIELD((TRANSFORMFIELDType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__TRANSFORMFIELDATTR:
                setTRANSFORMFIELDATTR((TRANSFORMFIELDATTRType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__TRANSFORMFIELDATTRDEF:
                setTRANSFORMFIELDATTRDEF((TRANSFORMFIELDATTRDEFType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__TRANSFORMRESOURCEREF:
                setTRANSFORMRESOURCEREF((TRANSFORMRESOURCEREFType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__VALUEPAIR:
                setVALUEPAIR((VALUEPAIRType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__WORKFLOW:
                setWORKFLOW((WORKFLOWType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__WORKFLOWEVENT:
                setWORKFLOWEVENT((WORKFLOWEVENTType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__WORKFLOWLINK:
                setWORKFLOWLINK((WORKFLOWLINKType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__WORKFLOWVARIABLE:
                setWORKFLOWVARIABLE((WORKFLOWVARIABLEType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__WORKLET:
                setWORKLET((WORKLETType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__XMLINFO:
                setXMLINFO((XMLINFOType)null);
                return;
            case PowrmartPackage.DOCUMENT_ROOT__XMLTEXT:
                setXMLTEXT((XMLTEXTType)null);
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
            case PowrmartPackage.DOCUMENT_ROOT__MIXED:
                return mixed != null && !mixed.isEmpty();
            case PowrmartPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
            case PowrmartPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
            case PowrmartPackage.DOCUMENT_ROOT__ASSOCIATEDSOURCEINSTANCE:
                return getASSOCIATEDSOURCEINSTANCE() != null;
            case PowrmartPackage.DOCUMENT_ROOT__ATTRIBUTE:
                return getATTRIBUTE() != null;
            case PowrmartPackage.DOCUMENT_ROOT__CONFIG:
                return getCONFIG() != null;
            case PowrmartPackage.DOCUMENT_ROOT__CONFIGREFERENCE:
                return getCONFIGREFERENCE() != null;
            case PowrmartPackage.DOCUMENT_ROOT__CONNECTIONREFERENCE:
                return getCONNECTIONREFERENCE() != null;
            case PowrmartPackage.DOCUMENT_ROOT__CONNECTOR:
                return getCONNECTOR() != null;
            case PowrmartPackage.DOCUMENT_ROOT__CONWFRUNINFO:
                return getCONWFRUNINFO() != null;
            case PowrmartPackage.DOCUMENT_ROOT__CUSTOM:
                return getCUSTOM() != null;
            case PowrmartPackage.DOCUMENT_ROOT__DAILYFREQUENCY:
                return getDAILYFREQUENCY() != null;
            case PowrmartPackage.DOCUMENT_ROOT__ENDOPTIONS:
                return getENDOPTIONS() != null;
            case PowrmartPackage.DOCUMENT_ROOT__ERPINFO:
                return getERPINFO() != null;
            case PowrmartPackage.DOCUMENT_ROOT__ERPSRCINFO:
                return getERPSRCINFO() != null;
            case PowrmartPackage.DOCUMENT_ROOT__EXPRMACRO:
                return getEXPRMACRO() != null;
            case PowrmartPackage.DOCUMENT_ROOT__EXPRMACRODEPENDENCY:
                return getEXPRMACRODEPENDENCY() != null;
            case PowrmartPackage.DOCUMENT_ROOT__FIELDATTRIBUTE:
                return getFIELDATTRIBUTE() != null;
            case PowrmartPackage.DOCUMENT_ROOT__FIELDDEPENDENCY:
                return getFIELDDEPENDENCY() != null;
            case PowrmartPackage.DOCUMENT_ROOT__FILTER:
                return getFILTER() != null;
            case PowrmartPackage.DOCUMENT_ROOT__FLATFILE:
                return getFLATFILE() != null;
            case PowrmartPackage.DOCUMENT_ROOT__FOLDER:
                return getFOLDER() != null;
            case PowrmartPackage.DOCUMENT_ROOT__FOLDERVERSION:
                return getFOLDERVERSION() != null;
            case PowrmartPackage.DOCUMENT_ROOT__GROUP:
                return getGROUP() != null;
            case PowrmartPackage.DOCUMENT_ROOT__HASHKEY:
                return getHASHKEY() != null;
            case PowrmartPackage.DOCUMENT_ROOT__INITPROP:
                return getINITPROP() != null;
            case PowrmartPackage.DOCUMENT_ROOT__INSTANCE:
                return getINSTANCE() != null;
            case PowrmartPackage.DOCUMENT_ROOT__KEYRANGE:
                return getKEYRANGE() != null;
            case PowrmartPackage.DOCUMENT_ROOT__KEYWORD:
                return getKEYWORD() != null;
            case PowrmartPackage.DOCUMENT_ROOT__MACROARGUMENT:
                return getMACROARGUMENT() != null;
            case PowrmartPackage.DOCUMENT_ROOT__MACRODEPENDENCY:
                return getMACRODEPENDENCY() != null;
            case PowrmartPackage.DOCUMENT_ROOT__MAPDEPENDENCY:
                return getMAPDEPENDENCY() != null;
            case PowrmartPackage.DOCUMENT_ROOT__MAPPING:
                return getMAPPING() != null;
            case PowrmartPackage.DOCUMENT_ROOT__MAPPINGVARIABLE:
                return getMAPPINGVARIABLE() != null;
            case PowrmartPackage.DOCUMENT_ROOT__MAPPLET:
                return getMAPPLET() != null;
            case PowrmartPackage.DOCUMENT_ROOT__METADATAEXTENSION:
                return getMETADATAEXTENSION() != null;
            case PowrmartPackage.DOCUMENT_ROOT__PARTITION:
                return getPARTITION() != null;
            case PowrmartPackage.DOCUMENT_ROOT__POWERMART:
                return getPOWERMART() != null;
            case PowrmartPackage.DOCUMENT_ROOT__RECURRING:
                return getRECURRING() != null;
            case PowrmartPackage.DOCUMENT_ROOT__REPEAT:
                return getREPEAT() != null;
            case PowrmartPackage.DOCUMENT_ROOT__REPOSITORY:
                return getREPOSITORY() != null;
            case PowrmartPackage.DOCUMENT_ROOT__RESOURCEREFERENCE:
                return getRESOURCEREFERENCE() != null;
            case PowrmartPackage.DOCUMENT_ROOT__SAPCODEBLOCK:
                return getSAPCODEBLOCK() != null;
            case PowrmartPackage.DOCUMENT_ROOT__SAPFUNCINSTANCEPARAM:
                return getSAPFUNCINSTANCEPARAM() != null;
            case PowrmartPackage.DOCUMENT_ROOT__SAPFUNCINSTANCEPARAMFLD:
                return getSAPFUNCINSTANCEPARAMFLD() != null;
            case PowrmartPackage.DOCUMENT_ROOT__SAPFUNCPARAM:
                return getSAPFUNCPARAM() != null;
            case PowrmartPackage.DOCUMENT_ROOT__SAPFUNCTION:
                return getSAPFUNCTION() != null;
            case PowrmartPackage.DOCUMENT_ROOT__SAPFUNCTIONINSTANCE:
                return getSAPFUNCTIONINSTANCE() != null;
            case PowrmartPackage.DOCUMENT_ROOT__SAPOUTPUTPORT:
                return getSAPOUTPUTPORT() != null;
            case PowrmartPackage.DOCUMENT_ROOT__SAPPROGRAM:
                return getSAPPROGRAM() != null;
            case PowrmartPackage.DOCUMENT_ROOT__SAPPROGRAMFLOWOBJECT:
                return getSAPPROGRAMFLOWOBJECT() != null;
            case PowrmartPackage.DOCUMENT_ROOT__SAPSTRUCTURE:
                return getSAPSTRUCTURE() != null;
            case PowrmartPackage.DOCUMENT_ROOT__SAPSTRUCTUREFIELD:
                return getSAPSTRUCTUREFIELD() != null;
            case PowrmartPackage.DOCUMENT_ROOT__SAPTABLEINSTANCEPARAM:
                return getSAPTABLEINSTANCEPARAM() != null;
            case PowrmartPackage.DOCUMENT_ROOT__SAPTABLEPARAM:
                return getSAPTABLEPARAM() != null;
            case PowrmartPackage.DOCUMENT_ROOT__SAPVARIABLE:
                return getSAPVARIABLE() != null;
            case PowrmartPackage.DOCUMENT_ROOT__SCHEDULEINFO:
                return getSCHEDULEINFO() != null;
            case PowrmartPackage.DOCUMENT_ROOT__SCHEDULEOPTIONS:
                return getSCHEDULEOPTIONS() != null;
            case PowrmartPackage.DOCUMENT_ROOT__SCHEDULER:
                return getSCHEDULER() != null;
            case PowrmartPackage.DOCUMENT_ROOT__SEBLJOIN:
                return getSEBLJOIN() != null;
            case PowrmartPackage.DOCUMENT_ROOT__SEBLLINK:
                return getSEBLLINK() != null;
            case PowrmartPackage.DOCUMENT_ROOT__SEBLMVLINK:
                return getSEBLMVLINK() != null;
            case PowrmartPackage.DOCUMENT_ROOT__SEBLMVLINKREL:
                return getSEBLMVLINKREL() != null;
            case PowrmartPackage.DOCUMENT_ROOT__SEBLSRCINFO:
                return getSEBLSRCINFO() != null;
            case PowrmartPackage.DOCUMENT_ROOT__SESSION:
                return getSESSION() != null;
            case PowrmartPackage.DOCUMENT_ROOT__SESSIONCOMPONENT:
                return getSESSIONCOMPONENT() != null;
            case PowrmartPackage.DOCUMENT_ROOT__SESSIONEXTENSION:
                return getSESSIONEXTENSION() != null;
            case PowrmartPackage.DOCUMENT_ROOT__SESSTRANSFORMATIONGROUP:
                return getSESSTRANSFORMATIONGROUP() != null;
            case PowrmartPackage.DOCUMENT_ROOT__SESSTRANSFORMATIONINST:
                return getSESSTRANSFORMATIONINST() != null;
            case PowrmartPackage.DOCUMENT_ROOT__SHORTCUT:
                return getSHORTCUT() != null;
            case PowrmartPackage.DOCUMENT_ROOT__SOURCE:
                return getSOURCE() != null;
            case PowrmartPackage.DOCUMENT_ROOT__SOURCEFIELD:
                return getSOURCEFIELD() != null;
            case PowrmartPackage.DOCUMENT_ROOT__STARTOPTIONS:
                return getSTARTOPTIONS() != null;
            case PowrmartPackage.DOCUMENT_ROOT__TABLEATTRIBUTE:
                return getTABLEATTRIBUTE() != null;
            case PowrmartPackage.DOCUMENT_ROOT__TARGET:
                return getTARGET() != null;
            case PowrmartPackage.DOCUMENT_ROOT__TARGETFIELD:
                return getTARGETFIELD() != null;
            case PowrmartPackage.DOCUMENT_ROOT__TARGETINDEX:
                return getTARGETINDEX() != null;
            case PowrmartPackage.DOCUMENT_ROOT__TARGETINDEXFIELD:
                return getTARGETINDEXFIELD() != null;
            case PowrmartPackage.DOCUMENT_ROOT__TARGETLOADORDER:
                return getTARGETLOADORDER() != null;
            case PowrmartPackage.DOCUMENT_ROOT__TASK:
                return getTASK() != null;
            case PowrmartPackage.DOCUMENT_ROOT__TASKINSTANCE:
                return getTASKINSTANCE() != null;
            case PowrmartPackage.DOCUMENT_ROOT__TIMER:
                return getTIMER() != null;
            case PowrmartPackage.DOCUMENT_ROOT__TRANSFORMATION:
                return getTRANSFORMATION() != null;
            case PowrmartPackage.DOCUMENT_ROOT__TRANSFORMFIELD:
                return getTRANSFORMFIELD() != null;
            case PowrmartPackage.DOCUMENT_ROOT__TRANSFORMFIELDATTR:
                return getTRANSFORMFIELDATTR() != null;
            case PowrmartPackage.DOCUMENT_ROOT__TRANSFORMFIELDATTRDEF:
                return getTRANSFORMFIELDATTRDEF() != null;
            case PowrmartPackage.DOCUMENT_ROOT__TRANSFORMRESOURCEREF:
                return getTRANSFORMRESOURCEREF() != null;
            case PowrmartPackage.DOCUMENT_ROOT__VALUEPAIR:
                return getVALUEPAIR() != null;
            case PowrmartPackage.DOCUMENT_ROOT__WORKFLOW:
                return getWORKFLOW() != null;
            case PowrmartPackage.DOCUMENT_ROOT__WORKFLOWEVENT:
                return getWORKFLOWEVENT() != null;
            case PowrmartPackage.DOCUMENT_ROOT__WORKFLOWLINK:
                return getWORKFLOWLINK() != null;
            case PowrmartPackage.DOCUMENT_ROOT__WORKFLOWVARIABLE:
                return getWORKFLOWVARIABLE() != null;
            case PowrmartPackage.DOCUMENT_ROOT__WORKLET:
                return getWORKLET() != null;
            case PowrmartPackage.DOCUMENT_ROOT__XMLINFO:
                return getXMLINFO() != null;
            case PowrmartPackage.DOCUMENT_ROOT__XMLTEXT:
                return getXMLTEXT() != null;
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

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (mixed: ");
        result.append(mixed);
        result.append(')');
        return result.toString();
    }

} //DocumentRootImpl
