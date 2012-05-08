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
 * A representation of the model object '<em><b>SEBLJOIN Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.SEBLJOINType#getDESTCOL <em>DESTCOL</em>}</li>
 *   <li>{@link Powrmart.SEBLJOINType#getFKTABLE <em>FKTABLE</em>}</li>
 *   <li>{@link Powrmart.SEBLJOINType#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.SEBLJOINType#getOUTERJOINREL <em>OUTERJOINREL</em>}</li>
 *   <li>{@link Powrmart.SEBLJOINType#getPKTABLE <em>PKTABLE</em>}</li>
 *   <li>{@link Powrmart.SEBLJOINType#getSRCCOL <em>SRCCOL</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getSEBLJOINType()
 * @model extendedMetaData="name='SEBLJOIN_._type' kind='empty'"
 * @generated
 */
public interface SEBLJOINType extends EObject {
    /**
     * Returns the value of the '<em><b>DESTCOL</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DESTCOL</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DESTCOL</em>' attribute.
     * @see #setDESTCOL(Object)
     * @see Powrmart.PowrmartPackage#getSEBLJOINType_DESTCOL()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='DESTCOL' namespace='##targetNamespace'"
     * @generated
     */
    Object getDESTCOL();

    /**
     * Sets the value of the '{@link Powrmart.SEBLJOINType#getDESTCOL <em>DESTCOL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DESTCOL</em>' attribute.
     * @see #getDESTCOL()
     * @generated
     */
    void setDESTCOL(Object value);

    /**
     * Returns the value of the '<em><b>FKTABLE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>FKTABLE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>FKTABLE</em>' attribute.
     * @see #setFKTABLE(Object)
     * @see Powrmart.PowrmartPackage#getSEBLJOINType_FKTABLE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='FKTABLE' namespace='##targetNamespace'"
     * @generated
     */
    Object getFKTABLE();

    /**
     * Sets the value of the '{@link Powrmart.SEBLJOINType#getFKTABLE <em>FKTABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>FKTABLE</em>' attribute.
     * @see #getFKTABLE()
     * @generated
     */
    void setFKTABLE(Object value);

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
     * @see Powrmart.PowrmartPackage#getSEBLJOINType_NAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='NAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getNAME();

    /**
     * Sets the value of the '{@link Powrmart.SEBLJOINType#getNAME <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NAME</em>' attribute.
     * @see #getNAME()
     * @generated
     */
    void setNAME(Object value);

    /**
     * Returns the value of the '<em><b>OUTERJOINREL</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.OUTERJOINRELType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>OUTERJOINREL</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>OUTERJOINREL</em>' attribute.
     * @see Powrmart.OUTERJOINRELType
     * @see #isSetOUTERJOINREL()
     * @see #unsetOUTERJOINREL()
     * @see #setOUTERJOINREL(OUTERJOINRELType)
     * @see Powrmart.PowrmartPackage#getSEBLJOINType_OUTERJOINREL()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='OUTERJOINREL' namespace='##targetNamespace'"
     * @generated
     */
    OUTERJOINRELType getOUTERJOINREL();

    /**
     * Sets the value of the '{@link Powrmart.SEBLJOINType#getOUTERJOINREL <em>OUTERJOINREL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>OUTERJOINREL</em>' attribute.
     * @see Powrmart.OUTERJOINRELType
     * @see #isSetOUTERJOINREL()
     * @see #unsetOUTERJOINREL()
     * @see #getOUTERJOINREL()
     * @generated
     */
    void setOUTERJOINREL(OUTERJOINRELType value);

    /**
     * Unsets the value of the '{@link Powrmart.SEBLJOINType#getOUTERJOINREL <em>OUTERJOINREL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOUTERJOINREL()
     * @see #getOUTERJOINREL()
     * @see #setOUTERJOINREL(OUTERJOINRELType)
     * @generated
     */
    void unsetOUTERJOINREL();

    /**
     * Returns whether the value of the '{@link Powrmart.SEBLJOINType#getOUTERJOINREL <em>OUTERJOINREL</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>OUTERJOINREL</em>' attribute is set.
     * @see #unsetOUTERJOINREL()
     * @see #getOUTERJOINREL()
     * @see #setOUTERJOINREL(OUTERJOINRELType)
     * @generated
     */
    boolean isSetOUTERJOINREL();

    /**
     * Returns the value of the '<em><b>PKTABLE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PKTABLE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PKTABLE</em>' attribute.
     * @see #setPKTABLE(Object)
     * @see Powrmart.PowrmartPackage#getSEBLJOINType_PKTABLE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='PKTABLE' namespace='##targetNamespace'"
     * @generated
     */
    Object getPKTABLE();

    /**
     * Sets the value of the '{@link Powrmart.SEBLJOINType#getPKTABLE <em>PKTABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PKTABLE</em>' attribute.
     * @see #getPKTABLE()
     * @generated
     */
    void setPKTABLE(Object value);

    /**
     * Returns the value of the '<em><b>SRCCOL</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SRCCOL</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SRCCOL</em>' attribute.
     * @see #setSRCCOL(Object)
     * @see Powrmart.PowrmartPackage#getSEBLJOINType_SRCCOL()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='SRCCOL' namespace='##targetNamespace'"
     * @generated
     */
    Object getSRCCOL();

    /**
     * Sets the value of the '{@link Powrmart.SEBLJOINType#getSRCCOL <em>SRCCOL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SRCCOL</em>' attribute.
     * @see #getSRCCOL()
     * @generated
     */
    void setSRCCOL(Object value);

} // SEBLJOINType
