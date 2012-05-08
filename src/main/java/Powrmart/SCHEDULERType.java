/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SCHEDULER Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.SCHEDULERType#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.SCHEDULERType#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.SCHEDULERType#getREUSABLE <em>REUSABLE</em>}</li>
 *   <li>{@link Powrmart.SCHEDULERType#getVERSIONNUMBER <em>VERSIONNUMBER</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getSCHEDULERType()
 * @model extendedMetaData="name='SCHEDULER_._type' kind='elementOnly'"
 * @generated
 */
public interface SCHEDULERType extends SCHEDULEINFO {
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
     * @see Powrmart.PowrmartPackage#getSCHEDULERType_DESCRIPTION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='DESCRIPTION' namespace='##targetNamespace'"
     * @generated
     */
    Object getDESCRIPTION();

    /**
     * Sets the value of the '{@link Powrmart.SCHEDULERType#getDESCRIPTION <em>DESCRIPTION</em>}' attribute.
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
     * @see Powrmart.PowrmartPackage#getSCHEDULERType_NAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='NAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getNAME();

    /**
     * Sets the value of the '{@link Powrmart.SCHEDULERType#getNAME <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NAME</em>' attribute.
     * @see #getNAME()
     * @generated
     */
    void setNAME(Object value);

    /**
     * Returns the value of the '<em><b>REUSABLE</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.REUSABLEType1}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>REUSABLE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>REUSABLE</em>' attribute.
     * @see Powrmart.REUSABLEType1
     * @see #isSetREUSABLE()
     * @see #unsetREUSABLE()
     * @see #setREUSABLE(REUSABLEType1)
     * @see Powrmart.PowrmartPackage#getSCHEDULERType_REUSABLE()
     * @model unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='REUSABLE' namespace='##targetNamespace'"
     * @generated
     */
    REUSABLEType1 getREUSABLE();

    /**
     * Sets the value of the '{@link Powrmart.SCHEDULERType#getREUSABLE <em>REUSABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>REUSABLE</em>' attribute.
     * @see Powrmart.REUSABLEType1
     * @see #isSetREUSABLE()
     * @see #unsetREUSABLE()
     * @see #getREUSABLE()
     * @generated
     */
    void setREUSABLE(REUSABLEType1 value);

    /**
     * Unsets the value of the '{@link Powrmart.SCHEDULERType#getREUSABLE <em>REUSABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetREUSABLE()
     * @see #getREUSABLE()
     * @see #setREUSABLE(REUSABLEType1)
     * @generated
     */
    void unsetREUSABLE();

    /**
     * Returns whether the value of the '{@link Powrmart.SCHEDULERType#getREUSABLE <em>REUSABLE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>REUSABLE</em>' attribute is set.
     * @see #unsetREUSABLE()
     * @see #getREUSABLE()
     * @see #setREUSABLE(REUSABLEType1)
     * @generated
     */
    boolean isSetREUSABLE();

    /**
     * Returns the value of the '<em><b>VERSIONNUMBER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>VERSIONNUMBER</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>VERSIONNUMBER</em>' attribute.
     * @see #setVERSIONNUMBER(Object)
     * @see Powrmart.PowrmartPackage#getSCHEDULERType_VERSIONNUMBER()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='VERSIONNUMBER' namespace='##targetNamespace'"
     * @generated
     */
    Object getVERSIONNUMBER();

    /**
     * Sets the value of the '{@link Powrmart.SCHEDULERType#getVERSIONNUMBER <em>VERSIONNUMBER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>VERSIONNUMBER</em>' attribute.
     * @see #getVERSIONNUMBER()
     * @generated
     */
    void setVERSIONNUMBER(Object value);

} // SCHEDULERType
