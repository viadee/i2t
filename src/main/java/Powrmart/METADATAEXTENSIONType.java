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
 * A representation of the model object '<em><b>METADATAEXTENSION Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.METADATAEXTENSIONType#getCOMPONENTVERSION <em>COMPONENTVERSION</em>}</li>
 *   <li>{@link Powrmart.METADATAEXTENSIONType#getDATATYPE <em>DATATYPE</em>}</li>
 *   <li>{@link Powrmart.METADATAEXTENSIONType#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.METADATAEXTENSIONType#getDOMAINNAME <em>DOMAINNAME</em>}</li>
 *   <li>{@link Powrmart.METADATAEXTENSIONType#getISCLIENTEDITABLE <em>ISCLIENTEDITABLE</em>}</li>
 *   <li>{@link Powrmart.METADATAEXTENSIONType#getISCLIENTVISIBLE <em>ISCLIENTVISIBLE</em>}</li>
 *   <li>{@link Powrmart.METADATAEXTENSIONType#getISREUSABLE <em>ISREUSABLE</em>}</li>
 *   <li>{@link Powrmart.METADATAEXTENSIONType#getISSHAREREAD <em>ISSHAREREAD</em>}</li>
 *   <li>{@link Powrmart.METADATAEXTENSIONType#getISSHAREWRITE <em>ISSHAREWRITE</em>}</li>
 *   <li>{@link Powrmart.METADATAEXTENSIONType#getMAXLENGTH <em>MAXLENGTH</em>}</li>
 *   <li>{@link Powrmart.METADATAEXTENSIONType#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.METADATAEXTENSIONType#getVALUE <em>VALUE</em>}</li>
 *   <li>{@link Powrmart.METADATAEXTENSIONType#getVENDORNAME <em>VENDORNAME</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getMETADATAEXTENSIONType()
 * @model extendedMetaData="name='METADATAEXTENSION_._type' kind='empty'"
 * @generated
 */
public interface METADATAEXTENSIONType extends EObject {
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
     * @see Powrmart.PowrmartPackage#getMETADATAEXTENSIONType_COMPONENTVERSION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='COMPONENTVERSION' namespace='##targetNamespace'"
     * @generated
     */
    Object getCOMPONENTVERSION();

    /**
     * Sets the value of the '{@link Powrmart.METADATAEXTENSIONType#getCOMPONENTVERSION <em>COMPONENTVERSION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>COMPONENTVERSION</em>' attribute.
     * @see #getCOMPONENTVERSION()
     * @generated
     */
    void setCOMPONENTVERSION(Object value);

    /**
     * Returns the value of the '<em><b>DATATYPE</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.DATATYPEType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DATATYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DATATYPE</em>' attribute.
     * @see Powrmart.DATATYPEType
     * @see #isSetDATATYPE()
     * @see #unsetDATATYPE()
     * @see #setDATATYPE(DATATYPEType)
     * @see Powrmart.PowrmartPackage#getMETADATAEXTENSIONType_DATATYPE()
     * @model unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='DATATYPE' namespace='##targetNamespace'"
     * @generated
     */
    DATATYPEType getDATATYPE();

    /**
     * Sets the value of the '{@link Powrmart.METADATAEXTENSIONType#getDATATYPE <em>DATATYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DATATYPE</em>' attribute.
     * @see Powrmart.DATATYPEType
     * @see #isSetDATATYPE()
     * @see #unsetDATATYPE()
     * @see #getDATATYPE()
     * @generated
     */
    void setDATATYPE(DATATYPEType value);

    /**
     * Unsets the value of the '{@link Powrmart.METADATAEXTENSIONType#getDATATYPE <em>DATATYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDATATYPE()
     * @see #getDATATYPE()
     * @see #setDATATYPE(DATATYPEType)
     * @generated
     */
    void unsetDATATYPE();

    /**
     * Returns whether the value of the '{@link Powrmart.METADATAEXTENSIONType#getDATATYPE <em>DATATYPE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>DATATYPE</em>' attribute is set.
     * @see #unsetDATATYPE()
     * @see #getDATATYPE()
     * @see #setDATATYPE(DATATYPEType)
     * @generated
     */
    boolean isSetDATATYPE();

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
     * @see Powrmart.PowrmartPackage#getMETADATAEXTENSIONType_DESCRIPTION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='DESCRIPTION' namespace='##targetNamespace'"
     * @generated
     */
    Object getDESCRIPTION();

    /**
     * Sets the value of the '{@link Powrmart.METADATAEXTENSIONType#getDESCRIPTION <em>DESCRIPTION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DESCRIPTION</em>' attribute.
     * @see #getDESCRIPTION()
     * @generated
     */
    void setDESCRIPTION(Object value);

    /**
     * Returns the value of the '<em><b>DOMAINNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DOMAINNAME</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DOMAINNAME</em>' attribute.
     * @see #setDOMAINNAME(Object)
     * @see Powrmart.PowrmartPackage#getMETADATAEXTENSIONType_DOMAINNAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='DOMAINNAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getDOMAINNAME();

    /**
     * Sets the value of the '{@link Powrmart.METADATAEXTENSIONType#getDOMAINNAME <em>DOMAINNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DOMAINNAME</em>' attribute.
     * @see #getDOMAINNAME()
     * @generated
     */
    void setDOMAINNAME(Object value);

    /**
     * Returns the value of the '<em><b>ISCLIENTEDITABLE</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.ISCLIENTEDITABLEType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ISCLIENTEDITABLE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ISCLIENTEDITABLE</em>' attribute.
     * @see Powrmart.ISCLIENTEDITABLEType
     * @see #isSetISCLIENTEDITABLE()
     * @see #unsetISCLIENTEDITABLE()
     * @see #setISCLIENTEDITABLE(ISCLIENTEDITABLEType)
     * @see Powrmart.PowrmartPackage#getMETADATAEXTENSIONType_ISCLIENTEDITABLE()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='ISCLIENTEDITABLE' namespace='##targetNamespace'"
     * @generated
     */
    ISCLIENTEDITABLEType getISCLIENTEDITABLE();

    /**
     * Sets the value of the '{@link Powrmart.METADATAEXTENSIONType#getISCLIENTEDITABLE <em>ISCLIENTEDITABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ISCLIENTEDITABLE</em>' attribute.
     * @see Powrmart.ISCLIENTEDITABLEType
     * @see #isSetISCLIENTEDITABLE()
     * @see #unsetISCLIENTEDITABLE()
     * @see #getISCLIENTEDITABLE()
     * @generated
     */
    void setISCLIENTEDITABLE(ISCLIENTEDITABLEType value);

    /**
     * Unsets the value of the '{@link Powrmart.METADATAEXTENSIONType#getISCLIENTEDITABLE <em>ISCLIENTEDITABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetISCLIENTEDITABLE()
     * @see #getISCLIENTEDITABLE()
     * @see #setISCLIENTEDITABLE(ISCLIENTEDITABLEType)
     * @generated
     */
    void unsetISCLIENTEDITABLE();

    /**
     * Returns whether the value of the '{@link Powrmart.METADATAEXTENSIONType#getISCLIENTEDITABLE <em>ISCLIENTEDITABLE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>ISCLIENTEDITABLE</em>' attribute is set.
     * @see #unsetISCLIENTEDITABLE()
     * @see #getISCLIENTEDITABLE()
     * @see #setISCLIENTEDITABLE(ISCLIENTEDITABLEType)
     * @generated
     */
    boolean isSetISCLIENTEDITABLE();

    /**
     * Returns the value of the '<em><b>ISCLIENTVISIBLE</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.ISCLIENTVISIBLEType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ISCLIENTVISIBLE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ISCLIENTVISIBLE</em>' attribute.
     * @see Powrmart.ISCLIENTVISIBLEType
     * @see #isSetISCLIENTVISIBLE()
     * @see #unsetISCLIENTVISIBLE()
     * @see #setISCLIENTVISIBLE(ISCLIENTVISIBLEType)
     * @see Powrmart.PowrmartPackage#getMETADATAEXTENSIONType_ISCLIENTVISIBLE()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='ISCLIENTVISIBLE' namespace='##targetNamespace'"
     * @generated
     */
    ISCLIENTVISIBLEType getISCLIENTVISIBLE();

    /**
     * Sets the value of the '{@link Powrmart.METADATAEXTENSIONType#getISCLIENTVISIBLE <em>ISCLIENTVISIBLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ISCLIENTVISIBLE</em>' attribute.
     * @see Powrmart.ISCLIENTVISIBLEType
     * @see #isSetISCLIENTVISIBLE()
     * @see #unsetISCLIENTVISIBLE()
     * @see #getISCLIENTVISIBLE()
     * @generated
     */
    void setISCLIENTVISIBLE(ISCLIENTVISIBLEType value);

    /**
     * Unsets the value of the '{@link Powrmart.METADATAEXTENSIONType#getISCLIENTVISIBLE <em>ISCLIENTVISIBLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetISCLIENTVISIBLE()
     * @see #getISCLIENTVISIBLE()
     * @see #setISCLIENTVISIBLE(ISCLIENTVISIBLEType)
     * @generated
     */
    void unsetISCLIENTVISIBLE();

    /**
     * Returns whether the value of the '{@link Powrmart.METADATAEXTENSIONType#getISCLIENTVISIBLE <em>ISCLIENTVISIBLE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>ISCLIENTVISIBLE</em>' attribute is set.
     * @see #unsetISCLIENTVISIBLE()
     * @see #getISCLIENTVISIBLE()
     * @see #setISCLIENTVISIBLE(ISCLIENTVISIBLEType)
     * @generated
     */
    boolean isSetISCLIENTVISIBLE();

    /**
     * Returns the value of the '<em><b>ISREUSABLE</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.ISREUSABLEType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ISREUSABLE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ISREUSABLE</em>' attribute.
     * @see Powrmart.ISREUSABLEType
     * @see #isSetISREUSABLE()
     * @see #unsetISREUSABLE()
     * @see #setISREUSABLE(ISREUSABLEType)
     * @see Powrmart.PowrmartPackage#getMETADATAEXTENSIONType_ISREUSABLE()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='ISREUSABLE' namespace='##targetNamespace'"
     * @generated
     */
    ISREUSABLEType getISREUSABLE();

    /**
     * Sets the value of the '{@link Powrmart.METADATAEXTENSIONType#getISREUSABLE <em>ISREUSABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ISREUSABLE</em>' attribute.
     * @see Powrmart.ISREUSABLEType
     * @see #isSetISREUSABLE()
     * @see #unsetISREUSABLE()
     * @see #getISREUSABLE()
     * @generated
     */
    void setISREUSABLE(ISREUSABLEType value);

    /**
     * Unsets the value of the '{@link Powrmart.METADATAEXTENSIONType#getISREUSABLE <em>ISREUSABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetISREUSABLE()
     * @see #getISREUSABLE()
     * @see #setISREUSABLE(ISREUSABLEType)
     * @generated
     */
    void unsetISREUSABLE();

    /**
     * Returns whether the value of the '{@link Powrmart.METADATAEXTENSIONType#getISREUSABLE <em>ISREUSABLE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>ISREUSABLE</em>' attribute is set.
     * @see #unsetISREUSABLE()
     * @see #getISREUSABLE()
     * @see #setISREUSABLE(ISREUSABLEType)
     * @generated
     */
    boolean isSetISREUSABLE();

    /**
     * Returns the value of the '<em><b>ISSHAREREAD</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.ISSHAREREADType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ISSHAREREAD</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ISSHAREREAD</em>' attribute.
     * @see Powrmart.ISSHAREREADType
     * @see #isSetISSHAREREAD()
     * @see #unsetISSHAREREAD()
     * @see #setISSHAREREAD(ISSHAREREADType)
     * @see Powrmart.PowrmartPackage#getMETADATAEXTENSIONType_ISSHAREREAD()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='ISSHAREREAD' namespace='##targetNamespace'"
     * @generated
     */
    ISSHAREREADType getISSHAREREAD();

    /**
     * Sets the value of the '{@link Powrmart.METADATAEXTENSIONType#getISSHAREREAD <em>ISSHAREREAD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ISSHAREREAD</em>' attribute.
     * @see Powrmart.ISSHAREREADType
     * @see #isSetISSHAREREAD()
     * @see #unsetISSHAREREAD()
     * @see #getISSHAREREAD()
     * @generated
     */
    void setISSHAREREAD(ISSHAREREADType value);

    /**
     * Unsets the value of the '{@link Powrmart.METADATAEXTENSIONType#getISSHAREREAD <em>ISSHAREREAD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetISSHAREREAD()
     * @see #getISSHAREREAD()
     * @see #setISSHAREREAD(ISSHAREREADType)
     * @generated
     */
    void unsetISSHAREREAD();

    /**
     * Returns whether the value of the '{@link Powrmart.METADATAEXTENSIONType#getISSHAREREAD <em>ISSHAREREAD</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>ISSHAREREAD</em>' attribute is set.
     * @see #unsetISSHAREREAD()
     * @see #getISSHAREREAD()
     * @see #setISSHAREREAD(ISSHAREREADType)
     * @generated
     */
    boolean isSetISSHAREREAD();

    /**
     * Returns the value of the '<em><b>ISSHAREWRITE</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.ISSHAREWRITEType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ISSHAREWRITE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ISSHAREWRITE</em>' attribute.
     * @see Powrmart.ISSHAREWRITEType
     * @see #isSetISSHAREWRITE()
     * @see #unsetISSHAREWRITE()
     * @see #setISSHAREWRITE(ISSHAREWRITEType)
     * @see Powrmart.PowrmartPackage#getMETADATAEXTENSIONType_ISSHAREWRITE()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='ISSHAREWRITE' namespace='##targetNamespace'"
     * @generated
     */
    ISSHAREWRITEType getISSHAREWRITE();

    /**
     * Sets the value of the '{@link Powrmart.METADATAEXTENSIONType#getISSHAREWRITE <em>ISSHAREWRITE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ISSHAREWRITE</em>' attribute.
     * @see Powrmart.ISSHAREWRITEType
     * @see #isSetISSHAREWRITE()
     * @see #unsetISSHAREWRITE()
     * @see #getISSHAREWRITE()
     * @generated
     */
    void setISSHAREWRITE(ISSHAREWRITEType value);

    /**
     * Unsets the value of the '{@link Powrmart.METADATAEXTENSIONType#getISSHAREWRITE <em>ISSHAREWRITE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetISSHAREWRITE()
     * @see #getISSHAREWRITE()
     * @see #setISSHAREWRITE(ISSHAREWRITEType)
     * @generated
     */
    void unsetISSHAREWRITE();

    /**
     * Returns whether the value of the '{@link Powrmart.METADATAEXTENSIONType#getISSHAREWRITE <em>ISSHAREWRITE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>ISSHAREWRITE</em>' attribute is set.
     * @see #unsetISSHAREWRITE()
     * @see #getISSHAREWRITE()
     * @see #setISSHAREWRITE(ISSHAREWRITEType)
     * @generated
     */
    boolean isSetISSHAREWRITE();

    /**
     * Returns the value of the '<em><b>MAXLENGTH</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>MAXLENGTH</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>MAXLENGTH</em>' attribute.
     * @see #setMAXLENGTH(Object)
     * @see Powrmart.PowrmartPackage#getMETADATAEXTENSIONType_MAXLENGTH()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='MAXLENGTH' namespace='##targetNamespace'"
     * @generated
     */
    Object getMAXLENGTH();

    /**
     * Sets the value of the '{@link Powrmart.METADATAEXTENSIONType#getMAXLENGTH <em>MAXLENGTH</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>MAXLENGTH</em>' attribute.
     * @see #getMAXLENGTH()
     * @generated
     */
    void setMAXLENGTH(Object value);

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
     * @see Powrmart.PowrmartPackage#getMETADATAEXTENSIONType_NAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='NAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getNAME();

    /**
     * Sets the value of the '{@link Powrmart.METADATAEXTENSIONType#getNAME <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NAME</em>' attribute.
     * @see #getNAME()
     * @generated
     */
    void setNAME(Object value);

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
     * @see Powrmart.PowrmartPackage#getMETADATAEXTENSIONType_VALUE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='VALUE' namespace='##targetNamespace'"
     * @generated
     */
    Object getVALUE();

    /**
     * Sets the value of the '{@link Powrmart.METADATAEXTENSIONType#getVALUE <em>VALUE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>VALUE</em>' attribute.
     * @see #getVALUE()
     * @generated
     */
    void setVALUE(Object value);

    /**
     * Returns the value of the '<em><b>VENDORNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>VENDORNAME</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>VENDORNAME</em>' attribute.
     * @see #setVENDORNAME(Object)
     * @see Powrmart.PowrmartPackage#getMETADATAEXTENSIONType_VENDORNAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='VENDORNAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getVENDORNAME();

    /**
     * Sets the value of the '{@link Powrmart.METADATAEXTENSIONType#getVENDORNAME <em>VENDORNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>VENDORNAME</em>' attribute.
     * @see #getVENDORNAME()
     * @generated
     */
    void setVENDORNAME(Object value);

} // METADATAEXTENSIONType
