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
 * A representation of the model object '<em><b>SAPCODEBLOCK Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.SAPCODEBLOCKType#getCODEBLOCK <em>CODEBLOCK</em>}</li>
 *   <li>{@link Powrmart.SAPCODEBLOCKType#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.SAPCODEBLOCKType#getDSQINSTNAME <em>DSQINSTNAME</em>}</li>
 *   <li>{@link Powrmart.SAPCODEBLOCKType#getNAME <em>NAME</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getSAPCODEBLOCKType()
 * @model extendedMetaData="name='SAPCODEBLOCK_._type' kind='empty'"
 * @generated
 */
public interface SAPCODEBLOCKType extends EObject {
    /**
     * Returns the value of the '<em><b>CODEBLOCK</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>CODEBLOCK</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>CODEBLOCK</em>' attribute.
     * @see #setCODEBLOCK(Object)
     * @see Powrmart.PowrmartPackage#getSAPCODEBLOCKType_CODEBLOCK()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='CODEBLOCK' namespace='##targetNamespace'"
     * @generated
     */
    Object getCODEBLOCK();

    /**
     * Sets the value of the '{@link Powrmart.SAPCODEBLOCKType#getCODEBLOCK <em>CODEBLOCK</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CODEBLOCK</em>' attribute.
     * @see #getCODEBLOCK()
     * @generated
     */
    void setCODEBLOCK(Object value);

    /**
     * Returns the value of the '<em><b>DESCRIPTION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DESCRIPTION</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DESCRIPTION</em>' attribute.
     * @see #setDESCRIPTION(Object)
     * @see Powrmart.PowrmartPackage#getSAPCODEBLOCKType_DESCRIPTION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='DESCRIPTION' namespace='##targetNamespace'"
     * @generated
     */
    Object getDESCRIPTION();

    /**
     * Sets the value of the '{@link Powrmart.SAPCODEBLOCKType#getDESCRIPTION <em>DESCRIPTION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DESCRIPTION</em>' attribute.
     * @see #getDESCRIPTION()
     * @generated
     */
    void setDESCRIPTION(Object value);

    /**
     * Returns the value of the '<em><b>DSQINSTNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DSQINSTNAME</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DSQINSTNAME</em>' attribute.
     * @see #setDSQINSTNAME(Object)
     * @see Powrmart.PowrmartPackage#getSAPCODEBLOCKType_DSQINSTNAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='DSQINSTNAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getDSQINSTNAME();

    /**
     * Sets the value of the '{@link Powrmart.SAPCODEBLOCKType#getDSQINSTNAME <em>DSQINSTNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DSQINSTNAME</em>' attribute.
     * @see #getDSQINSTNAME()
     * @generated
     */
    void setDSQINSTNAME(Object value);

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
     * @see Powrmart.PowrmartPackage#getSAPCODEBLOCKType_NAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='NAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getNAME();

    /**
     * Sets the value of the '{@link Powrmart.SAPCODEBLOCKType#getNAME <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NAME</em>' attribute.
     * @see #getNAME()
     * @generated
     */
    void setNAME(Object value);

} // SAPCODEBLOCKType
