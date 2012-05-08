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
 * A representation of the model object '<em><b>SAPTABLEPARAM Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.SAPTABLEPARAMType#getDEF <em>DEF</em>}</li>
 *   <li>{@link Powrmart.SAPTABLEPARAMType#getISOPTIONAL <em>ISOPTIONAL</em>}</li>
 *   <li>{@link Powrmart.SAPTABLEPARAMType#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.SAPTABLEPARAMType#getORDER <em>ORDER</em>}</li>
 *   <li>{@link Powrmart.SAPTABLEPARAMType#getTYPE <em>TYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getSAPTABLEPARAMType()
 * @model extendedMetaData="name='SAPTABLEPARAM_._type' kind='empty'"
 * @generated
 */
public interface SAPTABLEPARAMType extends EObject {
    /**
     * Returns the value of the '<em><b>DEF</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DEF</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DEF</em>' attribute.
     * @see #setDEF(Object)
     * @see Powrmart.PowrmartPackage#getSAPTABLEPARAMType_DEF()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='DEF' namespace='##targetNamespace'"
     * @generated
     */
    Object getDEF();

    /**
     * Sets the value of the '{@link Powrmart.SAPTABLEPARAMType#getDEF <em>DEF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DEF</em>' attribute.
     * @see #getDEF()
     * @generated
     */
    void setDEF(Object value);

    /**
     * Returns the value of the '<em><b>ISOPTIONAL</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.ISOPTIONALType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ISOPTIONAL</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ISOPTIONAL</em>' attribute.
     * @see Powrmart.ISOPTIONALType
     * @see #isSetISOPTIONAL()
     * @see #unsetISOPTIONAL()
     * @see #setISOPTIONAL(ISOPTIONALType)
     * @see Powrmart.PowrmartPackage#getSAPTABLEPARAMType_ISOPTIONAL()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='ISOPTIONAL' namespace='##targetNamespace'"
     * @generated
     */
    ISOPTIONALType getISOPTIONAL();

    /**
     * Sets the value of the '{@link Powrmart.SAPTABLEPARAMType#getISOPTIONAL <em>ISOPTIONAL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ISOPTIONAL</em>' attribute.
     * @see Powrmart.ISOPTIONALType
     * @see #isSetISOPTIONAL()
     * @see #unsetISOPTIONAL()
     * @see #getISOPTIONAL()
     * @generated
     */
    void setISOPTIONAL(ISOPTIONALType value);

    /**
     * Unsets the value of the '{@link Powrmart.SAPTABLEPARAMType#getISOPTIONAL <em>ISOPTIONAL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetISOPTIONAL()
     * @see #getISOPTIONAL()
     * @see #setISOPTIONAL(ISOPTIONALType)
     * @generated
     */
    void unsetISOPTIONAL();

    /**
     * Returns whether the value of the '{@link Powrmart.SAPTABLEPARAMType#getISOPTIONAL <em>ISOPTIONAL</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>ISOPTIONAL</em>' attribute is set.
     * @see #unsetISOPTIONAL()
     * @see #getISOPTIONAL()
     * @see #setISOPTIONAL(ISOPTIONALType)
     * @generated
     */
    boolean isSetISOPTIONAL();

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
     * @see Powrmart.PowrmartPackage#getSAPTABLEPARAMType_NAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='NAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getNAME();

    /**
     * Sets the value of the '{@link Powrmart.SAPTABLEPARAMType#getNAME <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NAME</em>' attribute.
     * @see #getNAME()
     * @generated
     */
    void setNAME(Object value);

    /**
     * Returns the value of the '<em><b>ORDER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ORDER</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ORDER</em>' attribute.
     * @see #setORDER(Object)
     * @see Powrmart.PowrmartPackage#getSAPTABLEPARAMType_ORDER()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='ORDER' namespace='##targetNamespace'"
     * @generated
     */
    Object getORDER();

    /**
     * Sets the value of the '{@link Powrmart.SAPTABLEPARAMType#getORDER <em>ORDER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ORDER</em>' attribute.
     * @see #getORDER()
     * @generated
     */
    void setORDER(Object value);

    /**
     * Returns the value of the '<em><b>TYPE</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.TYPEType6}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TYPE</em>' attribute.
     * @see Powrmart.TYPEType6
     * @see #isSetTYPE()
     * @see #unsetTYPE()
     * @see #setTYPE(TYPEType6)
     * @see Powrmart.PowrmartPackage#getSAPTABLEPARAMType_TYPE()
     * @model unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='TYPE' namespace='##targetNamespace'"
     * @generated
     */
    TYPEType6 getTYPE();

    /**
     * Sets the value of the '{@link Powrmart.SAPTABLEPARAMType#getTYPE <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TYPE</em>' attribute.
     * @see Powrmart.TYPEType6
     * @see #isSetTYPE()
     * @see #unsetTYPE()
     * @see #getTYPE()
     * @generated
     */
    void setTYPE(TYPEType6 value);

    /**
     * Unsets the value of the '{@link Powrmart.SAPTABLEPARAMType#getTYPE <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTYPE()
     * @see #getTYPE()
     * @see #setTYPE(TYPEType6)
     * @generated
     */
    void unsetTYPE();

    /**
     * Returns whether the value of the '{@link Powrmart.SAPTABLEPARAMType#getTYPE <em>TYPE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>TYPE</em>' attribute is set.
     * @see #unsetTYPE()
     * @see #getTYPE()
     * @see #setTYPE(TYPEType6)
     * @generated
     */
    boolean isSetTYPE();

} // SAPTABLEPARAMType
