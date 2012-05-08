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
 * A representation of the model object '<em><b>ERPSRCINFO Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.ERPSRCINFOType#getSEBLSRCINFO <em>SEBLSRCINFO</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getERPSRCINFOType()
 * @model extendedMetaData="name='ERPSRCINFO_._type' kind='elementOnly'"
 * @generated
 */
public interface ERPSRCINFOType extends EObject {
    /**
     * Returns the value of the '<em><b>SEBLSRCINFO</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SEBLSRCINFO</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SEBLSRCINFO</em>' containment reference.
     * @see #setSEBLSRCINFO(SEBLSRCINFOType)
     * @see Powrmart.PowrmartPackage#getERPSRCINFOType_SEBLSRCINFO()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='SEBLSRCINFO' namespace='##targetNamespace'"
     * @generated
     */
    SEBLSRCINFOType getSEBLSRCINFO();

    /**
     * Sets the value of the '{@link Powrmart.ERPSRCINFOType#getSEBLSRCINFO <em>SEBLSRCINFO</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SEBLSRCINFO</em>' containment reference.
     * @see #getSEBLSRCINFO()
     * @generated
     */
    void setSEBLSRCINFO(SEBLSRCINFOType value);

} // ERPSRCINFOType
