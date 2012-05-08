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
 * A representation of the model object '<em><b>KEYRANGE Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.KEYRANGEType#getENDRANGE <em>ENDRANGE</em>}</li>
 *   <li>{@link Powrmart.KEYRANGEType#getGROUP <em>GROUP</em>}</li>
 *   <li>{@link Powrmart.KEYRANGEType#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.KEYRANGEType#getSRCINSTANCENAME <em>SRCINSTANCENAME</em>}</li>
 *   <li>{@link Powrmart.KEYRANGEType#getSTARTRANGE <em>STARTRANGE</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getKEYRANGEType()
 * @model extendedMetaData="name='KEYRANGE_._type' kind='empty'"
 * @generated
 */
public interface KEYRANGEType extends EObject {
    /**
     * Returns the value of the '<em><b>ENDRANGE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ENDRANGE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ENDRANGE</em>' attribute.
     * @see #setENDRANGE(Object)
     * @see Powrmart.PowrmartPackage#getKEYRANGEType_ENDRANGE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='ENDRANGE' namespace='##targetNamespace'"
     * @generated
     */
    Object getENDRANGE();

    /**
     * Sets the value of the '{@link Powrmart.KEYRANGEType#getENDRANGE <em>ENDRANGE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ENDRANGE</em>' attribute.
     * @see #getENDRANGE()
     * @generated
     */
    void setENDRANGE(Object value);

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
     * @see Powrmart.PowrmartPackage#getKEYRANGEType_GROUP()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='GROUP' namespace='##targetNamespace'"
     * @generated
     */
    Object getGROUP();

    /**
     * Sets the value of the '{@link Powrmart.KEYRANGEType#getGROUP <em>GROUP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>GROUP</em>' attribute.
     * @see #getGROUP()
     * @generated
     */
    void setGROUP(Object value);

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
     * @see Powrmart.PowrmartPackage#getKEYRANGEType_NAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='NAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getNAME();

    /**
     * Sets the value of the '{@link Powrmart.KEYRANGEType#getNAME <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NAME</em>' attribute.
     * @see #getNAME()
     * @generated
     */
    void setNAME(Object value);

    /**
     * Returns the value of the '<em><b>SRCINSTANCENAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SRCINSTANCENAME</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SRCINSTANCENAME</em>' attribute.
     * @see #setSRCINSTANCENAME(Object)
     * @see Powrmart.PowrmartPackage#getKEYRANGEType_SRCINSTANCENAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='SRCINSTANCENAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getSRCINSTANCENAME();

    /**
     * Sets the value of the '{@link Powrmart.KEYRANGEType#getSRCINSTANCENAME <em>SRCINSTANCENAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SRCINSTANCENAME</em>' attribute.
     * @see #getSRCINSTANCENAME()
     * @generated
     */
    void setSRCINSTANCENAME(Object value);

    /**
     * Returns the value of the '<em><b>STARTRANGE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>STARTRANGE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>STARTRANGE</em>' attribute.
     * @see #setSTARTRANGE(Object)
     * @see Powrmart.PowrmartPackage#getKEYRANGEType_STARTRANGE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='STARTRANGE' namespace='##targetNamespace'"
     * @generated
     */
    Object getSTARTRANGE();

    /**
     * Sets the value of the '{@link Powrmart.KEYRANGEType#getSTARTRANGE <em>STARTRANGE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>STARTRANGE</em>' attribute.
     * @see #getSTARTRANGE()
     * @generated
     */
    void setSTARTRANGE(Object value);

} // KEYRANGEType
