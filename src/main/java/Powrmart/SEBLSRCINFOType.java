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
 * A representation of the model object '<em><b>SEBLSRCINFO Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.SEBLSRCINFOType#getSEBLJOIN <em>SEBLJOIN</em>}</li>
 *   <li>{@link Powrmart.SEBLSRCINFOType#getSEBLLINK <em>SEBLLINK</em>}</li>
 *   <li>{@link Powrmart.SEBLSRCINFOType#getSEBLMVLINK <em>SEBLMVLINK</em>}</li>
 *   <li>{@link Powrmart.SEBLSRCINFOType#getSEBLMVLINKREL <em>SEBLMVLINKREL</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getSEBLSRCINFOType()
 * @model extendedMetaData="name='SEBLSRCINFO_._type' kind='elementOnly'"
 * @generated
 */
public interface SEBLSRCINFOType extends EObject {
    /**
     * Returns the value of the '<em><b>SEBLJOIN</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.SEBLJOINType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SEBLJOIN</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SEBLJOIN</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getSEBLSRCINFOType_SEBLJOIN()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='SEBLJOIN' namespace='##targetNamespace'"
     * @generated
     */
    EList<SEBLJOINType> getSEBLJOIN();

    /**
     * Returns the value of the '<em><b>SEBLLINK</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.SEBLLINKType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SEBLLINK</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SEBLLINK</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getSEBLSRCINFOType_SEBLLINK()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='SEBLLINK' namespace='##targetNamespace'"
     * @generated
     */
    EList<SEBLLINKType> getSEBLLINK();

    /**
     * Returns the value of the '<em><b>SEBLMVLINK</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.SEBLMVLINKType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SEBLMVLINK</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SEBLMVLINK</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getSEBLSRCINFOType_SEBLMVLINK()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='SEBLMVLINK' namespace='##targetNamespace'"
     * @generated
     */
    EList<SEBLMVLINKType> getSEBLMVLINK();

    /**
     * Returns the value of the '<em><b>SEBLMVLINKREL</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.SEBLMVLINKRELType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SEBLMVLINKREL</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SEBLMVLINKREL</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getSEBLSRCINFOType_SEBLMVLINKREL()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='SEBLMVLINKREL' namespace='##targetNamespace'"
     * @generated
     */
    EList<SEBLMVLINKRELType> getSEBLMVLINKREL();

} // SEBLSRCINFOType
