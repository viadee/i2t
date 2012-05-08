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
 * A representation of the model object '<em><b>TRANSFORMATION Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.TRANSFORMATIONType#getGROUP <em>GROUP</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMATIONType#getSOURCEFIELD <em>SOURCEFIELD</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMATIONType#getTRANSFORMFIELD <em>TRANSFORMFIELD</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMATIONType#getTABLEATTRIBUTE <em>TABLEATTRIBUTE</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMATIONType#getINITPROP <em>INITPROP</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMATIONType#getMETADATAEXTENSION <em>METADATAEXTENSION</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMATIONType#getTRANSFORMFIELDATTRDEF <em>TRANSFORMFIELDATTRDEF</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMATIONType#getFIELDDEPENDENCY <em>FIELDDEPENDENCY</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMATIONType#getFLATFILE <em>FLATFILE</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMATIONType#getEXPRMACRODEPENDENCY <em>EXPRMACRODEPENDENCY</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMATIONType#getCOMPONENTVERSION <em>COMPONENTVERSION</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMATIONType#getCRCVALUE <em>CRCVALUE</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMATIONType#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMATIONType#getISVSAMNORMALIZER <em>ISVSAMNORMALIZER</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMATIONType#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMATIONType#getOBJECTVERSION <em>OBJECTVERSION</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMATIONType#getPARENT <em>PARENT</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMATIONType#getPARENTTYPE <em>PARENTTYPE</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMATIONType#getREFDBDNAME <em>REFDBDNAME</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMATIONType#getREFSOURCENAME <em>REFSOURCENAME</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMATIONType#getREUSABLE <em>REUSABLE</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMATIONType#getTEMPLATEID <em>TEMPLATEID</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMATIONType#getTEMPLATENAME <em>TEMPLATENAME</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMATIONType#getTYPE <em>TYPE</em>}</li>
 *   <li>{@link Powrmart.TRANSFORMATIONType#getVERSIONNUMBER <em>VERSIONNUMBER</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getTRANSFORMATIONType()
 * @model extendedMetaData="name='TRANSFORMATION_._type' kind='elementOnly'"
 * @generated
 */
public interface TRANSFORMATIONType extends EObject {
    /**
     * Returns the value of the '<em><b>GROUP</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.GROUPType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>GROUP</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>GROUP</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getTRANSFORMATIONType_GROUP()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='GROUP' namespace='##targetNamespace'"
     * @generated
     */
    EList<GROUPType> getGROUP();

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
     * @see Powrmart.PowrmartPackage#getTRANSFORMATIONType_SOURCEFIELD()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='SOURCEFIELD' namespace='##targetNamespace'"
     * @generated
     */
    EList<SOURCEFIELDType> getSOURCEFIELD();

    /**
     * Returns the value of the '<em><b>TRANSFORMFIELD</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.TRANSFORMFIELDType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TRANSFORMFIELD</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TRANSFORMFIELD</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getTRANSFORMATIONType_TRANSFORMFIELD()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='TRANSFORMFIELD' namespace='##targetNamespace'"
     * @generated
     */
    EList<TRANSFORMFIELDType> getTRANSFORMFIELD();

    /**
     * Returns the value of the '<em><b>TABLEATTRIBUTE</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.TABLEATTRIBUTEType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TABLEATTRIBUTE</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TABLEATTRIBUTE</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getTRANSFORMATIONType_TABLEATTRIBUTE()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='TABLEATTRIBUTE' namespace='##targetNamespace'"
     * @generated
     */
    EList<TABLEATTRIBUTEType> getTABLEATTRIBUTE();

    /**
     * Returns the value of the '<em><b>INITPROP</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.INITPROPType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>INITPROP</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>INITPROP</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getTRANSFORMATIONType_INITPROP()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='INITPROP' namespace='##targetNamespace'"
     * @generated
     */
    EList<INITPROPType> getINITPROP();

    /**
     * Returns the value of the '<em><b>METADATAEXTENSION</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.METADATAEXTENSIONType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>METADATAEXTENSION</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>METADATAEXTENSION</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getTRANSFORMATIONType_METADATAEXTENSION()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='METADATAEXTENSION' namespace='##targetNamespace'"
     * @generated
     */
    EList<METADATAEXTENSIONType> getMETADATAEXTENSION();

    /**
     * Returns the value of the '<em><b>TRANSFORMFIELDATTRDEF</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.TRANSFORMFIELDATTRDEFType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TRANSFORMFIELDATTRDEF</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TRANSFORMFIELDATTRDEF</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getTRANSFORMATIONType_TRANSFORMFIELDATTRDEF()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='TRANSFORMFIELDATTRDEF' namespace='##targetNamespace'"
     * @generated
     */
    EList<TRANSFORMFIELDATTRDEFType> getTRANSFORMFIELDATTRDEF();

    /**
     * Returns the value of the '<em><b>FIELDDEPENDENCY</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.FIELDDEPENDENCYType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>FIELDDEPENDENCY</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>FIELDDEPENDENCY</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getTRANSFORMATIONType_FIELDDEPENDENCY()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='FIELDDEPENDENCY' namespace='##targetNamespace'"
     * @generated
     */
    EList<FIELDDEPENDENCYType> getFIELDDEPENDENCY();

    /**
     * Returns the value of the '<em><b>FLATFILE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>FLATFILE</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>FLATFILE</em>' containment reference.
     * @see #setFLATFILE(FLATFILEType)
     * @see Powrmart.PowrmartPackage#getTRANSFORMATIONType_FLATFILE()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='FLATFILE' namespace='##targetNamespace'"
     * @generated
     */
    FLATFILEType getFLATFILE();

    /**
     * Sets the value of the '{@link Powrmart.TRANSFORMATIONType#getFLATFILE <em>FLATFILE</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>FLATFILE</em>' containment reference.
     * @see #getFLATFILE()
     * @generated
     */
    void setFLATFILE(FLATFILEType value);

    /**
     * Returns the value of the '<em><b>EXPRMACRODEPENDENCY</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.EXPRMACRODEPENDENCYType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>EXPRMACRODEPENDENCY</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>EXPRMACRODEPENDENCY</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getTRANSFORMATIONType_EXPRMACRODEPENDENCY()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='EXPRMACRODEPENDENCY' namespace='##targetNamespace'"
     * @generated
     */
    EList<EXPRMACRODEPENDENCYType> getEXPRMACRODEPENDENCY();

    /**
     * Returns the value of the '<em><b>COMPONENTVERSION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>COMPONENTVERSION</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>COMPONENTVERSION</em>' attribute.
     * @see #setCOMPONENTVERSION(Object)
     * @see Powrmart.PowrmartPackage#getTRANSFORMATIONType_COMPONENTVERSION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='COMPONENTVERSION' namespace='##targetNamespace'"
     * @generated
     */
    Object getCOMPONENTVERSION();

    /**
     * Sets the value of the '{@link Powrmart.TRANSFORMATIONType#getCOMPONENTVERSION <em>COMPONENTVERSION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>COMPONENTVERSION</em>' attribute.
     * @see #getCOMPONENTVERSION()
     * @generated
     */
    void setCOMPONENTVERSION(Object value);

    /**
     * Returns the value of the '<em><b>CRCVALUE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>CRCVALUE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>CRCVALUE</em>' attribute.
     * @see #setCRCVALUE(Object)
     * @see Powrmart.PowrmartPackage#getTRANSFORMATIONType_CRCVALUE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='CRCVALUE' namespace='##targetNamespace'"
     * @generated
     */
    Object getCRCVALUE();

    /**
     * Sets the value of the '{@link Powrmart.TRANSFORMATIONType#getCRCVALUE <em>CRCVALUE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CRCVALUE</em>' attribute.
     * @see #getCRCVALUE()
     * @generated
     */
    void setCRCVALUE(Object value);

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
     * @see Powrmart.PowrmartPackage#getTRANSFORMATIONType_DESCRIPTION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='DESCRIPTION' namespace='##targetNamespace'"
     * @generated
     */
    Object getDESCRIPTION();

    /**
     * Sets the value of the '{@link Powrmart.TRANSFORMATIONType#getDESCRIPTION <em>DESCRIPTION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DESCRIPTION</em>' attribute.
     * @see #getDESCRIPTION()
     * @generated
     */
    void setDESCRIPTION(Object value);

    /**
     * Returns the value of the '<em><b>ISVSAMNORMALIZER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ISVSAMNORMALIZER</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ISVSAMNORMALIZER</em>' attribute.
     * @see #setISVSAMNORMALIZER(Object)
     * @see Powrmart.PowrmartPackage#getTRANSFORMATIONType_ISVSAMNORMALIZER()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='ISVSAM_NORMALIZER' namespace='##targetNamespace'"
     * @generated
     */
    Object getISVSAMNORMALIZER();

    /**
     * Sets the value of the '{@link Powrmart.TRANSFORMATIONType#getISVSAMNORMALIZER <em>ISVSAMNORMALIZER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ISVSAMNORMALIZER</em>' attribute.
     * @see #getISVSAMNORMALIZER()
     * @generated
     */
    void setISVSAMNORMALIZER(Object value);

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
     * @see Powrmart.PowrmartPackage#getTRANSFORMATIONType_NAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='NAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getNAME();

    /**
     * Sets the value of the '{@link Powrmart.TRANSFORMATIONType#getNAME <em>NAME</em>}' attribute.
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
     * @see Powrmart.PowrmartPackage#getTRANSFORMATIONType_OBJECTVERSION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='OBJECTVERSION' namespace='##targetNamespace'"
     * @generated
     */
    Object getOBJECTVERSION();

    /**
     * Sets the value of the '{@link Powrmart.TRANSFORMATIONType#getOBJECTVERSION <em>OBJECTVERSION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>OBJECTVERSION</em>' attribute.
     * @see #getOBJECTVERSION()
     * @generated
     */
    void setOBJECTVERSION(Object value);

    /**
     * Returns the value of the '<em><b>PARENT</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PARENT</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PARENT</em>' attribute.
     * @see #setPARENT(Object)
     * @see Powrmart.PowrmartPackage#getTRANSFORMATIONType_PARENT()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='PARENT' namespace='##targetNamespace'"
     * @generated
     */
    Object getPARENT();

    /**
     * Sets the value of the '{@link Powrmart.TRANSFORMATIONType#getPARENT <em>PARENT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PARENT</em>' attribute.
     * @see #getPARENT()
     * @generated
     */
    void setPARENT(Object value);

    /**
     * Returns the value of the '<em><b>PARENTTYPE</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.PARENTTYPEType3}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PARENTTYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PARENTTYPE</em>' attribute.
     * @see Powrmart.PARENTTYPEType3
     * @see #isSetPARENTTYPE()
     * @see #unsetPARENTTYPE()
     * @see #setPARENTTYPE(PARENTTYPEType3)
     * @see Powrmart.PowrmartPackage#getTRANSFORMATIONType_PARENTTYPE()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='PARENT_TYPE' namespace='##targetNamespace'"
     * @generated
     */
    PARENTTYPEType3 getPARENTTYPE();

    /**
     * Sets the value of the '{@link Powrmart.TRANSFORMATIONType#getPARENTTYPE <em>PARENTTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PARENTTYPE</em>' attribute.
     * @see Powrmart.PARENTTYPEType3
     * @see #isSetPARENTTYPE()
     * @see #unsetPARENTTYPE()
     * @see #getPARENTTYPE()
     * @generated
     */
    void setPARENTTYPE(PARENTTYPEType3 value);

    /**
     * Unsets the value of the '{@link Powrmart.TRANSFORMATIONType#getPARENTTYPE <em>PARENTTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPARENTTYPE()
     * @see #getPARENTTYPE()
     * @see #setPARENTTYPE(PARENTTYPEType3)
     * @generated
     */
    void unsetPARENTTYPE();

    /**
     * Returns whether the value of the '{@link Powrmart.TRANSFORMATIONType#getPARENTTYPE <em>PARENTTYPE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>PARENTTYPE</em>' attribute is set.
     * @see #unsetPARENTTYPE()
     * @see #getPARENTTYPE()
     * @see #setPARENTTYPE(PARENTTYPEType3)
     * @generated
     */
    boolean isSetPARENTTYPE();

    /**
     * Returns the value of the '<em><b>REFDBDNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>REFDBDNAME</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>REFDBDNAME</em>' attribute.
     * @see #setREFDBDNAME(Object)
     * @see Powrmart.PowrmartPackage#getTRANSFORMATIONType_REFDBDNAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='REF_DBD_NAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getREFDBDNAME();

    /**
     * Sets the value of the '{@link Powrmart.TRANSFORMATIONType#getREFDBDNAME <em>REFDBDNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>REFDBDNAME</em>' attribute.
     * @see #getREFDBDNAME()
     * @generated
     */
    void setREFDBDNAME(Object value);

    /**
     * Returns the value of the '<em><b>REFSOURCENAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>REFSOURCENAME</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>REFSOURCENAME</em>' attribute.
     * @see #setREFSOURCENAME(Object)
     * @see Powrmart.PowrmartPackage#getTRANSFORMATIONType_REFSOURCENAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='REF_SOURCE_NAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getREFSOURCENAME();

    /**
     * Sets the value of the '{@link Powrmart.TRANSFORMATIONType#getREFSOURCENAME <em>REFSOURCENAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>REFSOURCENAME</em>' attribute.
     * @see #getREFSOURCENAME()
     * @generated
     */
    void setREFSOURCENAME(Object value);

    /**
     * Returns the value of the '<em><b>REUSABLE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>REUSABLE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>REUSABLE</em>' attribute.
     * @see #setREUSABLE(Object)
     * @see Powrmart.PowrmartPackage#getTRANSFORMATIONType_REUSABLE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='REUSABLE' namespace='##targetNamespace'"
     * @generated
     */
    Object getREUSABLE();

    /**
     * Sets the value of the '{@link Powrmart.TRANSFORMATIONType#getREUSABLE <em>REUSABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>REUSABLE</em>' attribute.
     * @see #getREUSABLE()
     * @generated
     */
    void setREUSABLE(Object value);

    /**
     * Returns the value of the '<em><b>TEMPLATEID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TEMPLATEID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TEMPLATEID</em>' attribute.
     * @see #setTEMPLATEID(Object)
     * @see Powrmart.PowrmartPackage#getTRANSFORMATIONType_TEMPLATEID()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='TEMPLATEID' namespace='##targetNamespace'"
     * @generated
     */
    Object getTEMPLATEID();

    /**
     * Sets the value of the '{@link Powrmart.TRANSFORMATIONType#getTEMPLATEID <em>TEMPLATEID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TEMPLATEID</em>' attribute.
     * @see #getTEMPLATEID()
     * @generated
     */
    void setTEMPLATEID(Object value);

    /**
     * Returns the value of the '<em><b>TEMPLATENAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TEMPLATENAME</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TEMPLATENAME</em>' attribute.
     * @see #setTEMPLATENAME(Object)
     * @see Powrmart.PowrmartPackage#getTRANSFORMATIONType_TEMPLATENAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='TEMPLATENAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getTEMPLATENAME();

    /**
     * Sets the value of the '{@link Powrmart.TRANSFORMATIONType#getTEMPLATENAME <em>TEMPLATENAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TEMPLATENAME</em>' attribute.
     * @see #getTEMPLATENAME()
     * @generated
     */
    void setTEMPLATENAME(Object value);

    /**
     * Returns the value of the '<em><b>TYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TYPE</em>' attribute.
     * @see #setTYPE(Object)
     * @see Powrmart.PowrmartPackage#getTRANSFORMATIONType_TYPE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='TYPE' namespace='##targetNamespace'"
     * @generated
     */
    Object getTYPE();

    /**
     * Sets the value of the '{@link Powrmart.TRANSFORMATIONType#getTYPE <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TYPE</em>' attribute.
     * @see #getTYPE()
     * @generated
     */
    void setTYPE(Object value);

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
     * @see Powrmart.PowrmartPackage#getTRANSFORMATIONType_VERSIONNUMBER()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='VERSIONNUMBER' namespace='##targetNamespace'"
     * @generated
     */
    Object getVERSIONNUMBER();

    /**
     * Sets the value of the '{@link Powrmart.TRANSFORMATIONType#getVERSIONNUMBER <em>VERSIONNUMBER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>VERSIONNUMBER</em>' attribute.
     * @see #getVERSIONNUMBER()
     * @generated
     */
    void setVERSIONNUMBER(Object value);

} // TRANSFORMATIONType
