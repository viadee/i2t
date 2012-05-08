/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package talendfile.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import talendfile.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TalendfileFactoryImpl extends EFactoryImpl implements TalendfileFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static TalendfileFactory init() {
        try {
            TalendfileFactory theTalendfileFactory = (TalendfileFactory)EPackage.Registry.INSTANCE.getEFactory("platform:/resource/org.talend.model/model/TalendFile.xsd"); 
            if (theTalendfileFactory != null) {
                return theTalendfileFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new TalendfileFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TalendfileFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case TalendfilePackage.COLUMN_TYPE: return createColumnType();
            case TalendfilePackage.CONNECTION_TYPE: return createConnectionType();
            case TalendfilePackage.CONTEXT_PARAMETER_TYPE: return createContextParameterType();
            case TalendfilePackage.CONTEXT_TYPE: return createContextType();
            case TalendfilePackage.DOCUMENT_ROOT: return createDocumentRoot();
            case TalendfilePackage.ELEMENT_PARAMETER_TYPE: return createElementParameterType();
            case TalendfilePackage.ELEMENT_VALUE_TYPE: return createElementValueType();
            case TalendfilePackage.JOB_TYPE: return createJobType();
            case TalendfilePackage.LOGS_TYPE: return createLogsType();
            case TalendfilePackage.LOG_TO_DATABASE_TYPE: return createLogToDatabaseType();
            case TalendfilePackage.LOG_TO_FILE_TYPE: return createLogToFileType();
            case TalendfilePackage.LOG_TO_STD_OUT_TYPE: return createLogToStdOutType();
            case TalendfilePackage.METADATA_TYPE: return createMetadataType();
            case TalendfilePackage.NODE_TYPE: return createNodeType();
            case TalendfilePackage.NOTE_TYPE: return createNoteType();
            case TalendfilePackage.PARAMETERS_TYPE: return createParametersType();
            case TalendfilePackage.PROCESS_TYPE: return createProcessType();
            case TalendfilePackage.REQUIRED_TYPE: return createRequiredType();
            case TalendfilePackage.SUBJOB_TYPE: return createSubjobType();
            case TalendfilePackage.ITEM_INFOR_TYPE: return createItemInforType();
            case TalendfilePackage.ROUTINES_PARAMETER_TYPE: return createRoutinesParameterType();
            case TalendfilePackage.NODE_CONTAINER_TYPE: return createNodeContainerType();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ColumnType createColumnType() {
        ColumnTypeImpl columnType = new ColumnTypeImpl();
        return columnType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConnectionType createConnectionType() {
        ConnectionTypeImpl connectionType = new ConnectionTypeImpl();
        return connectionType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextParameterType createContextParameterType() {
        ContextParameterTypeImpl contextParameterType = new ContextParameterTypeImpl();
        return contextParameterType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextType createContextType() {
        ContextTypeImpl contextType = new ContextTypeImpl();
        return contextType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DocumentRoot createDocumentRoot() {
        DocumentRootImpl documentRoot = new DocumentRootImpl();
        return documentRoot;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ElementParameterType createElementParameterType() {
        ElementParameterTypeImpl elementParameterType = new ElementParameterTypeImpl();
        return elementParameterType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ElementValueType createElementValueType() {
        ElementValueTypeImpl elementValueType = new ElementValueTypeImpl();
        return elementValueType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JobType createJobType() {
        JobTypeImpl jobType = new JobTypeImpl();
        return jobType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LogsType createLogsType() {
        LogsTypeImpl logsType = new LogsTypeImpl();
        return logsType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LogToDatabaseType createLogToDatabaseType() {
        LogToDatabaseTypeImpl logToDatabaseType = new LogToDatabaseTypeImpl();
        return logToDatabaseType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LogToFileType createLogToFileType() {
        LogToFileTypeImpl logToFileType = new LogToFileTypeImpl();
        return logToFileType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LogToStdOutType createLogToStdOutType() {
        LogToStdOutTypeImpl logToStdOutType = new LogToStdOutTypeImpl();
        return logToStdOutType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MetadataType createMetadataType() {
        MetadataTypeImpl metadataType = new MetadataTypeImpl();
        return metadataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NodeType createNodeType() {
        NodeTypeImpl nodeType = new NodeTypeImpl();
        return nodeType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NoteType createNoteType() {
        NoteTypeImpl noteType = new NoteTypeImpl();
        return noteType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParametersType createParametersType() {
        ParametersTypeImpl parametersType = new ParametersTypeImpl();
        return parametersType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessType createProcessType() {
        ProcessTypeImpl processType = new ProcessTypeImpl();
        return processType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RequiredType createRequiredType() {
        RequiredTypeImpl requiredType = new RequiredTypeImpl();
        return requiredType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SubjobType createSubjobType() {
        SubjobTypeImpl subjobType = new SubjobTypeImpl();
        return subjobType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ItemInforType createItemInforType() {
        ItemInforTypeImpl itemInforType = new ItemInforTypeImpl();
        return itemInforType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RoutinesParameterType createRoutinesParameterType() {
        RoutinesParameterTypeImpl routinesParameterType = new RoutinesParameterTypeImpl();
        return routinesParameterType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NodeContainerType createNodeContainerType() {
        NodeContainerTypeImpl nodeContainerType = new NodeContainerTypeImpl();
        return nodeContainerType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TalendfilePackage getTalendfilePackage() {
        return (TalendfilePackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static TalendfilePackage getPackage() {
        return TalendfilePackage.eINSTANCE;
    }

} //TalendfileFactoryImpl
