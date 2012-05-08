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
 * A representation of the model object '<em><b>SEBLMVLINKREL Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.SEBLMVLINKRELType#getDESTMVLINK <em>DESTMVLINK</em>}</li>
 *   <li>{@link Powrmart.SEBLMVLINKRELType#getFIELD <em>FIELD</em>}</li>
 *   <li>{@link Powrmart.SEBLMVLINKRELType#getSRCMVLINK <em>SRCMVLINK</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getSEBLMVLINKRELType()
 * @model extendedMetaData="name='SEBLMVLINKREL_._type' kind='empty'"
 * @generated
 */
public interface SEBLMVLINKRELType extends EObject {
    /**
     * Returns the value of the '<em><b>DESTMVLINK</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DESTMVLINK</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DESTMVLINK</em>' attribute.
     * @see #setDESTMVLINK(Object)
     * @see Powrmart.PowrmartPackage#getSEBLMVLINKRELType_DESTMVLINK()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='DESTMVLINK' namespace='##targetNamespace'"
     * @generated
     */
    Object getDESTMVLINK();

    /**
     * Sets the value of the '{@link Powrmart.SEBLMVLINKRELType#getDESTMVLINK <em>DESTMVLINK</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DESTMVLINK</em>' attribute.
     * @see #getDESTMVLINK()
     * @generated
     */
    void setDESTMVLINK(Object value);

    /**
     * Returns the value of the '<em><b>FIELD</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>FIELD</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>FIELD</em>' attribute.
     * @see #setFIELD(Object)
     * @see Powrmart.PowrmartPackage#getSEBLMVLINKRELType_FIELD()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='FIELD' namespace='##targetNamespace'"
     * @generated
     */
    Object getFIELD();

    /**
     * Sets the value of the '{@link Powrmart.SEBLMVLINKRELType#getFIELD <em>FIELD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>FIELD</em>' attribute.
     * @see #getFIELD()
     * @generated
     */
    void setFIELD(Object value);

    /**
     * Returns the value of the '<em><b>SRCMVLINK</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SRCMVLINK</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SRCMVLINK</em>' attribute.
     * @see #setSRCMVLINK(Object)
     * @see Powrmart.PowrmartPackage#getSEBLMVLINKRELType_SRCMVLINK()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='SRCMVLINK' namespace='##targetNamespace'"
     * @generated
     */
    Object getSRCMVLINK();

    /**
     * Sets the value of the '{@link Powrmart.SEBLMVLINKRELType#getSRCMVLINK <em>SRCMVLINK</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SRCMVLINK</em>' attribute.
     * @see #getSRCMVLINK()
     * @generated
     */
    void setSRCMVLINK(Object value);

} // SEBLMVLINKRELType
