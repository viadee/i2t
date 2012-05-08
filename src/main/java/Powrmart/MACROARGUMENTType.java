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
 * A representation of the model object '<em><b>MACROARGUMENT Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.MACROARGUMENTType#getARGORDER <em>ARGORDER</em>}</li>
 *   <li>{@link Powrmart.MACROARGUMENTType#getDATATYPE <em>DATATYPE</em>}</li>
 *   <li>{@link Powrmart.MACROARGUMENTType#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.MACROARGUMENTType#getPRECISION <em>PRECISION</em>}</li>
 *   <li>{@link Powrmart.MACROARGUMENTType#getSCALE <em>SCALE</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getMACROARGUMENTType()
 * @model extendedMetaData="name='MACROARGUMENT_._type' kind='empty'"
 * @generated
 */
public interface MACROARGUMENTType extends EObject {
    /**
     * Returns the value of the '<em><b>ARGORDER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ARGORDER</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ARGORDER</em>' attribute.
     * @see #setARGORDER(Object)
     * @see Powrmart.PowrmartPackage#getMACROARGUMENTType_ARGORDER()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='ARGORDER' namespace='##targetNamespace'"
     * @generated
     */
    Object getARGORDER();

    /**
     * Sets the value of the '{@link Powrmart.MACROARGUMENTType#getARGORDER <em>ARGORDER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ARGORDER</em>' attribute.
     * @see #getARGORDER()
     * @generated
     */
    void setARGORDER(Object value);

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
     * @see Powrmart.PowrmartPackage#getMACROARGUMENTType_DATATYPE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='DATATYPE' namespace='##targetNamespace'"
     * @generated
     */
    Object getDATATYPE();

    /**
     * Sets the value of the '{@link Powrmart.MACROARGUMENTType#getDATATYPE <em>DATATYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DATATYPE</em>' attribute.
     * @see #getDATATYPE()
     * @generated
     */
    void setDATATYPE(Object value);

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
     * @see Powrmart.PowrmartPackage#getMACROARGUMENTType_NAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='NAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getNAME();

    /**
     * Sets the value of the '{@link Powrmart.MACROARGUMENTType#getNAME <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NAME</em>' attribute.
     * @see #getNAME()
     * @generated
     */
    void setNAME(Object value);

    /**
     * Returns the value of the '<em><b>PRECISION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PRECISION</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PRECISION</em>' attribute.
     * @see #setPRECISION(Object)
     * @see Powrmart.PowrmartPackage#getMACROARGUMENTType_PRECISION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='PRECISION' namespace='##targetNamespace'"
     * @generated
     */
    Object getPRECISION();

    /**
     * Sets the value of the '{@link Powrmart.MACROARGUMENTType#getPRECISION <em>PRECISION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PRECISION</em>' attribute.
     * @see #getPRECISION()
     * @generated
     */
    void setPRECISION(Object value);

    /**
     * Returns the value of the '<em><b>SCALE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SCALE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SCALE</em>' attribute.
     * @see #setSCALE(Object)
     * @see Powrmart.PowrmartPackage#getMACROARGUMENTType_SCALE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='SCALE' namespace='##targetNamespace'"
     * @generated
     */
    Object getSCALE();

    /**
     * Sets the value of the '{@link Powrmart.MACROARGUMENTType#getSCALE <em>SCALE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SCALE</em>' attribute.
     * @see #getSCALE()
     * @generated
     */
    void setSCALE(Object value);

} // MACROARGUMENTType
