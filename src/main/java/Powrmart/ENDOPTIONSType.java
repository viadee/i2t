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
 * A representation of the model object '<em><b>ENDOPTIONS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.ENDOPTIONSType#getENDAFTER <em>ENDAFTER</em>}</li>
 *   <li>{@link Powrmart.ENDOPTIONSType#getENDON <em>ENDON</em>}</li>
 *   <li>{@link Powrmart.ENDOPTIONSType#getENDTYPE <em>ENDTYPE</em>}</li>
 *   <li>{@link Powrmart.ENDOPTIONSType#getRUNFOREVER <em>RUNFOREVER</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getENDOPTIONSType()
 * @model extendedMetaData="name='ENDOPTIONS_._type' kind='empty'"
 * @generated
 */
public interface ENDOPTIONSType extends EObject {
    /**
     * Returns the value of the '<em><b>ENDAFTER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ENDAFTER</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ENDAFTER</em>' attribute.
     * @see #setENDAFTER(Object)
     * @see Powrmart.PowrmartPackage#getENDOPTIONSType_ENDAFTER()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='ENDAFTER' namespace='##targetNamespace'"
     * @generated
     */
    Object getENDAFTER();

    /**
     * Sets the value of the '{@link Powrmart.ENDOPTIONSType#getENDAFTER <em>ENDAFTER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ENDAFTER</em>' attribute.
     * @see #getENDAFTER()
     * @generated
     */
    void setENDAFTER(Object value);

    /**
     * Returns the value of the '<em><b>ENDON</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ENDON</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ENDON</em>' attribute.
     * @see #setENDON(Object)
     * @see Powrmart.PowrmartPackage#getENDOPTIONSType_ENDON()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='ENDON' namespace='##targetNamespace'"
     * @generated
     */
    Object getENDON();

    /**
     * Sets the value of the '{@link Powrmart.ENDOPTIONSType#getENDON <em>ENDON</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ENDON</em>' attribute.
     * @see #getENDON()
     * @generated
     */
    void setENDON(Object value);

    /**
     * Returns the value of the '<em><b>ENDTYPE</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.ENDTYPEType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ENDTYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ENDTYPE</em>' attribute.
     * @see Powrmart.ENDTYPEType
     * @see #isSetENDTYPE()
     * @see #unsetENDTYPE()
     * @see #setENDTYPE(ENDTYPEType)
     * @see Powrmart.PowrmartPackage#getENDOPTIONSType_ENDTYPE()
     * @model unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='ENDTYPE' namespace='##targetNamespace'"
     * @generated
     */
    ENDTYPEType getENDTYPE();

    /**
     * Sets the value of the '{@link Powrmart.ENDOPTIONSType#getENDTYPE <em>ENDTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ENDTYPE</em>' attribute.
     * @see Powrmart.ENDTYPEType
     * @see #isSetENDTYPE()
     * @see #unsetENDTYPE()
     * @see #getENDTYPE()
     * @generated
     */
    void setENDTYPE(ENDTYPEType value);

    /**
     * Unsets the value of the '{@link Powrmart.ENDOPTIONSType#getENDTYPE <em>ENDTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetENDTYPE()
     * @see #getENDTYPE()
     * @see #setENDTYPE(ENDTYPEType)
     * @generated
     */
    void unsetENDTYPE();

    /**
     * Returns whether the value of the '{@link Powrmart.ENDOPTIONSType#getENDTYPE <em>ENDTYPE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>ENDTYPE</em>' attribute is set.
     * @see #unsetENDTYPE()
     * @see #getENDTYPE()
     * @see #setENDTYPE(ENDTYPEType)
     * @generated
     */
    boolean isSetENDTYPE();

    /**
     * Returns the value of the '<em><b>RUNFOREVER</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.RUNFOREVERType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>RUNFOREVER</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>RUNFOREVER</em>' attribute.
     * @see Powrmart.RUNFOREVERType
     * @see #isSetRUNFOREVER()
     * @see #unsetRUNFOREVER()
     * @see #setRUNFOREVER(RUNFOREVERType)
     * @see Powrmart.PowrmartPackage#getENDOPTIONSType_RUNFOREVER()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='RUNFOREVER' namespace='##targetNamespace'"
     * @generated
     */
    RUNFOREVERType getRUNFOREVER();

    /**
     * Sets the value of the '{@link Powrmart.ENDOPTIONSType#getRUNFOREVER <em>RUNFOREVER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>RUNFOREVER</em>' attribute.
     * @see Powrmart.RUNFOREVERType
     * @see #isSetRUNFOREVER()
     * @see #unsetRUNFOREVER()
     * @see #getRUNFOREVER()
     * @generated
     */
    void setRUNFOREVER(RUNFOREVERType value);

    /**
     * Unsets the value of the '{@link Powrmart.ENDOPTIONSType#getRUNFOREVER <em>RUNFOREVER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRUNFOREVER()
     * @see #getRUNFOREVER()
     * @see #setRUNFOREVER(RUNFOREVERType)
     * @generated
     */
    void unsetRUNFOREVER();

    /**
     * Returns whether the value of the '{@link Powrmart.ENDOPTIONSType#getRUNFOREVER <em>RUNFOREVER</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>RUNFOREVER</em>' attribute is set.
     * @see #unsetRUNFOREVER()
     * @see #getRUNFOREVER()
     * @see #setRUNFOREVER(RUNFOREVERType)
     * @generated
     */
    boolean isSetRUNFOREVER();

} // ENDOPTIONSType
