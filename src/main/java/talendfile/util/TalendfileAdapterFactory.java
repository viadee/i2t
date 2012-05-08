/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package talendfile.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import talendfile.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see talendfile.TalendfilePackage
 * @generated
 */
public class TalendfileAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static TalendfilePackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TalendfileAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = TalendfilePackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TalendfileSwitch<Adapter> modelSwitch =
        new TalendfileSwitch<Adapter>() {
            @Override
            public Adapter caseColumnType(ColumnType object) {
                return createColumnTypeAdapter();
            }
            @Override
            public Adapter caseConnectionType(ConnectionType object) {
                return createConnectionTypeAdapter();
            }
            @Override
            public Adapter caseContextParameterType(ContextParameterType object) {
                return createContextParameterTypeAdapter();
            }
            @Override
            public Adapter caseContextType(ContextType object) {
                return createContextTypeAdapter();
            }
            @Override
            public Adapter caseDocumentRoot(DocumentRoot object) {
                return createDocumentRootAdapter();
            }
            @Override
            public Adapter caseElementParameterType(ElementParameterType object) {
                return createElementParameterTypeAdapter();
            }
            @Override
            public Adapter caseElementValueType(ElementValueType object) {
                return createElementValueTypeAdapter();
            }
            @Override
            public Adapter caseJobType(JobType object) {
                return createJobTypeAdapter();
            }
            @Override
            public Adapter caseLogsType(LogsType object) {
                return createLogsTypeAdapter();
            }
            @Override
            public Adapter caseLogToDatabaseType(LogToDatabaseType object) {
                return createLogToDatabaseTypeAdapter();
            }
            @Override
            public Adapter caseLogToFileType(LogToFileType object) {
                return createLogToFileTypeAdapter();
            }
            @Override
            public Adapter caseLogToStdOutType(LogToStdOutType object) {
                return createLogToStdOutTypeAdapter();
            }
            @Override
            public Adapter caseMetadataType(MetadataType object) {
                return createMetadataTypeAdapter();
            }
            @Override
            public Adapter caseNodeType(NodeType object) {
                return createNodeTypeAdapter();
            }
            @Override
            public Adapter caseNoteType(NoteType object) {
                return createNoteTypeAdapter();
            }
            @Override
            public Adapter caseParametersType(ParametersType object) {
                return createParametersTypeAdapter();
            }
            @Override
            public Adapter caseProcessType(ProcessType object) {
                return createProcessTypeAdapter();
            }
            @Override
            public Adapter caseRequiredType(RequiredType object) {
                return createRequiredTypeAdapter();
            }
            @Override
            public Adapter caseSubjobType(SubjobType object) {
                return createSubjobTypeAdapter();
            }
            @Override
            public Adapter caseItemInforType(ItemInforType object) {
                return createItemInforTypeAdapter();
            }
            @Override
            public Adapter caseAbstractExternalData(AbstractExternalData object) {
                return createAbstractExternalDataAdapter();
            }
            @Override
            public Adapter caseRoutinesParameterType(RoutinesParameterType object) {
                return createRoutinesParameterTypeAdapter();
            }
            @Override
            public Adapter caseNodeContainerType(NodeContainerType object) {
                return createNodeContainerTypeAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link talendfile.ColumnType <em>Column Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see talendfile.ColumnType
     * @generated
     */
    public Adapter createColumnTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link talendfile.ConnectionType <em>Connection Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see talendfile.ConnectionType
     * @generated
     */
    public Adapter createConnectionTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link talendfile.ContextParameterType <em>Context Parameter Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see talendfile.ContextParameterType
     * @generated
     */
    public Adapter createContextParameterTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link talendfile.ContextType <em>Context Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see talendfile.ContextType
     * @generated
     */
    public Adapter createContextTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link talendfile.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see talendfile.DocumentRoot
     * @generated
     */
    public Adapter createDocumentRootAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link talendfile.ElementParameterType <em>Element Parameter Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see talendfile.ElementParameterType
     * @generated
     */
    public Adapter createElementParameterTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link talendfile.ElementValueType <em>Element Value Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see talendfile.ElementValueType
     * @generated
     */
    public Adapter createElementValueTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link talendfile.JobType <em>Job Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see talendfile.JobType
     * @generated
     */
    public Adapter createJobTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link talendfile.LogsType <em>Logs Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see talendfile.LogsType
     * @generated
     */
    public Adapter createLogsTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link talendfile.LogToDatabaseType <em>Log To Database Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see talendfile.LogToDatabaseType
     * @generated
     */
    public Adapter createLogToDatabaseTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link talendfile.LogToFileType <em>Log To File Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see talendfile.LogToFileType
     * @generated
     */
    public Adapter createLogToFileTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link talendfile.LogToStdOutType <em>Log To Std Out Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see talendfile.LogToStdOutType
     * @generated
     */
    public Adapter createLogToStdOutTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link talendfile.MetadataType <em>Metadata Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see talendfile.MetadataType
     * @generated
     */
    public Adapter createMetadataTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link talendfile.NodeType <em>Node Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see talendfile.NodeType
     * @generated
     */
    public Adapter createNodeTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link talendfile.NoteType <em>Note Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see talendfile.NoteType
     * @generated
     */
    public Adapter createNoteTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link talendfile.ParametersType <em>Parameters Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see talendfile.ParametersType
     * @generated
     */
    public Adapter createParametersTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link talendfile.ProcessType <em>Process Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see talendfile.ProcessType
     * @generated
     */
    public Adapter createProcessTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link talendfile.RequiredType <em>Required Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see talendfile.RequiredType
     * @generated
     */
    public Adapter createRequiredTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link talendfile.SubjobType <em>Subjob Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see talendfile.SubjobType
     * @generated
     */
    public Adapter createSubjobTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link talendfile.ItemInforType <em>Item Infor Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see talendfile.ItemInforType
     * @generated
     */
    public Adapter createItemInforTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link talendfile.AbstractExternalData <em>Abstract External Data</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see talendfile.AbstractExternalData
     * @generated
     */
    public Adapter createAbstractExternalDataAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link talendfile.RoutinesParameterType <em>Routines Parameter Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see talendfile.RoutinesParameterType
     * @generated
     */
    public Adapter createRoutinesParameterTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link talendfile.NodeContainerType <em>Node Container Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see talendfile.NodeContainerType
     * @generated
     */
    public Adapter createNodeContainerTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //TalendfileAdapterFactory
