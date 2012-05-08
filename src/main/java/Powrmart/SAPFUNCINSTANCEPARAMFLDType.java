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
 * A representation of the model object '<em><b>SAPFUNCINSTANCEPARAMFLD Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.SAPFUNCINSTANCEPARAMFLDType#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.SAPFUNCINSTANCEPARAMFLDType#getVALUE <em>VALUE</em>}</li>
 *   <li>{@link Powrmart.SAPFUNCINSTANCEPARAMFLDType#getVALUETYPE <em>VALUETYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getSAPFUNCINSTANCEPARAMFLDType()
 * @model extendedMetaData="name='SAPFUNCINSTANCEPARAMFLD_._type' kind='empty'"
 * @generated
 */
public interface SAPFUNCINSTANCEPARAMFLDType extends EObject {
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
     * @see Powrmart.PowrmartPackage#getSAPFUNCINSTANCEPARAMFLDType_NAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='NAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getNAME();

    /**
     * Sets the value of the '{@link Powrmart.SAPFUNCINSTANCEPARAMFLDType#getNAME <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NAME</em>' attribute.
     * @see #getNAME()
     * @generated
     */
    void setNAME(Object value);

    /**
     * Returns the value of the '<em><b>VALUE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>VALUE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>VALUE</em>' attribute.
     * @see #setVALUE(Object)
     * @see Powrmart.PowrmartPackage#getSAPFUNCINSTANCEPARAMFLDType_VALUE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='VALUE' namespace='##targetNamespace'"
     * @generated
     */
    Object getVALUE();

    /**
     * Sets the value of the '{@link Powrmart.SAPFUNCINSTANCEPARAMFLDType#getVALUE <em>VALUE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>VALUE</em>' attribute.
     * @see #getVALUE()
     * @generated
     */
    void setVALUE(Object value);

    /**
     * Returns the value of the '<em><b>VALUETYPE</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.VALUETYPEType2}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>VALUETYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>VALUETYPE</em>' attribute.
     * @see Powrmart.VALUETYPEType2
     * @see #isSetVALUETYPE()
     * @see #unsetVALUETYPE()
     * @see #setVALUETYPE(VALUETYPEType2)
     * @see Powrmart.PowrmartPackage#getSAPFUNCINSTANCEPARAMFLDType_VALUETYPE()
     * @model unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='VALUETYPE' namespace='##targetNamespace'"
     * @generated
     */
    VALUETYPEType2 getVALUETYPE();

    /**
     * Sets the value of the '{@link Powrmart.SAPFUNCINSTANCEPARAMFLDType#getVALUETYPE <em>VALUETYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>VALUETYPE</em>' attribute.
     * @see Powrmart.VALUETYPEType2
     * @see #isSetVALUETYPE()
     * @see #unsetVALUETYPE()
     * @see #getVALUETYPE()
     * @generated
     */
    void setVALUETYPE(VALUETYPEType2 value);

    /**
     * Unsets the value of the '{@link Powrmart.SAPFUNCINSTANCEPARAMFLDType#getVALUETYPE <em>VALUETYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVALUETYPE()
     * @see #getVALUETYPE()
     * @see #setVALUETYPE(VALUETYPEType2)
     * @generated
     */
    void unsetVALUETYPE();

    /**
     * Returns whether the value of the '{@link Powrmart.SAPFUNCINSTANCEPARAMFLDType#getVALUETYPE <em>VALUETYPE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>VALUETYPE</em>' attribute is set.
     * @see #unsetVALUETYPE()
     * @see #getVALUETYPE()
     * @see #setVALUETYPE(VALUETYPEType2)
     * @generated
     */
    boolean isSetVALUETYPE();

} // SAPFUNCINSTANCEPARAMFLDType
