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
 * A representation of the model object '<em><b>Required Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link talendfile.RequiredType#getJob <em>Job</em>}</li>
 * </ul>
 * </p>
 *
 * @see talendfile.TalendfilePackage#getRequiredType()
 * @model extendedMetaData="name='Required_._type' kind='elementOnly'"
 * @generated
 */
public interface RequiredType extends EObject {
    /**
     * Returns the value of the '<em><b>Job</b></em>' containment reference list.
     * The list contents are of type {@link talendfile.JobType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Job</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Job</em>' containment reference list.
     * @see talendfile.TalendfilePackage#getRequiredType_Job()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='Job' namespace='##targetNamespace'"
     * @generated
     */
    EList<JobType> getJob();

} // RequiredType
