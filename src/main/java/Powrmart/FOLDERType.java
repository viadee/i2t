/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FOLDER Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.FOLDERType#getGroup <em>Group</em>}</li>
 *   <li>{@link Powrmart.FOLDERType#getFOLDERVERSION <em>FOLDERVERSION</em>}</li>
 *   <li>{@link Powrmart.FOLDERType#getCONFIG <em>CONFIG</em>}</li>
 *   <li>{@link Powrmart.FOLDERType#getSCHEDULER <em>SCHEDULER</em>}</li>
 *   <li>{@link Powrmart.FOLDERType#getTASK <em>TASK</em>}</li>
 *   <li>{@link Powrmart.FOLDERType#getSESSION <em>SESSION</em>}</li>
 *   <li>{@link Powrmart.FOLDERType#getWORKLET <em>WORKLET</em>}</li>
 *   <li>{@link Powrmart.FOLDERType#getWORKFLOW <em>WORKFLOW</em>}</li>
 *   <li>{@link Powrmart.FOLDERType#getSOURCE <em>SOURCE</em>}</li>
 *   <li>{@link Powrmart.FOLDERType#getTARGET <em>TARGET</em>}</li>
 *   <li>{@link Powrmart.FOLDERType#getTRANSFORMATION <em>TRANSFORMATION</em>}</li>
 *   <li>{@link Powrmart.FOLDERType#getMAPPLET <em>MAPPLET</em>}</li>
 *   <li>{@link Powrmart.FOLDERType#getMAPPING <em>MAPPING</em>}</li>
 *   <li>{@link Powrmart.FOLDERType#getSHORTCUT <em>SHORTCUT</em>}</li>
 *   <li>{@link Powrmart.FOLDERType#getEXPRMACRO <em>EXPRMACRO</em>}</li>
 *   <li>{@link Powrmart.FOLDERType#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.FOLDERType#getGROUP1 <em>GROUP1</em>}</li>
 *   <li>{@link Powrmart.FOLDERType#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.FOLDERType#getOWNER <em>OWNER</em>}</li>
 *   <li>{@link Powrmart.FOLDERType#getPERMISSIONS <em>PERMISSIONS</em>}</li>
 *   <li>{@link Powrmart.FOLDERType#getSHARED <em>SHARED</em>}</li>
 *   <li>{@link Powrmart.FOLDERType#getUUID <em>UUID</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getFOLDERType()
 * @model extendedMetaData="name='FOLDER_._type' kind='elementOnly'"
 * @generated
 */
public interface FOLDERType extends EObject {
    /**
     * Returns the value of the '<em><b>Group</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Group</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Group</em>' attribute list.
     * @see Powrmart.PowrmartPackage#getFOLDERType_Group()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='group:0'"
     * @generated
     */
    FeatureMap getGroup();

    /**
     * Returns the value of the '<em><b>FOLDERVERSION</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.FOLDERVERSIONType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>FOLDERVERSION</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>FOLDERVERSION</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getFOLDERType_FOLDERVERSION()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='FOLDERVERSION' namespace='##targetNamespace' group='group:0'"
     * @generated
     */
    EList<FOLDERVERSIONType> getFOLDERVERSION();

    /**
     * Returns the value of the '<em><b>CONFIG</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.CONFIGType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>CONFIG</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>CONFIG</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getFOLDERType_CONFIG()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='CONFIG' namespace='##targetNamespace' group='group:0'"
     * @generated
     */
    EList<CONFIGType> getCONFIG();

    /**
     * Returns the value of the '<em><b>SCHEDULER</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.SCHEDULERType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SCHEDULER</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SCHEDULER</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getFOLDERType_SCHEDULER()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='SCHEDULER' namespace='##targetNamespace' group='group:0'"
     * @generated
     */
    EList<SCHEDULERType> getSCHEDULER();

    /**
     * Returns the value of the '<em><b>TASK</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.TASKType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TASK</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TASK</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getFOLDERType_TASK()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='TASK' namespace='##targetNamespace' group='group:0'"
     * @generated
     */
    EList<TASKType> getTASK();

    /**
     * Returns the value of the '<em><b>SESSION</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.SESSIONType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SESSION</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SESSION</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getFOLDERType_SESSION()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='SESSION' namespace='##targetNamespace' group='group:0'"
     * @generated
     */
    EList<SESSIONType> getSESSION();

    /**
     * Returns the value of the '<em><b>WORKLET</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.WORKLETType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>WORKLET</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>WORKLET</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getFOLDERType_WORKLET()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='WORKLET' namespace='##targetNamespace' group='group:0'"
     * @generated
     */
    EList<WORKLETType> getWORKLET();

    /**
     * Returns the value of the '<em><b>WORKFLOW</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.WORKFLOWType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>WORKFLOW</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>WORKFLOW</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getFOLDERType_WORKFLOW()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='WORKFLOW' namespace='##targetNamespace' group='group:0'"
     * @generated
     */
    EList<WORKFLOWType> getWORKFLOW();

    /**
     * Returns the value of the '<em><b>SOURCE</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.SOURCEType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SOURCE</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SOURCE</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getFOLDERType_SOURCE()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='SOURCE' namespace='##targetNamespace' group='group:0'"
     * @generated
     */
    EList<SOURCEType> getSOURCE();

    /**
     * Returns the value of the '<em><b>TARGET</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.TARGETType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TARGET</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TARGET</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getFOLDERType_TARGET()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='TARGET' namespace='##targetNamespace' group='group:0'"
     * @generated
     */
    EList<TARGETType> getTARGET();

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
     * @see Powrmart.PowrmartPackage#getFOLDERType_TRANSFORMATION()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='TRANSFORMATION' namespace='##targetNamespace' group='group:0'"
     * @generated
     */
    EList<TRANSFORMATIONType> getTRANSFORMATION();

    /**
     * Returns the value of the '<em><b>MAPPLET</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.MAPPLETType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>MAPPLET</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>MAPPLET</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getFOLDERType_MAPPLET()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='MAPPLET' namespace='##targetNamespace' group='group:0'"
     * @generated
     */
    EList<MAPPLETType> getMAPPLET();

    /**
     * Returns the value of the '<em><b>MAPPING</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.MAPPINGType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>MAPPING</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>MAPPING</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getFOLDERType_MAPPING()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='MAPPING' namespace='##targetNamespace' group='group:0'"
     * @generated
     */
    EList<MAPPINGType> getMAPPING();

    /**
     * Returns the value of the '<em><b>SHORTCUT</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.SHORTCUTType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SHORTCUT</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SHORTCUT</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getFOLDERType_SHORTCUT()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='SHORTCUT' namespace='##targetNamespace' group='group:0'"
     * @generated
     */
    EList<SHORTCUTType> getSHORTCUT();

    /**
     * Returns the value of the '<em><b>EXPRMACRO</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.EXPRMACROType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>EXPRMACRO</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>EXPRMACRO</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getFOLDERType_EXPRMACRO()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='EXPRMACRO' namespace='##targetNamespace' group='group:0'"
     * @generated
     */
    EList<EXPRMACROType> getEXPRMACRO();

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
     * @see Powrmart.PowrmartPackage#getFOLDERType_DESCRIPTION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='DESCRIPTION' namespace='##targetNamespace'"
     * @generated
     */
    Object getDESCRIPTION();

    /**
     * Sets the value of the '{@link Powrmart.FOLDERType#getDESCRIPTION <em>DESCRIPTION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DESCRIPTION</em>' attribute.
     * @see #getDESCRIPTION()
     * @generated
     */
    void setDESCRIPTION(Object value);

    /**
     * Returns the value of the '<em><b>GROUP1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>GROUP1</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>GROUP1</em>' attribute.
     * @see #setGROUP1(Object)
     * @see Powrmart.PowrmartPackage#getFOLDERType_GROUP1()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='GROUP' namespace='##targetNamespace'"
     * @generated
     */
    Object getGROUP1();

    /**
     * Sets the value of the '{@link Powrmart.FOLDERType#getGROUP1 <em>GROUP1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>GROUP1</em>' attribute.
     * @see #getGROUP1()
     * @generated
     */
    void setGROUP1(Object value);

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
     * @see Powrmart.PowrmartPackage#getFOLDERType_NAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='NAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getNAME();

    /**
     * Sets the value of the '{@link Powrmart.FOLDERType#getNAME <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NAME</em>' attribute.
     * @see #getNAME()
     * @generated
     */
    void setNAME(Object value);

    /**
     * Returns the value of the '<em><b>OWNER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>OWNER</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>OWNER</em>' attribute.
     * @see #setOWNER(Object)
     * @see Powrmart.PowrmartPackage#getFOLDERType_OWNER()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='OWNER' namespace='##targetNamespace'"
     * @generated
     */
    Object getOWNER();

    /**
     * Sets the value of the '{@link Powrmart.FOLDERType#getOWNER <em>OWNER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>OWNER</em>' attribute.
     * @see #getOWNER()
     * @generated
     */
    void setOWNER(Object value);

    /**
     * Returns the value of the '<em><b>PERMISSIONS</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PERMISSIONS</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PERMISSIONS</em>' attribute.
     * @see #setPERMISSIONS(Object)
     * @see Powrmart.PowrmartPackage#getFOLDERType_PERMISSIONS()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='PERMISSIONS' namespace='##targetNamespace'"
     * @generated
     */
    Object getPERMISSIONS();

    /**
     * Sets the value of the '{@link Powrmart.FOLDERType#getPERMISSIONS <em>PERMISSIONS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PERMISSIONS</em>' attribute.
     * @see #getPERMISSIONS()
     * @generated
     */
    void setPERMISSIONS(Object value);

    /**
     * Returns the value of the '<em><b>SHARED</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.SHAREDType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SHARED</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SHARED</em>' attribute.
     * @see Powrmart.SHAREDType
     * @see #isSetSHARED()
     * @see #unsetSHARED()
     * @see #setSHARED(SHAREDType)
     * @see Powrmart.PowrmartPackage#getFOLDERType_SHARED()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='SHARED' namespace='##targetNamespace'"
     * @generated
     */
    SHAREDType getSHARED();

    /**
     * Sets the value of the '{@link Powrmart.FOLDERType#getSHARED <em>SHARED</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SHARED</em>' attribute.
     * @see Powrmart.SHAREDType
     * @see #isSetSHARED()
     * @see #unsetSHARED()
     * @see #getSHARED()
     * @generated
     */
    void setSHARED(SHAREDType value);

    /**
     * Unsets the value of the '{@link Powrmart.FOLDERType#getSHARED <em>SHARED</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSHARED()
     * @see #getSHARED()
     * @see #setSHARED(SHAREDType)
     * @generated
     */
    void unsetSHARED();

    /**
     * Returns whether the value of the '{@link Powrmart.FOLDERType#getSHARED <em>SHARED</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>SHARED</em>' attribute is set.
     * @see #unsetSHARED()
     * @see #getSHARED()
     * @see #setSHARED(SHAREDType)
     * @generated
     */
    boolean isSetSHARED();

    /**
     * Returns the value of the '<em><b>UUID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>UUID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>UUID</em>' attribute.
     * @see #setUUID(Object)
     * @see Powrmart.PowrmartPackage#getFOLDERType_UUID()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='UUID' namespace='##targetNamespace'"
     * @generated
     */
    Object getUUID();

    /**
     * Sets the value of the '{@link Powrmart.FOLDERType#getUUID <em>UUID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>UUID</em>' attribute.
     * @see #getUUID()
     * @generated
     */
    void setUUID(Object value);

} // FOLDERType
