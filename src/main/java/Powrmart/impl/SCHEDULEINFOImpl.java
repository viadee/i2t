/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.PowrmartPackage;
import Powrmart.SCHEDULEINFO;
import Powrmart.SCHEDULEINFOType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SCHEDULEINFO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.SCHEDULEINFOImpl#getSCHEDULEINFO <em>SCHEDULEINFO</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SCHEDULEINFOImpl extends EObjectImpl implements SCHEDULEINFO {
    /**
     * The cached value of the '{@link #getSCHEDULEINFO() <em>SCHEDULEINFO</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSCHEDULEINFO()
     * @generated
     * @ordered
     */
    protected SCHEDULEINFOType sCHEDULEINFO;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SCHEDULEINFOImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getSCHEDULEINFO();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SCHEDULEINFOType getSCHEDULEINFO() {
        return sCHEDULEINFO;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSCHEDULEINFO(SCHEDULEINFOType newSCHEDULEINFO, NotificationChain msgs) {
        SCHEDULEINFOType oldSCHEDULEINFO = sCHEDULEINFO;
        sCHEDULEINFO = newSCHEDULEINFO;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PowrmartPackage.SCHEDULEINFO__SCHEDULEINFO, oldSCHEDULEINFO, newSCHEDULEINFO);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSCHEDULEINFO(SCHEDULEINFOType newSCHEDULEINFO) {
        if (newSCHEDULEINFO != sCHEDULEINFO) {
            NotificationChain msgs = null;
            if (sCHEDULEINFO != null)
                msgs = ((InternalEObject)sCHEDULEINFO).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PowrmartPackage.SCHEDULEINFO__SCHEDULEINFO, null, msgs);
            if (newSCHEDULEINFO != null)
                msgs = ((InternalEObject)newSCHEDULEINFO).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PowrmartPackage.SCHEDULEINFO__SCHEDULEINFO, null, msgs);
            msgs = basicSetSCHEDULEINFO(newSCHEDULEINFO, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.SCHEDULEINFO__SCHEDULEINFO, newSCHEDULEINFO, newSCHEDULEINFO));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PowrmartPackage.SCHEDULEINFO__SCHEDULEINFO:
                return basicSetSCHEDULEINFO(null, msgs);
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
            case PowrmartPackage.SCHEDULEINFO__SCHEDULEINFO:
                return getSCHEDULEINFO();
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
            case PowrmartPackage.SCHEDULEINFO__SCHEDULEINFO:
                setSCHEDULEINFO((SCHEDULEINFOType)newValue);
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
            case PowrmartPackage.SCHEDULEINFO__SCHEDULEINFO:
                setSCHEDULEINFO((SCHEDULEINFOType)null);
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
            case PowrmartPackage.SCHEDULEINFO__SCHEDULEINFO:
                return sCHEDULEINFO != null;
        }
        return super.eIsSet(featureID);
    }

} //SCHEDULEINFOImpl
