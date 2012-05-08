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
 * A representation of the model object '<em><b>SAPTABLEINSTANCEPARAM Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.SAPTABLEINSTANCEPARAMType#getSAPFUNCINSTANCEPARAMFLD <em>SAPFUNCINSTANCEPARAMFLD</em>}</li>
 *   <li>{@link Powrmart.SAPTABLEINSTANCEPARAMType#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.SAPTABLEINSTANCEPARAMType#getTYPE <em>TYPE</em>}</li>
 *   <li>{@link Powrmart.SAPTABLEINSTANCEPARAMType#getVALUE <em>VALUE</em>}</li>
 *   <li>{@link Powrmart.SAPTABLEINSTANCEPARAMType#getVALUETYPE <em>VALUETYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getSAPTABLEINSTANCEPARAMType()
 * @model extendedMetaData="name='SAPTABLEINSTANCEPARAM_._type' kind='elementOnly'"
 * @generated
 */
public interface SAPTABLEINSTANCEPARAMType extends EObject {
    /**
     * Returns the value of the '<em><b>SAPFUNCINSTANCEPARAMFLD</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.SAPFUNCINSTANCEPARAMFLDType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SAPFUNCINSTANCEPARAMFLD</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SAPFUNCINSTANCEPARAMFLD</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getSAPTABLEINSTANCEPARAMType_SAPFUNCINSTANCEPARAMFLD()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='SAPFUNCINSTANCEPARAMFLD' namespace='##targetNamespace'"
     * @generated
     */
    EList<SAPFUNCINSTANCEPARAMFLDType> getSAPFUNCINSTANCEPARAMFLD();

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
     * @see Powrmart.PowrmartPackage#getSAPTABLEINSTANCEPARAMType_NAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='NAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getNAME();

    /**
     * Sets the value of the '{@link Powrmart.SAPTABLEINSTANCEPARAMType#getNAME <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NAME</em>' attribute.
     * @see #getNAME()
     * @generated
     */
    void setNAME(Object value);

    /**
     * Returns the value of the '<em><b>TYPE</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.TYPEType7}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TYPE</em>' attribute.
     * @see Powrmart.TYPEType7
     * @see #isSetTYPE()
     * @see #unsetTYPE()
     * @see #setTYPE(TYPEType7)
     * @see Powrmart.PowrmartPackage#getSAPTABLEINSTANCEPARAMType_TYPE()
     * @model unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='TYPE' namespace='##targetNamespace'"
     * @generated
     */
    TYPEType7 getTYPE();

    /**
     * Sets the value of the '{@link Powrmart.SAPTABLEINSTANCEPARAMType#getTYPE <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TYPE</em>' attribute.
     * @see Powrmart.TYPEType7
     * @see #isSetTYPE()
     * @see #unsetTYPE()
     * @see #getTYPE()
     * @generated
     */
    void setTYPE(TYPEType7 value);

    /**
     * Unsets the value of the '{@link Powrmart.SAPTABLEINSTANCEPARAMType#getTYPE <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTYPE()
     * @see #getTYPE()
     * @see #setTYPE(TYPEType7)
     * @generated
     */
    void unsetTYPE();

    /**
     * Returns whether the value of the '{@link Powrmart.SAPTABLEINSTANCEPARAMType#getTYPE <em>TYPE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>TYPE</em>' attribute is set.
     * @see #unsetTYPE()
     * @see #getTYPE()
     * @see #setTYPE(TYPEType7)
     * @generated
     */
    boolean isSetTYPE();

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
     * @see Powrmart.PowrmartPackage#getSAPTABLEINSTANCEPARAMType_VALUE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='VALUE' namespace='##targetNamespace'"
     * @generated
     */
    Object getVALUE();

    /**
     * Sets the value of the '{@link Powrmart.SAPTABLEINSTANCEPARAMType#getVALUE <em>VALUE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>VALUE</em>' attribute.
     * @see #getVALUE()
     * @generated
     */
    void setVALUE(Object value);

    /**
     * Returns the value of the '<em><b>VALUETYPE</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.VALUETYPEType1}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>VALUETYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>VALUETYPE</em>' attribute.
     * @see Powrmart.VALUETYPEType1
     * @see #isSetVALUETYPE()
     * @see #unsetVALUETYPE()
     * @see #setVALUETYPE(VALUETYPEType1)
     * @see Powrmart.PowrmartPackage#getSAPTABLEINSTANCEPARAMType_VALUETYPE()
     * @model unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='VALUETYPE' namespace='##targetNamespace'"
     * @generated
     */
    VALUETYPEType1 getVALUETYPE();

    /**
     * Sets the value of the '{@link Powrmart.SAPTABLEINSTANCEPARAMType#getVALUETYPE <em>VALUETYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>VALUETYPE</em>' attribute.
     * @see Powrmart.VALUETYPEType1
     * @see #isSetVALUETYPE()
     * @see #unsetVALUETYPE()
     * @see #getVALUETYPE()
     * @generated
     */
    void setVALUETYPE(VALUETYPEType1 value);

    /**
     * Unsets the value of the '{@link Powrmart.SAPTABLEINSTANCEPARAMType#getVALUETYPE <em>VALUETYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVALUETYPE()
     * @see #getVALUETYPE()
     * @see #setVALUETYPE(VALUETYPEType1)
     * @generated
     */
    void unsetVALUETYPE();

    /**
     * Returns whether the value of the '{@link Powrmart.SAPTABLEINSTANCEPARAMType#getVALUETYPE <em>VALUETYPE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>VALUETYPE</em>' attribute is set.
     * @see #unsetVALUETYPE()
     * @see #getVALUETYPE()
     * @see #setVALUETYPE(VALUETYPEType1)
     * @generated
     */
    boolean isSetVALUETYPE();

} // SAPTABLEINSTANCEPARAMType
