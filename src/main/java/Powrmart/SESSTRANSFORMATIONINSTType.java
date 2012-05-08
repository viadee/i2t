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
 * A representation of the model object '<em><b>SESSTRANSFORMATIONINST Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Powrmart.SESSTRANSFORMATIONINSTType#getSESSTRANSFORMATIONGROUP <em>SESSTRANSFORMATIONGROUP</em>}</li>
 *   <li>{@link Powrmart.SESSTRANSFORMATIONINSTType#getPARTITION <em>PARTITION</em>}</li>
 *   <li>{@link Powrmart.SESSTRANSFORMATIONINSTType#getHASHKEY <em>HASHKEY</em>}</li>
 *   <li>{@link Powrmart.SESSTRANSFORMATIONINSTType#getFLATFILE <em>FLATFILE</em>}</li>
 *   <li>{@link Powrmart.SESSTRANSFORMATIONINSTType#getATTRIBUTE <em>ATTRIBUTE</em>}</li>
 *   <li>{@link Powrmart.SESSTRANSFORMATIONINSTType#getISREPARTITIONPOINT <em>ISREPARTITIONPOINT</em>}</li>
 *   <li>{@link Powrmart.SESSTRANSFORMATIONINSTType#getPARTITIONTYPE <em>PARTITIONTYPE</em>}</li>
 *   <li>{@link Powrmart.SESSTRANSFORMATIONINSTType#getPIPELINE <em>PIPELINE</em>}</li>
 *   <li>{@link Powrmart.SESSTRANSFORMATIONINSTType#getSINSTANCENAME <em>SINSTANCENAME</em>}</li>
 *   <li>{@link Powrmart.SESSTRANSFORMATIONINSTType#getSTAGE <em>STAGE</em>}</li>
 *   <li>{@link Powrmart.SESSTRANSFORMATIONINSTType#getTRANSFORMATIONNAME <em>TRANSFORMATIONNAME</em>}</li>
 *   <li>{@link Powrmart.SESSTRANSFORMATIONINSTType#getTRANSFORMATIONTYPE <em>TRANSFORMATIONTYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @see Powrmart.PowrmartPackage#getSESSTRANSFORMATIONINSTType()
 * @model extendedMetaData="name='SESSTRANSFORMATIONINST_._type' kind='elementOnly'"
 * @generated
 */
public interface SESSTRANSFORMATIONINSTType extends EObject {
    /**
     * Returns the value of the '<em><b>SESSTRANSFORMATIONGROUP</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.SESSTRANSFORMATIONGROUPType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SESSTRANSFORMATIONGROUP</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SESSTRANSFORMATIONGROUP</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getSESSTRANSFORMATIONINSTType_SESSTRANSFORMATIONGROUP()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='SESSTRANSFORMATIONGROUP' namespace='##targetNamespace'"
     * @generated
     */
    EList<SESSTRANSFORMATIONGROUPType> getSESSTRANSFORMATIONGROUP();

    /**
     * Returns the value of the '<em><b>PARTITION</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.PARTITIONType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PARTITION</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PARTITION</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getSESSTRANSFORMATIONINSTType_PARTITION()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='PARTITION' namespace='##targetNamespace'"
     * @generated
     */
    EList<PARTITIONType> getPARTITION();

    /**
     * Returns the value of the '<em><b>HASHKEY</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.HASHKEYType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>HASHKEY</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>HASHKEY</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getSESSTRANSFORMATIONINSTType_HASHKEY()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='HASHKEY' namespace='##targetNamespace'"
     * @generated
     */
    EList<HASHKEYType> getHASHKEY();

    /**
     * Returns the value of the '<em><b>FLATFILE</b></em>' containment reference list.
     * The list contents are of type {@link Powrmart.FLATFILEType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>FLATFILE</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>FLATFILE</em>' containment reference list.
     * @see Powrmart.PowrmartPackage#getSESSTRANSFORMATIONINSTType_FLATFILE()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='FLATFILE' namespace='##targetNamespace'"
     * @generated
     */
    EList<FLATFILEType> getFLATFILE();

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
     * @see Powrmart.PowrmartPackage#getSESSTRANSFORMATIONINSTType_ATTRIBUTE()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='ATTRIBUTE' namespace='##targetNamespace'"
     * @generated
     */
    EList<ATTRIBUTEType> getATTRIBUTE();

    /**
     * Returns the value of the '<em><b>ISREPARTITIONPOINT</b></em>' attribute.
     * The literals are from the enumeration {@link Powrmart.ISREPARTITIONPOINTType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ISREPARTITIONPOINT</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ISREPARTITIONPOINT</em>' attribute.
     * @see Powrmart.ISREPARTITIONPOINTType
     * @see #isSetISREPARTITIONPOINT()
     * @see #unsetISREPARTITIONPOINT()
     * @see #setISREPARTITIONPOINT(ISREPARTITIONPOINTType)
     * @see Powrmart.PowrmartPackage#getSESSTRANSFORMATIONINSTType_ISREPARTITIONPOINT()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='ISREPARTITIONPOINT' namespace='##targetNamespace'"
     * @generated
     */
    ISREPARTITIONPOINTType getISREPARTITIONPOINT();

    /**
     * Sets the value of the '{@link Powrmart.SESSTRANSFORMATIONINSTType#getISREPARTITIONPOINT <em>ISREPARTITIONPOINT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ISREPARTITIONPOINT</em>' attribute.
     * @see Powrmart.ISREPARTITIONPOINTType
     * @see #isSetISREPARTITIONPOINT()
     * @see #unsetISREPARTITIONPOINT()
     * @see #getISREPARTITIONPOINT()
     * @generated
     */
    void setISREPARTITIONPOINT(ISREPARTITIONPOINTType value);

    /**
     * Unsets the value of the '{@link Powrmart.SESSTRANSFORMATIONINSTType#getISREPARTITIONPOINT <em>ISREPARTITIONPOINT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetISREPARTITIONPOINT()
     * @see #getISREPARTITIONPOINT()
     * @see #setISREPARTITIONPOINT(ISREPARTITIONPOINTType)
     * @generated
     */
    void unsetISREPARTITIONPOINT();

    /**
     * Returns whether the value of the '{@link Powrmart.SESSTRANSFORMATIONINSTType#getISREPARTITIONPOINT <em>ISREPARTITIONPOINT</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>ISREPARTITIONPOINT</em>' attribute is set.
     * @see #unsetISREPARTITIONPOINT()
     * @see #getISREPARTITIONPOINT()
     * @see #setISREPARTITIONPOINT(ISREPARTITIONPOINTType)
     * @generated
     */
    boolean isSetISREPARTITIONPOINT();

    /**
     * Returns the value of the '<em><b>PARTITIONTYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PARTITIONTYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PARTITIONTYPE</em>' attribute.
     * @see #setPARTITIONTYPE(Object)
     * @see Powrmart.PowrmartPackage#getSESSTRANSFORMATIONINSTType_PARTITIONTYPE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='PARTITIONTYPE' namespace='##targetNamespace'"
     * @generated
     */
    Object getPARTITIONTYPE();

    /**
     * Sets the value of the '{@link Powrmart.SESSTRANSFORMATIONINSTType#getPARTITIONTYPE <em>PARTITIONTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PARTITIONTYPE</em>' attribute.
     * @see #getPARTITIONTYPE()
     * @generated
     */
    void setPARTITIONTYPE(Object value);

    /**
     * Returns the value of the '<em><b>PIPELINE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PIPELINE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PIPELINE</em>' attribute.
     * @see #setPIPELINE(Object)
     * @see Powrmart.PowrmartPackage#getSESSTRANSFORMATIONINSTType_PIPELINE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='PIPELINE' namespace='##targetNamespace'"
     * @generated
     */
    Object getPIPELINE();

    /**
     * Sets the value of the '{@link Powrmart.SESSTRANSFORMATIONINSTType#getPIPELINE <em>PIPELINE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PIPELINE</em>' attribute.
     * @see #getPIPELINE()
     * @generated
     */
    void setPIPELINE(Object value);

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
     * @see Powrmart.PowrmartPackage#getSESSTRANSFORMATIONINSTType_SINSTANCENAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='SINSTANCENAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getSINSTANCENAME();

    /**
     * Sets the value of the '{@link Powrmart.SESSTRANSFORMATIONINSTType#getSINSTANCENAME <em>SINSTANCENAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SINSTANCENAME</em>' attribute.
     * @see #getSINSTANCENAME()
     * @generated
     */
    void setSINSTANCENAME(Object value);

    /**
     * Returns the value of the '<em><b>STAGE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>STAGE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>STAGE</em>' attribute.
     * @see #setSTAGE(Object)
     * @see Powrmart.PowrmartPackage#getSESSTRANSFORMATIONINSTType_STAGE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
     *        extendedMetaData="kind='attribute' name='STAGE' namespace='##targetNamespace'"
     * @generated
     */
    Object getSTAGE();

    /**
     * Sets the value of the '{@link Powrmart.SESSTRANSFORMATIONINSTType#getSTAGE <em>STAGE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>STAGE</em>' attribute.
     * @see #getSTAGE()
     * @generated
     */
    void setSTAGE(Object value);

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
     * @see Powrmart.PowrmartPackage#getSESSTRANSFORMATIONINSTType_TRANSFORMATIONNAME()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='TRANSFORMATIONNAME' namespace='##targetNamespace'"
     * @generated
     */
    Object getTRANSFORMATIONNAME();

    /**
     * Sets the value of the '{@link Powrmart.SESSTRANSFORMATIONINSTType#getTRANSFORMATIONNAME <em>TRANSFORMATIONNAME</em>}' attribute.
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
     * @see Powrmart.PowrmartPackage#getSESSTRANSFORMATIONINSTType_TRANSFORMATIONTYPE()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
     *        extendedMetaData="kind='attribute' name='TRANSFORMATIONTYPE' namespace='##targetNamespace'"
     * @generated
     */
    Object getTRANSFORMATIONTYPE();

    /**
     * Sets the value of the '{@link Powrmart.SESSTRANSFORMATIONINSTType#getTRANSFORMATIONTYPE <em>TRANSFORMATIONTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TRANSFORMATIONTYPE</em>' attribute.
     * @see #getTRANSFORMATIONTYPE()
     * @generated
     */
    void setTRANSFORMATIONTYPE(Object value);

} // SESSTRANSFORMATIONINSTType
