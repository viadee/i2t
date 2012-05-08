/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.CONWFRUNINFOType;
import Powrmart.PowrmartPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CONWFRUNINFO Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.CONWFRUNINFOTypeImpl#getCONWFPARAMFILE <em>CONWFPARAMFILE</em>}</li>
 *   <li>{@link Powrmart.impl.CONWFRUNINFOTypeImpl#getCONWFRUNINSTNAME <em>CONWFRUNINSTNAME</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CONWFRUNINFOTypeImpl extends EObjectImpl implements CONWFRUNINFOType {
    /**
     * The default value of the '{@link #getCONWFPARAMFILE() <em>CONWFPARAMFILE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCONWFPARAMFILE()
     * @generated
     * @ordered
     */
    protected static final Object CONWFPARAMFILE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCONWFPARAMFILE() <em>CONWFPARAMFILE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCONWFPARAMFILE()
     * @generated
     * @ordered
     */
    protected Object cONWFPARAMFILE = CONWFPARAMFILE_EDEFAULT;

    /**
     * The default value of the '{@link #getCONWFRUNINSTNAME() <em>CONWFRUNINSTNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCONWFRUNINSTNAME()
     * @generated
     * @ordered
     */
    protected static final Object CONWFRUNINSTNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCONWFRUNINSTNAME() <em>CONWFRUNINSTNAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCONWFRUNINSTNAME()
     * @generated
     * @ordered
     */
    protected Object cONWFRUNINSTNAME = CONWFRUNINSTNAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CONWFRUNINFOTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getCONWFRUNINFOType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getCONWFPARAMFILE() {
        return cONWFPARAMFILE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCONWFPARAMFILE(Object newCONWFPARAMFILE) {
        Object oldCONWFPARAMFILE = cONWFPARAMFILE;
        cONWFPARAMFILE = newCONWFPARAMFILE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.CONWFRUNINFO_TYPE__CONWFPARAMFILE, oldCONWFPARAMFILE, cONWFPARAMFILE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getCONWFRUNINSTNAME() {
        return cONWFRUNINSTNAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCONWFRUNINSTNAME(Object newCONWFRUNINSTNAME) {
        Object oldCONWFRUNINSTNAME = cONWFRUNINSTNAME;
        cONWFRUNINSTNAME = newCONWFRUNINSTNAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.CONWFRUNINFO_TYPE__CONWFRUNINSTNAME, oldCONWFRUNINSTNAME, cONWFRUNINSTNAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PowrmartPackage.CONWFRUNINFO_TYPE__CONWFPARAMFILE:
                return getCONWFPARAMFILE();
            case PowrmartPackage.CONWFRUNINFO_TYPE__CONWFRUNINSTNAME:
                return getCONWFRUNINSTNAME();
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
            case PowrmartPackage.CONWFRUNINFO_TYPE__CONWFPARAMFILE:
                setCONWFPARAMFILE(newValue);
                return;
            case PowrmartPackage.CONWFRUNINFO_TYPE__CONWFRUNINSTNAME:
                setCONWFRUNINSTNAME(newValue);
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
            case PowrmartPackage.CONWFRUNINFO_TYPE__CONWFPARAMFILE:
                setCONWFPARAMFILE(CONWFPARAMFILE_EDEFAULT);
                return;
            case PowrmartPackage.CONWFRUNINFO_TYPE__CONWFRUNINSTNAME:
                setCONWFRUNINSTNAME(CONWFRUNINSTNAME_EDEFAULT);
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
            case PowrmartPackage.CONWFRUNINFO_TYPE__CONWFPARAMFILE:
                return CONWFPARAMFILE_EDEFAULT == null ? cONWFPARAMFILE != null : !CONWFPARAMFILE_EDEFAULT.equals(cONWFPARAMFILE);
            case PowrmartPackage.CONWFRUNINFO_TYPE__CONWFRUNINSTNAME:
                return CONWFRUNINSTNAME_EDEFAULT == null ? cONWFRUNINSTNAME != null : !CONWFRUNINSTNAME_EDEFAULT.equals(cONWFRUNINSTNAME);
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
        result.append(" (cONWFPARAMFILE: ");
        result.append(cONWFPARAMFILE);
        result.append(", cONWFRUNINSTNAME: ");
        result.append(cONWFRUNINSTNAME);
        result.append(')');
        return result.toString();
    }

} //CONWFRUNINFOTypeImpl
