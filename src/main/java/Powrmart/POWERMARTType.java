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
 * A representation of the model object '<em><b>POWERMART Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.POWERMARTType#getREPOSITORY <em>REPOSITORY</em>}</li>
 *   <li>{@link Powrmart.POWERMARTType#getCREATIONDATE <em>CREATIONDATE</em>}</li>
 *   <li>{@link Powrmart.POWERMARTType#getREPOSITORYVERSION <em>REPOSITORYVERSION</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getPOWERMARTType()
 * @model extendedMetaData="name='POWERMART_._type' kind='elementOnly'"
 * @generated
 */
public interface POWERMARTType extends EObject {
    /**
     * Returns the value of the '<em><b>REPOSITORY</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.REPOSITORYType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>REPOSITORY</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>REPOSITORY</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getPOWERMARTType_REPOSITORY()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='REPOSITORY' namespace='##targetNamespace'"
     * @generated
     */
    EList<REPOSITORYType> getREPOSITORY();

    /**
     * Returns the value of the '<em><b>CREATIONDATE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>CREATIONDATE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>CREATIONDATE</em>' attribute.
     * @see #setCREATIONDATE(Object)
     * @see Powrmart.PowrmartPackage#getPOWERMARTType_CREATIONDATE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='CREATION_DATE' namespace='##targetNamespace'"
     * @generated
     */
    Object getCREATIONDATE();

    /**
     * Sets the value of the '{@link Powrmart.POWERMARTType#getCREATIONDATE <em>CREATIONDATE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CREATIONDATE</em>' attribute.
     * @see #getCREATIONDATE()
     * @generated
     */
    void setCREATIONDATE(Object value);

    /**
     * Returns the value of the '<em><b>REPOSITORYVERSION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>REPOSITORYVERSION</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>REPOSITORYVERSION</em>' attribute.
     * @see #setREPOSITORYVERSION(Object)
     * @see Powrmart.PowrmartPackage#getPOWERMARTType_REPOSITORYVERSION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='REPOSITORY_VERSION' namespace='##targetNamespace'"
     * @generated
     */
    Object getREPOSITORYVERSION();

    /**
     * Sets the value of the '{@link Powrmart.POWERMARTType#getREPOSITORYVERSION <em>REPOSITORYVERSION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>REPOSITORYVERSION</em>' attribute.
     * @see #getREPOSITORYVERSION()
     * @generated
     */
    void setREPOSITORYVERSION(Object value);

} // POWERMARTType
