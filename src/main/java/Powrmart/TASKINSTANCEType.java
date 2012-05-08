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
 * A representation of the model object '<em><b>TASKINSTANCE Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.TASKINSTANCEType#getATTRIBUTE <em>ATTRIBUTE</em>}</li>
 *   <li>{@link Powrmart.TASKINSTANCEType#getWORKFLOWVARIABLE <em>WORKFLOWVARIABLE</em>}</li>
 *   <li>{@link Powrmart.TASKINSTANCEType#getVALUEPAIR <em>VALUEPAIR</em>}</li>
 *   <li>{@link Powrmart.TASKINSTANCEType#getCONFIGREFERENCE <em>CONFIGREFERENCE</em>}</li>
 *   <li>{@link Powrmart.TASKINSTANCEType#getSESSIONCOMPONENT <em>SESSIONCOMPONENT</em>}</li>
 *   <li>{@link Powrmart.TASKINSTANCEType#getSESSIONEXTENSION <em>SESSIONEXTENSION</em>}</li>
 *   <li>{@link Powrmart.TASKINSTANCEType#getGroup <em>Group</em>}</li>
 *   <li>{@link Powrmart.TASKINSTANCEType#getRESOURCEREFERENCE <em>RESOURCEREFERENCE</em>}</li>
 *   <li>{@link Powrmart.TASKINSTANCEType#getTRANSFORMRESOURCEREF <em>TRANSFORMRESOURCEREF</em>}</li>
 *   <li>{@link Powrmart.TASKINSTANCEType#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.TASKINSTANCEType#getFAILPARENTIFINSTANCEDIDNOTRUN <em>FAILPARENTIFINSTANCEDIDNOTRUN</em>}</li>
 *   <li>{@link Powrmart.TASKINSTANCEType#getFAILPARENTIFINSTANCEFAILS <em>FAILPARENTIFINSTANCEFAILS</em>}</li>
 *   <li>{@link Powrmart.TASKINSTANCEType#getISENABLED <em>ISENABLED</em>}</li>
 *   <li>{@link Powrmart.TASKINSTANCEType#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.TASKINSTANCEType#getREUSABLE <em>REUSABLE</em>}</li>
 *   <li>{@link Powrmart.TASKINSTANCEType#getSERVEROVERRIDE <em>SERVEROVERRIDE</em>}</li>
 *   <li>{@link Powrmart.TASKINSTANCEType#getTASKNAME <em>TASKNAME</em>}</li>
 *   <li>{@link Powrmart.TASKINSTANCEType#getTASKTYPE <em>TASKTYPE</em>}</li>
 *   <li>{@link Powrmart.TASKINSTANCEType#getTREATINPUTLINKASAND <em>TREATINPUTLINKASAND</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getTASKINSTANCEType()
 * @model extendedMetaData="name='TASKINSTANCE_._type' kind='elementOnly'"
 * @generated
 */
public interface TASKINSTANCEType extends EObject {
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
     * @see Powrmart.PowrmartPackage#getTASKINSTANCEType_ATTRIBUTE()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='ATTRIBUTE' namespace='##targetNamespace'"
     * @generated
     */
    EList<ATTRIBUTEType> getATTRIBUTE();

    /**
     * Returns the value of the '<em><b>WORKFLOWVARIABLE</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.WORKFLOWVARIABLEType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>WORKFLOWVARIABLE</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>WORKFLOWVARIABLE</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getTASKINSTANCEType_WORKFLOWVARIABLE()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='WORKFLOWVARIABLE' namespace='##targetNamespace'"
     * @generated
     */
    EList<WORKFLOWVARIABLEType> getWORKFLOWVARIABLE();

    /**
     * Returns the value of the '<em><b>VALUEPAIR</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.VALUEPAIRType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>VALUEPAIR</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>VALUEPAIR</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getTASKINSTANCEType_VALUEPAIR()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='VALUEPAIR' namespace='##targetNamespace'"
     * @generated
     */
    EList<VALUEPAIRType> getVALUEPAIR();

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
     * @see Powrmart.PowrmartPackage#getTASKINSTANCEType_CONFIGREFERENCE()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='CONFIGREFERENCE' namespace='##targetNamespace'"
     * @generated
     */
    CONFIGREFERENCEType getCONFIGREFERENCE();

    /**
     * Sets the value of the '{@link Powrmart.TASKINSTANCEType#getCONFIGREFERENCE <em>CONFIGREFERENCE</em>}' containment reference.
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
     * @see Powrmart.PowrmartPackage#getTASKINSTANCEType_SESSIONCOMPONENT()
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
     * @see Powrmart.PowrmartPackage#getTASKINSTANCEType_SESSIONEXTENSION()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='SESSIONEXTENSION' namespace='##targetNamespace'"
     * @generated
     */
    EList<SESSIONEXTENSIONType> getSESSIONEXTENSION();

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
     * @see Powrmart.PowrmartPackage#getTASKINSTANCEType_Group()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='group:6'"
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
     * @see Powrmart.PowrmartPackage#getTASKINSTANCEType_RESOURCEREFERENCE()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='RESOURCEREFERENCE' namespace='##targetNamespace' group='group:6'"
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
     * @see Powrmart.PowrmartPackage#getTASKINSTANCEType_TRANSFORMRESOURCEREF()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='TRANSFORMRESOURCEREF' namespace='##targetNamespace' group='group:6'"
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
     * @see Powrmart.PowrmartPackage#getTASKINSTANCEType_DESCRIPTION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='DESCRIPTION' namespace='##targetNamespace'"
     * @generated
     */
    Object getDESCRIPTION();

    /**
     * Sets the value of the '{@link Powrmart.TASKINSTANCEType#getDESCRIPTION <em>DESCRIPTION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DESCRIPTION</em>' attribute.
     * @see #getDESCRIPTION()
     * @generated
     */
    void setDESCRIPTION(Object value);

    /**
     * Returns the value of the '<em><b>FAILPARENTIFINSTANCEDIDNOTRUN</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.FAILPARENTIFINSTANCEDIDNOTRUNType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>FAILPARENTIFINSTANCEDIDNOTRUN</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>FAILPARENTIFINSTANCEDIDNOTRUN</em>' attribute.
     * @see Powrmart.FAILPARENTIFINSTANCEDIDNOTRUNType
     * @see #isSetFAILPARENTIFINSTANCEDIDNOTRUN()
     * @see #unsetFAILPARENTIFINSTANCEDIDNOTRUN()
     * @see #setFAILPARENTIFINSTANCEDIDNOTRUN(FAILPARENTIFINSTANCEDIDNOTRUNType)
     * @see Powrmart.PowrmartPackage#getTASKINSTANCEType_FAILPARENTIFINSTANCEDIDNOTRUN()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='FAIL_PARENT_IF_INSTANCE_DID_NOT_RUN' namespace='##targetNamespace'"
     * @generated
     */
    FAILPARENTIFINSTANCEDIDNOTRUNType getFAILPARENTIFINSTANCEDIDNOTRUN();

    /**
     * Sets the value of the '{@link Powrmart.TASKINSTANCEType#getFAILPARENTIFINSTANCEDIDNOTRUN <em>FAILPARENTIFINSTANCEDIDNOTRUN</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>FAILPARENTIFINSTANCEDIDNOTRUN</em>' attribute.
     * @see Powrmart.FAILPARENTIFINSTANCEDIDNOTRUNType
     * @see #isSetFAILPARENTIFINSTANCEDIDNOTRUN()
     * @see #unsetFAILPARENTIFINSTANCEDIDNOTRUN()
     * @see #getFAILPARENTIFINSTANCEDIDNOTRUN()
     * @generated
     */
    void setFAILPARENTIFINSTANCEDIDNOTRUN(FAILPARENTIFINSTANCEDIDNOTRUNType value);

    /**
     * Unsets the value of the '{@link Powrmart.TASKINSTANCEType#getFAILPARENTIFINSTANCEDIDNOTRUN <em>FAILPARENTIFINSTANCEDIDNOTRUN</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFAILPARENTIFINSTANCEDIDNOTRUN()
     * @see #getFAILPARENTIFINSTANCEDIDNOTRUN()
     * @see #setFAILPARENTIFINSTANCEDIDNOTRUN(FAILPARENTIFINSTANCEDIDNOTRUNType)
     * @generated
     */
    void unsetFAILPARENTIFINSTANCEDIDNOTRUN();

    /**
     * Returns whether the value of the '{@link Powrmart.TASKINSTANCEType#getFAILPARENTIFINSTANCEDIDNOTRUN <em>FAILPARENTIFINSTANCEDIDNOTRUN</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>FAILPARENTIFINSTANCEDIDNOTRUN</em>' attribute is set.
     * @see #unsetFAILPARENTIFINSTANCEDIDNOTRUN()
     * @see #getFAILPARENTIFINSTANCEDIDNOTRUN()
     * @see #setFAILPARENTIFINSTANCEDIDNOTRUN(FAILPARENTIFINSTANCEDIDNOTRUNType)
     * @generated
     */
    boolean isSetFAILPARENTIFINSTANCEDIDNOTRUN();

    /**
     * Returns the value of the '<em><b>FAILPARENTIFINSTANCEFAILS</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.FAILPARENTIFINSTANCEFAILSType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>FAILPARENTIFINSTANCEFAILS</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>FAILPARENTIFINSTANCEFAILS</em>' attribute.
     * @see Powrmart.FAILPARENTIFINSTANCEFAILSType
     * @see #isSetFAILPARENTIFINSTANCEFAILS()
     * @see #unsetFAILPARENTIFINSTANCEFAILS()
     * @see #setFAILPARENTIFINSTANCEFAILS(FAILPARENTIFINSTANCEFAILSType)
     * @see Powrmart.PowrmartPackage#getTASKINSTANCEType_FAILPARENTIFINSTANCEFAILS()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='FAIL_PARENT_IF_INSTANCE_FAILS' namespace='##targetNamespace'"
     * @generated
     */
    FAILPARENTIFINSTANCEFAILSType getFAILPARENTIFINSTANCEFAILS();

    /**
     * Sets the value of the '{@link Powrmart.TASKINSTANCEType#getFAILPARENTIFINSTANCEFAILS <em>FAILPARENTIFINSTANCEFAILS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>FAILPARENTIFINSTANCEFAILS</em>' attribute.
     * @see Powrmart.FAILPARENTIFINSTANCEFAILSType
     * @see #isSetFAILPARENTIFINSTANCEFAILS()
     * @see #unsetFAILPARENTIFINSTANCEFAILS()
     * @see #getFAILPARENTIFINSTANCEFAILS()
     * @generated
     */
    void setFAILPARENTIFINSTANCEFAILS(FAILPARENTIFINSTANCEFAILSType value);

    /**
     * Unsets the value of the '{@link Powrmart.TASKINSTANCEType#getFAILPARENTIFINSTANCEFAILS <em>FAILPARENTIFINSTANCEFAILS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFAILPARENTIFINSTANCEFAILS()
     * @see #getFAILPARENTIFINSTANCEFAILS()
     * @see #setFAILPARENTIFINSTANCEFAILS(FAILPARENTIFINSTANCEFAILSType)
     * @generated
     */
    void unsetFAILPARENTIFINSTANCEFAILS();

    /**
     * Returns whether the value of the '{@link Powrmart.TASKINSTANCEType#getFAILPARENTIFINSTANCEFAILS <em>FAILPARENTIFINSTANCEFAILS</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>FAILPARENTIFINSTANCEFAILS</em>' attribute is set.
     * @see #unsetFAILPARENTIFINSTANCEFAILS()
     * @see #getFAILPARENTIFINSTANCEFAILS()
     * @see #setFAILPARENTIFINSTANCEFAILS(FAILPARENTIFINSTANCEFAILSType)
     * @generated
     */
    boolean isSetFAILPARENTIFINSTANCEFAILS();

    /**
     * Returns the value of the '<em><b>ISENABLED</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.ISENABLEDType1}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ISENABLED</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ISENABLED</em>' attribute.
     * @see Powrmart.ISENABLEDType1
     * @see #isSetISENABLED()
     * @see #unsetISENABLED()
     * @see #setISENABLED(ISENABLEDType1)
     * @see Powrmart.PowrmartPackage#getTASKINSTANCEType_ISENABLED()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='ISENABLED' namespace='##targetNamespace'"
     * @generated
     */
    ISENABLEDType1 getISENABLED();

    /**
     * Sets the value of the '{@link Powrmart.TASKINSTANCEType#getISENABLED <em>ISENABLED</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ISENABLED</em>' attribute.
     * @see Powrmart.ISENABLEDType1
     * @see #isSetISENABLED()
     * @see #unsetISENABLED()
     * @see #getISENABLED()
     * @generated
     */
    void setISENABLED(ISENABLEDType1 value);

    /**
     * Unsets the value of the '{@link Powrmart.TASKINSTANCEType#getISENABLED <em>ISENABLED</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetISENABLED()
     * @see #getISENABLED()
     * @see #setISENABLED(ISENABLEDType1)
     * @generated
     */
    void unsetISENABLED();

    /**
     * Returns whether the value of the '{@link Powrmart.TASKINSTANCEType#getISENABLED <em>ISENABLED</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>ISENABLED</em>' attribute is set.
     * @see #unsetISENABLED()
     * @see #getISENABLED()
     * @see #setISENABLED(ISENABLEDType1)
     * @generated
     */
    boolean isSetISENABLED();

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
     * @see Powrmart.PowrmartPackage#getTASKINSTANCEType_NAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='NAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getNAME();

    /**
     * Sets the value of the '{@link Powrmart.TASKINSTANCEType#getNAME <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NAME</em>' attribute.
     * @see #getNAME()
     * @generated
     */
    void setNAME(Object value);

    /**
     * Returns the value of the '<em><b>REUSABLE</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.REUSABLEType2}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>REUSABLE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>REUSABLE</em>' attribute.
     * @see Powrmart.REUSABLEType2
     * @see #isSetREUSABLE()
     * @see #unsetREUSABLE()
     * @see #setREUSABLE(REUSABLEType2)
     * @see Powrmart.PowrmartPackage#getTASKINSTANCEType_REUSABLE()
     * @model unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='REUSABLE' namespace='##targetNamespace'"
     * @generated
     */
    REUSABLEType2 getREUSABLE();

    /**
     * Sets the value of the '{@link Powrmart.TASKINSTANCEType#getREUSABLE <em>REUSABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>REUSABLE</em>' attribute.
     * @see Powrmart.REUSABLEType2
     * @see #isSetREUSABLE()
     * @see #unsetREUSABLE()
     * @see #getREUSABLE()
     * @generated
     */
    void setREUSABLE(REUSABLEType2 value);

    /**
     * Unsets the value of the '{@link Powrmart.TASKINSTANCEType#getREUSABLE <em>REUSABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetREUSABLE()
     * @see #getREUSABLE()
     * @see #setREUSABLE(REUSABLEType2)
     * @generated
     */
    void unsetREUSABLE();

    /**
     * Returns whether the value of the '{@link Powrmart.TASKINSTANCEType#getREUSABLE <em>REUSABLE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>REUSABLE</em>' attribute is set.
     * @see #unsetREUSABLE()
     * @see #getREUSABLE()
     * @see #setREUSABLE(REUSABLEType2)
     * @generated
     */
    boolean isSetREUSABLE();

    /**
     * Returns the value of the '<em><b>SERVEROVERRIDE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SERVEROVERRIDE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SERVEROVERRIDE</em>' attribute.
     * @see #setSERVEROVERRIDE(Object)
     * @see Powrmart.PowrmartPackage#getTASKINSTANCEType_SERVEROVERRIDE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='SERVER_OVERRIDE' namespace='##targetNamespace'"
     * @generated
     */
    Object getSERVEROVERRIDE();

    /**
     * Sets the value of the '{@link Powrmart.TASKINSTANCEType#getSERVEROVERRIDE <em>SERVEROVERRIDE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SERVEROVERRIDE</em>' attribute.
     * @see #getSERVEROVERRIDE()
     * @generated
     */
    void setSERVEROVERRIDE(Object value);

    /**
     * Returns the value of the '<em><b>TASKNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TASKNAME</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TASKNAME</em>' attribute.
     * @see #setTASKNAME(Object)
     * @see Powrmart.PowrmartPackage#getTASKINSTANCEType_TASKNAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='TASKNAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getTASKNAME();

    /**
     * Sets the value of the '{@link Powrmart.TASKINSTANCEType#getTASKNAME <em>TASKNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TASKNAME</em>' attribute.
     * @see #getTASKNAME()
     * @generated
     */
    void setTASKNAME(Object value);

    /**
     * Returns the value of the '<em><b>TASKTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TASKTYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TASKTYPE</em>' attribute.
     * @see #setTASKTYPE(Object)
     * @see Powrmart.PowrmartPackage#getTASKINSTANCEType_TASKTYPE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='TASKTYPE' namespace='##targetNamespace'"
     * @generated
     */
    Object getTASKTYPE();

    /**
     * Sets the value of the '{@link Powrmart.TASKINSTANCEType#getTASKTYPE <em>TASKTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TASKTYPE</em>' attribute.
     * @see #getTASKTYPE()
     * @generated
     */
    void setTASKTYPE(Object value);

    /**
     * Returns the value of the '<em><b>TREATINPUTLINKASAND</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.TREATINPUTLINKASANDType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TREATINPUTLINKASAND</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TREATINPUTLINKASAND</em>' attribute.
     * @see Powrmart.TREATINPUTLINKASANDType
     * @see #isSetTREATINPUTLINKASAND()
     * @see #unsetTREATINPUTLINKASAND()
     * @see #setTREATINPUTLINKASAND(TREATINPUTLINKASANDType)
     * @see Powrmart.PowrmartPackage#getTASKINSTANCEType_TREATINPUTLINKASAND()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='TREAT_INPUTLINK_AS_AND' namespace='##targetNamespace'"
     * @generated
     */
    TREATINPUTLINKASANDType getTREATINPUTLINKASAND();

    /**
     * Sets the value of the '{@link Powrmart.TASKINSTANCEType#getTREATINPUTLINKASAND <em>TREATINPUTLINKASAND</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TREATINPUTLINKASAND</em>' attribute.
     * @see Powrmart.TREATINPUTLINKASANDType
     * @see #isSetTREATINPUTLINKASAND()
     * @see #unsetTREATINPUTLINKASAND()
     * @see #getTREATINPUTLINKASAND()
     * @generated
     */
    void setTREATINPUTLINKASAND(TREATINPUTLINKASANDType value);

    /**
     * Unsets the value of the '{@link Powrmart.TASKINSTANCEType#getTREATINPUTLINKASAND <em>TREATINPUTLINKASAND</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTREATINPUTLINKASAND()
     * @see #getTREATINPUTLINKASAND()
     * @see #setTREATINPUTLINKASAND(TREATINPUTLINKASANDType)
     * @generated
     */
    void unsetTREATINPUTLINKASAND();

    /**
     * Returns whether the value of the '{@link Powrmart.TASKINSTANCEType#getTREATINPUTLINKASAND <em>TREATINPUTLINKASAND</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>TREATINPUTLINKASAND</em>' attribute is set.
     * @see #unsetTREATINPUTLINKASAND()
     * @see #getTREATINPUTLINKASAND()
     * @see #setTREATINPUTLINKASAND(TREATINPUTLINKASANDType)
     * @generated
     */
    boolean isSetTREATINPUTLINKASAND();

} // TASKINSTANCEType
