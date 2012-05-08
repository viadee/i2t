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
 * A representation of the model object '<em><b>FIELDDEPENDENCY Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.FIELDDEPENDENCYType#getINPUTFIELD <em>INPUTFIELD</em>}</li>
 *   <li>{@link Powrmart.FIELDDEPENDENCYType#getOUTPUTFIELD <em>OUTPUTFIELD</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getFIELDDEPENDENCYType()
 * @model extendedMetaData="name='FIELDDEPENDENCY_._type' kind='empty'"
 * @generated
 */
public interface FIELDDEPENDENCYType extends EObject {
    /**
     * Returns the value of the '<em><b>INPUTFIELD</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>INPUTFIELD</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>INPUTFIELD</em>' attribute.
     * @see #setINPUTFIELD(Object)
     * @see Powrmart.PowrmartPackage#getFIELDDEPENDENCYType_INPUTFIELD()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='INPUTFIELD' namespace='##targetNamespace'"
     * @generated
     */
    Object getINPUTFIELD();

    /**
     * Sets the value of the '{@link Powrmart.FIELDDEPENDENCYType#getINPUTFIELD <em>INPUTFIELD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>INPUTFIELD</em>' attribute.
     * @see #getINPUTFIELD()
     * @generated
     */
    void setINPUTFIELD(Object value);

    /**
     * Returns the value of the '<em><b>OUTPUTFIELD</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>OUTPUTFIELD</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>OUTPUTFIELD</em>' attribute.
     * @see #setOUTPUTFIELD(Object)
     * @see Powrmart.PowrmartPackage#getFIELDDEPENDENCYType_OUTPUTFIELD()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='OUTPUTFIELD' namespace='##targetNamespace'"
     * @generated
     */
    Object getOUTPUTFIELD();

    /**
     * Sets the value of the '{@link Powrmart.FIELDDEPENDENCYType#getOUTPUTFIELD <em>OUTPUTFIELD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>OUTPUTFIELD</em>' attribute.
     * @see #getOUTPUTFIELD()
     * @generated
     */
    void setOUTPUTFIELD(Object value);

} // FIELDDEPENDENCYType
