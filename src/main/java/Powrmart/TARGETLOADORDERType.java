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
 * A representation of the model object '<em><b>TARGETLOADORDER Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.TARGETLOADORDERType#getORDER <em>ORDER</em>}</li>
 *   <li>{@link Powrmart.TARGETLOADORDERType#getTARGETINSTANCE <em>TARGETINSTANCE</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getTARGETLOADORDERType()
 * @model extendedMetaData="name='TARGETLOADORDER_._type' kind='empty'"
 * @generated
 */
public interface TARGETLOADORDERType extends EObject {
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
     * @see Powrmart.PowrmartPackage#getTARGETLOADORDERType_ORDER()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='ORDER' namespace='##targetNamespace'"
     * @generated
     */
    Object getORDER();

    /**
     * Sets the value of the '{@link Powrmart.TARGETLOADORDERType#getORDER <em>ORDER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ORDER</em>' attribute.
     * @see #getORDER()
     * @generated
     */
    void setORDER(Object value);

    /**
     * Returns the value of the '<em><b>TARGETINSTANCE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TARGETINSTANCE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TARGETINSTANCE</em>' attribute.
     * @see #setTARGETINSTANCE(Object)
     * @see Powrmart.PowrmartPackage#getTARGETLOADORDERType_TARGETINSTANCE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='TARGETINSTANCE' namespace='##targetNamespace'"
     * @generated
     */
    Object getTARGETINSTANCE();

    /**
     * Sets the value of the '{@link Powrmart.TARGETLOADORDERType#getTARGETINSTANCE <em>TARGETINSTANCE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TARGETINSTANCE</em>' attribute.
     * @see #getTARGETINSTANCE()
     * @generated
     */
    void setTARGETINSTANCE(Object value);

} // TARGETLOADORDERType
