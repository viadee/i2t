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
 * A representation of the model object '<em><b>INSTANCE Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.INSTANCEType#getTABLEATTRIBUTE <em>TABLEATTRIBUTE</em>}</li>
 *   <li>{@link Powrmart.INSTANCEType#getEXPRMACRODEPENDENCY <em>EXPRMACRODEPENDENCY</em>}</li>
 *   <li>{@link Powrmart.INSTANCEType#getINITPROP <em>INITPROP</em>}</li>
 *   <li>{@link Powrmart.INSTANCEType#getASSOCIATEDSOURCEINSTANCE <em>ASSOCIATEDSOURCEINSTANCE</em>}</li>
 *   <li>{@link Powrmart.INSTANCEType#getASSOCIATEDDSQ <em>ASSOCIATEDDSQ</em>}</li>
 *   <li>{@link Powrmart.INSTANCEType#getASSOCIATEDDSQTYPE <em>ASSOCIATEDDSQTYPE</em>}</li>
 *   <li>{@link Powrmart.INSTANCEType#getDBDNAME <em>DBDNAME</em>}</li>
 *   <li>{@link Powrmart.INSTANCEType#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.INSTANCEType#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.INSTANCEType#getFIELD <em>FIELD</em>}</li>
 *   <li>{@link Powrmart.INSTANCEType#getREUSABLE <em>REUSABLE</em>}</li>
 *   <li>{@link Powrmart.INSTANCEType#getTRANSFORMATIONNAME <em>TRANSFORMATIONNAME</em>}</li>
 *   <li>{@link Powrmart.INSTANCEType#getTRANSFORMATIONTYPE <em>TRANSFORMATIONTYPE</em>}</li>
 *   <li>{@link Powrmart.INSTANCEType#getTYPE <em>TYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getINSTANCEType()
 * @model extendedMetaData="name='INSTANCE_._type' kind='elementOnly'"
 * @generated
 */
public interface INSTANCEType extends EObject {
    /**
     * Returns the value of the '<em><b>TABLEATTRIBUTE</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.TABLEATTRIBUTEType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TABLEATTRIBUTE</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TABLEATTRIBUTE</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getINSTANCEType_TABLEATTRIBUTE()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='TABLEATTRIBUTE' namespace='##targetNamespace'"
     * @generated
     */
    EList<TABLEATTRIBUTEType> getTABLEATTRIBUTE();

    /**
     * Returns the value of the '<em><b>EXPRMACRODEPENDENCY</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.EXPRMACRODEPENDENCYType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>EXPRMACRODEPENDENCY</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>EXPRMACRODEPENDENCY</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getINSTANCEType_EXPRMACRODEPENDENCY()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='EXPRMACRODEPENDENCY' namespace='##targetNamespace'"
     * @generated
     */
    EList<EXPRMACRODEPENDENCYType> getEXPRMACRODEPENDENCY();

    /**
     * Returns the value of the '<em><b>INITPROP</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.INITPROPType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>INITPROP</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>INITPROP</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getINSTANCEType_INITPROP()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='INITPROP' namespace='##targetNamespace'"
     * @generated
     */
    EList<INITPROPType> getINITPROP();

    /**
     * Returns the value of the '<em><b>ASSOCIATEDSOURCEINSTANCE</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.ASSOCIATEDSOURCEINSTANCEType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ASSOCIATEDSOURCEINSTANCE</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ASSOCIATEDSOURCEINSTANCE</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getINSTANCEType_ASSOCIATEDSOURCEINSTANCE()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='ASSOCIATED_SOURCE_INSTANCE' namespace='##targetNamespace'"
     * @generated
     */
    EList<ASSOCIATEDSOURCEINSTANCEType> getASSOCIATEDSOURCEINSTANCE();

    /**
     * Returns the value of the '<em><b>ASSOCIATEDDSQ</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ASSOCIATEDDSQ</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ASSOCIATEDDSQ</em>' attribute.
     * @see #setASSOCIATEDDSQ(Object)
     * @see Powrmart.PowrmartPackage#getINSTANCEType_ASSOCIATEDDSQ()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='ASSOCIATED_DSQ' namespace='##targetNamespace'"
     * @generated
     */
    Object getASSOCIATEDDSQ();

    /**
     * Sets the value of the '{@link Powrmart.INSTANCEType#getASSOCIATEDDSQ <em>ASSOCIATEDDSQ</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ASSOCIATEDDSQ</em>' attribute.
     * @see #getASSOCIATEDDSQ()
     * @generated
     */
    void setASSOCIATEDDSQ(Object value);

    /**
     * Returns the value of the '<em><b>ASSOCIATEDDSQTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ASSOCIATEDDSQTYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ASSOCIATEDDSQTYPE</em>' attribute.
     * @see #setASSOCIATEDDSQTYPE(Object)
     * @see Powrmart.PowrmartPackage#getINSTANCEType_ASSOCIATEDDSQTYPE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='ASSOCIATED_DSQ_TYPE' namespace='##targetNamespace'"
     * @generated
     */
    Object getASSOCIATEDDSQTYPE();

    /**
     * Sets the value of the '{@link Powrmart.INSTANCEType#getASSOCIATEDDSQTYPE <em>ASSOCIATEDDSQTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ASSOCIATEDDSQTYPE</em>' attribute.
     * @see #getASSOCIATEDDSQTYPE()
     * @generated
     */
    void setASSOCIATEDDSQTYPE(Object value);

    /**
     * Returns the value of the '<em><b>DBDNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DBDNAME</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DBDNAME</em>' attribute.
     * @see #setDBDNAME(Object)
     * @see Powrmart.PowrmartPackage#getINSTANCEType_DBDNAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='DBDNAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getDBDNAME();

    /**
     * Sets the value of the '{@link Powrmart.INSTANCEType#getDBDNAME <em>DBDNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DBDNAME</em>' attribute.
     * @see #getDBDNAME()
     * @generated
     */
    void setDBDNAME(Object value);

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
     * @see Powrmart.PowrmartPackage#getINSTANCEType_DESCRIPTION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='DESCRIPTION' namespace='##targetNamespace'"
     * @generated
     */
    Object getDESCRIPTION();

    /**
     * Sets the value of the '{@link Powrmart.INSTANCEType#getDESCRIPTION <em>DESCRIPTION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DESCRIPTION</em>' attribute.
     * @see #getDESCRIPTION()
     * @generated
     */
    void setDESCRIPTION(Object value);

    /**
     * Returns the value of the '<em><b>FIELD</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>FIELD</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>FIELD</em>' attribute.
     * @see #setFIELD(Object)
     * @see Powrmart.PowrmartPackage#getINSTANCEType_FIELD()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='FIELD' namespace='##targetNamespace'"
     */
//    Object getFIELD();

    /**
     * Sets the value of the '{@link Powrmart.INSTANCEType#getFIELD <em>FIELD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>FIELD</em>' attribute.
     * @see #getFIELD()
     */
//    void setFIELD(Object value);

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
     * @see Powrmart.PowrmartPackage#getINSTANCEType_NAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='NAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getNAME();

    /**
     * Sets the value of the '{@link Powrmart.INSTANCEType#getNAME <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NAME</em>' attribute.
     * @see #getNAME()
     * @generated
     */
    void setNAME(Object value);

    /**
     * Returns the value of the '<em><b>REUSABLE</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.REUSABLEType6}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>REUSABLE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>REUSABLE</em>' attribute.
     * @see Powrmart.REUSABLEType6
     * @see #isSetREUSABLE()
     * @see #unsetREUSABLE()
     * @see #setREUSABLE(REUSABLEType6)
     * @see Powrmart.PowrmartPackage#getINSTANCEType_REUSABLE()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='REUSABLE' namespace='##targetNamespace'"
     * @generated
     */
    REUSABLEType6 getREUSABLE();

    /**
     * Sets the value of the '{@link Powrmart.INSTANCEType#getREUSABLE <em>REUSABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>REUSABLE</em>' attribute.
     * @see Powrmart.REUSABLEType6
     * @see #isSetREUSABLE()
     * @see #unsetREUSABLE()
     * @see #getREUSABLE()
     * @generated
     */
    void setREUSABLE(REUSABLEType6 value);

    /**
     * Unsets the value of the '{@link Powrmart.INSTANCEType#getREUSABLE <em>REUSABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetREUSABLE()
     * @see #getREUSABLE()
     * @see #setREUSABLE(REUSABLEType6)
     * @generated
     */
    void unsetREUSABLE();

    /**
     * Returns whether the value of the '{@link Powrmart.INSTANCEType#getREUSABLE <em>REUSABLE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>REUSABLE</em>' attribute is set.
     * @see #unsetREUSABLE()
     * @see #getREUSABLE()
     * @see #setREUSABLE(REUSABLEType6)
     * @generated
     */
    boolean isSetREUSABLE();

    /**
     * Returns the value of the '<em><b>TRANSFORMATIONNAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TRANSFORMATIONNAME</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TRANSFORMATIONNAME</em>' attribute.
     * @see #setTRANSFORMATIONNAME(Object)
     * @see Powrmart.PowrmartPackage#getINSTANCEType_TRANSFORMATIONNAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='TRANSFORMATION_NAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getTRANSFORMATIONNAME();

    /**
     * Sets the value of the '{@link Powrmart.INSTANCEType#getTRANSFORMATIONNAME <em>TRANSFORMATIONNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TRANSFORMATIONNAME</em>' attribute.
     * @see #getTRANSFORMATIONNAME()
     * @generated
     */
    void setTRANSFORMATIONNAME(Object value);

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
     * @see Powrmart.PowrmartPackage#getINSTANCEType_TRANSFORMATIONTYPE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='TRANSFORMATION_TYPE' namespace='##targetNamespace'"
     * @generated
     */
    Object getTRANSFORMATIONTYPE();

    /**
     * Sets the value of the '{@link Powrmart.INSTANCEType#getTRANSFORMATIONTYPE <em>TRANSFORMATIONTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TRANSFORMATIONTYPE</em>' attribute.
     * @see #getTRANSFORMATIONTYPE()
     * @generated
     */
    void setTRANSFORMATIONTYPE(Object value);

    /**
     * Returns the value of the '<em><b>TYPE</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.TYPEType5}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TYPE</em>' attribute.
     * @see Powrmart.TYPEType5
     * @see #isSetTYPE()
     * @see #unsetTYPE()
     * @see #setTYPE(TYPEType5)
     * @see Powrmart.PowrmartPackage#getINSTANCEType_TYPE()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='TYPE' namespace='##targetNamespace'"
     * @generated
     */
    TYPEType5 getTYPE();

    /**
     * Sets the value of the '{@link Powrmart.INSTANCEType#getTYPE <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TYPE</em>' attribute.
     * @see Powrmart.TYPEType5
     * @see #isSetTYPE()
     * @see #unsetTYPE()
     * @see #getTYPE()
     * @generated
     */
    void setTYPE(TYPEType5 value);

    /**
     * Unsets the value of the '{@link Powrmart.INSTANCEType#getTYPE <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTYPE()
     * @see #getTYPE()
     * @see #setTYPE(TYPEType5)
     * @generated
     */
    void unsetTYPE();

    /**
     * Returns whether the value of the '{@link Powrmart.INSTANCEType#getTYPE <em>TYPE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>TYPE</em>' attribute is set.
     * @see #unsetTYPE()
     * @see #getTYPE()
     * @see #setTYPE(TYPEType5)
     * @generated
     */
    boolean isSetTYPE();

} // INSTANCEType
