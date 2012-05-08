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
 * A representation of the model object '<em><b>SCHEDULEINFO Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.SCHEDULEINFOType#getSTARTOPTIONS <em>STARTOPTIONS</em>}</li>
 *   <li>{@link Powrmart.SCHEDULEINFOType#getSCHEDULEOPTIONS <em>SCHEDULEOPTIONS</em>}</li>
 *   <li>{@link Powrmart.SCHEDULEINFOType#getENDOPTIONS <em>ENDOPTIONS</em>}</li>
 *   <li>{@link Powrmart.SCHEDULEINFOType#getSCHEDULETYPE <em>SCHEDULETYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getSCHEDULEINFOType()
 * @model extendedMetaData="name='SCHEDULEINFO_._type' kind='elementOnly'"
 * @generated
 */
public interface SCHEDULEINFOType extends EObject {
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
     * @see Powrmart.PowrmartPackage#getSCHEDULEINFOType_STARTOPTIONS()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='STARTOPTIONS' namespace='##targetNamespace'"
     * @generated
     */
    STARTOPTIONSType getSTARTOPTIONS();

    /**
     * Sets the value of the '{@link Powrmart.SCHEDULEINFOType#getSTARTOPTIONS <em>STARTOPTIONS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>STARTOPTIONS</em>' containment reference.
     * @see #getSTARTOPTIONS()
     * @generated
     */
    void setSTARTOPTIONS(STARTOPTIONSType value);

    /**
     * Returns the value of the '<em><b>SCHEDULEOPTIONS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SCHEDULEOPTIONS</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SCHEDULEOPTIONS</em>' containment reference.
     * @see #setSCHEDULEOPTIONS(SCHEDULEOPTIONSType)
     * @see Powrmart.PowrmartPackage#getSCHEDULEINFOType_SCHEDULEOPTIONS()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='SCHEDULEOPTIONS' namespace='##targetNamespace'"
     * @generated
     */
    SCHEDULEOPTIONSType getSCHEDULEOPTIONS();

    /**
     * Sets the value of the '{@link Powrmart.SCHEDULEINFOType#getSCHEDULEOPTIONS <em>SCHEDULEOPTIONS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SCHEDULEOPTIONS</em>' containment reference.
     * @see #getSCHEDULEOPTIONS()
     * @generated
     */
    void setSCHEDULEOPTIONS(SCHEDULEOPTIONSType value);

    /**
     * Returns the value of the '<em><b>ENDOPTIONS</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ENDOPTIONS</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ENDOPTIONS</em>' containment reference.
     * @see #setENDOPTIONS(ENDOPTIONSType)
     * @see Powrmart.PowrmartPackage#getSCHEDULEINFOType_ENDOPTIONS()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='ENDOPTIONS' namespace='##targetNamespace'"
     * @generated
     */
    ENDOPTIONSType getENDOPTIONS();

    /**
     * Sets the value of the '{@link Powrmart.SCHEDULEINFOType#getENDOPTIONS <em>ENDOPTIONS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ENDOPTIONS</em>' containment reference.
     * @see #getENDOPTIONS()
     * @generated
     */
    void setENDOPTIONS(ENDOPTIONSType value);

    /**
     * Returns the value of the '<em><b>SCHEDULETYPE</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.SCHEDULETYPEType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SCHEDULETYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SCHEDULETYPE</em>' attribute.
     * @see Powrmart.SCHEDULETYPEType
     * @see #isSetSCHEDULETYPE()
     * @see #unsetSCHEDULETYPE()
     * @see #setSCHEDULETYPE(SCHEDULETYPEType)
     * @see Powrmart.PowrmartPackage#getSCHEDULEINFOType_SCHEDULETYPE()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='SCHEDULETYPE' namespace='##targetNamespace'"
     * @generated
     */
    SCHEDULETYPEType getSCHEDULETYPE();

    /**
     * Sets the value of the '{@link Powrmart.SCHEDULEINFOType#getSCHEDULETYPE <em>SCHEDULETYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SCHEDULETYPE</em>' attribute.
     * @see Powrmart.SCHEDULETYPEType
     * @see #isSetSCHEDULETYPE()
     * @see #unsetSCHEDULETYPE()
     * @see #getSCHEDULETYPE()
     * @generated
     */
    void setSCHEDULETYPE(SCHEDULETYPEType value);

    /**
     * Unsets the value of the '{@link Powrmart.SCHEDULEINFOType#getSCHEDULETYPE <em>SCHEDULETYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSCHEDULETYPE()
     * @see #getSCHEDULETYPE()
     * @see #setSCHEDULETYPE(SCHEDULETYPEType)
     * @generated
     */
    void unsetSCHEDULETYPE();

    /**
     * Returns whether the value of the '{@link Powrmart.SCHEDULEINFOType#getSCHEDULETYPE <em>SCHEDULETYPE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>SCHEDULETYPE</em>' attribute is set.
     * @see #unsetSCHEDULETYPE()
     * @see #getSCHEDULETYPE()
     * @see #setSCHEDULETYPE(SCHEDULETYPEType)
     * @generated
     */
    boolean isSetSCHEDULETYPE();

} // SCHEDULEINFOType
