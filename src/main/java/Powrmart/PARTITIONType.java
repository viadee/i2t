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
 * A representation of the model object '<em><b>PARTITION Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.PARTITIONType#getKEYRANGE <em>KEYRANGE</em>}</li>
 *   <li>{@link Powrmart.PARTITIONType#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.PARTITIONType#getNAME <em>NAME</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getPARTITIONType()
 * @model extendedMetaData="name='PARTITION_._type' kind='elementOnly'"
 * @generated
 */
public interface PARTITIONType extends EObject {
    /**
     * Returns the value of the '<em><b>KEYRANGE</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.KEYRANGEType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>KEYRANGE</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>KEYRANGE</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getPARTITIONType_KEYRANGE()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='KEYRANGE' namespace='##targetNamespace'"
     * @generated
     */
    EList<KEYRANGEType> getKEYRANGE();

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
     * @see Powrmart.PowrmartPackage#getPARTITIONType_DESCRIPTION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='DESCRIPTION' namespace='##targetNamespace'"
     * @generated
     */
    Object getDESCRIPTION();

    /**
     * Sets the value of the '{@link Powrmart.PARTITIONType#getDESCRIPTION <em>DESCRIPTION</em>}' attribute.
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
     * @see Powrmart.PowrmartPackage#getPARTITIONType_NAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='NAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getNAME();

    /**
     * Sets the value of the '{@link Powrmart.PARTITIONType#getNAME <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NAME</em>' attribute.
     * @see #getNAME()
     * @generated
     */
    void setNAME(Object value);

} // PARTITIONType
