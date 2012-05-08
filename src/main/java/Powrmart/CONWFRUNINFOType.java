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
 * A representation of the model object '<em><b>CONWFRUNINFO Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.CONWFRUNINFOType#getCONWFPARAMFILE <em>CONWFPARAMFILE</em>}</li>
 *   <li>{@link Powrmart.CONWFRUNINFOType#getCONWFRUNINSTNAME <em>CONWFRUNINSTNAME</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getCONWFRUNINFOType()
 * @model extendedMetaData="name='CONWFRUNINFO_._type' kind='empty'"
 * @generated
 */
public interface CONWFRUNINFOType extends EObject {
    /**
     * Returns the value of the '<em><b>CONWFPARAMFILE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>CONWFPARAMFILE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>CONWFPARAMFILE</em>' attribute.
     * @see #setCONWFPARAMFILE(Object)
     * @see Powrmart.PowrmartPackage#getCONWFRUNINFOType_CONWFPARAMFILE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='CONWFPARAMFILE' namespace='##targetNamespace'"
     * @generated
     */
    Object getCONWFPARAMFILE();

    /**
     * Sets the value of the '{@link Powrmart.CONWFRUNINFOType#getCONWFPARAMFILE <em>CONWFPARAMFILE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CONWFPARAMFILE</em>' attribute.
     * @see #getCONWFPARAMFILE()
     * @generated
     */
    void setCONWFPARAMFILE(Object value);

    /**
     * Returns the value of the '<em><b>CONWFRUNINSTNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>CONWFRUNINSTNAME</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>CONWFRUNINSTNAME</em>' attribute.
     * @see #setCONWFRUNINSTNAME(Object)
     * @see Powrmart.PowrmartPackage#getCONWFRUNINFOType_CONWFRUNINSTNAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='CONWFRUNINSTNAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getCONWFRUNINSTNAME();

    /**
     * Sets the value of the '{@link Powrmart.CONWFRUNINFOType#getCONWFRUNINSTNAME <em>CONWFRUNINSTNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CONWFRUNINSTNAME</em>' attribute.
     * @see #getCONWFRUNINSTNAME()
     * @generated
     */
    void setCONWFRUNINSTNAME(Object value);

} // CONWFRUNINFOType
