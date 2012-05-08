/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getASSOCIATEDSOURCEINSTANCE <em>ASSOCIATEDSOURCEINSTANCE</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getATTRIBUTE <em>ATTRIBUTE</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getCONFIG <em>CONFIG</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getCONFIGREFERENCE <em>CONFIGREFERENCE</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getCONNECTIONREFERENCE <em>CONNECTIONREFERENCE</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getCONNECTOR <em>CONNECTOR</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getCONWFRUNINFO <em>CONWFRUNINFO</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getCUSTOM <em>CUSTOM</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getDAILYFREQUENCY <em>DAILYFREQUENCY</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getENDOPTIONS <em>ENDOPTIONS</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getERPINFO <em>ERPINFO</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getERPSRCINFO <em>ERPSRCINFO</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getEXPRMACRO <em>EXPRMACRO</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getEXPRMACRODEPENDENCY <em>EXPRMACRODEPENDENCY</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getFIELDATTRIBUTE <em>FIELDATTRIBUTE</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getFIELDDEPENDENCY <em>FIELDDEPENDENCY</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getFILTER <em>FILTER</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getFLATFILE <em>FLATFILE</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getFOLDER <em>FOLDER</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getFOLDERVERSION <em>FOLDERVERSION</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getGROUP <em>GROUP</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getHASHKEY <em>HASHKEY</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getINITPROP <em>INITPROP</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getINSTANCE <em>INSTANCE</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getKEYRANGE <em>KEYRANGE</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getKEYWORD <em>KEYWORD</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getMACROARGUMENT <em>MACROARGUMENT</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getMACRODEPENDENCY <em>MACRODEPENDENCY</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getMAPDEPENDENCY <em>MAPDEPENDENCY</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getMAPPING <em>MAPPING</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getMAPPINGVARIABLE <em>MAPPINGVARIABLE</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getMAPPLET <em>MAPPLET</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getMETADATAEXTENSION <em>METADATAEXTENSION</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getPARTITION <em>PARTITION</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getPOWERMART <em>POWERMART</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getRECURRING <em>RECURRING</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getREPEAT <em>REPEAT</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getREPOSITORY <em>REPOSITORY</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getRESOURCEREFERENCE <em>RESOURCEREFERENCE</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getSAPCODEBLOCK <em>SAPCODEBLOCK</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getSAPFUNCINSTANCEPARAM <em>SAPFUNCINSTANCEPARAM</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getSAPFUNCINSTANCEPARAMFLD <em>SAPFUNCINSTANCEPARAMFLD</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getSAPFUNCPARAM <em>SAPFUNCPARAM</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getSAPFUNCTION <em>SAPFUNCTION</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getSAPFUNCTIONINSTANCE <em>SAPFUNCTIONINSTANCE</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getSAPOUTPUTPORT <em>SAPOUTPUTPORT</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getSAPPROGRAM <em>SAPPROGRAM</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getSAPPROGRAMFLOWOBJECT <em>SAPPROGRAMFLOWOBJECT</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getSAPSTRUCTURE <em>SAPSTRUCTURE</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getSAPSTRUCTUREFIELD <em>SAPSTRUCTUREFIELD</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getSAPTABLEINSTANCEPARAM <em>SAPTABLEINSTANCEPARAM</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getSAPTABLEPARAM <em>SAPTABLEPARAM</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getSAPVARIABLE <em>SAPVARIABLE</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getSCHEDULEINFO <em>SCHEDULEINFO</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getSCHEDULEOPTIONS <em>SCHEDULEOPTIONS</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getSCHEDULER <em>SCHEDULER</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getSEBLJOIN <em>SEBLJOIN</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getSEBLLINK <em>SEBLLINK</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getSEBLMVLINK <em>SEBLMVLINK</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getSEBLMVLINKREL <em>SEBLMVLINKREL</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getSEBLSRCINFO <em>SEBLSRCINFO</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getSESSION <em>SESSION</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getSESSIONCOMPONENT <em>SESSIONCOMPONENT</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getSESSIONEXTENSION <em>SESSIONEXTENSION</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getSESSTRANSFORMATIONGROUP <em>SESSTRANSFORMATIONGROUP</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getSESSTRANSFORMATIONINST <em>SESSTRANSFORMATIONINST</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getSHORTCUT <em>SHORTCUT</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getSOURCE <em>SOURCE</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getSOURCEFIELD <em>SOURCEFIELD</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getSTARTOPTIONS <em>STARTOPTIONS</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getTABLEATTRIBUTE <em>TABLEATTRIBUTE</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getTARGET <em>TARGET</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getTARGETFIELD <em>TARGETFIELD</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getTARGETINDEX <em>TARGETINDEX</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getTARGETINDEXFIELD <em>TARGETINDEXFIELD</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getTARGETLOADORDER <em>TARGETLOADORDER</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getTASK <em>TASK</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getTASKINSTANCE <em>TASKINSTANCE</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getTIMER <em>TIMER</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getTRANSFORMATION <em>TRANSFORMATION</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getTRANSFORMFIELD <em>TRANSFORMFIELD</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getTRANSFORMFIELDATTR <em>TRANSFORMFIELDATTR</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getTRANSFORMFIELDATTRDEF <em>TRANSFORMFIELDATTRDEF</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getTRANSFORMRESOURCEREF <em>TRANSFORMRESOURCEREF</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getVALUEPAIR <em>VALUEPAIR</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getWORKFLOW <em>WORKFLOW</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getWORKFLOWEVENT <em>WORKFLOWEVENT</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getWORKFLOWLINK <em>WORKFLOWLINK</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getWORKFLOWVARIABLE <em>WORKFLOWVARIABLE</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getWORKLET <em>WORKLET</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getXMLINFO <em>XMLINFO</em>}</li>
 *   <li>{@link Powrmart.DocumentRoot#getXMLTEXT <em>XMLTEXT</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
    /**
     * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mixed</em>' attribute list.
     * @see Powrmart.PowrmartPackage#getDocumentRoot_Mixed()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='elementWildcard' name=':mixed'"
     * @generated
     */
    FeatureMap getMixed();

    /**
     * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
     * The key is of type {@link java.lang.String},
     * and the value is of type {@link java.lang.String},
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>XMLNS Prefix Map</em>' map.
     * @see Powrmart.PowrmartPackage#getDocumentRoot_XMLNSPrefixMap()
     * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
     *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
     * @generated
     */
    EMap<String, String> getXMLNSPrefixMap();

    /**
     * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
     * The key is of type {@link java.lang.String},
     * and the value is of type {@link java.lang.String},
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>XSI Schema Location</em>' map.
     * @see Powrmart.PowrmartPackage#getDocumentRoot_XSISchemaLocation()
     * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
     *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
     * @generated
     */
    EMap<String, String> getXSISchemaLocation();

    /**
     * Returns the value of the '<em><b>ASSOCIATEDSOURCEINSTANCE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ASSOCIATEDSOURCEINSTANCE</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ASSOCIATEDSOURCEINSTANCE</em>' containment reference.
     * @see #setASSOCIATEDSOURCEINSTANCE(ASSOCIATEDSOURCEINSTANCEType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_ASSOCIATEDSOURCEINSTANCE()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='ASSOCIATED_SOURCE_INSTANCE' namespace='##targetNamespace'"
     * @generated
     */
    ASSOCIATEDSOURCEINSTANCEType getASSOCIATEDSOURCEINSTANCE();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getASSOCIATEDSOURCEINSTANCE <em>ASSOCIATEDSOURCEINSTANCE</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ASSOCIATEDSOURCEINSTANCE</em>' containment reference.
     * @see #getASSOCIATEDSOURCEINSTANCE()
     * @generated
     */
    void setASSOCIATEDSOURCEINSTANCE(ASSOCIATEDSOURCEINSTANCEType value);

    /**
     * Returns the value of the '<em><b>ATTRIBUTE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ATTRIBUTE</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ATTRIBUTE</em>' containment reference.
     * @see #setATTRIBUTE(ATTRIBUTEType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_ATTRIBUTE()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='ATTRIBUTE' namespace='##targetNamespace'"
     * @generated
     */
    ATTRIBUTEType getATTRIBUTE();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getATTRIBUTE <em>ATTRIBUTE</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ATTRIBUTE</em>' containment reference.
     * @see #getATTRIBUTE()
     * @generated
     */
    void setATTRIBUTE(ATTRIBUTEType value);

    /**
     * Returns the value of the '<em><b>CONFIG</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>CONFIG</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>CONFIG</em>' containment reference.
     * @see #setCONFIG(CONFIGType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_CONFIG()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='CONFIG' namespace='##targetNamespace'"
     * @generated
     */
    CONFIGType getCONFIG();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getCONFIG <em>CONFIG</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CONFIG</em>' containment reference.
     * @see #getCONFIG()
     * @generated
     */
    void setCONFIG(CONFIGType value);

    /**
     * Returns the value of the '<em><b>CONFIGREFERENCE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>CONFIGREFERENCE</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>CONFIGREFERENCE</em>' containment reference.
     * @see #setCONFIGREFERENCE(CONFIGREFERENCEType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_CONFIGREFERENCE()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='CONFIGREFERENCE' namespace='##targetNamespace'"
     * @generated
     */
    CONFIGREFERENCEType getCONFIGREFERENCE();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getCONFIGREFERENCE <em>CONFIGREFERENCE</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CONFIGREFERENCE</em>' containment reference.
     * @see #getCONFIGREFERENCE()
     * @generated
     */
    void setCONFIGREFERENCE(CONFIGREFERENCEType value);

    /**
     * Returns the value of the '<em><b>CONNECTIONREFERENCE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>CONNECTIONREFERENCE</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>CONNECTIONREFERENCE</em>' containment reference.
     * @see #setCONNECTIONREFERENCE(CONNECTIONREFERENCEType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_CONNECTIONREFERENCE()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='CONNECTIONREFERENCE' namespace='##targetNamespace'"
     * @generated
     */
    CONNECTIONREFERENCEType getCONNECTIONREFERENCE();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getCONNECTIONREFERENCE <em>CONNECTIONREFERENCE</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CONNECTIONREFERENCE</em>' containment reference.
     * @see #getCONNECTIONREFERENCE()
     * @generated
     */
    void setCONNECTIONREFERENCE(CONNECTIONREFERENCEType value);

    /**
     * Returns the value of the '<em><b>CONNECTOR</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>CONNECTOR</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>CONNECTOR</em>' containment reference.
     * @see #setCONNECTOR(CONNECTORType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_CONNECTOR()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='CONNECTOR' namespace='##targetNamespace'"
     * @generated
     */
    CONNECTORType getCONNECTOR();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getCONNECTOR <em>CONNECTOR</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CONNECTOR</em>' containment reference.
     * @see #getCONNECTOR()
     * @generated
     */
    void setCONNECTOR(CONNECTORType value);

    /**
     * Returns the value of the '<em><b>CONWFRUNINFO</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>CONWFRUNINFO</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>CONWFRUNINFO</em>' containment reference.
     * @see #setCONWFRUNINFO(CONWFRUNINFOType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_CONWFRUNINFO()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='CONWFRUNINFO' namespace='##targetNamespace'"
     * @generated
     */
    CONWFRUNINFOType getCONWFRUNINFO();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getCONWFRUNINFO <em>CONWFRUNINFO</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CONWFRUNINFO</em>' containment reference.
     * @see #getCONWFRUNINFO()
     * @generated
     */
    void setCONWFRUNINFO(CONWFRUNINFOType value);

    /**
     * Returns the value of the '<em><b>CUSTOM</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>CUSTOM</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>CUSTOM</em>' containment reference.
     * @see #setCUSTOM(CUSTOMType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_CUSTOM()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='CUSTOM' namespace='##targetNamespace'"
     * @generated
     */
    CUSTOMType getCUSTOM();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getCUSTOM <em>CUSTOM</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CUSTOM</em>' containment reference.
     * @see #getCUSTOM()
     * @generated
     */
    void setCUSTOM(CUSTOMType value);

    /**
     * Returns the value of the '<em><b>DAILYFREQUENCY</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DAILYFREQUENCY</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DAILYFREQUENCY</em>' containment reference.
     * @see #setDAILYFREQUENCY(DAILYFREQUENCYType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_DAILYFREQUENCY()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='DAILYFREQUENCY' namespace='##targetNamespace'"
     * @generated
     */
    DAILYFREQUENCYType getDAILYFREQUENCY();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getDAILYFREQUENCY <em>DAILYFREQUENCY</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DAILYFREQUENCY</em>' containment reference.
     * @see #getDAILYFREQUENCY()
     * @generated
     */
    void setDAILYFREQUENCY(DAILYFREQUENCYType value);

    /**
     * Returns the value of the '<em><b>ENDOPTIONS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ENDOPTIONS</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ENDOPTIONS</em>' containment reference.
     * @see #setENDOPTIONS(ENDOPTIONSType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_ENDOPTIONS()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='ENDOPTIONS' namespace='##targetNamespace'"
     * @generated
     */
    ENDOPTIONSType getENDOPTIONS();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getENDOPTIONS <em>ENDOPTIONS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ENDOPTIONS</em>' containment reference.
     * @see #getENDOPTIONS()
     * @generated
     */
    void setENDOPTIONS(ENDOPTIONSType value);

    /**
     * Returns the value of the '<em><b>ERPINFO</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ERPINFO</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ERPINFO</em>' containment reference.
     * @see #setERPINFO(ERPINFOType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_ERPINFO()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='ERPINFO' namespace='##targetNamespace'"
     * @generated
     */
    ERPINFOType getERPINFO();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getERPINFO <em>ERPINFO</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ERPINFO</em>' containment reference.
     * @see #getERPINFO()
     * @generated
     */
    void setERPINFO(ERPINFOType value);

    /**
     * Returns the value of the '<em><b>ERPSRCINFO</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ERPSRCINFO</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ERPSRCINFO</em>' containment reference.
     * @see #setERPSRCINFO(ERPSRCINFOType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_ERPSRCINFO()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='ERPSRCINFO' namespace='##targetNamespace'"
     * @generated
     */
    ERPSRCINFOType getERPSRCINFO();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getERPSRCINFO <em>ERPSRCINFO</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ERPSRCINFO</em>' containment reference.
     * @see #getERPSRCINFO()
     * @generated
     */
    void setERPSRCINFO(ERPSRCINFOType value);

    /**
     * Returns the value of the '<em><b>EXPRMACRO</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>EXPRMACRO</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>EXPRMACRO</em>' containment reference.
     * @see #setEXPRMACRO(EXPRMACROType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_EXPRMACRO()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='EXPRMACRO' namespace='##targetNamespace'"
     * @generated
     */
    EXPRMACROType getEXPRMACRO();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getEXPRMACRO <em>EXPRMACRO</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>EXPRMACRO</em>' containment reference.
     * @see #getEXPRMACRO()
     * @generated
     */
    void setEXPRMACRO(EXPRMACROType value);

    /**
     * Returns the value of the '<em><b>EXPRMACRODEPENDENCY</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>EXPRMACRODEPENDENCY</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>EXPRMACRODEPENDENCY</em>' containment reference.
     * @see #setEXPRMACRODEPENDENCY(EXPRMACRODEPENDENCYType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_EXPRMACRODEPENDENCY()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='EXPRMACRODEPENDENCY' namespace='##targetNamespace'"
     * @generated
     */
    EXPRMACRODEPENDENCYType getEXPRMACRODEPENDENCY();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getEXPRMACRODEPENDENCY <em>EXPRMACRODEPENDENCY</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>EXPRMACRODEPENDENCY</em>' containment reference.
     * @see #getEXPRMACRODEPENDENCY()
     * @generated
     */
    void setEXPRMACRODEPENDENCY(EXPRMACRODEPENDENCYType value);

    /**
     * Returns the value of the '<em><b>FIELDATTRIBUTE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>FIELDATTRIBUTE</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>FIELDATTRIBUTE</em>' containment reference.
     * @see #setFIELDATTRIBUTE(FIELDATTRIBUTEType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_FIELDATTRIBUTE()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='FIELDATTRIBUTE' namespace='##targetNamespace'"
     * @generated
     */
    FIELDATTRIBUTEType getFIELDATTRIBUTE();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getFIELDATTRIBUTE <em>FIELDATTRIBUTE</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>FIELDATTRIBUTE</em>' containment reference.
     * @see #getFIELDATTRIBUTE()
     * @generated
     */
    void setFIELDATTRIBUTE(FIELDATTRIBUTEType value);

    /**
     * Returns the value of the '<em><b>FIELDDEPENDENCY</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>FIELDDEPENDENCY</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>FIELDDEPENDENCY</em>' containment reference.
     * @see #setFIELDDEPENDENCY(FIELDDEPENDENCYType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_FIELDDEPENDENCY()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='FIELDDEPENDENCY' namespace='##targetNamespace'"
     * @generated
     */
    FIELDDEPENDENCYType getFIELDDEPENDENCY();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getFIELDDEPENDENCY <em>FIELDDEPENDENCY</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>FIELDDEPENDENCY</em>' containment reference.
     * @see #getFIELDDEPENDENCY()
     * @generated
     */
    void setFIELDDEPENDENCY(FIELDDEPENDENCYType value);

    /**
     * Returns the value of the '<em><b>FILTER</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>FILTER</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>FILTER</em>' containment reference.
     * @see #setFILTER(FILTERType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_FILTER()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='FILTER' namespace='##targetNamespace'"
     * @generated
     */
    FILTERType getFILTER();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getFILTER <em>FILTER</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>FILTER</em>' containment reference.
     * @see #getFILTER()
     * @generated
     */
    void setFILTER(FILTERType value);

    /**
     * Returns the value of the '<em><b>FLATFILE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>FLATFILE</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>FLATFILE</em>' containment reference.
     * @see #setFLATFILE(FLATFILEType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_FLATFILE()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='FLATFILE' namespace='##targetNamespace'"
     * @generated
     */
    FLATFILEType getFLATFILE();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getFLATFILE <em>FLATFILE</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>FLATFILE</em>' containment reference.
     * @see #getFLATFILE()
     * @generated
     */
    void setFLATFILE(FLATFILEType value);

    /**
     * Returns the value of the '<em><b>FOLDER</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>FOLDER</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>FOLDER</em>' containment reference.
     * @see #setFOLDER(FOLDERType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_FOLDER()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='FOLDER' namespace='##targetNamespace'"
     * @generated
     */
    FOLDERType getFOLDER();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getFOLDER <em>FOLDER</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>FOLDER</em>' containment reference.
     * @see #getFOLDER()
     * @generated
     */
    void setFOLDER(FOLDERType value);

    /**
     * Returns the value of the '<em><b>FOLDERVERSION</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>FOLDERVERSION</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>FOLDERVERSION</em>' containment reference.
     * @see #setFOLDERVERSION(FOLDERVERSIONType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_FOLDERVERSION()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='FOLDERVERSION' namespace='##targetNamespace'"
     * @generated
     */
    FOLDERVERSIONType getFOLDERVERSION();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getFOLDERVERSION <em>FOLDERVERSION</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>FOLDERVERSION</em>' containment reference.
     * @see #getFOLDERVERSION()
     * @generated
     */
    void setFOLDERVERSION(FOLDERVERSIONType value);

    /**
     * Returns the value of the '<em><b>GROUP</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>GROUP</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>GROUP</em>' containment reference.
     * @see #setGROUP(GROUPType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_GROUP()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='GROUP' namespace='##targetNamespace'"
     * @generated
     */
    GROUPType getGROUP();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getGROUP <em>GROUP</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>GROUP</em>' containment reference.
     * @see #getGROUP()
     * @generated
     */
    void setGROUP(GROUPType value);

    /**
     * Returns the value of the '<em><b>HASHKEY</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>HASHKEY</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>HASHKEY</em>' containment reference.
     * @see #setHASHKEY(HASHKEYType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_HASHKEY()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='HASHKEY' namespace='##targetNamespace'"
     * @generated
     */
    HASHKEYType getHASHKEY();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getHASHKEY <em>HASHKEY</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>HASHKEY</em>' containment reference.
     * @see #getHASHKEY()
     * @generated
     */
    void setHASHKEY(HASHKEYType value);

    /**
     * Returns the value of the '<em><b>INITPROP</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>INITPROP</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>INITPROP</em>' containment reference.
     * @see #setINITPROP(INITPROPType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_INITPROP()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='INITPROP' namespace='##targetNamespace'"
     * @generated
     */
    INITPROPType getINITPROP();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getINITPROP <em>INITPROP</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>INITPROP</em>' containment reference.
     * @see #getINITPROP()
     * @generated
     */
    void setINITPROP(INITPROPType value);

    /**
     * Returns the value of the '<em><b>INSTANCE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>INSTANCE</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>INSTANCE</em>' containment reference.
     * @see #setINSTANCE(INSTANCEType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_INSTANCE()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='INSTANCE' namespace='##targetNamespace'"
     * @generated
     */
    INSTANCEType getINSTANCE();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getINSTANCE <em>INSTANCE</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>INSTANCE</em>' containment reference.
     * @see #getINSTANCE()
     * @generated
     */
    void setINSTANCE(INSTANCEType value);

    /**
     * Returns the value of the '<em><b>KEYRANGE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>KEYRANGE</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>KEYRANGE</em>' containment reference.
     * @see #setKEYRANGE(KEYRANGEType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_KEYRANGE()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='KEYRANGE' namespace='##targetNamespace'"
     * @generated
     */
    KEYRANGEType getKEYRANGE();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getKEYRANGE <em>KEYRANGE</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>KEYRANGE</em>' containment reference.
     * @see #getKEYRANGE()
     * @generated
     */
    void setKEYRANGE(KEYRANGEType value);

    /**
     * Returns the value of the '<em><b>KEYWORD</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>KEYWORD</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>KEYWORD</em>' containment reference.
     * @see #setKEYWORD(KEYWORDType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_KEYWORD()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='KEYWORD' namespace='##targetNamespace'"
     * @generated
     */
    KEYWORDType getKEYWORD();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getKEYWORD <em>KEYWORD</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>KEYWORD</em>' containment reference.
     * @see #getKEYWORD()
     * @generated
     */
    void setKEYWORD(KEYWORDType value);

    /**
     * Returns the value of the '<em><b>MACROARGUMENT</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>MACROARGUMENT</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>MACROARGUMENT</em>' containment reference.
     * @see #setMACROARGUMENT(MACROARGUMENTType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_MACROARGUMENT()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='MACROARGUMENT' namespace='##targetNamespace'"
     * @generated
     */
    MACROARGUMENTType getMACROARGUMENT();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getMACROARGUMENT <em>MACROARGUMENT</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>MACROARGUMENT</em>' containment reference.
     * @see #getMACROARGUMENT()
     * @generated
     */
    void setMACROARGUMENT(MACROARGUMENTType value);

    /**
     * Returns the value of the '<em><b>MACRODEPENDENCY</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>MACRODEPENDENCY</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>MACRODEPENDENCY</em>' containment reference.
     * @see #setMACRODEPENDENCY(MACRODEPENDENCYType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_MACRODEPENDENCY()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='MACRODEPENDENCY' namespace='##targetNamespace'"
     * @generated
     */
    MACRODEPENDENCYType getMACRODEPENDENCY();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getMACRODEPENDENCY <em>MACRODEPENDENCY</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>MACRODEPENDENCY</em>' containment reference.
     * @see #getMACRODEPENDENCY()
     * @generated
     */
    void setMACRODEPENDENCY(MACRODEPENDENCYType value);

    /**
     * Returns the value of the '<em><b>MAPDEPENDENCY</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>MAPDEPENDENCY</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>MAPDEPENDENCY</em>' containment reference.
     * @see #setMAPDEPENDENCY(MAPDEPENDENCYType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_MAPDEPENDENCY()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='MAPDEPENDENCY' namespace='##targetNamespace'"
     * @generated
     */
    MAPDEPENDENCYType getMAPDEPENDENCY();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getMAPDEPENDENCY <em>MAPDEPENDENCY</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>MAPDEPENDENCY</em>' containment reference.
     * @see #getMAPDEPENDENCY()
     * @generated
     */
    void setMAPDEPENDENCY(MAPDEPENDENCYType value);

    /**
     * Returns the value of the '<em><b>MAPPING</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>MAPPING</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>MAPPING</em>' containment reference.
     * @see #setMAPPING(MAPPINGType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_MAPPING()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='MAPPING' namespace='##targetNamespace'"
     * @generated
     */
    MAPPINGType getMAPPING();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getMAPPING <em>MAPPING</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>MAPPING</em>' containment reference.
     * @see #getMAPPING()
     * @generated
     */
    void setMAPPING(MAPPINGType value);

    /**
     * Returns the value of the '<em><b>MAPPINGVARIABLE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>MAPPINGVARIABLE</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>MAPPINGVARIABLE</em>' containment reference.
     * @see #setMAPPINGVARIABLE(MAPPINGVARIABLEType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_MAPPINGVARIABLE()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='MAPPINGVARIABLE' namespace='##targetNamespace'"
     * @generated
     */
    MAPPINGVARIABLEType getMAPPINGVARIABLE();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getMAPPINGVARIABLE <em>MAPPINGVARIABLE</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>MAPPINGVARIABLE</em>' containment reference.
     * @see #getMAPPINGVARIABLE()
     * @generated
     */
    void setMAPPINGVARIABLE(MAPPINGVARIABLEType value);

    /**
     * Returns the value of the '<em><b>MAPPLET</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>MAPPLET</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>MAPPLET</em>' containment reference.
     * @see #setMAPPLET(MAPPLETType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_MAPPLET()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='MAPPLET' namespace='##targetNamespace'"
     * @generated
     */
    MAPPLETType getMAPPLET();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getMAPPLET <em>MAPPLET</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>MAPPLET</em>' containment reference.
     * @see #getMAPPLET()
     * @generated
     */
    void setMAPPLET(MAPPLETType value);

    /**
     * Returns the value of the '<em><b>METADATAEXTENSION</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>METADATAEXTENSION</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>METADATAEXTENSION</em>' containment reference.
     * @see #setMETADATAEXTENSION(METADATAEXTENSIONType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_METADATAEXTENSION()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='METADATAEXTENSION' namespace='##targetNamespace'"
     * @generated
     */
    METADATAEXTENSIONType getMETADATAEXTENSION();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getMETADATAEXTENSION <em>METADATAEXTENSION</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>METADATAEXTENSION</em>' containment reference.
     * @see #getMETADATAEXTENSION()
     * @generated
     */
    void setMETADATAEXTENSION(METADATAEXTENSIONType value);

    /**
     * Returns the value of the '<em><b>PARTITION</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PARTITION</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PARTITION</em>' containment reference.
     * @see #setPARTITION(PARTITIONType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_PARTITION()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='PARTITION' namespace='##targetNamespace'"
     * @generated
     */
    PARTITIONType getPARTITION();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getPARTITION <em>PARTITION</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PARTITION</em>' containment reference.
     * @see #getPARTITION()
     * @generated
     */
    void setPARTITION(PARTITIONType value);

    /**
     * Returns the value of the '<em><b>POWERMART</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>POWERMART</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>POWERMART</em>' containment reference.
     * @see #setPOWERMART(POWERMARTType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_POWERMART()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='POWERMART' namespace='##targetNamespace'"
     * @generated
     */
    POWERMARTType getPOWERMART();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getPOWERMART <em>POWERMART</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>POWERMART</em>' containment reference.
     * @see #getPOWERMART()
     * @generated
     */
    void setPOWERMART(POWERMARTType value);

    /**
     * Returns the value of the '<em><b>RECURRING</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>RECURRING</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>RECURRING</em>' containment reference.
     * @see #setRECURRING(RECURRINGType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_RECURRING()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='RECURRING' namespace='##targetNamespace'"
     * @generated
     */
    RECURRINGType getRECURRING();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getRECURRING <em>RECURRING</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>RECURRING</em>' containment reference.
     * @see #getRECURRING()
     * @generated
     */
    void setRECURRING(RECURRINGType value);

    /**
     * Returns the value of the '<em><b>REPEAT</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>REPEAT</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>REPEAT</em>' containment reference.
     * @see #setREPEAT(REPEATType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_REPEAT()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='REPEAT' namespace='##targetNamespace'"
     * @generated
     */
    REPEATType getREPEAT();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getREPEAT <em>REPEAT</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>REPEAT</em>' containment reference.
     * @see #getREPEAT()
     * @generated
     */
    void setREPEAT(REPEATType value);

    /**
     * Returns the value of the '<em><b>REPOSITORY</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>REPOSITORY</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>REPOSITORY</em>' containment reference.
     * @see #setREPOSITORY(REPOSITORYType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_REPOSITORY()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='REPOSITORY' namespace='##targetNamespace'"
     * @generated
     */
    REPOSITORYType getREPOSITORY();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getREPOSITORY <em>REPOSITORY</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>REPOSITORY</em>' containment reference.
     * @see #getREPOSITORY()
     * @generated
     */
    void setREPOSITORY(REPOSITORYType value);

    /**
     * Returns the value of the '<em><b>RESOURCEREFERENCE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>RESOURCEREFERENCE</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>RESOURCEREFERENCE</em>' containment reference.
     * @see #setRESOURCEREFERENCE(RESOURCEREFERENCEType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_RESOURCEREFERENCE()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='RESOURCEREFERENCE' namespace='##targetNamespace'"
     * @generated
     */
    RESOURCEREFERENCEType getRESOURCEREFERENCE();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getRESOURCEREFERENCE <em>RESOURCEREFERENCE</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>RESOURCEREFERENCE</em>' containment reference.
     * @see #getRESOURCEREFERENCE()
     * @generated
     */
    void setRESOURCEREFERENCE(RESOURCEREFERENCEType value);

    /**
     * Returns the value of the '<em><b>SAPCODEBLOCK</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SAPCODEBLOCK</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SAPCODEBLOCK</em>' containment reference.
     * @see #setSAPCODEBLOCK(SAPCODEBLOCKType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_SAPCODEBLOCK()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='SAPCODEBLOCK' namespace='##targetNamespace'"
     * @generated
     */
    SAPCODEBLOCKType getSAPCODEBLOCK();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getSAPCODEBLOCK <em>SAPCODEBLOCK</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SAPCODEBLOCK</em>' containment reference.
     * @see #getSAPCODEBLOCK()
     * @generated
     */
    void setSAPCODEBLOCK(SAPCODEBLOCKType value);

    /**
     * Returns the value of the '<em><b>SAPFUNCINSTANCEPARAM</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SAPFUNCINSTANCEPARAM</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SAPFUNCINSTANCEPARAM</em>' containment reference.
     * @see #setSAPFUNCINSTANCEPARAM(SAPFUNCINSTANCEPARAMType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_SAPFUNCINSTANCEPARAM()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='SAPFUNCINSTANCEPARAM' namespace='##targetNamespace'"
     * @generated
     */
    SAPFUNCINSTANCEPARAMType getSAPFUNCINSTANCEPARAM();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getSAPFUNCINSTANCEPARAM <em>SAPFUNCINSTANCEPARAM</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SAPFUNCINSTANCEPARAM</em>' containment reference.
     * @see #getSAPFUNCINSTANCEPARAM()
     * @generated
     */
    void setSAPFUNCINSTANCEPARAM(SAPFUNCINSTANCEPARAMType value);

    /**
     * Returns the value of the '<em><b>SAPFUNCINSTANCEPARAMFLD</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SAPFUNCINSTANCEPARAMFLD</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SAPFUNCINSTANCEPARAMFLD</em>' containment reference.
     * @see #setSAPFUNCINSTANCEPARAMFLD(SAPFUNCINSTANCEPARAMFLDType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_SAPFUNCINSTANCEPARAMFLD()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='SAPFUNCINSTANCEPARAMFLD' namespace='##targetNamespace'"
     * @generated
     */
    SAPFUNCINSTANCEPARAMFLDType getSAPFUNCINSTANCEPARAMFLD();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getSAPFUNCINSTANCEPARAMFLD <em>SAPFUNCINSTANCEPARAMFLD</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SAPFUNCINSTANCEPARAMFLD</em>' containment reference.
     * @see #getSAPFUNCINSTANCEPARAMFLD()
     * @generated
     */
    void setSAPFUNCINSTANCEPARAMFLD(SAPFUNCINSTANCEPARAMFLDType value);

    /**
     * Returns the value of the '<em><b>SAPFUNCPARAM</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SAPFUNCPARAM</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SAPFUNCPARAM</em>' containment reference.
     * @see #setSAPFUNCPARAM(SAPFUNCPARAMType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_SAPFUNCPARAM()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='SAPFUNCPARAM' namespace='##targetNamespace'"
     * @generated
     */
    SAPFUNCPARAMType getSAPFUNCPARAM();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getSAPFUNCPARAM <em>SAPFUNCPARAM</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SAPFUNCPARAM</em>' containment reference.
     * @see #getSAPFUNCPARAM()
     * @generated
     */
    void setSAPFUNCPARAM(SAPFUNCPARAMType value);

    /**
     * Returns the value of the '<em><b>SAPFUNCTION</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SAPFUNCTION</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SAPFUNCTION</em>' containment reference.
     * @see #setSAPFUNCTION(SAPFUNCTIONType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_SAPFUNCTION()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='SAPFUNCTION' namespace='##targetNamespace'"
     * @generated
     */
    SAPFUNCTIONType getSAPFUNCTION();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getSAPFUNCTION <em>SAPFUNCTION</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SAPFUNCTION</em>' containment reference.
     * @see #getSAPFUNCTION()
     * @generated
     */
    void setSAPFUNCTION(SAPFUNCTIONType value);

    /**
     * Returns the value of the '<em><b>SAPFUNCTIONINSTANCE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SAPFUNCTIONINSTANCE</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SAPFUNCTIONINSTANCE</em>' containment reference.
     * @see #setSAPFUNCTIONINSTANCE(SAPFUNCTIONINSTANCEType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_SAPFUNCTIONINSTANCE()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='SAPFUNCTIONINSTANCE' namespace='##targetNamespace'"
     * @generated
     */
    SAPFUNCTIONINSTANCEType getSAPFUNCTIONINSTANCE();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getSAPFUNCTIONINSTANCE <em>SAPFUNCTIONINSTANCE</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SAPFUNCTIONINSTANCE</em>' containment reference.
     * @see #getSAPFUNCTIONINSTANCE()
     * @generated
     */
    void setSAPFUNCTIONINSTANCE(SAPFUNCTIONINSTANCEType value);

    /**
     * Returns the value of the '<em><b>SAPOUTPUTPORT</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SAPOUTPUTPORT</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SAPOUTPUTPORT</em>' containment reference.
     * @see #setSAPOUTPUTPORT(SAPOUTPUTPORTType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_SAPOUTPUTPORT()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='SAPOUTPUTPORT' namespace='##targetNamespace'"
     * @generated
     */
    SAPOUTPUTPORTType getSAPOUTPUTPORT();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getSAPOUTPUTPORT <em>SAPOUTPUTPORT</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SAPOUTPUTPORT</em>' containment reference.
     * @see #getSAPOUTPUTPORT()
     * @generated
     */
    void setSAPOUTPUTPORT(SAPOUTPUTPORTType value);

    /**
     * Returns the value of the '<em><b>SAPPROGRAM</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SAPPROGRAM</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SAPPROGRAM</em>' containment reference.
     * @see #setSAPPROGRAM(SAPPROGRAMType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_SAPPROGRAM()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='SAPPROGRAM' namespace='##targetNamespace'"
     * @generated
     */
    SAPPROGRAMType getSAPPROGRAM();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getSAPPROGRAM <em>SAPPROGRAM</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SAPPROGRAM</em>' containment reference.
     * @see #getSAPPROGRAM()
     * @generated
     */
    void setSAPPROGRAM(SAPPROGRAMType value);

    /**
     * Returns the value of the '<em><b>SAPPROGRAMFLOWOBJECT</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SAPPROGRAMFLOWOBJECT</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SAPPROGRAMFLOWOBJECT</em>' containment reference.
     * @see #setSAPPROGRAMFLOWOBJECT(SAPPROGRAMFLOWOBJECTType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_SAPPROGRAMFLOWOBJECT()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='SAPPROGRAMFLOWOBJECT' namespace='##targetNamespace'"
     * @generated
     */
    SAPPROGRAMFLOWOBJECTType getSAPPROGRAMFLOWOBJECT();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getSAPPROGRAMFLOWOBJECT <em>SAPPROGRAMFLOWOBJECT</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SAPPROGRAMFLOWOBJECT</em>' containment reference.
     * @see #getSAPPROGRAMFLOWOBJECT()
     * @generated
     */
    void setSAPPROGRAMFLOWOBJECT(SAPPROGRAMFLOWOBJECTType value);

    /**
     * Returns the value of the '<em><b>SAPSTRUCTURE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SAPSTRUCTURE</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SAPSTRUCTURE</em>' containment reference.
     * @see #setSAPSTRUCTURE(SAPSTRUCTUREType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_SAPSTRUCTURE()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='SAPSTRUCTURE' namespace='##targetNamespace'"
     * @generated
     */
    SAPSTRUCTUREType getSAPSTRUCTURE();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getSAPSTRUCTURE <em>SAPSTRUCTURE</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SAPSTRUCTURE</em>' containment reference.
     * @see #getSAPSTRUCTURE()
     * @generated
     */
    void setSAPSTRUCTURE(SAPSTRUCTUREType value);

    /**
     * Returns the value of the '<em><b>SAPSTRUCTUREFIELD</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SAPSTRUCTUREFIELD</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SAPSTRUCTUREFIELD</em>' containment reference.
     * @see #setSAPSTRUCTUREFIELD(SAPSTRUCTUREFIELDType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_SAPSTRUCTUREFIELD()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='SAPSTRUCTUREFIELD' namespace='##targetNamespace'"
     * @generated
     */
    SAPSTRUCTUREFIELDType getSAPSTRUCTUREFIELD();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getSAPSTRUCTUREFIELD <em>SAPSTRUCTUREFIELD</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SAPSTRUCTUREFIELD</em>' containment reference.
     * @see #getSAPSTRUCTUREFIELD()
     * @generated
     */
    void setSAPSTRUCTUREFIELD(SAPSTRUCTUREFIELDType value);

    /**
     * Returns the value of the '<em><b>SAPTABLEINSTANCEPARAM</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SAPTABLEINSTANCEPARAM</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SAPTABLEINSTANCEPARAM</em>' containment reference.
     * @see #setSAPTABLEINSTANCEPARAM(SAPTABLEINSTANCEPARAMType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_SAPTABLEINSTANCEPARAM()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='SAPTABLEINSTANCEPARAM' namespace='##targetNamespace'"
     * @generated
     */
    SAPTABLEINSTANCEPARAMType getSAPTABLEINSTANCEPARAM();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getSAPTABLEINSTANCEPARAM <em>SAPTABLEINSTANCEPARAM</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SAPTABLEINSTANCEPARAM</em>' containment reference.
     * @see #getSAPTABLEINSTANCEPARAM()
     * @generated
     */
    void setSAPTABLEINSTANCEPARAM(SAPTABLEINSTANCEPARAMType value);

    /**
     * Returns the value of the '<em><b>SAPTABLEPARAM</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SAPTABLEPARAM</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SAPTABLEPARAM</em>' containment reference.
     * @see #setSAPTABLEPARAM(SAPTABLEPARAMType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_SAPTABLEPARAM()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='SAPTABLEPARAM' namespace='##targetNamespace'"
     * @generated
     */
    SAPTABLEPARAMType getSAPTABLEPARAM();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getSAPTABLEPARAM <em>SAPTABLEPARAM</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SAPTABLEPARAM</em>' containment reference.
     * @see #getSAPTABLEPARAM()
     * @generated
     */
    void setSAPTABLEPARAM(SAPTABLEPARAMType value);

    /**
     * Returns the value of the '<em><b>SAPVARIABLE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SAPVARIABLE</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SAPVARIABLE</em>' containment reference.
     * @see #setSAPVARIABLE(SAPVARIABLEType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_SAPVARIABLE()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='SAPVARIABLE' namespace='##targetNamespace'"
     * @generated
     */
    SAPVARIABLEType getSAPVARIABLE();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getSAPVARIABLE <em>SAPVARIABLE</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SAPVARIABLE</em>' containment reference.
     * @see #getSAPVARIABLE()
     * @generated
     */
    void setSAPVARIABLE(SAPVARIABLEType value);

    /**
     * Returns the value of the '<em><b>SCHEDULEINFO</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SCHEDULEINFO</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SCHEDULEINFO</em>' containment reference.
     * @see #setSCHEDULEINFO(SCHEDULEINFOType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_SCHEDULEINFO()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='SCHEDULEINFO' namespace='##targetNamespace'"
     * @generated
     */
    SCHEDULEINFOType getSCHEDULEINFO();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getSCHEDULEINFO <em>SCHEDULEINFO</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SCHEDULEINFO</em>' containment reference.
     * @see #getSCHEDULEINFO()
     * @generated
     */
    void setSCHEDULEINFO(SCHEDULEINFOType value);

    /**
     * Returns the value of the '<em><b>SCHEDULEOPTIONS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SCHEDULEOPTIONS</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SCHEDULEOPTIONS</em>' containment reference.
     * @see #setSCHEDULEOPTIONS(SCHEDULEOPTIONSType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_SCHEDULEOPTIONS()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='SCHEDULEOPTIONS' namespace='##targetNamespace'"
     * @generated
     */
    SCHEDULEOPTIONSType getSCHEDULEOPTIONS();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getSCHEDULEOPTIONS <em>SCHEDULEOPTIONS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SCHEDULEOPTIONS</em>' containment reference.
     * @see #getSCHEDULEOPTIONS()
     * @generated
     */
    void setSCHEDULEOPTIONS(SCHEDULEOPTIONSType value);

    /**
     * Returns the value of the '<em><b>SCHEDULER</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SCHEDULER</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SCHEDULER</em>' containment reference.
     * @see #setSCHEDULER(SCHEDULERType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_SCHEDULER()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='SCHEDULER' namespace='##targetNamespace'"
     * @generated
     */
    SCHEDULERType getSCHEDULER();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getSCHEDULER <em>SCHEDULER</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SCHEDULER</em>' containment reference.
     * @see #getSCHEDULER()
     * @generated
     */
    void setSCHEDULER(SCHEDULERType value);

    /**
     * Returns the value of the '<em><b>SEBLJOIN</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SEBLJOIN</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SEBLJOIN</em>' containment reference.
     * @see #setSEBLJOIN(SEBLJOINType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_SEBLJOIN()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='SEBLJOIN' namespace='##targetNamespace'"
     * @generated
     */
    SEBLJOINType getSEBLJOIN();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getSEBLJOIN <em>SEBLJOIN</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SEBLJOIN</em>' containment reference.
     * @see #getSEBLJOIN()
     * @generated
     */
    void setSEBLJOIN(SEBLJOINType value);

    /**
     * Returns the value of the '<em><b>SEBLLINK</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SEBLLINK</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SEBLLINK</em>' containment reference.
     * @see #setSEBLLINK(SEBLLINKType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_SEBLLINK()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='SEBLLINK' namespace='##targetNamespace'"
     * @generated
     */
    SEBLLINKType getSEBLLINK();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getSEBLLINK <em>SEBLLINK</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SEBLLINK</em>' containment reference.
     * @see #getSEBLLINK()
     * @generated
     */
    void setSEBLLINK(SEBLLINKType value);

    /**
     * Returns the value of the '<em><b>SEBLMVLINK</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SEBLMVLINK</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SEBLMVLINK</em>' containment reference.
     * @see #setSEBLMVLINK(SEBLMVLINKType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_SEBLMVLINK()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='SEBLMVLINK' namespace='##targetNamespace'"
     * @generated
     */
    SEBLMVLINKType getSEBLMVLINK();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getSEBLMVLINK <em>SEBLMVLINK</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SEBLMVLINK</em>' containment reference.
     * @see #getSEBLMVLINK()
     * @generated
     */
    void setSEBLMVLINK(SEBLMVLINKType value);

    /**
     * Returns the value of the '<em><b>SEBLMVLINKREL</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SEBLMVLINKREL</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SEBLMVLINKREL</em>' containment reference.
     * @see #setSEBLMVLINKREL(SEBLMVLINKRELType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_SEBLMVLINKREL()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='SEBLMVLINKREL' namespace='##targetNamespace'"
     * @generated
     */
    SEBLMVLINKRELType getSEBLMVLINKREL();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getSEBLMVLINKREL <em>SEBLMVLINKREL</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SEBLMVLINKREL</em>' containment reference.
     * @see #getSEBLMVLINKREL()
     * @generated
     */
    void setSEBLMVLINKREL(SEBLMVLINKRELType value);

    /**
     * Returns the value of the '<em><b>SEBLSRCINFO</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SEBLSRCINFO</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SEBLSRCINFO</em>' containment reference.
     * @see #setSEBLSRCINFO(SEBLSRCINFOType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_SEBLSRCINFO()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='SEBLSRCINFO' namespace='##targetNamespace'"
     * @generated
     */
    SEBLSRCINFOType getSEBLSRCINFO();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getSEBLSRCINFO <em>SEBLSRCINFO</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SEBLSRCINFO</em>' containment reference.
     * @see #getSEBLSRCINFO()
     * @generated
     */
    void setSEBLSRCINFO(SEBLSRCINFOType value);

    /**
     * Returns the value of the '<em><b>SESSION</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SESSION</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SESSION</em>' containment reference.
     * @see #setSESSION(SESSIONType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_SESSION()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='SESSION' namespace='##targetNamespace'"
     * @generated
     */
    SESSIONType getSESSION();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getSESSION <em>SESSION</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SESSION</em>' containment reference.
     * @see #getSESSION()
     * @generated
     */
    void setSESSION(SESSIONType value);

    /**
     * Returns the value of the '<em><b>SESSIONCOMPONENT</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SESSIONCOMPONENT</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SESSIONCOMPONENT</em>' containment reference.
     * @see #setSESSIONCOMPONENT(SESSIONCOMPONENTType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_SESSIONCOMPONENT()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='SESSIONCOMPONENT' namespace='##targetNamespace'"
     * @generated
     */
    SESSIONCOMPONENTType getSESSIONCOMPONENT();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getSESSIONCOMPONENT <em>SESSIONCOMPONENT</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SESSIONCOMPONENT</em>' containment reference.
     * @see #getSESSIONCOMPONENT()
     * @generated
     */
    void setSESSIONCOMPONENT(SESSIONCOMPONENTType value);

    /**
     * Returns the value of the '<em><b>SESSIONEXTENSION</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SESSIONEXTENSION</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SESSIONEXTENSION</em>' containment reference.
     * @see #setSESSIONEXTENSION(SESSIONEXTENSIONType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_SESSIONEXTENSION()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='SESSIONEXTENSION' namespace='##targetNamespace'"
     * @generated
     */
    SESSIONEXTENSIONType getSESSIONEXTENSION();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getSESSIONEXTENSION <em>SESSIONEXTENSION</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SESSIONEXTENSION</em>' containment reference.
     * @see #getSESSIONEXTENSION()
     * @generated
     */
    void setSESSIONEXTENSION(SESSIONEXTENSIONType value);

    /**
     * Returns the value of the '<em><b>SESSTRANSFORMATIONGROUP</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SESSTRANSFORMATIONGROUP</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SESSTRANSFORMATIONGROUP</em>' containment reference.
     * @see #setSESSTRANSFORMATIONGROUP(SESSTRANSFORMATIONGROUPType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_SESSTRANSFORMATIONGROUP()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='SESSTRANSFORMATIONGROUP' namespace='##targetNamespace'"
     * @generated
     */
    SESSTRANSFORMATIONGROUPType getSESSTRANSFORMATIONGROUP();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getSESSTRANSFORMATIONGROUP <em>SESSTRANSFORMATIONGROUP</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SESSTRANSFORMATIONGROUP</em>' containment reference.
     * @see #getSESSTRANSFORMATIONGROUP()
     * @generated
     */
    void setSESSTRANSFORMATIONGROUP(SESSTRANSFORMATIONGROUPType value);

    /**
     * Returns the value of the '<em><b>SESSTRANSFORMATIONINST</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SESSTRANSFORMATIONINST</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SESSTRANSFORMATIONINST</em>' containment reference.
     * @see #setSESSTRANSFORMATIONINST(SESSTRANSFORMATIONINSTType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_SESSTRANSFORMATIONINST()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='SESSTRANSFORMATIONINST' namespace='##targetNamespace'"
     * @generated
     */
    SESSTRANSFORMATIONINSTType getSESSTRANSFORMATIONINST();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getSESSTRANSFORMATIONINST <em>SESSTRANSFORMATIONINST</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SESSTRANSFORMATIONINST</em>' containment reference.
     * @see #getSESSTRANSFORMATIONINST()
     * @generated
     */
    void setSESSTRANSFORMATIONINST(SESSTRANSFORMATIONINSTType value);

    /**
     * Returns the value of the '<em><b>SHORTCUT</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SHORTCUT</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SHORTCUT</em>' containment reference.
     * @see #setSHORTCUT(SHORTCUTType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_SHORTCUT()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='SHORTCUT' namespace='##targetNamespace'"
     * @generated
     */
    SHORTCUTType getSHORTCUT();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getSHORTCUT <em>SHORTCUT</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SHORTCUT</em>' containment reference.
     * @see #getSHORTCUT()
     * @generated
     */
    void setSHORTCUT(SHORTCUTType value);

    /**
     * Returns the value of the '<em><b>SOURCE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SOURCE</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SOURCE</em>' containment reference.
     * @see #setSOURCE(SOURCEType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_SOURCE()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='SOURCE' namespace='##targetNamespace'"
     * @generated
     */
    SOURCEType getSOURCE();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getSOURCE <em>SOURCE</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SOURCE</em>' containment reference.
     * @see #getSOURCE()
     * @generated
     */
    void setSOURCE(SOURCEType value);

    /**
     * Returns the value of the '<em><b>SOURCEFIELD</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SOURCEFIELD</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SOURCEFIELD</em>' containment reference.
     * @see #setSOURCEFIELD(SOURCEFIELDType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_SOURCEFIELD()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='SOURCEFIELD' namespace='##targetNamespace'"
     * @generated
     */
    SOURCEFIELDType getSOURCEFIELD();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getSOURCEFIELD <em>SOURCEFIELD</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SOURCEFIELD</em>' containment reference.
     * @see #getSOURCEFIELD()
     * @generated
     */
    void setSOURCEFIELD(SOURCEFIELDType value);

    /**
     * Returns the value of the '<em><b>STARTOPTIONS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>STARTOPTIONS</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>STARTOPTIONS</em>' containment reference.
     * @see #setSTARTOPTIONS(STARTOPTIONSType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_STARTOPTIONS()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='STARTOPTIONS' namespace='##targetNamespace'"
     * @generated
     */
    STARTOPTIONSType getSTARTOPTIONS();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getSTARTOPTIONS <em>STARTOPTIONS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>STARTOPTIONS</em>' containment reference.
     * @see #getSTARTOPTIONS()
     * @generated
     */
    void setSTARTOPTIONS(STARTOPTIONSType value);

    /**
     * Returns the value of the '<em><b>TABLEATTRIBUTE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TABLEATTRIBUTE</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TABLEATTRIBUTE</em>' containment reference.
     * @see #setTABLEATTRIBUTE(TABLEATTRIBUTEType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_TABLEATTRIBUTE()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='TABLEATTRIBUTE' namespace='##targetNamespace'"
     * @generated
     */
    TABLEATTRIBUTEType getTABLEATTRIBUTE();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getTABLEATTRIBUTE <em>TABLEATTRIBUTE</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TABLEATTRIBUTE</em>' containment reference.
     * @see #getTABLEATTRIBUTE()
     * @generated
     */
    void setTABLEATTRIBUTE(TABLEATTRIBUTEType value);

    /**
     * Returns the value of the '<em><b>TARGET</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TARGET</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TARGET</em>' containment reference.
     * @see #setTARGET(TARGETType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_TARGET()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='TARGET' namespace='##targetNamespace'"
     * @generated
     */
    TARGETType getTARGET();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getTARGET <em>TARGET</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TARGET</em>' containment reference.
     * @see #getTARGET()
     * @generated
     */
    void setTARGET(TARGETType value);

    /**
     * Returns the value of the '<em><b>TARGETFIELD</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TARGETFIELD</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TARGETFIELD</em>' containment reference.
     * @see #setTARGETFIELD(TARGETFIELDType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_TARGETFIELD()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='TARGETFIELD' namespace='##targetNamespace'"
     * @generated
     */
    TARGETFIELDType getTARGETFIELD();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getTARGETFIELD <em>TARGETFIELD</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TARGETFIELD</em>' containment reference.
     * @see #getTARGETFIELD()
     * @generated
     */
    void setTARGETFIELD(TARGETFIELDType value);

    /**
     * Returns the value of the '<em><b>TARGETINDEX</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TARGETINDEX</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TARGETINDEX</em>' containment reference.
     * @see #setTARGETINDEX(TARGETINDEXType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_TARGETINDEX()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='TARGETINDEX' namespace='##targetNamespace'"
     * @generated
     */
    TARGETINDEXType getTARGETINDEX();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getTARGETINDEX <em>TARGETINDEX</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TARGETINDEX</em>' containment reference.
     * @see #getTARGETINDEX()
     * @generated
     */
    void setTARGETINDEX(TARGETINDEXType value);

    /**
     * Returns the value of the '<em><b>TARGETINDEXFIELD</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TARGETINDEXFIELD</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TARGETINDEXFIELD</em>' containment reference.
     * @see #setTARGETINDEXFIELD(TARGETINDEXFIELDType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_TARGETINDEXFIELD()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='TARGETINDEXFIELD' namespace='##targetNamespace'"
     * @generated
     */
    TARGETINDEXFIELDType getTARGETINDEXFIELD();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getTARGETINDEXFIELD <em>TARGETINDEXFIELD</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TARGETINDEXFIELD</em>' containment reference.
     * @see #getTARGETINDEXFIELD()
     * @generated
     */
    void setTARGETINDEXFIELD(TARGETINDEXFIELDType value);

    /**
     * Returns the value of the '<em><b>TARGETLOADORDER</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TARGETLOADORDER</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TARGETLOADORDER</em>' containment reference.
     * @see #setTARGETLOADORDER(TARGETLOADORDERType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_TARGETLOADORDER()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='TARGETLOADORDER' namespace='##targetNamespace'"
     * @generated
     */
    TARGETLOADORDERType getTARGETLOADORDER();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getTARGETLOADORDER <em>TARGETLOADORDER</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TARGETLOADORDER</em>' containment reference.
     * @see #getTARGETLOADORDER()
     * @generated
     */
    void setTARGETLOADORDER(TARGETLOADORDERType value);

    /**
     * Returns the value of the '<em><b>TASK</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TASK</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TASK</em>' containment reference.
     * @see #setTASK(TASKType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_TASK()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='TASK' namespace='##targetNamespace'"
     * @generated
     */
    TASKType getTASK();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getTASK <em>TASK</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TASK</em>' containment reference.
     * @see #getTASK()
     * @generated
     */
    void setTASK(TASKType value);

    /**
     * Returns the value of the '<em><b>TASKINSTANCE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TASKINSTANCE</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TASKINSTANCE</em>' containment reference.
     * @see #setTASKINSTANCE(TASKINSTANCEType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_TASKINSTANCE()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='TASKINSTANCE' namespace='##targetNamespace'"
     * @generated
     */
    TASKINSTANCEType getTASKINSTANCE();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getTASKINSTANCE <em>TASKINSTANCE</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TASKINSTANCE</em>' containment reference.
     * @see #getTASKINSTANCE()
     * @generated
     */
    void setTASKINSTANCE(TASKINSTANCEType value);

    /**
     * Returns the value of the '<em><b>TIMER</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TIMER</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TIMER</em>' containment reference.
     * @see #setTIMER(TIMERType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_TIMER()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='TIMER' namespace='##targetNamespace'"
     * @generated
     */
    TIMERType getTIMER();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getTIMER <em>TIMER</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TIMER</em>' containment reference.
     * @see #getTIMER()
     * @generated
     */
    void setTIMER(TIMERType value);

    /**
     * Returns the value of the '<em><b>TRANSFORMATION</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TRANSFORMATION</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TRANSFORMATION</em>' containment reference.
     * @see #setTRANSFORMATION(TRANSFORMATIONType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_TRANSFORMATION()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='TRANSFORMATION' namespace='##targetNamespace'"
     * @generated
     */
    TRANSFORMATIONType getTRANSFORMATION();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getTRANSFORMATION <em>TRANSFORMATION</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TRANSFORMATION</em>' containment reference.
     * @see #getTRANSFORMATION()
     * @generated
     */
    void setTRANSFORMATION(TRANSFORMATIONType value);

    /**
     * Returns the value of the '<em><b>TRANSFORMFIELD</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TRANSFORMFIELD</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TRANSFORMFIELD</em>' containment reference.
     * @see #setTRANSFORMFIELD(TRANSFORMFIELDType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_TRANSFORMFIELD()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='TRANSFORMFIELD' namespace='##targetNamespace'"
     * @generated
     */
    TRANSFORMFIELDType getTRANSFORMFIELD();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getTRANSFORMFIELD <em>TRANSFORMFIELD</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TRANSFORMFIELD</em>' containment reference.
     * @see #getTRANSFORMFIELD()
     * @generated
     */
    void setTRANSFORMFIELD(TRANSFORMFIELDType value);

    /**
     * Returns the value of the '<em><b>TRANSFORMFIELDATTR</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TRANSFORMFIELDATTR</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TRANSFORMFIELDATTR</em>' containment reference.
     * @see #setTRANSFORMFIELDATTR(TRANSFORMFIELDATTRType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_TRANSFORMFIELDATTR()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='TRANSFORMFIELDATTR' namespace='##targetNamespace'"
     * @generated
     */
    TRANSFORMFIELDATTRType getTRANSFORMFIELDATTR();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getTRANSFORMFIELDATTR <em>TRANSFORMFIELDATTR</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TRANSFORMFIELDATTR</em>' containment reference.
     * @see #getTRANSFORMFIELDATTR()
     * @generated
     */
    void setTRANSFORMFIELDATTR(TRANSFORMFIELDATTRType value);

    /**
     * Returns the value of the '<em><b>TRANSFORMFIELDATTRDEF</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TRANSFORMFIELDATTRDEF</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TRANSFORMFIELDATTRDEF</em>' containment reference.
     * @see #setTRANSFORMFIELDATTRDEF(TRANSFORMFIELDATTRDEFType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_TRANSFORMFIELDATTRDEF()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='TRANSFORMFIELDATTRDEF' namespace='##targetNamespace'"
     * @generated
     */
    TRANSFORMFIELDATTRDEFType getTRANSFORMFIELDATTRDEF();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getTRANSFORMFIELDATTRDEF <em>TRANSFORMFIELDATTRDEF</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TRANSFORMFIELDATTRDEF</em>' containment reference.
     * @see #getTRANSFORMFIELDATTRDEF()
     * @generated
     */
    void setTRANSFORMFIELDATTRDEF(TRANSFORMFIELDATTRDEFType value);

    /**
     * Returns the value of the '<em><b>TRANSFORMRESOURCEREF</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TRANSFORMRESOURCEREF</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TRANSFORMRESOURCEREF</em>' containment reference.
     * @see #setTRANSFORMRESOURCEREF(TRANSFORMRESOURCEREFType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_TRANSFORMRESOURCEREF()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='TRANSFORMRESOURCEREF' namespace='##targetNamespace'"
     * @generated
     */
    TRANSFORMRESOURCEREFType getTRANSFORMRESOURCEREF();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getTRANSFORMRESOURCEREF <em>TRANSFORMRESOURCEREF</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TRANSFORMRESOURCEREF</em>' containment reference.
     * @see #getTRANSFORMRESOURCEREF()
     * @generated
     */
    void setTRANSFORMRESOURCEREF(TRANSFORMRESOURCEREFType value);

    /**
     * Returns the value of the '<em><b>VALUEPAIR</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>VALUEPAIR</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>VALUEPAIR</em>' containment reference.
     * @see #setVALUEPAIR(VALUEPAIRType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_VALUEPAIR()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='VALUEPAIR' namespace='##targetNamespace'"
     * @generated
     */
    VALUEPAIRType getVALUEPAIR();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getVALUEPAIR <em>VALUEPAIR</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>VALUEPAIR</em>' containment reference.
     * @see #getVALUEPAIR()
     * @generated
     */
    void setVALUEPAIR(VALUEPAIRType value);

    /**
     * Returns the value of the '<em><b>WORKFLOW</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>WORKFLOW</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>WORKFLOW</em>' containment reference.
     * @see #setWORKFLOW(WORKFLOWType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_WORKFLOW()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='WORKFLOW' namespace='##targetNamespace'"
     * @generated
     */
    WORKFLOWType getWORKFLOW();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getWORKFLOW <em>WORKFLOW</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>WORKFLOW</em>' containment reference.
     * @see #getWORKFLOW()
     * @generated
     */
    void setWORKFLOW(WORKFLOWType value);

    /**
     * Returns the value of the '<em><b>WORKFLOWEVENT</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>WORKFLOWEVENT</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>WORKFLOWEVENT</em>' containment reference.
     * @see #setWORKFLOWEVENT(WORKFLOWEVENTType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_WORKFLOWEVENT()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='WORKFLOWEVENT' namespace='##targetNamespace'"
     * @generated
     */
    WORKFLOWEVENTType getWORKFLOWEVENT();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getWORKFLOWEVENT <em>WORKFLOWEVENT</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>WORKFLOWEVENT</em>' containment reference.
     * @see #getWORKFLOWEVENT()
     * @generated
     */
    void setWORKFLOWEVENT(WORKFLOWEVENTType value);

    /**
     * Returns the value of the '<em><b>WORKFLOWLINK</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>WORKFLOWLINK</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>WORKFLOWLINK</em>' containment reference.
     * @see #setWORKFLOWLINK(WORKFLOWLINKType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_WORKFLOWLINK()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='WORKFLOWLINK' namespace='##targetNamespace'"
     * @generated
     */
    WORKFLOWLINKType getWORKFLOWLINK();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getWORKFLOWLINK <em>WORKFLOWLINK</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>WORKFLOWLINK</em>' containment reference.
     * @see #getWORKFLOWLINK()
     * @generated
     */
    void setWORKFLOWLINK(WORKFLOWLINKType value);

    /**
     * Returns the value of the '<em><b>WORKFLOWVARIABLE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>WORKFLOWVARIABLE</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>WORKFLOWVARIABLE</em>' containment reference.
     * @see #setWORKFLOWVARIABLE(WORKFLOWVARIABLEType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_WORKFLOWVARIABLE()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='WORKFLOWVARIABLE' namespace='##targetNamespace'"
     * @generated
     */
    WORKFLOWVARIABLEType getWORKFLOWVARIABLE();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getWORKFLOWVARIABLE <em>WORKFLOWVARIABLE</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>WORKFLOWVARIABLE</em>' containment reference.
     * @see #getWORKFLOWVARIABLE()
     * @generated
     */
    void setWORKFLOWVARIABLE(WORKFLOWVARIABLEType value);

    /**
     * Returns the value of the '<em><b>WORKLET</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>WORKLET</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>WORKLET</em>' containment reference.
     * @see #setWORKLET(WORKLETType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_WORKLET()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='WORKLET' namespace='##targetNamespace'"
     * @generated
     */
    WORKLETType getWORKLET();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getWORKLET <em>WORKLET</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>WORKLET</em>' containment reference.
     * @see #getWORKLET()
     * @generated
     */
    void setWORKLET(WORKLETType value);

    /**
     * Returns the value of the '<em><b>XMLINFO</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>XMLINFO</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>XMLINFO</em>' containment reference.
     * @see #setXMLINFO(XMLINFOType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_XMLINFO()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='XMLINFO' namespace='##targetNamespace'"
     * @generated
     */
    XMLINFOType getXMLINFO();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getXMLINFO <em>XMLINFO</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>XMLINFO</em>' containment reference.
     * @see #getXMLINFO()
     * @generated
     */
    void setXMLINFO(XMLINFOType value);

    /**
     * Returns the value of the '<em><b>XMLTEXT</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>XMLTEXT</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>XMLTEXT</em>' containment reference.
     * @see #setXMLTEXT(XMLTEXTType)
     * @see Powrmart.PowrmartPackage#getDocumentRoot_XMLTEXT()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='XMLTEXT' namespace='##targetNamespace'"
     * @generated
     */
    XMLTEXTType getXMLTEXT();

    /**
     * Sets the value of the '{@link Powrmart.DocumentRoot#getXMLTEXT <em>XMLTEXT</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>XMLTEXT</em>' containment reference.
     * @see #getXMLTEXT()
     * @generated
     */
    void setXMLTEXT(XMLTEXTType value);

} // DocumentRoot
