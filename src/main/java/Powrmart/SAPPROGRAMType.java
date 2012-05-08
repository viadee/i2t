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
 * A representation of the model object '<em><b>SAPPROGRAM Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.SAPPROGRAMType#getCLIENTSPACE <em>CLIENTSPACE</em>}</li>
 *   <li>{@link Powrmart.SAPPROGRAMType#getHOSTNAME <em>HOSTNAME</em>}</li>
 *   <li>{@link Powrmart.SAPPROGRAMType#getINSTALLTIME <em>INSTALLTIME</em>}</li>
 *   <li>{@link Powrmart.SAPPROGRAMType#getISVALID <em>ISVALID</em>}</li>
 *   <li>{@link Powrmart.SAPPROGRAMType#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.SAPPROGRAMType#getPROGRAMTYPE <em>PROGRAMTYPE</em>}</li>
 *   <li>{@link Powrmart.SAPPROGRAMType#getUSERNAME <em>USERNAME</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getSAPPROGRAMType()
 * @model extendedMetaData="name='SAPPROGRAM_._type' kind='empty'"
 * @generated
 */
public interface SAPPROGRAMType extends EObject {
    /**
     * Returns the value of the '<em><b>CLIENTSPACE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>CLIENTSPACE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>CLIENTSPACE</em>' attribute.
     * @see #setCLIENTSPACE(Object)
     * @see Powrmart.PowrmartPackage#getSAPPROGRAMType_CLIENTSPACE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='CLIENTSPACE' namespace='##targetNamespace'"
     * @generated
     */
    Object getCLIENTSPACE();

    /**
     * Sets the value of the '{@link Powrmart.SAPPROGRAMType#getCLIENTSPACE <em>CLIENTSPACE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CLIENTSPACE</em>' attribute.
     * @see #getCLIENTSPACE()
     * @generated
     */
    void setCLIENTSPACE(Object value);

    /**
     * Returns the value of the '<em><b>HOSTNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>HOSTNAME</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>HOSTNAME</em>' attribute.
     * @see #setHOSTNAME(Object)
     * @see Powrmart.PowrmartPackage#getSAPPROGRAMType_HOSTNAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='HOSTNAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getHOSTNAME();

    /**
     * Sets the value of the '{@link Powrmart.SAPPROGRAMType#getHOSTNAME <em>HOSTNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>HOSTNAME</em>' attribute.
     * @see #getHOSTNAME()
     * @generated
     */
    void setHOSTNAME(Object value);

    /**
     * Returns the value of the '<em><b>INSTALLTIME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>INSTALLTIME</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>INSTALLTIME</em>' attribute.
     * @see #setINSTALLTIME(Object)
     * @see Powrmart.PowrmartPackage#getSAPPROGRAMType_INSTALLTIME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='INSTALLTIME' namespace='##targetNamespace'"
     * @generated
     */
    Object getINSTALLTIME();

    /**
     * Sets the value of the '{@link Powrmart.SAPPROGRAMType#getINSTALLTIME <em>INSTALLTIME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>INSTALLTIME</em>' attribute.
     * @see #getINSTALLTIME()
     * @generated
     */
    void setINSTALLTIME(Object value);

    /**
     * Returns the value of the '<em><b>ISVALID</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.ISVALIDType3}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ISVALID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ISVALID</em>' attribute.
     * @see Powrmart.ISVALIDType3
     * @see #isSetISVALID()
     * @see #unsetISVALID()
     * @see #setISVALID(ISVALIDType3)
     * @see Powrmart.PowrmartPackage#getSAPPROGRAMType_ISVALID()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='ISVALID' namespace='##targetNamespace'"
     * @generated
     */
    ISVALIDType3 getISVALID();

    /**
     * Sets the value of the '{@link Powrmart.SAPPROGRAMType#getISVALID <em>ISVALID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ISVALID</em>' attribute.
     * @see Powrmart.ISVALIDType3
     * @see #isSetISVALID()
     * @see #unsetISVALID()
     * @see #getISVALID()
     * @generated
     */
    void setISVALID(ISVALIDType3 value);

    /**
     * Unsets the value of the '{@link Powrmart.SAPPROGRAMType#getISVALID <em>ISVALID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetISVALID()
     * @see #getISVALID()
     * @see #setISVALID(ISVALIDType3)
     * @generated
     */
    void unsetISVALID();

    /**
     * Returns whether the value of the '{@link Powrmart.SAPPROGRAMType#getISVALID <em>ISVALID</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>ISVALID</em>' attribute is set.
     * @see #unsetISVALID()
     * @see #getISVALID()
     * @see #setISVALID(ISVALIDType3)
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
     * @see Powrmart.PowrmartPackage#getSAPPROGRAMType_NAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='NAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getNAME();

    /**
     * Sets the value of the '{@link Powrmart.SAPPROGRAMType#getNAME <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NAME</em>' attribute.
     * @see #getNAME()
     * @generated
     */
    void setNAME(Object value);

    /**
     * Returns the value of the '<em><b>PROGRAMTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PROGRAMTYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PROGRAMTYPE</em>' attribute.
     * @see #setPROGRAMTYPE(Object)
     * @see Powrmart.PowrmartPackage#getSAPPROGRAMType_PROGRAMTYPE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='PROGRAMTYPE' namespace='##targetNamespace'"
     * @generated
     */
    Object getPROGRAMTYPE();

    /**
     * Sets the value of the '{@link Powrmart.SAPPROGRAMType#getPROGRAMTYPE <em>PROGRAMTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PROGRAMTYPE</em>' attribute.
     * @see #getPROGRAMTYPE()
     * @generated
     */
    void setPROGRAMTYPE(Object value);

    /**
     * Returns the value of the '<em><b>USERNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>USERNAME</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>USERNAME</em>' attribute.
     * @see #setUSERNAME(Object)
     * @see Powrmart.PowrmartPackage#getSAPPROGRAMType_USERNAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='USERNAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getUSERNAME();

    /**
     * Sets the value of the '{@link Powrmart.SAPPROGRAMType#getUSERNAME <em>USERNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>USERNAME</em>' attribute.
     * @see #getUSERNAME()
     * @generated
     */
    void setUSERNAME(Object value);

} // SAPPROGRAMType
