/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package talendfile;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metadata Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link talendfile.MetadataType#getColumn <em>Column</em>}</li>
 *   <li>{@link talendfile.MetadataType#getComment <em>Comment</em>}</li>
 *   <li>{@link talendfile.MetadataType#getConnector <em>Connector</em>}</li>
 *   <li>{@link talendfile.MetadataType#getLabel <em>Label</em>}</li>
 *   <li>{@link talendfile.MetadataType#getName <em>Name</em>}</li>
 *   <li>{@link talendfile.MetadataType#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see talendfile.TalendfilePackage#getMetadataType()
 * @model extendedMetaData="name='Metadata_._type' kind='elementOnly'"
 * @generated
 */
public interface MetadataType extends EObject {
    /**
     * Returns the value of the '<em><b>Column</b></em>' containment reference list.
     * The list contents are of type {@link talendfile.ColumnType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Column</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Column</em>' containment reference list.
     * @see talendfile.TalendfilePackage#getMetadataType_Column()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='Column' namespace='##targetNamespace'"
     * @generated
     */
    EList<ColumnType> getColumn();

    /**
     * Returns the value of the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Comment</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Comment</em>' attribute.
     * @see #setComment(String)
     * @see talendfile.TalendfilePackage#getMetadataType_Comment()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='Comment' namespace='##targetNamespace'"
     * @generated
     */
    String getComment();

    /**
     * Sets the value of the '{@link talendfile.MetadataType#getComment <em>Comment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Comment</em>' attribute.
     * @see #getComment()
     * @generated
     */
    void setComment(String value);

    /**
     * Returns the value of the '<em><b>Connector</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connector</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connector</em>' attribute.
     * @see #setConnector(String)
     * @see talendfile.TalendfilePackage#getMetadataType_Connector()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='connector' namespace='##targetNamespace'"
     * @generated
     */
    String getConnector();

    /**
     * Sets the value of the '{@link talendfile.MetadataType#getConnector <em>Connector</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Connector</em>' attribute.
     * @see #getConnector()
     * @generated
     */
    void setConnector(String value);

    /**
     * Returns the value of the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Label</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Label</em>' attribute.
     * @see #setLabel(String)
     * @see talendfile.TalendfilePackage#getMetadataType_Label()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='label' namespace='##targetNamespace'"
     * @generated
     */
    String getLabel();

    /**
     * Sets the value of the '{@link talendfile.MetadataType#getLabel <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Label</em>' attribute.
     * @see #getLabel()
     * @generated
     */
    void setLabel(String value);

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see talendfile.TalendfilePackage#getMetadataType_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link talendfile.MetadataType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Source</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source</em>' attribute.
     * @see #setSource(String)
     * @see talendfile.TalendfilePackage#getMetadataType_Source()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='source' namespace='##targetNamespace'"
     * @generated
     */
    String getSource();

    /**
     * Sets the value of the '{@link talendfile.MetadataType#getSource <em>Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source</em>' attribute.
     * @see #getSource()
     * @generated
     */
    void setSource(String value);

} // MetadataType
