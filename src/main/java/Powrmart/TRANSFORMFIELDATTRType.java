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
 * A representation of the model object '<em><b>TRANSFORMFIELDATTR Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.TRANSFORMFIELDATTRType#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMFIELDATTRType#getVALUE <em>VALUE</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getTRANSFORMFIELDATTRType()
 * @model extendedMetaData="name='TRANSFORMFIELDATTR_._type' kind='empty'"
 * @generated
 */
public interface TRANSFORMFIELDATTRType extends EObject {
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
     * @see Powrmart.PowrmartPackage#getTRANSFORMFIELDATTRType_NAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='NAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getNAME();

    /**
     * Sets the value of the '{@link Powrmart.TRANSFORMFIELDATTRType#getNAME <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NAME</em>' attribute.
     * @see #getNAME()
     * @generated
     */
    void setNAME(Object value);

    /**
     * Returns the value of the '<em><b>VALUE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>VALUE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>VALUE</em>' attribute.
     * @see #setVALUE(Object)
     * @see Powrmart.PowrmartPackage#getTRANSFORMFIELDATTRType_VALUE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='VALUE' namespace='##targetNamespace'"
     * @generated
     */
    Object getVALUE();

    /**
     * Sets the value of the '{@link Powrmart.TRANSFORMFIELDATTRType#getVALUE <em>VALUE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>VALUE</em>' attribute.
     * @see #getVALUE()
     * @generated
     */
    void setVALUE(Object value);

} // TRANSFORMFIELDATTRType
