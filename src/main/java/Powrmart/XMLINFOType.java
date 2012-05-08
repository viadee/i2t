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
 * A representation of the model object '<em><b>XMLINFO Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.XMLINFOType#getXMLTEXT <em>XMLTEXT</em>}</li>
 *   <li>{@link Powrmart.XMLINFOType#getTEXT <em>TEXT</em>}</li>
 *   <li>{@link Powrmart.XMLINFOType#getTYPE <em>TYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getXMLINFOType()
 * @model extendedMetaData="name='XMLINFO_._type' kind='elementOnly'"
 * @generated
 */
public interface XMLINFOType extends EObject {
    /**
     * Returns the value of the '<em><b>XMLTEXT</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.XMLTEXTType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>XMLTEXT</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>XMLTEXT</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getXMLINFOType_XMLTEXT()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='XMLTEXT' namespace='##targetNamespace'"
     * @generated
     */
    EList<XMLTEXTType> getXMLTEXT();

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
     * @see Powrmart.PowrmartPackage#getXMLINFOType_TEXT()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='TEXT' namespace='##targetNamespace'"
     * @generated
     */
    Object getTEXT();

    /**
     * Sets the value of the '{@link Powrmart.XMLINFOType#getTEXT <em>TEXT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TEXT</em>' attribute.
     * @see #getTEXT()
     * @generated
     */
    void setTEXT(Object value);

    /**
     * Returns the value of the '<em><b>TYPE</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.TYPEType2}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TYPE</em>' attribute.
     * @see Powrmart.TYPEType2
     * @see #isSetTYPE()
     * @see #unsetTYPE()
     * @see #setTYPE(TYPEType2)
     * @see Powrmart.PowrmartPackage#getXMLINFOType_TYPE()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='TYPE' namespace='##targetNamespace'"
     * @generated
     */
    TYPEType2 getTYPE();

    /**
     * Sets the value of the '{@link Powrmart.XMLINFOType#getTYPE <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TYPE</em>' attribute.
     * @see Powrmart.TYPEType2
     * @see #isSetTYPE()
     * @see #unsetTYPE()
     * @see #getTYPE()
     * @generated
     */
    void setTYPE(TYPEType2 value);

    /**
     * Unsets the value of the '{@link Powrmart.XMLINFOType#getTYPE <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTYPE()
     * @see #getTYPE()
     * @see #setTYPE(TYPEType2)
     * @generated
     */
    void unsetTYPE();

    /**
     * Returns whether the value of the '{@link Powrmart.XMLINFOType#getTYPE <em>TYPE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>TYPE</em>' attribute is set.
     * @see #unsetTYPE()
     * @see #getTYPE()
     * @see #setTYPE(TYPEType2)
     * @generated
     */
    boolean isSetTYPE();

} // XMLINFOType
