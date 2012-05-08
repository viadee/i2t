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
 * A representation of the model object '<em><b>ATTRIBUTE Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.ATTRIBUTEType#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.ATTRIBUTEType#getPARTITIONNAME <em>PARTITIONNAME</em>}</li>
 *   <li>{@link Powrmart.ATTRIBUTEType#getVALUE <em>VALUE</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getATTRIBUTEType()
 * @model extendedMetaData="name='ATTRIBUTE_._type' kind='empty'"
 * @generated
 */
public interface ATTRIBUTEType extends EObject {
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
     * @see Powrmart.PowrmartPackage#getATTRIBUTEType_NAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='NAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getNAME();

    /**
     * Sets the value of the '{@link Powrmart.ATTRIBUTEType#getNAME <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NAME</em>' attribute.
     * @see #getNAME()
     * @generated
     */
    void setNAME(Object value);

    /**
     * Returns the value of the '<em><b>PARTITIONNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PARTITIONNAME</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PARTITIONNAME</em>' attribute.
     * @see #setPARTITIONNAME(Object)
     * @see Powrmart.PowrmartPackage#getATTRIBUTEType_PARTITIONNAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='PARTITIONNAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getPARTITIONNAME();

    /**
     * Sets the value of the '{@link Powrmart.ATTRIBUTEType#getPARTITIONNAME <em>PARTITIONNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PARTITIONNAME</em>' attribute.
     * @see #getPARTITIONNAME()
     * @generated
     */
    void setPARTITIONNAME(Object value);

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
     * @see Powrmart.PowrmartPackage#getATTRIBUTEType_VALUE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='VALUE' namespace='##targetNamespace'"
     * @generated
     */
    Object getVALUE();

    /**
     * Sets the value of the '{@link Powrmart.ATTRIBUTEType#getVALUE <em>VALUE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>VALUE</em>' attribute.
     * @see #getVALUE()
     * @generated
     */
    void setVALUE(Object value);

} // ATTRIBUTEType
