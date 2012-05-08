/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.PowrmartPackage;
import Powrmart.STARTOPTIONSType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>STARTOPTIONS Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.STARTOPTIONSTypeImpl#getSTARTDATE <em>STARTDATE</em>}</li>
 *   <li>{@link Powrmart.impl.STARTOPTIONSTypeImpl#getSTARTTIME <em>STARTTIME</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class STARTOPTIONSTypeImpl extends EObjectImpl implements STARTOPTIONSType {
    /**
     * The default value of the '{@link #getSTARTDATE() <em>STARTDATE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSTARTDATE()
     * @generated
     * @ordered
     */
    protected static final Object STARTDATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSTARTDATE() <em>STARTDATE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSTARTDATE()
     * @generated
     * @ordered
     */
    protected Object sTARTDATE = STARTDATE_EDEFAULT;

    /**
     * The default value of the '{@link #getSTARTTIME() <em>STARTTIME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSTARTTIME()
     * @generated
     * @ordered
     */
    protected static final Object STARTTIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSTARTTIME() <em>STARTTIME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSTARTTIME()
     * @generated
     * @ordered
     */
    protected Object sTARTTIME = STARTTIME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected STARTOPTIONSTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getSTARTOPTIONSType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getSTARTDATE() {
        return sTARTDATE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSTARTDATE(Object newSTARTDATE) {
        Object oldSTARTDATE = sTARTDATE;
        sTARTDATE = newSTARTDATE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.STARTOPTIONS_TYPE__STARTDATE, oldSTARTDATE, sTARTDATE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getSTARTTIME() {
        return sTARTTIME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSTARTTIME(Object newSTARTTIME) {
        Object oldSTARTTIME = sTARTTIME;
        sTARTTIME = newSTARTTIME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.STARTOPTIONS_TYPE__STARTTIME, oldSTARTTIME, sTARTTIME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PowrmartPackage.STARTOPTIONS_TYPE__STARTDATE:
                return getSTARTDATE();
            case PowrmartPackage.STARTOPTIONS_TYPE__STARTTIME:
                return getSTARTTIME();
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
            case PowrmartPackage.STARTOPTIONS_TYPE__STARTDATE:
                setSTARTDATE(newValue);
                return;
            case PowrmartPackage.STARTOPTIONS_TYPE__STARTTIME:
                setSTARTTIME(newValue);
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
            case PowrmartPackage.STARTOPTIONS_TYPE__STARTDATE:
                setSTARTDATE(STARTDATE_EDEFAULT);
                return;
            case PowrmartPackage.STARTOPTIONS_TYPE__STARTTIME:
                setSTARTTIME(STARTTIME_EDEFAULT);
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
            case PowrmartPackage.STARTOPTIONS_TYPE__STARTDATE:
                return STARTDATE_EDEFAULT == null ? sTARTDATE != null : !STARTDATE_EDEFAULT.equals(sTARTDATE);
            case PowrmartPackage.STARTOPTIONS_TYPE__STARTTIME:
                return STARTTIME_EDEFAULT == null ? sTARTTIME != null : !STARTTIME_EDEFAULT.equals(sTARTTIME);
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
        result.append(" (sTARTDATE: ");
        result.append(sTARTDATE);
        result.append(", sTARTTIME: ");
        result.append(sTARTTIME);
        result.append(')');
        return result.toString();
    }

} //STARTOPTIONSTypeImpl
