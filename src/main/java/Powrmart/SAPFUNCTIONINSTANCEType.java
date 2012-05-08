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
 * A representation of the model object '<em><b>SAPFUNCTIONINSTANCE Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.SAPFUNCTIONINSTANCEType#getSAPFUNCINSTANCEPARAM <em>SAPFUNCINSTANCEPARAM</em>}</li>
 *   <li>{@link Powrmart.SAPFUNCTIONINSTANCEType#getSAPTABLEINSTANCEPARAM <em>SAPTABLEINSTANCEPARAM</em>}</li>
 *   <li>{@link Powrmart.SAPFUNCTIONINSTANCEType#getDSQINSTNAME <em>DSQINSTNAME</em>}</li>
 *   <li>{@link Powrmart.SAPFUNCTIONINSTANCEType#getFUNCTIONNAME <em>FUNCTIONNAME</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getSAPFUNCTIONINSTANCEType()
 * @model extendedMetaData="name='SAPFUNCTIONINSTANCE_._type' kind='elementOnly'"
 * @generated
 */
public interface SAPFUNCTIONINSTANCEType extends EObject {
    /**
     * Returns the value of the '<em><b>SAPFUNCINSTANCEPARAM</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.SAPFUNCINSTANCEPARAMType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SAPFUNCINSTANCEPARAM</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SAPFUNCINSTANCEPARAM</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getSAPFUNCTIONINSTANCEType_SAPFUNCINSTANCEPARAM()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='SAPFUNCINSTANCEPARAM' namespace='##targetNamespace'"
     * @generated
     */
    EList<SAPFUNCINSTANCEPARAMType> getSAPFUNCINSTANCEPARAM();

    /**
     * Returns the value of the '<em><b>SAPTABLEINSTANCEPARAM</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.SAPTABLEINSTANCEPARAMType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SAPTABLEINSTANCEPARAM</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SAPTABLEINSTANCEPARAM</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getSAPFUNCTIONINSTANCEType_SAPTABLEINSTANCEPARAM()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='SAPTABLEINSTANCEPARAM' namespace='##targetNamespace'"
     * @generated
     */
    EList<SAPTABLEINSTANCEPARAMType> getSAPTABLEINSTANCEPARAM();

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
     * @see Powrmart.PowrmartPackage#getSAPFUNCTIONINSTANCEType_DSQINSTNAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='DSQINSTNAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getDSQINSTNAME();

    /**
     * Sets the value of the '{@link Powrmart.SAPFUNCTIONINSTANCEType#getDSQINSTNAME <em>DSQINSTNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DSQINSTNAME</em>' attribute.
     * @see #getDSQINSTNAME()
     * @generated
     */
    void setDSQINSTNAME(Object value);

    /**
     * Returns the value of the '<em><b>FUNCTIONNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>FUNCTIONNAME</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>FUNCTIONNAME</em>' attribute.
     * @see #setFUNCTIONNAME(Object)
     * @see Powrmart.PowrmartPackage#getSAPFUNCTIONINSTANCEType_FUNCTIONNAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='FUNCTIONNAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getFUNCTIONNAME();

    /**
     * Sets the value of the '{@link Powrmart.SAPFUNCTIONINSTANCEType#getFUNCTIONNAME <em>FUNCTIONNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>FUNCTIONNAME</em>' attribute.
     * @see #getFUNCTIONNAME()
     * @generated
     */
    void setFUNCTIONNAME(Object value);

} // SAPFUNCTIONINSTANCEType
