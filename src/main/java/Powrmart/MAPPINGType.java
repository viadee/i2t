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
 * A representation of the model object '<em><b>MAPPING Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.MAPPINGType#getTRANSFORMATION <em>TRANSFORMATION</em>}</li>
 *   <li>{@link Powrmart.MAPPINGType#getINSTANCE <em>INSTANCE</em>}</li>
 *   <li>{@link Powrmart.MAPPINGType#getCONNECTOR <em>CONNECTOR</em>}</li>
 *   <li>{@link Powrmart.MAPPINGType#getMAPDEPENDENCY <em>MAPDEPENDENCY</em>}</li>
 *   <li>{@link Powrmart.MAPPINGType#getTARGETLOADORDER <em>TARGETLOADORDER</em>}</li>
 *   <li>{@link Powrmart.MAPPINGType#getMAPPINGVARIABLE <em>MAPPINGVARIABLE</em>}</li>
 *   <li>{@link Powrmart.MAPPINGType#getERPINFO <em>ERPINFO</em>}</li>
 *   <li>{@link Powrmart.MAPPINGType#getMETADATAEXTENSION <em>METADATAEXTENSION</em>}</li>
 *   <li>{@link Powrmart.MAPPINGType#getCRCVALUE <em>CRCVALUE</em>}</li>
 *   <li>{@link Powrmart.MAPPINGType#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.MAPPINGType#getISPROFILEMAPPING <em>ISPROFILEMAPPING</em>}</li>
 *   <li>{@link Powrmart.MAPPINGType#getISVALID <em>ISVALID</em>}</li>
 *   <li>{@link Powrmart.MAPPINGType#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.MAPPINGType#getOBJECTVERSION <em>OBJECTVERSION</em>}</li>
 *   <li>{@link Powrmart.MAPPINGType#getVERSIONNUMBER <em>VERSIONNUMBER</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getMAPPINGType()
 * @model extendedMetaData="name='MAPPING_._type' kind='elementOnly'"
 * @generated
 */
public interface MAPPINGType extends EObject {
    /**
     * Returns the value of the '<em><b>TRANSFORMATION</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.TRANSFORMATIONType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TRANSFORMATION</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TRANSFORMATION</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getMAPPINGType_TRANSFORMATION()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='TRANSFORMATION' namespace='##targetNamespace'"
     * @generated
     */
    EList<TRANSFORMATIONType> getTRANSFORMATION();

    /**
     * Returns the value of the '<em><b>INSTANCE</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.INSTANCEType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>INSTANCE</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>INSTANCE</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getMAPPINGType_INSTANCE()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='INSTANCE' namespace='##targetNamespace'"
     * @generated
     */
    EList<INSTANCEType> getINSTANCE();

    /**
     * Returns the value of the '<em><b>CONNECTOR</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.CONNECTORType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>CONNECTOR</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>CONNECTOR</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getMAPPINGType_CONNECTOR()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='CONNECTOR' namespace='##targetNamespace'"
     * @generated
     */
    EList<CONNECTORType> getCONNECTOR();

    /**
     * Returns the value of the '<em><b>MAPDEPENDENCY</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.MAPDEPENDENCYType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>MAPDEPENDENCY</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>MAPDEPENDENCY</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getMAPPINGType_MAPDEPENDENCY()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='MAPDEPENDENCY' namespace='##targetNamespace'"
     * @generated
     */
    EList<MAPDEPENDENCYType> getMAPDEPENDENCY();

    /**
     * Returns the value of the '<em><b>TARGETLOADORDER</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.TARGETLOADORDERType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TARGETLOADORDER</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TARGETLOADORDER</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getMAPPINGType_TARGETLOADORDER()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='TARGETLOADORDER' namespace='##targetNamespace'"
     * @generated
     */
    EList<TARGETLOADORDERType> getTARGETLOADORDER();

    /**
     * Returns the value of the '<em><b>MAPPINGVARIABLE</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.MAPPINGVARIABLEType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>MAPPINGVARIABLE</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>MAPPINGVARIABLE</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getMAPPINGType_MAPPINGVARIABLE()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='MAPPINGVARIABLE' namespace='##targetNamespace'"
     * @generated
     */
    EList<MAPPINGVARIABLEType> getMAPPINGVARIABLE();

    /**
     * Returns the value of the '<em><b>ERPINFO</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.ERPINFOType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ERPINFO</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ERPINFO</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getMAPPINGType_ERPINFO()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='ERPINFO' namespace='##targetNamespace'"
     * @generated
     */
    EList<ERPINFOType> getERPINFO();

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
     * @see Powrmart.PowrmartPackage#getMAPPINGType_METADATAEXTENSION()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='METADATAEXTENSION' namespace='##targetNamespace'"
     * @generated
     */
    EList<METADATAEXTENSIONType> getMETADATAEXTENSION();

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
     * @see Powrmart.PowrmartPackage#getMAPPINGType_CRCVALUE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='CRCVALUE' namespace='##targetNamespace'"
     * @generated
     */
    Object getCRCVALUE();

    /**
     * Sets the value of the '{@link Powrmart.MAPPINGType#getCRCVALUE <em>CRCVALUE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CRCVALUE</em>' attribute.
     * @see #getCRCVALUE()
     * @generated
     */
    void setCRCVALUE(Object value);

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
     * @see Powrmart.PowrmartPackage#getMAPPINGType_DESCRIPTION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='DESCRIPTION' namespace='##targetNamespace'"
     * @generated
     */
    Object getDESCRIPTION();

    /**
     * Sets the value of the '{@link Powrmart.MAPPINGType#getDESCRIPTION <em>DESCRIPTION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DESCRIPTION</em>' attribute.
     * @see #getDESCRIPTION()
     * @generated
     */
    void setDESCRIPTION(Object value);

    /**
     * Returns the value of the '<em><b>ISPROFILEMAPPING</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.ISPROFILEMAPPINGType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ISPROFILEMAPPING</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ISPROFILEMAPPING</em>' attribute.
     * @see Powrmart.ISPROFILEMAPPINGType
     * @see #isSetISPROFILEMAPPING()
     * @see #unsetISPROFILEMAPPING()
     * @see #setISPROFILEMAPPING(ISPROFILEMAPPINGType)
     * @see Powrmart.PowrmartPackage#getMAPPINGType_ISPROFILEMAPPING()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='ISPROFILEMAPPING' namespace='##targetNamespace'"
     * @generated
     */
    ISPROFILEMAPPINGType getISPROFILEMAPPING();

    /**
     * Sets the value of the '{@link Powrmart.MAPPINGType#getISPROFILEMAPPING <em>ISPROFILEMAPPING</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ISPROFILEMAPPING</em>' attribute.
     * @see Powrmart.ISPROFILEMAPPINGType
     * @see #isSetISPROFILEMAPPING()
     * @see #unsetISPROFILEMAPPING()
     * @see #getISPROFILEMAPPING()
     * @generated
     */
    void setISPROFILEMAPPING(ISPROFILEMAPPINGType value);

    /**
     * Unsets the value of the '{@link Powrmart.MAPPINGType#getISPROFILEMAPPING <em>ISPROFILEMAPPING</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetISPROFILEMAPPING()
     * @see #getISPROFILEMAPPING()
     * @see #setISPROFILEMAPPING(ISPROFILEMAPPINGType)
     * @generated
     */
    void unsetISPROFILEMAPPING();

    /**
     * Returns whether the value of the '{@link Powrmart.MAPPINGType#getISPROFILEMAPPING <em>ISPROFILEMAPPING</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>ISPROFILEMAPPING</em>' attribute is set.
     * @see #unsetISPROFILEMAPPING()
     * @see #getISPROFILEMAPPING()
     * @see #setISPROFILEMAPPING(ISPROFILEMAPPINGType)
     * @generated
     */
    boolean isSetISPROFILEMAPPING();

    /**
     * Returns the value of the '<em><b>ISVALID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ISVALID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ISVALID</em>' attribute.
     * @see #setISVALID(Object)
     * @see Powrmart.PowrmartPackage#getMAPPINGType_ISVALID()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='ISVALID' namespace='##targetNamespace'"
     * @generated
     */
    Object getISVALID();

    /**
     * Sets the value of the '{@link Powrmart.MAPPINGType#getISVALID <em>ISVALID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ISVALID</em>' attribute.
     * @see #getISVALID()
     * @generated
     */
    void setISVALID(Object value);

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
     * @see Powrmart.PowrmartPackage#getMAPPINGType_NAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='NAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getNAME();

    /**
     * Sets the value of the '{@link Powrmart.MAPPINGType#getNAME <em>NAME</em>}' attribute.
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
     * @see Powrmart.PowrmartPackage#getMAPPINGType_OBJECTVERSION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='OBJECTVERSION' namespace='##targetNamespace'"
     * @generated
     */
    Object getOBJECTVERSION();

    /**
     * Sets the value of the '{@link Powrmart.MAPPINGType#getOBJECTVERSION <em>OBJECTVERSION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>OBJECTVERSION</em>' attribute.
     * @see #getOBJECTVERSION()
     * @generated
     */
    void setOBJECTVERSION(Object value);

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
     * @see Powrmart.PowrmartPackage#getMAPPINGType_VERSIONNUMBER()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='VERSIONNUMBER' namespace='##targetNamespace'"
     * @generated
     */
    Object getVERSIONNUMBER();

    /**
     * Sets the value of the '{@link Powrmart.MAPPINGType#getVERSIONNUMBER <em>VERSIONNUMBER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>VERSIONNUMBER</em>' attribute.
     * @see #getVERSIONNUMBER()
     * @generated
     */
    void setVERSIONNUMBER(Object value);

} // MAPPINGType
