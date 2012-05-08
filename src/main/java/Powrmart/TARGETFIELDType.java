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
 * A representation of the model object '<em><b>TARGETFIELD Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.TARGETFIELDType#getFIELDATTRIBUTE <em>FIELDATTRIBUTE</em>}</li>
 *   <li>{@link Powrmart.TARGETFIELDType#getBUSINESSNAME <em>BUSINESSNAME</em>}</li>
 *   <li>{@link Powrmart.TARGETFIELDType#getDATATYPE <em>DATATYPE</em>}</li>
 *   <li>{@link Powrmart.TARGETFIELDType#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.TARGETFIELDType#getFIELDNUMBER <em>FIELDNUMBER</em>}</li>
 *   <li>{@link Powrmart.TARGETFIELDType#getGROUP <em>GROUP</em>}</li>
 *   <li>{@link Powrmart.TARGETFIELDType#getISFILENAMEFIELD <em>ISFILENAMEFIELD</em>}</li>
 *   <li>{@link Powrmart.TARGETFIELDType#getKEYTYPE <em>KEYTYPE</em>}</li>
 *   <li>{@link Powrmart.TARGETFIELDType#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.TARGETFIELDType#getNULLABLE <em>NULLABLE</em>}</li>
 *   <li>{@link Powrmart.TARGETFIELDType#getPICTURETEXT <em>PICTURETEXT</em>}</li>
 *   <li>{@link Powrmart.TARGETFIELDType#getPRECISION <em>PRECISION</em>}</li>
 *   <li>{@link Powrmart.TARGETFIELDType#getREFERENCEDFIELD <em>REFERENCEDFIELD</em>}</li>
 *   <li>{@link Powrmart.TARGETFIELDType#getREFERENCEDTABLE <em>REFERENCEDTABLE</em>}</li>
 *   <li>{@link Powrmart.TARGETFIELDType#getSCALE <em>SCALE</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getTARGETFIELDType()
 * @model extendedMetaData="name='TARGETFIELD_._type' kind='elementOnly'"
 * @generated
 */
public interface TARGETFIELDType extends EObject {
    /**
     * Returns the value of the '<em><b>FIELDATTRIBUTE</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.FIELDATTRIBUTEType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>FIELDATTRIBUTE</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>FIELDATTRIBUTE</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getTARGETFIELDType_FIELDATTRIBUTE()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='FIELDATTRIBUTE' namespace='##targetNamespace'"
     * @generated
     */
    EList<FIELDATTRIBUTEType> getFIELDATTRIBUTE();

    /**
     * Returns the value of the '<em><b>BUSINESSNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>BUSINESSNAME</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>BUSINESSNAME</em>' attribute.
     * @see #setBUSINESSNAME(Object)
     * @see Powrmart.PowrmartPackage#getTARGETFIELDType_BUSINESSNAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='BUSINESSNAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getBUSINESSNAME();

    /**
     * Sets the value of the '{@link Powrmart.TARGETFIELDType#getBUSINESSNAME <em>BUSINESSNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>BUSINESSNAME</em>' attribute.
     * @see #getBUSINESSNAME()
     * @generated
     */
    void setBUSINESSNAME(Object value);

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
     * @see Powrmart.PowrmartPackage#getTARGETFIELDType_DATATYPE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='DATATYPE' namespace='##targetNamespace'"
     * @generated
     */
    Object getDATATYPE();

    /**
     * Sets the value of the '{@link Powrmart.TARGETFIELDType#getDATATYPE <em>DATATYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DATATYPE</em>' attribute.
     * @see #getDATATYPE()
     * @generated
     */
    void setDATATYPE(Object value);

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
     * @see Powrmart.PowrmartPackage#getTARGETFIELDType_DESCRIPTION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='DESCRIPTION' namespace='##targetNamespace'"
     * @generated
     */
    Object getDESCRIPTION();

    /**
     * Sets the value of the '{@link Powrmart.TARGETFIELDType#getDESCRIPTION <em>DESCRIPTION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DESCRIPTION</em>' attribute.
     * @see #getDESCRIPTION()
     * @generated
     */
    void setDESCRIPTION(Object value);

    /**
     * Returns the value of the '<em><b>FIELDNUMBER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>FIELDNUMBER</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>FIELDNUMBER</em>' attribute.
     * @see #setFIELDNUMBER(Object)
     * @see Powrmart.PowrmartPackage#getTARGETFIELDType_FIELDNUMBER()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='FIELDNUMBER' namespace='##targetNamespace'"
     * @generated
     */
    Object getFIELDNUMBER();

    /**
     * Sets the value of the '{@link Powrmart.TARGETFIELDType#getFIELDNUMBER <em>FIELDNUMBER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>FIELDNUMBER</em>' attribute.
     * @see #getFIELDNUMBER()
     * @generated
     */
    void setFIELDNUMBER(Object value);

    /**
     * Returns the value of the '<em><b>GROUP</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>GROUP</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>GROUP</em>' attribute.
     * @see #setGROUP(Object)
     * @see Powrmart.PowrmartPackage#getTARGETFIELDType_GROUP()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='GROUP' namespace='##targetNamespace'"
     * @generated
     */
    Object getGROUP();

    /**
     * Sets the value of the '{@link Powrmart.TARGETFIELDType#getGROUP <em>GROUP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>GROUP</em>' attribute.
     * @see #getGROUP()
     * @generated
     */
    void setGROUP(Object value);

    /**
     * Returns the value of the '<em><b>ISFILENAMEFIELD</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.ISFILENAMEFIELDType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ISFILENAMEFIELD</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ISFILENAMEFIELD</em>' attribute.
     * @see Powrmart.ISFILENAMEFIELDType
     * @see #isSetISFILENAMEFIELD()
     * @see #unsetISFILENAMEFIELD()
     * @see #setISFILENAMEFIELD(ISFILENAMEFIELDType)
     * @see Powrmart.PowrmartPackage#getTARGETFIELDType_ISFILENAMEFIELD()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='ISFILENAMEFIELD' namespace='##targetNamespace'"
     * @generated
     */
    ISFILENAMEFIELDType getISFILENAMEFIELD();

    /**
     * Sets the value of the '{@link Powrmart.TARGETFIELDType#getISFILENAMEFIELD <em>ISFILENAMEFIELD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ISFILENAMEFIELD</em>' attribute.
     * @see Powrmart.ISFILENAMEFIELDType
     * @see #isSetISFILENAMEFIELD()
     * @see #unsetISFILENAMEFIELD()
     * @see #getISFILENAMEFIELD()
     * @generated
     */
    void setISFILENAMEFIELD(ISFILENAMEFIELDType value);

    /**
     * Unsets the value of the '{@link Powrmart.TARGETFIELDType#getISFILENAMEFIELD <em>ISFILENAMEFIELD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetISFILENAMEFIELD()
     * @see #getISFILENAMEFIELD()
     * @see #setISFILENAMEFIELD(ISFILENAMEFIELDType)
     * @generated
     */
    void unsetISFILENAMEFIELD();

    /**
     * Returns whether the value of the '{@link Powrmart.TARGETFIELDType#getISFILENAMEFIELD <em>ISFILENAMEFIELD</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>ISFILENAMEFIELD</em>' attribute is set.
     * @see #unsetISFILENAMEFIELD()
     * @see #getISFILENAMEFIELD()
     * @see #setISFILENAMEFIELD(ISFILENAMEFIELDType)
     * @generated
     */
    boolean isSetISFILENAMEFIELD();

    /**
     * Returns the value of the '<em><b>KEYTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>KEYTYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>KEYTYPE</em>' attribute.
     * @see #setKEYTYPE(Object)
     * @see Powrmart.PowrmartPackage#getTARGETFIELDType_KEYTYPE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='KEYTYPE' namespace='##targetNamespace'"
     * @generated
     */
    Object getKEYTYPE();

    /**
     * Sets the value of the '{@link Powrmart.TARGETFIELDType#getKEYTYPE <em>KEYTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>KEYTYPE</em>' attribute.
     * @see #getKEYTYPE()
     * @generated
     */
    void setKEYTYPE(Object value);

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
     * @see Powrmart.PowrmartPackage#getTARGETFIELDType_NAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='NAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getNAME();

    /**
     * Sets the value of the '{@link Powrmart.TARGETFIELDType#getNAME <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NAME</em>' attribute.
     * @see #getNAME()
     * @generated
     */
    void setNAME(Object value);

    /**
     * Returns the value of the '<em><b>NULLABLE</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.NULLABLEType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>NULLABLE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>NULLABLE</em>' attribute.
     * @see Powrmart.NULLABLEType
     * @see #isSetNULLABLE()
     * @see #unsetNULLABLE()
     * @see #setNULLABLE(NULLABLEType)
     * @see Powrmart.PowrmartPackage#getTARGETFIELDType_NULLABLE()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='NULLABLE' namespace='##targetNamespace'"
     * @generated
     */
    NULLABLEType getNULLABLE();

    /**
     * Sets the value of the '{@link Powrmart.TARGETFIELDType#getNULLABLE <em>NULLABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NULLABLE</em>' attribute.
     * @see Powrmart.NULLABLEType
     * @see #isSetNULLABLE()
     * @see #unsetNULLABLE()
     * @see #getNULLABLE()
     * @generated
     */
    void setNULLABLE(NULLABLEType value);

    /**
     * Unsets the value of the '{@link Powrmart.TARGETFIELDType#getNULLABLE <em>NULLABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNULLABLE()
     * @see #getNULLABLE()
     * @see #setNULLABLE(NULLABLEType)
     * @generated
     */
    void unsetNULLABLE();

    /**
     * Returns whether the value of the '{@link Powrmart.TARGETFIELDType#getNULLABLE <em>NULLABLE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>NULLABLE</em>' attribute is set.
     * @see #unsetNULLABLE()
     * @see #getNULLABLE()
     * @see #setNULLABLE(NULLABLEType)
     * @generated
     */
    boolean isSetNULLABLE();

    /**
     * Returns the value of the '<em><b>PICTURETEXT</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PICTURETEXT</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PICTURETEXT</em>' attribute.
     * @see #setPICTURETEXT(Object)
     * @see Powrmart.PowrmartPackage#getTARGETFIELDType_PICTURETEXT()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='PICTURETEXT' namespace='##targetNamespace'"
     * @generated
     */
    Object getPICTURETEXT();

    /**
     * Sets the value of the '{@link Powrmart.TARGETFIELDType#getPICTURETEXT <em>PICTURETEXT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PICTURETEXT</em>' attribute.
     * @see #getPICTURETEXT()
     * @generated
     */
    void setPICTURETEXT(Object value);

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
     * @see Powrmart.PowrmartPackage#getTARGETFIELDType_PRECISION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='PRECISION' namespace='##targetNamespace'"
     * @generated
     */
    Object getPRECISION();

    /**
     * Sets the value of the '{@link Powrmart.TARGETFIELDType#getPRECISION <em>PRECISION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PRECISION</em>' attribute.
     * @see #getPRECISION()
     * @generated
     */
    void setPRECISION(Object value);

    /**
     * Returns the value of the '<em><b>REFERENCEDFIELD</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>REFERENCEDFIELD</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>REFERENCEDFIELD</em>' attribute.
     * @see #setREFERENCEDFIELD(Object)
     * @see Powrmart.PowrmartPackage#getTARGETFIELDType_REFERENCEDFIELD()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='REFERENCEDFIELD' namespace='##targetNamespace'"
     * @generated
     */
    Object getREFERENCEDFIELD();

    /**
     * Sets the value of the '{@link Powrmart.TARGETFIELDType#getREFERENCEDFIELD <em>REFERENCEDFIELD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>REFERENCEDFIELD</em>' attribute.
     * @see #getREFERENCEDFIELD()
     * @generated
     */
    void setREFERENCEDFIELD(Object value);

    /**
     * Returns the value of the '<em><b>REFERENCEDTABLE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>REFERENCEDTABLE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>REFERENCEDTABLE</em>' attribute.
     * @see #setREFERENCEDTABLE(Object)
     * @see Powrmart.PowrmartPackage#getTARGETFIELDType_REFERENCEDTABLE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='REFERENCEDTABLE' namespace='##targetNamespace'"
     * @generated
     */
    Object getREFERENCEDTABLE();

    /**
     * Sets the value of the '{@link Powrmart.TARGETFIELDType#getREFERENCEDTABLE <em>REFERENCEDTABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>REFERENCEDTABLE</em>' attribute.
     * @see #getREFERENCEDTABLE()
     * @generated
     */
    void setREFERENCEDTABLE(Object value);

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
     * @see Powrmart.PowrmartPackage#getTARGETFIELDType_SCALE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='SCALE' namespace='##targetNamespace'"
     * @generated
     */
    Object getSCALE();

    /**
     * Sets the value of the '{@link Powrmart.TARGETFIELDType#getSCALE <em>SCALE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SCALE</em>' attribute.
     * @see #getSCALE()
     * @generated
     */
    void setSCALE(Object value);

} // TARGETFIELDType
