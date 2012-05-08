/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TIMER Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.TIMERType#getSTARTOPTIONS <em>STARTOPTIONS</em>}</li>
 *   <li>{@link Powrmart.TIMERType#getRECURRING <em>RECURRING</em>}</li>
 *   <li>{@link Powrmart.TIMERType#getTIMERTYPE <em>TIMERTYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getTIMERType()
 * @model extendedMetaData="name='TIMER_._type' kind='elementOnly'"
 * @generated
 */
public interface TIMERType extends EObject {
    /**
     * Returns the value of the '<em><b>STARTOPTIONS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>STARTOPTIONS</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>STARTOPTIONS</em>' containment reference.
     * @see #setSTARTOPTIONS(STARTOPTIONSType)
     * @see Powrmart.PowrmartPackage#getTIMERType_STARTOPTIONS()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='STARTOPTIONS' namespace='##targetNamespace'"
     * @generated
     */
    STARTOPTIONSType getSTARTOPTIONS();

    /**
     * Sets the value of the '{@link Powrmart.TIMERType#getSTARTOPTIONS <em>STARTOPTIONS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>STARTOPTIONS</em>' containment reference.
     * @see #getSTARTOPTIONS()
     * @generated
     */
    void setSTARTOPTIONS(STARTOPTIONSType value);

    /**
     * Returns the value of the '<em><b>RECURRING</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>RECURRING</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>RECURRING</em>' containment reference.
     * @see #setRECURRING(RECURRINGType)
     * @see Powrmart.PowrmartPackage#getTIMERType_RECURRING()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='RECURRING' namespace='##targetNamespace'"
     * @generated
     */
    RECURRINGType getRECURRING();

    /**
     * Sets the value of the '{@link Powrmart.TIMERType#getRECURRING <em>RECURRING</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>RECURRING</em>' containment reference.
     * @see #getRECURRING()
     * @generated
     */
    void setRECURRING(RECURRINGType value);

    /**
     * Returns the value of the '<em><b>TIMERTYPE</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.TIMERTYPEType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TIMERTYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TIMERTYPE</em>' attribute.
     * @see Powrmart.TIMERTYPEType
     * @see #isSetTIMERTYPE()
     * @see #unsetTIMERTYPE()
     * @see #setTIMERTYPE(TIMERTYPEType)
     * @see Powrmart.PowrmartPackage#getTIMERType_TIMERTYPE()
     * @model unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='TIMERTYPE' namespace='##targetNamespace'"
     * @generated
     */
    TIMERTYPEType getTIMERTYPE();

    /**
     * Sets the value of the '{@link Powrmart.TIMERType#getTIMERTYPE <em>TIMERTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TIMERTYPE</em>' attribute.
     * @see Powrmart.TIMERTYPEType
     * @see #isSetTIMERTYPE()
     * @see #unsetTIMERTYPE()
     * @see #getTIMERTYPE()
     * @generated
     */
    void setTIMERTYPE(TIMERTYPEType value);

    /**
     * Unsets the value of the '{@link Powrmart.TIMERType#getTIMERTYPE <em>TIMERTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTIMERTYPE()
     * @see #getTIMERTYPE()
     * @see #setTIMERTYPE(TIMERTYPEType)
     * @generated
     */
    void unsetTIMERTYPE();

    /**
     * Returns whether the value of the '{@link Powrmart.TIMERType#getTIMERTYPE <em>TIMERTYPE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>TIMERTYPE</em>' attribute is set.
     * @see #unsetTIMERTYPE()
     * @see #getTIMERTYPE()
     * @see #setTIMERTYPE(TIMERTYPEType)
     * @generated
     */
    boolean isSetTIMERTYPE();

} // TIMERType
