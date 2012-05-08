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
 * A representation of the model object '<em><b>SCHEDULEOPTIONS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.SCHEDULEOPTIONSType#getRECURRING <em>RECURRING</em>}</li>
 *   <li>{@link Powrmart.SCHEDULEOPTIONSType#getCUSTOM <em>CUSTOM</em>}</li>
 *   <li>{@link Powrmart.SCHEDULEOPTIONSType#getSCHEDULETYPE <em>SCHEDULETYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getSCHEDULEOPTIONSType()
 * @model extendedMetaData="name='SCHEDULEOPTIONS_._type' kind='elementOnly'"
 * @generated
 */
public interface SCHEDULEOPTIONSType extends EObject {
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
     * @see Powrmart.PowrmartPackage#getSCHEDULEOPTIONSType_RECURRING()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='RECURRING' namespace='##targetNamespace'"
     * @generated
     */
    RECURRINGType getRECURRING();

    /**
     * Sets the value of the '{@link Powrmart.SCHEDULEOPTIONSType#getRECURRING <em>RECURRING</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>RECURRING</em>' containment reference.
     * @see #getRECURRING()
     * @generated
     */
    void setRECURRING(RECURRINGType value);

    /**
     * Returns the value of the '<em><b>CUSTOM</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>CUSTOM</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>CUSTOM</em>' containment reference.
     * @see #setCUSTOM(CUSTOMType)
     * @see Powrmart.PowrmartPackage#getSCHEDULEOPTIONSType_CUSTOM()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='CUSTOM' namespace='##targetNamespace'"
     * @generated
     */
    CUSTOMType getCUSTOM();

    /**
     * Sets the value of the '{@link Powrmart.SCHEDULEOPTIONSType#getCUSTOM <em>CUSTOM</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CUSTOM</em>' containment reference.
     * @see #getCUSTOM()
     * @generated
     */
    void setCUSTOM(CUSTOMType value);

    /**
     * Returns the value of the '<em><b>SCHEDULETYPE</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.SCHEDULETYPEType1}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SCHEDULETYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SCHEDULETYPE</em>' attribute.
     * @see Powrmart.SCHEDULETYPEType1
     * @see #isSetSCHEDULETYPE()
     * @see #unsetSCHEDULETYPE()
     * @see #setSCHEDULETYPE(SCHEDULETYPEType1)
     * @see Powrmart.PowrmartPackage#getSCHEDULEOPTIONSType_SCHEDULETYPE()
     * @model unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='SCHEDULETYPE' namespace='##targetNamespace'"
     * @generated
     */
    SCHEDULETYPEType1 getSCHEDULETYPE();

    /**
     * Sets the value of the '{@link Powrmart.SCHEDULEOPTIONSType#getSCHEDULETYPE <em>SCHEDULETYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SCHEDULETYPE</em>' attribute.
     * @see Powrmart.SCHEDULETYPEType1
     * @see #isSetSCHEDULETYPE()
     * @see #unsetSCHEDULETYPE()
     * @see #getSCHEDULETYPE()
     * @generated
     */
    void setSCHEDULETYPE(SCHEDULETYPEType1 value);

    /**
     * Unsets the value of the '{@link Powrmart.SCHEDULEOPTIONSType#getSCHEDULETYPE <em>SCHEDULETYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSCHEDULETYPE()
     * @see #getSCHEDULETYPE()
     * @see #setSCHEDULETYPE(SCHEDULETYPEType1)
     * @generated
     */
    void unsetSCHEDULETYPE();

    /**
     * Returns whether the value of the '{@link Powrmart.SCHEDULEOPTIONSType#getSCHEDULETYPE <em>SCHEDULETYPE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>SCHEDULETYPE</em>' attribute is set.
     * @see #unsetSCHEDULETYPE()
     * @see #getSCHEDULETYPE()
     * @see #setSCHEDULETYPE(SCHEDULETYPEType1)
     * @generated
     */
    boolean isSetSCHEDULETYPE();

} // SCHEDULEOPTIONSType
