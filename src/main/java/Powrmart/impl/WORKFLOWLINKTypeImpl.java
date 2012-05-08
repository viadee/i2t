/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.EXPRMACRODEPENDENCYType;
import Powrmart.PowrmartPackage;
import Powrmart.WORKFLOWLINKType;

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
 * An implementation of the model object '<em><b>WORKFLOWLINK Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.WORKFLOWLINKTypeImpl#getEXPRMACRODEPENDENCY <em>EXPRMACRODEPENDENCY</em>}</li>
 *   <li>{@link Powrmart.impl.WORKFLOWLINKTypeImpl#getCONDITION <em>CONDITION</em>}</li>
 *   <li>{@link Powrmart.impl.WORKFLOWLINKTypeImpl#getFROMTASK <em>FROMTASK</em>}</li>
 *   <li>{@link Powrmart.impl.WORKFLOWLINKTypeImpl#getTOTASK <em>TOTASK</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WORKFLOWLINKTypeImpl extends EObjectImpl implements WORKFLOWLINKType {
    /**
     * The cached value of the '{@link #getEXPRMACRODEPENDENCY() <em>EXPRMACRODEPENDENCY</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEXPRMACRODEPENDENCY()
     * @generated
     * @ordered
     */
    protected EList<EXPRMACRODEPENDENCYType> eXPRMACRODEPENDENCY;

    /**
     * The default value of the '{@link #getCONDITION() <em>CONDITION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCONDITION()
     * @generated
     * @ordered
     */
    protected static final Object CONDITION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCONDITION() <em>CONDITION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCONDITION()
     * @generated
     * @ordered
     */
    protected Object cONDITION = CONDITION_EDEFAULT;

    /**
     * The default value of the '{@link #getFROMTASK() <em>FROMTASK</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFROMTASK()
     * @generated
     * @ordered
     */
    protected static final Object FROMTASK_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFROMTASK() <em>FROMTASK</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFROMTASK()
     * @generated
     * @ordered
     */
    protected Object fROMTASK = FROMTASK_EDEFAULT;

    /**
     * The default value of the '{@link #getTOTASK() <em>TOTASK</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTOTASK()
     * @generated
     * @ordered
     */
    protected static final Object TOTASK_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTOTASK() <em>TOTASK</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTOTASK()
     * @generated
     * @ordered
     */
    protected Object tOTASK = TOTASK_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WORKFLOWLINKTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getWORKFLOWLINKType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EXPRMACRODEPENDENCYType> getEXPRMACRODEPENDENCY() {
        if (eXPRMACRODEPENDENCY == null) {
            eXPRMACRODEPENDENCY = new EObjectContainmentEList<EXPRMACRODEPENDENCYType>(EXPRMACRODEPENDENCYType.class, this, PowrmartPackage.WORKFLOWLINK_TYPE__EXPRMACRODEPENDENCY);
        }
        return eXPRMACRODEPENDENCY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getCONDITION() {
        return cONDITION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCONDITION(Object newCONDITION) {
        Object oldCONDITION = cONDITION;
        cONDITION = newCONDITION;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.WORKFLOWLINK_TYPE__CONDITION, oldCONDITION, cONDITION));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getFROMTASK() {
        return fROMTASK;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFROMTASK(Object newFROMTASK) {
        Object oldFROMTASK = fROMTASK;
        fROMTASK = newFROMTASK;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.WORKFLOWLINK_TYPE__FROMTASK, oldFROMTASK, fROMTASK));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getTOTASK() {
        return tOTASK;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTOTASK(Object newTOTASK) {
        Object oldTOTASK = tOTASK;
        tOTASK = newTOTASK;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.WORKFLOWLINK_TYPE__TOTASK, oldTOTASK, tOTASK));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PowrmartPackage.WORKFLOWLINK_TYPE__EXPRMACRODEPENDENCY:
                return ((InternalEList<?>)getEXPRMACRODEPENDENCY()).basicRemove(otherEnd, msgs);
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
            case PowrmartPackage.WORKFLOWLINK_TYPE__EXPRMACRODEPENDENCY:
                return getEXPRMACRODEPENDENCY();
            case PowrmartPackage.WORKFLOWLINK_TYPE__CONDITION:
                return getCONDITION();
            case PowrmartPackage.WORKFLOWLINK_TYPE__FROMTASK:
                return getFROMTASK();
            case PowrmartPackage.WORKFLOWLINK_TYPE__TOTASK:
                return getTOTASK();
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
            case PowrmartPackage.WORKFLOWLINK_TYPE__EXPRMACRODEPENDENCY:
                getEXPRMACRODEPENDENCY().clear();
                getEXPRMACRODEPENDENCY().addAll((Collection<? extends EXPRMACRODEPENDENCYType>)newValue);
                return;
            case PowrmartPackage.WORKFLOWLINK_TYPE__CONDITION:
                setCONDITION(newValue);
                return;
            case PowrmartPackage.WORKFLOWLINK_TYPE__FROMTASK:
                setFROMTASK(newValue);
                return;
            case PowrmartPackage.WORKFLOWLINK_TYPE__TOTASK:
                setTOTASK(newValue);
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
            case PowrmartPackage.WORKFLOWLINK_TYPE__EXPRMACRODEPENDENCY:
                getEXPRMACRODEPENDENCY().clear();
                return;
            case PowrmartPackage.WORKFLOWLINK_TYPE__CONDITION:
                setCONDITION(CONDITION_EDEFAULT);
                return;
            case PowrmartPackage.WORKFLOWLINK_TYPE__FROMTASK:
                setFROMTASK(FROMTASK_EDEFAULT);
                return;
            case PowrmartPackage.WORKFLOWLINK_TYPE__TOTASK:
                setTOTASK(TOTASK_EDEFAULT);
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
            case PowrmartPackage.WORKFLOWLINK_TYPE__EXPRMACRODEPENDENCY:
                return eXPRMACRODEPENDENCY != null && !eXPRMACRODEPENDENCY.isEmpty();
            case PowrmartPackage.WORKFLOWLINK_TYPE__CONDITION:
                return CONDITION_EDEFAULT == null ? cONDITION != null : !CONDITION_EDEFAULT.equals(cONDITION);
            case PowrmartPackage.WORKFLOWLINK_TYPE__FROMTASK:
                return FROMTASK_EDEFAULT == null ? fROMTASK != null : !FROMTASK_EDEFAULT.equals(fROMTASK);
            case PowrmartPackage.WORKFLOWLINK_TYPE__TOTASK:
                return TOTASK_EDEFAULT == null ? tOTASK != null : !TOTASK_EDEFAULT.equals(tOTASK);
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
        result.append(" (cONDITION: ");
        result.append(cONDITION);
        result.append(", fROMTASK: ");
        result.append(fROMTASK);
        result.append(", tOTASK: ");
        result.append(tOTASK);
        result.append(')');
        return result.toString();
    }

} //WORKFLOWLINKTypeImpl
