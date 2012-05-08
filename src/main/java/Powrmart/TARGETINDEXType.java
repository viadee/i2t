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
 * A representation of the model object '<em><b>TARGETINDEX Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.TARGETINDEXType#getTARGETINDEXFIELD <em>TARGETINDEXFIELD</em>}</li>
 *   <li>{@link Powrmart.TARGETINDEXType#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.TARGETINDEXType#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.TARGETINDEXType#getUNIQUE <em>UNIQUE</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getTARGETINDEXType()
 * @model extendedMetaData="name='TARGETINDEX_._type' kind='elementOnly'"
 * @generated
 */
public interface TARGETINDEXType extends EObject {
    /**
     * Returns the value of the '<em><b>TARGETINDEXFIELD</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.TARGETINDEXFIELDType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TARGETINDEXFIELD</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TARGETINDEXFIELD</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getTARGETINDEXType_TARGETINDEXFIELD()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='TARGETINDEXFIELD' namespace='##targetNamespace'"
     * @generated
     */
    EList<TARGETINDEXFIELDType> getTARGETINDEXFIELD();

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
     * @see Powrmart.PowrmartPackage#getTARGETINDEXType_DESCRIPTION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='DESCRIPTION' namespace='##targetNamespace'"
     * @generated
     */
    Object getDESCRIPTION();

    /**
     * Sets the value of the '{@link Powrmart.TARGETINDEXType#getDESCRIPTION <em>DESCRIPTION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DESCRIPTION</em>' attribute.
     * @see #getDESCRIPTION()
     * @generated
     */
    void setDESCRIPTION(Object value);

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
     * @see Powrmart.PowrmartPackage#getTARGETINDEXType_NAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='NAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getNAME();

    /**
     * Sets the value of the '{@link Powrmart.TARGETINDEXType#getNAME <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NAME</em>' attribute.
     * @see #getNAME()
     * @generated
     */
    void setNAME(Object value);

    /**
     * Returns the value of the '<em><b>UNIQUE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>UNIQUE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>UNIQUE</em>' attribute.
     * @see #setUNIQUE(Object)
     * @see Powrmart.PowrmartPackage#getTARGETINDEXType_UNIQUE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='UNIQUE' namespace='##targetNamespace'"
     * @generated
     */
    Object getUNIQUE();

    /**
     * Sets the value of the '{@link Powrmart.TARGETINDEXType#getUNIQUE <em>UNIQUE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>UNIQUE</em>' attribute.
     * @see #getUNIQUE()
     * @generated
     */
    void setUNIQUE(Object value);

} // TARGETINDEXType
