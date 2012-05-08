/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.PowrmartPackage;
import Powrmart.SAPCODEBLOCKType;
import Powrmart.SAPFUNCTIONINSTANCEType;
import Powrmart.SAPPROGRAMFLOWOBJECTType;
import Powrmart.TYPEType4;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SAPPROGRAMFLOWOBJECT Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.SAPPROGRAMFLOWOBJECTTypeImpl#getSAPFUNCTIONINSTANCE <em>SAPFUNCTIONINSTANCE</em>}</li>
 *   <li>{@link Powrmart.impl.SAPPROGRAMFLOWOBJECTTypeImpl#getSAPCODEBLOCK <em>SAPCODEBLOCK</em>}</li>
 *   <li>{@link Powrmart.impl.SAPPROGRAMFLOWOBJECTTypeImpl#getDSQINSTNAME <em>DSQINSTNAME</em>}</li>
 *   <li>{@link Powrmart.impl.SAPPROGRAMFLOWOBJECTTypeImpl#getJOINBITMAP <em>JOINBITMAP</em>}</li>
 *   <li>{@link Powrmart.impl.SAPPROGRAMFLOWOBJECTTypeImpl#getORDER <em>ORDER</em>}</li>
 *   <li>{@link Powrmart.impl.SAPPROGRAMFLOWOBJECTTypeImpl#getREFDBDNAME <em>REFDBDNAME</em>}</li>
 *   <li>{@link Powrmart.impl.SAPPROGRAMFLOWOBJECTTypeImpl#getREFSOURCENAME <em>REFSOURCENAME</em>}</li>
 *   <li>{@link Powrmart.impl.SAPPROGRAMFLOWOBJECTTypeImpl#getREFSOURCEINSTNAME <em>REFSOURCEINSTNAME</em>}</li>
 *   <li>{@link Powrmart.impl.SAPPROGRAMFLOWOBJECTTypeImpl#getTYPE <em>TYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SAPPROGRAMFLOWOBJECTTypeImpl extends EObjectImpl implements SAPPROGRAMFLOWOBJECTType {
    /**
     * The cached value of the '{@link #getSAPFUNCTIONINSTANCE() <em>SAPFUNCTIONINSTANCE</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSAPFUNCTIONINSTANCE()
     * @generated
     * @ordered
     */
    protected SAPFUNCTIONINSTANCEType sAPFUNCTIONINSTANCE;

    /**
     * The cached value of the '{@link #getSAPCODEBLOCK() <em>SAPCODEBLOCK</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSAPCODEBLOCK()
     * @generated
     * @ordered
     */
    protected SAPCODEBLOCKType sAPCODEBLOCK;

    /**
     * The default value of the '{@link #getDSQINSTNAME() <em>DSQINSTNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDSQINSTNAME()
     * @generated
     * @ordered
     */
    protected static final Object DSQINSTNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDSQINSTNAME() <em>DSQINSTNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDSQINSTNAME()
     * @generated
     * @ordered
     */
    protected Object dSQINSTNAME = DSQINSTNAME_EDEFAULT;

    /**
     * The default value of the '{@link #getJOINBITMAP() <em>JOINBITMAP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getJOINBITMAP()
     * @generated
     * @ordered
     */
    protected static final Object JOINBITMAP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getJOINBITMAP() <em>JOINBITMAP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getJOINBITMAP()
     * @generated
     * @ordered
     */
    protected Object jOINBITMAP = JOINBITMAP_EDEFAULT;

    /**
     * The default value of the '{@link #getORDER() <em>ORDER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getORDER()
     * @generated
     * @ordered
     */
    protected static final Object ORDER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getORDER() <em>ORDER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getORDER()
     * @generated
     * @ordered
     */
    protected Object oRDER = ORDER_EDEFAULT;

    /**
     * The default value of the '{@link #getREFDBDNAME() <em>REFDBDNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREFDBDNAME()
     * @generated
     * @ordered
     */
    protected static final Object REFDBDNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getREFDBDNAME() <em>REFDBDNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREFDBDNAME()
     * @generated
     * @ordered
     */
    protected Object rEFDBDNAME = REFDBDNAME_EDEFAULT;

    /**
     * The default value of the '{@link #getREFSOURCENAME() <em>REFSOURCENAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREFSOURCENAME()
     * @generated
     * @ordered
     */
    protected static final Object REFSOURCENAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getREFSOURCENAME() <em>REFSOURCENAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREFSOURCENAME()
     * @generated
     * @ordered
     */
    protected Object rEFSOURCENAME = REFSOURCENAME_EDEFAULT;

    /**
     * The default value of the '{@link #getREFSOURCEINSTNAME() <em>REFSOURCEINSTNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREFSOURCEINSTNAME()
     * @generated
     * @ordered
     */
    protected static final Object REFSOURCEINSTNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getREFSOURCEINSTNAME() <em>REFSOURCEINSTNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREFSOURCEINSTNAME()
     * @generated
     * @ordered
     */
    protected Object rEFSOURCEINSTNAME = REFSOURCEINSTNAME_EDEFAULT;

    /**
     * The default value of the '{@link #getTYPE() <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTYPE()
     * @generated
     * @ordered
     */
    protected static final TYPEType4 TYPE_EDEFAULT = TYPEType4.SOURCE;

    /**
     * The cached value of the '{@link #getTYPE() <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTYPE()
     * @generated
     * @ordered
     */
    protected TYPEType4 tYPE = TYPE_EDEFAULT;

    /**
     * This is true if the TYPE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tYPEESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SAPPROGRAMFLOWOBJECTTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getSAPPROGRAMFLOWOBJECTType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SAPFUNCTIONINSTANCEType getSAPFUNCTIONINSTANCE() {
        return sAPFUNCTIONINSTANCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSAPFUNCTIONINSTANCE(SAPFUNCTIONINSTANCEType newSAPFUNCTIONINSTANCE, NotificationChain msgs) {
        SAPFUNCTIONINSTANCEType oldSAPFUNCTIONINSTANCE = sAPFUNCTIONINSTANCE;
        sAPFUNCTIONINSTANCE = newSAPFUNCTIONINSTANCE;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__SAPFUNCTIONINSTANCE, oldSAPFUNCTIONINSTANCE, newSAPFUNCTIONINSTANCE);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSAPFUNCTIONINSTANCE(SAPFUNCTIONINSTANCEType newSAPFUNCTIONINSTANCE) {
        if (newSAPFUNCTIONINSTANCE != sAPFUNCTIONINSTANCE) {
            NotificationChain msgs = null;
            if (sAPFUNCTIONINSTANCE != null)
                msgs = ((InternalEObject)sAPFUNCTIONINSTANCE).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__SAPFUNCTIONINSTANCE, null, msgs);
            if (newSAPFUNCTIONINSTANCE != null)
                msgs = ((InternalEObject)newSAPFUNCTIONINSTANCE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__SAPFUNCTIONINSTANCE, null, msgs);
            msgs = basicSetSAPFUNCTIONINSTANCE(newSAPFUNCTIONINSTANCE, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__SAPFUNCTIONINSTANCE, newSAPFUNCTIONINSTANCE, newSAPFUNCTIONINSTANCE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SAPCODEBLOCKType getSAPCODEBLOCK() {
        return sAPCODEBLOCK;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSAPCODEBLOCK(SAPCODEBLOCKType newSAPCODEBLOCK, NotificationChain msgs) {
        SAPCODEBLOCKType oldSAPCODEBLOCK = sAPCODEBLOCK;
        sAPCODEBLOCK = newSAPCODEBLOCK;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__SAPCODEBLOCK, oldSAPCODEBLOCK, newSAPCODEBLOCK);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSAPCODEBLOCK(SAPCODEBLOCKType newSAPCODEBLOCK) {
        if (newSAPCODEBLOCK != sAPCODEBLOCK) {
            NotificationChain msgs = null;
            if (sAPCODEBLOCK != null)
                msgs = ((InternalEObject)sAPCODEBLOCK).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__SAPCODEBLOCK, null, msgs);
            if (newSAPCODEBLOCK != null)
                msgs = ((InternalEObject)newSAPCODEBLOCK).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__SAPCODEBLOCK, null, msgs);
            msgs = basicSetSAPCODEBLOCK(newSAPCODEBLOCK, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__SAPCODEBLOCK, newSAPCODEBLOCK, newSAPCODEBLOCK));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getDSQINSTNAME() {
        return dSQINSTNAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDSQINSTNAME(Object newDSQINSTNAME) {
        Object oldDSQINSTNAME = dSQINSTNAME;
        dSQINSTNAME = newDSQINSTNAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__DSQINSTNAME, oldDSQINSTNAME, dSQINSTNAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getJOINBITMAP() {
        return jOINBITMAP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setJOINBITMAP(Object newJOINBITMAP) {
        Object oldJOINBITMAP = jOINBITMAP;
        jOINBITMAP = newJOINBITMAP;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__JOINBITMAP, oldJOINBITMAP, jOINBITMAP));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getORDER() {
        return oRDER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setORDER(Object newORDER) {
        Object oldORDER = oRDER;
        oRDER = newORDER;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__ORDER, oldORDER, oRDER));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getREFDBDNAME() {
        return rEFDBDNAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setREFDBDNAME(Object newREFDBDNAME) {
        Object oldREFDBDNAME = rEFDBDNAME;
        rEFDBDNAME = newREFDBDNAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__REFDBDNAME, oldREFDBDNAME, rEFDBDNAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getREFSOURCENAME() {
        return rEFSOURCENAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setREFSOURCENAME(Object newREFSOURCENAME) {
        Object oldREFSOURCENAME = rEFSOURCENAME;
        rEFSOURCENAME = newREFSOURCENAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__REFSOURCENAME, oldREFSOURCENAME, rEFSOURCENAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getREFSOURCEINSTNAME() {
        return rEFSOURCEINSTNAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setREFSOURCEINSTNAME(Object newREFSOURCEINSTNAME) {
        Object oldREFSOURCEINSTNAME = rEFSOURCEINSTNAME;
        rEFSOURCEINSTNAME = newREFSOURCEINSTNAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__REFSOURCEINSTNAME, oldREFSOURCEINSTNAME, rEFSOURCEINSTNAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TYPEType4 getTYPE() {
        return tYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTYPE(TYPEType4 newTYPE) {
        TYPEType4 oldTYPE = tYPE;
        tYPE = newTYPE == null ? TYPE_EDEFAULT : newTYPE;
        boolean oldTYPEESet = tYPEESet;
        tYPEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__TYPE, oldTYPE, tYPE, !oldTYPEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetTYPE() {
        TYPEType4 oldTYPE = tYPE;
        boolean oldTYPEESet = tYPEESet;
        tYPE = TYPE_EDEFAULT;
        tYPEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__TYPE, oldTYPE, TYPE_EDEFAULT, oldTYPEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetTYPE() {
        return tYPEESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__SAPFUNCTIONINSTANCE:
                return basicSetSAPFUNCTIONINSTANCE(null, msgs);
            case PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__SAPCODEBLOCK:
                return basicSetSAPCODEBLOCK(null, msgs);
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
            case PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__SAPFUNCTIONINSTANCE:
                return getSAPFUNCTIONINSTANCE();
            case PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__SAPCODEBLOCK:
                return getSAPCODEBLOCK();
            case PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__DSQINSTNAME:
                return getDSQINSTNAME();
            case PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__JOINBITMAP:
                return getJOINBITMAP();
            case PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__ORDER:
                return getORDER();
            case PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__REFDBDNAME:
                return getREFDBDNAME();
            case PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__REFSOURCENAME:
                return getREFSOURCENAME();
            case PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__REFSOURCEINSTNAME:
                return getREFSOURCEINSTNAME();
            case PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__TYPE:
                return getTYPE();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__SAPFUNCTIONINSTANCE:
                setSAPFUNCTIONINSTANCE((SAPFUNCTIONINSTANCEType)newValue);
                return;
            case PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__SAPCODEBLOCK:
                setSAPCODEBLOCK((SAPCODEBLOCKType)newValue);
                return;
            case PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__DSQINSTNAME:
                setDSQINSTNAME(newValue);
                return;
            case PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__JOINBITMAP:
                setJOINBITMAP(newValue);
                return;
            case PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__ORDER:
                setORDER(newValue);
                return;
            case PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__REFDBDNAME:
                setREFDBDNAME(newValue);
                return;
            case PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__REFSOURCENAME:
                setREFSOURCENAME(newValue);
                return;
            case PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__REFSOURCEINSTNAME:
                setREFSOURCEINSTNAME(newValue);
                return;
            case PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__TYPE:
                setTYPE((TYPEType4)newValue);
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
            case PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__SAPFUNCTIONINSTANCE:
                setSAPFUNCTIONINSTANCE((SAPFUNCTIONINSTANCEType)null);
                return;
            case PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__SAPCODEBLOCK:
                setSAPCODEBLOCK((SAPCODEBLOCKType)null);
                return;
            case PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__DSQINSTNAME:
                setDSQINSTNAME(DSQINSTNAME_EDEFAULT);
                return;
            case PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__JOINBITMAP:
                setJOINBITMAP(JOINBITMAP_EDEFAULT);
                return;
            case PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__ORDER:
                setORDER(ORDER_EDEFAULT);
                return;
            case PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__REFDBDNAME:
                setREFDBDNAME(REFDBDNAME_EDEFAULT);
                return;
            case PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__REFSOURCENAME:
                setREFSOURCENAME(REFSOURCENAME_EDEFAULT);
                return;
            case PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__REFSOURCEINSTNAME:
                setREFSOURCEINSTNAME(REFSOURCEINSTNAME_EDEFAULT);
                return;
            case PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__TYPE:
                unsetTYPE();
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
            case PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__SAPFUNCTIONINSTANCE:
                return sAPFUNCTIONINSTANCE != null;
            case PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__SAPCODEBLOCK:
                return sAPCODEBLOCK != null;
            case PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__DSQINSTNAME:
                return DSQINSTNAME_EDEFAULT == null ? dSQINSTNAME != null : !DSQINSTNAME_EDEFAULT.equals(dSQINSTNAME);
            case PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__JOINBITMAP:
                return JOINBITMAP_EDEFAULT == null ? jOINBITMAP != null : !JOINBITMAP_EDEFAULT.equals(jOINBITMAP);
            case PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__ORDER:
                return ORDER_EDEFAULT == null ? oRDER != null : !ORDER_EDEFAULT.equals(oRDER);
            case PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__REFDBDNAME:
                return REFDBDNAME_EDEFAULT == null ? rEFDBDNAME != null : !REFDBDNAME_EDEFAULT.equals(rEFDBDNAME);
            case PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__REFSOURCENAME:
                return REFSOURCENAME_EDEFAULT == null ? rEFSOURCENAME != null : !REFSOURCENAME_EDEFAULT.equals(rEFSOURCENAME);
            case PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__REFSOURCEINSTNAME:
                return REFSOURCEINSTNAME_EDEFAULT == null ? rEFSOURCEINSTNAME != null : !REFSOURCEINSTNAME_EDEFAULT.equals(rEFSOURCEINSTNAME);
            case PowrmartPackage.SAPPROGRAMFLOWOBJECT_TYPE__TYPE:
                return isSetTYPE();
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
        result.append(" (dSQINSTNAME: ");
        result.append(dSQINSTNAME);
        result.append(", jOINBITMAP: ");
        result.append(jOINBITMAP);
        result.append(", oRDER: ");
        result.append(oRDER);
        result.append(", rEFDBDNAME: ");
        result.append(rEFDBDNAME);
        result.append(", rEFSOURCENAME: ");
        result.append(rEFSOURCENAME);
        result.append(", rEFSOURCEINSTNAME: ");
        result.append(rEFSOURCEINSTNAME);
        result.append(", tYPE: ");
        if (tYPEESet) result.append(tYPE); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //SAPPROGRAMFLOWOBJECTTypeImpl
