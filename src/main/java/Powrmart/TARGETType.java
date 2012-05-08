/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TARGET Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.TARGETType#getKEYWORD <em>KEYWORD</em>}</li>
 *   <li>{@link Powrmart.TARGETType#getFLATFILE <em>FLATFILE</em>}</li>
 *   <li>{@link Powrmart.TARGETType#getXMLINFO <em>XMLINFO</em>}</li>
 *   <li>{@link Powrmart.TARGETType#getGROUP <em>GROUP</em>}</li>
 *   <li>{@link Powrmart.TARGETType#getTARGETFIELD <em>TARGETFIELD</em>}</li>
 *   <li>{@link Powrmart.TARGETType#getTARGETINDEX <em>TARGETINDEX</em>}</li>
 *   <li>{@link Powrmart.TARGETType#getTABLEATTRIBUTE <em>TABLEATTRIBUTE</em>}</li>
 *   <li>{@link Powrmart.TARGETType#getMETADATAEXTENSION <em>METADATAEXTENSION</em>}</li>
 *   <li>{@link Powrmart.TARGETType#getBUSINESSNAME <em>BUSINESSNAME</em>}</li>
 *   <li>{@link Powrmart.TARGETType#getCOMPONENTVERSION <em>COMPONENTVERSION</em>}</li>
 *   <li>{@link Powrmart.TARGETType#getCONSTRAINT <em>CONSTRAINT</em>}</li>
 *   <li>{@link Powrmart.TARGETType#getCRCVALUE <em>CRCVALUE</em>}</li>
 *   <li>{@link Powrmart.TARGETType#getDATABASETYPE <em>DATABASETYPE</em>}</li>
 *   <li>{@link Powrmart.TARGETType#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.TARGETType#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.TARGETType#getOBJECTVERSION <em>OBJECTVERSION</em>}</li>
 *   <li>{@link Powrmart.TARGETType#getTABLEOPTIONS <em>TABLEOPTIONS</em>}</li>
 *   <li>{@link Powrmart.TARGETType#getTABLETYPE <em>TABLETYPE</em>}</li>
 *   <li>{@link Powrmart.TARGETType#getVERSIONNUMBER <em>VERSIONNUMBER</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getTARGETType()
 * @model extendedMetaData="name='TARGET_._type' kind='elementOnly'"
 * @generated
 */
public interface TARGETType extends EObject {
    /**
     * Returns the value of the '<em><b>KEYWORD</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.KEYWORDType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>KEYWORD</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>KEYWORD</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getTARGETType_KEYWORD()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='KEYWORD' namespace='##targetNamespace'"
     * @generated
     */
    EList<KEYWORDType> getKEYWORD();

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
     * @see Powrmart.PowrmartPackage#getTARGETType_FLATFILE()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='FLATFILE' namespace='##targetNamespace'"
     * @generated
     */
    FLATFILEType getFLATFILE();

    /**
     * Sets the value of the '{@link Powrmart.TARGETType#getFLATFILE <em>FLATFILE</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>FLATFILE</em>' containment reference.
     * @see #getFLATFILE()
     * @generated
     */
    void setFLATFILE(FLATFILEType value);

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
     * @see Powrmart.PowrmartPackage#getTARGETType_XMLINFO()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='XMLINFO' namespace='##targetNamespace'"
     * @generated
     */
    XMLINFOType getXMLINFO();

    /**
     * Sets the value of the '{@link Powrmart.TARGETType#getXMLINFO <em>XMLINFO</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>XMLINFO</em>' containment reference.
     * @see #getXMLINFO()
     * @generated
     */
    void setXMLINFO(XMLINFOType value);

    /**
     * Returns the value of the '<em><b>GROUP</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.GROUPType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>GROUP</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>GROUP</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getTARGETType_GROUP()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='GROUP' namespace='##targetNamespace'"
     * @generated
     */
    EList<GROUPType> getGROUP();

    /**
     * Returns the value of the '<em><b>TARGETFIELD</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.TARGETFIELDType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TARGETFIELD</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TARGETFIELD</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getTARGETType_TARGETFIELD()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='TARGETFIELD' namespace='##targetNamespace'"
     * @generated
     */
    EList<TARGETFIELDType> getTARGETFIELD();

    /**
     * Returns the value of the '<em><b>TARGETINDEX</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.TARGETINDEXType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TARGETINDEX</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TARGETINDEX</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getTARGETType_TARGETINDEX()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='TARGETINDEX' namespace='##targetNamespace'"
     * @generated
     */
    EList<TARGETINDEXType> getTARGETINDEX();

    /**
     * Returns the value of the '<em><b>TABLEATTRIBUTE</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.TABLEATTRIBUTEType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TABLEATTRIBUTE</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TABLEATTRIBUTE</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getTARGETType_TABLEATTRIBUTE()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='TABLEATTRIBUTE' namespace='##targetNamespace'"
     * @generated
     */
    EList<TABLEATTRIBUTEType> getTABLEATTRIBUTE();

    /**
     * Returns the value of the '<em><b>METADATAEXTENSION</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.METADATAEXTENSIONType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>METADATAEXTENSION</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>METADATAEXTENSION</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getTARGETType_METADATAEXTENSION()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='METADATAEXTENSION' namespace='##targetNamespace'"
     * @generated
     */
    EList<METADATAEXTENSIONType> getMETADATAEXTENSION();

    /**
     * Returns the value of the '<em><b>BUSINESSNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>BUSINESSNAME</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>BUSINESSNAME</em>' attribute.
     * @see #setBUSINESSNAME(Object)
     * @see Powrmart.PowrmartPackage#getTARGETType_BUSINESSNAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='BUSINESSNAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getBUSINESSNAME();

    /**
     * Sets the value of the '{@link Powrmart.TARGETType#getBUSINESSNAME <em>BUSINESSNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>BUSINESSNAME</em>' attribute.
     * @see #getBUSINESSNAME()
     * @generated
     */
    void setBUSINESSNAME(Object value);

    /**
     * Returns the value of the '<em><b>COMPONENTVERSION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>COMPONENTVERSION</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>COMPONENTVERSION</em>' attribute.
     * @see #setCOMPONENTVERSION(Object)
     * @see Powrmart.PowrmartPackage#getTARGETType_COMPONENTVERSION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='COMPONENTVERSION' namespace='##targetNamespace'"
     * @generated
     */
    Object getCOMPONENTVERSION();

    /**
     * Sets the value of the '{@link Powrmart.TARGETType#getCOMPONENTVERSION <em>COMPONENTVERSION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>COMPONENTVERSION</em>' attribute.
     * @see #getCOMPONENTVERSION()
     * @generated
     */
    void setCOMPONENTVERSION(Object value);

    /**
     * Returns the value of the '<em><b>CONSTRAINT</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>CONSTRAINT</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>CONSTRAINT</em>' attribute.
     * @see #setCONSTRAINT(Object)
     * @see Powrmart.PowrmartPackage#getTARGETType_CONSTRAINT()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='CONSTRAINT' namespace='##targetNamespace'"
     * @generated
     */
    Object getCONSTRAINT();

    /**
     * Sets the value of the '{@link Powrmart.TARGETType#getCONSTRAINT <em>CONSTRAINT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CONSTRAINT</em>' attribute.
     * @see #getCONSTRAINT()
     * @generated
     */
    void setCONSTRAINT(Object value);

    /**
     * Returns the value of the '<em><b>CRCVALUE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>CRCVALUE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>CRCVALUE</em>' attribute.
     * @see #setCRCVALUE(Object)
     * @see Powrmart.PowrmartPackage#getTARGETType_CRCVALUE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='CRCVALUE' namespace='##targetNamespace'"
     * @generated
     */
    Object getCRCVALUE();

    /**
     * Sets the value of the '{@link Powrmart.TARGETType#getCRCVALUE <em>CRCVALUE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CRCVALUE</em>' attribute.
     * @see #getCRCVALUE()
     * @generated
     */
    void setCRCVALUE(Object value);

    /**
     * Returns the value of the '<em><b>DATABASETYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DATABASETYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DATABASETYPE</em>' attribute.
     * @see #setDATABASETYPE(Object)
     * @see Powrmart.PowrmartPackage#getTARGETType_DATABASETYPE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='DATABASETYPE' namespace='##targetNamespace'"
     * @generated
     */
    Object getDATABASETYPE();

    /**
     * Sets the value of the '{@link Powrmart.TARGETType#getDATABASETYPE <em>DATABASETYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DATABASETYPE</em>' attribute.
     * @see #getDATABASETYPE()
     * @generated
     */
    void setDATABASETYPE(Object value);

    /**
     * Returns the value of the '<em><b>DESCRIPTION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DESCRIPTION</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DESCRIPTION</em>' attribute.
     * @see #setDESCRIPTION(Object)
     * @see Powrmart.PowrmartPackage#getTARGETType_DESCRIPTION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='DESCRIPTION' namespace='##targetNamespace'"
     * @generated
     */
    Object getDESCRIPTION();

    /**
     * Sets the value of the '{@link Powrmart.TARGETType#getDESCRIPTION <em>DESCRIPTION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DESCRIPTION</em>' attribute.
     * @see #getDESCRIPTION()
     * @generated
     */
    void setDESCRIPTION(Object value);

    /**
     * Returns the value of the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>NAME</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>NAME</em>' attribute.
     * @see #setNAME(Object)
     * @see Powrmart.PowrmartPackage#getTARGETType_NAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='NAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getNAME();

    /**
     * Sets the value of the '{@link Powrmart.TARGETType#getNAME <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NAME</em>' attribute.
     * @see #getNAME()
     * @generated
     */
    void setNAME(Object value);

    /**
     * Returns the value of the '<em><b>OBJECTVERSION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>OBJECTVERSION</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>OBJECTVERSION</em>' attribute.
     * @see #setOBJECTVERSION(Object)
     * @see Powrmart.PowrmartPackage#getTARGETType_OBJECTVERSION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='OBJECTVERSION' namespace='##targetNamespace'"
     * @generated
     */
    Object getOBJECTVERSION();

    /**
     * Sets the value of the '{@link Powrmart.TARGETType#getOBJECTVERSION <em>OBJECTVERSION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>OBJECTVERSION</em>' attribute.
     * @see #getOBJECTVERSION()
     * @generated
     */
    void setOBJECTVERSION(Object value);

    /**
     * Returns the value of the '<em><b>TABLEOPTIONS</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TABLEOPTIONS</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TABLEOPTIONS</em>' attribute.
     * @see #setTABLEOPTIONS(Object)
     * @see Powrmart.PowrmartPackage#getTARGETType_TABLEOPTIONS()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='TABLEOPTIONS' namespace='##targetNamespace'"
     * @generated
     */
    Object getTABLEOPTIONS();

    /**
     * Sets the value of the '{@link Powrmart.TARGETType#getTABLEOPTIONS <em>TABLEOPTIONS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TABLEOPTIONS</em>' attribute.
     * @see #getTABLEOPTIONS()
     * @generated
     */
    void setTABLEOPTIONS(Object value);

    /**
     * Returns the value of the '<em><b>TABLETYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TABLETYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TABLETYPE</em>' attribute.
     * @see #setTABLETYPE(Object)
     * @see Powrmart.PowrmartPackage#getTARGETType_TABLETYPE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='TABLETYPE' namespace='##targetNamespace'"
     * @generated
     */
    Object getTABLETYPE();

    /**
     * Sets the value of the '{@link Powrmart.TARGETType#getTABLETYPE <em>TABLETYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TABLETYPE</em>' attribute.
     * @see #getTABLETYPE()
     * @generated
     */
    void setTABLETYPE(Object value);

    /**
     * Returns the value of the '<em><b>VERSIONNUMBER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>VERSIONNUMBER</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>VERSIONNUMBER</em>' attribute.
     * @see #setVERSIONNUMBER(Object)
     * @see Powrmart.PowrmartPackage#getTARGETType_VERSIONNUMBER()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='VERSIONNUMBER' namespace='##targetNamespace'"
     * @generated
     */
    Object getVERSIONNUMBER();

    /**
     * Sets the value of the '{@link Powrmart.TARGETType#getVERSIONNUMBER <em>VERSIONNUMBER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>VERSIONNUMBER</em>' attribute.
     * @see #getVERSIONNUMBER()
     * @generated
     */
    void setVERSIONNUMBER(Object value);

} // TARGETType
