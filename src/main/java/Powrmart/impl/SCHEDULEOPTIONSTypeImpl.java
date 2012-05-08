/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.CUSTOMType;
import Powrmart.PowrmartPackage;
import Powrmart.RECURRINGType;
import Powrmart.SCHEDULEOPTIONSType;
import Powrmart.SCHEDULETYPEType1;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SCHEDULEOPTIONS Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.SCHEDULEOPTIONSTypeImpl#getRECURRING <em>RECURRING</em>}</li>
 *   <li>{@link Powrmart.impl.SCHEDULEOPTIONSTypeImpl#getCUSTOM <em>CUSTOM</em>}</li>
 *   <li>{@link Powrmart.impl.SCHEDULEOPTIONSTypeImpl#getSCHEDULETYPE <em>SCHEDULETYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SCHEDULEOPTIONSTypeImpl extends EObjectImpl implements SCHEDULEOPTIONSType {
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
     * The cached value of the '{@link #getCUSTOM() <em>CUSTOM</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCUSTOM()
     * @generated
     * @ordered
     */
    protected CUSTOMType cUSTOM;

    /**
     * The default value of the '{@link #getSCHEDULETYPE() <em>SCHEDULETYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSCHEDULETYPE()
     * @generated
     * @ordered
     */
    protected static final SCHEDULETYPEType1 SCHEDULETYPE_EDEFAULT = SCHEDULETYPEType1.ONCE;

    /**
     * The cached value of the '{@link #getSCHEDULETYPE() <em>SCHEDULETYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSCHEDULETYPE()
     * @generated
     * @ordered
     */
    protected SCHEDULETYPEType1 sCHEDULETYPE = SCHEDULETYPE_EDEFAULT;

    /**
     * This is true if the SCHEDULETYPE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sCHEDULETYPEESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SCHEDULEOPTIONSTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getSCHEDULEOPTIONSType();
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PowrmartPackage.SCHEDULEOPTIONS_TYPE__RECURRING, oldRECURRING, newRECURRING);
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
                msgs = ((InternalEObject)rECURRING).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PowrmartPackage.SCHEDULEOPTIONS_TYPE__RECURRING, null, msgs);
            if (newRECURRING != null)
                msgs = ((InternalEObject)newRECURRING).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PowrmartPackage.SCHEDULEOPTIONS_TYPE__RECURRING, null, msgs);
            msgs = basicSetRECURRING(newRECURRING, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SCHEDULEOPTIONS_TYPE__RECURRING, newRECURRING, newRECURRING));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CUSTOMType getCUSTOM() {
        return cUSTOM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCUSTOM(CUSTOMType newCUSTOM, NotificationChain msgs) {
        CUSTOMType oldCUSTOM = cUSTOM;
        cUSTOM = newCUSTOM;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PowrmartPackage.SCHEDULEOPTIONS_TYPE__CUSTOM, oldCUSTOM, newCUSTOM);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCUSTOM(CUSTOMType newCUSTOM) {
        if (newCUSTOM != cUSTOM) {
            NotificationChain msgs = null;
            if (cUSTOM != null)
                msgs = ((InternalEObject)cUSTOM).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PowrmartPackage.SCHEDULEOPTIONS_TYPE__CUSTOM, null, msgs);
            if (newCUSTOM != null)
                msgs = ((InternalEObject)newCUSTOM).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PowrmartPackage.SCHEDULEOPTIONS_TYPE__CUSTOM, null, msgs);
            msgs = basicSetCUSTOM(newCUSTOM, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SCHEDULEOPTIONS_TYPE__CUSTOM, newCUSTOM, newCUSTOM));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SCHEDULETYPEType1 getSCHEDULETYPE() {
        return sCHEDULETYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSCHEDULETYPE(SCHEDULETYPEType1 newSCHEDULETYPE) {
        SCHEDULETYPEType1 oldSCHEDULETYPE = sCHEDULETYPE;
        sCHEDULETYPE = newSCHEDULETYPE == null ? SCHEDULETYPE_EDEFAULT : newSCHEDULETYPE;
        boolean oldSCHEDULETYPEESet = sCHEDULETYPEESet;
        sCHEDULETYPEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SCHEDULEOPTIONS_TYPE__SCHEDULETYPE, oldSCHEDULETYPE, sCHEDULETYPE, !oldSCHEDULETYPEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSCHEDULETYPE() {
        SCHEDULETYPEType1 oldSCHEDULETYPE = sCHEDULETYPE;
        boolean oldSCHEDULETYPEESet = sCHEDULETYPEESet;
        sCHEDULETYPE = SCHEDULETYPE_EDEFAULT;
        sCHEDULETYPEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, PowrmartPackage.SCHEDULEOPTIONS_TYPE__SCHEDULETYPE, oldSCHEDULETYPE, SCHEDULETYPE_EDEFAULT, oldSCHEDULETYPEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSCHEDULETYPE() {
        return sCHEDULETYPEESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PowrmartPackage.SCHEDULEOPTIONS_TYPE__RECURRING:
                return basicSetRECURRING(null, msgs);
            case PowrmartPackage.SCHEDULEOPTIONS_TYPE__CUSTOM:
                return basicSetCUSTOM(null, msgs);
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
            case PowrmartPackage.SCHEDULEOPTIONS_TYPE__RECURRING:
                return getRECURRING();
            case PowrmartPackage.SCHEDULEOPTIONS_TYPE__CUSTOM:
                return getCUSTOM();
            case PowrmartPackage.SCHEDULEOPTIONS_TYPE__SCHEDULETYPE:
                return getSCHEDULETYPE();
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
            case PowrmartPackage.SCHEDULEOPTIONS_TYPE__RECURRING:
                setRECURRING((RECURRINGType)newValue);
                return;
            case PowrmartPackage.SCHEDULEOPTIONS_TYPE__CUSTOM:
                setCUSTOM((CUSTOMType)newValue);
                return;
            case PowrmartPackage.SCHEDULEOPTIONS_TYPE__SCHEDULETYPE:
                setSCHEDULETYPE((SCHEDULETYPEType1)newValue);
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
            case PowrmartPackage.SCHEDULEOPTIONS_TYPE__RECURRING:
                setRECURRING((RECURRINGType)null);
                return;
            case PowrmartPackage.SCHEDULEOPTIONS_TYPE__CUSTOM:
                setCUSTOM((CUSTOMType)null);
                return;
            case PowrmartPackage.SCHEDULEOPTIONS_TYPE__SCHEDULETYPE:
                unsetSCHEDULETYPE();
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
            case PowrmartPackage.SCHEDULEOPTIONS_TYPE__RECURRING:
                return rECURRING != null;
            case PowrmartPackage.SCHEDULEOPTIONS_TYPE__CUSTOM:
                return cUSTOM != null;
            case PowrmartPackage.SCHEDULEOPTIONS_TYPE__SCHEDULETYPE:
                return isSetSCHEDULETYPE();
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
        result.append(" (sCHEDULETYPE: ");
        if (sCHEDULETYPEESet) result.append(sCHEDULETYPE); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //SCHEDULEOPTIONSTypeImpl
