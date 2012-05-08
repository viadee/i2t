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
 * A representation of the model object '<em><b>XMLTEXT Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.XMLTEXTType#getNAMESPACE <em>NAMESPACE</em>}</li>
 *   <li>{@link Powrmart.XMLTEXTType#getTEXT <em>TEXT</em>}</li>
 *   <li>{@link Powrmart.XMLTEXTType#getTYPE <em>TYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getXMLTEXTType()
 * @model extendedMetaData="name='XMLTEXT_._type' kind='empty'"
 * @generated
 */
public interface XMLTEXTType extends EObject {
    /**
     * Returns the value of the '<em><b>NAMESPACE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>NAMESPACE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>NAMESPACE</em>' attribute.
     * @see #setNAMESPACE(Object)
     * @see Powrmart.PowrmartPackage#getXMLTEXTType_NAMESPACE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='NAMESPACE' namespace='##targetNamespace'"
     * @generated
     */
    Object getNAMESPACE();

    /**
     * Sets the value of the '{@link Powrmart.XMLTEXTType#getNAMESPACE <em>NAMESPACE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NAMESPACE</em>' attribute.
     * @see #getNAMESPACE()
     * @generated
     */
    void setNAMESPACE(Object value);

    /**
     * Returns the value of the '<em><b>TEXT</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TEXT</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TEXT</em>' attribute.
     * @see #setTEXT(Object)
     * @see Powrmart.PowrmartPackage#getXMLTEXTType_TEXT()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='TEXT' namespace='##targetNamespace'"
     * @generated
     */
    Object getTEXT();

    /**
     * Sets the value of the '{@link Powrmart.XMLTEXTType#getTEXT <em>TEXT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TEXT</em>' attribute.
     * @see #getTEXT()
     * @generated
     */
    void setTEXT(Object value);

    /**
     * Returns the value of the '<em><b>TYPE</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.TYPEType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TYPE</em>' attribute.
     * @see Powrmart.TYPEType
     * @see #isSetTYPE()
     * @see #unsetTYPE()
     * @see #setTYPE(TYPEType)
     * @see Powrmart.PowrmartPackage#getXMLTEXTType_TYPE()
     * @model unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='TYPE' namespace='##targetNamespace'"
     * @generated
     */
    TYPEType getTYPE();

    /**
     * Sets the value of the '{@link Powrmart.XMLTEXTType#getTYPE <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TYPE</em>' attribute.
     * @see Powrmart.TYPEType
     * @see #isSetTYPE()
     * @see #unsetTYPE()
     * @see #getTYPE()
     * @generated
     */
    void setTYPE(TYPEType value);

    /**
     * Unsets the value of the '{@link Powrmart.XMLTEXTType#getTYPE <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTYPE()
     * @see #getTYPE()
     * @see #setTYPE(TYPEType)
     * @generated
     */
    void unsetTYPE();

    /**
     * Returns whether the value of the '{@link Powrmart.XMLTEXTType#getTYPE <em>TYPE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>TYPE</em>' attribute is set.
     * @see #unsetTYPE()
     * @see #getTYPE()
     * @see #setTYPE(TYPEType)
     * @generated
     */
    boolean isSetTYPE();

} // XMLTEXTType
