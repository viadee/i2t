/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package talendfile.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import talendfile.ConnectionType;
import talendfile.ContextType;
import talendfile.ItemInforType;
import talendfile.LogsType;
import talendfile.NodeType;
import talendfile.NoteType;
import talendfile.ParametersType;
import talendfile.ProcessType;
import talendfile.RequiredType;
import talendfile.SubjobType;
import talendfile.TalendfilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link talendfile.impl.ProcessTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link talendfile.impl.ProcessTypeImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link talendfile.impl.ProcessTypeImpl#getContext <em>Context</em>}</li>
 *   <li>{@link talendfile.impl.ProcessTypeImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link talendfile.impl.ProcessTypeImpl#getNode <em>Node</em>}</li>
 *   <li>{@link talendfile.impl.ProcessTypeImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link talendfile.impl.ProcessTypeImpl#getNote <em>Note</em>}</li>
 *   <li>{@link talendfile.impl.ProcessTypeImpl#getLogs <em>Logs</em>}</li>
 *   <li>{@link talendfile.impl.ProcessTypeImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link talendfile.impl.ProcessTypeImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link talendfile.impl.ProcessTypeImpl#getDefaultContext <em>Default Context</em>}</li>
 *   <li>{@link talendfile.impl.ProcessTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link talendfile.impl.ProcessTypeImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link talendfile.impl.ProcessTypeImpl#getRepositoryContextId <em>Repository Context Id</em>}</li>
 *   <li>{@link talendfile.impl.ProcessTypeImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link talendfile.impl.ProcessTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link talendfile.impl.ProcessTypeImpl#getSubjob <em>Subjob</em>}</li>
 *   <li>{@link talendfile.impl.ProcessTypeImpl#getScreenshot <em>Screenshot</em>}</li>
 *   <li>{@link talendfile.impl.ProcessTypeImpl#getRoutinesDependencies <em>Routines Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessTypeImpl extends EObjectImpl implements ProcessType {
    /**
     * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected static final String DESCRIPTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected String description = DESCRIPTION_EDEFAULT;

    /**
     * The cached value of the '{@link #getRequired() <em>Required</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRequired()
     * @generated
     * @ordered
     */
    protected RequiredType required;

    /**
     * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContext()
     * @generated
     * @ordered
     */
    protected EList<ContextType> context;

    /**
     * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParameters()
     * @generated
     * @ordered
     */
    protected ParametersType parameters;

    /**
     * The cached value of the '{@link #getNode() <em>Node</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNode()
     * @generated
     * @ordered
     */
    protected EList<NodeType> node;

    /**
     * The cached value of the '{@link #getConnection() <em>Connection</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnection()
     * @generated
     * @ordered
     */
    protected EList<ConnectionType> connection;

    /**
     * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNote()
     * @generated
     * @ordered
     */
    protected EList<NoteType> note;

    /**
     * The cached value of the '{@link #getLogs() <em>Logs</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLogs()
     * @generated
     * @ordered
     */
    protected LogsType logs;

    /**
     * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAuthor()
     * @generated
     * @ordered
     */
    protected static final String AUTHOR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAuthor()
     * @generated
     * @ordered
     */
    protected String author = AUTHOR_EDEFAULT;

    /**
     * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getComment()
     * @generated
     * @ordered
     */
    protected static final String COMMENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getComment()
     * @generated
     * @ordered
     */
    protected String comment = COMMENT_EDEFAULT;

    /**
     * The default value of the '{@link #getDefaultContext() <em>Default Context</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefaultContext()
     * @generated
     * @ordered
     */
    protected static final String DEFAULT_CONTEXT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDefaultContext() <em>Default Context</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefaultContext()
     * @generated
     * @ordered
     */
    protected String defaultContext = DEFAULT_CONTEXT_EDEFAULT;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPurpose()
     * @generated
     * @ordered
     */
    protected static final String PURPOSE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPurpose()
     * @generated
     * @ordered
     */
    protected String purpose = PURPOSE_EDEFAULT;

    /**
     * The default value of the '{@link #getRepositoryContextId() <em>Repository Context Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRepositoryContextId()
     * @generated
     * @ordered
     */
    protected static final String REPOSITORY_CONTEXT_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRepositoryContextId() <em>Repository Context Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRepositoryContextId()
     * @generated
     * @ordered
     */
    protected String repositoryContextId = REPOSITORY_CONTEXT_ID_EDEFAULT;

    /**
     * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStatus()
     * @generated
     * @ordered
     */
    protected static final String STATUS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStatus()
     * @generated
     * @ordered
     */
    protected String status = STATUS_EDEFAULT;

    /**
     * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected static final String VERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected String version = VERSION_EDEFAULT;

    /**
     * The cached value of the '{@link #getSubjob() <em>Subjob</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubjob()
     * @generated
     * @ordered
     */
    protected EList<SubjobType> subjob;

    /**
     * The default value of the '{@link #getScreenshot() <em>Screenshot</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScreenshot()
     * @generated
     * @ordered
     */
    protected static final byte[] SCREENSHOT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getScreenshot() <em>Screenshot</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScreenshot()
     * @generated
     * @ordered
     */
    protected byte[] screenshot = SCREENSHOT_EDEFAULT;

    /**
     * The cached value of the '{@link #getRoutinesDependencies() <em>Routines Dependencies</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRoutinesDependencies()
     * @generated
     * @ordered
     */
    protected EList<ItemInforType> routinesDependencies;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProcessTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TalendfilePackage.Literals.PROCESS_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDescription(String newDescription) {
        String oldDescription = description;
        description = newDescription;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendfilePackage.PROCESS_TYPE__DESCRIPTION, oldDescription, description));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RequiredType getRequired() {
        return required;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRequired(RequiredType newRequired, NotificationChain msgs) {
        RequiredType oldRequired = required;
        required = newRequired;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TalendfilePackage.PROCESS_TYPE__REQUIRED, oldRequired, newRequired);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRequired(RequiredType newRequired) {
        if (newRequired != required) {
            NotificationChain msgs = null;
            if (required != null)
                msgs = ((InternalEObject)required).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TalendfilePackage.PROCESS_TYPE__REQUIRED, null, msgs);
            if (newRequired != null)
                msgs = ((InternalEObject)newRequired).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TalendfilePackage.PROCESS_TYPE__REQUIRED, null, msgs);
            msgs = basicSetRequired(newRequired, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendfilePackage.PROCESS_TYPE__REQUIRED, newRequired, newRequired));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ContextType> getContext() {
        if (context == null) {
            context = new EObjectContainmentEList<ContextType>(ContextType.class, this, TalendfilePackage.PROCESS_TYPE__CONTEXT);
        }
        return context;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParametersType getParameters() {
        return parameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParameters(ParametersType newParameters, NotificationChain msgs) {
        ParametersType oldParameters = parameters;
        parameters = newParameters;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TalendfilePackage.PROCESS_TYPE__PARAMETERS, oldParameters, newParameters);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParameters(ParametersType newParameters) {
        if (newParameters != parameters) {
            NotificationChain msgs = null;
            if (parameters != null)
                msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TalendfilePackage.PROCESS_TYPE__PARAMETERS, null, msgs);
            if (newParameters != null)
                msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TalendfilePackage.PROCESS_TYPE__PARAMETERS, null, msgs);
            msgs = basicSetParameters(newParameters, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendfilePackage.PROCESS_TYPE__PARAMETERS, newParameters, newParameters));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<NodeType> getNode() {
        if (node == null) {
            node = new EObjectContainmentEList<NodeType>(NodeType.class, this, TalendfilePackage.PROCESS_TYPE__NODE);
        }
        return node;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ConnectionType> getConnection() {
        if (connection == null) {
            connection = new EObjectContainmentEList<ConnectionType>(ConnectionType.class, this, TalendfilePackage.PROCESS_TYPE__CONNECTION);
        }
        return connection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<NoteType> getNote() {
        if (note == null) {
            note = new EObjectContainmentEList<NoteType>(NoteType.class, this, TalendfilePackage.PROCESS_TYPE__NOTE);
        }
        return note;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LogsType getLogs() {
        return logs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLogs(LogsType newLogs, NotificationChain msgs) {
        LogsType oldLogs = logs;
        logs = newLogs;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TalendfilePackage.PROCESS_TYPE__LOGS, oldLogs, newLogs);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLogs(LogsType newLogs) {
        if (newLogs != logs) {
            NotificationChain msgs = null;
            if (logs != null)
                msgs = ((InternalEObject)logs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TalendfilePackage.PROCESS_TYPE__LOGS, null, msgs);
            if (newLogs != null)
                msgs = ((InternalEObject)newLogs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TalendfilePackage.PROCESS_TYPE__LOGS, null, msgs);
            msgs = basicSetLogs(newLogs, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendfilePackage.PROCESS_TYPE__LOGS, newLogs, newLogs));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAuthor() {
        return author;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAuthor(String newAuthor) {
        String oldAuthor = author;
        author = newAuthor;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendfilePackage.PROCESS_TYPE__AUTHOR, oldAuthor, author));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getComment() {
        return comment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setComment(String newComment) {
        String oldComment = comment;
        comment = newComment;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendfilePackage.PROCESS_TYPE__COMMENT, oldComment, comment));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDefaultContext() {
        return defaultContext;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDefaultContext(String newDefaultContext) {
        String oldDefaultContext = defaultContext;
        defaultContext = newDefaultContext;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendfilePackage.PROCESS_TYPE__DEFAULT_CONTEXT, oldDefaultContext, defaultContext));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendfilePackage.PROCESS_TYPE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPurpose(String newPurpose) {
        String oldPurpose = purpose;
        purpose = newPurpose;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendfilePackage.PROCESS_TYPE__PURPOSE, oldPurpose, purpose));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getRepositoryContextId() {
        return repositoryContextId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRepositoryContextId(String newRepositoryContextId) {
        String oldRepositoryContextId = repositoryContextId;
        repositoryContextId = newRepositoryContextId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendfilePackage.PROCESS_TYPE__REPOSITORY_CONTEXT_ID, oldRepositoryContextId, repositoryContextId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getStatus() {
        return status;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStatus(String newStatus) {
        String oldStatus = status;
        status = newStatus;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendfilePackage.PROCESS_TYPE__STATUS, oldStatus, status));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getVersion() {
        return version;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVersion(String newVersion) {
        String oldVersion = version;
        version = newVersion;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendfilePackage.PROCESS_TYPE__VERSION, oldVersion, version));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SubjobType> getSubjob() {
        if (subjob == null) {
            subjob = new EObjectContainmentEList<SubjobType>(SubjobType.class, this, TalendfilePackage.PROCESS_TYPE__SUBJOB);
        }
        return subjob;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public byte[] getScreenshot() {
        return screenshot;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setScreenshot(byte[] newScreenshot) {
        byte[] oldScreenshot = screenshot;
        screenshot = newScreenshot;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendfilePackage.PROCESS_TYPE__SCREENSHOT, oldScreenshot, screenshot));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ItemInforType> getRoutinesDependencies() {
        if (routinesDependencies == null) {
            routinesDependencies = new EObjectContainmentEList<ItemInforType>(ItemInforType.class, this, TalendfilePackage.PROCESS_TYPE__ROUTINES_DEPENDENCIES);
        }
        return routinesDependencies;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TalendfilePackage.PROCESS_TYPE__REQUIRED:
                return basicSetRequired(null, msgs);
            case TalendfilePackage.PROCESS_TYPE__CONTEXT:
                return ((InternalEList<?>)getContext()).basicRemove(otherEnd, msgs);
            case TalendfilePackage.PROCESS_TYPE__PARAMETERS:
                return basicSetParameters(null, msgs);
            case TalendfilePackage.PROCESS_TYPE__NODE:
                return ((InternalEList<?>)getNode()).basicRemove(otherEnd, msgs);
            case TalendfilePackage.PROCESS_TYPE__CONNECTION:
                return ((InternalEList<?>)getConnection()).basicRemove(otherEnd, msgs);
            case TalendfilePackage.PROCESS_TYPE__NOTE:
                return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
            case TalendfilePackage.PROCESS_TYPE__LOGS:
                return basicSetLogs(null, msgs);
            case TalendfilePackage.PROCESS_TYPE__SUBJOB:
                return ((InternalEList<?>)getSubjob()).basicRemove(otherEnd, msgs);
            case TalendfilePackage.PROCESS_TYPE__ROUTINES_DEPENDENCIES:
                return ((InternalEList<?>)getRoutinesDependencies()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TalendfilePackage.PROCESS_TYPE__DESCRIPTION:
                return getDescription();
            case TalendfilePackage.PROCESS_TYPE__REQUIRED:
                return getRequired();
            case TalendfilePackage.PROCESS_TYPE__CONTEXT:
                return getContext();
            case TalendfilePackage.PROCESS_TYPE__PARAMETERS:
                return getParameters();
            case TalendfilePackage.PROCESS_TYPE__NODE:
                return getNode();
            case TalendfilePackage.PROCESS_TYPE__CONNECTION:
                return getConnection();
            case TalendfilePackage.PROCESS_TYPE__NOTE:
                return getNote();
            case TalendfilePackage.PROCESS_TYPE__LOGS:
                return getLogs();
            case TalendfilePackage.PROCESS_TYPE__AUTHOR:
                return getAuthor();
            case TalendfilePackage.PROCESS_TYPE__COMMENT:
                return getComment();
            case TalendfilePackage.PROCESS_TYPE__DEFAULT_CONTEXT:
                return getDefaultContext();
            case TalendfilePackage.PROCESS_TYPE__NAME:
                return getName();
            case TalendfilePackage.PROCESS_TYPE__PURPOSE:
                return getPurpose();
            case TalendfilePackage.PROCESS_TYPE__REPOSITORY_CONTEXT_ID:
                return getRepositoryContextId();
            case TalendfilePackage.PROCESS_TYPE__STATUS:
                return getStatus();
            case TalendfilePackage.PROCESS_TYPE__VERSION:
                return getVersion();
            case TalendfilePackage.PROCESS_TYPE__SUBJOB:
                return getSubjob();
            case TalendfilePackage.PROCESS_TYPE__SCREENSHOT:
                return getScreenshot();
            case TalendfilePackage.PROCESS_TYPE__ROUTINES_DEPENDENCIES:
                return getRoutinesDependencies();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case TalendfilePackage.PROCESS_TYPE__DESCRIPTION:
                setDescription((String)newValue);
                return;
            case TalendfilePackage.PROCESS_TYPE__REQUIRED:
                setRequired((RequiredType)newValue);
                return;
            case TalendfilePackage.PROCESS_TYPE__CONTEXT:
                getContext().clear();
                getContext().addAll((Collection<? extends ContextType>)newValue);
                return;
            case TalendfilePackage.PROCESS_TYPE__PARAMETERS:
                setParameters((ParametersType)newValue);
                return;
            case TalendfilePackage.PROCESS_TYPE__NODE:
                getNode().clear();
                getNode().addAll((Collection<? extends NodeType>)newValue);
                return;
            case TalendfilePackage.PROCESS_TYPE__CONNECTION:
                getConnection().clear();
                getConnection().addAll((Collection<? extends ConnectionType>)newValue);
                return;
            case TalendfilePackage.PROCESS_TYPE__NOTE:
                getNote().clear();
                getNote().addAll((Collection<? extends NoteType>)newValue);
                return;
            case TalendfilePackage.PROCESS_TYPE__LOGS:
                setLogs((LogsType)newValue);
                return;
            case TalendfilePackage.PROCESS_TYPE__AUTHOR:
                setAuthor((String)newValue);
                return;
            case TalendfilePackage.PROCESS_TYPE__COMMENT:
                setComment((String)newValue);
                return;
            case TalendfilePackage.PROCESS_TYPE__DEFAULT_CONTEXT:
                setDefaultContext((String)newValue);
                return;
            case TalendfilePackage.PROCESS_TYPE__NAME:
                setName((String)newValue);
                return;
            case TalendfilePackage.PROCESS_TYPE__PURPOSE:
                setPurpose((String)newValue);
                return;
            case TalendfilePackage.PROCESS_TYPE__REPOSITORY_CONTEXT_ID:
                setRepositoryContextId((String)newValue);
                return;
            case TalendfilePackage.PROCESS_TYPE__STATUS:
                setStatus((String)newValue);
                return;
            case TalendfilePackage.PROCESS_TYPE__VERSION:
                setVersion((String)newValue);
                return;
            case TalendfilePackage.PROCESS_TYPE__SUBJOB:
                getSubjob().clear();
                getSubjob().addAll((Collection<? extends SubjobType>)newValue);
                return;
            case TalendfilePackage.PROCESS_TYPE__SCREENSHOT:
                setScreenshot((byte[])newValue);
                return;
            case TalendfilePackage.PROCESS_TYPE__ROUTINES_DEPENDENCIES:
                getRoutinesDependencies().clear();
                getRoutinesDependencies().addAll((Collection<? extends ItemInforType>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case TalendfilePackage.PROCESS_TYPE__DESCRIPTION:
                setDescription(DESCRIPTION_EDEFAULT);
                return;
            case TalendfilePackage.PROCESS_TYPE__REQUIRED:
                setRequired((RequiredType)null);
                return;
            case TalendfilePackage.PROCESS_TYPE__CONTEXT:
                getContext().clear();
                return;
            case TalendfilePackage.PROCESS_TYPE__PARAMETERS:
                setParameters((ParametersType)null);
                return;
            case TalendfilePackage.PROCESS_TYPE__NODE:
                getNode().clear();
                return;
            case TalendfilePackage.PROCESS_TYPE__CONNECTION:
                getConnection().clear();
                return;
            case TalendfilePackage.PROCESS_TYPE__NOTE:
                getNote().clear();
                return;
            case TalendfilePackage.PROCESS_TYPE__LOGS:
                setLogs((LogsType)null);
                return;
            case TalendfilePackage.PROCESS_TYPE__AUTHOR:
                setAuthor(AUTHOR_EDEFAULT);
                return;
            case TalendfilePackage.PROCESS_TYPE__COMMENT:
                setComment(COMMENT_EDEFAULT);
                return;
            case TalendfilePackage.PROCESS_TYPE__DEFAULT_CONTEXT:
                setDefaultContext(DEFAULT_CONTEXT_EDEFAULT);
                return;
            case TalendfilePackage.PROCESS_TYPE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case TalendfilePackage.PROCESS_TYPE__PURPOSE:
                setPurpose(PURPOSE_EDEFAULT);
                return;
            case TalendfilePackage.PROCESS_TYPE__REPOSITORY_CONTEXT_ID:
                setRepositoryContextId(REPOSITORY_CONTEXT_ID_EDEFAULT);
                return;
            case TalendfilePackage.PROCESS_TYPE__STATUS:
                setStatus(STATUS_EDEFAULT);
                return;
            case TalendfilePackage.PROCESS_TYPE__VERSION:
                setVersion(VERSION_EDEFAULT);
                return;
            case TalendfilePackage.PROCESS_TYPE__SUBJOB:
                getSubjob().clear();
                return;
            case TalendfilePackage.PROCESS_TYPE__SCREENSHOT:
                setScreenshot(SCREENSHOT_EDEFAULT);
                return;
            case TalendfilePackage.PROCESS_TYPE__ROUTINES_DEPENDENCIES:
                getRoutinesDependencies().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case TalendfilePackage.PROCESS_TYPE__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
            case TalendfilePackage.PROCESS_TYPE__REQUIRED:
                return required != null;
            case TalendfilePackage.PROCESS_TYPE__CONTEXT:
                return context != null && !context.isEmpty();
            case TalendfilePackage.PROCESS_TYPE__PARAMETERS:
                return parameters != null;
            case TalendfilePackage.PROCESS_TYPE__NODE:
                return node != null && !node.isEmpty();
            case TalendfilePackage.PROCESS_TYPE__CONNECTION:
                return connection != null && !connection.isEmpty();
            case TalendfilePackage.PROCESS_TYPE__NOTE:
                return note != null && !note.isEmpty();
            case TalendfilePackage.PROCESS_TYPE__LOGS:
                return logs != null;
            case TalendfilePackage.PROCESS_TYPE__AUTHOR:
                return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
            case TalendfilePackage.PROCESS_TYPE__COMMENT:
                return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
            case TalendfilePackage.PROCESS_TYPE__DEFAULT_CONTEXT:
                return DEFAULT_CONTEXT_EDEFAULT == null ? defaultContext != null : !DEFAULT_CONTEXT_EDEFAULT.equals(defaultContext);
            case TalendfilePackage.PROCESS_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case TalendfilePackage.PROCESS_TYPE__PURPOSE:
                return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
            case TalendfilePackage.PROCESS_TYPE__REPOSITORY_CONTEXT_ID:
                return REPOSITORY_CONTEXT_ID_EDEFAULT == null ? repositoryContextId != null : !REPOSITORY_CONTEXT_ID_EDEFAULT.equals(repositoryContextId);
            case TalendfilePackage.PROCESS_TYPE__STATUS:
                return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
            case TalendfilePackage.PROCESS_TYPE__VERSION:
                return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
            case TalendfilePackage.PROCESS_TYPE__SUBJOB:
                return subjob != null && !subjob.isEmpty();
            case TalendfilePackage.PROCESS_TYPE__SCREENSHOT:
                return SCREENSHOT_EDEFAULT == null ? screenshot != null : !SCREENSHOT_EDEFAULT.equals(screenshot);
            case TalendfilePackage.PROCESS_TYPE__ROUTINES_DEPENDENCIES:
                return routinesDependencies != null && !routinesDependencies.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (description: ");
        result.append(description);
        result.append(", author: ");
        result.append(author);
        result.append(", comment: ");
        result.append(comment);
        result.append(", defaultContext: ");
        result.append(defaultContext);
        result.append(", name: ");
        result.append(name);
        result.append(", purpose: ");
        result.append(purpose);
        result.append(", repositoryContextId: ");
        result.append(repositoryContextId);
        result.append(", status: ");
        result.append(status);
        result.append(", version: ");
        result.append(version);
        result.append(", screenshot: ");
        result.append(screenshot);
        result.append(')');
        return result.toString();
    }

} //ProcessTypeImpl
