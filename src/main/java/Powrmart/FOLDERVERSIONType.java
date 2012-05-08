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
 * A representation of the model object '<em><b>FOLDERVERSION Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.FOLDERVERSIONType#getSOURCE <em>SOURCE</em>}</li>
 *   <li>{@link Powrmart.FOLDERVERSIONType#getTARGET <em>TARGET</em>}</li>
 *   <li>{@link Powrmart.FOLDERVERSIONType#getTRANSFORMATION <em>TRANSFORMATION</em>}</li>
 *   <li>{@link Powrmart.FOLDERVERSIONType#getMAPPLET <em>MAPPLET</em>}</li>
 *   <li>{@link Powrmart.FOLDERVERSIONType#getMAPPING <em>MAPPING</em>}</li>
 *   <li>{@link Powrmart.FOLDERVERSIONType#getSHORTCUT <em>SHORTCUT</em>}</li>
 *   <li>{@link Powrmart.FOLDERVERSIONType#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.FOLDERVERSIONType#getNAME <em>NAME</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getFOLDERVERSIONType()
 * @model extendedMetaData="name='FOLDERVERSION_._type' kind='elementOnly'"
 * @generated
 */
public interface FOLDERVERSIONType extends EObject {
    /**
     * Returns the value of the '<em><b>SOURCE</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.SOURCEType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SOURCE</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SOURCE</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getFOLDERVERSIONType_SOURCE()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='SOURCE' namespace='##targetNamespace'"
     * @generated
     */
    EList<SOURCEType> getSOURCE();

    /**
     * Returns the value of the '<em><b>TARGET</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.TARGETType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TARGET</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TARGET</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getFOLDERVERSIONType_TARGET()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='TARGET' namespace='##targetNamespace'"
     * @generated
     */
    EList<TARGETType> getTARGET();

    /**
     * Returns the value of the '<em><b>TRANSFORMATION</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.TRANSFORMATIONType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TRANSFORMATION</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TRANSFORMATION</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getFOLDERVERSIONType_TRANSFORMATION()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='TRANSFORMATION' namespace='##targetNamespace'"
     * @generated
     */
    EList<TRANSFORMATIONType> getTRANSFORMATION();

    /**
     * Returns the value of the '<em><b>MAPPLET</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.MAPPLETType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>MAPPLET</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>MAPPLET</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getFOLDERVERSIONType_MAPPLET()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='MAPPLET' namespace='##targetNamespace'"
     * @generated
     */
    EList<MAPPLETType> getMAPPLET();

    /**
     * Returns the value of the '<em><b>MAPPING</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.MAPPINGType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>MAPPING</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>MAPPING</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getFOLDERVERSIONType_MAPPING()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='MAPPING' namespace='##targetNamespace'"
     * @generated
     */
    EList<MAPPINGType> getMAPPING();

    /**
     * Returns the value of the '<em><b>SHORTCUT</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.SHORTCUTType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SHORTCUT</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SHORTCUT</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getFOLDERVERSIONType_SHORTCUT()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='SHORTCUT' namespace='##targetNamespace'"
     * @generated
     */
    EList<SHORTCUTType> getSHORTCUT();

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
     * @see Powrmart.PowrmartPackage#getFOLDERVERSIONType_DESCRIPTION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='DESCRIPTION' namespace='##targetNamespace'"
     * @generated
     */
    Object getDESCRIPTION();

    /**
     * Sets the value of the '{@link Powrmart.FOLDERVERSIONType#getDESCRIPTION <em>DESCRIPTION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DESCRIPTION</em>' attribute.
     * @see #getDESCRIPTION()
     * @generated
     */
    void setDESCRIPTION(Object value);

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
     * @see Powrmart.PowrmartPackage#getFOLDERVERSIONType_NAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='NAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getNAME();

    /**
     * Sets the value of the '{@link Powrmart.FOLDERVERSIONType#getNAME <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NAME</em>' attribute.
     * @see #getNAME()
     * @generated
     */
    void setNAME(Object value);

} // FOLDERVERSIONType
