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
 * A representation of the model object '<em><b>TRANSFORMRESOURCEREF Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.TRANSFORMRESOURCEREFType#getRESOURCEREFERENCE <em>RESOURCEREFERENCE</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMRESOURCEREFType#getSINSTANCENAME <em>SINSTANCENAME</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMRESOURCEREFType#getTRANSFORMATIONTYPE <em>TRANSFORMATIONTYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getTRANSFORMRESOURCEREFType()
 * @model extendedMetaData="name='TRANSFORMRESOURCEREF_._type' kind='elementOnly'"
 * @generated
 */
public interface TRANSFORMRESOURCEREFType extends EObject {
    /**
     * Returns the value of the '<em><b>RESOURCEREFERENCE</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.RESOURCEREFERENCEType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>RESOURCEREFERENCE</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>RESOURCEREFERENCE</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getTRANSFORMRESOURCEREFType_RESOURCEREFERENCE()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='RESOURCEREFERENCE' namespace='##targetNamespace'"
     * @generated
     */
    EList<RESOURCEREFERENCEType> getRESOURCEREFERENCE();

    /**
     * Returns the value of the '<em><b>SINSTANCENAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SINSTANCENAME</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SINSTANCENAME</em>' attribute.
     * @see #setSINSTANCENAME(Object)
     * @see Powrmart.PowrmartPackage#getTRANSFORMRESOURCEREFType_SINSTANCENAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='SINSTANCENAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getSINSTANCENAME();

    /**
     * Sets the value of the '{@link Powrmart.TRANSFORMRESOURCEREFType#getSINSTANCENAME <em>SINSTANCENAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SINSTANCENAME</em>' attribute.
     * @see #getSINSTANCENAME()
     * @generated
     */
    void setSINSTANCENAME(Object value);

    /**
     * Returns the value of the '<em><b>TRANSFORMATIONTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TRANSFORMATIONTYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TRANSFORMATIONTYPE</em>' attribute.
     * @see #setTRANSFORMATIONTYPE(Object)
     * @see Powrmart.PowrmartPackage#getTRANSFORMRESOURCEREFType_TRANSFORMATIONTYPE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='TRANSFORMATIONTYPE' namespace='##targetNamespace'"
     * @generated
     */
    Object getTRANSFORMATIONTYPE();

    /**
     * Sets the value of the '{@link Powrmart.TRANSFORMRESOURCEREFType#getTRANSFORMATIONTYPE <em>TRANSFORMATIONTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TRANSFORMATIONTYPE</em>' attribute.
     * @see #getTRANSFORMATIONTYPE()
     * @generated
     */
    void setTRANSFORMATIONTYPE(Object value);

} // TRANSFORMRESOURCEREFType
