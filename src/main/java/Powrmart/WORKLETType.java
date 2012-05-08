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
 * A representation of the model object '<em><b>WORKLET Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.WORKLETType#getTASK <em>TASK</em>}</li>
 *   <li>{@link Powrmart.WORKLETType#getSESSION <em>SESSION</em>}</li>
 *   <li>{@link Powrmart.WORKLETType#getWORKLET <em>WORKLET</em>}</li>
 *   <li>{@link Powrmart.WORKLETType#getTASKINSTANCE <em>TASKINSTANCE</em>}</li>
 *   <li>{@link Powrmart.WORKLETType#getWORKFLOWLINK <em>WORKFLOWLINK</em>}</li>
 *   <li>{@link Powrmart.WORKLETType#getWORKFLOWVARIABLE <em>WORKFLOWVARIABLE</em>}</li>
 *   <li>{@link Powrmart.WORKLETType#getWORKFLOWEVENT <em>WORKFLOWEVENT</em>}</li>
 *   <li>{@link Powrmart.WORKLETType#getATTRIBUTE <em>ATTRIBUTE</em>}</li>
 *   <li>{@link Powrmart.WORKLETType#getMETADATAEXTENSION <em>METADATAEXTENSION</em>}</li>
 *   <li>{@link Powrmart.WORKLETType#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.WORKLETType#getISVALID <em>ISVALID</em>}</li>
 *   <li>{@link Powrmart.WORKLETType#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.WORKLETType#getPARENT <em>PARENT</em>}</li>
 *   <li>{@link Powrmart.WORKLETType#getPARENTTYPE <em>PARENTTYPE</em>}</li>
 *   <li>{@link Powrmart.WORKLETType#getREUSABLE <em>REUSABLE</em>}</li>
 *   <li>{@link Powrmart.WORKLETType#getVERSIONNUMBER <em>VERSIONNUMBER</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getWORKLETType()
 * @model extendedMetaData="name='WORKLET_._type' kind='elementOnly'"
 * @generated
 */
public interface WORKLETType extends EObject {
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
     * @see Powrmart.PowrmartPackage#getWORKLETType_TASK()
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
     * @see Powrmart.PowrmartPackage#getWORKLETType_SESSION()
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
     * @see Powrmart.PowrmartPackage#getWORKLETType_WORKLET()
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
     * @see Powrmart.PowrmartPackage#getWORKLETType_TASKINSTANCE()
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
     * @see Powrmart.PowrmartPackage#getWORKLETType_WORKFLOWLINK()
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
     * @see Powrmart.PowrmartPackage#getWORKLETType_WORKFLOWVARIABLE()
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
     * @see Powrmart.PowrmartPackage#getWORKLETType_WORKFLOWEVENT()
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
     * @see Powrmart.PowrmartPackage#getWORKLETType_ATTRIBUTE()
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
     * @see Powrmart.PowrmartPackage#getWORKLETType_METADATAEXTENSION()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='METADATAEXTENSION' namespace='##targetNamespace'"
     * @generated
     */
    EList<METADATAEXTENSIONType> getMETADATAEXTENSION();

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
     * @see Powrmart.PowrmartPackage#getWORKLETType_DESCRIPTION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='DESCRIPTION' namespace='##targetNamespace'"
     * @generated
     */
    Object getDESCRIPTION();

    /**
     * Sets the value of the '{@link Powrmart.WORKLETType#getDESCRIPTION <em>DESCRIPTION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DESCRIPTION</em>' attribute.
     * @see #getDESCRIPTION()
     * @generated
     */
    void setDESCRIPTION(Object value);

    /**
     * Returns the value of the '<em><b>ISVALID</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.ISVALIDType2}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ISVALID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ISVALID</em>' attribute.
     * @see Powrmart.ISVALIDType2
     * @see #isSetISVALID()
     * @see #unsetISVALID()
     * @see #setISVALID(ISVALIDType2)
     * @see Powrmart.PowrmartPackage#getWORKLETType_ISVALID()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='ISVALID' namespace='##targetNamespace'"
     * @generated
     */
    ISVALIDType2 getISVALID();

    /**
     * Sets the value of the '{@link Powrmart.WORKLETType#getISVALID <em>ISVALID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ISVALID</em>' attribute.
     * @see Powrmart.ISVALIDType2
     * @see #isSetISVALID()
     * @see #unsetISVALID()
     * @see #getISVALID()
     * @generated
     */
    void setISVALID(ISVALIDType2 value);

    /**
     * Unsets the value of the '{@link Powrmart.WORKLETType#getISVALID <em>ISVALID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetISVALID()
     * @see #getISVALID()
     * @see #setISVALID(ISVALIDType2)
     * @generated
     */
    void unsetISVALID();

    /**
     * Returns whether the value of the '{@link Powrmart.WORKLETType#getISVALID <em>ISVALID</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>ISVALID</em>' attribute is set.
     * @see #unsetISVALID()
     * @see #getISVALID()
     * @see #setISVALID(ISVALIDType2)
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
     * @see Powrmart.PowrmartPackage#getWORKLETType_NAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='NAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getNAME();

    /**
     * Sets the value of the '{@link Powrmart.WORKLETType#getNAME <em>NAME</em>}' attribute.
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
     * @see Powrmart.PowrmartPackage#getWORKLETType_PARENT()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='PARENT' namespace='##targetNamespace'"
     * @generated
     */
    Object getPARENT();

    /**
     * Sets the value of the '{@link Powrmart.WORKLETType#getPARENT <em>PARENT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PARENT</em>' attribute.
     * @see #getPARENT()
     * @generated
     */
    void setPARENT(Object value);

    /**
     * Returns the value of the '<em><b>PARENTTYPE</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.PARENTTYPEType1}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PARENTTYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PARENTTYPE</em>' attribute.
     * @see Powrmart.PARENTTYPEType1
     * @see #isSetPARENTTYPE()
     * @see #unsetPARENTTYPE()
     * @see #setPARENTTYPE(PARENTTYPEType1)
     * @see Powrmart.PowrmartPackage#getWORKLETType_PARENTTYPE()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='PARENT_TYPE' namespace='##targetNamespace'"
     * @generated
     */
    PARENTTYPEType1 getPARENTTYPE();

    /**
     * Sets the value of the '{@link Powrmart.WORKLETType#getPARENTTYPE <em>PARENTTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PARENTTYPE</em>' attribute.
     * @see Powrmart.PARENTTYPEType1
     * @see #isSetPARENTTYPE()
     * @see #unsetPARENTTYPE()
     * @see #getPARENTTYPE()
     * @generated
     */
    void setPARENTTYPE(PARENTTYPEType1 value);

    /**
     * Unsets the value of the '{@link Powrmart.WORKLETType#getPARENTTYPE <em>PARENTTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPARENTTYPE()
     * @see #getPARENTTYPE()
     * @see #setPARENTTYPE(PARENTTYPEType1)
     * @generated
     */
    void unsetPARENTTYPE();

    /**
     * Returns whether the value of the '{@link Powrmart.WORKLETType#getPARENTTYPE <em>PARENTTYPE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>PARENTTYPE</em>' attribute is set.
     * @see #unsetPARENTTYPE()
     * @see #getPARENTTYPE()
     * @see #setPARENTTYPE(PARENTTYPEType1)
     * @generated
     */
    boolean isSetPARENTTYPE();

    /**
     * Returns the value of the '<em><b>REUSABLE</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.REUSABLEType3}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>REUSABLE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>REUSABLE</em>' attribute.
     * @see Powrmart.REUSABLEType3
     * @see #isSetREUSABLE()
     * @see #unsetREUSABLE()
     * @see #setREUSABLE(REUSABLEType3)
     * @see Powrmart.PowrmartPackage#getWORKLETType_REUSABLE()
     * @model unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='REUSABLE' namespace='##targetNamespace'"
     * @generated
     */
    REUSABLEType3 getREUSABLE();

    /**
     * Sets the value of the '{@link Powrmart.WORKLETType#getREUSABLE <em>REUSABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>REUSABLE</em>' attribute.
     * @see Powrmart.REUSABLEType3
     * @see #isSetREUSABLE()
     * @see #unsetREUSABLE()
     * @see #getREUSABLE()
     * @generated
     */
    void setREUSABLE(REUSABLEType3 value);

    /**
     * Unsets the value of the '{@link Powrmart.WORKLETType#getREUSABLE <em>REUSABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetREUSABLE()
     * @see #getREUSABLE()
     * @see #setREUSABLE(REUSABLEType3)
     * @generated
     */
    void unsetREUSABLE();

    /**
     * Returns whether the value of the '{@link Powrmart.WORKLETType#getREUSABLE <em>REUSABLE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>REUSABLE</em>' attribute is set.
     * @see #unsetREUSABLE()
     * @see #getREUSABLE()
     * @see #setREUSABLE(REUSABLEType3)
     * @generated
     */
    boolean isSetREUSABLE();

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
     * @see Powrmart.PowrmartPackage#getWORKLETType_VERSIONNUMBER()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='VERSIONNUMBER' namespace='##targetNamespace'"
     * @generated
     */
    Object getVERSIONNUMBER();

    /**
     * Sets the value of the '{@link Powrmart.WORKLETType#getVERSIONNUMBER <em>VERSIONNUMBER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>VERSIONNUMBER</em>' attribute.
     * @see #getVERSIONNUMBER()
     * @generated
     */
    void setVERSIONNUMBER(Object value);

} // WORKLETType
