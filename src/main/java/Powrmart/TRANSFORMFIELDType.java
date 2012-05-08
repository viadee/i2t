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
 * A representation of the model object '<em><b>TRANSFORMFIELD Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.TRANSFORMFIELDType#getTRANSFORMFIELDATTR <em>TRANSFORMFIELDATTR</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMFIELDType#getDATATYPE <em>DATATYPE</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMFIELDType#getDEFAULTVALUE <em>DEFAULTVALUE</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMFIELDType#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMFIELDType#getEXPRESSION <em>EXPRESSION</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMFIELDType#getEXPRESSIONDESCRIPTION <em>EXPRESSIONDESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMFIELDType#getEXPRESSIONTYPE <em>EXPRESSIONTYPE</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMFIELDType#getFIELDNUMBER <em>FIELDNUMBER</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMFIELDType#getGROUP <em>GROUP</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMFIELDType#getIGNOREINCOMPARE <em>IGNOREINCOMPARE</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMFIELDType#getIGNORENULLINPUTS <em>IGNORENULLINPUTS</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMFIELDType#getISSORTKEY <em>ISSORTKEY</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMFIELDType#getMAPPLETGROUP <em>MAPPLETGROUP</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMFIELDType#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMFIELDType#getOUTPUTGROUP <em>OUTPUTGROUP</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMFIELDType#getPICTURETEXT <em>PICTURETEXT</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMFIELDType#getPORTTYPE <em>PORTTYPE</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMFIELDType#getPRECISION <em>PRECISION</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMFIELDType#getREFFIELD <em>REFFIELD</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMFIELDType#getREFINSTANCETYPE <em>REFINSTANCETYPE</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMFIELDType#getREFSOURCEFIELD <em>REFSOURCEFIELD</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMFIELDType#getREFTRANSFORMATION <em>REFTRANSFORMATION</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMFIELDType#getSCALE <em>SCALE</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMFIELDType#getSEQUENCEGENERATORVALUE <em>SEQUENCEGENERATORVALUE</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMFIELDType#getSORTDIRECTION <em>SORTDIRECTION</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getTRANSFORMFIELDType()
 * @model extendedMetaData="name='TRANSFORMFIELD_._type' kind='elementOnly'"
 * @generated
 */
public interface TRANSFORMFIELDType extends EObject {
    /**
     * Returns the value of the '<em><b>TRANSFORMFIELDATTR</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.TRANSFORMFIELDATTRType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TRANSFORMFIELDATTR</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TRANSFORMFIELDATTR</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getTRANSFORMFIELDType_TRANSFORMFIELDATTR()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='TRANSFORMFIELDATTR' namespace='##targetNamespace'"
     * @generated
     */
    EList<TRANSFORMFIELDATTRType> getTRANSFORMFIELDATTR();

    /**
     * Returns the value of the '<em><b>NULLABLE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>NULLABLE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>NULLABLE</em>' attribute.
     * @see #setNULLABLE(Object)
     * @see Powrmart.PowrmartPackage#getTRANSFORMFIELDType_NULLABLE()
     * @model NULLABLE="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='NULLABLE' namespace='##targetNamespace'"
     * @generated
     */
    Object getNULLABLE();

    /**
     * Sets the value of the '{@link Powrmart.TRANSFORMFIELDType#getNULLABLE <em>NULLABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NULLABLE</em>' attribute.
     * @see #getNULLABLE()
     * @generated
     */
    void setNULLABLE(Object value);

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
     * @see Powrmart.PowrmartPackage#getTRANSFORMFIELDType_DATATYPE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='DATATYPE' namespace='##targetNamespace'"
     * @generated
     */
    Object getDATATYPE();

    /**
     * Sets the value of the '{@link Powrmart.TRANSFORMFIELDType#getDATATYPE <em>DATATYPE</em>}' attribute.
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
     * @see Powrmart.PowrmartPackage#getTRANSFORMFIELDType_DEFAULTVALUE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='DEFAULTVALUE' namespace='##targetNamespace'"
     * @generated
     */
    Object getDEFAULTVALUE();

    /**
     * Sets the value of the '{@link Powrmart.TRANSFORMFIELDType#getDEFAULTVALUE <em>DEFAULTVALUE</em>}' attribute.
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
     * @see Powrmart.PowrmartPackage#getTRANSFORMFIELDType_DESCRIPTION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='DESCRIPTION' namespace='##targetNamespace'"
     * @generated
     */
    Object getDESCRIPTION();

    /**
     * Sets the value of the '{@link Powrmart.TRANSFORMFIELDType#getDESCRIPTION <em>DESCRIPTION</em>}' attribute.
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
     * @see Powrmart.PowrmartPackage#getTRANSFORMFIELDType_EXPRESSION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='EXPRESSION' namespace='##targetNamespace'"
     * @generated
     */
    Object getEXPRESSION();

    /**
     * Sets the value of the '{@link Powrmart.TRANSFORMFIELDType#getEXPRESSION <em>EXPRESSION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>EXPRESSION</em>' attribute.
     * @see #getEXPRESSION()
     * @generated
     */
    void setEXPRESSION(Object value);

    /**
     * Returns the value of the '<em><b>EXPRESSIONDESCRIPTION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>EXPRESSIONDESCRIPTION</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>EXPRESSIONDESCRIPTION</em>' attribute.
     * @see #setEXPRESSIONDESCRIPTION(Object)
     * @see Powrmart.PowrmartPackage#getTRANSFORMFIELDType_EXPRESSIONDESCRIPTION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='EXPRESSION_DESCRIPTION' namespace='##targetNamespace'"
     * @generated
     */
    Object getEXPRESSIONDESCRIPTION();

    /**
     * Sets the value of the '{@link Powrmart.TRANSFORMFIELDType#getEXPRESSIONDESCRIPTION <em>EXPRESSIONDESCRIPTION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>EXPRESSIONDESCRIPTION</em>' attribute.
     * @see #getEXPRESSIONDESCRIPTION()
     * @generated
     */
    void setEXPRESSIONDESCRIPTION(Object value);

    /**
     * Returns the value of the '<em><b>EXPRESSIONTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>EXPRESSIONTYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>EXPRESSIONTYPE</em>' attribute.
     * @see #setEXPRESSIONTYPE(Object)
     * @see Powrmart.PowrmartPackage#getTRANSFORMFIELDType_EXPRESSIONTYPE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='EXPRESSIONTYPE' namespace='##targetNamespace'"
     * @generated
     */
    Object getEXPRESSIONTYPE();

    /**
     * Sets the value of the '{@link Powrmart.TRANSFORMFIELDType#getEXPRESSIONTYPE <em>EXPRESSIONTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>EXPRESSIONTYPE</em>' attribute.
     * @see #getEXPRESSIONTYPE()
     * @generated
     */
    void setEXPRESSIONTYPE(Object value);

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
     * @see Powrmart.PowrmartPackage#getTRANSFORMFIELDType_FIELDNUMBER()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='FIELDNUMBER' namespace='##targetNamespace'"
     * @generated
     */
    Object getFIELDNUMBER();

    /**
     * Sets the value of the '{@link Powrmart.TRANSFORMFIELDType#getFIELDNUMBER <em>FIELDNUMBER</em>}' attribute.
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
     * @see Powrmart.PowrmartPackage#getTRANSFORMFIELDType_GROUP()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='GROUP' namespace='##targetNamespace'"
     * @generated
     */
    Object getGROUP();

    /**
     * Sets the value of the '{@link Powrmart.TRANSFORMFIELDType#getGROUP <em>GROUP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>GROUP</em>' attribute.
     * @see #getGROUP()
     * @generated
     */
    void setGROUP(Object value);

    /**
     * Returns the value of the '<em><b>IGNOREINCOMPARE</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.IGNOREINCOMPAREType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>IGNOREINCOMPARE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>IGNOREINCOMPARE</em>' attribute.
     * @see Powrmart.IGNOREINCOMPAREType
     * @see #isSetIGNOREINCOMPARE()
     * @see #unsetIGNOREINCOMPARE()
     * @see #setIGNOREINCOMPARE(IGNOREINCOMPAREType)
     * @see Powrmart.PowrmartPackage#getTRANSFORMFIELDType_IGNOREINCOMPARE()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='IGNORE_IN_COMPARE' namespace='##targetNamespace'"
     * @generated
     */
    IGNOREINCOMPAREType getIGNOREINCOMPARE();

    /**
     * Sets the value of the '{@link Powrmart.TRANSFORMFIELDType#getIGNOREINCOMPARE <em>IGNOREINCOMPARE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>IGNOREINCOMPARE</em>' attribute.
     * @see Powrmart.IGNOREINCOMPAREType
     * @see #isSetIGNOREINCOMPARE()
     * @see #unsetIGNOREINCOMPARE()
     * @see #getIGNOREINCOMPARE()
     * @generated
     */
    void setIGNOREINCOMPARE(IGNOREINCOMPAREType value);

    /**
     * Unsets the value of the '{@link Powrmart.TRANSFORMFIELDType#getIGNOREINCOMPARE <em>IGNOREINCOMPARE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIGNOREINCOMPARE()
     * @see #getIGNOREINCOMPARE()
     * @see #setIGNOREINCOMPARE(IGNOREINCOMPAREType)
     * @generated
     */
    void unsetIGNOREINCOMPARE();

    /**
     * Returns whether the value of the '{@link Powrmart.TRANSFORMFIELDType#getIGNOREINCOMPARE <em>IGNOREINCOMPARE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>IGNOREINCOMPARE</em>' attribute is set.
     * @see #unsetIGNOREINCOMPARE()
     * @see #getIGNOREINCOMPARE()
     * @see #setIGNOREINCOMPARE(IGNOREINCOMPAREType)
     * @generated
     */
    boolean isSetIGNOREINCOMPARE();

    /**
     * Returns the value of the '<em><b>IGNORENULLINPUTS</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.IGNORENULLINPUTSType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>IGNORENULLINPUTS</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>IGNORENULLINPUTS</em>' attribute.
     * @see Powrmart.IGNORENULLINPUTSType
     * @see #isSetIGNORENULLINPUTS()
     * @see #unsetIGNORENULLINPUTS()
     * @see #setIGNORENULLINPUTS(IGNORENULLINPUTSType)
     * @see Powrmart.PowrmartPackage#getTRANSFORMFIELDType_IGNORENULLINPUTS()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='IGNORE_NULL_INPUTS' namespace='##targetNamespace'"
     * @generated
     */
    IGNORENULLINPUTSType getIGNORENULLINPUTS();

    /**
     * Sets the value of the '{@link Powrmart.TRANSFORMFIELDType#getIGNORENULLINPUTS <em>IGNORENULLINPUTS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>IGNORENULLINPUTS</em>' attribute.
     * @see Powrmart.IGNORENULLINPUTSType
     * @see #isSetIGNORENULLINPUTS()
     * @see #unsetIGNORENULLINPUTS()
     * @see #getIGNORENULLINPUTS()
     * @generated
     */
    void setIGNORENULLINPUTS(IGNORENULLINPUTSType value);

    /**
     * Unsets the value of the '{@link Powrmart.TRANSFORMFIELDType#getIGNORENULLINPUTS <em>IGNORENULLINPUTS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIGNORENULLINPUTS()
     * @see #getIGNORENULLINPUTS()
     * @see #setIGNORENULLINPUTS(IGNORENULLINPUTSType)
     * @generated
     */
    void unsetIGNORENULLINPUTS();

    /**
     * Returns whether the value of the '{@link Powrmart.TRANSFORMFIELDType#getIGNORENULLINPUTS <em>IGNORENULLINPUTS</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>IGNORENULLINPUTS</em>' attribute is set.
     * @see #unsetIGNORENULLINPUTS()
     * @see #getIGNORENULLINPUTS()
     * @see #setIGNORENULLINPUTS(IGNORENULLINPUTSType)
     * @generated
     */
    boolean isSetIGNORENULLINPUTS();

    /**
     * Returns the value of the '<em><b>ISSORTKEY</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.ISSORTKEYType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ISSORTKEY</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ISSORTKEY</em>' attribute.
     * @see Powrmart.ISSORTKEYType
     * @see #isSetISSORTKEY()
     * @see #unsetISSORTKEY()
     * @see #setISSORTKEY(ISSORTKEYType)
     * @see Powrmart.PowrmartPackage#getTRANSFORMFIELDType_ISSORTKEY()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='ISSORTKEY' namespace='##targetNamespace'"
     * @generated
     */
    ISSORTKEYType getISSORTKEY();

    /**
     * Sets the value of the '{@link Powrmart.TRANSFORMFIELDType#getISSORTKEY <em>ISSORTKEY</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ISSORTKEY</em>' attribute.
     * @see Powrmart.ISSORTKEYType
     * @see #isSetISSORTKEY()
     * @see #unsetISSORTKEY()
     * @see #getISSORTKEY()
     * @generated
     */
    void setISSORTKEY(ISSORTKEYType value);

    /**
     * Unsets the value of the '{@link Powrmart.TRANSFORMFIELDType#getISSORTKEY <em>ISSORTKEY</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetISSORTKEY()
     * @see #getISSORTKEY()
     * @see #setISSORTKEY(ISSORTKEYType)
     * @generated
     */
    void unsetISSORTKEY();

    /**
     * Returns whether the value of the '{@link Powrmart.TRANSFORMFIELDType#getISSORTKEY <em>ISSORTKEY</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>ISSORTKEY</em>' attribute is set.
     * @see #unsetISSORTKEY()
     * @see #getISSORTKEY()
     * @see #setISSORTKEY(ISSORTKEYType)
     * @generated
     */
    boolean isSetISSORTKEY();

    /**
     * Returns the value of the '<em><b>MAPPLETGROUP</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>MAPPLETGROUP</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>MAPPLETGROUP</em>' attribute.
     * @see #setMAPPLETGROUP(Object)
     * @see Powrmart.PowrmartPackage#getTRANSFORMFIELDType_MAPPLETGROUP()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='MAPPLETGROUP' namespace='##targetNamespace'"
     * @generated
     */
    Object getMAPPLETGROUP();

    /**
     * Sets the value of the '{@link Powrmart.TRANSFORMFIELDType#getMAPPLETGROUP <em>MAPPLETGROUP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>MAPPLETGROUP</em>' attribute.
     * @see #getMAPPLETGROUP()
     * @generated
     */
    void setMAPPLETGROUP(Object value);

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
     * @see Powrmart.PowrmartPackage#getTRANSFORMFIELDType_NAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='NAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getNAME();

    /**
     * Sets the value of the '{@link Powrmart.TRANSFORMFIELDType#getNAME <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NAME</em>' attribute.
     * @see #getNAME()
     * @generated
     */
    void setNAME(Object value);

    /**
     * Returns the value of the '<em><b>OUTPUTGROUP</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>OUTPUTGROUP</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>OUTPUTGROUP</em>' attribute.
     * @see #setOUTPUTGROUP(Object)
     * @see Powrmart.PowrmartPackage#getTRANSFORMFIELDType_OUTPUTGROUP()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='OUTPUTGROUP' namespace='##targetNamespace'"
     * @generated
     */
    Object getOUTPUTGROUP();

    /**
     * Sets the value of the '{@link Powrmart.TRANSFORMFIELDType#getOUTPUTGROUP <em>OUTPUTGROUP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>OUTPUTGROUP</em>' attribute.
     * @see #getOUTPUTGROUP()
     * @generated
     */
    void setOUTPUTGROUP(Object value);

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
     * @see Powrmart.PowrmartPackage#getTRANSFORMFIELDType_PICTURETEXT()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='PICTURETEXT' namespace='##targetNamespace'"
     * @generated
     */
    Object getPICTURETEXT();

    /**
     * Sets the value of the '{@link Powrmart.TRANSFORMFIELDType#getPICTURETEXT <em>PICTURETEXT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PICTURETEXT</em>' attribute.
     * @see #getPICTURETEXT()
     * @generated
     */
    void setPICTURETEXT(Object value);

    /**
     * Returns the value of the '<em><b>PORTTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PORTTYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PORTTYPE</em>' attribute.
     * @see #setPORTTYPE(Object)
     * @see Powrmart.PowrmartPackage#getTRANSFORMFIELDType_PORTTYPE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='PORTTYPE' namespace='##targetNamespace'"
     * @generated
     */
    Object getPORTTYPE();

    /**
     * Sets the value of the '{@link Powrmart.TRANSFORMFIELDType#getPORTTYPE <em>PORTTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PORTTYPE</em>' attribute.
     * @see #getPORTTYPE()
     * @generated
     */
    void setPORTTYPE(Object value);

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
     * @see Powrmart.PowrmartPackage#getTRANSFORMFIELDType_PRECISION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='PRECISION' namespace='##targetNamespace'"
     * @generated
     */
    Object getPRECISION();

    /**
     * Sets the value of the '{@link Powrmart.TRANSFORMFIELDType#getPRECISION <em>PRECISION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PRECISION</em>' attribute.
     * @see #getPRECISION()
     * @generated
     */
    void setPRECISION(Object value);

    /**
     * Returns the value of the '<em><b>REFFIELD</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>REFFIELD</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>REFFIELD</em>' attribute.
     * @see #setREFFIELD(Object)
     * @see Powrmart.PowrmartPackage#getTRANSFORMFIELDType_REFFIELD()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='REF_FIELD' namespace='##targetNamespace'"
     * @generated
     */
    Object getREFFIELD();

    /**
     * Sets the value of the '{@link Powrmart.TRANSFORMFIELDType#getREFFIELD <em>REFFIELD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>REFFIELD</em>' attribute.
     * @see #getREFFIELD()
     * @generated
     */
    void setREFFIELD(Object value);

    /**
     * Returns the value of the '<em><b>REFINSTANCETYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>REFINSTANCETYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>REFINSTANCETYPE</em>' attribute.
     * @see #setREFINSTANCETYPE(Object)
     * @see Powrmart.PowrmartPackage#getTRANSFORMFIELDType_REFINSTANCETYPE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='REF_INSTANCETYPE' namespace='##targetNamespace'"
     * @generated
     */
    Object getREFINSTANCETYPE();

    /**
     * Sets the value of the '{@link Powrmart.TRANSFORMFIELDType#getREFINSTANCETYPE <em>REFINSTANCETYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>REFINSTANCETYPE</em>' attribute.
     * @see #getREFINSTANCETYPE()
     * @generated
     */
    void setREFINSTANCETYPE(Object value);

    /**
     * Returns the value of the '<em><b>REFSOURCEFIELD</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>REFSOURCEFIELD</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>REFSOURCEFIELD</em>' attribute.
     * @see #setREFSOURCEFIELD(Object)
     * @see Powrmart.PowrmartPackage#getTRANSFORMFIELDType_REFSOURCEFIELD()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='REF_SOURCE_FIELD' namespace='##targetNamespace'"
     * @generated
     */
    Object getREFSOURCEFIELD();

    /**
     * Sets the value of the '{@link Powrmart.TRANSFORMFIELDType#getREFSOURCEFIELD <em>REFSOURCEFIELD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>REFSOURCEFIELD</em>' attribute.
     * @see #getREFSOURCEFIELD()
     * @generated
     */
    void setREFSOURCEFIELD(Object value);

    /**
     * Returns the value of the '<em><b>REFTRANSFORMATION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>REFTRANSFORMATION</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>REFTRANSFORMATION</em>' attribute.
     * @see #setREFTRANSFORMATION(Object)
     * @see Powrmart.PowrmartPackage#getTRANSFORMFIELDType_REFTRANSFORMATION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='REF_TRANSFORMATION' namespace='##targetNamespace'"
     * @generated
     */
    Object getREFTRANSFORMATION();

    /**
     * Sets the value of the '{@link Powrmart.TRANSFORMFIELDType#getREFTRANSFORMATION <em>REFTRANSFORMATION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>REFTRANSFORMATION</em>' attribute.
     * @see #getREFTRANSFORMATION()
     * @generated
     */
    void setREFTRANSFORMATION(Object value);

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
     * @see Powrmart.PowrmartPackage#getTRANSFORMFIELDType_SCALE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='SCALE' namespace='##targetNamespace'"
     * @generated
     */
    Object getSCALE();

    /**
     * Sets the value of the '{@link Powrmart.TRANSFORMFIELDType#getSCALE <em>SCALE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SCALE</em>' attribute.
     * @see #getSCALE()
     * @generated
     */
    void setSCALE(Object value);

    /**
     * Returns the value of the '<em><b>SEQUENCEGENERATORVALUE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SEQUENCEGENERATORVALUE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SEQUENCEGENERATORVALUE</em>' attribute.
     * @see #setSEQUENCEGENERATORVALUE(Object)
     * @see Powrmart.PowrmartPackage#getTRANSFORMFIELDType_SEQUENCEGENERATORVALUE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='SEQUENCE_GENERATOR_VALUE' namespace='##targetNamespace'"
     * @generated
     */
    Object getSEQUENCEGENERATORVALUE();

    /**
     * Sets the value of the '{@link Powrmart.TRANSFORMFIELDType#getSEQUENCEGENERATORVALUE <em>SEQUENCEGENERATORVALUE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SEQUENCEGENERATORVALUE</em>' attribute.
     * @see #getSEQUENCEGENERATORVALUE()
     * @generated
     */
    void setSEQUENCEGENERATORVALUE(Object value);

    /**
     * Returns the value of the '<em><b>SORTDIRECTION</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.SORTDIRECTIONType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SORTDIRECTION</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SORTDIRECTION</em>' attribute.
     * @see Powrmart.SORTDIRECTIONType
     * @see #isSetSORTDIRECTION()
     * @see #unsetSORTDIRECTION()
     * @see #setSORTDIRECTION(SORTDIRECTIONType)
     * @see Powrmart.PowrmartPackage#getTRANSFORMFIELDType_SORTDIRECTION()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='SORTDIRECTION' namespace='##targetNamespace'"
     * @generated
     */
    SORTDIRECTIONType getSORTDIRECTION();

    /**
     * Sets the value of the '{@link Powrmart.TRANSFORMFIELDType#getSORTDIRECTION <em>SORTDIRECTION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SORTDIRECTION</em>' attribute.
     * @see Powrmart.SORTDIRECTIONType
     * @see #isSetSORTDIRECTION()
     * @see #unsetSORTDIRECTION()
     * @see #getSORTDIRECTION()
     * @generated
     */
    void setSORTDIRECTION(SORTDIRECTIONType value);

    /**
     * Unsets the value of the '{@link Powrmart.TRANSFORMFIELDType#getSORTDIRECTION <em>SORTDIRECTION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSORTDIRECTION()
     * @see #getSORTDIRECTION()
     * @see #setSORTDIRECTION(SORTDIRECTIONType)
     * @generated
     */
    void unsetSORTDIRECTION();

    /**
     * Returns whether the value of the '{@link Powrmart.TRANSFORMFIELDType#getSORTDIRECTION <em>SORTDIRECTION</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>SORTDIRECTION</em>' attribute is set.
     * @see #unsetSORTDIRECTION()
     * @see #getSORTDIRECTION()
     * @see #setSORTDIRECTION(SORTDIRECTIONType)
     * @generated
     */
    boolean isSetSORTDIRECTION();

} // TRANSFORMFIELDType
