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
 * A representation of the model object '<em><b>WORKFLOWVARIABLE Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.WORKFLOWVARIABLEType#getDATATYPE <em>DATATYPE</em>}</li>
 *   <li>{@link Powrmart.WORKFLOWVARIABLEType#getDEFAULTVALUE <em>DEFAULTVALUE</em>}</li>
 *   <li>{@link Powrmart.WORKFLOWVARIABLEType#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.WORKFLOWVARIABLEType#getISNULL <em>ISNULL</em>}</li>
 *   <li>{@link Powrmart.WORKFLOWVARIABLEType#getISPERSISTENT <em>ISPERSISTENT</em>}</li>
 *   <li>{@link Powrmart.WORKFLOWVARIABLEType#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.WORKFLOWVARIABLEType#getUSERDEFINED <em>USERDEFINED</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getWORKFLOWVARIABLEType()
 * @model extendedMetaData="name='WORKFLOWVARIABLE_._type' kind='empty'"
 * @generated
 */
public interface WORKFLOWVARIABLEType extends EObject {
    /**
     * Returns the value of the '<em><b>DATATYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DATATYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DATATYPE</em>' attribute.
     * @see #setDATATYPE(Object)
     * @see Powrmart.PowrmartPackage#getWORKFLOWVARIABLEType_DATATYPE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='DATATYPE' namespace='##targetNamespace'"
     * @generated
     */
    Object getDATATYPE();

    /**
     * Sets the value of the '{@link Powrmart.WORKFLOWVARIABLEType#getDATATYPE <em>DATATYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DATATYPE</em>' attribute.
     * @see #getDATATYPE()
     * @generated
     */
    void setDATATYPE(Object value);

    /**
     * Returns the value of the '<em><b>DEFAULTVALUE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DEFAULTVALUE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DEFAULTVALUE</em>' attribute.
     * @see #setDEFAULTVALUE(Object)
     * @see Powrmart.PowrmartPackage#getWORKFLOWVARIABLEType_DEFAULTVALUE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='DEFAULTVALUE' namespace='##targetNamespace'"
     * @generated
     */
    Object getDEFAULTVALUE();

    /**
     * Sets the value of the '{@link Powrmart.WORKFLOWVARIABLEType#getDEFAULTVALUE <em>DEFAULTVALUE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DEFAULTVALUE</em>' attribute.
     * @see #getDEFAULTVALUE()
     * @generated
     */
    void setDEFAULTVALUE(Object value);

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
     * @see Powrmart.PowrmartPackage#getWORKFLOWVARIABLEType_DESCRIPTION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='DESCRIPTION' namespace='##targetNamespace'"
     * @generated
     */
    Object getDESCRIPTION();

    /**
     * Sets the value of the '{@link Powrmart.WORKFLOWVARIABLEType#getDESCRIPTION <em>DESCRIPTION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DESCRIPTION</em>' attribute.
     * @see #getDESCRIPTION()
     * @generated
     */
    void setDESCRIPTION(Object value);

    /**
     * Returns the value of the '<em><b>ISNULL</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.ISNULLType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ISNULL</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ISNULL</em>' attribute.
     * @see Powrmart.ISNULLType
     * @see #isSetISNULL()
     * @see #unsetISNULL()
     * @see #setISNULL(ISNULLType)
     * @see Powrmart.PowrmartPackage#getWORKFLOWVARIABLEType_ISNULL()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='ISNULL' namespace='##targetNamespace'"
     * @generated
     */
    ISNULLType getISNULL();

    /**
     * Sets the value of the '{@link Powrmart.WORKFLOWVARIABLEType#getISNULL <em>ISNULL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ISNULL</em>' attribute.
     * @see Powrmart.ISNULLType
     * @see #isSetISNULL()
     * @see #unsetISNULL()
     * @see #getISNULL()
     * @generated
     */
    void setISNULL(ISNULLType value);

    /**
     * Unsets the value of the '{@link Powrmart.WORKFLOWVARIABLEType#getISNULL <em>ISNULL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetISNULL()
     * @see #getISNULL()
     * @see #setISNULL(ISNULLType)
     * @generated
     */
    void unsetISNULL();

    /**
     * Returns whether the value of the '{@link Powrmart.WORKFLOWVARIABLEType#getISNULL <em>ISNULL</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>ISNULL</em>' attribute is set.
     * @see #unsetISNULL()
     * @see #getISNULL()
     * @see #setISNULL(ISNULLType)
     * @generated
     */
    boolean isSetISNULL();

    /**
     * Returns the value of the '<em><b>ISPERSISTENT</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.ISPERSISTENTType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ISPERSISTENT</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ISPERSISTENT</em>' attribute.
     * @see Powrmart.ISPERSISTENTType
     * @see #isSetISPERSISTENT()
     * @see #unsetISPERSISTENT()
     * @see #setISPERSISTENT(ISPERSISTENTType)
     * @see Powrmart.PowrmartPackage#getWORKFLOWVARIABLEType_ISPERSISTENT()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='ISPERSISTENT' namespace='##targetNamespace'"
     * @generated
     */
    ISPERSISTENTType getISPERSISTENT();

    /**
     * Sets the value of the '{@link Powrmart.WORKFLOWVARIABLEType#getISPERSISTENT <em>ISPERSISTENT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ISPERSISTENT</em>' attribute.
     * @see Powrmart.ISPERSISTENTType
     * @see #isSetISPERSISTENT()
     * @see #unsetISPERSISTENT()
     * @see #getISPERSISTENT()
     * @generated
     */
    void setISPERSISTENT(ISPERSISTENTType value);

    /**
     * Unsets the value of the '{@link Powrmart.WORKFLOWVARIABLEType#getISPERSISTENT <em>ISPERSISTENT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetISPERSISTENT()
     * @see #getISPERSISTENT()
     * @see #setISPERSISTENT(ISPERSISTENTType)
     * @generated
     */
    void unsetISPERSISTENT();

    /**
     * Returns whether the value of the '{@link Powrmart.WORKFLOWVARIABLEType#getISPERSISTENT <em>ISPERSISTENT</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>ISPERSISTENT</em>' attribute is set.
     * @see #unsetISPERSISTENT()
     * @see #getISPERSISTENT()
     * @see #setISPERSISTENT(ISPERSISTENTType)
     * @generated
     */
    boolean isSetISPERSISTENT();

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
     * @see Powrmart.PowrmartPackage#getWORKFLOWVARIABLEType_NAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='NAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getNAME();

    /**
     * Sets the value of the '{@link Powrmart.WORKFLOWVARIABLEType#getNAME <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NAME</em>' attribute.
     * @see #getNAME()
     * @generated
     */
    void setNAME(Object value);

    /**
     * Returns the value of the '<em><b>USERDEFINED</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.USERDEFINEDType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>USERDEFINED</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>USERDEFINED</em>' attribute.
     * @see Powrmart.USERDEFINEDType
     * @see #isSetUSERDEFINED()
     * @see #unsetUSERDEFINED()
     * @see #setUSERDEFINED(USERDEFINEDType)
     * @see Powrmart.PowrmartPackage#getWORKFLOWVARIABLEType_USERDEFINED()
     * @model unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='USERDEFINED' namespace='##targetNamespace'"
     * @generated
     */
    USERDEFINEDType getUSERDEFINED();

    /**
     * Sets the value of the '{@link Powrmart.WORKFLOWVARIABLEType#getUSERDEFINED <em>USERDEFINED</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>USERDEFINED</em>' attribute.
     * @see Powrmart.USERDEFINEDType
     * @see #isSetUSERDEFINED()
     * @see #unsetUSERDEFINED()
     * @see #getUSERDEFINED()
     * @generated
     */
    void setUSERDEFINED(USERDEFINEDType value);

    /**
     * Unsets the value of the '{@link Powrmart.WORKFLOWVARIABLEType#getUSERDEFINED <em>USERDEFINED</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUSERDEFINED()
     * @see #getUSERDEFINED()
     * @see #setUSERDEFINED(USERDEFINEDType)
     * @generated
     */
    void unsetUSERDEFINED();

    /**
     * Returns whether the value of the '{@link Powrmart.WORKFLOWVARIABLEType#getUSERDEFINED <em>USERDEFINED</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>USERDEFINED</em>' attribute is set.
     * @see #unsetUSERDEFINED()
     * @see #getUSERDEFINED()
     * @see #setUSERDEFINED(USERDEFINEDType)
     * @generated
     */
    boolean isSetUSERDEFINED();

} // WORKFLOWVARIABLEType
