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
 * A representation of the model object '<em><b>SESSIONEXTENSION Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.SESSIONEXTENSIONType#getCONNECTIONREFERENCE <em>CONNECTIONREFERENCE</em>}</li>
 *   <li>{@link Powrmart.SESSIONEXTENSIONType#getATTRIBUTE <em>ATTRIBUTE</em>}</li>
 *   <li>{@link Powrmart.SESSIONEXTENSIONType#getCOMPONENTVERSION <em>COMPONENTVERSION</em>}</li>
 *   <li>{@link Powrmart.SESSIONEXTENSIONType#getDSQINSTNAME <em>DSQINSTNAME</em>}</li>
 *   <li>{@link Powrmart.SESSIONEXTENSIONType#getDSQINSTTYPE <em>DSQINSTTYPE</em>}</li>
 *   <li>{@link Powrmart.SESSIONEXTENSIONType#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.SESSIONEXTENSIONType#getSINSTANCENAME <em>SINSTANCENAME</em>}</li>
 *   <li>{@link Powrmart.SESSIONEXTENSIONType#getSUBTYPE <em>SUBTYPE</em>}</li>
 *   <li>{@link Powrmart.SESSIONEXTENSIONType#getTRANSFORMATIONTYPE <em>TRANSFORMATIONTYPE</em>}</li>
 *   <li>{@link Powrmart.SESSIONEXTENSIONType#getTYPE <em>TYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getSESSIONEXTENSIONType()
 * @model extendedMetaData="name='SESSIONEXTENSION_._type' kind='elementOnly'"
 * @generated
 */
public interface SESSIONEXTENSIONType extends EObject {
    /**
     * Returns the value of the '<em><b>CONNECTIONREFERENCE</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.CONNECTIONREFERENCEType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>CONNECTIONREFERENCE</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>CONNECTIONREFERENCE</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getSESSIONEXTENSIONType_CONNECTIONREFERENCE()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='CONNECTIONREFERENCE' namespace='##targetNamespace'"
     * @generated
     */
    EList<CONNECTIONREFERENCEType> getCONNECTIONREFERENCE();

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
     * @see Powrmart.PowrmartPackage#getSESSIONEXTENSIONType_ATTRIBUTE()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='ATTRIBUTE' namespace='##targetNamespace'"
     * @generated
     */
    EList<ATTRIBUTEType> getATTRIBUTE();

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
     * @see Powrmart.PowrmartPackage#getSESSIONEXTENSIONType_COMPONENTVERSION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='COMPONENTVERSION' namespace='##targetNamespace'"
     * @generated
     */
    Object getCOMPONENTVERSION();

    /**
     * Sets the value of the '{@link Powrmart.SESSIONEXTENSIONType#getCOMPONENTVERSION <em>COMPONENTVERSION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>COMPONENTVERSION</em>' attribute.
     * @see #getCOMPONENTVERSION()
     * @generated
     */
    void setCOMPONENTVERSION(Object value);

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
     * @see Powrmart.PowrmartPackage#getSESSIONEXTENSIONType_DSQINSTNAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='DSQINSTNAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getDSQINSTNAME();

    /**
     * Sets the value of the '{@link Powrmart.SESSIONEXTENSIONType#getDSQINSTNAME <em>DSQINSTNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DSQINSTNAME</em>' attribute.
     * @see #getDSQINSTNAME()
     * @generated
     */
    void setDSQINSTNAME(Object value);

    /**
     * Returns the value of the '<em><b>DSQINSTTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DSQINSTTYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DSQINSTTYPE</em>' attribute.
     * @see #setDSQINSTTYPE(Object)
     * @see Powrmart.PowrmartPackage#getSESSIONEXTENSIONType_DSQINSTTYPE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='DSQINSTTYPE' namespace='##targetNamespace'"
     * @generated
     */
    Object getDSQINSTTYPE();

    /**
     * Sets the value of the '{@link Powrmart.SESSIONEXTENSIONType#getDSQINSTTYPE <em>DSQINSTTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DSQINSTTYPE</em>' attribute.
     * @see #getDSQINSTTYPE()
     * @generated
     */
    void setDSQINSTTYPE(Object value);

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
     * @see Powrmart.PowrmartPackage#getSESSIONEXTENSIONType_NAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='NAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getNAME();

    /**
     * Sets the value of the '{@link Powrmart.SESSIONEXTENSIONType#getNAME <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NAME</em>' attribute.
     * @see #getNAME()
     * @generated
     */
    void setNAME(Object value);

    /**
     * Returns the value of the '<em><b>SINSTANCENAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SINSTANCENAME</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SINSTANCENAME</em>' attribute.
     * @see #setSINSTANCENAME(Object)
     * @see Powrmart.PowrmartPackage#getSESSIONEXTENSIONType_SINSTANCENAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='SINSTANCENAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getSINSTANCENAME();

    /**
     * Sets the value of the '{@link Powrmart.SESSIONEXTENSIONType#getSINSTANCENAME <em>SINSTANCENAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SINSTANCENAME</em>' attribute.
     * @see #getSINSTANCENAME()
     * @generated
     */
    void setSINSTANCENAME(Object value);

    /**
     * Returns the value of the '<em><b>SUBTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SUBTYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SUBTYPE</em>' attribute.
     * @see #setSUBTYPE(Object)
     * @see Powrmart.PowrmartPackage#getSESSIONEXTENSIONType_SUBTYPE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='SUBTYPE' namespace='##targetNamespace'"
     * @generated
     */
    Object getSUBTYPE();

    /**
     * Sets the value of the '{@link Powrmart.SESSIONEXTENSIONType#getSUBTYPE <em>SUBTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SUBTYPE</em>' attribute.
     * @see #getSUBTYPE()
     * @generated
     */
    void setSUBTYPE(Object value);

    /**
     * Returns the value of the '<em><b>TRANSFORMATIONTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TRANSFORMATIONTYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TRANSFORMATIONTYPE</em>' attribute.
     * @see #setTRANSFORMATIONTYPE(Object)
     * @see Powrmart.PowrmartPackage#getSESSIONEXTENSIONType_TRANSFORMATIONTYPE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='TRANSFORMATIONTYPE' namespace='##targetNamespace'"
     * @generated
     */
    Object getTRANSFORMATIONTYPE();

    /**
     * Sets the value of the '{@link Powrmart.SESSIONEXTENSIONType#getTRANSFORMATIONTYPE <em>TRANSFORMATIONTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TRANSFORMATIONTYPE</em>' attribute.
     * @see #getTRANSFORMATIONTYPE()
     * @generated
     */
    void setTRANSFORMATIONTYPE(Object value);

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
     * @see Powrmart.PowrmartPackage#getSESSIONEXTENSIONType_TYPE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='TYPE' namespace='##targetNamespace'"
     * @generated
     */
    Object getTYPE();

    /**
     * Sets the value of the '{@link Powrmart.SESSIONEXTENSIONType#getTYPE <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TYPE</em>' attribute.
     * @see #getTYPE()
     * @generated
     */
    void setTYPE(Object value);

} // SESSIONEXTENSIONType
