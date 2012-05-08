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
 * A representation of the model object '<em><b>CONNECTIONREFERENCE Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.CONNECTIONREFERENCEType#getATTRIBUTE <em>ATTRIBUTE</em>}</li>
 *   <li>{@link Powrmart.CONNECTIONREFERENCEType#getCNXREFNAME <em>CNXREFNAME</em>}</li>
 *   <li>{@link Powrmart.CONNECTIONREFERENCEType#getCOMPONENTVERSION <em>COMPONENTVERSION</em>}</li>
 *   <li>{@link Powrmart.CONNECTIONREFERENCEType#getCONNECTIONNAME <em>CONNECTIONNAME</em>}</li>
 *   <li>{@link Powrmart.CONNECTIONREFERENCEType#getCONNECTIONNUMBER <em>CONNECTIONNUMBER</em>}</li>
 *   <li>{@link Powrmart.CONNECTIONREFERENCEType#getCONNECTIONSUBTYPE <em>CONNECTIONSUBTYPE</em>}</li>
 *   <li>{@link Powrmart.CONNECTIONREFERENCEType#getCONNECTIONTYPE <em>CONNECTIONTYPE</em>}</li>
 *   <li>{@link Powrmart.CONNECTIONREFERENCEType#getPARTITIONNAME <em>PARTITIONNAME</em>}</li>
 *   <li>{@link Powrmart.CONNECTIONREFERENCEType#getVARIABLE <em>VARIABLE</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getCONNECTIONREFERENCEType()
 * @model extendedMetaData="name='CONNECTIONREFERENCE_._type' kind='elementOnly'"
 * @generated
 */
public interface CONNECTIONREFERENCEType extends EObject {
    /**
     * Returns the value of the '<em><b>ATTRIBUTE</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.ATTRIBUTEType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ATTRIBUTE</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ATTRIBUTE</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getCONNECTIONREFERENCEType_ATTRIBUTE()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='ATTRIBUTE' namespace='##targetNamespace'"
     * @generated
     */
    EList<ATTRIBUTEType> getATTRIBUTE();

    /**
     * Returns the value of the '<em><b>CNXREFNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>CNXREFNAME</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>CNXREFNAME</em>' attribute.
     * @see #setCNXREFNAME(Object)
     * @see Powrmart.PowrmartPackage#getCONNECTIONREFERENCEType_CNXREFNAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='CNXREFNAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getCNXREFNAME();

    /**
     * Sets the value of the '{@link Powrmart.CONNECTIONREFERENCEType#getCNXREFNAME <em>CNXREFNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CNXREFNAME</em>' attribute.
     * @see #getCNXREFNAME()
     * @generated
     */
    void setCNXREFNAME(Object value);

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
     * @see Powrmart.PowrmartPackage#getCONNECTIONREFERENCEType_COMPONENTVERSION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='COMPONENTVERSION' namespace='##targetNamespace'"
     * @generated
     */
    Object getCOMPONENTVERSION();

    /**
     * Sets the value of the '{@link Powrmart.CONNECTIONREFERENCEType#getCOMPONENTVERSION <em>COMPONENTVERSION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>COMPONENTVERSION</em>' attribute.
     * @see #getCOMPONENTVERSION()
     * @generated
     */
    void setCOMPONENTVERSION(Object value);

    /**
     * Returns the value of the '<em><b>CONNECTIONNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>CONNECTIONNAME</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>CONNECTIONNAME</em>' attribute.
     * @see #setCONNECTIONNAME(Object)
     * @see Powrmart.PowrmartPackage#getCONNECTIONREFERENCEType_CONNECTIONNAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='CONNECTIONNAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getCONNECTIONNAME();

    /**
     * Sets the value of the '{@link Powrmart.CONNECTIONREFERENCEType#getCONNECTIONNAME <em>CONNECTIONNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CONNECTIONNAME</em>' attribute.
     * @see #getCONNECTIONNAME()
     * @generated
     */
    void setCONNECTIONNAME(Object value);

    /**
     * Returns the value of the '<em><b>CONNECTIONNUMBER</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>CONNECTIONNUMBER</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>CONNECTIONNUMBER</em>' attribute.
     * @see #setCONNECTIONNUMBER(Object)
     * @see Powrmart.PowrmartPackage#getCONNECTIONREFERENCEType_CONNECTIONNUMBER()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='CONNECTIONNUMBER' namespace='##targetNamespace'"
     * @generated
     */
    Object getCONNECTIONNUMBER();

    /**
     * Sets the value of the '{@link Powrmart.CONNECTIONREFERENCEType#getCONNECTIONNUMBER <em>CONNECTIONNUMBER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CONNECTIONNUMBER</em>' attribute.
     * @see #getCONNECTIONNUMBER()
     * @generated
     */
    void setCONNECTIONNUMBER(Object value);

    /**
     * Returns the value of the '<em><b>CONNECTIONSUBTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>CONNECTIONSUBTYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>CONNECTIONSUBTYPE</em>' attribute.
     * @see #setCONNECTIONSUBTYPE(Object)
     * @see Powrmart.PowrmartPackage#getCONNECTIONREFERENCEType_CONNECTIONSUBTYPE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='CONNECTIONSUBTYPE' namespace='##targetNamespace'"
     * @generated
     */
    Object getCONNECTIONSUBTYPE();

    /**
     * Sets the value of the '{@link Powrmart.CONNECTIONREFERENCEType#getCONNECTIONSUBTYPE <em>CONNECTIONSUBTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CONNECTIONSUBTYPE</em>' attribute.
     * @see #getCONNECTIONSUBTYPE()
     * @generated
     */
    void setCONNECTIONSUBTYPE(Object value);

    /**
     * Returns the value of the '<em><b>CONNECTIONTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>CONNECTIONTYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>CONNECTIONTYPE</em>' attribute.
     * @see #setCONNECTIONTYPE(Object)
     * @see Powrmart.PowrmartPackage#getCONNECTIONREFERENCEType_CONNECTIONTYPE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='CONNECTIONTYPE' namespace='##targetNamespace'"
     * @generated
     */
    Object getCONNECTIONTYPE();

    /**
     * Sets the value of the '{@link Powrmart.CONNECTIONREFERENCEType#getCONNECTIONTYPE <em>CONNECTIONTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CONNECTIONTYPE</em>' attribute.
     * @see #getCONNECTIONTYPE()
     * @generated
     */
    void setCONNECTIONTYPE(Object value);

    /**
     * Returns the value of the '<em><b>PARTITIONNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PARTITIONNAME</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PARTITIONNAME</em>' attribute.
     * @see #setPARTITIONNAME(Object)
     * @see Powrmart.PowrmartPackage#getCONNECTIONREFERENCEType_PARTITIONNAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='PARTITIONNAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getPARTITIONNAME();

    /**
     * Sets the value of the '{@link Powrmart.CONNECTIONREFERENCEType#getPARTITIONNAME <em>PARTITIONNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PARTITIONNAME</em>' attribute.
     * @see #getPARTITIONNAME()
     * @generated
     */
    void setPARTITIONNAME(Object value);

    /**
     * Returns the value of the '<em><b>VARIABLE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>VARIABLE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>VARIABLE</em>' attribute.
     * @see #setVARIABLE(Object)
     * @see Powrmart.PowrmartPackage#getCONNECTIONREFERENCEType_VARIABLE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='VARIABLE' namespace='##targetNamespace'"
     * @generated
     */
    Object getVARIABLE();

    /**
     * Sets the value of the '{@link Powrmart.CONNECTIONREFERENCEType#getVARIABLE <em>VARIABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>VARIABLE</em>' attribute.
     * @see #getVARIABLE()
     * @generated
     */
    void setVARIABLE(Object value);

} // CONNECTIONREFERENCEType
