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
 * A representation of the model object '<em><b>SAPFUNCPARAM Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.SAPFUNCPARAMType#getDATATYPE <em>DATATYPE</em>}</li>
 *   <li>{@link Powrmart.SAPFUNCPARAMType#getDEF <em>DEF</em>}</li>
 *   <li>{@link Powrmart.SAPFUNCPARAMType#getDEFAULTVALUE <em>DEFAULTVALUE</em>}</li>
 *   <li>{@link Powrmart.SAPFUNCPARAMType#getISOPTIONAL <em>ISOPTIONAL</em>}</li>
 *   <li>{@link Powrmart.SAPFUNCPARAMType#getISREFERENCE <em>ISREFERENCE</em>}</li>
 *   <li>{@link Powrmart.SAPFUNCPARAMType#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.SAPFUNCPARAMType#getORDER <em>ORDER</em>}</li>
 *   <li>{@link Powrmart.SAPFUNCPARAMType#getPRECISION <em>PRECISION</em>}</li>
 *   <li>{@link Powrmart.SAPFUNCPARAMType#getSCALE <em>SCALE</em>}</li>
 *   <li>{@link Powrmart.SAPFUNCPARAMType#getSUBTYPE <em>SUBTYPE</em>}</li>
 *   <li>{@link Powrmart.SAPFUNCPARAMType#getTYPE <em>TYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getSAPFUNCPARAMType()
 * @model extendedMetaData="name='SAPFUNCPARAM_._type' kind='empty'"
 * @generated
 */
public interface SAPFUNCPARAMType extends EObject {
    /**
     * Returns the value of the '<em><b>DATATYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DATATYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DATATYPE</em>' attribute.
     * @see #setDATATYPE(Object)
     * @see Powrmart.PowrmartPackage#getSAPFUNCPARAMType_DATATYPE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='DATATYPE' namespace='##targetNamespace'"
     * @generated
     */
    Object getDATATYPE();

    /**
     * Sets the value of the '{@link Powrmart.SAPFUNCPARAMType#getDATATYPE <em>DATATYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DATATYPE</em>' attribute.
     * @see #getDATATYPE()
     * @generated
     */
    void setDATATYPE(Object value);

    /**
     * Returns the value of the '<em><b>DEF</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DEF</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DEF</em>' attribute.
     * @see #setDEF(Object)
     * @see Powrmart.PowrmartPackage#getSAPFUNCPARAMType_DEF()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='DEF' namespace='##targetNamespace'"
     * @generated
     */
    Object getDEF();

    /**
     * Sets the value of the '{@link Powrmart.SAPFUNCPARAMType#getDEF <em>DEF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DEF</em>' attribute.
     * @see #getDEF()
     * @generated
     */
    void setDEF(Object value);

    /**
     * Returns the value of the '<em><b>DEFAULTVALUE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DEFAULTVALUE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DEFAULTVALUE</em>' attribute.
     * @see #setDEFAULTVALUE(Object)
     * @see Powrmart.PowrmartPackage#getSAPFUNCPARAMType_DEFAULTVALUE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='DEFAULTVALUE' namespace='##targetNamespace'"
     * @generated
     */
    Object getDEFAULTVALUE();

    /**
     * Sets the value of the '{@link Powrmart.SAPFUNCPARAMType#getDEFAULTVALUE <em>DEFAULTVALUE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DEFAULTVALUE</em>' attribute.
     * @see #getDEFAULTVALUE()
     * @generated
     */
    void setDEFAULTVALUE(Object value);

    /**
     * Returns the value of the '<em><b>ISOPTIONAL</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.ISOPTIONALType1}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ISOPTIONAL</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ISOPTIONAL</em>' attribute.
     * @see Powrmart.ISOPTIONALType1
     * @see #isSetISOPTIONAL()
     * @see #unsetISOPTIONAL()
     * @see #setISOPTIONAL(ISOPTIONALType1)
     * @see Powrmart.PowrmartPackage#getSAPFUNCPARAMType_ISOPTIONAL()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='ISOPTIONAL' namespace='##targetNamespace'"
     * @generated
     */
    ISOPTIONALType1 getISOPTIONAL();

    /**
     * Sets the value of the '{@link Powrmart.SAPFUNCPARAMType#getISOPTIONAL <em>ISOPTIONAL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ISOPTIONAL</em>' attribute.
     * @see Powrmart.ISOPTIONALType1
     * @see #isSetISOPTIONAL()
     * @see #unsetISOPTIONAL()
     * @see #getISOPTIONAL()
     * @generated
     */
    void setISOPTIONAL(ISOPTIONALType1 value);

    /**
     * Unsets the value of the '{@link Powrmart.SAPFUNCPARAMType#getISOPTIONAL <em>ISOPTIONAL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetISOPTIONAL()
     * @see #getISOPTIONAL()
     * @see #setISOPTIONAL(ISOPTIONALType1)
     * @generated
     */
    void unsetISOPTIONAL();

    /**
     * Returns whether the value of the '{@link Powrmart.SAPFUNCPARAMType#getISOPTIONAL <em>ISOPTIONAL</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>ISOPTIONAL</em>' attribute is set.
     * @see #unsetISOPTIONAL()
     * @see #getISOPTIONAL()
     * @see #setISOPTIONAL(ISOPTIONALType1)
     * @generated
     */
    boolean isSetISOPTIONAL();

    /**
     * Returns the value of the '<em><b>ISREFERENCE</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.ISREFERENCEType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ISREFERENCE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ISREFERENCE</em>' attribute.
     * @see Powrmart.ISREFERENCEType
     * @see #isSetISREFERENCE()
     * @see #unsetISREFERENCE()
     * @see #setISREFERENCE(ISREFERENCEType)
     * @see Powrmart.PowrmartPackage#getSAPFUNCPARAMType_ISREFERENCE()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='ISREFERENCE' namespace='##targetNamespace'"
     * @generated
     */
    ISREFERENCEType getISREFERENCE();

    /**
     * Sets the value of the '{@link Powrmart.SAPFUNCPARAMType#getISREFERENCE <em>ISREFERENCE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ISREFERENCE</em>' attribute.
     * @see Powrmart.ISREFERENCEType
     * @see #isSetISREFERENCE()
     * @see #unsetISREFERENCE()
     * @see #getISREFERENCE()
     * @generated
     */
    void setISREFERENCE(ISREFERENCEType value);

    /**
     * Unsets the value of the '{@link Powrmart.SAPFUNCPARAMType#getISREFERENCE <em>ISREFERENCE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetISREFERENCE()
     * @see #getISREFERENCE()
     * @see #setISREFERENCE(ISREFERENCEType)
     * @generated
     */
    void unsetISREFERENCE();

    /**
     * Returns whether the value of the '{@link Powrmart.SAPFUNCPARAMType#getISREFERENCE <em>ISREFERENCE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>ISREFERENCE</em>' attribute is set.
     * @see #unsetISREFERENCE()
     * @see #getISREFERENCE()
     * @see #setISREFERENCE(ISREFERENCEType)
     * @generated
     */
    boolean isSetISREFERENCE();

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
     * @see Powrmart.PowrmartPackage#getSAPFUNCPARAMType_NAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='NAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getNAME();

    /**
     * Sets the value of the '{@link Powrmart.SAPFUNCPARAMType#getNAME <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NAME</em>' attribute.
     * @see #getNAME()
     * @generated
     */
    void setNAME(Object value);

    /**
     * Returns the value of the '<em><b>ORDER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ORDER</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ORDER</em>' attribute.
     * @see #setORDER(Object)
     * @see Powrmart.PowrmartPackage#getSAPFUNCPARAMType_ORDER()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='ORDER' namespace='##targetNamespace'"
     * @generated
     */
    Object getORDER();

    /**
     * Sets the value of the '{@link Powrmart.SAPFUNCPARAMType#getORDER <em>ORDER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ORDER</em>' attribute.
     * @see #getORDER()
     * @generated
     */
    void setORDER(Object value);

    /**
     * Returns the value of the '<em><b>PRECISION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PRECISION</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PRECISION</em>' attribute.
     * @see #setPRECISION(Object)
     * @see Powrmart.PowrmartPackage#getSAPFUNCPARAMType_PRECISION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='PRECISION' namespace='##targetNamespace'"
     * @generated
     */
    Object getPRECISION();

    /**
     * Sets the value of the '{@link Powrmart.SAPFUNCPARAMType#getPRECISION <em>PRECISION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PRECISION</em>' attribute.
     * @see #getPRECISION()
     * @generated
     */
    void setPRECISION(Object value);

    /**
     * Returns the value of the '<em><b>SCALE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SCALE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SCALE</em>' attribute.
     * @see #setSCALE(Object)
     * @see Powrmart.PowrmartPackage#getSAPFUNCPARAMType_SCALE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='SCALE' namespace='##targetNamespace'"
     * @generated
     */
    Object getSCALE();

    /**
     * Sets the value of the '{@link Powrmart.SAPFUNCPARAMType#getSCALE <em>SCALE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SCALE</em>' attribute.
     * @see #getSCALE()
     * @generated
     */
    void setSCALE(Object value);

    /**
     * Returns the value of the '<em><b>SUBTYPE</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.SUBTYPEType1}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SUBTYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SUBTYPE</em>' attribute.
     * @see Powrmart.SUBTYPEType1
     * @see #isSetSUBTYPE()
     * @see #unsetSUBTYPE()
     * @see #setSUBTYPE(SUBTYPEType1)
     * @see Powrmart.PowrmartPackage#getSAPFUNCPARAMType_SUBTYPE()
     * @model unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='SUBTYPE' namespace='##targetNamespace'"
     * @generated
     */
    SUBTYPEType1 getSUBTYPE();

    /**
     * Sets the value of the '{@link Powrmart.SAPFUNCPARAMType#getSUBTYPE <em>SUBTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SUBTYPE</em>' attribute.
     * @see Powrmart.SUBTYPEType1
     * @see #isSetSUBTYPE()
     * @see #unsetSUBTYPE()
     * @see #getSUBTYPE()
     * @generated
     */
    void setSUBTYPE(SUBTYPEType1 value);

    /**
     * Unsets the value of the '{@link Powrmart.SAPFUNCPARAMType#getSUBTYPE <em>SUBTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSUBTYPE()
     * @see #getSUBTYPE()
     * @see #setSUBTYPE(SUBTYPEType1)
     * @generated
     */
    void unsetSUBTYPE();

    /**
     * Returns whether the value of the '{@link Powrmart.SAPFUNCPARAMType#getSUBTYPE <em>SUBTYPE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>SUBTYPE</em>' attribute is set.
     * @see #unsetSUBTYPE()
     * @see #getSUBTYPE()
     * @see #setSUBTYPE(SUBTYPEType1)
     * @generated
     */
    boolean isSetSUBTYPE();

    /**
     * Returns the value of the '<em><b>TYPE</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.TYPEType3}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TYPE</em>' attribute.
     * @see Powrmart.TYPEType3
     * @see #isSetTYPE()
     * @see #unsetTYPE()
     * @see #setTYPE(TYPEType3)
     * @see Powrmart.PowrmartPackage#getSAPFUNCPARAMType_TYPE()
     * @model unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='TYPE' namespace='##targetNamespace'"
     * @generated
     */
    TYPEType3 getTYPE();

    /**
     * Sets the value of the '{@link Powrmart.SAPFUNCPARAMType#getTYPE <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TYPE</em>' attribute.
     * @see Powrmart.TYPEType3
     * @see #isSetTYPE()
     * @see #unsetTYPE()
     * @see #getTYPE()
     * @generated
     */
    void setTYPE(TYPEType3 value);

    /**
     * Unsets the value of the '{@link Powrmart.SAPFUNCPARAMType#getTYPE <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTYPE()
     * @see #getTYPE()
     * @see #setTYPE(TYPEType3)
     * @generated
     */
    void unsetTYPE();

    /**
     * Returns whether the value of the '{@link Powrmart.SAPFUNCPARAMType#getTYPE <em>TYPE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>TYPE</em>' attribute is set.
     * @see #unsetTYPE()
     * @see #getTYPE()
     * @see #setTYPE(TYPEType3)
     * @generated
     */
    boolean isSetTYPE();

} // SAPFUNCPARAMType
