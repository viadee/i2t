/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ERPINFO Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.ERPINFOType#getSAPFUNCTION <em>SAPFUNCTION</em>}</li>
 *   <li>{@link Powrmart.ERPINFOType#getSAPSTRUCTURE <em>SAPSTRUCTURE</em>}</li>
 *   <li>{@link Powrmart.ERPINFOType#getSAPPROGRAM <em>SAPPROGRAM</em>}</li>
 *   <li>{@link Powrmart.ERPINFOType#getGroup <em>Group</em>}</li>
 *   <li>{@link Powrmart.ERPINFOType#getSAPOUTPUTPORT <em>SAPOUTPUTPORT</em>}</li>
 *   <li>{@link Powrmart.ERPINFOType#getSAPVARIABLE <em>SAPVARIABLE</em>}</li>
 *   <li>{@link Powrmart.ERPINFOType#getSAPPROGRAMFLOWOBJECT <em>SAPPROGRAMFLOWOBJECT</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getERPINFOType()
 * @model extendedMetaData="name='ERPINFO_._type' kind='elementOnly'"
 * @generated
 */
public interface ERPINFOType extends EObject {
    /**
     * Returns the value of the '<em><b>SAPFUNCTION</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.SAPFUNCTIONType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SAPFUNCTION</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SAPFUNCTION</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getERPINFOType_SAPFUNCTION()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='SAPFUNCTION' namespace='##targetNamespace'"
     * @generated
     */
    EList<SAPFUNCTIONType> getSAPFUNCTION();

    /**
     * Returns the value of the '<em><b>SAPSTRUCTURE</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.SAPSTRUCTUREType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SAPSTRUCTURE</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SAPSTRUCTURE</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getERPINFOType_SAPSTRUCTURE()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='SAPSTRUCTURE' namespace='##targetNamespace'"
     * @generated
     */
    EList<SAPSTRUCTUREType> getSAPSTRUCTURE();

    /**
     * Returns the value of the '<em><b>SAPPROGRAM</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.SAPPROGRAMType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SAPPROGRAM</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SAPPROGRAM</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getERPINFOType_SAPPROGRAM()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='SAPPROGRAM' namespace='##targetNamespace'"
     * @generated
     */
    EList<SAPPROGRAMType> getSAPPROGRAM();

    /**
     * Returns the value of the '<em><b>Group</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Group</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Group</em>' attribute list.
     * @see Powrmart.PowrmartPackage#getERPINFOType_Group()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='group:3'"
     * @generated
     */
    FeatureMap getGroup();

    /**
     * Returns the value of the '<em><b>SAPOUTPUTPORT</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.SAPOUTPUTPORTType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SAPOUTPUTPORT</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SAPOUTPUTPORT</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getERPINFOType_SAPOUTPUTPORT()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='SAPOUTPUTPORT' namespace='##targetNamespace' group='group:3'"
     * @generated
     */
    EList<SAPOUTPUTPORTType> getSAPOUTPUTPORT();

    /**
     * Returns the value of the '<em><b>SAPVARIABLE</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.SAPVARIABLEType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SAPVARIABLE</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SAPVARIABLE</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getERPINFOType_SAPVARIABLE()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='SAPVARIABLE' namespace='##targetNamespace' group='group:3'"
     * @generated
     */
    EList<SAPVARIABLEType> getSAPVARIABLE();

    /**
     * Returns the value of the '<em><b>SAPPROGRAMFLOWOBJECT</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.SAPPROGRAMFLOWOBJECTType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SAPPROGRAMFLOWOBJECT</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SAPPROGRAMFLOWOBJECT</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getERPINFOType_SAPPROGRAMFLOWOBJECT()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='SAPPROGRAMFLOWOBJECT' namespace='##targetNamespace' group='group:3'"
     * @generated
     */
    EList<SAPPROGRAMFLOWOBJECTType> getSAPPROGRAMFLOWOBJECT();

} // ERPINFOType
