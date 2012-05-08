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
 * A representation of the model object '<em><b>REPOSITORY Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.REPOSITORYType#getFOLDER <em>FOLDER</em>}</li>
 *   <li>{@link Powrmart.REPOSITORYType#getCODEPAGE <em>CODEPAGE</em>}</li>
 *   <li>{@link Powrmart.REPOSITORYType#getDATABASETYPE <em>DATABASETYPE</em>}</li>
 *   <li>{@link Powrmart.REPOSITORYType#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.REPOSITORYType#getPARENTREPOSITORY <em>PARENTREPOSITORY</em>}</li>
 *   <li>{@link Powrmart.REPOSITORYType#getVERSION <em>VERSION</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getREPOSITORYType()
 * @model extendedMetaData="name='REPOSITORY_._type' kind='elementOnly'"
 * @generated
 */
public interface REPOSITORYType extends EObject {
    /**
     * Returns the value of the '<em><b>FOLDER</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.FOLDERType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>FOLDER</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>FOLDER</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getREPOSITORYType_FOLDER()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='FOLDER' namespace='##targetNamespace'"
     * @generated
     */
    EList<FOLDERType> getFOLDER();

    /**
     * Returns the value of the '<em><b>CODEPAGE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>CODEPAGE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>CODEPAGE</em>' attribute.
     * @see #setCODEPAGE(Object)
     * @see Powrmart.PowrmartPackage#getREPOSITORYType_CODEPAGE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='CODEPAGE' namespace='##targetNamespace'"
     * @generated
     */
    Object getCODEPAGE();

    /**
     * Sets the value of the '{@link Powrmart.REPOSITORYType#getCODEPAGE <em>CODEPAGE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CODEPAGE</em>' attribute.
     * @see #getCODEPAGE()
     * @generated
     */
    void setCODEPAGE(Object value);

    /**
     * Returns the value of the '<em><b>DATABASETYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DATABASETYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DATABASETYPE</em>' attribute.
     * @see #setDATABASETYPE(Object)
     * @see Powrmart.PowrmartPackage#getREPOSITORYType_DATABASETYPE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='DATABASETYPE' namespace='##targetNamespace'"
     * @generated
     */
    Object getDATABASETYPE();

    /**
     * Sets the value of the '{@link Powrmart.REPOSITORYType#getDATABASETYPE <em>DATABASETYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DATABASETYPE</em>' attribute.
     * @see #getDATABASETYPE()
     * @generated
     */
    void setDATABASETYPE(Object value);

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
     * @see Powrmart.PowrmartPackage#getREPOSITORYType_NAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='NAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getNAME();

    /**
     * Sets the value of the '{@link Powrmart.REPOSITORYType#getNAME <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NAME</em>' attribute.
     * @see #getNAME()
     * @generated
     */
    void setNAME(Object value);

    /**
     * Returns the value of the '<em><b>PARENTREPOSITORY</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PARENTREPOSITORY</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PARENTREPOSITORY</em>' attribute.
     * @see #setPARENTREPOSITORY(Object)
     * @see Powrmart.PowrmartPackage#getREPOSITORYType_PARENTREPOSITORY()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='PARENTREPOSITORY' namespace='##targetNamespace'"
     * @generated
     */
    Object getPARENTREPOSITORY();

    /**
     * Sets the value of the '{@link Powrmart.REPOSITORYType#getPARENTREPOSITORY <em>PARENTREPOSITORY</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PARENTREPOSITORY</em>' attribute.
     * @see #getPARENTREPOSITORY()
     * @generated
     */
    void setPARENTREPOSITORY(Object value);

    /**
     * Returns the value of the '<em><b>VERSION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>VERSION</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>VERSION</em>' attribute.
     * @see #setVERSION(Object)
     * @see Powrmart.PowrmartPackage#getREPOSITORYType_VERSION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='VERSION' namespace='##targetNamespace'"
     * @generated
     */
    Object getVERSION();

    /**
     * Sets the value of the '{@link Powrmart.REPOSITORYType#getVERSION <em>VERSION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>VERSION</em>' attribute.
     * @see #getVERSION()
     * @generated
     */
    void setVERSION(Object value);

} // REPOSITORYType
