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
 * A representation of the model object '<em><b>SCHEDULEINFO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.SCHEDULEINFO#getSCHEDULEINFO <em>SCHEDULEINFO</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getSCHEDULEINFO()
 * @model extendedMetaData="name='SCHEDULEINFO' kind='elementOnly'"
 * @generated
 */
public interface SCHEDULEINFO extends EObject {
    /**
     * Returns the value of the '<em><b>SCHEDULEINFO</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SCHEDULEINFO</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SCHEDULEINFO</em>' containment reference.
     * @see #setSCHEDULEINFO(SCHEDULEINFOType)
     * @see Powrmart.PowrmartPackage#getSCHEDULEINFO_SCHEDULEINFO()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='SCHEDULEINFO' namespace='##targetNamespace'"
     * @generated
     */
    SCHEDULEINFOType getSCHEDULEINFO();

    /**
     * Sets the value of the '{@link Powrmart.SCHEDULEINFO#getSCHEDULEINFO <em>SCHEDULEINFO</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SCHEDULEINFO</em>' containment reference.
     * @see #getSCHEDULEINFO()
     * @generated
     */
    void setSCHEDULEINFO(SCHEDULEINFOType value);

} // SCHEDULEINFO
