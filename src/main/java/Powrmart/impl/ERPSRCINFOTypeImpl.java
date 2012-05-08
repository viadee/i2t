/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.ERPSRCINFOType;
import Powrmart.PowrmartPackage;
import Powrmart.SEBLSRCINFOType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ERPSRCINFO Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.ERPSRCINFOTypeImpl#getSEBLSRCINFO <em>SEBLSRCINFO</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ERPSRCINFOTypeImpl extends EObjectImpl implements ERPSRCINFOType {
    /**
     * The cached value of the '{@link #getSEBLSRCINFO() <em>SEBLSRCINFO</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSEBLSRCINFO()
     * @generated
     * @ordered
     */
    protected SEBLSRCINFOType sEBLSRCINFO;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ERPSRCINFOTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getERPSRCINFOType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SEBLSRCINFOType getSEBLSRCINFO() {
        return sEBLSRCINFO;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSEBLSRCINFO(SEBLSRCINFOType newSEBLSRCINFO, NotificationChain msgs) {
        SEBLSRCINFOType oldSEBLSRCINFO = sEBLSRCINFO;
        sEBLSRCINFO = newSEBLSRCINFO;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PowrmartPackage.ERPSRCINFO_TYPE__SEBLSRCINFO, oldSEBLSRCINFO, newSEBLSRCINFO);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSEBLSRCINFO(SEBLSRCINFOType newSEBLSRCINFO) {
        if (newSEBLSRCINFO != sEBLSRCINFO) {
            NotificationChain msgs = null;
            if (sEBLSRCINFO != null)
                msgs = ((InternalEObject)sEBLSRCINFO).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PowrmartPackage.ERPSRCINFO_TYPE__SEBLSRCINFO, null, msgs);
            if (newSEBLSRCINFO != null)
                msgs = ((InternalEObject)newSEBLSRCINFO).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PowrmartPackage.ERPSRCINFO_TYPE__SEBLSRCINFO, null, msgs);
            msgs = basicSetSEBLSRCINFO(newSEBLSRCINFO, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.ERPSRCINFO_TYPE__SEBLSRCINFO, newSEBLSRCINFO, newSEBLSRCINFO));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PowrmartPackage.ERPSRCINFO_TYPE__SEBLSRCINFO:
                return basicSetSEBLSRCINFO(null, msgs);
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
            case PowrmartPackage.ERPSRCINFO_TYPE__SEBLSRCINFO:
                return getSEBLSRCINFO();
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
            case PowrmartPackage.ERPSRCINFO_TYPE__SEBLSRCINFO:
                setSEBLSRCINFO((SEBLSRCINFOType)newValue);
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
            case PowrmartPackage.ERPSRCINFO_TYPE__SEBLSRCINFO:
                setSEBLSRCINFO((SEBLSRCINFOType)null);
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
            case PowrmartPackage.ERPSRCINFO_TYPE__SEBLSRCINFO:
                return sEBLSRCINFO != null;
        }
        return super.eIsSet(featureID);
    }

} //ERPSRCINFOTypeImpl
