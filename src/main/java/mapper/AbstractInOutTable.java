/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mapper;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract In Out Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mapper.AbstractInOutTable#getExpressionFilter <em>Expression Filter</em>}</li>
 *   <li>{@link mapper.AbstractInOutTable#isActivateExpressionFilter <em>Activate Expression Filter</em>}</li>
 *   <li>{@link mapper.AbstractInOutTable#isActivateCondensedTool <em>Activate Condensed Tool</em>}</li>
 *   <li>{@link mapper.AbstractInOutTable#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see mapper.MapperPackage#getAbstractInOutTable()
 * @model abstract="true"
 * @generated
 */
public interface AbstractInOutTable extends AbstractDataMapTable {
    /**
     * Returns the value of the '<em><b>Expression Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Expression Filter</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Expression Filter</em>' attribute.
     * @see #setExpressionFilter(String)
     * @see mapper.MapperPackage#getAbstractInOutTable_ExpressionFilter()
     * @model
     * @generated
     */
    String getExpressionFilter();

    /**
     * Sets the value of the '{@link mapper.AbstractInOutTable#getExpressionFilter <em>Expression Filter</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Expression Filter</em>' attribute.
     * @see #getExpressionFilter()
     * @generated
     */
    void setExpressionFilter(String value);

    /**
     * Returns the value of the '<em><b>Activate Expression Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Activate Expression Filter</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Activate Expression Filter</em>' attribute.
     * @see #setActivateExpressionFilter(boolean)
     * @see mapper.MapperPackage#getAbstractInOutTable_ActivateExpressionFilter()
     * @model
     * @generated
     */
    boolean isActivateExpressionFilter();

    /**
     * Sets the value of the '{@link mapper.AbstractInOutTable#isActivateExpressionFilter <em>Activate Expression Filter</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Activate Expression Filter</em>' attribute.
     * @see #isActivateExpressionFilter()
     * @generated
     */
    void setActivateExpressionFilter(boolean value);

    /**
     * Returns the value of the '<em><b>Activate Condensed Tool</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Activate Condensed Tool</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Activate Condensed Tool</em>' attribute.
     * @see #setActivateCondensedTool(boolean)
     * @see mapper.MapperPackage#getAbstractInOutTable_ActivateCondensedTool()
     * @model
     * @generated
     */
    boolean isActivateCondensedTool();

    /**
     * Sets the value of the '{@link mapper.AbstractInOutTable#isActivateCondensedTool <em>Activate Condensed Tool</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Activate Condensed Tool</em>' attribute.
     * @see #isActivateCondensedTool()
     * @generated
     */
    void setActivateCondensedTool(boolean value);

    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(String)
     * @see mapper.MapperPackage#getAbstractInOutTable_Id()
     * @model
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link mapper.AbstractInOutTable#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

} // AbstractInOutTable
