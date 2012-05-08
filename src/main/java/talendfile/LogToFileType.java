/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package talendfile;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Log To File Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link talendfile.LogToFileType#getFilename <em>Filename</em>}</li>
 *   <li>{@link talendfile.LogToFileType#getLevel <em>Level</em>}</li>
 *   <li>{@link talendfile.LogToFileType#isSelected <em>Selected</em>}</li>
 * </ul>
 * </p>
 *
 * @see talendfile.TalendfilePackage#getLogToFileType()
 * @model extendedMetaData="name='LogToFile_._type' kind='empty'"
 * @generated
 */
public interface LogToFileType extends EObject {
    /**
     * Returns the value of the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Filename</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Filename</em>' attribute.
     * @see #setFilename(String)
     * @see talendfile.TalendfilePackage#getLogToFileType_Filename()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='filename' namespace='##targetNamespace'"
     * @generated
     */
    String getFilename();

    /**
     * Sets the value of the '{@link talendfile.LogToFileType#getFilename <em>Filename</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Filename</em>' attribute.
     * @see #getFilename()
     * @generated
     */
    void setFilename(String value);

    /**
     * Returns the value of the '<em><b>Level</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Level</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Level</em>' attribute.
     * @see #isSetLevel()
     * @see #unsetLevel()
     * @see #setLevel(int)
     * @see talendfile.TalendfilePackage#getLogToFileType_Level()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='attribute' name='level' namespace='##targetNamespace'"
     * @generated
     */
    int getLevel();

    /**
     * Sets the value of the '{@link talendfile.LogToFileType#getLevel <em>Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Level</em>' attribute.
     * @see #isSetLevel()
     * @see #unsetLevel()
     * @see #getLevel()
     * @generated
     */
    void setLevel(int value);

    /**
     * Unsets the value of the '{@link talendfile.LogToFileType#getLevel <em>Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLevel()
     * @see #getLevel()
     * @see #setLevel(int)
     * @generated
     */
    void unsetLevel();

    /**
     * Returns whether the value of the '{@link talendfile.LogToFileType#getLevel <em>Level</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Level</em>' attribute is set.
     * @see #unsetLevel()
     * @see #getLevel()
     * @see #setLevel(int)
     * @generated
     */
    boolean isSetLevel();

    /**
     * Returns the value of the '<em><b>Selected</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Selected</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Selected</em>' attribute.
     * @see #isSetSelected()
     * @see #unsetSelected()
     * @see #setSelected(boolean)
     * @see talendfile.TalendfilePackage#getLogToFileType_Selected()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='selected' namespace='##targetNamespace'"
     * @generated
     */
    boolean isSelected();

    /**
     * Sets the value of the '{@link talendfile.LogToFileType#isSelected <em>Selected</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Selected</em>' attribute.
     * @see #isSetSelected()
     * @see #unsetSelected()
     * @see #isSelected()
     * @generated
     */
    void setSelected(boolean value);

    /**
     * Unsets the value of the '{@link talendfile.LogToFileType#isSelected <em>Selected</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSelected()
     * @see #isSelected()
     * @see #setSelected(boolean)
     * @generated
     */
    void unsetSelected();

    /**
     * Returns whether the value of the '{@link talendfile.LogToFileType#isSelected <em>Selected</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Selected</em>' attribute is set.
     * @see #unsetSelected()
     * @see #isSelected()
     * @see #setSelected(boolean)
     * @generated
     */
    boolean isSetSelected();

} // LogToFileType
