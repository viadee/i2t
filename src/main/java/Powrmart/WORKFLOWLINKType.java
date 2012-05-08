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
 * A representation of the model object '<em><b>WORKFLOWLINK Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.WORKFLOWLINKType#getEXPRMACRODEPENDENCY <em>EXPRMACRODEPENDENCY</em>}</li>
 *   <li>{@link Powrmart.WORKFLOWLINKType#getCONDITION <em>CONDITION</em>}</li>
 *   <li>{@link Powrmart.WORKFLOWLINKType#getFROMTASK <em>FROMTASK</em>}</li>
 *   <li>{@link Powrmart.WORKFLOWLINKType#getTOTASK <em>TOTASK</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getWORKFLOWLINKType()
 * @model extendedMetaData="name='WORKFLOWLINK_._type' kind='elementOnly'"
 * @generated
 */
public interface WORKFLOWLINKType extends EObject {
    /**
     * Returns the value of the '<em><b>EXPRMACRODEPENDENCY</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.EXPRMACRODEPENDENCYType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>EXPRMACRODEPENDENCY</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>EXPRMACRODEPENDENCY</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getWORKFLOWLINKType_EXPRMACRODEPENDENCY()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='EXPRMACRODEPENDENCY' namespace='##targetNamespace'"
     * @generated
     */
    EList<EXPRMACRODEPENDENCYType> getEXPRMACRODEPENDENCY();

    /**
     * Returns the value of the '<em><b>CONDITION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>CONDITION</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>CONDITION</em>' attribute.
     * @see #setCONDITION(Object)
     * @see Powrmart.PowrmartPackage#getWORKFLOWLINKType_CONDITION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='CONDITION' namespace='##targetNamespace'"
     * @generated
     */
    Object getCONDITION();

    /**
     * Sets the value of the '{@link Powrmart.WORKFLOWLINKType#getCONDITION <em>CONDITION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CONDITION</em>' attribute.
     * @see #getCONDITION()
     * @generated
     */
    void setCONDITION(Object value);

    /**
     * Returns the value of the '<em><b>FROMTASK</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>FROMTASK</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>FROMTASK</em>' attribute.
     * @see #setFROMTASK(Object)
     * @see Powrmart.PowrmartPackage#getWORKFLOWLINKType_FROMTASK()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='FROMTASK' namespace='##targetNamespace'"
     * @generated
     */
    Object getFROMTASK();

    /**
     * Sets the value of the '{@link Powrmart.WORKFLOWLINKType#getFROMTASK <em>FROMTASK</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>FROMTASK</em>' attribute.
     * @see #getFROMTASK()
     * @generated
     */
    void setFROMTASK(Object value);

    /**
     * Returns the value of the '<em><b>TOTASK</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TOTASK</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TOTASK</em>' attribute.
     * @see #setTOTASK(Object)
     * @see Powrmart.PowrmartPackage#getWORKFLOWLINKType_TOTASK()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='TOTASK' namespace='##targetNamespace'"
     * @generated
     */
    Object getTOTASK();

    /**
     * Sets the value of the '{@link Powrmart.WORKFLOWLINKType#getTOTASK <em>TOTASK</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TOTASK</em>' attribute.
     * @see #getTOTASK()
     * @generated
     */
    void setTOTASK(Object value);

} // WORKFLOWLINKType
