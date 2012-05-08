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
 * A representation of the model object '<em><b>Node Container Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link talendfile.NodeContainerType#getElementParameter <em>Element Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see talendfile.TalendfilePackage#getNodeContainerType()
 * @model
 * @generated
 */
public interface NodeContainerType extends EObject {
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
     * @see talendfile.TalendfilePackage#getNodeContainerType_ElementParameter()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='ElementParameter' namespace='##targetNamespace'"
     * @generated
     */
    EList<ElementParameterType> getElementParameter();

} // NodeContainerType
