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
 * A representation of the model object '<em><b>TASK Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.TASKType#getATTRIBUTE <em>ATTRIBUTE</em>}</li>
 *   <li>{@link Powrmart.TASKType#getEXPRMACRODEPENDENCY <em>EXPRMACRODEPENDENCY</em>}</li>
 *   <li>{@link Powrmart.TASKType#getTIMER <em>TIMER</em>}</li>
 *   <li>{@link Powrmart.TASKType#getVALUEPAIR <em>VALUEPAIR</em>}</li>
 *   <li>{@link Powrmart.TASKType#getRESOURCEREFERENCE <em>RESOURCEREFERENCE</em>}</li>
 *   <li>{@link Powrmart.TASKType#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.TASKType#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.TASKType#getPARENT <em>PARENT</em>}</li>
 *   <li>{@link Powrmart.TASKType#getPARENTTYPE <em>PARENTTYPE</em>}</li>
 *   <li>{@link Powrmart.TASKType#getREUSABLE <em>REUSABLE</em>}</li>
 *   <li>{@link Powrmart.TASKType#getTYPE <em>TYPE</em>}</li>
 *   <li>{@link Powrmart.TASKType#getVERSIONNUMBER <em>VERSIONNUMBER</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getTASKType()
 * @model extendedMetaData="name='TASK_._type' kind='elementOnly'"
 * @generated
 */
public interface TASKType extends EObject {
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
     * @see Powrmart.PowrmartPackage#getTASKType_ATTRIBUTE()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='ATTRIBUTE' namespace='##targetNamespace'"
     * @generated
     */
    EList<ATTRIBUTEType> getATTRIBUTE();

    /**
     * Returns the value of the '<em><b>EXPRMACRODEPENDENCY</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.EXPRMACRODEPENDENCYType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>EXPRMACRODEPENDENCY</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>EXPRMACRODEPENDENCY</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getTASKType_EXPRMACRODEPENDENCY()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='EXPRMACRODEPENDENCY' namespace='##targetNamespace'"
     * @generated
     */
    EList<EXPRMACRODEPENDENCYType> getEXPRMACRODEPENDENCY();

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
     * @see Powrmart.PowrmartPackage#getTASKType_TIMER()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='TIMER' namespace='##targetNamespace'"
     * @generated
     */
    TIMERType getTIMER();

    /**
     * Sets the value of the '{@link Powrmart.TASKType#getTIMER <em>TIMER</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TIMER</em>' containment reference.
     * @see #getTIMER()
     * @generated
     */
    void setTIMER(TIMERType value);

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
     * @see Powrmart.PowrmartPackage#getTASKType_VALUEPAIR()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='VALUEPAIR' namespace='##targetNamespace'"
     * @generated
     */
    EList<VALUEPAIRType> getVALUEPAIR();

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
     * @see Powrmart.PowrmartPackage#getTASKType_RESOURCEREFERENCE()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='RESOURCEREFERENCE' namespace='##targetNamespace'"
     * @generated
     */
    EList<RESOURCEREFERENCEType> getRESOURCEREFERENCE();

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
     * @see Powrmart.PowrmartPackage#getTASKType_DESCRIPTION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='DESCRIPTION' namespace='##targetNamespace'"
     * @generated
     */
    Object getDESCRIPTION();

    /**
     * Sets the value of the '{@link Powrmart.TASKType#getDESCRIPTION <em>DESCRIPTION</em>}' attribute.
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
     * @see Powrmart.PowrmartPackage#getTASKType_NAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='NAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getNAME();

    /**
     * Sets the value of the '{@link Powrmart.TASKType#getNAME <em>NAME</em>}' attribute.
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
     * @see Powrmart.PowrmartPackage#getTASKType_PARENT()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='PARENT' namespace='##targetNamespace'"
     * @generated
     */
    Object getPARENT();

    /**
     * Sets the value of the '{@link Powrmart.TASKType#getPARENT <em>PARENT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PARENT</em>' attribute.
     * @see #getPARENT()
     * @generated
     */
    void setPARENT(Object value);

    /**
     * Returns the value of the '<em><b>PARENTTYPE</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.PARENTTYPEType2}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PARENTTYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PARENTTYPE</em>' attribute.
     * @see Powrmart.PARENTTYPEType2
     * @see #isSetPARENTTYPE()
     * @see #unsetPARENTTYPE()
     * @see #setPARENTTYPE(PARENTTYPEType2)
     * @see Powrmart.PowrmartPackage#getTASKType_PARENTTYPE()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='PARENT_TYPE' namespace='##targetNamespace'"
     * @generated
     */
    PARENTTYPEType2 getPARENTTYPE();

    /**
     * Sets the value of the '{@link Powrmart.TASKType#getPARENTTYPE <em>PARENTTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PARENTTYPE</em>' attribute.
     * @see Powrmart.PARENTTYPEType2
     * @see #isSetPARENTTYPE()
     * @see #unsetPARENTTYPE()
     * @see #getPARENTTYPE()
     * @generated
     */
    void setPARENTTYPE(PARENTTYPEType2 value);

    /**
     * Unsets the value of the '{@link Powrmart.TASKType#getPARENTTYPE <em>PARENTTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPARENTTYPE()
     * @see #getPARENTTYPE()
     * @see #setPARENTTYPE(PARENTTYPEType2)
     * @generated
     */
    void unsetPARENTTYPE();

    /**
     * Returns whether the value of the '{@link Powrmart.TASKType#getPARENTTYPE <em>PARENTTYPE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>PARENTTYPE</em>' attribute is set.
     * @see #unsetPARENTTYPE()
     * @see #getPARENTTYPE()
     * @see #setPARENTTYPE(PARENTTYPEType2)
     * @generated
     */
    boolean isSetPARENTTYPE();

    /**
     * Returns the value of the '<em><b>REUSABLE</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.REUSABLEType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>REUSABLE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>REUSABLE</em>' attribute.
     * @see Powrmart.REUSABLEType
     * @see #isSetREUSABLE()
     * @see #unsetREUSABLE()
     * @see #setREUSABLE(REUSABLEType)
     * @see Powrmart.PowrmartPackage#getTASKType_REUSABLE()
     * @model unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='REUSABLE' namespace='##targetNamespace'"
     * @generated
     */
    REUSABLEType getREUSABLE();

    /**
     * Sets the value of the '{@link Powrmart.TASKType#getREUSABLE <em>REUSABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>REUSABLE</em>' attribute.
     * @see Powrmart.REUSABLEType
     * @see #isSetREUSABLE()
     * @see #unsetREUSABLE()
     * @see #getREUSABLE()
     * @generated
     */
    void setREUSABLE(REUSABLEType value);

    /**
     * Unsets the value of the '{@link Powrmart.TASKType#getREUSABLE <em>REUSABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetREUSABLE()
     * @see #getREUSABLE()
     * @see #setREUSABLE(REUSABLEType)
     * @generated
     */
    void unsetREUSABLE();

    /**
     * Returns whether the value of the '{@link Powrmart.TASKType#getREUSABLE <em>REUSABLE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>REUSABLE</em>' attribute is set.
     * @see #unsetREUSABLE()
     * @see #getREUSABLE()
     * @see #setREUSABLE(REUSABLEType)
     * @generated
     */
    boolean isSetREUSABLE();

    /**
     * Returns the value of the '<em><b>TYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TYPE</em>' attribute.
     * @see #setTYPE(Object)
     * @see Powrmart.PowrmartPackage#getTASKType_TYPE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='TYPE' namespace='##targetNamespace'"
     * @generated
     */
    Object getTYPE();

    /**
     * Sets the value of the '{@link Powrmart.TASKType#getTYPE <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TYPE</em>' attribute.
     * @see #getTYPE()
     * @generated
     */
    void setTYPE(Object value);

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
     * @see Powrmart.PowrmartPackage#getTASKType_VERSIONNUMBER()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='VERSIONNUMBER' namespace='##targetNamespace'"
     * @generated
     */
    Object getVERSIONNUMBER();

    /**
     * Sets the value of the '{@link Powrmart.TASKType#getVERSIONNUMBER <em>VERSIONNUMBER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>VERSIONNUMBER</em>' attribute.
     * @see #getVERSIONNUMBER()
     * @generated
     */
    void setVERSIONNUMBER(Object value);

} // TASKType
