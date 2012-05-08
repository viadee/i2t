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
 * A representation of the model object '<em><b>SESSTRANSFORMATIONGROUP Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.SESSTRANSFORMATIONGROUPType#getGROUP <em>GROUP</em>}</li>
 *   <li>{@link Powrmart.SESSTRANSFORMATIONGROUPType#getPARTITIONTYPE <em>PARTITIONTYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getSESSTRANSFORMATIONGROUPType()
 * @model extendedMetaData="name='SESSTRANSFORMATIONGROUP_._type' kind='empty'"
 * @generated
 */
public interface SESSTRANSFORMATIONGROUPType extends EObject {
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
     * @see Powrmart.PowrmartPackage#getSESSTRANSFORMATIONGROUPType_GROUP()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='GROUP' namespace='##targetNamespace'"
     * @generated
     */
    Object getGROUP();

    /**
     * Sets the value of the '{@link Powrmart.SESSTRANSFORMATIONGROUPType#getGROUP <em>GROUP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>GROUP</em>' attribute.
     * @see #getGROUP()
     * @generated
     */
    void setGROUP(Object value);

    /**
     * Returns the value of the '<em><b>PARTITIONTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PARTITIONTYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PARTITIONTYPE</em>' attribute.
     * @see #setPARTITIONTYPE(Object)
     * @see Powrmart.PowrmartPackage#getSESSTRANSFORMATIONGROUPType_PARTITIONTYPE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='PARTITIONTYPE' namespace='##targetNamespace'"
     * @generated
     */
    Object getPARTITIONTYPE();

    /**
     * Sets the value of the '{@link Powrmart.SESSTRANSFORMATIONGROUPType#getPARTITIONTYPE <em>PARTITIONTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PARTITIONTYPE</em>' attribute.
     * @see #getPARTITIONTYPE()
     * @generated
     */
    void setPARTITIONTYPE(Object value);

} // SESSTRANSFORMATIONGROUPType
