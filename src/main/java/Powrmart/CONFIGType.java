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
 * A representation of the model object '<em><b>CONFIG Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.CONFIGType#getATTRIBUTE <em>ATTRIBUTE</em>}</li>
 *   <li>{@link Powrmart.CONFIGType#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.CONFIGType#getISDEFAULT <em>ISDEFAULT</em>}</li>
 *   <li>{@link Powrmart.CONFIGType#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.CONFIGType#getVERSIONNUMBER <em>VERSIONNUMBER</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getCONFIGType()
 * @model extendedMetaData="name='CONFIG_._type' kind='elementOnly'"
 * @generated
 */
public interface CONFIGType extends EObject {
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
     * @see Powrmart.PowrmartPackage#getCONFIGType_ATTRIBUTE()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='ATTRIBUTE' namespace='##targetNamespace'"
     * @generated
     */
    EList<ATTRIBUTEType> getATTRIBUTE();

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
     * @see Powrmart.PowrmartPackage#getCONFIGType_DESCRIPTION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='DESCRIPTION' namespace='##targetNamespace'"
     * @generated
     */
    Object getDESCRIPTION();

    /**
     * Sets the value of the '{@link Powrmart.CONFIGType#getDESCRIPTION <em>DESCRIPTION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DESCRIPTION</em>' attribute.
     * @see #getDESCRIPTION()
     * @generated
     */
    void setDESCRIPTION(Object value);

    /**
     * Returns the value of the '<em><b>ISDEFAULT</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.ISDEFAULTType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ISDEFAULT</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ISDEFAULT</em>' attribute.
     * @see Powrmart.ISDEFAULTType
     * @see #isSetISDEFAULT()
     * @see #unsetISDEFAULT()
     * @see #setISDEFAULT(ISDEFAULTType)
     * @see Powrmart.PowrmartPackage#getCONFIGType_ISDEFAULT()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='ISDEFAULT' namespace='##targetNamespace'"
     * @generated
     */
    ISDEFAULTType getISDEFAULT();

    /**
     * Sets the value of the '{@link Powrmart.CONFIGType#getISDEFAULT <em>ISDEFAULT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ISDEFAULT</em>' attribute.
     * @see Powrmart.ISDEFAULTType
     * @see #isSetISDEFAULT()
     * @see #unsetISDEFAULT()
     * @see #getISDEFAULT()
     * @generated
     */
    void setISDEFAULT(ISDEFAULTType value);

    /**
     * Unsets the value of the '{@link Powrmart.CONFIGType#getISDEFAULT <em>ISDEFAULT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetISDEFAULT()
     * @see #getISDEFAULT()
     * @see #setISDEFAULT(ISDEFAULTType)
     * @generated
     */
    void unsetISDEFAULT();

    /**
     * Returns whether the value of the '{@link Powrmart.CONFIGType#getISDEFAULT <em>ISDEFAULT</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>ISDEFAULT</em>' attribute is set.
     * @see #unsetISDEFAULT()
     * @see #getISDEFAULT()
     * @see #setISDEFAULT(ISDEFAULTType)
     * @generated
     */
    boolean isSetISDEFAULT();

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
     * @see Powrmart.PowrmartPackage#getCONFIGType_NAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='NAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getNAME();

    /**
     * Sets the value of the '{@link Powrmart.CONFIGType#getNAME <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NAME</em>' attribute.
     * @see #getNAME()
     * @generated
     */
    void setNAME(Object value);

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
     * @see Powrmart.PowrmartPackage#getCONFIGType_VERSIONNUMBER()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='VERSIONNUMBER' namespace='##targetNamespace'"
     * @generated
     */
    Object getVERSIONNUMBER();

    /**
     * Sets the value of the '{@link Powrmart.CONFIGType#getVERSIONNUMBER <em>VERSIONNUMBER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>VERSIONNUMBER</em>' attribute.
     * @see #getVERSIONNUMBER()
     * @generated
     */
    void setVERSIONNUMBER(Object value);

} // CONFIGType
