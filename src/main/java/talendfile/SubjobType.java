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
 * A representation of the model object '<em><b>Subjob Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link talendfile.SubjobType#getElementParameter <em>Element Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see talendfile.TalendfilePackage#getSubjobType()
 * @model extendedMetaData="name='Subjob_._type' kind='elementOnly'"
 * @generated
 */
public interface SubjobType extends EObject {
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
     * @see talendfile.TalendfilePackage#getSubjobType_ElementParameter()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='ElementParameter' namespace='##targetNamespace'"
     * @generated
     */
    EList<ElementParameterType> getElementParameter();

} // SubjobType
