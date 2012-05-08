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
 * A representation of the model object '<em><b>HASHKEY Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.HASHKEYType#getGROUP <em>GROUP</em>}</li>
 *   <li>{@link Powrmart.HASHKEYType#getNAME <em>NAME</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getHASHKEYType()
 * @model extendedMetaData="name='HASHKEY_._type' kind='empty'"
 * @generated
 */
public interface HASHKEYType extends EObject {
    /**
     * Returns the value of the '<em><b>GROUP</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>GROUP</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>GROUP</em>' attribute.
     * @see #setGROUP(Object)
     * @see Powrmart.PowrmartPackage#getHASHKEYType_GROUP()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='GROUP' namespace='##targetNamespace'"
     * @generated
     */
    Object getGROUP();

    /**
     * Sets the value of the '{@link Powrmart.HASHKEYType#getGROUP <em>GROUP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>GROUP</em>' attribute.
     * @see #getGROUP()
     * @generated
     */
    void setGROUP(Object value);

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
     * @see Powrmart.PowrmartPackage#getHASHKEYType_NAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='NAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getNAME();

    /**
     * Sets the value of the '{@link Powrmart.HASHKEYType#getNAME <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NAME</em>' attribute.
     * @see #getNAME()
     * @generated
     */
    void setNAME(Object value);

} // HASHKEYType
