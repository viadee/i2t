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
 * A representation of the model object '<em><b>EXPRMACRO Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.EXPRMACROType#getMACROARGUMENT <em>MACROARGUMENT</em>}</li>
 *   <li>{@link Powrmart.EXPRMACROType#getMACRODEPENDENCY <em>MACRODEPENDENCY</em>}</li>
 *   <li>{@link Powrmart.EXPRMACROType#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.EXPRMACROType#getEXPRESSION <em>EXPRESSION</em>}</li>
 *   <li>{@link Powrmart.EXPRMACROType#getMACROTYPE <em>MACROTYPE</em>}</li>
 *   <li>{@link Powrmart.EXPRMACROType#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.EXPRMACROType#getOBJECTVERSION <em>OBJECTVERSION</em>}</li>
 *   <li>{@link Powrmart.EXPRMACROType#getPROTOTYPE <em>PROTOTYPE</em>}</li>
 *   <li>{@link Powrmart.EXPRMACROType#getRETURNTYPE <em>RETURNTYPE</em>}</li>
 *   <li>{@link Powrmart.EXPRMACROType#getVERSIONNUMBER <em>VERSIONNUMBER</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getEXPRMACROType()
 * @model extendedMetaData="name='EXPRMACRO_._type' kind='elementOnly'"
 * @generated
 */
public interface EXPRMACROType extends EObject {
    /**
     * Returns the value of the '<em><b>MACROARGUMENT</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.MACROARGUMENTType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>MACROARGUMENT</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>MACROARGUMENT</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getEXPRMACROType_MACROARGUMENT()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='MACROARGUMENT' namespace='##targetNamespace'"
     * @generated
     */
    EList<MACROARGUMENTType> getMACROARGUMENT();

    /**
     * Returns the value of the '<em><b>MACRODEPENDENCY</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.MACRODEPENDENCYType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>MACRODEPENDENCY</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>MACRODEPENDENCY</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getEXPRMACROType_MACRODEPENDENCY()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='MACRODEPENDENCY' namespace='##targetNamespace'"
     * @generated
     */
    EList<MACRODEPENDENCYType> getMACRODEPENDENCY();

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
     * @see Powrmart.PowrmartPackage#getEXPRMACROType_DESCRIPTION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='DESCRIPTION' namespace='##targetNamespace'"
     * @generated
     */
    Object getDESCRIPTION();

    /**
     * Sets the value of the '{@link Powrmart.EXPRMACROType#getDESCRIPTION <em>DESCRIPTION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DESCRIPTION</em>' attribute.
     * @see #getDESCRIPTION()
     * @generated
     */
    void setDESCRIPTION(Object value);

    /**
     * Returns the value of the '<em><b>EXPRESSION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>EXPRESSION</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>EXPRESSION</em>' attribute.
     * @see #setEXPRESSION(Object)
     * @see Powrmart.PowrmartPackage#getEXPRMACROType_EXPRESSION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='EXPRESSION' namespace='##targetNamespace'"
     * @generated
     */
    Object getEXPRESSION();

    /**
     * Sets the value of the '{@link Powrmart.EXPRMACROType#getEXPRESSION <em>EXPRESSION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>EXPRESSION</em>' attribute.
     * @see #getEXPRESSION()
     * @generated
     */
    void setEXPRESSION(Object value);

    /**
     * Returns the value of the '<em><b>MACROTYPE</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.MACROTYPEType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>MACROTYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>MACROTYPE</em>' attribute.
     * @see Powrmart.MACROTYPEType
     * @see #isSetMACROTYPE()
     * @see #unsetMACROTYPE()
     * @see #setMACROTYPE(MACROTYPEType)
     * @see Powrmart.PowrmartPackage#getEXPRMACROType_MACROTYPE()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='MACROTYPE' namespace='##targetNamespace'"
     * @generated
     */
    MACROTYPEType getMACROTYPE();

    /**
     * Sets the value of the '{@link Powrmart.EXPRMACROType#getMACROTYPE <em>MACROTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>MACROTYPE</em>' attribute.
     * @see Powrmart.MACROTYPEType
     * @see #isSetMACROTYPE()
     * @see #unsetMACROTYPE()
     * @see #getMACROTYPE()
     * @generated
     */
    void setMACROTYPE(MACROTYPEType value);

    /**
     * Unsets the value of the '{@link Powrmart.EXPRMACROType#getMACROTYPE <em>MACROTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMACROTYPE()
     * @see #getMACROTYPE()
     * @see #setMACROTYPE(MACROTYPEType)
     * @generated
     */
    void unsetMACROTYPE();

    /**
     * Returns whether the value of the '{@link Powrmart.EXPRMACROType#getMACROTYPE <em>MACROTYPE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>MACROTYPE</em>' attribute is set.
     * @see #unsetMACROTYPE()
     * @see #getMACROTYPE()
     * @see #setMACROTYPE(MACROTYPEType)
     * @generated
     */
    boolean isSetMACROTYPE();

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
     * @see Powrmart.PowrmartPackage#getEXPRMACROType_NAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='NAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getNAME();

    /**
     * Sets the value of the '{@link Powrmart.EXPRMACROType#getNAME <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NAME</em>' attribute.
     * @see #getNAME()
     * @generated
     */
    void setNAME(Object value);

    /**
     * Returns the value of the '<em><b>OBJECTVERSION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>OBJECTVERSION</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>OBJECTVERSION</em>' attribute.
     * @see #setOBJECTVERSION(Object)
     * @see Powrmart.PowrmartPackage#getEXPRMACROType_OBJECTVERSION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='OBJECTVERSION' namespace='##targetNamespace'"
     * @generated
     */
    Object getOBJECTVERSION();

    /**
     * Sets the value of the '{@link Powrmart.EXPRMACROType#getOBJECTVERSION <em>OBJECTVERSION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>OBJECTVERSION</em>' attribute.
     * @see #getOBJECTVERSION()
     * @generated
     */
    void setOBJECTVERSION(Object value);

    /**
     * Returns the value of the '<em><b>PROTOTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PROTOTYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PROTOTYPE</em>' attribute.
     * @see #setPROTOTYPE(Object)
     * @see Powrmart.PowrmartPackage#getEXPRMACROType_PROTOTYPE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='PROTOTYPE' namespace='##targetNamespace'"
     * @generated
     */
    Object getPROTOTYPE();

    /**
     * Sets the value of the '{@link Powrmart.EXPRMACROType#getPROTOTYPE <em>PROTOTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PROTOTYPE</em>' attribute.
     * @see #getPROTOTYPE()
     * @generated
     */
    void setPROTOTYPE(Object value);

    /**
     * Returns the value of the '<em><b>RETURNTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>RETURNTYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>RETURNTYPE</em>' attribute.
     * @see #setRETURNTYPE(Object)
     * @see Powrmart.PowrmartPackage#getEXPRMACROType_RETURNTYPE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='RETURNTYPE' namespace='##targetNamespace'"
     * @generated
     */
    Object getRETURNTYPE();

    /**
     * Sets the value of the '{@link Powrmart.EXPRMACROType#getRETURNTYPE <em>RETURNTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>RETURNTYPE</em>' attribute.
     * @see #getRETURNTYPE()
     * @generated
     */
    void setRETURNTYPE(Object value);

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
     * @see Powrmart.PowrmartPackage#getEXPRMACROType_VERSIONNUMBER()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='VERSIONNUMBER' namespace='##targetNamespace'"
     * @generated
     */
    Object getVERSIONNUMBER();

    /**
     * Sets the value of the '{@link Powrmart.EXPRMACROType#getVERSIONNUMBER <em>VERSIONNUMBER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>VERSIONNUMBER</em>' attribute.
     * @see #getVERSIONNUMBER()
     * @generated
     */
    void setVERSIONNUMBER(Object value);

} // EXPRMACROType
