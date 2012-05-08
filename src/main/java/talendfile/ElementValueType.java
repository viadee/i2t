/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package talendfile;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link talendfile.ElementValueType#getElementRef <em>Element Ref</em>}</li>
 *   <li>{@link talendfile.ElementValueType#getValue <em>Value</em>}</li>
 *   <li>{@link talendfile.ElementValueType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see talendfile.TalendfilePackage#getElementValueType()
 * @model extendedMetaData="name='ElementValue_._type' kind='empty'"
 * @generated
 */
public interface ElementValueType extends EObject {
    /**
     * Returns the value of the '<em><b>Element Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Element Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Element Ref</em>' attribute.
     * @see #setElementRef(String)
     * @see talendfile.TalendfilePackage#getElementValueType_ElementRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='elementRef' namespace='##targetNamespace'"
     * @generated
     */
    String getElementRef();

    /**
     * Sets the value of the '{@link talendfile.ElementValueType#getElementRef <em>Element Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Element Ref</em>' attribute.
     * @see #getElementRef()
     * @generated
     */
    void setElementRef(String value);

    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(String)
     * @see talendfile.TalendfilePackage#getElementValueType_Value()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='value' namespace='##targetNamespace'"
     * @generated
     */
    String getValue();

    /**
     * Sets the value of the '{@link talendfile.ElementValueType#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(String value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(String)
     * @see talendfile.TalendfilePackage#getElementValueType_Type()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link talendfile.ElementValueType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(String value);

} // ElementValueType
