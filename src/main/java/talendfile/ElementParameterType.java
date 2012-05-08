/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package talendfile;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Parameter Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link talendfile.ElementParameterType#getElementValue <em>Element Value</em>}</li>
 *   <li>{@link talendfile.ElementParameterType#getField <em>Field</em>}</li>
 *   <li>{@link talendfile.ElementParameterType#getName <em>Name</em>}</li>
 *   <li>{@link talendfile.ElementParameterType#getValue <em>Value</em>}</li>
 *   <li>{@link talendfile.ElementParameterType#isContextMode <em>Context Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see talendfile.TalendfilePackage#getElementParameterType()
 * @model extendedMetaData="name='ElementParameter_._type' kind='elementOnly'"
 * @generated
 */
public interface ElementParameterType extends EObject {
    /**
     * Returns the value of the '<em><b>Element Value</b></em>' containment reference list.
     * The list contents are of type {@link talendfile.ElementValueType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Element Value</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Element Value</em>' containment reference list.
     * @see talendfile.TalendfilePackage#getElementParameterType_ElementValue()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='ElementValue' namespace='##targetNamespace'"
     * @generated
     */
    EList<ElementValueType> getElementValue();

    /**
     * Returns the value of the '<em><b>Field</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Field</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Field</em>' attribute.
     * @see #setField(String)
     * @see talendfile.TalendfilePackage#getElementParameterType_Field()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='field' namespace='##targetNamespace'"
     * @generated
     */
    String getField();

    /**
     * Sets the value of the '{@link talendfile.ElementParameterType#getField <em>Field</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Field</em>' attribute.
     * @see #getField()
     * @generated
     */
    void setField(String value);

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see talendfile.TalendfilePackage#getElementParameterType_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link talendfile.ElementParameterType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

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
     * @see talendfile.TalendfilePackage#getElementParameterType_Value()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='value' namespace='##targetNamespace'"
     * @generated
     */
    String getValue();

    /**
     * Sets the value of the '{@link talendfile.ElementParameterType#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(String value);

    /**
     * Returns the value of the '<em><b>Context Mode</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context Mode</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context Mode</em>' attribute.
     * @see #isSetContextMode()
     * @see #unsetContextMode()
     * @see #setContextMode(boolean)
     * @see talendfile.TalendfilePackage#getElementParameterType_ContextMode()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='contextMode' namespace='##targetNamespace'"
     * @generated
     */
    boolean isContextMode();

    /**
     * Sets the value of the '{@link talendfile.ElementParameterType#isContextMode <em>Context Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Context Mode</em>' attribute.
     * @see #isSetContextMode()
     * @see #unsetContextMode()
     * @see #isContextMode()
     * @generated
     */
    void setContextMode(boolean value);

    /**
     * Unsets the value of the '{@link talendfile.ElementParameterType#isContextMode <em>Context Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetContextMode()
     * @see #isContextMode()
     * @see #setContextMode(boolean)
     * @generated
     */
    void unsetContextMode();

    /**
     * Returns whether the value of the '{@link talendfile.ElementParameterType#isContextMode <em>Context Mode</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Context Mode</em>' attribute is set.
     * @see #unsetContextMode()
     * @see #isContextMode()
     * @see #setContextMode(boolean)
     * @generated
     */
    boolean isSetContextMode();

} // ElementParameterType
