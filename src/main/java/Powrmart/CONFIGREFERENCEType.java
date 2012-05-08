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
 * A representation of the model object '<em><b>CONFIGREFERENCE Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.CONFIGREFERENCEType#getATTRIBUTE <em>ATTRIBUTE</em>}</li>
 *   <li>{@link Powrmart.CONFIGREFERENCEType#getREFOBJECTNAME <em>REFOBJECTNAME</em>}</li>
 *   <li>{@link Powrmart.CONFIGREFERENCEType#getTYPE <em>TYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getCONFIGREFERENCEType()
 * @model extendedMetaData="name='CONFIGREFERENCE_._type' kind='elementOnly'"
 * @generated
 */
public interface CONFIGREFERENCEType extends EObject {
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
     * @see Powrmart.PowrmartPackage#getCONFIGREFERENCEType_ATTRIBUTE()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='ATTRIBUTE' namespace='##targetNamespace'"
     * @generated
     */
    EList<ATTRIBUTEType> getATTRIBUTE();

    /**
     * Returns the value of the '<em><b>REFOBJECTNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>REFOBJECTNAME</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>REFOBJECTNAME</em>' attribute.
     * @see #setREFOBJECTNAME(Object)
     * @see Powrmart.PowrmartPackage#getCONFIGREFERENCEType_REFOBJECTNAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='REFOBJECTNAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getREFOBJECTNAME();

    /**
     * Sets the value of the '{@link Powrmart.CONFIGREFERENCEType#getREFOBJECTNAME <em>REFOBJECTNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>REFOBJECTNAME</em>' attribute.
     * @see #getREFOBJECTNAME()
     * @generated
     */
    void setREFOBJECTNAME(Object value);

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
     * @see Powrmart.PowrmartPackage#getCONFIGREFERENCEType_TYPE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='TYPE' namespace='##targetNamespace'"
     * @generated
     */
    Object getTYPE();

    /**
     * Sets the value of the '{@link Powrmart.CONFIGREFERENCEType#getTYPE <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TYPE</em>' attribute.
     * @see #getTYPE()
     * @generated
     */
    void setTYPE(Object value);

} // CONFIGREFERENCEType
