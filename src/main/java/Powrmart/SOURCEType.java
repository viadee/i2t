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
 * A representation of the model object '<em><b>SOURCE Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.SOURCEType#getFLATFILE <em>FLATFILE</em>}</li>
 *   <li>{@link Powrmart.SOURCEType#getXMLINFO <em>XMLINFO</em>}</li>
 *   <li>{@link Powrmart.SOURCEType#getERPSRCINFO <em>ERPSRCINFO</em>}</li>
 *   <li>{@link Powrmart.SOURCEType#getGROUP <em>GROUP</em>}</li>
 *   <li>{@link Powrmart.SOURCEType#getTABLEATTRIBUTE <em>TABLEATTRIBUTE</em>}</li>
 *   <li>{@link Powrmart.SOURCEType#getSOURCEFIELD <em>SOURCEFIELD</em>}</li>
 *   <li>{@link Powrmart.SOURCEType#getMETADATAEXTENSION <em>METADATAEXTENSION</em>}</li>
 *   <li>{@link Powrmart.SOURCEType#getBUSINESSNAME <em>BUSINESSNAME</em>}</li>
 *   <li>{@link Powrmart.SOURCEType#getCOMPONENTVERSION <em>COMPONENTVERSION</em>}</li>
 *   <li>{@link Powrmart.SOURCEType#getCRCVALUE <em>CRCVALUE</em>}</li>
 *   <li>{@link Powrmart.SOURCEType#getDATABASESUBTYPE <em>DATABASESUBTYPE</em>}</li>
 *   <li>{@link Powrmart.SOURCEType#getDATABASETYPE <em>DATABASETYPE</em>}</li>
 *   <li>{@link Powrmart.SOURCEType#getDBDNAME <em>DBDNAME</em>}</li>
 *   <li>{@link Powrmart.SOURCEType#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.SOURCEType#getIBMCOMP <em>IBMCOMP</em>}</li>
 *   <li>{@link Powrmart.SOURCEType#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.SOURCEType#getOBJECTVERSION <em>OBJECTVERSION</em>}</li>
 *   <li>{@link Powrmart.SOURCEType#getOWNERNAME <em>OWNERNAME</em>}</li>
 *   <li>{@link Powrmart.SOURCEType#getVERSIONNUMBER <em>VERSIONNUMBER</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getSOURCEType()
 * @model extendedMetaData="name='SOURCE_._type' kind='elementOnly'"
 * @generated
 */
public interface SOURCEType extends EObject {
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
     * @see Powrmart.PowrmartPackage#getSOURCEType_FLATFILE()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='FLATFILE' namespace='##targetNamespace'"
     * @generated
     */
    FLATFILEType getFLATFILE();

    /**
     * Sets the value of the '{@link Powrmart.SOURCEType#getFLATFILE <em>FLATFILE</em>}' containment reference.
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
     * @see Powrmart.PowrmartPackage#getSOURCEType_XMLINFO()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='XMLINFO' namespace='##targetNamespace'"
     * @generated
     */
    XMLINFOType getXMLINFO();

    /**
     * Sets the value of the '{@link Powrmart.SOURCEType#getXMLINFO <em>XMLINFO</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>XMLINFO</em>' containment reference.
     * @see #getXMLINFO()
     * @generated
     */
    void setXMLINFO(XMLINFOType value);

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
     * @see Powrmart.PowrmartPackage#getSOURCEType_ERPSRCINFO()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='ERPSRCINFO' namespace='##targetNamespace'"
     * @generated
     */
    ERPSRCINFOType getERPSRCINFO();

    /**
     * Sets the value of the '{@link Powrmart.SOURCEType#getERPSRCINFO <em>ERPSRCINFO</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ERPSRCINFO</em>' containment reference.
     * @see #getERPSRCINFO()
     * @generated
     */
    void setERPSRCINFO(ERPSRCINFOType value);

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
     * @see Powrmart.PowrmartPackage#getSOURCEType_GROUP()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='GROUP' namespace='##targetNamespace'"
     * @generated
     */
    EList<GROUPType> getGROUP();

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
     * @see Powrmart.PowrmartPackage#getSOURCEType_TABLEATTRIBUTE()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='TABLEATTRIBUTE' namespace='##targetNamespace'"
     * @generated
     */
    EList<TABLEATTRIBUTEType> getTABLEATTRIBUTE();

    /**
     * Returns the value of the '<em><b>SOURCEFIELD</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.SOURCEFIELDType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SOURCEFIELD</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SOURCEFIELD</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getSOURCEType_SOURCEFIELD()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='SOURCEFIELD' namespace='##targetNamespace'"
     * @generated
     */
    EList<SOURCEFIELDType> getSOURCEFIELD();

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
     * @see Powrmart.PowrmartPackage#getSOURCEType_METADATAEXTENSION()
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
     * @see Powrmart.PowrmartPackage#getSOURCEType_BUSINESSNAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='BUSINESSNAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getBUSINESSNAME();

    /**
     * Sets the value of the '{@link Powrmart.SOURCEType#getBUSINESSNAME <em>BUSINESSNAME</em>}' attribute.
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
     * @see Powrmart.PowrmartPackage#getSOURCEType_COMPONENTVERSION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='COMPONENTVERSION' namespace='##targetNamespace'"
     * @generated
     */
    Object getCOMPONENTVERSION();

    /**
     * Sets the value of the '{@link Powrmart.SOURCEType#getCOMPONENTVERSION <em>COMPONENTVERSION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>COMPONENTVERSION</em>' attribute.
     * @see #getCOMPONENTVERSION()
     * @generated
     */
    void setCOMPONENTVERSION(Object value);

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
     * @see Powrmart.PowrmartPackage#getSOURCEType_CRCVALUE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='CRCVALUE' namespace='##targetNamespace'"
     * @generated
     */
    Object getCRCVALUE();

    /**
     * Sets the value of the '{@link Powrmart.SOURCEType#getCRCVALUE <em>CRCVALUE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CRCVALUE</em>' attribute.
     * @see #getCRCVALUE()
     * @generated
     */
    void setCRCVALUE(Object value);

    /**
     * Returns the value of the '<em><b>DATABASESUBTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DATABASESUBTYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DATABASESUBTYPE</em>' attribute.
     * @see #setDATABASESUBTYPE(Object)
     * @see Powrmart.PowrmartPackage#getSOURCEType_DATABASESUBTYPE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='DATABASE_SUBTYPE' namespace='##targetNamespace'"
     * @generated
     */
    Object getDATABASESUBTYPE();

    /**
     * Sets the value of the '{@link Powrmart.SOURCEType#getDATABASESUBTYPE <em>DATABASESUBTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DATABASESUBTYPE</em>' attribute.
     * @see #getDATABASESUBTYPE()
     * @generated
     */
    void setDATABASESUBTYPE(Object value);

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
     * @see Powrmart.PowrmartPackage#getSOURCEType_DATABASETYPE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='DATABASETYPE' namespace='##targetNamespace'"
     * @generated
     */
    Object getDATABASETYPE();

    /**
     * Sets the value of the '{@link Powrmart.SOURCEType#getDATABASETYPE <em>DATABASETYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DATABASETYPE</em>' attribute.
     * @see #getDATABASETYPE()
     * @generated
     */
    void setDATABASETYPE(Object value);

    /**
     * Returns the value of the '<em><b>DBDNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DBDNAME</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DBDNAME</em>' attribute.
     * @see #setDBDNAME(Object)
     * @see Powrmart.PowrmartPackage#getSOURCEType_DBDNAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='DBDNAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getDBDNAME();

    /**
     * Sets the value of the '{@link Powrmart.SOURCEType#getDBDNAME <em>DBDNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DBDNAME</em>' attribute.
     * @see #getDBDNAME()
     * @generated
     */
    void setDBDNAME(Object value);

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
     * @see Powrmart.PowrmartPackage#getSOURCEType_DESCRIPTION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='DESCRIPTION' namespace='##targetNamespace'"
     * @generated
     */
    Object getDESCRIPTION();

    /**
     * Sets the value of the '{@link Powrmart.SOURCEType#getDESCRIPTION <em>DESCRIPTION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DESCRIPTION</em>' attribute.
     * @see #getDESCRIPTION()
     * @generated
     */
    void setDESCRIPTION(Object value);

    /**
     * Returns the value of the '<em><b>IBMCOMP</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>IBMCOMP</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>IBMCOMP</em>' attribute.
     * @see #setIBMCOMP(Object)
     * @see Powrmart.PowrmartPackage#getSOURCEType_IBMCOMP()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='IBMCOMP' namespace='##targetNamespace'"
     * @generated
     */
    Object getIBMCOMP();

    /**
     * Sets the value of the '{@link Powrmart.SOURCEType#getIBMCOMP <em>IBMCOMP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>IBMCOMP</em>' attribute.
     * @see #getIBMCOMP()
     * @generated
     */
    void setIBMCOMP(Object value);

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
     * @see Powrmart.PowrmartPackage#getSOURCEType_NAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='NAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getNAME();

    /**
     * Sets the value of the '{@link Powrmart.SOURCEType#getNAME <em>NAME</em>}' attribute.
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
     * @see Powrmart.PowrmartPackage#getSOURCEType_OBJECTVERSION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='OBJECTVERSION' namespace='##targetNamespace'"
     * @generated
     */
    Object getOBJECTVERSION();

    /**
     * Sets the value of the '{@link Powrmart.SOURCEType#getOBJECTVERSION <em>OBJECTVERSION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>OBJECTVERSION</em>' attribute.
     * @see #getOBJECTVERSION()
     * @generated
     */
    void setOBJECTVERSION(Object value);

    /**
     * Returns the value of the '<em><b>OWNERNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>OWNERNAME</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>OWNERNAME</em>' attribute.
     * @see #setOWNERNAME(Object)
     * @see Powrmart.PowrmartPackage#getSOURCEType_OWNERNAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='OWNERNAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getOWNERNAME();

    /**
     * Sets the value of the '{@link Powrmart.SOURCEType#getOWNERNAME <em>OWNERNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>OWNERNAME</em>' attribute.
     * @see #getOWNERNAME()
     * @generated
     */
    void setOWNERNAME(Object value);

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
     * @see Powrmart.PowrmartPackage#getSOURCEType_VERSIONNUMBER()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='VERSIONNUMBER' namespace='##targetNamespace'"
     * @generated
     */
    Object getVERSIONNUMBER();

    /**
     * Sets the value of the '{@link Powrmart.SOURCEType#getVERSIONNUMBER <em>VERSIONNUMBER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>VERSIONNUMBER</em>' attribute.
     * @see #getVERSIONNUMBER()
     * @generated
     */
    void setVERSIONNUMBER(Object value);

} // SOURCEType
