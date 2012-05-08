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
 * A representation of the model object '<em><b>FILTER Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.FILTERType#getDAY <em>DAY</em>}</li>
 *   <li>{@link Powrmart.FILTERType#getDAYOFMONTH <em>DAYOFMONTH</em>}</li>
 *   <li>{@link Powrmart.FILTERType#getOCCURRENCE <em>OCCURRENCE</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getFILTERType()
 * @model extendedMetaData="name='FILTER_._type' kind='empty'"
 * @generated
 */
public interface FILTERType extends EObject {
    /**
     * Returns the value of the '<em><b>DAY</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.DAYType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DAY</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DAY</em>' attribute.
     * @see Powrmart.DAYType
     * @see #isSetDAY()
     * @see #unsetDAY()
     * @see #setDAY(DAYType)
     * @see Powrmart.PowrmartPackage#getFILTERType_DAY()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='DAY' namespace='##targetNamespace'"
     * @generated
     */
    DAYType getDAY();

    /**
     * Sets the value of the '{@link Powrmart.FILTERType#getDAY <em>DAY</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DAY</em>' attribute.
     * @see Powrmart.DAYType
     * @see #isSetDAY()
     * @see #unsetDAY()
     * @see #getDAY()
     * @generated
     */
    void setDAY(DAYType value);

    /**
     * Unsets the value of the '{@link Powrmart.FILTERType#getDAY <em>DAY</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDAY()
     * @see #getDAY()
     * @see #setDAY(DAYType)
     * @generated
     */
    void unsetDAY();

    /**
     * Returns whether the value of the '{@link Powrmart.FILTERType#getDAY <em>DAY</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>DAY</em>' attribute is set.
     * @see #unsetDAY()
     * @see #getDAY()
     * @see #setDAY(DAYType)
     * @generated
     */
    boolean isSetDAY();

    /**
     * Returns the value of the '<em><b>DAYOFMONTH</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DAYOFMONTH</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DAYOFMONTH</em>' attribute.
     * @see #setDAYOFMONTH(Object)
     * @see Powrmart.PowrmartPackage#getFILTERType_DAYOFMONTH()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='DAYOFMONTH' namespace='##targetNamespace'"
     * @generated
     */
    Object getDAYOFMONTH();

    /**
     * Sets the value of the '{@link Powrmart.FILTERType#getDAYOFMONTH <em>DAYOFMONTH</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DAYOFMONTH</em>' attribute.
     * @see #getDAYOFMONTH()
     * @generated
     */
    void setDAYOFMONTH(Object value);

    /**
     * Returns the value of the '<em><b>OCCURRENCE</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.OCCURRENCEType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>OCCURRENCE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>OCCURRENCE</em>' attribute.
     * @see Powrmart.OCCURRENCEType
     * @see #isSetOCCURRENCE()
     * @see #unsetOCCURRENCE()
     * @see #setOCCURRENCE(OCCURRENCEType)
     * @see Powrmart.PowrmartPackage#getFILTERType_OCCURRENCE()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='OCCURRENCE' namespace='##targetNamespace'"
     * @generated
     */
    OCCURRENCEType getOCCURRENCE();

    /**
     * Sets the value of the '{@link Powrmart.FILTERType#getOCCURRENCE <em>OCCURRENCE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>OCCURRENCE</em>' attribute.
     * @see Powrmart.OCCURRENCEType
     * @see #isSetOCCURRENCE()
     * @see #unsetOCCURRENCE()
     * @see #getOCCURRENCE()
     * @generated
     */
    void setOCCURRENCE(OCCURRENCEType value);

    /**
     * Unsets the value of the '{@link Powrmart.FILTERType#getOCCURRENCE <em>OCCURRENCE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOCCURRENCE()
     * @see #getOCCURRENCE()
     * @see #setOCCURRENCE(OCCURRENCEType)
     * @generated
     */
    void unsetOCCURRENCE();

    /**
     * Returns whether the value of the '{@link Powrmart.FILTERType#getOCCURRENCE <em>OCCURRENCE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>OCCURRENCE</em>' attribute is set.
     * @see #unsetOCCURRENCE()
     * @see #getOCCURRENCE()
     * @see #setOCCURRENCE(OCCURRENCEType)
     * @generated
     */
    boolean isSetOCCURRENCE();

} // FILTERType
