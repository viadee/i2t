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
 * A representation of the model object '<em><b>MAPPINGVARIABLE Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.MAPPINGVARIABLEType#getAGGFUNCTION <em>AGGFUNCTION</em>}</li>
 *   <li>{@link Powrmart.MAPPINGVARIABLEType#getDATATYPE <em>DATATYPE</em>}</li>
 *   <li>{@link Powrmart.MAPPINGVARIABLEType#getDEFAULTVALUE <em>DEFAULTVALUE</em>}</li>
 *   <li>{@link Powrmart.MAPPINGVARIABLEType#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.MAPPINGVARIABLEType#getISEXPRESSIONVARIABLE <em>ISEXPRESSIONVARIABLE</em>}</li>
 *   <li>{@link Powrmart.MAPPINGVARIABLEType#getISPARAM <em>ISPARAM</em>}</li>
 *   <li>{@link Powrmart.MAPPINGVARIABLEType#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.MAPPINGVARIABLEType#getPRECISION <em>PRECISION</em>}</li>
 *   <li>{@link Powrmart.MAPPINGVARIABLEType#getSCALE <em>SCALE</em>}</li>
 *   <li>{@link Powrmart.MAPPINGVARIABLEType#getUSERDEFINED <em>USERDEFINED</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getMAPPINGVARIABLEType()
 * @model extendedMetaData="name='MAPPINGVARIABLE_._type' kind='empty'"
 * @generated
 */
public interface MAPPINGVARIABLEType extends EObject {
    /**
     * Returns the value of the '<em><b>AGGFUNCTION</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.AGGFUNCTIONType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>AGGFUNCTION</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>AGGFUNCTION</em>' attribute.
     * @see Powrmart.AGGFUNCTIONType
     * @see #isSetAGGFUNCTION()
     * @see #unsetAGGFUNCTION()
     * @see #setAGGFUNCTION(AGGFUNCTIONType)
     * @see Powrmart.PowrmartPackage#getMAPPINGVARIABLEType_AGGFUNCTION()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='AGGFUNCTION' namespace='##targetNamespace'"
     * @generated
     */
    AGGFUNCTIONType getAGGFUNCTION();

    /**
     * Sets the value of the '{@link Powrmart.MAPPINGVARIABLEType#getAGGFUNCTION <em>AGGFUNCTION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>AGGFUNCTION</em>' attribute.
     * @see Powrmart.AGGFUNCTIONType
     * @see #isSetAGGFUNCTION()
     * @see #unsetAGGFUNCTION()
     * @see #getAGGFUNCTION()
     * @generated
     */
    void setAGGFUNCTION(AGGFUNCTIONType value);

    /**
     * Unsets the value of the '{@link Powrmart.MAPPINGVARIABLEType#getAGGFUNCTION <em>AGGFUNCTION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAGGFUNCTION()
     * @see #getAGGFUNCTION()
     * @see #setAGGFUNCTION(AGGFUNCTIONType)
     * @generated
     */
    void unsetAGGFUNCTION();

    /**
     * Returns whether the value of the '{@link Powrmart.MAPPINGVARIABLEType#getAGGFUNCTION <em>AGGFUNCTION</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>AGGFUNCTION</em>' attribute is set.
     * @see #unsetAGGFUNCTION()
     * @see #getAGGFUNCTION()
     * @see #setAGGFUNCTION(AGGFUNCTIONType)
     * @generated
     */
    boolean isSetAGGFUNCTION();

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
     * @see Powrmart.PowrmartPackage#getMAPPINGVARIABLEType_DATATYPE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='DATATYPE' namespace='##targetNamespace'"
     * @generated
     */
    Object getDATATYPE();

    /**
     * Sets the value of the '{@link Powrmart.MAPPINGVARIABLEType#getDATATYPE <em>DATATYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DATATYPE</em>' attribute.
     * @see #getDATATYPE()
     * @generated
     */
    void setDATATYPE(Object value);

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
     * @see Powrmart.PowrmartPackage#getMAPPINGVARIABLEType_DEFAULTVALUE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='DEFAULTVALUE' namespace='##targetNamespace'"
     * @generated
     */
    Object getDEFAULTVALUE();

    /**
     * Sets the value of the '{@link Powrmart.MAPPINGVARIABLEType#getDEFAULTVALUE <em>DEFAULTVALUE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DEFAULTVALUE</em>' attribute.
     * @see #getDEFAULTVALUE()
     * @generated
     */
    void setDEFAULTVALUE(Object value);

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
     * @see Powrmart.PowrmartPackage#getMAPPINGVARIABLEType_DESCRIPTION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='DESCRIPTION' namespace='##targetNamespace'"
     * @generated
     */
    Object getDESCRIPTION();

    /**
     * Sets the value of the '{@link Powrmart.MAPPINGVARIABLEType#getDESCRIPTION <em>DESCRIPTION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DESCRIPTION</em>' attribute.
     * @see #getDESCRIPTION()
     * @generated
     */
    void setDESCRIPTION(Object value);

    /**
     * Returns the value of the '<em><b>ISEXPRESSIONVARIABLE</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.ISEXPRESSIONVARIABLEType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ISEXPRESSIONVARIABLE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ISEXPRESSIONVARIABLE</em>' attribute.
     * @see Powrmart.ISEXPRESSIONVARIABLEType
     * @see #isSetISEXPRESSIONVARIABLE()
     * @see #unsetISEXPRESSIONVARIABLE()
     * @see #setISEXPRESSIONVARIABLE(ISEXPRESSIONVARIABLEType)
     * @see Powrmart.PowrmartPackage#getMAPPINGVARIABLEType_ISEXPRESSIONVARIABLE()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='ISEXPRESSIONVARIABLE' namespace='##targetNamespace'"
     * @generated
     */
    ISEXPRESSIONVARIABLEType getISEXPRESSIONVARIABLE();

    /**
     * Sets the value of the '{@link Powrmart.MAPPINGVARIABLEType#getISEXPRESSIONVARIABLE <em>ISEXPRESSIONVARIABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ISEXPRESSIONVARIABLE</em>' attribute.
     * @see Powrmart.ISEXPRESSIONVARIABLEType
     * @see #isSetISEXPRESSIONVARIABLE()
     * @see #unsetISEXPRESSIONVARIABLE()
     * @see #getISEXPRESSIONVARIABLE()
     * @generated
     */
    void setISEXPRESSIONVARIABLE(ISEXPRESSIONVARIABLEType value);

    /**
     * Unsets the value of the '{@link Powrmart.MAPPINGVARIABLEType#getISEXPRESSIONVARIABLE <em>ISEXPRESSIONVARIABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetISEXPRESSIONVARIABLE()
     * @see #getISEXPRESSIONVARIABLE()
     * @see #setISEXPRESSIONVARIABLE(ISEXPRESSIONVARIABLEType)
     * @generated
     */
    void unsetISEXPRESSIONVARIABLE();

    /**
     * Returns whether the value of the '{@link Powrmart.MAPPINGVARIABLEType#getISEXPRESSIONVARIABLE <em>ISEXPRESSIONVARIABLE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>ISEXPRESSIONVARIABLE</em>' attribute is set.
     * @see #unsetISEXPRESSIONVARIABLE()
     * @see #getISEXPRESSIONVARIABLE()
     * @see #setISEXPRESSIONVARIABLE(ISEXPRESSIONVARIABLEType)
     * @generated
     */
    boolean isSetISEXPRESSIONVARIABLE();

    /**
     * Returns the value of the '<em><b>ISPARAM</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.ISPARAMType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ISPARAM</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ISPARAM</em>' attribute.
     * @see Powrmart.ISPARAMType
     * @see #isSetISPARAM()
     * @see #unsetISPARAM()
     * @see #setISPARAM(ISPARAMType)
     * @see Powrmart.PowrmartPackage#getMAPPINGVARIABLEType_ISPARAM()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='ISPARAM' namespace='##targetNamespace'"
     * @generated
     */
    ISPARAMType getISPARAM();

    /**
     * Sets the value of the '{@link Powrmart.MAPPINGVARIABLEType#getISPARAM <em>ISPARAM</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ISPARAM</em>' attribute.
     * @see Powrmart.ISPARAMType
     * @see #isSetISPARAM()
     * @see #unsetISPARAM()
     * @see #getISPARAM()
     * @generated
     */
    void setISPARAM(ISPARAMType value);

    /**
     * Unsets the value of the '{@link Powrmart.MAPPINGVARIABLEType#getISPARAM <em>ISPARAM</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetISPARAM()
     * @see #getISPARAM()
     * @see #setISPARAM(ISPARAMType)
     * @generated
     */
    void unsetISPARAM();

    /**
     * Returns whether the value of the '{@link Powrmart.MAPPINGVARIABLEType#getISPARAM <em>ISPARAM</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>ISPARAM</em>' attribute is set.
     * @see #unsetISPARAM()
     * @see #getISPARAM()
     * @see #setISPARAM(ISPARAMType)
     * @generated
     */
    boolean isSetISPARAM();

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
     * @see Powrmart.PowrmartPackage#getMAPPINGVARIABLEType_NAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='NAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getNAME();

    /**
     * Sets the value of the '{@link Powrmart.MAPPINGVARIABLEType#getNAME <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NAME</em>' attribute.
     * @see #getNAME()
     * @generated
     */
    void setNAME(Object value);

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
     * @see Powrmart.PowrmartPackage#getMAPPINGVARIABLEType_PRECISION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='PRECISION' namespace='##targetNamespace'"
     * @generated
     */
    Object getPRECISION();

    /**
     * Sets the value of the '{@link Powrmart.MAPPINGVARIABLEType#getPRECISION <em>PRECISION</em>}' attribute.
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
     * @see Powrmart.PowrmartPackage#getMAPPINGVARIABLEType_SCALE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='SCALE' namespace='##targetNamespace'"
     * @generated
     */
    Object getSCALE();

    /**
     * Sets the value of the '{@link Powrmart.MAPPINGVARIABLEType#getSCALE <em>SCALE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SCALE</em>' attribute.
     * @see #getSCALE()
     * @generated
     */
    void setSCALE(Object value);

    /**
     * Returns the value of the '<em><b>USERDEFINED</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.USERDEFINEDType1}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>USERDEFINED</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>USERDEFINED</em>' attribute.
     * @see Powrmart.USERDEFINEDType1
     * @see #isSetUSERDEFINED()
     * @see #unsetUSERDEFINED()
     * @see #setUSERDEFINED(USERDEFINEDType1)
     * @see Powrmart.PowrmartPackage#getMAPPINGVARIABLEType_USERDEFINED()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='USERDEFINED' namespace='##targetNamespace'"
     * @generated
     */
    USERDEFINEDType1 getUSERDEFINED();

    /**
     * Sets the value of the '{@link Powrmart.MAPPINGVARIABLEType#getUSERDEFINED <em>USERDEFINED</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>USERDEFINED</em>' attribute.
     * @see Powrmart.USERDEFINEDType1
     * @see #isSetUSERDEFINED()
     * @see #unsetUSERDEFINED()
     * @see #getUSERDEFINED()
     * @generated
     */
    void setUSERDEFINED(USERDEFINEDType1 value);

    /**
     * Unsets the value of the '{@link Powrmart.MAPPINGVARIABLEType#getUSERDEFINED <em>USERDEFINED</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUSERDEFINED()
     * @see #getUSERDEFINED()
     * @see #setUSERDEFINED(USERDEFINEDType1)
     * @generated
     */
    void unsetUSERDEFINED();

    /**
     * Returns whether the value of the '{@link Powrmart.MAPPINGVARIABLEType#getUSERDEFINED <em>USERDEFINED</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>USERDEFINED</em>' attribute is set.
     * @see #unsetUSERDEFINED()
     * @see #getUSERDEFINED()
     * @see #setUSERDEFINED(USERDEFINEDType1)
     * @generated
     */
    boolean isSetUSERDEFINED();

} // MAPPINGVARIABLEType
