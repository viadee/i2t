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
 * A representation of the model object '<em><b>DAILYFREQUENCY Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.DAILYFREQUENCYType#getHOURS <em>HOURS</em>}</li>
 *   <li>{@link Powrmart.DAILYFREQUENCYType#getMINUTES <em>MINUTES</em>}</li>
 *   <li>{@link Powrmart.DAILYFREQUENCYType#getRUNONCE <em>RUNONCE</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getDAILYFREQUENCYType()
 * @model extendedMetaData="name='DAILYFREQUENCY_._type' kind='empty'"
 * @generated
 */
public interface DAILYFREQUENCYType extends EObject {
    /**
     * Returns the value of the '<em><b>HOURS</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>HOURS</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>HOURS</em>' attribute.
     * @see #setHOURS(Object)
     * @see Powrmart.PowrmartPackage#getDAILYFREQUENCYType_HOURS()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='HOURS' namespace='##targetNamespace'"
     * @generated
     */
    Object getHOURS();

    /**
     * Sets the value of the '{@link Powrmart.DAILYFREQUENCYType#getHOURS <em>HOURS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>HOURS</em>' attribute.
     * @see #getHOURS()
     * @generated
     */
    void setHOURS(Object value);

    /**
     * Returns the value of the '<em><b>MINUTES</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>MINUTES</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>MINUTES</em>' attribute.
     * @see #setMINUTES(Object)
     * @see Powrmart.PowrmartPackage#getDAILYFREQUENCYType_MINUTES()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='MINUTES' namespace='##targetNamespace'"
     * @generated
     */
    Object getMINUTES();

    /**
     * Sets the value of the '{@link Powrmart.DAILYFREQUENCYType#getMINUTES <em>MINUTES</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>MINUTES</em>' attribute.
     * @see #getMINUTES()
     * @generated
     */
    void setMINUTES(Object value);

    /**
     * Returns the value of the '<em><b>RUNONCE</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.RUNONCEType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>RUNONCE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>RUNONCE</em>' attribute.
     * @see Powrmart.RUNONCEType
     * @see #isSetRUNONCE()
     * @see #unsetRUNONCE()
     * @see #setRUNONCE(RUNONCEType)
     * @see Powrmart.PowrmartPackage#getDAILYFREQUENCYType_RUNONCE()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='RUNONCE' namespace='##targetNamespace'"
     * @generated
     */
    RUNONCEType getRUNONCE();

    /**
     * Sets the value of the '{@link Powrmart.DAILYFREQUENCYType#getRUNONCE <em>RUNONCE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>RUNONCE</em>' attribute.
     * @see Powrmart.RUNONCEType
     * @see #isSetRUNONCE()
     * @see #unsetRUNONCE()
     * @see #getRUNONCE()
     * @generated
     */
    void setRUNONCE(RUNONCEType value);

    /**
     * Unsets the value of the '{@link Powrmart.DAILYFREQUENCYType#getRUNONCE <em>RUNONCE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRUNONCE()
     * @see #getRUNONCE()
     * @see #setRUNONCE(RUNONCEType)
     * @generated
     */
    void unsetRUNONCE();

    /**
     * Returns whether the value of the '{@link Powrmart.DAILYFREQUENCYType#getRUNONCE <em>RUNONCE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>RUNONCE</em>' attribute is set.
     * @see #unsetRUNONCE()
     * @see #getRUNONCE()
     * @see #setRUNONCE(RUNONCEType)
     * @generated
     */
    boolean isSetRUNONCE();

} // DAILYFREQUENCYType
