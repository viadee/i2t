/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.FIELDDEPENDENCYType;
import Powrmart.PowrmartPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FIELDDEPENDENCY Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.FIELDDEPENDENCYTypeImpl#getINPUTFIELD <em>INPUTFIELD</em>}</li>
 *   <li>{@link Powrmart.impl.FIELDDEPENDENCYTypeImpl#getOUTPUTFIELD <em>OUTPUTFIELD</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FIELDDEPENDENCYTypeImpl extends EObjectImpl implements FIELDDEPENDENCYType {
    /**
     * The default value of the '{@link #getINPUTFIELD() <em>INPUTFIELD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getINPUTFIELD()
     * @generated
     * @ordered
     */
    protected static final Object INPUTFIELD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getINPUTFIELD() <em>INPUTFIELD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getINPUTFIELD()
     * @generated
     * @ordered
     */
    protected Object iNPUTFIELD = INPUTFIELD_EDEFAULT;

    /**
     * The default value of the '{@link #getOUTPUTFIELD() <em>OUTPUTFIELD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOUTPUTFIELD()
     * @generated
     * @ordered
     */
    protected static final Object OUTPUTFIELD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOUTPUTFIELD() <em>OUTPUTFIELD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOUTPUTFIELD()
     * @generated
     * @ordered
     */
    protected Object oUTPUTFIELD = OUTPUTFIELD_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FIELDDEPENDENCYTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getFIELDDEPENDENCYType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getINPUTFIELD() {
        return iNPUTFIELD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setINPUTFIELD(Object newINPUTFIELD) {
        Object oldINPUTFIELD = iNPUTFIELD;
        iNPUTFIELD = newINPUTFIELD;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.FIELDDEPENDENCY_TYPE__INPUTFIELD, oldINPUTFIELD, iNPUTFIELD));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getOUTPUTFIELD() {
        return oUTPUTFIELD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOUTPUTFIELD(Object newOUTPUTFIELD) {
        Object oldOUTPUTFIELD = oUTPUTFIELD;
        oUTPUTFIELD = newOUTPUTFIELD;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.FIELDDEPENDENCY_TYPE__OUTPUTFIELD, oldOUTPUTFIELD, oUTPUTFIELD));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PowrmartPackage.FIELDDEPENDENCY_TYPE__INPUTFIELD:
                return getINPUTFIELD();
            case PowrmartPackage.FIELDDEPENDENCY_TYPE__OUTPUTFIELD:
                return getOUTPUTFIELD();
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
            case PowrmartPackage.FIELDDEPENDENCY_TYPE__INPUTFIELD:
                setINPUTFIELD(newValue);
                return;
            case PowrmartPackage.FIELDDEPENDENCY_TYPE__OUTPUTFIELD:
                setOUTPUTFIELD(newValue);
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
            case PowrmartPackage.FIELDDEPENDENCY_TYPE__INPUTFIELD:
                setINPUTFIELD(INPUTFIELD_EDEFAULT);
                return;
            case PowrmartPackage.FIELDDEPENDENCY_TYPE__OUTPUTFIELD:
                setOUTPUTFIELD(OUTPUTFIELD_EDEFAULT);
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
            case PowrmartPackage.FIELDDEPENDENCY_TYPE__INPUTFIELD:
                return INPUTFIELD_EDEFAULT == null ? iNPUTFIELD != null : !INPUTFIELD_EDEFAULT.equals(iNPUTFIELD);
            case PowrmartPackage.FIELDDEPENDENCY_TYPE__OUTPUTFIELD:
                return OUTPUTFIELD_EDEFAULT == null ? oUTPUTFIELD != null : !OUTPUTFIELD_EDEFAULT.equals(oUTPUTFIELD);
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
        result.append(" (iNPUTFIELD: ");
        result.append(iNPUTFIELD);
        result.append(", oUTPUTFIELD: ");
        result.append(oUTPUTFIELD);
        result.append(')');
        return result.toString();
    }

} //FIELDDEPENDENCYTypeImpl
