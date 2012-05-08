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
 * A representation of the model object '<em><b>SAPFUNCTION Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.SAPFUNCTIONType#getSAPFUNCPARAM <em>SAPFUNCPARAM</em>}</li>
 *   <li>{@link Powrmart.SAPFUNCTIONType#getSAPTABLEPARAM <em>SAPTABLEPARAM</em>}</li>
 *   <li>{@link Powrmart.SAPFUNCTIONType#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.SAPFUNCTIONType#getNAME <em>NAME</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getSAPFUNCTIONType()
 * @model extendedMetaData="name='SAPFUNCTION_._type' kind='elementOnly'"
 * @generated
 */
public interface SAPFUNCTIONType extends EObject {
    /**
     * Returns the value of the '<em><b>SAPFUNCPARAM</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.SAPFUNCPARAMType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SAPFUNCPARAM</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SAPFUNCPARAM</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getSAPFUNCTIONType_SAPFUNCPARAM()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='SAPFUNCPARAM' namespace='##targetNamespace'"
     * @generated
     */
    EList<SAPFUNCPARAMType> getSAPFUNCPARAM();

    /**
     * Returns the value of the '<em><b>SAPTABLEPARAM</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.SAPTABLEPARAMType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SAPTABLEPARAM</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SAPTABLEPARAM</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getSAPFUNCTIONType_SAPTABLEPARAM()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='SAPTABLEPARAM' namespace='##targetNamespace'"
     * @generated
     */
    EList<SAPTABLEPARAMType> getSAPTABLEPARAM();

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
     * @see Powrmart.PowrmartPackage#getSAPFUNCTIONType_DESCRIPTION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='DESCRIPTION' namespace='##targetNamespace'"
     * @generated
     */
    Object getDESCRIPTION();

    /**
     * Sets the value of the '{@link Powrmart.SAPFUNCTIONType#getDESCRIPTION <em>DESCRIPTION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DESCRIPTION</em>' attribute.
     * @see #getDESCRIPTION()
     * @generated
     */
    void setDESCRIPTION(Object value);

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
     * @see Powrmart.PowrmartPackage#getSAPFUNCTIONType_NAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='NAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getNAME();

    /**
     * Sets the value of the '{@link Powrmart.SAPFUNCTIONType#getNAME <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NAME</em>' attribute.
     * @see #getNAME()
     * @generated
     */
    void setNAME(Object value);

} // SAPFUNCTIONType
