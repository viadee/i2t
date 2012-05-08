/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.ATTRIBUTEType;
import Powrmart.ISNONEType;
import Powrmart.PowrmartPackage;
import Powrmart.REUSABLEType5;
import Powrmart.SESSIONCOMPONENTType;
import Powrmart.TASKType;
import Powrmart.VALUEPAIRType;

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
 * An implementation of the model object '<em><b>SESSIONCOMPONENT Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.SESSIONCOMPONENTTypeImpl#getTASK <em>TASK</em>}</li>
 *   <li>{@link Powrmart.impl.SESSIONCOMPONENTTypeImpl#getVALUEPAIR <em>VALUEPAIR</em>}</li>
 *   <li>{@link Powrmart.impl.SESSIONCOMPONENTTypeImpl#getATTRIBUTE <em>ATTRIBUTE</em>}</li>
 *   <li>{@link Powrmart.impl.SESSIONCOMPONENTTypeImpl#getISNONE <em>ISNONE</em>}</li>
 *   <li>{@link Powrmart.impl.SESSIONCOMPONENTTypeImpl#getREFOBJECTNAME <em>REFOBJECTNAME</em>}</li>
 *   <li>{@link Powrmart.impl.SESSIONCOMPONENTTypeImpl#getREUSABLE <em>REUSABLE</em>}</li>
 *   <li>{@link Powrmart.impl.SESSIONCOMPONENTTypeImpl#getTYPE <em>TYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SESSIONCOMPONENTTypeImpl extends EObjectImpl implements SESSIONCOMPONENTType {
    /**
     * The cached value of the '{@link #getTASK() <em>TASK</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTASK()
     * @generated
     * @ordered
     */
    protected TASKType tASK;

    /**
     * The cached value of the '{@link #getVALUEPAIR() <em>VALUEPAIR</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVALUEPAIR()
     * @generated
     * @ordered
     */
    protected EList<VALUEPAIRType> vALUEPAIR;

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
     * The default value of the '{@link #getISNONE() <em>ISNONE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISNONE()
     * @generated
     * @ordered
     */
    protected static final ISNONEType ISNONE_EDEFAULT = ISNONEType.YES;

    /**
     * The cached value of the '{@link #getISNONE() <em>ISNONE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getISNONE()
     * @generated
     * @ordered
     */
    protected ISNONEType iSNONE = ISNONE_EDEFAULT;

    /**
     * This is true if the ISNONE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean iSNONEESet;

    /**
     * The default value of the '{@link #getREFOBJECTNAME() <em>REFOBJECTNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREFOBJECTNAME()
     * @generated
     * @ordered
     */
    protected static final Object REFOBJECTNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getREFOBJECTNAME() <em>REFOBJECTNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREFOBJECTNAME()
     * @generated
     * @ordered
     */
    protected Object rEFOBJECTNAME = REFOBJECTNAME_EDEFAULT;

    /**
     * The default value of the '{@link #getREUSABLE() <em>REUSABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREUSABLE()
     * @generated
     * @ordered
     */
    protected static final REUSABLEType5 REUSABLE_EDEFAULT = REUSABLEType5.YES;

    /**
     * The cached value of the '{@link #getREUSABLE() <em>REUSABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREUSABLE()
     * @generated
     * @ordered
     */
    protected REUSABLEType5 rEUSABLE = REUSABLE_EDEFAULT;

    /**
     * This is true if the REUSABLE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rEUSABLEESet;

    /**
     * The default value of the '{@link #getTYPE() <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTYPE()
     * @generated
     * @ordered
     */
    protected static final Object TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTYPE() <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTYPE()
     * @generated
     * @ordered
     */
    protected Object tYPE = TYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SESSIONCOMPONENTTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getSESSIONCOMPONENTType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TASKType getTASK() {
        return tASK;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTASK(TASKType newTASK, NotificationChain msgs) {
        TASKType oldTASK = tASK;
        tASK = newTASK;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PowrmartPackage.SESSIONCOMPONENT_TYPE__TASK, oldTASK, newTASK);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTASK(TASKType newTASK) {
        if (newTASK != tASK) {
            NotificationChain msgs = null;
            if (tASK != null)
                msgs = ((InternalEObject)tASK).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PowrmartPackage.SESSIONCOMPONENT_TYPE__TASK, null, msgs);
            if (newTASK != null)
                msgs = ((InternalEObject)newTASK).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PowrmartPackage.SESSIONCOMPONENT_TYPE__TASK, null, msgs);
            msgs = basicSetTASK(newTASK, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SESSIONCOMPONENT_TYPE__TASK, newTASK, newTASK));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<VALUEPAIRType> getVALUEPAIR() {
        if (vALUEPAIR == null) {
            vALUEPAIR = new EObjectContainmentEList<VALUEPAIRType>(VALUEPAIRType.class, this, PowrmartPackage.SESSIONCOMPONENT_TYPE__VALUEPAIR);
        }
        return vALUEPAIR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ATTRIBUTEType> getATTRIBUTE() {
        if (aTTRIBUTE == null) {
            aTTRIBUTE = new EObjectContainmentEList<ATTRIBUTEType>(ATTRIBUTEType.class, this, PowrmartPackage.SESSIONCOMPONENT_TYPE__ATTRIBUTE);
        }
        return aTTRIBUTE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISNONEType getISNONE() {
        return iSNONE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setISNONE(ISNONEType newISNONE) {
        ISNONEType oldISNONE = iSNONE;
        iSNONE = newISNONE == null ? ISNONE_EDEFAULT : newISNONE;
        boolean oldISNONEESet = iSNONEESet;
        iSNONEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SESSIONCOMPONENT_TYPE__ISNONE, oldISNONE, iSNONE, !oldISNONEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetISNONE() {
        ISNONEType oldISNONE = iSNONE;
        boolean oldISNONEESet = iSNONEESet;
        iSNONE = ISNONE_EDEFAULT;
        iSNONEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.SESSIONCOMPONENT_TYPE__ISNONE, oldISNONE, ISNONE_EDEFAULT, oldISNONEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetISNONE() {
        return iSNONEESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getREFOBJECTNAME() {
        return rEFOBJECTNAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setREFOBJECTNAME(Object newREFOBJECTNAME) {
        Object oldREFOBJECTNAME = rEFOBJECTNAME;
        rEFOBJECTNAME = newREFOBJECTNAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SESSIONCOMPONENT_TYPE__REFOBJECTNAME, oldREFOBJECTNAME, rEFOBJECTNAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public REUSABLEType5 getREUSABLE() {
        return rEUSABLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setREUSABLE(REUSABLEType5 newREUSABLE) {
        REUSABLEType5 oldREUSABLE = rEUSABLE;
        rEUSABLE = newREUSABLE == null ? REUSABLE_EDEFAULT : newREUSABLE;
        boolean oldREUSABLEESet = rEUSABLEESet;
        rEUSABLEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SESSIONCOMPONENT_TYPE__REUSABLE, oldREUSABLE, rEUSABLE, !oldREUSABLEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetREUSABLE() {
        REUSABLEType5 oldREUSABLE = rEUSABLE;
        boolean oldREUSABLEESet = rEUSABLEESet;
        rEUSABLE = REUSABLE_EDEFAULT;
        rEUSABLEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.SESSIONCOMPONENT_TYPE__REUSABLE, oldREUSABLE, REUSABLE_EDEFAULT, oldREUSABLEESet));
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
    public Object getTYPE() {
        return tYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTYPE(Object newTYPE) {
        Object oldTYPE = tYPE;
        tYPE = newTYPE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SESSIONCOMPONENT_TYPE__TYPE, oldTYPE, tYPE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PowrmartPackage.SESSIONCOMPONENT_TYPE__TASK:
                return basicSetTASK(null, msgs);
            case PowrmartPackage.SESSIONCOMPONENT_TYPE__VALUEPAIR:
                return ((InternalEList<?>)getVALUEPAIR()).basicRemove(otherEnd, msgs);
            case PowrmartPackage.SESSIONCOMPONENT_TYPE__ATTRIBUTE:
                return ((InternalEList<?>)getATTRIBUTE()).basicRemove(otherEnd, msgs);
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
            case PowrmartPackage.SESSIONCOMPONENT_TYPE__TASK:
                return getTASK();
            case PowrmartPackage.SESSIONCOMPONENT_TYPE__VALUEPAIR:
                return getVALUEPAIR();
            case PowrmartPackage.SESSIONCOMPONENT_TYPE__ATTRIBUTE:
                return getATTRIBUTE();
            case PowrmartPackage.SESSIONCOMPONENT_TYPE__ISNONE:
                return getISNONE();
            case PowrmartPackage.SESSIONCOMPONENT_TYPE__REFOBJECTNAME:
                return getREFOBJECTNAME();
            case PowrmartPackage.SESSIONCOMPONENT_TYPE__REUSABLE:
                return getREUSABLE();
            case PowrmartPackage.SESSIONCOMPONENT_TYPE__TYPE:
                return getTYPE();
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
            case PowrmartPackage.SESSIONCOMPONENT_TYPE__TASK:
                setTASK((TASKType)newValue);
                return;
            case PowrmartPackage.SESSIONCOMPONENT_TYPE__VALUEPAIR:
                getVALUEPAIR().clear();
                getVALUEPAIR().addAll((Collection<? extends VALUEPAIRType>)newValue);
                return;
            case PowrmartPackage.SESSIONCOMPONENT_TYPE__ATTRIBUTE:
                getATTRIBUTE().clear();
                getATTRIBUTE().addAll((Collection<? extends ATTRIBUTEType>)newValue);
                return;
            case PowrmartPackage.SESSIONCOMPONENT_TYPE__ISNONE:
                setISNONE((ISNONEType)newValue);
                return;
            case PowrmartPackage.SESSIONCOMPONENT_TYPE__REFOBJECTNAME:
                setREFOBJECTNAME(newValue);
                return;
            case PowrmartPackage.SESSIONCOMPONENT_TYPE__REUSABLE:
                setREUSABLE((REUSABLEType5)newValue);
                return;
            case PowrmartPackage.SESSIONCOMPONENT_TYPE__TYPE:
                setTYPE(newValue);
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
            case PowrmartPackage.SESSIONCOMPONENT_TYPE__TASK:
                setTASK((TASKType)null);
                return;
            case PowrmartPackage.SESSIONCOMPONENT_TYPE__VALUEPAIR:
                getVALUEPAIR().clear();
                return;
            case PowrmartPackage.SESSIONCOMPONENT_TYPE__ATTRIBUTE:
                getATTRIBUTE().clear();
                return;
            case PowrmartPackage.SESSIONCOMPONENT_TYPE__ISNONE:
                unsetISNONE();
                return;
            case PowrmartPackage.SESSIONCOMPONENT_TYPE__REFOBJECTNAME:
                setREFOBJECTNAME(REFOBJECTNAME_EDEFAULT);
                return;
            case PowrmartPackage.SESSIONCOMPONENT_TYPE__REUSABLE:
                unsetREUSABLE();
                return;
            case PowrmartPackage.SESSIONCOMPONENT_TYPE__TYPE:
                setTYPE(TYPE_EDEFAULT);
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
            case PowrmartPackage.SESSIONCOMPONENT_TYPE__TASK:
                return tASK != null;
            case PowrmartPackage.SESSIONCOMPONENT_TYPE__VALUEPAIR:
                return vALUEPAIR != null && !vALUEPAIR.isEmpty();
            case PowrmartPackage.SESSIONCOMPONENT_TYPE__ATTRIBUTE:
                return aTTRIBUTE != null && !aTTRIBUTE.isEmpty();
            case PowrmartPackage.SESSIONCOMPONENT_TYPE__ISNONE:
                return isSetISNONE();
            case PowrmartPackage.SESSIONCOMPONENT_TYPE__REFOBJECTNAME:
                return REFOBJECTNAME_EDEFAULT == null ? rEFOBJECTNAME != null : !REFOBJECTNAME_EDEFAULT.equals(rEFOBJECTNAME);
            case PowrmartPackage.SESSIONCOMPONENT_TYPE__REUSABLE:
                return isSetREUSABLE();
            case PowrmartPackage.SESSIONCOMPONENT_TYPE__TYPE:
                return TYPE_EDEFAULT == null ? tYPE != null : !TYPE_EDEFAULT.equals(tYPE);
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
        result.append(" (iSNONE: ");
        if (iSNONEESet) result.append(iSNONE); else result.append("<unset>");
        result.append(", rEFOBJECTNAME: ");
        result.append(rEFOBJECTNAME);
        result.append(", rEUSABLE: ");
        if (rEUSABLEESet) result.append(rEUSABLE); else result.append("<unset>");
        result.append(", tYPE: ");
        result.append(tYPE);
        result.append(')');
        return result.toString();
    }

} //SESSIONCOMPONENTTypeImpl
