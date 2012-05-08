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
 * A representation of the model object '<em><b>SOURCEFIELD Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.SOURCEFIELDType#getSOURCEFIELD <em>SOURCEFIELD</em>}</li>
 *   <li>{@link Powrmart.SOURCEFIELDType#getFIELDATTRIBUTE <em>FIELDATTRIBUTE</em>}</li>
 *   <li>{@link Powrmart.SOURCEFIELDType#getBUSINESSNAME <em>BUSINESSNAME</em>}</li>
 *   <li>{@link Powrmart.SOURCEFIELDType#getDATATYPE <em>DATATYPE</em>}</li>
 *   <li>{@link Powrmart.SOURCEFIELDType#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.SOURCEFIELDType#getFIELDNUMBER <em>FIELDNUMBER</em>}</li>
 *   <li>{@link Powrmart.SOURCEFIELDType#getFIELDTYPE <em>FIELDTYPE</em>}</li>
 *   <li>{@link Powrmart.SOURCEFIELDType#getGROUP <em>GROUP</em>}</li>
 *   <li>{@link Powrmart.SOURCEFIELDType#getHIDDEN <em>HIDDEN</em>}</li>
 *   <li>{@link Powrmart.SOURCEFIELDType#getKEYTYPE <em>KEYTYPE</em>}</li>
 *   <li>{@link Powrmart.SOURCEFIELDType#getLENGTH <em>LENGTH</em>}</li>
 *   <li>{@link Powrmart.SOURCEFIELDType#getLEVEL <em>LEVEL</em>}</li>
 *   <li>{@link Powrmart.SOURCEFIELDType#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.SOURCEFIELDType#getNULLABLE <em>NULLABLE</em>}</li>
 *   <li>{@link Powrmart.SOURCEFIELDType#getOCCURS <em>OCCURS</em>}</li>
 *   <li>{@link Powrmart.SOURCEFIELDType#getOFFSET <em>OFFSET</em>}</li>
 *   <li>{@link Powrmart.SOURCEFIELDType#getPHYSICALLENGTH <em>PHYSICALLENGTH</em>}</li>
 *   <li>{@link Powrmart.SOURCEFIELDType#getPHYSICALOFFSET <em>PHYSICALOFFSET</em>}</li>
 *   <li>{@link Powrmart.SOURCEFIELDType#getPICTURETEXT <em>PICTURETEXT</em>}</li>
 *   <li>{@link Powrmart.SOURCEFIELDType#getPRECISION <em>PRECISION</em>}</li>
 *   <li>{@link Powrmart.SOURCEFIELDType#getREDEFINES <em>REDEFINES</em>}</li>
 *   <li>{@link Powrmart.SOURCEFIELDType#getREFERENCEDDBD <em>REFERENCEDDBD</em>}</li>
 *   <li>{@link Powrmart.SOURCEFIELDType#getREFERENCEDFIELD <em>REFERENCEDFIELD</em>}</li>
 *   <li>{@link Powrmart.SOURCEFIELDType#getREFERENCEDTABLE <em>REFERENCEDTABLE</em>}</li>
 *   <li>{@link Powrmart.SOURCEFIELDType#getSCALE <em>SCALE</em>}</li>
 *   <li>{@link Powrmart.SOURCEFIELDType#getSHIFTSTATE <em>SHIFTSTATE</em>}</li>
 *   <li>{@link Powrmart.SOURCEFIELDType#getUSAGE <em>USAGE</em>}</li>
 *   <li>{@link Powrmart.SOURCEFIELDType#getUSAGEFLAGS <em>USAGEFLAGS</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getSOURCEFIELDType()
 * @model extendedMetaData="name='SOURCEFIELD_._type' kind='elementOnly'"
 * @generated
 */
public interface SOURCEFIELDType extends EObject {
    /**
     * Returns the value of the '<em><b>SOURCEFIELD</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.SOURCEFIELDType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SOURCEFIELD</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SOURCEFIELD</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getSOURCEFIELDType_SOURCEFIELD()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='SOURCEFIELD' namespace='##targetNamespace'"
     * @generated
     */
    EList<SOURCEFIELDType> getSOURCEFIELD();

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
     * @see Powrmart.PowrmartPackage#getSOURCEFIELDType_FIELDATTRIBUTE()
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
     * @see Powrmart.PowrmartPackage#getSOURCEFIELDType_BUSINESSNAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='BUSINESSNAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getBUSINESSNAME();

    /**
     * Sets the value of the '{@link Powrmart.SOURCEFIELDType#getBUSINESSNAME <em>BUSINESSNAME</em>}' attribute.
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
     * @see Powrmart.PowrmartPackage#getSOURCEFIELDType_DATATYPE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='DATATYPE' namespace='##targetNamespace'"
     * @generated
     */
    Object getDATATYPE();

    /**
     * Sets the value of the '{@link Powrmart.SOURCEFIELDType#getDATATYPE <em>DATATYPE</em>}' attribute.
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
     * @see Powrmart.PowrmartPackage#getSOURCEFIELDType_DESCRIPTION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='DESCRIPTION' namespace='##targetNamespace'"
     * @generated
     */
    Object getDESCRIPTION();

    /**
     * Sets the value of the '{@link Powrmart.SOURCEFIELDType#getDESCRIPTION <em>DESCRIPTION</em>}' attribute.
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
     * @see Powrmart.PowrmartPackage#getSOURCEFIELDType_FIELDNUMBER()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='FIELDNUMBER' namespace='##targetNamespace'"
     * @generated
     */
    Object getFIELDNUMBER();

    /**
     * Sets the value of the '{@link Powrmart.SOURCEFIELDType#getFIELDNUMBER <em>FIELDNUMBER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>FIELDNUMBER</em>' attribute.
     * @see #getFIELDNUMBER()
     * @generated
     */
    void setFIELDNUMBER(Object value);

    /**
     * Returns the value of the '<em><b>FIELDTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>FIELDTYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>FIELDTYPE</em>' attribute.
     * @see #setFIELDTYPE(Object)
     * @see Powrmart.PowrmartPackage#getSOURCEFIELDType_FIELDTYPE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='FIELDTYPE' namespace='##targetNamespace'"
     * @generated
     */
    Object getFIELDTYPE();

    /**
     * Sets the value of the '{@link Powrmart.SOURCEFIELDType#getFIELDTYPE <em>FIELDTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>FIELDTYPE</em>' attribute.
     * @see #getFIELDTYPE()
     * @generated
     */
    void setFIELDTYPE(Object value);

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
     * @see Powrmart.PowrmartPackage#getSOURCEFIELDType_GROUP()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='GROUP' namespace='##targetNamespace'"
     * @generated
     */
    Object getGROUP();

    /**
     * Sets the value of the '{@link Powrmart.SOURCEFIELDType#getGROUP <em>GROUP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>GROUP</em>' attribute.
     * @see #getGROUP()
     * @generated
     */
    void setGROUP(Object value);

    /**
     * Returns the value of the '<em><b>HIDDEN</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>HIDDEN</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>HIDDEN</em>' attribute.
     * @see #setHIDDEN(Object)
     * @see Powrmart.PowrmartPackage#getSOURCEFIELDType_HIDDEN()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='HIDDEN' namespace='##targetNamespace'"
     * @generated
     */
    Object getHIDDEN();

    /**
     * Sets the value of the '{@link Powrmart.SOURCEFIELDType#getHIDDEN <em>HIDDEN</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>HIDDEN</em>' attribute.
     * @see #getHIDDEN()
     * @generated
     */
    void setHIDDEN(Object value);

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
     * @see Powrmart.PowrmartPackage#getSOURCEFIELDType_KEYTYPE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='KEYTYPE' namespace='##targetNamespace'"
     * @generated
     */
    Object getKEYTYPE();

    /**
     * Sets the value of the '{@link Powrmart.SOURCEFIELDType#getKEYTYPE <em>KEYTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>KEYTYPE</em>' attribute.
     * @see #getKEYTYPE()
     * @generated
     */
    void setKEYTYPE(Object value);

    /**
     * Returns the value of the '<em><b>LENGTH</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>LENGTH</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>LENGTH</em>' attribute.
     * @see #setLENGTH(Object)
     * @see Powrmart.PowrmartPackage#getSOURCEFIELDType_LENGTH()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='LENGTH' namespace='##targetNamespace'"
     * @generated
     */
    Object getLENGTH();

    /**
     * Sets the value of the '{@link Powrmart.SOURCEFIELDType#getLENGTH <em>LENGTH</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>LENGTH</em>' attribute.
     * @see #getLENGTH()
     * @generated
     */
    void setLENGTH(Object value);

    /**
     * Returns the value of the '<em><b>LEVEL</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>LEVEL</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>LEVEL</em>' attribute.
     * @see #setLEVEL(Object)
     * @see Powrmart.PowrmartPackage#getSOURCEFIELDType_LEVEL()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='LEVEL' namespace='##targetNamespace'"
     * @generated
     */
    Object getLEVEL();

    /**
     * Sets the value of the '{@link Powrmart.SOURCEFIELDType#getLEVEL <em>LEVEL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>LEVEL</em>' attribute.
     * @see #getLEVEL()
     * @generated
     */
    void setLEVEL(Object value);

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
     * @see Powrmart.PowrmartPackage#getSOURCEFIELDType_NAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='NAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getNAME();

    /**
     * Sets the value of the '{@link Powrmart.SOURCEFIELDType#getNAME <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NAME</em>' attribute.
     * @see #getNAME()
     * @generated
     */
    void setNAME(Object value);

    /**
     * Returns the value of the '<em><b>NULLABLE</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.NULLABLEType1}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>NULLABLE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>NULLABLE</em>' attribute.
     * @see Powrmart.NULLABLEType1
     * @see #isSetNULLABLE()
     * @see #unsetNULLABLE()
     * @see #setNULLABLE(NULLABLEType1)
     * @see Powrmart.PowrmartPackage#getSOURCEFIELDType_NULLABLE()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='NULLABLE' namespace='##targetNamespace'"
     * @generated
     */
    NULLABLEType1 getNULLABLE();

    /**
     * Sets the value of the '{@link Powrmart.SOURCEFIELDType#getNULLABLE <em>NULLABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NULLABLE</em>' attribute.
     * @see Powrmart.NULLABLEType1
     * @see #isSetNULLABLE()
     * @see #unsetNULLABLE()
     * @see #getNULLABLE()
     * @generated
     */
    void setNULLABLE(NULLABLEType1 value);

    /**
     * Unsets the value of the '{@link Powrmart.SOURCEFIELDType#getNULLABLE <em>NULLABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNULLABLE()
     * @see #getNULLABLE()
     * @see #setNULLABLE(NULLABLEType1)
     * @generated
     */
    void unsetNULLABLE();

    /**
     * Returns whether the value of the '{@link Powrmart.SOURCEFIELDType#getNULLABLE <em>NULLABLE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>NULLABLE</em>' attribute is set.
     * @see #unsetNULLABLE()
     * @see #getNULLABLE()
     * @see #setNULLABLE(NULLABLEType1)
     * @generated
     */
    boolean isSetNULLABLE();

    /**
     * Returns the value of the '<em><b>OCCURS</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>OCCURS</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>OCCURS</em>' attribute.
     * @see #setOCCURS(Object)
     * @see Powrmart.PowrmartPackage#getSOURCEFIELDType_OCCURS()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='OCCURS' namespace='##targetNamespace'"
     * @generated
     */
    Object getOCCURS();

    /**
     * Sets the value of the '{@link Powrmart.SOURCEFIELDType#getOCCURS <em>OCCURS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>OCCURS</em>' attribute.
     * @see #getOCCURS()
     * @generated
     */
    void setOCCURS(Object value);

    /**
     * Returns the value of the '<em><b>OFFSET</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>OFFSET</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>OFFSET</em>' attribute.
     * @see #setOFFSET(Object)
     * @see Powrmart.PowrmartPackage#getSOURCEFIELDType_OFFSET()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='OFFSET' namespace='##targetNamespace'"
     * @generated
     */
    Object getOFFSET();

    /**
     * Sets the value of the '{@link Powrmart.SOURCEFIELDType#getOFFSET <em>OFFSET</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>OFFSET</em>' attribute.
     * @see #getOFFSET()
     * @generated
     */
    void setOFFSET(Object value);

    /**
     * Returns the value of the '<em><b>PHYSICALLENGTH</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PHYSICALLENGTH</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PHYSICALLENGTH</em>' attribute.
     * @see #setPHYSICALLENGTH(Object)
     * @see Powrmart.PowrmartPackage#getSOURCEFIELDType_PHYSICALLENGTH()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='PHYSICALLENGTH' namespace='##targetNamespace'"
     * @generated
     */
    Object getPHYSICALLENGTH();

    /**
     * Sets the value of the '{@link Powrmart.SOURCEFIELDType#getPHYSICALLENGTH <em>PHYSICALLENGTH</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PHYSICALLENGTH</em>' attribute.
     * @see #getPHYSICALLENGTH()
     * @generated
     */
    void setPHYSICALLENGTH(Object value);

    /**
     * Returns the value of the '<em><b>PHYSICALOFFSET</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PHYSICALOFFSET</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PHYSICALOFFSET</em>' attribute.
     * @see #setPHYSICALOFFSET(Object)
     * @see Powrmart.PowrmartPackage#getSOURCEFIELDType_PHYSICALOFFSET()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='PHYSICALOFFSET' namespace='##targetNamespace'"
     * @generated
     */
    Object getPHYSICALOFFSET();

    /**
     * Sets the value of the '{@link Powrmart.SOURCEFIELDType#getPHYSICALOFFSET <em>PHYSICALOFFSET</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PHYSICALOFFSET</em>' attribute.
     * @see #getPHYSICALOFFSET()
     * @generated
     */
    void setPHYSICALOFFSET(Object value);

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
     * @see Powrmart.PowrmartPackage#getSOURCEFIELDType_PICTURETEXT()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='PICTURETEXT' namespace='##targetNamespace'"
     * @generated
     */
    Object getPICTURETEXT();

    /**
     * Sets the value of the '{@link Powrmart.SOURCEFIELDType#getPICTURETEXT <em>PICTURETEXT</em>}' attribute.
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
     * @see Powrmart.PowrmartPackage#getSOURCEFIELDType_PRECISION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='PRECISION' namespace='##targetNamespace'"
     * @generated
     */
    Object getPRECISION();

    /**
     * Sets the value of the '{@link Powrmart.SOURCEFIELDType#getPRECISION <em>PRECISION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PRECISION</em>' attribute.
     * @see #getPRECISION()
     * @generated
     */
    void setPRECISION(Object value);

    /**
     * Returns the value of the '<em><b>REDEFINES</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>REDEFINES</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>REDEFINES</em>' attribute.
     * @see #setREDEFINES(Object)
     * @see Powrmart.PowrmartPackage#getSOURCEFIELDType_REDEFINES()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='REDEFINES' namespace='##targetNamespace'"
     * @generated
     */
    Object getREDEFINES();

    /**
     * Sets the value of the '{@link Powrmart.SOURCEFIELDType#getREDEFINES <em>REDEFINES</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>REDEFINES</em>' attribute.
     * @see #getREDEFINES()
     * @generated
     */
    void setREDEFINES(Object value);

    /**
     * Returns the value of the '<em><b>REFERENCEDDBD</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>REFERENCEDDBD</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>REFERENCEDDBD</em>' attribute.
     * @see #setREFERENCEDDBD(Object)
     * @see Powrmart.PowrmartPackage#getSOURCEFIELDType_REFERENCEDDBD()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='REFERENCEDDBD' namespace='##targetNamespace'"
     * @generated
     */
    Object getREFERENCEDDBD();

    /**
     * Sets the value of the '{@link Powrmart.SOURCEFIELDType#getREFERENCEDDBD <em>REFERENCEDDBD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>REFERENCEDDBD</em>' attribute.
     * @see #getREFERENCEDDBD()
     * @generated
     */
    void setREFERENCEDDBD(Object value);

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
     * @see Powrmart.PowrmartPackage#getSOURCEFIELDType_REFERENCEDFIELD()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='REFERENCEDFIELD' namespace='##targetNamespace'"
     * @generated
     */
    Object getREFERENCEDFIELD();

    /**
     * Sets the value of the '{@link Powrmart.SOURCEFIELDType#getREFERENCEDFIELD <em>REFERENCEDFIELD</em>}' attribute.
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
     * @see Powrmart.PowrmartPackage#getSOURCEFIELDType_REFERENCEDTABLE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='REFERENCEDTABLE' namespace='##targetNamespace'"
     * @generated
     */
    Object getREFERENCEDTABLE();

    /**
     * Sets the value of the '{@link Powrmart.SOURCEFIELDType#getREFERENCEDTABLE <em>REFERENCEDTABLE</em>}' attribute.
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
     * @see Powrmart.PowrmartPackage#getSOURCEFIELDType_SCALE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='SCALE' namespace='##targetNamespace'"
     * @generated
     */
    Object getSCALE();

    /**
     * Sets the value of the '{@link Powrmart.SOURCEFIELDType#getSCALE <em>SCALE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SCALE</em>' attribute.
     * @see #getSCALE()
     * @generated
     */
    void setSCALE(Object value);

    /**
     * Returns the value of the '<em><b>SHIFTSTATE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SHIFTSTATE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SHIFTSTATE</em>' attribute.
     * @see #setSHIFTSTATE(Object)
     * @see Powrmart.PowrmartPackage#getSOURCEFIELDType_SHIFTSTATE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='SHIFTSTATE' namespace='##targetNamespace'"
     * @generated
     */
    Object getSHIFTSTATE();

    /**
     * Sets the value of the '{@link Powrmart.SOURCEFIELDType#getSHIFTSTATE <em>SHIFTSTATE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SHIFTSTATE</em>' attribute.
     * @see #getSHIFTSTATE()
     * @generated
     */
    void setSHIFTSTATE(Object value);

    /**
     * Returns the value of the '<em><b>USAGE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>USAGE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>USAGE</em>' attribute.
     * @see #setUSAGE(Object)
     * @see Powrmart.PowrmartPackage#getSOURCEFIELDType_USAGE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='USAGE' namespace='##targetNamespace'"
     * @generated
     */
    Object getUSAGE();

    /**
     * Sets the value of the '{@link Powrmart.SOURCEFIELDType#getUSAGE <em>USAGE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>USAGE</em>' attribute.
     * @see #getUSAGE()
     * @generated
     */
    void setUSAGE(Object value);

    /**
     * Returns the value of the '<em><b>USAGEFLAGS</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>USAGEFLAGS</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>USAGEFLAGS</em>' attribute.
     * @see #setUSAGEFLAGS(Object)
     * @see Powrmart.PowrmartPackage#getSOURCEFIELDType_USAGEFLAGS()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='USAGE_FLAGS' namespace='##targetNamespace'"
     * @generated
     */
    Object getUSAGEFLAGS();

    /**
     * Sets the value of the '{@link Powrmart.SOURCEFIELDType#getUSAGEFLAGS <em>USAGEFLAGS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>USAGEFLAGS</em>' attribute.
     * @see #getUSAGEFLAGS()
     * @generated
     */
    void setUSAGEFLAGS(Object value);

} // SOURCEFIELDType
