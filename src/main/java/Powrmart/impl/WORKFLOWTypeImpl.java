/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.ATTRIBUTEType;
import Powrmart.CONWFRUNINFOType;
import Powrmart.ISENABLEDType;
import Powrmart.ISRUNNABLESERVICEType;
import Powrmart.ISSERVICEType;
import Powrmart.ISVALIDType1;
import Powrmart.METADATAEXTENSIONType;
import Powrmart.PowrmartPackage;
import Powrmart.REUSABLESCHEDULERType;
import Powrmart.SCHEDULERType;
import Powrmart.SESSIONType;
import Powrmart.SUSPENDONERRORType;
import Powrmart.TASKINSTANCEType;
import Powrmart.TASKSMUSTRUNONSERVERType;
import Powrmart.TASKType;
import Powrmart.WORKFLOWEVENTType;
import Powrmart.WORKFLOWLINKType;
import Powrmart.WORKFLOWType;
import Powrmart.WORKFLOWVARIABLEType;
import Powrmart.WORKLETType;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WORKFLOW Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.WORKFLOWTypeImpl#getSCHEDULER <em>SCHEDULER</em>}</li>
 *   <li>{@link Powrmart.impl.WORKFLOWTypeImpl#getTASK <em>TASK</em>}</li>
 *   <li>{@link Powrmart.impl.WORKFLOWTypeImpl#getSESSION <em>SESSION</em>}</li>
 *   <li>{@link Powrmart.impl.WORKFLOWTypeImpl#getWORKLET <em>WORKLET</em>}</li>
 *   <li>{@link Powrmart.impl.WORKFLOWTypeImpl#getTASKINSTANCE <em>TASKINSTANCE</em>}</li>
 *   <li>{@link Powrmart.impl.WORKFLOWTypeImpl#getWORKFLOWLINK <em>WORKFLOWLINK</em>}</li>
 *   <li>{@link Powrmart.impl.WORKFLOWTypeImpl#getWORKFLOWVARIABLE <em>WORKFLOWVARIABLE</em>}</li>
 *   <li>{@link Powrmart.impl.WORKFLOWTypeImpl#getWORKFLOWEVENT <em>WORKFLOWEVENT</em>}</li>
 *   <li>{@link Powrmart.impl.WORKFLOWTypeImpl#getATTRIBUTE <em>ATTRIBUTE</em>}</li>
 *   <li>{@link Powrmart.impl.WORKFLOWTypeImpl#getMETADATAEXTENSION <em>METADATAEXTENSION</em>}</li>
 *   <li>{@link Powrmart.impl.WORKFLOWTypeImpl#getCONWFRUNINFO <em>CONWFRUNINFO</em>}</li>
 *   <li>{@link Powrmart.impl.WORKFLOWTypeImpl#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.impl.WORKFLOWTypeImpl#getISENABLED <em>ISENABLED</em>}</li>
 *   <li>{@link Powrmart.impl.WORKFLOWTypeImpl#getISRUNNABLESERVICE <em>ISRUNNABLESERVICE</em>}</li>
 *   <li>{@link Powrmart.impl.WORKFLOWTypeImpl#getISSERVICE <em>ISSERVICE</em>}</li>
 *   <li>{@link Powrmart.impl.WORKFLOWTypeImpl#getISVALID <em>ISVALID</em>}</li>
 *   <li>{@link Powrmart.impl.WORKFLOWTypeImpl#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.impl.WORKFLOWTypeImpl#getREUSABLESCHEDULER <em>REUSABLESCHEDULER</em>}</li>
 *   <li>{@link Powrmart.impl.WORKFLOWTypeImpl#getSCHEDULERNAME <em>SCHEDULERNAME</em>}</li>
 *   <li>{@link Powrmart.impl.WORKFLOWTypeImpl#getSERVERDOMAINNAME <em>SERVERDOMAINNAME</em>}</li>
 *   <li>{@link Powrmart.impl.WORKFLOWTypeImpl#getSERVERNAME <em>SERVERNAME</em>}</li>
 *   <li>{@link Powrmart.impl.WORKFLOWTypeImpl#getSERVICELEVELNAME <em>SERVICELEVELNAME</em>}</li>
 *   <li>{@link Powrmart.impl.WORKFLOWTypeImpl#getSUSPENDONERROR <em>SUSPENDONERROR</em>}</li>
 *   <li>{@link Powrmart.impl.WORKFLOWTypeImpl#getSUSPENSIONEMAIL <em>SUSPENSIONEMAIL</em>}</li>
 *   <li>{@link Powrmart.impl.WORKFLOWTypeImpl#getTASKSMUSTRUNONSERVER <em>TASKSMUSTRUNONSERVER</em>}</li>
 *   <li>{@link Powrmart.impl.WORKFLOWTypeImpl#getVERSIONNUMBER <em>VERSIONNUMBER</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WORKFLOWTypeImpl extends EObjectImpl implements WORKFLOWType {
    /**
     * The cached value of the '{@link #getSCHEDULER() <em>SCHEDULER</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSCHEDULER()
     * @generated
     * @ordered
     */
    protected SCHEDULERType sCHEDULER;

    /**
     * The cached value of the '{@link #getTASK() <em>TASK</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTASK()
     * @generated
     * @ordered
     */
    protected EList<TASKType> tASK;

    /**
     * The cached value of the '{@link #getSESSION() <em>SESSION</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSESSION()
     * @generated
     * @ordered
     */
    protected EList<SESSIONType> sESSION;

    /**
     * The cached value of the '{@link #getWORKLET() <em>WORKLET</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWORKLET()
     * @generated
     * @ordered
     */
    protected EList<WORKLETType> wORKLET;

    /**
     * The cached value of the '{@link #getTASKINSTANCE() <em>TASKINSTANCE</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTASKINSTANCE()
     * @generated
     * @ordered
     */
    protected EList<TASKINSTANCEType> tASKINSTANCE;

    /**
     * The cached value of the '{@link #getWORKFLOWLINK() <em>WORKFLOWLINK</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWORKFLOWLINK()
     * @generated
     * @ordered
     */
    protected EList<WORKFLOWLINKType> wORKFLOWLINK;

    /**
     * The cached value of the '{@link #getWORKFLOWVARIABLE() <em>WORKFLOWVARIABLE</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWORKFLOWVARIABLE()
     * @generated
     * @ordered
     */
    protected EList<WORKFLOWVARIABLEType> wORKFLOWVARIABLE;

    /**
     * The cached value of the '{@link #getWORKFLOWEVENT() <em>WORKFLOWEVENT</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWORKFLOWEVENT()
     * @generated
     * @ordered
     */
    protected EList<WORKFLOWEVENTType> wORKFLOWEVENT;

    /**
     * The cached value of the '{@link #getATTRIBUTE() <em>ATTRIBUTE</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getATTRIBUTE()
     * @generated
     * @ordered
     */
    protected EList<ATTRIBUTEType> aTTRIBUTE;

    /**
     * The cached value of the '{@link #getMETADATAEXTENSION() <em>METADATAEXTENSION</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMETADATAEXTENSION()
     * @generated
     * @ordered
     */
    protected EList<METADATAEXTENSIONType> mETADATAEXTENSION;

    /**
     * The cached value of the '{@link #getCONWFRUNINFO() <em>CONWFRUNINFO</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCONWFRUNINFO()
     * @generated
     * @ordered
     */
    protected EList<CONWFRUNINFOType> cONWFRUNINFO;

    /**
     * The default value of the '{@link #getDESCRIPTION() <em>DESCRIPTION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDESCRIPTION()
     * @generated
     * @ordered
     */
    protected static final Object DESCRIPTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDESCRIPTION() <em>DESCRIPTION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDESCRIPTION()
     * @generated
     * @ordered
     */
    protected Object dESCRIPTION = DESCRIPTION_EDEFAULT;

    /**
     * The default value of the '{@link #getISENABLED() <em>ISENABLED</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISENABLED()
     * @generated
     * @ordered
     */
    protected static final ISENABLEDType ISENABLED_EDEFAULT = ISENABLEDType.YES;

    /**
     * The cached value of the '{@link #getISENABLED() <em>ISENABLED</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISENABLED()
     * @generated
     * @ordered
     */
    protected ISENABLEDType iSENABLED = ISENABLED_EDEFAULT;

    /**
     * This is true if the ISENABLED attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean iSENABLEDESet;

    /**
     * The default value of the '{@link #getISRUNNABLESERVICE() <em>ISRUNNABLESERVICE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISRUNNABLESERVICE()
     * @generated
     * @ordered
     */
    protected static final ISRUNNABLESERVICEType ISRUNNABLESERVICE_EDEFAULT = ISRUNNABLESERVICEType.YES;

    /**
     * The cached value of the '{@link #getISRUNNABLESERVICE() <em>ISRUNNABLESERVICE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISRUNNABLESERVICE()
     * @generated
     * @ordered
     */
    protected ISRUNNABLESERVICEType iSRUNNABLESERVICE = ISRUNNABLESERVICE_EDEFAULT;

    /**
     * This is true if the ISRUNNABLESERVICE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean iSRUNNABLESERVICEESet;

    /**
     * The default value of the '{@link #getISSERVICE() <em>ISSERVICE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISSERVICE()
     * @generated
     * @ordered
     */
    protected static final ISSERVICEType ISSERVICE_EDEFAULT = ISSERVICEType.YES;

    /**
     * The cached value of the '{@link #getISSERVICE() <em>ISSERVICE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISSERVICE()
     * @generated
     * @ordered
     */
    protected ISSERVICEType iSSERVICE = ISSERVICE_EDEFAULT;

    /**
     * This is true if the ISSERVICE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean iSSERVICEESet;

    /**
     * The default value of the '{@link #getISVALID() <em>ISVALID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISVALID()
     * @generated
     * @ordered
     */
    protected static final ISVALIDType1 ISVALID_EDEFAULT = ISVALIDType1.YES;

    /**
     * The cached value of the '{@link #getISVALID() <em>ISVALID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISVALID()
     * @generated
     * @ordered
     */
    protected ISVALIDType1 iSVALID = ISVALID_EDEFAULT;

    /**
     * This is true if the ISVALID attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean iSVALIDESet;

    /**
     * The default value of the '{@link #getNAME() <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNAME()
     * @generated
     * @ordered
     */
    protected static final Object NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNAME() <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNAME()
     * @generated
     * @ordered
     */
    protected Object nAME = NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getREUSABLESCHEDULER() <em>REUSABLESCHEDULER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREUSABLESCHEDULER()
     * @generated
     * @ordered
     */
    protected static final REUSABLESCHEDULERType REUSABLESCHEDULER_EDEFAULT = REUSABLESCHEDULERType.YES;

    /**
     * The cached value of the '{@link #getREUSABLESCHEDULER() <em>REUSABLESCHEDULER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREUSABLESCHEDULER()
     * @generated
     * @ordered
     */
    protected REUSABLESCHEDULERType rEUSABLESCHEDULER = REUSABLESCHEDULER_EDEFAULT;

    /**
     * This is true if the REUSABLESCHEDULER attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rEUSABLESCHEDULERESet;

    /**
     * The default value of the '{@link #getSCHEDULERNAME() <em>SCHEDULERNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSCHEDULERNAME()
     * @generated
     * @ordered
     */
    protected static final Object SCHEDULERNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSCHEDULERNAME() <em>SCHEDULERNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSCHEDULERNAME()
     * @generated
     * @ordered
     */
    protected Object sCHEDULERNAME = SCHEDULERNAME_EDEFAULT;

    /**
     * The default value of the '{@link #getSERVERDOMAINNAME() <em>SERVERDOMAINNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSERVERDOMAINNAME()
     * @generated
     * @ordered
     */
    protected static final Object SERVERDOMAINNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSERVERDOMAINNAME() <em>SERVERDOMAINNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSERVERDOMAINNAME()
     * @generated
     * @ordered
     */
    protected Object sERVERDOMAINNAME = SERVERDOMAINNAME_EDEFAULT;

    /**
     * The default value of the '{@link #getSERVERNAME() <em>SERVERNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSERVERNAME()
     * @generated
     * @ordered
     */
    protected static final Object SERVERNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSERVERNAME() <em>SERVERNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSERVERNAME()
     * @generated
     * @ordered
     */
    protected Object sERVERNAME = SERVERNAME_EDEFAULT;

    /**
     * The default value of the '{@link #getSERVICELEVELNAME() <em>SERVICELEVELNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSERVICELEVELNAME()
     * @generated
     * @ordered
     */
    protected static final Object SERVICELEVELNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSERVICELEVELNAME() <em>SERVICELEVELNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSERVICELEVELNAME()
     * @generated
     * @ordered
     */
    protected Object sERVICELEVELNAME = SERVICELEVELNAME_EDEFAULT;

    /**
     * The default value of the '{@link #getSUSPENDONERROR() <em>SUSPENDONERROR</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSUSPENDONERROR()
     * @generated
     * @ordered
     */
    protected static final SUSPENDONERRORType SUSPENDONERROR_EDEFAULT = SUSPENDONERRORType.YES;

    /**
     * The cached value of the '{@link #getSUSPENDONERROR() <em>SUSPENDONERROR</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSUSPENDONERROR()
     * @generated
     * @ordered
     */
    protected SUSPENDONERRORType sUSPENDONERROR = SUSPENDONERROR_EDEFAULT;

    /**
     * This is true if the SUSPENDONERROR attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sUSPENDONERRORESet;

    /**
     * The default value of the '{@link #getSUSPENSIONEMAIL() <em>SUSPENSIONEMAIL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSUSPENSIONEMAIL()
     * @generated
     * @ordered
     */
    protected static final Object SUSPENSIONEMAIL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSUSPENSIONEMAIL() <em>SUSPENSIONEMAIL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSUSPENSIONEMAIL()
     * @generated
     * @ordered
     */
    protected Object sUSPENSIONEMAIL = SUSPENSIONEMAIL_EDEFAULT;

    /**
     * The default value of the '{@link #getTASKSMUSTRUNONSERVER() <em>TASKSMUSTRUNONSERVER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTASKSMUSTRUNONSERVER()
     * @generated
     * @ordered
     */
    protected static final TASKSMUSTRUNONSERVERType TASKSMUSTRUNONSERVER_EDEFAULT = TASKSMUSTRUNONSERVERType.YES;

    /**
     * The cached value of the '{@link #getTASKSMUSTRUNONSERVER() <em>TASKSMUSTRUNONSERVER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTASKSMUSTRUNONSERVER()
     * @generated
     * @ordered
     */
    protected TASKSMUSTRUNONSERVERType tASKSMUSTRUNONSERVER = TASKSMUSTRUNONSERVER_EDEFAULT;

    /**
     * This is true if the TASKSMUSTRUNONSERVER attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tASKSMUSTRUNONSERVERESet;

    /**
     * The default value of the '{@link #getVERSIONNUMBER() <em>VERSIONNUMBER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVERSIONNUMBER()
     * @generated
     * @ordered
     */
    protected static final Object VERSIONNUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVERSIONNUMBER() <em>VERSIONNUMBER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVERSIONNUMBER()
     * @generated
     * @ordered
     */
    protected Object vERSIONNUMBER = VERSIONNUMBER_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WORKFLOWTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getWORKFLOWType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SCHEDULERType getSCHEDULER() {
        return sCHEDULER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSCHEDULER(SCHEDULERType newSCHEDULER, NotificationChain msgs) {
        SCHEDULERType oldSCHEDULER = sCHEDULER;
        sCHEDULER = newSCHEDULER;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PowrmartPackage.WORKFLOW_TYPE__SCHEDULER, oldSCHEDULER, newSCHEDULER);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSCHEDULER(SCHEDULERType newSCHEDULER) {
        if (newSCHEDULER != sCHEDULER) {
            NotificationChain msgs = null;
            if (sCHEDULER != null)
                msgs = ((InternalEObject)sCHEDULER).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PowrmartPackage.WORKFLOW_TYPE__SCHEDULER, null, msgs);
            if (newSCHEDULER != null)
                msgs = ((InternalEObject)newSCHEDULER).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PowrmartPackage.WORKFLOW_TYPE__SCHEDULER, null, msgs);
            msgs = basicSetSCHEDULER(newSCHEDULER, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.WORKFLOW_TYPE__SCHEDULER, newSCHEDULER, newSCHEDULER));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TASKType> getTASK() {
        if (tASK == null) {
            tASK = new EObjectContainmentEList<TASKType>(TASKType.class, this, PowrmartPackage.WORKFLOW_TYPE__TASK);
        }
        return tASK;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SESSIONType> getSESSION() {
        if (sESSION == null) {
            sESSION = new EObjectContainmentEList<SESSIONType>(SESSIONType.class, this, PowrmartPackage.WORKFLOW_TYPE__SESSION);
        }
        return sESSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<WORKLETType> getWORKLET() {
        if (wORKLET == null) {
            wORKLET = new EObjectContainmentEList<WORKLETType>(WORKLETType.class, this, PowrmartPackage.WORKFLOW_TYPE__WORKLET);
        }
        return wORKLET;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TASKINSTANCEType> getTASKINSTANCE() {
        if (tASKINSTANCE == null) {
            tASKINSTANCE = new EObjectContainmentEList<TASKINSTANCEType>(TASKINSTANCEType.class, this, PowrmartPackage.WORKFLOW_TYPE__TASKINSTANCE);
        }
        return tASKINSTANCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<WORKFLOWLINKType> getWORKFLOWLINK() {
        if (wORKFLOWLINK == null) {
            wORKFLOWLINK = new EObjectContainmentEList<WORKFLOWLINKType>(WORKFLOWLINKType.class, this, PowrmartPackage.WORKFLOW_TYPE__WORKFLOWLINK);
        }
        return wORKFLOWLINK;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<WORKFLOWVARIABLEType> getWORKFLOWVARIABLE() {
        if (wORKFLOWVARIABLE == null) {
            wORKFLOWVARIABLE = new EObjectContainmentEList<WORKFLOWVARIABLEType>(WORKFLOWVARIABLEType.class, this, PowrmartPackage.WORKFLOW_TYPE__WORKFLOWVARIABLE);
        }
        return wORKFLOWVARIABLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<WORKFLOWEVENTType> getWORKFLOWEVENT() {
        if (wORKFLOWEVENT == null) {
            wORKFLOWEVENT = new EObjectContainmentEList<WORKFLOWEVENTType>(WORKFLOWEVENTType.class, this, PowrmartPackage.WORKFLOW_TYPE__WORKFLOWEVENT);
        }
        return wORKFLOWEVENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ATTRIBUTEType> getATTRIBUTE() {
        if (aTTRIBUTE == null) {
            aTTRIBUTE = new EObjectContainmentEList<ATTRIBUTEType>(ATTRIBUTEType.class, this, PowrmartPackage.WORKFLOW_TYPE__ATTRIBUTE);
        }
        return aTTRIBUTE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<METADATAEXTENSIONType> getMETADATAEXTENSION() {
        if (mETADATAEXTENSION == null) {
            mETADATAEXTENSION = new EObjectContainmentEList<METADATAEXTENSIONType>(METADATAEXTENSIONType.class, this, PowrmartPackage.WORKFLOW_TYPE__METADATAEXTENSION);
        }
        return mETADATAEXTENSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CONWFRUNINFOType> getCONWFRUNINFO() {
        if (cONWFRUNINFO == null) {
            cONWFRUNINFO = new EObjectContainmentEList<CONWFRUNINFOType>(CONWFRUNINFOType.class, this, PowrmartPackage.WORKFLOW_TYPE__CONWFRUNINFO);
        }
        return cONWFRUNINFO;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getDESCRIPTION() {
        return dESCRIPTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDESCRIPTION(Object newDESCRIPTION) {
        Object oldDESCRIPTION = dESCRIPTION;
        dESCRIPTION = newDESCRIPTION;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.WORKFLOW_TYPE__DESCRIPTION, oldDESCRIPTION, dESCRIPTION));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISENABLEDType getISENABLED() {
        return iSENABLED;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setISENABLED(ISENABLEDType newISENABLED) {
        ISENABLEDType oldISENABLED = iSENABLED;
        iSENABLED = newISENABLED == null ? ISENABLED_EDEFAULT : newISENABLED;
        boolean oldISENABLEDESet = iSENABLEDESet;
        iSENABLEDESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.WORKFLOW_TYPE__ISENABLED, oldISENABLED, iSENABLED, !oldISENABLEDESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetISENABLED() {
        ISENABLEDType oldISENABLED = iSENABLED;
        boolean oldISENABLEDESet = iSENABLEDESet;
        iSENABLED = ISENABLED_EDEFAULT;
        iSENABLEDESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.WORKFLOW_TYPE__ISENABLED, oldISENABLED, ISENABLED_EDEFAULT, oldISENABLEDESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetISENABLED() {
        return iSENABLEDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISRUNNABLESERVICEType getISRUNNABLESERVICE() {
        return iSRUNNABLESERVICE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setISRUNNABLESERVICE(ISRUNNABLESERVICEType newISRUNNABLESERVICE) {
        ISRUNNABLESERVICEType oldISRUNNABLESERVICE = iSRUNNABLESERVICE;
        iSRUNNABLESERVICE = newISRUNNABLESERVICE == null ? ISRUNNABLESERVICE_EDEFAULT : newISRUNNABLESERVICE;
        boolean oldISRUNNABLESERVICEESet = iSRUNNABLESERVICEESet;
        iSRUNNABLESERVICEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.WORKFLOW_TYPE__ISRUNNABLESERVICE, oldISRUNNABLESERVICE, iSRUNNABLESERVICE, !oldISRUNNABLESERVICEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetISRUNNABLESERVICE() {
        ISRUNNABLESERVICEType oldISRUNNABLESERVICE = iSRUNNABLESERVICE;
        boolean oldISRUNNABLESERVICEESet = iSRUNNABLESERVICEESet;
        iSRUNNABLESERVICE = ISRUNNABLESERVICE_EDEFAULT;
        iSRUNNABLESERVICEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.WORKFLOW_TYPE__ISRUNNABLESERVICE, oldISRUNNABLESERVICE, ISRUNNABLESERVICE_EDEFAULT, oldISRUNNABLESERVICEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetISRUNNABLESERVICE() {
        return iSRUNNABLESERVICEESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISSERVICEType getISSERVICE() {
        return iSSERVICE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setISSERVICE(ISSERVICEType newISSERVICE) {
        ISSERVICEType oldISSERVICE = iSSERVICE;
        iSSERVICE = newISSERVICE == null ? ISSERVICE_EDEFAULT : newISSERVICE;
        boolean oldISSERVICEESet = iSSERVICEESet;
        iSSERVICEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.WORKFLOW_TYPE__ISSERVICE, oldISSERVICE, iSSERVICE, !oldISSERVICEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetISSERVICE() {
        ISSERVICEType oldISSERVICE = iSSERVICE;
        boolean oldISSERVICEESet = iSSERVICEESet;
        iSSERVICE = ISSERVICE_EDEFAULT;
        iSSERVICEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.WORKFLOW_TYPE__ISSERVICE, oldISSERVICE, ISSERVICE_EDEFAULT, oldISSERVICEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetISSERVICE() {
        return iSSERVICEESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISVALIDType1 getISVALID() {
        return iSVALID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setISVALID(ISVALIDType1 newISVALID) {
        ISVALIDType1 oldISVALID = iSVALID;
        iSVALID = newISVALID == null ? ISVALID_EDEFAULT : newISVALID;
        boolean oldISVALIDESet = iSVALIDESet;
        iSVALIDESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.WORKFLOW_TYPE__ISVALID, oldISVALID, iSVALID, !oldISVALIDESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetISVALID() {
        ISVALIDType1 oldISVALID = iSVALID;
        boolean oldISVALIDESet = iSVALIDESet;
        iSVALID = ISVALID_EDEFAULT;
        iSVALIDESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.WORKFLOW_TYPE__ISVALID, oldISVALID, ISVALID_EDEFAULT, oldISVALIDESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetISVALID() {
        return iSVALIDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getNAME() {
        return nAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNAME(Object newNAME) {
        Object oldNAME = nAME;
        nAME = newNAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.WORKFLOW_TYPE__NAME, oldNAME, nAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public REUSABLESCHEDULERType getREUSABLESCHEDULER() {
        return rEUSABLESCHEDULER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setREUSABLESCHEDULER(REUSABLESCHEDULERType newREUSABLESCHEDULER) {
        REUSABLESCHEDULERType oldREUSABLESCHEDULER = rEUSABLESCHEDULER;
        rEUSABLESCHEDULER = newREUSABLESCHEDULER == null ? REUSABLESCHEDULER_EDEFAULT : newREUSABLESCHEDULER;
        boolean oldREUSABLESCHEDULERESet = rEUSABLESCHEDULERESet;
        rEUSABLESCHEDULERESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.WORKFLOW_TYPE__REUSABLESCHEDULER, oldREUSABLESCHEDULER, rEUSABLESCHEDULER, !oldREUSABLESCHEDULERESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetREUSABLESCHEDULER() {
        REUSABLESCHEDULERType oldREUSABLESCHEDULER = rEUSABLESCHEDULER;
        boolean oldREUSABLESCHEDULERESet = rEUSABLESCHEDULERESet;
        rEUSABLESCHEDULER = REUSABLESCHEDULER_EDEFAULT;
        rEUSABLESCHEDULERESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.WORKFLOW_TYPE__REUSABLESCHEDULER, oldREUSABLESCHEDULER, REUSABLESCHEDULER_EDEFAULT, oldREUSABLESCHEDULERESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetREUSABLESCHEDULER() {
        return rEUSABLESCHEDULERESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getSCHEDULERNAME() {
        return sCHEDULERNAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSCHEDULERNAME(Object newSCHEDULERNAME) {
        Object oldSCHEDULERNAME = sCHEDULERNAME;
        sCHEDULERNAME = newSCHEDULERNAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.WORKFLOW_TYPE__SCHEDULERNAME, oldSCHEDULERNAME, sCHEDULERNAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getSERVERDOMAINNAME() {
        return sERVERDOMAINNAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSERVERDOMAINNAME(Object newSERVERDOMAINNAME) {
        Object oldSERVERDOMAINNAME = sERVERDOMAINNAME;
        sERVERDOMAINNAME = newSERVERDOMAINNAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.WORKFLOW_TYPE__SERVERDOMAINNAME, oldSERVERDOMAINNAME, sERVERDOMAINNAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getSERVERNAME() {
        return sERVERNAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSERVERNAME(Object newSERVERNAME) {
        Object oldSERVERNAME = sERVERNAME;
        sERVERNAME = newSERVERNAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.WORKFLOW_TYPE__SERVERNAME, oldSERVERNAME, sERVERNAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getSERVICELEVELNAME() {
        return sERVICELEVELNAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSERVICELEVELNAME(Object newSERVICELEVELNAME) {
        Object oldSERVICELEVELNAME = sERVICELEVELNAME;
        sERVICELEVELNAME = newSERVICELEVELNAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.WORKFLOW_TYPE__SERVICELEVELNAME, oldSERVICELEVELNAME, sERVICELEVELNAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SUSPENDONERRORType getSUSPENDONERROR() {
        return sUSPENDONERROR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSUSPENDONERROR(SUSPENDONERRORType newSUSPENDONERROR) {
        SUSPENDONERRORType oldSUSPENDONERROR = sUSPENDONERROR;
        sUSPENDONERROR = newSUSPENDONERROR == null ? SUSPENDONERROR_EDEFAULT : newSUSPENDONERROR;
        boolean oldSUSPENDONERRORESet = sUSPENDONERRORESet;
        sUSPENDONERRORESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.WORKFLOW_TYPE__SUSPENDONERROR, oldSUSPENDONERROR, sUSPENDONERROR, !oldSUSPENDONERRORESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSUSPENDONERROR() {
        SUSPENDONERRORType oldSUSPENDONERROR = sUSPENDONERROR;
        boolean oldSUSPENDONERRORESet = sUSPENDONERRORESet;
        sUSPENDONERROR = SUSPENDONERROR_EDEFAULT;
        sUSPENDONERRORESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.WORKFLOW_TYPE__SUSPENDONERROR, oldSUSPENDONERROR, SUSPENDONERROR_EDEFAULT, oldSUSPENDONERRORESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSUSPENDONERROR() {
        return sUSPENDONERRORESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getSUSPENSIONEMAIL() {
        return sUSPENSIONEMAIL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSUSPENSIONEMAIL(Object newSUSPENSIONEMAIL) {
        Object oldSUSPENSIONEMAIL = sUSPENSIONEMAIL;
        sUSPENSIONEMAIL = newSUSPENSIONEMAIL;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.WORKFLOW_TYPE__SUSPENSIONEMAIL, oldSUSPENSIONEMAIL, sUSPENSIONEMAIL));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TASKSMUSTRUNONSERVERType getTASKSMUSTRUNONSERVER() {
        return tASKSMUSTRUNONSERVER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTASKSMUSTRUNONSERVER(TASKSMUSTRUNONSERVERType newTASKSMUSTRUNONSERVER) {
        TASKSMUSTRUNONSERVERType oldTASKSMUSTRUNONSERVER = tASKSMUSTRUNONSERVER;
        tASKSMUSTRUNONSERVER = newTASKSMUSTRUNONSERVER == null ? TASKSMUSTRUNONSERVER_EDEFAULT : newTASKSMUSTRUNONSERVER;
        boolean oldTASKSMUSTRUNONSERVERESet = tASKSMUSTRUNONSERVERESet;
        tASKSMUSTRUNONSERVERESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.WORKFLOW_TYPE__TASKSMUSTRUNONSERVER, oldTASKSMUSTRUNONSERVER, tASKSMUSTRUNONSERVER, !oldTASKSMUSTRUNONSERVERESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetTASKSMUSTRUNONSERVER() {
        TASKSMUSTRUNONSERVERType oldTASKSMUSTRUNONSERVER = tASKSMUSTRUNONSERVER;
        boolean oldTASKSMUSTRUNONSERVERESet = tASKSMUSTRUNONSERVERESet;
        tASKSMUSTRUNONSERVER = TASKSMUSTRUNONSERVER_EDEFAULT;
        tASKSMUSTRUNONSERVERESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.WORKFLOW_TYPE__TASKSMUSTRUNONSERVER, oldTASKSMUSTRUNONSERVER, TASKSMUSTRUNONSERVER_EDEFAULT, oldTASKSMUSTRUNONSERVERESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetTASKSMUSTRUNONSERVER() {
        return tASKSMUSTRUNONSERVERESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getVERSIONNUMBER() {
        return vERSIONNUMBER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVERSIONNUMBER(Object newVERSIONNUMBER) {
        Object oldVERSIONNUMBER = vERSIONNUMBER;
        vERSIONNUMBER = newVERSIONNUMBER;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.WORKFLOW_TYPE__VERSIONNUMBER, oldVERSIONNUMBER, vERSIONNUMBER));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PowrmartPackage.WORKFLOW_TYPE__SCHEDULER:
                return basicSetSCHEDULER(null, msgs);
            case PowrmartPackage.WORKFLOW_TYPE__TASK:
                return ((InternalEList<?>)getTASK()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.WORKFLOW_TYPE__SESSION:
                return ((InternalEList<?>)getSESSION()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.WORKFLOW_TYPE__WORKLET:
                return ((InternalEList<?>)getWORKLET()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.WORKFLOW_TYPE__TASKINSTANCE:
                return ((InternalEList<?>)getTASKINSTANCE()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.WORKFLOW_TYPE__WORKFLOWLINK:
                return ((InternalEList<?>)getWORKFLOWLINK()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.WORKFLOW_TYPE__WORKFLOWVARIABLE:
                return ((InternalEList<?>)getWORKFLOWVARIABLE()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.WORKFLOW_TYPE__WORKFLOWEVENT:
                return ((InternalEList<?>)getWORKFLOWEVENT()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.WORKFLOW_TYPE__ATTRIBUTE:
                return ((InternalEList<?>)getATTRIBUTE()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.WORKFLOW_TYPE__METADATAEXTENSION:
                return ((InternalEList<?>)getMETADATAEXTENSION()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.WORKFLOW_TYPE__CONWFRUNINFO:
                return ((InternalEList<?>)getCONWFRUNINFO()).basicRemove(otherEnd, msgs);
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
            case PowrmartPackage.WORKFLOW_TYPE__SCHEDULER:
                return getSCHEDULER();
            case PowrmartPackage.WORKFLOW_TYPE__TASK:
                return getTASK();
            case PowrmartPackage.WORKFLOW_TYPE__SESSION:
                return getSESSION();
            case PowrmartPackage.WORKFLOW_TYPE__WORKLET:
                return getWORKLET();
            case PowrmartPackage.WORKFLOW_TYPE__TASKINSTANCE:
                return getTASKINSTANCE();
            case PowrmartPackage.WORKFLOW_TYPE__WORKFLOWLINK:
                return getWORKFLOWLINK();
            case PowrmartPackage.WORKFLOW_TYPE__WORKFLOWVARIABLE:
                return getWORKFLOWVARIABLE();
            case PowrmartPackage.WORKFLOW_TYPE__WORKFLOWEVENT:
                return getWORKFLOWEVENT();
            case PowrmartPackage.WORKFLOW_TYPE__ATTRIBUTE:
                return getATTRIBUTE();
            case PowrmartPackage.WORKFLOW_TYPE__METADATAEXTENSION:
                return getMETADATAEXTENSION();
            case PowrmartPackage.WORKFLOW_TYPE__CONWFRUNINFO:
                return getCONWFRUNINFO();
            case PowrmartPackage.WORKFLOW_TYPE__DESCRIPTION:
                return getDESCRIPTION();
            case PowrmartPackage.WORKFLOW_TYPE__ISENABLED:
                return getISENABLED();
            case PowrmartPackage.WORKFLOW_TYPE__ISRUNNABLESERVICE:
                return getISRUNNABLESERVICE();
            case PowrmartPackage.WORKFLOW_TYPE__ISSERVICE:
                return getISSERVICE();
            case PowrmartPackage.WORKFLOW_TYPE__ISVALID:
                return getISVALID();
            case PowrmartPackage.WORKFLOW_TYPE__NAME:
                return getNAME();
            case PowrmartPackage.WORKFLOW_TYPE__REUSABLESCHEDULER:
                return getREUSABLESCHEDULER();
            case PowrmartPackage.WORKFLOW_TYPE__SCHEDULERNAME:
                return getSCHEDULERNAME();
            case PowrmartPackage.WORKFLOW_TYPE__SERVERDOMAINNAME:
                return getSERVERDOMAINNAME();
            case PowrmartPackage.WORKFLOW_TYPE__SERVERNAME:
                return getSERVERNAME();
            case PowrmartPackage.WORKFLOW_TYPE__SERVICELEVELNAME:
                return getSERVICELEVELNAME();
            case PowrmartPackage.WORKFLOW_TYPE__SUSPENDONERROR:
                return getSUSPENDONERROR();
            case PowrmartPackage.WORKFLOW_TYPE__SUSPENSIONEMAIL:
                return getSUSPENSIONEMAIL();
            case PowrmartPackage.WORKFLOW_TYPE__TASKSMUSTRUNONSERVER:
                return getTASKSMUSTRUNONSERVER();
            case PowrmartPackage.WORKFLOW_TYPE__VERSIONNUMBER:
                return getVERSIONNUMBER();
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
            case PowrmartPackage.WORKFLOW_TYPE__SCHEDULER:
                setSCHEDULER((SCHEDULERType)newValue);
                return;
            case PowrmartPackage.WORKFLOW_TYPE__TASK:
                getTASK().clear();
                getTASK().addAll((Collection<? extends TASKType>)newValue);
                return;
            case PowrmartPackage.WORKFLOW_TYPE__SESSION:
                getSESSION().clear();
                getSESSION().addAll((Collection<? extends SESSIONType>)newValue);
                return;
            case PowrmartPackage.WORKFLOW_TYPE__WORKLET:
                getWORKLET().clear();
                getWORKLET().addAll((Collection<? extends WORKLETType>)newValue);
                return;
            case PowrmartPackage.WORKFLOW_TYPE__TASKINSTANCE:
                getTASKINSTANCE().clear();
                getTASKINSTANCE().addAll((Collection<? extends TASKINSTANCEType>)newValue);
                return;
            case PowrmartPackage.WORKFLOW_TYPE__WORKFLOWLINK:
                getWORKFLOWLINK().clear();
                getWORKFLOWLINK().addAll((Collection<? extends WORKFLOWLINKType>)newValue);
                return;
            case PowrmartPackage.WORKFLOW_TYPE__WORKFLOWVARIABLE:
                getWORKFLOWVARIABLE().clear();
                getWORKFLOWVARIABLE().addAll((Collection<? extends WORKFLOWVARIABLEType>)newValue);
                return;
            case PowrmartPackage.WORKFLOW_TYPE__WORKFLOWEVENT:
                getWORKFLOWEVENT().clear();
                getWORKFLOWEVENT().addAll((Collection<? extends WORKFLOWEVENTType>)newValue);
                return;
            case PowrmartPackage.WORKFLOW_TYPE__ATTRIBUTE:
                getATTRIBUTE().clear();
                getATTRIBUTE().addAll((Collection<? extends ATTRIBUTEType>)newValue);
                return;
            case PowrmartPackage.WORKFLOW_TYPE__METADATAEXTENSION:
                getMETADATAEXTENSION().clear();
                getMETADATAEXTENSION().addAll((Collection<? extends METADATAEXTENSIONType>)newValue);
                return;
            case PowrmartPackage.WORKFLOW_TYPE__CONWFRUNINFO:
                getCONWFRUNINFO().clear();
                getCONWFRUNINFO().addAll((Collection<? extends CONWFRUNINFOType>)newValue);
                return;
            case PowrmartPackage.WORKFLOW_TYPE__DESCRIPTION:
                setDESCRIPTION(newValue);
                return;
            case PowrmartPackage.WORKFLOW_TYPE__ISENABLED:
                setISENABLED((ISENABLEDType)newValue);
                return;
            case PowrmartPackage.WORKFLOW_TYPE__ISRUNNABLESERVICE:
                setISRUNNABLESERVICE((ISRUNNABLESERVICEType)newValue);
                return;
            case PowrmartPackage.WORKFLOW_TYPE__ISSERVICE:
                setISSERVICE((ISSERVICEType)newValue);
                return;
            case PowrmartPackage.WORKFLOW_TYPE__ISVALID:
                setISVALID((ISVALIDType1)newValue);
                return;
            case PowrmartPackage.WORKFLOW_TYPE__NAME:
                setNAME(newValue);
                return;
            case PowrmartPackage.WORKFLOW_TYPE__REUSABLESCHEDULER:
                setREUSABLESCHEDULER((REUSABLESCHEDULERType)newValue);
                return;
            case PowrmartPackage.WORKFLOW_TYPE__SCHEDULERNAME:
                setSCHEDULERNAME(newValue);
                return;
            case PowrmartPackage.WORKFLOW_TYPE__SERVERDOMAINNAME:
                setSERVERDOMAINNAME(newValue);
                return;
            case PowrmartPackage.WORKFLOW_TYPE__SERVERNAME:
                setSERVERNAME(newValue);
                return;
            case PowrmartPackage.WORKFLOW_TYPE__SERVICELEVELNAME:
                setSERVICELEVELNAME(newValue);
                return;
            case PowrmartPackage.WORKFLOW_TYPE__SUSPENDONERROR:
                setSUSPENDONERROR((SUSPENDONERRORType)newValue);
                return;
            case PowrmartPackage.WORKFLOW_TYPE__SUSPENSIONEMAIL:
                setSUSPENSIONEMAIL(newValue);
                return;
            case PowrmartPackage.WORKFLOW_TYPE__TASKSMUSTRUNONSERVER:
                setTASKSMUSTRUNONSERVER((TASKSMUSTRUNONSERVERType)newValue);
                return;
            case PowrmartPackage.WORKFLOW_TYPE__VERSIONNUMBER:
                setVERSIONNUMBER(newValue);
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
            case PowrmartPackage.WORKFLOW_TYPE__SCHEDULER:
                setSCHEDULER((SCHEDULERType)null);
                return;
            case PowrmartPackage.WORKFLOW_TYPE__TASK:
                getTASK().clear();
                return;
            case PowrmartPackage.WORKFLOW_TYPE__SESSION:
                getSESSION().clear();
                return;
            case PowrmartPackage.WORKFLOW_TYPE__WORKLET:
                getWORKLET().clear();
                return;
            case PowrmartPackage.WORKFLOW_TYPE__TASKINSTANCE:
                getTASKINSTANCE().clear();
                return;
            case PowrmartPackage.WORKFLOW_TYPE__WORKFLOWLINK:
                getWORKFLOWLINK().clear();
                return;
            case PowrmartPackage.WORKFLOW_TYPE__WORKFLOWVARIABLE:
                getWORKFLOWVARIABLE().clear();
                return;
            case PowrmartPackage.WORKFLOW_TYPE__WORKFLOWEVENT:
                getWORKFLOWEVENT().clear();
                return;
            case PowrmartPackage.WORKFLOW_TYPE__ATTRIBUTE:
                getATTRIBUTE().clear();
                return;
            case PowrmartPackage.WORKFLOW_TYPE__METADATAEXTENSION:
                getMETADATAEXTENSION().clear();
                return;
            case PowrmartPackage.WORKFLOW_TYPE__CONWFRUNINFO:
                getCONWFRUNINFO().clear();
                return;
            case PowrmartPackage.WORKFLOW_TYPE__DESCRIPTION:
                setDESCRIPTION(DESCRIPTION_EDEFAULT);
                return;
            case PowrmartPackage.WORKFLOW_TYPE__ISENABLED:
                unsetISENABLED();
                return;
            case PowrmartPackage.WORKFLOW_TYPE__ISRUNNABLESERVICE:
                unsetISRUNNABLESERVICE();
                return;
            case PowrmartPackage.WORKFLOW_TYPE__ISSERVICE:
                unsetISSERVICE();
                return;
            case PowrmartPackage.WORKFLOW_TYPE__ISVALID:
                unsetISVALID();
                return;
            case PowrmartPackage.WORKFLOW_TYPE__NAME:
                setNAME(NAME_EDEFAULT);
                return;
            case PowrmartPackage.WORKFLOW_TYPE__REUSABLESCHEDULER:
                unsetREUSABLESCHEDULER();
                return;
            case PowrmartPackage.WORKFLOW_TYPE__SCHEDULERNAME:
                setSCHEDULERNAME(SCHEDULERNAME_EDEFAULT);
                return;
            case PowrmartPackage.WORKFLOW_TYPE__SERVERDOMAINNAME:
                setSERVERDOMAINNAME(SERVERDOMAINNAME_EDEFAULT);
                return;
            case PowrmartPackage.WORKFLOW_TYPE__SERVERNAME:
                setSERVERNAME(SERVERNAME_EDEFAULT);
                return;
            case PowrmartPackage.WORKFLOW_TYPE__SERVICELEVELNAME:
                setSERVICELEVELNAME(SERVICELEVELNAME_EDEFAULT);
                return;
            case PowrmartPackage.WORKFLOW_TYPE__SUSPENDONERROR:
                unsetSUSPENDONERROR();
                return;
            case PowrmartPackage.WORKFLOW_TYPE__SUSPENSIONEMAIL:
                setSUSPENSIONEMAIL(SUSPENSIONEMAIL_EDEFAULT);
                return;
            case PowrmartPackage.WORKFLOW_TYPE__TASKSMUSTRUNONSERVER:
                unsetTASKSMUSTRUNONSERVER();
                return;
            case PowrmartPackage.WORKFLOW_TYPE__VERSIONNUMBER:
                setVERSIONNUMBER(VERSIONNUMBER_EDEFAULT);
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
            case PowrmartPackage.WORKFLOW_TYPE__SCHEDULER:
                return sCHEDULER != null;
            case PowrmartPackage.WORKFLOW_TYPE__TASK:
                return tASK != null && !tASK.isEmpty();
            case PowrmartPackage.WORKFLOW_TYPE__SESSION:
                return sESSION != null && !sESSION.isEmpty();
            case PowrmartPackage.WORKFLOW_TYPE__WORKLET:
                return wORKLET != null && !wORKLET.isEmpty();
            case PowrmartPackage.WORKFLOW_TYPE__TASKINSTANCE:
                return tASKINSTANCE != null && !tASKINSTANCE.isEmpty();
            case PowrmartPackage.WORKFLOW_TYPE__WORKFLOWLINK:
                return wORKFLOWLINK != null && !wORKFLOWLINK.isEmpty();
            case PowrmartPackage.WORKFLOW_TYPE__WORKFLOWVARIABLE:
                return wORKFLOWVARIABLE != null && !wORKFLOWVARIABLE.isEmpty();
            case PowrmartPackage.WORKFLOW_TYPE__WORKFLOWEVENT:
                return wORKFLOWEVENT != null && !wORKFLOWEVENT.isEmpty();
            case PowrmartPackage.WORKFLOW_TYPE__ATTRIBUTE:
                return aTTRIBUTE != null && !aTTRIBUTE.isEmpty();
            case PowrmartPackage.WORKFLOW_TYPE__METADATAEXTENSION:
                return mETADATAEXTENSION != null && !mETADATAEXTENSION.isEmpty();
            case PowrmartPackage.WORKFLOW_TYPE__CONWFRUNINFO:
                return cONWFRUNINFO != null && !cONWFRUNINFO.isEmpty();
            case PowrmartPackage.WORKFLOW_TYPE__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? dESCRIPTION != null : !DESCRIPTION_EDEFAULT.equals(dESCRIPTION);
            case PowrmartPackage.WORKFLOW_TYPE__ISENABLED:
                return isSetISENABLED();
            case PowrmartPackage.WORKFLOW_TYPE__ISRUNNABLESERVICE:
                return isSetISRUNNABLESERVICE();
            case PowrmartPackage.WORKFLOW_TYPE__ISSERVICE:
                return isSetISSERVICE();
            case PowrmartPackage.WORKFLOW_TYPE__ISVALID:
                return isSetISVALID();
            case PowrmartPackage.WORKFLOW_TYPE__NAME:
                return NAME_EDEFAULT == null ? nAME != null : !NAME_EDEFAULT.equals(nAME);
            case PowrmartPackage.WORKFLOW_TYPE__REUSABLESCHEDULER:
                return isSetREUSABLESCHEDULER();
            case PowrmartPackage.WORKFLOW_TYPE__SCHEDULERNAME:
                return SCHEDULERNAME_EDEFAULT == null ? sCHEDULERNAME != null : !SCHEDULERNAME_EDEFAULT.equals(sCHEDULERNAME);
            case PowrmartPackage.WORKFLOW_TYPE__SERVERDOMAINNAME:
                return SERVERDOMAINNAME_EDEFAULT == null ? sERVERDOMAINNAME != null : !SERVERDOMAINNAME_EDEFAULT.equals(sERVERDOMAINNAME);
            case PowrmartPackage.WORKFLOW_TYPE__SERVERNAME:
                return SERVERNAME_EDEFAULT == null ? sERVERNAME != null : !SERVERNAME_EDEFAULT.equals(sERVERNAME);
            case PowrmartPackage.WORKFLOW_TYPE__SERVICELEVELNAME:
                return SERVICELEVELNAME_EDEFAULT == null ? sERVICELEVELNAME != null : !SERVICELEVELNAME_EDEFAULT.equals(sERVICELEVELNAME);
            case PowrmartPackage.WORKFLOW_TYPE__SUSPENDONERROR:
                return isSetSUSPENDONERROR();
            case PowrmartPackage.WORKFLOW_TYPE__SUSPENSIONEMAIL:
                return SUSPENSIONEMAIL_EDEFAULT == null ? sUSPENSIONEMAIL != null : !SUSPENSIONEMAIL_EDEFAULT.equals(sUSPENSIONEMAIL);
            case PowrmartPackage.WORKFLOW_TYPE__TASKSMUSTRUNONSERVER:
                return isSetTASKSMUSTRUNONSERVER();
            case PowrmartPackage.WORKFLOW_TYPE__VERSIONNUMBER:
                return VERSIONNUMBER_EDEFAULT == null ? vERSIONNUMBER != null : !VERSIONNUMBER_EDEFAULT.equals(vERSIONNUMBER);
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
        result.append(" (dESCRIPTION: ");
        result.append(dESCRIPTION);
        result.append(", iSENABLED: ");
        if (iSENABLEDESet) result.append(iSENABLED); else result.append("<unset>");
        result.append(", iSRUNNABLESERVICE: ");
        if (iSRUNNABLESERVICEESet) result.append(iSRUNNABLESERVICE); else result.append("<unset>");
        result.append(", iSSERVICE: ");
        if (iSSERVICEESet) result.append(iSSERVICE); else result.append("<unset>");
        result.append(", iSVALID: ");
        if (iSVALIDESet) result.append(iSVALID); else result.append("<unset>");
        result.append(", nAME: ");
        result.append(nAME);
        result.append(", rEUSABLESCHEDULER: ");
        if (rEUSABLESCHEDULERESet) result.append(rEUSABLESCHEDULER); else result.append("<unset>");
        result.append(", sCHEDULERNAME: ");
        result.append(sCHEDULERNAME);
        result.append(", sERVERDOMAINNAME: ");
        result.append(sERVERDOMAINNAME);
        result.append(", sERVERNAME: ");
        result.append(sERVERNAME);
        result.append(", sERVICELEVELNAME: ");
        result.append(sERVICELEVELNAME);
        result.append(", sUSPENDONERROR: ");
        if (sUSPENDONERRORESet) result.append(sUSPENDONERROR); else result.append("<unset>");
        result.append(", sUSPENSIONEMAIL: ");
        result.append(sUSPENSIONEMAIL);
        result.append(", tASKSMUSTRUNONSERVER: ");
        if (tASKSMUSTRUNONSERVERESet) result.append(tASKSMUSTRUNONSERVER); else result.append("<unset>");
        result.append(", vERSIONNUMBER: ");
        result.append(vERSIONNUMBER);
        result.append(')');
        return result.toString();
    }

} //WORKFLOWTypeImpl
