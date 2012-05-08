/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package talendfile;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see talendfile.TalendfileFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface TalendfilePackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "talendfile";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "platform:/resource/org.talend.model/model/TalendFile.xsd";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "talendfile";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TalendfilePackage eINSTANCE = talendfile.impl.TalendfilePackageImpl.init();

    /**
     * The meta object id for the '{@link talendfile.impl.ColumnTypeImpl <em>Column Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see talendfile.impl.ColumnTypeImpl
     * @see talendfile.impl.TalendfilePackageImpl#getColumnType()
     * @generated
     */
    int COLUMN_TYPE = 0;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_TYPE__COMMENT = 0;

    /**
     * The feature id for the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_TYPE__DEFAULT_VALUE = 1;

    /**
     * The feature id for the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_TYPE__KEY = 2;

    /**
     * The feature id for the '<em><b>Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_TYPE__LENGTH = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_TYPE__NAME = 4;

    /**
     * The feature id for the '<em><b>Nullable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_TYPE__NULLABLE = 5;

    /**
     * The feature id for the '<em><b>Original Db Column Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_TYPE__ORIGINAL_DB_COLUMN_NAME = 6;

    /**
     * The feature id for the '<em><b>Pattern</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_TYPE__PATTERN = 7;

    /**
     * The feature id for the '<em><b>Precision</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_TYPE__PRECISION = 8;

    /**
     * The feature id for the '<em><b>Source Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_TYPE__SOURCE_TYPE = 9;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_TYPE__TYPE = 10;

    /**
     * The feature id for the '<em><b>Related Entity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_TYPE__RELATED_ENTITY = 11;

    /**
     * The feature id for the '<em><b>Relationship Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_TYPE__RELATIONSHIP_TYPE = 12;

    /**
     * The number of structural features of the '<em>Column Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_TYPE_FEATURE_COUNT = 13;

    /**
     * The meta object id for the '{@link talendfile.impl.ConnectionTypeImpl <em>Connection Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see talendfile.impl.ConnectionTypeImpl
     * @see talendfile.impl.TalendfilePackageImpl#getConnectionType()
     * @generated
     */
    int CONNECTION_TYPE = 1;

    /**
     * The feature id for the '<em><b>Element Parameter</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_TYPE__ELEMENT_PARAMETER = 0;

    /**
     * The feature id for the '<em><b>Connector Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_TYPE__CONNECTOR_NAME = 1;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_TYPE__LABEL = 2;

    /**
     * The feature id for the '<em><b>Line Style</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_TYPE__LINE_STYLE = 3;

    /**
     * The feature id for the '<em><b>Merge Order</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_TYPE__MERGE_ORDER = 4;

    /**
     * The feature id for the '<em><b>Metaname</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_TYPE__METANAME = 5;

    /**
     * The feature id for the '<em><b>Offset Label X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_TYPE__OFFSET_LABEL_X = 6;

    /**
     * The feature id for the '<em><b>Offset Label Y</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_TYPE__OFFSET_LABEL_Y = 7;

    /**
     * The feature id for the '<em><b>Output Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_TYPE__OUTPUT_ID = 8;

    /**
     * The feature id for the '<em><b>Source</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_TYPE__SOURCE = 9;

    /**
     * The feature id for the '<em><b>Target</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_TYPE__TARGET = 10;

    /**
     * The number of structural features of the '<em>Connection Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_TYPE_FEATURE_COUNT = 11;

    /**
     * The meta object id for the '{@link talendfile.impl.ContextParameterTypeImpl <em>Context Parameter Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see talendfile.impl.ContextParameterTypeImpl
     * @see talendfile.impl.TalendfilePackageImpl#getContextParameterType()
     * @generated
     */
    int CONTEXT_PARAMETER_TYPE = 2;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_PARAMETER_TYPE__COMMENT = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_PARAMETER_TYPE__NAME = 1;

    /**
     * The feature id for the '<em><b>Prompt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_PARAMETER_TYPE__PROMPT = 2;

    /**
     * The feature id for the '<em><b>Prompt Needed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_PARAMETER_TYPE__PROMPT_NEEDED = 3;

    /**
     * The feature id for the '<em><b>Repository Context Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_PARAMETER_TYPE__REPOSITORY_CONTEXT_ID = 4;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_PARAMETER_TYPE__TYPE = 5;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_PARAMETER_TYPE__VALUE = 6;

    /**
     * The number of structural features of the '<em>Context Parameter Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_PARAMETER_TYPE_FEATURE_COUNT = 7;

    /**
     * The meta object id for the '{@link talendfile.impl.ContextTypeImpl <em>Context Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see talendfile.impl.ContextTypeImpl
     * @see talendfile.impl.TalendfilePackageImpl#getContextType()
     * @generated
     */
    int CONTEXT_TYPE = 3;

    /**
     * The feature id for the '<em><b>Context Parameter</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_TYPE__CONTEXT_PARAMETER = 0;

    /**
     * The feature id for the '<em><b>Confirmation Needed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_TYPE__CONFIRMATION_NEEDED = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_TYPE__NAME = 2;

    /**
     * The number of structural features of the '<em>Context Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_TYPE_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link talendfile.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see talendfile.impl.DocumentRootImpl
     * @see talendfile.impl.TalendfilePackageImpl#getDocumentRoot()
     * @generated
     */
    int DOCUMENT_ROOT = 4;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MIXED = 0;

    /**
     * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

    /**
     * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

    /**
     * The feature id for the '<em><b>Connection</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CONNECTION = 3;

    /**
     * The feature id for the '<em><b>Context</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CONTEXT = 4;

    /**
     * The feature id for the '<em><b>Element Parameter</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ELEMENT_PARAMETER = 5;

    /**
     * The feature id for the '<em><b>Node</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__NODE = 6;

    /**
     * The feature id for the '<em><b>Note</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__NOTE = 7;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PARAMETERS = 8;

    /**
     * The feature id for the '<em><b>Process</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PROCESS = 9;

    /**
     * The feature id for the '<em><b>Required</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__REQUIRED = 10;

    /**
     * The feature id for the '<em><b>Subjob</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SUBJOB = 11;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_FEATURE_COUNT = 12;

    /**
     * The meta object id for the '{@link talendfile.impl.ElementParameterTypeImpl <em>Element Parameter Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see talendfile.impl.ElementParameterTypeImpl
     * @see talendfile.impl.TalendfilePackageImpl#getElementParameterType()
     * @generated
     */
    int ELEMENT_PARAMETER_TYPE = 5;

    /**
     * The feature id for the '<em><b>Element Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_PARAMETER_TYPE__ELEMENT_VALUE = 0;

    /**
     * The feature id for the '<em><b>Field</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_PARAMETER_TYPE__FIELD = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_PARAMETER_TYPE__NAME = 2;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_PARAMETER_TYPE__VALUE = 3;

    /**
     * The feature id for the '<em><b>Context Mode</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_PARAMETER_TYPE__CONTEXT_MODE = 4;

    /**
     * The number of structural features of the '<em>Element Parameter Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_PARAMETER_TYPE_FEATURE_COUNT = 5;

    /**
     * The meta object id for the '{@link talendfile.impl.ElementValueTypeImpl <em>Element Value Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see talendfile.impl.ElementValueTypeImpl
     * @see talendfile.impl.TalendfilePackageImpl#getElementValueType()
     * @generated
     */
    int ELEMENT_VALUE_TYPE = 6;

    /**
     * The feature id for the '<em><b>Element Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_VALUE_TYPE__ELEMENT_REF = 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_VALUE_TYPE__VALUE = 1;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_VALUE_TYPE__TYPE = 2;

    /**
     * The number of structural features of the '<em>Element Value Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_VALUE_TYPE_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link talendfile.impl.JobTypeImpl <em>Job Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see talendfile.impl.JobTypeImpl
     * @see talendfile.impl.TalendfilePackageImpl#getJobType()
     * @generated
     */
    int JOB_TYPE = 7;

    /**
     * The feature id for the '<em><b>Context</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOB_TYPE__CONTEXT = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOB_TYPE__NAME = 1;

    /**
     * The number of structural features of the '<em>Job Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOB_TYPE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link talendfile.impl.LogsTypeImpl <em>Logs Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see talendfile.impl.LogsTypeImpl
     * @see talendfile.impl.TalendfilePackageImpl#getLogsType()
     * @generated
     */
    int LOGS_TYPE = 8;

    /**
     * The feature id for the '<em><b>Log To File</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGS_TYPE__LOG_TO_FILE = 0;

    /**
     * The feature id for the '<em><b>Log To Database</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGS_TYPE__LOG_TO_DATABASE = 1;

    /**
     * The feature id for the '<em><b>Log To Std Out</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGS_TYPE__LOG_TO_STD_OUT = 2;

    /**
     * The number of structural features of the '<em>Logs Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGS_TYPE_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link talendfile.impl.LogToDatabaseTypeImpl <em>Log To Database Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see talendfile.impl.LogToDatabaseTypeImpl
     * @see talendfile.impl.TalendfilePackageImpl#getLogToDatabaseType()
     * @generated
     */
    int LOG_TO_DATABASE_TYPE = 9;

    /**
     * The feature id for the '<em><b>Database</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_TO_DATABASE_TYPE__DATABASE = 0;

    /**
     * The feature id for the '<em><b>Level</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_TO_DATABASE_TYPE__LEVEL = 1;

    /**
     * The feature id for the '<em><b>Selected</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_TO_DATABASE_TYPE__SELECTED = 2;

    /**
     * The number of structural features of the '<em>Log To Database Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_TO_DATABASE_TYPE_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link talendfile.impl.LogToFileTypeImpl <em>Log To File Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see talendfile.impl.LogToFileTypeImpl
     * @see talendfile.impl.TalendfilePackageImpl#getLogToFileType()
     * @generated
     */
    int LOG_TO_FILE_TYPE = 10;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_TO_FILE_TYPE__FILENAME = 0;

    /**
     * The feature id for the '<em><b>Level</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_TO_FILE_TYPE__LEVEL = 1;

    /**
     * The feature id for the '<em><b>Selected</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_TO_FILE_TYPE__SELECTED = 2;

    /**
     * The number of structural features of the '<em>Log To File Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_TO_FILE_TYPE_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link talendfile.impl.LogToStdOutTypeImpl <em>Log To Std Out Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see talendfile.impl.LogToStdOutTypeImpl
     * @see talendfile.impl.TalendfilePackageImpl#getLogToStdOutType()
     * @generated
     */
    int LOG_TO_STD_OUT_TYPE = 11;

    /**
     * The feature id for the '<em><b>Level</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_TO_STD_OUT_TYPE__LEVEL = 0;

    /**
     * The feature id for the '<em><b>Selected</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_TO_STD_OUT_TYPE__SELECTED = 1;

    /**
     * The number of structural features of the '<em>Log To Std Out Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_TO_STD_OUT_TYPE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link talendfile.impl.MetadataTypeImpl <em>Metadata Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see talendfile.impl.MetadataTypeImpl
     * @see talendfile.impl.TalendfilePackageImpl#getMetadataType()
     * @generated
     */
    int METADATA_TYPE = 12;

    /**
     * The feature id for the '<em><b>Column</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TYPE__COLUMN = 0;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TYPE__COMMENT = 1;

    /**
     * The feature id for the '<em><b>Connector</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TYPE__CONNECTOR = 2;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TYPE__LABEL = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TYPE__NAME = 4;

    /**
     * The feature id for the '<em><b>Source</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TYPE__SOURCE = 5;

    /**
     * The number of structural features of the '<em>Metadata Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TYPE_FEATURE_COUNT = 6;

    /**
     * The meta object id for the '{@link talendfile.impl.NodeTypeImpl <em>Node Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see talendfile.impl.NodeTypeImpl
     * @see talendfile.impl.TalendfilePackageImpl#getNodeType()
     * @generated
     */
    int NODE_TYPE = 13;

    /**
     * The feature id for the '<em><b>Element Parameter</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_TYPE__ELEMENT_PARAMETER = 0;

    /**
     * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_TYPE__METADATA = 1;

    /**
     * The feature id for the '<em><b>Binary Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_TYPE__BINARY_DATA = 2;

    /**
     * The feature id for the '<em><b>String Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_TYPE__STRING_DATA = 3;

    /**
     * The feature id for the '<em><b>Component Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_TYPE__COMPONENT_NAME = 4;

    /**
     * The feature id for the '<em><b>Component Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_TYPE__COMPONENT_VERSION = 5;

    /**
     * The feature id for the '<em><b>Offset Label X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_TYPE__OFFSET_LABEL_X = 6;

    /**
     * The feature id for the '<em><b>Offset Label Y</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_TYPE__OFFSET_LABEL_Y = 7;

    /**
     * The feature id for the '<em><b>Pos X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_TYPE__POS_X = 8;

    /**
     * The feature id for the '<em><b>Pos Y</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_TYPE__POS_Y = 9;

    /**
     * The feature id for the '<em><b>Size X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_TYPE__SIZE_X = 10;

    /**
     * The feature id for the '<em><b>Size Y</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_TYPE__SIZE_Y = 11;

    /**
     * The feature id for the '<em><b>Screenshot</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_TYPE__SCREENSHOT = 12;

    /**
     * The feature id for the '<em><b>Node Data</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_TYPE__NODE_DATA = 13;

    /**
     * The feature id for the '<em><b>Node Container</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_TYPE__NODE_CONTAINER = 14;

    /**
     * The number of structural features of the '<em>Node Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_TYPE_FEATURE_COUNT = 15;

    /**
     * The meta object id for the '{@link talendfile.impl.NoteTypeImpl <em>Note Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see talendfile.impl.NoteTypeImpl
     * @see talendfile.impl.TalendfilePackageImpl#getNoteType()
     * @generated
     */
    int NOTE_TYPE = 14;

    /**
     * The feature id for the '<em><b>Opaque</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOTE_TYPE__OPAQUE = 0;

    /**
     * The feature id for the '<em><b>Pos X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOTE_TYPE__POS_X = 1;

    /**
     * The feature id for the '<em><b>Pos Y</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOTE_TYPE__POS_Y = 2;

    /**
     * The feature id for the '<em><b>Size Height</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOTE_TYPE__SIZE_HEIGHT = 3;

    /**
     * The feature id for the '<em><b>Size Width</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOTE_TYPE__SIZE_WIDTH = 4;

    /**
     * The feature id for the '<em><b>Text</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOTE_TYPE__TEXT = 5;

    /**
     * The feature id for the '<em><b>Element Parameter</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOTE_TYPE__ELEMENT_PARAMETER = 6;

    /**
     * The number of structural features of the '<em>Note Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOTE_TYPE_FEATURE_COUNT = 7;

    /**
     * The meta object id for the '{@link talendfile.impl.ParametersTypeImpl <em>Parameters Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see talendfile.impl.ParametersTypeImpl
     * @see talendfile.impl.TalendfilePackageImpl#getParametersType()
     * @generated
     */
    int PARAMETERS_TYPE = 15;

    /**
     * The feature id for the '<em><b>Element Parameter</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETERS_TYPE__ELEMENT_PARAMETER = 0;

    /**
     * The feature id for the '<em><b>Routines Parameter</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETERS_TYPE__ROUTINES_PARAMETER = 1;

    /**
     * The number of structural features of the '<em>Parameters Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETERS_TYPE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link talendfile.impl.ProcessTypeImpl <em>Process Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see talendfile.impl.ProcessTypeImpl
     * @see talendfile.impl.TalendfilePackageImpl#getProcessType()
     * @generated
     */
    int PROCESS_TYPE = 16;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_TYPE__DESCRIPTION = 0;

    /**
     * The feature id for the '<em><b>Required</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_TYPE__REQUIRED = 1;

    /**
     * The feature id for the '<em><b>Context</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_TYPE__CONTEXT = 2;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_TYPE__PARAMETERS = 3;

    /**
     * The feature id for the '<em><b>Node</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_TYPE__NODE = 4;

    /**
     * The feature id for the '<em><b>Connection</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_TYPE__CONNECTION = 5;

    /**
     * The feature id for the '<em><b>Note</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_TYPE__NOTE = 6;

    /**
     * The feature id for the '<em><b>Logs</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_TYPE__LOGS = 7;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_TYPE__AUTHOR = 8;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_TYPE__COMMENT = 9;

    /**
     * The feature id for the '<em><b>Default Context</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_TYPE__DEFAULT_CONTEXT = 10;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_TYPE__NAME = 11;

    /**
     * The feature id for the '<em><b>Purpose</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_TYPE__PURPOSE = 12;

    /**
     * The feature id for the '<em><b>Repository Context Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_TYPE__REPOSITORY_CONTEXT_ID = 13;

    /**
     * The feature id for the '<em><b>Status</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_TYPE__STATUS = 14;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_TYPE__VERSION = 15;

    /**
     * The feature id for the '<em><b>Subjob</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_TYPE__SUBJOB = 16;

    /**
     * The feature id for the '<em><b>Screenshot</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_TYPE__SCREENSHOT = 17;

    /**
     * The feature id for the '<em><b>Routines Dependencies</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_TYPE__ROUTINES_DEPENDENCIES = 18;

    /**
     * The number of structural features of the '<em>Process Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_TYPE_FEATURE_COUNT = 19;

    /**
     * The meta object id for the '{@link talendfile.impl.RequiredTypeImpl <em>Required Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see talendfile.impl.RequiredTypeImpl
     * @see talendfile.impl.TalendfilePackageImpl#getRequiredType()
     * @generated
     */
    int REQUIRED_TYPE = 17;

    /**
     * The feature id for the '<em><b>Job</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUIRED_TYPE__JOB = 0;

    /**
     * The number of structural features of the '<em>Required Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUIRED_TYPE_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link talendfile.impl.SubjobTypeImpl <em>Subjob Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see talendfile.impl.SubjobTypeImpl
     * @see talendfile.impl.TalendfilePackageImpl#getSubjobType()
     * @generated
     */
    int SUBJOB_TYPE = 18;

    /**
     * The feature id for the '<em><b>Element Parameter</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJOB_TYPE__ELEMENT_PARAMETER = 0;

    /**
     * The number of structural features of the '<em>Subjob Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJOB_TYPE_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link talendfile.impl.ItemInforTypeImpl <em>Item Infor Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see talendfile.impl.ItemInforTypeImpl
     * @see talendfile.impl.TalendfilePackageImpl#getItemInforType()
     * @generated
     */
    int ITEM_INFOR_TYPE = 19;

    /**
     * The feature id for the '<em><b>Id Or Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM_INFOR_TYPE__ID_OR_NAME = 0;

    /**
     * The feature id for the '<em><b>System</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM_INFOR_TYPE__SYSTEM = 1;

    /**
     * The number of structural features of the '<em>Item Infor Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM_INFOR_TYPE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link talendfile.impl.AbstractExternalDataImpl <em>Abstract External Data</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see talendfile.impl.AbstractExternalDataImpl
     * @see talendfile.impl.TalendfilePackageImpl#getAbstractExternalData()
     * @generated
     */
    int ABSTRACT_EXTERNAL_DATA = 20;

    /**
     * The number of structural features of the '<em>Abstract External Data</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_EXTERNAL_DATA_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link talendfile.impl.RoutinesParameterTypeImpl <em>Routines Parameter Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see talendfile.impl.RoutinesParameterTypeImpl
     * @see talendfile.impl.TalendfilePackageImpl#getRoutinesParameterType()
     * @generated
     */
    int ROUTINES_PARAMETER_TYPE = 21;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROUTINES_PARAMETER_TYPE__ID = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROUTINES_PARAMETER_TYPE__NAME = 1;

    /**
     * The number of structural features of the '<em>Routines Parameter Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROUTINES_PARAMETER_TYPE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link talendfile.impl.NodeContainerTypeImpl <em>Node Container Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see talendfile.impl.NodeContainerTypeImpl
     * @see talendfile.impl.TalendfilePackageImpl#getNodeContainerType()
     * @generated
     */
    int NODE_CONTAINER_TYPE = 22;

    /**
     * The feature id for the '<em><b>Element Parameter</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_CONTAINER_TYPE__ELEMENT_PARAMETER = 0;

    /**
     * The number of structural features of the '<em>Node Container Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_CONTAINER_TYPE_FEATURE_COUNT = 1;


    /**
     * Returns the meta object for class '{@link talendfile.ColumnType <em>Column Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Column Type</em>'.
     * @see talendfile.ColumnType
     * @generated
     */
    EClass getColumnType();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ColumnType#getComment <em>Comment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Comment</em>'.
     * @see talendfile.ColumnType#getComment()
     * @see #getColumnType()
     * @generated
     */
    EAttribute getColumnType_Comment();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ColumnType#getDefaultValue <em>Default Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Value</em>'.
     * @see talendfile.ColumnType#getDefaultValue()
     * @see #getColumnType()
     * @generated
     */
    EAttribute getColumnType_DefaultValue();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ColumnType#isKey <em>Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Key</em>'.
     * @see talendfile.ColumnType#isKey()
     * @see #getColumnType()
     * @generated
     */
    EAttribute getColumnType_Key();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ColumnType#getLength <em>Length</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Length</em>'.
     * @see talendfile.ColumnType#getLength()
     * @see #getColumnType()
     * @generated
     */
    EAttribute getColumnType_Length();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ColumnType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see talendfile.ColumnType#getName()
     * @see #getColumnType()
     * @generated
     */
    EAttribute getColumnType_Name();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ColumnType#isNullable <em>Nullable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Nullable</em>'.
     * @see talendfile.ColumnType#isNullable()
     * @see #getColumnType()
     * @generated
     */
    EAttribute getColumnType_Nullable();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ColumnType#getOriginalDbColumnName <em>Original Db Column Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Original Db Column Name</em>'.
     * @see talendfile.ColumnType#getOriginalDbColumnName()
     * @see #getColumnType()
     * @generated
     */
    EAttribute getColumnType_OriginalDbColumnName();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ColumnType#getPattern <em>Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pattern</em>'.
     * @see talendfile.ColumnType#getPattern()
     * @see #getColumnType()
     * @generated
     */
    EAttribute getColumnType_Pattern();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ColumnType#getPrecision <em>Precision</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Precision</em>'.
     * @see talendfile.ColumnType#getPrecision()
     * @see #getColumnType()
     * @generated
     */
    EAttribute getColumnType_Precision();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ColumnType#getSourceType <em>Source Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source Type</em>'.
     * @see talendfile.ColumnType#getSourceType()
     * @see #getColumnType()
     * @generated
     */
    EAttribute getColumnType_SourceType();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ColumnType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see talendfile.ColumnType#getType()
     * @see #getColumnType()
     * @generated
     */
    EAttribute getColumnType_Type();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ColumnType#getRelatedEntity <em>Related Entity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Related Entity</em>'.
     * @see talendfile.ColumnType#getRelatedEntity()
     * @see #getColumnType()
     * @generated
     */
    EAttribute getColumnType_RelatedEntity();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ColumnType#getRelationshipType <em>Relationship Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Relationship Type</em>'.
     * @see talendfile.ColumnType#getRelationshipType()
     * @see #getColumnType()
     * @generated
     */
    EAttribute getColumnType_RelationshipType();

    /**
     * Returns the meta object for class '{@link talendfile.ConnectionType <em>Connection Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Connection Type</em>'.
     * @see talendfile.ConnectionType
     * @generated
     */
    EClass getConnectionType();

    /**
     * Returns the meta object for the containment reference list '{@link talendfile.ConnectionType#getElementParameter <em>Element Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Element Parameter</em>'.
     * @see talendfile.ConnectionType#getElementParameter()
     * @see #getConnectionType()
     * @generated
     */
    EReference getConnectionType_ElementParameter();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ConnectionType#getConnectorName <em>Connector Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Connector Name</em>'.
     * @see talendfile.ConnectionType#getConnectorName()
     * @see #getConnectionType()
     * @generated
     */
    EAttribute getConnectionType_ConnectorName();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ConnectionType#getLabel <em>Label</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Label</em>'.
     * @see talendfile.ConnectionType#getLabel()
     * @see #getConnectionType()
     * @generated
     */
    EAttribute getConnectionType_Label();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ConnectionType#getLineStyle <em>Line Style</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Line Style</em>'.
     * @see talendfile.ConnectionType#getLineStyle()
     * @see #getConnectionType()
     * @generated
     */
    EAttribute getConnectionType_LineStyle();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ConnectionType#getMergeOrder <em>Merge Order</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Merge Order</em>'.
     * @see talendfile.ConnectionType#getMergeOrder()
     * @see #getConnectionType()
     * @generated
     */
    EAttribute getConnectionType_MergeOrder();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ConnectionType#getMetaname <em>Metaname</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Metaname</em>'.
     * @see talendfile.ConnectionType#getMetaname()
     * @see #getConnectionType()
     * @generated
     */
    EAttribute getConnectionType_Metaname();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ConnectionType#getOffsetLabelX <em>Offset Label X</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Offset Label X</em>'.
     * @see talendfile.ConnectionType#getOffsetLabelX()
     * @see #getConnectionType()
     * @generated
     */
    EAttribute getConnectionType_OffsetLabelX();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ConnectionType#getOffsetLabelY <em>Offset Label Y</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Offset Label Y</em>'.
     * @see talendfile.ConnectionType#getOffsetLabelY()
     * @see #getConnectionType()
     * @generated
     */
    EAttribute getConnectionType_OffsetLabelY();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ConnectionType#getOutputId <em>Output Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Output Id</em>'.
     * @see talendfile.ConnectionType#getOutputId()
     * @see #getConnectionType()
     * @generated
     */
    EAttribute getConnectionType_OutputId();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ConnectionType#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source</em>'.
     * @see talendfile.ConnectionType#getSource()
     * @see #getConnectionType()
     * @generated
     */
    EAttribute getConnectionType_Source();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ConnectionType#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Target</em>'.
     * @see talendfile.ConnectionType#getTarget()
     * @see #getConnectionType()
     * @generated
     */
    EAttribute getConnectionType_Target();

    /**
     * Returns the meta object for class '{@link talendfile.ContextParameterType <em>Context Parameter Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Context Parameter Type</em>'.
     * @see talendfile.ContextParameterType
     * @generated
     */
    EClass getContextParameterType();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ContextParameterType#getComment <em>Comment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Comment</em>'.
     * @see talendfile.ContextParameterType#getComment()
     * @see #getContextParameterType()
     * @generated
     */
    EAttribute getContextParameterType_Comment();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ContextParameterType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see talendfile.ContextParameterType#getName()
     * @see #getContextParameterType()
     * @generated
     */
    EAttribute getContextParameterType_Name();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ContextParameterType#getPrompt <em>Prompt</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Prompt</em>'.
     * @see talendfile.ContextParameterType#getPrompt()
     * @see #getContextParameterType()
     * @generated
     */
    EAttribute getContextParameterType_Prompt();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ContextParameterType#isPromptNeeded <em>Prompt Needed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Prompt Needed</em>'.
     * @see talendfile.ContextParameterType#isPromptNeeded()
     * @see #getContextParameterType()
     * @generated
     */
    EAttribute getContextParameterType_PromptNeeded();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ContextParameterType#getRepositoryContextId <em>Repository Context Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Repository Context Id</em>'.
     * @see talendfile.ContextParameterType#getRepositoryContextId()
     * @see #getContextParameterType()
     * @generated
     */
    EAttribute getContextParameterType_RepositoryContextId();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ContextParameterType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see talendfile.ContextParameterType#getType()
     * @see #getContextParameterType()
     * @generated
     */
    EAttribute getContextParameterType_Type();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ContextParameterType#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see talendfile.ContextParameterType#getValue()
     * @see #getContextParameterType()
     * @generated
     */
    EAttribute getContextParameterType_Value();

    /**
     * Returns the meta object for class '{@link talendfile.ContextType <em>Context Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Context Type</em>'.
     * @see talendfile.ContextType
     * @generated
     */
    EClass getContextType();

    /**
     * Returns the meta object for the containment reference list '{@link talendfile.ContextType#getContextParameter <em>Context Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Context Parameter</em>'.
     * @see talendfile.ContextType#getContextParameter()
     * @see #getContextType()
     * @generated
     */
    EReference getContextType_ContextParameter();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ContextType#isConfirmationNeeded <em>Confirmation Needed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Confirmation Needed</em>'.
     * @see talendfile.ContextType#isConfirmationNeeded()
     * @see #getContextType()
     * @generated
     */
    EAttribute getContextType_ConfirmationNeeded();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ContextType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see talendfile.ContextType#getName()
     * @see #getContextType()
     * @generated
     */
    EAttribute getContextType_Name();

    /**
     * Returns the meta object for class '{@link talendfile.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see talendfile.DocumentRoot
     * @generated
     */
    EClass getDocumentRoot();

    /**
     * Returns the meta object for the attribute list '{@link talendfile.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see talendfile.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Mixed();

    /**
     * Returns the meta object for the map '{@link talendfile.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see talendfile.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XMLNSPrefixMap();

    /**
     * Returns the meta object for the map '{@link talendfile.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see talendfile.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XSISchemaLocation();

    /**
     * Returns the meta object for the containment reference '{@link talendfile.DocumentRoot#getConnection <em>Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Connection</em>'.
     * @see talendfile.DocumentRoot#getConnection()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Connection();

    /**
     * Returns the meta object for the containment reference '{@link talendfile.DocumentRoot#getContext <em>Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Context</em>'.
     * @see talendfile.DocumentRoot#getContext()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Context();

    /**
     * Returns the meta object for the containment reference '{@link talendfile.DocumentRoot#getElementParameter <em>Element Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Element Parameter</em>'.
     * @see talendfile.DocumentRoot#getElementParameter()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ElementParameter();

    /**
     * Returns the meta object for the containment reference '{@link talendfile.DocumentRoot#getNode <em>Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Node</em>'.
     * @see talendfile.DocumentRoot#getNode()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Node();

    /**
     * Returns the meta object for the containment reference '{@link talendfile.DocumentRoot#getNote <em>Note</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Note</em>'.
     * @see talendfile.DocumentRoot#getNote()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Note();

    /**
     * Returns the meta object for the containment reference '{@link talendfile.DocumentRoot#getParameters <em>Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Parameters</em>'.
     * @see talendfile.DocumentRoot#getParameters()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Parameters();

    /**
     * Returns the meta object for the containment reference '{@link talendfile.DocumentRoot#getProcess <em>Process</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Process</em>'.
     * @see talendfile.DocumentRoot#getProcess()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Process();

    /**
     * Returns the meta object for the containment reference '{@link talendfile.DocumentRoot#getRequired <em>Required</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Required</em>'.
     * @see talendfile.DocumentRoot#getRequired()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Required();

    /**
     * Returns the meta object for the containment reference '{@link talendfile.DocumentRoot#getSubjob <em>Subjob</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Subjob</em>'.
     * @see talendfile.DocumentRoot#getSubjob()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Subjob();

    /**
     * Returns the meta object for class '{@link talendfile.ElementParameterType <em>Element Parameter Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Element Parameter Type</em>'.
     * @see talendfile.ElementParameterType
     * @generated
     */
    EClass getElementParameterType();

    /**
     * Returns the meta object for the containment reference list '{@link talendfile.ElementParameterType#getElementValue <em>Element Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Element Value</em>'.
     * @see talendfile.ElementParameterType#getElementValue()
     * @see #getElementParameterType()
     * @generated
     */
    EReference getElementParameterType_ElementValue();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ElementParameterType#getField <em>Field</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Field</em>'.
     * @see talendfile.ElementParameterType#getField()
     * @see #getElementParameterType()
     * @generated
     */
    EAttribute getElementParameterType_Field();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ElementParameterType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see talendfile.ElementParameterType#getName()
     * @see #getElementParameterType()
     * @generated
     */
    EAttribute getElementParameterType_Name();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ElementParameterType#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see talendfile.ElementParameterType#getValue()
     * @see #getElementParameterType()
     * @generated
     */
    EAttribute getElementParameterType_Value();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ElementParameterType#isContextMode <em>Context Mode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Context Mode</em>'.
     * @see talendfile.ElementParameterType#isContextMode()
     * @see #getElementParameterType()
     * @generated
     */
    EAttribute getElementParameterType_ContextMode();

    /**
     * Returns the meta object for class '{@link talendfile.ElementValueType <em>Element Value Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Element Value Type</em>'.
     * @see talendfile.ElementValueType
     * @generated
     */
    EClass getElementValueType();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ElementValueType#getElementRef <em>Element Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Element Ref</em>'.
     * @see talendfile.ElementValueType#getElementRef()
     * @see #getElementValueType()
     * @generated
     */
    EAttribute getElementValueType_ElementRef();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ElementValueType#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see talendfile.ElementValueType#getValue()
     * @see #getElementValueType()
     * @generated
     */
    EAttribute getElementValueType_Value();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ElementValueType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see talendfile.ElementValueType#getType()
     * @see #getElementValueType()
     * @generated
     */
    EAttribute getElementValueType_Type();

    /**
     * Returns the meta object for class '{@link talendfile.JobType <em>Job Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Job Type</em>'.
     * @see talendfile.JobType
     * @generated
     */
    EClass getJobType();

    /**
     * Returns the meta object for the attribute '{@link talendfile.JobType#getContext <em>Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Context</em>'.
     * @see talendfile.JobType#getContext()
     * @see #getJobType()
     * @generated
     */
    EAttribute getJobType_Context();

    /**
     * Returns the meta object for the attribute '{@link talendfile.JobType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see talendfile.JobType#getName()
     * @see #getJobType()
     * @generated
     */
    EAttribute getJobType_Name();

    /**
     * Returns the meta object for class '{@link talendfile.LogsType <em>Logs Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Logs Type</em>'.
     * @see talendfile.LogsType
     * @generated
     */
    EClass getLogsType();

    /**
     * Returns the meta object for the containment reference '{@link talendfile.LogsType#getLogToFile <em>Log To File</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Log To File</em>'.
     * @see talendfile.LogsType#getLogToFile()
     * @see #getLogsType()
     * @generated
     */
    EReference getLogsType_LogToFile();

    /**
     * Returns the meta object for the containment reference '{@link talendfile.LogsType#getLogToDatabase <em>Log To Database</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Log To Database</em>'.
     * @see talendfile.LogsType#getLogToDatabase()
     * @see #getLogsType()
     * @generated
     */
    EReference getLogsType_LogToDatabase();

    /**
     * Returns the meta object for the containment reference '{@link talendfile.LogsType#getLogToStdOut <em>Log To Std Out</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Log To Std Out</em>'.
     * @see talendfile.LogsType#getLogToStdOut()
     * @see #getLogsType()
     * @generated
     */
    EReference getLogsType_LogToStdOut();

    /**
     * Returns the meta object for class '{@link talendfile.LogToDatabaseType <em>Log To Database Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Log To Database Type</em>'.
     * @see talendfile.LogToDatabaseType
     * @generated
     */
    EClass getLogToDatabaseType();

    /**
     * Returns the meta object for the attribute '{@link talendfile.LogToDatabaseType#getDatabase <em>Database</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Database</em>'.
     * @see talendfile.LogToDatabaseType#getDatabase()
     * @see #getLogToDatabaseType()
     * @generated
     */
    EAttribute getLogToDatabaseType_Database();

    /**
     * Returns the meta object for the attribute '{@link talendfile.LogToDatabaseType#getLevel <em>Level</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Level</em>'.
     * @see talendfile.LogToDatabaseType#getLevel()
     * @see #getLogToDatabaseType()
     * @generated
     */
    EAttribute getLogToDatabaseType_Level();

    /**
     * Returns the meta object for the attribute '{@link talendfile.LogToDatabaseType#isSelected <em>Selected</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Selected</em>'.
     * @see talendfile.LogToDatabaseType#isSelected()
     * @see #getLogToDatabaseType()
     * @generated
     */
    EAttribute getLogToDatabaseType_Selected();

    /**
     * Returns the meta object for class '{@link talendfile.LogToFileType <em>Log To File Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Log To File Type</em>'.
     * @see talendfile.LogToFileType
     * @generated
     */
    EClass getLogToFileType();

    /**
     * Returns the meta object for the attribute '{@link talendfile.LogToFileType#getFilename <em>Filename</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Filename</em>'.
     * @see talendfile.LogToFileType#getFilename()
     * @see #getLogToFileType()
     * @generated
     */
    EAttribute getLogToFileType_Filename();

    /**
     * Returns the meta object for the attribute '{@link talendfile.LogToFileType#getLevel <em>Level</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Level</em>'.
     * @see talendfile.LogToFileType#getLevel()
     * @see #getLogToFileType()
     * @generated
     */
    EAttribute getLogToFileType_Level();

    /**
     * Returns the meta object for the attribute '{@link talendfile.LogToFileType#isSelected <em>Selected</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Selected</em>'.
     * @see talendfile.LogToFileType#isSelected()
     * @see #getLogToFileType()
     * @generated
     */
    EAttribute getLogToFileType_Selected();

    /**
     * Returns the meta object for class '{@link talendfile.LogToStdOutType <em>Log To Std Out Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Log To Std Out Type</em>'.
     * @see talendfile.LogToStdOutType
     * @generated
     */
    EClass getLogToStdOutType();

    /**
     * Returns the meta object for the attribute '{@link talendfile.LogToStdOutType#getLevel <em>Level</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Level</em>'.
     * @see talendfile.LogToStdOutType#getLevel()
     * @see #getLogToStdOutType()
     * @generated
     */
    EAttribute getLogToStdOutType_Level();

    /**
     * Returns the meta object for the attribute '{@link talendfile.LogToStdOutType#isSelected <em>Selected</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Selected</em>'.
     * @see talendfile.LogToStdOutType#isSelected()
     * @see #getLogToStdOutType()
     * @generated
     */
    EAttribute getLogToStdOutType_Selected();

    /**
     * Returns the meta object for class '{@link talendfile.MetadataType <em>Metadata Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Metadata Type</em>'.
     * @see talendfile.MetadataType
     * @generated
     */
    EClass getMetadataType();

    /**
     * Returns the meta object for the containment reference list '{@link talendfile.MetadataType#getColumn <em>Column</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Column</em>'.
     * @see talendfile.MetadataType#getColumn()
     * @see #getMetadataType()
     * @generated
     */
    EReference getMetadataType_Column();

    /**
     * Returns the meta object for the attribute '{@link talendfile.MetadataType#getComment <em>Comment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Comment</em>'.
     * @see talendfile.MetadataType#getComment()
     * @see #getMetadataType()
     * @generated
     */
    EAttribute getMetadataType_Comment();

    /**
     * Returns the meta object for the attribute '{@link talendfile.MetadataType#getConnector <em>Connector</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Connector</em>'.
     * @see talendfile.MetadataType#getConnector()
     * @see #getMetadataType()
     * @generated
     */
    EAttribute getMetadataType_Connector();

    /**
     * Returns the meta object for the attribute '{@link talendfile.MetadataType#getLabel <em>Label</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Label</em>'.
     * @see talendfile.MetadataType#getLabel()
     * @see #getMetadataType()
     * @generated
     */
    EAttribute getMetadataType_Label();

    /**
     * Returns the meta object for the attribute '{@link talendfile.MetadataType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see talendfile.MetadataType#getName()
     * @see #getMetadataType()
     * @generated
     */
    EAttribute getMetadataType_Name();

    /**
     * Returns the meta object for the attribute '{@link talendfile.MetadataType#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source</em>'.
     * @see talendfile.MetadataType#getSource()
     * @see #getMetadataType()
     * @generated
     */
    EAttribute getMetadataType_Source();

    /**
     * Returns the meta object for class '{@link talendfile.NodeType <em>Node Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node Type</em>'.
     * @see talendfile.NodeType
     * @generated
     */
    EClass getNodeType();

    /**
     * Returns the meta object for the containment reference list '{@link talendfile.NodeType#getElementParameter <em>Element Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Element Parameter</em>'.
     * @see talendfile.NodeType#getElementParameter()
     * @see #getNodeType()
     * @generated
     */
    EReference getNodeType_ElementParameter();

    /**
     * Returns the meta object for the containment reference list '{@link talendfile.NodeType#getMetadata <em>Metadata</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Metadata</em>'.
     * @see talendfile.NodeType#getMetadata()
     * @see #getNodeType()
     * @generated
     */
    EReference getNodeType_Metadata();

    /**
     * Returns the meta object for the attribute '{@link talendfile.NodeType#getBinaryData <em>Binary Data</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Binary Data</em>'.
     * @see talendfile.NodeType#getBinaryData()
     * @see #getNodeType()
     * @generated
     */
    EAttribute getNodeType_BinaryData();

    /**
     * Returns the meta object for the attribute '{@link talendfile.NodeType#getStringData <em>String Data</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>String Data</em>'.
     * @see talendfile.NodeType#getStringData()
     * @see #getNodeType()
     * @generated
     */
    EAttribute getNodeType_StringData();

    /**
     * Returns the meta object for the attribute '{@link talendfile.NodeType#getComponentName <em>Component Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Component Name</em>'.
     * @see talendfile.NodeType#getComponentName()
     * @see #getNodeType()
     * @generated
     */
    EAttribute getNodeType_ComponentName();

    /**
     * Returns the meta object for the attribute '{@link talendfile.NodeType#getComponentVersion <em>Component Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Component Version</em>'.
     * @see talendfile.NodeType#getComponentVersion()
     * @see #getNodeType()
     * @generated
     */
    EAttribute getNodeType_ComponentVersion();

    /**
     * Returns the meta object for the attribute '{@link talendfile.NodeType#getOffsetLabelX <em>Offset Label X</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Offset Label X</em>'.
     * @see talendfile.NodeType#getOffsetLabelX()
     * @see #getNodeType()
     * @generated
     */
    EAttribute getNodeType_OffsetLabelX();

    /**
     * Returns the meta object for the attribute '{@link talendfile.NodeType#getOffsetLabelY <em>Offset Label Y</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Offset Label Y</em>'.
     * @see talendfile.NodeType#getOffsetLabelY()
     * @see #getNodeType()
     * @generated
     */
    EAttribute getNodeType_OffsetLabelY();

    /**
     * Returns the meta object for the attribute '{@link talendfile.NodeType#getPosX <em>Pos X</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pos X</em>'.
     * @see talendfile.NodeType#getPosX()
     * @see #getNodeType()
     * @generated
     */
    EAttribute getNodeType_PosX();

    /**
     * Returns the meta object for the attribute '{@link talendfile.NodeType#getPosY <em>Pos Y</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pos Y</em>'.
     * @see talendfile.NodeType#getPosY()
     * @see #getNodeType()
     * @generated
     */
    EAttribute getNodeType_PosY();

    /**
     * Returns the meta object for the attribute '{@link talendfile.NodeType#getSizeX <em>Size X</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Size X</em>'.
     * @see talendfile.NodeType#getSizeX()
     * @see #getNodeType()
     * @generated
     */
    EAttribute getNodeType_SizeX();

    /**
     * Returns the meta object for the attribute '{@link talendfile.NodeType#getSizeY <em>Size Y</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Size Y</em>'.
     * @see talendfile.NodeType#getSizeY()
     * @see #getNodeType()
     * @generated
     */
    EAttribute getNodeType_SizeY();

    /**
     * Returns the meta object for the attribute '{@link talendfile.NodeType#getScreenshot <em>Screenshot</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Screenshot</em>'.
     * @see talendfile.NodeType#getScreenshot()
     * @see #getNodeType()
     * @generated
     */
    EAttribute getNodeType_Screenshot();

    /**
     * Returns the meta object for the containment reference '{@link talendfile.NodeType#getNodeData <em>Node Data</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Node Data</em>'.
     * @see talendfile.NodeType#getNodeData()
     * @see #getNodeType()
     * @generated
     */
    EReference getNodeType_NodeData();

    /**
     * Returns the meta object for the containment reference '{@link talendfile.NodeType#getNodeContainer <em>Node Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Node Container</em>'.
     * @see talendfile.NodeType#getNodeContainer()
     * @see #getNodeType()
     * @generated
     */
    EReference getNodeType_NodeContainer();

    /**
     * Returns the meta object for class '{@link talendfile.NoteType <em>Note Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Note Type</em>'.
     * @see talendfile.NoteType
     * @generated
     */
    EClass getNoteType();

    /**
     * Returns the meta object for the attribute '{@link talendfile.NoteType#isOpaque <em>Opaque</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Opaque</em>'.
     * @see talendfile.NoteType#isOpaque()
     * @see #getNoteType()
     * @generated
     */
    EAttribute getNoteType_Opaque();

    /**
     * Returns the meta object for the attribute '{@link talendfile.NoteType#getPosX <em>Pos X</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pos X</em>'.
     * @see talendfile.NoteType#getPosX()
     * @see #getNoteType()
     * @generated
     */
    EAttribute getNoteType_PosX();

    /**
     * Returns the meta object for the attribute '{@link talendfile.NoteType#getPosY <em>Pos Y</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pos Y</em>'.
     * @see talendfile.NoteType#getPosY()
     * @see #getNoteType()
     * @generated
     */
    EAttribute getNoteType_PosY();

    /**
     * Returns the meta object for the attribute '{@link talendfile.NoteType#getSizeHeight <em>Size Height</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Size Height</em>'.
     * @see talendfile.NoteType#getSizeHeight()
     * @see #getNoteType()
     * @generated
     */
    EAttribute getNoteType_SizeHeight();

    /**
     * Returns the meta object for the attribute '{@link talendfile.NoteType#getSizeWidth <em>Size Width</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Size Width</em>'.
     * @see talendfile.NoteType#getSizeWidth()
     * @see #getNoteType()
     * @generated
     */
    EAttribute getNoteType_SizeWidth();

    /**
     * Returns the meta object for the attribute '{@link talendfile.NoteType#getText <em>Text</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Text</em>'.
     * @see talendfile.NoteType#getText()
     * @see #getNoteType()
     * @generated
     */
    EAttribute getNoteType_Text();

    /**
     * Returns the meta object for the containment reference list '{@link talendfile.NoteType#getElementParameter <em>Element Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Element Parameter</em>'.
     * @see talendfile.NoteType#getElementParameter()
     * @see #getNoteType()
     * @generated
     */
    EReference getNoteType_ElementParameter();

    /**
     * Returns the meta object for class '{@link talendfile.ParametersType <em>Parameters Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Parameters Type</em>'.
     * @see talendfile.ParametersType
     * @generated
     */
    EClass getParametersType();

    /**
     * Returns the meta object for the containment reference list '{@link talendfile.ParametersType#getElementParameter <em>Element Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Element Parameter</em>'.
     * @see talendfile.ParametersType#getElementParameter()
     * @see #getParametersType()
     * @generated
     */
    EReference getParametersType_ElementParameter();

    /**
     * Returns the meta object for the containment reference list '{@link talendfile.ParametersType#getRoutinesParameter <em>Routines Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Routines Parameter</em>'.
     * @see talendfile.ParametersType#getRoutinesParameter()
     * @see #getParametersType()
     * @generated
     */
    EReference getParametersType_RoutinesParameter();

    /**
     * Returns the meta object for class '{@link talendfile.ProcessType <em>Process Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Process Type</em>'.
     * @see talendfile.ProcessType
     * @generated
     */
    EClass getProcessType();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ProcessType#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see talendfile.ProcessType#getDescription()
     * @see #getProcessType()
     * @generated
     */
    EAttribute getProcessType_Description();

    /**
     * Returns the meta object for the containment reference '{@link talendfile.ProcessType#getRequired <em>Required</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Required</em>'.
     * @see talendfile.ProcessType#getRequired()
     * @see #getProcessType()
     * @generated
     */
    EReference getProcessType_Required();

    /**
     * Returns the meta object for the containment reference list '{@link talendfile.ProcessType#getContext <em>Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Context</em>'.
     * @see talendfile.ProcessType#getContext()
     * @see #getProcessType()
     * @generated
     */
    EReference getProcessType_Context();

    /**
     * Returns the meta object for the containment reference '{@link talendfile.ProcessType#getParameters <em>Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Parameters</em>'.
     * @see talendfile.ProcessType#getParameters()
     * @see #getProcessType()
     * @generated
     */
    EReference getProcessType_Parameters();

    /**
     * Returns the meta object for the containment reference list '{@link talendfile.ProcessType#getNode <em>Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Node</em>'.
     * @see talendfile.ProcessType#getNode()
     * @see #getProcessType()
     * @generated
     */
    EReference getProcessType_Node();

    /**
     * Returns the meta object for the containment reference list '{@link talendfile.ProcessType#getConnection <em>Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Connection</em>'.
     * @see talendfile.ProcessType#getConnection()
     * @see #getProcessType()
     * @generated
     */
    EReference getProcessType_Connection();

    /**
     * Returns the meta object for the containment reference list '{@link talendfile.ProcessType#getNote <em>Note</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Note</em>'.
     * @see talendfile.ProcessType#getNote()
     * @see #getProcessType()
     * @generated
     */
    EReference getProcessType_Note();

    /**
     * Returns the meta object for the containment reference '{@link talendfile.ProcessType#getLogs <em>Logs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Logs</em>'.
     * @see talendfile.ProcessType#getLogs()
     * @see #getProcessType()
     * @generated
     */
    EReference getProcessType_Logs();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ProcessType#getAuthor <em>Author</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Author</em>'.
     * @see talendfile.ProcessType#getAuthor()
     * @see #getProcessType()
     * @generated
     */
    EAttribute getProcessType_Author();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ProcessType#getComment <em>Comment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Comment</em>'.
     * @see talendfile.ProcessType#getComment()
     * @see #getProcessType()
     * @generated
     */
    EAttribute getProcessType_Comment();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ProcessType#getDefaultContext <em>Default Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Context</em>'.
     * @see talendfile.ProcessType#getDefaultContext()
     * @see #getProcessType()
     * @generated
     */
    EAttribute getProcessType_DefaultContext();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ProcessType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see talendfile.ProcessType#getName()
     * @see #getProcessType()
     * @generated
     */
    EAttribute getProcessType_Name();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ProcessType#getPurpose <em>Purpose</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Purpose</em>'.
     * @see talendfile.ProcessType#getPurpose()
     * @see #getProcessType()
     * @generated
     */
    EAttribute getProcessType_Purpose();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ProcessType#getRepositoryContextId <em>Repository Context Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Repository Context Id</em>'.
     * @see talendfile.ProcessType#getRepositoryContextId()
     * @see #getProcessType()
     * @generated
     */
    EAttribute getProcessType_RepositoryContextId();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ProcessType#getStatus <em>Status</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Status</em>'.
     * @see talendfile.ProcessType#getStatus()
     * @see #getProcessType()
     * @generated
     */
    EAttribute getProcessType_Status();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ProcessType#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see talendfile.ProcessType#getVersion()
     * @see #getProcessType()
     * @generated
     */
    EAttribute getProcessType_Version();

    /**
     * Returns the meta object for the containment reference list '{@link talendfile.ProcessType#getSubjob <em>Subjob</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Subjob</em>'.
     * @see talendfile.ProcessType#getSubjob()
     * @see #getProcessType()
     * @generated
     */
    EReference getProcessType_Subjob();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ProcessType#getScreenshot <em>Screenshot</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Screenshot</em>'.
     * @see talendfile.ProcessType#getScreenshot()
     * @see #getProcessType()
     * @generated
     */
    EAttribute getProcessType_Screenshot();

    /**
     * Returns the meta object for the containment reference list '{@link talendfile.ProcessType#getRoutinesDependencies <em>Routines Dependencies</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Routines Dependencies</em>'.
     * @see talendfile.ProcessType#getRoutinesDependencies()
     * @see #getProcessType()
     * @generated
     */
    EReference getProcessType_RoutinesDependencies();

    /**
     * Returns the meta object for class '{@link talendfile.RequiredType <em>Required Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Required Type</em>'.
     * @see talendfile.RequiredType
     * @generated
     */
    EClass getRequiredType();

    /**
     * Returns the meta object for the containment reference list '{@link talendfile.RequiredType#getJob <em>Job</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Job</em>'.
     * @see talendfile.RequiredType#getJob()
     * @see #getRequiredType()
     * @generated
     */
    EReference getRequiredType_Job();

    /**
     * Returns the meta object for class '{@link talendfile.SubjobType <em>Subjob Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Subjob Type</em>'.
     * @see talendfile.SubjobType
     * @generated
     */
    EClass getSubjobType();

    /**
     * Returns the meta object for the containment reference list '{@link talendfile.SubjobType#getElementParameter <em>Element Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Element Parameter</em>'.
     * @see talendfile.SubjobType#getElementParameter()
     * @see #getSubjobType()
     * @generated
     */
    EReference getSubjobType_ElementParameter();

    /**
     * Returns the meta object for class '{@link talendfile.ItemInforType <em>Item Infor Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Item Infor Type</em>'.
     * @see talendfile.ItemInforType
     * @generated
     */
    EClass getItemInforType();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ItemInforType#getIdOrName <em>Id Or Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id Or Name</em>'.
     * @see talendfile.ItemInforType#getIdOrName()
     * @see #getItemInforType()
     * @generated
     */
    EAttribute getItemInforType_IdOrName();

    /**
     * Returns the meta object for the attribute '{@link talendfile.ItemInforType#isSystem <em>System</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>System</em>'.
     * @see talendfile.ItemInforType#isSystem()
     * @see #getItemInforType()
     * @generated
     */
    EAttribute getItemInforType_System();

    /**
     * Returns the meta object for class '{@link talendfile.AbstractExternalData <em>Abstract External Data</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract External Data</em>'.
     * @see talendfile.AbstractExternalData
     * @generated
     */
    EClass getAbstractExternalData();

    /**
     * Returns the meta object for class '{@link talendfile.RoutinesParameterType <em>Routines Parameter Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Routines Parameter Type</em>'.
     * @see talendfile.RoutinesParameterType
     * @generated
     */
    EClass getRoutinesParameterType();

    /**
     * Returns the meta object for the attribute '{@link talendfile.RoutinesParameterType#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see talendfile.RoutinesParameterType#getId()
     * @see #getRoutinesParameterType()
     * @generated
     */
    EAttribute getRoutinesParameterType_Id();

    /**
     * Returns the meta object for the attribute '{@link talendfile.RoutinesParameterType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see talendfile.RoutinesParameterType#getName()
     * @see #getRoutinesParameterType()
     * @generated
     */
    EAttribute getRoutinesParameterType_Name();

    /**
     * Returns the meta object for class '{@link talendfile.NodeContainerType <em>Node Container Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node Container Type</em>'.
     * @see talendfile.NodeContainerType
     * @generated
     */
    EClass getNodeContainerType();

    /**
     * Returns the meta object for the containment reference list '{@link talendfile.NodeContainerType#getElementParameter <em>Element Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Element Parameter</em>'.
     * @see talendfile.NodeContainerType#getElementParameter()
     * @see #getNodeContainerType()
     * @generated
     */
    EReference getNodeContainerType_ElementParameter();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    TalendfileFactory getTalendfileFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link talendfile.impl.ColumnTypeImpl <em>Column Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see talendfile.impl.ColumnTypeImpl
         * @see talendfile.impl.TalendfilePackageImpl#getColumnType()
         * @generated
         */
        EClass COLUMN_TYPE = eINSTANCE.getColumnType();

        /**
         * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLUMN_TYPE__COMMENT = eINSTANCE.getColumnType_Comment();

        /**
         * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLUMN_TYPE__DEFAULT_VALUE = eINSTANCE.getColumnType_DefaultValue();

        /**
         * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLUMN_TYPE__KEY = eINSTANCE.getColumnType_Key();

        /**
         * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLUMN_TYPE__LENGTH = eINSTANCE.getColumnType_Length();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLUMN_TYPE__NAME = eINSTANCE.getColumnType_Name();

        /**
         * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLUMN_TYPE__NULLABLE = eINSTANCE.getColumnType_Nullable();

        /**
         * The meta object literal for the '<em><b>Original Db Column Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLUMN_TYPE__ORIGINAL_DB_COLUMN_NAME = eINSTANCE.getColumnType_OriginalDbColumnName();

        /**
         * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLUMN_TYPE__PATTERN = eINSTANCE.getColumnType_Pattern();

        /**
         * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLUMN_TYPE__PRECISION = eINSTANCE.getColumnType_Precision();

        /**
         * The meta object literal for the '<em><b>Source Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLUMN_TYPE__SOURCE_TYPE = eINSTANCE.getColumnType_SourceType();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLUMN_TYPE__TYPE = eINSTANCE.getColumnType_Type();

        /**
         * The meta object literal for the '<em><b>Related Entity</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLUMN_TYPE__RELATED_ENTITY = eINSTANCE.getColumnType_RelatedEntity();

        /**
         * The meta object literal for the '<em><b>Relationship Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLUMN_TYPE__RELATIONSHIP_TYPE = eINSTANCE.getColumnType_RelationshipType();

        /**
         * The meta object literal for the '{@link talendfile.impl.ConnectionTypeImpl <em>Connection Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see talendfile.impl.ConnectionTypeImpl
         * @see talendfile.impl.TalendfilePackageImpl#getConnectionType()
         * @generated
         */
        EClass CONNECTION_TYPE = eINSTANCE.getConnectionType();

        /**
         * The meta object literal for the '<em><b>Element Parameter</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONNECTION_TYPE__ELEMENT_PARAMETER = eINSTANCE.getConnectionType_ElementParameter();

        /**
         * The meta object literal for the '<em><b>Connector Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTION_TYPE__CONNECTOR_NAME = eINSTANCE.getConnectionType_ConnectorName();

        /**
         * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTION_TYPE__LABEL = eINSTANCE.getConnectionType_Label();

        /**
         * The meta object literal for the '<em><b>Line Style</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTION_TYPE__LINE_STYLE = eINSTANCE.getConnectionType_LineStyle();

        /**
         * The meta object literal for the '<em><b>Merge Order</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTION_TYPE__MERGE_ORDER = eINSTANCE.getConnectionType_MergeOrder();

        /**
         * The meta object literal for the '<em><b>Metaname</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTION_TYPE__METANAME = eINSTANCE.getConnectionType_Metaname();

        /**
         * The meta object literal for the '<em><b>Offset Label X</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTION_TYPE__OFFSET_LABEL_X = eINSTANCE.getConnectionType_OffsetLabelX();

        /**
         * The meta object literal for the '<em><b>Offset Label Y</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTION_TYPE__OFFSET_LABEL_Y = eINSTANCE.getConnectionType_OffsetLabelY();

        /**
         * The meta object literal for the '<em><b>Output Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTION_TYPE__OUTPUT_ID = eINSTANCE.getConnectionType_OutputId();

        /**
         * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTION_TYPE__SOURCE = eINSTANCE.getConnectionType_Source();

        /**
         * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTION_TYPE__TARGET = eINSTANCE.getConnectionType_Target();

        /**
         * The meta object literal for the '{@link talendfile.impl.ContextParameterTypeImpl <em>Context Parameter Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see talendfile.impl.ContextParameterTypeImpl
         * @see talendfile.impl.TalendfilePackageImpl#getContextParameterType()
         * @generated
         */
        EClass CONTEXT_PARAMETER_TYPE = eINSTANCE.getContextParameterType();

        /**
         * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONTEXT_PARAMETER_TYPE__COMMENT = eINSTANCE.getContextParameterType_Comment();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONTEXT_PARAMETER_TYPE__NAME = eINSTANCE.getContextParameterType_Name();

        /**
         * The meta object literal for the '<em><b>Prompt</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONTEXT_PARAMETER_TYPE__PROMPT = eINSTANCE.getContextParameterType_Prompt();

        /**
         * The meta object literal for the '<em><b>Prompt Needed</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONTEXT_PARAMETER_TYPE__PROMPT_NEEDED = eINSTANCE.getContextParameterType_PromptNeeded();

        /**
         * The meta object literal for the '<em><b>Repository Context Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONTEXT_PARAMETER_TYPE__REPOSITORY_CONTEXT_ID = eINSTANCE.getContextParameterType_RepositoryContextId();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONTEXT_PARAMETER_TYPE__TYPE = eINSTANCE.getContextParameterType_Type();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONTEXT_PARAMETER_TYPE__VALUE = eINSTANCE.getContextParameterType_Value();

        /**
         * The meta object literal for the '{@link talendfile.impl.ContextTypeImpl <em>Context Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see talendfile.impl.ContextTypeImpl
         * @see talendfile.impl.TalendfilePackageImpl#getContextType()
         * @generated
         */
        EClass CONTEXT_TYPE = eINSTANCE.getContextType();

        /**
         * The meta object literal for the '<em><b>Context Parameter</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTEXT_TYPE__CONTEXT_PARAMETER = eINSTANCE.getContextType_ContextParameter();

        /**
         * The meta object literal for the '<em><b>Confirmation Needed</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONTEXT_TYPE__CONFIRMATION_NEEDED = eINSTANCE.getContextType_ConfirmationNeeded();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONTEXT_TYPE__NAME = eINSTANCE.getContextType_Name();

        /**
         * The meta object literal for the '{@link talendfile.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see talendfile.impl.DocumentRootImpl
         * @see talendfile.impl.TalendfilePackageImpl#getDocumentRoot()
         * @generated
         */
        EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

        /**
         * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

        /**
         * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

        /**
         * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

        /**
         * The meta object literal for the '<em><b>Connection</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__CONNECTION = eINSTANCE.getDocumentRoot_Connection();

        /**
         * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__CONTEXT = eINSTANCE.getDocumentRoot_Context();

        /**
         * The meta object literal for the '<em><b>Element Parameter</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__ELEMENT_PARAMETER = eINSTANCE.getDocumentRoot_ElementParameter();

        /**
         * The meta object literal for the '<em><b>Node</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__NODE = eINSTANCE.getDocumentRoot_Node();

        /**
         * The meta object literal for the '<em><b>Note</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__NOTE = eINSTANCE.getDocumentRoot_Note();

        /**
         * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__PARAMETERS = eINSTANCE.getDocumentRoot_Parameters();

        /**
         * The meta object literal for the '<em><b>Process</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__PROCESS = eINSTANCE.getDocumentRoot_Process();

        /**
         * The meta object literal for the '<em><b>Required</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__REQUIRED = eINSTANCE.getDocumentRoot_Required();

        /**
         * The meta object literal for the '<em><b>Subjob</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__SUBJOB = eINSTANCE.getDocumentRoot_Subjob();

        /**
         * The meta object literal for the '{@link talendfile.impl.ElementParameterTypeImpl <em>Element Parameter Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see talendfile.impl.ElementParameterTypeImpl
         * @see talendfile.impl.TalendfilePackageImpl#getElementParameterType()
         * @generated
         */
        EClass ELEMENT_PARAMETER_TYPE = eINSTANCE.getElementParameterType();

        /**
         * The meta object literal for the '<em><b>Element Value</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ELEMENT_PARAMETER_TYPE__ELEMENT_VALUE = eINSTANCE.getElementParameterType_ElementValue();

        /**
         * The meta object literal for the '<em><b>Field</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELEMENT_PARAMETER_TYPE__FIELD = eINSTANCE.getElementParameterType_Field();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELEMENT_PARAMETER_TYPE__NAME = eINSTANCE.getElementParameterType_Name();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELEMENT_PARAMETER_TYPE__VALUE = eINSTANCE.getElementParameterType_Value();

        /**
         * The meta object literal for the '<em><b>Context Mode</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELEMENT_PARAMETER_TYPE__CONTEXT_MODE = eINSTANCE.getElementParameterType_ContextMode();

        /**
         * The meta object literal for the '{@link talendfile.impl.ElementValueTypeImpl <em>Element Value Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see talendfile.impl.ElementValueTypeImpl
         * @see talendfile.impl.TalendfilePackageImpl#getElementValueType()
         * @generated
         */
        EClass ELEMENT_VALUE_TYPE = eINSTANCE.getElementValueType();

        /**
         * The meta object literal for the '<em><b>Element Ref</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELEMENT_VALUE_TYPE__ELEMENT_REF = eINSTANCE.getElementValueType_ElementRef();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELEMENT_VALUE_TYPE__VALUE = eINSTANCE.getElementValueType_Value();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELEMENT_VALUE_TYPE__TYPE = eINSTANCE.getElementValueType_Type();

        /**
         * The meta object literal for the '{@link talendfile.impl.JobTypeImpl <em>Job Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see talendfile.impl.JobTypeImpl
         * @see talendfile.impl.TalendfilePackageImpl#getJobType()
         * @generated
         */
        EClass JOB_TYPE = eINSTANCE.getJobType();

        /**
         * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JOB_TYPE__CONTEXT = eINSTANCE.getJobType_Context();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JOB_TYPE__NAME = eINSTANCE.getJobType_Name();

        /**
         * The meta object literal for the '{@link talendfile.impl.LogsTypeImpl <em>Logs Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see talendfile.impl.LogsTypeImpl
         * @see talendfile.impl.TalendfilePackageImpl#getLogsType()
         * @generated
         */
        EClass LOGS_TYPE = eINSTANCE.getLogsType();

        /**
         * The meta object literal for the '<em><b>Log To File</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LOGS_TYPE__LOG_TO_FILE = eINSTANCE.getLogsType_LogToFile();

        /**
         * The meta object literal for the '<em><b>Log To Database</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LOGS_TYPE__LOG_TO_DATABASE = eINSTANCE.getLogsType_LogToDatabase();

        /**
         * The meta object literal for the '<em><b>Log To Std Out</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LOGS_TYPE__LOG_TO_STD_OUT = eINSTANCE.getLogsType_LogToStdOut();

        /**
         * The meta object literal for the '{@link talendfile.impl.LogToDatabaseTypeImpl <em>Log To Database Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see talendfile.impl.LogToDatabaseTypeImpl
         * @see talendfile.impl.TalendfilePackageImpl#getLogToDatabaseType()
         * @generated
         */
        EClass LOG_TO_DATABASE_TYPE = eINSTANCE.getLogToDatabaseType();

        /**
         * The meta object literal for the '<em><b>Database</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LOG_TO_DATABASE_TYPE__DATABASE = eINSTANCE.getLogToDatabaseType_Database();

        /**
         * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LOG_TO_DATABASE_TYPE__LEVEL = eINSTANCE.getLogToDatabaseType_Level();

        /**
         * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LOG_TO_DATABASE_TYPE__SELECTED = eINSTANCE.getLogToDatabaseType_Selected();

        /**
         * The meta object literal for the '{@link talendfile.impl.LogToFileTypeImpl <em>Log To File Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see talendfile.impl.LogToFileTypeImpl
         * @see talendfile.impl.TalendfilePackageImpl#getLogToFileType()
         * @generated
         */
        EClass LOG_TO_FILE_TYPE = eINSTANCE.getLogToFileType();

        /**
         * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LOG_TO_FILE_TYPE__FILENAME = eINSTANCE.getLogToFileType_Filename();

        /**
         * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LOG_TO_FILE_TYPE__LEVEL = eINSTANCE.getLogToFileType_Level();

        /**
         * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LOG_TO_FILE_TYPE__SELECTED = eINSTANCE.getLogToFileType_Selected();

        /**
         * The meta object literal for the '{@link talendfile.impl.LogToStdOutTypeImpl <em>Log To Std Out Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see talendfile.impl.LogToStdOutTypeImpl
         * @see talendfile.impl.TalendfilePackageImpl#getLogToStdOutType()
         * @generated
         */
        EClass LOG_TO_STD_OUT_TYPE = eINSTANCE.getLogToStdOutType();

        /**
         * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LOG_TO_STD_OUT_TYPE__LEVEL = eINSTANCE.getLogToStdOutType_Level();

        /**
         * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LOG_TO_STD_OUT_TYPE__SELECTED = eINSTANCE.getLogToStdOutType_Selected();

        /**
         * The meta object literal for the '{@link talendfile.impl.MetadataTypeImpl <em>Metadata Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see talendfile.impl.MetadataTypeImpl
         * @see talendfile.impl.TalendfilePackageImpl#getMetadataType()
         * @generated
         */
        EClass METADATA_TYPE = eINSTANCE.getMetadataType();

        /**
         * The meta object literal for the '<em><b>Column</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference METADATA_TYPE__COLUMN = eINSTANCE.getMetadataType_Column();

        /**
         * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute METADATA_TYPE__COMMENT = eINSTANCE.getMetadataType_Comment();

        /**
         * The meta object literal for the '<em><b>Connector</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute METADATA_TYPE__CONNECTOR = eINSTANCE.getMetadataType_Connector();

        /**
         * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute METADATA_TYPE__LABEL = eINSTANCE.getMetadataType_Label();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute METADATA_TYPE__NAME = eINSTANCE.getMetadataType_Name();

        /**
         * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute METADATA_TYPE__SOURCE = eINSTANCE.getMetadataType_Source();

        /**
         * The meta object literal for the '{@link talendfile.impl.NodeTypeImpl <em>Node Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see talendfile.impl.NodeTypeImpl
         * @see talendfile.impl.TalendfilePackageImpl#getNodeType()
         * @generated
         */
        EClass NODE_TYPE = eINSTANCE.getNodeType();

        /**
         * The meta object literal for the '<em><b>Element Parameter</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NODE_TYPE__ELEMENT_PARAMETER = eINSTANCE.getNodeType_ElementParameter();

        /**
         * The meta object literal for the '<em><b>Metadata</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NODE_TYPE__METADATA = eINSTANCE.getNodeType_Metadata();

        /**
         * The meta object literal for the '<em><b>Binary Data</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE_TYPE__BINARY_DATA = eINSTANCE.getNodeType_BinaryData();

        /**
         * The meta object literal for the '<em><b>String Data</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE_TYPE__STRING_DATA = eINSTANCE.getNodeType_StringData();

        /**
         * The meta object literal for the '<em><b>Component Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE_TYPE__COMPONENT_NAME = eINSTANCE.getNodeType_ComponentName();

        /**
         * The meta object literal for the '<em><b>Component Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE_TYPE__COMPONENT_VERSION = eINSTANCE.getNodeType_ComponentVersion();

        /**
         * The meta object literal for the '<em><b>Offset Label X</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE_TYPE__OFFSET_LABEL_X = eINSTANCE.getNodeType_OffsetLabelX();

        /**
         * The meta object literal for the '<em><b>Offset Label Y</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE_TYPE__OFFSET_LABEL_Y = eINSTANCE.getNodeType_OffsetLabelY();

        /**
         * The meta object literal for the '<em><b>Pos X</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE_TYPE__POS_X = eINSTANCE.getNodeType_PosX();

        /**
         * The meta object literal for the '<em><b>Pos Y</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE_TYPE__POS_Y = eINSTANCE.getNodeType_PosY();

        /**
         * The meta object literal for the '<em><b>Size X</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE_TYPE__SIZE_X = eINSTANCE.getNodeType_SizeX();

        /**
         * The meta object literal for the '<em><b>Size Y</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE_TYPE__SIZE_Y = eINSTANCE.getNodeType_SizeY();

        /**
         * The meta object literal for the '<em><b>Screenshot</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE_TYPE__SCREENSHOT = eINSTANCE.getNodeType_Screenshot();

        /**
         * The meta object literal for the '<em><b>Node Data</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NODE_TYPE__NODE_DATA = eINSTANCE.getNodeType_NodeData();

        /**
         * The meta object literal for the '<em><b>Node Container</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NODE_TYPE__NODE_CONTAINER = eINSTANCE.getNodeType_NodeContainer();

        /**
         * The meta object literal for the '{@link talendfile.impl.NoteTypeImpl <em>Note Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see talendfile.impl.NoteTypeImpl
         * @see talendfile.impl.TalendfilePackageImpl#getNoteType()
         * @generated
         */
        EClass NOTE_TYPE = eINSTANCE.getNoteType();

        /**
         * The meta object literal for the '<em><b>Opaque</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NOTE_TYPE__OPAQUE = eINSTANCE.getNoteType_Opaque();

        /**
         * The meta object literal for the '<em><b>Pos X</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NOTE_TYPE__POS_X = eINSTANCE.getNoteType_PosX();

        /**
         * The meta object literal for the '<em><b>Pos Y</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NOTE_TYPE__POS_Y = eINSTANCE.getNoteType_PosY();

        /**
         * The meta object literal for the '<em><b>Size Height</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NOTE_TYPE__SIZE_HEIGHT = eINSTANCE.getNoteType_SizeHeight();

        /**
         * The meta object literal for the '<em><b>Size Width</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NOTE_TYPE__SIZE_WIDTH = eINSTANCE.getNoteType_SizeWidth();

        /**
         * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NOTE_TYPE__TEXT = eINSTANCE.getNoteType_Text();

        /**
         * The meta object literal for the '<em><b>Element Parameter</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NOTE_TYPE__ELEMENT_PARAMETER = eINSTANCE.getNoteType_ElementParameter();

        /**
         * The meta object literal for the '{@link talendfile.impl.ParametersTypeImpl <em>Parameters Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see talendfile.impl.ParametersTypeImpl
         * @see talendfile.impl.TalendfilePackageImpl#getParametersType()
         * @generated
         */
        EClass PARAMETERS_TYPE = eINSTANCE.getParametersType();

        /**
         * The meta object literal for the '<em><b>Element Parameter</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PARAMETERS_TYPE__ELEMENT_PARAMETER = eINSTANCE.getParametersType_ElementParameter();

        /**
         * The meta object literal for the '<em><b>Routines Parameter</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PARAMETERS_TYPE__ROUTINES_PARAMETER = eINSTANCE.getParametersType_RoutinesParameter();

        /**
         * The meta object literal for the '{@link talendfile.impl.ProcessTypeImpl <em>Process Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see talendfile.impl.ProcessTypeImpl
         * @see talendfile.impl.TalendfilePackageImpl#getProcessType()
         * @generated
         */
        EClass PROCESS_TYPE = eINSTANCE.getProcessType();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROCESS_TYPE__DESCRIPTION = eINSTANCE.getProcessType_Description();

        /**
         * The meta object literal for the '<em><b>Required</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROCESS_TYPE__REQUIRED = eINSTANCE.getProcessType_Required();

        /**
         * The meta object literal for the '<em><b>Context</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROCESS_TYPE__CONTEXT = eINSTANCE.getProcessType_Context();

        /**
         * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROCESS_TYPE__PARAMETERS = eINSTANCE.getProcessType_Parameters();

        /**
         * The meta object literal for the '<em><b>Node</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROCESS_TYPE__NODE = eINSTANCE.getProcessType_Node();

        /**
         * The meta object literal for the '<em><b>Connection</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROCESS_TYPE__CONNECTION = eINSTANCE.getProcessType_Connection();

        /**
         * The meta object literal for the '<em><b>Note</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROCESS_TYPE__NOTE = eINSTANCE.getProcessType_Note();

        /**
         * The meta object literal for the '<em><b>Logs</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROCESS_TYPE__LOGS = eINSTANCE.getProcessType_Logs();

        /**
         * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROCESS_TYPE__AUTHOR = eINSTANCE.getProcessType_Author();

        /**
         * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROCESS_TYPE__COMMENT = eINSTANCE.getProcessType_Comment();

        /**
         * The meta object literal for the '<em><b>Default Context</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROCESS_TYPE__DEFAULT_CONTEXT = eINSTANCE.getProcessType_DefaultContext();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROCESS_TYPE__NAME = eINSTANCE.getProcessType_Name();

        /**
         * The meta object literal for the '<em><b>Purpose</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROCESS_TYPE__PURPOSE = eINSTANCE.getProcessType_Purpose();

        /**
         * The meta object literal for the '<em><b>Repository Context Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROCESS_TYPE__REPOSITORY_CONTEXT_ID = eINSTANCE.getProcessType_RepositoryContextId();

        /**
         * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROCESS_TYPE__STATUS = eINSTANCE.getProcessType_Status();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROCESS_TYPE__VERSION = eINSTANCE.getProcessType_Version();

        /**
         * The meta object literal for the '<em><b>Subjob</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROCESS_TYPE__SUBJOB = eINSTANCE.getProcessType_Subjob();

        /**
         * The meta object literal for the '<em><b>Screenshot</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROCESS_TYPE__SCREENSHOT = eINSTANCE.getProcessType_Screenshot();

        /**
         * The meta object literal for the '<em><b>Routines Dependencies</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROCESS_TYPE__ROUTINES_DEPENDENCIES = eINSTANCE.getProcessType_RoutinesDependencies();

        /**
         * The meta object literal for the '{@link talendfile.impl.RequiredTypeImpl <em>Required Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see talendfile.impl.RequiredTypeImpl
         * @see talendfile.impl.TalendfilePackageImpl#getRequiredType()
         * @generated
         */
        EClass REQUIRED_TYPE = eINSTANCE.getRequiredType();

        /**
         * The meta object literal for the '<em><b>Job</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REQUIRED_TYPE__JOB = eINSTANCE.getRequiredType_Job();

        /**
         * The meta object literal for the '{@link talendfile.impl.SubjobTypeImpl <em>Subjob Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see talendfile.impl.SubjobTypeImpl
         * @see talendfile.impl.TalendfilePackageImpl#getSubjobType()
         * @generated
         */
        EClass SUBJOB_TYPE = eINSTANCE.getSubjobType();

        /**
         * The meta object literal for the '<em><b>Element Parameter</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SUBJOB_TYPE__ELEMENT_PARAMETER = eINSTANCE.getSubjobType_ElementParameter();

        /**
         * The meta object literal for the '{@link talendfile.impl.ItemInforTypeImpl <em>Item Infor Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see talendfile.impl.ItemInforTypeImpl
         * @see talendfile.impl.TalendfilePackageImpl#getItemInforType()
         * @generated
         */
        EClass ITEM_INFOR_TYPE = eINSTANCE.getItemInforType();

        /**
         * The meta object literal for the '<em><b>Id Or Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM_INFOR_TYPE__ID_OR_NAME = eINSTANCE.getItemInforType_IdOrName();

        /**
         * The meta object literal for the '<em><b>System</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ITEM_INFOR_TYPE__SYSTEM = eINSTANCE.getItemInforType_System();

        /**
         * The meta object literal for the '{@link talendfile.impl.AbstractExternalDataImpl <em>Abstract External Data</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see talendfile.impl.AbstractExternalDataImpl
         * @see talendfile.impl.TalendfilePackageImpl#getAbstractExternalData()
         * @generated
         */
        EClass ABSTRACT_EXTERNAL_DATA = eINSTANCE.getAbstractExternalData();

        /**
         * The meta object literal for the '{@link talendfile.impl.RoutinesParameterTypeImpl <em>Routines Parameter Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see talendfile.impl.RoutinesParameterTypeImpl
         * @see talendfile.impl.TalendfilePackageImpl#getRoutinesParameterType()
         * @generated
         */
        EClass ROUTINES_PARAMETER_TYPE = eINSTANCE.getRoutinesParameterType();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ROUTINES_PARAMETER_TYPE__ID = eINSTANCE.getRoutinesParameterType_Id();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ROUTINES_PARAMETER_TYPE__NAME = eINSTANCE.getRoutinesParameterType_Name();

        /**
         * The meta object literal for the '{@link talendfile.impl.NodeContainerTypeImpl <em>Node Container Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see talendfile.impl.NodeContainerTypeImpl
         * @see talendfile.impl.TalendfilePackageImpl#getNodeContainerType()
         * @generated
         */
        EClass NODE_CONTAINER_TYPE = eINSTANCE.getNodeContainerType();

        /**
         * The meta object literal for the '<em><b>Element Parameter</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NODE_CONTAINER_TYPE__ELEMENT_PARAMETER = eINSTANCE.getNodeContainerType_ElementParameter();

    }

} //TalendfilePackage
