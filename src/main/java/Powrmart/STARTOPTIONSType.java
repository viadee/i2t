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
 * A representation of the model object '<em><b>STARTOPTIONS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.STARTOPTIONSType#getSTARTDATE <em>STARTDATE</em>}</li>
 *   <li>{@link Powrmart.STARTOPTIONSType#getSTARTTIME <em>STARTTIME</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getSTARTOPTIONSType()
 * @model extendedMetaData="name='STARTOPTIONS_._type' kind='empty'"
 * @generated
 */
public interface STARTOPTIONSType extends EObject {
    /**
     * Returns the value of the '<em><b>STARTDATE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>STARTDATE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>STARTDATE</em>' attribute.
     * @see #setSTARTDATE(Object)
     * @see Powrmart.PowrmartPackage#getSTARTOPTIONSType_STARTDATE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='STARTDATE' namespace='##targetNamespace'"
     * @generated
     */
    Object getSTARTDATE();

    /**
     * Sets the value of the '{@link Powrmart.STARTOPTIONSType#getSTARTDATE <em>STARTDATE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>STARTDATE</em>' attribute.
     * @see #getSTARTDATE()
     * @generated
     */
    void setSTARTDATE(Object value);

    /**
     * Returns the value of the '<em><b>STARTTIME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>STARTTIME</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>STARTTIME</em>' attribute.
     * @see #setSTARTTIME(Object)
     * @see Powrmart.PowrmartPackage#getSTARTOPTIONSType_STARTTIME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='STARTTIME' namespace='##targetNamespace'"
     * @generated
     */
    Object getSTARTTIME();

    /**
     * Sets the value of the '{@link Powrmart.STARTOPTIONSType#getSTARTTIME <em>STARTTIME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>STARTTIME</em>' attribute.
     * @see #getSTARTTIME()
     * @generated
     */
    void setSTARTTIME(Object value);

} // STARTOPTIONSType
