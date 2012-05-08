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
 * A representation of the model object '<em><b>Parameters Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link talendfile.ParametersType#getElementParameter <em>Element Parameter</em>}</li>
 *   <li>{@link talendfile.ParametersType#getRoutinesParameter <em>Routines Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see talendfile.TalendfilePackage#getParametersType()
 * @model extendedMetaData="name='Parameters_._type' kind='elementOnly'"
 * @generated
 */
public interface ParametersType extends EObject {
    /**
     * Returns the value of the '<em><b>Element Parameter</b></em>' containment reference list.
     * The list contents are of type {@link talendfile.ElementParameterType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Element Parameter</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Element Parameter</em>' containment reference list.
     * @see talendfile.TalendfilePackage#getParametersType_ElementParameter()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='ElementParameter' namespace='##targetNamespace'"
     * @generated
     */
    EList<ElementParameterType> getElementParameter();

    /**
     * Returns the value of the '<em><b>Routines Parameter</b></em>' containment reference list.
     * The list contents are of type {@link talendfile.RoutinesParameterType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Routines Parameter</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Routines Parameter</em>' containment reference list.
     * @see talendfile.TalendfilePackage#getParametersType_RoutinesParameter()
     * @model containment="true"
     * @generated
     */
    EList<RoutinesParameterType> getRoutinesParameter();

} // ParametersType
