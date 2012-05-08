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
 * A representation of the model object '<em><b>SAPPROGRAMFLOWOBJECT Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.SAPPROGRAMFLOWOBJECTType#getSAPFUNCTIONINSTANCE <em>SAPFUNCTIONINSTANCE</em>}</li>
 *   <li>{@link Powrmart.SAPPROGRAMFLOWOBJECTType#getSAPCODEBLOCK <em>SAPCODEBLOCK</em>}</li>
 *   <li>{@link Powrmart.SAPPROGRAMFLOWOBJECTType#getDSQINSTNAME <em>DSQINSTNAME</em>}</li>
 *   <li>{@link Powrmart.SAPPROGRAMFLOWOBJECTType#getJOINBITMAP <em>JOINBITMAP</em>}</li>
 *   <li>{@link Powrmart.SAPPROGRAMFLOWOBJECTType#getORDER <em>ORDER</em>}</li>
 *   <li>{@link Powrmart.SAPPROGRAMFLOWOBJECTType#getREFDBDNAME <em>REFDBDNAME</em>}</li>
 *   <li>{@link Powrmart.SAPPROGRAMFLOWOBJECTType#getREFSOURCENAME <em>REFSOURCENAME</em>}</li>
 *   <li>{@link Powrmart.SAPPROGRAMFLOWOBJECTType#getREFSOURCEINSTNAME <em>REFSOURCEINSTNAME</em>}</li>
 *   <li>{@link Powrmart.SAPPROGRAMFLOWOBJECTType#getTYPE <em>TYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getSAPPROGRAMFLOWOBJECTType()
 * @model extendedMetaData="name='SAPPROGRAMFLOWOBJECT_._type' kind='elementOnly'"
 * @generated
 */
public interface SAPPROGRAMFLOWOBJECTType extends EObject {
    /**
     * Returns the value of the '<em><b>SAPFUNCTIONINSTANCE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SAPFUNCTIONINSTANCE</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SAPFUNCTIONINSTANCE</em>' containment reference.
     * @see #setSAPFUNCTIONINSTANCE(SAPFUNCTIONINSTANCEType)
     * @see Powrmart.PowrmartPackage#getSAPPROGRAMFLOWOBJECTType_SAPFUNCTIONINSTANCE()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='SAPFUNCTIONINSTANCE' namespace='##targetNamespace'"
     * @generated
     */
    SAPFUNCTIONINSTANCEType getSAPFUNCTIONINSTANCE();

    /**
     * Sets the value of the '{@link Powrmart.SAPPROGRAMFLOWOBJECTType#getSAPFUNCTIONINSTANCE <em>SAPFUNCTIONINSTANCE</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SAPFUNCTIONINSTANCE</em>' containment reference.
     * @see #getSAPFUNCTIONINSTANCE()
     * @generated
     */
    void setSAPFUNCTIONINSTANCE(SAPFUNCTIONINSTANCEType value);

    /**
     * Returns the value of the '<em><b>SAPCODEBLOCK</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SAPCODEBLOCK</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SAPCODEBLOCK</em>' containment reference.
     * @see #setSAPCODEBLOCK(SAPCODEBLOCKType)
     * @see Powrmart.PowrmartPackage#getSAPPROGRAMFLOWOBJECTType_SAPCODEBLOCK()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='SAPCODEBLOCK' namespace='##targetNamespace'"
     * @generated
     */
    SAPCODEBLOCKType getSAPCODEBLOCK();

    /**
     * Sets the value of the '{@link Powrmart.SAPPROGRAMFLOWOBJECTType#getSAPCODEBLOCK <em>SAPCODEBLOCK</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SAPCODEBLOCK</em>' containment reference.
     * @see #getSAPCODEBLOCK()
     * @generated
     */
    void setSAPCODEBLOCK(SAPCODEBLOCKType value);

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
     * @see Powrmart.PowrmartPackage#getSAPPROGRAMFLOWOBJECTType_DSQINSTNAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='DSQINSTNAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getDSQINSTNAME();

    /**
     * Sets the value of the '{@link Powrmart.SAPPROGRAMFLOWOBJECTType#getDSQINSTNAME <em>DSQINSTNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DSQINSTNAME</em>' attribute.
     * @see #getDSQINSTNAME()
     * @generated
     */
    void setDSQINSTNAME(Object value);

    /**
     * Returns the value of the '<em><b>JOINBITMAP</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>JOINBITMAP</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>JOINBITMAP</em>' attribute.
     * @see #setJOINBITMAP(Object)
     * @see Powrmart.PowrmartPackage#getSAPPROGRAMFLOWOBJECTType_JOINBITMAP()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='JOINBITMAP' namespace='##targetNamespace'"
     * @generated
     */
    Object getJOINBITMAP();

    /**
     * Sets the value of the '{@link Powrmart.SAPPROGRAMFLOWOBJECTType#getJOINBITMAP <em>JOINBITMAP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>JOINBITMAP</em>' attribute.
     * @see #getJOINBITMAP()
     * @generated
     */
    void setJOINBITMAP(Object value);

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
     * @see Powrmart.PowrmartPackage#getSAPPROGRAMFLOWOBJECTType_ORDER()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='ORDER' namespace='##targetNamespace'"
     * @generated
     */
    Object getORDER();

    /**
     * Sets the value of the '{@link Powrmart.SAPPROGRAMFLOWOBJECTType#getORDER <em>ORDER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ORDER</em>' attribute.
     * @see #getORDER()
     * @generated
     */
    void setORDER(Object value);

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
     * @see Powrmart.PowrmartPackage#getSAPPROGRAMFLOWOBJECTType_REFDBDNAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='REF_DBD_NAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getREFDBDNAME();

    /**
     * Sets the value of the '{@link Powrmart.SAPPROGRAMFLOWOBJECTType#getREFDBDNAME <em>REFDBDNAME</em>}' attribute.
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
     * @see Powrmart.PowrmartPackage#getSAPPROGRAMFLOWOBJECTType_REFSOURCENAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='REF_SOURCE_NAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getREFSOURCENAME();

    /**
     * Sets the value of the '{@link Powrmart.SAPPROGRAMFLOWOBJECTType#getREFSOURCENAME <em>REFSOURCENAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>REFSOURCENAME</em>' attribute.
     * @see #getREFSOURCENAME()
     * @generated
     */
    void setREFSOURCENAME(Object value);

    /**
     * Returns the value of the '<em><b>REFSOURCEINSTNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>REFSOURCEINSTNAME</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>REFSOURCEINSTNAME</em>' attribute.
     * @see #setREFSOURCEINSTNAME(Object)
     * @see Powrmart.PowrmartPackage#getSAPPROGRAMFLOWOBJECTType_REFSOURCEINSTNAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='REF_SOURCEINSTNAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getREFSOURCEINSTNAME();

    /**
     * Sets the value of the '{@link Powrmart.SAPPROGRAMFLOWOBJECTType#getREFSOURCEINSTNAME <em>REFSOURCEINSTNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>REFSOURCEINSTNAME</em>' attribute.
     * @see #getREFSOURCEINSTNAME()
     * @generated
     */
    void setREFSOURCEINSTNAME(Object value);

    /**
     * Returns the value of the '<em><b>TYPE</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.TYPEType4}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TYPE</em>' attribute.
     * @see Powrmart.TYPEType4
     * @see #isSetTYPE()
     * @see #unsetTYPE()
     * @see #setTYPE(TYPEType4)
     * @see Powrmart.PowrmartPackage#getSAPPROGRAMFLOWOBJECTType_TYPE()
     * @model unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='TYPE' namespace='##targetNamespace'"
     * @generated
     */
    TYPEType4 getTYPE();

    /**
     * Sets the value of the '{@link Powrmart.SAPPROGRAMFLOWOBJECTType#getTYPE <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TYPE</em>' attribute.
     * @see Powrmart.TYPEType4
     * @see #isSetTYPE()
     * @see #unsetTYPE()
     * @see #getTYPE()
     * @generated
     */
    void setTYPE(TYPEType4 value);

    /**
     * Unsets the value of the '{@link Powrmart.SAPPROGRAMFLOWOBJECTType#getTYPE <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTYPE()
     * @see #getTYPE()
     * @see #setTYPE(TYPEType4)
     * @generated
     */
    void unsetTYPE();

    /**
     * Returns whether the value of the '{@link Powrmart.SAPPROGRAMFLOWOBJECTType#getTYPE <em>TYPE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>TYPE</em>' attribute is set.
     * @see #unsetTYPE()
     * @see #getTYPE()
     * @see #setTYPE(TYPEType4)
     * @generated
     */
    boolean isSetTYPE();

} // SAPPROGRAMFLOWOBJECTType
