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
 * A representation of the model object '<em><b>SESSIONCOMPONENT Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.SESSIONCOMPONENTType#getTASK <em>TASK</em>}</li>
 *   <li>{@link Powrmart.SESSIONCOMPONENTType#getVALUEPAIR <em>VALUEPAIR</em>}</li>
 *   <li>{@link Powrmart.SESSIONCOMPONENTType#getATTRIBUTE <em>ATTRIBUTE</em>}</li>
 *   <li>{@link Powrmart.SESSIONCOMPONENTType#getISNONE <em>ISNONE</em>}</li>
 *   <li>{@link Powrmart.SESSIONCOMPONENTType#getREFOBJECTNAME <em>REFOBJECTNAME</em>}</li>
 *   <li>{@link Powrmart.SESSIONCOMPONENTType#getREUSABLE <em>REUSABLE</em>}</li>
 *   <li>{@link Powrmart.SESSIONCOMPONENTType#getTYPE <em>TYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getSESSIONCOMPONENTType()
 * @model extendedMetaData="name='SESSIONCOMPONENT_._type' kind='elementOnly'"
 * @generated
 */
public interface SESSIONCOMPONENTType extends EObject {
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
     * @see Powrmart.PowrmartPackage#getSESSIONCOMPONENTType_TASK()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='TASK' namespace='##targetNamespace'"
     * @generated
     */
    TASKType getTASK();

    /**
     * Sets the value of the '{@link Powrmart.SESSIONCOMPONENTType#getTASK <em>TASK</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TASK</em>' containment reference.
     * @see #getTASK()
     * @generated
     */
    void setTASK(TASKType value);

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
     * @see Powrmart.PowrmartPackage#getSESSIONCOMPONENTType_VALUEPAIR()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='VALUEPAIR' namespace='##targetNamespace'"
     * @generated
     */
    EList<VALUEPAIRType> getVALUEPAIR();

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
     * @see Powrmart.PowrmartPackage#getSESSIONCOMPONENTType_ATTRIBUTE()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='ATTRIBUTE' namespace='##targetNamespace'"
     * @generated
     */
    EList<ATTRIBUTEType> getATTRIBUTE();

    /**
     * Returns the value of the '<em><b>ISNONE</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.ISNONEType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ISNONE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ISNONE</em>' attribute.
     * @see Powrmart.ISNONEType
     * @see #isSetISNONE()
     * @see #unsetISNONE()
     * @see #setISNONE(ISNONEType)
     * @see Powrmart.PowrmartPackage#getSESSIONCOMPONENTType_ISNONE()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='ISNONE' namespace='##targetNamespace'"
     * @generated
     */
    ISNONEType getISNONE();

    /**
     * Sets the value of the '{@link Powrmart.SESSIONCOMPONENTType#getISNONE <em>ISNONE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ISNONE</em>' attribute.
     * @see Powrmart.ISNONEType
     * @see #isSetISNONE()
     * @see #unsetISNONE()
     * @see #getISNONE()
     * @generated
     */
    void setISNONE(ISNONEType value);

    /**
     * Unsets the value of the '{@link Powrmart.SESSIONCOMPONENTType#getISNONE <em>ISNONE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetISNONE()
     * @see #getISNONE()
     * @see #setISNONE(ISNONEType)
     * @generated
     */
    void unsetISNONE();

    /**
     * Returns whether the value of the '{@link Powrmart.SESSIONCOMPONENTType#getISNONE <em>ISNONE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>ISNONE</em>' attribute is set.
     * @see #unsetISNONE()
     * @see #getISNONE()
     * @see #setISNONE(ISNONEType)
     * @generated
     */
    boolean isSetISNONE();

    /**
     * Returns the value of the '<em><b>REFOBJECTNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>REFOBJECTNAME</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>REFOBJECTNAME</em>' attribute.
     * @see #setREFOBJECTNAME(Object)
     * @see Powrmart.PowrmartPackage#getSESSIONCOMPONENTType_REFOBJECTNAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='REFOBJECTNAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getREFOBJECTNAME();

    /**
     * Sets the value of the '{@link Powrmart.SESSIONCOMPONENTType#getREFOBJECTNAME <em>REFOBJECTNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>REFOBJECTNAME</em>' attribute.
     * @see #getREFOBJECTNAME()
     * @generated
     */
    void setREFOBJECTNAME(Object value);

    /**
     * Returns the value of the '<em><b>REUSABLE</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.REUSABLEType5}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>REUSABLE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>REUSABLE</em>' attribute.
     * @see Powrmart.REUSABLEType5
     * @see #isSetREUSABLE()
     * @see #unsetREUSABLE()
     * @see #setREUSABLE(REUSABLEType5)
     * @see Powrmart.PowrmartPackage#getSESSIONCOMPONENTType_REUSABLE()
     * @model unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='REUSABLE' namespace='##targetNamespace'"
     * @generated
     */
    REUSABLEType5 getREUSABLE();

    /**
     * Sets the value of the '{@link Powrmart.SESSIONCOMPONENTType#getREUSABLE <em>REUSABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>REUSABLE</em>' attribute.
     * @see Powrmart.REUSABLEType5
     * @see #isSetREUSABLE()
     * @see #unsetREUSABLE()
     * @see #getREUSABLE()
     * @generated
     */
    void setREUSABLE(REUSABLEType5 value);

    /**
     * Unsets the value of the '{@link Powrmart.SESSIONCOMPONENTType#getREUSABLE <em>REUSABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetREUSABLE()
     * @see #getREUSABLE()
     * @see #setREUSABLE(REUSABLEType5)
     * @generated
     */
    void unsetREUSABLE();

    /**
     * Returns whether the value of the '{@link Powrmart.SESSIONCOMPONENTType#getREUSABLE <em>REUSABLE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>REUSABLE</em>' attribute is set.
     * @see #unsetREUSABLE()
     * @see #getREUSABLE()
     * @see #setREUSABLE(REUSABLEType5)
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
     * @see Powrmart.PowrmartPackage#getSESSIONCOMPONENTType_TYPE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='TYPE' namespace='##targetNamespace'"
     * @generated
     */
    Object getTYPE();

    /**
     * Sets the value of the '{@link Powrmart.SESSIONCOMPONENTType#getTYPE <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TYPE</em>' attribute.
     * @see #getTYPE()
     * @generated
     */
    void setTYPE(Object value);

} // SESSIONCOMPONENTType
