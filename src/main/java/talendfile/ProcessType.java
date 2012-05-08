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
 * A representation of the model object '<em><b>Process Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link talendfile.ProcessType#getDescription <em>Description</em>}</li>
 *   <li>{@link talendfile.ProcessType#getRequired <em>Required</em>}</li>
 *   <li>{@link talendfile.ProcessType#getContext <em>Context</em>}</li>
 *   <li>{@link talendfile.ProcessType#getParameters <em>Parameters</em>}</li>
 *   <li>{@link talendfile.ProcessType#getNode <em>Node</em>}</li>
 *   <li>{@link talendfile.ProcessType#getConnection <em>Connection</em>}</li>
 *   <li>{@link talendfile.ProcessType#getNote <em>Note</em>}</li>
 *   <li>{@link talendfile.ProcessType#getLogs <em>Logs</em>}</li>
 *   <li>{@link talendfile.ProcessType#getAuthor <em>Author</em>}</li>
 *   <li>{@link talendfile.ProcessType#getComment <em>Comment</em>}</li>
 *   <li>{@link talendfile.ProcessType#getDefaultContext <em>Default Context</em>}</li>
 *   <li>{@link talendfile.ProcessType#getName <em>Name</em>}</li>
 *   <li>{@link talendfile.ProcessType#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link talendfile.ProcessType#getRepositoryContextId <em>Repository Context Id</em>}</li>
 *   <li>{@link talendfile.ProcessType#getStatus <em>Status</em>}</li>
 *   <li>{@link talendfile.ProcessType#getVersion <em>Version</em>}</li>
 *   <li>{@link talendfile.ProcessType#getSubjob <em>Subjob</em>}</li>
 *   <li>{@link talendfile.ProcessType#getScreenshot <em>Screenshot</em>}</li>
 *   <li>{@link talendfile.ProcessType#getRoutinesDependencies <em>Routines Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @see talendfile.TalendfilePackage#getProcessType()
 * @model extendedMetaData="name='Process_._type' kind='elementOnly'"
 * @generated
 */
public interface ProcessType extends EObject {
    /**
     * Returns the value of the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Description</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Description</em>' attribute.
     * @see #setDescription(String)
     * @see talendfile.TalendfilePackage#getProcessType_Description()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
     * @generated
     */
    String getDescription();

    /**
     * Sets the value of the '{@link talendfile.ProcessType#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' attribute.
     * @see #getDescription()
     * @generated
     */
    void setDescription(String value);

    /**
     * Returns the value of the '<em><b>Required</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Required</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Required</em>' containment reference.
     * @see #setRequired(RequiredType)
     * @see talendfile.TalendfilePackage#getProcessType_Required()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='Required' namespace='##targetNamespace'"
     * @generated
     */
    RequiredType getRequired();

    /**
     * Sets the value of the '{@link talendfile.ProcessType#getRequired <em>Required</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Required</em>' containment reference.
     * @see #getRequired()
     * @generated
     */
    void setRequired(RequiredType value);

    /**
     * Returns the value of the '<em><b>Context</b></em>' containment reference list.
     * The list contents are of type {@link talendfile.ContextType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context</em>' containment reference list.
     * @see talendfile.TalendfilePackage#getProcessType_Context()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='Context' namespace='##targetNamespace'"
     * @generated
     */
    EList<ContextType> getContext();

    /**
     * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parameters</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parameters</em>' containment reference.
     * @see #setParameters(ParametersType)
     * @see talendfile.TalendfilePackage#getProcessType_Parameters()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='Parameters' namespace='##targetNamespace'"
     * @generated
     */
    ParametersType getParameters();

    /**
     * Sets the value of the '{@link talendfile.ProcessType#getParameters <em>Parameters</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parameters</em>' containment reference.
     * @see #getParameters()
     * @generated
     */
    void setParameters(ParametersType value);

    /**
     * Returns the value of the '<em><b>Node</b></em>' containment reference list.
     * The list contents are of type {@link talendfile.NodeType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Node</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Node</em>' containment reference list.
     * @see talendfile.TalendfilePackage#getProcessType_Node()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='Node' namespace='##targetNamespace'"
     * @generated
     */
    EList<NodeType> getNode();

    /**
     * Returns the value of the '<em><b>Connection</b></em>' containment reference list.
     * The list contents are of type {@link talendfile.ConnectionType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connection</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connection</em>' containment reference list.
     * @see talendfile.TalendfilePackage#getProcessType_Connection()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='Connection' namespace='##targetNamespace'"
     * @generated
     */
    EList<ConnectionType> getConnection();

    /**
     * Returns the value of the '<em><b>Note</b></em>' containment reference list.
     * The list contents are of type {@link talendfile.NoteType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Note</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Note</em>' containment reference list.
     * @see talendfile.TalendfilePackage#getProcessType_Note()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='Note' namespace='##targetNamespace'"
     * @generated
     */
    EList<NoteType> getNote();

    /**
     * Returns the value of the '<em><b>Logs</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Logs</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Logs</em>' containment reference.
     * @see #setLogs(LogsType)
     * @see talendfile.TalendfilePackage#getProcessType_Logs()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='Logs' namespace='##targetNamespace'"
     * @generated
     */
    LogsType getLogs();

    /**
     * Sets the value of the '{@link talendfile.ProcessType#getLogs <em>Logs</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Logs</em>' containment reference.
     * @see #getLogs()
     * @generated
     */
    void setLogs(LogsType value);

    /**
     * Returns the value of the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Author</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Author</em>' attribute.
     * @see #setAuthor(String)
     * @see talendfile.TalendfilePackage#getProcessType_Author()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='author' namespace='##targetNamespace'"
     * @generated
     */
    String getAuthor();

    /**
     * Sets the value of the '{@link talendfile.ProcessType#getAuthor <em>Author</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Author</em>' attribute.
     * @see #getAuthor()
     * @generated
     */
    void setAuthor(String value);

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
     * @see talendfile.TalendfilePackage#getProcessType_Comment()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='comment' namespace='##targetNamespace'"
     * @generated
     */
    String getComment();

    /**
     * Sets the value of the '{@link talendfile.ProcessType#getComment <em>Comment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Comment</em>' attribute.
     * @see #getComment()
     * @generated
     */
    void setComment(String value);

    /**
     * Returns the value of the '<em><b>Default Context</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Default Context</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default Context</em>' attribute.
     * @see #setDefaultContext(String)
     * @see talendfile.TalendfilePackage#getProcessType_DefaultContext()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='defaultContext' namespace='##targetNamespace'"
     * @generated
     */
    String getDefaultContext();

    /**
     * Sets the value of the '{@link talendfile.ProcessType#getDefaultContext <em>Default Context</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default Context</em>' attribute.
     * @see #getDefaultContext()
     * @generated
     */
    void setDefaultContext(String value);

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
     * @see talendfile.TalendfilePackage#getProcessType_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link talendfile.ProcessType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Purpose</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Purpose</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Purpose</em>' attribute.
     * @see #setPurpose(String)
     * @see talendfile.TalendfilePackage#getProcessType_Purpose()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='purpose' namespace='##targetNamespace'"
     * @generated
     */
    String getPurpose();

    /**
     * Sets the value of the '{@link talendfile.ProcessType#getPurpose <em>Purpose</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Purpose</em>' attribute.
     * @see #getPurpose()
     * @generated
     */
    void setPurpose(String value);

    /**
     * Returns the value of the '<em><b>Repository Context Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Repository Context Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Repository Context Id</em>' attribute.
     * @see #setRepositoryContextId(String)
     * @see talendfile.TalendfilePackage#getProcessType_RepositoryContextId()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='repositoryContextId' namespace='##targetNamespace'"
     * @generated
     */
    String getRepositoryContextId();

    /**
     * Sets the value of the '{@link talendfile.ProcessType#getRepositoryContextId <em>Repository Context Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Repository Context Id</em>' attribute.
     * @see #getRepositoryContextId()
     * @generated
     */
    void setRepositoryContextId(String value);

    /**
     * Returns the value of the '<em><b>Status</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Status</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Status</em>' attribute.
     * @see #setStatus(String)
     * @see talendfile.TalendfilePackage#getProcessType_Status()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='status' namespace='##targetNamespace'"
     * @generated
     */
    String getStatus();

    /**
     * Sets the value of the '{@link talendfile.ProcessType#getStatus <em>Status</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Status</em>' attribute.
     * @see #getStatus()
     * @generated
     */
    void setStatus(String value);

    /**
     * Returns the value of the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Version</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Version</em>' attribute.
     * @see #setVersion(String)
     * @see talendfile.TalendfilePackage#getProcessType_Version()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='version' namespace='##targetNamespace'"
     * @generated
     */
    String getVersion();

    /**
     * Sets the value of the '{@link talendfile.ProcessType#getVersion <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Version</em>' attribute.
     * @see #getVersion()
     * @generated
     */
    void setVersion(String value);

    /**
     * Returns the value of the '<em><b>Subjob</b></em>' containment reference list.
     * The list contents are of type {@link talendfile.SubjobType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Subjob</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Subjob</em>' containment reference list.
     * @see talendfile.TalendfilePackage#getProcessType_Subjob()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='Subjob' namespace='##targetNamespace'"
     * @generated
     */
    EList<SubjobType> getSubjob();

    /**
     * Returns the value of the '<em><b>Screenshot</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Screenshot</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Screenshot</em>' attribute.
     * @see #setScreenshot(byte[])
     * @see talendfile.TalendfilePackage#getProcessType_Screenshot()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
     * @generated
     */
    byte[] getScreenshot();

    /**
     * Sets the value of the '{@link talendfile.ProcessType#getScreenshot <em>Screenshot</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Screenshot</em>' attribute.
     * @see #getScreenshot()
     * @generated
     */
    void setScreenshot(byte[] value);

    /**
     * Returns the value of the '<em><b>Routines Dependencies</b></em>' containment reference list.
     * The list contents are of type {@link talendfile.ItemInforType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Routines Dependencies</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Routines Dependencies</em>' containment reference list.
     * @see talendfile.TalendfilePackage#getProcessType_RoutinesDependencies()
     * @model containment="true"
     * @generated
     */
    EList<ItemInforType> getRoutinesDependencies();

} // ProcessType
