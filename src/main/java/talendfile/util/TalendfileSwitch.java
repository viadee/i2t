/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package talendfile.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import talendfile.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see talendfile.TalendfilePackage
 * @generated
 */
public class TalendfileSwitch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static TalendfilePackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TalendfileSwitch() {
        if (modelPackage == null) {
            modelPackage = TalendfilePackage.eINSTANCE;
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    public T doSwitch(EObject theEObject) {
        return doSwitch(theEObject.eClass(), theEObject);
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected T doSwitch(EClass theEClass, EObject theEObject) {
        if (theEClass.eContainer() == modelPackage) {
            return doSwitch(theEClass.getClassifierID(), theEObject);
        }
        else {
            List<EClass> eSuperTypes = theEClass.getESuperTypes();
            return
                eSuperTypes.isEmpty() ?
                    defaultCase(theEObject) :
                    doSwitch(eSuperTypes.get(0), theEObject);
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case TalendfilePackage.COLUMN_TYPE: {
                ColumnType columnType = (ColumnType)theEObject;
                T result = caseColumnType(columnType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TalendfilePackage.CONNECTION_TYPE: {
                ConnectionType connectionType = (ConnectionType)theEObject;
                T result = caseConnectionType(connectionType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TalendfilePackage.CONTEXT_PARAMETER_TYPE: {
                ContextParameterType contextParameterType = (ContextParameterType)theEObject;
                T result = caseContextParameterType(contextParameterType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TalendfilePackage.CONTEXT_TYPE: {
                ContextType contextType = (ContextType)theEObject;
                T result = caseContextType(contextType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TalendfilePackage.DOCUMENT_ROOT: {
                DocumentRoot documentRoot = (DocumentRoot)theEObject;
                T result = caseDocumentRoot(documentRoot);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TalendfilePackage.ELEMENT_PARAMETER_TYPE: {
                ElementParameterType elementParameterType = (ElementParameterType)theEObject;
                T result = caseElementParameterType(elementParameterType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TalendfilePackage.ELEMENT_VALUE_TYPE: {
                ElementValueType elementValueType = (ElementValueType)theEObject;
                T result = caseElementValueType(elementValueType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TalendfilePackage.JOB_TYPE: {
                JobType jobType = (JobType)theEObject;
                T result = caseJobType(jobType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TalendfilePackage.LOGS_TYPE: {
                LogsType logsType = (LogsType)theEObject;
                T result = caseLogsType(logsType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TalendfilePackage.LOG_TO_DATABASE_TYPE: {
                LogToDatabaseType logToDatabaseType = (LogToDatabaseType)theEObject;
                T result = caseLogToDatabaseType(logToDatabaseType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TalendfilePackage.LOG_TO_FILE_TYPE: {
                LogToFileType logToFileType = (LogToFileType)theEObject;
                T result = caseLogToFileType(logToFileType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TalendfilePackage.LOG_TO_STD_OUT_TYPE: {
                LogToStdOutType logToStdOutType = (LogToStdOutType)theEObject;
                T result = caseLogToStdOutType(logToStdOutType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TalendfilePackage.METADATA_TYPE: {
                MetadataType metadataType = (MetadataType)theEObject;
                T result = caseMetadataType(metadataType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TalendfilePackage.NODE_TYPE: {
                NodeType nodeType = (NodeType)theEObject;
                T result = caseNodeType(nodeType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TalendfilePackage.NOTE_TYPE: {
                NoteType noteType = (NoteType)theEObject;
                T result = caseNoteType(noteType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TalendfilePackage.PARAMETERS_TYPE: {
                ParametersType parametersType = (ParametersType)theEObject;
                T result = caseParametersType(parametersType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TalendfilePackage.PROCESS_TYPE: {
                ProcessType processType = (ProcessType)theEObject;
                T result = caseProcessType(processType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TalendfilePackage.REQUIRED_TYPE: {
                RequiredType requiredType = (RequiredType)theEObject;
                T result = caseRequiredType(requiredType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TalendfilePackage.SUBJOB_TYPE: {
                SubjobType subjobType = (SubjobType)theEObject;
                T result = caseSubjobType(subjobType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TalendfilePackage.ITEM_INFOR_TYPE: {
                ItemInforType itemInforType = (ItemInforType)theEObject;
                T result = caseItemInforType(itemInforType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TalendfilePackage.ABSTRACT_EXTERNAL_DATA: {
                AbstractExternalData abstractExternalData = (AbstractExternalData)theEObject;
                T result = caseAbstractExternalData(abstractExternalData);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TalendfilePackage.ROUTINES_PARAMETER_TYPE: {
                RoutinesParameterType routinesParameterType = (RoutinesParameterType)theEObject;
                T result = caseRoutinesParameterType(routinesParameterType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TalendfilePackage.NODE_CONTAINER_TYPE: {
                NodeContainerType nodeContainerType = (NodeContainerType)theEObject;
                T result = caseNodeContainerType(nodeContainerType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Column Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Column Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseColumnType(ColumnType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Connection Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Connection Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConnectionType(ConnectionType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Context Parameter Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Context Parameter Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseContextParameterType(ContextParameterType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Context Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Context Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseContextType(ContextType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDocumentRoot(DocumentRoot object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Element Parameter Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Element Parameter Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseElementParameterType(ElementParameterType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Element Value Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Element Value Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseElementValueType(ElementValueType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Job Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Job Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseJobType(JobType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Logs Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Logs Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLogsType(LogsType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Log To Database Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Log To Database Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLogToDatabaseType(LogToDatabaseType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Log To File Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Log To File Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLogToFileType(LogToFileType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Log To Std Out Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Log To Std Out Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLogToStdOutType(LogToStdOutType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Metadata Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Metadata Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMetadataType(MetadataType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Node Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNodeType(NodeType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Note Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Note Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNoteType(NoteType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Parameters Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Parameters Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseParametersType(ParametersType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Process Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Process Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProcessType(ProcessType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Required Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Required Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRequiredType(RequiredType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Subjob Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Subjob Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSubjobType(SubjobType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Item Infor Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Item Infor Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseItemInforType(ItemInforType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract External Data</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract External Data</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractExternalData(AbstractExternalData object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Routines Parameter Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Routines Parameter Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRoutinesParameterType(RoutinesParameterType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Node Container Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node Container Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNodeContainerType(NodeContainerType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    public T defaultCase(EObject object) {
        return null;
    }

} //TalendfileSwitch
