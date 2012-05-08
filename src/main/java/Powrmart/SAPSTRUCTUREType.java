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
 * A representation of the model object '<em><b>SAPSTRUCTURE Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.SAPSTRUCTUREType#getSAPSTRUCTUREFIELD <em>SAPSTRUCTUREFIELD</em>}</li>
 *   <li>{@link Powrmart.SAPSTRUCTUREType#getNAME <em>NAME</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getSAPSTRUCTUREType()
 * @model extendedMetaData="name='SAPSTRUCTURE_._type' kind='elementOnly'"
 * @generated
 */
public interface SAPSTRUCTUREType extends EObject {
    /**
     * Returns the value of the '<em><b>SAPSTRUCTUREFIELD</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.SAPSTRUCTUREFIELDType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SAPSTRUCTUREFIELD</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SAPSTRUCTUREFIELD</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getSAPSTRUCTUREType_SAPSTRUCTUREFIELD()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='SAPSTRUCTUREFIELD' namespace='##targetNamespace'"
     * @generated
     */
    EList<SAPSTRUCTUREFIELDType> getSAPSTRUCTUREFIELD();

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
     * @see Powrmart.PowrmartPackage#getSAPSTRUCTUREType_NAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='NAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getNAME();

    /**
     * Sets the value of the '{@link Powrmart.SAPSTRUCTUREType#getNAME <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NAME</em>' attribute.
     * @see #getNAME()
     * @generated
     */
    void setNAME(Object value);

} // SAPSTRUCTUREType
