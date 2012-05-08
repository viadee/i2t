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
 * A representation of the model object '<em><b>SESSION Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.SESSIONType#getTASK <em>TASK</em>}</li>
 *   <li>{@link Powrmart.SESSIONType#getSESSTRANSFORMATIONINST <em>SESSTRANSFORMATIONINST</em>}</li>
 *   <li>{@link Powrmart.SESSIONType#getCONFIGREFERENCE <em>CONFIGREFERENCE</em>}</li>
 *   <li>{@link Powrmart.SESSIONType#getSESSIONCOMPONENT <em>SESSIONCOMPONENT</em>}</li>
 *   <li>{@link Powrmart.SESSIONType#getSESSIONEXTENSION <em>SESSIONEXTENSION</em>}</li>
 *   <li>{@link Powrmart.SESSIONType#getATTRIBUTE <em>ATTRIBUTE</em>}</li>
 *   <li>{@link Powrmart.SESSIONType#getMETADATAEXTENSION <em>METADATAEXTENSION</em>}</li>
 *   <li>{@link Powrmart.SESSIONType#getGroup <em>Group</em>}</li>
 *   <li>{@link Powrmart.SESSIONType#getRESOURCEREFERENCE <em>RESOURCEREFERENCE</em>}</li>
 *   <li>{@link Powrmart.SESSIONType#getTRANSFORMRESOURCEREF <em>TRANSFORMRESOURCEREF</em>}</li>
 *   <li>{@link Powrmart.SESSIONType#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.SESSIONType#getISVALID <em>ISVALID</em>}</li>
 *   <li>{@link Powrmart.SESSIONType#getMAPPINGNAME <em>MAPPINGNAME</em>}</li>
 *   <li>{@link Powrmart.SESSIONType#getMAPPINGVERSION <em>MAPPINGVERSION</em>}</li>
 *   <li>{@link Powrmart.SESSIONType#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.SESSIONType#getPARENT <em>PARENT</em>}</li>
 *   <li>{@link Powrmart.SESSIONType#getPARENTTYPE <em>PARENTTYPE</em>}</li>
 *   <li>{@link Powrmart.SESSIONType#getREUSABLE <em>REUSABLE</em>}</li>
 *   <li>{@link Powrmart.SESSIONType#getSORTORDER <em>SORTORDER</em>}</li>
 *   <li>{@link Powrmart.SESSIONType#getVERSIONNUMBER <em>VERSIONNUMBER</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getSESSIONType()
 * @model extendedMetaData="name='SESSION_._type' kind='elementOnly'"
 * @generated
 */
public interface SESSIONType extends EObject {
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
     * @see Powrmart.PowrmartPackage#getSESSIONType_TASK()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='TASK' namespace='##targetNamespace'"
     * @generated
     */
    EList<TASKType> getTASK();

    /**
     * Returns the value of the '<em><b>SESSTRANSFORMATIONINST</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.SESSTRANSFORMATIONINSTType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SESSTRANSFORMATIONINST</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SESSTRANSFORMATIONINST</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getSESSIONType_SESSTRANSFORMATIONINST()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='SESSTRANSFORMATIONINST' namespace='##targetNamespace'"
     * @generated
     */
    EList<SESSTRANSFORMATIONINSTType> getSESSTRANSFORMATIONINST();

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
     * @see Powrmart.PowrmartPackage#getSESSIONType_CONFIGREFERENCE()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='CONFIGREFERENCE' namespace='##targetNamespace'"
     * @generated
     */
    CONFIGREFERENCEType getCONFIGREFERENCE();

    /**
     * Sets the value of the '{@link Powrmart.SESSIONType#getCONFIGREFERENCE <em>CONFIGREFERENCE</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CONFIGREFERENCE</em>' containment reference.
     * @see #getCONFIGREFERENCE()
     * @generated
     */
    void setCONFIGREFERENCE(CONFIGREFERENCEType value);

    /**
     * Returns the value of the '<em><b>SESSIONCOMPONENT</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.SESSIONCOMPONENTType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SESSIONCOMPONENT</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SESSIONCOMPONENT</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getSESSIONType_SESSIONCOMPONENT()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='SESSIONCOMPONENT' namespace='##targetNamespace'"
     * @generated
     */
    EList<SESSIONCOMPONENTType> getSESSIONCOMPONENT();

    /**
     * Returns the value of the '<em><b>SESSIONEXTENSION</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.SESSIONEXTENSIONType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SESSIONEXTENSION</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SESSIONEXTENSION</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getSESSIONType_SESSIONEXTENSION()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='SESSIONEXTENSION' namespace='##targetNamespace'"
     * @generated
     */
    EList<SESSIONEXTENSIONType> getSESSIONEXTENSION();

    /**
     * Returns the value of the '<em><b>ATTRIBUTE</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.ATTRIBUTEType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ATTRIBUTE</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ATTRIBUTE</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getSESSIONType_ATTRIBUTE()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='ATTRIBUTE' namespace='##targetNamespace'"
     * @generated
     */
    EList<ATTRIBUTEType> getATTRIBUTE();

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
     * @see Powrmart.PowrmartPackage#getSESSIONType_METADATAEXTENSION()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='METADATAEXTENSION' namespace='##targetNamespace'"
     * @generated
     */
    EList<METADATAEXTENSIONType> getMETADATAEXTENSION();

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
     * @see Powrmart.PowrmartPackage#getSESSIONType_Group()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='group:7'"
     * @generated
     */
    FeatureMap getGroup();

    /**
     * Returns the value of the '<em><b>RESOURCEREFERENCE</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.RESOURCEREFERENCEType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>RESOURCEREFERENCE</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>RESOURCEREFERENCE</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getSESSIONType_RESOURCEREFERENCE()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='RESOURCEREFERENCE' namespace='##targetNamespace' group='group:7'"
     * @generated
     */
    EList<RESOURCEREFERENCEType> getRESOURCEREFERENCE();

    /**
     * Returns the value of the '<em><b>TRANSFORMRESOURCEREF</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.TRANSFORMRESOURCEREFType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TRANSFORMRESOURCEREF</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TRANSFORMRESOURCEREF</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getSESSIONType_TRANSFORMRESOURCEREF()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='TRANSFORMRESOURCEREF' namespace='##targetNamespace' group='group:7'"
     * @generated
     */
    EList<TRANSFORMRESOURCEREFType> getTRANSFORMRESOURCEREF();

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
     * @see Powrmart.PowrmartPackage#getSESSIONType_DESCRIPTION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='DESCRIPTION' namespace='##targetNamespace'"
     * @generated
     */
    Object getDESCRIPTION();

    /**
     * Sets the value of the '{@link Powrmart.SESSIONType#getDESCRIPTION <em>DESCRIPTION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DESCRIPTION</em>' attribute.
     * @see #getDESCRIPTION()
     * @generated
     */
    void setDESCRIPTION(Object value);

    /**
     * Returns the value of the '<em><b>ISVALID</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.ISVALIDType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ISVALID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ISVALID</em>' attribute.
     * @see Powrmart.ISVALIDType
     * @see #isSetISVALID()
     * @see #unsetISVALID()
     * @see #setISVALID(ISVALIDType)
     * @see Powrmart.PowrmartPackage#getSESSIONType_ISVALID()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='ISVALID' namespace='##targetNamespace'"
     * @generated
     */
    ISVALIDType getISVALID();

    /**
     * Sets the value of the '{@link Powrmart.SESSIONType#getISVALID <em>ISVALID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ISVALID</em>' attribute.
     * @see Powrmart.ISVALIDType
     * @see #isSetISVALID()
     * @see #unsetISVALID()
     * @see #getISVALID()
     * @generated
     */
    void setISVALID(ISVALIDType value);

    /**
     * Unsets the value of the '{@link Powrmart.SESSIONType#getISVALID <em>ISVALID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetISVALID()
     * @see #getISVALID()
     * @see #setISVALID(ISVALIDType)
     * @generated
     */
    void unsetISVALID();

    /**
     * Returns whether the value of the '{@link Powrmart.SESSIONType#getISVALID <em>ISVALID</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>ISVALID</em>' attribute is set.
     * @see #unsetISVALID()
     * @see #getISVALID()
     * @see #setISVALID(ISVALIDType)
     * @generated
     */
    boolean isSetISVALID();

    /**
     * Returns the value of the '<em><b>MAPPINGNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>MAPPINGNAME</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>MAPPINGNAME</em>' attribute.
     * @see #setMAPPINGNAME(Object)
     * @see Powrmart.PowrmartPackage#getSESSIONType_MAPPINGNAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='MAPPINGNAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getMAPPINGNAME();

    /**
     * Sets the value of the '{@link Powrmart.SESSIONType#getMAPPINGNAME <em>MAPPINGNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>MAPPINGNAME</em>' attribute.
     * @see #getMAPPINGNAME()
     * @generated
     */
    void setMAPPINGNAME(Object value);

    /**
     * Returns the value of the '<em><b>MAPPINGVERSION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>MAPPINGVERSION</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>MAPPINGVERSION</em>' attribute.
     * @see #setMAPPINGVERSION(Object)
     * @see Powrmart.PowrmartPackage#getSESSIONType_MAPPINGVERSION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='MAPPINGVERSION' namespace='##targetNamespace'"
     * @generated
     */
    Object getMAPPINGVERSION();

    /**
     * Sets the value of the '{@link Powrmart.SESSIONType#getMAPPINGVERSION <em>MAPPINGVERSION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>MAPPINGVERSION</em>' attribute.
     * @see #getMAPPINGVERSION()
     * @generated
     */
    void setMAPPINGVERSION(Object value);

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
     * @see Powrmart.PowrmartPackage#getSESSIONType_NAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='NAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getNAME();

    /**
     * Sets the value of the '{@link Powrmart.SESSIONType#getNAME <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NAME</em>' attribute.
     * @see #getNAME()
     * @generated
     */
    void setNAME(Object value);

    /**
     * Returns the value of the '<em><b>PARENT</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PARENT</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PARENT</em>' attribute.
     * @see #setPARENT(Object)
     * @see Powrmart.PowrmartPackage#getSESSIONType_PARENT()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='PARENT' namespace='##targetNamespace'"
     * @generated
     */
    Object getPARENT();

    /**
     * Sets the value of the '{@link Powrmart.SESSIONType#getPARENT <em>PARENT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PARENT</em>' attribute.
     * @see #getPARENT()
     * @generated
     */
    void setPARENT(Object value);

    /**
     * Returns the value of the '<em><b>PARENTTYPE</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.PARENTTYPEType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PARENTTYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PARENTTYPE</em>' attribute.
     * @see Powrmart.PARENTTYPEType
     * @see #isSetPARENTTYPE()
     * @see #unsetPARENTTYPE()
     * @see #setPARENTTYPE(PARENTTYPEType)
     * @see Powrmart.PowrmartPackage#getSESSIONType_PARENTTYPE()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='PARENT_TYPE' namespace='##targetNamespace'"
     * @generated
     */
    PARENTTYPEType getPARENTTYPE();

    /**
     * Sets the value of the '{@link Powrmart.SESSIONType#getPARENTTYPE <em>PARENTTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PARENTTYPE</em>' attribute.
     * @see Powrmart.PARENTTYPEType
     * @see #isSetPARENTTYPE()
     * @see #unsetPARENTTYPE()
     * @see #getPARENTTYPE()
     * @generated
     */
    void setPARENTTYPE(PARENTTYPEType value);

    /**
     * Unsets the value of the '{@link Powrmart.SESSIONType#getPARENTTYPE <em>PARENTTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPARENTTYPE()
     * @see #getPARENTTYPE()
     * @see #setPARENTTYPE(PARENTTYPEType)
     * @generated
     */
    void unsetPARENTTYPE();

    /**
     * Returns whether the value of the '{@link Powrmart.SESSIONType#getPARENTTYPE <em>PARENTTYPE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>PARENTTYPE</em>' attribute is set.
     * @see #unsetPARENTTYPE()
     * @see #getPARENTTYPE()
     * @see #setPARENTTYPE(PARENTTYPEType)
     * @generated
     */
    boolean isSetPARENTTYPE();

    /**
     * Returns the value of the '<em><b>REUSABLE</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.REUSABLEType4}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>REUSABLE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>REUSABLE</em>' attribute.
     * @see Powrmart.REUSABLEType4
     * @see #isSetREUSABLE()
     * @see #unsetREUSABLE()
     * @see #setREUSABLE(REUSABLEType4)
     * @see Powrmart.PowrmartPackage#getSESSIONType_REUSABLE()
     * @model unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='REUSABLE' namespace='##targetNamespace'"
     * @generated
     */
    REUSABLEType4 getREUSABLE();

    /**
     * Sets the value of the '{@link Powrmart.SESSIONType#getREUSABLE <em>REUSABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>REUSABLE</em>' attribute.
     * @see Powrmart.REUSABLEType4
     * @see #isSetREUSABLE()
     * @see #unsetREUSABLE()
     * @see #getREUSABLE()
     * @generated
     */
    void setREUSABLE(REUSABLEType4 value);

    /**
     * Unsets the value of the '{@link Powrmart.SESSIONType#getREUSABLE <em>REUSABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetREUSABLE()
     * @see #getREUSABLE()
     * @see #setREUSABLE(REUSABLEType4)
     * @generated
     */
    void unsetREUSABLE();

    /**
     * Returns whether the value of the '{@link Powrmart.SESSIONType#getREUSABLE <em>REUSABLE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>REUSABLE</em>' attribute is set.
     * @see #unsetREUSABLE()
     * @see #getREUSABLE()
     * @see #setREUSABLE(REUSABLEType4)
     * @generated
     */
    boolean isSetREUSABLE();

    /**
     * Returns the value of the '<em><b>SORTORDER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SORTORDER</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SORTORDER</em>' attribute.
     * @see #setSORTORDER(Object)
     * @see Powrmart.PowrmartPackage#getSESSIONType_SORTORDER()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='SORTORDER' namespace='##targetNamespace'"
     * @generated
     */
    Object getSORTORDER();

    /**
     * Sets the value of the '{@link Powrmart.SESSIONType#getSORTORDER <em>SORTORDER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SORTORDER</em>' attribute.
     * @see #getSORTORDER()
     * @generated
     */
    void setSORTORDER(Object value);

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
     * @see Powrmart.PowrmartPackage#getSESSIONType_VERSIONNUMBER()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='VERSIONNUMBER' namespace='##targetNamespace'"
     * @generated
     */
    Object getVERSIONNUMBER();

    /**
     * Sets the value of the '{@link Powrmart.SESSIONType#getVERSIONNUMBER <em>VERSIONNUMBER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>VERSIONNUMBER</em>' attribute.
     * @see #getVERSIONNUMBER()
     * @generated
     */
    void setVERSIONNUMBER(Object value);

} // SESSIONType
