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
 * A representation of the model object '<em><b>VALUEPAIR Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.VALUEPAIRType#getCOMMENTS <em>COMMENTS</em>}</li>
 *   <li>{@link Powrmart.VALUEPAIRType#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.VALUEPAIRType#getREVERSEASSIGNMENT <em>REVERSEASSIGNMENT</em>}</li>
 *   <li>{@link Powrmart.VALUEPAIRType#getVALUE <em>VALUE</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getVALUEPAIRType()
 * @model extendedMetaData="name='VALUEPAIR_._type' kind='empty'"
 * @generated
 */
public interface VALUEPAIRType extends EObject {
    /**
     * Returns the value of the '<em><b>COMMENTS</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>COMMENTS</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>COMMENTS</em>' attribute.
     * @see #setCOMMENTS(Object)
     * @see Powrmart.PowrmartPackage#getVALUEPAIRType_COMMENTS()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='COMMENTS' namespace='##targetNamespace'"
     * @generated
     */
    Object getCOMMENTS();

    /**
     * Sets the value of the '{@link Powrmart.VALUEPAIRType#getCOMMENTS <em>COMMENTS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>COMMENTS</em>' attribute.
     * @see #getCOMMENTS()
     * @generated
     */
    void setCOMMENTS(Object value);

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
     * @see Powrmart.PowrmartPackage#getVALUEPAIRType_NAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='NAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getNAME();

    /**
     * Sets the value of the '{@link Powrmart.VALUEPAIRType#getNAME <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NAME</em>' attribute.
     * @see #getNAME()
     * @generated
     */
    void setNAME(Object value);

    /**
     * Returns the value of the '<em><b>REVERSEASSIGNMENT</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.REVERSEASSIGNMENTType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>REVERSEASSIGNMENT</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>REVERSEASSIGNMENT</em>' attribute.
     * @see Powrmart.REVERSEASSIGNMENTType
     * @see #isSetREVERSEASSIGNMENT()
     * @see #unsetREVERSEASSIGNMENT()
     * @see #setREVERSEASSIGNMENT(REVERSEASSIGNMENTType)
     * @see Powrmart.PowrmartPackage#getVALUEPAIRType_REVERSEASSIGNMENT()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='REVERSEASSIGNMENT' namespace='##targetNamespace'"
     * @generated
     */
    REVERSEASSIGNMENTType getREVERSEASSIGNMENT();

    /**
     * Sets the value of the '{@link Powrmart.VALUEPAIRType#getREVERSEASSIGNMENT <em>REVERSEASSIGNMENT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>REVERSEASSIGNMENT</em>' attribute.
     * @see Powrmart.REVERSEASSIGNMENTType
     * @see #isSetREVERSEASSIGNMENT()
     * @see #unsetREVERSEASSIGNMENT()
     * @see #getREVERSEASSIGNMENT()
     * @generated
     */
    void setREVERSEASSIGNMENT(REVERSEASSIGNMENTType value);

    /**
     * Unsets the value of the '{@link Powrmart.VALUEPAIRType#getREVERSEASSIGNMENT <em>REVERSEASSIGNMENT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetREVERSEASSIGNMENT()
     * @see #getREVERSEASSIGNMENT()
     * @see #setREVERSEASSIGNMENT(REVERSEASSIGNMENTType)
     * @generated
     */
    void unsetREVERSEASSIGNMENT();

    /**
     * Returns whether the value of the '{@link Powrmart.VALUEPAIRType#getREVERSEASSIGNMENT <em>REVERSEASSIGNMENT</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>REVERSEASSIGNMENT</em>' attribute is set.
     * @see #unsetREVERSEASSIGNMENT()
     * @see #getREVERSEASSIGNMENT()
     * @see #setREVERSEASSIGNMENT(REVERSEASSIGNMENTType)
     * @generated
     */
    boolean isSetREVERSEASSIGNMENT();

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
     * @see Powrmart.PowrmartPackage#getVALUEPAIRType_VALUE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='VALUE' namespace='##targetNamespace'"
     * @generated
     */
    Object getVALUE();

    /**
     * Sets the value of the '{@link Powrmart.VALUEPAIRType#getVALUE <em>VALUE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>VALUE</em>' attribute.
     * @see #getVALUE()
     * @generated
     */
    void setVALUE(Object value);

} // VALUEPAIRType
