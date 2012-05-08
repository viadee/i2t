/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.ATTRIBUTEType;
import Powrmart.ISVALIDType2;
import Powrmart.METADATAEXTENSIONType;
import Powrmart.PARENTTYPEType1;
import Powrmart.PowrmartPackage;
import Powrmart.REUSABLEType3;
import Powrmart.SESSIONType;
import Powrmart.TASKINSTANCEType;
import Powrmart.TASKType;
import Powrmart.WORKFLOWEVENTType;
import Powrmart.WORKFLOWLINKType;
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
 * An implementation of the model object '<em><b>WORKLET Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.WORKLETTypeImpl#getTASK <em>TASK</em>}</li>
 *   <li>{@link Powrmart.impl.WORKLETTypeImpl#getSESSION <em>SESSION</em>}</li>
 *   <li>{@link Powrmart.impl.WORKLETTypeImpl#getWORKLET <em>WORKLET</em>}</li>
 *   <li>{@link Powrmart.impl.WORKLETTypeImpl#getTASKINSTANCE <em>TASKINSTANCE</em>}</li>
 *   <li>{@link Powrmart.impl.WORKLETTypeImpl#getWORKFLOWLINK <em>WORKFLOWLINK</em>}</li>
 *   <li>{@link Powrmart.impl.WORKLETTypeImpl#getWORKFLOWVARIABLE <em>WORKFLOWVARIABLE</em>}</li>
 *   <li>{@link Powrmart.impl.WORKLETTypeImpl#getWORKFLOWEVENT <em>WORKFLOWEVENT</em>}</li>
 *   <li>{@link Powrmart.impl.WORKLETTypeImpl#getATTRIBUTE <em>ATTRIBUTE</em>}</li>
 *   <li>{@link Powrmart.impl.WORKLETTypeImpl#getMETADATAEXTENSION <em>METADATAEXTENSION</em>}</li>
 *   <li>{@link Powrmart.impl.WORKLETTypeImpl#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.impl.WORKLETTypeImpl#getISVALID <em>ISVALID</em>}</li>
 *   <li>{@link Powrmart.impl.WORKLETTypeImpl#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.impl.WORKLETTypeImpl#getPARENT <em>PARENT</em>}</li>
 *   <li>{@link Powrmart.impl.WORKLETTypeImpl#getPARENTTYPE <em>PARENTTYPE</em>}</li>
 *   <li>{@link Powrmart.impl.WORKLETTypeImpl#getREUSABLE <em>REUSABLE</em>}</li>
 *   <li>{@link Powrmart.impl.WORKLETTypeImpl#getVERSIONNUMBER <em>VERSIONNUMBER</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WORKLETTypeImpl extends EObjectImpl implements WORKLETType {
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
     * The default value of the '{@link #getISVALID() <em>ISVALID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISVALID()
     * @generated
     * @ordered
     */
    protected static final ISVALIDType2 ISVALID_EDEFAULT = ISVALIDType2.YES;

    /**
     * The cached value of the '{@link #getISVALID() <em>ISVALID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISVALID()
     * @generated
     * @ordered
     */
    protected ISVALIDType2 iSVALID = ISVALID_EDEFAULT;

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
     * The default value of the '{@link #getPARENT() <em>PARENT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPARENT()
     * @generated
     * @ordered
     */
    protected static final Object PARENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPARENT() <em>PARENT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPARENT()
     * @generated
     * @ordered
     */
    protected Object pARENT = PARENT_EDEFAULT;

    /**
     * The default value of the '{@link #getPARENTTYPE() <em>PARENTTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPARENTTYPE()
     * @generated
     * @ordered
     */
    protected static final PARENTTYPEType1 PARENTTYPE_EDEFAULT = PARENTTYPEType1.WORKLET;

    /**
     * The cached value of the '{@link #getPARENTTYPE() <em>PARENTTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPARENTTYPE()
     * @generated
     * @ordered
     */
    protected PARENTTYPEType1 pARENTTYPE = PARENTTYPE_EDEFAULT;

    /**
     * This is true if the PARENTTYPE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pARENTTYPEESet;

    /**
     * The default value of the '{@link #getREUSABLE() <em>REUSABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREUSABLE()
     * @generated
     * @ordered
     */
    protected static final REUSABLEType3 REUSABLE_EDEFAULT = REUSABLEType3.YES;

    /**
     * The cached value of the '{@link #getREUSABLE() <em>REUSABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREUSABLE()
     * @generated
     * @ordered
     */
    protected REUSABLEType3 rEUSABLE = REUSABLE_EDEFAULT;

    /**
     * This is true if the REUSABLE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rEUSABLEESet;

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
    protected WORKLETTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getWORKLETType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TASKType> getTASK() {
        if (tASK == null) {
            tASK = new EObjectContainmentEList<TASKType>(TASKType.class, this, PowrmartPackage.WORKLET_TYPE__TASK);
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
            sESSION = new EObjectContainmentEList<SESSIONType>(SESSIONType.class, this, PowrmartPackage.WORKLET_TYPE__SESSION);
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
            wORKLET = new EObjectContainmentEList<WORKLETType>(WORKLETType.class, this, PowrmartPackage.WORKLET_TYPE__WORKLET);
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
            tASKINSTANCE = new EObjectContainmentEList<TASKINSTANCEType>(TASKINSTANCEType.class, this, PowrmartPackage.WORKLET_TYPE__TASKINSTANCE);
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
            wORKFLOWLINK = new EObjectContainmentEList<WORKFLOWLINKType>(WORKFLOWLINKType.class, this, PowrmartPackage.WORKLET_TYPE__WORKFLOWLINK);
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
            wORKFLOWVARIABLE = new EObjectContainmentEList<WORKFLOWVARIABLEType>(WORKFLOWVARIABLEType.class, this, PowrmartPackage.WORKLET_TYPE__WORKFLOWVARIABLE);
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
            wORKFLOWEVENT = new EObjectContainmentEList<WORKFLOWEVENTType>(WORKFLOWEVENTType.class, this, PowrmartPackage.WORKLET_TYPE__WORKFLOWEVENT);
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
            aTTRIBUTE = new EObjectContainmentEList<ATTRIBUTEType>(ATTRIBUTEType.class, this, PowrmartPackage.WORKLET_TYPE__ATTRIBUTE);
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
            mETADATAEXTENSION = new EObjectContainmentEList<METADATAEXTENSIONType>(METADATAEXTENSIONType.class, this, PowrmartPackage.WORKLET_TYPE__METADATAEXTENSION);
        }
        return mETADATAEXTENSION;
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.WORKLET_TYPE__DESCRIPTION, oldDESCRIPTION, dESCRIPTION));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISVALIDType2 getISVALID() {
        return iSVALID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setISVALID(ISVALIDType2 newISVALID) {
        ISVALIDType2 oldISVALID = iSVALID;
        iSVALID = newISVALID == null ? ISVALID_EDEFAULT : newISVALID;
        boolean oldISVALIDESet = iSVALIDESet;
        iSVALIDESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.WORKLET_TYPE__ISVALID, oldISVALID, iSVALID, !oldISVALIDESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetISVALID() {
        ISVALIDType2 oldISVALID = iSVALID;
        boolean oldISVALIDESet = iSVALIDESet;
        iSVALID = ISVALID_EDEFAULT;
        iSVALIDESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.WORKLET_TYPE__ISVALID, oldISVALID, ISVALID_EDEFAULT, oldISVALIDESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.WORKLET_TYPE__NAME, oldNAME, nAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getPARENT() {
        return pARENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPARENT(Object newPARENT) {
        Object oldPARENT = pARENT;
        pARENT = newPARENT;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.WORKLET_TYPE__PARENT, oldPARENT, pARENT));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PARENTTYPEType1 getPARENTTYPE() {
        return pARENTTYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPARENTTYPE(PARENTTYPEType1 newPARENTTYPE) {
        PARENTTYPEType1 oldPARENTTYPE = pARENTTYPE;
        pARENTTYPE = newPARENTTYPE == null ? PARENTTYPE_EDEFAULT : newPARENTTYPE;
        boolean oldPARENTTYPEESet = pARENTTYPEESet;
        pARENTTYPEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.WORKLET_TYPE__PARENTTYPE, oldPARENTTYPE, pARENTTYPE, !oldPARENTTYPEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetPARENTTYPE() {
        PARENTTYPEType1 oldPARENTTYPE = pARENTTYPE;
        boolean oldPARENTTYPEESet = pARENTTYPEESet;
        pARENTTYPE = PARENTTYPE_EDEFAULT;
        pARENTTYPEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.WORKLET_TYPE__PARENTTYPE, oldPARENTTYPE, PARENTTYPE_EDEFAULT, oldPARENTTYPEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetPARENTTYPE() {
        return pARENTTYPEESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public REUSABLEType3 getREUSABLE() {
        return rEUSABLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setREUSABLE(REUSABLEType3 newREUSABLE) {
        REUSABLEType3 oldREUSABLE = rEUSABLE;
        rEUSABLE = newREUSABLE == null ? REUSABLE_EDEFAULT : newREUSABLE;
        boolean oldREUSABLEESet = rEUSABLEESet;
        rEUSABLEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.WORKLET_TYPE__REUSABLE, oldREUSABLE, rEUSABLE, !oldREUSABLEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetREUSABLE() {
        REUSABLEType3 oldREUSABLE = rEUSABLE;
        boolean oldREUSABLEESet = rEUSABLEESet;
        rEUSABLE = REUSABLE_EDEFAULT;
        rEUSABLEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.WORKLET_TYPE__REUSABLE, oldREUSABLE, REUSABLE_EDEFAULT, oldREUSABLEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetREUSABLE() {
        return rEUSABLEESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.WORKLET_TYPE__VERSIONNUMBER, oldVERSIONNUMBER, vERSIONNUMBER));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PowrmartPackage.WORKLET_TYPE__TASK:
                return ((InternalEList<?>)getTASK()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.WORKLET_TYPE__SESSION:
                return ((InternalEList<?>)getSESSION()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.WORKLET_TYPE__WORKLET:
                return ((InternalEList<?>)getWORKLET()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.WORKLET_TYPE__TASKINSTANCE:
                return ((InternalEList<?>)getTASKINSTANCE()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.WORKLET_TYPE__WORKFLOWLINK:
                return ((InternalEList<?>)getWORKFLOWLINK()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.WORKLET_TYPE__WORKFLOWVARIABLE:
                return ((InternalEList<?>)getWORKFLOWVARIABLE()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.WORKLET_TYPE__WORKFLOWEVENT:
                return ((InternalEList<?>)getWORKFLOWEVENT()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.WORKLET_TYPE__ATTRIBUTE:
                return ((InternalEList<?>)getATTRIBUTE()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.WORKLET_TYPE__METADATAEXTENSION:
                return ((InternalEList<?>)getMETADATAEXTENSION()).basicRemove(otherEnd, msgs);
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
            case PowrmartPackage.WORKLET_TYPE__TASK:
                return getTASK();
            case PowrmartPackage.WORKLET_TYPE__SESSION:
                return getSESSION();
            case PowrmartPackage.WORKLET_TYPE__WORKLET:
                return getWORKLET();
            case PowrmartPackage.WORKLET_TYPE__TASKINSTANCE:
                return getTASKINSTANCE();
            case PowrmartPackage.WORKLET_TYPE__WORKFLOWLINK:
                return getWORKFLOWLINK();
            case PowrmartPackage.WORKLET_TYPE__WORKFLOWVARIABLE:
                return getWORKFLOWVARIABLE();
            case PowrmartPackage.WORKLET_TYPE__WORKFLOWEVENT:
                return getWORKFLOWEVENT();
            case PowrmartPackage.WORKLET_TYPE__ATTRIBUTE:
                return getATTRIBUTE();
            case PowrmartPackage.WORKLET_TYPE__METADATAEXTENSION:
                return getMETADATAEXTENSION();
            case PowrmartPackage.WORKLET_TYPE__DESCRIPTION:
                return getDESCRIPTION();
            case PowrmartPackage.WORKLET_TYPE__ISVALID:
                return getISVALID();
            case PowrmartPackage.WORKLET_TYPE__NAME:
                return getNAME();
            case PowrmartPackage.WORKLET_TYPE__PARENT:
                return getPARENT();
            case PowrmartPackage.WORKLET_TYPE__PARENTTYPE:
                return getPARENTTYPE();
            case PowrmartPackage.WORKLET_TYPE__REUSABLE:
                return getREUSABLE();
            case PowrmartPackage.WORKLET_TYPE__VERSIONNUMBER:
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
            case PowrmartPackage.WORKLET_TYPE__TASK:
                getTASK().clear();
                getTASK().addAll((Collection<? extends TASKType>)newValue);
                return;
            case PowrmartPackage.WORKLET_TYPE__SESSION:
                getSESSION().clear();
                getSESSION().addAll((Collection<? extends SESSIONType>)newValue);
                return;
            case PowrmartPackage.WORKLET_TYPE__WORKLET:
                getWORKLET().clear();
                getWORKLET().addAll((Collection<? extends WORKLETType>)newValue);
                return;
            case PowrmartPackage.WORKLET_TYPE__TASKINSTANCE:
                getTASKINSTANCE().clear();
                getTASKINSTANCE().addAll((Collection<? extends TASKINSTANCEType>)newValue);
                return;
            case PowrmartPackage.WORKLET_TYPE__WORKFLOWLINK:
                getWORKFLOWLINK().clear();
                getWORKFLOWLINK().addAll((Collection<? extends WORKFLOWLINKType>)newValue);
                return;
            case PowrmartPackage.WORKLET_TYPE__WORKFLOWVARIABLE:
                getWORKFLOWVARIABLE().clear();
                getWORKFLOWVARIABLE().addAll((Collection<? extends WORKFLOWVARIABLEType>)newValue);
                return;
            case PowrmartPackage.WORKLET_TYPE__WORKFLOWEVENT:
                getWORKFLOWEVENT().clear();
                getWORKFLOWEVENT().addAll((Collection<? extends WORKFLOWEVENTType>)newValue);
                return;
            case PowrmartPackage.WORKLET_TYPE__ATTRIBUTE:
                getATTRIBUTE().clear();
                getATTRIBUTE().addAll((Collection<? extends ATTRIBUTEType>)newValue);
                return;
            case PowrmartPackage.WORKLET_TYPE__METADATAEXTENSION:
                getMETADATAEXTENSION().clear();
                getMETADATAEXTENSION().addAll((Collection<? extends METADATAEXTENSIONType>)newValue);
                return;
            case PowrmartPackage.WORKLET_TYPE__DESCRIPTION:
                setDESCRIPTION(newValue);
                return;
            case PowrmartPackage.WORKLET_TYPE__ISVALID:
                setISVALID((ISVALIDType2)newValue);
                return;
            case PowrmartPackage.WORKLET_TYPE__NAME:
                setNAME(newValue);
                return;
            case PowrmartPackage.WORKLET_TYPE__PARENT:
                setPARENT(newValue);
                return;
            case PowrmartPackage.WORKLET_TYPE__PARENTTYPE:
                setPARENTTYPE((PARENTTYPEType1)newValue);
                return;
            case PowrmartPackage.WORKLET_TYPE__REUSABLE:
                setREUSABLE((REUSABLEType3)newValue);
                return;
            case PowrmartPackage.WORKLET_TYPE__VERSIONNUMBER:
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
            case PowrmartPackage.WORKLET_TYPE__TASK:
                getTASK().clear();
                return;
            case PowrmartPackage.WORKLET_TYPE__SESSION:
                getSESSION().clear();
                return;
            case PowrmartPackage.WORKLET_TYPE__WORKLET:
                getWORKLET().clear();
                return;
            case PowrmartPackage.WORKLET_TYPE__TASKINSTANCE:
                getTASKINSTANCE().clear();
                return;
            case PowrmartPackage.WORKLET_TYPE__WORKFLOWLINK:
                getWORKFLOWLINK().clear();
                return;
            case PowrmartPackage.WORKLET_TYPE__WORKFLOWVARIABLE:
                getWORKFLOWVARIABLE().clear();
                return;
            case PowrmartPackage.WORKLET_TYPE__WORKFLOWEVENT:
                getWORKFLOWEVENT().clear();
                return;
            case PowrmartPackage.WORKLET_TYPE__ATTRIBUTE:
                getATTRIBUTE().clear();
                return;
            case PowrmartPackage.WORKLET_TYPE__METADATAEXTENSION:
                getMETADATAEXTENSION().clear();
                return;
            case PowrmartPackage.WORKLET_TYPE__DESCRIPTION:
                setDESCRIPTION(DESCRIPTION_EDEFAULT);
                return;
            case PowrmartPackage.WORKLET_TYPE__ISVALID:
                unsetISVALID();
                return;
            case PowrmartPackage.WORKLET_TYPE__NAME:
                setNAME(NAME_EDEFAULT);
                return;
            case PowrmartPackage.WORKLET_TYPE__PARENT:
                setPARENT(PARENT_EDEFAULT);
                return;
            case PowrmartPackage.WORKLET_TYPE__PARENTTYPE:
                unsetPARENTTYPE();
                return;
            case PowrmartPackage.WORKLET_TYPE__REUSABLE:
                unsetREUSABLE();
                return;
            case PowrmartPackage.WORKLET_TYPE__VERSIONNUMBER:
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
            case PowrmartPackage.WORKLET_TYPE__TASK:
                return tASK != null && !tASK.isEmpty();
            case PowrmartPackage.WORKLET_TYPE__SESSION:
                return sESSION != null && !sESSION.isEmpty();
            case PowrmartPackage.WORKLET_TYPE__WORKLET:
                return wORKLET != null && !wORKLET.isEmpty();
            case PowrmartPackage.WORKLET_TYPE__TASKINSTANCE:
                return tASKINSTANCE != null && !tASKINSTANCE.isEmpty();
            case PowrmartPackage.WORKLET_TYPE__WORKFLOWLINK:
                return wORKFLOWLINK != null && !wORKFLOWLINK.isEmpty();
            case PowrmartPackage.WORKLET_TYPE__WORKFLOWVARIABLE:
                return wORKFLOWVARIABLE != null && !wORKFLOWVARIABLE.isEmpty();
            case PowrmartPackage.WORKLET_TYPE__WORKFLOWEVENT:
                return wORKFLOWEVENT != null && !wORKFLOWEVENT.isEmpty();
            case PowrmartPackage.WORKLET_TYPE__ATTRIBUTE:
                return aTTRIBUTE != null && !aTTRIBUTE.isEmpty();
            case PowrmartPackage.WORKLET_TYPE__METADATAEXTENSION:
                return mETADATAEXTENSION != null && !mETADATAEXTENSION.isEmpty();
            case PowrmartPackage.WORKLET_TYPE__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? dESCRIPTION != null : !DESCRIPTION_EDEFAULT.equals(dESCRIPTION);
            case PowrmartPackage.WORKLET_TYPE__ISVALID:
                return isSetISVALID();
            case PowrmartPackage.WORKLET_TYPE__NAME:
                return NAME_EDEFAULT == null ? nAME != null : !NAME_EDEFAULT.equals(nAME);
            case PowrmartPackage.WORKLET_TYPE__PARENT:
                return PARENT_EDEFAULT == null ? pARENT != null : !PARENT_EDEFAULT.equals(pARENT);
            case PowrmartPackage.WORKLET_TYPE__PARENTTYPE:
                return isSetPARENTTYPE();
            case PowrmartPackage.WORKLET_TYPE__REUSABLE:
                return isSetREUSABLE();
            case PowrmartPackage.WORKLET_TYPE__VERSIONNUMBER:
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
        result.append(", iSVALID: ");
        if (iSVALIDESet) result.append(iSVALID); else result.append("<unset>");
        result.append(", nAME: ");
        result.append(nAME);
        result.append(", pARENT: ");
        result.append(pARENT);
        result.append(", pARENTTYPE: ");
        if (pARENTTYPEESet) result.append(pARENTTYPE); else result.append("<unset>");
        result.append(", rEUSABLE: ");
        if (rEUSABLEESet) result.append(rEUSABLE); else result.append("<unset>");
        result.append(", vERSIONNUMBER: ");
        result.append(vERSIONNUMBER);
        result.append(')');
        return result.toString();
    }

} //WORKLETTypeImpl
