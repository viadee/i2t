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
 * A representation of the model object '<em><b>CUSTOM Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.CUSTOMType#getDAILYFREQUENCY <em>DAILYFREQUENCY</em>}</li>
 *   <li>{@link Powrmart.CUSTOMType#getREPEAT <em>REPEAT</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getCUSTOMType()
 * @model extendedMetaData="name='CUSTOM_._type' kind='elementOnly'"
 * @generated
 */
public interface CUSTOMType extends EObject {
    /**
     * Returns the value of the '<em><b>DAILYFREQUENCY</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DAILYFREQUENCY</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DAILYFREQUENCY</em>' containment reference.
     * @see #setDAILYFREQUENCY(DAILYFREQUENCYType)
     * @see Powrmart.PowrmartPackage#getCUSTOMType_DAILYFREQUENCY()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='DAILYFREQUENCY' namespace='##targetNamespace'"
     * @generated
     */
    DAILYFREQUENCYType getDAILYFREQUENCY();

    /**
     * Sets the value of the '{@link Powrmart.CUSTOMType#getDAILYFREQUENCY <em>DAILYFREQUENCY</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DAILYFREQUENCY</em>' containment reference.
     * @see #getDAILYFREQUENCY()
     * @generated
     */
    void setDAILYFREQUENCY(DAILYFREQUENCYType value);

    /**
     * Returns the value of the '<em><b>REPEAT</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>REPEAT</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>REPEAT</em>' containment reference.
     * @see #setREPEAT(REPEATType)
     * @see Powrmart.PowrmartPackage#getCUSTOMType_REPEAT()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='REPEAT' namespace='##targetNamespace'"
     * @generated
     */
    REPEATType getREPEAT();

    /**
     * Sets the value of the '{@link Powrmart.CUSTOMType#getREPEAT <em>REPEAT</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>REPEAT</em>' containment reference.
     * @see #getREPEAT()
     * @generated
     */
    void setREPEAT(REPEATType value);

} // CUSTOMType
