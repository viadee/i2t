/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.PowrmartPackage;
import Powrmart.RECURRINGType;
import Powrmart.STARTOPTIONSType;
import Powrmart.TIMERTYPEType;
import Powrmart.TIMERType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TIMER Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.TIMERTypeImpl#getSTARTOPTIONS <em>STARTOPTIONS</em>}</li>
 *   <li>{@link Powrmart.impl.TIMERTypeImpl#getRECURRING <em>RECURRING</em>}</li>
 *   <li>{@link Powrmart.impl.TIMERTypeImpl#getTIMERTYPE <em>TIMERTYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TIMERTypeImpl extends EObjectImpl implements TIMERType {
    /**
     * The cached value of the '{@link #getSTARTOPTIONS() <em>STARTOPTIONS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSTARTOPTIONS()
     * @generated
     * @ordered
     */
    protected STARTOPTIONSType sTARTOPTIONS;

    /**
     * The cached value of the '{@link #getRECURRING() <em>RECURRING</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRECURRING()
     * @generated
     * @ordered
     */
    protected RECURRINGType rECURRING;

    /**
     * The default value of the '{@link #getTIMERTYPE() <em>TIMERTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTIMERTYPE()
     * @generated
     * @ordered
     */
    protected static final TIMERTYPEType TIMERTYPE_EDEFAULT = TIMERTYPEType.STARTATABSOLUTETIME;

    /**
     * The cached value of the '{@link #getTIMERTYPE() <em>TIMERTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTIMERTYPE()
     * @generated
     * @ordered
     */
    protected TIMERTYPEType tIMERTYPE = TIMERTYPE_EDEFAULT;

    /**
     * This is true if the TIMERTYPE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tIMERTYPEESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TIMERTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getTIMERType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public STARTOPTIONSType getSTARTOPTIONS() {
        return sTARTOPTIONS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSTARTOPTIONS(STARTOPTIONSType newSTARTOPTIONS, NotificationChain msgs) {
        STARTOPTIONSType oldSTARTOPTIONS = sTARTOPTIONS;
        sTARTOPTIONS = newSTARTOPTIONS;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PowrmartPackage.TIMER_TYPE__STARTOPTIONS, oldSTARTOPTIONS, newSTARTOPTIONS);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSTARTOPTIONS(STARTOPTIONSType newSTARTOPTIONS) {
        if (newSTARTOPTIONS != sTARTOPTIONS) {
            NotificationChain msgs = null;
            if (sTARTOPTIONS != null)
                msgs = ((InternalEObject)sTARTOPTIONS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PowrmartPackage.TIMER_TYPE__STARTOPTIONS, null, msgs);
            if (newSTARTOPTIONS != null)
                msgs = ((InternalEObject)newSTARTOPTIONS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PowrmartPackage.TIMER_TYPE__STARTOPTIONS, null, msgs);
            msgs = basicSetSTARTOPTIONS(newSTARTOPTIONS, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TIMER_TYPE__STARTOPTIONS, newSTARTOPTIONS, newSTARTOPTIONS));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RECURRINGType getRECURRING() {
        return rECURRING;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRECURRING(RECURRINGType newRECURRING, NotificationChain msgs) {
        RECURRINGType oldRECURRING = rECURRING;
        rECURRING = newRECURRING;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PowrmartPackage.TIMER_TYPE__RECURRING, oldRECURRING, newRECURRING);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRECURRING(RECURRINGType newRECURRING) {
        if (newRECURRING != rECURRING) {
            NotificationChain msgs = null;
            if (rECURRING != null)
                msgs = ((InternalEObject)rECURRING).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PowrmartPackage.TIMER_TYPE__RECURRING, null, msgs);
            if (newRECURRING != null)
                msgs = ((InternalEObject)newRECURRING).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PowrmartPackage.TIMER_TYPE__RECURRING, null, msgs);
            msgs = basicSetRECURRING(newRECURRING, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TIMER_TYPE__RECURRING, newRECURRING, newRECURRING));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TIMERTYPEType getTIMERTYPE() {
        return tIMERTYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTIMERTYPE(TIMERTYPEType newTIMERTYPE) {
        TIMERTYPEType oldTIMERTYPE = tIMERTYPE;
        tIMERTYPE = newTIMERTYPE == null ? TIMERTYPE_EDEFAULT : newTIMERTYPE;
        boolean oldTIMERTYPEESet = tIMERTYPEESet;
        tIMERTYPEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.TIMER_TYPE__TIMERTYPE, oldTIMERTYPE, tIMERTYPE, !oldTIMERTYPEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetTIMERTYPE() {
        TIMERTYPEType oldTIMERTYPE = tIMERTYPE;
        boolean oldTIMERTYPEESet = tIMERTYPEESet;
        tIMERTYPE = TIMERTYPE_EDEFAULT;
        tIMERTYPEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.TIMER_TYPE__TIMERTYPE, oldTIMERTYPE, TIMERTYPE_EDEFAULT, oldTIMERTYPEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetTIMERTYPE() {
        return tIMERTYPEESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PowrmartPackage.TIMER_TYPE__STARTOPTIONS:
                return basicSetSTARTOPTIONS(null, msgs);
            case PowrmartPackage.TIMER_TYPE__RECURRING:
                return basicSetRECURRING(null, msgs);
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
            case PowrmartPackage.TIMER_TYPE__STARTOPTIONS:
                return getSTARTOPTIONS();
            case PowrmartPackage.TIMER_TYPE__RECURRING:
                return getRECURRING();
            case PowrmartPackage.TIMER_TYPE__TIMERTYPE:
                return getTIMERTYPE();
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
            case PowrmartPackage.TIMER_TYPE__STARTOPTIONS:
                setSTARTOPTIONS((STARTOPTIONSType)newValue);
                return;
            case PowrmartPackage.TIMER_TYPE__RECURRING:
                setRECURRING((RECURRINGType)newValue);
                return;
            case PowrmartPackage.TIMER_TYPE__TIMERTYPE:
                setTIMERTYPE((TIMERTYPEType)newValue);
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
            case PowrmartPackage.TIMER_TYPE__STARTOPTIONS:
                setSTARTOPTIONS((STARTOPTIONSType)null);
                return;
            case PowrmartPackage.TIMER_TYPE__RECURRING:
                setRECURRING((RECURRINGType)null);
                return;
            case PowrmartPackage.TIMER_TYPE__TIMERTYPE:
                unsetTIMERTYPE();
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
            case PowrmartPackage.TIMER_TYPE__STARTOPTIONS:
                return sTARTOPTIONS != null;
            case PowrmartPackage.TIMER_TYPE__RECURRING:
                return rECURRING != null;
            case PowrmartPackage.TIMER_TYPE__TIMERTYPE:
                return isSetTIMERTYPE();
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
        result.append(" (tIMERTYPE: ");
        if (tIMERTYPEESet) result.append(tIMERTYPE); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //TIMERTypeImpl
