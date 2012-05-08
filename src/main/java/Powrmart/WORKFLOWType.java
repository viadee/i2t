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
 * A representation of the model object '<em><b>WORKFLOW Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.WORKFLOWType#getSCHEDULER <em>SCHEDULER</em>}</li>
 *   <li>{@link Powrmart.WORKFLOWType#getTASK <em>TASK</em>}</li>
 *   <li>{@link Powrmart.WORKFLOWType#getSESSION <em>SESSION</em>}</li>
 *   <li>{@link Powrmart.WORKFLOWType#getWORKLET <em>WORKLET</em>}</li>
 *   <li>{@link Powrmart.WORKFLOWType#getTASKINSTANCE <em>TASKINSTANCE</em>}</li>
 *   <li>{@link Powrmart.WORKFLOWType#getWORKFLOWLINK <em>WORKFLOWLINK</em>}</li>
 *   <li>{@link Powrmart.WORKFLOWType#getWORKFLOWVARIABLE <em>WORKFLOWVARIABLE</em>}</li>
 *   <li>{@link Powrmart.WORKFLOWType#getWORKFLOWEVENT <em>WORKFLOWEVENT</em>}</li>
 *   <li>{@link Powrmart.WORKFLOWType#getATTRIBUTE <em>ATTRIBUTE</em>}</li>
 *   <li>{@link Powrmart.WORKFLOWType#getMETADATAEXTENSION <em>METADATAEXTENSION</em>}</li>
 *   <li>{@link Powrmart.WORKFLOWType#getCONWFRUNINFO <em>CONWFRUNINFO</em>}</li>
 *   <li>{@link Powrmart.WORKFLOWType#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.WORKFLOWType#getISENABLED <em>ISENABLED</em>}</li>
 *   <li>{@link Powrmart.WORKFLOWType#getISRUNNABLESERVICE <em>ISRUNNABLESERVICE</em>}</li>
 *   <li>{@link Powrmart.WORKFLOWType#getISSERVICE <em>ISSERVICE</em>}</li>
 *   <li>{@link Powrmart.WORKFLOWType#getISVALID <em>ISVALID</em>}</li>
 *   <li>{@link Powrmart.WORKFLOWType#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.WORKFLOWType#getREUSABLESCHEDULER <em>REUSABLESCHEDULER</em>}</li>
 *   <li>{@link Powrmart.WORKFLOWType#getSCHEDULERNAME <em>SCHEDULERNAME</em>}</li>
 *   <li>{@link Powrmart.WORKFLOWType#getSERVERDOMAINNAME <em>SERVERDOMAINNAME</em>}</li>
 *   <li>{@link Powrmart.WORKFLOWType#getSERVERNAME <em>SERVERNAME</em>}</li>
 *   <li>{@link Powrmart.WORKFLOWType#getSERVICELEVELNAME <em>SERVICELEVELNAME</em>}</li>
 *   <li>{@link Powrmart.WORKFLOWType#getSUSPENDONERROR <em>SUSPENDONERROR</em>}</li>
 *   <li>{@link Powrmart.WORKFLOWType#getSUSPENSIONEMAIL <em>SUSPENSIONEMAIL</em>}</li>
 *   <li>{@link Powrmart.WORKFLOWType#getTASKSMUSTRUNONSERVER <em>TASKSMUSTRUNONSERVER</em>}</li>
 *   <li>{@link Powrmart.WORKFLOWType#getVERSIONNUMBER <em>VERSIONNUMBER</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getWORKFLOWType()
 * @model extendedMetaData="name='WORKFLOW_._type' kind='elementOnly'"
 * @generated
 */
public interface WORKFLOWType extends EObject {
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
     * @see Powrmart.PowrmartPackage#getWORKFLOWType_SCHEDULER()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='SCHEDULER' namespace='##targetNamespace'"
     * @generated
     */
    SCHEDULERType getSCHEDULER();

    /**
     * Sets the value of the '{@link Powrmart.WORKFLOWType#getSCHEDULER <em>SCHEDULER</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SCHEDULER</em>' containment reference.
     * @see #getSCHEDULER()
     * @generated
     */
    void setSCHEDULER(SCHEDULERType value);

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
     * @see Powrmart.PowrmartPackage#getWORKFLOWType_TASK()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='TASK' namespace='##targetNamespace'"
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
     * @see Powrmart.PowrmartPackage#getWORKFLOWType_SESSION()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='SESSION' namespace='##targetNamespace'"
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
     * @see Powrmart.PowrmartPackage#getWORKFLOWType_WORKLET()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='WORKLET' namespace='##targetNamespace'"
     * @generated
     */
    EList<WORKLETType> getWORKLET();

    /**
     * Returns the value of the '<em><b>TASKINSTANCE</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.TASKINSTANCEType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TASKINSTANCE</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TASKINSTANCE</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getWORKFLOWType_TASKINSTANCE()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='TASKINSTANCE' namespace='##targetNamespace'"
     * @generated
     */
    EList<TASKINSTANCEType> getTASKINSTANCE();

    /**
     * Returns the value of the '<em><b>WORKFLOWLINK</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.WORKFLOWLINKType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>WORKFLOWLINK</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>WORKFLOWLINK</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getWORKFLOWType_WORKFLOWLINK()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='WORKFLOWLINK' namespace='##targetNamespace'"
     * @generated
     */
    EList<WORKFLOWLINKType> getWORKFLOWLINK();

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
     * @see Powrmart.PowrmartPackage#getWORKFLOWType_WORKFLOWVARIABLE()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='WORKFLOWVARIABLE' namespace='##targetNamespace'"
     * @generated
     */
    EList<WORKFLOWVARIABLEType> getWORKFLOWVARIABLE();

    /**
     * Returns the value of the '<em><b>WORKFLOWEVENT</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.WORKFLOWEVENTType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>WORKFLOWEVENT</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>WORKFLOWEVENT</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getWORKFLOWType_WORKFLOWEVENT()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='WORKFLOWEVENT' namespace='##targetNamespace'"
     * @generated
     */
    EList<WORKFLOWEVENTType> getWORKFLOWEVENT();

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
     * @see Powrmart.PowrmartPackage#getWORKFLOWType_ATTRIBUTE()
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
     * @see Powrmart.PowrmartPackage#getWORKFLOWType_METADATAEXTENSION()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='METADATAEXTENSION' namespace='##targetNamespace'"
     * @generated
     */
    EList<METADATAEXTENSIONType> getMETADATAEXTENSION();

    /**
     * Returns the value of the '<em><b>CONWFRUNINFO</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.CONWFRUNINFOType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>CONWFRUNINFO</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>CONWFRUNINFO</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getWORKFLOWType_CONWFRUNINFO()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='CONWFRUNINFO' namespace='##targetNamespace'"
     * @generated
     */
    EList<CONWFRUNINFOType> getCONWFRUNINFO();

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
     * @see Powrmart.PowrmartPackage#getWORKFLOWType_DESCRIPTION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='DESCRIPTION' namespace='##targetNamespace'"
     * @generated
     */
    Object getDESCRIPTION();

    /**
     * Sets the value of the '{@link Powrmart.WORKFLOWType#getDESCRIPTION <em>DESCRIPTION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DESCRIPTION</em>' attribute.
     * @see #getDESCRIPTION()
     * @generated
     */
    void setDESCRIPTION(Object value);

    /**
     * Returns the value of the '<em><b>ISENABLED</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.ISENABLEDType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ISENABLED</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ISENABLED</em>' attribute.
     * @see Powrmart.ISENABLEDType
     * @see #isSetISENABLED()
     * @see #unsetISENABLED()
     * @see #setISENABLED(ISENABLEDType)
     * @see Powrmart.PowrmartPackage#getWORKFLOWType_ISENABLED()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='ISENABLED' namespace='##targetNamespace'"
     * @generated
     */
    ISENABLEDType getISENABLED();

    /**
     * Sets the value of the '{@link Powrmart.WORKFLOWType#getISENABLED <em>ISENABLED</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ISENABLED</em>' attribute.
     * @see Powrmart.ISENABLEDType
     * @see #isSetISENABLED()
     * @see #unsetISENABLED()
     * @see #getISENABLED()
     * @generated
     */
    void setISENABLED(ISENABLEDType value);

    /**
     * Unsets the value of the '{@link Powrmart.WORKFLOWType#getISENABLED <em>ISENABLED</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetISENABLED()
     * @see #getISENABLED()
     * @see #setISENABLED(ISENABLEDType)
     * @generated
     */
    void unsetISENABLED();

    /**
     * Returns whether the value of the '{@link Powrmart.WORKFLOWType#getISENABLED <em>ISENABLED</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>ISENABLED</em>' attribute is set.
     * @see #unsetISENABLED()
     * @see #getISENABLED()
     * @see #setISENABLED(ISENABLEDType)
     * @generated
     */
    boolean isSetISENABLED();

    /**
     * Returns the value of the '<em><b>ISRUNNABLESERVICE</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.ISRUNNABLESERVICEType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ISRUNNABLESERVICE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ISRUNNABLESERVICE</em>' attribute.
     * @see Powrmart.ISRUNNABLESERVICEType
     * @see #isSetISRUNNABLESERVICE()
     * @see #unsetISRUNNABLESERVICE()
     * @see #setISRUNNABLESERVICE(ISRUNNABLESERVICEType)
     * @see Powrmart.PowrmartPackage#getWORKFLOWType_ISRUNNABLESERVICE()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='ISRUNNABLESERVICE' namespace='##targetNamespace'"
     * @generated
     */
    ISRUNNABLESERVICEType getISRUNNABLESERVICE();

    /**
     * Sets the value of the '{@link Powrmart.WORKFLOWType#getISRUNNABLESERVICE <em>ISRUNNABLESERVICE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ISRUNNABLESERVICE</em>' attribute.
     * @see Powrmart.ISRUNNABLESERVICEType
     * @see #isSetISRUNNABLESERVICE()
     * @see #unsetISRUNNABLESERVICE()
     * @see #getISRUNNABLESERVICE()
     * @generated
     */
    void setISRUNNABLESERVICE(ISRUNNABLESERVICEType value);

    /**
     * Unsets the value of the '{@link Powrmart.WORKFLOWType#getISRUNNABLESERVICE <em>ISRUNNABLESERVICE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetISRUNNABLESERVICE()
     * @see #getISRUNNABLESERVICE()
     * @see #setISRUNNABLESERVICE(ISRUNNABLESERVICEType)
     * @generated
     */
    void unsetISRUNNABLESERVICE();

    /**
     * Returns whether the value of the '{@link Powrmart.WORKFLOWType#getISRUNNABLESERVICE <em>ISRUNNABLESERVICE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>ISRUNNABLESERVICE</em>' attribute is set.
     * @see #unsetISRUNNABLESERVICE()
     * @see #getISRUNNABLESERVICE()
     * @see #setISRUNNABLESERVICE(ISRUNNABLESERVICEType)
     * @generated
     */
    boolean isSetISRUNNABLESERVICE();

    /**
     * Returns the value of the '<em><b>ISSERVICE</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.ISSERVICEType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ISSERVICE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ISSERVICE</em>' attribute.
     * @see Powrmart.ISSERVICEType
     * @see #isSetISSERVICE()
     * @see #unsetISSERVICE()
     * @see #setISSERVICE(ISSERVICEType)
     * @see Powrmart.PowrmartPackage#getWORKFLOWType_ISSERVICE()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='ISSERVICE' namespace='##targetNamespace'"
     * @generated
     */
    ISSERVICEType getISSERVICE();

    /**
     * Sets the value of the '{@link Powrmart.WORKFLOWType#getISSERVICE <em>ISSERVICE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ISSERVICE</em>' attribute.
     * @see Powrmart.ISSERVICEType
     * @see #isSetISSERVICE()
     * @see #unsetISSERVICE()
     * @see #getISSERVICE()
     * @generated
     */
    void setISSERVICE(ISSERVICEType value);

    /**
     * Unsets the value of the '{@link Powrmart.WORKFLOWType#getISSERVICE <em>ISSERVICE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetISSERVICE()
     * @see #getISSERVICE()
     * @see #setISSERVICE(ISSERVICEType)
     * @generated
     */
    void unsetISSERVICE();

    /**
     * Returns whether the value of the '{@link Powrmart.WORKFLOWType#getISSERVICE <em>ISSERVICE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>ISSERVICE</em>' attribute is set.
     * @see #unsetISSERVICE()
     * @see #getISSERVICE()
     * @see #setISSERVICE(ISSERVICEType)
     * @generated
     */
    boolean isSetISSERVICE();

    /**
     * Returns the value of the '<em><b>ISVALID</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.ISVALIDType1}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ISVALID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ISVALID</em>' attribute.
     * @see Powrmart.ISVALIDType1
     * @see #isSetISVALID()
     * @see #unsetISVALID()
     * @see #setISVALID(ISVALIDType1)
     * @see Powrmart.PowrmartPackage#getWORKFLOWType_ISVALID()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='ISVALID' namespace='##targetNamespace'"
     * @generated
     */
    ISVALIDType1 getISVALID();

    /**
     * Sets the value of the '{@link Powrmart.WORKFLOWType#getISVALID <em>ISVALID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ISVALID</em>' attribute.
     * @see Powrmart.ISVALIDType1
     * @see #isSetISVALID()
     * @see #unsetISVALID()
     * @see #getISVALID()
     * @generated
     */
    void setISVALID(ISVALIDType1 value);

    /**
     * Unsets the value of the '{@link Powrmart.WORKFLOWType#getISVALID <em>ISVALID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetISVALID()
     * @see #getISVALID()
     * @see #setISVALID(ISVALIDType1)
     * @generated
     */
    void unsetISVALID();

    /**
     * Returns whether the value of the '{@link Powrmart.WORKFLOWType#getISVALID <em>ISVALID</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>ISVALID</em>' attribute is set.
     * @see #unsetISVALID()
     * @see #getISVALID()
     * @see #setISVALID(ISVALIDType1)
     * @generated
     */
    boolean isSetISVALID();

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
     * @see Powrmart.PowrmartPackage#getWORKFLOWType_NAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='NAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getNAME();

    /**
     * Sets the value of the '{@link Powrmart.WORKFLOWType#getNAME <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NAME</em>' attribute.
     * @see #getNAME()
     * @generated
     */
    void setNAME(Object value);

    /**
     * Returns the value of the '<em><b>REUSABLESCHEDULER</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.REUSABLESCHEDULERType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>REUSABLESCHEDULER</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>REUSABLESCHEDULER</em>' attribute.
     * @see Powrmart.REUSABLESCHEDULERType
     * @see #isSetREUSABLESCHEDULER()
     * @see #unsetREUSABLESCHEDULER()
     * @see #setREUSABLESCHEDULER(REUSABLESCHEDULERType)
     * @see Powrmart.PowrmartPackage#getWORKFLOWType_REUSABLESCHEDULER()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='REUSABLE_SCHEDULER' namespace='##targetNamespace'"
     * @generated
     */
    REUSABLESCHEDULERType getREUSABLESCHEDULER();

    /**
     * Sets the value of the '{@link Powrmart.WORKFLOWType#getREUSABLESCHEDULER <em>REUSABLESCHEDULER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>REUSABLESCHEDULER</em>' attribute.
     * @see Powrmart.REUSABLESCHEDULERType
     * @see #isSetREUSABLESCHEDULER()
     * @see #unsetREUSABLESCHEDULER()
     * @see #getREUSABLESCHEDULER()
     * @generated
     */
    void setREUSABLESCHEDULER(REUSABLESCHEDULERType value);

    /**
     * Unsets the value of the '{@link Powrmart.WORKFLOWType#getREUSABLESCHEDULER <em>REUSABLESCHEDULER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetREUSABLESCHEDULER()
     * @see #getREUSABLESCHEDULER()
     * @see #setREUSABLESCHEDULER(REUSABLESCHEDULERType)
     * @generated
     */
    void unsetREUSABLESCHEDULER();

    /**
     * Returns whether the value of the '{@link Powrmart.WORKFLOWType#getREUSABLESCHEDULER <em>REUSABLESCHEDULER</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>REUSABLESCHEDULER</em>' attribute is set.
     * @see #unsetREUSABLESCHEDULER()
     * @see #getREUSABLESCHEDULER()
     * @see #setREUSABLESCHEDULER(REUSABLESCHEDULERType)
     * @generated
     */
    boolean isSetREUSABLESCHEDULER();

    /**
     * Returns the value of the '<em><b>SCHEDULERNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SCHEDULERNAME</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SCHEDULERNAME</em>' attribute.
     * @see #setSCHEDULERNAME(Object)
     * @see Powrmart.PowrmartPackage#getWORKFLOWType_SCHEDULERNAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='SCHEDULERNAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getSCHEDULERNAME();

    /**
     * Sets the value of the '{@link Powrmart.WORKFLOWType#getSCHEDULERNAME <em>SCHEDULERNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SCHEDULERNAME</em>' attribute.
     * @see #getSCHEDULERNAME()
     * @generated
     */
    void setSCHEDULERNAME(Object value);

    /**
     * Returns the value of the '<em><b>SERVERDOMAINNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SERVERDOMAINNAME</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SERVERDOMAINNAME</em>' attribute.
     * @see #setSERVERDOMAINNAME(Object)
     * @see Powrmart.PowrmartPackage#getWORKFLOWType_SERVERDOMAINNAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='SERVER_DOMAINNAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getSERVERDOMAINNAME();

    /**
     * Sets the value of the '{@link Powrmart.WORKFLOWType#getSERVERDOMAINNAME <em>SERVERDOMAINNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SERVERDOMAINNAME</em>' attribute.
     * @see #getSERVERDOMAINNAME()
     * @generated
     */
    void setSERVERDOMAINNAME(Object value);

    /**
     * Returns the value of the '<em><b>SERVERNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SERVERNAME</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SERVERNAME</em>' attribute.
     * @see #setSERVERNAME(Object)
     * @see Powrmart.PowrmartPackage#getWORKFLOWType_SERVERNAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='SERVERNAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getSERVERNAME();

    /**
     * Sets the value of the '{@link Powrmart.WORKFLOWType#getSERVERNAME <em>SERVERNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SERVERNAME</em>' attribute.
     * @see #getSERVERNAME()
     * @generated
     */
    void setSERVERNAME(Object value);

    /**
     * Returns the value of the '<em><b>SERVICELEVELNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SERVICELEVELNAME</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SERVICELEVELNAME</em>' attribute.
     * @see #setSERVICELEVELNAME(Object)
     * @see Powrmart.PowrmartPackage#getWORKFLOWType_SERVICELEVELNAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='SERVICELEVELNAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getSERVICELEVELNAME();

    /**
     * Sets the value of the '{@link Powrmart.WORKFLOWType#getSERVICELEVELNAME <em>SERVICELEVELNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SERVICELEVELNAME</em>' attribute.
     * @see #getSERVICELEVELNAME()
     * @generated
     */
    void setSERVICELEVELNAME(Object value);

    /**
     * Returns the value of the '<em><b>SUSPENDONERROR</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.SUSPENDONERRORType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SUSPENDONERROR</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SUSPENDONERROR</em>' attribute.
     * @see Powrmart.SUSPENDONERRORType
     * @see #isSetSUSPENDONERROR()
     * @see #unsetSUSPENDONERROR()
     * @see #setSUSPENDONERROR(SUSPENDONERRORType)
     * @see Powrmart.PowrmartPackage#getWORKFLOWType_SUSPENDONERROR()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='SUSPEND_ON_ERROR' namespace='##targetNamespace'"
     * @generated
     */
    SUSPENDONERRORType getSUSPENDONERROR();

    /**
     * Sets the value of the '{@link Powrmart.WORKFLOWType#getSUSPENDONERROR <em>SUSPENDONERROR</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SUSPENDONERROR</em>' attribute.
     * @see Powrmart.SUSPENDONERRORType
     * @see #isSetSUSPENDONERROR()
     * @see #unsetSUSPENDONERROR()
     * @see #getSUSPENDONERROR()
     * @generated
     */
    void setSUSPENDONERROR(SUSPENDONERRORType value);

    /**
     * Unsets the value of the '{@link Powrmart.WORKFLOWType#getSUSPENDONERROR <em>SUSPENDONERROR</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSUSPENDONERROR()
     * @see #getSUSPENDONERROR()
     * @see #setSUSPENDONERROR(SUSPENDONERRORType)
     * @generated
     */
    void unsetSUSPENDONERROR();

    /**
     * Returns whether the value of the '{@link Powrmart.WORKFLOWType#getSUSPENDONERROR <em>SUSPENDONERROR</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>SUSPENDONERROR</em>' attribute is set.
     * @see #unsetSUSPENDONERROR()
     * @see #getSUSPENDONERROR()
     * @see #setSUSPENDONERROR(SUSPENDONERRORType)
     * @generated
     */
    boolean isSetSUSPENDONERROR();

    /**
     * Returns the value of the '<em><b>SUSPENSIONEMAIL</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SUSPENSIONEMAIL</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SUSPENSIONEMAIL</em>' attribute.
     * @see #setSUSPENSIONEMAIL(Object)
     * @see Powrmart.PowrmartPackage#getWORKFLOWType_SUSPENSIONEMAIL()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='SUSPENSION_EMAIL' namespace='##targetNamespace'"
     * @generated
     */
    Object getSUSPENSIONEMAIL();

    /**
     * Sets the value of the '{@link Powrmart.WORKFLOWType#getSUSPENSIONEMAIL <em>SUSPENSIONEMAIL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SUSPENSIONEMAIL</em>' attribute.
     * @see #getSUSPENSIONEMAIL()
     * @generated
     */
    void setSUSPENSIONEMAIL(Object value);

    /**
     * Returns the value of the '<em><b>TASKSMUSTRUNONSERVER</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.TASKSMUSTRUNONSERVERType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TASKSMUSTRUNONSERVER</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TASKSMUSTRUNONSERVER</em>' attribute.
     * @see Powrmart.TASKSMUSTRUNONSERVERType
     * @see #isSetTASKSMUSTRUNONSERVER()
     * @see #unsetTASKSMUSTRUNONSERVER()
     * @see #setTASKSMUSTRUNONSERVER(TASKSMUSTRUNONSERVERType)
     * @see Powrmart.PowrmartPackage#getWORKFLOWType_TASKSMUSTRUNONSERVER()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='TASKS_MUST_RUN_ON_SERVER' namespace='##targetNamespace'"
     * @generated
     */
    TASKSMUSTRUNONSERVERType getTASKSMUSTRUNONSERVER();

    /**
     * Sets the value of the '{@link Powrmart.WORKFLOWType#getTASKSMUSTRUNONSERVER <em>TASKSMUSTRUNONSERVER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TASKSMUSTRUNONSERVER</em>' attribute.
     * @see Powrmart.TASKSMUSTRUNONSERVERType
     * @see #isSetTASKSMUSTRUNONSERVER()
     * @see #unsetTASKSMUSTRUNONSERVER()
     * @see #getTASKSMUSTRUNONSERVER()
     * @generated
     */
    void setTASKSMUSTRUNONSERVER(TASKSMUSTRUNONSERVERType value);

    /**
     * Unsets the value of the '{@link Powrmart.WORKFLOWType#getTASKSMUSTRUNONSERVER <em>TASKSMUSTRUNONSERVER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTASKSMUSTRUNONSERVER()
     * @see #getTASKSMUSTRUNONSERVER()
     * @see #setTASKSMUSTRUNONSERVER(TASKSMUSTRUNONSERVERType)
     * @generated
     */
    void unsetTASKSMUSTRUNONSERVER();

    /**
     * Returns whether the value of the '{@link Powrmart.WORKFLOWType#getTASKSMUSTRUNONSERVER <em>TASKSMUSTRUNONSERVER</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>TASKSMUSTRUNONSERVER</em>' attribute is set.
     * @see #unsetTASKSMUSTRUNONSERVER()
     * @see #getTASKSMUSTRUNONSERVER()
     * @see #setTASKSMUSTRUNONSERVER(TASKSMUSTRUNONSERVERType)
     * @generated
     */
    boolean isSetTASKSMUSTRUNONSERVER();

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
     * @see Powrmart.PowrmartPackage#getWORKFLOWType_VERSIONNUMBER()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='VERSIONNUMBER' namespace='##targetNamespace'"
     * @generated
     */
    Object getVERSIONNUMBER();

    /**
     * Sets the value of the '{@link Powrmart.WORKFLOWType#getVERSIONNUMBER <em>VERSIONNUMBER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>VERSIONNUMBER</em>' attribute.
     * @see #getVERSIONNUMBER()
     * @generated
     */
    void setVERSIONNUMBER(Object value);

} // WORKFLOWType
