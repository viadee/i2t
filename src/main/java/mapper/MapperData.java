/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mapper;

import org.eclipse.emf.common.util.EList;

import talendfile.AbstractExternalData;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mapper.MapperData#getUiProperties <em>Ui Properties</em>}</li>
 *   <li>{@link mapper.MapperData#getVarTables <em>Var Tables</em>}</li>
 *   <li>{@link mapper.MapperData#getOutputTables <em>Output Tables</em>}</li>
 *   <li>{@link mapper.MapperData#getInputTables <em>Input Tables</em>}</li>
 * </ul>
 * </p>
 *
 * @see mapper.MapperPackage#getMapperData()
 * @model
 * @generated
 */
public interface MapperData extends AbstractExternalData {
    /**
     * Returns the value of the '<em><b>Ui Properties</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ui Properties</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ui Properties</em>' containment reference.
     * @see #setUiProperties(UiProperties)
     * @see mapper.MapperPackage#getMapperData_UiProperties()
     * @model containment="true"
     * @generated
     */
    UiProperties getUiProperties();

    /**
     * Sets the value of the '{@link mapper.MapperData#getUiProperties <em>Ui Properties</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ui Properties</em>' containment reference.
     * @see #getUiProperties()
     * @generated
     */
    void setUiProperties(UiProperties value);

    /**
     * Returns the value of the '<em><b>Var Tables</b></em>' containment reference list.
     * The list contents are of type {@link mapper.VarTable}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Var Tables</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Var Tables</em>' containment reference list.
     * @see mapper.MapperPackage#getMapperData_VarTables()
     * @model containment="true"
     * @generated
     */
    EList<VarTable> getVarTables();

    /**
     * Returns the value of the '<em><b>Output Tables</b></em>' containment reference list.
     * The list contents are of type {@link mapper.OutputTable}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Output Tables</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Output Tables</em>' containment reference list.
     * @see mapper.MapperPackage#getMapperData_OutputTables()
     * @model containment="true"
     * @generated
     */
    EList<OutputTable> getOutputTables();

    /**
     * Returns the value of the '<em><b>Input Tables</b></em>' containment reference list.
     * The list contents are of type {@link mapper.InputTable}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Input Tables</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Input Tables</em>' containment reference list.
     * @see mapper.MapperPackage#getMapperData_InputTables()
     * @model containment="true"
     * @generated
     */
    EList<InputTable> getInputTables();

} // MapperData
