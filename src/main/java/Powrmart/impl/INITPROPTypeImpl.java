/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.INITPROPType;
import Powrmart.PowrmartPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>INITPROP Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Powrmart.impl.INITPROPTypeImpl#getDESCRIPTION <em>DESCRIPTION</em>}</li>
 *   <li>{@link Powrmart.impl.INITPROPTypeImpl#getNAME <em>NAME</em>}</li>
 *   <li>{@link Powrmart.impl.INITPROPTypeImpl#getUSERDEFINED <em>USERDEFINED</em>}</li>
 *   <li>{@link Powrmart.impl.INITPROPTypeImpl#getVALUE <em>VALUE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class INITPROPTypeImpl extends EObjectImpl implements INITPROPType {
    /**
     * The default value of the '{@link #getDESCRIPTION() <em>DESCRIPTION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDESCRIPTION()
     * @generated
     * @ordered
     */
    protected static final Object DESCRIPTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDESCRIPTION() <em>DESCRIPTION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDESCRIPTION()
     * @generated
     * @ordered
     */
    protected Object dESCRIPTION = DESCRIPTION_EDEFAULT;

    /**
     * The default value of the '{@link #getNAME() <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNAME()
     * @generated
     * @ordered
     */
    protected static final Object NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNAME() <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNAME()
     * @generated
     * @ordered
     */
    protected Object nAME = NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getUSERDEFINED() <em>USERDEFINED</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUSERDEFINED()
     * @generated
     * @ordered
     */
    protected static final Object USERDEFINED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUSERDEFINED() <em>USERDEFINED</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUSERDEFINED()
     * @generated
     * @ordered
     */
    protected Object uSERDEFINED = USERDEFINED_EDEFAULT;

    /**
     * The default value of the '{@link #getVALUE() <em>VALUE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVALUE()
     * @generated
     * @ordered
     */
    protected static final Object VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVALUE() <em>VALUE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVALUE()
     * @generated
     * @ordered
     */
    protected Object vALUE = VALUE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected INITPROPTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PowrmartPackage.eINSTANCE.getINITPROPType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getDESCRIPTION() {
        return dESCRIPTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDESCRIPTION(Object newDESCRIPTION) {
        Object oldDESCRIPTION = dESCRIPTION;
        dESCRIPTION = newDESCRIPTION;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.INITPROP_TYPE__DESCRIPTION, oldDESCRIPTION, dESCRIPTION));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getNAME() {
        return nAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNAME(Object newNAME) {
        Object oldNAME = nAME;
        nAME = newNAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.INITPROP_TYPE__NAME, oldNAME, nAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getUSERDEFINED() {
        return uSERDEFINED;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUSERDEFINED(Object newUSERDEFINED) {
        Object oldUSERDEFINED = uSERDEFINED;
        uSERDEFINED = newUSERDEFINED;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.INITPROP_TYPE__USERDEFINED, oldUSERDEFINED, uSERDEFINED));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getVALUE() {
        return vALUE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVALUE(Object newVALUE) {
        Object oldVALUE = vALUE;
        vALUE = newVALUE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PowrmartPackage.INITPROP_TYPE__VALUE, oldVALUE, vALUE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PowrmartPackage.INITPROP_TYPE__DESCRIPTION:
                return getDESCRIPTION();
            case PowrmartPackage.INITPROP_TYPE__NAME:
                return getNAME();
            case PowrmartPackage.INITPROP_TYPE__USERDEFINED:
                return getUSERDEFINED();
            case PowrmartPackage.INITPROP_TYPE__VALUE:
                return getVALUE();
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
            case PowrmartPackage.INITPROP_TYPE__DESCRIPTION:
                setDESCRIPTION(newValue);
                return;
            case PowrmartPackage.INITPROP_TYPE__NAME:
                setNAME(newValue);
                return;
            case PowrmartPackage.INITPROP_TYPE__USERDEFINED:
                setUSERDEFINED(newValue);
                return;
            case PowrmartPackage.INITPROP_TYPE__VALUE:
                setVALUE(newValue);
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
            case PowrmartPackage.INITPROP_TYPE__DESCRIPTION:
                setDESCRIPTION(DESCRIPTION_EDEFAULT);
                return;
            case PowrmartPackage.INITPROP_TYPE__NAME:
                setNAME(NAME_EDEFAULT);
                return;
            case PowrmartPackage.INITPROP_TYPE__USERDEFINED:
                setUSERDEFINED(USERDEFINED_EDEFAULT);
                return;
            case PowrmartPackage.INITPROP_TYPE__VALUE:
                setVALUE(VALUE_EDEFAULT);
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
            case PowrmartPackage.INITPROP_TYPE__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? dESCRIPTION != null : !DESCRIPTION_EDEFAULT.equals(dESCRIPTION);
            case PowrmartPackage.INITPROP_TYPE__NAME:
                return NAME_EDEFAULT == null ? nAME != null : !NAME_EDEFAULT.equals(nAME);
            case PowrmartPackage.INITPROP_TYPE__USERDEFINED:
                return USERDEFINED_EDEFAULT == null ? uSERDEFINED != null : !USERDEFINED_EDEFAULT.equals(uSERDEFINED);
            case PowrmartPackage.INITPROP_TYPE__VALUE:
                return VALUE_EDEFAULT == null ? vALUE != null : !VALUE_EDEFAULT.equals(vALUE);
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
        result.append(" (dESCRIPTION: ");
        result.append(dESCRIPTION);
        result.append(", nAME: ");
        result.append(nAME);
        result.append(", uSERDEFINED: ");
        result.append(uSERDEFINED);
        result.append(", vALUE: ");
        result.append(vALUE);
        result.append(')');
        return result.toString();
    }

} //INITPROPTypeImpl
