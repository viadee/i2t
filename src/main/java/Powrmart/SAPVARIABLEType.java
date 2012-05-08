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
 * A representation of the model object '<em><b>SAPVARIABLE Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.SAPVARIABLEType#getDATATYPE <em>DATATYPE</em>}</li>
 *   <li>{@link Powrmart.SAPVARIABLEType#getDEFAULTVALUE <em>DEFAULTVALUE</em>}</li>
 *   <li>{@link Powrmart.SAPVARIABLEType#getDSQINSTNAME <em>DSQINSTNAME</em>}</li>
 *   <li>{@link Powrmart.SAPVARIABLEType#getISOUTPUTPORT <em>ISOUTPUTPORT</em>}</li>
 *   <li>{@link Powrmart.SAPVARIABLEType#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.SAPVARIABLEType#getPRECISION <em>PRECISION</em>}</li>
 *   <li>{@link Powrmart.SAPVARIABLEType#getSCALE <em>SCALE</em>}</li>
 *   <li>{@link Powrmart.SAPVARIABLEType#getSUBTYPE <em>SUBTYPE</em>}</li>
 *   <li>{@link Powrmart.SAPVARIABLEType#getVARDEF <em>VARDEF</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getSAPVARIABLEType()
 * @model extendedMetaData="name='SAPVARIABLE_._type' kind='empty'"
 * @generated
 */
public interface SAPVARIABLEType extends EObject {
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
     * @see Powrmart.PowrmartPackage#getSAPVARIABLEType_DATATYPE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='DATATYPE' namespace='##targetNamespace'"
     * @generated
     */
    Object getDATATYPE();

    /**
     * Sets the value of the '{@link Powrmart.SAPVARIABLEType#getDATATYPE <em>DATATYPE</em>}' attribute.
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
     * @see Powrmart.PowrmartPackage#getSAPVARIABLEType_DEFAULTVALUE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='DEFAULTVALUE' namespace='##targetNamespace'"
     * @generated
     */
    Object getDEFAULTVALUE();

    /**
     * Sets the value of the '{@link Powrmart.SAPVARIABLEType#getDEFAULTVALUE <em>DEFAULTVALUE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DEFAULTVALUE</em>' attribute.
     * @see #getDEFAULTVALUE()
     * @generated
     */
    void setDEFAULTVALUE(Object value);

    /**
     * Returns the value of the '<em><b>DSQINSTNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DSQINSTNAME</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DSQINSTNAME</em>' attribute.
     * @see #setDSQINSTNAME(Object)
     * @see Powrmart.PowrmartPackage#getSAPVARIABLEType_DSQINSTNAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='DSQINSTNAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getDSQINSTNAME();

    /**
     * Sets the value of the '{@link Powrmart.SAPVARIABLEType#getDSQINSTNAME <em>DSQINSTNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DSQINSTNAME</em>' attribute.
     * @see #getDSQINSTNAME()
     * @generated
     */
    void setDSQINSTNAME(Object value);

    /**
     * Returns the value of the '<em><b>ISOUTPUTPORT</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.ISOUTPUTPORTType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ISOUTPUTPORT</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ISOUTPUTPORT</em>' attribute.
     * @see Powrmart.ISOUTPUTPORTType
     * @see #isSetISOUTPUTPORT()
     * @see #unsetISOUTPUTPORT()
     * @see #setISOUTPUTPORT(ISOUTPUTPORTType)
     * @see Powrmart.PowrmartPackage#getSAPVARIABLEType_ISOUTPUTPORT()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='ISOUTPUTPORT' namespace='##targetNamespace'"
     * @generated
     */
    ISOUTPUTPORTType getISOUTPUTPORT();

    /**
     * Sets the value of the '{@link Powrmart.SAPVARIABLEType#getISOUTPUTPORT <em>ISOUTPUTPORT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ISOUTPUTPORT</em>' attribute.
     * @see Powrmart.ISOUTPUTPORTType
     * @see #isSetISOUTPUTPORT()
     * @see #unsetISOUTPUTPORT()
     * @see #getISOUTPUTPORT()
     * @generated
     */
    void setISOUTPUTPORT(ISOUTPUTPORTType value);

    /**
     * Unsets the value of the '{@link Powrmart.SAPVARIABLEType#getISOUTPUTPORT <em>ISOUTPUTPORT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetISOUTPUTPORT()
     * @see #getISOUTPUTPORT()
     * @see #setISOUTPUTPORT(ISOUTPUTPORTType)
     * @generated
     */
    void unsetISOUTPUTPORT();

    /**
     * Returns whether the value of the '{@link Powrmart.SAPVARIABLEType#getISOUTPUTPORT <em>ISOUTPUTPORT</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>ISOUTPUTPORT</em>' attribute is set.
     * @see #unsetISOUTPUTPORT()
     * @see #getISOUTPUTPORT()
     * @see #setISOUTPUTPORT(ISOUTPUTPORTType)
     * @generated
     */
    boolean isSetISOUTPUTPORT();

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
     * @see Powrmart.PowrmartPackage#getSAPVARIABLEType_NAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='NAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getNAME();

    /**
     * Sets the value of the '{@link Powrmart.SAPVARIABLEType#getNAME <em>NAME</em>}' attribute.
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
     * @see Powrmart.PowrmartPackage#getSAPVARIABLEType_PRECISION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='PRECISION' namespace='##targetNamespace'"
     * @generated
     */
    Object getPRECISION();

    /**
     * Sets the value of the '{@link Powrmart.SAPVARIABLEType#getPRECISION <em>PRECISION</em>}' attribute.
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
     * @see Powrmart.PowrmartPackage#getSAPVARIABLEType_SCALE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='SCALE' namespace='##targetNamespace'"
     * @generated
     */
    Object getSCALE();

    /**
     * Sets the value of the '{@link Powrmart.SAPVARIABLEType#getSCALE <em>SCALE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SCALE</em>' attribute.
     * @see #getSCALE()
     * @generated
     */
    void setSCALE(Object value);

    /**
     * Returns the value of the '<em><b>SUBTYPE</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.SUBTYPEType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SUBTYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SUBTYPE</em>' attribute.
     * @see Powrmart.SUBTYPEType
     * @see #isSetSUBTYPE()
     * @see #unsetSUBTYPE()
     * @see #setSUBTYPE(SUBTYPEType)
     * @see Powrmart.PowrmartPackage#getSAPVARIABLEType_SUBTYPE()
     * @model unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='SUBTYPE' namespace='##targetNamespace'"
     * @generated
     */
    SUBTYPEType getSUBTYPE();

    /**
     * Sets the value of the '{@link Powrmart.SAPVARIABLEType#getSUBTYPE <em>SUBTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SUBTYPE</em>' attribute.
     * @see Powrmart.SUBTYPEType
     * @see #isSetSUBTYPE()
     * @see #unsetSUBTYPE()
     * @see #getSUBTYPE()
     * @generated
     */
    void setSUBTYPE(SUBTYPEType value);

    /**
     * Unsets the value of the '{@link Powrmart.SAPVARIABLEType#getSUBTYPE <em>SUBTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSUBTYPE()
     * @see #getSUBTYPE()
     * @see #setSUBTYPE(SUBTYPEType)
     * @generated
     */
    void unsetSUBTYPE();

    /**
     * Returns whether the value of the '{@link Powrmart.SAPVARIABLEType#getSUBTYPE <em>SUBTYPE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>SUBTYPE</em>' attribute is set.
     * @see #unsetSUBTYPE()
     * @see #getSUBTYPE()
     * @see #setSUBTYPE(SUBTYPEType)
     * @generated
     */
    boolean isSetSUBTYPE();

    /**
     * Returns the value of the '<em><b>VARDEF</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>VARDEF</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>VARDEF</em>' attribute.
     * @see #setVARDEF(Object)
     * @see Powrmart.PowrmartPackage#getSAPVARIABLEType_VARDEF()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='VARDEF' namespace='##targetNamespace'"
     * @generated
     */
    Object getVARDEF();

    /**
     * Sets the value of the '{@link Powrmart.SAPVARIABLEType#getVARDEF <em>VARDEF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>VARDEF</em>' attribute.
     * @see #getVARDEF()
     * @generated
     */
    void setVARDEF(Object value);

} // SAPVARIABLEType
