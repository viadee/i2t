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
 * A representation of the model object '<em><b>REPEAT Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.REPEATType#getFILTER <em>FILTER</em>}</li>
 *   <li>{@link Powrmart.REPEATType#getINTERVAL <em>INTERVAL</em>}</li>
 *   <li>{@link Powrmart.REPEATType#getTYPE <em>TYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getREPEATType()
 * @model extendedMetaData="name='REPEAT_._type' kind='elementOnly'"
 * @generated
 */
public interface REPEATType extends EObject {
    /**
     * Returns the value of the '<em><b>FILTER</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.FILTERType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>FILTER</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>FILTER</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getREPEATType_FILTER()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='FILTER' namespace='##targetNamespace'"
     * @generated
     */
    EList<FILTERType> getFILTER();

    /**
     * Returns the value of the '<em><b>INTERVAL</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>INTERVAL</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>INTERVAL</em>' attribute.
     * @see #setINTERVAL(Object)
     * @see Powrmart.PowrmartPackage#getREPEATType_INTERVAL()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='INTERVAL' namespace='##targetNamespace'"
     * @generated
     */
    Object getINTERVAL();

    /**
     * Sets the value of the '{@link Powrmart.REPEATType#getINTERVAL <em>INTERVAL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>INTERVAL</em>' attribute.
     * @see #getINTERVAL()
     * @generated
     */
    void setINTERVAL(Object value);

    /**
     * Returns the value of the '<em><b>TYPE</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.TYPEType8}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TYPE</em>' attribute.
     * @see Powrmart.TYPEType8
     * @see #isSetTYPE()
     * @see #unsetTYPE()
     * @see #setTYPE(TYPEType8)
     * @see Powrmart.PowrmartPackage#getREPEATType_TYPE()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='TYPE' namespace='##targetNamespace'"
     * @generated
     */
    TYPEType8 getTYPE();

    /**
     * Sets the value of the '{@link Powrmart.REPEATType#getTYPE <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TYPE</em>' attribute.
     * @see Powrmart.TYPEType8
     * @see #isSetTYPE()
     * @see #unsetTYPE()
     * @see #getTYPE()
     * @generated
     */
    void setTYPE(TYPEType8 value);

    /**
     * Unsets the value of the '{@link Powrmart.REPEATType#getTYPE <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTYPE()
     * @see #getTYPE()
     * @see #setTYPE(TYPEType8)
     * @generated
     */
    void unsetTYPE();

    /**
     * Returns whether the value of the '{@link Powrmart.REPEATType#getTYPE <em>TYPE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>TYPE</em>' attribute is set.
     * @see #unsetTYPE()
     * @see #getTYPE()
     * @see #setTYPE(TYPEType8)
     * @generated
     */
    boolean isSetTYPE();

} // REPEATType
